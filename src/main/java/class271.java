import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class271 extends class509 {

    @OriginalMember(owner = "client!om", name = "X", descriptor = "I")
    public static int field4323 = 13156520;

    @OriginalMember(owner = "client!om", name = "W", descriptor = "Lss;")
    public static class213 field4322 = new class213("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!om", name = "bb", descriptor = "I")
    public static int field4327 = -2;

    @OriginalMember(owner = "client!om", name = "V", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!om", name = "Y", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!om", name = "Z", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!om", name = "ab", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1834(int arg0, int arg1, boolean arg2) {
        ++field4321;
        if (!arg2) {
            field4322 = null;
        }
        return ~(540800 & arg1) != -1;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)[[I")
    public final int[][] method44(int arg0, int arg1) {
        ++field4324;
        if (arg0 != -1) {
            field4326 = -95;
        }
        int[][] var3 = super.field3081.method1050(arg1, arg0 ^ -99);
        if (super.field3081.field2432 && this.method3082(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field7592 * super.field7592;
            for (int var8 = 0; var8 < class276.field4375; ++var8) {
                int var9 = super.field7586[var7 - -(var8 % super.field7593)];
                var6[var8] = class272.method1842(255, var9) << 4;
                var5[var8] = class272.method1842(4080, var9 >> 4);
                var4[var8] = class272.method1842(16711680, var9) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(B)V")
    public static void method1835(byte arg0) {
        if (arg0 > -95) {
            method1835((byte) 20);
        }
        field4322 = null;
    }

    @OriginalMember(owner = "client!om", name = "g", descriptor = "(I)V")
    public static final void method1836(int arg0) {
        ++field4325;
        if (class216.field3671 == null) {
            int var1 = class50.field638;
            int var2 = class14.field149;
            int var3 = -var1 + class414.field6267 + -class489.field7400;
            int var4 = -var2 + class329.field5175 + -class219.field3715;
            if (var1 > arg0 || ~var3 < -1 || var2 > 0 || var4 > 0) {
                try {
                    Container var5;
                    if (class92.field1342 != null) {
                        var5 = class92.field1342;
                    } else {
                        var5 = class339.field5294.field27;
                    }
                    int var6 = 0;
                    int var7 = 0;
                    if (class92.field1342 == var5) {
                        Insets var8 = class92.field1342.getInsets();
                        var6 = var8.left;
                        var7 = var8.top;
                    }
                    Graphics var9 = var5.getGraphics();
                    var9.setColor(Color.black);
                    if (~var1 < -1) {
                        var9.fillRect(var6, var7, var1, class329.field5175);
                    }
                    if (var2 > 0) {
                        var9.fillRect(var6, var7, class414.field6267, var2);
                    }
                    if (var3 > 0) {
                        var9.fillRect(var6 - (-class414.field6267 + var3), var7, var3, class329.field5175);
                    }
                    if (~var4 < -1) {
                        var9.fillRect(var6, -var4 + var7 - -class329.field5175, class414.field6267, var4);
                        return;
                    }
                } catch (Exception var10) {
                    return;
                }
            }
        }
    }
}
