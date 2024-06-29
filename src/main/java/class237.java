import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class237 extends class476 {

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "Z")
    public boolean field3282 = false;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public int field3280 = -1;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field3276 = new Rectangle[100];

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "Lrb;")
    public static class283 field3281 = new class283(0, 12);

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "F")
    public static float field3283;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public int field3274;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public int field3277;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public int field3278;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public int field3279;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    public int field3286;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILjava/lang/String;IIZ)V")
    public static final void method1449(int arg0, String arg1, int arg2, int arg3, boolean arg4) {
        field3275++;
        class444 var5 = class222.method1381(arg2, arg0, -79);
        if (var5 == null) {
            return;
        }
        if (var5.field6536 != null) {
            class414 var6 = new class414();
            var6.field5907 = arg3;
            var6.field5896 = var5;
            var6.field5901 = arg1;
            var6.field5900 = var5.field6536;
            class47.method313(var6);
        }
        if (class494.field7155 != 9) {
            return;
        }
        boolean var7 = arg4;
        if (var5.field6384 != 0) {
            var7 = class164.method1150(var5, 0);
        }
        if (!var7 || !client.method3067(var5).method2552((byte) -49, arg3 - 1)) {
            return;
        }
        if (arg3 == 1) {
            class274.method1602(14, class343.field4966);
            class37.field562++;
            class187.method1250(arg2, var5.field6481, arg0, (byte) 14);
        }
        if (arg3 == 2) {
            class274.method1602(14, class341.field4937);
            class66.field947++;
            class187.method1250(arg2, var5.field6481, arg0, (byte) 79);
        }
        if (arg3 == 3) {
            class238.field3293++;
            class274.method1602(14, class336.field4896);
            class187.method1250(arg2, var5.field6481, arg0, (byte) 18);
        }
        if (arg3 == 4) {
            class364.field5232++;
            class274.method1602(14, class225.field3177);
            class187.method1250(arg2, var5.field6481, arg0, (byte) 1);
        }
        if (arg3 == 5) {
            class54.field773++;
            class274.method1602(14, class243.field3333);
            class187.method1250(arg2, var5.field6481, arg0, (byte) 82);
        }
        if (arg3 == 6) {
            class274.method1602(14, class72.field1032);
            class451.field6609++;
            class187.method1250(arg2, var5.field6481, arg0, (byte) 12);
        }
        if (arg3 == 7) {
            class274.method1602(14, class347.field4990);
            class478.field6913++;
            class187.method1250(arg2, var5.field6481, arg0, (byte) -127);
        }
        if (arg3 == 8) {
            class436.field6303++;
            class274.method1602(14, class197.field2890);
            class187.method1250(arg2, var5.field6481, arg0, (byte) 57);
        }
        if (arg3 == 9) {
            class397.field5702++;
            class274.method1602(14, class23.field317);
            class187.method1250(arg2, var5.field6481, arg0, (byte) 97);
        }
        if (arg3 == 10) {
            class274.method1602(14, class177.field2658);
            class114.field1828++;
            class187.method1250(arg2, var5.field6481, arg0, (byte) 105);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILbn;)Z")
    public static final boolean method1450(int arg0, class303 arg1) {
        field3284++;
        class103 var2 = class452.field6629.method603((byte) 101, arg1.method170((byte) 62));
        if (var2.field1649 == -1) {
            return true;
        }
        if (arg0 != 7) {
            method1450(-71, null);
        }
        class523 var3 = class10.field116.method1496((byte) 125, var2.field1649);
        return var3.field7666 == -1 ? true : var3.method3110(-20447);
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
    public static void method1451(int arg0) {
        field3276 = null;
        if (arg0 != -5) {
            field3283 = -0.279677F;
        }
        field3281 = null;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(I)V")
    public class237(int arg0) {
        this.field3280 = arg0;
    }
}
