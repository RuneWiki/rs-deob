import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class442 {

    @OriginalMember(owner = "client!co", name = "c", descriptor = "[Ldd;")
    public class471[] field6567 = new class471[8];

    @OriginalMember(owner = "client!co", name = "g", descriptor = "[I")
    public int[] field6571 = new int[100];

    @OriginalMember(owner = "client!co", name = "k", descriptor = "[I")
    public int[] field6575 = new int[3];

    @OriginalMember(owner = "client!co", name = "f", descriptor = "[Lvj;")
    public class153[] field6570 = new class153[100];

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static int field6565 = 0;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "I")
    public static int field6574 = 0;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field6573 = new String[200];

    @OriginalMember(owner = "client!co", name = "l", descriptor = "Lss;")
    public static class208 field6576 = new class208(14, 1);

    @OriginalMember(owner = "client!co", name = "m", descriptor = "Lss;")
    public static class208 field6577 = new class208(15, 4);

    @OriginalMember(owner = "client!co", name = "n", descriptor = "Lss;")
    public static class208 field6578 = new class208(16, -2);

    @OriginalMember(owner = "client!co", name = "o", descriptor = "Lss;")
    public static class208 field6579 = new class208(17, 0);

    @OriginalMember(owner = "client!co", name = "p", descriptor = "Lss;")
    public static class208 field6580 = new class208(18, -2);

    @OriginalMember(owner = "client!co", name = "q", descriptor = "Lss;")
    public static class208 field6581 = new class208(20, 6);

    @OriginalMember(owner = "client!co", name = "r", descriptor = "Lss;")
    public static class208 field6582 = new class208(21, 8);

    @OriginalMember(owner = "client!co", name = "s", descriptor = "Lss;")
    public static class208 field6583 = new class208(22, -2);

    @OriginalMember(owner = "client!co", name = "t", descriptor = "Lss;")
    public static class208 field6584 = new class208(23, 4);

    @OriginalMember(owner = "client!co", name = "u", descriptor = "Lss;")
    public static class208 field6585 = new class208(24, -1);

    @OriginalMember(owner = "client!co", name = "v", descriptor = "[Lss;")
    private static class208[] field6586 = new class208[32];

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public int field6569;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field6572;

    static {
        class208[] var0 = class417.method2523(-101);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field6586[var0[var1].field2934] = var0[var1];
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lhu;ILtl;B)V", line = 12)
    public static final void method2668(class469 arg0, int arg1, class91 arg2, byte arg3) {
        field6568++;
        class390 var4 = new class390();
        var4.field5910 = arg2.method618((byte) 100);
        var4.field5915 = arg2.method626((byte) 100);
        var4.field5911 = new class125[var4.field5910];
        if (arg3 != -70) {
            field6574 = 44;
        }
        var4.field5908 = new int[var4.field5910];
        var4.field5909 = new class125[var4.field5910];
        var4.field5914 = new int[var4.field5910];
        var4.field5912 = new int[var4.field5910];
        var4.field5920 = new byte[var4.field5910][][];
        for (int var5 = 0; var5 < var4.field5910; var5++) {
            try {
                int var6 = arg2.method618((byte) 100);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg2.method621(2029169511);
                    String var18 = arg2.method621(arg3 + 2029169581);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg2.method626((byte) 100);
                    }
                    var4.field5908[var5] = var6;
                    var4.field5914[var5] = var19;
                    var4.field5911[var5] = arg0.method2807(class41.method323(arg3, -75), class103.method692(var17, class41.method323(arg3, -71)), var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg2.method621(arg3 ^ 0x870D54DD);
                    String var8 = arg2.method621(2029169511);
                    int var9 = arg2.method618((byte) 100);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg2.method621(2029169511);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method626((byte) 100);
                            var12[var13] = new byte[var14];
                            arg2.method617(0, var14, false, var12[var13]);
                        }
                    }
                    var4.field5908[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class103.method692(var10[var16], 3);
                    }
                    var4.field5909[var5] = arg0.method2798((byte) -29, var15, var8, class103.method692(var7, 3));
                    var4.field5920[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field5912[var5] = -1;
            } catch (SecurityException var21) {
                var4.field5912[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field5912[var5] = -3;
            } catch (Exception var23) {
                var4.field5912[var5] = -4;
            } catch (Throwable var24) {
                var4.field5912[var5] = -5;
            }
        }
        class509.field7563.method1958(var4, 0);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V", line = 130)
    public static void method2669(byte arg0) {
        field6578 = null;
        field6581 = null;
        field6585 = null;
        field6582 = null;
        field6586 = null;
        field6583 = null;
        field6577 = null;
        field6584 = null;
        field6573 = null;
        field6576 = null;
        field6579 = null;
        int var1 = -92 % ((arg0 + 78) / 46);
        field6580 = null;
    }
}
