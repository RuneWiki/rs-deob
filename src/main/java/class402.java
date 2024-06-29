import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class402 extends class226 {

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "Lkaa;")
    public static class47 field5605 = new class47(34, 3);

    @OriginalMember(owner = "client!sg", name = "R", descriptor = "Z")
    public static boolean field5606 = false;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!sg", name = "O", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!sg", name = "T", descriptor = "Lfi;")
    public static class557 field5608;

    @OriginalMember(owner = "client!sg", name = "S", descriptor = "[B")
    private byte[] field5607;

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
    public class402() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)Llu;")
    public static final class714 method2365(int arg0, byte arg1) {
        field5604++;
        class714[] var2 = class428.method2472((byte) 120);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class714 var4 = var2[var3];
            if (var4.field9857 == arg0) {
                return var4;
            }
        }
        if (arg1 != -59) {
            method2365(-21, (byte) 12);
        }
        return null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IBII)[B")
    public final byte[] method2366(int arg0, byte arg1, int arg2, int arg3) {
        this.field5607 = new byte[arg0 * arg3 * arg2 * 2];
        field5603++;
        this.method3292(arg0, arg3, arg2, 0);
        return arg1 < 111 ? null : this.field5607;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lee;IBLkk;)V")
    public static final void method2367(class677 arg0, int arg1, byte arg2, class192 arg3) {
        field5601++;
        class195 var4 = new class195();
        var4.field2941 = arg0.method3821((byte) 120);
        var4.field2944 = arg0.method3799(false);
        var4.field2936 = new class198[var4.field2941];
        var4.field2943 = new byte[var4.field2941][][];
        if (arg2 != 58) {
            return;
        }
        var4.field2940 = new int[var4.field2941];
        var4.field2937 = new class198[var4.field2941];
        var4.field2942 = new int[var4.field2941];
        var4.field2934 = new int[var4.field2941];
        for (int var5 = 0; var5 < var4.field2941; var5++) {
            try {
                int var6 = arg0.method3821((byte) -68);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg0.method3793(15598);
                    String var18 = arg0.method3793(15598);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg0.method3799(false);
                    }
                    var4.field2934[var5] = var6;
                    var4.field2942[var5] = var19;
                    var4.field2936[var5] = arg3.method1306(true, class418.method2424(var17, (byte) -126), var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg0.method3793(arg2 + 15540);
                    String var8 = arg0.method3793(15598);
                    int var9 = arg0.method3821((byte) -56);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg0.method3793(15598);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg0.method3799(false);
                            var12[var13] = new byte[var14];
                            arg0.method3801(var12[var13], 0, var14, 85);
                        }
                    }
                    var4.field2934[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class418.method2424(var10[var16], (byte) -125);
                    }
                    var4.field2937[var5] = arg3.method1315(class712.method4000(arg2, -43), class418.method2424(var7, (byte) -121), var8, var15);
                    var4.field2943[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field2940[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2940[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2940[var5] = -3;
            } catch (Exception var23) {
                var4.field2940[var5] = -4;
            } catch (Throwable var24) {
                var4.field2940[var5] = -5;
            }
        }
        class37.field526.method11(var4, arg2 ^ 0xFFFFFFB7);
    }

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "(I)V")
    public static void method2368(int arg0) {
        if (arg0 <= 123) {
            method2365(47, (byte) -28);
        }
        field5605 = null;
        field5608 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BIB)V")
    public final void method1443(byte arg0, int arg1, byte arg2) {
        field5602++;
        if (arg2 != -111) {
            return;
        }
        int var4 = arg1 * 2;
        int var5 = arg0 & 0xFF;
        int var6 = var4 + 1;
        this.field5607[var4] = (byte) (var5 * 3 >> 5);
        this.field5607[var6] = (byte) (var5 * 3 >> 5);
    }
}
