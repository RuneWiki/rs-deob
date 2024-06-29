import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class158 extends class139 {

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "Lrf;")
    public static class163 field3229 = class53.method392(59, ":clan:");

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "Lad;")
    public static class5 field3228 = new class5();

    @OriginalMember(owner = "client!ra", name = "db", descriptor = "I")
    public static int field3233 = 0;

    @OriginalMember(owner = "client!ra", name = "eb", descriptor = "Lrf;")
    public static class163 field3234 = class53.method392(-51, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ra", name = "ab", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!ra", name = "bb", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!ra", name = "cb", descriptor = "Lu;")
    public static class184 field3232;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "Lig;")
    public static class84 field3225;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(B)V")
    public static final void method999(byte arg0) {
        ++field3226;
        int var1 = class118.field2507;
        int var2 = class19.field305;
        int var3 = class4.field43;
        int var4 = class193.field3803;
        int var5 = 6116423;
        class173.method1173(var1, var2, var4, var3, var5);
        class173.method1173(var1 + 1, var2 + 1, var4 + -2, 16, 0);
        class173.method1177(var1 + 1, var2 + 18, var4 + -2, var3 + -19, 0);
        if (arg0 != -65) {
            field3228 = null;
        }
        class134.field2772.method577(class43.field864, var1 + 3, var2 + 14, var5, -1);
        int var6 = class22.field394;
        int var7 = class75.field1555;
        for (int var8 = 0; ~class184.field3678 < ~var8; ++var8) {
            int var9 = (class184.field3678 + -1 + -var8) * 15 + var2 + 31;
            int var10 = 16777215;
            if (~var1 > ~var6 && ~var6 > ~(var1 - -var4) && ~(var9 - 13) > ~var7 && ~var7 > ~(var9 + 3)) {
                var10 = 16776960;
            }
            class134.field2772.method577(class177.method1203(var8, arg0 + 22090), var1 - -3, var9, var10, 0);
        }
        class40.method250(class19.field305, class118.field2507, class4.field43, class193.field3803, (byte) -61);
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(Z)V")
    public static void method1000(boolean arg0) {
        field3232 = null;
        field3229 = null;
        field3228 = null;
        field3225 = null;
        field3234 = null;
        if (!arg0) {
            field3225 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field3223;
        if (arg1 != 7451) {
            return null;
        } else {
            int[] var3 = super.field2859.method1319(arg1 + -7563, arg0);
            if (super.field2859.field3966) {
                for (int var4 = 0; class23.field402 > var4; ++var4) {
                    var3[var4] = class189.field3772[var4];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class158() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lde;I)V")
    public static final void method1001(class36 arg0, int arg1) {
        ++field3227;
        if (class51.field1023 == arg0.field738 || arg0.field730 == -1 || arg0.field715 != 0 || arg0.field694 + 1 > class97.method668(arg0.field730, (byte) 44).field3292[arg0.field676]) {
            int var2 = -arg0.field673 + arg0.field738;
            int var3 = class51.field1023 - arg0.field673;
            int var4 = arg0.field714 * 128 + arg0.field684 * 64;
            int var5 = arg0.field684 * 64 + arg0.field675 * 128;
            int var6 = arg0.field689 * 128 + arg0.field684 * 64;
            arg0.field716 = ((-var3 + var2) * var4 + var3 * var6) / var2;
            int var7 = arg0.field698 * 128 - -(arg0.field684 * 64);
            arg0.field679 = ((var2 - var3) * var5 - -(var3 * var7)) / var2;
        }
        arg0.field699 = 0;
        if (~arg0.field687 == -1) {
            arg0.field737 = 1024;
        }
        if (arg0.field687 == arg1) {
            arg0.field737 = 1536;
        }
        if (arg0.field687 == 2) {
            arg0.field737 = 0;
        }
        if (~arg0.field687 == -4) {
            arg0.field737 = 512;
        }
        arg0.field727 = arg0.field737;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)Z")
    public static final boolean method1002(int arg0, int arg1, int arg2) {
        int var3 = class31.field620[arg0][arg1][arg2];
        if (-class63.field1329 == var3) {
            return false;
        } else if (class63.field1329 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class3.method30(var4 + 1, class99.field2086[arg0][arg1][arg2], var5 + 1) && class3.method30(var4 + 128 - 1, class99.field2086[arg0][arg1 + 1][arg2], var5 + 1) && class3.method30(var4 + 128 - 1, class99.field2086[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class3.method30(var4 + 1, class99.field2086[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class31.field620[arg0][arg1][arg2] = class63.field1329;
                return true;
            } else {
                class31.field620[arg0][arg1][arg2] = -class63.field1329;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZII)I")
    public static final int method1003(int arg0, boolean arg1, int arg2, int arg3) {
        ++field3231;
        if ((8 & class21.field372[arg2][arg0][arg3]) != 0) {
            return 0;
        } else {
            if (arg1) {
                method999((byte) 59);
            }
            return ~arg2 < -1 && ~(class21.field372[1][arg0][arg3] & 2) != -1 ? arg2 + -1 : arg2;
        }
    }
}
