import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
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

@OriginalClass("client!hga")
public class class172 extends class381 {

    @OriginalMember(owner = "client!hga", name = "q", descriptor = "Lum;")
    private class528 field2428;

    @OriginalMember(owner = "client!hga", name = "x", descriptor = "Lom;")
    private class351 field2435;

    @OriginalMember(owner = "client!hga", name = "v", descriptor = "Ltg;")
    private class334 field2433;

    @OriginalMember(owner = "client!hga", name = "l", descriptor = "I")
    private int field2423;

    @OriginalMember(owner = "client!hga", name = "C", descriptor = "I")
    private int field2440;

    @OriginalMember(owner = "client!hga", name = "t", descriptor = "I")
    private int field2431;

    @OriginalMember(owner = "client!hga", name = "D", descriptor = "I")
    private int field2441;

    @OriginalMember(owner = "client!hga", name = "j", descriptor = "[[F")
    private float[][] field2421;

    @OriginalMember(owner = "client!hga", name = "n", descriptor = "[[F")
    private float[][] field2425;

    @OriginalMember(owner = "client!hga", name = "A", descriptor = "[[F")
    private float[][] field2438;

    @OriginalMember(owner = "client!hga", name = "k", descriptor = "I")
    private int field2422;

    @OriginalMember(owner = "client!hga", name = "y", descriptor = "Lega;")
    private class184 field2436;

    @OriginalMember(owner = "client!hga", name = "m", descriptor = "Lip;")
    private class532 field2424;

    @OriginalMember(owner = "client!hga", name = "r", descriptor = "Lefa;")
    private class322 field2429;

    @OriginalMember(owner = "client!hga", name = "i", descriptor = "Ljaclib/memory/Stream;")
    private Stream field2420;

    @OriginalMember(owner = "client!hga", name = "z", descriptor = "Ljaclib/memory/Stream;")
    private Stream field2437;

    @OriginalMember(owner = "client!hga", name = "p", descriptor = "I")
    private int field2427;

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!hga", name = "o", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!hga", name = "s", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!hga", name = "u", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!hga", name = "w", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!hga", name = "B", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(SI)V")
    private final void method1189(short arg0, int arg1) {
        int var3 = -15 / ((arg1 - 83) / 43);
        field2439++;
        if (Stream.method2077()) {
            this.field2437.method2083(arg0);
        } else {
            this.field2437.method2080(arg0);
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I[[ZIII)V")
    public final void method1190(int arg0, boolean[][] arg1, int arg2, int arg3, int arg4) {
        field2432++;
        if (this.field2424 == null) {
            return;
        }
        if (arg2 < 123) {
            this.field2433 = null;
        }
        if ((arg0 + arg3) < this.field2423 || arg3 - arg0 > this.field2440 || (arg4 + arg0) < this.field2431 || (arg4 - arg0) > this.field2441) {
            return;
        }
        for (int var6 = this.field2431; var6 <= this.field2441; var6++) {
            for (int var7 = this.field2423; var7 <= this.field2440; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg4;
                if ((-arg0) < var8 && arg0 > var8 && -arg0 < var9 && arg0 > var9 && arg1[var8 + arg0][var9 + arg0]) {
                    this.field2428.method2997((byte) ((int) (this.field2433.method2053((byte) 113) * 255.0F)), 22016);
                    this.field2428.method754(this.field2436, 0, 27910);
                    this.field2428.method811(this.field2428.field7801, (byte) -95);
                    this.field2428.method756(0, this.field2427, 11897, class433.field6280, this.field2422 / 3, this.field2424, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(BII)V")
    public static final void method1191(byte arg0, int arg1, int arg2) {
        field2419++;
        int var3 = class141.field2042.method3455(class279.field3649.method1654(-51, class262.field3401), (byte) 1);
        for (class426 var4 = (class426) class152.field2150.method1904(false); var4 != null; var4 = (class426) class152.field2150.method1901(123)) {
            int var9 = class104.method739(var4, -11666);
            if (var3 < var9) {
                var3 = var9;
            }
        }
        var3 += 8;
        int var5 = class373.field5520 * 16 + 21;
        int var6 = arg1 - (var3 / 2);
        if ((var3 + var6) > class454.field6538) {
            var6 = class454.field6538 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg2;
        if (class425.field6218 < var5 + arg2) {
            var7 = class425.field6218 - var5;
        }
        int var8 = -77 % ((arg0 + 32) / 56);
        if (var7 < 0) {
            var7 = 0;
        }
        class201.field2730 = var6;
        class367.field5374 = var3;
        class232.field3067 = (class70.field1083 ? 26 : 22) + class373.field5520 * 16;
        class291.field4283 = var7;
        class683.field9638 = true;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIIIBII)V")
    private final void method1192(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field2426++;
        long var8 = -1L;
        int var10 = (arg0 << this.field2435.field9623) + arg5;
        int var11 = (arg1 << this.field2435.field9623) + arg6;
        int var12 = this.field2435.method3824(var10, 117, var11);
        if ((arg5 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class381 var13 = this.field2429.method2002((byte) -123, var8);
            if (var13 != null) {
                this.method1189(((class263) var13).field3409, 126);
                return;
            }
        }
        short var14 = (short) (this.field2427++);
        if (var8 != -1L) {
            this.field2429.method2001(-83, new class263(var14), var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg5 == 0 && arg6 == 0) {
            var15 = this.field2421[arg3][arg2];
            var16 = this.field2438[arg3][arg2];
            var17 = this.field2425[arg3][arg2];
        } else if (this.field2435.field9629 == arg5 && arg6 == 0) {
            var15 = this.field2421[arg3 + 1][arg2];
            var17 = this.field2425[arg3 + 1][arg2];
            var16 = this.field2438[arg3 + 1][arg2];
        } else if (this.field2435.field9629 == arg5 && this.field2435.field9629 == arg6) {
            var17 = this.field2425[arg3 + 1][arg2 + 1];
            var15 = this.field2421[arg3 + 1][arg2 + 1];
            var16 = this.field2438[arg3 + 1][arg2 + 1];
        } else if (arg5 == 0 && this.field2435.field9629 == arg6) {
            var15 = this.field2421[arg3][arg2 + 1];
            var17 = this.field2425[arg3][arg2 + 1];
            var16 = this.field2438[arg3][arg2 + 1];
        } else {
            float var18 = (float) arg5 / (float) this.field2435.field9629;
            float var19 = (float) arg6 / (float) this.field2435.field9629;
            float var20 = this.field2421[arg3][arg2];
            float var21 = this.field2438[arg3][arg2];
            float var22 = this.field2425[arg3][arg2];
            float var23 = this.field2421[arg3 + 1][arg2];
            float var24 = this.field2438[arg3 + 1][arg2];
            float var25 = (this.field2438[arg3 + 1][arg2 + 1] - var24) * var18 + var24;
            float var26 = (this.field2438[arg3][arg2 + 1] - var21) * var18 + var21;
            float var27 = this.field2425[arg3 + 1][arg2];
            float var28 = (this.field2425[arg3][arg2 + 1] - var22) * var18 + var22;
            float var29 = (this.field2421[arg3][arg2 + 1] - var20) * var18 + var20;
            float var30 = (this.field2421[arg3 + 1][arg2 + 1] - var23) * var18 + var23;
            float var31 = (this.field2425[arg3 + 1][arg2 + 1] - var27) * var18 + var27;
            var15 = (var30 - var29) * var19 + var29;
            var16 = (var25 - var26) * var19 + var26;
            var17 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field2433.method2050((byte) -81) - var10);
        float var33 = (float) (this.field2433.method2045(0) - var12);
        float var34 = (float) (this.field2433.method2046(true) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field2433.method2051(arg4 ^ 0xE0FC72DC);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var37 + var15 * var38 + var16 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field2433.method2049(arg4 - 93);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFFDA) >> 8) * var43);
        if (arg4 != 93) {
            return;
        }
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (Stream.method2077()) {
            this.field2420.method2075((float) var10);
            this.field2420.method2075((float) var12);
            this.field2420.method2075((float) var11);
        } else {
            this.field2420.method2088((float) var10);
            this.field2420.method2088((float) var12);
            this.field2420.method2088((float) var11);
        }
        if (this.field2428.field7764 == 0) {
            this.field2420.method2082(var47);
            this.field2420.method2082(var46);
            this.field2420.method2082(var45);
        } else {
            this.field2420.method2082(var45);
            this.field2420.method2082(var46);
            this.field2420.method2082(var47);
        }
        this.field2420.method2082(255);
        this.method1189(var14, 127);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(BLlr;)V")
    public static final void method1193(byte arg0, class311 arg1) {
        field2430++;
        class201 var2 = (class201) class250.field3284.method1904(false);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.field2729; var4++) {
            if (var2.field2735[var4] != null) {
                if (var2.field2735[var4].field3311 == 2) {
                    var2.field2728[var4] = -5;
                }
                if (var2.field2735[var4].field3311 == 0) {
                    var3 = true;
                }
            }
            if (var2.field2726[var4] != null) {
                if (var2.field2726[var4].field3311 == 2) {
                    var2.field2728[var4] = -6;
                }
                if (var2.field2726[var4].field3311 == 0) {
                    var3 = true;
                }
            }
        }
        if (var3) {
            return;
        }
        int var5 = arg1.field7956;
        arg1.method3146(var2.field2736, arg0 ^ 0x48);
        if (arg0 != 30) {
            return;
        }
        for (int var6 = 0; var6 < var2.field2729; var6++) {
            if (var2.field2728[var6] == 0) {
                try {
                    int var7 = var2.field2727[var6];
                    if (var7 == 0) {
                        Field var8 = (Field) var2.field2735[var6].field3307;
                        int var9 = var8.getInt(null);
                        arg1.method3110(0, arg0 + 66);
                        arg1.method3146(var9, -99);
                    } else if (var7 == 1) {
                        Field var12 = (Field) var2.field2735[var6].field3307;
                        var12.setInt(null, var2.field2734[var6]);
                        arg1.method3110(0, arg0 + 18);
                    } else if (var7 == 2) {
                        Field var10 = (Field) var2.field2735[var6].field3307;
                        int var11 = var10.getModifiers();
                        arg1.method3110(0, 59);
                        arg1.method3146(var11, 103);
                    }
                    if (var7 == 3) {
                        Method var13 = (Method) var2.field2726[var6].field3307;
                        byte[][] var14 = var2.field2738[var6];
                        Object[] var15 = new Object[var14.length];
                        for (int var16 = 0; var16 < var14.length; var16++) {
                            ObjectInputStream var17 = new ObjectInputStream(new ByteArrayInputStream(var14[var16]));
                            var15[var16] = var17.readObject();
                        }
                        Object var18 = var13.invoke(null, var15);
                        if (var18 == null) {
                            arg1.method3110(0, 119);
                        } else if (var18 instanceof Number) {
                            arg1.method3110(1, 97);
                            arg1.method3144(arg0 - 140, ((Number) var18).longValue());
                        } else if (var18 instanceof String) {
                            arg1.method3110(2, arg0 + 11);
                            arg1.method3132((String) var18, 3);
                        } else {
                            arg1.method3110(4, 67);
                        }
                    } else if (var7 == 4) {
                        Method var19 = (Method) var2.field2726[var6].field3307;
                        int var20 = var19.getModifiers();
                        arg1.method3110(0, 113);
                        arg1.method3146(var20, 74);
                    }
                } catch (ClassNotFoundException var21) {
                    arg1.method3110(-10, 115);
                } catch (InvalidClassException var22) {
                    arg1.method3110(-11, arg0 ^ 0x1);
                } catch (StreamCorruptedException var23) {
                    arg1.method3110(-12, 39);
                } catch (OptionalDataException var24) {
                    arg1.method3110(-13, arg0 ^ 0x2B);
                } catch (IllegalAccessException var25) {
                    arg1.method3110(-14, 52);
                } catch (IllegalArgumentException var26) {
                    arg1.method3110(-15, 113);
                } catch (InvocationTargetException var27) {
                    arg1.method3110(-16, 103);
                } catch (SecurityException var28) {
                    arg1.method3110(-17, 119);
                } catch (IOException var29) {
                    arg1.method3110(-18, 80);
                } catch (NullPointerException var30) {
                    arg1.method3110(-19, arg0 ^ 0x5F);
                } catch (Exception var31) {
                    arg1.method3110(-20, 36);
                } catch (Throwable var32) {
                    arg1.method3110(-21, arg0 + 92);
                }
            } else {
                arg1.method3110(var2.field2728[var6], 53);
            }
        }
        arg1.method3167(114, var5);
        var2.method2360((byte) 66);
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Lum;Lom;Ltg;[I)V")
    public class172(class528 arg0, class351 arg1, class334 arg2, int[] arg3) {
        this.field2428 = arg0;
        this.field2435 = arg1;
        this.field2433 = arg2;
        int var5 = this.field2433.method2051(-520326527) - (arg1.field9629 >> 1);
        this.field2423 = this.field2433.method2050((byte) -17) - var5 >> arg1.field9623;
        this.field2440 = var5 + this.field2433.method2050((byte) -85) >> arg1.field9623;
        this.field2431 = this.field2433.method2046(true) - var5 >> arg1.field9623;
        this.field2441 = this.field2433.method2046(true) + var5 >> arg1.field9623;
        int var6 = this.field2440 + 1 - this.field2423;
        int var7 = this.field2441 + 1 - this.field2431;
        this.field2421 = new float[var6 + 1][var7 + 1];
        this.field2425 = new float[var6 + 1][var7 + 1];
        this.field2438 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = var8 + this.field2431;
            if (var27 > 0 && var27 < this.field2435.field9630 - 1) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field2423 + var28;
                    if (var29 > 0 && (this.field2435.field9628 - 1) > var29) {
                        int var30 = arg1.method3822(var27, var29 + 1, 0) - arg1.method3822(var27, var29 - 1, 0);
                        int var31 = arg1.method3822(var27 + 1, var29, 0) - arg1.method3822(var27 - 1, var29, 0);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var31 * var31 + var30 * var30 + 65536)));
                        this.field2421[var28][var8] = (float) var30 * var32;
                        this.field2438[var28][var8] = var32 * -256.0F;
                        this.field2425[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field2431; var10 <= this.field2441; var10++) {
            if (var10 >= 0 && arg1.field9630 > var10) {
                for (int var23 = this.field2423; var23 <= this.field2440; var23++) {
                    if (var23 >= 0 && arg1.field9628 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field5211[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var25.length > var26) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field2422 += 3;
                                    }
                                }
                            } else {
                                this.field2422 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field2440 - this.field2423;
            }
        }
        if (this.field2422 <= 0) {
            this.field2436 = null;
            this.field2424 = null;
        } else {
            this.field2429 = new class322(class240.method1478(-28325, this.field2422));
            this.field2424 = this.field2428.method800(false, -25475);
            this.field2424.method984(this.field2422, 126);
            NativeHeapBuffer var11 = this.field2428.method2996(false, this.field2422 * 16, 46);
            this.field2420 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field2424.method985((byte) -100, true);
                } while (var12 == null);
                this.field2437 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field2431; var15 <= this.field2441; var15++) {
                    if (var15 >= 0 && arg1.field9630 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field2423; var17 <= this.field2440; var17++) {
                            if (var17 >= 0 && var17 < arg1.field9628) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field5211[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field5183[var17][var15];
                                        int[] var21 = arg1.field5221[var17][var15];
                                        int var22 = 0;
                                        label122: while (true) {
                                            while (true) {
                                                if (var19.length <= var22) {
                                                    break label122;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method1192(var17, var15, var14, var16, (byte) 93, var20[var22], var21[var22]);
                                                    var22++;
                                                    this.method1192(var17, var15, var14, var16, (byte) 93, var20[var22], var21[var22]);
                                                    var22++;
                                                    this.method1192(var17, var15, var14, var16, (byte) 93, var20[var22], var21[var22]);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method1192(var17, var15, var14, var16, (byte) 93, 0, 0);
                                        this.method1192(var17, var15, var14, var16, (byte) 93, arg1.field9629, 0);
                                        this.method1192(var17, var15, var14, var16, (byte) 93, 0, arg1.field9629);
                                    } else if (var18 == 2) {
                                        this.method1192(var17, var15, var14, var16, (byte) 93, arg1.field9629, 0);
                                        this.method1192(var17, var15, var14, var16, (byte) 93, arg1.field9629, arg1.field9629);
                                        this.method1192(var17, var15, var14, var16, (byte) 93, 0, 0);
                                    } else if (var18 == 5) {
                                        this.method1192(var17, var15, var14, var16, (byte) 93, arg1.field9629, arg1.field9629);
                                        this.method1192(var17, var15, var14, var16, (byte) 93, 0, arg1.field9629);
                                        this.method1192(var17, var15, var14, var16, (byte) 93, arg1.field9629, 0);
                                    } else if (var18 == 4) {
                                        this.method1192(var17, var15, var14, var16, (byte) 93, 0, arg1.field9629);
                                        this.method1192(var17, var15, var14, var16, (byte) 93, 0, 0);
                                        this.method1192(var17, var15, var14, var16, (byte) 93, arg1.field9629, arg1.field9629);
                                    }
                                }
                            }
                            var16++;
                            var13++;
                        }
                    } else {
                        var13 += this.field2440 - this.field2423;
                    }
                    var14++;
                }
                this.field2437.method2084();
                if (this.field2424.method986(true)) {
                    this.field2420.method2084();
                    this.field2436 = this.field2428.method806(10, false);
                    this.field2436.method1228(-27648, 16, var11, this.field2427 * 16);
                    break;
                }
                this.field2420.method2078(0);
                this.field2429.method1995((byte) -123);
            }
        }
        this.field2429 = null;
        this.field2420 = null;
        this.field2437 = null;
        this.field2421 = this.field2438 = this.field2425 = null;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1194(int arg0, byte arg1, int arg2) {
        field2434++;
        if (arg1 > -60) {
            method1194(-118, (byte) -84, 54);
        }
        return (arg0 & 0x34) != 0;
    }
}
