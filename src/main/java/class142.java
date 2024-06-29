import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class142 extends class27 {

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
    private int field2778 = 0;

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "I")
    private int field2780 = 2000;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
    private int field2775 = 4096;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
    private int field2770 = 0;

    @OriginalMember(owner = "client!pf", name = "db", descriptor = "I")
    private int field2786 = 16;

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "Lkb;")
    public static class93 field2777 = class76.method390("Ausw-=hlen", 0);

    @OriginalMember(owner = "client!pf", name = "ab", descriptor = "I")
    public static int field2783 = 0;

    @OriginalMember(owner = "client!pf", name = "Z", descriptor = "I")
    public static int field2782 = -1;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!pf", name = "cb", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!pf", name = "bb", descriptor = "Lqh;")
    public static class153 field2784;

    @OriginalMember(owner = "client!pf", name = "Y", descriptor = "[I")
    public static int[] field2781;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)V")
    public static final void method891(int arg0) {
        ++field2779;
        if (arg0 != 279) {
            method894((byte) 62);
        }
        class161.field3220.method676(30626);
        class145.field2821.method676(30626);
        class205.field3956.method676(arg0 ^ 30389);
        class195.field3790.method676(30626);
        class13.field214.method676(30626);
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)V")
    public final void method154(byte arg0) {
        class6.method35(true);
        if (arg0 < 77) {
            field2784 = null;
        }
        ++field2774;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(Z)V")
    public static final void method892(boolean arg0) {
        if (arg0) {
            method894((byte) -78);
        }
        ++field2773;
        for (class110 var1 = (class110) class98.field1834.method692(arg0); var1 != null; var1 = (class110) class98.field1834.method695(512)) {
            if (var1.field1988 != null) {
                var1.method596(-12585);
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljg;III)[Lob;")
    public static final class129[] method893(class89 arg0, int arg1, int arg2, int arg3) {
        ++field2785;
        if (!class139.method873(arg1, arg0, (byte) 62, arg2)) {
            return null;
        } else {
            if (arg3 != -1) {
                method895(-18);
            }
            return class32.method186(true);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (arg0 > 106) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (~arg1 != -3) {
                        if (arg1 != 3) {
                            if (arg1 == 4) {
                                this.field2775 = arg2.method1071(28101);
                            }
                        } else {
                            this.field2770 = arg2.method1071(28101);
                        }
                    } else {
                        this.field2786 = arg2.method1054(128);
                    }
                } else {
                    this.field2780 = arg2.method1071(28101);
                }
            } else {
                this.field2778 = arg2.method1054(128);
            }
            ++field2776;
        }
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(B)V")
    public static void method894(byte arg0) {
        field2784 = null;
        field2777 = null;
        if (arg0 > -62) {
            method895(118);
        }
        field2781 = null;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    public class142() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        int[] var3 = super.field447.method1238(arg1, arg0);
        ++field2772;
        if (super.field447.field3737) {
            int var4 = this.field2775 >> 1;
            int[][] var5 = super.field447.method1237((byte) -127);
            Random var6 = new Random((long) this.field2778);
            for (int var7 = 0; ~var7 > ~this.field2780; ++var7) {
                int var8 = this.field2775 > 0 ? this.field2770 - (var4 + -class64.method327(this.field2775, var6, 10093)) : this.field2770;
                int var9 = (4085 & var8) >> 4;
                int var10 = class64.method327(class159.field3209, var6, 10093);
                int var11 = class64.method327(class159.field3205, var6, 10093);
                int var12 = (class130.field2464[var9] * this.field2786 >> 12) + var11;
                int var13 = var10 - -(class27.field440[var9] * this.field2786 >> 12);
                int var14 = -var11 + var12;
                int var15 = -var10 + var13;
                if (~var15 != -1 || ~var14 != -1) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var13;
                        var13 = var12;
                        var12 = var18;
                        var10 = var11;
                        var11 = var17;
                    }
                    if (~var10 < ~var13) {
                        int var19 = var10;
                        var10 = var13;
                        int var20 = var11;
                        var13 = var19;
                        var11 = var12;
                        var12 = var20;
                    }
                    int var21 = -var10 + var13;
                    int var22 = var11;
                    int var23 = 2048 / var21;
                    int var24 = ~var12 >= ~var11 ? -1 : 1;
                    int var25 = -var11 + var12;
                    int var26 = -var21 / 2;
                    if (var25 < 0) {
                        var25 = -var25;
                    }
                    int var27 = -(class64.method327(4096, var6, 10093) >> 2) + 1024;
                    for (int var28 = var10; var28 < var13; ++var28) {
                        var26 += var25;
                        int var29 = (-var10 + var28) * var23 + var27 + 1024;
                        int var30 = class78.field1402 & var28;
                        int var31 = class190.field3715 & var22;
                        if (~var26 < -1) {
                            var26 += -var21;
                            var22 += var24;
                        }
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)V")
    public static final void method895(int arg0) {
        class160.method1095(0, class73.field1348);
        ++class82.field1506;
        ++field2771;
        if (class96.field1783 && class75.field1356) {
            int var1 = -51 / ((-59 - arg0) / 63);
            int var2 = class170.field3380;
            int var3 = class97.field1826;
            int var4 = var2 - class184.field3635;
            if (~var4 > ~class139.field2695) {
                var4 = class139.field2695;
            }
            if (~(class73.field1348.field1052 + var4) < ~(class139.field2695 + class32.field520.field1052)) {
                var4 = class139.field2695 + class32.field520.field1052 + -class73.field1348.field1052;
            }
            int var5 = var3 - class1.field26;
            int var6 = -class136.field2643 + var4;
            if (~var5 > ~class30.field511) {
                var5 = class30.field511;
            }
            int var7 = class73.field1348.field1086;
            if (class30.field511 + class32.field520.field1044 < class73.field1348.field1044 + var5) {
                var5 = class30.field511 + class32.field520.field1044 + -class73.field1348.field1044;
            }
            int var8 = -class30.field511 + var5 + class32.field520.field1122;
            int var9 = var5 - field2782;
            if (class73.field1348.field1126 < class82.field1506 && (~var7 > ~var9 || -var7 > var9 || var7 < var6 || var6 < -var7)) {
                client.field499 = true;
            }
            int var10 = var4 - class139.field2695 + class32.field520.field1162;
            if (class73.field1348.field1179 != null && client.field499) {
                class104 var11 = new class104();
                var11.field1908 = var8;
                var11.field1916 = var10;
                var11.field1924 = class73.field1348.field1179;
                var11.field1919 = class73.field1348;
                class82.method421(var11, false);
            }
            if (~class66.field1186 == -1) {
                if (!client.field499) {
                    if ((~class188.field3680 == -2 || class27.method151(class100.field1841 - 1, (byte) 66)) && class100.field1841 > 2) {
                        class67.method360(false);
                    } else if (~class100.field1841 < -1) {
                        class117.method649(class100.field1841 - 1, 0);
                    }
                } else {
                    if (class73.field1348.field1118 != null) {
                        class104 var12 = new class104();
                        var12.field1919 = class73.field1348;
                        var12.field1906 = class49.field784;
                        var12.field1924 = class73.field1348.field1118;
                        var12.field1916 = var10;
                        var12.field1908 = var8;
                        class82.method421(var12, false);
                    }
                    if (class49.field784 != null && class139.method867(class73.field1348, 0) != null) {
                        ++class113.field2101;
                        class151.field2908.method47(142, 8);
                        class151.field2908.method1044(class49.field784.field1127, (byte) 112);
                        class151.field2908.method1082(class49.field784.field1058, 1838682736);
                        class151.field2908.method1051(true, class73.field1348.field1058);
                        class151.field2908.method1046((byte) 115, class73.field1348.field1127);
                    }
                }
                class73.field1348 = null;
            }
        } else {
            if (~class82.field1506 < -2) {
                class73.field1348 = null;
            }
        }
    }
}
