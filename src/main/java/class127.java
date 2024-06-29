import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class127 extends class137 {

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public int field2029 = -1;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public int field2034 = 0;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "Z")
    public static boolean field2032 = true;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "Lnb;")
    public static class223 field2023 = new class223();

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public int field2024;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public int field2025;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public int field2027;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public int field2028;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    public int field2031;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "I")
    public int field2033;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public int field2035;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public int field2036;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "I")
    public int field2037;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    public int field2039;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "Lgi;")
    public static class164 field2026;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "Lgi;")
    public static class164 field2040;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lgi;I)V")
    public static final void method868(class164 arg0, int arg1) {
        if (arg1 != -1) {
            method872(-113);
        }
        field2020++;
        class241.field3770 = arg0;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILfj;)Luh;")
    public static final class107 method869(int arg0, class274 arg1) {
        field2030++;
        arg1.method1849(255);
        int var2 = arg1.method1849(arg0 ^ 0xFF);
        class107 var3 = class76.method548(-70, var2);
        var3.field1659 = arg1.method1849(arg0 + 255);
        int var4 = arg1.method1849(255);
        for (int var5 = arg0; var5 < var4; var5++) {
            int var6 = arg1.method1849(255);
            var3.method195(var6, arg1, (byte) 28);
        }
        var3.method300((byte) 35);
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
    public static void method870(byte arg0) {
        if (arg0 <= -96) {
            field2026 = null;
            field2023 = null;
            field2040 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
    public static final void method871(int arg0) {
        class79.field1269.method377((byte) -1);
        field2022++;
        class71.field1143.method392(arg0);
        class95.field1503.method392(arg0);
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
    public static final void method872(int arg0) {
        field2038++;
        if (arg0 == -1) {
            class192.field3135.method1873(-7401);
        }
    }
}
