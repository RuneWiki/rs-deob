import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class66 extends class36 {

    @OriginalMember(owner = "client!gea", name = "p", descriptor = "I")
    private int field724;

    @OriginalMember(owner = "client!gea", name = "y", descriptor = "[C")
    public static char[] field733 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!gea", name = "q", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!gea", name = "s", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!gea", name = "u", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!gea", name = "v", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!gea", name = "w", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!gea", name = "x", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!gea", name = "r", descriptor = "[Lmc;")
    public class116[] field726;

    @OriginalMember(owner = "client!gea", name = "t", descriptor = "[[B")
    private byte[][] field728;

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(I)V", line = 10)
    public class66(int arg0) {
        this.field724 = arg0;
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(II)Z", line = 21)
    public final boolean method453(int arg0, int arg1) {
        field727++;
        return arg0 == 0 ? this.field726[arg1].field1439 : true;
    }

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "(II)Z", line = 33)
    public final boolean method454(int arg0, int arg1) {
        field731++;
        if (arg1 != 91) {
            this.method454(5, -13);
        }
        return this.field726[arg0].field1445;
    }

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "(II)Z", line = 44)
    public final boolean method455(int arg0, int arg1) {
        field732++;
        return arg0 == 91 ? this.field726[arg1].field1438 : false;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V", line = 59)
    public static final void method456(int arg0) {
        class402.field6088.method2167(90);
        field730++;
        class108.field1317.method517(true);
        class130.field1626.method3544((byte) 36);
        class575.field8301.method1504(3394);
        class224.field3151.method1816(true);
        class622.field8999.method17((byte) -77);
        class259.field3686.method2963((byte) 115);
        class141.field1735.method3661(true);
        class300.field4421.method1253(2);
        class574.field8290.method940(0);
        if (arg0 > -110) {
            method456(-119);
        }
        class393.field6020.method33(-109);
        class601.field8769.method104(false);
        class59.field680.method1017(-1);
        class122.field1533.method3140(0);
        class565.field8053.method3497((byte) -110);
        class61.field702.method2029(100);
        class173.field2125.method1021(113);
        class3.field23.method426(true);
        class281.field3925.method52(64);
        class509.field7410.method721(-57);
        class33.method189(false);
        class80.method522(-8676);
        class507.method3013(-3);
        class367.method2353((byte) 78);
        class289.field3992.method1805(36);
        class613.field8910.method1805(107);
        class126.field1555.method1805(17);
        class428.field6354.method1805(-9);
        class604.field8844.method1805(-96);
    }

    @OriginalMember(owner = "client!gea", name = "g", descriptor = "(I)V", line = 98)
    public static void method457(int arg0) {
        if (arg0 == 1) {
            field733 = null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "h", descriptor = "(I)Z", line = 108)
    public final boolean method458(int arg0) {
        field729++;
        if (this.field726 != null) {
            return true;
        }
        if (this.field728 == null) {
            if (!class98.field1155.method1312(0, this.field724)) {
                return false;
            }
            int[] var2 = class98.field1155.method1285(this.field724, arg0 + 21239);
            this.field728 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field728[var3] = class98.field1155.method1286(var2[var3], this.field724, (byte) -49);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field728.length; var5++) {
            byte[] var15 = this.field728[var5];
            class194 var16 = new class194(var15);
            var16.field2610 = 1;
            int var17 = var16.method1220(-94);
            var4 &= class1.field2.method1311(var17, (byte) -93);
        }
        if (arg0 != -21154) {
            field733 = null;
        }
        if (!var4) {
            return false;
        }
        class114 var6 = new class114();
        int var7 = class98.field1155.method1309(1675886592, this.field724);
        this.field726 = new class116[var7];
        int[] var8 = class98.field1155.method1285(this.field724, 77);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field728[var9];
            class194 var11 = new class194(var10);
            var11.field2610 = 1;
            int var12 = var11.method1220(arg0 + 21277);
            class575 var13 = null;
            for (class575 var14 = (class575) var6.method719(false); var14 != null; var14 = (class575) var6.method716(arg0 + 21168)) {
                if (var14.field8302 == var12) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == null) {
                var13 = new class575(var12, class1.field2.method1308((byte) -128, var12));
                var6.method706(var13, true);
            }
            this.field726[var8[var9]] = new class116(var10, var13);
        }
        this.field728 = null;
        return true;
    }
}
