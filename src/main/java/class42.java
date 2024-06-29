import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class42 {

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "[I")
    public static int[] field861 = new int[14];

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Lvr;")
    public static class92 field853 = new class92(4, 1, 1, 1);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "J")
    public long field863;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Lha;")
    public class42 field857;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Lha;")
    public class42 field859;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "[Z")
    public static boolean[] field866;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)I")
    public static final int method415(boolean arg0) {
        field864++;
        if ((double) class382.field5460 == 3.0D) {
            return 37;
        }
        if (arg0) {
            method419(true, false, null);
        }
        if ((double) class382.field5460 == 4.0D) {
            return 50;
        } else if ((double) class382.field5460 == 6.0D) {
            return 75;
        } else if ((double) class382.field5460 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)Z")
    public final boolean method416(byte arg0) {
        field860++;
        if (this.field859 == null) {
            return false;
        } else {
            if (arg0 >= -68) {
                method419(true, false, null);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZIIBLci;II)V")
    public static final void method417(boolean arg0, int arg1, int arg2, byte arg3, class320 arg4, int arg5, int arg6) {
        class18.field201 = arg6;
        class414.field5863 = arg5;
        class92.field1478 = 1;
        if (arg3 <= 107) {
            method419(false, false, null);
        }
        field855++;
        class479.field6987 = arg4;
        class19.field211 = arg2;
        class133.field2069 = arg0;
        class431.field6188 = arg1;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)V")
    public static void method418(byte arg0) {
        field861 = null;
        field853 = null;
        field866 = null;
        if (arg0 > -60) {
            field866 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZZLjava/lang/Object;)[B")
    public static final byte[] method419(boolean arg0, boolean arg1, Object arg2) {
        field854++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class128.method945(var3, -27375) : var3;
        } else if (arg2 instanceof class274) {
            class274 var4 = (class274) arg2;
            return var4.method1764((byte) -79);
        } else if (arg1) {
            throw new IllegalArgumentException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIB[BI)V")
    public static final void method420(int arg0, int arg1, int arg2, int arg3, byte arg4, byte[] arg5, int arg6) {
        field858++;
        if (arg3 > 0 && !class494.method2900((byte) -107, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class494.method2900((byte) 34, arg2)) {
            int var7 = class474.method2814(arg1, 6410);
            if (arg4 != -54) {
                field853 = null;
            }
            int var8 = 0;
            int var9 = arg3 >= arg2 ? arg2 : arg3;
            int var10 = arg3 >> 1;
            int var11 = arg2 >> 1;
            byte[] var12 = arg5;
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg6, var8, arg0, arg3, arg2, 0, arg1, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg3 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var13[var17] = (byte) (var27 >> 2);
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                byte[] var16 = var13;
                var13 = var12;
                var12 = var16;
                arg2 = var11;
                arg3 = var10;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var8++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
    public final void method421(int arg0) {
        field856++;
        if (this.field859 == null) {
            return;
        }
        this.field859.field857 = this.field857;
        this.field857.field859 = this.field859;
        this.field859 = null;
        this.field857 = null;
        if (arg0 != 22071) {
            this.field863 = 99L;
        }
    }
}
