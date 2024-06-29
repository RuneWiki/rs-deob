import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class57 {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "[I")
    public static int[] field824 = new int[2];

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public static int field842 = 0;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public int field825;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public int field826;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public int field827;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public int field829;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public int field831;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public int field834;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public int field837;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public int field839;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    public int field847;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    public int field849;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public int field850;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "I")
    public int field852;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "Ljf;")
    public static class83 field828;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "[I")
    public static int[] field845;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
    public static void method399(boolean arg0) {
        field824 = null;
        if (arg0) {
            field828 = null;
            field845 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(Z)V")
    public static final void method400(boolean arg0) {
        field853++;
        if (arg0) {
            field842 = 11;
        }
        class268.field4311.method1420((byte) 9);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;IIZ)I")
    public static final int method401(String arg0, int arg1, int arg2, boolean arg3) {
        field843++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg2 < 11) {
            return -109;
        } else {
            boolean var4 = false;
            int var5 = 0;
            boolean var6 = false;
            int var7 = arg0.length();
            for (int var8 = 0; var8 < var7; var8++) {
                char var9 = arg0.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg3) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var11 = var9 - 'W';
                } else {
                    throw new NumberFormatException();
                }
                if (var11 >= arg1) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg1 * var5 + var11;
                if ((var10 / arg1) != var5) {
                    throw new NumberFormatException();
                }
                var6 = true;
                var5 = var10;
            }
            if (!var6) {
                throw new NumberFormatException();
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)V")
    public static final void method402(boolean arg0, int arg1) {
        field835++;
        class169.field2559.method1416(arg1, 0);
        class159.field2480.method1416(arg1, 0);
        if (arg0) {
            method402(false, 68);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method403(byte arg0, String arg1, String arg2, String arg3) {
        if (arg0 != 65) {
            field824 = null;
        }
        int var4 = arg1.indexOf(arg3);
        field838++;
        while (var4 != -1) {
            arg1 = arg1.substring(0, var4) + arg2 + arg1.substring(var4 + arg3.length());
            var4 = arg1.indexOf(arg3, arg2.length() + var4);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)I")
    public static final int method404(int arg0, int arg1) {
        field830++;
        if (arg1 > 0) {
            return 1;
        } else {
            if (arg0 != -123) {
                method399(true);
            }
            return arg1 < 0 ? -1 : 0;
        }
    }
}
