import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class84 extends class148 {

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "[B")
    public byte[] field2029;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "Lja;")
    private static class62 field2018 = class30.method243(43, "Login limit exceeded)3");

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    public static int field2015 = 3353893;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    public static int field2016 = 99;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "Lja;")
    public static class62 field2023 = class30.method243(43, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "Lja;")
    private static class62 field2024 = class30.method243(43, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "Lja;")
    public static class62 field2022 = field2018;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    public static int field2026 = 0;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "Lja;")
    public static class62 field2030 = class30.method243(43, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public static int field2031 = 0;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field2032 = 0;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "Lja;")
    public static class62 field2025 = field2024;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "Lpd;")
    public static class108 field2013;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)Lj;")
    public static final class65 method653(int arg0, int arg1) {
        field2017++;
        class65 var2 = (class65) class26.field616.method129((long) arg1, 24838);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class82.field1979.method867(arg0, 15, arg1);
        class65 var4 = new class65();
        var4.field1617 = arg1;
        if (var3 != null) {
            var4.method499(false, new class128(var3));
        }
        var4.method500((byte) -128);
        if (var4.field1607) {
            var4.field1592 = false;
            var4.field1603 = 0;
        }
        class26.field616.method128((byte) -116, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
    public static void method654(int arg0) {
        field2024 = null;
        field2013 = null;
        field2022 = null;
        field2025 = null;
        field2018 = null;
        field2030 = null;
        field2023 = null;
        if (arg0 != 0) {
            method653(-128, -111);
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(II)Z")
    public static final boolean method655(int arg0, int arg1) {
        if (arg0 != 0) {
            method655(123, 36);
        }
        field2028++;
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([B)V")
    public class84(byte[] arg0) {
        this.field2029 = arg0;
    }
}
