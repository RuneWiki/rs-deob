import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class488 {

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "Ljava/lang/String;")
    private String field7147 = "null";

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
    public static int field7154 = 0;

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "I")
    public static int field7148 = 0;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "C")
    public char field7145;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "C")
    public char field7150;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
    public static int field7146;

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "I")
    public static int field7156;

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "I")
    private int field7158;

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "Lqo;")
    private class141 field7152;

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "Lqo;")
    public class141 field7162;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)V")
    private final void method2903(boolean arg0) {
        field7153++;
        this.field7152 = new class141(this.field7162.method942(!arg0));
        for (class74 var2 = (class74) this.field7162.method948(44); var2 != null; var2 = (class74) this.field7162.method938(-96)) {
            class74 var3 = new class74((int) var2.field6799);
            this.field7152.method940((long) var2.field998, -95, var3);
        }
        if (arg0) {
            this.method2907(-5, (byte) -7);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZLtl;)V")
    public final void method2904(boolean arg0, class91 arg1) {
        while (true) {
            int var3 = arg1.method618((byte) 100);
            if (var3 == 0) {
                field7156++;
                if (arg0) {
                    this.field7152 = null;
                    return;
                }
                return;
            }
            this.method2910(var3, arg1, false);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)Z")
    public final boolean method2905(int arg0, int arg1) {
        field7160++;
        if (this.field7162 == null) {
            return false;
        }
        if (this.field7152 == null) {
            this.method2903(false);
        }
        if (arg0 == 0) {
            class74 var3 = (class74) this.field7152.method943((long) arg1, arg0 - 1);
            return var3 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(II)I")
    public final int method2906(int arg0, int arg1) {
        field7161++;
        if (this.field7162 == null) {
            return this.field7158;
        }
        class74 var3 = (class74) this.field7162.method943((long) arg1, arg0);
        if (var3 == null) {
            return this.field7158;
        } else {
            if (arg0 != -1) {
                field7154 = -119;
            }
            return var3.field998;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public final String method2907(int arg0, byte arg1) {
        int var3 = -69 / ((arg1 + 77) / 41);
        field7159++;
        if (this.field7162 == null) {
            return this.field7147;
        } else {
            class44 var4 = (class44) this.field7162.method943((long) arg0, -1);
            return var4 == null ? this.field7147 : var4.field652;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIBI)V")
    public static final void method2908(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field7151++;
        if (arg0 - arg1 >= class396.field6021 && arg0 + arg1 <= class443.field6591 && class410.field6176 <= arg2 - arg1 && arg1 + arg2 <= class158.field2302) {
            class372.method2328(arg1, arg0, arg4, arg2, -120);
        } else {
            class503.method3004(arg0, arg4, 95, arg1, arg2);
        }
        if (arg3 != 28) {
            method2909((byte) 43);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
    public static final void method2909(byte arg0) {
        field7155++;
        if (arg0 != 2) {
            field7154 = -32;
        }
        if (class260.field3628 != null) {
            return;
        }
        Container var1;
        if (class452.field6646 == null) {
            var1 = class419.field6254.field6861;
        } else {
            var1 = class452.field6646;
        }
        class503.field7496 = var1.getSize().width;
        class529.field7811 = var1.getSize().height;
        if (class452.field6646 == var1) {
            Insets var2 = class452.field6646.getInsets();
            class529.field7811 -= var2.top + var2.bottom;
            class503.field7496 -= var2.right + var2.left;
        }
        if (class320.method2074(-32190) == 1) {
            class272.field3781 = (class503.field7496 - class515.field7639) / 2;
            class341.field5383 = 0;
            class486.field7136 = class462.field6768;
            class7.field112 = class515.field7639;
        } else if (class455.field6684 < 96 && class441.field6563 == 0) {
            int var3 = class503.field7496 > 1024 ? 1024 : class503.field7496;
            class272.field3781 = (class503.field7496 - var3) / 2;
            int var4 = class529.field7811 > 768 ? 768 : class529.field7811;
            class7.field112 = var3;
            class341.field5383 = 0;
            class486.field7136 = var4;
        } else {
            class341.field5383 = 0;
            class486.field7136 = class529.field7811;
            class7.field112 = class503.field7496;
            class272.field3781 = 0;
        }
        if (class74.field999 != class140.field2031) {
            boolean var10000;
            if (class7.field112 < 1024 && class486.field7136 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class245.field3430.setSize(class7.field112, class486.field7136);
        if (class337.field5242 != null) {
            class337.field5242.method1083(class245.field3430);
        }
        if (class452.field6646 == var1) {
            Insets var5 = class452.field6646.getInsets();
            class245.field3430.setLocation(class272.field3781 + var5.left, var5.top - -class341.field5383);
        } else {
            class245.field3430.setLocation(class272.field3781, class341.field5383);
        }
        if (class329.field5062 != -1) {
            class519.method3092(true, 256);
        }
        class168.method1183((byte) 121);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILtl;Z)V")
    private final void method2910(int arg0, class91 arg1, boolean arg2) {
        field7149++;
        if (arg0 == 1) {
            this.field7145 = class396.method2437(arg1.method619((byte) -23), -5513);
        } else if (arg0 == 2) {
            this.field7150 = class396.method2437(arg1.method619((byte) -23), -5513);
        } else if (arg0 == 3) {
            this.field7147 = arg1.method621(2029169511);
        } else if (arg0 == 4) {
            this.field7158 = arg1.method626((byte) 100);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method631(10494);
            this.field7162 = new class141(class353.method2231(var4, (byte) -84));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method626((byte) 100);
                class467 var7;
                if (arg0 == 5) {
                    var7 = new class44(arg1.method621(2029169511));
                } else {
                    var7 = new class74(arg1.method626((byte) 100));
                }
                this.field7162.method940((long) var6, -115, var7);
            }
        }
        if (arg2) {
            this.method2910(-120, null, false);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lqa;Lns;I)V")
    public static final void method2911(class496 arg0, class438 arg1, int arg2) {
        field7146++;
        class476[] var3 = class476.method2847(arg1, class391.field5942, 0);
        class414.field6216 = new class191[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class414.field6216[var4] = arg0.method1117(var3[var4], true);
        }
        class476[] var5 = class476.method2847(arg1, class453.field6658, 0);
        class63.field892 = new class191[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class63.field892[var6] = arg0.method1117(var5[var6], true);
        }
        class476[] var7 = class476.method2847(arg1, class14.field243, arg2);
        class494.field7231 = new class191[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class494.field7231[var8] = arg0.method1117(var7[var8], true);
        }
        class476[] var9 = class476.method2847(arg1, class408.field6163, 0);
        class439.field6538 = new class191[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class439.field6538[var10] = arg0.method1117(var9[var10], true);
        }
        class476[] var11 = class476.method2847(arg1, class272.field3782, 0);
        class331.field5127 = new class191[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class331.field5127[var12] = arg0.method1117(var11[var12], true);
        }
        class476[] var13 = class476.method2847(arg1, class262.field3647, 0);
        class483.field7036 = new class191[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class483.field7036[var14] = arg0.method1117(var13[var14], true);
        }
        class476[] var15 = class476.method2847(arg1, class211.field2974, 0);
        class316.field4825 = new class191[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class316.field4825[var16] = arg0.method1117(var15[var16], true);
        }
        class476[] var17 = class476.method2847(arg1, class115.field1597, 0);
        class216.field3001 = new class191[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class216.field3001[var18] = arg0.method1117(var17[var18], true);
        }
        class476[] var19 = class476.method2847(arg1, class82.field1095, 0);
        class129.field1814 = new class191[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class129.field1814[var20] = arg0.method1117(var19[var20], true);
        }
        class476[] var21 = class476.method2847(arg1, class398.field6056, 0);
        class432.field6406 = new class191[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class432.field6406[var22] = arg0.method1117(var21[var22], true);
        }
        class476[] var23 = class476.method2847(arg1, class495.field7240, 0);
        class225.field3228 = new class191[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class225.field3228[var24] = arg0.method1117(var23[var24], true);
        }
        class476[] var25 = class476.method2847(arg1, class150.field2165, 0);
        class41.field635 = new class191[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class41.field635[var26] = arg0.method1117(var25[var26], true);
        }
        class112.field1564 = arg0.method1117(class476.method2845(arg1, class199.field2816, 0), true);
        class285.field4250 = arg0.method1117(class476.method2845(arg1, class526.field7774, 0), true);
        class476[] var27 = class476.method2847(arg1, class33.field524, 0);
        class4.field62 = new class191[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class4.field62[var28] = arg0.method1117(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method2912(int arg0, String arg1) {
        field7144++;
        if (this.field7162 == null) {
            return false;
        }
        if (this.field7152 == null) {
            this.method2913(0);
        }
        class127 var3 = (class127) this.field7152.method943(class259.method1677(-996737019, arg1), -1);
        if (arg0 >= -14) {
            return true;
        }
        while (var3 != null) {
            if (var3.field1803.equals(arg1)) {
                return true;
            }
            var3 = (class127) this.field7152.method945((byte) -123);
        }
        return false;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
    private final void method2913(int arg0) {
        field7157++;
        this.field7152 = new class141(this.field7162.method942(true));
        if (arg0 != 0) {
            this.field7158 = 71;
        }
        for (class44 var2 = (class44) this.field7162.method948(101); var2 != null; var2 = (class44) this.field7162.method938(-90)) {
            class127 var3 = new class127(var2.field652, (int) var2.field6799);
            this.field7152.method940(class259.method1677(-996737019, var2.field652), -102, var3);
        }
    }
}
