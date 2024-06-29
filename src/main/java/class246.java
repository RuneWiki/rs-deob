import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class246 extends class122 {

    @OriginalMember(owner = "client!am", name = "Q", descriptor = "Lnk;")
    public class12 field4075;

    @OriginalMember(owner = "client!am", name = "N", descriptor = "I")
    public static int field4072 = 0;

    @OriginalMember(owner = "client!am", name = "O", descriptor = "I")
    public static int field4073 = 0;

    @OriginalMember(owner = "client!am", name = "U", descriptor = "[Lqd;")
    public static class40[] field4079 = new class40[500];

    @OriginalMember(owner = "client!am", name = "P", descriptor = "Lqd;")
    public static class40 field4074 = class147.method1106(" weitere Optionen", (byte) -77);

    @OriginalMember(owner = "client!am", name = "W", descriptor = "I")
    public static int field4081 = 3353893;

    @OriginalMember(owner = "client!am", name = "V", descriptor = "I")
    public static int field4080 = 0;

    @OriginalMember(owner = "client!am", name = "X", descriptor = "Lqd;")
    public static class40 field4082 = class147.method1106("Lade Wordpack )2 ", (byte) -114);

    @OriginalMember(owner = "client!am", name = "R", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!am", name = "T", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!am", name = "S", descriptor = "[Lmm;")
    public static class249[] field4077;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z[ZZ[[FII[[FI[[FIZIBI[[IIZI[ILwe;I[[I)V", line = 18)
    public static final void method1739(boolean arg0, boolean[] arg1, boolean arg2, float[][] arg3, int arg4, int arg5, float[][] arg6, int arg7, float[][] arg8, int arg9, boolean arg10, int arg11, byte arg12, int arg13, int[][] arg14, int arg15, boolean arg16, int arg17, int[] arg18, class47 arg19, int arg20, int[][] arg21) {
        field4078++;
        int var22 = (arg4 << 8) + (arg0 ? 255 : 0);
        if (arg9 != 1292988840) {
            return;
        }
        int var23 = (arg13 << 8) + (arg2 ? 255 : 0);
        int var24 = (arg15 << 8) + (arg16 ? 255 : 0);
        int var25 = (arg11 << 8) + (arg10 ? 255 : 0);
        int[] var26 = new int[arg18.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg18[var27 + var27];
            int var29 = arg18[var27 + var27 + 1];
            int[][] var30 = arg21 == null || arg1 == null || !arg1[var27] ? arg14 : arg21;
            var26[var27] = class9.method53(var22, arg12, false, arg20, arg21, false, arg19, var23, var29, arg3, var25, var30, var28, arg17, var24, arg8, arg6, (float) arg5);
        }
        arg19.method423(arg7, arg20, arg17, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)Loe;", line = 57)
    public static final class121 method1740(int arg0, byte arg1) {
        class121 var2 = (class121) class228.field3768.method1345((long) arg0, 28150);
        field4076++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class23.field420.method1651(class148.method1115((byte) 123, arg0), class7.method40(arg0, -111), -1);
        class121 var4 = new class121();
        var4.field2048 = arg0;
        if (arg1 != -32) {
            method1741(97);
        }
        if (var3 != null) {
            var4.method916(109, new class26(var3));
        }
        var4.method908((byte) -127);
        class228.field3768.method1350(var4, (long) arg0, arg1 + 13);
        return var4;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lnk;)V", line = 95)
    public class246(class12 arg0) {
        this.field4075 = arg0;
    }

    @OriginalMember(owner = "client!am", name = "f", descriptor = "(I)V", line = 105)
    public static void method1741(int arg0) {
        field4082 = null;
        field4077 = null;
        field4079 = null;
        if (arg0 < 112) {
            field4079 = (class40[]) null;
        }
        field4074 = null;
    }
}
