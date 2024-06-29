import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class35 {

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Llj;")
    private class5 field541;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Lfg;")
    private class192 field542;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Lun;")
    private class136 field537;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field536 = 0;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Z")
    public static boolean field545 = false;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "[J")
    public static long[] field549 = new long[200];

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "Ll;")
    public static class133 field546;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Lkh;")
    private class166 field543;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "[Lh;")
    private class107[] field547;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lhf;Lhf;BI)Lh;", line = 6)
    public final class107 method290(class314 arg0, class314 arg1, byte arg2, int arg3) {
        if (arg2 <= 75) {
            method291(121, (class241) null);
        }
        field538++;
        return this.method296(arg0, arg1, arg3, true, 104);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILtd;)V", line = 17)
    public static final void method291(int arg0, class241 arg1) {
        field544++;
        long var2 = 0L;
        if (arg1.field3844 == 0) {
            var2 = class10.method78(arg1.field3851, arg1.field3859, arg1.field3843);
        }
        if (arg1.field3844 == 1) {
            var2 = class214.method1505(arg1.field3851, arg1.field3859, arg1.field3843);
        }
        int var4 = -1;
        if (arg1.field3844 == 2) {
            var2 = class176.method1259(arg1.field3851, arg1.field3859, arg1.field3843);
        }
        if (arg1.field3844 == 3) {
            var2 = class263.method1796(arg1.field3851, arg1.field3859, arg1.field3843);
        }
        int var5 = arg0;
        int var6 = 0;
        if (var2 != 0L) {
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var5 = (int) var2 >> 14 & 0x1F;
            var6 = (int) var2 >> 20 & 0x3;
        }
        arg1.field3854 = var5;
        arg1.field3849 = var6;
        arg1.field3857 = var4;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(JZZ)V", line = 59)
    public static final void method292(long arg0, boolean arg1, boolean arg2) {
        field548++;
        if (arg0 == 0L) {
            return;
        }
        if (class336.field5253 >= 100) {
            class29.method252(class63.field1010, "", !arg1, 0);
            return;
        }
        String var4 = class34.method289(48, arg0);
        int var5 = 0;
        if (arg1) {
            method294(-112);
        }
        while (var5 < class336.field5253) {
            if (class337.field5277[var5] == arg0) {
                class29.method252(var4 + class11.field166, "", !arg1, 0);
                return;
            }
            var5++;
        }
        for (int var6 = 0; var6 < class225.field3579; var6++) {
            if (field549[var6] == arg0) {
                class29.method252(class244.field3909 + var4 + class191.field2859, "", !arg1, 0);
                return;
            }
        }
        if (var4.equals(class98.field1566.field477)) {
            class29.method252(class179.field2697, "", true, 0);
            return;
        }
        class238.field3790++;
        class337.field5277[class336.field5253] = arg0;
        class54.field910[class336.field5253] = class186.method1331(arg0, (byte) -50);
        class281.field4346[class336.field5253++] = arg2;
        class161.field2423 = class291.field4524;
        class106.field1642.method753(10, 60);
        class106.field1642.method1125(8473, arg0);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZIII)V", line = 135)
    public static final void method293(boolean arg0, int arg1, int arg2, int arg3) {
        int var4 = class289.field4502 * arg2 >> 8;
        if (var4 != 0 && arg3 != -1) {
            class207.method1474(arg3, (byte) -124, class60.field974, false, var4, 0);
            class186.field2783 = true;
        }
        field540++;
        if (arg0) {
            method292(6L, false, true);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 155)
    public static void method294(int arg0) {
        field549 = null;
        field546 = null;
        if (arg0 != -14259) {
            field545 = false;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)Z", line = 171)
    public final boolean method295(byte arg0) {
        field535++;
        if (this.field543 != null) {
            return true;
        }
        if (this.field537 == null) {
            if (this.field541.method35(-1)) {
                return false;
            }
            this.field537 = this.field541.method20(arg0 - 5, true, 255, (byte) 0, 255);
        }
        if (this.field537.field2317) {
            return false;
        }
        this.field543 = new class166(this.field537.method410(false));
        if (arg0 != -60) {
            field545 = true;
        }
        this.field547 = new class107[(this.field543.field2500.length - 5) / 8];
        return true;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lhf;Lhf;IZI)Lh;", line = 202)
    private final class107 method296(class314 arg0, class314 arg1, int arg2, boolean arg3, int arg4) {
        field534++;
        if (this.field543 == null) {
            throw new RuntimeException();
        }
        this.field543.field2532 = arg2 * 8 + 5;
        if (this.field543.field2500.length <= this.field543.field2532) {
            throw new RuntimeException();
        } else if (this.field547[arg2] == null) {
            int var6 = this.field543.method1137(-51);
            int var7 = this.field543.method1137(100);
            class107 var8 = new class107(arg2, arg0, arg1, this.field541, this.field542, var6, var7, arg3);
            this.field547[arg2] = var8;
            int var9 = 77 / ((-arg4 - 9) / 58);
            return var8;
        } else {
            return this.field547[arg2];
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Llj;Lfg;)V", line = 240)
    public class35(class5 arg0, class192 arg1) {
        this.field541 = arg0;
        this.field542 = arg1;
        if (!this.field541.method35(-1)) {
            this.field537 = this.field541.method20(-49, true, 255, (byte) 0, 255);
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V", line = 256)
    public final void method297(int arg0) {
        field539++;
        if (this.field547 == null) {
            return;
        }
        for (int var2 = arg0; var2 < this.field547.length; var2++) {
            if (this.field547[var2] != null) {
                this.field547[var2].method787(-82);
            }
        }
        for (int var3 = 0; var3 < this.field547.length; var3++) {
            if (this.field547[var3] != null) {
                this.field547[var3].method790(false);
            }
        }
    }
}
