import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class28 extends class149 {

    @OriginalMember(owner = "client!df", name = "u", descriptor = "[J")
    private long[] field794 = new long[10];

    @OriginalMember(owner = "client!df", name = "r", descriptor = "Laa;")
    public static class2 field791 = new class2();

    @OriginalMember(owner = "client!df", name = "C", descriptor = "Lfc;")
    public static class39 field802 = class90.method774("Zu viele Anmelde)2Versuche von Ihrer Adresse", -84);

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public static int field801 = 0;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "Lfc;")
    private static class39 field805 = class90.method774("Loaded fonts", -89);

    @OriginalMember(owner = "client!df", name = "E", descriptor = "Z")
    public static boolean field804 = false;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "I")
    public static int field810 = 0;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "Lfc;")
    public static class39 field806 = field805;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "Lfc;")
    private static class39 field812 = class90.method774("Connecting to update server", -105);

    @OriginalMember(owner = "client!df", name = "D", descriptor = "Lfc;")
    public static class39 field803 = field812;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "Lfc;")
    private static class39 field816 = class90.method774("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", -121);

    @OriginalMember(owner = "client!df", name = "P", descriptor = "Lfc;")
    public static class39 field815 = field816;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "Lp;")
    public static class104 field814 = new class104(128);

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    private int field785;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    private int field786;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    private int field787;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    private int field797;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "J")
    private long field796;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "Lmf;")
    public static class89 field811;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "Lmf;")
    public static class89 field818;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBLfc;Lfc;)V", line = 4)
    public static final void method346(int arg0, byte arg1, class39 arg2, class39 arg3) {
        if (arg0 == 0 && class126.field3203 != -1) {
            class61.field1496 = arg2;
            class13.field343 = 0;
        }
        field792++;
        if (class37.field1008 == -1) {
            class128.field3242 = true;
        }
        for (int var4 = 99; var4 > 0; var4--) {
            class145.field3623[var4] = class145.field3623[var4 - 1];
            class139.field3515[var4] = class139.field3515[var4 - 1];
            class112.field2936[var4] = class112.field2936[var4 - 1];
        }
        if (arg1 <= 64) {
            field804 = false;
        }
        class145.field3623[0] = arg0;
        class139.field3515[0] = arg3;
        class112.field2936[0] = arg2;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)Z", line = 46)
    public static final boolean method347(int arg0) {
        field795++;
        class50 var1 = class13.field331;
        synchronized (class13.field331) {
            if (class50.field1279 == class29.field822) {
                return false;
            } else {
                class17.field482 = class72.field1688[class29.field822];
                class109.field2798 = class131.field3313[class29.field822];
                class29.field822 = class29.field822 + arg0 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V", line = 64)
    public static void method348(boolean arg0) {
        field818 = null;
        field811 = null;
        field814 = null;
        field805 = null;
        field806 = null;
        field791 = null;
        if (arg0) {
            field806 = null;
        }
        field803 = null;
        field816 = null;
        field812 = null;
        field815 = null;
        field802 = null;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V", line = 84)
    public final void method349(int arg0) {
        field783++;
        this.field797 = 0;
        this.field787 = 256;
        if (arg0 != 512) {
            return;
        }
        this.field786 = 1;
        this.field796 = class29.method361(-5321);
        for (int var2 = 0; var2 < 10; var2++) {
            this.field794[var2] = this.field796;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)V", line = 110)
    public static final void method350(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            class79.field1794.method393((byte) -14, 197);
            class153.field3761++;
            class79.field1794.method283(true, arg0);
            class79.field1794.method325(arg1, -51);
        }
        if (~arg3 == arg2) {
            class79.field1794.method393((byte) -14, 34);
            class37.field999++;
            class79.field1794.method283(true, arg0);
            class79.field1794.method325(arg1, -92);
        }
        if (arg3 == 3) {
            class12.field305++;
            class79.field1794.method393((byte) -14, 35);
            class79.field1794.method283(true, arg0);
            class79.field1794.method325(arg1, 113);
        }
        if (arg3 == 4) {
            class79.field1794.method393((byte) -14, 41);
            class79.field1794.method283(true, arg0);
            class79.field1794.method325(arg1, -118);
            class121.field3173++;
        }
        if (arg3 == 5) {
            class2.field51++;
            class79.field1794.method393((byte) -14, 165);
            class79.field1794.method283(true, arg0);
            class79.field1794.method325(arg1, 82);
        }
        field789++;
        if (arg3 == 6) {
            class99.field2443++;
            class79.field1794.method393((byte) -14, 167);
            class79.field1794.method283(true, arg0);
            class79.field1794.method325(arg1, -54);
        }
        if (arg3 == 7) {
            class65.field1568++;
            class79.field1794.method393((byte) -14, 194);
            class79.field1794.method283(true, arg0);
            class79.field1794.method325(arg1, 92);
        }
        if (arg3 == 8) {
            class120.field3142++;
            class79.field1794.method393((byte) -14, 132);
            class79.field1794.method283(true, arg0);
            class79.field1794.method325(arg1, arg2 + 82);
        }
        if (arg3 == 9) {
            field793++;
            class79.field1794.method393((byte) -14, 150);
            class79.field1794.method283(true, arg0);
            class79.field1794.method325(arg1, -112);
        }
        if (arg3 == 10) {
            class7.field204++;
            class79.field1794.method393((byte) -14, 239);
            class79.field1794.method283(true, arg0);
            class79.field1794.method325(arg1, 117);
        }
        class99 var4 = class72.method663(arg0, 0, arg1);
        if (var4 != null && var4.field2428 != null) {
            class30.method365(4, var4, var4.field2428, null, 0, 0, arg3);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 209)
    public final void method351(byte arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field794[var2] = 0L;
        }
        field809++;
        int var3 = 21 / ((-arg0 - 17) / 54);
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 534)
    public class28() {
        this.method349(512);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)I", line = 241)
    public final int method352(int arg0, int arg1, int arg2) {
        if (arg2 != 512) {
            method347(18);
        }
        field798++;
        int var4 = this.field787;
        int var5 = this.field786;
        this.field786 = 1;
        this.field787 = 300;
        this.field796 = class29.method361(-5321);
        if (this.field794[this.field785] == 0L) {
            this.field786 = var5;
            this.field787 = var4;
        } else if (this.field794[this.field785] < this.field796) {
            this.field787 = (int) ((long) (arg0 * 2560) / (this.field796 - this.field794[this.field785]));
        }
        if (this.field787 < 25) {
            this.field787 = 25;
        }
        if (this.field787 > 256) {
            this.field787 = 256;
            this.field786 = (int) ((long) arg0 - (this.field796 - this.field794[this.field785]) / 10L);
        }
        if (arg0 < this.field786) {
            this.field786 = arg0;
        }
        this.field794[this.field785] = this.field796;
        this.field785 = (this.field785 + 1) % 10;
        if (this.field786 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field794[var6] != 0L) {
                    this.field794[var6] += this.field786;
                }
            }
        }
        if (this.field786 < arg1) {
            this.field786 = arg1;
        }
        class61.method609(-84, (long) this.field786);
        int var7 = 0;
        while (this.field797 < 256) {
            var7++;
            this.field797 += this.field787;
        }
        this.field797 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIII)V", line = 317)
    public static final void method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field790++;
        if (class68.field1618 == arg1 && field817 == arg3 && (class94.field2207 == arg0 || !class74.field1705)) {
            return;
        }
        int var6 = 123 % ((arg2 - 26) / 58);
        class68.field1618 = arg1;
        class94.field2207 = arg0;
        if (!class74.field1705) {
            class94.field2207 = 0;
        }
        field817 = arg3;
        class114.method990((byte) -127, 25);
        class131.method1066(null, class2.field45, false, 257);
        int var7 = class54.field1341;
        class54.field1341 = (arg1 - 6) * 8;
        int var8 = class54.field1341 - var7;
        int var9 = class55.field1382;
        class55.field1382 = arg3 * 8 - 48;
        int var10 = class55.field1382 - var9;
        int var11 = class55.field1382;
        int var12 = class54.field1341;
        for (int var13 = 0; var13 < 32768; var13++) {
            class121 var29 = class118.field3092[var13];
            if (var29 != null) {
                for (int var30 = 0; var30 < 10; var30++) {
                    var29.field2913[var30] -= var8;
                    var29.field2926[var30] -= var10;
                }
                var29.field2909 -= var10 * 128;
                var29.field2916 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class142 var27 = class101.field2525[var14];
            if (var27 != null) {
                for (int var28 = 0; var28 < 10; var28++) {
                    var27.field2913[var28] -= var8;
                    var27.field2926[var28] -= var10;
                }
                var27.field2916 -= var8 * 128;
                var27.field2909 -= var10 * 128;
            }
        }
        class24.field661 = arg0;
        byte var15 = 104;
        class94.field2197.method975(arg4, false, 10, arg5);
        byte var16 = 0;
        byte var17 = 1;
        if (var8 < 0) {
            var17 = -1;
            var16 = 103;
            var15 = -1;
        }
        byte var18 = 0;
        byte var19 = 104;
        byte var20 = 1;
        if (var10 < 0) {
            var19 = -1;
            var20 = -1;
            var18 = 103;
        }
        for (int var21 = var16; var21 != var15; var21 += var17) {
            for (int var23 = var18; var23 != var19; var23 += var20) {
                int var24 = var21 + var8;
                int var25 = var10 + var23;
                for (int var26 = 0; var26 < 4; var26++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104) {
                        class7.field208[var26][var21][var23] = class7.field208[var26][var24][var25];
                    } else {
                        class7.field208[var26][var21][var23] = null;
                    }
                }
            }
        }
        for (class131 var22 = (class131) class43.field1162.method8(-1); var22 != null; var22 = (class131) class43.field1162.method9(1)) {
            var22.field3288 -= var10;
            var22.field3295 -= var8;
            if (var22.field3295 < 0 || var22.field3288 < 0 || var22.field3295 >= 104 || var22.field3288 >= 104) {
                var22.method1170(79);
            }
        }
        class145.field3615 = 0;
        if (class72.field1683 != 0) {
            class128.field3253 -= var10;
            class72.field1683 -= var8;
        }
        class97.field2292 = false;
        class139.field3519 = -1;
        class115.field3022.method5(true);
        class140.field3529.method5(true);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIBII)Z", line = 494)
    public static final boolean method354(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field800++;
        if (!class66.method631(0, arg0)) {
            return false;
        }
        int var7 = 26 % ((-arg4 - 9) / 44);
        class77.field1768 = null;
        boolean var8 = class35.method410(class65.field1571[arg0], arg6, -1, -1, arg5, arg1, 0, 0, arg3, arg2);
        if (class77.field1768 != null) {
            class35.method410(class77.field1768, arg6, -1, -1412584499, arg5, arg1, class16.field477, class120.field3147, arg3, arg2);
        }
        return var8;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIBI)V", line = 542)
    public static final void method355(int arg0, int arg1, byte arg2, int arg3) {
        if (class44.field1212 != 0 && arg3 != 0 && class145.field3615 < 50) {
            class90.field2136[class145.field3615] = arg0;
            class145.field3629[class145.field3615] = arg3;
            class1.field11[class145.field3615] = arg1;
            class25.field735[class145.field3615] = null;
            class50.field1264[class145.field3615] = 0;
            class145.field3615++;
        }
        if (arg2 >= 42) {
            field807++;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V", line = 577)
    public static final void method356(byte arg0) {
        if (arg0 != -34) {
            return;
        }
        if (class35.field914 != null) {
            class67 var1 = class35.field914;
            synchronized (class35.field914) {
                class35.field914 = null;
            }
        }
        field784++;
    }
}
