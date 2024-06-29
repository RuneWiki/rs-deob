import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class247 extends class379 {

    @OriginalMember(owner = "client!dia", name = "o", descriptor = "I")
    public volatile int field2914 = -1;

    @OriginalMember(owner = "client!dia", name = "n", descriptor = "Ljava/lang/String;")
    public volatile String field2913;

    @OriginalMember(owner = "client!dia", name = "j", descriptor = "[I")
    public static int[] field2909 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!dia", name = "h", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!dia", name = "i", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!dia", name = "k", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!dia", name = "l", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!dia", name = "m", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(B)V", line = 5)
    public static void method1485(byte arg0) {
        if (arg0 > -71) {
            field2909 = null;
        }
        field2909 = null;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(BLjava/awt/Canvas;)V", line = 17)
    public static final void method1486(byte arg0, Canvas arg1) {
        field2911++;
        Dimension var2 = arg1.getSize();
        int var3 = -45 % ((-arg0 - 1) / 43);
        class199.method1296(0, var2.width, var2.height);
        if (class727.field10184 == 1) {
            class434.field5738.method637(arg1, class608.field8178, class734.field10263);
        } else {
            class434.field5738.method637(arg1, class632.field8632, class176.field2182);
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIII)V", line = 39)
    public static final void method1487(int arg0, int arg1, int arg2, int arg3) {
        field2912++;
        String var4 = "tele " + arg3 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
        System.out.println(var4);
        class433.method2566(false, -71, true, var4);
        if (arg2 > -13) {
            method1485((byte) -84);
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(BI)Z", line = 54)
    public static final boolean method1488(byte arg0, int arg1) {
        int var2 = 74 % ((16 - arg0) / 47);
        field2908++;
        if (arg1 == 18 || arg1 == 10 || arg1 == 47 || arg1 == 53 || arg1 == 59) {
            return true;
        } else {
            return arg1 == 48 || arg1 == 1010;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Llc;IILes;)V", line = 75)
    public static final void method1489(class675 arg0, int arg1, int arg2, class403 arg3) {
        field2907++;
        class244 var4 = new class244();
        var4.field2880 = arg3.method2396((byte) -100);
        var4.field2882 = arg3.method2381((byte) 108);
        var4.field2881 = new int[var4.field2880];
        var4.field2883 = new int[var4.field2880];
        var4.field2875 = new class561[var4.field2880];
        var4.field2877 = new byte[var4.field2880][][];
        var4.field2884 = new class561[var4.field2880];
        var4.field2879 = new int[var4.field2880];
        for (int var5 = arg2; var5 < var4.field2880; var5++) {
            try {
                int var6 = arg3.method2396((byte) -85);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg3.method2384(-6435);
                    String var8 = arg3.method2384(arg2 ^ 0xFFFFE6DD);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg3.method2381((byte) 93);
                    }
                    var4.field2883[var5] = var6;
                    var4.field2881[var5] = var9;
                    var4.field2875[var5] = arg0.method3797(class2.method93(8006, var7), arg2 + 82, var8);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg3.method2384(-6435);
                    String var11 = arg3.method2384(-6435);
                    int var12 = arg3.method2396((byte) -115);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg3.method2384(-6435);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method2381((byte) 34);
                            var15[var16] = new byte[var17];
                            arg3.method2401(arg2 ^ 0xFF00, var15[var16], 0, var17);
                        }
                    }
                    var4.field2883[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class2.method93(arg2 + 8006, var13[var19]);
                    }
                    var4.field2884[var5] = arg0.method3787(class2.method93(arg2 + 8006, var10), var18, var11, (byte) -53);
                    var4.field2877[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field2879[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2879[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2879[var5] = -3;
            } catch (Exception var23) {
                var4.field2879[var5] = -4;
            } catch (Throwable var24) {
                var4.field2879[var5] = -5;
            }
        }
        class130.field1611.method2732(var4, arg2 ^ 0x55B3);
    }

    @OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 190)
    public class247(String arg0) {
        this.field2913 = arg0;
    }
}
