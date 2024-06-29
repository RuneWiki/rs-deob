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

@OriginalClass("client!qa")
public class class142 {

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Z")
    public static boolean field2376 = true;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "[Lrd;")
    public static class245[] field2370 = new class245[500];

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    public static int field2388 = 0;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2377 = 0;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public int field2372;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "J")
    private long field2371;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "J")
    private long field2382;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "Z")
    public boolean field2387;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "[I")
    private int[] field2369;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "[I")
    private int[] field2390;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "[[[B")
    public static byte[][][] field2383;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([II[IIZ)V")
    public final void method1021(int[] arg0, int arg1, int[] arg2, int arg3, boolean arg4) {
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class237.field4135; var7++) {
                    class35 var8 = class107.method762(arg1 - 31692, var7);
                    if (var8 != null && !var8.field535 && var8.field526 == var6 + (arg4 ? 7 : 0)) {
                        arg2[class236.field4119[var6]] = class82.method642(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field2372 = arg3;
        this.field2369 = arg2;
        this.field2387 = arg4;
        field2385++;
        this.field2390 = arg0;
        if (arg1 != 31695) {
            this.method1025(-88, (class151) null, (byte) 10);
        }
        this.method1023(-104);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZILaf;)V")
    public static final void method1022(boolean arg0, int arg1, class64 arg2) {
        if (arg0) {
            field2388 = 12;
        }
        field2373++;
        while (true) {
            class191 var3 = (class191) class6.field62.method1720(true);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3199; var5++) {
                if (var3.field3190[var5] != null) {
                    if (var3.field3190[var5].field2504 == 2) {
                        var3.field3191[var5] = -5;
                    }
                    if (var3.field3190[var5].field2504 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3196[var5] != null) {
                    if (var3.field3196[var5].field2504 == 2) {
                        var3.field3191[var5] = -6;
                    }
                    if (var3.field3196[var5].field2504 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method424((byte) 121, arg1);
            arg2.method919(-4742, 0);
            int var6 = arg2.field2026;
            arg2.method870(var3.field3193, (byte) 12);
            for (int var7 = 0; var7 < var3.field3199; var7++) {
                if (var3.field3191[var7] == 0) {
                    try {
                        int var8 = var3.field3198[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field3190[var7].field2505;
                            int var10 = var9.getInt((Object) null);
                            arg2.method919(-4742, 0);
                            arg2.method870(var10, (byte) 12);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field3190[var7].field2505;
                            var11.setInt((Object) null, var3.field3195[var7]);
                            arg2.method919(-4742, 0);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field3190[var7].field2505;
                            int var13 = var12.getModifiers();
                            arg2.method919(-4742, 0);
                            arg2.method870(var13, (byte) 12);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field3196[var7].field2505;
                            byte[][] var17 = var3.field3197[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method919(-4742, 0);
                            } else if (var21 instanceof Number) {
                                arg2.method919(-4742, 1);
                                arg2.method885(((Number) var21).longValue(), (byte) -127);
                            } else if ((var21 instanceof class51)) {
                                arg2.method919(-4742, 2);
                                arg2.method896((byte) 0, (class51) var21);
                            } else {
                                arg2.method919(-4742, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field3196[var7].field2505;
                            int var15 = var14.getModifiers();
                            arg2.method919(-4742, 0);
                            arg2.method870(var15, (byte) 12);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method919(-4742, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method919(-4742, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method919(-4742, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method919(-4742, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method919(-4742, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method919(-4742, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method919(-4742, -16);
                    } catch (SecurityException var29) {
                        arg2.method919(-4742, -17);
                    } catch (IOException var30) {
                        arg2.method919(-4742, -18);
                    } catch (NullPointerException var31) {
                        arg2.method919(-4742, -19);
                    } catch (Exception var32) {
                        arg2.method919(-4742, -20);
                    } catch (Throwable var33) {
                        arg2.method919(-4742, -21);
                    }
                } else {
                    arg2.method919(-4742, var3.field3191[var7]);
                }
            }
            arg2.method909(var6, false);
            arg2.method888(107, arg2.field2026 - var6);
            var3.method764((byte) -45);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    private final void method1023(int arg0) {
        field2374++;
        if (arg0 > -51) {
            return;
        }
        long var2 = this.field2382;
        this.field2382 = -1L;
        long[] var4 = class257.field4493;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2382 = var4[(int) ((this.field2382 ^ (long) (this.field2369[var5] >> 24)) & 0xFFL)] ^ this.field2382 >>> 8;
            this.field2382 = this.field2382 >>> 8 ^ var4[(int) ((this.field2382 ^ (long) (this.field2369[var5] >> 16)) & 0xFFL)];
            this.field2382 = this.field2382 >>> 8 ^ var4[(int) (((long) (this.field2369[var5] >> 8) ^ this.field2382) & 0xFFL)];
            this.field2382 = var4[(int) (((long) this.field2369[var5] ^ this.field2382) & 0xFFL)] ^ this.field2382 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2382 = this.field2382 >>> 8 ^ var4[(int) ((this.field2382 ^ (long) this.field2390[var6]) & 0xFFL)];
        }
        this.field2382 = var4[(int) (((long) (this.field2387 ? 1 : 0) ^ this.field2382) & 0xFFL)] ^ this.field2382 >>> 8;
        if (var2 != 0L && this.field2382 != var2) {
            class260.field4539.method1354(var2, (byte) 58);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V")
    public final void method1024(int arg0, int arg1, int arg2) {
        int var4 = 114 % ((arg0 - 79) / 33);
        int var5 = class236.field4119[arg1];
        field2379++;
        if (this.field2369[var5] != 0 && class107.method762(3, arg2) != null) {
            this.field2369[var5] = class82.method642(Integer.MIN_VALUE, arg2);
            this.method1023(-106);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILmb;B)Ltb;")
    public final class65 method1025(int arg0, class151 arg1, byte arg2) {
        field2378++;
        if (this.field2372 != -1) {
            return class247.method1678((byte) -67, this.field2372).method67(arg1, 55, arg0);
        }
        int var4 = 82 / ((-arg2 - 30) / 56);
        class65 var5 = (class65) class213.field3706.method1357((byte) 76, this.field2382);
        if (var5 == null) {
            boolean var6 = false;
            for (int var7 = 0; var7 < 12; var7++) {
                int var16 = this.field2369[var7];
                if ((var16 & 0x40000000) == 0) {
                    if ((var16 & Integer.MIN_VALUE) != 0 && !class107.method762(3, var16 & 0x3FFFFFFF).method177((byte) 42)) {
                        var6 = true;
                    }
                } else if (!class219.method1508(var16 & 0x3FFFFFFF, (byte) -56).method1533(this.field2387, -5439)) {
                    var6 = true;
                }
            }
            if (var6) {
                return null;
            }
            class178[] var8 = new class178[12];
            int var9 = 0;
            for (int var10 = 0; var10 < 12; var10++) {
                int var13 = this.field2369[var10];
                if ((var13 & 0x40000000) != 0) {
                    class178 var15 = class219.method1508(var13 & 0x3FFFFFFF, (byte) -89).method1525(119, this.field2387);
                    if (var15 != null) {
                        var8[var9++] = var15;
                    }
                } else if ((var13 & Integer.MIN_VALUE) != 0) {
                    class178 var14 = class107.method762(3, var13 & 0x3FFFFFFF).method182(110);
                    if (var14 != null) {
                        var8[var9++] = var14;
                    }
                }
            }
            class178 var11 = new class178(var8, var9);
            for (int var12 = 0; var12 < 5; var12++) {
                if (class203.field3399[var12].length > this.field2390[var12]) {
                    var11.method1260(class205.field3428[var12], class203.field3399[var12][this.field2390[var12]]);
                }
                if (this.field2390[var12] < class3.field26[var12].length) {
                    var11.method1260(class154.field2563[var12], class3.field26[var12][this.field2390[var12]]);
                }
            }
            var5 = var11.method1246(64, 768, -50, -10, -50);
            class213.field3706.method1351(var5, 2, this.field2382);
        }
        if (arg1 != null) {
            var5 = arg1.method1085(arg0, var5, -22031);
        }
        return var5;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)I")
    public final int method1026(int arg0) {
        if (arg0 == 1) {
            field2389++;
            return this.field2372 == -1 ? (this.field2369[11] << 5) + (this.field2390[4] << 20) + (this.field2390[0] << 25) + (this.field2369[0] << 15) - (-(this.field2369[8] << 10) + -this.field2369[1]) : 305419896 - -class247.method1678((byte) -126, this.field2372).field139;
        } else {
            return 59;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public static void method1027(boolean arg0) {
        if (!arg0) {
            field2370 = null;
            field2383 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BZ)V")
    public final void method1028(byte arg0, boolean arg1) {
        field2381++;
        this.field2387 = arg1;
        this.method1023(arg0 - 138);
        if (arg0 != 50) {
            method1022(false, -6, (class64) null);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIILmb;I)Ltb;")
    public final class65 method1029(int arg0, int arg1, int arg2, class151 arg3, int arg4) {
        field2375++;
        if (arg0 != 17464) {
            field2383 = null;
        }
        long var6 = (long) arg4 << 32 | (long) (arg1 << 16) | (long) arg4;
        class65 var8 = (class65) class213.field3706.method1357((byte) -123, var6);
        if (var8 == null) {
            class178[] var9 = new class178[2];
            int var10 = 0;
            if (!class107.method762(3, arg4).method177((byte) 42) || !class107.method762(arg0 - 17461, arg1).method177((byte) 42)) {
                return null;
            }
            class178 var11 = class107.method762(3, arg4).method182(31);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class178 var12 = class107.method762(3, arg1).method182(59);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class178 var13 = new class178(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field2390[var14] < class203.field3399[var14].length) {
                    var13.method1260(class205.field3428[var14], class203.field3399[var14][this.field2390[var14]]);
                }
                if (this.field2390[var14] < class3.field26[var14].length) {
                    var13.method1260(class154.field2563[var14], class3.field26[var14][this.field2390[var14]]);
                }
            }
            var8 = var13.method1246(64, 768, -50, -10, -50);
            class213.field3706.method1351(var8, 2, var6);
        }
        if (arg3 != null) {
            var8 = arg3.method1085(arg2, var8, -22031);
        }
        return var8;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBI)V")
    public final void method1030(int arg0, byte arg1, int arg2) {
        this.field2390[arg2] = arg0;
        if (arg1 != 93) {
            this.field2369 = null;
        }
        field2386++;
        this.method1023(-77);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLmb;ILmb;I)Ltb;")
    public final class65 method1031(byte arg0, class151 arg1, int arg2, class151 arg3, int arg4) {
        field2384++;
        if (this.field2372 != -1) {
            return class247.method1678((byte) -112, this.field2372).method68(arg2, arg4, arg3, arg1, (byte) 70);
        }
        long var6 = this.field2382;
        int[] var8 = this.field2369;
        if (arg0 != -5) {
            this.method1030(-74, (byte) 9, 15);
        }
        if (arg1 != null && (arg1.field2516 >= 0 || arg1.field2533 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field2369[var9];
            }
            if (arg1.field2516 >= 0) {
                if (arg1.field2516 == 65535) {
                    var8[5] = 0;
                    var6 ^= 0xFFFFFFFF00000000L;
                } else {
                    var8[5] = class82.method642(arg1.field2516, 1073741824);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg1.field2533 >= 0) {
                if (arg1.field2533 == 65535) {
                    var8[3] = 0;
                    var6 ^= 0xFFFFFFFFL;
                } else {
                    var8[3] = class82.method642(arg1.field2533, 1073741824);
                    var6 ^= (long) var8[3];
                }
            }
        }
        class65 var10 = (class65) class260.field4539.method1357((byte) -87, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var30 = var8[var12];
                if ((var30 & 0x40000000) == 0) {
                    if ((var30 & Integer.MIN_VALUE) != 0 && !class107.method762(3, var30 & 0x3FFFFFFF).method173(0)) {
                        var11 = true;
                    }
                } else if (!class219.method1508(var30 & 0x3FFFFFFF, (byte) -71).method1527((byte) -5, this.field2387)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field2371 != -1L) {
                    var10 = (class65) class260.field4539.method1357((byte) 58, this.field2371);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class178[] var13 = new class178[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var27 = var8[var15];
                    if ((var27 & 0x40000000) != 0) {
                        class178 var29 = class219.method1508(var27 & 0x3FFFFFFF, (byte) 127).method1539((byte) -115, this.field2387);
                        if (var29 != null) {
                            var13[var14++] = var29;
                        }
                    } else if ((var27 & Integer.MIN_VALUE) != 0) {
                        class178 var28 = class107.method762(arg0 + 8, var27 & 0x3FFFFFFF).method183(arg0 ^ 0x69);
                        if (var28 != null) {
                            var13[var14++] = var28;
                        }
                    }
                }
                int var16 = var8[0];
                if ((var16 & 0x40000000) != 0) {
                    class222 var17 = class219.method1508(var16 & 0x3FFFFFFF, (byte) 101);
                    if (var17.field3921 != null) {
                        for (int var18 = 0; var18 < var17.field3921.length; var18++) {
                            if (var17.field3921[var18] != null && var13[var18 + 1] != null) {
                                int var19 = var17.field3921[var18][0];
                                int var20 = var17.field3921[var18][2];
                                int var21 = var17.field3921[var18][1];
                                int var22 = var17.field3921[var18][3];
                                int var23 = var17.field3921[var18][5];
                                int var24 = var17.field3921[var18][4];
                                var13[var18 + 1].method1273(var19, var21, var20);
                                var13[var18 + 1].method1265(var22, var24, var23);
                            }
                        }
                    }
                }
                class178 var25 = new class178(var13, var14);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (class203.field3399[var26].length > this.field2390[var26]) {
                        var25.method1260(class205.field3428[var26], class203.field3399[var26][this.field2390[var26]]);
                    }
                    if (this.field2390[var26] < class3.field26[var26].length) {
                        var25.method1260(class154.field2563[var26], class3.field26[var26][this.field2390[var26]]);
                    }
                }
                var10 = var25.method1246(64, 850, -30, -50, -30);
                class260.field4539.method1351(var10, 2, var6);
                this.field2371 = var6;
            }
        }
        if (arg1 == null && arg3 == null) {
            return var10;
        }
        class65 var31;
        if (arg1 != null && arg3 != null) {
            var31 = arg1.method1083(var10, arg3, false, arg2, arg4);
        } else if (arg1 == null) {
            var31 = arg3.method1089((byte) 117, arg2, var10);
        } else {
            var31 = arg1.method1089((byte) 117, arg4, var10);
        }
        return var31;
    }
}
