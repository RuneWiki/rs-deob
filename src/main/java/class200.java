import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class200 {

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "[I")
    public static int[] field3939 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Lea;")
    public static class38 field3942 = class9.method46((byte) 105, "Wordpack geladen)3");

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "J")
    public static volatile long field3940 = 0L;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Lea;")
    public static class38 field3944 = class9.method46((byte) 110, "<br>(X");

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIILhc;I)V")
    public static final void method1309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class66 arg6, int arg7) {
        field3938++;
        if (arg3 >= 0 && arg3 < 104 && arg7 >= 0 && arg7 < 104) {
            class3.field104[arg4][arg3][arg7] = 0;
            while (true) {
                int var8 = arg6.method509(120);
                if (var8 == 0) {
                    if (arg4 == 0) {
                        class154.field3209[0][arg3][arg7] = -class191.method1273(arg1 + arg7 + 556238, true, arg0 + arg3 + 932731) * 8;
                    } else {
                        class154.field3209[arg4][arg3][arg7] = class154.field3209[arg4 - 1][arg3][arg7] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg6.method509(120);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg4 == 0) {
                        class154.field3209[0][arg3][arg7] = -var9 * 8;
                    } else {
                        class154.field3209[arg4][arg3][arg7] = class154.field3209[arg4 - 1][arg3][arg7] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class32.field652[arg4][arg3][arg7] = arg6.method513((byte) 110);
                    class124.field2670[arg4][arg3][arg7] = (byte) ((var8 - 2) / 4);
                    class67.field1695[arg4][arg3][arg7] = (byte) class52.method380(3, var8 + arg2 - 2);
                } else if (var8 <= 81) {
                    class3.field104[arg4][arg3][arg7] = (byte) (var8 - 49);
                } else {
                    class196.field3852[arg4][arg3][arg7] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg6.method509(120);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg6.method509(arg5 + 10012);
                    break;
                }
                if (var10 <= 49) {
                    arg6.method509(122);
                }
            }
        }
        if (arg5 != -9890) {
            field3944 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
    public static void method1310(boolean arg0) {
        field3944 = null;
        field3939 = null;
        if (!arg0) {
            method1313(36, false);
        }
        field3942 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lea;I)Z")
    public static final boolean method1311(class38 arg0, int arg1) {
        field3941++;
        if (arg0 == null) {
            return false;
        }
        int var2 = -109 / ((arg1 - 21) / 57);
        for (int var3 = 0; var3 < class22.field468; var3++) {
            if (arg0.method263(class161.field3357[var3], (byte) 124)) {
                return true;
            }
        }
        return arg0.method263(class195.field3842.field3022, (byte) 95);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)V")
    public static final void method1312(boolean arg0) {
        if (!arg0) {
            field3942 = null;
        }
        field3945++;
        class19.field410 = new class29(32);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)I")
    public static final int method1313(int arg0, boolean arg1) {
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        field3937++;
        if (!arg1) {
            method1311(null, -23);
        }
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
    public static final void method1314(int arg0, int arg1) {
        field3936++;
        if (arg0 == -1 || !class53.method385(arg0, arg1 + 27373)) {
            return;
        }
        class43[] var2 = class168.field3461[arg0];
        if (arg1 != -50) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class43 var4 = var2[var3];
            if (var4.field1044 != null) {
                class48 var5 = new class48();
                var5.field1153 = var4;
                var5.field1166 = var4.field1044;
                class35.method232(var5, -53, 2000000);
            }
        }
    }
}
