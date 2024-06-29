import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class251 {

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "Luk;")
    private class213 field3999 = null;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "Z")
    private boolean field3988;

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "Z")
    private boolean field4005;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "Lrf;")
    private class47 field3987;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "S")
    public static short field3984 = 32767;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
    public static int field3997 = -1;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    public static int field4012 = 0;

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "F")
    public static float field4006;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!dk", name = "D", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "[Ljava/lang/Object;")
    private Object[] field3991;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "[Z")
    public static boolean[] field3983;

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field4004;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)Z")
    private final boolean method1666(int arg0, int arg1) {
        field3979++;
        if (!this.method1690(85)) {
            return false;
        }
        int var3 = -69 % ((arg1 - 46) / 42);
        if (arg0 >= 0 && this.field3999.field3524.length > arg0 && this.field3999.field3524[arg0] != 0) {
            return true;
        } else if (class148.field2322) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)V")
    private final void method1667(int arg0, int arg1) {
        if (this.field4005) {
            this.field3991[arg0] = this.field3987.method202(111, arg0);
        } else {
            this.field3991[arg0] = class305.method2042(false, this.field3987.method202(120, arg0), 75);
        }
        if (arg1 != 0) {
            this.method1691(-80);
        }
        field3975++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLjava/lang/String;)I")
    public final int method1668(byte arg0, String arg1) {
        if (arg0 != -59) {
            field3997 = -31;
        }
        field4000++;
        if (this.method1690(74)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field3999.field3522.method1301(class100.method680(arg0 ^ 0x6F, var3), (byte) 4);
            return this.method1670(var4, 123);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V")
    public static void method1669(boolean arg0) {
        if (!arg0) {
            field3997 = -79;
        }
        field3983 = null;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(II)I")
    private final int method1670(int arg0, int arg1) {
        if (arg1 <= 110) {
            this.method1682(85, -84);
        }
        field3981++;
        if (this.method1666(arg0, 123)) {
            return this.field3991[arg0] == null ? this.field3987.method203(1000, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)I")
    public final int method1671(byte arg0) {
        field4010++;
        if (arg0 == -23) {
            return this.method1690(79) ? this.field3999.field3524.length : -1;
        } else {
            return 56;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)[B")
    public final byte[] method1672(int arg0, int arg1, int arg2) {
        field4016++;
        if (!this.method1694(arg2, arg0, 29671)) {
            return null;
        }
        if (this.field4004[arg0] == null || this.field4004[arg0][arg2] == null) {
            boolean var4 = this.method1697((int[]) null, arg0, 114);
            if (!var4) {
                this.method1667(arg0, 0);
                boolean var5 = this.method1697((int[]) null, arg0, 115);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class234.method1577(this.field4004[arg0][arg2], false, (byte) -16);
        if (arg1 != 0) {
            this.field3991 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZIZ)V")
    public final void method1673(boolean arg0, int arg1, boolean arg2) {
        field3996++;
        if (arg1 > -19) {
            this.method1667(111, 40);
        }
        if (!this.method1690(80)) {
            return;
        }
        if (arg0) {
            this.field3999.field3533 = null;
            this.field3999.field3532 = null;
        }
        if (arg2) {
            this.field3999.field3522 = null;
            this.field3999.field3520 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(DI)V")
    public static final void method1674(double arg0, int arg1) {
        field4011++;
        if (class170.field2761 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class94.field1521[var3] = var4 <= 255 ? var4 : 255;
            }
            class170.field2761 = arg0;
        }
        if (arg1 != -257) {
            method1674(1.532251966586251D, 70);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method1675(String arg0, byte arg1) {
        field4008++;
        if (arg1 > -81) {
            this.method1675((String) null, (byte) -106);
        }
        if (this.method1690(125)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3999.field3522.method1301(class100.method680(-75, var3), (byte) 4);
            this.method1684(0, var4);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)V")
    public final void method1676(int arg0, byte arg1) {
        field3978++;
        if (!this.method1666(arg0, -13)) {
            return;
        }
        if (arg1 >= -24) {
            this.method1678((byte) 73, 92);
        }
        if (this.field4004 != null) {
            this.field4004[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)I")
    public final int method1677(byte arg0) {
        field4013++;
        if (!this.method1690(116)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3991.length; var4++) {
            if (this.field3999.field3525[var4] > 0) {
                var2 += 100;
                var3 += this.method1670(var4, 117);
            }
        }
        if (var2 == 0) {
            return 100;
        } else if (arg0 > -96) {
            return 30;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)I")
    public final int method1678(byte arg0, int arg1) {
        field3992++;
        int var3 = 70 / ((-arg0 - 27) / 53);
        return this.method1666(arg1, 117) ? this.field3999.field3524[arg1] : 0;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(Z)V")
    public final void method1679(boolean arg0) {
        field3986++;
        if (this.field4004 != null) {
            for (int var2 = 0; var2 < this.field4004.length; var2++) {
                this.field4004[var2] = null;
            }
        }
        if (arg0) {
            field3983 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(III)[B")
    public final byte[] method1680(int arg0, int arg1, int arg2) {
        if (arg2 >= -61) {
            this.method1690(-8);
        }
        field4009++;
        return this.method1692(arg0, -72, arg1, (int[]) null);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)I")
    public final int method1681(int arg0) {
        field3998++;
        if (arg0 != -8169) {
            field4012 = -18;
        }
        if (!this.method1690(98)) {
            throw new IllegalStateException("");
        }
        return this.field3999.field3534;
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(II)I")
    public final int method1682(int arg0, int arg1) {
        if (arg0 != -2) {
            this.method1696((String) null, true, (String) null);
        }
        field4014++;
        if (this.method1690(arg0 ^ 0xFFFFFFAC)) {
            int var3 = this.field3999.field3522.method1301(arg1, (byte) 4);
            return this.method1666(var3, -35) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)[B")
    public final byte[] method1683(byte arg0, String arg1, String arg2) {
        field3993++;
        if (!this.method1690(arg0 + 47)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field3999.field3522.method1301(class100.method680(-72, var4), (byte) 4);
        if (!this.method1666(var6, -82)) {
            return null;
        }
        if (arg0 != 46) {
            this.method1668((byte) 97, (String) null);
        }
        int var7 = this.field3999.field3533[var6].method1301(class100.method680(arg0 - 136, var5), (byte) 4);
        return this.method1680(var7, var6, -91);
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(II)V")
    private final void method1684(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method1690(-122);
        }
        field3994++;
        this.field3987.method213(arg1, false);
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(IB)Z")
    public final boolean method1685(int arg0, byte arg1) {
        field3985++;
        if (arg1 <= 59) {
            field3983 = null;
        }
        if (!this.method1666(arg0, -121)) {
            return false;
        } else if (this.field3991[arg0] == null) {
            this.method1667(arg0, 0);
            return this.field3991[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILdk;B)Lhg;")
    public static final class220 method1686(int arg0, class251 arg1, byte arg2) {
        field3977++;
        if (arg2 != -83) {
            method1686(57, (class251) null, (byte) 115);
        }
        return class187.method1339(arg0, arg1, (byte) 60) ? class61.method415(9224) : null;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method1687(String arg0, byte arg1) {
        int var3 = -31 % ((arg1 - 10) / 47);
        field4015++;
        if (this.method1690(60)) {
            String var4 = arg0.toLowerCase();
            int var5 = this.field3999.field3522.method1301(class100.method680(-75, var4), (byte) 4);
            return var5 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI)[I")
    public final int[] method1688(boolean arg0, int arg1) {
        field3973++;
        if (!this.method1666(arg1, 99)) {
            return null;
        }
        if (!arg0) {
            field4006 = -0.4738998F;
        }
        int[] var3 = this.field3999.field3523[arg1];
        if (var3 == null) {
            var3 = new int[this.field3999.field3525[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(II)[B")
    public final byte[] method1689(int arg0, int arg1) {
        if (arg1 > -92) {
            this.field3991 = null;
        }
        field4007++;
        if (!this.method1690(65)) {
            return null;
        } else if (this.field3999.field3524.length == 1) {
            return this.method1680(arg0, 0, -85);
        } else if (!this.method1666(arg0, -47)) {
            return null;
        } else if (this.field3999.field3524[arg0] == 1) {
            return this.method1680(0, arg0, -111);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)Z")
    private final boolean method1690(int arg0) {
        field3974++;
        if (arg0 <= 59) {
            return false;
        }
        if (this.field3999 == null) {
            this.field3999 = this.field3987.method206(false);
            if (this.field3999 == null) {
                return false;
            }
            this.field3991 = new Object[this.field3999.field3528];
            this.field4004 = new Object[this.field3999.field3528][];
        }
        return true;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)Z")
    public final boolean method1691(int arg0) {
        field3976++;
        if (!this.method1690(110)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field3999.field3531.length; var3++) {
            int var4 = this.field3999.field3531[var3];
            if (this.field3991[var4] == null) {
                this.method1667(var4, 0);
                if (this.field3991[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III[I)[B")
    public final byte[] method1692(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg1 > -49) {
            this.method1692(-58, -57, -121, (int[]) null);
        }
        field4002++;
        if (!this.method1694(arg0, arg2, 29671)) {
            return null;
        }
        if (this.field4004[arg2] == null || this.field4004[arg2][arg0] == null) {
            boolean var5 = this.method1697(arg3, arg2, 109);
            if (!var5) {
                this.method1667(arg2, 0);
                boolean var6 = this.method1697(arg3, arg2, 107);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class234.method1577(this.field4004[arg2][arg0], false, (byte) -16);
        if (this.field3988) {
            this.field4004[arg2][arg0] = null;
            if (this.field3999.field3524[arg2] == 1) {
                this.field4004[arg2] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(III)Z")
    public final boolean method1693(int arg0, int arg1, int arg2) {
        field3982++;
        if (!this.method1694(arg2, arg1, 29671)) {
            return false;
        } else if (this.field4004[arg1] != null && this.field4004[arg1][arg2] != null) {
            return true;
        } else if (this.field3991[arg1] == null) {
            this.method1667(arg1, 0);
            if (arg0 != 3943) {
                this.method1673(false, 31, true);
            }
            return this.field3991[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lrf;ZZ)V")
    public class251(class47 arg0, boolean arg1, boolean arg2) {
        this.field3988 = arg2;
        this.field4005 = arg1;
        this.field3987 = arg0;
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(III)Z")
    private final boolean method1694(int arg0, int arg1, int arg2) {
        if (arg2 != 29671) {
            this.method1681(79);
        }
        field3990++;
        if (!this.method1690(77)) {
            return false;
        } else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.field3999.field3524.length && this.field3999.field3524[arg1] > arg0) {
            return true;
        } else if (class148.field2322) {
            throw new IllegalArgumentException(arg1 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method1695(String arg0, int arg1) {
        field4003++;
        if (!this.method1690(72)) {
            return false;
        }
        if (arg1 != -31451) {
            this.method1683((byte) -22, (String) null, (String) null);
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field3999.field3522.method1301(class100.method680(-81, var3), (byte) 4);
        return this.method1685(var4, (byte) 122);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)Z")
    public final boolean method1696(String arg0, boolean arg1, String arg2) {
        field4017++;
        if (!this.method1690(109)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        if (!arg1) {
            method1674(-0.48191502537501457D, 47);
        }
        int var6 = this.field3999.field3522.method1301(class100.method680(-48, var4), (byte) 4);
        if (this.method1666(var6, 96)) {
            int var7 = this.field3999.field3533[var6].method1301(class100.method680(-85, var5), (byte) 4);
            return this.method1693(3943, var6, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "([III)Z")
    private final boolean method1697(int[] arg0, int arg1, int arg2) {
        field3980++;
        if (!this.method1666(arg1, -67)) {
            return false;
        } else if (this.field3991[arg1] == null) {
            return false;
        } else {
            int var4 = this.field3999.field3525[arg1];
            int[] var5 = this.field3999.field3523[arg1];
            boolean var6 = true;
            if (this.field4004[arg1] == null) {
                this.field4004[arg1] = new Object[this.field3999.field3524[arg1]];
            }
            if (arg2 < 104) {
                return true;
            }
            Object[] var7 = this.field4004[arg1];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var10 = class234.method1577(this.field3991[arg1], true, (byte) -16);
                class162 var11 = new class162(var10);
                var11.method1115(arg0, (byte) -125, var11.field2573.length, 5);
            } else {
                var10 = class234.method1577(this.field3991[arg1], false, (byte) -16);
            }
            byte[] var12;
            try {
                var12 = class267.method1795(var10, -25620);
            } catch (RuntimeException var31) {
                throw class304.method2036(var31, "T3 - " + (arg0 != null) + "," + arg1 + "," + var10.length + "," + class39.method245(var10, var10.length, -106) + "," + class39.method245(var10, var10.length - 2, -117) + "," + this.field3999.field3517[arg1] + "," + this.field3999.field3534);
            }
            if (this.field4005) {
                this.field3991[arg1] = null;
            }
            if (var4 > 1) {
                int[] var14 = new int[var4];
                int var15 = var12.length;
                int var32 = var15 - 1;
                int var16 = var12[var32] & 0xFF;
                int var17 = var32 - var16 * 4 * var4;
                class162 var18 = new class162(var12);
                var18.field2568 = var17;
                for (int var19 = 0; var19 < var16; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        var20 += var18.method1157(65280);
                        var14[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var14[var23]];
                    var14[var23] = 0;
                }
                var18.field2568 = var17;
                int var24 = 0;
                for (int var25 = 0; var25 < var16; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var18.method1157(65280);
                        class157.method1074(var12, var24, var22[var27], var14[var27], var26);
                        var14[var27] += var26;
                        var24 += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var5 == null) {
                        var29 = var28;
                    } else {
                        var29 = var5[var28];
                    }
                    if (this.field3988) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class305.method2042(false, var22[var28], 49);
                    }
                }
            } else {
                int var30;
                if (var5 == null) {
                    var30 = 0;
                } else {
                    var30 = var5[0];
                }
                if (this.field3988) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class305.method2042(false, var12, 70);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(BI)Z")
    public final boolean method1698(byte arg0, int arg1) {
        field3995++;
        if (arg0 < 56) {
            this.field3999 = null;
        }
        if (!this.method1690(91)) {
            return false;
        } else if (this.field3999.field3524.length == 1) {
            return this.method1693(3943, 0, arg1);
        } else if (!this.method1666(arg1, -113)) {
            return false;
        } else if (this.field3999.field3524[arg1] == 1) {
            return this.method1693(3943, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method1699(int arg0, String arg1) {
        field3989++;
        if (!this.method1690(118)) {
            return -1;
        }
        if (arg0 != 0) {
            this.method1688(true, -44);
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field3999.field3522.method1301(class100.method680(-64, var3), (byte) 4);
        return this.method1666(var4, -85) ? var4 : -1;
    }
}
