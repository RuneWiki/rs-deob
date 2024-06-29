import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class272 extends class199 {

    @OriginalMember(owner = "client!kl", name = "T", descriptor = "I")
    private int field3894 = 0;

    @OriginalMember(owner = "client!kl", name = "S", descriptor = "I")
    private int field3893 = 0;

    @OriginalMember(owner = "client!kl", name = "X", descriptor = "I")
    private int field3898 = 2000;

    @OriginalMember(owner = "client!kl", name = "cb", descriptor = "I")
    private int field3903 = 4096;

    @OriginalMember(owner = "client!kl", name = "db", descriptor = "I")
    private int field3904 = 16;

    @OriginalMember(owner = "client!kl", name = "Z", descriptor = "Lic;")
    public static class329 field3900 = new class329(8);

    @OriginalMember(owner = "client!kl", name = "U", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!kl", name = "V", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!kl", name = "W", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!kl", name = "Y", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!kl", name = "ab", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!kl", name = "bb", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!kl", name = "eb", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)V", line = 10)
    public static final void method1850(int arg0) {
        class172.field2376.method2262(false);
        field3905++;
        if (arg0 != 14834) {
            method1852((byte) -20);
        }
        class72.field963.method2262(false);
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V", line = 49)
    public class272() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()V", line = 35)
    public static final void method1851() {
        for (int var0 = 0; var0 < class20.field229; var0++) {
            class294 var1 = class75.field987[var0];
            class117.method853(var1);
            class75.field987[var0] = null;
        }
        class20.field229 = 0;
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(B)V", line = 54)
    public final void method189(byte arg0) {
        int var2 = -39 % ((36 - arg0) / 44);
        class177.method1304((byte) -29);
        field3896++;
    }

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "(B)Z", line = 63)
    public static final boolean method1852(byte arg0) {
        field3897++;
        if (arg0 != -66) {
            method1853(-81, (class140) null, (class140) null);
        }
        class312 var1 = class35.field427;
        synchronized (class35.field427) {
            if (class305.field4464 == class104.field1359) {
                return false;
            } else {
                class143.field1995 = class198.field2770[class104.field1359];
                class362.field5679 = class48.field648[class104.field1359];
                class104.field1359 = class104.field1359 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BLfd;I)V", line = 104)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg2 == 0) {
            this.field3894 = arg1.method2096((byte) -122);
        } else if (arg2 == 1) {
            this.field3898 = arg1.method2083((byte) -69);
        } else if (arg2 == 2) {
            this.field3904 = arg1.method2096((byte) -122);
        } else if (arg2 == 3) {
            this.field3893 = arg1.method2083((byte) -58);
        } else if (arg2 == 4) {
            this.field3903 = arg1.method2083((byte) -82);
        }
        if (arg0 != -43) {
            field3899 = 36;
        }
        field3895++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILfh;Lfh;)V", line = 160)
    public static final void method1853(int arg0, class140 arg1, class140 arg2) {
        class318.field4691 = arg1;
        field3902++;
        class82.field1054 = arg2;
        if (arg0 != -1) {
            method1852((byte) -86);
        }
    }

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "(I)V", line = 172)
    public static void method1854(int arg0) {
        field3900 = null;
        if (arg0 != -1) {
            field3899 = -5;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)[I", line = 192)
    public final int[] method190(int arg0, int arg1) {
        int[] var3 = this.field2802.method2502(arg1, -67);
        if (this.field2802.field5637) {
            int var4 = this.field3903 >> 1;
            int[][] var5 = this.field2802.method2501(-1);
            Random var6 = new Random((long) this.field3894);
            for (int var7 = 0; var7 < this.field3898; var7++) {
                int var8 = this.field3903 > 0 ? this.field3893 - (var4 - class294.method2011(var6, this.field3903, -85)) : this.field3893;
                int var9 = (var8 & 0xFFD) >> 4;
                int var10 = class294.method2011(var6, class95.field1235, arg0 + 1765);
                int var11 = class294.method2011(var6, class224.field3233, 114);
                int var12 = (class112.field1446[var9] * this.field3904 >> 12) + var10;
                int var13 = (class109.field1420[var9] * this.field3904 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = var12 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var12;
                        int var18 = var10;
                        var10 = var11;
                        var12 = var13;
                        var11 = var18;
                        var13 = var17;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = -var22 / 2;
                    int var24 = var13 - var11;
                    int var25 = 1024 - (class294.method2011(var6, 4096, 34) >> 2);
                    if (var24 < 0) {
                        var24 = -var24;
                    }
                    int var26 = 2048 / var22;
                    int var27 = var13 <= var11 ? -1 : 1;
                    for (int var28 = var10; var28 < var12; var28++) {
                        var23 += var24;
                        int var29 = (var28 - var10) * var26 + var25 + 1024;
                        int var30 = var21 & class156.field2165;
                        int var31 = class245.field3573 & var28;
                        if (var23 > 0) {
                            var23 += -var22;
                            var21 += var27;
                        }
                        if (var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                    }
                }
            }
        }
        if (arg0 != -1735) {
            field3900 = (class329) null;
        }
        field3901++;
        return var3;
    }
}
