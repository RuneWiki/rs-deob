import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class217 {

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Lui;")
    private class268 field3726 = new class268(256);

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Lui;")
    private class268 field3727 = new class268(256);

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Lek;")
    private class185 field3722;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "Lek;")
    private class185 field3717;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Ljf;")
    public static class229 field3723 = class212.method1457((byte) 80, "showingVideoAd");

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Ljf;")
    public static class229 field3721 = class212.method1457((byte) 92, "Objet d(Wabonn-Bs");

    @OriginalMember(owner = "client!i", name = "e", descriptor = "Lpb;")
    public static class78 field3720 = new class78();

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field3729 = 1;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Lni;")
    public static class24 field3730 = new class24(64);

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field3732 = 0;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field3731 = 0;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "Ljf;")
    public static class229 field3736 = class212.method1457((byte) 102, "headicons_prayer");

    @OriginalMember(owner = "client!i", name = "v", descriptor = "Ljf;")
    public static class229 field3737 = class212.method1457((byte) 109, "Ablegen");

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "[Lkb;")
    public static class35[] field3734;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "[[[B")
    public static byte[][][] field3735;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[II)Ltg;", line = 4)
    public final class316 method1497(int arg0, int[] arg1, int arg2) {
        field3719++;
        if (this.field3722.method1286(false) == 1) {
            return this.method1499(0, true, arg2, arg1);
        }
        if (arg0 != -4598) {
            this.method1499(-86, true, -17, (int[]) null);
        }
        if (this.field3722.method1268(arg2, (byte) 109) != 1) {
            throw new RuntimeException();
        }
        return this.method1499(arg2, true, 0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V", line = 32)
    public static void method1498(byte arg0) {
        field3734 = null;
        field3736 = null;
        field3735 = (byte[][][]) null;
        if (arg0 > -29) {
            method1502(-99, -117, -112);
        }
        field3737 = null;
        field3721 = null;
        field3730 = null;
        field3720 = null;
        field3723 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZI[I)Ltg;", line = 60)
    private final class316 method1499(int arg0, boolean arg1, int arg2, int[] arg3) {
        int var5 = (arg0 >>> 12 | (arg0 & 0xF0000FFF) << 4) ^ arg2;
        int var6 = var5 | arg0 << 16;
        field3716++;
        long var7 = (long) var6 ^ 0x100000000L;
        class316 var9 = (class316) this.field3727.method1890(var7, -126);
        if (var9 != null) {
            return var9;
        } else if (!arg1) {
            return (class316) null;
        } else if (arg3 == null || arg3[0] > 0) {
            class53 var10 = (class53) this.field3726.method1890(var7, -95);
            if (var10 == null) {
                var10 = class53.method426(this.field3722, arg0, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field3726.method1885(var7, var10, (byte) -103);
            }
            class316 var11 = var10.method429(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method1747((byte) -110);
                this.field3727.method1885(var7, var11, (byte) -101);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([IIII)Ltg;", line = 104)
    private final class316 method1500(int[] arg0, int arg1, int arg2, int arg3) {
        field3725++;
        int var5 = (arg2 >>> 12 | (arg2 & 0x40000FFF) << 4) ^ arg1;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class316 var9 = (class316) this.field3727.method1890(var7, -114);
        if (arg3 != 0) {
            this.method1501(32, 38, (int[]) null);
        }
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class2 var10 = class2.method8(this.field3717, arg2, arg1);
            if (var10 == null) {
                return null;
            }
            class316 var11 = var10.method6();
            this.field3727.method1885(var7, var11, (byte) -68);
            if (arg0 != null) {
                arg0[0] -= var11.field5353.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II[I)Ltg;", line = 142)
    public final class316 method1501(int arg0, int arg1, int[] arg2) {
        field3728++;
        if (this.field3717.method1286(false) == 1) {
            return this.method1500(arg2, arg0, 0, 0);
        } else if (this.field3717.method1268(arg0, (byte) 109) == 1) {
            return this.method1500(arg2, 0, arg0, 0);
        } else {
            int var4 = 44 % ((47 - arg1) / 56);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)Z", line = 163)
    public static final boolean method1502(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method1503(15, (byte) -92);
        }
        field3718++;
        return (arg0 >> arg2 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)V", line = 175)
    public static final void method1503(int arg0, byte arg1) {
        field3724++;
        if (class288.field4933 == null) {
            class288.field4933 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class288.field4933[var2][var3][var4] = arg1;
                }
            }
        }
        int var5 = -20 % ((arg0 - 57) / 40);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lek;Lek;)V", line = 244)
    public class217(class185 arg0, class185 arg1) {
        this.field3722 = arg1;
        this.field3717 = arg0;
    }
}
