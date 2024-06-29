import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class18 extends class54 {

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "[I")
    public int[] field285 = new int[5];

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "[Lih;")
    public class94[] field289 = new class94[5];

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "I")
    public int field301 = 0;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public int field281;

    @OriginalMember(owner = "client!bf", name = "ab", descriptor = "I")
    public int field302;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public int field278;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public int field279;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field273 = 2301979;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "Ldc;")
    public static class37 field271 = class185.method1233((byte) 86, "Okay");

    @OriginalMember(owner = "client!bf", name = "Y", descriptor = "[I")
    public static int[] field300 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public int field274;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public int field276;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public int field288;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
    public int field293;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "Ljh;")
    public class105 field287;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "Lji;")
    public static class106 field277;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "Lkh;")
    public class116 field284;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "Lnh;")
    public class149 field295;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "Lqj;")
    public class184 field292;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "Lbf;")
    public class18 field283;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "Lw;")
    public class237 field286;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "Ldj;")
    public static class44 field298;

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "Lfc;")
    public class58 field299;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "Z")
    public boolean field282;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "Z")
    public boolean field294;

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "Z")
    public boolean field297;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "[Lji;")
    public static class106[] field270;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "[S")
    public static short[] field268;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Z")
    public static final boolean method122(int arg0, int arg1) {
        field269++;
        if (arg1 != -128) {
            field300 = null;
        }
        return (arg0 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(III)V")
    public class18(int arg0, int arg1, int arg2) {
        this.field281 = arg1;
        this.field278 = this.field302 = arg0;
        this.field279 = arg2;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)Z")
    public static final boolean method123(int arg0, int arg1) {
        int var2 = -77 % ((53 - arg1) / 40);
        field280++;
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLwa;Lwa;)V")
    public static final void method124(byte arg0, class238 arg1, class238 arg2) {
        class77.field1355 = arg2;
        int var3 = 36 / ((arg0 + 3) / 56);
        class137.field2672 = arg1;
        field291++;
        class75.field1321 = class137.field2672.method1559(26143, 3);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lia;III)V")
    public static final void method125(class88 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class238.field4372) {
            class18 var4 = class180.field3354[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field295 != null && var4.field295.field2829.method590()) {
                arg0.method585(var4.field295.field2829, 128, 0, 0, true);
            }
        }
        if (arg3 < class238.field4372) {
            class18 var5 = class180.field3354[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field295 != null && var5.field295.field2829.method590()) {
                arg0.method585(var5.field295.field2829, 0, 0, 128, true);
            }
        }
        if (arg2 < class238.field4372 && arg3 < client.field682) {
            class18 var6 = class180.field3354[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field295 != null && var6.field295.field2829.method590()) {
                arg0.method585(var6.field295.field2829, 128, 0, 128, true);
            }
        }
        if (arg2 < class238.field4372 && arg3 > 0) {
            class18 var7 = class180.field3354[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field295 != null && var7.field295.field2829.method590()) {
                arg0.method585(var7.field295.field2829, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/lang/String;B)Ldc;")
    public static final class37 method126(String arg0, byte arg1) {
        field272++;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg0.getBytes();
        }
        class37 var3 = new class37();
        var3.field733 = 0;
        var3.field743 = var2;
        int var4 = 127 / ((-arg1 - 11) / 59);
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var3.field733++] = var2[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
    public static void method127(int arg0) {
        field268 = null;
        if (arg0 != 255) {
            return;
        }
        field277 = null;
        field300 = null;
        field271 = null;
        field270 = null;
        field298 = null;
    }
}
