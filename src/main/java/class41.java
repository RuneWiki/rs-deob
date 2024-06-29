import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class41 extends class150 {

    @OriginalMember(owner = "client!og", name = "x", descriptor = "I")
    private int field617;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    private int field604;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    private int field610;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    private int field608;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    private int field601;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    private int field611;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "I")
    private int field612;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "Ljava/lang/String;")
    public static String field613 = " has logged in.";

    @OriginalMember(owner = "client!og", name = "n", descriptor = "Li;")
    public static class112 field607 = new class112(8);

    @OriginalMember(owner = "client!og", name = "v", descriptor = "Ljava/lang/String;")
    public static String field615 = "flash2:";

    @OriginalMember(owner = "client!og", name = "w", descriptor = "[S")
    public static short[] field616 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!og", name = "l", descriptor = "F")
    public static float field605;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static void method270(int arg0) {
        field607 = null;
        field615 = null;
        field616 = null;
        field613 = null;
        if (arg0 != 28575) {
            field615 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lvj;)V")
    public static final void method271(class173 arg0) {
        for (int var1 = arg0.field2840; var1 <= arg0.field2855; ++var1) {
            for (int var2 = arg0.field2839; var2 <= arg0.field2843; ++var2) {
                class109 var3 = class79.field1367[arg0.field2838][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1968; ++var4) {
                        if (var3.field1961[var4] == arg0) {
                            --var3.field1968;
                            for (int var5 = var4; var5 < var3.field1968; ++var5) {
                                var3.field1961[var5] = var3.field1961[var5 + 1];
                                var3.field1979[var5] = var3.field1979[var5 + 1];
                            }
                            var3.field1961[var3.field1968] = null;
                            break;
                        }
                    }
                    var3.field1975 = 0;
                    for (int var6 = 0; var6 < var3.field1968; ++var6) {
                        var3.field1975 |= var3.field1979[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BII)V")
    public final void method221(byte arg0, int arg1, int arg2) {
        ++field603;
        int var4 = this.field608 * arg2 >> 12;
        int var5 = this.field604 * arg1 >> 12;
        int var6 = this.field610 * arg2 >> 12;
        int var7 = this.field611 * arg1 >> 12;
        int var8 = this.field601 * arg2 >> 12;
        int var9 = this.field617 * arg1 >> 12;
        int var10 = 60 % ((7 - arg0) / 63);
        int var11 = this.field612 * arg2 >> 12;
        int var12 = this.field609 * arg1 >> 12;
        class122.method831(var6, var4, var5, var11, true, var12, var7, var9, var8, super.field2518);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
    public final void method218(int arg0, int arg1, int arg2) {
        ++field606;
        if (arg0 != 0) {
            this.method218(-41, 35, -120);
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field617 = arg5;
        this.field604 = arg1;
        this.field610 = arg2;
        this.field608 = arg0;
        this.field601 = arg4;
        this.field611 = arg3;
        this.field612 = arg6;
        this.field609 = arg7;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IBI)V")
    public final void method220(int arg0, byte arg1, int arg2) {
        ++field614;
        int var4 = -68 % ((arg1 - 39) / 62);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
    public static final void method272(int arg0) {
        class96.field1651.method58(0);
        ++field602;
        if (arg0 != -17674) {
            field616 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
    public static final void method273(int arg0, int arg1) {
        ++field600;
        int var2 = class56.field976;
        int var3 = class250.field4093;
        int var4 = class237.field3904;
        int var5 = class52.field914;
        int var6 = class228.field3844;
        int var7 = (int) class195.field3151;
        int var8 = (int) class106.field1900 + class170.field2807 & 2047;
        if (class216.field3644 / 256 > var7) {
            var7 = class216.field3644 / 256;
        }
        if (class201.field3306[arg1] && ~(class55.field957[4] - -128) < ~var7) {
            var7 = class55.field957[4] + 128;
        }
        class92.method595(class10.method68(true, class176.field2886, class273.field4378.field1458, class273.field4378.field1397) + -50, arg0, var7, class77.field1251, var8, class216.field3637, arg1 + -853521340, var7 * 3 + 600);
        if (~class56.field976 == ~var2 && class250.field4093 == var3 && ~class237.field3904 == ~var4 && class228.field3844 == var6 && class52.field914 == var5) {
            class241.field3970 = 1;
        } else {
            class87.field1552 = 10;
            class151.field2523 = 10;
            if (class56.field976 > var2) {
                var2 += (-var2 + class56.field976) * class151.field2523 / 1000 + class87.field1552;
                if (~var2 > ~class56.field976) {
                    class56.field976 = var2;
                }
            }
            class126.field2208 = 10;
            if (~class237.field3904 < ~var4) {
                var4 += class87.field1552 - -((class237.field3904 - var4) * class151.field2523 / 1000);
                if (~var4 > ~class237.field3904) {
                    class237.field3904 = var4;
                }
            }
            if (var3 < class250.field4093) {
                var3 += (-var3 + class250.field4093) * class151.field2523 / 1000 + class87.field1552;
                if (~var3 > ~class250.field4093) {
                    class250.field4093 = var3;
                }
            }
            if (class237.field3904 < var4) {
                int var9 = var4 - ((-class237.field3904 + var4) * class151.field2523 / 1000 + class87.field1552);
                if (var9 > class237.field3904) {
                    class237.field3904 = var9;
                }
            }
            class112.field2009 = 10;
            int var10 = -var5 + class52.field914;
            if (var6 < class228.field3844) {
                var6 += (-var6 + class228.field3844) * class126.field2208 / 1000 + class112.field2009;
                if (class228.field3844 > var6) {
                    class228.field3844 = var6;
                }
            }
            if (var3 > class250.field4093) {
                int var11 = var3 - ((-class250.field4093 + var3) * class151.field2523 / 1000 + class87.field1552);
                if (~var11 < ~class250.field4093) {
                    class250.field4093 = var11;
                }
            }
            if (~class228.field3844 > ~var6) {
                int var12 = var6 - ((var6 - class228.field3844) * class126.field2208 / 1000 + class112.field2009);
                if (~class228.field3844 > ~var12) {
                    class228.field3844 = var12;
                }
            }
            if (~var2 < ~class56.field976) {
                int var13 = var2 - ((-class56.field976 + var2) * class151.field2523 / 1000 + class87.field1552);
                if (~var13 < ~class56.field976) {
                    class56.field976 = var13;
                }
            }
            if (var10 > 1024) {
                var10 -= 2048;
            }
            if (var10 < -1024) {
                var10 += 2048;
            }
            if (var10 > 0) {
                int var14 = class126.field2208 * var10 / 1000 + class112.field2009 + var5;
                var5 = var14 & 2047;
            }
            if (~var10 > -1) {
                int var15 = var5 - (-var10 * class126.field2208 / 1000 + class112.field2009);
                var5 = var15 & 2047;
            }
            int var16 = -var5 + class52.field914;
            if (~var16 < -1025) {
                var16 -= 2048;
            }
            if (var16 < -1024) {
                var16 += 2048;
            }
            if (~var16 <= -1 || var10 <= 0 || ~var16 < -1 && var10 < 0) {
                class52.field914 = var5;
            }
        }
    }
}
