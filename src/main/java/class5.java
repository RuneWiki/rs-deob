import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class5 extends class467 {

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "I")
    public int field65 = -1;

    @OriginalMember(owner = "client!ps", name = "v", descriptor = "Z")
    public boolean field71 = false;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "Lui;")
    public static class375 field64 = new class375("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
    public int field66;

    @OriginalMember(owner = "client!ps", name = "r", descriptor = "I")
    public int field67;

    @OriginalMember(owner = "client!ps", name = "s", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ps", name = "t", descriptor = "I")
    public int field69;

    @OriginalMember(owner = "client!ps", name = "u", descriptor = "I")
    public int field70;

    @OriginalMember(owner = "client!ps", name = "w", descriptor = "I")
    public int field72;

    @OriginalMember(owner = "client!ps", name = "x", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ps", name = "y", descriptor = "[I")
    public static int[] field74;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BLqa;)V")
    public static final void method46(byte arg0, class496 arg1) {
        field63++;
        if (class178.field2531.method1967(103) == 0) {
            return;
        }
        if (class441.field6563 == 0) {
            for (class150 var2 = (class150) class178.field2531.method1970(64); var2 != null; var2 = (class150) class178.field2531.method1960(24)) {
                class84.field1154.method2448(arg1, false, (byte) 72, class23.field349, false, var2.field2160, var2.field2168, arg1, var2.field2166, var2.field2163, var2.field2161, var2.field2162 ? class339.field5365.field4943 : null);
                var2.method2785((byte) -120);
            }
            class268.method1710(true);
        } else {
            if (class165.field2410 == null) {
                Canvas var3 = new Canvas();
                var3.setSize(36, 32);
                class165.field2410 = class496.method2951(0, 24695, class500.field7448, class419.field6254, var3, 0);
                class515.field7641 = class165.field2410.method1095(class392.method2411(class394.field5989, (byte) -115, class119.field1677, 0), class476.method2847(class113.field1576, class394.field5989, 0), true);
            }
            for (class150 var4 = (class150) class178.field2531.method1970(64); var4 != null; var4 = (class150) class178.field2531.method1960(24)) {
                class84.field1154.method2448(class165.field2410, false, (byte) 72, class515.field7641, false, var4.field2160, var4.field2168, arg1, var4.field2166, var4.field2163, var4.field2161, var4.field2162 ? class339.field5365.field4943 : null);
                var4.method2785((byte) -120);
            }
        }
        if (arg0 <= 43) {
            method47(4);
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)V")
    public static final void method47(int arg0) {
        field68++;
        if (class88.field1208 != null) {
            return;
        }
        class88.field1208 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        int var3 = 0;
        if (arg0 <= 5) {
            method48((byte) 70);
        }
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = var12 - (float) var13;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var9 = var8;
                    var10 = var18;
                    var11 = var16;
                } else if (var14 == 1) {
                    var9 = var17;
                    var11 = var16;
                    var10 = var8;
                } else if (var14 == 2) {
                    var9 = var16;
                    var11 = var18;
                    var10 = var8;
                } else if (var14 == 3) {
                    var11 = var8;
                    var9 = var16;
                    var10 = var17;
                } else if (var14 == 4) {
                    var9 = var18;
                    var10 = var16;
                    var11 = var8;
                } else if (var14 == 5) {
                    var9 = var8;
                    var10 = var16;
                    var11 = var17;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var23 << 8) + (var22 << 16) + var24 - 16777216;
                class88.field1208[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)V")
    public static void method48(byte arg0) {
        field64 = null;
        field74 = null;
        int var1 = -81 / ((51 - arg0) / 59);
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(I)V")
    public class5(int arg0) {
        this.field65 = arg0;
    }
}
