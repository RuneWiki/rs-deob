import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class224 extends class55 implements class84 {

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
    private int field3479 = 50;

    @OriginalMember(owner = "client!mo", name = "W", descriptor = "Z")
    private boolean field3513 = false;

    @OriginalMember(owner = "client!mo", name = "L", descriptor = "Lrn;")
    private class18 field3503;

    @OriginalMember(owner = "client!mo", name = "Q", descriptor = "Lrn;")
    private class18 field3507;

    @OriginalMember(owner = "client!mo", name = "B", descriptor = "Ldf;")
    private class177 field3493;

    @OriginalMember(owner = "client!mo", name = "z", descriptor = "Ldf;")
    private class177 field3491;

    @OriginalMember(owner = "client!mo", name = "N", descriptor = "I")
    public static int field3505 = 0;

    @OriginalMember(owner = "client!mo", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3501 = "flash3:";

    @OriginalMember(owner = "client!mo", name = "S", descriptor = "I")
    public static int field3509 = 127;

    @OriginalMember(owner = "client!mo", name = "v", descriptor = "J")
    public static long field3487 = 0L;

    @OriginalMember(owner = "client!mo", name = "u", descriptor = "I")
    public static int field3486 = 0;

    @OriginalMember(owner = "client!mo", name = "E", descriptor = "Ll;")
    public static class66 field3496 = new class66(260);

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!mo", name = "w", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!mo", name = "x", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!mo", name = "y", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!mo", name = "A", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!mo", name = "C", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!mo", name = "D", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!mo", name = "F", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!mo", name = "G", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!mo", name = "H", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!mo", name = "I", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!mo", name = "K", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!mo", name = "M", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!mo", name = "P", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!mo", name = "R", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!mo", name = "T", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!mo", name = "V", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!mo", name = "U", descriptor = "Lwm;")
    public static class96 field3511;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "(II)I", line = 5)
    public final int method762(int arg0, int arg1) {
        int var3 = -35 / ((arg0 - 68) / 35);
        field3512++;
        return this.method531((byte) -44, arg1).field3620 & 0xFF;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ)V", line = 19)
    public final void method756(int arg0, boolean arg1) {
        this.method758(this.field3513 || this.method531((byte) -44, arg0).field3617 ? 64 : 128, (byte) 122, arg0);
        if (!arg1) {
            this.field3491 = (class177) null;
        }
        field3484++;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)Z", line = 32)
    public final boolean method753(int arg0, int arg1) {
        if (arg0 == 0) {
            field3498++;
            class24 var3 = this.method1685(arg0 + 18706, arg1);
            return var3 == null ? false : var3.method244(this, this.field3503);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IB)I", line = 51)
    public final int method752(int arg0, byte arg1) {
        field3499++;
        if (arg1 != -21) {
            field3511 = (class96) null;
        }
        return this.method531((byte) -44, arg0).field3613 & 0xFF;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BZ)V", line = 64)
    public final void method1678(byte arg0, boolean arg1) {
        this.field3513 = arg1;
        this.method1680((byte) 97);
        field3504++;
        int var3 = -123 % ((50 - arg0) / 39);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(FIB)[I", line = 77)
    public final int[] method750(float arg0, int arg1, byte arg2) {
        field3494++;
        class24 var4 = this.method1685(18706, arg1);
        if (var4 == null) {
            return null;
        }
        if (arg2 < 63) {
            this.field3479 = -112;
        }
        var4.field378 = true;
        return var4.method250(this, this.field3503, arg0, this.field3513 || this.method531((byte) -44, arg1).field3617);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V", line = 96)
    public static final void method1679(int arg0) {
        if (arg0 != -13746) {
            method1679(-40);
        }
        class165.field2626.method656(arg0 + 13746);
        field3490++;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V", line = 107)
    public final void method1680(byte arg0) {
        if (arg0 <= 88) {
            this.method755(true, 88);
        }
        this.field3493.method1381(-115);
        if (this.field3491 != null) {
            this.field3491.method1381(-111);
        }
        class24.field365 = null;
        field3495++;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)V", line = 125)
    public static void method1681(byte arg0) {
        if (arg0 != -34) {
            method1679(106);
        }
        field3511 = null;
        field3496 = null;
        field3501 = null;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lrn;Lrn;Lrn;IZ)V", line = 414)
    public class224(class18 arg0, class18 arg1, class18 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field3479 = arg3;
        this.field3503 = arg2;
        this.field3513 = arg4;
        this.field3507 = arg0;
        this.field3493 = new class177(this.field3479);
        if (class240.field3737) {
            this.field3491 = new class177(this.field3479);
        } else {
            this.field3491 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(IZ)V", line = 141)
    public final void method1682(int arg0, boolean arg1) {
        field3489++;
        if (!arg1) {
            this.method1683(21, -108);
        }
        this.field3479 = arg0;
        this.field3493 = new class177(this.field3479);
        if (class240.field3737) {
            this.field3491 = new class177(this.field3479);
        } else {
            this.field3491 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(IB)Z", line = 160)
    public final boolean method763(int arg0, byte arg1) {
        if (arg1 >= -108) {
            return true;
        } else {
            field3488++;
            return !this.method531((byte) -44, arg0).field3612;
        }
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(II)Z", line = 174)
    public final boolean method759(int arg0, int arg1) {
        field3500++;
        if (arg0 < 65) {
            this.method757((byte) -108, 73);
        }
        return this.method531((byte) -44, arg1).field3618;
    }

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "(II)[I", line = 186)
    public final int[] method761(int arg0, int arg1) {
        field3492++;
        class24 var3 = this.method1685(18706, arg1);
        if (var3 == null) {
            return null;
        } else if (arg0 == 25673) {
            return var3.method247(this, this.field3503, this.field3513 || this.method531((byte) -44, arg1).field3617);
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "(II)Ln;", line = 201)
    public final class326 method533(int arg0, int arg1) {
        field3478++;
        if (arg1 == -11334) {
            class24 var3 = this.method1685(arg1 ^ 0xFFFF9AA8, arg0);
            return var3 == null ? null : var3.field373;
        } else {
            return (class326) null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "(II)Lnh;", line = 217)
    private final class85 method1683(int arg0, int arg1) {
        field3485++;
        class85 var3 = (class85) this.field3491.method1386(-1, (long) arg1);
        if (var3 == null) {
            class85 var4 = new class85(this.method531((byte) -44, arg1).field3622 & arg0);
            this.field3491.method1385(var4, (byte) -30, (long) arg1);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)Z", line = 232)
    public final boolean method751(int arg0, int arg1) {
        if (arg1 > -47) {
            this.field3493 = (class177) null;
        }
        field3508++;
        return this.field3513 || this.method531((byte) -44, arg0).field3617;
    }

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "(II)V", line = 248)
    public final void method1684(int arg0, int arg1) {
        for (class24 var3 = (class24) this.field3493.method1383(-10647); var3 != null; var3 = (class24) this.field3493.method1384(true)) {
            if (var3.field378) {
                var3.method249(arg1);
                var3.field378 = false;
            }
        }
        if (arg0 > 56) {
            field3502++;
        }
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(IB)Z", line = 273)
    public final boolean method764(int arg0, byte arg1) {
        if (arg1 != 63) {
            this.method1683(-93, 85);
        }
        field3483++;
        return this.method531((byte) -44, arg0).field3626;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZI)I", line = 285)
    public final int method755(boolean arg0, int arg1) {
        field3510++;
        return arg0 ? -42 : this.method531((byte) -44, arg1).field3625 & 0xFF;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIZIF)Lqn;", line = 296)
    public final class361 method754(int arg0, int arg1, boolean arg2, int arg3, float arg4) {
        field3480++;
        int var6 = -32 / ((-arg1 - 57) / 50);
        class24 var7 = this.method1685(18706, arg0);
        if (var7 != null && var7.method244(this, this.field3503)) {
            return arg2 ? var7.field373.method2302(false, arg3, this, arg3, this.field3503, (byte) 68, (double) arg4) : var7.field373.method2312(65535, (double) arg4, this, arg3, this.field3503, arg3, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(BI)I", line = 318)
    public final int method757(byte arg0, int arg1) {
        field3506++;
        if (arg0 >= -25) {
            this.method753(-12, 122);
        }
        return this.method531((byte) -44, arg1).field3623 & 0xFF;
    }

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "(II)Lli;", line = 341)
    private final class24 method1685(int arg0, int arg1) {
        field3482++;
        class24 var3 = (class24) this.field3493.method1386(-1, (long) arg1);
        if (var3 != null) {
            return var3;
        } else if (arg0 == 18706) {
            byte[] var4 = this.field3507.method187(arg1, 0, -1);
            if (var4 == null) {
                return null;
            } else {
                class24 var5 = new class24(new class25(var4));
                this.field3493.method1385(var5, (byte) -30, (long) arg1);
                return var5;
            }
        } else {
            return (class24) null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(II)I", line = 366)
    public final int method760(int arg0, int arg1) {
        if (arg1 != 1) {
            field3496 = (class66) null;
        }
        field3481++;
        return this.method531((byte) -44, arg0).field3622 & 0xFFFF;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IBI)V", line = 387)
    public final void method758(int arg0, byte arg1, int arg2) {
        boolean var4 = false;
        class211.method1562(this.method531((byte) -44, arg2).field3623 & 0xFF, this.method531((byte) -44, arg2).field3625 & 0xFF, -83);
        class24 var5 = this.method1685(18706, arg2);
        if (var5 != null) {
            var4 = var5.method243(this, this.field3503, arg0);
        }
        if (arg1 != 122) {
            this.field3493 = (class177) null;
        }
        if (!var4) {
            class85 var6 = this.method1683(65535, arg2);
            var6.method765(arg1 ^ 0x24);
        }
        field3497++;
    }
}
