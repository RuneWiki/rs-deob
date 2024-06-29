import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class354 {

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "[Lao;")
    public static class62[] field5372 = new class62[128];

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "Z")
    public static boolean field5373 = false;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lfc;ILofa;I)V", line = 5)
    public static final void method2269(class731 arg0, int arg1, class301 arg2, int arg3) {
        field5370++;
        if (arg1 >= 0) {
            field5373 = true;
        }
        class49 var4 = new class49();
        var4.field809 = arg2.method1987(-30);
        var4.field806 = arg2.method1934(-2);
        var4.field807 = new int[var4.field809];
        var4.field805 = new int[var4.field809];
        var4.field801 = new class162[var4.field809];
        var4.field800 = new byte[var4.field809][][];
        var4.field802 = new int[var4.field809];
        var4.field804 = new class162[var4.field809];
        for (int var5 = 0; var5 < var4.field809; var5++) {
            try {
                int var6 = arg2.method1987(-96);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg2.method1958(-3438);
                    String var8 = arg2.method1958(-3438);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg2.method1934(-2);
                    }
                    var4.field802[var5] = var6;
                    var4.field807[var5] = var9;
                    var4.field801[var5] = arg0.method4064(class735.method4101(10, var7), var8, -93);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg2.method1958(-3438);
                    String var11 = arg2.method1958(-3438);
                    int var12 = arg2.method1987(-124);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg2.method1958(-3438);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method1934(-2);
                            var15[var16] = new byte[var17];
                            arg2.method1936(0, 10046, var17, var15[var16]);
                        }
                    }
                    var4.field802[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class735.method4101(10, var13[var19]);
                    }
                    var4.field804[var5] = arg0.method4068(var18, 17985, class735.method4101(10, var10), var11);
                    var4.field800[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field805[var5] = -1;
            } catch (SecurityException var21) {
                var4.field805[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field805[var5] = -3;
            } catch (Exception var23) {
                var4.field805[var5] = -4;
            } catch (Throwable var24) {
                var4.field805[var5] = -5;
            }
        }
        class93.field1396.method3472(102, var4);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V", line = 121)
    public static void method2270(byte arg0) {
        int var1 = 90 % ((arg0 - 52) / 36);
        field5372 = null;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)Z", line = 135)
    public static final boolean method2271(int arg0, int arg1) {
        field5371++;
        if (arg0 == 50 || arg0 == 25 || arg0 == 6 || arg0 == 44 || arg0 == 1009) {
            return true;
        } else if (arg1 == 25) {
            return arg0 == 5 || arg0 == 1006;
        } else {
            return false;
        }
    }
}
