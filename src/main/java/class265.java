import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class265 extends class123 {

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public static int field4694 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "Lli;")
    public static class185 field4696 = class245.method1649("Texturen geladen)3", -32);

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "Lli;")
    public static class185 field4699 = class245.method1649("details", 127);

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "Ltf;")
    public static class217 field4700 = new class217();

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method1807(int arg0) {
        field4699 = null;
        field4696 = null;
        if (arg0 == 0) {
            field4700 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)V")
    public static final void method1808(int arg0, byte arg1) {
        field4698++;
        class127.field2283--;
        if (class127.field2283 == arg0) {
            return;
        }
        class190.method1366(class37.field587, arg0 + 1, class37.field587, arg0, class127.field2283 - arg0);
        class190.method1366(class107.field1922, arg0 + 1, class107.field1922, arg0, class127.field2283 - arg0);
        if (arg1 <= 124) {
            method1808(-118, (byte) -25);
        }
        class190.method1369(class158.field3004, arg0 + 1, class158.field3004, arg0, class127.field2283 - arg0);
        class190.method1368(class55.field936, arg0 + 1, class55.field936, arg0, class127.field2283 - arg0);
        class190.method1371(class162.field3052, arg0 + 1, class162.field3052, arg0, class127.field2283 - arg0);
        class190.method1369(class78.field1353, arg0 + 1, class78.field1353, arg0, class127.field2283 - arg0);
        class190.method1369(class49.field809, arg0 + 1, class49.field809, arg0, class127.field2283 - arg0);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1809(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4701++;
        int var8 = 2048 - arg5 & 0x7FF;
        int var9 = 2048 - arg0 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg6;
        if (var9 != 0) {
            int var13 = class167.field3110[var9];
            var11 = -arg6 * var13 >> 16;
            int var14 = class167.field3112[var9];
            var12 = arg6 * var14 >> 16;
        }
        if (var8 != 0) {
            int var15 = class167.field3110[var8];
            var10 = var12 * var15 >> 16;
            int var16 = class167.field3112[var8];
            var12 = var12 * var16 >> 16;
        }
        if (arg3 <= 89) {
            method1807(-125);
        }
        class3.field69 = arg5;
        class136.field2550 = arg0;
        class113.field2039 = arg1 - var10;
        class268.field4745 = arg7 - var12;
        class7.field157 = arg4 - var11;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;I)Lli;")
    public static final class185 method1810(String arg0, int arg1) {
        field4695++;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg0.getBytes();
        }
        class185 var3 = new class185();
        var3.field3437 = 0;
        var3.field3411 = var2;
        int var4 = -101 / ((arg1 - 43) / 49);
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var3.field3437++] = var2[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lli;IZ)V")
    public static final void method1811(class185 arg0, int arg1, boolean arg2) {
        byte var3 = 4;
        field4697++;
        int var4 = var3 + 6;
        int var5 = class205.field3743.method1853(arg0, 250);
        int var6 = arg1 + var3;
        int var7 = class205.field3743.method1829(arg0, 250) * 13;
        class159.method1130(var4 - var3, -var3 + var6, var5 + var3 + var3, var3 + var3 + var7, 0);
        class159.method1126(var4 - var3, var6 - var3, var3 + var5 + var3, var3 + var7 + var3, 16777215);
        class205.field3743.method1845(arg0, var4, var6, var5, var7, 16777215, -1, 1, 1, 0);
        class142.method1017(var6 - var3, var4 - var3, (byte) -105, var3 + var5 + var3, var3 + var7 - -var3);
        if (!arg2) {
            class274.method1878(var7, var6, 0, var4, var5);
            return;
        }
        try {
            Graphics var8 = class30.field500.getGraphics();
            class33.field540.method274(957, var8, 0, 0);
        } catch (Exception var9) {
            class30.field500.repaint();
        }
    }
}
