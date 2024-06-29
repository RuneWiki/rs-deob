import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class240 extends class283 {

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "Lna;")
    public static class26 field3878 = class69.method505("", (byte) -119);

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "Lna;")
    public static class26 field3883 = class69.method505("mem=", (byte) -127);

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "Z")
    public static boolean field3880 = false;

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "[I")
    public static int[] field3882 = new int[5];

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!qg", name = "bb", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!qg", name = "ab", descriptor = "Lve;")
    public static class266 field3884;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)[I", line = 5)
    public final int[] method8(int arg0, byte arg1) {
        field3885++;
        int[] var3 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            class75.method538(var3, 0, class101.field1632, class59.field955[arg0]);
        }
        int var4 = -123 % ((30 - arg1) / 36);
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "(I)V", line = 26)
    public static final void method1648(int arg0) {
        if (arg0 != 6799) {
            method1649((class156) null, (class82) null, -13, (byte) 41);
        }
        class126.field1952.method1987(3);
        field3881++;
        class194.field3016.method1987(3);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lll;Lwa;IB)V", line = 44)
    public static final void method1649(class156 arg0, class82 arg1, int arg2, byte arg3) {
        field3874++;
        int var4 = 123 % ((arg3 + 66) / 57);
        class294 var5 = new class294();
        var5.field4889 = arg1.method642((byte) -54);
        var5.field4904 = arg1.method587(-502942936);
        var5.field4894 = new class180[var5.field4889];
        var5.field4896 = new int[var5.field4889];
        var5.field4900 = new byte[var5.field4889][][];
        var5.field4901 = new class180[var5.field4889];
        var5.field4898 = new int[var5.field4889];
        var5.field4895 = new int[var5.field4889];
        for (int var6 = 0; var6 < var5.field4889; var6++) {
            try {
                int var7 = arg1.method642((byte) -50);
                if (var7 == 0 || var7 == 1 || var7 == 2) {
                    String var8 = new String(arg1.method615(true).method199(0));
                    int var9 = 0;
                    String var10 = new String(arg1.method615(true).method199(0));
                    if (var7 == 1) {
                        var9 = arg1.method587(-502942936);
                    }
                    var5.field4898[var6] = var7;
                    var5.field4895[var6] = var9;
                    var5.field4901[var6] = arg0.method1068(-41, var10, class114.method795(6092, var8));
                } else if (var7 == 3 || var7 == 4) {
                    String var11 = new String(arg1.method615(true).method199(0));
                    String var12 = new String(arg1.method615(true).method199(0));
                    int var13 = arg1.method642((byte) -113);
                    String[] var14 = new String[var13];
                    for (int var15 = 0; var15 < var13; var15++) {
                        var14[var15] = new String(arg1.method615(true).method199(0));
                    }
                    byte[][] var16 = new byte[var13][];
                    if (var7 == 3) {
                        for (int var17 = 0; var17 < var13; var17++) {
                            int var18 = arg1.method587(-502942936);
                            var16[var17] = new byte[var18];
                            arg1.method603(0, var18, var16[var17], (byte) 93);
                        }
                    }
                    var5.field4898[var6] = var7;
                    Class[] var19 = new Class[var13];
                    for (int var20 = 0; var20 < var13; var20++) {
                        var19[var20] = class114.method795(6092, var14[var20]);
                    }
                    var5.field4894[var6] = arg0.method1064(class114.method795(6092, var11), var19, -80, var12);
                    var5.field4900[var6] = var16;
                }
            } catch (ClassNotFoundException var26) {
                var5.field4896[var6] = -1;
            } catch (SecurityException var27) {
                var5.field4896[var6] = -2;
            } catch (NullPointerException var28) {
                var5.field4896[var6] = -3;
            } catch (Exception var29) {
                var5.field4896[var6] = -4;
            } catch (Throwable var30) {
                var5.field4896[var6] = -5;
            }
        }
        class301.field5187.method257(true, var5);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZI)V", line = 167)
    public static final void method1650(int arg0, boolean arg1, int arg2) {
        field3873++;
        class232 var3 = class263.method1852(arg0, (byte) 127);
        int var4 = var3.field3675;
        if (arg1) {
            return;
        }
        int var5 = var3.field3670;
        int var6 = var3.field3679;
        int var7 = class202.field3142[var4 - var5];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class218.method1472(var6, 72, var8 & arg2 << var5 | class205.field3201[var6] & ~var8);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([Lna;[SI)V", line = 193)
    public static final void method1651(class26[] arg0, short[] arg1, int arg2) {
        field3879++;
        class294.method2066(arg1, arg0.length - 1, arg0, -909, 0);
        int var3 = 91 % ((arg2 + 1) / 63);
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(II)I", line = 209)
    public static int method1652(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V", line = 223)
    public static void method1653(boolean arg0) {
        field3882 = null;
        if (arg0) {
            field3884 = null;
            field3878 = null;
            field3883 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V", line = 240)
    public class240() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBII)I", line = 248)
    public static final int method1654(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field3876++;
        if (var4 == 0) {
            return arg3;
        }
        if (arg1 >= -17) {
            field3878 = (class26) null;
        }
        if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(II)Lia;", line = 270)
    public static final class208 method1655(int arg0, int arg1) {
        field3877++;
        class208 var2 = (class208) class153.field2390.method1989((long) arg0, (byte) 121);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class181.field2824.method1889(33, (byte) -122, arg0);
        if (arg1 != 5) {
            field3878 = (class26) null;
        }
        class208 var4 = new class208();
        if (var3 != null) {
            var4.method1391(new class82(var3), arg0, (byte) 85);
        }
        class153.field2390.method1978((byte) -112, var4, (long) arg0);
        return var4;
    }
}
