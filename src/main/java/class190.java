import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class190 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field2997 = 0;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Lck;")
    public static class119 field3002 = class298.method1987((byte) 79, " GMT");

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "[I")
    public static int[] field3000;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 13)
    public static final void method1201(byte arg0) {
        if (arg0 <= 3) {
            field2997 = -98;
        }
        class216.field3482.method486((byte) 93);
        field2998++;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V", line = 24)
    public static void method1202(byte arg0) {
        if (arg0 == 68) {
            field3000 = null;
            field3002 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)I", line = 37)
    public static final int method1203(int arg0, int arg1, int arg2) {
        field3005++;
        int var3 = class55.method408(arg1 - 1, arg0 + -1, (byte) -42) + class55.method408(arg1 - 1, arg0 - -1, (byte) -72) + class55.method408(arg1 + 1, arg0 - 1, (byte) -124) + class55.method408(arg1 + 1, arg0 + 1, (byte) -121);
        int var4 = class55.method408(arg1, arg0 - 1, (byte) -92) + class55.method408(arg1, arg0 + 1, (byte) -88) + class55.method408(arg1 + arg2, arg0, (byte) -44) + class55.method408(arg1 - -1, arg0, (byte) -73);
        int var5 = class55.method408(arg1, arg0, (byte) -116);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILfj;ILlh;)V", line = 56)
    public static final void method1204(int arg0, class3 arg1, int arg2, class282 arg3) {
        field3004++;
        class234 var4 = new class234();
        var4.field3780 = arg1.method64((byte) -91);
        int var5 = 86 % ((-arg0 - 69) / 52);
        var4.field3789 = arg1.method71(-668527048);
        var4.field3772 = new class275[var4.field3780];
        var4.field3790 = new int[var4.field3780];
        var4.field3781 = new int[var4.field3780];
        var4.field3785 = new class275[var4.field3780];
        var4.field3779 = new byte[var4.field3780][][];
        var4.field3778 = new int[var4.field3780];
        for (int var6 = 0; var6 < var4.field3780; var6++) {
            try {
                int var7 = arg1.method64((byte) -123);
                if (var7 == 0 || var7 == 1 || var7 == 2) {
                    int var18 = 0;
                    String var19 = new String(arg1.method41((byte) -123).method756(false));
                    String var20 = new String(arg1.method41((byte) -121).method756(false));
                    if (var7 == 1) {
                        var18 = arg1.method71(-668527048);
                    }
                    var4.field3781[var6] = var7;
                    var4.field3790[var6] = var18;
                    var4.field3785[var6] = arg3.method1877(false, class35.method252(true, var19), var20);
                } else if (var7 == 3 || var7 == 4) {
                    String var8 = new String(arg1.method41((byte) -126).method756(false));
                    String var9 = new String(arg1.method41((byte) -125).method756(false));
                    int var10 = arg1.method64((byte) -91);
                    String[] var11 = new String[var10];
                    for (int var12 = 0; var12 < var10; var12++) {
                        var11[var12] = new String(arg1.method41((byte) -122).method756(false));
                    }
                    byte[][] var13 = new byte[var10][];
                    if (var7 == 3) {
                        for (int var14 = 0; var14 < var10; var14++) {
                            int var15 = arg1.method71(-668527048);
                            var13[var14] = new byte[var15];
                            arg1.method53(var13[var14], 75, 0, var15);
                        }
                    }
                    var4.field3781[var6] = var7;
                    Class[] var16 = new Class[var10];
                    for (int var17 = 0; var17 < var10; var17++) {
                        var16[var17] = class35.method252(true, var11[var17]);
                    }
                    var4.field3772[var6] = arg3.method1874(var9, class35.method252(true, var8), (byte) 124, var16);
                    var4.field3779[var6] = var13;
                }
            } catch (ClassNotFoundException var26) {
                var4.field3778[var6] = -1;
            } catch (SecurityException var27) {
                var4.field3778[var6] = -2;
            } catch (NullPointerException var28) {
                var4.field3778[var6] = -3;
            } catch (Exception var29) {
                var4.field3778[var6] = -4;
            } catch (Throwable var30) {
                var4.field3778[var6] = -5;
            }
        }
        class238.field3814.method999(var4, (byte) -108);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)Lra;", line = 178)
    public static final class43 method1205(boolean arg0) {
        field3001++;
        int var1 = class64.field1006[0] * class232.field3741[0];
        byte[] var2 = class247.field3989[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class161.field2553[class19.method151(var2[var4], 255)];
        }
        class43 var5 = new class43(class227.field3641, class207.field3304, class155.field2475[0], class7.field152[0], class232.field3741[0], class64.field1006[0], var3);
        class162.method1035(-20432);
        if (!arg0) {
            field3002 = (class119) null;
        }
        return var5;
    }
}
