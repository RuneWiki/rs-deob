import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class86 {

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "Lqf;")
    public static class477 field1436 = new class477(5000);

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "[Lch;")
    public static class322[] field1437;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "[Lf;")
    public static class528[] field1431;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)Lnk;")
    public static final class500 method698(int arg0, byte arg1) {
        field1433++;
        class500[] var2 = class214.method1423(-105);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class500 var4 = var2[var3];
            if (var4.field7356 == arg0) {
                return var4;
            }
        }
        if (arg1 != -121) {
            method701(false, false, -76);
        }
        return null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method699(int arg0, int arg1, int arg2, Class arg3) {
        class165 var4 = class36.field545[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class525 var5 = var4.field2490; var5 != null; var5 = var5.field7716) {
            class370 var6 = var5.field7711;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field5532 == arg1 && var6.field5535 == arg2) {
                class263.method1674(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)I")
    public static final int method700(int arg0, boolean arg1) {
        field1434++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg0 & 0xFFF4) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        if (!arg1) {
            return -78;
        }
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return ((var20 >> 2 & 0x3F) << 10) - (-(var21 >> 5 << 7) - (var22 >> 1));
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZZI)V")
    public static final void method701(boolean arg0, boolean arg1, int arg2) {
        field1435++;
        if (arg0) {
            class146.field2155--;
            if (class146.field2155 == 0) {
                class258.field3724 = null;
            }
        }
        if (arg2 != 0) {
            method701(true, false, -96);
        }
        if (!arg1) {
            return;
        }
        class451.field6588--;
        if (class451.field6588 == 0) {
            class430.field6265 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method702(byte arg0) {
        if (arg0 <= 54) {
            method701(true, true, 19);
        }
        field1431 = null;
        field1436 = null;
        field1437 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIBI)V")
    public static final void method703(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field1432++;
        if (arg1 <= class156.field2366 && arg3 >= class229.field3347) {
            boolean var6;
            if (class322.field4945 > arg2) {
                var6 = false;
                arg2 = class322.field4945;
            } else if (arg2 > class145.field2134) {
                var6 = false;
                arg2 = class145.field2134;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg5 < class322.field4945) {
                arg5 = class322.field4945;
                var7 = false;
            } else if (arg5 <= class145.field2134) {
                var7 = true;
            } else {
                arg5 = class145.field2134;
                var7 = false;
            }
            if (class229.field3347 > arg1) {
                arg1 = class229.field3347;
            } else {
                class217.method1448(class436.field6332[arg1++], arg2, arg0, 4, arg5);
            }
            if (arg3 > class156.field2366) {
                arg3 = class156.field2366;
            } else {
                class217.method1448(class436.field6332[arg3--], arg2, arg0, 4, arg5);
            }
            if (var6 && var7) {
                for (int var8 = arg1; var8 <= arg3; var8++) {
                    int[] var9 = class436.field6332[var8];
                    var9[arg2] = var9[arg5] = arg0;
                }
            } else if (var6) {
                for (int var10 = arg1; var10 <= arg3; var10++) {
                    class436.field6332[var10][arg2] = arg0;
                }
            } else if (var7) {
                for (int var11 = arg1; var11 <= arg3; var11++) {
                    class436.field6332[var11][arg5] = arg0;
                }
            }
        }
        if (arg4 > -71) {
            field1436 = null;
        }
    }

    static {
        new class180("Select", "Auswählen", "Sélectionner", "Selecionar");
    }
}
