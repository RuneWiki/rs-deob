import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class321 {

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "[I")
    public static int[] field4775 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    public static int field4785 = -50;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "Z")
    public static boolean field4786 = false;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public int field4762;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public int field4763;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public int field4764;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public int field4765;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public int field4766;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public int field4767;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public int field4769;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public int field4774;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public int field4777;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public int field4778;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public int field4779;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public int field4781;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public int field4782;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public int field4783;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public int field4784;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    public int field4787;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public int field4788;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    public int field4789;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "Ll;")
    public static class315 field4780;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static final void method2112(int arg0) {
        field4771++;
        int var1 = class450.field6458 * 128 + 64;
        int var2 = class440.field6377 * 128 + 64;
        int var3 = class248.method1621(var1, var2, -13853, class268.field3973) - class106.field1402;
        if (class131.field1722 < 100) {
            if (var1 > class326.field4829) {
                class326.field4829 += (var1 - class326.field4829) * class131.field1722 / 1000 + class279.field4097;
                if (class326.field4829 > var1) {
                    class326.field4829 = var1;
                }
            }
            if (var1 < class326.field4829) {
                class326.field4829 -= (class326.field4829 - var1) * class131.field1722 / 1000 + class279.field4097;
                if (var1 > class326.field4829) {
                    class326.field4829 = var1;
                }
            }
            if (var3 > class289.field4331) {
                class289.field4331 += (var3 - class289.field4331) * class131.field1722 / 1000 + class279.field4097;
                if (var3 < class289.field4331) {
                    class289.field4331 = var3;
                }
            }
            if (class289.field4331 > var3) {
                class289.field4331 -= (class289.field4331 - var3) * class131.field1722 / 1000 + class279.field4097;
                if (var3 > class289.field4331) {
                    class289.field4331 = var3;
                }
            }
            if (class279.field4099 < var2) {
                class279.field4099 += (var2 - class279.field4099) * class131.field1722 / 1000 + class279.field4097;
                if (var2 < class279.field4099) {
                    class279.field4099 = var2;
                }
            }
            if (class279.field4099 > var2) {
                class279.field4099 -= (class279.field4099 - var2) * class131.field1722 / 1000 + class279.field4097;
                if (var2 > class279.field4099) {
                    class279.field4099 = var2;
                }
            }
        } else {
            class279.field4099 = class440.field6377 * 128 + 64;
            class326.field4829 = class450.field6458 * 128 + 64;
            class289.field4331 = class248.method1621(class326.field4829, class279.field4099, arg0 + 247220032, class268.field3973) - class106.field1402;
        }
        if (arg0 != -247233885) {
            field4786 = false;
        }
        int var4 = class191.field2662 * 128 + 64;
        int var5 = class424.field6192 * 128 + 64;
        int var6 = class248.method1621(var4, var5, -13853, class268.field3973) - class393.field5720;
        int var7 = var4 - class326.field4829;
        int var8 = var6 - class289.field4331;
        int var9 = var5 - class279.field4099;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class47.field716) {
            class47.field716 += (var11 - class47.field716 >> 3) * class432.field6283 / 1000 + class124.field1614 << 3;
            if (var11 < class47.field716) {
                class47.field716 = var11;
            }
        }
        if (class47.field716 > var11) {
            class47.field716 -= (class47.field716 - var11 >> 3) * class432.field6283 / 1000 + class124.field1614 << 3;
            if (class47.field716 < var11) {
                class47.field716 = var11;
            }
        }
        int var13 = var12 - class7.field88;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class7.field88 += class432.field6283 * var14 / 1000 + class124.field1614 << 3;
            class7.field88 &= 0x3FFF;
        }
        if (var14 < 0) {
            class7.field88 -= -var14 * class432.field6283 / 1000 + class124.field1614 << 3;
            class7.field88 &= 0x3FFF;
        }
        int var15 = var12 - class7.field88;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class7.field88 = var12;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method2113(byte arg0, String arg1) {
        field4772++;
        int var2 = arg1.length();
        char[] var3 = new char[var2];
        if (arg0 != 86) {
            field4786 = false;
        }
        byte var4 = 2;
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class84.method686(var6, (byte) 41);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(CII)C")
    public static final char method2114(char arg0, int arg1, int arg2) {
        field4770++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 != 1705) {
            field4780 = null;
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lde;ILjava/lang/Object;)V")
    public static final void method2115(class364 arg0, int arg1, Object arg2) {
        field4773++;
        if (arg0.field5390 == null) {
            return;
        }
        int var3 = 4 % ((arg1 - 28) / 50);
        for (int var4 = 0; var4 < 50 && arg0.field5390.peekEvent() != null; var4++) {
            class31.method245(1L, 78);
        }
        if (arg2 != null) {
            arg0.field5390.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public static void method2116(int arg0) {
        if (arg0 >= -60) {
            method2116(-2);
        }
        field4775 = null;
        field4780 = null;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
    public static final void method2117(int arg0) {
        class269.field3978.method372(117);
        field4776++;
        class295.field4449.method372(117);
        if (arg0 != 28862) {
            method2114((char) 65469, 122, -118);
        }
    }
}
