import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class430 {

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "J")
    public long field6188;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "Lqm;")
    public class430 field6186;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "Lqm;")
    public class430 field6189;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "()V", line = 9)
    public static final void method2655() {
        byte var0 = 10;
        byte var1 = 30;
        if (class352.field5212 == 0 || class716.field10110 == null) {
            return;
        }
        class391.field5644.method358(class196.field2861);
        for (int var2 = 0; var2 < class62.field999.length; var2++) {
            class391.field5644.method3258(-256, class196.field2861[1], class196.field2861[3] - class196.field2861[1], 79, class62.field999[var2] + class451.field6454[var2]);
        }
        for (int var3 = 0; var3 < class618.field8798; var3++) {
            class151 var11 = class755.field10518[var3];
            class391.field5644.method402(var11.field2206[0], var11.field2207[0], var11.field2203[0], class23.field218);
            class391.field5644.method402(var11.field2206[1], var11.field2207[1], var11.field2203[1], class610.field8709);
            class391.field5644.method402(var11.field2206[2], var11.field2207[2], var11.field2203[2], class132.field1834);
            class391.field5644.method402(var11.field2206[3], var11.field2207[3], var11.field2203[3], class746.field10415);
            if (class23.field218[2] != -1 && class610.field8709[2] != -1 && class132.field1834[2] != -1 && class746.field10415[2] != -1) {
                int var12 = -65536;
                if (var11.field2197 == 4) {
                    var12 = -16776961;
                }
                class391.field5644.method3259((byte) -124, class610.field8709[1], var12, class23.field218[0], class610.field8709[0], class23.field218[1]);
                class391.field5644.method3259((byte) -124, class132.field1834[1], var12, class610.field8709[0], class132.field1834[0], class610.field8709[1]);
                class391.field5644.method3259((byte) -124, class746.field10415[1], var12, class132.field1834[0], class746.field10415[0], class132.field1834[1]);
                class391.field5644.method3259((byte) -124, class23.field218[1], var12, class746.field10415[0], class23.field218[0], class746.field10415[1]);
                class391.field5644.method3259((byte) -124, class132.field1834[1], var12, class23.field218[0], class132.field1834[0], class23.field218[1]);
            }
        }
        class716.field10110.method2433(-16777216, -256, var0, 0, "Static Opaque: OW: " + class355.field5248[0] + "/" + class717.field10119[0] + " UW: " + class355.field5248[1] + "/" + class717.field10119[1], var1);
        class716.field10110.method2433(-16777216, -256, var0, 0, "Static Trans: OW: " + class575.field8273[0] + "/" + class732.field10255[0] + " UW: " + class575.field8273[1] + "/" + class732.field10255[1], var1 + 15);
        class716.field10110.method2433(-16777216, -256, var0, 0, "Static Anim: OW: " + class145.field1963[0] + "/" + class460.field6536[0] + " UW: " + class145.field1963[1] + "/" + class460.field6536[1], var1 + 30);
        class716.field10110.method2433(-16777216, -256, var0, 0, "Dynamic: " + class594.field8445 + "/" + 5000, var1 + 45);
        class716.field10110.method2433(-16777216, -256, var0, 0, "Total Opaque Onscreen: " + class423.field6033 + "/" + 10000, var1 + 60);
        class716.field10110.method2433(-16777216, -256, var0, 0, "Total Trans Onscreen: " + class610.field8707 + "/" + 5000, var1 + 75);
        class716.field10110.method2433(-16777216, -256, var0, 0, "Occluders: " + (class445.field6359 + class311.field4226) + " Active: " + class618.field8798, var1 + 90);
        class716.field10110.method2433(-16777216, -256, var0, 0, "Occluded: Ground:" + class661.field9448 + " Walls: " + class343.field4713 + " CPs: " + class671.field9573 + " Pixels: " + class163.field2324, var1 + 105);
        class716.field10110.method2433(-16777216, -256, var0, 0, "Occlude Calc Took: " + class660.field9439 / 1000L + "us", var1 + 120);
        if (class352.field5212 != 2 || class703.field9910 == null) {
            return;
        }
        for (int var4 = 0; var4 < class703.field9910.length; var4++) {
            float var6 = (float) class703.field9910[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class703.field9910[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class515 var5 = class391.field5644.method3265(class703.field9910, class355.field5240, class165.field2353, class165.field2353, 0, (byte) 50);
        var5.method789(var0, 170, 1, 0, 0);
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)V", line = 95)
    public final void method2656(byte arg0) {
        if (arg0 < 116) {
            method2655();
        }
        field6185++;
        if (this.field6186 != null) {
            this.field6186.field6189 = this.field6189;
            this.field6189.field6186 = this.field6186;
            this.field6189 = null;
            this.field6186 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)Z", line = 113)
    public final boolean method2657(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field6187++;
            return this.field6186 != null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)I", line = 131)
    public static int method2658(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
