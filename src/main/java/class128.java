import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class128 extends class12 {

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "[I")
    public static int[] field2312 = new int[25];

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "Ltg;")
    public static class184 field2310 = class135.method812("Geben Sie Ihren Benutzernamen", 3);

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "Ltg;")
    public static class184 field2317 = class135.method812("<col=ffffff> )4 ", 3);

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
    public static int field2316 = 0;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "Ltg;")
    private static class184 field2307 = class135.method812(" from your friend list first)3", 3);

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "Ltg;")
    public static class184 field2323 = field2307;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "Ltg;")
    private static class184 field2324 = class135.method812("slide:", 3);

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "Ltg;")
    public static class184 field2325 = field2324;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "Ltg;")
    public static class184 field2315 = field2324;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "B")
    public static byte field2306;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "J")
    public static long field2322;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "Lj;")
    public static class87 field2319;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        ++field2318;
        if (arg1 != 17) {
            method784((class167) null, (byte) 120);
        }
        int[] var3 = super.field224.method7((byte) 104, arg0);
        if (super.field224.field53) {
            int[][] var4 = this.method76(arg0, 6218, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class201.field3889 < ~var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method778(Component arg0, int arg1) {
        arg0.addMouseListener(class179.field3415);
        ++field2311;
        int var2 = 37 % ((arg1 - 45) / 34);
        arg0.addMouseMotionListener(class179.field3415);
        arg0.addFocusListener(class179.field3415);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZZZII)Lud;")
    public static final class190 method779(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        if (arg3 != 7568) {
            field2319 = null;
        }
        ++field2313;
        class143 var5 = null;
        if (class180.field3434 != null) {
            var5 = new class143(arg4, class180.field3434, class51.field941[arg4], 1000000);
        }
        return new class190(var5, class83.field1489, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V")
    public static final void method780(int arg0) {
        ++field2309;
        class12.field222 = null;
        if (arg0 <= 65) {
            method781(-13, 88, (class197) null);
        }
        class170.field3238 = null;
        class60.field1112 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILvb;)Z")
    public static final boolean method781(int arg0, int arg1, class197 arg2) {
        ++field2314;
        byte[] var3 = arg2.method1259(arg1, 20980);
        if (arg0 != -31807) {
            field2325 = null;
        }
        if (var3 == null) {
            return false;
        } else {
            class74.method437(arg0 + 31808, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
    public static void method782(byte arg0) {
        field2319 = null;
        field2307 = null;
        field2324 = null;
        field2325 = null;
        field2315 = null;
        field2312 = null;
        field2317 = null;
        field2323 = null;
        field2310 = null;
        int var1 = 6 / ((71 - arg0) / 36);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lvb;I)V")
    public static final void method783(class197 arg0, int arg1) {
        if (arg1 > 39) {
            ++field2321;
            class9.field173 = arg0;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class128() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Lrh;B)Z")
    public static final boolean method784(class167 arg0, byte arg1) {
        int var2 = arg0.field3101;
        ++field2308;
        if (var2 == 205) {
            class175.field3324 = 250;
            return true;
        } else {
            if (~var2 <= -301 && ~var2 >= -314) {
                int var3 = (var2 + -300) / 2;
                int var4 = var2 & 1;
                class36.field674.method1318(~var4 == -2, 1, var3);
            }
            if (~var2 <= -315 && ~var2 >= -324) {
                int var5 = (var2 + -314) / 2;
                int var6 = 1 & var2;
                class36.field674.method1319(-1, var5, ~var6 == -2);
            }
            if (var2 == 324) {
                class36.field674.method1320(false, (byte) 82);
            }
            if (var2 == 325) {
                class36.field674.method1320(true, (byte) 44);
            }
            if (~var2 == -327) {
                class117.field2122.method106(217, -115);
                ++class170.field3223;
                class36.field674.method1321(class117.field2122, 12);
                return true;
            } else {
                if (arg1 >= -85) {
                    method778((Component) null, -25);
                }
                return false;
            }
        }
    }
}
