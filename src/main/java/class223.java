import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class223 extends class28 {

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    public static int field2881 = 1;

    @OriginalMember(owner = "client!no", name = "C", descriptor = "I")
    public static int field2895 = 0;

    @OriginalMember(owner = "client!no", name = "D", descriptor = "Z")
    public static boolean field2896 = false;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "[Lnb;")
    public static class136[] field2879 = new class136[75];

    @OriginalMember(owner = "client!no", name = "K", descriptor = "[I")
    public static int[] field2903 = new int[32];

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    public int field2876;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "I")
    public int field2878;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "I")
    public int field2882;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "I")
    public int field2883;

    @OriginalMember(owner = "client!no", name = "r", descriptor = "I")
    public int field2884;

    @OriginalMember(owner = "client!no", name = "s", descriptor = "I")
    public int field2885;

    @OriginalMember(owner = "client!no", name = "t", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!no", name = "u", descriptor = "I")
    public int field2887;

    @OriginalMember(owner = "client!no", name = "v", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!no", name = "w", descriptor = "I")
    public int field2889;

    @OriginalMember(owner = "client!no", name = "x", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!no", name = "z", descriptor = "I")
    public int field2892;

    @OriginalMember(owner = "client!no", name = "A", descriptor = "I")
    public int field2893;

    @OriginalMember(owner = "client!no", name = "B", descriptor = "I")
    public int field2894;

    @OriginalMember(owner = "client!no", name = "E", descriptor = "I")
    public int field2897;

    @OriginalMember(owner = "client!no", name = "G", descriptor = "I")
    public int field2899;

    @OriginalMember(owner = "client!no", name = "H", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!no", name = "I", descriptor = "I")
    public int field2901;

    @OriginalMember(owner = "client!no", name = "J", descriptor = "I")
    public int field2902;

    @OriginalMember(owner = "client!no", name = "L", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!no", name = "M", descriptor = "I")
    public int field2905;

    @OriginalMember(owner = "client!no", name = "F", descriptor = "Lvj;")
    public class227 field2898;

    @OriginalMember(owner = "client!no", name = "y", descriptor = "Lhl;")
    public class491 field2891;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "Lmda;")
    public class53 field2880;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "Lhfa;")
    public class635 field2877;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZILjava/lang/String;B)I", line = 3)
    public static final int method1363(boolean arg0, int arg1, String arg2, byte arg3) {
        field2904++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = -113 / ((arg3 + 72) / 49);
        int var8 = arg2.length();
        for (int var9 = 0; var9 < var8; var9++) {
            char var10 = arg2.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var4 = true;
                    continue;
                }
                if (var10 == '+' && arg0) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var12 >= arg1) {
                throw new NumberFormatException();
            }
            if (var4) {
                var12 = -var12;
            }
            int var11 = arg1 * var6 + var12;
            if (var11 / arg1 != var6) {
                throw new NumberFormatException();
            }
            var6 = var11;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V", line = 80)
    public static void method1364(int arg0) {
        field2879 = null;
        field2903 = null;
        if (arg0 != 15284) {
            method1364(-30);
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V", line = 100)
    public static final void method1365(int arg0) {
        field2888++;
        if (class548.field7497) {
            return;
        }
        class548.field7497 = true;
        if (class72.field935.field6535) {
            class620.field8432 = ((int) class620.field8432 - 65 & 0xFFFFFF80);
        } else {
            class690.field9748 += (-24.0F - class690.field9748) / 2.0F;
        }
        class308.field4137 = true;
        int var1 = -9 % ((arg0 - 22) / 56);
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(I)V", line = 133)
    public final void method1366(int arg0) {
        if (arg0 != 48) {
            this.field2882 = 119;
        }
        this.field2891 = null;
        this.field2880 = null;
        this.field2898 = null;
        field2886++;
        this.field2877 = null;
    }
}
