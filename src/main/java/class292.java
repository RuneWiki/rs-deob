import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class292 extends class102 implements class302 {

    @OriginalMember(owner = "client!ep", name = "w", descriptor = "I")
    private int field4469;

    @OriginalMember(owner = "client!ep", name = "s", descriptor = "Ls;")
    public static class186 field4465 = new class186(14, 4);

    @OriginalMember(owner = "client!ep", name = "x", descriptor = "J")
    public static long field4470 = 0L;

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "I")
    public static int field4473 = 0;

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "Los;")
    public static class309 field4472 = new class309(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!ep", name = "D", descriptor = "Lbj;")
    public static class162 field4476 = new class162(18, 8);

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!ep", name = "t", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!ep", name = "u", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!ep", name = "v", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!ep", name = "y", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!ep", name = "B", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(FIFFI)F", line = 5)
    public static final float method1898(float arg0, int arg1, float arg2, float arg3, int arg4) {
        ++field4466;
        int var5 = 93 % ((arg4 - 40) / 47);
        float[] var6 = class82.field1722[arg1];
        return var6[2] * arg0 + var6[1] * arg3 + var6[0] * arg2;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lda;I[BIZ)V", line = 17)
    public class292(class44 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field4469 = arg1;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IC)Z", line = 25)
    public static final boolean method1899(int arg0, char arg1) {
        ++field4462;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class373.method2289(48, arg1)) {
            return true;
        } else {
            char[] var2 = class293.field4485;
            for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                char var7 = var2[var3];
                if (~arg1 == ~var7) {
                    return true;
                }
            }
            char[] var4 = class453.field6735;
            for (int var5 = arg0; var4.length > var5; ++var5) {
                char var6 = var4[var5];
                if (~arg1 == ~var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V", line = 68)
    public static void method1900(byte arg0) {
        field4476 = null;
        field4465 = null;
        if (arg0 == 5) {
            field4472 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BZ)V", line = 84)
    public static final void method1901(byte arg0, boolean arg1) {
        class95.field1865 = 0;
        ++field4474;
        class238.field3675 = 0;
        class422.method2575(0);
        class64.method570(arg1, (byte) -77);
        class139.method1045(-1);
        boolean var2 = false;
        for (int var3 = 0; var3 < class95.field1865; ++var3) {
            int var5 = class314.field4737[var3];
            class435 var6 = (class435) class209.field3337.method1622((long) var5, 43);
            class163 var7 = var6.field6471;
            if (class76.field1543 && class144.method1074(44, var5)) {
                class18.method120((byte) 67);
            }
            if (~class62.field1268 != ~var7.field7796) {
                if (var7.field2613.method482(117)) {
                    class432.method2593(var7, (byte) 109);
                }
                var7.method1159(0, (class51) null);
                var6.method1676(true);
                var2 = true;
            }
        }
        if (var2) {
            class334.field5054 = class209.field3337.method1611((byte) -21);
            class209.field3337.method1616(-32437, class525.field7636);
        }
        if (~class234.field3606 != ~class219.field3446.field4399) {
            throw new RuntimeException("gnp1 pos:" + class219.field3446.field4399 + " psize:" + class234.field3606);
        } else {
            int var4 = 0;
            if (arg0 < 72) {
                method1900((byte) -38);
            }
            while (~var4 > ~class341.field5128) {
                if (class209.field3337.method1622((long) class515.field7477[var4], -104) == null) {
                    throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class341.field5128);
                }
                ++var4;
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "([BIII)V", line = 156)
    public final void method1902(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field4463;
        this.method894(arg0, -119, arg1);
        if (arg2 != -24568) {
            field4476 = null;
        }
        this.field4469 = arg3;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)V", line = 169)
    public static final void method1903(byte arg0) {
        ++field4475;
        class429.method2587(class253.field3885, (byte) -63);
        ++class247.field3812;
        if (class488.field7186 && class208.field3329) {
            int var1 = class393.field5991.method132(31);
            int var2 = class393.field5991.method139(-93);
            int var3 = var2 - class460.field6855;
            if (arg0 >= 76) {
                int var4 = var1 - class239.field3704;
                if (~var4 > ~class409.field6190) {
                    var4 = class409.field6190;
                }
                if (class318.field4841 > var3) {
                    var3 = class318.field4841;
                }
                if (class253.field3885.field5745 + var4 > class409.field6190 - -class44.field779.field5745) {
                    var4 = class409.field6190 + class44.field779.field5745 - class253.field3885.field5745;
                }
                if (~(class318.field4841 + class44.field779.field5712) > ~(class253.field3885.field5712 + var3)) {
                    var3 = -class253.field3885.field5712 + class318.field4841 + class44.field779.field5712;
                }
                int var5 = -class409.field6190 + class44.field779.field5782 + var4;
                int var6 = -class318.field4841 + class44.field779.field5740 + var3;
                if (class393.field5991.method133(23284)) {
                    if (~class253.field3885.field5797 > ~class247.field3812) {
                        int var7 = -class459.field6846 + var4;
                        int var8 = -class135.field2279 + var3;
                        if (~var7 < ~class253.field3885.field5714 || var7 < -class253.field3885.field5714 || class253.field3885.field5714 < var8 || -class253.field3885.field5714 > var8) {
                            class387.field5659 = true;
                        }
                    }
                    if (class253.field3885.field5773 != null && class387.field5659) {
                        class322 var9 = new class322();
                        var9.field4914 = var6;
                        var9.field4918 = class253.field3885;
                        var9.field4922 = var5;
                        var9.field4911 = class253.field3885.field5773;
                        class495.method2982(var9);
                        return;
                    }
                } else {
                    if (class387.field5659) {
                        class320.method2056(-113);
                        if (class253.field3885.field5683 != null) {
                            class322 var10 = new class322();
                            var10.field4922 = var5;
                            var10.field4911 = class253.field3885.field5683;
                            var10.field4914 = var6;
                            var10.field4918 = class253.field3885;
                            var10.field4913 = class235.field3629;
                            class495.method2982(var10);
                        }
                        if (class235.field3629 != null && client.method1375(class253.field3885) != null) {
                            class127.method999(127, class235.field3629, class253.field3885);
                        }
                    } else if ((class47.field971 == 1 || class290.method1882(-1453414076)) && class332.field5041 > 2) {
                        class183.method1245(class460.field6855 + class135.field2279, (byte) -18, class459.field6846 + class239.field3704);
                    } else if (class93.method846(true)) {
                        class183.method1245(class460.field6855 + class135.field2279, (byte) -18, class239.field3704 - -class459.field6846);
                    }
                    class253.field3885 = null;
                }
            }
        } else {
            if (~class247.field3812 < -2) {
                class253.field3885 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)J", line = 292)
    public final long method1904(int arg0) {
        ++field4471;
        if (arg0 != 8976) {
            method1903((byte) 127);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)I", line = 304)
    public final int method1905(int arg0) {
        if (arg0 >= -126) {
            this.field4469 = -69;
        }
        ++field4468;
        return super.field1935;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)I", line = 320)
    public final int method1906(boolean arg0) {
        if (!arg0) {
            method1898(0.06893382F, 30, -1.889903F, -1.1760329F, -71);
        }
        ++field4467;
        return this.field4469;
    }

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "(I)V", line = 331)
    public final void method897(int arg0) {
        super.field1939.method402(this, 127);
        ++field4464;
        if (arg0 > -85) {
            this.method1904(72);
        }
    }
}
