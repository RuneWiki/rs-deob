import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class25 extends class120 {

    @OriginalMember(owner = "client!lj", name = "ob", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "client!lj", name = "eb", descriptor = "[B")
    public byte[] field339;

    @OriginalMember(owner = "client!lj", name = "mb", descriptor = "[J")
    public static long[] field347 = new long[500];

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!lj", name = "W", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!lj", name = "X", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!lj", name = "Y", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!lj", name = "Z", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!lj", name = "ab", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!lj", name = "bb", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!lj", name = "cb", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!lj", name = "db", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!lj", name = "fb", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!lj", name = "gb", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!lj", name = "hb", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!lj", name = "ib", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!lj", name = "jb", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!lj", name = "kb", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!lj", name = "lb", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!lj", name = "nb", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!lj", name = "pb", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!lj", name = "qb", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!lj", name = "rb", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!lj", name = "sb", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!lj", name = "tb", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!lj", name = "ub", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!lj", name = "vb", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!lj", name = "wb", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!lj", name = "xb", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!lj", name = "yb", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!lj", name = "zb", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!lj", name = "Ab", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "[Lhc;")
    public static class229[] field309;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILob;I)V")
    public static final void method164(int arg0, class131 arg1, int arg2) {
        field296++;
        if (arg0 != -31290) {
            method164(118, (class131) null, -54);
        }
        while (true) {
            class77 var3 = (class77) class105.field1612.method350(8240);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1081; var5++) {
                if (var3.field1083[var5] != null) {
                    if (var3.field1083[var5].field3247 == 2) {
                        var3.field1082[var5] = -5;
                    }
                    if (var3.field1083[var5].field3247 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1094[var5] != null) {
                    if (var3.field1094[var5].field3247 == 2) {
                        var3.field1082[var5] = -6;
                    }
                    if (var3.field1094[var5].field3247 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method892(arg2, (byte) -69);
            arg1.method184(0, 111);
            int var6 = arg1.field349;
            arg1.method166(var3.field1084, -3);
            for (int var7 = 0; var7 < var3.field1081; var7++) {
                if (var3.field1082[var7] == 0) {
                    try {
                        int var8 = var3.field1087[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field1083[var7].field3249;
                            int var10 = var9.getInt((Object) null);
                            arg1.method184(0, 125);
                            arg1.method166(var10, -3);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field1083[var7].field3249;
                            var11.setInt((Object) null, var3.field1090[var7]);
                            arg1.method184(0, 88);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field1083[var7].field3249;
                            int var13 = var12.getModifiers();
                            arg1.method184(0, 105);
                            arg1.method166(var13, -3);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field1094[var7].field3249;
                            byte[][] var17 = var3.field1088[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg1.method184(0, arg0 + 31382);
                            } else if (var21 instanceof Number) {
                                arg1.method184(1, arg0 ^ 0xFFFF8593);
                                arg1.method206(arg0 ^ 0x69FD, ((Number) var21).longValue());
                            } else if ((var21 instanceof String)) {
                                arg1.method184(2, 87);
                                arg1.method199(0, (String) var21);
                            } else {
                                arg1.method184(4, 115);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field1094[var7].field3249;
                            int var15 = var14.getModifiers();
                            arg1.method184(0, 107);
                            arg1.method166(var15, -3);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method184(-10, 85);
                    } catch (InvalidClassException var23) {
                        arg1.method184(-11, 127);
                    } catch (StreamCorruptedException var24) {
                        arg1.method184(-12, 102);
                    } catch (OptionalDataException var25) {
                        arg1.method184(-13, 101);
                    } catch (IllegalAccessException var26) {
                        arg1.method184(-14, 121);
                    } catch (IllegalArgumentException var27) {
                        arg1.method184(-15, 85);
                    } catch (InvocationTargetException var28) {
                        arg1.method184(-16, arg0 ^ -31310);
                    } catch (SecurityException var29) {
                        arg1.method184(-17, 99);
                    } catch (IOException var30) {
                        arg1.method184(-18, arg0 + 31386);
                    } catch (NullPointerException var31) {
                        arg1.method184(-19, 102);
                    } catch (Exception var32) {
                        arg1.method184(-20, 108);
                    } catch (Throwable var33) {
                        arg1.method184(-21, 108);
                    }
                } else {
                    arg1.method184(var3.field1082[var7], 87);
                }
            }
            arg1.method181(var6, arg0 + 31293);
            arg1.method211(arg0 + 31288, -var6 + arg1.field349);
            var3.method784(false);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
    public final void method165(BigInteger arg0, byte arg1, BigInteger arg2) {
        field301++;
        int var4 = this.field349;
        byte[] var5 = new byte[var4];
        this.field349 = 0;
        this.method185(0, var5, var4, -125);
        BigInteger var6 = new BigInteger(var5);
        if (arg1 < 83) {
            field309 = null;
        }
        BigInteger var7 = var6.modPow(arg2, arg0);
        byte[] var8 = var7.toByteArray();
        this.field349 = 0;
        this.method184(var8.length, 107);
        this.method213(0, var8, var8.length, -127);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)V")
    public final void method166(int arg0, int arg1) {
        if (arg1 != -3) {
            field309 = null;
        }
        this.field339[this.field349++] = (byte) (arg0 >> 24);
        field322++;
        this.field339[this.field349++] = (byte) (arg0 >> 16);
        this.field339[this.field349++] = (byte) (arg0 >> 8);
        this.field339[this.field349++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(II)V")
    public final void method167(int arg0, int arg1) {
        field328++;
        this.field339[this.field349++] = (byte) (arg0 >> 16);
        this.field339[this.field349++] = (byte) (arg0 >> 24);
        if (arg1 != -1246958456) {
            this.field339 = null;
        }
        this.field339[this.field349++] = (byte) arg0;
        this.field339[this.field349++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)I")
    public final int method168(int arg0) {
        field297++;
        int var2 = this.field339[this.field349] & 0xFF;
        if (arg0 >= -10) {
            this.method165((BigInteger) null, (byte) -26, (BigInteger) null);
        }
        return var2 >= 128 ? this.method190(-3) - 49152 : this.method201(255) + -64;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V")
    public static final void method169(int arg0) {
        field317++;
        class177.method1237((byte) 79);
        class115.method766(74);
        class194.method1349((byte) 120);
        class51.method375(-10304);
        class231.method1580(true);
        class164.method1129(-1597295167);
        class62.method430(1424);
        class17.method119(-125);
        class280.method1875((byte) -119);
        class223.method1522(-40);
        class178.method1242(false);
        class87.method598(0);
        class126.method853(2745);
        class176.method1228(-1);
        class280.method1873(112);
        class187.method1298(0);
        if (class165.field2562 != 0) {
            for (int var1 = 0; var1 < class40.field551.length; var1++) {
                class40.field551[var1] = null;
            }
            class172.field2692 = 0;
        }
        class277.method1860(0);
        class82.method562(-94);
        class99.field1545.method1420(-1);
        ((class144) class171.field2689).method960((byte) -105);
        class68.field953.method767(18345);
        class13.field179.method824(0);
        class118.field1738.method824(0);
        class170.field2668.method824(0);
        class49.field633.method824(0);
        class102.field1582.method824(0);
        class98.field1509.method824(0);
        if (arg0 <= 22) {
            method176(-49);
        }
        class282.field4462.method824(0);
        class237.field3802.method824(0);
        class16.field186.method824(0);
        class261.field4209.method824(0);
        class63.field892.method824(0);
        class37.field484.method1420(-1);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BI)V")
    public final void method170(byte arg0, int arg1) {
        field323++;
        if (arg1 >= 0 && arg1 < 128) {
            this.method184(arg1, 105);
            return;
        }
        if (arg0 != 77) {
            this.field349 = 83;
        }
        if (arg1 < 0 || arg1 >= 32768) {
            throw new IllegalArgumentException();
        }
        this.method223(arg0 - 1720191365, arg1 + 32768);
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)I")
    public final int method171(int arg0) {
        field300++;
        if (arg0 == -1) {
            this.field349 += 2;
            return ((this.field339[this.field349 - 2] & 0xFF) << 8) + (this.field339[this.field349 - 1] - 128 & 0xFF);
        } else {
            return -7;
        }
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)I")
    public final int method172(int arg0) {
        this.field349 += 2;
        field355++;
        int var2 = (this.field339[this.field349 - 2] & 0xFF << 8) + (this.field339[this.field349 - 1] - 128 & 0xFF);
        int var3 = -65 / ((arg0 - 65) / 55);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)I")
    public final int method173(byte arg0) {
        if (arg0 != 44) {
            this.field339 = null;
        }
        field335++;
        return 128 - this.field339[this.field349++] & 0xFF;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(II)V")
    public final void method174(int arg0, int arg1) {
        this.field339[this.field349++] = (byte) (arg1 >> 16);
        if (arg0 != 19954) {
            field345 = -111;
        }
        field341++;
        this.field339[this.field349++] = (byte) (arg1 >> 8);
        this.field339[this.field349++] = (byte) arg1;
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(I)I")
    public final int method175(int arg0) {
        field330++;
        return arg0 < 78 ? -52 : this.field339[this.field349++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "(I)V")
    public static void method176(int arg0) {
        field309 = null;
        field347 = null;
        if (arg0 != -65) {
            field345 = 77;
        }
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(II)V")
    public final void method177(int arg0, int arg1) {
        field344++;
        this.field339[this.field349 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field339[this.field349 - arg0 - 3] = (byte) (arg0 >> 16);
        if (arg1 != 26391) {
            this.method209(50);
        }
        this.field339[this.field349 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field339[this.field349 - arg0 - 1] = (byte) arg0;
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(II)V")
    public final void method178(int arg0, int arg1) {
        field337++;
        this.field339[this.field349++] = (byte) (arg0 + arg1);
        this.field339[this.field349++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)Ljava/lang/String;")
    public final String method179(byte arg0) {
        field303++;
        if (this.field339[this.field349] == 0) {
            this.field349++;
            return null;
        } else if (arg0 == 12) {
            return this.method189(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(Z)I")
    public final int method180(boolean arg0) {
        byte var2 = this.field339[this.field349++];
        int var3 = 0;
        field352++;
        while (var2 < 0) {
            var3 = (var2 & 0x7F | var3) << 7;
            var2 = this.field339[this.field349++];
        }
        if (arg0) {
            this.field349 = -10;
        }
        return var2 | var3;
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(II)I")
    public final int method181(int arg0, int arg1) {
        int var3 = -122 % ((84 - arg1) / 40);
        field325++;
        int var4 = class135.method915(this.field349, -125, arg0, this.field339);
        this.method166(var4, -3);
        return var4;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B[I)V")
    public final void method182(byte arg0, int[] arg1) {
        field327++;
        if (arg0 != -89) {
            return;
        }
        int var3 = this.field349 / 8;
        this.field349 = 0;
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6 = this.method214((byte) 44);
            int var7 = this.method214((byte) 44);
            int var8 = -1640531527;
            int var9 = 32;
            while ((var9--) > 0) {
                var6 += (var7 << 4 ^ var7 >>> 5) + var7 ^ var5 - -arg1[var5 & 0x3];
                var5 += var8;
                var7 += var5 + arg1[var5 >>> 11 & 0x42A00003] ^ (var6 >>> 5 ^ var6 << 4) + var6;
            }
            this.field349 -= 8;
            this.method166(var6, -3);
            this.method166(var7, -3);
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(BI)V")
    public final void method183(byte arg0, int arg1) {
        this.field339[this.field349++] = (byte) (arg1 + 128);
        field343++;
        if (arg0 > -109) {
            field309 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "(II)V")
    public final void method184(int arg0, int arg1) {
        this.field339[this.field349++] = (byte) arg0;
        if (arg1 < 81) {
            this.method165((BigInteger) null, (byte) 105, (BigInteger) null);
        }
        field329++;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I[BII)V")
    public final void method185(int arg0, byte[] arg1, int arg2, int arg3) {
        field312++;
        for (int var5 = arg0; var5 < (arg0 + arg2); var5++) {
            arg1[var5] = this.field339[this.field349++];
        }
        if (arg3 > -18) {
            this.method203(1, 36, -50, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BJI)V")
    public final void method186(byte arg0, long arg1, int arg2) {
        int var6 = arg2 - 1;
        field319++;
        if (var6 < 0 || var6 > 7) {
            throw new IllegalArgumentException();
        }
        int var5 = var6 * 8;
        if (arg0 < 23) {
            this.method204(false);
        }
        while (var5 >= 0) {
            this.field339[this.field349++] = (byte) ((int) (arg1 >> var5));
            var5 -= 8;
        }
    }

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "(II)V")
    public final void method187(int arg0, int arg1) {
        field358++;
        if ((arg1 & 0xFFFFFF80) != 0) {
            if ((arg1 & 0xFFFFC000) != 0) {
                if ((arg1 & 0xFFE00000) != 0) {
                    if ((arg1 & 0xF0000000) != 0) {
                        this.method184(arg1 >>> 28 | 0x80, 98);
                    }
                    this.method184(arg1 >>> 21 | 0x80, 108);
                }
                this.method184(arg1 >>> 14 | 0x80, 121);
            }
            this.method184((arg1 | 0x4020) >>> 7, 92);
        }
        int var3 = 102 % ((arg0 - 18) / 61);
        this.method184(arg1 & 0x7F, 120);
    }

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "(I)B")
    public final byte method188(int arg0) {
        int var2 = -31 / ((-arg0 - 41) / 56);
        field354++;
        return this.field339[this.field349++];
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(Z)Ljava/lang/String;")
    public final String method189(boolean arg0) {
        field342++;
        if (arg0) {
            this.field349 = 87;
        }
        int var2 = this.field349;
        while (this.field339[this.field349++] != 0) {
        }
        return class6.method32(false, this.field349 - var2 - 1, var2, this.field339);
    }

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "(I)I")
    public final int method190(int arg0) {
        this.field349 += 2;
        if (arg0 == -3) {
            field333++;
            return ((this.field339[this.field349 - 2] & 0xFF) << 8) + (this.field339[this.field349 - 1] & 0xFF);
        } else {
            return 54;
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)I")
    public final int method191(byte arg0) {
        this.field349 += 4;
        if (arg0 != 66) {
            this.field349 = 54;
        }
        field360++;
        return ((this.field339[this.field349 - 1] & 0xFF) << 16) + ((this.field339[this.field349 - 2] & 0xFF) << 24) - (-((this.field339[this.field349 - 4] & 0xFF) << 8) - (this.field339[this.field349 + -3] & 0xFF));
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(B)I")
    public final int method192(byte arg0) {
        if (arg0 != -20) {
            method176(-35);
        }
        int var2 = this.field339[this.field349] & 0xFF;
        field316++;
        return var2 >= 128 ? this.method190(-3) - 32768 : this.method201(255);
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(BI)V")
    public final void method193(byte arg0, int arg1) {
        field318++;
        this.field339[this.field349++] = (byte) arg1;
        this.field339[this.field349++] = (byte) (arg1 >> 8);
        int var3 = -4 / ((arg0 - 32) / 59);
    }

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "(I)I")
    public final int method194(int arg0) {
        field295++;
        this.field349 += 4;
        if (arg0 <= 115) {
            this.method220(83);
        }
        return (this.field339[this.field349 - 4] & 0xFF) + ((this.field339[this.field349 - 3] & 0xFF) << 8) + (((this.field339[this.field349 + -1] & 0xFF) << 24) - -((this.field339[this.field349 + -2] & 0xFF) << 16));
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III[I)V")
    public final void method195(int arg0, int arg1, int arg2, int[] arg3) {
        field315++;
        if (arg2 != -13) {
            field340 = -97;
        }
        int var5 = this.field349;
        this.field349 = arg1;
        int var6 = (arg0 - arg1) / 8;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = this.method214((byte) 44);
            int var9 = this.method214((byte) 44);
            int var10 = -957401312;
            int var11 = -1640531527;
            int var12 = 32;
            while (var12-- > 0) {
                var9 -= (var8 >>> 5 ^ var8 << 4) + var8 ^ arg3[(var10 & 0x1B33) >>> 11] + var10;
                var10 -= var11;
                var8 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ arg3[var10 & 0x3] + var10;
            }
            this.field349 -= 8;
            this.method166(var8, -3);
            this.method166(var9, -3);
        }
        this.field349 = var5;
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(B)I")
    public final int method196(byte arg0) {
        int var2 = 61 / ((-arg0 - 12) / 61);
        this.field349 += 3;
        field336++;
        return (this.field339[this.field349 - 2] & 0xFF << 8) + (((this.field339[this.field349 - 1] & 0xFF) << 16) + (this.field339[this.field349 - 3] & 0xFF));
    }

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "(I)I")
    public final int method197(int arg0) {
        if (arg0 != 128) {
            field345 = 12;
        }
        field334++;
        return -this.field339[this.field349++] & 0xFF;
    }

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "(I)I")
    public final int method198(int arg0) {
        if (arg0 == 3) {
            this.field349 += 2;
            field311++;
            return ((this.field339[this.field349 - 1] & 0xFF) << 8) + (this.field339[this.field349 - 2] & 0xFF);
        } else {
            return -10;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method199(int arg0, String arg1) {
        field326++;
        int var3 = arg1.indexOf(0);
        if (var3 >= 0) {
            throw new IllegalArgumentException("NUL character at " + var3 + " - cannot pjstr");
        }
        this.field349 += class250.method1684((byte) -119, arg0, arg1, this.field349, arg1.length(), this.field339);
        this.field339[this.field349++] = 0;
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(B)I")
    public final int method200(byte arg0) {
        if (arg0 == -83) {
            field321++;
            this.field349 += 2;
            return (this.field339[this.field349 - 1] & 0xFF << 8) + (this.field339[this.field349 - 2] - 128 & 0xFF);
        } else {
            return 30;
        }
    }

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "(I)I")
    public final int method201(int arg0) {
        field351++;
        return arg0 == 255 ? this.field339[this.field349++] & 0xFF : 37;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BJ)V")
    public final void method202(byte arg0, long arg1) {
        field302++;
        this.method210((int) (arg1 >> 32), (byte) 72);
        if (arg0 != -95) {
            this.method207(-110);
        }
        this.method210((int) arg1, (byte) 72);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III[B)V")
    public final void method203(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg2 != 255) {
            field340 = -78;
        }
        field294++;
        for (int var5 = arg0 + arg1 - 1; var5 >= arg1; var5--) {
            arg3[var5] = this.field339[this.field349++];
        }
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(Z)B")
    public final byte method204(boolean arg0) {
        if (!arg0) {
            this.method195(-86, -74, 101, (int[]) null);
        }
        field332++;
        return (byte) (128 - this.field339[this.field349++]);
    }

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "(II)J")
    public final long method205(int arg0, int arg1) {
        field314++;
        int var3 = 2 % ((arg1 - 88) / 37);
        int var7 = arg0 - 1;
        if (var7 < 0 || var7 > 7) {
            throw new IllegalArgumentException();
        }
        int var4 = var7 * 8;
        long var5 = 0L;
        while (var4 >= 0) {
            var5 |= ((long) this.field339[this.field349++] & 0xFFL) << var4;
            var4 -= 8;
        }
        return var5;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IJ)V")
    public final void method206(int arg0, long arg1) {
        this.field339[this.field349++] = (byte) ((int) (arg1 >> 56));
        field308++;
        this.field339[this.field349++] = (byte) ((int) (arg1 >> 48));
        if (arg0 != -5061) {
            field345 = -86;
        }
        this.field339[this.field349++] = (byte) ((int) (arg1 >> 40));
        this.field339[this.field349++] = (byte) ((int) (arg1 >> 32));
        this.field339[this.field349++] = (byte) ((int) (arg1 >> 24));
        this.field339[this.field349++] = (byte) ((int) (arg1 >> 16));
        this.field339[this.field349++] = (byte) ((int) (arg1 >> 8));
        this.field339[this.field349++] = (byte) ((int) arg1);
    }

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "(I)B")
    public final byte method207(int arg0) {
        if (arg0 != -128) {
            field347 = null;
        }
        field320++;
        return (byte) (this.field339[this.field349++] - 128);
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(Z)Ljava/lang/String;")
    public final String method208(boolean arg0) {
        if (arg0) {
            this.method221(91, -68);
        }
        byte var2 = this.field339[this.field349++];
        field357++;
        if (var2 != 0) {
            throw new IllegalStateException("Bad version number in gjstr2");
        }
        int var3 = this.field349;
        while (this.field339[this.field349++] != 0) {
        }
        return class6.method32(false, this.field349 - var3 - 1, var3, this.field339);
    }

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "(I)I")
    public final int method209(int arg0) {
        field304++;
        int var2 = 0;
        if (arg0 != -2073973340) {
            this.method185(-2, (byte[]) null, -10, 34);
        }
        int var3 = this.method192((byte) -20);
        while (var3 == 32767) {
            var3 = this.method192((byte) -20);
            var2 += 32767;
        }
        return var2 + var3;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)V")
    public final void method210(int arg0, byte arg1) {
        field305++;
        this.field339[this.field349++] = (byte) arg0;
        this.field339[this.field349++] = (byte) (arg0 >> 8);
        if (arg1 != 72) {
            this.method174(-112, 44);
        }
        this.field339[this.field349++] = (byte) (arg0 >> 16);
        this.field339[this.field349++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "(II)V")
    public final void method211(int arg0, int arg1) {
        if (arg0 != -2) {
            this.field349 = -23;
        }
        this.field339[this.field349 - arg1 - 1] = (byte) arg1;
        field310++;
    }

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "(II)V")
    public final void method212(int arg0, int arg1) {
        if (arg0 >= -55) {
            field347 = null;
        }
        this.field339[this.field349++] = (byte) (-arg1);
        field306++;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(I)V")
    public class25(int arg0) {
        this.field349 = 0;
        this.field339 = class125.method851(-61, arg0);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I[BII)V")
    public final void method213(int arg0, byte[] arg1, int arg2, int arg3) {
        for (int var5 = arg0; var5 < (arg0 + arg2); var5++) {
            this.field339[this.field349++] = arg1[var5];
        }
        if (arg3 >= -126) {
            this.field349 = -84;
        }
        field324++;
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(B)I")
    public final int method214(byte arg0) {
        this.field349 += 4;
        if (arg0 != 44) {
            this.method194(16);
        }
        field353++;
        return ((this.field339[this.field349 - 2] & 0xFF) << 8) + (this.field339[this.field349 - 1] & 0xFF) + (this.field339[this.field349 + -3] & 0xFF << 16) + (this.field339[this.field349 + -4] & 0xFF << 24);
    }

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "(B)I")
    public final int method215(byte arg0) {
        this.field349 += 3;
        if (arg0 <= 91) {
            method164(-119, (class131) null, -13);
        }
        field299++;
        return ((this.field339[this.field349 - 3] & 0xFF) << 16) + (this.field339[this.field349 - 2] & 0xFF << 8) + (this.field339[this.field349 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "(B)B")
    public final byte method216(byte arg0) {
        if (arg0 == 41) {
            field356++;
            return (byte) (-this.field339[this.field349++]);
        } else {
            return 22;
        }
    }

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "(I)I")
    public final int method217(int arg0) {
        field338++;
        this.field349 += 2;
        int var2 = ((this.field339[this.field349 - 1] & 0xFF) << 8) + (this.field339[this.field349 + arg0] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "(I)J")
    public final long method218(int arg0) {
        field348++;
        if (arg0 != 1728901472) {
            method224(-111, -52);
        }
        long var2 = (long) this.method214((byte) 44) & 0xFFFFFFFFL;
        long var4 = (long) this.method214((byte) 44) & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "(B)V")
    public static final void method219(byte arg0) {
        if (class242.field3880 != -1) {
            class66.method452(class242.field3880, arg0 - 45);
        }
        for (int var1 = 0; var1 < class146.field2154; var1++) {
            if (class110.field1675[var1]) {
                class80.field1162[var1] = true;
            }
            class236.field3788[var1] = class110.field1675[var1];
            class110.field1675[var1] = false;
        }
        class194.field3056 = null;
        class57.field811 = class111.field1684;
        class262.field4225 = -1;
        class73.field1037 = -1;
        if (arg0 != -44) {
            method164(108, (class131) null, 118);
        }
        field346++;
        if (class242.field3880 != -1) {
            class146.field2154 = 0;
            class287.method1913((byte) -47);
        }
        class127.method875();
        class80.field1166 = 0;
    }

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "(I)Z")
    public final boolean method220(int arg0) {
        if (arg0 < 93) {
            this.method200((byte) -7);
        }
        field307++;
        this.field349 -= 4;
        int var2 = class135.method915(this.field349, -123, 0, this.field339);
        int var3 = this.method214((byte) 44);
        return var2 == var3;
    }

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "(II)V")
    public final void method221(int arg0, int arg1) {
        this.field339[this.field349++] = (byte) (arg1 >> 8);
        this.field339[this.field349++] = (byte) (arg1 + 128);
        field313++;
        if (arg0 != 0) {
            this.method220(108);
        }
    }

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "(II)V")
    public final void method222(int arg0, int arg1) {
        field359++;
        this.field339[this.field349++] = (byte) (arg0 >> 8);
        this.field339[this.field349++] = (byte) arg0;
        this.field339[this.field349++] = (byte) (arg0 >> 24);
        this.field339[this.field349++] = (byte) (arg0 >> 16);
        if (arg1 != 15786) {
            field347 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "(II)V")
    public final void method223(int arg0, int arg1) {
        field298++;
        this.field339[this.field349++] = (byte) (arg1 >> 8);
        if (arg0 != -1720191288) {
            field347 = null;
        }
        this.field339[this.field349++] = (byte) arg1;
    }

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "(II)Ltg;")
    public static final class181 method224(int arg0, int arg1) {
        field331++;
        class181 var2 = (class181) class136.field1985.method1428((long) arg0, (byte) -115);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class215.field3503.method807((byte) 80, class190.method1337(arg0, false), class63.method439(arg1 ^ 0x6733, arg0));
        class181 var4 = new class181();
        var4.field2872 = arg0;
        if (arg1 != 0) {
            field347 = null;
        }
        if (var3 != null) {
            var4.method1263(arg1, new class25(var3));
        }
        var4.method1257(-11);
        if (var4.field2819) {
            var4.field2834 = 0;
            var4.field2845 = false;
        }
        if (!class97.field1495 && var4.field2874) {
            var4.field2861 = null;
        }
        class136.field1985.method1424((long) arg0, var4, -2003648287);
        return var4;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "([B)V")
    public class25(byte[] arg0) {
        this.field339 = arg0;
        this.field349 = 0;
    }

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "(I)I")
    public final int method225(int arg0) {
        if (arg0 != -16777216) {
            this.method177(35, 107);
        }
        field361++;
        this.field349 += 4;
        return ((this.field339[this.field349 - 1] & 0xFF) << 8) + ((this.field339[this.field349 - 3] & 0xFF << 24) + (this.field339[this.field349 - 4] & 0xFF << 16) + (this.field339[this.field349 + -2] & 0xFF));
    }

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "(I)I")
    public final int method226(int arg0) {
        field350++;
        this.field349 += 2;
        int var2 = ((arg0 & this.field339[this.field349 - 2]) << 8) + (this.field339[this.field349 - 1] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }
}
