import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class192 extends class205 {

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "Z")
    public static volatile boolean field3529 = true;

    @OriginalMember(owner = "client!sd", name = "hb", descriptor = "Lvd;")
    public static class222 field3539 = class212.method1357("und Ihr Passwort ein)3", 10731);

    @OriginalMember(owner = "client!sd", name = "jb", descriptor = "Lvd;")
    public static class222 field3541 = class212.method1357("::errortest", 10731);

    @OriginalMember(owner = "client!sd", name = "fb", descriptor = "I")
    public static int field3537 = -1;

    @OriginalMember(owner = "client!sd", name = "ib", descriptor = "I")
    public static int field3540 = 0;

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
    public static int field3534 = 0;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    private int field3528;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "I")
    private int field3533;

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!sd", name = "gb", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!sd", name = "kb", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!sd", name = "lb", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!sd", name = "mb", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!sd", name = "nb", descriptor = "I")
    private int field3545;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "Lrf;")
    public static class184 field3531;

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "[S")
    public static short[] field3535;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        int var4 = -28 / ((-47 - arg1) / 34);
        if (arg2 == 0) {
            this.method1196(53, arg0.method701(869322848));
        }
        ++field3538;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)V")
    private final void method1196(int arg0, int arg1) {
        ++field3530;
        this.field3545 = arg1 << 4 & 4080;
        this.field3533 = (16711680 & arg1) >> 12;
        this.field3528 = arg1 >> 4 & 4080;
        int var3 = -48 / ((-11 - arg0) / 63);
    }

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "(I)V")
    public static final void method1197(int arg0) {
        if (class176.field3301 != null) {
            class11 var1 = class176.field3301;
            synchronized (class176.field3301) {
                class176.field3301 = null;
            }
        }
        int var2 = -112 / ((arg0 - -54) / 55);
        ++field3542;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)V")
    public static final void method1198(byte arg0) {
        if (arg0 >= 54) {
            ++field3532;
            for (int var1 = 0; class173.field3263 > var1; ++var1) {
                int var2 = class113.field2123[var1];
                class193 var3 = class202.field3696[var2];
                if (var3 != null) {
                    class5.method51(var3, (byte) 67, var3.field3558.field2151);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class192() {
        this(0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method96(int arg0, byte arg1) {
        ++field3527;
        int[][] var3 = super.field3815.method1003(-8357, arg0);
        if (arg1 < 98) {
            field3535 = null;
        }
        if (super.field3815.field3015) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; class118.field2245 > var7; ++var7) {
                var5[var7] = this.field3533;
                var4[var7] = this.field3528;
                var6[var7] = this.field3545;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(I)V")
    private class192(int arg0) {
        super(0, false);
        this.method1196(-75, arg0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V")
    public static final void method1199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3544;
        int var6 = class22.method209(class129.field2514, arg4, -61, class230.field4322);
        int var7 = class22.method209(class129.field2514, arg3, -69, class230.field4322);
        int var8 = class22.method209(class112.field2107, arg5, -95, class127.field2448);
        int var9 = class22.method209(class112.field2107, arg2, -30, class127.field2448);
        int var10 = var6;
        if (arg0 == -16092) {
            while (var10 <= var7) {
                class81.method532(var8, arg1, class156.field2981[var10], var9, -7);
                ++var10;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(Z)V")
    public static void method1200(boolean arg0) {
        field3541 = null;
        field3539 = null;
        field3531 = null;
        field3535 = null;
        if (!arg0) {
            method1197(-89);
        }
    }
}
