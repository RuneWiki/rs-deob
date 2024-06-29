import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class236 extends class137 {

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3692 = "yellow:";

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public static int field3700 = 0;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3694 = "Please remove ";

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "Z")
    public static boolean field3701 = true;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "[Ltb;")
    public static class72[] field3712 = new class72[50];

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public int field3693;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public int field3695;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public int field3696;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public int field3697;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public int field3698;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public int field3699;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public int field3702;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public int field3703;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public int field3707;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
    public int field3709;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
    public int field3711;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
    public int field3714;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "Lgi;")
    public static class164 field3710;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "Ljava/awt/Font;")
    public static Font field3706;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "[I")
    public static int[] field3705;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3708++;
        if (arg5 < 128 || arg2 < 128 || arg5 > 13056 || arg2 > 13056) {
            class292.field4792 = -1;
            class145.field2325 = -1;
            return;
        }
        int var8 = class60.method387(-18796, arg2, arg5, class214.field3389) - arg1;
        int var9 = var8 - class182.field3028;
        int var10 = arg5 - class135.field2184;
        int var11 = arg2 - class123.field1960;
        int var12 = class136.field2193[class95.field1506];
        int var13 = class136.field2191[class95.field1506];
        int var14 = class136.field2191[class211.field3361];
        if (arg0 <= 69) {
            field3692 = null;
        }
        int var15 = class136.field2193[class211.field3361];
        int var16 = var10 * var15 + var11 * var14 >> 16;
        int var17 = var11 * var15 - (var10 * var14) >> 16;
        int var19 = var9 * var12 - var13 * var17 >> 16;
        int var20 = var9 * var13 + var12 * var17 >> 16;
        if (var20 < 50) {
            class292.field4792 = -1;
            class145.field2325 = -1;
        } else {
            class292.field4792 = arg3 + ((var16 << 9) / var20);
            class145.field2325 = arg6 + ((var19 << 9) / var20);
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)V")
    public static final void method1622(int arg0) {
        class285.method1932(32441, 5);
        field3704++;
        class161.method1108(-85, 5);
        class124.method853(-128, 5);
        class145.method993(5, -101);
        class53.method330(0, 5);
        class133.method899(false, 5);
        class4.method56(5, (byte) 124);
        int var1 = 116 / ((arg0 - 14) / 58);
        class110.method774(5, false);
        class286.method1942(-1, 5);
        class270.method1795(5, -126);
        class299.method2057((byte) 83, 5);
        class63.method412((byte) -80, 5);
        class230.method1594(-13900, 5);
        class232.method1603(1, 5);
        class310.method2103(5, 8);
        class122.method836(5, (byte) 90);
        class55.method350(109, 5);
        class192.method1348(0, 5);
        class266.method1782(50, -119);
        class95.method689(5, -95);
        class217.method1485(54, 5);
        class52.field762.method1880(-76, 5);
        class255.field4210.method1880(-111, 5);
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V")
    public static final void method1623(byte arg0) {
        class45.field664.method1876((byte) 115);
        if (arg0 < 82) {
            method1622(-82);
        }
        field3713++;
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V")
    public static void method1624(int arg0) {
        if (arg0 != -998728343) {
            return;
        }
        field3705 = null;
        field3710 = null;
        field3694 = null;
        field3706 = null;
        field3692 = null;
        field3712 = null;
    }
}
