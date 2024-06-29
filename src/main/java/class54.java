import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class54 {

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public int field751 = 0;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Lqk;")
    public static class148 field755 = new class148(62, 4);

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field757 = 0;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Lbfa;")
    public static class574 field758 = new class574();

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lha;I)V", line = 7)
    public static final void method360(class545 arg0, int arg1) {
        field752++;
        int var2 = 0;
        int var3 = 0;
        if (class264.field3595) {
            var2 = class468.method2788(false);
            var3 = class142.method934((byte) -88);
        }
        int var4 = class463.field6345 + var2;
        int var5 = class140.field1930 + var3;
        int var6 = class248.field3438;
        int var7 = class148.field2046 - 3;
        byte var8 = 20;
        class308.method1812(false, arg0, class148.field2046, class463.field6345 + var2, class138.field1860.method891(-2041650704, class369.field4721), var8, class248.field3438, class140.field1930 + var3);
        int var9 = var2 + class93.field1263.method805(0);
        int var10 = class93.field1263.method806(arg1) + var3;
        if (class229.field3185) {
            int var11 = 0;
            for (class480 var12 = (class480) class314.field4033.method667(true); var12 != null; var12 = (class480) class314.field4033.method662((byte) -80)) {
                int var16 = var11 * 16 + (var5 + var8 + 13);
                if ((class463.field6345 + var2) < var9 && (class463.field6345 + var2 + class248.field3438) > var9 && var10 > var16 - 13 && var10 < (var16 + 4) && (var12.field6524 > 1 || ((class6) var12.field6519.field1417.field3781).field55)) {
                    arg0.method2194(class463.field6345 + var2, var16 + -12, class248.field3438, 16, 255 - class284.field3762 << 24 | class423.field5855, 1);
                }
                var11++;
            }
            if (class105.field1536 != null) {
                int var13 = 0;
                class308.method1812(false, arg0, class695.field9701, class729.field10220, class105.field1536.field6518, var8, class660.field9314, class495.field6946);
                for (class6 var14 = (class6) class105.field1536.field6519.method667(true); var14 != null; var14 = (class6) class105.field1536.field6519.method662((byte) 126)) {
                    int var15 = var13 * 16 + class495.field6946 - (-var8 - 13);
                    var13++;
                    if (class729.field10220 < var9 && var9 < (class729.field10220 + class660.field9314) && var15 - 13 < var10 && (var15 + 4) > var10 && var14.field55) {
                        arg0.method2194(class729.field10220, var15 - 12, class660.field9314, 16, class423.field5855 | 255 - class284.field3762 << 24, 1);
                    }
                }
                class31.method229(var8, class695.field9701, (byte) -84, class495.field6946, class660.field9314, class729.field10220, arg0);
            }
        } else {
            int var17 = 0;
            for (class6 var18 = (class6) class478.field6510.method3118((byte) 73); var18 != null; var18 = (class6) class478.field6510.method3111(arg1 + 122)) {
                int var28 = var8 + var5 + ((class605.field8642 + -1 + -var17) * 16) + 13;
                var17++;
                if (class463.field6345 + var2 < var9 && var9 < (class463.field6345 + var2 + class248.field3438) && (var28 - 13) < var10 && var10 < var28 + 4 && var18.field55) {
                    arg0.method2194(class463.field6345 + var2, var28 + -12, class248.field3438, 16, class423.field5855 | 255 - class284.field3762 << 24, 1);
                }
            }
        }
        class31.method229(var8, class148.field2046, (byte) -119, class140.field1930 + var3, class248.field3438, class463.field6345 + var2, arg0);
        if (class229.field3185) {
            int var22 = 0;
            for (class480 var23 = (class480) class314.field4033.method667(true); var23 != null; var23 = (class480) class314.field4033.method662((byte) 126)) {
                int var27 = var22 * 16 + var3 + class140.field1930 + var8 + 13;
                if (var23.field6524 == 1) {
                    class583.method3469(0, var27, class463.field6345 + var2, class82.field1118 | 0xFF000000, class248.field3438, class140.field1930 + var3, (class6) var23.field6519.field1417.field3781, class148.field2046, arg0, class742.field10345 | 0xFF000000, var9, var10);
                } else {
                    class63.method403(class463.field6345 + var2, class140.field1930 + var3, class248.field3438, class148.field2046, var10, var9, class82.field1118 | 0xFF000000, class742.field10345 | 0xFF000000, arg0, var23, var27, 10960);
                }
                var22++;
            }
            if (class105.field1536 != null) {
                int var24 = 0;
                for (class6 var25 = (class6) class105.field1536.field6519.method667(true); var25 != null; var25 = (class6) class105.field1536.field6519.method662((byte) -25)) {
                    int var26 = var24 * 16 + class495.field6946 + var8 + 13;
                    class583.method3469(0, var26, class729.field10220, class82.field1118 | 0xFF000000, class660.field9314, class495.field6946, var25, class695.field9701, arg0, class742.field10345 | 0xFF000000, var9, var10);
                    var24++;
                }
                class270.method1648(class495.field6946, class729.field10220, class695.field9701, class660.field9314, false);
            }
        } else {
            int var19 = 0;
            for (class6 var20 = (class6) class478.field6510.method3118((byte) 73); var20 != null; var20 = (class6) class478.field6510.method3111(127)) {
                int var21 = (class605.field8642 - var19 - 1) * 16 + var5 + var8 + 13;
                class583.method3469(arg1, var21, var4, class82.field1118 | 0xFF000000, var6, var5, var20, var7, arg0, class742.field10345 | 0xFF000000, var9, var10);
                var19++;
            }
        }
        class270.method1648(class140.field1930 + var3, class463.field6345 + var2, class148.field2046, class248.field3438, false);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILvj;I)V", line = 172)
    private final void method361(int arg0, class26 arg1, int arg2) {
        if (arg2 <= 61) {
            field756 = -128;
        }
        if (arg0 == 5) {
            this.field751 = arg1.method193(2);
        }
        field750++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLvj;)V", line = 200)
    public final void method362(byte arg0, class26 arg1) {
        while (true) {
            int var3 = arg1.method194((byte) 119);
            if (var3 == 0) {
                if (arg0 != 120) {
                    this.field751 = -3;
                }
                field753++;
                return;
            }
            this.method361(var3, arg1, 112);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BII)Z", line = 220)
    public static final boolean method363(byte arg0, int arg1, int arg2) {
        field754++;
        if (arg0 != 120) {
            field755 = null;
        }
        return (arg1 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 234)
    public static void method364(int arg0) {
        if (arg0 == -2) {
            field758 = null;
            field755 = null;
        }
    }
}
