import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public abstract class class608 {

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "Lfc;")
    public static class235 field8455 = new class235(106, 6);

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "I")
    public static int field8459 = 1403;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "I")
    public static int field8454;

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "I")
    public static int field8457;

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(BI)[B")
    public abstract byte[] method3358(byte arg0, int arg1);

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(II[BIII[BII)V")
    public static final void method3359(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        field8457++;
        int var9 = -(arg0 >> 2);
        int var10 = -(arg7 & arg0);
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg2[var10001] = (byte) (arg2[var10001] - arg6[arg3++]);
                int var14 = arg1++;
                arg2[var14] = (byte) (arg2[var14] - arg6[arg3++]);
                int var15 = arg1++;
                arg2[var15] = (byte) (arg2[var15] - arg6[arg3++]);
                int var16 = arg1++;
                arg2[var16] = (byte) (arg2[var16] - arg6[arg3++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg2[var10001] = (byte) (arg2[var10001] - arg6[arg3++]);
            }
            arg3 += arg4;
            arg1 += arg8;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)Lofa;")
    public abstract class298 method3360(int arg0);

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIBIII)Lka;")
    public static final class434 method3361(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field8458++;
        long var7 = (long) arg2 * 32147369L ^ (long) arg1 * 986053L ^ (long) arg0 * 97549L ^ (long) arg6 * 67481L ^ (long) arg5 * 475427L ^ (long) arg4 * 76724863L;
        if (arg3 != 114) {
            return null;
        }
        class434 var9 = (class434) class658.field9264.method1986((byte) -98, var7);
        if (var9 == null) {
            class434 var10 = class292.field4399.method454(arg6, arg0, arg5, arg1, arg2, arg4);
            class658.field9264.method1985(var10, var7, (byte) -102);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Z)V")
    public static void method3362(boolean arg0) {
        if (arg0) {
            field8455 = null;
        }
        field8455 = null;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IILmaa;B)Luu;")
    public static final class258 method3363(int arg0, int arg1, class433 arg2, byte arg3) {
        field8454++;
        int var4 = -84 / ((-arg3 - 65) / 53);
        int var5 = arg2.field6136 | arg1 << 8;
        class258 var6 = (class258) class335.field4901.method1267((byte) -127, (long) var5 << 16);
        if (var6 != null) {
            return var6;
        }
        byte[] var7 = class156.field2357.method938(class156.field2357.method919(var5, (byte) -88), (byte) -53);
        if (var7 == null) {
            int var9 = arg2.field6136 | arg0 + 65536 << 8;
            class258 var10 = (class258) class335.field4901.method1267((byte) -127, (long) var9 << 16);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class156.field2357.method938(class156.field2357.method919(var9, (byte) -83), (byte) -53);
            if (var11 == null) {
                int var13 = arg2.field6136 | 0xFFFF00;
                class258 var14 = (class258) class335.field4901.method1267((byte) 40, (long) var13 << 16);
                if (var14 != null) {
                    return var14;
                }
                byte[] var15 = class156.field2357.method938(class156.field2357.method919(var13, (byte) -39), (byte) -53);
                if (var15 == null) {
                    return null;
                } else if (var15.length <= 1) {
                    return null;
                } else {
                    class258 var16 = class656.method3641(-4450, var15);
                    var16.field3687 = arg2;
                    class335.field4901.method1265(false, (long) var13 << 16, var16);
                    return var16;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class258 var12 = class656.method3641(-4450, var11);
                var12.field3687 = arg2;
                class335.field4901.method1265(false, (long) var9 << 16, var12);
                return var12;
            }
        } else if (var7.length <= 1) {
            return null;
        } else {
            class258 var8 = class656.method3641(-4450, var7);
            var8.field3687 = arg2;
            class335.field4901.method1265(false, (long) var5 << 16, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(BI)I")
    public abstract int method3364(byte arg0, int arg1);

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IB)V")
    public abstract void method3365(int arg0, byte arg1);

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "(BI)Z")
    public static final boolean method3366(byte arg0, int arg1) {
        field8456++;
        int var2 = -104 / ((8 - arg0) / 59);
        return arg1 == 3 || arg1 == 7 || arg1 == 10;
    }
}
