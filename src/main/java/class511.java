import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class511 {

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "Lel;")
    public static class3 field7601 = new class3();

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field7605 = -1;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "[F")
    public static float[] field7606 = new float[4];

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "Leda;")
    public static class116 field7604 = new class116(78, -1);

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "Lmo;")
    public static class482 field7608 = new class482(512);

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "Z")
    public static boolean field7610 = false;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "Leda;")
    public static class116 field7609 = new class116(110, 5);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "Ldga;")
    public static class231 field7607;

    @OriginalMember(owner = "client!qj", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field7600++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(JLr;Z)V", line = 13)
    public static final void method3040(long arg0, class98 arg1, boolean arg2) {
        class433.field6239 = 0;
        field7602++;
        class357.field4987 = 0;
        class121.field1978 = class41.field550;
        class41.field550 = 0;
        long var4 = class254.method1619(true);
        for (class635 var6 = (class635) class18.field268.method3313((byte) 60); var6 != null; var6 = (class635) class18.field268.method3308(-95)) {
            if (var6.method3588(arg1, arg0)) {
                class433.field6239++;
            }
        }
        if (class681.field9696 && (arg0 % 100L) == 0L) {
            System.out.println("Particle system count: " + class18.field268.method3312(9) + ", running: " + class433.field6239);
            System.out.println("Emitters: " + class357.field4987 + " Particles: " + class41.field550 + ". Time taken: " + (class254.method1619(true) - var4) + "ms");
        }
        if (arg2) {
            field7606 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 49)
    public static void method3041(int arg0) {
        field7604 = null;
        if (arg0 >= -49) {
            return;
        }
        field7608 = null;
        field7606 = null;
        field7607 = null;
        field7609 = null;
        field7601 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "()V", line = 67)
    public static final void method3042() {
        byte var0 = 10;
        byte var1 = 30;
        if (class366.field5078 == 0 || class662.field9307 == null) {
            return;
        }
        class490.field7029.method764(class547.field8027);
        for (int var2 = 0; var2 < class599.field8655.length; var2++) {
            class490.field7029.method750(class547.field8027[1], 24708, class697.field9887[var2] + class599.field8655[var2], class547.field8027[3] - class547.field8027[1], -256);
        }
        for (int var3 = 0; var3 < class550.field8071; var3++) {
            class302 var11 = class596.field8630[var3];
            class490.field7029.method787(var11.field4239[0], var11.field4226[0], var11.field4238[0], class252.field3642);
            class490.field7029.method787(var11.field4239[1], var11.field4226[1], var11.field4238[1], class12.field141);
            class490.field7029.method787(var11.field4239[2], var11.field4226[2], var11.field4238[2], class461.field6635);
            class490.field7029.method787(var11.field4239[3], var11.field4226[3], var11.field4238[3], class417.field5937);
            if (class252.field3642[2] != -1 && class12.field141[2] != -1 && class461.field6635[2] != -1 && class417.field5937[2] != -1) {
                int var12 = -65536;
                if (var11.field4227 == 4) {
                    var12 = -16776961;
                }
                class490.field7029.method813(class12.field141[0], var12, class252.field3642[1], 121, class12.field141[1], class252.field3642[0]);
                class490.field7029.method813(class461.field6635[0], var12, class12.field141[1], 98, class461.field6635[1], class12.field141[0]);
                class490.field7029.method813(class417.field5937[0], var12, class461.field6635[1], 98, class417.field5937[1], class461.field6635[0]);
                class490.field7029.method813(class252.field3642[0], var12, class417.field5937[1], 104, class252.field3642[1], class417.field5937[0]);
                class490.field7029.method813(class461.field6635[0], var12, class252.field3642[1], 123, class461.field6635[1], class252.field3642[0]);
            }
        }
        class662.field9307.method2394((byte) 109, var0, "Static Opaque: OW: " + class310.field4305[0] + "/" + class680.field9679[0] + " UW: " + class310.field4305[1] + "/" + class680.field9679[1], -16777216, -256, var1);
        class662.field9307.method2394((byte) 126, var0, "Static Trans: OW: " + class352.field4945[0] + "/" + class643.field9140[0] + " UW: " + class352.field4945[1] + "/" + class643.field9140[1], -16777216, -256, var1 + 15);
        class662.field9307.method2394((byte) 118, var0, "Static Anim: OW: " + class108.field1764[0] + "/" + class540.field7939[0] + " UW: " + class108.field1764[1] + "/" + class540.field7939[1], -16777216, -256, var1 + 30);
        class662.field9307.method2394((byte) 109, var0, "Dynamic: " + class136.field2197 + "/" + 5000, -16777216, -256, var1 + 45);
        class662.field9307.method2394((byte) 109, var0, "Total Opaque Onscreen: " + class386.field5651 + "/" + 10000, -16777216, -256, var1 + 60);
        class662.field9307.method2394((byte) 106, var0, "Total Trans Onscreen: " + class634.field8979 + "/" + 5000, -16777216, -256, var1 + 75);
        class662.field9307.method2394((byte) 123, var0, "Occluders: " + (class576.field8442 + class465.field6718) + " Active: " + class550.field8071, -16777216, -256, var1 + 90);
        class662.field9307.method2394((byte) 124, var0, "Occluded: Ground:" + class661.field9298 + " Walls: " + class184.field2918 + " CPs: " + class78.field1197 + " Pixels: " + class495.field7220, -16777216, -256, var1 + 105);
        class662.field9307.method2394((byte) 106, var0, "Occlude Calc Took: " + class143.field2465 / 1000L + "us", -16777216, -256, var1 + 120);
        if (class366.field5078 != 2 || class213.field3236 == null) {
            return;
        }
        for (int var4 = 0; var4 < class213.field3236.length; var4++) {
            float var6 = (float) class213.field3236[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class213.field3236[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class257 var5 = class490.field7029.method806(class213.field3236, 0, class346.field4893, class346.field4893, class348.field4915);
        var5.method3(var0, 170, 1, 0, 0);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)B", line = 157)
    public static final byte method3043(int arg0, int arg1, int arg2) {
        field7599++;
        if (arg1 != 2) {
            method3040(27L, null, true);
        }
        if (arg2 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(II)V", line = 176)
    public class511(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lvo;Lvo;Lvo;Lvo;B)V", line = 189)
    public static final void method3044(class345 arg0, class345 arg1, class345 arg2, class345 arg3, byte arg4) {
        if (arg4 <= 29) {
            field7606 = null;
        }
        field7603++;
        class534.field7849 = arg2;
        class515.field7631 = arg0;
        class17.field263 = arg3;
        class265.field3806 = new class101[class515.field7631.method2102(true)][];
        class529.field7803 = new boolean[class515.field7631.method2102(true)];
    }
}
