import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class322 implements class243 {

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Ljava/lang/String;")
    private String field4240;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Z")
    public static volatile boolean field4241 = false;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "[I")
    public static int[] field4243 = new int[4];

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lgv;")
    public static class72 field4244 = new class72();

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Z")
    private boolean field4242;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "[[I")
    public static int[][] field4249;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)I", line = 4)
    public final int method365(int arg0) {
        field4246++;
        if (arg0 < 81) {
            return 83;
        }
        int var2 = class489.method2848(this.field4240, -28944);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field4242 = true;
            return 100;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 22)
    public static void method1870(byte arg0) {
        field4249 = null;
        field4243 = null;
        if (arg0 != -38) {
            field4244 = null;
        }
        field4244 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(CI)Z", line = 44)
    public static final boolean method1871(char arg0, int arg1) {
        field4245++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class236.method1432(arg0, 48)) {
            return true;
        } else {
            char[] var2 = class84.field1198;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            if (arg1 >= -24) {
                field4241 = true;
            }
            char[] var4 = class101.field1349;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 87)
    public class322(String arg0) {
        this.field4240 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)Luv;", line = 95)
    public final class333 method360(int arg0) {
        if (arg0 != -21954) {
            this.method360(-52);
        }
        field4239++;
        return class333.field4432;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)Z", line = 106)
    public final boolean method1872(byte arg0) {
        field4238++;
        if (arg0 != 12) {
            this.method365(92);
        }
        return this.field4242;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lun;IILwd;)V", line = 117)
    public static final void method1873(class389 arg0, int arg1, int arg2, class248 arg3) {
        int var4 = 47 % ((-arg2 - 82) / 34);
        field4247++;
        class77 var5 = new class77();
        var5.field1134 = arg0.method2229(255);
        var5.field1125 = arg0.method2255(255);
        var5.field1128 = new int[var5.field1134];
        var5.field1126 = new class477[var5.field1134];
        var5.field1131 = new byte[var5.field1134][][];
        var5.field1135 = new class477[var5.field1134];
        var5.field1130 = new int[var5.field1134];
        var5.field1129 = new int[var5.field1134];
        for (int var6 = 0; var6 < var5.field1134; var6++) {
            try {
                int var7 = arg0.method2229(255);
                if (var7 == 0 || var7 == 1 || var7 == 2) {
                    String var18 = arg0.method2244((byte) -73);
                    String var19 = arg0.method2244((byte) -99);
                    int var20 = 0;
                    if (var7 == 1) {
                        var20 = arg0.method2255(255);
                    }
                    var5.field1128[var6] = var7;
                    var5.field1129[var6] = var20;
                    var5.field1135[var6] = arg3.method1514(var19, class219.method1327(var18, 15966), 65535);
                } else if (var7 == 3 || var7 == 4) {
                    String var8 = arg0.method2244((byte) -122);
                    String var9 = arg0.method2244((byte) -55);
                    int var10 = arg0.method2229(255);
                    String[] var11 = new String[var10];
                    for (int var12 = 0; var12 < var10; var12++) {
                        var11[var12] = arg0.method2244((byte) -107);
                    }
                    byte[][] var13 = new byte[var10][];
                    if (var7 == 3) {
                        for (int var14 = 0; var14 < var10; var14++) {
                            int var15 = arg0.method2255(255);
                            var13[var14] = new byte[var15];
                            arg0.method2250(-1, var15, var13[var14], 0);
                        }
                    }
                    var5.field1128[var6] = var7;
                    Class[] var16 = new Class[var10];
                    for (int var17 = 0; var17 < var10; var17++) {
                        var16[var17] = class219.method1327(var11[var17], 15966);
                    }
                    var5.field1126[var6] = arg3.method1511(var9, var16, -121, class219.method1327(var8, 15966));
                    var5.field1131[var6] = var13;
                }
            } catch (ClassNotFoundException var21) {
                var5.field1130[var6] = -1;
            } catch (SecurityException var22) {
                var5.field1130[var6] = -2;
            } catch (NullPointerException var23) {
                var5.field1130[var6] = -3;
            } catch (Exception var24) {
                var5.field1130[var6] = -4;
            } catch (Throwable var25) {
                var5.field1130[var6] = -5;
            }
        }
        class521.field7637.method1129(var5, 262144);
    }
}
