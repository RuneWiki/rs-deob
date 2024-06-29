import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class163 extends class61 {

    @OriginalMember(owner = "client!me", name = "j", descriptor = "[I")
    public static int[] field2920 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Llc;")
    private static class143 field2924 = class66.method374("Unable to find ", -1);

    @OriginalMember(owner = "client!me", name = "p", descriptor = "Llc;")
    public static class143 field2926 = class66.method374("Verbindung zum Update)2Server hergestellt)3", -1);

    @OriginalMember(owner = "client!me", name = "r", descriptor = "Llc;")
    public static class143 field2928 = class66.method374("", -1);

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Llc;")
    public static class143 field2923 = field2924;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "Llc;")
    public static class143 field2931 = class66.method374("blanc:", -1);

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public int field2921;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "I")
    public int field2929;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public static final void method1073(byte arg0) {
        int var1 = class141.field2459;
        int var2 = class257.field4620;
        field2927++;
        int var3 = class159.field2883 - class10.field222 - var1;
        int var4 = class217.field3979 - class269.field4820 - var2;
        if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
            try {
                int var5 = 0;
                Container var6;
                if (class23.field384 != null) {
                    var6 = class23.field384;
                } else if (class8.field155 == null) {
                    var6 = class4.field62.field1469;
                } else {
                    var6 = class8.field155;
                }
                int var7 = 0;
                if (class8.field155 == var6) {
                    Insets var8 = class8.field155.getInsets();
                    var7 = var8.left;
                    var5 = var8.top;
                }
                Graphics var9 = var6.getGraphics();
                var9.setColor(Color.black);
                if (var1 > 0) {
                    var9.fillRect(var7, var5, var1, class217.field3979);
                }
                if (var2 > 0) {
                    var9.fillRect(var7, var5, class159.field2883, var2);
                }
                if (var3 > 0) {
                    var9.fillRect(class159.field2883 + var7 - var3, var5, var3, class217.field3979);
                }
                if (var4 > 0) {
                    var9.fillRect(var7, class217.field3979 + var5 - var4, class159.field2883, var4);
                }
            } catch (Exception var10) {
            }
        }
        if (arg0 != -3) {
            method1073((byte) 11);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
    public static void method1074(byte arg0) {
        field2931 = null;
        field2923 = null;
        int var1 = -61 / ((arg0 - 48) / 56);
        field2926 = null;
        field2920 = null;
        field2928 = null;
        field2924 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
    public static final void method1075(int arg0, int arg1, int arg2) {
        class149 var3 = class49.method300(arg1 ^ 0xFFFFE61C, arg2);
        if (arg1 != -6626) {
            method1075(-73, 105, 122);
        }
        int var4 = var3.field2737;
        field2930++;
        int var5 = var3.field2738;
        int var6 = var3.field2750;
        int var7 = class13.field238[var5 - var4];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        class203.method1384(1, ~var8 & class148.field2691[var6] | var8 & arg0 << var4, var6);
    }
}
