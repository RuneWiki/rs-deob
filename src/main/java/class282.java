import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class282 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Ljf;")
    public static class216 field4583 = new class216(100);

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field4592 = -1;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public int field4584;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public int field4585;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public int field4586;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public int field4588;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public int field4589;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public int field4594;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Lff;")
    public static class48 field4587;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static void method1939(byte arg0) {
        field4587 = null;
        field4583 = null;
        if (arg0 <= 74) {
            method1942(-61, -122, (byte) -118);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1940(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        long var8 = class78.method531(arg3, arg4 + arg6, arg0 - -arg2);
        field4593++;
        if (var8 != 0L) {
            int var10 = (int) var8 >> 20 & 0x3;
            int var11 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            int var12 = ((int) var8 & 0x7C32B) >> 14;
            class191 var13 = class128.method822(var11, (byte) -68);
            if (var13.field3034 == -1) {
                int var14 = arg1;
                int var15 = (52736 - arg0 * 512) * 4 + arg4 * 4 + 24624;
                if (var8 > 0L) {
                    var14 = arg5;
                }
                int[] var16 = class151.field2226;
                if (var12 == 0 || var12 == 2) {
                    if (var10 == 0) {
                        var16[var15] = var14;
                        var16[var15 + 512] = var14;
                        var16[var15 + 1024] = var14;
                        var16[var15 + 1536] = var14;
                    } else if (var10 == 1) {
                        var16[var15] = var14;
                        var16[var15 + 1] = var14;
                        var16[var15 + 2] = var14;
                        var16[var15 + 3] = var14;
                    } else if (var10 == 2) {
                        var16[var15 + 3] = var14;
                        var16[var15 + 3 + 512] = var14;
                        var16[var15 + 1027] = var14;
                        var16[var15 + 3 + 1536] = var14;
                    } else if (var10 == 3) {
                        var16[var15 + 1536] = var14;
                        var16[var15 + 1536 + 1] = var14;
                        var16[var15 + 2 + 1536] = var14;
                        var16[var15 + 1539] = var14;
                    }
                }
                if (var12 == 3) {
                    if (var10 == 0) {
                        var16[var15] = var14;
                    } else if (var10 == 1) {
                        var16[var15 + 3] = var14;
                    } else if (var10 == 2) {
                        var16[var15 + 1536 + 3] = var14;
                    } else if (var10 == 3) {
                        var16[var15 + 1536] = var14;
                    }
                }
                if (var12 == 2) {
                    if (var10 == 3) {
                        var16[var15] = var14;
                        var16[var15 + 512] = var14;
                        var16[var15 + 1024] = var14;
                        var16[var15 + 1536] = var14;
                    } else if (var10 == 0) {
                        var16[var15] = var14;
                        var16[var15 + 1] = var14;
                        var16[var15 + 2] = var14;
                        var16[var15 + 3] = var14;
                    } else if (var10 == 1) {
                        var16[var15 + 3] = var14;
                        var16[var15 + 3 + 512] = var14;
                        var16[var15 + 3 + 1024] = var14;
                        var16[var15 + 1536 + 3] = var14;
                    } else if (var10 == 2) {
                        var16[var15 + 1536] = var14;
                        var16[var15 + 1536 + 1] = var14;
                        var16[var15 + 2 + 1536] = var14;
                        var16[var15 + 3 + 1536] = var14;
                    }
                }
            } else if (!class290.method1968(arg4, var10, arg2, arg0, arg6, (byte) -106, var13)) {
                return false;
            }
        }
        long var17 = class55.method362(arg3, arg4 + arg6, arg0 + arg2);
        if (var17 != 0L) {
            int var19 = (int) var17 >> 20 & 0x3;
            int var20 = ((int) var17 & 0x7D2EC) >> 14;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            class191 var22 = class128.method822(var21, (byte) -94);
            if (var22.field3034 == -1) {
                if (var20 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int[] var24 = class151.field2226;
                    int var25 = arg4 * 4 + (52736 - (arg0 * 512)) * 4 + 24624;
                    if (var19 == 0 || var19 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1025] = var23;
                        var24[var25 + 512 + 2] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 1 + 512] = var23;
                        var24[var25 + 1026] = var23;
                        var24[var25 + 1539] = var23;
                    }
                }
            } else if (!class290.method1968(arg4, var19, arg2, arg0, arg6, (byte) -106, var22)) {
                return false;
            }
        }
        long var26 = class33.method173(arg3, arg4 + arg6, arg0 + arg2);
        if (arg7 > -78) {
            field4583 = null;
        }
        if (var26 != 0L) {
            int var28 = (int) (var26 >>> 32) & Integer.MAX_VALUE;
            int var29 = ((int) var26 & 0x31E18F) >> 20;
            class191 var30 = class128.method822(var28, (byte) -75);
            if (var30.field3034 != -1 && !class290.method1968(arg4, var29, arg2, arg0, arg6, (byte) -106, var30)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lmd;Lim;II)V")
    public static final void method1941(class239 arg0, class170 arg1, int arg2, int arg3) {
        field4590++;
        class47 var4 = new class47();
        var4.field599 = arg1.method1218(-60);
        var4.field596 = arg1.method1190(arg2 ^ 0x18C9);
        var4.field590 = new class160[var4.field599];
        var4.field589 = new int[var4.field599];
        var4.field591 = new int[var4.field599];
        var4.field601 = new class160[var4.field599];
        var4.field593 = new int[var4.field599];
        var4.field588 = new byte[var4.field599][][];
        for (int var5 = arg2; var5 < var4.field599; var5++) {
            try {
                int var6 = arg1.method1218(arg2 - 29);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg1.method1195(-1);
                    String var18 = arg1.method1195(-1);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg1.method1190(6345);
                    }
                    var4.field593[var5] = var6;
                    var4.field591[var5] = var19;
                    var4.field590[var5] = arg0.method1688(var18, class13.method71(var17, (byte) -88), -84);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg1.method1195(arg2 - 1);
                    String var8 = arg1.method1195(-1);
                    int var9 = arg1.method1218(-118);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg1.method1195(-1);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg1.method1190(6345);
                            var12[var13] = new byte[var14];
                            arg1.method1165(0, false, var14, var12[var13]);
                        }
                    }
                    Class[] var15 = new Class[var9];
                    var4.field593[var5] = var6;
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class13.method71(var10[var16], (byte) -88);
                    }
                    var4.field601[var5] = arg0.method1683(class13.method71(var7, (byte) -88), var8, (byte) 113, var15);
                    var4.field588[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field589[var5] = -1;
            } catch (SecurityException var21) {
                var4.field589[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field589[var5] = -3;
            } catch (Exception var23) {
                var4.field589[var5] = -4;
            } catch (Throwable var24) {
                var4.field589[var5] = -5;
            }
        }
        class209.field3270.method1540(var4, (byte) -114);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIB)Lfe;")
    public static final class231 method1942(int arg0, int arg1, byte arg2) {
        int var3 = 89 % ((-arg2 - 6) / 44);
        class231 var4 = class201.method1398(arg0, 0);
        field4591++;
        if (arg1 == -1) {
            return var4;
        } else if (var4 == null || var4.field3578 == null || arg1 >= var4.field3578.length) {
            return null;
        } else {
            return var4.field3578[arg1];
        }
    }
}
