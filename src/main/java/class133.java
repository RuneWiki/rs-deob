import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class133 {

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field2326 = 0;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Lqe;")
    public static class168 field2329 = class66.method448("<col=00ff80>", 65);

    @OriginalMember(owner = "client!li", name = "k", descriptor = "[I")
    public static int[] field2335 = new int[100];

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field2331 = 0;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "Lqe;")
    private static class168 field2336 = class66.method448("Loaded sprites", -108);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "Lqe;")
    public static class168 field2325 = field2336;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "Ljava/awt/Image;")
    public static Image field2330;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)V")
    public static final void method895(int arg0, int arg1) {
        class68.field971 = -1;
        class68.field971 = -1;
        if (arg0 == 37) {
            class194.field3383 = 3.0D;
        } else if (arg0 == 50) {
            class194.field3383 = 4.0D;
        } else if (arg0 == 75) {
            class194.field3383 = 6.0D;
        } else {
            class194.field3383 = 8.0D;
        }
        field2327++;
        if (arg1 < 88) {
            method897(true);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Log;B)V")
    public static final void method896(class18 arg0, byte arg1) {
        field2328++;
        if (field2326 == arg0.field209 || arg0.field216 == -1 || arg0.field170 != 0 || arg0.field174 + 1 > class213.method1370(-1, arg0.field216).field4069[arg0.field189]) {
            int var2 = arg0.field209 - arg0.field214;
            int var3 = arg0.field167 * 128 + arg0.field171 * 64;
            int var4 = field2326 - arg0.field214;
            int var5 = arg0.field210 * 128 + arg0.field171 * 64;
            int var6 = arg0.field201 * 128 + arg0.field171 * 64;
            arg0.field166 = ((var2 - var4) * var5 + var4 * var6) / var2;
            int var7 = arg0.field176 * 128 + arg0.field171 * 64;
            arg0.field190 = ((var2 - var4) * var3 + var4 * var7) / var2;
        }
        if (arg0.field178 == 0) {
            arg0.field193 = 1024;
        }
        if (arg0.field178 == 1) {
            arg0.field193 = 1536;
        }
        arg0.field172 = 0;
        if (arg0.field178 == 2) {
            arg0.field193 = 0;
        }
        if (arg0.field178 == 3) {
            arg0.field193 = 512;
        }
        if (arg1 == 127) {
            arg0.field194 = arg0.field193;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
    public static void method897(boolean arg0) {
        field2335 = null;
        field2330 = null;
        if (arg0) {
            field2336 = null;
        }
        field2329 = null;
        field2325 = null;
        field2336 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Lvd;")
    public static final class17 method898(int arg0, int arg1, int arg2) {
        class177 var3 = class254.field4395[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class17 var4 = var3.field3101;
            var3.field3101 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)[Lfe;")
    public static final class15[] method899(byte arg0) {
        class15[] var1 = new class15[class85.field1331];
        field2334++;
        for (int var2 = 0; var2 < class85.field1331; var2++) {
            byte[] var3 = class7.field84[var2];
            int var4 = class85.field1332[var2] * class69.field978[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class92.field1457[class86.method571(var3[var6], 255)];
            }
            var1[var2] = new class15(class243.field4225, class150.field2597, class33.field415[var2], class54.field746[var2], class85.field1332[var2], class69.field978[var2], var5);
        }
        class246.method1613(0);
        if (arg0 != 8) {
            field2335 = null;
        }
        return var1;
    }
}
