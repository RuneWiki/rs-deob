import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class61 {

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Lme;")
    private class668 field835 = new class668(64);

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "Lme;")
    public class668 field842 = new class668(50);

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "Lme;")
    public class668 field843 = new class668(5);

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "Lpe;")
    public class615 field839;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "Lpe;")
    private class615 field838;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "Lvd;")
    public class635 field834;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Z")
    public boolean field836;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field828 = 0;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Z")
    public static boolean field832 = false;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Lej;")
    public static class694 field833 = new class694();

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "Lpe;")
    public static class615 field837;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method513(int arg0) {
        field833 = null;
        if (arg0 != 0) {
            method513(-101);
        }
        field837 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
    public final void method514(int arg0, int arg1) {
        field826++;
        this.field844 = arg0;
        class668 var3 = this.field842;
        synchronized (this.field842) {
            if (arg1 != 19402) {
                return;
            }
            this.field842.method3656((byte) 0);
        }
        class668 var4 = this.field843;
        synchronized (this.field843) {
            this.field843.method3656((byte) 0);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public final void method515(byte arg0) {
        class668 var2 = this.field842;
        synchronized (this.field842) {
            this.field842.method3656((byte) 0);
        }
        field831++;
        if (arg0 != 62) {
            this.method518(-112);
        }
        class668 var3 = this.field843;
        synchronized (this.field843) {
            this.field843.method3656((byte) 0);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
    public final void method516(byte arg0) {
        field830++;
        class668 var2 = this.field835;
        synchronized (this.field835) {
            this.field835.method3656((byte) 0);
        }
        class668 var3 = this.field842;
        synchronized (this.field842) {
            if (arg0 > -68) {
                this.field838 = null;
            }
            this.field842.method3656((byte) 0);
        }
        class668 var4 = this.field843;
        synchronized (this.field843) {
            this.field843.method3656((byte) 0);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)Z")
    public static final boolean method517(byte arg0, int arg1) {
        field841++;
        int var2 = 28 / ((41 - arg0) / 38);
        return arg1 == 7 || arg1 == 8 || arg1 == 9;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public final void method518(int arg0) {
        class668 var2 = this.field835;
        synchronized (this.field835) {
            this.field835.method3658(0);
        }
        field825++;
        class668 var3 = this.field842;
        synchronized (this.field842) {
            this.field842.method3658(arg0 - 5);
            if (arg0 != 5) {
                field832 = false;
            }
        }
        class668 var4 = this.field843;
        synchronized (this.field843) {
            this.field843.method3658(0);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)Ljf;")
    public final class699 method519(int arg0, int arg1) {
        field840++;
        class668 var3 = this.field835;
        class699 var4;
        synchronized (this.field835) {
            var4 = (class699) this.field835.method3655(66, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class615 var5 = this.field838;
        byte[] var6;
        synchronized (this.field838) {
            var6 = this.field838.method3346(-1, class555.method2977(arg0, (byte) -19), class541.method2875(arg1 + 127, arg0));
        }
        class699 var7 = new class699();
        var7.field9737 = this;
        var7.field9691 = arg0;
        if (var6 != null) {
            var7.method3825(new class418(var6), (byte) -111);
        }
        if (arg1 != 0) {
            this.field838 = null;
        }
        var7.method3820((byte) 0);
        class668 var8 = this.field835;
        synchronized (this.field835) {
            this.field835.method3650((long) arg0, -111, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Liaa;[[BZ)V")
    public static final void method520(class99 arg0, byte[][] arg1, boolean arg2) {
        field827++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg1.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg1[var5];
            if (var10 != null) {
                class418 var11 = new class418(var10);
                int var12 = class547.field7096[var5] >> 8;
                int var13 = class547.field7096[var5] & 0xFF;
                int var14 = var12 * 64 - class100.field1326;
                int var15 = var13 * 64 - class186.field2376;
                class424.method2439(26);
                arg0.method1876(var15, class100.field1326, 1, var14, class186.field2376, class703.field9806, var11);
                arg0.method748((byte) 84, var3, var15, var11, var14, class520.field6799);
                if (!arg0.field4215 && (class677.field9340 / 8) == var12 && (class649.field9048 / 8) == var13 && var3[0] != -1) {
                    class625.field8743 = class382.field4898.method2020(var3[2], var3[3], (byte) 87, var3[0], class277.field3629, var3[1]);
                    class221.field2897 = var3[4];
                }
            }
        }
        if (!arg2) {
            method517((byte) 96, -70);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class547.field7096[var6] >> 8) * 64 - class100.field1326;
            int var8 = (class547.field7096[var6] & 0xFF) * 64 - class186.field2376;
            byte[] var9 = arg1[var6];
            if (var9 == null && class649.field9048 < 800) {
                class424.method2439(26);
                arg0.method1875(var7, 64, 64, var8, !arg2);
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZB)V")
    public final void method521(boolean arg0, byte arg1) {
        field824++;
        if (arg0 == this.field836) {
            return;
        }
        if (arg1 != -75) {
            this.method514(-109, -87);
        }
        this.field836 = arg0;
        this.method516((byte) -92);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(BI)V")
    public final void method522(byte arg0, int arg1) {
        field829++;
        class668 var3 = this.field835;
        synchronized (this.field835) {
            this.field835.method3659(-119, arg1);
        }
        class668 var4 = this.field842;
        synchronized (this.field842) {
            this.field842.method3659(-99, arg1);
        }
        class668 var5 = this.field843;
        synchronized (this.field843) {
            if (arg0 != 114) {
                field837 = null;
            }
            this.field843.method3659(-116, arg1);
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lvd;IZLpe;Lpe;)V")
    public class61(class635 arg0, int arg1, boolean arg2, class615 arg3, class615 arg4) {
        this.field839 = arg4;
        this.field838 = arg3;
        this.field834 = arg0;
        this.field836 = arg2;
        if (this.field838 != null) {
            int var6 = this.field838.method3366(-75) - 1;
            this.field838.method3341(var6, -19046);
        }
    }
}
