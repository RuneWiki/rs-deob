import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public abstract class class130 {

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "Lkh;")
    public static class117 field2384 = class224.method1450((byte) 125, "VOLL");

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "Lkh;")
    public static class117 field2392 = class224.method1450((byte) -43, "Angreifen");

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "Lkh;")
    public static class117 field2395 = class224.method1450((byte) 123, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field2396 = 0;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Lge;")
    public static class71 field2386 = new class71(64);

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "B")
    public static byte field2393;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public int field2389;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public int field2390;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "Lmc;")
    public static class134 field2397;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "Ljava/awt/Image;")
    public Image field2394;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "[I")
    public int[] field2388;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "[[S")
    public static short[][] field2387;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
    public abstract void method36(int arg0, Graphics arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
    public static final Object method882(byte[] arg0, int arg1, boolean arg2) {
        field2391++;
        if (arg0 == null) {
            return null;
        }
        if (~arg0.length < arg1 && !class154.field2816) {
            try {
                class110 var3 = (class110) Class.forName("rc").getDeclaredConstructor().newInstance();
                var3.method745((byte) -113, arg0);
                return var3;
            } catch (Throwable var4) {
                class154.field2816 = true;
            }
        }
        return arg2 ? class207.method1365(arg0, 0) : arg0;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method883(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[][][] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, byte arg13, int arg14, int arg15) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class92.field1698 * 128) {
            arg0 = class92.field1698 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class170.field3053 * 128) {
            arg2 = class170.field3053 * 128 - 1;
        }
        class161.field2940 = class89.field1650[arg3];
        class41.field930 = class89.field1646[arg3];
        class194.field3463 = class89.field1650[arg4];
        class147.field2693 = class89.field1646[arg4];
        class225.field4064 = arg0;
        class115.field2139 = arg1;
        class175.field3160 = arg2;
        class38.field870 = arg0 / 128;
        class225.field4065 = arg2 / 128;
        class76.field1451 = arg5;
        class75.field1414 = class38.field870 - class41.field933;
        if (class75.field1414 < 0) {
            class75.field1414 = 0;
        }
        class158.field2880 = class225.field4065 - class41.field933;
        if (class158.field2880 < 0) {
            class158.field2880 = 0;
        }
        class209.field3757 = class41.field933 + class38.field870;
        if (class209.field3757 > class92.field1698) {
            class209.field3757 = class92.field1698;
        }
        class13.field411 = class41.field933 + class225.field4065;
        if (class13.field411 > class170.field3053) {
            class13.field411 = class170.field3053;
        }
        short var16 = 3500;
        for (int var17 = 0; var17 < class41.field933 + class41.field933 + 2; var17++) {
            for (int var20 = 0; var20 < class41.field933 + class41.field933 + 2; var20++) {
                int var21 = (var17 - class41.field933 << 7) - (class225.field4064 & 0x7F);
                int var22 = (var20 - class41.field933 << 7) - (class175.field3160 & 0x7F);
                int var23 = class38.field870 + var17 - class41.field933;
                int var24 = class225.field4065 + var20 - class41.field933;
                if (var23 >= 0 && var24 >= 0 && var23 < class92.field1698 && var24 < class170.field3053) {
                    int var25;
                    if (class75.field1423 == null) {
                        var25 = class146.field2684[0][var23][var24] + 128 - class115.field2139;
                    } else {
                        var25 = class75.field1423[0][var23][var24] + 128 - class115.field2139;
                    }
                    int var26 = class146.field2684[3][var23][var24] - class115.field2139 - 1000;
                    class156.field2841[var17][var20] = class222.method1441(var21, var26, var25, var22, var16);
                } else {
                    class156.field2841[var17][var20] = false;
                }
            }
        }
        for (int var18 = 0; var18 < class41.field933 + class41.field933 + 1; var18++) {
            for (int var19 = 0; var19 < class41.field933 + class41.field933 + 1; var19++) {
                class95.field1740[var18][var19] = class156.field2841[var18][var19] || class156.field2841[var18 + 1][var19] || class156.field2841[var18][var19 + 1] || class156.field2841[var18 + 1][var19 + 1];
            }
        }
        class26.field655 = arg7;
        class147.field2692 = arg8;
        class127.field2344 = arg9;
        class40.field912 = arg10;
        class147.field2687 = arg11;
        class20.method181();
        class127.method873(arg0, arg1, arg2, arg6, arg12, arg13, arg14, arg15);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public final void method884(byte arg0) {
        class83.method571(this.field2388, this.field2389, this.field2390);
        field2385++;
        int var2 = -53 % ((arg0 - 67) / 53);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method41(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
    public abstract void method35(boolean arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
    public static void method885(boolean arg0) {
        field2387 = null;
        field2397 = null;
        field2395 = null;
        if (arg0) {
            field2384 = null;
        }
        field2386 = null;
        field2384 = null;
        field2392 = null;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    protected class130() {
    }
}
