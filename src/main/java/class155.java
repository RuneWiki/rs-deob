import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class155 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field2893 = -1;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Lhj;")
    public static class69 field2896 = class181.method1318(")3runescape)3com)4l=", (byte) -117);

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "Lhj;")
    public static class69 field2902 = class181.method1318("<col=ffff00>", (byte) -111);

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Lhj;")
    public static class69 field2894 = class181.method1318(" zuerst von Ihrer Freunde)2Liste(Q", (byte) -126);

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "Lhj;")
    public static class69 field2903 = class181.method1318("Lade)3)3)3", (byte) -108);

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "Ld;")
    public static class225 field2897;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZZLhj;)V")
    public static final void method1175(boolean arg0, boolean arg1, class69 arg2) {
        byte var3 = 4;
        field2899++;
        int var4 = var3 + 6;
        if (arg0) {
            field2894 = null;
        }
        int var5 = var3 + 6;
        int var6 = field2897.method1601(arg2, 250);
        int var7 = field2897.method1594(arg2, 250) * 13;
        class15.method77(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 0);
        class15.method82(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var7 + var3, 16777215);
        field2897.method1599(arg2, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class224.method1588(var7 - (-var3 - var3), (byte) 59, var5 - var3, -var3 + var4, var6 + var3 + var3);
        if (!arg1) {
            class210.method1515(var4, (byte) -122, var5, var6, var7);
            return;
        }
        try {
            Graphics var8 = class212.field3862.getGraphics();
            class84.field1623.method51(0, 0, -3, var8);
        } catch (Exception var9) {
            class212.field3862.repaint();
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public static void method1176(int arg0) {
        field2903 = null;
        field2896 = null;
        if (arg0 < 20) {
            method1178(true);
        }
        field2897 = null;
        field2894 = null;
        field2902 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)Lkc;")
    public static final class264 method1177(byte arg0) {
        field2901++;
        int var1 = class69.field1350[0] * class113.field2167[0];
        byte[] var2 = class157.field2919[0];
        int[] var3 = new int[var1];
        if (arg0 <= 108) {
            return null;
        }
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class50.field841[class69.method443(255, var2[var4])];
        }
        class264 var5 = new class264(class229.field4196, class53.field941, class138.field2585[0], class88.field1682[0], class69.field1350[0], class113.field2167[0], var3);
        class229.method1636((byte) 53);
        return var5;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)Z")
    public static final boolean method1178(boolean arg0) {
        field2898++;
        if (arg0) {
            field2897 = null;
        }
        if (class200.field3615 != 0) {
            try {
                if ((Boolean) class242.field4444.method480(class36.field508.field601, 40)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }
}
