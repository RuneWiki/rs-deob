import java.awt.Frame;
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

@OriginalClass("client!ad")
public class class268 {

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    private int field3581 = 0;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "[Lag;")
    public class445[] field3573;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public int field3567;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "J")
    public static long field3575 = 0L;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "Lmc;")
    public static class78 field3568 = new class78(41, 3);

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "[J")
    public static long[] field3579 = new long[256];

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "[I")
    public static int[] field3577 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "Lgd;")
    public static class206 field3582;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "J")
    private long field3569;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Lag;")
    private class445 field3565;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Lag;")
    private class445 field3578;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "Lcc;")
    public static class474 field3583;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3579[var0] = var1;
        }
        field3582 = new class206("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 6)
    public static void method1516(int arg0) {
        field3568 = null;
        field3577 = null;
        field3582 = null;
        field3583 = null;
        field3579 = null;
        int var1 = -121 / ((28 - arg0) / 62);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)Lag;", line = 21)
    public final class445 method1517(int arg0) {
        field3570++;
        if (this.field3581 > 0 && this.field3573[this.field3581 - 1] != this.field3578) {
            class445 var2 = this.field3578;
            this.field3578 = var2.field6046;
            return var2;
        }
        if (arg0 != -30942) {
            this.method1518((byte) 106);
        }
        while (this.field3567 > this.field3581) {
            class445 var3 = this.field3573[this.field3581++].field6046;
            if (this.field3573[this.field3581 - 1] != var3) {
                this.field3578 = var3.field6046;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)Lag;", line = 52)
    public final class445 method1518(byte arg0) {
        this.field3581 = 0;
        field3563++;
        if (arg0 > -41) {
            this.field3581 = 10;
        }
        return this.method1517(-30942);
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V", line = 70)
    public final void method1519(int arg0) {
        for (int var2 = 0; var2 < this.field3567; var2++) {
            class445 var3 = this.field3573[var2];
            while (true) {
                class445 var4 = var3.field6046;
                if (var3 == var4) {
                    break;
                }
                var4.method2614((byte) -77);
            }
        }
        field3562++;
        this.field3578 = null;
        if (arg0 == -16576) {
            this.field3565 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)Lag;", line = 102)
    public final class445 method1520(byte arg0) {
        if (arg0 <= 33) {
            method1523(123, 69, 30, (class241) null, -74, -76);
        }
        field3560++;
        if (this.field3565 == null) {
            return null;
        }
        class445 var2 = this.field3573[(int) ((long) (this.field3567 - 1) & this.field3569)];
        while (this.field3565 != var2) {
            if (this.field3565.field6047 == this.field3569) {
                class445 var3 = this.field3565;
                this.field3565 = this.field3565.field6046;
                return var3;
            }
            this.field3565 = this.field3565.field6046;
        }
        this.field3565 = null;
        return null;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)I", line = 135)
    public final int method1521(byte arg0) {
        field3574++;
        if (arg0 > -82) {
            return 58;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3567; var3++) {
            class445 var4 = this.field3573[var3];
            for (class445 var5 = var4.field6046; var5 != var4; var5 = var5.field6046) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([Lag;I)I", line = 167)
    public final int method1522(class445[] arg0, int arg1) {
        field3571++;
        int var3 = 0;
        for (int var4 = arg1; var4 < this.field3567; var4++) {
            class445 var5 = this.field3573[var4];
            for (class445 var6 = var5.field6046; var6 != var5; var6 = var6.field6046) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIILml;II)Ljava/awt/Frame;", line = 203)
    public static final Frame method1523(int arg0, int arg1, int arg2, class241 arg3, int arg4, int arg5) {
        field3561++;
        if (!arg3.method1347(arg1 - 25906)) {
            return null;
        }
        if (arg5 == 0) {
            class49[] var6 = class206.method1174(arg3, arg1 ^ 0x4361);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field651 == arg4 && var6[var8].field650 == arg0 && (arg2 == 0 || var6[var8].field648 == arg2) && (!var7 || arg5 < var6[var8].field653)) {
                    arg5 = var6[var8].field653;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class474 var9 = arg3.method1331(arg2, arg4, arg0, false, arg5);
        while (var9.field6534 == 0) {
            class374.method2298(-28114, 10L);
        }
        Frame var10 = (Frame) var9.field6529;
        if (var10 == null) {
            return null;
        } else if (var9.field6534 == 2) {
            class233.method1305(var10, arg1 ^ 0x4308, arg3);
            return null;
        } else {
            if (arg1 != 17187) {
                field3575 = -123L;
            }
            return var10;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(DI)V", line = 276)
    public static final void method1524(double arg0, int arg1) {
        if (class129.field1898 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class106.field1581[var3] = var4 > 255 ? 255 : var4;
            }
            class129.field1898 = arg0;
        }
        if (arg1 > -1) {
            field3584 = -73;
        }
        field3580++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLag;J)V", line = 308)
    public final void method1525(byte arg0, class445 arg1, long arg2) {
        if (arg0 != 19) {
            this.method1520((byte) -103);
        }
        field3572++;
        if (arg1.field6048 != null) {
            arg1.method2614((byte) -114);
        }
        class445 var5 = this.field3573[(int) ((long) (this.field3567 - 1) & arg2)];
        arg1.field6046 = var5;
        arg1.field6048 = var5.field6048;
        arg1.field6048.field6046 = arg1;
        arg1.field6047 = arg2;
        arg1.field6046.field6048 = arg1;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILqg;I)V", line = 328)
    public static final void method1526(int arg0, class296 arg1, int arg2) {
        field3564++;
        if (arg0 != 10) {
            method1524(0.06792562345279782D, -68);
        }
        while (true) {
            class79 var3 = (class79) class210.field2836.method652((byte) 37);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1059; var5++) {
                if (var3.field1061[var5] != null) {
                    if (var3.field1061[var5].field6534 == 2) {
                        var3.field1062[var5] = -5;
                    }
                    if (var3.field1061[var5].field6534 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1063[var5] != null) {
                    if (var3.field1063[var5].field6534 == 2) {
                        var3.field1062[var5] = -6;
                    }
                    if (var3.field1063[var5].field6534 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method1663(arg2, 111);
            arg1.method228(0, 32);
            int var6 = arg1.field456;
            arg1.method199((byte) -117, var3.field1066);
            for (int var7 = 0; var7 < var3.field1059; var7++) {
                if (var3.field1062[var7] == 0) {
                    try {
                        int var8 = var3.field1065[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field1061[var7].field6529;
                            int var10 = var9.getInt((Object) null);
                            arg1.method228(0, 32);
                            arg1.method199((byte) -117, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field1061[var7].field6529;
                            var11.setInt((Object) null, var3.field1064[var7]);
                            arg1.method228(0, 32);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field1061[var7].field6529;
                            int var13 = var12.getModifiers();
                            arg1.method228(0, 32);
                            arg1.method199((byte) -117, var13);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field1063[var7].field6529;
                            byte[][] var15 = var3.field1068[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg1.method228(0, arg0 + 22);
                            } else if (var19 instanceof Number) {
                                arg1.method228(1, 32);
                                arg1.method218(16439, ((Number) var19).longValue());
                            } else if (var19 instanceof String) {
                                arg1.method228(2, 32);
                                arg1.method208((String) var19, -103);
                            } else {
                                arg1.method228(4, 32);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field1063[var7].field6529;
                            int var21 = var20.getModifiers();
                            arg1.method228(0, 32);
                            arg1.method199((byte) -117, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method228(-10, 32);
                    } catch (InvalidClassException var23) {
                        arg1.method228(-11, 32);
                    } catch (StreamCorruptedException var24) {
                        arg1.method228(-12, arg0 + 22);
                    } catch (OptionalDataException var25) {
                        arg1.method228(-13, 32);
                    } catch (IllegalAccessException var26) {
                        arg1.method228(-14, arg0 + 22);
                    } catch (IllegalArgumentException var27) {
                        arg1.method228(-15, 32);
                    } catch (InvocationTargetException var28) {
                        arg1.method228(-16, 32);
                    } catch (SecurityException var29) {
                        arg1.method228(-17, 32);
                    } catch (IOException var30) {
                        arg1.method228(-18, 32);
                    } catch (NullPointerException var31) {
                        arg1.method228(-19, 32);
                    } catch (Exception var32) {
                        arg1.method228(-20, 32);
                    } catch (Throwable var33) {
                        arg1.method228(-21, 32);
                    }
                } else {
                    arg1.method228(var3.field1062[var7], 32);
                }
            }
            arg1.method188(var6, arg0 ^ 0x37);
            arg1.method247(true, arg1.field456 - var6);
            var3.method2614((byte) -92);
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)I", line = 518)
    public final int method1527(byte arg0) {
        if (arg0 > -100) {
            return 115;
        } else {
            field3566++;
            return this.field3567;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(I)V", line = 528)
    public class268(int arg0) {
        this.field3573 = new class445[arg0];
        this.field3567 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class445 var3 = this.field3573[var2] = new class445();
            var3.field6046 = var3;
            var3.field6048 = var3;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(JI)Lag;", line = 552)
    public final class445 method1528(long arg0, int arg1) {
        if (arg1 <= 51) {
            return null;
        }
        field3576++;
        this.field3569 = arg0;
        class445 var4 = this.field3573[(int) (arg0 & (long) (this.field3567 - 1))];
        for (this.field3565 = var4.field6046; this.field3565 != var4; this.field3565 = this.field3565.field6046) {
            if (this.field3565.field6047 == arg0) {
                class445 var5 = this.field3565;
                this.field3565 = this.field3565.field6046;
                return var5;
            }
        }
        this.field3565 = null;
        return null;
    }
}
