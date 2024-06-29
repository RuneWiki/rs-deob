import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class234 extends class84 implements class418 {

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "Loq;")
    public static class362 field3057;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "Lnd;")
    public static class547 field3059;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "Lcv;")
    public static class570 field3058;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static void method1470(int arg0) {
        if (arg0 <= 55) {
            method1472();
        }
        field3058 = null;
        field3057 = null;
        field3059 = null;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public static final void method1471(int arg0) {
        ++field3060;
        class586.field8181.method3065(true);
        int var1 = 4 / ((arg0 - -63) / 45);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "()V")
    public static final void method1472() {
        byte var0 = 10;
        byte var1 = 30;
        if (class628.field8649 != 0 && class678.field9469 != null) {
            class681.field9504.method483(class513.field7207);
            for (int var2 = 0; var2 < class629.field8674.length; ++var2) {
                class681.field9504.method441(class513.field7207[3] - class513.field7207[1], class629.field8674[var2] + class437.field5812[var2], -256, class513.field7207[1], -22315);
            }
            for (int var3 = 0; var3 < class533.field7400; ++var3) {
                class222 var11 = class473.field6351[var3];
                class681.field9504.method553(var11.field2968[0], var11.field2971[0], var11.field2974[0], class514.field7215);
                class681.field9504.method553(var11.field2968[1], var11.field2971[1], var11.field2974[1], class295.field3885);
                class681.field9504.method553(var11.field2968[2], var11.field2971[2], var11.field2974[2], class725.field10110);
                class681.field9504.method553(var11.field2968[3], var11.field2971[3], var11.field2974[3], class302.field3961);
                if (class514.field7215[2] != -1 && class295.field3885[2] != -1 && class725.field10110[2] != -1 && class302.field3961[2] != -1) {
                    int var12 = -65536;
                    if (var11.field2972 == 4) {
                        var12 = -16776961;
                    }
                    class681.field9504.method494(class514.field7215[1], (byte) -56, class295.field3885[0], class295.field3885[1], var12, class514.field7215[0]);
                    class681.field9504.method494(class295.field3885[1], (byte) -55, class725.field10110[0], class725.field10110[1], var12, class295.field3885[0]);
                    class681.field9504.method494(class725.field10110[1], (byte) -65, class302.field3961[0], class302.field3961[1], var12, class725.field10110[0]);
                    class681.field9504.method494(class302.field3961[1], (byte) 99, class514.field7215[0], class514.field7215[1], var12, class302.field3961[0]);
                    class681.field9504.method494(class514.field7215[1], (byte) 102, class725.field10110[0], class725.field10110[1], var12, class514.field7215[0]);
                }
            }
            class678.field9469.method555(-256, "Dynamic: " + class551.field7698 + "/" + 5000, 0, -16777216, var0, var1 + 45);
            class678.field9469.method555(-256, "Total Opaque Onscreen: " + class333.field4239 + "/" + 10000, 0, -16777216, var0, var1 + 60);
            class678.field9469.method555(-256, "Total Trans Onscreen: " + class475.field6397 + "/" + 5000, 0, -16777216, var0, var1 + 75);
            class678.field9469.method555(-256, "Occluders: " + (class660.field9192 + class54.field753) + " Active: " + class533.field7400, 0, -16777216, var0, var1 + 90);
            class678.field9469.method555(-256, "Occluded: Ground:" + class607.field8426 + " Walls: " + class684.field9530 + " CPs: " + class61.field861 + " Pixels: " + class700.field9738, 0, -16777216, var0, var1 + 105);
            class678.field9469.method555(-256, "Occlude Calc Took: " + class8.field89 / 1000L + "us", 0, -16777216, var0, var1 + 120);
            if (class628.field8649 == 2 && class416.field5306 != null) {
                for (int var4 = 0; var4 < class416.field5306.length; ++var4) {
                    float var6 = (float) class416.field5306[var4];
                    float var7 = var6 / 4194304.0F;
                    if (var7 > 1.0F) {
                        var7 = 1.0F;
                    }
                    float var8 = var7 * 255.0F;
                    float var9 = 255.0F - var8;
                    int var10 = (int) var9;
                    class416.field5306[var4] = var10 | var10 << 8 | var10 << 16 | -16777216;
                }
                class481 var5 = class681.field9504.method435(class646.field8938, 0, class711.field9865, 109, class416.field5306, class646.field8938);
                var5.method148(var0, 170, 1, 0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BIILha;Lfh;)V")
    public static final void method1473(byte arg0, int arg1, int arg2, class60 arg3, class653 arg4) {
        ++field3056;
        class537.field7459.method3668(0);
        if (!class264.field3342) {
            for (class344 var5 = (class344) arg4.method3672(-1); var5 != null; var5 = (class344) arg4.method3662(-1)) {
                class278 var7 = class73.field1015.method3085((byte) -122, var5.field4349);
                if (class288.method1724(-27223, var7)) {
                    boolean var8 = class238.method1489(var5, arg1, arg3, arg2, -5, var7);
                    if (var8) {
                        class514.method2991(var7, var5, arg3, (byte) 110);
                    }
                }
            }
            int var6 = -74 % ((arg0 - -21) / 57);
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Ltk;IZ[[I)V")
    public class234(class347 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class269.field3396, class285.field3589, arg1 * 6 * arg1, arg2);
        super.field1159.method2396(22357, this);
        if (!arg2) {
            for (int var5 = 0; ~var5 > -7; ++var5) {
                OpenGL.glTexImage2Di(var5 + 34069, 0, this.method702(125), arg1, arg1, 0, class705.method3951(super.field1161, 78), super.field1159.field4487, arg3[var5], 0);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                this.method695(arg1, 34069 - -var6, arg1, arg3[var6], 0);
            }
        }
    }
}
