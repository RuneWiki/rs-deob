import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class56 extends class130 {

    @OriginalMember(owner = "client!p", name = "A", descriptor = "I")
    public int field699;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "[B")
    public byte[] field693;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "Lqj;")
    public static class196 field694 = class80.method502("zap", -48);

    @OriginalMember(owner = "client!p", name = "y", descriptor = "[I")
    public static int[] field697 = new int[1000];

    @OriginalMember(owner = "client!p", name = "U", descriptor = "[I")
    public static int[] field719 = new int[64];

    @OriginalMember(owner = "client!p", name = "qb", descriptor = "I")
    public static int field741 = 0;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!p", name = "B", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!p", name = "F", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!p", name = "H", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!p", name = "I", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!p", name = "J", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!p", name = "L", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!p", name = "ab", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!p", name = "bb", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!p", name = "cb", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!p", name = "db", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!p", name = "eb", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!p", name = "fb", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!p", name = "gb", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!p", name = "hb", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!p", name = "ib", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!p", name = "jb", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!p", name = "kb", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!p", name = "lb", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!p", name = "mb", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!p", name = "nb", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!p", name = "ob", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!p", name = "pb", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!p", name = "rb", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!p", name = "sb", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!p", name = "tb", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!p", name = "ub", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!p", name = "vb", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!p", name = "wb", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!p", name = "xb", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!p", name = "yb", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!p", name = "zb", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!p", name = "Ab", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!p", name = "Bb", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!p", name = "Cb", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!p", name = "Db", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!p", name = "Eb", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!p", name = "Fb", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!p", name = "Gb", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)I")
    public final int method305(boolean arg0) {
        if (arg0) {
            field712++;
            this.field699 += 2;
            return ((this.field693[this.field699 - 2] & 0xFF) << 8) + (this.field693[this.field699 - 1] - 128 & 0xFF);
        } else {
            return 126;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)I")
    public final int method306(int arg0, int arg1) {
        if (arg1 == 0) {
            field710++;
            int var3 = class65.method406(arg0, arg1 ^ 0xFFFFFFFE, this.field699, this.field693);
            this.method355((byte) -92, var3);
            return var3;
        } else {
            return 19;
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)I")
    public final int method307(byte arg0) {
        field720++;
        int var2 = this.field693[this.field699] & 0xFF;
        if (arg0 == 73) {
            return var2 >= 128 ? this.method318(true) - 32768 : this.method367(1);
        } else {
            return 18;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I[BII)V")
    public final void method308(int arg0, byte[] arg1, int arg2, int arg3) {
        field732++;
        if (arg3 != -128) {
            field698 = -102;
        }
        for (int var5 = arg0 + arg2 - 1; var5 >= arg0; var5--) {
            arg1[var5] = (byte) (this.field693[this.field699++] - 128);
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)I")
    public final int method309(byte arg0) {
        if (arg0 <= 62) {
            return 93;
        } else {
            field689++;
            return 128 - this.field693[this.field699++] & 0xFF;
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(II)V")
    public final void method310(int arg0, int arg1) {
        if (arg1 < -34) {
            field747++;
            this.field693[this.field699++] = (byte) (arg0 >> 8);
            this.field693[this.field699++] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)I")
    public final int method311(int arg0) {
        if (arg0 != 0) {
            this.method335(true);
        }
        this.field699 += 4;
        field735++;
        return (this.field693[this.field699 - 1] & 0xFF) + ((this.field693[this.field699 - 3] & 0xFF) << 16) + ((this.field693[this.field699 + -4] & 0xFF) << 24) + ((this.field693[this.field699 + -2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)V")
    public final void method312(int arg0, byte arg1) {
        field701++;
        if (arg1 >= -3) {
            field697 = null;
        }
        this.field693[this.field699++] = (byte) (arg0 >> 16);
        this.field693[this.field699++] = (byte) (arg0 >> 24);
        this.field693[this.field699++] = (byte) arg0;
        this.field693[this.field699++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)I")
    public final int method313(int arg0) {
        field714++;
        if (arg0 != 65536) {
            this.method361(null, -20, null);
        }
        this.field699 += 2;
        int var2 = ((this.field693[this.field699 - 2] & 0xFF) << 8) + (this.field693[this.field699 - 1] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)J")
    public final long method314(boolean arg0, int arg1) {
        field708++;
        int var6 = arg1 - 1;
        if (!arg0) {
            return -35L;
        } else if (var6 >= 0 && var6 <= 7) {
            int var3 = var6 * 8;
            long var4 = 0L;
            while (var3 >= 0) {
                var4 |= ((long) this.field693[this.field699++] & 0xFFL) << var3;
                var3 -= 8;
            }
            return var4;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)I")
    public final int method315(int arg0) {
        field736++;
        this.field699 += 2;
        if (arg0 <= 44) {
            field741 = 111;
        }
        return ((this.field693[this.field699 - 1] & 0xFF) << 8) + (this.field693[this.field699 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I[BBI)V")
    public final void method316(int arg0, byte[] arg1, byte arg2, int arg3) {
        field716++;
        if (arg2 > -55) {
            this.method354(true);
        }
        for (int var5 = arg3; var5 < arg0 + arg3; var5++) {
            arg1[var5] = this.field693[this.field699++];
        }
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(B)B")
    public final byte method317(byte arg0) {
        field757++;
        if (arg0 < 110) {
            this.field699 = -30;
        }
        return (byte) -this.field693[this.field699++];
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)I")
    public final int method318(boolean arg0) {
        if (!arg0) {
            field694 = null;
        }
        this.field699 += 2;
        field743++;
        return ((this.field693[this.field699 - 2] & 0xFF) << 8) + (this.field693[this.field699 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)J")
    public final long method319(int arg0) {
        field700++;
        long var2 = (long) this.method311(0) & 0xFFFFFFFFL;
        if (arg0 == 18533) {
            long var4 = (long) this.method311(0) & 0xFFFFFFFFL;
            return (var2 << 32) + var4;
        } else {
            return 113L;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(ZI)V")
    public final void method320(boolean arg0, int arg1) {
        if ((arg1 & 0xFFFFFF80) != 0) {
            if ((arg1 & 0xFFFFC000) != 0) {
                if ((arg1 & 0xFFE00000) != 0) {
                    if ((arg1 & 0xF0000000) != 0) {
                        this.method329((byte) 121, arg1 >>> 28 | 0x80);
                    }
                    this.method329((byte) 42, arg1 >>> 21 | 0x80);
                }
                this.method329((byte) 73, arg1 >>> 14 | 0x80);
            }
            this.method329((byte) 38, arg1 >>> 7 | 0x80);
        }
        if (arg0) {
            this.field693 = null;
        }
        field752++;
        this.method329((byte) 18, arg1 & 0x7F);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III)V")
    public static final void method321(int arg0, int arg1, int arg2) {
        class215.field3873[arg2] = arg1;
        int var3 = 83 / ((-arg0 - 58) / 56);
        field718++;
        class39 var4 = (class39) class132.field1887.method1551(32768, (long) arg2);
        if (var4 == null) {
            class39 var5 = new class39(class183.method1195((byte) 119) + 500L);
            class132.field1887.method1552(var5, (long) arg2, 0);
        } else {
            var4.field437 = class183.method1195((byte) 118) + 500L;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IB[II)V")
    public final void method322(int arg0, byte arg1, int[] arg2, int arg3) {
        if (arg1 != 11) {
            field697 = null;
        }
        field737++;
        int var5 = this.field699;
        this.field699 = arg3;
        int var6 = (arg0 - arg3) / 8;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = this.method311(0);
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = this.method311(0);
            int var12 = 32;
            while (var12-- > 0) {
                var11 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var9 - -arg2[var9 >>> 11 & 0x65A00003];
                var9 -= var10;
                var8 -= arg2[var9 & 0x3] + var9 ^ (var11 << 4 ^ var11 >>> 5) + var11;
            }
            this.field699 -= 8;
            this.method355((byte) -120, var8);
            this.method355((byte) 122, var11);
        }
        this.field699 = var5;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(IB)V")
    public final void method323(int arg0, byte arg1) {
        field729++;
        int var3 = 34 / ((-arg1 - 29) / 52);
        this.field693[this.field699++] = (byte) arg0;
        this.field693[this.field699++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZ)V")
    public final void method324(int arg0, boolean arg1) {
        field751++;
        if (arg0 >= 0 && arg0 < 128) {
            this.method329((byte) 18, arg0);
        } else if (arg1) {
            if (arg0 < 0 || arg0 >= 32768) {
                throw new IllegalArgumentException();
            }
            this.method310(arg0 + 32768, -35);
        }
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)I")
    public final int method325(int arg0) {
        field750++;
        if (arg0 != -6419) {
            field741 = 17;
        }
        int var2 = this.field693[this.field699] & 0xFF;
        return var2 < 128 ? this.method367(arg0 + 6420) - 64 : this.method318(true) - 49152;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(Z)Lqj;")
    public final class196 method326(boolean arg0) {
        field703++;
        int var2 = this.field699;
        if (arg0) {
            while (this.field693[this.field699++] != 0) {
            }
            return class16.method88(this.field699 - var2 - 1, 0, this.field693, var2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(JIB)V")
    public final void method327(long arg0, int arg1, byte arg2) {
        field756++;
        int var6 = arg1 - 1;
        if (var6 < 0 || var6 > 7) {
            throw new IllegalArgumentException();
        }
        if (arg2 >= -39) {
            this.field693 = null;
        }
        for (int var5 = var6 * 8; var5 >= 0; var5 -= 8) {
            this.field693[this.field699++] = (byte) (arg0 >> var5);
        }
    }

    @OriginalMember(owner = "client!p", name = "g", descriptor = "(I)I")
    public final int method328(int arg0) {
        if (arg0 != -1974) {
            this.method341(75, -35);
        }
        field728++;
        this.field699 += 3;
        return ((this.field693[this.field699 - 3] & 0xFF) << 16) + ((this.field693[this.field699 - 2] << 8 & 0xFF00) + (this.field693[this.field699 - 1] & 0xFF));
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)V")
    public final void method329(byte arg0, int arg1) {
        this.field693[this.field699++] = (byte) arg1;
        field722++;
        if (arg0 < 0) {
            field698 = 80;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lqj;I)V")
    public final void method330(class196 arg0, int arg1) {
        field696++;
        if (arg1 == 12865) {
            this.field699 += arg0.method1298(arg0.method1299(37), 0, this.field693, 313156226, this.field699);
            this.field693[this.field699++] = 0;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILp;)V")
    public static final void method331(int arg0, class56 arg1) {
        field745++;
        if (arg0 != 1847479456) {
            field719 = null;
        }
        byte[] var2 = new byte[24];
        if (class12.field134 != null) {
            try {
                class12.field134.method1704((byte) 119, 0L);
                class12.field134.method1705(var2, (byte) -68);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method360(0, true, var2, 24);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IILqj;II)V")
    public static final void method332(int arg0, int arg1, class196 arg2, int arg3, int arg4) {
        class178 var5 = class62.method394(0, arg4, arg3);
        field755++;
        if (var5 == null) {
            return;
        }
        if (var5.field3086 != null) {
            class157 var6 = new class157();
            var6.field2533 = arg2;
            var6.field2526 = var5;
            var6.field2534 = var5.field3086;
            var6.field2532 = arg0;
            class88.method550(var6, -121);
        }
        boolean var7 = true;
        if (var5.field3121 > 0) {
            var7 = class202.method1373(var5, (byte) 88);
        }
        if (!var7 || !class152.method955(19253, client.method614(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class181.field3196++;
            class44.field520.method1173(78, 14592);
            class44.field520.method355((byte) -120, arg4);
            class44.field520.method310(arg3, -59);
        }
        if (arg0 == 2) {
            class245.field4364++;
            class44.field520.method1173(198, 14592);
            class44.field520.method355((byte) -104, arg4);
            class44.field520.method310(arg3, -96);
        }
        if (arg0 == 3) {
            class45.field532++;
            class44.field520.method1173(101, 14592);
            class44.field520.method355((byte) 41, arg4);
            class44.field520.method310(arg3, -60);
        }
        if (arg0 == 4) {
            class44.field520.method1173(129, 14592);
            class243.field4327++;
            class44.field520.method355((byte) 92, arg4);
            class44.field520.method310(arg3, -57);
        }
        if (arg0 == 5) {
            class44.field520.method1173(144, 14592);
            class44.field520.method355((byte) -123, arg4);
            class23.field295++;
            class44.field520.method310(arg3, -96);
        }
        if (arg0 == 6) {
            class50.field601++;
            class44.field520.method1173(189, 14592);
            class44.field520.method355((byte) -81, arg4);
            class44.field520.method310(arg3, -92);
        }
        if (arg0 == 7) {
            class44.field520.method1173(52, 14592);
            class180.field3174++;
            class44.field520.method355((byte) -70, arg4);
            class44.field520.method310(arg3, -38);
        }
        if (arg0 == 8) {
            class44.field520.method1173(180, 14592);
            class123.field1753++;
            class44.field520.method355((byte) -95, arg4);
            class44.field520.method310(arg3, -108);
        }
        if (arg0 == 9) {
            class44.field520.method1173(147, 14592);
            class44.field520.method355((byte) 93, arg4);
            class178.field3109++;
            class44.field520.method310(arg3, -60);
        }
        if (arg1 <= 89) {
            field694 = null;
        }
        if (arg0 == 10) {
            class44.field520.method1173(131, 14592);
            class258.field4512++;
            class44.field520.method355((byte) -73, arg4);
            class44.field520.method310(arg3, -115);
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(IZ)V")
    public final void method333(int arg0, boolean arg1) {
        if (arg1) {
            this.method313(73);
        }
        field695++;
        this.field693[this.field699++] = (byte) (arg0 + 128);
    }

    @OriginalMember(owner = "client!p", name = "h", descriptor = "(I)V")
    public static void method334(int arg0) {
        field694 = null;
        if (arg0 <= -2) {
            field719 = null;
            field697 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(Z)I")
    public final int method335(boolean arg0) {
        field715++;
        this.field699 += 4;
        return arg0 ? (this.field693[this.field699 - 3] & 0xFF) + (((this.field693[this.field699 - 2] & 0xFF) << 24) + ((this.field693[this.field699 - 1] & 0xFF) << 16) + ((this.field693[this.field699 + -4] & 0xFF) << 8)) : 127;
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(B)I")
    public final int method336(byte arg0) {
        field724++;
        int var2 = 74 % ((arg0 - 40) / 34);
        return this.field693[this.field699++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(ZI)V")
    public final void method337(boolean arg0, int arg1) {
        if (!arg0) {
            field694 = null;
        }
        this.field693[this.field699++] = (byte) (arg1 >> 8);
        field723++;
        this.field693[this.field699++] = (byte) arg1;
        this.field693[this.field699++] = (byte) (arg1 >> 24);
        this.field693[this.field699++] = (byte) (arg1 >> 16);
    }

    @OriginalMember(owner = "client!p", name = "g", descriptor = "(B)I")
    public final int method338(byte arg0) {
        int var2 = -29 / ((62 - arg0) / 34);
        field691++;
        this.field699 += 2;
        int var3 = ((this.field693[this.field699 - 2] & 0xFF) << 8) + (this.field693[this.field699 - 1] & 0xFF);
        if (var3 > 32767) {
            var3 -= 65536;
        }
        return var3;
    }

    @OriginalMember(owner = "client!p", name = "i", descriptor = "(I)I")
    public final int method339(int arg0) {
        if (arg0 >= -85) {
            this.method344(38, 81);
        }
        this.field699 += 4;
        field709++;
        return ((this.field693[this.field699 - 1] & 0xFF) << 24) + ((this.field693[this.field699 - 2] & 0xFF) << 16) + ((this.field693[this.field699 + -3] & 0xFF) << 8) + (this.field693[this.field699 - 4] & 0xFF);
    }

    @OriginalMember(owner = "client!p", name = "j", descriptor = "(I)Lqj;")
    public final class196 method340(int arg0) {
        field740++;
        if (arg0 != -1633689400) {
            this.field699 = 8;
        }
        if (this.field693[this.field699] == 0) {
            this.field699++;
            return null;
        } else {
            return this.method326(true);
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(II)V")
    public final void method341(int arg0, int arg1) {
        field731++;
        if (arg0 != 2165) {
            this.field699 = 83;
        }
        this.field693[this.field699++] = (byte) (128 - arg1);
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(ZI)V")
    public final void method342(boolean arg0, int arg1) {
        field744++;
        this.field693[this.field699 - arg1 - 4] = (byte) (arg1 >> 24);
        if (!arg0) {
            this.method333(124, false);
        }
        this.field693[this.field699 - arg1 - 3] = (byte) (arg1 >> 16);
        this.field693[this.field699 - arg1 - 2] = (byte) (arg1 >> 8);
        this.field693[this.field699 - arg1 - 1] = (byte) arg1;
    }

    @OriginalMember(owner = "client!p", name = "h", descriptor = "(B)I")
    public final int method343(byte arg0) {
        int var2 = -13 / ((arg0 - 33) / 52);
        field713++;
        return -this.field693[this.field699++] & 0xFF;
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(II)V")
    public final void method344(int arg0, int arg1) {
        this.field693[this.field699++] = (byte) (arg0 >> 16);
        field725++;
        if (arg1 != 30848) {
            this.method327(-45L, 76, (byte) 20);
        }
        this.field693[this.field699++] = (byte) (arg0 >> 8);
        this.field693[this.field699++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(II)V")
    public final void method345(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method330(null, -56);
        }
        this.field693[this.field699++] = (byte) arg1;
        this.field693[this.field699++] = (byte) (arg1 >> 8);
        field749++;
        this.field693[this.field699++] = (byte) (arg1 >> 16);
        this.field693[this.field699++] = (byte) (arg1 >> 24);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(I)V")
    public class56(int arg0) {
        this.field699 = 0;
        this.field693 = class123.method751(true, arg0);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(JB)V")
    public final void method346(long arg0, byte arg1) {
        this.field693[this.field699++] = (byte) (arg0 >> 56);
        this.field693[this.field699++] = (byte) (arg0 >> 48);
        this.field693[this.field699++] = (byte) (arg0 >> 40);
        field734++;
        this.field693[this.field699++] = (byte) (arg0 >> 32);
        this.field693[this.field699++] = (byte) (arg0 >> 24);
        int var4 = -29 / ((arg1 + 36) / 49);
        this.field693[this.field699++] = (byte) (arg0 >> 16);
        this.field693[this.field699++] = (byte) (arg0 >> 8);
        this.field693[this.field699++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!p", name = "i", descriptor = "(B)I")
    public final int method347(byte arg0) {
        this.field699 += 2;
        if (arg0 > -59) {
            this.method326(false);
        }
        field746++;
        int var2 = ((this.field693[this.field699 - 1] & 0xFF) << 8) + (this.field693[this.field699 - 2] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!p", name = "j", descriptor = "(B)I")
    public final int method348(byte arg0) {
        field753++;
        this.field699 += 4;
        return arg0 == -114 ? ((this.field693[this.field699 - 4] & 0xFF) << 16) + ((this.field693[this.field699 - 1] & 0xFF) << 8) + ((this.field693[this.field699 + -3] & 0xFF) << 24) + (this.field693[this.field699 - 2] & 0xFF) : 64;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Lqj;I)Z")
    public static final boolean method349(class196 arg0, int arg1) {
        field717++;
        try {
            int var2 = arg0.method1324(44, arg1 ^ arg1);
            if (var2 == -1) {
                return false;
            }
            class196 var3 = arg0.method1290(var2, 13324, 0);
            class196 var4 = arg0.method1296(var2 + 1, -1);
            MessageDigest var5 = MessageDigest.getInstance("SHA");
            var5.reset();
            var5.update(var3.method1316(0));
            byte[] var6 = var5.digest();
            byte[] var7 = var4.method1315(false);
            class56 var8 = new class56(5000);
            var8.method360(0, true, var7, var7.length);
            var8.field699 = 0;
            var8.method363(class176.field2975, class229.field4074, 0);
            if (var8.field693[0] != 1) {
                return false;
            }
            for (int var9 = 0; var9 < 20; var9++) {
                if (var8.field693[var9 + 1] != var6[var9]) {
                    return false;
                }
            }
            return true;
        } catch (Exception var10) {
            return false;
        }
    }

    @OriginalMember(owner = "client!p", name = "k", descriptor = "(I)B")
    public final byte method350(int arg0) {
        field748++;
        if (arg0 != 16) {
            field719 = null;
        }
        return this.field693[this.field699++];
    }

    @OriginalMember(owner = "client!p", name = "l", descriptor = "(I)I")
    public final int method351(int arg0) {
        field738++;
        int var2 = 16 % ((-arg0 - 57) / 44);
        byte var3 = this.field693[this.field699++];
        int var4 = 0;
        while (var3 < 0) {
            var4 = (var4 | var3 & 0x7F) << 7;
            var3 = this.field693[this.field699++];
        }
        return var4 | var3;
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(ZI)V")
    public final void method352(boolean arg0, int arg1) {
        this.field693[this.field699++] = (byte) (arg1 + 128);
        this.field693[this.field699++] = (byte) (arg1 >> 8);
        field704++;
        if (arg0) {
            this.method338((byte) 53);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILlj;ILp;)V")
    public static final void method353(int arg0, class205 arg1, int arg2, class56 arg3) {
        class46 var4 = new class46();
        field705++;
        var4.field554 = arg3.method367(1);
        var4.field557 = arg3.method311(0);
        var4.field556 = new byte[var4.field554][][];
        var4.field552 = new int[var4.field554];
        var4.field558 = new int[var4.field554];
        var4.field546 = new class139[var4.field554];
        var4.field549 = new class139[var4.field554];
        if (arg2 != 6201) {
            method353(-71, null, 70, null);
        }
        var4.field548 = new int[var4.field554];
        for (int var5 = 0; var5 < var4.field554; var5++) {
            try {
                int var6 = arg3.method367(1);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg3.method326(true).method1316(0));
                    String var18 = new String(arg3.method326(true).method1316(arg2 - 6201));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method311(0);
                    }
                    var4.field548[var5] = var6;
                    var4.field552[var5] = var19;
                    var4.field549[var5] = arg1.method1402(var18, 4631, class174.method1139(var17, -91));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg3.method326(true).method1316(arg2 ^ 0x1839));
                    String var8 = new String(arg3.method326(true).method1316(0));
                    int var9 = arg3.method367(1);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg3.method326(true).method1316(0));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method311(0);
                            var12[var13] = new byte[var14];
                            arg3.method316(var14, var12[var13], (byte) -80, 0);
                        }
                    }
                    var4.field548[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class174.method1139(var10[var16], 83);
                    }
                    var4.field546[var5] = arg1.method1401(class174.method1139(var7, 57), var8, var15, class246.method1675(arg2, 6196));
                    var4.field556[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field558[var5] = -1;
            } catch (SecurityException var21) {
                var4.field558[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field558[var5] = -3;
            } catch (Exception var23) {
                var4.field558[var5] = -4;
            } catch (Throwable var24) {
                var4.field558[var5] = -5;
            }
        }
        class92.field1346.method1652(26532, var4);
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(Z)I")
    public final int method354(boolean arg0) {
        this.field699 += 2;
        field711++;
        return arg0 ? ((this.field693[this.field699 - 1] & 0xFF) << 8) + (this.field693[this.field699 - 2] & 0xFF) : -102;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(BI)V")
    public final void method355(byte arg0, int arg1) {
        field727++;
        this.field693[this.field699++] = (byte) (arg1 >> 24);
        this.field693[this.field699++] = (byte) (arg1 >> 16);
        this.field693[this.field699++] = (byte) (arg1 >> 8);
        this.field693[this.field699++] = (byte) arg1;
        int var3 = 37 / ((-arg0 - 26) / 38);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZIIIIIIIBIII)Z")
    public static final boolean method356(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var32 = 0; var32 < 104; var32++) {
                class30.field380[var12][var32] = 0;
                class109.field1555[var12][var32] = 99999999;
            }
        }
        field706++;
        class30.field380[arg1][arg7] = 99;
        class109.field1555[arg1][arg7] = 0;
        int var13 = arg1;
        int var14 = arg7;
        byte var15 = 0;
        class30.field375[var15] = arg1;
        int var33 = var15 + 1;
        class172.field2892[var15] = arg7;
        int var16 = 0;
        boolean var17 = false;
        int[][] var18 = class188.field3298[class27.field335].field2462;
        while (var33 != var16) {
            var14 = class172.field2892[var16];
            var13 = class30.field375[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg5 == var13 && arg9 == var14) {
                var17 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && class188.field3298[class27.field335].method969(arg2 - 1, arg5, (byte) -108, var14, var13, arg4, arg9, 1)) {
                    var17 = true;
                    break;
                }
                if (arg2 < 10 && class188.field3298[class27.field335].method971(var14, 119, arg9, arg2 - 1, var13, arg4, arg5, 1)) {
                    var17 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg11 != 0 && class188.field3298[class27.field335].method961(arg6, arg3, arg5, var14, arg11, var13, -1, arg9, 1)) {
                var17 = true;
                break;
            }
            int var31 = class109.field1555[var13][var14] + 1;
            if (var13 > 0 && class30.field380[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0) {
                class30.field375[var33] = var13 - 1;
                class172.field2892[var33] = var14;
                var33 = var33 + 1 & 0xFFF;
                class30.field380[var13 - 1][var14] = 2;
                class109.field1555[var13 - 1][var14] = var31;
            }
            if (var13 < 103 && class30.field380[var13 + 1][var14] == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0) {
                class30.field375[var33] = var13 + 1;
                class172.field2892[var33] = var14;
                var33 = var33 + 1 & 0xFFF;
                class30.field380[var13 + 1][var14] = 8;
                class109.field1555[var13 + 1][var14] = var31;
            }
            if (var14 > 0 && class30.field380[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class30.field375[var33] = var13;
                class172.field2892[var33] = var14 - 1;
                var33 = var33 + 1 & 0xFFF;
                class30.field380[var13][var14 - 1] = 1;
                class109.field1555[var13][var14 - 1] = var31;
            }
            if (var14 < 103 && class30.field380[var13][var14 + 1] == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class30.field375[var33] = var13;
                class172.field2892[var33] = var14 + 1;
                class30.field380[var13][var14 + 1] = 4;
                var33 = var33 + 1 & 0xFFF;
                class109.field1555[var13][var14 + 1] = var31;
            }
            if (var13 > 0 && var14 > 0 && class30.field380[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class30.field375[var33] = var13 - 1;
                class172.field2892[var33] = var14 - 1;
                var33 = var33 + 1 & 0xFFF;
                class30.field380[var13 - 1][var14 - 1] = 3;
                class109.field1555[var13 - 1][var14 - 1] = var31;
            }
            if (var13 < 103 && var14 > 0 && class30.field380[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class30.field375[var33] = var13 + 1;
                class172.field2892[var33] = var14 - 1;
                class30.field380[var13 + 1][var14 - 1] = 9;
                var33 = var33 + 1 & 0xFFF;
                class109.field1555[var13 + 1][var14 - 1] = var31;
            }
            if (var13 > 0 && var14 < 103 && class30.field380[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class30.field375[var33] = var13 - 1;
                class172.field2892[var33] = var14 + 1;
                class30.field380[var13 - 1][var14 + 1] = 6;
                var33 = var33 + 1 & 0xFFF;
                class109.field1555[var13 - 1][var14 + 1] = var31;
            }
            if (var13 < 103 && var14 < 103 && class30.field380[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class30.field375[var33] = var13 + 1;
                class172.field2892[var33] = var14 + 1;
                var33 = var33 + 1 & 0xFFF;
                class30.field380[var13 + 1][var14 + 1] = 12;
                class109.field1555[var13 + 1][var14 + 1] = var31;
            }
        }
        class195.field3427 = 0;
        int var19 = 104 % ((arg8 - 8) / 32);
        if (!var17) {
            if (!arg0) {
                return false;
            }
            int var20 = 100;
            int var21 = 1000;
            byte var22 = 10;
            for (int var23 = arg5 - var22; var23 <= arg5 + var22; var23++) {
                for (int var24 = arg9 - var22; var24 <= arg9 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class109.field1555[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (arg5 > var23) {
                            var26 = arg5 - var23;
                        } else if (arg5 + arg6 - 1 < var23) {
                            var26 = var23 + 1 - arg5 - arg6;
                        }
                        if (arg9 > var24) {
                            var25 = arg9 - var24;
                        } else if (arg9 + arg11 - 1 < var24) {
                            var25 = var24 + 1 - arg9 - arg11;
                        }
                        int var27 = var26 * var26 + var25 * var25;
                        if (var21 > var27 || var21 == var27 && var20 > class109.field1555[var23][var24]) {
                            var13 = var23;
                            var21 = var27;
                            var20 = class109.field1555[var23][var24];
                            var14 = var24;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg1 == var13 && arg7 == var14) {
                return false;
            }
            class195.field3427 = 1;
        }
        byte var28 = 0;
        class30.field375[var28] = var13;
        int var34 = var28 + 1;
        class172.field2892[var28] = var14;
        int var29;
        int var30 = var29 = class30.field380[var13][var14];
        while (arg1 != var13 || arg7 != var14) {
            if (var29 != var30) {
                var29 = var30;
                class30.field375[var34] = var13;
                class172.field2892[var34++] = var14;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            var30 = class30.field380[var13][var14];
        }
        if (var34 > 0) {
            class33.method175(var34, -26, arg10);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!p", name = "k", descriptor = "(B)B")
    public final byte method357(byte arg0) {
        field730++;
        int var2 = -122 / ((arg0 - 29) / 38);
        return (byte) (this.field693[this.field699++] - 128);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "([B)V")
    public class56(byte[] arg0) {
        this.field693 = arg0;
        this.field699 = 0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II[BI)V")
    public final void method358(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 != -128) {
            this.method328(113);
        }
        field690++;
        for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
            arg2[var5] = (byte) (this.field693[this.field699++] - 128);
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(IB)V")
    public final void method359(int arg0, byte arg1) {
        field726++;
        this.field693[this.field699 - arg0 - 1] = (byte) arg0;
        if (arg1 != -114) {
            this.method365(26, -89);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZ[BI)V")
    public final void method360(int arg0, boolean arg1, byte[] arg2, int arg3) {
        field733++;
        int var5 = arg0;
        if (!arg1) {
            field697 = null;
        }
        while (arg0 + arg3 > var5) {
            this.field693[this.field699++] = arg2[var5];
            var5++;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
    public final void method361(BigInteger arg0, int arg1, BigInteger arg2) {
        field754++;
        int var4 = this.field699;
        this.field699 = 0;
        byte[] var5 = new byte[var4];
        this.method316(var4, var5, (byte) -124, 0);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg0);
        byte[] var8 = var7.toByteArray();
        this.field699 = 0;
        if (arg1 != 22206) {
            this.method319(-103);
        }
        this.method329((byte) 13, var8.length);
        this.method360(0, true, var8, var8.length);
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(Z)I")
    public final int method362(boolean arg0) {
        this.field699 += 3;
        if (arg0) {
            field721++;
            return (this.field693[this.field699 - 2] & 0xFF) + ((this.field693[this.field699 - 1] & 0xFF) << 8) + ((this.field693[this.field699 + -3] & 0xFF) << 16);
        } else {
            return -62;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    private final void method363(BigInteger arg0, BigInteger arg1, int arg2) {
        int var4 = this.method367(arg2 + 1);
        byte[] var5 = new byte[var4];
        this.method316(var4, var5, (byte) -89, arg2);
        field692++;
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg1, arg0);
        byte[] var8 = var7.toByteArray();
        this.field699 = 0;
        this.method360(0, true, var8, var8.length);
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(BI)V")
    public final void method364(byte arg0, int arg1) {
        field702++;
        int var3 = 102 % ((-arg0 - 42) / 44);
        this.field693[this.field699++] = (byte) -arg1;
    }

    @OriginalMember(owner = "client!p", name = "g", descriptor = "(II)V")
    public final void method365(int arg0, int arg1) {
        if (arg0 != -28792) {
            this.method310(112, -48);
        }
        field739++;
        this.field693[this.field699++] = (byte) (arg1 >> 8);
        this.field693[this.field699++] = (byte) (arg1 + 128);
    }

    @OriginalMember(owner = "client!p", name = "m", descriptor = "(I)I")
    public final int method366(int arg0) {
        int var2 = 0;
        field707++;
        if (arg0 <= 21) {
            return 58;
        }
        int var3;
        for (var3 = this.method307((byte) 73); var3 == 32767; var3 = this.method307((byte) 73)) {
            var2 += 32767;
        }
        return var2 + var3;
    }

    @OriginalMember(owner = "client!p", name = "n", descriptor = "(I)I")
    public final int method367(int arg0) {
        field742++;
        if (arg0 != 1) {
            this.method326(false);
        }
        return this.field693[this.field699++] & 0xFF;
    }
}
