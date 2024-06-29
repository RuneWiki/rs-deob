import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class234 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Leg;")
    public static class37 field4033 = class174.method1167("<col=40ff00>", 97);

    @OriginalMember(owner = "client!re", name = "b", descriptor = "[[I")
    public static int[][] field4034 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field4040 = 0;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field4037 = 0;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Z")
    public static boolean field4042 = true;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Leg;")
    public static class37 field4041 = class174.method1167("", 68);

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field4044 = -1;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Ljl;")
    public static class101 field4043;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "Ljl;")
    public static class101 field4045;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "[I")
    public static int[] field4035;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIZ)I")
    public static final int method1606(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4036++;
        int var5 = 65536 - class76.field1189[arg3 * 1024 / arg2] >> 1;
        if (arg4) {
            method1606(-20, 83, 9, -54, false);
        }
        return ((65536 - var5) * arg1 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static final void method1607(int arg0) {
        field4038++;
        int var1 = class118.field1996;
        int var2 = class131.field2193 - class249.field4479 - var1;
        if (arg0 != 11) {
            method1607(-8);
        }
        int var3 = class46.field721;
        int var4 = class37.field549 - class199.field3390 - var3;
        if (var1 <= 0 && var2 <= 0 && var3 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class112.field1911 != null) {
                var5 = class112.field1911;
            } else if (class71.field1114 == null) {
                var5 = class177.field2957.field3504;
            } else {
                var5 = class71.field1114;
            }
            int var6 = 0;
            int var7 = 0;
            if (class71.field1114 == var5) {
                Insets var8 = class71.field1114.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class37.field549);
            }
            if (var3 > 0) {
                var9.fillRect(var6, var7, class131.field2193, var3);
            }
            if (var2 > 0) {
                var9.fillRect(var6 + class131.field2193 - var2, var7, var2, class37.field549);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class37.field549 + var7 - var4, class131.field2193, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Leg;IZ)V")
    public static final void method1608(class37 arg0, int arg1, boolean arg2) {
        field4046++;
        if (arg1 != 4) {
            field4044 = 82;
        }
        if (arg2) {
            try {
                class231.field3953.getAppletContext().showDocument(arg0.method259(class231.field3953.getCodeBase(), (byte) 0), "_blank");
            } catch (Exception var3) {
            }
        } else {
            try {
                class231.field3953.getAppletContext().showDocument(arg0.method259(class231.field3953.getCodeBase(), (byte) 0), "_top");
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static void method1609(int arg0) {
        field4035 = null;
        if (arg0 != -16348) {
            field4045 = null;
        }
        field4043 = null;
        field4041 = null;
        field4033 = null;
        field4045 = null;
        field4034 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IILjl;I)[Lrk;")
    public static final class14[] method1610(int arg0, int arg1, class101 arg2, int arg3) {
        field4039++;
        if (class131.method941(arg0, arg2, arg1, -102)) {
            if (arg3 != 10) {
                field4044 = 76;
            }
            return class29.method169(arg3 ^ 0xFFFFFFBC);
        } else {
            return null;
        }
    }
}
