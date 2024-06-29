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

@OriginalClass("client!an")
public class class3 extends class64 {

    @OriginalMember(owner = "client!an", name = "I", descriptor = "I")
    private int field30 = 0;

    @OriginalMember(owner = "client!an", name = "s", descriptor = "I")
    private int field15 = -1;

    @OriginalMember(owner = "client!an", name = "w", descriptor = "Z")
    public boolean field19 = false;

    @OriginalMember(owner = "client!an", name = "B", descriptor = "I")
    private int field24 = 0;

    @OriginalMember(owner = "client!an", name = "K", descriptor = "Z")
    private boolean field32 = false;

    @OriginalMember(owner = "client!an", name = "L", descriptor = "I")
    private int field33 = -32768;

    @OriginalMember(owner = "client!an", name = "z", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "client!an", name = "N", descriptor = "I")
    public int field35;

    @OriginalMember(owner = "client!an", name = "M", descriptor = "I")
    public int field34;

    @OriginalMember(owner = "client!an", name = "E", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "client!an", name = "J", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "client!an", name = "P", descriptor = "I")
    private int field37;

    @OriginalMember(owner = "client!an", name = "V", descriptor = "Lbg;")
    private class93 field43;

    @OriginalMember(owner = "client!an", name = "Q", descriptor = "Z")
    public static boolean field38 = false;

    @OriginalMember(owner = "client!an", name = "T", descriptor = "J")
    public static long field41 = 0L;

    @OriginalMember(owner = "client!an", name = "r", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!an", name = "v", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!an", name = "x", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!an", name = "y", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!an", name = "A", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!an", name = "D", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!an", name = "F", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!an", name = "H", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!an", name = "O", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!an", name = "R", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!an", name = "S", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!an", name = "u", descriptor = "Lrn;")
    public static class18 field17;

    @OriginalMember(owner = "client!an", name = "U", descriptor = "Lem;")
    private class273 field42;

    @OriginalMember(owner = "client!an", name = "G", descriptor = "[S")
    public static short[] field28;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(III)I", line = 13)
    public static final int method20(int arg0, int arg1, int arg2) {
        field40++;
        int var3 = arg2 + (arg1 * 57);
        int var4 = var3 ^ var3 << 13;
        if (arg0 == -15338) {
            int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
            return var5 >> 19 & 0xFF;
        } else {
            return -52;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "()I", line = 33)
    public final int method21() {
        field36++;
        return this.field33;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZLhm;)V", line = 42)
    private final void method22(boolean arg0, class52 arg1) {
        if (class240.field3737) {
            class56 var3 = (class56) arg1;
            if ((this.field42 == null || this.field42.field4205) && (var3.field851 != null || var3.field826 != null)) {
                this.field42 = new class273(class360.field5718, 1, 1);
            }
            if (this.field42 != null) {
                this.field42.method2010(var3.field851, var3.field826, false, var3.field844, var3.field857, var3.field842);
            }
        } else {
            class124 var4 = (class124) arg1;
            if ((this.field42 == null || this.field42.field4205) && (var4.field2012 != null || var4.field1999 != null)) {
                this.field42 = new class273(class360.field5718, 1, 1);
            }
            if (this.field42 != null) {
                this.field42.method2010(var4.field2012, var4.field1999, false, var4.field2003, var4.field1984, var4.field2023);
            }
        }
        this.field32 = true;
        if (arg0) {
            this.field19 = false;
        }
        field18++;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BD)V", line = 79)
    public static final void method23(byte arg0, double arg1) {
        field39++;
        if (arg0 != 126 || class81.field1186 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
            class51.field787[var3] = var4 > 255 ? 255 : var4;
        }
        class81.field1186 = arg1;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II)V", line = 109)
    public static final void method24(int arg0, int arg1) {
        class332.field5095.method649((byte) 75, arg1);
        field20++;
        class280.field4315.method649((byte) 75, arg1);
        if (arg0 != -2) {
            method20(50, 97, -48);
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)Lhm;", line = 123)
    private final class52 method25(int arg0) {
        field29++;
        class281 var2 = class292.method2110(this.field37, (byte) 67);
        if (arg0 != -14) {
            this.field34 = -77;
        }
        class52 var3;
        if (this.field19) {
            var3 = var2.method2050(-1, -1, (byte) -127, 0);
        } else {
            var3 = var2.method2050(this.field30, this.field15, (byte) -127, this.field24);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(IIIIIII)V", line = 604)
    public class3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field22 = arg3;
        this.field35 = arg5 + arg6;
        this.field34 = arg4;
        this.field26 = arg1;
        this.field31 = arg2;
        this.field37 = arg0;
        int var8 = class292.method2110(this.field37, (byte) 115).field4343;
        if (var8 == -1) {
            this.field19 = true;
        } else {
            this.field19 = false;
            this.field43 = class126.method1091((byte) 51, var8);
        }
        if (this.field35 == arg6) {
            class335.method2358(this.field31, this.field30, this.field43, false, this.field22, true);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIILnn;)V", line = 154)
    public static final void method26(int arg0, int arg1, int arg2, int arg3, class130 arg4) {
        field16++;
        if (class66.field1006 >= 400) {
            return;
        }
        if (arg4.field2149 != null) {
            arg4 = arg4.method1120((byte) -124);
        }
        if (arg4 == null || !arg4.field2205) {
            return;
        }
        String var5 = arg4.field2156;
        if (arg4.field2197 != 0) {
            String var6 = class165.field2629 == 1 ? class280.field4322 : class311.field4840;
            var5 = var5 + class253.method1882(class173.field2746.field2722, arg4.field2197, false) + " (" + var6 + arg4.field2197 + ")";
        }
        if (class78.field1136 == 1) {
            class234.field3650++;
            class268.method1963((short) 1, class352.field5626 + " -> <col=ffff00>" + var5, arg0, class221.field3440, class143.field2350, (long) arg1, -25900, arg2);
        } else if (class210.field3237) {
            class140 var7 = class285.field4432 == -1 ? null : class29.method331(class285.field4432, (byte) 3);
            if ((class209.field3214 & 0x2) != 0 && (var7 == null || arg4.method1117(-21354, var7.field2334, class285.field4432) != var7.field2334)) {
                class268.method1963((short) 37, class83.field1203 + " -> <col=ffff00>" + var5, arg0, class281.field4355, class202.field3130, (long) arg1, -25900, arg2);
                class120.field1863++;
            }
        } else {
            class316.field4873++;
            String[] var8 = arg4.field2155;
            if (class158.field2533) {
                var8 = class15.method165(var8, arg3 + 15000);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class165.field2629 != 0 || !var8[var9].equalsIgnoreCase(class203.field3147))) {
                        int var10 = -1;
                        if (arg4.field2161 == var9) {
                            var10 = arg4.field2194;
                        }
                        byte var11 = 0;
                        if (var9 == 0) {
                            var11 = 6;
                        }
                        if (var9 == 1) {
                            var11 = 31;
                        }
                        class250.field3864++;
                        if (arg4.field2206 == var9) {
                            var10 = arg4.field2164;
                        }
                        if (var9 == 2) {
                            var11 = 30;
                        }
                        if (var9 == 3) {
                            var11 = 59;
                        }
                        if (var9 == 4) {
                            var11 = 10;
                        }
                        class268.method1963(var11, "<col=ffff00>" + var5, arg0, var10, var8[var9], (long) arg1, -25900, arg2);
                    }
                }
            }
            if (class165.field2629 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class203.field3147)) {
                        class355.field5650++;
                        short var13 = 0;
                        short var14 = 0;
                        if (var12 == 0) {
                            var14 = 6;
                        }
                        if (var12 == 1) {
                            var14 = 31;
                        }
                        if (class173.field2746.field2722 < arg4.field2197) {
                            var13 = 2000;
                        }
                        if (var12 == 2) {
                            var14 = 30;
                        }
                        if (var12 == 3) {
                            var14 = 59;
                        }
                        if (var12 == 4) {
                            var14 = 10;
                        }
                        if (var14 != 0) {
                            var14 += var13;
                        }
                        class268.method1963(var14, "<col=ffff00>" + var5, arg0, arg4.field2184, var8[var12], (long) arg1, -25900, arg2);
                    }
                }
            }
            class268.method1963((short) 1006, "<col=ffff00>" + var5, arg0, class329.field5057, class171.field2729, (long) arg1, arg3 ^ 0xFFFF9AD4, arg2);
        }
        if (arg3 != 0) {
            field17 = (class18) null;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIIIIIJILem;)V", line = 313)
    public final void method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class273 arg10) {
        field14++;
        class52 var13 = this.method25(-14);
        if (var13 != null) {
            this.method22(false, var13);
            var13.method27(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field42);
            this.field33 = var13.method21();
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IB)V", line = 332)
    public final void method28(int arg0, byte arg1) {
        if (arg1 != 24) {
            return;
        }
        field25++;
        if (this.field19) {
            return;
        }
        this.field24 += arg0;
        while (this.field24 > this.field43.field1429[this.field30]) {
            this.field24 -= this.field43.field1429[this.field30];
            this.field30++;
            if (this.field30 >= this.field43.field1428.length) {
                this.field19 = true;
                break;
            }
        }
        if (!this.field19) {
            class335.method2358(this.field31, this.field30, this.field43, false, this.field22, true);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V", line = 362)
    public static void method29(byte arg0) {
        field28 = null;
        field17 = null;
        if (arg0 >= -22) {
            method30((class18) null, (class18) null, -14);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lrn;Lrn;I)V", line = 384)
    public static final void method30(class18 arg0, class18 arg1, int arg2) {
        class64.field990 = arg1;
        if (arg2 > 55) {
            class309.field4778 = arg0;
            field21++;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lrc;BI)V", line = 410)
    public static final void method31(class217 arg0, byte arg1, int arg2) {
        field27++;
        int var3 = -67 % ((arg1 - 11) / 52);
        while (true) {
            class34 var4 = (class34) class294.field4575.method2244((byte) -127);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field525; var6++) {
                if (var4.field516[var6] != null) {
                    if (var4.field516[var6].field1447 == 2) {
                        var4.field527[var6] = -5;
                    }
                    if (var4.field516[var6].field1447 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field530[var6] != null) {
                    if (var4.field530[var6].field1447 == 2) {
                        var4.field527[var6] = -6;
                    }
                    if (var4.field530[var6].field1447 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg0.method1628((byte) -36, arg2);
            arg0.method273(0, 0);
            int var7 = arg0.field397;
            arg0.method310(108, var4.field528);
            for (int var8 = 0; var8 < var4.field525; var8++) {
                if (var4.field527[var8] == 0) {
                    try {
                        int var9 = var4.field518[var8];
                        if (var9 == 0) {
                            Field var13 = (Field) var4.field516[var8].field1446;
                            int var14 = var13.getInt((Object) null);
                            arg0.method273(0, 0);
                            arg0.method310(122, var14);
                        } else if (var9 == 1) {
                            Field var10 = (Field) var4.field516[var8].field1446;
                            var10.setInt((Object) null, var4.field522[var8]);
                            arg0.method273(0, 0);
                        } else if (var9 == 2) {
                            Field var11 = (Field) var4.field516[var8].field1446;
                            int var12 = var11.getModifiers();
                            arg0.method273(0, 0);
                            arg0.method310(81, var12);
                        }
                        if (var9 == 3) {
                            byte[][] var15 = var4.field520[var8];
                            Object[] var16 = new Object[var15.length];
                            Method var17 = (Method) var4.field530[var8].field1446;
                            for (int var18 = 0; var18 < var15.length; var18++) {
                                ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var15[var18]));
                                var16[var18] = var19.readObject();
                            }
                            Object var20 = var17.invoke((Object) null, var16);
                            if (var20 == null) {
                                arg0.method273(0, 0);
                            } else if ((var20 instanceof Number)) {
                                arg0.method273(0, 1);
                                arg0.method279(12086, ((Number) var20).longValue());
                            } else if ((var20 instanceof String)) {
                                arg0.method273(0, 2);
                                arg0.method280(-18345, (String) var20);
                            } else {
                                arg0.method273(0, 4);
                            }
                        } else if (var9 == 4) {
                            Method var21 = (Method) var4.field530[var8].field1446;
                            int var22 = var21.getModifiers();
                            arg0.method273(0, 0);
                            arg0.method310(32, var22);
                        }
                    } catch (ClassNotFoundException var35) {
                        arg0.method273(0, -10);
                    } catch (InvalidClassException var36) {
                        arg0.method273(0, -11);
                    } catch (StreamCorruptedException var37) {
                        arg0.method273(0, -12);
                    } catch (OptionalDataException var38) {
                        arg0.method273(0, -13);
                    } catch (IllegalAccessException var39) {
                        arg0.method273(0, -14);
                    } catch (IllegalArgumentException var40) {
                        arg0.method273(0, -15);
                    } catch (InvocationTargetException var41) {
                        arg0.method273(0, -16);
                    } catch (SecurityException var42) {
                        arg0.method273(0, -17);
                    } catch (IOException var43) {
                        arg0.method273(0, -18);
                    } catch (NullPointerException var44) {
                        arg0.method273(0, -19);
                    } catch (Exception var45) {
                        arg0.method273(0, -20);
                    } catch (Throwable var46) {
                        arg0.method273(0, -21);
                    }
                } else {
                    arg0.method273(0, var4.field527[var8]);
                }
            }
            arg0.method283(-128, var7);
            arg0.method302(arg0.field397 - var7, -124);
            var4.method1357(947647010);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIII)V", line = 631)
    public final void method32(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field23++;
        if (!this.field32) {
            class52 var6 = this.method25(-14);
            if (var6 == null) {
                return;
            }
            this.method22(false, var6);
        }
        if (this.field42 != null) {
            this.field42.method2014(arg0, arg1, arg3, arg2, arg4);
        }
    }
}
