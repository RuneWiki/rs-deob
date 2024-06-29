import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class76 extends class213 {

    @OriginalMember(owner = "client!h", name = "R", descriptor = "Lah;")
    public class9 field1484;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "Lvd;")
    private static class222 field1480 = class212.method1357("Welcome to RuneScape", 10731);

    @OriginalMember(owner = "client!h", name = "P", descriptor = "Lvd;")
    public static class222 field1482 = field1480;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "Lcf;")
    public static class28 field1479 = new class28();

    @OriginalMember(owner = "client!h", name = "S", descriptor = "Lvd;")
    private static class222 field1485 = class212.method1357("Please enter your username)3", 10731);

    @OriginalMember(owner = "client!h", name = "T", descriptor = "Lvd;")
    public static class222 field1486 = field1485;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
    public static void method507(int arg0) {
        field1482 = null;
        field1480 = null;
        if (arg0 < -32) {
            field1486 = null;
            field1485 = null;
            field1479 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
    public static final void method508(int arg0) {
        class215 var1 = class180.field3335;
        synchronized (class180.field3335) {
            class138.field2673 = class221.field4091;
            class13.field230++;
            if (class114.field2140 >= 0) {
                while (class129.field2509 != class114.field2140) {
                    int var2 = class36.field788[class129.field2509];
                    class129.field2509 = class129.field2509 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class6.field98[var2] = true;
                    } else {
                        class6.field98[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class6.field98[var3] = false;
                }
                class114.field2140 = class129.field2509;
            }
            class221.field4091 = class66.field1248;
        }
        field1481++;
        if (arg0 != -19506) {
            field1485 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIILba;IBI)V")
    public static final void method509(int arg0, int arg1, int arg2, class13 arg3, int arg4, byte arg5, int arg6) {
        if (arg5 != 96) {
            field1486 = null;
        }
        field1483++;
        int var7 = arg0 * arg0 + arg1 * arg1;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg3.field341 / 2, arg3.field245 / 2);
        if (var8 * var8 >= var7) {
            class228.method1506(arg1, arg6, arg4, class32.field667[arg2], (byte) -94, arg0, arg3);
            return;
        }
        int var9 = class116.field2218 + class34.field740 & 0x7FF;
        var8 -= 10;
        int var10 = class199.field3640[var9];
        int var11 = var10 * 256 / (class208.field3876 + 256);
        int var12 = class199.field3624[var9];
        int var13 = var12 * 256 / (class208.field3876 + 256);
        int var14 = arg0 * var11 + arg1 * var13 >> 16;
        int var15 = arg0 * var13 - arg1 * var11 >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var8);
        int var19 = (int) ((double) var8 * Math.cos(var16));
        class151.field2921[arg2].method178(arg6 + var18 + arg3.field341 / 2 - 10, arg3.field245 / 2 + arg4 + -var19 + -10, 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lah;)V")
    public class76(class9 arg0) {
        this.field1484 = arg0;
    }
}
