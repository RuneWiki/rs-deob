import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class47 extends class136 {

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "Li;")
    private class88 field876 = class93.field1750;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "Lca;")
    public static class24 field879 = new class24(30);

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public static int field884 = 0;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "Li;")
    public static class88 field881 = class208.method1425(105, "sl_arrows");

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "Li;")
    public static class88 field891 = class208.method1425(105, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    public int field873;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    private int field877;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    public int field882;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "Lob;")
    private class154 field871;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "Lrc;")
    public static class188 field887;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLea;)V")
    public final void method355(byte arg0, class46 arg1) {
        field874++;
        if (arg0 != 33) {
            return;
        }
        while (true) {
            int var3 = arg1.method347(26119);
            if (var3 == 0) {
                return;
            }
            this.method364(var3, (byte) -14, arg1);
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)I")
    public final int method356(int arg0, int arg1) {
        field888++;
        if (arg0 != -1339210640) {
            method362(-31);
        }
        if (this.field871 == null) {
            return this.field877;
        } else {
            class192 var3 = (class192) this.field871.method1051(-1, (long) arg1);
            return var3 == null ? this.field877 : var3.field3700;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILnb;Lnb;)V")
    public static final void method357(int arg0, class144 arg1, class144 arg2) {
        field883++;
        if (arg0 > -69) {
            field879 = null;
        }
        class209.field3970 = arg1;
        class170.field3264 = arg2;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILnb;II)Z")
    public static final boolean method358(int arg0, class144 arg1, int arg2, int arg3) {
        if (arg0 != 854010832) {
            method359(-5, 0, 41, 16, 98, 4, -115, -87);
        }
        field880++;
        byte[] var4 = arg1.method941((byte) 56, arg3, arg2);
        if (var4 == null) {
            return false;
        } else {
            class244.method1603(64, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field872++;
        int var8 = 2048 - arg3 & 0x7FF;
        if (arg0 > -81) {
            field891 = null;
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = arg5;
        int var12 = 2048 - arg4 & 0x7FF;
        if (var12 != 0) {
            int var13 = class173.field3361[var12];
            int var14 = class173.field3356[var12];
            var10 = -arg5 * var13 >> 16;
            var11 = arg5 * var14 >> 16;
        }
        if (var8 != 0) {
            int var15 = class173.field3361[var8];
            int var16 = class173.field3356[var8];
            var9 = var11 * var15 >> 16;
            var11 = var11 * var16 >> 16;
        }
        class108.field1956 = arg2 - var10;
        class79.field1428 = arg1 - var9;
        class184.field3610 = arg7 - var11;
        class170.field3259 = arg3;
        class207.field3936 = arg4;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)Li;")
    public final class88 method360(int arg0, byte arg1) {
        field878++;
        if (this.field871 == null) {
            return this.field876;
        }
        if (arg1 > -58) {
            method363(-52);
        }
        class216 var3 = (class216) this.field871.method1051(-1, (long) arg0);
        return var3 == null ? this.field876 : var3.field4048;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)V")
    public static void method361(byte arg0) {
        field891 = null;
        field887 = null;
        field879 = null;
        if (arg0 != 24) {
            method363(-70);
        }
        field881 = null;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
    public static final void method362(int arg0) {
        if (class43.field732 != null) {
            class17 var1 = class43.field732;
            synchronized (class43.field732) {
                class43.field732 = null;
            }
        }
        if (arg0 != 3) {
            method358(59, null, 13, 17);
        }
        field886++;
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
    public static final void method363(int arg0) {
        field870++;
        if (!class10.field145 || arg0 > -79) {
            return;
        }
        class174 var1 = class36.method238(client.field569, class16.field249, true);
        if (var1 != null && var1.field3442 != null) {
            class39 var2 = new class39();
            var2.field678 = var1;
            var2.field681 = var1.field3442;
            class200.method1375(var2, -876775538);
        }
        class10.field145 = false;
        class200.method1373(65280, var1);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBLea;)V")
    private final void method364(int arg0, byte arg1, class46 arg2) {
        if (arg0 == 1) {
            this.field873 = arg2.method347(26119);
        } else if (arg0 == 2) {
            this.field882 = arg2.method347(arg1 + 26133);
        } else if (arg0 == 3) {
            this.field876 = arg2.method298(-128);
        } else if (arg0 == 4) {
            this.field877 = arg2.method323((byte) -41);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg2.method301(18);
            this.field871 = new class154(class184.method1298(true, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method323((byte) -76);
                class67 var7;
                if (arg0 == 5) {
                    var7 = new class216(arg2.method298(-127));
                } else {
                    var7 = new class192(arg2.method323((byte) -105));
                }
                this.field871.method1054((long) var6, var7, -1);
            }
        }
        if (arg1 != -14) {
            field885 = -73;
        }
        field875++;
    }
}
