import java.io.UnsupportedEncodingException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class174 extends class69 {

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "J")
    public static volatile long field3110 = 0L;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    public static int field3120 = 0;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "Ljava/util/Random;")
    public static Random field3138 = new Random();

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "[I")
    public static int[] field3139 = new int[] { 4, 4, 1, 2, 6, 4, 2, 50, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "Lwf;")
    public static class16 field3140 = new class16(30);

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "Laa;")
    public static class39 field3143 = new class39();

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "S")
    public static short field3144 = 205;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public int field3114;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public int field3115;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public int field3116;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public int field3117;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    public int field3119;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
    public int field3122;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public int field3124;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public int field3126;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public int field3127;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
    public int field3130;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public int field3131;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
    public int field3132;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public int field3134;

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
    public int field3135;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    public int field3136;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    public int field3137;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "Lkf;")
    public class110 field3112;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "Ldk;")
    public class224 field3141;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "Lod;")
    public class244 field3129;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "Ltf;")
    public class277 field3113;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public final void method1247(int arg0) {
        if (arg0 != 32) {
            method1251(false, 76);
        }
        this.field3141 = null;
        this.field3113 = null;
        this.field3112 = null;
        this.field3129 = null;
        field3123++;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
    public static void method1248(int arg0) {
        field3139 = null;
        field3138 = null;
        if (arg0 != 24962) {
            method1253((String) null, (byte) 96);
        }
        field3140 = null;
        field3143 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)I")
    public static final int method1249(int arg0, int arg1, int arg2) {
        field3118++;
        int var3 = class114.method923(103, arg1 - 1, arg2 + -1) + class114.method923(51, arg1 + 1, arg2 - 1) + class114.method923(-97, arg1 + -1, arg2 + 1) + class114.method923(65, arg1 - -1, arg2 + 1);
        if (arg0 < 112) {
            method1252(true, (byte) 72, -78, true, -124);
        }
        int var4 = class114.method923(-89, arg1 - 1, arg2) - (-class114.method923(-85, arg1 + 1, arg2) - class114.method923(-97, arg1, arg2 - 1) - class114.method923(-127, arg1, arg2 + 1));
        int var5 = class114.method923(68, arg1, arg2);
        return var4 / 8 + var3 / 16 + var5 / 4;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lmf;I)V")
    public static final void method1250(class26 arg0, int arg1) {
        field3111++;
        if (arg1 != 1) {
            return;
        }
        for (class269 var2 = (class269) class6.field101.method264(-56); var2 != null; var2 = (class269) class6.field101.method269((byte) 7)) {
            if (var2.field4660 == arg0) {
                if (var2.field4671 != null) {
                    class236.field4116.method1711(var2.field4671);
                    var2.field4671 = null;
                }
                var2.method501(0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZI)I")
    public static final int method1251(boolean arg0, int arg1) {
        field3133++;
        if (!(arg1 < 65 || arg1 > 90) || !(arg1 < 192 || arg1 > 222 || arg1 == 215)) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else if (arg0) {
            return arg1;
        } else {
            return 68;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZBIZI)V")
    public static final void method1252(boolean arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        field3121++;
        int var5 = -128 / ((-arg1 - 34) / 49);
        class244.method1675(arg2, 126, arg3, arg4, arg0, class118.field2213.length - 1, 0);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;B)Lha;")
    public static final class46 method1253(String arg0, byte arg1) {
        field3128++;
        byte[] var2;
        try {
            if (arg1 != -33) {
                return null;
            }
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg0.getBytes();
        }
        class46 var3 = new class46();
        var3.field768 = var2;
        var3.field762 = 0;
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field762++] = var2[var4];
            }
        }
        return var3;
    }
}
