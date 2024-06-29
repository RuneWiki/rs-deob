import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class class324 {

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public int field5149;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public int field5164;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public int field5162;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5159 = "Discard";

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field5157 = 0;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Ljava/lang/String;")
    public static String field5163 = "Loading defaults - ";

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "Ln;")
    public static class309 field5161;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Lbi;")
    public static class94 field5150;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Z")
    public static boolean field5153;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZB)V", line = 9)
    public static final void method2246(boolean arg0, byte arg1) {
        if (arg1 != -39) {
            return;
        }
        class215.method1587(false);
        field5154++;
        if (class88.field1397 != 30 && class88.field1397 != 25) {
            return;
        }
        class83.field1345++;
        if (class83.field1345 < 50 && !arg0) {
            return;
        }
        class83.field1345 = 0;
        if (!class37.field539 && class279.field4426 != null) {
            class52.field812++;
            class341.field5443.method26(188, arg1 ^ 0xFFFFFFDE);
            try {
                class279.field4426.method178(0, class341.field5443.field5353, class341.field5443.field5342, false);
                class341.field5443.field5353 = 0;
            } catch (IOException var3) {
                class37.field539 = true;
            }
        }
        class215.method1587(false);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILlg;)V", line = 48)
    public static final void method2247(int arg0, class137 arg1) {
        field5158++;
        class137 var2 = class190.method1439(1, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class188.field3152;
            var3 = class313.field4973;
        } else {
            var3 = var2.field2533;
            var4 = var2.field2515;
        }
        if (arg0 > -46) {
            field5163 = (String) null;
        }
        class282.method1922(arg1, -66, var4, var3, false);
        class66.method639(arg1, var3, var4, false);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)V", line = 75)
    public static final void method2248(int arg0, byte arg1) {
        if (arg1 < 72) {
            field5159 = (String) null;
        }
        class101.field1631 = arg0;
        class344.method2410(3, (byte) 90);
        class344.method2410(4, (byte) 105);
        field5148++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIB)I", line = 92)
    public static final int method2249(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 3) {
            return 57;
        }
        int var4 = arg0 & 0x3;
        field5152++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 116)
    public static final void method2250(int arg0) {
        field5151++;
        int var1 = class101.field1628;
        int var2 = class56.field864 - class313.field4973 - var1;
        if (arg0 <= 0) {
            return;
        }
        int var3 = class12.field146;
        int var4 = class213.field3589 - class188.field3152 - var3;
        if (var1 <= 0 && var2 <= 0 && var3 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class120.field2076 != null) {
                var5 = class120.field2076;
            } else if (class271.field4321 == null) {
                var5 = class85.field1369.field910;
            } else {
                var5 = class271.field4321;
            }
            int var6 = 0;
            int var7 = 0;
            if (class271.field4321 == var5) {
                Insets var8 = class271.field4321.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class213.field3589);
            }
            if (var3 > 0) {
                var9.fillRect(var6, var7, class56.field864, var3);
            }
            if (var2 > 0) {
                var9.fillRect(class56.field864 + var6 - var2, var7, var2, class213.field3589);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class213.field3589 - var4, class56.field864, var4);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V", line = 188)
    public static final void method2251(boolean arg0) {
        if (arg0) {
            field5150 = (class94) null;
        }
        field5160++;
        class354.field5601.method470(12);
        class293.field4695.method470(12);
        class64.field1009.method470(12);
        class286.field4562.method470(12);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V", line = 202)
    public static void method2252(int arg0) {
        field5159 = null;
        if (arg0 != 0) {
            method2251(true);
        }
        field5150 = null;
        field5163 = null;
        field5161 = null;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(III)V", line = 231)
    public class324(int arg0, int arg1, int arg2) {
        this.field5149 = arg1;
        this.field5164 = arg0;
        this.field5162 = arg2;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
    public abstract void method344(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIB)V")
    public abstract void method346(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(III)V")
    public abstract void method347(int arg0, int arg1, int arg2);
}
