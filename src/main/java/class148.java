import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class148 extends class124 {

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
    public int field3272 = 0;

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
    private int field3274 = -1;

    @OriginalMember(owner = "client!vb", name = "V", descriptor = "I")
    public int field3279 = 1;

    @OriginalMember(owner = "client!vb", name = "W", descriptor = "I")
    private int field3280 = 0;

    @OriginalMember(owner = "client!vb", name = "ob", descriptor = "I")
    private int field3298 = 0;

    @OriginalMember(owner = "client!vb", name = "lb", descriptor = "Z")
    public boolean field3295 = false;

    @OriginalMember(owner = "client!vb", name = "U", descriptor = "Z")
    public boolean field3278 = true;

    @OriginalMember(owner = "client!vb", name = "rb", descriptor = "I")
    public int field3301 = 0;

    @OriginalMember(owner = "client!vb", name = "hb", descriptor = "I")
    private int field3291 = -1;

    @OriginalMember(owner = "client!vb", name = "ab", descriptor = "I")
    public int field3284 = -1;

    @OriginalMember(owner = "client!vb", name = "ib", descriptor = "I")
    public int field3292 = -1;

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "Z")
    public boolean field3276 = false;

    @OriginalMember(owner = "client!vb", name = "cb", descriptor = "I")
    private int field3286 = 0;

    @OriginalMember(owner = "client!vb", name = "db", descriptor = "I")
    public int field3287 = 1;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "Z")
    public boolean field3271 = false;

    @OriginalMember(owner = "client!vb", name = "Y", descriptor = "I")
    private int field3282 = 0;

    @OriginalMember(owner = "client!vb", name = "Qb", descriptor = "I")
    public int field3326 = -1;

    @OriginalMember(owner = "client!vb", name = "sb", descriptor = "I")
    public int field3302 = -1;

    @OriginalMember(owner = "client!vb", name = "nb", descriptor = "I")
    public int field3297 = 2;

    @OriginalMember(owner = "client!vb", name = "xb", descriptor = "Z")
    private boolean field3307 = false;

    @OriginalMember(owner = "client!vb", name = "Z", descriptor = "I")
    public int field3283 = 0;

    @OriginalMember(owner = "client!vb", name = "Mb", descriptor = "I")
    public int field3322 = 16;

    @OriginalMember(owner = "client!vb", name = "eb", descriptor = "I")
    private int field3288 = 0;

    @OriginalMember(owner = "client!vb", name = "Hb", descriptor = "I")
    private int field3317 = 128;

    @OriginalMember(owner = "client!vb", name = "Ob", descriptor = "I")
    public int field3324 = -1;

    @OriginalMember(owner = "client!vb", name = "Zb", descriptor = "I")
    public int field3335 = 0;

    @OriginalMember(owner = "client!vb", name = "Xb", descriptor = "I")
    private int field3333 = 128;

    @OriginalMember(owner = "client!vb", name = "Jb", descriptor = "[Lr;")
    public class118[] field3319 = new class118[5];

    @OriginalMember(owner = "client!vb", name = "Rb", descriptor = "Z")
    private boolean field3327 = false;

    @OriginalMember(owner = "client!vb", name = "cc", descriptor = "I")
    private int field3338 = 128;

    @OriginalMember(owner = "client!vb", name = "wb", descriptor = "I")
    public int field3306 = -1;

    @OriginalMember(owner = "client!vb", name = "Eb", descriptor = "Lr;")
    public class118 field3314 = class153.field3483;

    @OriginalMember(owner = "client!vb", name = "Yb", descriptor = "Z")
    public boolean field3334 = true;

    @OriginalMember(owner = "client!vb", name = "jc", descriptor = "I")
    private int field3345 = -1;

    @OriginalMember(owner = "client!vb", name = "R", descriptor = "Lr;")
    public static class118 field3275 = class153.method1136(86, "Hidden)2");

    @OriginalMember(owner = "client!vb", name = "kb", descriptor = "I")
    public static int field3294 = 0;

    @OriginalMember(owner = "client!vb", name = "Bb", descriptor = "[Lba;")
    public static class9[] field3311 = new class9[16];

    @OriginalMember(owner = "client!vb", name = "Lb", descriptor = "Lr;")
    public static class118 field3321 = class153.method1136(110, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!vb", name = "tb", descriptor = "I")
    public static int field3303 = 0;

    @OriginalMember(owner = "client!vb", name = "Gb", descriptor = "Lr;")
    private static class118 field3316 = class153.method1136(99, "wishes to duel with you)3");

    @OriginalMember(owner = "client!vb", name = "Pb", descriptor = "Lr;")
    private static class118 field3325 = class153.method1136(79, "Create a free account");

    @OriginalMember(owner = "client!vb", name = "X", descriptor = "[[S")
    public static short[][] field3281 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!vb", name = "Ib", descriptor = "Lr;")
    public static class118 field3318 = class153.method1136(123, ": ");

    @OriginalMember(owner = "client!vb", name = "ac", descriptor = "Lr;")
    private static class118 field3336 = class153.method1136(91, "glow3:");

    @OriginalMember(owner = "client!vb", name = "Sb", descriptor = "Lr;")
    public static class118 field3328 = field3336;

    @OriginalMember(owner = "client!vb", name = "bb", descriptor = "Lr;")
    public static class118 field3285 = field3336;

    @OriginalMember(owner = "client!vb", name = "vb", descriptor = "Lr;")
    public static class118 field3305 = field3316;

    @OriginalMember(owner = "client!vb", name = "gc", descriptor = "Lr;")
    private static class118 field3342 = class153.method1136(122, "wave2:");

    @OriginalMember(owner = "client!vb", name = "Tb", descriptor = "Lr;")
    public static class118 field3329 = field3342;

    @OriginalMember(owner = "client!vb", name = "qb", descriptor = "Lr;")
    public static class118 field3300 = field3342;

    @OriginalMember(owner = "client!vb", name = "mb", descriptor = "Lr;")
    public static class118 field3296 = field3325;

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!vb", name = "fb", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!vb", name = "gb", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!vb", name = "pb", descriptor = "I")
    public int field3299;

    @OriginalMember(owner = "client!vb", name = "ub", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!vb", name = "yb", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!vb", name = "Cb", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!vb", name = "Fb", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!vb", name = "Kb", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!vb", name = "bc", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!vb", name = "ec", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!vb", name = "fc", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!vb", name = "hc", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!vb", name = "ic", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!vb", name = "jb", descriptor = "[I")
    private int[] field3293;

    @OriginalMember(owner = "client!vb", name = "zb", descriptor = "[I")
    public int[] field3309;

    @OriginalMember(owner = "client!vb", name = "Ab", descriptor = "[I")
    public int[] field3310;

    @OriginalMember(owner = "client!vb", name = "Vb", descriptor = "[I")
    public static int[] field3331;

    @OriginalMember(owner = "client!vb", name = "Wb", descriptor = "[I")
    public static int[] field3332;

    @OriginalMember(owner = "client!vb", name = "dc", descriptor = "[I")
    private int[] field3339;

    @OriginalMember(owner = "client!vb", name = "T", descriptor = "[S")
    private short[] field3277;

    @OriginalMember(owner = "client!vb", name = "Db", descriptor = "[S")
    private short[] field3313;

    @OriginalMember(owner = "client!vb", name = "Nb", descriptor = "[S")
    private short[] field3323;

    @OriginalMember(owner = "client!vb", name = "Ub", descriptor = "[S")
    private short[] field3330;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)Z")
    public final boolean method1078(int arg0) {
        field3340++;
        if (this.field3310 == null) {
            return this.field3326 != -1 || this.field3309 != null;
        }
        if (arg0 != -16) {
            method1084((byte) 109);
        }
        for (int var2 = 0; var2 < this.field3310.length; var2++) {
            if (this.field3310[var2] != -1) {
                class148 var3 = class47.method396(arg0 + 133, this.field3310[var2]);
                if (var3.field3326 != -1 || var3.field3309 != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II[[IIIILw;II)Lwb;")
    public final class155 method1079(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class153 arg6, int arg7, int arg8) {
        field3341++;
        long var10;
        if (this.field3293 == null) {
            var10 = (this.field3299 << 10) + arg7;
        } else {
            var10 = (this.field3299 << 10) + (arg8 << 3) + arg7;
        }
        class155 var12 = (class155) class10.field225.method395((byte) -37, var10);
        if (var12 == null) {
            class17 var13 = this.method1087(arg7, -3, arg8);
            if (var13 == null) {
                return null;
            }
            var12 = var13.method168(this.field3288 + 64, this.field3286 * 5 + 768, -50, -10, -50);
            class10.field225.method391(var12, var10, true);
        }
        if (arg6 == null && this.field3291 == -1) {
            return var12;
        }
        class155 var14;
        if (arg6 == null) {
            var14 = var12.method1214(true);
        } else {
            var14 = arg6.method1138(var12, arg4, arg7, arg1 - 47);
        }
        if (this.field3291 >= 0) {
            var14 = var14.method1218(arg2, arg0, arg3, arg5, false, this.field3291);
        }
        if (arg1 != -50) {
            this.field3295 = true;
        }
        return var14;
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
    public final void method1080(int arg0) {
        if (this.field3302 == -1) {
            this.field3302 = 0;
            if (this.field3339 != null && (this.field3293 == null || this.field3293[0] == 10)) {
                this.field3302 = 1;
            }
            for (int var2 = 0; var2 < 5; var2++) {
                if (this.field3319[var2] != null) {
                    this.field3302 = 1;
                }
            }
        }
        if (arg0 == 5) {
            if (this.field3292 == -1) {
                this.field3292 = this.field3297 == 0 ? 0 : 1;
            }
            field3273++;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)Z")
    public final boolean method1081(int arg0, int arg1) {
        if (arg0 != -7726) {
            return false;
        }
        field3289++;
        if (this.field3293 != null) {
            for (int var5 = 0; var5 < this.field3293.length; var5++) {
                if (this.field3293[var5] == arg1) {
                    return class79.field1917.method353(this.field3339[var5] & 0xFFFF, -1, 0);
                }
            }
            return true;
        } else if (this.field3339 == null) {
            return true;
        } else if (arg1 == 10) {
            boolean var3 = true;
            for (int var4 = 0; var4 < this.field3339.length; var4++) {
                var3 &= class79.field1917.method353(this.field3339[var4] & 0xFFFF, -1, 0);
            }
            return var3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lna;II)V")
    public static final void method1082(class91 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method1083(89, -62);
        }
        field3312++;
        while (true) {
            class103 var3 = (class103) class85.field2050.method889(arg1 + 123);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2366; var5++) {
                if (var3.field2379[var5] != null) {
                    if (var3.field2379[var5].field268 == 2) {
                        var3.field2373[var5] = -5;
                    }
                    if (var3.field2379[var5].field268 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2385[var5] != null) {
                    if (var3.field2385[var5].field268 == 2) {
                        var3.field2373[var5] = -6;
                    }
                    if (var3.field2385[var5].field268 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method722(arg2, (byte) 20);
            arg0.method800(arg1 + 28, 0);
            int var6 = arg0.field2404;
            arg0.method811(var3.field2374, 2073135696);
            for (int var7 = 0; var7 < var3.field2366; var7++) {
                if (var3.field2373[var7] == 0) {
                    try {
                        int var8 = var3.field2386[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field2379[var7].field269;
                            int var13 = var12.getInt(null);
                            arg0.method800(-101, 0);
                            arg0.method811(var13, arg1 ^ 0x7B918A50);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field2379[var7].field269;
                            var11.setInt(null, var3.field2376[var7]);
                            arg0.method800(-120, 0);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field2379[var7].field269;
                            int var10 = var9.getModifiers();
                            arg0.method800(62, 0);
                            arg0.method811(var10, arg1 ^ 0x7B918A50);
                        }
                        if (var8 == 3) {
                            byte[][] var16 = var3.field2382[var7];
                            Method var17 = (Method) var3.field2385[var7].field269;
                            Object[] var18 = new Object[var16.length];
                            for (int var19 = 0; var19 < var16.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var16[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var17.invoke(null, var18);
                            if (var21 == null) {
                                arg0.method800(57, 0);
                            } else if (var21 instanceof Number) {
                                arg0.method800(-118, 1);
                                arg0.method824(((Number) var21).longValue(), true);
                            } else if (var21 instanceof class118) {
                                arg0.method800(-101, 2);
                                arg0.method843((class118) var21, (byte) 120);
                            } else {
                                arg0.method800(78, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2385[var7].field269;
                            int var15 = var14.getModifiers();
                            arg0.method800(16, 0);
                            arg0.method811(var15, 2073135696);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method800(-116, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method800(-106, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method800(25, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method800(-99, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method800(30, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method800(-116, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method800(arg1 ^ 0xFFFFFF8B, -16);
                    } catch (SecurityException var29) {
                        arg0.method800(arg1 - 114, -17);
                    } catch (IOException var30) {
                        arg0.method800(-105, -18);
                    } catch (NullPointerException var31) {
                        arg0.method800(-98, -19);
                    } catch (Exception var32) {
                        arg0.method800(104, -20);
                    } catch (Throwable var33) {
                        arg0.method800(-119, -21);
                    }
                } else {
                    arg0.method800(arg1 + 121, var3.field2373[var7]);
                }
            }
            arg0.method801(3724128, var6);
            arg0.method845(false, arg0.field2404 - var6);
            var3.method768(-1);
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(II)Z")
    public static final boolean method1083(int arg0, int arg1) {
        if (arg1 >= -104) {
            field3285 = null;
        }
        field3320++;
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)V")
    public static void method1084(byte arg0) {
        field3332 = null;
        field3321 = null;
        field3329 = null;
        field3328 = null;
        field3281 = null;
        field3296 = null;
        field3325 = null;
        field3331 = null;
        field3300 = null;
        field3342 = null;
        field3305 = null;
        field3316 = null;
        field3285 = null;
        if (arg0 != 74) {
            field3332 = null;
        }
        field3336 = null;
        field3275 = null;
        field3318 = null;
        field3311 = null;
    }

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)Lvb;")
    public final class148 method1085(int arg0) {
        int var2 = -1;
        field3343++;
        if (this.field3345 != -1) {
            var2 = class131.method1012(arg0 + 3234, this.field3345);
        } else if (this.field3274 != -1) {
            var2 = class92.field2193[this.field3274];
        }
        return ~var2 > arg0 || this.field3310.length <= var2 || this.field3310[var2] == -1 ? null : class47.method396(arg0 + 118, this.field3310[var2]);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLpa;)V")
    public final void method1086(byte arg0, class105 arg1) {
        while (true) {
            int var3 = arg1.method831((byte) 76);
            if (var3 == 0) {
                field3315++;
                if (arg0 != 56) {
                    this.method1085(100);
                    return;
                }
                return;
            }
            this.method1089(arg1, var3, -28);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)Lcb;")
    private final class17 method1087(int arg0, int arg1, int arg2) {
        field3337++;
        if (arg1 != -3) {
            this.method1087(20, 56, -83);
        }
        class17 var4 = null;
        if (this.field3293 == null) {
            if (arg2 != 10) {
                return null;
            }
            if (this.field3339 == null) {
                return null;
            }
            boolean var5 = this.field3307;
            if (arg2 == 2 && arg0 > 3) {
                var5 = !var5;
            }
            int var6 = this.field3339.length;
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = this.field3339[var7];
                if (var5) {
                    var8 += 65536;
                }
                var4 = (class17) class41.field969.method395((byte) -85, (long) var8);
                if (var4 == null) {
                    var4 = class17.method167(class79.field1917, var8 & 0xFFFF, 0);
                    if (var4 == null) {
                        return null;
                    }
                    if (var5) {
                        var4.method150();
                    }
                    class41.field969.method391(var4, (long) var8, true);
                }
                if (var6 > 1) {
                    class75.field1861[var7] = var4;
                }
            }
            if (var6 > 1) {
                var4 = new class17(class75.field1861, var6);
            }
        } else {
            int var9 = -1;
            for (int var10 = 0; var10 < this.field3293.length; var10++) {
                if (this.field3293[var10] == arg2) {
                    var9 = var10;
                    break;
                }
            }
            if (var9 == -1) {
                return null;
            }
            boolean var11 = this.field3307 ^ arg0 > 3;
            int var12 = this.field3339[var9];
            if (var11) {
                var12 += 65536;
            }
            var4 = (class17) class41.field969.method395((byte) -56, (long) var12);
            if (var4 == null) {
                var4 = class17.method167(class79.field1917, var12 & 0xFFFF, 0);
                if (var4 == null) {
                    return null;
                }
                if (var11) {
                    var4.method150();
                }
                class41.field969.method391(var4, (long) var12, true);
            }
        }
        boolean var13;
        if (this.field3333 == 128 && this.field3317 == 128 && this.field3338 == 128) {
            var13 = false;
        } else {
            var13 = true;
        }
        boolean var14;
        if (this.field3282 == 0 && this.field3280 == 0 && this.field3298 == 0) {
            var14 = false;
        } else {
            var14 = true;
        }
        class17 var15 = new class17(var4, arg0 == 0 && !var13 && !var14, this.field3323 == null, this.field3313 == null, true);
        if (arg2 == 4 && arg0 > 3) {
            var15.method166(256);
            var15.method154(45, 0, -45);
        }
        int var16 = arg0 & 0x3;
        if (var16 == 1) {
            var15.method159();
        } else if (var16 == 2) {
            var15.method158();
        } else if (var16 == 3) {
            var15.method147();
        }
        if (this.field3323 != null) {
            for (int var17 = 0; var17 < this.field3323.length; var17++) {
                var15.method155(this.field3323[var17], this.field3330[var17]);
            }
        }
        if (this.field3313 != null) {
            for (int var18 = 0; var18 < this.field3313.length; var18++) {
                var15.method169(this.field3313[var18], this.field3277[var18]);
            }
        }
        if (var13) {
            var15.method149(this.field3333, this.field3317, this.field3338);
        }
        if (var14) {
            var15.method154(this.field3282, this.field3280, this.field3298);
        }
        return var15;
    }

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)Z")
    public final boolean method1088(int arg0) {
        field3308++;
        if (this.field3339 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 26299) {
            field3311 = null;
        }
        for (int var3 = 0; var3 < this.field3339.length; var3++) {
            var2 &= class79.field1917.method353(this.field3339[var3] & 0xFFFF, -1, 0);
        }
        return var2;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lpa;II)V")
    private final void method1089(class105 arg0, int arg1, int arg2) {
        if (arg2 != -28) {
            return;
        }
        field3290++;
        if (arg1 == 1) {
            int var4 = arg0.method831((byte) 76);
            if (var4 > 0) {
                if (this.field3339 != null && !class69.field1617) {
                    arg0.field2404 += var4 * 3;
                    return;
                }
                this.field3293 = new int[var4];
                this.field3339 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3339[var5] = arg0.method838((byte) 5);
                    this.field3293[var5] = arg0.method831((byte) 76);
                }
                return;
            }
        } else if (arg1 == 2) {
            this.field3314 = arg0.method810(1347010600);
            return;
        } else {
            if (arg1 != 5) {
                if (arg1 == 14) {
                    this.field3279 = arg0.method831((byte) 76);
                    return;
                } else if (arg1 == 15) {
                    this.field3287 = arg0.method831((byte) 76);
                    return;
                } else if (arg1 == 17) {
                    this.field3297 = 0;
                    this.field3278 = false;
                    return;
                } else if (arg1 == 18) {
                    this.field3278 = false;
                    return;
                } else if (arg1 == 19) {
                    this.field3302 = arg0.method831((byte) 76);
                    return;
                } else if (arg1 == 21) {
                    this.field3291 = 0;
                    return;
                } else if (arg1 == 22) {
                    this.field3327 = true;
                    return;
                } else if (arg1 == 23) {
                    this.field3271 = true;
                    return;
                } else {
                    if (arg1 == 24) {
                        this.field3324 = arg0.method838((byte) 5);
                        if (this.field3324 == 65535) {
                            this.field3324 = -1;
                            return;
                        }
                    } else if (arg1 == 27) {
                        this.field3297 = 1;
                    } else if (arg1 == 28) {
                        this.field3322 = arg0.method831((byte) 76);
                        return;
                    } else if (arg1 == 29) {
                        this.field3288 = arg0.method807(false);
                        return;
                    } else if (arg1 == 39) {
                        this.field3286 = arg0.method807(false) * 5;
                        return;
                    } else {
                        if (arg1 >= 30 && arg1 < 35) {
                            this.field3319[arg1 - 30] = arg0.method810(1347010600);
                            if (this.field3319[arg1 - 30].method911(class137.field3130, 14934)) {
                                this.field3319[arg1 - 30] = null;
                                return;
                            }
                        } else if (arg1 == 40) {
                            int var6 = arg0.method831((byte) 76);
                            this.field3330 = new short[var6];
                            this.field3323 = new short[var6];
                            for (int var7 = 0; var7 < var6; var7++) {
                                this.field3323[var7] = (short) arg0.method838((byte) 5);
                                this.field3330[var7] = (short) arg0.method838((byte) 5);
                            }
                            return;
                        } else if (arg1 == 41) {
                            int var12 = arg0.method831((byte) 76);
                            this.field3277 = new short[var12];
                            this.field3313 = new short[var12];
                            for (int var13 = 0; var13 < var12; var13++) {
                                this.field3313[var13] = (short) arg0.method838((byte) 5);
                                this.field3277[var13] = (short) arg0.method838((byte) 5);
                            }
                        } else if (arg1 == 60) {
                            this.field3306 = arg0.method838((byte) 5);
                            return;
                        } else if (arg1 == 62) {
                            this.field3307 = true;
                            return;
                        } else if (arg1 == 64) {
                            this.field3334 = false;
                            return;
                        } else if (arg1 == 65) {
                            this.field3333 = arg0.method838((byte) 5);
                            return;
                        } else if (arg1 == 66) {
                            this.field3317 = arg0.method838((byte) 5);
                            return;
                        } else if (arg1 == 67) {
                            this.field3338 = arg0.method838((byte) 5);
                            return;
                        } else if (arg1 == 68) {
                            this.field3284 = arg0.method838((byte) 5);
                            return;
                        } else if (arg1 == 69) {
                            this.field3283 = arg0.method831((byte) 76);
                            return;
                        } else if (arg1 == 70) {
                            this.field3282 = arg0.method790((byte) 127);
                            return;
                        } else if (arg1 == 71) {
                            this.field3280 = arg0.method790((byte) 127);
                            return;
                        } else if (arg1 == 72) {
                            this.field3298 = arg0.method790((byte) 127);
                            return;
                        } else if (arg1 == 73) {
                            this.field3276 = true;
                            return;
                        } else if (arg1 == 74) {
                            this.field3295 = true;
                            return;
                        } else if (arg1 == 75) {
                            this.field3292 = arg0.method831((byte) 76);
                            return;
                        } else if (arg1 == 77) {
                            this.field3345 = arg0.method838((byte) 5);
                            if (this.field3345 == 65535) {
                                this.field3345 = -1;
                            }
                            this.field3274 = arg0.method838((byte) 5);
                            if (this.field3274 == 65535) {
                                this.field3274 = -1;
                            }
                            int var8 = arg0.method831((byte) 76);
                            this.field3310 = new int[var8 + 1];
                            for (int var9 = 0; var9 <= var8; var9++) {
                                this.field3310[var9] = arg0.method838((byte) 5);
                                if (this.field3310[var9] == 65535) {
                                    this.field3310[var9] = -1;
                                }
                            }
                            return;
                        } else if (arg1 == 78) {
                            this.field3326 = arg0.method838((byte) 5);
                            this.field3272 = arg0.method831((byte) 76);
                            return;
                        } else {
                            if (arg1 == 79) {
                                this.field3335 = arg0.method838((byte) 5);
                                this.field3301 = arg0.method838((byte) 5);
                                this.field3272 = arg0.method831((byte) 76);
                                int var10 = arg0.method831((byte) 76);
                                this.field3309 = new int[var10];
                                for (int var11 = 0; var11 < var10; var11++) {
                                    this.field3309[var11] = arg0.method838((byte) 5);
                                }
                            } else if (arg1 == 81) {
                                this.field3291 = arg0.method831((byte) 76) * 256;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            int var14 = arg0.method831((byte) 76);
            if (var14 <= 0) {
                return;
            }
            if (this.field3339 == null || class69.field1617) {
                this.field3293 = null;
                this.field3339 = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field3339[var15] = arg0.method838((byte) 5);
                }
                return;
            }
            arg0.field2404 += var14 * 2;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIII[[I)Lmf;")
    public final class89 method1090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[][] arg6) {
        if (arg3 > -91) {
            field3318 = null;
        }
        field3304++;
        long var8;
        if (this.field3293 == null) {
            var8 = (this.field3299 << 10) + arg4;
        } else {
            var8 = (this.field3299 << 10) + (arg2 << 3) + arg4;
        }
        class89 var10 = (class89) class24.field603.method395((byte) -58, var8);
        if (var10 == null) {
            class17 var11 = this.method1087(arg4, -3, arg2);
            if (var11 == null) {
                return null;
            }
            if (this.field3327) {
                var11.field418 = (short) (this.field3288 + 64);
                var11.field440 = (short) (this.field3286 * 5 + 768);
                var10 = var11;
                var11.method151();
            } else {
                var10 = var11.method168(this.field3288 + 64, 768 - -(this.field3286 * 5), -50, -10, -50);
            }
            class24.field603.method391(var10, var8, true);
        }
        if (this.field3327) {
            var10 = ((class17) var10).method164();
        }
        if (this.field3291 >= 0) {
            if (var10 instanceof class155) {
                var10 = ((class155) var10).method1218(arg6, arg0, arg5, arg1, true, this.field3291);
            } else if (var10 instanceof class17) {
                var10 = ((class17) var10).method162(arg6, arg0, arg5, arg1, true, this.field3291);
            }
        }
        return var10;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([[IIIIIII)Lwb;")
    public final class155 method1091(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var8;
        if (this.field3293 == null) {
            var8 = (this.field3299 << 10) + arg3;
        } else {
            var8 = (arg6 << 3) + ((this.field3299 << 10) + arg3);
        }
        field3344++;
        if (arg2 != -50) {
            return null;
        }
        class155 var10 = (class155) class10.field225.method395((byte) -113, var8);
        if (var10 == null) {
            class17 var11 = this.method1087(arg3, -3, arg6);
            if (var11 == null) {
                return null;
            }
            var10 = var11.method168(this.field3288 + 64, this.field3286 * 5 + 768, -50, -10, -50);
            class10.field225.method391(var10, var8, true);
        }
        if (this.field3291 >= 0) {
            var10 = var10.method1218(arg0, arg4, arg1, arg5, true, this.field3291);
        }
        return var10;
    }
}
