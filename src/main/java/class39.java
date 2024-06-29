import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class39 {

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "Lwf;")
    private class64 field522 = null;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "Lwi;")
    private class277 field530;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Z")
    private boolean field513;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "Z")
    private boolean field532;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Z")
    public static boolean field512 = true;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field525 = -1;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Lqg;")
    public static class256 field531 = new class256();

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "Z")
    public static boolean field548 = true;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "[S")
    public static short[] field552 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field547 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "[Ljava/lang/Object;")
    private Object[] field523;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field533;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZI)Z", line = 4)
    public final boolean method243(int arg0, boolean arg1, int arg2) {
        field540++;
        if (!this.method256(arg2, arg0, (byte) 33)) {
            return false;
        }
        if (arg1) {
            this.method256(-85, -105, (byte) -64);
        }
        if (this.field533[arg2] != null && this.field533[arg2][arg0] != null) {
            return true;
        } else if (this.field523[arg2] == null) {
            this.method265(arg2, (byte) 116);
            return this.field523[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)Z", line = 31)
    public final boolean method244(byte arg0) {
        field544++;
        if (!this.method251(-123)) {
            return false;
        }
        boolean var2 = true;
        if (arg0 >= -81) {
            this.method265(-124, (byte) -114);
        }
        for (int var3 = 0; var3 < this.field522.field843.length; var3++) {
            int var4 = this.field522.field843[var3];
            if (this.field523[var4] == null) {
                this.method265(var4, (byte) 122);
                if (this.field523[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)V", line = 68)
    public final void method245(byte arg0, int arg1) {
        field545++;
        int var3 = 34 % ((-arg0 - 51) / 45);
        if (this.method252((byte) -114, arg1) && this.field533 != null) {
            this.field533[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)Z", line = 84)
    public final boolean method246(boolean arg0, int arg1) {
        if (arg0) {
            field548 = true;
        }
        field543++;
        if (!this.method251(-113)) {
            return false;
        } else if (this.field522.field839.length == 1) {
            return this.method243(arg1, false, 0);
        } else if (!this.method252((byte) -114, arg1)) {
            return false;
        } else if (this.field522.field839[arg1] == 1) {
            return this.method243(0, arg0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZZI)V", line = 113)
    public final void method247(boolean arg0, boolean arg1, int arg2) {
        field524++;
        if (!this.method251(arg2 - 113)) {
            return;
        }
        if (arg1) {
            this.field522.field850 = null;
            this.field522.field834 = null;
        }
        if (arg2 == 0 && arg0) {
            this.field522.field836 = null;
            this.field522.field846 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B[II)Z", line = 142)
    private final boolean method248(byte arg0, int[] arg1, int arg2) {
        field535++;
        if (!this.method252((byte) -114, arg2)) {
            return false;
        } else if (this.field523[arg2] == null) {
            return false;
        } else {
            int var4 = this.field522.field840[arg2];
            if (arg0 > -110) {
                return true;
            }
            int[] var5 = this.field522.field851[arg2];
            if (this.field533[arg2] == null) {
                this.field533[arg2] = new Object[this.field522.field839[arg2]];
            }
            Object[] var6 = this.field533[arg2];
            boolean var7 = true;
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var6[var9] == null) {
                    var7 = false;
                    break;
                }
            }
            if (var7) {
                return true;
            }
            byte[] var10;
            if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
                var10 = class299.method2088(65408, this.field523[arg2], false);
            } else {
                var10 = class299.method2088(65408, this.field523[arg2], true);
                class192 var11 = new class192(var10);
                var11.method1408(-1640531527, var11.field3128.length, arg1, 5);
            }
            byte[] var12;
            try {
                var12 = class132.method909(var10, -1);
            } catch (RuntimeException var31) {
                throw class276.method1969(var31, "T3 - " + (arg1 != null) + "," + arg2 + "," + var10.length + "," + class160.method1107(var10.length, var10, 0) + "," + class160.method1107(var10.length - 2, var10, 0) + "," + this.field522.field837[arg2] + "," + this.field522.field841);
            }
            if (this.field513) {
                this.field523[arg2] = null;
            }
            if (var4 <= 1) {
                int var14;
                if (var5 == null) {
                    var14 = 0;
                } else {
                    var14 = var5[0];
                }
                if (this.field532) {
                    var6[var14] = var12;
                } else {
                    var6[var14] = class334.method2303(var12, false, -25077);
                }
            } else {
                int var15 = var12.length;
                int var32 = var15 - 1;
                int var16 = var12[var32] & 0xFF;
                int var17 = var32 - var4 * 4 * var16;
                int[] var18 = new int[var4];
                class192 var19 = new class192(var12);
                var19.field3129 = var17;
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var4; var22++) {
                        if (var5 == null) {
                        }
                        var21 += var19.method1354((byte) 11);
                        var18[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var4][];
                for (int var24 = 0; var24 < var4; var24++) {
                    var23[var24] = new byte[var18[var24]];
                    var18[var24] = 0;
                }
                var19.field3129 = var17;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var4; var28++) {
                        var27 += var19.method1354((byte) -127);
                        class213.method1552(var12, var25, var23[var28], var18[var28], var27);
                        var25 += var27;
                        var18[var28] += var27;
                    }
                }
                for (int var29 = 0; var29 < var4; var29++) {
                    int var30;
                    if (var5 == null) {
                        var30 = var29;
                    } else {
                        var30 = var5[var29];
                    }
                    if (this.field532) {
                        var6[var30] = var23[var29];
                    } else {
                        var6[var30] = class334.method2303(var23[var29], false, -25077);
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lkb;III)Ln;", line = 336)
    public static final class298 method249(class39 arg0, int arg1, int arg2, int arg3) {
        field555++;
        if (arg2 == 0) {
            return class288.method2026(arg3, arg1, arg0, -109) ? class162.method1127((byte) -126) : null;
        } else {
            return (class298) null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZII)[B", line = 351)
    public final byte[] method250(boolean arg0, int arg1, int arg2) {
        field537++;
        if (!arg0) {
            this.method260(-100, (String) null);
        }
        return this.method267(arg2, (int[]) null, true, arg1);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)Z", line = 363)
    private final boolean method251(int arg0) {
        field520++;
        if (arg0 > -104) {
            this.method271((byte) -60);
        }
        if (this.field522 == null) {
            this.field522 = this.field530.method1182(-1);
            if (this.field522 == null) {
                return false;
            }
            this.field523 = new Object[this.field522.field847];
            this.field533 = new Object[this.field522.field847][];
        }
        return true;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(BI)Z", line = 387)
    private final boolean method252(byte arg0, int arg1) {
        field546++;
        if (!this.method251(arg0 ^ 0x18)) {
            return false;
        } else if (arg0 != -114) {
            return false;
        } else if (arg1 >= 0 && this.field522.field839.length > arg1 && this.field522.field839[arg1] != 0) {
            return true;
        } else if (class81.field1233) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V", line = 411)
    public static void method253(boolean arg0) {
        field547 = null;
        field552 = null;
        field531 = null;
        if (arg0) {
            method249((class39) null, 106, -92, -28);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 424)
    public final void method254(String arg0, boolean arg1) {
        field553++;
        if (!this.method251(-128)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field522.field834.method1135(1, class132.method900(true, var3));
        this.method257(var4, 0);
        if (arg1) {
            this.method254((String) null, false);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)Z", line = 445)
    public final boolean method255(byte arg0, String arg1, String arg2) {
        field528++;
        if (!this.method251(-127)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field522.field834.method1135(1, class132.method900(true, var4));
        if (!this.method252((byte) -114, var6)) {
            return false;
        } else if (arg0 == 41) {
            int var7 = this.field522.field836[var6].method1135(1, class132.method900(true, var5));
            return this.method243(var7, false, var6);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIB)Z", line = 471)
    private final boolean method256(int arg0, int arg1, byte arg2) {
        field519++;
        if (arg2 != 33) {
            return true;
        } else if (!this.method251(-108)) {
            return false;
        } else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.field522.field839.length && arg1 < this.field522.field839[arg0]) {
            return true;
        } else if (class81.field1233) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V", line = 494)
    private final void method257(int arg0, int arg1) {
        field526++;
        this.field530.method1184(arg0, arg1 - 11778);
        if (arg1 != 0) {
            this.field532 = true;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B", line = 510)
    public final byte[] method258(int arg0, String arg1, String arg2) {
        field542++;
        if (!this.method251(arg0 ^ 0x5AAA)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        if (arg0 != -23260) {
            return (byte[]) null;
        }
        String var5 = arg2.toLowerCase();
        int var6 = this.field522.field834.method1135(1, class132.method900(true, var4));
        if (this.method252((byte) -114, var6)) {
            int var7 = this.field522.field836[var6].method1135(1, class132.method900(true, var5));
            return this.method250(true, var6, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)I", line = 534)
    public final int method259(byte arg0) {
        if (arg0 != 86) {
            return 116;
        }
        field529++;
        if (!this.method251(-105)) {
            throw new IllegalStateException("");
        }
        return this.field522.field841;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 551)
    public final boolean method260(int arg0, String arg1) {
        if (arg0 != -21568) {
            method253(false);
        }
        field514++;
        if (this.method251(arg0 + 21459)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field522.field834.method1135(1, class132.method900(true, var3));
            return this.method263(var4, (byte) -65);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)I", line = 570)
    public final int method261(int arg0, int arg1) {
        field541++;
        if (this.method252((byte) -114, arg1)) {
            return arg0 > -118 ? 101 : this.field522.field839[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)I", line = 584)
    public final int method262(int arg0) {
        field536++;
        if (!this.method251(-126)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field523.length; var4++) {
            if (this.field522.field840[var4] > 0) {
                var2 += 100;
                var3 += this.method272(var4, 0);
            }
        }
        if (~var2 == arg0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)Z", line = 631)
    public final boolean method263(int arg0, byte arg1) {
        field515++;
        if (!this.method252((byte) -114, arg0)) {
            return false;
        } else if (this.field523[arg0] == null) {
            this.method265(arg0, (byte) -114);
            if (this.field523[arg0] == null) {
                return arg1 > -52 ? false : false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 661)
    public final int method264(String arg0, byte arg1) {
        field551++;
        if (!this.method251(arg1 ^ 0x32)) {
            return 0;
        }
        if (arg1 != -75) {
            this.method250(false, 96, -68);
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field522.field834.method1135(arg1 + 76, class132.method900(true, var3));
        return this.method272(var4, arg1 ^ 0xFFFFFFB5);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(IB)V", line = 678)
    private final void method265(int arg0, byte arg1) {
        field516++;
        int var3 = -96 % ((arg1 - 51) / 61);
        if (this.field513) {
            this.field523[arg0] = this.field530.method1189(arg0, -4950);
        } else {
            this.field523[arg0] = class334.method2303(this.field530.method1189(arg0, -4950), false, -25077);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(ILjava/lang/String;)I", line = 692)
    public final int method266(int arg0, String arg1) {
        field518++;
        if (!this.method251(-111)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field522.field834.method1135(1, class132.method900(true, var3));
        if (arg0 > -31) {
            this.field522 = (class64) null;
        }
        return this.method252((byte) -114, var4) ? var4 : -1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[IZI)[B", line = 720)
    public final byte[] method267(int arg0, int[] arg1, boolean arg2, int arg3) {
        if (!arg2) {
            return (byte[]) null;
        }
        field534++;
        if (!this.method256(arg3, arg0, (byte) 33)) {
            return null;
        }
        if (this.field533[arg3] == null || this.field533[arg3][arg0] == null) {
            boolean var5 = this.method248((byte) -126, arg1, arg3);
            if (!var5) {
                this.method265(arg3, (byte) -102);
                boolean var6 = this.method248((byte) -118, arg1, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class299.method2088(65408, this.field533[arg3][arg0], false);
        if (this.field532) {
            this.field533[arg3][arg0] = null;
            if (this.field522.field839[arg3] == 1) {
                this.field533[arg3] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V", line = 761)
    public final void method268(int arg0) {
        field539++;
        if (arg0 != -1) {
            this.method263(37, (byte) 107);
        }
        if (this.field533 != null) {
            for (int var2 = 0; var2 < this.field533.length; var2++) {
                this.field533[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(ILjava/lang/String;)Z", line = 786)
    public final boolean method269(int arg0, String arg1) {
        field549++;
        if (this.method251(-109)) {
            int var3 = 80 / ((arg0 - 63) / 43);
            String var4 = arg1.toLowerCase();
            int var5 = this.field522.field834.method1135(1, class132.method900(true, var4));
            return var5 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)[I", line = 808)
    public final int[] method270(int arg0, int arg1) {
        field554++;
        if (arg0 > -67) {
            return (int[]) null;
        } else if (this.method252((byte) -114, arg1)) {
            int[] var3 = this.field522.field851[arg1];
            if (var3 == null) {
                var3 = new int[this.field522.field840[arg1]];
                int var4 = 0;
                while (var3.length > var4) {
                    var3[var4] = var4++;
                }
            }
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)I", line = 852)
    public final int method271(byte arg0) {
        field538++;
        int var2 = 114 / ((arg0 + 53) / 61);
        return this.method251(-126) ? this.field522.field839.length : -1;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(II)I", line = 869)
    private final int method272(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method259((byte) -37);
        }
        field550++;
        if (this.method252((byte) -114, arg0)) {
            return this.field523[arg0] == null ? this.field530.method1188((byte) 117, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)[B", line = 888)
    public final byte[] method273(int arg0, int arg1, int arg2) {
        field517++;
        if (!this.method256(arg0, arg1, (byte) 33)) {
            return null;
        }
        if (arg2 != 1) {
            this.method252((byte) 83, -18);
        }
        if (this.field533[arg0] == null || this.field533[arg0][arg1] == null) {
            boolean var4 = this.method248((byte) -124, (int[]) null, arg0);
            if (!var4) {
                this.method265(arg0, (byte) -13);
                boolean var5 = this.method248((byte) -125, (int[]) null, arg0);
                if (!var5) {
                    return null;
                }
            }
        }
        return class299.method2088(65408, this.field533[arg0][arg1], false);
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(BI)[B", line = 921)
    public final byte[] method274(byte arg0, int arg1) {
        field521++;
        if (!this.method251(-115)) {
            return null;
        } else if (this.field522.field839.length == 1) {
            return this.method250(true, 0, arg1);
        } else {
            if (arg0 > -41) {
                this.method266(-28, (String) null);
            }
            if (!this.method252((byte) -114, arg1)) {
                return null;
            } else if (this.field522.field839[arg1] == 1) {
                return this.method250(true, arg1, 0);
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lwi;ZZ)V", line = 961)
    public class39(class277 arg0, boolean arg1, boolean arg2) {
        this.field530 = arg0;
        this.field513 = arg1;
        this.field532 = arg2;
    }
}
