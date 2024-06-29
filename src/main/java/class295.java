import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class295 {

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "[I")
    public static int[] field4999 = new int[5];

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "Z")
    public static volatile boolean field4997 = true;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field5003 = 2;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "Lr;")
    public static class264 field5004 = null;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "Lok;")
    public static class146 field5008 = class235.method1724(-12908, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "Z")
    public static boolean field4998 = false;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field5000 = 0;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Lok;")
    public static class146 field5001 = class235.method1724(-12908, "Weiter");

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 6)
    public static void method2099(byte arg0) {
        int var1 = -67 / ((arg0 + 45) / 33);
        field4999 = null;
        field5008 = null;
        field5004 = null;
        field5001 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLoh;Loh;)V", line = 20)
    public static final void method2100(byte arg0, class15 arg1, class15 arg2) {
        class121.field1995 = arg1;
        class226.field3778 = arg2;
        field5009++;
        if (arg0 != 31) {
            method2099((byte) -11);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)[B", line = 32)
    public static final synchronized byte[] method2101(byte arg0, int arg1) {
        field5002++;
        int var2 = 112 % ((arg0 + 84) / 40);
        if (arg1 == 100 && class84.field1331 > 0) {
            byte[] var3 = class293.field4980[--class84.field1331];
            class293.field4980[class84.field1331] = null;
            return var3;
        } else if (arg1 == 5000 && class11.field228 > 0) {
            byte[] var4 = class303.field5202[--class11.field228];
            class303.field5202[class11.field228] = null;
            return var4;
        } else if (arg1 == 30000 && class63.field1090 > 0) {
            byte[] var5 = class94.field1516[--class63.field1090];
            class94.field1516[class63.field1090] = null;
            return var5;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIII)V", line = 69)
    public static final void method2102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5007++;
        int var6 = arg5 - arg3;
        int var7 = arg0 - arg2;
        int var8 = 28 % ((14 - arg4) / 33);
        if (var7 == 0) {
            if (var6 != 0) {
                class25.method170(arg2, arg1, arg5, -1, arg3);
            }
        } else if (var6 == 0) {
            class173.method1337(arg1, arg2, -27551, arg0, arg3);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var9 = var7 < var6;
            if (var9) {
                int var10 = arg0;
                int var11 = arg2;
                arg0 = arg5;
                arg5 = var10;
                arg2 = arg3;
                arg3 = var11;
            }
            if (arg2 > arg0) {
                int var12 = arg2;
                arg2 = arg0;
                arg0 = var12;
                int var13 = arg3;
                arg3 = arg5;
                arg5 = var13;
            }
            int var14 = arg0 - arg2;
            int var15 = arg3;
            int var16 = -(var14 >> 1);
            int var17 = arg3 < arg5 ? 1 : -1;
            int var18 = arg5 - arg3;
            if (var18 < 0) {
                var18 = -var18;
            }
            if (var9) {
                for (int var20 = arg2; var20 <= arg0; var20++) {
                    class81.field1297[var20][var15] = arg1;
                    var16 += var18;
                    if (var16 > 0) {
                        var15 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var19 = arg2; var19 <= arg0; var19++) {
                    class81.field1297[var15][var19] = arg1;
                    var16 += var18;
                    if (var16 > 0) {
                        var16 -= var14;
                        var15 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIIZII)V", line = 204)
    public static final void method2103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field5005++;
        int var9 = arg5 - arg7;
        if (arg6) {
            int var10 = arg4 - arg0;
            int var11 = (arg1 - arg3 << 16) / var9;
            int var12 = (arg8 - arg2 << 16) / var10;
            class195.method1503(0, (byte) 76, var12, arg2, var11, arg5, 0, arg7, arg4, arg0, arg3);
        }
    }
}
