import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public class class351 {

    @OriginalMember(owner = "client!wja", name = "h", descriptor = "Ltaa;")
    public class155 field4973 = new class155();

    @OriginalMember(owner = "client!wja", name = "i", descriptor = "[I")
    public static int[] field4974 = new int[13];

    @OriginalMember(owner = "client!wja", name = "b", descriptor = "Low;")
    public static class665 field4967 = new class665();

    @OriginalMember(owner = "client!wja", name = "k", descriptor = "Lin;")
    public static class380 field4976 = new class380(41, 6);

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!wja", name = "c", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!wja", name = "d", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!wja", name = "e", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!wja", name = "f", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!wja", name = "g", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!wja", name = "j", descriptor = "Ltaa;")
    private class155 field4975;

    @OriginalMember(owner = "client!wja", name = "l", descriptor = "[[B")
    public static byte[][] field4977;

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(Ltaa;I)V")
    public final void method2126(class155 arg0, int arg1) {
        field4966++;
        if (arg0.field2449 != null) {
            arg0.method1207((byte) -1);
        }
        if (arg1 >= -86) {
            method2131(true);
        }
        arg0.field2449 = this.field4973.field2449;
        arg0.field2450 = this.field4973;
        arg0.field2449.field2450 = arg0;
        arg0.field2450.field2449 = arg0;
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(B)Ltaa;")
    public final class155 method2127(byte arg0) {
        field4970++;
        class155 var2 = this.field4975;
        if (this.field4973 == var2) {
            this.field4975 = null;
            return null;
        } else {
            int var3 = -89 % ((2 - arg0) / 46);
            this.field4975 = var2.field2450;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(I)Ltaa;")
    public final class155 method2128(int arg0) {
        if (arg0 != 38) {
            return null;
        }
        field4971++;
        class155 var2 = this.field4973.field2450;
        if (this.field4973 == var2) {
            this.field4975 = null;
            return null;
        } else {
            this.field4975 = var2.field2450;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wja", name = "b", descriptor = "(I)V")
    public final void method2129(int arg0) {
        while (true) {
            class155 var2 = this.field4973.field2450;
            if (this.field4973 == var2) {
                if (arg0 != 0) {
                    field4977 = null;
                }
                field4972++;
                this.field4975 = null;
                return;
            }
            var2.method1207((byte) -1);
        }
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(B[B)Ljn;")
    public static final class136 method2130(byte arg0, byte[] arg1) {
        field4969++;
        class136 var2 = new class136();
        class431 var3 = new class431(arg1);
        var3.field5983 = var3.field6002.length - 2;
        int var4 = var3.method2565((byte) -88);
        int var5 = -108 / ((-arg0 - 23) / 41);
        int var6 = var3.field6002.length - var4 - 2 - 16;
        var3.field5983 = var6;
        int var7 = var3.method2526(17);
        var2.field2271 = var3.method2565((byte) -125);
        var2.field2257 = var3.method2565((byte) -106);
        var2.field2266 = var3.method2565((byte) -96);
        var2.field2262 = var3.method2565((byte) -105);
        var2.field2261 = var3.method2565((byte) -126);
        var2.field2272 = var3.method2565((byte) -119);
        int var8 = var3.method2557(14929);
        if (var8 > 0) {
            var2.field2258 = new class769[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = var3.method2565((byte) -87);
                class769 var11 = new class769(class661.method3706(var10, true));
                var2.field2258[var9] = var11;
                while ((var10--) > 0) {
                    int var12 = var3.method2526(17);
                    int var13 = var3.method2526(17);
                    var11.method4252(false, new class725(var13), (long) var12);
                }
            }
        }
        var3.field5983 = 0;
        var2.field2259 = var3.method2578(1712145680);
        var2.field2263 = new int[var7];
        int var14 = 0;
        while (var6 > var3.field5983) {
            int var15 = var3.method2565((byte) -100);
            if (var15 == 3) {
                if (var2.field2270 == null) {
                    var2.field2270 = new String[var7];
                }
                var2.field2270[var14] = var3.method2532((byte) -124).intern();
            } else if (var15 == 54) {
                if (var2.field2265 == null) {
                    var2.field2265 = new long[var7];
                }
                var2.field2265[var14] = var3.method2567((byte) -125);
            } else {
                if (var2.field2267 == null) {
                    var2.field2267 = new int[var7];
                }
                if (var15 >= 150 || var15 == 21 || var15 == 38 || var15 == 39) {
                    var2.field2267[var14] = var3.method2557(14929);
                } else {
                    var2.field2267[var14] = var3.method2526(17);
                }
            }
            var2.field2263[var14++] = var15;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(Z)V")
    public static void method2131(boolean arg0) {
        field4967 = null;
        field4974 = null;
        field4976 = null;
        field4977 = null;
        if (arg0) {
            method2131(false);
        }
    }

    @OriginalMember(owner = "client!wja", name = "b", descriptor = "(Z)I")
    public final int method2132(boolean arg0) {
        field4968++;
        if (arg0) {
            this.field4973 = null;
        }
        int var2 = 0;
        for (class155 var3 = this.field4973.field2450; var3 != this.field4973; var3 = var3.field2450) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wja", name = "<init>", descriptor = "()V")
    public class351() {
        this.field4973.field2450 = this.field4973;
        this.field4973.field2449 = this.field4973;
    }
}
