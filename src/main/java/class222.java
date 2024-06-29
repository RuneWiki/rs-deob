import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class222 {

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "Lpb;")
    private class78 field3557 = new class78();

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field3560 = 1;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field3566 = new String[8];

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "Log;")
    public static class206 field3556;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "Lpb;")
    private class78 field3568;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "[[[I")
    public static int[][][] field3562;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1608(int arg0) {
        field3550++;
        if (arg0 != 1) {
            field3556 = (class206) null;
        }
        class123.field1965.method1837(arg0 ^ 0x26);
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)Lpb;", line = 26)
    public final class78 method1609(int arg0) {
        field3564++;
        class78 var2 = this.field3557.field1195;
        if (this.field3557 == var2) {
            return null;
        }
        if (arg0 != -1709) {
            this.method1614(69);
        }
        var2.method571(7);
        return var2;
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V", line = 43)
    public static void method1610(int arg0) {
        field3566 = null;
        field3556 = null;
        field3562 = (int[][][]) null;
        if (arg0 != -1) {
            method1611(false, -80);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI)I", line = 56)
    public static final int method1611(boolean arg0, int arg1) {
        long var2 = class154.method1172((byte) 100);
        field3563++;
        if (arg1 != 0) {
            method1617(-81, -1, 41, 79, (byte) -82, 36, 43);
        }
        for (class60 var4 = arg0 ? (class60) class156.field2485.method841(0) : (class60) class156.field2485.method842((byte) -40); var4 != null; var4 = (class60) class156.field2485.method842((byte) -40)) {
            if (var2 > (var4.field939 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field939 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field3734;
                    class278.field4304[var5] = class118.field1907[var5];
                    var4.method1701(-126);
                    return var5;
                }
                var4.method1701(-122);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)Lpb;", line = 97)
    public final class78 method1612(boolean arg0) {
        class78 var2 = this.field3557.field1195;
        field3559++;
        if (this.field3557 == var2) {
            this.field3568 = null;
            return null;
        }
        if (arg0) {
            this.field3557 = (class78) null;
        }
        this.field3568 = var2.field1195;
        return var2;
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)V", line = 125)
    public final void method1613(int arg0) {
        while (true) {
            class78 var2 = this.field3557.field1195;
            if (this.field3557 == var2) {
                this.field3568 = null;
                if (arg0 != -14142) {
                    return;
                }
                field3551++;
                return;
            }
            var2.method571(arg0 ^ 0xFFFFC8C5);
        }
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)I", line = 144)
    public final int method1614(int arg0) {
        int var2 = arg0;
        for (class78 var3 = this.field3557.field1195; var3 != this.field3557; var3 = var3.field1195) {
            var2++;
        }
        field3567++;
        return var2;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(Z)Lpb;", line = 173)
    public final class78 method1615(boolean arg0) {
        class78 var2 = this.field3568;
        field3552++;
        if (this.field3557 == var2) {
            this.field3568 = null;
            return null;
        } else {
            this.field3568 = var2.field1195;
            return arg0 ? (class78) null : var2;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILpb;)V", line = 192)
    public final void method1616(int arg0, class78 arg1) {
        field3561++;
        if (arg1.field1197 != null) {
            arg1.method571(7);
        }
        if (arg0 != 1) {
            method1611(false, -60);
        }
        arg1.field1197 = this.field3557.field1197;
        arg1.field1195 = this.field3557;
        arg1.field1197.field1195 = arg1;
        arg1.field1195.field1197 = arg1;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIBII)V", line = 212)
    public static final void method1617(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field3558++;
        int var7 = class308.method2129(arg2, class195.field3108, class188.field2995, 1252946087);
        int var8 = class308.method2129(arg5, class195.field3108, class188.field2995, 1252946087);
        int var9 = class308.method2129(arg6, class116.field1888, class319.field4965, 1252946087);
        int var10 = class308.method2129(arg3, class116.field1888, class319.field4965, 1252946087);
        int var11 = class308.method2129(arg2 + arg0, class195.field3108, class188.field2995, 1252946087);
        int var12 = class308.method2129(arg5 - arg0, class195.field3108, class188.field2995, 1252946087);
        int var13 = 56 / ((arg4 + 34) / 35);
        for (int var14 = var7; var14 < var11; var14++) {
            class86.method614(arg1, -24891, var10, var9, class102.field1729[var14]);
        }
        for (int var15 = var8; var15 > var12; var15--) {
            class86.method614(arg1, -24891, var10, var9, class102.field1729[var15]);
        }
        int var16 = class308.method2129(arg0 + arg6, class116.field1888, class319.field4965, 1252946087);
        int var17 = class308.method2129(arg3 - arg0, class116.field1888, class319.field4965, 1252946087);
        for (int var18 = var11; var18 <= var12; var18++) {
            int[] var19 = class102.field1729[var18];
            class86.method614(arg1, -24891, var16, var9, var19);
            class86.method614(arg1, -24891, var10, var17, var19);
        }
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V", line = 264)
    public static final void method1618(int arg0) {
        class29.field477.method1832((byte) -100);
        field3555++;
        class78.field1186.method1832((byte) -118);
        if (arg0 != 19065) {
            method1617(107, -122, 110, -81, (byte) 118, 48, 96);
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V", line = 285)
    public class222() {
        this.field3557.field1197 = this.field3557;
        this.field3557.field1195 = this.field3557;
    }
}
