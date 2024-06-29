import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class462 {

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "Lsa;")
    public class595 field5884 = null;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "Lla;")
    public class413 field5890 = null;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "Lbaa;")
    public static class593 field5886 = new class593(6, 0, 4, 2);

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "F")
    public static float field5894;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "Lla;")
    public static class413 field5888;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "Laga;")
    public static class661 field5893;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZI)V", line = 4)
    public static final void method2457(int arg0, boolean arg1, int arg2) {
        field5887++;
        class424 var3 = class683.field9599[arg0][arg2];
        if (var3 != null) {
            class389.field4909 = var3.field5314;
            class272.field3442 = var3.field5323;
            class323.field4133 = var3.field5320;
        }
        class587.method3234((byte) -38);
        if (arg1) {
            field5893 = null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIB)V", line = 31)
    public static final void method2458(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field5885++;
        if (arg4 != 41) {
            field5891 = -48;
        }
        if (arg2 != 8 && arg2 != 16) {
            class75 var5 = class270.field3423[arg3][arg1][arg0];
            if (var5 != null) {
                if (arg2 == 1) {
                    var5.field1033 = 0;
                } else if (arg2 == 2) {
                    var5.field1032 = 0;
                }
            }
            class272.method1564(arg4 - 39);
            return;
        }
        for (int var6 = 0; var6 < class472.field5992; var6++) {
            class199 var7 = class311.field3980[var6];
            if (var7.field2518 == arg2 && var7.field2520 == arg1 && var7.field2512 == arg0 || var7.field2525 == arg1 && var7.field2512 == arg0) {
                if (class472.field5992 != var6) {
                    class293.method1639(class311.field3980, var6 + 1, class311.field3980, var6, class311.field3980.length - var6 - 1);
                }
                class472.field5992--;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)V", line = 83)
    public static final void method2459(int arg0, int arg1) {
        field5889++;
        class592 var2 = class61.method371(8, arg0, (byte) -15);
        var2.method3253(0);
        if (arg1 != -23477) {
            field5894 = -0.10097351F;
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lla;)V", line = 144)
    public class462(class413 arg0) {
        this.field5890 = arg0;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lla;Lsa;)V", line = 152)
    public class462(class413 arg0, class595 arg1) {
        this.field5890 = arg0;
        this.field5884 = arg1;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V", line = 101)
    public static final void method2460(byte arg0) {
        field5892++;
        class465.method2468(2, class301.field3698.field6612, 22050, 47);
        class419.field5255 = new class223();
        class419.field5255.method1311(9, 128, 18959);
        class260.field3213 = class312.method1811(12869, class590.field8289, 22050, class500.field6585, 0);
        if (arg0 > -76) {
            method2458(-32, -104, 9, 2, (byte) 90);
        }
        class260.field3213.method1503(class419.field5255, (byte) 88);
        class577.method3182(class419.field5255, class472.field5993, class518.field7073, class533.field7189, -92);
        class411.field5140 = class312.method1811(12869, class590.field8289, 2048, class500.field6585, 1);
        class480.field6387 = new class218();
        class411.field5140.method1503(class480.field6387, (byte) 88);
        class584.field8166 = new class642(22050, class392.field4942);
        class86.field1219 = class81.field1086.method3341("scape main", -62);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V", line = 124)
    public static void method2461(int arg0) {
        field5888 = null;
        field5893 = null;
        if (arg0 == -12420) {
            field5886 = null;
        }
    }
}
