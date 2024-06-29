import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class213 {

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Z")
    public static boolean field3774 = false;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lqk;")
    private static class207 field3777 = class24.method212(255, "Loading textures )2 ");

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lqk;")
    public static class207 field3778 = class24.method212(255, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "Lqk;")
    public static class207 field3783 = field3777;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Lii;")
    public static class255 field3776;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "[Lob;")
    public static class130[] field3780;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZLee;)V")
    public static final void method1516(boolean arg0, class280 arg1) {
        field3775++;
        class25.field524 = arg1;
        if (!arg0) {
            field3780 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static void method1517(byte arg0) {
        field3777 = null;
        field3783 = null;
        int var1 = -106 / ((-arg0 - 36) / 62);
        field3778 = null;
        field3780 = null;
        field3776 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)Lof;")
    public static final class266 method1518(byte arg0, int arg1) {
        field3782++;
        int var2 = -24 % (arg0 / 46);
        class266 var3 = (class266) class195.field3420.method758(false, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class287.field5124.method705(arg1, 0, -1);
        if (var4 == null) {
            return null;
        }
        class266 var5 = new class266();
        class149 var6 = new class149(var4);
        var6.field2593 = var6.field2568.length - 2;
        int var7 = var6.method1050(1272006568);
        int var8 = var6.field2568.length - (var7 + 2) - 12;
        var6.field2593 = var8;
        int var9 = var6.method1076(65280);
        var5.field4714 = var6.method1050(1272006568);
        var5.field4709 = var6.method1050(1272006568);
        var5.field4718 = var6.method1050(1272006568);
        var5.field4713 = var6.method1050(1272006568);
        int var10 = var6.method1045((byte) 127);
        if (var10 > 0) {
            var5.field4708 = new class275[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = var6.method1050(1272006568);
                class275 var13 = new class275(class54.method408(true, var12));
                var5.field4708[var11] = var13;
                while ((var12--) > 0) {
                    int var14 = var6.method1076(65280);
                    int var15 = var6.method1076(65280);
                    var13.method1863((byte) 86, new class178(var15), (long) var14);
                }
            }
        }
        var6.field2593 = 0;
        var5.field4707 = var6.method1035((byte) 37);
        var5.field4710 = new int[var9];
        var5.field4706 = new int[var9];
        int var16 = 0;
        var5.field4716 = new class207[var9];
        while (var8 > var6.field2593) {
            int var17 = var6.method1050(1272006568);
            if (var17 == 3) {
                var5.field4716[var16] = var6.method1034(-27220);
            } else if (var17 >= 100 || var17 == 21 || var17 == 38 || var17 == 39) {
                var5.field4706[var16] = var6.method1045((byte) -93);
            } else {
                var5.field4706[var16] = var6.method1076(65280);
            }
            var5.field4710[var16++] = var17;
        }
        class195.field3420.method759((long) arg1, 2, var5);
        return var5;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I")
    public static final int method1519(KeyEvent arg0, byte arg1) {
        int var2 = 94 / ((-arg1 - 87) / 39);
        int var3 = arg0.getKeyChar();
        field3781++;
        if (var3 == 8364) {
            return 128;
        } else {
            if (var3 <= 0 || var3 >= 256) {
                var3 = -1;
            }
            return var3;
        }
    }
}
