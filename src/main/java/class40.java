import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ua")
public class class40 extends class31 {

    @OriginalMember(owner = "mapview!ua", name = "n", descriptor = "[J")
    public static long[] field506 = new long[32];

    @OriginalMember(owner = "mapview!ua", name = "v", descriptor = "Lea;")
    public static class10 field514 = class3.method8("Legende", -35);

    @OriginalMember(owner = "mapview!ua", name = "r", descriptor = "Lea;")
    public static class10 field510 = class3.method8("Key", -62);

    @OriginalMember(owner = "mapview!ua", name = "y", descriptor = "Lea;")
    public static class10 field517 = class3.method8("Makeover Mage", -17);

    @OriginalMember(owner = "mapview!ua", name = "q", descriptor = "I")
    public static int field509 = 0;

    @OriginalMember(owner = "mapview!ua", name = "t", descriptor = "Lea;")
    public static class10 field512 = class3.method8("Silver Shop", -125);

    @OriginalMember(owner = "mapview!ua", name = "o", descriptor = "Lea;")
    public static class10 field507 = class3.method8("Next page", -73);

    @OriginalMember(owner = "mapview!ua", name = "x", descriptor = "Lea;")
    public static class10 field516 = class3.method8("Please wait)3)3)3 Rendering Map", -78);

    @OriginalMember(owner = "mapview!ua", name = "w", descriptor = "[J")
    public static long[] field515 = new long[32];

    @OriginalMember(owner = "mapview!ua", name = "s", descriptor = "Lea;")
    public static class10 field511 = class3.method8("Skirt Shop", 120);

    @OriginalMember(owner = "mapview!ua", name = "B", descriptor = "Lea;")
    public static class10 field520 = class3.method8("Bank", -31);

    @OriginalMember(owner = "mapview!ua", name = "A", descriptor = "Z")
    public static boolean field519 = true;

    @OriginalMember(owner = "mapview!ua", name = "C", descriptor = "Z")
    public static boolean field521 = false;

    @OriginalMember(owner = "mapview!ua", name = "z", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "mapview!ua", name = "u", descriptor = "[B")
    public static byte[] field513;

    @OriginalMember(owner = "mapview!ua", name = "p", descriptor = "[I")
    public static int[] field508;

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(Lea;Ljava/awt/Color;II)V", line = 38)
    public static final void method253(class10 arg0, Color arg1, int arg2, int arg3) {
        try {
            Graphics var4 = class35.field479.getGraphics();
            if (class20.field217 == null) {
                class20.field217 = new Font("Helvetica", 1, 13);
                class33.field444 = class35.field479.getFontMetrics(class20.field217);
            }
            if (class10.field82) {
                class10.field82 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class6.field36, class4.field27);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class6.field40 == null) {
                    class6.field40 = class35.field479.createImage(304, 34);
                }
                Graphics var5 = class6.field40.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, arg3);
                var5.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
                var5.setFont(class20.field217);
                var5.setColor(Color.white);
                arg0.method51((byte) 75, var5, (304 - arg0.method62(class33.field444, false)) / 2, 22);
                var4.drawImage(class6.field40, class6.field36 / 2 - 152, class4.field27 / 2 - 18, null);
            } catch (Exception var10) {
                int var7 = class4.field27 / 2 - 18;
                int var8 = class6.field36 / 2 - 152;
                var4.setColor(arg1);
                var4.drawRect(var8, var7, 303, 33);
                var4.fillRect(var8 + 2, var7 + 2, arg2 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var7 - -1, 301, 31);
                var4.fillRect(arg2 * 3 + var8 + 2, var7 - -2, 300 - arg2 * 3, 30);
                var4.setFont(class20.field217);
                var4.setColor(Color.white);
                arg0.method51((byte) 103, var4, var8 + (304 - arg0.method62(class33.field444, false)) / 2, var7 + 22);
            }
        } catch (Exception var11) {
            class35.field479.repaint();
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "b", descriptor = "(I)V", line = 97)
    public static void method254(int arg0) {
        field516 = null;
        field507 = null;
        field514 = null;
        field510 = null;
        field517 = null;
        field513 = null;
        field515 = null;
        field512 = null;
        field511 = null;
        if (arg0 != -1) {
            method255(null, -85);
        }
        field520 = null;
        field506 = null;
        field508 = null;
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "([BI)V", line = 134)
    public static final void method255(byte[] arg0, int arg1) {
        class11 var2 = new class11(arg0);
        var2.field86 = arg0.length - 2;
        class36.field491 = var2.method74((byte) -96);
        class19.field208 = new int[class36.field491];
        class6.field43 = new int[class36.field491];
        class4.field31 = new int[class36.field491];
        mapview.field338 = new byte[class36.field491][];
        class19.field209 = new int[class36.field491];
        var2.field86 = arg0.length - class36.field491 * 8 - 7;
        class18.field187 = var2.method74((byte) -102);
        class7.field54 = var2.method74((byte) -88);
        int var3 = (var2.method78(-55) & 0xFF) + 1;
        for (int var4 = 0; var4 < class36.field491; var4++) {
            class4.field31[var4] = var2.method74((byte) -121);
        }
        for (int var5 = 0; var5 < class36.field491; var5++) {
            class6.field43[var5] = var2.method74((byte) -113);
        }
        for (int var6 = 0; var6 < class36.field491; var6++) {
            class19.field208[var6] = var2.method74((byte) -94);
        }
        for (int var7 = 0; var7 < class36.field491; var7++) {
            class19.field209[var7] = var2.method74((byte) -93);
        }
        var2.field86 = arg0.length - class36.field491 * 8 - (var3 + -1) * 3 - 7;
        class33.field443 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class33.field443[var8] = var2.method79((byte) -121);
            if (class33.field443[var8] == 0) {
                class33.field443[var8] = 1;
            }
        }
        var2.field86 = 0;
        for (int var9 = arg1; var9 < class36.field491; var9++) {
            int var10 = class19.field208[var9];
            int var11 = class19.field209[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            mapview.field338[var9] = var13;
            int var14 = var2.method78(123);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method85((byte) -125);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var10 * var17 + var16] = var2.method85((byte) -111);
                    }
                }
            }
        }
    }
}
