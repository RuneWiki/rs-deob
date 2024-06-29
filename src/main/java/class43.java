import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class43 {

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "[S")
    public static short[] field858 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "[I")
    public static int[] field857 = new int[32];

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "[I")
    public static int[] field861 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "Lia;")
    public static class257 field859 = class28.method234(97, "overlay)3dat");

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "J")
    public static long field854;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "Lmb;")
    public static class178 field856;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public static final void method334(int arg0) {
        field855++;
        if (class151.field2595 != null) {
            class151.field2595.method1421((byte) 109);
            class151.field2595 = null;
        }
        class233.method1526((byte) 70);
        class252.method1649();
        for (int var1 = 0; var1 < 4; var1++) {
            class173.field2961[var1].method1552(arg0 ^ 0xFEFFFFFF);
        }
        if (arg0 != -16777217) {
            field861 = null;
        }
        class2.method30(-128);
        System.gc();
        class212.method1431(-108, 2);
        class246.field4259 = false;
        class124.field2228 = -1;
        class255.method1662(-123, true);
        class231.field3878 = 0;
        class57.field1221 = false;
        class244.field4232 = 0;
        for (int var2 = 0; var2 < class156.field2719.length; var2++) {
            class156.field2719[var2] = null;
        }
        class140.field2487 = 0;
        class231.field3880 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class55.field1180[var3] = null;
            class91.field1735[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class92.field1758[var4] = null;
        }
        class209.method1404((byte) -38, 8);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[BIIZIII[Lq;II)V")
    public static final void method335(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, class238[] arg8, int arg9, int arg10) {
        byte var11;
        if (arg4) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg4) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if ((arg7 + var12) > 0 && (arg7 + var12) < 103 && (arg10 + var13) > 0 && (arg10 + var13) < 103) {
                        arg8[arg5].field4075[arg7 + var12][arg10 + var13] = class30.method252(arg8[arg5].field4075[arg7 + var12][arg10 + var13], -16777217);
                    }
                }
            }
        }
        int var14 = 50 % ((49 - arg9) / 62);
        class152 var15 = new class152(arg1);
        field853++;
        for (int var16 = 0; var16 < var11; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    if (arg3 == var16 && var17 >= arg6 && var17 < (arg6 + 8) && arg2 <= var18 && (arg2 + 8) > var18) {
                        class211.method1416(arg10 + class45.method356(0, arg0, var17 & 0x7, var18 & 0x7), arg5, class195.method1313(var18 & 0x7, arg0, false, var17 & 0x7) + arg7, var15, arg0, 0, -29601, arg4, 0);
                    } else {
                        class211.method1416(-1, 0, -1, var15, 0, 0, -29601, arg4, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public static void method336(boolean arg0) {
        field858 = null;
        field857 = null;
        field861 = null;
        if (arg0) {
            field859 = null;
            field856 = null;
        }
    }
}
