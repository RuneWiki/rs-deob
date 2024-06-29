import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public abstract class class415 extends class529 {

    @OriginalMember(owner = "client!as", name = "t", descriptor = "I")
    public int field6288;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "I")
    public int field6282;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "F")
    public float field6283;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "I")
    private int field6286;

    @OriginalMember(owner = "client!as", name = "A", descriptor = "I")
    public int field6295;

    @OriginalMember(owner = "client!as", name = "w", descriptor = "I")
    private int field6291;

    @OriginalMember(owner = "client!as", name = "y", descriptor = "I")
    public static int field6293 = -1;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!as", name = "s", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!as", name = "x", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!as", name = "z", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!as", name = "B", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!as", name = "C", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!as", name = "D", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "Lmn;")
    public static class162 field6290;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)I")
    public final int method2645(int arg0) {
        field6298++;
        if (arg0 < 112) {
            this.field6291 = -43;
        }
        return this.field6282;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)V")
    public static void method2646(byte arg0) {
        int var1 = -104 % ((23 - arg0) / 53);
        field6290 = null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZF)V")
    public abstract void method207(boolean arg0, float arg1);

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)I")
    public final int method2647(int arg0) {
        field6287++;
        if (arg0 != -36) {
            this.field6282 = 37;
        }
        return this.field6286;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)F")
    public final float method2648(boolean arg0) {
        field6284++;
        if (arg0) {
            field6293 = -69;
        }
        return this.field6283;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZIIIZ)V")
    public static final void method2649(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field6280++;
        class253.method1740(arg2, arg3, arg1, -13887, arg0, arg4, class471.field7209.length - 1);
        class249.field4044 = 0;
        class418.field6338 = null;
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(I)I")
    public final int method2650(int arg0) {
        field6296++;
        if (arg0 < 117) {
            this.method2650(-117);
        }
        return this.field6288;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIII)V")
    public abstract void method213(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!as", name = "g", descriptor = "(I)I")
    public final int method2651(int arg0) {
        if (arg0 >= -104) {
            this.field6282 = 104;
        }
        field6289++;
        return this.field6291;
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(Z)V")
    public static final void method2652(boolean arg0) {
        field6297++;
        if (!arg0) {
            return;
        }
        class488 var1 = null;
        try {
            class495 var2 = class339.field5294.method19(19, false, "3");
            while (var2.field7458 == 0) {
                class208.method1464((byte) -87, 1L);
            }
            if (var2.field7458 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class488) var2.field7462;
            byte[] var3 = new byte[(int) var1.method2997((byte) 105)];
            if (var3.length == 0) {
                class345.field5379 = "";
                class296.field4668 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2993(var3, (byte) -108, var4, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class208 var6 = new class208(var3);
                int var7 = var6.method1445(22);
                if (var7 > 50) {
                    throw new RuntimeException("Bad length");
                }
                var6.field3162 = var7 + 1;
                if (!var6.method1466(false)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field3162 = 1;
                int var8 = var6.method1445(-91);
                if (var8 != 0) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class345.field5379 = var6.method1450(false);
                class296.field4668 = var6.method1450(false);
            }
        } catch (Exception var10) {
            class296.field4668 = "";
            class345.field5379 = "";
        }
        try {
            if (var1 != null) {
                var1.method2994(-30563);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILgh;II)V")
    public static final void method2653(int arg0, class350 arg1, int arg2, int arg3) {
        if (arg0 > -111) {
            method2653(51, null, -87, 0);
        }
        field6292++;
        if (arg1.field840 == arg3 && arg3 != -1) {
            class363 var4 = class388.field5915.method1703(arg3, -12536);
            int var5 = var4.field5621;
            if (var5 == 1) {
                arg1.field836 = arg2;
                arg1.field804 = 0;
                arg1.field875 = 0;
                arg1.field886 = 1;
                arg1.field826 = 0;
                class35.method217((byte) -44, class358.field5565 == arg1, arg1.field875, var4, arg1.field6417, arg1.field6410, arg1.field6419);
            }
            if (var5 == 2) {
                arg1.field804 = 0;
                return;
            }
        } else if (arg3 == -1 || arg1.field840 == -1 || class388.field5915.method1703(arg3, -12536).field5608 >= class388.field5915.method1703(arg1.field840, -12536).field5608) {
            arg1.field804 = 0;
            arg1.field826 = 0;
            arg1.field893 = arg1.field898;
            arg1.field840 = arg3;
            arg1.field836 = arg2;
            arg1.field875 = 0;
            arg1.field886 = 1;
            if (arg1.field840 == -1) {
                return;
            }
            class35.method217((byte) -44, class358.field5565 == arg1, arg1.field875, class388.field5915.method1703(arg1.field840, -12536), arg1.field6417, arg1.field6410, arg1.field6419);
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(IIIIIF)V")
    public class415(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field6288 = arg0;
        this.field6282 = arg1;
        this.field6283 = arg5;
        this.field6286 = arg4;
        this.field6295 = arg2;
        this.field6291 = arg3;
    }

    @OriginalMember(owner = "client!as", name = "h", descriptor = "(I)I")
    public final int method2654(int arg0) {
        field6285++;
        if (arg0 != 0) {
            this.method2645(108);
        }
        return this.field6295;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I[ILwq;[I[I)V")
    public static final void method2655(int arg0, int[] arg1, class378 arg2, int[] arg3, int[] arg4) {
        field6294++;
        int var5 = 0;
        if (arg0 != 7070) {
            field6281 = 125;
        }
        while (var5 < arg4.length) {
            int var6 = arg4[var5];
            int var7 = arg1[var5];
            int var8 = arg3[var5];
            int var9 = 0;
            while (var7 != 0 && arg2.field818.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field818[var9] = null;
                    } else {
                        class363 var10 = class388.field5915.method1703(var6, -12536);
                        int var11 = var10.field5621;
                        class75 var12 = arg2.field818[var9];
                        if (var12 != null) {
                            if (var12.field1120 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field818[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1122 = 0;
                                    var12.field1119 = var8;
                                    var12.field1121 = 0;
                                    var12.field1114 = 0;
                                    var12.field1118 = 1;
                                    class35.method217((byte) -44, false, 0, var10, arg2.field6417, arg2.field6410, arg2.field6419);
                                } else if (var11 == 2) {
                                    var12.field1121 = 0;
                                }
                            } else if (var10.field5608 >= class388.field5915.method1703(var12.field1120, -12536).field5608) {
                                var12 = arg2.field818[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class75 var13 = arg2.field818[var9] = new class75();
                            var13.field1114 = 0;
                            var13.field1119 = var8;
                            var13.field1118 = 1;
                            var13.field1121 = 0;
                            var13.field1122 = 0;
                            var13.field1120 = var6;
                            class35.method217((byte) -44, false, 0, var10, arg2.field6417, arg2.field6410, arg2.field6419);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
            var5++;
        }
    }
}
