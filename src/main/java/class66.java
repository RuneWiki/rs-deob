import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class66 extends class215 {

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    private int field823 = 12288;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    private int field825 = 0;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "I")
    private int field831 = 0;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "I")
    private int field829 = 4096;

    @OriginalMember(owner = "client!m", name = "cb", descriptor = "I")
    private int field837 = 2048;

    @OriginalMember(owner = "client!m", name = "fb", descriptor = "I")
    private int field840 = 2048;

    @OriginalMember(owner = "client!m", name = "hb", descriptor = "I")
    private int field842 = 8192;

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
    public static int field835 = -1;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    public static int field832 = 0;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!m", name = "bb", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!m", name = "db", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!m", name = "eb", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!m", name = "gb", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZI)V")
    public static final void method377(boolean arg0, int arg1) {
        class51.method294((byte) -127);
        ++field833;
        if (~class250.field4085 == -31 || class250.field4085 == 25) {
            ++class181.field2884;
            if (~class181.field2884 <= -51 || arg0) {
                class181.field2884 = arg1;
                if (!class289.field4601 && class28.field400 != null) {
                    class4.field57.method1932(false, 81);
                    try {
                        class28.field400.method1211(class4.field57.field1228, true, 0, class4.field57.field1218);
                        class4.field57.field1228 = 0;
                    } catch (IOException var2) {
                        class289.field4601 = true;
                    }
                    ++class129.field2078;
                }
                class51.method294((byte) -127);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(III)Z")
    private final boolean method378(int arg0, int arg1, int arg2) {
        ++field839;
        int var4 = (arg0 + arg2) * this.field823 >> 12;
        int var5 = class36.field468[(1044955 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field823;
        int var7 = 99 % ((arg1 - -50) / 39);
        int var8 = (var6 << 12) / this.field842;
        int var9 = this.field829 * var8 >> 12;
        return -arg0 + arg2 < var9 && arg2 - arg0 > -var9;
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(III)Z")
    private final boolean method379(int arg0, int arg1, int arg2) {
        ++field834;
        int var4 = (-arg1 + arg2) * this.field823 >> 12;
        int var5 = class36.field468[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field823;
        int var7 = (var6 << 12) / this.field842;
        if (arg0 >= -109) {
            field832 = 106;
        }
        int var8 = this.field829 * var7 >> 12;
        return arg1 + arg2 < var8 && ~(arg1 + arg2) < ~(-var8);
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(I)V")
    public static final void method380(int arg0) {
        ++field828;
        if (arg0 != 26365) {
            field832 = 54;
        }
        ++class153.field2366;
        class4.field57.method1932(false, 50);
        class4.field57.method580((byte) 64, class192.method1326((byte) -89));
        class4.field57.method572(true, class283.field4517);
        class4.field57.method572(true, class292.field4640);
        class4.field57.method580((byte) 98, class22.field294);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V")
    public final void method331(byte arg0) {
        ++field841;
        if (arg0 == -49) {
            class247.method1716(256);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
    public static final void method381(boolean arg0) {
        ++field830;
        class104.field1395.method1699(0);
        if (arg0) {
            method381(false);
        }
        class101.field1338.method1699(0);
        class236.field3908.method1699(0);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        ++field836;
        if (arg0 != 1521146348) {
            method382(-56, -56);
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field842 = arg2.method549(255);
                                }
                            } else {
                                this.field829 = arg2.method549(arg0 ^ 1521146131);
                            }
                        } else {
                            this.field823 = arg2.method549(255);
                        }
                    } else {
                        this.field837 = arg2.method549(255);
                    }
                } else {
                    this.field825 = arg2.method549(255);
                }
            } else {
                this.field831 = arg2.method549(255);
            }
        } else {
            this.field840 = arg2.method549(255);
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        ++field824;
        int[] var3 = super.field3445.method1755(arg0, (byte) 109);
        if (super.field3445.field4163) {
            int var4 = class76.field956[arg0] - 2048;
            for (int var5 = 0; var5 < class244.field4015; ++var5) {
                int var6 = class166.field2657[var5] + -2048;
                int var7 = this.field840 + var6;
                int var8 = var7 >= -2048 ? var7 : var7 - -4096;
                int var9 = var8 <= 2048 ? var8 : var8 + -4096;
                int var10 = var4 - -this.field831;
                int var11 = this.field825 + var6;
                int var12 = ~var11 <= 2047 ? var11 : var11 + 4096;
                int var13 = this.field837 + var4;
                int var14 = ~var13 <= 2047 ? var13 : var13 - -4096;
                int var15 = ~var14 >= -2049 ? var14 : var14 + -4096;
                int var16 = ~var12 >= -2049 ? var12 : var12 + -4096;
                int var17 = ~var10 <= 2047 ? var10 : var10 + 4096;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                var3[var5] = !this.method379(-114, var9, var18) && !this.method378(var16, arg1 + -140, var15) ? 0 : 4096;
            }
        }
        if (arg1 != 255) {
            this.field823 = -117;
        }
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(II)Lcj;")
    public static final class278 method382(int arg0, int arg1) {
        ++field826;
        class278 var2 = (class278) class122.field1735.method1469(8288, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class14.field188.method928(arg0, (byte) 120, arg1);
            class278 var4 = new class278();
            if (var3 != null) {
                var4.method1861(105, new class96(var3));
            }
            class122.field1735.method1467((byte) -119, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)V")
    public static final void method383(int arg0, byte arg1) {
        class233 var2 = class114.method746(arg0, 1228126432, 7);
        var2.method1653(false);
        ++field838;
        if (arg1 != 11) {
            field832 = 31;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class66() {
        super(0, true);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BI)V")
    public static final void method384(byte arg0, int arg1) {
        ++field827;
        class54 var2 = (class54) class39.field483.method708((long) arg1, 121);
        if (var2 != null) {
            int var3 = 122 / ((arg0 - -63) / 42);
            for (int var4 = 0; var4 < var2.field689.length; ++var4) {
                var2.field689[var4] = -1;
                var2.field694[var4] = 0;
            }
        }
    }
}
