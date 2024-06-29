import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class9 {

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "Lmb;")
    private class147 field105 = new class147();

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Lqj;")
    public static class196 field88 = class80.method502(" )2> <col=ffff00>", -48);

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "Lqj;")
    public static class196 field99 = class80.method502("scrollbar", -48);

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field103 = -1;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Lqj;")
    public static class196 field89 = class80.method502("<col=ffff00>", -48);

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "Lmb;")
    private class147 field106;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static final void method32(int arg0) {
        field90++;
        System.out.println("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
        System.exit(arg0);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lmb;B)V")
    public final void method33(class147 arg0, byte arg1) {
        if (arg0.field2321 != null) {
            arg0.method920(-2);
        }
        arg0.field2324 = this.field105;
        if (arg1 > -12) {
            this.method36((byte) 39);
        }
        arg0.field2321 = this.field105.field2321;
        field92++;
        arg0.field2321.field2324 = arg0;
        arg0.field2324.field2321 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static final void method34(byte arg0) {
        field101++;
        int var1 = class62.field862.method1662((byte) 117);
        if (var1 == 0) {
            return;
        }
        class44.field520.method1173(48, 14592);
        client.field1453++;
        class44.field520.method329((byte) 113, 0);
        if (arg0 >= -90) {
            method32(83);
        }
        int var2 = class44.field520.field699;
        int var3 = 0;
        class206 var4 = (class206) class62.field862.method1665(3072);
        class44.field520.method310(var4.field3702, -80);
        int var5 = var4.field3702;
        class206 var6;
        while ((var6 = (class206) class62.field862.method1665(3072)) != null) {
            if (var3 < 255 && var5 + 1 == var6.field3702) {
                var3++;
            } else {
                class44.field520.method329((byte) 65, var3);
                var3 = 0;
                class44.field520.method310(var6.field3702, -79);
            }
            var5 = var6.field3702;
        }
        class44.field520.method329((byte) 108, var3);
        class44.field520.method359(class44.field520.field699 - var2, (byte) -114);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLmb;)V")
    public final void method35(byte arg0, class147 arg1) {
        field100++;
        if (arg1.field2321 != null) {
            arg1.method920(-2);
        }
        arg1.field2321 = this.field105;
        arg1.field2324 = this.field105.field2324;
        arg1.field2321.field2324 = arg1;
        arg1.field2324.field2321 = arg1;
        if (arg0 <= 112) {
            this.method35((byte) -83, null);
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V")
    public final void method36(byte arg0) {
        while (true) {
            class147 var2 = this.field105.field2324;
            if (this.field105 == var2) {
                field98++;
                if (arg0 != 5) {
                    field88 = null;
                }
                this.field106 = null;
                return;
            }
            var2.method920(arg0 ^ 0xFFFFFFFB);
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)Z")
    public static final boolean method37(int arg0) {
        field102++;
        if (arg0 != 0) {
            method34((byte) 2);
        }
        return class111.field1636;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V")
    public static void method38(int arg0) {
        field88 = null;
        field99 = null;
        field89 = null;
        if (arg0 != 0) {
            method41(84, (byte) 48, -106);
        }
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(B)Lmb;")
    public final class147 method39(byte arg0) {
        class147 var2 = this.field106;
        field104++;
        if (this.field105 == var2) {
            this.field106 = null;
            return null;
        } else {
            this.field106 = var2.field2324;
            return arg0 == -28 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)Lmb;")
    public final class147 method40(int arg0) {
        field95++;
        class147 var2 = this.field105.field2324;
        if (this.field105 == var2) {
            this.field106 = null;
            return null;
        }
        if (arg0 < 90) {
            this.field105 = null;
        }
        this.field106 = var2.field2324;
        return var2;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBI)Z")
    public static final boolean method41(int arg0, byte arg1, int arg2) {
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        class145 var3 = class83.method521(arg0, (byte) 72);
        field96++;
        return arg1 >= -25 ? true : var3.method908(-123, arg2);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[III[BIIIII)V")
    public static final void method42(int arg0, int[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field93++;
        if (arg8 < 113) {
            field89 = null;
        }
        int var10 = -(arg0 >> 2);
        int var11 = -(arg0 & 0x3);
        for (int var12 = -arg5; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg4[arg9++] == 0) {
                    arg6++;
                } else {
                    arg1[arg6++] = arg3;
                }
                if (arg4[arg9++] == 0) {
                    arg6++;
                } else {
                    arg1[arg6++] = arg3;
                }
                if (arg4[arg9++] == 0) {
                    arg6++;
                } else {
                    arg1[arg6++] = arg3;
                }
                if (arg4[arg9++] == 0) {
                    arg6++;
                } else {
                    arg1[arg6++] = arg3;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                if (arg4[arg9++] == 0) {
                    arg6++;
                } else {
                    arg1[arg6++] = arg3;
                }
            }
            arg6 += arg2;
            arg9 += arg7;
        }
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)Lmb;")
    public final class147 method43(int arg0) {
        field94++;
        class147 var2 = this.field105.field2324;
        if (this.field105 == var2) {
            return null;
        }
        if (arg0 != -24852) {
            this.method36((byte) 1);
        }
        var2.method920(-2);
        return var2;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
    public class9() {
        this.field105.field2321 = this.field105;
        this.field105.field2324 = this.field105;
    }
}
