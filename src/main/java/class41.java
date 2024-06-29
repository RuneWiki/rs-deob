import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class41 extends class153 {

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "Lak;")
    public static class135 field926 = new class135(64);

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "Lpj;")
    private static class237 field928 = class33.method353(" ", 85);

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "I")
    public static int field927 = 0;

    @OriginalMember(owner = "client!ji", name = "ab", descriptor = "Lpj;")
    public static class237 field934 = class33.method353("1", 88);

    @OriginalMember(owner = "client!ji", name = "X", descriptor = "Lpj;")
    public static class237 field931 = field928;

    @OriginalMember(owner = "client!ji", name = "Y", descriptor = "Lpj;")
    private static class237 field932 = class33.method353("Walk here", 50);

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "Lpj;")
    public static class237 field929 = field932;

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "I")
    public static int field930 = 0;

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!ji", name = "bb", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "Lpj;")
    public class237 field919;

    @OriginalMember(owner = "client!ji", name = "Z", descriptor = "Lfa;")
    public static class239 field933;

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "[I")
    public int[] field922;

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "[I")
    public int[] field924;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "[Lpj;")
    public class237[] field916;

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "[Lge;")
    public class69[] field923;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
    public static void method409(byte arg0) {
        field931 = null;
        field934 = null;
        if (arg0 <= 103) {
            return;
        }
        field926 = null;
        field929 = null;
        field932 = null;
        field933 = null;
        field928 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILfa;)V")
    public static final void method410(int arg0, class239 arg1) {
        if (arg0 != 64) {
            field927 = 62;
        }
        field921++;
        class184.field3223 = arg1.method1643(class177.field3118, (byte) 127);
        class208.field3541 = arg1.method1643(class77.field1450, (byte) 14);
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V")
    public static final void method411(int arg0) {
        if (arg0 == 0) {
            class36.field820 = null;
            field925++;
            class259.field4447 = null;
            class138.field2389 = null;
        }
    }
}
