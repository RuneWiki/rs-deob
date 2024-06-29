import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class314 {

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "Lma;")
    public static class5 field4913 = new class5();

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "[La;")
    public static class281[] field4918 = new class281[14];

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "[[[B")
    public static byte[][][] field4919;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IB[JI[I)V", line = 4)
    public static final void method2188(int arg0, byte arg1, long[] arg2, int arg3, int[] arg4) {
        field4917++;
        if (arg0 > arg3) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var7;
            int var9 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var9;
            for (int var10 = arg3; var10 < arg0; var10++) {
                if (arg2[var10] < (long) (var10 & 0x1) + var7) {
                    long var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    int var13 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var13;
                }
            }
            arg2[arg0] = arg2[var6];
            arg2[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var9;
            method2188(var6 - 1, (byte) -46, arg2, arg3, arg4);
            method2188(arg0, (byte) -46, arg2, var6 + 1, arg4);
        }
        if (arg1 != -46) {
            field4919 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBIIII)V", line = 64)
    public static final void method2189(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field4915++;
        int var6 = arg2 - arg0;
        int var7 = arg3 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class283.method2009(arg5, (byte) 125, arg0, arg2, arg4);
            }
        } else if (var6 == 0) {
            class159.method1168(arg3, arg4, arg5, (byte) -36, arg0);
        } else {
            int var8 = (var6 << 12) / var7;
            if (arg1 > 6) {
                int var9 = arg0 - (arg5 * var8 >> 12);
                int var10;
                int var11;
                if (class291.field4490 > arg5) {
                    var10 = (class291.field4490 * var8 >> 12) + var9;
                    var11 = class291.field4490;
                } else if (class210.field3309 >= arg5) {
                    var10 = arg0;
                    var11 = arg5;
                } else {
                    var11 = class210.field3309;
                    var10 = (class210.field3309 * var8 >> 12) + var9;
                }
                int var12;
                int var13;
                if (class291.field4490 > arg3) {
                    var12 = class291.field4490;
                    var13 = var9 + (class291.field4490 * var8 >> 12);
                } else if (class210.field3309 >= arg3) {
                    var12 = arg3;
                    var13 = arg2;
                } else {
                    var12 = class210.field3309;
                    var13 = (class210.field3309 * var8 >> 12) + var9;
                }
                if (class42.field579 > var10) {
                    var11 = (class42.field579 - var9 << 12) / var8;
                    var10 = class42.field579;
                } else if (class334.field5205 < var10) {
                    var11 = (class334.field5205 - var9 << 12) / var8;
                    var10 = class334.field5205;
                }
                if (var13 < class42.field579) {
                    var12 = (class42.field579 - var9 << 12) / var8;
                    var13 = class42.field579;
                } else if (class334.field5205 < var13) {
                    var12 = (class334.field5205 - var9 << 12) / var8;
                    var13 = class334.field5205;
                }
                class175.method1294(var11, var10, var12, 0, var13, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 167)
    public static void method2190(int arg0) {
        if (arg0 < 73) {
            field4918 = (class281[]) null;
        }
        field4913 = null;
        field4918 = null;
        field4919 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)I", line = 191)
    public static final int method2191(int arg0, int arg1, int arg2) {
        field4914++;
        if (arg1 != 13813) {
            field4919 = (byte[][][]) ((byte[][][]) null);
        }
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }
}
