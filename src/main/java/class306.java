import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class306 {

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "[I")
    public static int[] field4374 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4377 = " ";

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public static int field4378 = 0;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public int field4363;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public int field4364;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public int field4365;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public int field4366;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public int field4368;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public int field4369;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public int field4370;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public int field4371;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public int field4372;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public int field4375;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public int field4376;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public int field4380;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    public int field4381;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public int field4382;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    public int field4383;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
    public int field4384;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
    public int field4385;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
    public int field4386;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
    public static void method1922(byte arg0) {
        if (arg0 == 56) {
            field4377 = null;
            field4374 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLnr;)V")
    public static final void method1923(byte arg0, class437 arg1) {
        field4379++;
        int var2 = class394.field5912;
        int var3 = class200.field2861;
        int var4 = class272.field3995;
        int var5 = class263.field3828 - 3;
        byte var6 = 20;
        if (class24.field432 == null || class228.field3228 == null) {
            if (class247.field3446.method1451(-116, class325.field4675) && class247.field3446.method1451(-116, class424.field6310)) {
                class24.field432 = arg1.method2166(class25.method225(class247.field3446, class325.field4675, 0), true);
                class25 var7 = class25.method225(class247.field3446, class424.field6310, 0);
                class228.field3228 = arg1.method2166(var7, true);
                var7.method230();
                class213.field3016 = arg1.method2166(var7, true);
            } else {
                arg1.method2188(var2, var3, var4, var6, class368.field5469 | 255 - class263.field3832 << 24, 1);
            }
        }
        if (class24.field432 != null && class228.field3228 != null) {
            int var8 = (var4 - (class228.field3228.method1095() * 2)) / class24.field432.method1095();
            for (int var9 = 0; var9 < var8; var9++) {
                class24.field432.method1499(var2 + class228.field3228.method1095() + (class24.field432.method1095() * var9), var3);
            }
            class228.field3228.method1499(var2, var3);
            class213.field3016.method1499(var2 + var4 - class213.field3016.method1095(), var3);
        }
        class232.field3275.method1319(-8219, class75.field1015, class311.field4454 | 0xFF000000, var3 + 14, var2 - -3, -1);
        arg1.method2188(var2, var3 + var6, var4, var5 - var6, -class263.field3832 + 255 << 24 | class368.field5469, 1);
        int var10 = class34.field555;
        int var11 = class316.field4522;
        for (int var12 = 0; var12 < class10.field97; var12++) {
            int var26 = (class10.field97 - var12 - 1) * 16 + var3 + var6 + 13;
            if (var10 > var2 && (var2 + var4) > var10 && var11 > var26 - 13 && var26 + 3 > var11) {
                arg1.method2188(var2, var26 - 12, var4, 16, 255 - class57.field817 << 24 | class85.field1187, 1);
            }
        }
        if ((class32.field533 == null || class170.field2248 == null || class87.field1213 == null) && class247.field3446.method1451(-112, class124.field1651) && class247.field3446.method1451(-123, class100.field1359) && class247.field3446.method1451(-118, class314.field4496)) {
            class25 var13 = class25.method225(class247.field3446, class100.field1359, 0);
            class170.field2248 = arg1.method2166(var13, true);
            var13.method230();
            class318.field4543 = arg1.method2166(var13, true);
            class32.field533 = arg1.method2166(class25.method225(class247.field3446, class124.field1651, 0), true);
            class25 var14 = class25.method225(class247.field3446, class314.field4496, 0);
            class87.field1213 = arg1.method2166(var14, true);
            var14.method230();
            class101.field1360 = arg1.method2166(var14, true);
        }
        if (class32.field533 != null && class170.field2248 != null && class87.field1213 != null) {
            int var15 = (var4 - class87.field1213.method1095() * 2) / class32.field533.method1095();
            for (int var16 = 0; var16 < var15; var16++) {
                class32.field533.method1499(var2 + class87.field1213.method1095() + class32.field533.method1095() * var16, -class32.field533.method1090() + var3 - -var5);
            }
            int var17 = (var5 - class87.field1213.method1090() - var6) / class170.field2248.method1090();
            for (int var18 = 0; var18 < var17; var18++) {
                class170.field2248.method1499(var2, class170.field2248.method1090() * var18 + (var3 + var6));
                class318.field4543.method1499(var2 + var4 - class318.field4543.method1095(), var18 * class170.field2248.method1090() + var3 - -var6);
            }
            class87.field1213.method1499(var2, var3 + var5 - class87.field1213.method1090());
            class101.field1360.method1499(var2 + var4 - class87.field1213.method1095(), var5 + (var3 - class87.field1213.method1090()));
        }
        int var19 = 0;
        class259 var20 = (class259) class373.field5574.method2649(0);
        if (arg0 <= 44) {
            field4378 = 91;
        }
        while (var20 != null) {
            int var21 = var3 + var6 - (-13 - (class10.field97 - var19 + -1) * 16);
            int var22 = class311.field4454 | 0xFF000000;
            if (var2 < var10 && (var2 + var4) > var10 && var11 > var21 - 13 && var11 < var21 + 3) {
                var22 = class154.field2018 | 0xFF000000;
            }
            int[] var23 = null;
            if (class425.method2728((byte) 121, var20.field3777)) {
                var23 = class166.method1031((int) var20.field3772, false).field2724;
            } else if (class60.method404((byte) 45, var20.field3777)) {
                class129 var24 = class23.field408[(int) var20.field3772];
                if (var24 != null) {
                    var23 = var24.field1714.field5616;
                }
            } else if (class433.method2747(var20.field3777, (byte) -105)) {
                if (var20.field3777 == 1009) {
                    var23 = class165.method1020((int) var20.field3772, 124).field6001;
                } else {
                    var23 = class165.method1020((int) (var20.field3772 >>> 32 & 0x7FFFFFFFL), 127).field6001;
                }
            }
            String var25 = client.method1570(-94, var20);
            if (var23 != null) {
                var25 = var25 + class88.method544(104, var23);
            }
            class232.field3275.method1335(var22, 4712, var25, class417.field6208, class42.field653, var2 + 3, 0, var21);
            var19++;
            var20 = (class259) class373.field5574.method2656(0);
        }
        class168.method1042(class200.field2861, class272.field3995, class263.field3828, (byte) 63, class394.field5912);
    }
}
