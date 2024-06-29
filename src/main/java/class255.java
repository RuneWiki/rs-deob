import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class255 {

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Lli;")
    public static class185 field4514 = class245.method1649(")4p=", -1);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Lli;")
    public static class185 field4513 = class245.method1649(" de votre liste noire)3", -119);

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field4520 = 0;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Z")
    public static boolean field4522 = true;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Lli;")
    public static class185 field4516 = class245.method1649("vert:", -17);

    @OriginalMember(owner = "client!be", name = "g", descriptor = "Lli;")
    public static class185 field4519 = class245.method1649("Update)2Liste geladen)3", -44);

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII)I")
    public static final int method1723(int arg0, int arg1, int arg2, int arg3) {
        field4517++;
        if (arg3 != 192) {
            return 84;
        }
        if (arg0 > 243) {
            arg1 >>= 0x4;
        } else if (arg0 > 217) {
            arg1 >>= 0x3;
        } else if (arg0 > 192) {
            arg1 >>= 0x2;
        } else if (arg0 > 179) {
            arg1 >>= 0x1;
        }
        return (arg1 >> 5 << 7) + (arg2 >> 2 << 10) + (arg0 >> 1);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)J")
    public static final long method1724(int arg0, int arg1, int arg2) {
        class198 var3 = class153.field2896[arg0][arg1][arg2];
        return var3 == null || var3.field3640 == null ? 0L : var3.field3640.field3781;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(III)Lm;")
    public static final class38 method1725(int arg0, int arg1, int arg2) {
        class198 var3 = class153.field2896[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3636;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static final void method1726(byte arg0) {
        field4515++;
        if (!class31.field513) {
            return;
        }
        class18.field290 = null;
        if (arg0 >= -46) {
            field4522 = false;
        }
        class97.field1812 = null;
        class31.field513 = false;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
    public static void method1727(byte arg0) {
        field4516 = null;
        field4519 = null;
        field4514 = null;
        if (arg0 <= 13) {
            field4514 = null;
        }
        field4513 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)La;")
    public static final class233 method1728(int arg0, byte arg1) {
        if (arg1 != 95) {
            method1726((byte) 71);
        }
        field4518++;
        class233 var2 = (class233) class148.field2785.method82(45, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class26.field449.method1688(arg1 ^ 0x5F, class274.method1880(arg0, true), class117.method817((byte) 119, arg0));
        class233 var4 = new class233();
        var4.field4199 = arg0;
        if (var3 != null) {
            var4.method1594(-5, new class118(var3));
        }
        class148.field2785.method84(124, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/util/Random;II)I")
    public static final int method1729(Random arg0, int arg1, int arg2) {
        field4523++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class135.method976(64, arg2)) {
            return (int) ((long) arg2 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var4 >= var3);
            if (arg1 != 3) {
                field4524 = 16;
            }
            return class99.method650(-20228, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)I")
    public static final int method1730(int arg0) {
        field4521++;
        try {
            if (class225.field4119 == 0) {
                if (class244.method1644((byte) -122) - 5000L < class138.field2579) {
                    return 0;
                }
                class183.field3370 = class124.field2238.method1163((byte) -91, class138.field2601, class141.field2636);
                class262.field4660 = class244.method1644((byte) -128);
                class225.field4119 = 1;
            }
            if (arg0 != -3) {
                method1725(-122, -33, -3);
            }
            if (class262.field4660 + 30000L < class244.method1644((byte) -100)) {
                return class153.method1086(1000, -127);
            }
            if (class225.field4119 == 1) {
                if (class183.field3370.field487 == 2) {
                    return class153.method1086(1001, -126);
                }
                if (class183.field3370.field487 != 1) {
                    return -1;
                }
                class125.field2252 = new class138((Socket) class183.field3370.field486, class124.field2238);
                class183.field3370 = null;
                int var1 = 0;
                if (class187.field3463) {
                    var1 = class258.field4593;
                }
                class182.field3349.field2155 = 0;
                class182.field3349.method877((byte) 121, 148);
                class182.field3349.method842(var1, -6596);
                class125.field2252.method995(class182.field3349.field2115, 0, -108, class182.field3349.field2155);
                if (class196.field3596 != null) {
                    class196.field3596.method146((byte) 127);
                }
                if (class42.field643 != null) {
                    class42.field643.method146((byte) 120);
                }
                int var2 = class125.field2252.method988((byte) -57);
                if (class196.field3596 != null) {
                    class196.field3596.method146((byte) 120);
                }
                if (class42.field643 != null) {
                    class42.field643.method146((byte) 123);
                }
                if (var2 != 0) {
                    return class153.method1086(var2, -126);
                }
                class225.field4119 = 2;
            }
            if (class225.field4119 == 2) {
                if (class125.field2252.method991((byte) -66) < 2) {
                    return -1;
                }
                class45.field721 = class125.field2252.method988((byte) -57);
                class45.field721 <<= 0x8;
                class45.field721 += class125.field2252.method988((byte) -57);
                class152.field2879 = new byte[class45.field721];
                class225.field4119 = 3;
                class90.field1750 = 0;
            }
            if (class225.field4119 != 3) {
                return -1;
            }
            int var3 = class125.field2252.method991((byte) -110);
            if (var3 < 1) {
                return -1;
            }
            if ((class45.field721 - class90.field1750) < var3) {
                var3 = class45.field721 - class90.field1750;
            }
            class125.field2252.method993(var3, class152.field2879, 5623, class90.field1750);
            class90.field1750 += var3;
            if (class45.field721 > class90.field1750) {
                return -1;
            } else if (class12.method102(class152.field2879, (byte) -121)) {
                int var4 = 0;
                class121.field2210 = new class199[class238.field4251];
                for (int var5 = class235.field4220; var5 <= class180.field3311; var5++) {
                    class199 var6 = class14.method109(arg0 + 76, var5);
                    if (var6 != null) {
                        class121.field2210[var4++] = var6;
                    }
                }
                class125.field2252.method994((byte) -116);
                class125.field2252 = null;
                class44.field702 = 0;
                class152.field2879 = null;
                class225.field4119 = 0;
                class138.field2579 = class244.method1644((byte) -116);
                return 0;
            } else {
                return class153.method1086(1002, arg0 - 125);
            }
        } catch (IOException var7) {
            return class153.method1086(1003, arg0 ^ 0x7C);
        }
    }
}
