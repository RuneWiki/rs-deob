import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class299 extends class111 {

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "Z")
    public static boolean field4338;

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "[B")
    public static byte[] field4340;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "Ljq;")
    public class299 field4336;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "Ljq;")
    public class299 field4339;

    static {
        new class291(64);
        field4338 = false;
        field4345 = -1;
        field4340 = new byte[520];
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)Lp;", line = 4)
    public static final class120 method2013(int arg0, int arg1, int arg2) {
        class74 var3 = class385.field5449[arg0][arg1][arg2];
        return var3 == null ? null : var3.field977;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILlf;I)V", line = 16)
    public static final void method2014(int arg0, class130 arg1, int arg2) {
        if (arg2 != 1) {
            field4345 = 11;
        }
        field4335++;
        if (class204.field2886 == null) {
            return;
        }
        try {
            class204.field2886.method1109(0L, (byte) -79);
            class204.field2886.method1117((byte) -122, arg0, 24, arg1.field1851);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V", line = 37)
    public static void method2015(byte arg0) {
        field4340 = null;
        if (arg0 != -100) {
            method2015((byte) -1);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIB)Lbr;", line = 53)
    public static final class223 method2016(int arg0, int arg1, byte arg2) {
        field4337++;
        class223 var3 = class438.method2732(arg1, 0);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field3246 == null || arg0 >= var3.field3246.length) {
            return null;
        } else {
            int var4 = -82 % ((70 - arg2) / 45);
            return var3.field3246[arg0];
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)V", line = 75)
    public final void method2017(boolean arg0) {
        field4334++;
        if (this.field4336 == null) {
            return;
        }
        this.field4336.field4339 = this.field4339;
        this.field4339.field4336 = this.field4336;
        this.field4339 = null;
        if (arg0) {
            field4340 = null;
        }
        this.field4336 = null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(JIII)V", line = 94)
    public static final void method2018(long arg0, int arg1, int arg2, int arg3) {
        field4343++;
        if (arg1 != -21482) {
            return;
        }
        int var5 = (int) arg0 >> 14 & 0x1F;
        int var6 = (int) arg0 >> 20 & 0x3;
        int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class452.method2815(class181.field2555.field4601[0], arg3, 0, class181.field2555.field4595[0], 0, 0, true, (byte) -11, var5, var6, arg2);
            return;
        }
        class282 var8 = class398.method2496(-122, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field4090;
            var10 = var8.field4085;
        } else {
            var9 = var8.field4085;
            var10 = var8.field4090;
        }
        int var11 = var8.field4032;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class452.method2815(class181.field2555.field4601[0], arg3, var9, class181.field2555.field4595[0], var10, var11, true, (byte) -11, 0, 0, arg2);
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V", line = 154)
    public static final void method2019(int arg0) {
        field4342++;
        class407.field5761.field1880 = 0;
        class198.field2831 = -1;
        class324.field4719 = -1;
        class213.field3012 = -1;
        class352.field5114.field1880 = 0;
        class312.field4617 = 0;
        class13.field189 = -1;
        class270.field3952 = 0;
        class242.field3572 = 0;
        class84.method492(0);
        class333.method2183(-85);
        int var1 = 0;
        int var2 = 67 / ((-arg0 - 70) / 54);
        while (class243.field3596.length > var1) {
            if (class243.field3596[var1] != null) {
                class243.field3596[var1].field4569 = -1;
            }
            var1++;
        }
        for (int var3 = 0; var3 < class442.field6317.length; var3++) {
            if (class442.field6317[var3] != null) {
                class442.field6317[var3].field4569 = -1;
            }
        }
        class353.method2313(256);
        class336.field4878 = 1;
        class390.method2463(30, true);
        for (int var4 = 0; var4 < 100; var4++) {
            class353.field5126[var4] = true;
        }
        class130.method805(-95);
    }
}
