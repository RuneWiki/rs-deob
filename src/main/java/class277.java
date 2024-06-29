import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class277 extends Canvas {

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field4944;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Lid;")
    public static class149 field4950 = class60.method382("m", (byte) 10);

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field4951 = 0;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "Lid;")
    public static class149 field4957 = class60.method382(":duelfriend:", (byte) 6);

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "Lid;")
    public static class149 field4949 = class60.method382("_labels", (byte) 121);

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field4946 = 0;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method1911(int arg0) {
        if (arg0 != -31978) {
            field4953 = 96;
        }
        field4950 = null;
        field4949 = null;
        field4957 = null;
    }

    @OriginalMember(owner = "client!ah", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field4944.update(arg0);
        field4952++;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class277(Component arg0) {
        this.field4944 = arg0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIII)V")
    public static final void method1912(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4955++;
        if (class260.field4581 < 100) {
            class13.method74(true);
        }
        class72.method461(arg2, arg0, arg2 + arg4, arg0 + arg3);
        if (class260.field4581 < 100) {
            byte var5 = 20;
            int var6 = arg4 / 2 + arg2;
            int var7 = arg0 + (arg3 / 2) - var5 - 18;
            class72.method459(arg2, arg0, arg4, arg3, 0);
            class72.method457(var6 - 152, var7, 304, 34, 9179409);
            class72.method457(var6 - 151, var7 + 1, 302, 32, 0);
            class72.method459(var6 - 150, var7 - -2, class260.field4581 * 3, 30, 9179409);
            class72.method459(var6 + (class260.field4581 * 3) - 150, var7 - -2, 300 - (class260.field4581 * 3), 30, 0);
            class173.field3180.method1156(class22.field312, var6, var5 + var7, 16777215, -1);
            return;
        }
        class279.field4979 = (int) ((float) (arg1 * arg3) / class11.field156);
        class194.field3486 = class163.field3019 - ((int) ((float) arg3 / class11.field156));
        int var8 = class106.field1840 - ((int) ((float) arg4 / class11.field156));
        class67.field1178 = class106.field1840 - ((int) ((float) arg4 / class11.field156));
        int var9 = class163.field3019 - ((int) ((float) arg3 / class11.field156));
        int var10 = (int) ((float) arg4 / class11.field156) + class106.field1840;
        int var11 = class163.field3019 + ((int) ((float) arg3 / class11.field156));
        class60.field1083 = (int) ((float) (arg4 * 2) / class11.field156);
        class64.method402(arg2 + arg4, var9, var10, arg0 + arg3, var11, var8, arg0, arg2, (byte) -91);
        class113.method793(arg0, var8, (byte) 97, arg2 + arg4, var11, var9, var10, arg0 + arg3, arg2);
        class259.method1786(arg2, var8, var9, arg2 + arg4, arg0 + arg3, var11, var10, (byte) -127, arg0);
        if (class118.field2030 > 0) {
            class11.field162--;
            if (class11.field162 == 0) {
                class118.field2030--;
                class11.field162 = 20;
            }
        }
        if (!class168.field3129) {
            return;
        }
        int var12 = arg2 + arg4 - 5;
        int var13 = arg0 + arg3 - 8;
        int var14 = 16776960;
        class6.field73.method1171(class237.method1603(new class149[] { class236.field4135, class211.method1434(class133.field2412, true) }, -128), var12, var13, 16776960, -1);
        Runtime var15 = Runtime.getRuntime();
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        int var17 = var13 - 15;
        if (var16 > 65536) {
            var14 = 16711680;
        }
        class6.field73.method1171(class237.method1603(new class149[] { class119.field2036, class211.method1434(var16, true), class15.field214 }, arg1 ^ 0xFFFFFF8C), var12, var17, var14, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!ah", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field4945++;
        this.field4944.paint(arg0);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lid;Lid;Lid;ZI)V")
    public static final void method1913(class149 arg0, class149 arg1, class149 arg2, boolean arg3, int arg4) {
        if (arg3) {
            method1914((byte) 62, -49L, -78, 6);
        }
        class87.method646(-1, arg1, arg2, arg4, -1, arg0);
        field4954++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BJII)Z")
    public static final boolean method1914(byte arg0, long arg1, int arg2, int arg3) {
        field4943++;
        int var5 = ((int) arg1 & 0x7DD62) >> 14;
        int var6 = ((int) arg1 & 0x329661) >> 20;
        if (arg0 < 96) {
            method1912(-78, 45, 123, 68, 103);
        }
        int var7 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class268 var8 = class108.method755(11525, var7);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field4820;
                var10 = var8.field4787;
            } else {
                var9 = var8.field4787;
                var10 = var8.field4820;
            }
            int var11 = var8.field4834;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class71.method445(var9, arg3, arg2, var10, (byte) -6, true, 0, var11, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
        } else {
            class71.method445(0, arg3, arg2, 0, (byte) -6, true, var6, 0, class77.field1449.field2400[0], var5 + 1, 2, class77.field1449.field2333[0]);
        }
        class223.field3925 = class260.field4582;
        class55.field993 = 2;
        class283.field5011 = 0;
        class136.field2506 = class159.field2921;
        return true;
    }
}
