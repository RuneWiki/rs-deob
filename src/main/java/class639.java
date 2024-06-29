import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class639 implements class355 {

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "Lpfa;")
    private class275 field8661;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "Lpfa;")
    private class275 field8659;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "Lmea;")
    private class398 field8662;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field8658 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "Lpw;")
    public static class661 field8653 = new class661("", 14);

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "[I")
    public static int[] field8660 = new int[1000];

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "Z")
    public static boolean field8664 = false;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public static int field8654;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
    public static int field8656;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    public static int field8657;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
    public static int field8663;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "Lta;")
    private class201 field8655;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "Lgo;")
    public static class586 field8665;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZB)V", line = 5)
    public final void method513(boolean arg0, byte arg1) {
        field8656++;
        if (arg0) {
            int var3 = this.field8662.field5050.method3205(class696.field9640, -7963, this.field8662.field5047) + this.field8662.field5057;
            int var4 = this.field8662.field5061.method1445(2, class634.field8596, this.field8662.field5045) + this.field8662.field5055;
            this.field8655.method1175(this.field8662.field5062, 0, this.field8662.field5048, this.field8662.field5045, this.field8662.field5054, null, (byte) -34, var3, null, this.field8662.field5053, var4, this.field8662.field5047, this.field8662.field5051, 0, this.field8662.field5046, null);
        }
        if (arg1 <= 57) {
            this.method516(-60);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V", line = 25)
    public final void method518(int arg0) {
        field8657++;
        if (arg0 != -841) {
            this.field8659 = null;
        }
        class20 var2 = class267.method1587((byte) -124, this.field8662.field5044, this.field8661);
        this.field8655 = class309.field3898.method414(var2, class495.method2690(this.field8659, this.field8662.field5044), true);
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)Z", line = 41)
    public final boolean method516(int arg0) {
        field8654++;
        if (arg0 != -6191) {
            this.method518(-17);
        }
        boolean var2 = true;
        if (!this.field8659.method1669((byte) -51, this.field8662.field5044)) {
            var2 = false;
        }
        if (!this.field8661.method1669((byte) 119, this.field8662.field5044)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIIIII)V", line = 60)
    public static final void method3587(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 21979) {
            return;
        }
        field8663++;
        class257.method1536(arg0, 2);
        int var7 = 0;
        int var8 = arg0 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class30.field364[arg3];
        int var16 = arg4 - var8;
        class390.method2223(arg4 - arg0, arg6, var15, (byte) -70, var16);
        int var17 = arg4 + var8;
        class390.method2223(var16, arg2, var15, (byte) -114, var17);
        class390.method2223(var17, arg6, var15, (byte) -125, arg0 + arg4);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class363.field4657[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 > var9) {
                    int[] var18 = class30.field364[arg3 + var9];
                    int[] var19 = class30.field364[arg3 - var9];
                    int var20 = class363.field4657[var9];
                    int var21 = arg4 + var7;
                    int var22 = arg4 - var7;
                    int var23 = arg4 + var20;
                    int var24 = arg4 - var20;
                    class390.method2223(var22, arg6, var18, (byte) -74, var24);
                    class390.method2223(var24, arg2, var18, (byte) -80, var23);
                    class390.method2223(var23, arg6, var18, (byte) -94, var21);
                    class390.method2223(var22, arg6, var19, (byte) -103, var24);
                    class390.method2223(var24, arg2, var19, (byte) -66, var23);
                    class390.method2223(var23, arg6, var19, (byte) -119, var21);
                } else {
                    int[] var25 = class30.field364[arg3 + var9];
                    int[] var26 = class30.field364[arg3 - var9];
                    int var27 = arg4 + var7;
                    int var28 = arg4 - var7;
                    class390.method2223(var28, arg6, var25, (byte) -123, var27);
                    class390.method2223(var28, arg6, var26, (byte) -128, var27);
                }
            }
            int[] var29 = class30.field364[arg3 + var7];
            int[] var30 = class30.field364[arg3 - var7];
            int var31 = arg4 + var9;
            int var32 = arg4 - var9;
            if (var8 > var7) {
                int var33 = var7 <= var11 ? var11 : class363.field4657[var7];
                int var34 = arg4 + var33;
                int var35 = arg4 - var33;
                class390.method2223(var32, arg6, var29, (byte) -104, var35);
                class390.method2223(var35, arg2, var29, (byte) -121, var34);
                class390.method2223(var34, arg6, var29, (byte) -67, var31);
                class390.method2223(var32, arg6, var30, (byte) -76, var35);
                class390.method2223(var35, arg2, var30, (byte) -96, var34);
                class390.method2223(var34, arg6, var30, (byte) -95, var31);
            } else {
                class390.method2223(var32, arg6, var29, (byte) -64, var31);
                class390.method2223(var32, arg6, var30, (byte) -123, var31);
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)V", line = 189)
    public static void method3588(boolean arg0) {
        if (!arg0) {
            field8653 = null;
        }
        field8665 = null;
        field8660 = null;
        field8653 = null;
        field8658 = null;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lpfa;Lpfa;Lmea;)V", line = 220)
    public class639(class275 arg0, class275 arg1, class398 arg2) {
        this.field8661 = arg1;
        this.field8659 = arg0;
        this.field8662 = arg2;
    }
}
