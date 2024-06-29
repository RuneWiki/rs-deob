import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class352 {

    @OriginalMember(owner = "client!op", name = "b", descriptor = "Leg;")
    public class363 field5092 = new class363();

    @OriginalMember(owner = "client!op", name = "h", descriptor = "Z")
    public boolean field5098 = false;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "I")
    public static int field5096 = 1;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "Z")
    public static boolean field5100 = false;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "Z")
    public static boolean field5101 = false;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public int field5094;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "I")
    public int field5102;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lps;Z)Lps;", line = 6)
    public static final class394 method2315(class394 arg0, boolean arg1) {
        field5093++;
        if (arg0.field5639 != -1) {
            return class196.method1168((byte) -79, arg0.field5639);
        }
        int var2 = arg0.field5698 >>> 16;
        class362 var3 = new class362(class99.field1377);
        for (class169 var4 = (class169) var3.method2368(4096); var4 != null; var4 = (class169) var3.method2369(-1)) {
            if (var4.field2275 == var2) {
                return class196.method1168((byte) -86, (int) var4.field640);
            }
        }
        if (arg1) {
            method2318(-57);
        }
        return null;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIII)V", line = 39)
    public static final void method2316(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class125.field1751 = arg2;
        class379.field5521 = arg4;
        if (arg0 >= -41) {
            field5100 = true;
        }
        class87.field1227 = arg1;
        class299.field4382 = arg3;
        field5095++;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILii;Llm;)V", line = 53)
    public static final void method2317(int arg0, class405 arg1, class347 arg2) {
        field5097++;
        class441[] var3 = class441.method2779(arg2, class244.field3263, 0);
        class52.field702 = new class67[var3.length];
        for (int var4 = arg0; var4 < var3.length; var4++) {
            class52.field702[var4] = arg1.method1710(var3[var4], true);
        }
        class441[] var5 = class441.method2779(arg2, class167.field2260, 0);
        class93.field1341 = new class67[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class93.field1341[var6] = arg1.method1710(var5[var6], true);
        }
        class441[] var7 = class441.method2779(arg2, class90.field1273, 0);
        class195.field2608 = new class67[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class195.field2608[var8] = arg1.method1710(var7[var8], true);
        }
        class441[] var9 = class441.method2779(arg2, class184.field2494, 0);
        class316.field4620 = new class67[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class316.field4620[var10] = arg1.method1710(var9[var10], true);
        }
        class441[] var11 = class441.method2779(arg2, class439.field6448, 0);
        class323.field4743 = new class67[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class323.field4743[var12] = arg1.method1710(var11[var12], true);
        }
        class441[] var13 = class441.method2779(arg2, class5.field69, 0);
        class304.field4459 = new class67[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class304.field4459[var14] = arg1.method1710(var13[var14], true);
        }
        class441[] var15 = class441.method2779(arg2, class94.field1352, 0);
        class1.field7 = new class67[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class1.field7[var16] = arg1.method1710(var15[var16], true);
        }
        class441[] var17 = class441.method2779(arg2, class347.field5022, 0);
        class21.field275 = new class67[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class21.field275[var18] = arg1.method1710(var17[var18], true);
        }
        class441[] var19 = class441.method2779(arg2, class63.field850, 0);
        class139.field1915 = new class67[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class139.field1915[var20] = arg1.method1710(var19[var20], true);
        }
        class441[] var21 = class441.method2779(arg2, class65.field862, 0);
        class403.field6002 = new class67[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class403.field6002[var22] = arg1.method1710(var21[var22], true);
        }
        class441[] var23 = class441.method2779(arg2, class379.field5508, 0);
        class430.field6330 = new class67[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class430.field6330[var24] = arg1.method1710(var23[var24], true);
        }
        class441[] var25 = class441.method2779(arg2, class382.field5545, 0);
        class270.field3931 = new class67[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class270.field3931[var26] = arg1.method1710(var25[var26], true);
        }
        class441[] var27 = class441.method2779(arg2, class213.field2848, 0);
        class62.field819 = new class67[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class62.field819[var28] = arg1.method1710(var27[var28], true);
        }
        class283.field4117 = arg1.method1710(class441.method2778(arg2, class115.field1609, 0), true);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V", line = 179)
    public static final void method2318(int arg0) {
        field5099++;
        if (arg0 <= 110) {
            field5101 = true;
        }
        if (class122.field1691 != -1) {
            class71.method525(123, false, -1, -1, class122.field1691);
            class122.field1691 = -1;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V", line = 202)
    public static final void method2319(byte arg0) {
        field5091++;
        class129.field1787.method1141(256);
        class188.field2524.method1141(256);
        if (arg0 != 45) {
            field5101 = false;
        }
    }
}
