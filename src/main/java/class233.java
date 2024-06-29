import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class233 extends class79 {

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "Lck;")
    public static class119 field3764 = class298.method1987((byte) 67, "Wordpack geladen)3");

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field3757 = 0;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "Lck;")
    private static class119 field3763 = class298.method1987((byte) 114, "Checking for updates )2 ");

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "Lck;")
    public static class119 field3756 = field3763;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    public static int field3765 = 0;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "B")
    public byte field3766;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public int field3758;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "Lck;")
    public class119 field3759;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "Lck;")
    public class119 field3761;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "Luc;")
    public static class253 field3760;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V", line = 11)
    public static void method1499(int arg0) {
        field3764 = null;
        field3756 = null;
        field3760 = null;
        field3763 = null;
        if (arg0 <= 78) {
            field3763 = (class119) null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)V", line = 24)
    public static final void method1500(int arg0, int arg1) {
        field3767++;
        class11.field195 = -1;
        class162.field2561 = arg1;
        class11.field195 = arg0;
        class212.method1337((byte) 97);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIBILeb;)V", line = 35)
    public static final void method1501(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class297 arg6) {
        class120.method801(arg6.field4949, arg1, arg6.field4991, arg5, arg3, arg2, arg0, -69);
        field3762++;
        if (arg4 != 127) {
            method1503((byte) 19);
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)Lra;", line = 84)
    public static final class43 method1502(boolean arg0) {
        field3755++;
        byte[] var1 = class247.field3989[0];
        int var2 = class64.field1006[0] * class232.field3741[0];
        class43 var6;
        if (class98.field1501[0]) {
            byte[] var3 = class95.field1465[0];
            int[] var4 = new int[var2];
            for (int var5 = 0; var5 < var2; var5++) {
                var4[var5] = class156.method998(class161.field2553[class19.method151(var1[var5], 255)], class19.method151(var3[var5], 255) << 24);
            }
            var6 = new class18(class227.field3641, class207.field3304, class155.field2475[0], class7.field152[0], class232.field3741[0], class64.field1006[0], var4);
        } else {
            int[] var7 = new int[var2];
            for (int var8 = 0; var8 < var2; var8++) {
                var7[var8] = class161.field2553[class19.method151(var1[var8], 255)];
            }
            var6 = new class43(class227.field3641, class207.field3304, class155.field2475[0], class7.field152[0], class232.field3741[0], class64.field1006[0], var7);
        }
        class162.method1035(-20432);
        if (!arg0) {
            field3756 = (class119) null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V", line = 130)
    public static final void method1503(byte arg0) {
        field3768++;
        class238.field3814 = new class156();
        if (arg0 != 119) {
            method1502(false);
        }
    }
}
