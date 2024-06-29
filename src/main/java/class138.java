import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class138 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field2415 = 0;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "Lda;")
    public static class275 field2423 = class255.method1672(126, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "Lkk;")
    public static class225 field2418;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "Lfd;")
    public static class229 field2417;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "[Lda;")
    public static class275[] field2422;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V")
    public static final void method994(byte arg0) {
        field2419++;
        if (class261.field4531 < 0) {
            class51.field842 = -1;
            class261.field4531 = 0;
            class163.field2840 = -1;
        }
        if (class261.field4531 > class255.field4497) {
            class261.field4531 = class255.field4497;
            class51.field842 = -1;
            class163.field2840 = -1;
        }
        if (class258.field4521 < 0) {
            class258.field4521 = 0;
            class163.field2840 = -1;
            class51.field842 = -1;
        }
        if (class258.field4521 > class5.field67) {
            class51.field842 = -1;
            class163.field2840 = -1;
            class258.field4521 = class5.field67;
        }
        if (arg0 <= 56) {
            method997(-39, -116, -42, (short[]) null, (class275[]) null);
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(B)V")
    public static void method995(byte arg0) {
        field2423 = null;
        field2418 = null;
        field2417 = null;
        field2422 = null;
        int var1 = 61 % ((-arg0 - 1) / 33);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static final void method996(int arg0) {
        class34.field536.method987((byte) -126);
        field2416++;
        class267.field4639.method987((byte) -101);
        class92.field1558.method987((byte) 52);
        class75.field1234.method987((byte) -116);
        if (arg0 != 1568091976) {
            method995((byte) -95);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III[S[Lda;)V")
    public static final void method997(int arg0, int arg1, int arg2, short[] arg3, class275[] arg4) {
        field2420++;
        if (arg1 < arg0) {
            int var5 = arg1;
            int var6 = (arg0 + arg1) / 2;
            class275 var7 = arg4[var6];
            arg4[var6] = arg4[arg0];
            arg4[arg0] = var7;
            short var8 = arg3[var6];
            arg3[var6] = arg3[arg0];
            arg3[arg0] = var8;
            for (int var9 = arg1; var9 < arg0; var9++) {
                if (var7 == null || arg4[var9] != null && (var9 & 0x1) > arg4[var9].method1846((byte) 94, var7)) {
                    class275 var10 = arg4[var9];
                    arg4[var9] = arg4[var5];
                    arg4[var5] = var10;
                    short var11 = arg3[var9];
                    arg3[var9] = arg3[var5];
                    arg3[var5++] = var11;
                }
            }
            arg4[arg0] = arg4[var5];
            arg4[var5] = var7;
            arg3[arg0] = arg3[var5];
            arg3[var5] = var8;
            method997(var5 - 1, arg1, 2, arg3, arg4);
            method997(arg0, var5 + 1, 2, arg3, arg4);
        }
        if (arg2 != 2) {
            field2418 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([BIIZI[Lcg;BIIII)V")
    public static final void method998(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4, class118[] arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg6 > -16) {
            field2418 = null;
        }
        field2421++;
        if (!arg3) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if ((arg2 + var11) > 0 && arg2 + var11 < 103 && arg9 + var12 > 0 && arg9 + var12 < 103) {
                        arg5[arg4].field2094[arg2 + var11][arg9 + var12] = class19.method98(arg5[arg4].field2094[arg2 + var11][arg9 + var12], -16777217);
                    }
                }
            }
        }
        byte var13;
        if (arg3) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        class85 var14 = new class85(arg0);
        for (int var15 = 0; var15 < var13; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg7 == var15 && arg1 <= var16 && arg1 + 8 > var16 && var17 >= arg10 && var17 < (arg10 + 8)) {
                        class197.method1286(0, arg9 + class11.method46(var17 & 0x7, (byte) 117, arg8, var16 & 0x7), var14, -58, 0, arg2 + class6.method22(var17 & 0x7, var16 & 0x7, arg8, 0), arg3, arg4, arg8);
                    } else {
                        class197.method1286(0, -1, var14, -107, 0, -1, arg3, 0, 0);
                    }
                }
            }
        }
    }
}
