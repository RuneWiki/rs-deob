import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class34 extends class273 {

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public int field556 = 0;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "[I")
    public int[] field568 = new int[5];

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "[Lcc;")
    public class248[] field580 = new class248[5];

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public int field553;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public int field565;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public int field566;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public int field555;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public int field567;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    public int field569;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
    public int field571;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    public int field575;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "Lda;")
    public class120 field558;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "Ldi;")
    public static class151 field572;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "Lgi;")
    public class215 field578;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Lrf;")
    public class275 field554;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "Led;")
    public class294 field573;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "Lkb;")
    public class34 field582;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "Lwe;")
    public class51 field574;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "Lib;")
    public class95 field561;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Z")
    public boolean field557;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "Z")
    public boolean field559;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "Z")
    public boolean field577;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "[Lmj;")
    public static class229[] field562;

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(III)V", line = 2)
    public class34(int arg0, int arg1, int arg2) {
        this.field553 = arg2;
        this.field566 = this.field565 = arg0;
        this.field555 = arg1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLah;)V", line = 15)
    public static final void method250(byte arg0, class205 arg1) {
        class140.field2141 = arg1;
        if (arg0 != 5) {
            field572 = (class151) null;
        }
        field563++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)I", line = 31)
    public static int method251(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)I", line = 39)
    public static final int method252(int arg0, int arg1) {
        if (arg1 != -2) {
            field562 = (class229[]) null;
        }
        field576++;
        return (arg0 & 0x3FDCB) >> 11;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)I", line = 51)
    public static final int method253(byte arg0) {
        field581++;
        class59.field903 = 0;
        if (arg0 != 11) {
            field572 = (class151) null;
        }
        return class80.method529((byte) 124);
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V", line = 66)
    public static void method254(int arg0) {
        field562 = null;
        int var1 = 96 % ((-arg0 - 64) / 48);
        field572 = null;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V", line = 81)
    public static final void method255(int arg0) {
        field564++;
        int var1 = 11 / ((arg0) / 43);
        class308.field5285.method1613(-22696);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ldi;IILhi;)V", line = 127)
    public static final void method256(class151 arg0, int arg1, int arg2, class291 arg3) {
        class233 var4 = new class233();
        var4.field3824 = arg3.method2011(-24);
        var4.field3828 = arg3.method1969((byte) -16);
        var4.field3823 = new byte[var4.field3824][][];
        var4.field3825 = new class188[var4.field3824];
        var4.field3822 = new class188[var4.field3824];
        if (arg2 != 3037) {
            method254(-13);
        }
        var4.field3819 = new int[var4.field3824];
        var4.field3821 = new int[var4.field3824];
        var4.field3820 = new int[var4.field3824];
        for (int var5 = 0; var5 < var4.field3824; var5++) {
            try {
                int var6 = arg3.method2011(-47);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    int var17 = 0;
                    String var18 = new String(arg3.method2017(true).method1018(-101));
                    String var19 = new String(arg3.method2017(true).method1018(arg2 - 3147));
                    if (var6 == 1) {
                        var17 = arg3.method1969((byte) -16);
                    }
                    var4.field3820[var5] = var6;
                    var4.field3821[var5] = var17;
                    var4.field3825[var5] = arg0.method971(class85.method556(114, var18), 14401, var19);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg3.method2017(true).method1018(arg2 - 3123));
                    String var8 = new String(arg3.method2017(true).method1018(-113));
                    int var9 = arg3.method2011(-19);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg3.method2017(true).method1018(-102));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method1969((byte) -16);
                            var12[var13] = new byte[var14];
                            arg3.method1975(0, (byte) 94, var14, var12[var13]);
                        }
                    }
                    var4.field3820[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class85.method556(arg2 - 2913, var10[var16]);
                    }
                    var4.field3822[var5] = arg0.method972(var8, true, class85.method556(123, var7), var15);
                    var4.field3823[var5] = var12;
                }
            } catch (ClassNotFoundException var25) {
                var4.field3819[var5] = -1;
            } catch (SecurityException var26) {
                var4.field3819[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field3819[var5] = -3;
            } catch (Exception var28) {
                var4.field3819[var5] = -4;
            } catch (Throwable var29) {
                var4.field3819[var5] = -5;
            }
        }
        class8.field104.method1214(false, var4);
        field570++;
    }
}
