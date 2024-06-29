import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class201 {

    @OriginalMember(owner = "client!bs", name = "o", descriptor = "I")
    public int field2638;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
    public int field2630;

    @OriginalMember(owner = "client!bs", name = "p", descriptor = "I")
    public int field2639;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
    public int field2632;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "B")
    public byte field2625;

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "I")
    public int field2636;

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "Lvt;")
    public static class344 field2631 = new class344("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "Lju;")
    public class213 field2628;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "Lti;")
    public class300 field2626;

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "Ljt;")
    public class490 field2635;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "Lka;")
    public class572 field2627;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "([BILjava/lang/String;I)I")
    public static final int method1284(byte[] arg0, int arg1, String arg2, int arg3) {
        field2624++;
        if (arg3 != 63) {
            field2637 = -90;
        }
        int var4 = arg2.length();
        int var5 = arg1;
        for (int var6 = 0; var6 < var4; var6++) {
            char var7 = arg2.charAt(var6);
            if (var7 <= '\u007F') {
                arg0[var5++] = (byte) var7;
            } else if (var7 > '߿') {
                arg0[var5++] = (byte) (class292.method1790(921579, var7) >> 12);
                arg0[var5++] = (byte) class292.method1790(class143.method783(var7, 4086) >> 6, 128);
                arg0[var5++] = (byte) class292.method1790(128, class143.method783(63, var7));
            } else {
                arg0[var5++] = (byte) (class292.method1790(var7, 12313) >> 6);
                arg0[var5++] = (byte) class292.method1790(128, class143.method783(var7, 63));
            }
        }
        return var5 - arg1;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
    public static void method1285(int arg0) {
        field2631 = null;
        if (arg0 != 0) {
            method1284(null, -36, null, -30);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method1286(boolean arg0, String arg1) {
        field2634++;
        if (!class280.field3669) {
            return;
        }
        boolean var2 = false;
        if (!arg0) {
            return;
        }
        int var3 = class512.field7133;
        int[] var4 = class514.field7144;
        for (int var5 = 0; var5 < var3; var5++) {
            class20 var6 = class364.field5092[var4[var5]];
            if (var6 != null && class147.field1899 != var6 && var6.field257 != null && var6.field257.equalsIgnoreCase(arg1)) {
                class641.field9316++;
                class118.method650(true, class268.field3421);
                class272.field3457.method3044(90, class167.field2109);
                class272.field3457.method3082(var4[var5], 128);
                class272.field3457.method3054(field2637, -101);
                class272.field3457.method3080(-96, 0);
                class272.field3457.method3044(73, class476.field6707);
                class18.method84(var6.field419[0], 0, 0, var6.method104((byte) -92), var6.field417[0], var6.method104((byte) -92), 0, -2, true);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class534.method2970(class238.field3048.method2157(class245.field3103, 4074) + arg1, (byte) -65);
        }
        if (class280.field3669) {
            class606.method3471(113);
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(BIIIII)V")
    public class201(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2638 = arg1;
        this.field2630 = arg3;
        this.field2639 = arg4;
        this.field2632 = arg5;
        this.field2625 = arg0;
        this.field2636 = arg2;
    }
}
