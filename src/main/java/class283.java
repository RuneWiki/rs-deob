import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class283 extends class241 {

    @OriginalMember(owner = "client!fj", name = "gb", descriptor = "I")
    private int field4777 = -1;

    @OriginalMember(owner = "client!fj", name = "eb", descriptor = "Z")
    private boolean field4775 = false;

    @OriginalMember(owner = "client!fj", name = "nb", descriptor = "Z")
    private volatile boolean field4784 = false;

    @OriginalMember(owner = "client!fj", name = "wb", descriptor = "I")
    private int field4793;

    @OriginalMember(owner = "client!fj", name = "ob", descriptor = "Lfh;")
    private class110 field4785;

    @OriginalMember(owner = "client!fj", name = "mb", descriptor = "Lfh;")
    private class110 field4783;

    @OriginalMember(owner = "client!fj", name = "yb", descriptor = "Luf;")
    public static class168 field4795 = class148.method1019(-1720, "l");

    @OriginalMember(owner = "client!fj", name = "tb", descriptor = "[I")
    public static int[] field4790 = new int[32];

    @OriginalMember(owner = "client!fj", name = "db", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!fj", name = "fb", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!fj", name = "hb", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!fj", name = "jb", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!fj", name = "pb", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!fj", name = "qb", descriptor = "I")
    private int field4787;

    @OriginalMember(owner = "client!fj", name = "rb", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!fj", name = "sb", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!fj", name = "ub", descriptor = "I")
    private int field4791;

    @OriginalMember(owner = "client!fj", name = "vb", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!fj", name = "xb", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!fj", name = "zb", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!fj", name = "Ab", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!fj", name = "kb", descriptor = "Lw;")
    public static class37 field4781;

    @OriginalMember(owner = "client!fj", name = "ib", descriptor = "Lkk;")
    public static class63 field4779;

    @OriginalMember(owner = "client!fj", name = "lb", descriptor = "Ljava/awt/Frame;")
    public static Frame field4782;

    @OriginalMember(owner = "client!fj", name = "Bb", descriptor = "[Z")
    private volatile boolean[] field4798;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIII)I", line = 5)
    public static final int method1949(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class142.field2188) {
            arg2 = 1000000;
            class142.field2188 = false;
        }
        field4786++;
        class148 var5 = class271.field4559[arg1][arg3];
        if (arg0 != 1000000) {
            return -87;
        }
        float var6 = ((float) arg4 * 0.1F + 0.7F) * var5.field2294;
        float var7 = var5.field2287;
        float var8 = var5.field2291;
        int var9 = var5.field2279;
        int var10 = var5.field2295;
        int var11 = var5.field2289;
        if (!class164.field2632) {
            var11 = 0;
        }
        if (class53.field654 != var9 || class263.field4457 != var6 || class278.field4672 != var7 || class215.field3504 != var8 || class140.field2169 != var10 || class292.field4920 != var11) {
            class262.field4449 = class219.field3561;
            class78.field1085 = class131.field2029;
            class278.field4672 = var7;
            class55.field712 = 0;
            class53.field654 = var9;
            class26.field323 = class142.field2198;
            class245.field4166 = class118.field1834;
            class263.field4457 = var6;
            class292.field4920 = var11;
            class300.field5085 = class254.field4347;
            class46.field568 = class236.field3778;
            class215.field3504 = var8;
            class140.field2169 = var10;
        }
        if (class55.field712 < 65536) {
            class55.field712 += arg2 * 250;
            if (class55.field712 >= 65536) {
                class55.field712 = 65536;
            }
            float var12 = (float) (65536 - class55.field712) / 65536.0F;
            float var13 = (float) class55.field712 / 65536.0F;
            int var14 = 65536 - class55.field712 >> 8;
            class219.field3561 = class263.field4457 * var13 + class262.field4449 * var12;
            class142.field2198 = class26.field323 * var12 + class215.field3504 * var13;
            class118.field1834 = class278.field4672 * var13 + class245.field4166 * var12;
            int var15 = class55.field712 >> 8;
            class131.field2029 = ((class78.field1085 & 0xFF00FF) * var14 + (class53.field654 & 0xFF00FF) * var15 & 0xFF00FF00) + ((class78.field1085 & 0xFF00) * var14 + (class53.field654 & 0xFF00) * var15 & 0xFF0000) >> 8;
            class236.field3778 = class46.field568 * var14 + class292.field4920 * var15 >> 8;
            class254.field4347 = ((class300.field5085 & 0xFF00) * var14 + ((class140.field2169 & 0xFF00) * var15) & 0xFF0000) + ((class300.field5085 & 0xFF00FF) * var14 + (class140.field2169 & 0xFF00FF) * var15 & 0xFF00FF00) >> 8;
        }
        class34.method167(class131.field2029, class219.field3561, class118.field1834, class142.field2198);
        class34.method162(class254.field4347, class236.field3778);
        class34.method161((float) class281.field4726, (float) class57.field741, (float) class38.field473);
        class34.method169();
        return class254.field4347;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V", line = 85)
    private final void method1950(byte arg0) {
        int var2 = 22 / ((arg0 + 48) / 43);
        this.field4798 = new boolean[this.field3944.length];
        for (int var3 = 0; var3 < this.field4798.length; var3++) {
            this.field4798[var3] = false;
        }
        field4788++;
        if (this.field4785 == null) {
            this.field4784 = true;
            return;
        }
        this.field4777 = -1;
        for (int var4 = 0; var4 < this.field4798.length; var4++) {
            if (this.field3911[var4] > 0) {
                class25.method129(var4, this, this.field4785, 47);
                this.field4777 = var4;
            }
        }
        if (this.field4777 == -1) {
            this.field4784 = true;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIBILjg;)V", line = 137)
    public static final void method1951(int arg0, int arg1, byte arg2, int arg3, class161 arg4) {
        field4780++;
        if (arg2 != -111) {
            field4779 = (class63) null;
        }
        for (class113 var5 = (class113) class215.field3499.method442(65293); var5 != null; var5 = (class113) class215.field3499.method440(3)) {
            if (var5.field1755 == arg1 && arg0 * 128 == var5.field1761 && (arg3 * 128) == var5.field1756 && var5.field1769.field2579 == arg4.field2579) {
                if (var5.field1770 != null) {
                    client.field4933.method1533(var5.field1770);
                    var5.field1770 = null;
                }
                if (var5.field1767 != null) {
                    client.field4933.method1533(var5.field1767);
                    var5.field1767 = null;
                }
                var5.method124((byte) 70);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(II)V", line = 177)
    public final void method1642(int arg0, int arg1) {
        if (arg0 != 1750) {
            field4779 = (class63) null;
        }
        field4792++;
        if (!this.method1656(arg1, 0)) {
            return;
        }
        if (this.field4785 == null || this.field4798 == null || !this.field4798[arg1]) {
            class79.method485(this.field3904[arg1], true, this, (byte) 2, arg1, -86, this.field4793);
        } else {
            class261.method1820(this, this.field4785, (byte) -124, arg1);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILfh;[BZI)V", line = 196)
    public final void method1952(int arg0, class110 arg1, byte[] arg2, boolean arg3, int arg4) {
        field4776++;
        if (arg0 > -110) {
            return;
        }
        if (this.field4783 != arg1) {
            if (!arg3 && this.field4777 == arg4) {
                this.field4784 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field4798[arg4] = false;
                if (this.field4775 || arg3) {
                    class79.method485(this.field3904[arg4], arg3, this, (byte) 2, arg4, 73, this.field4793);
                }
                return;
            }
            class138.field2135.reset();
            class138.field2135.update(arg2, 0, arg2.length - 2);
            int var11 = (int) class138.field2135.getValue();
            int var12 = (arg2[arg2.length - 2] & 0xFF << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3904[arg4] != var11 || this.field3923[arg4] != var12) {
                this.field4798[arg4] = false;
                if (this.field4775 || arg3) {
                    class79.method485(this.field3904[arg4], arg3, this, (byte) 2, arg4, 107, this.field4793);
                }
                return;
            }
            this.field4798[arg4] = true;
            if (arg3) {
                this.field3944[arg4] = class1.method1(false, false, arg2);
            }
            return;
        }
        if (this.field4784) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class79.method485(this.field4787, true, this, (byte) 0, this.field4793, -98, 255);
            return;
        }
        class138.field2135.reset();
        class138.field2135.update(arg2, 0, arg2.length);
        int var6 = (int) class138.field2135.getValue();
        if (this.field4787 != var6) {
            class79.method485(this.field4787, true, this, (byte) 0, this.field4793, 72, 255);
            return;
        }
        class153 var7;
        try {
            var7 = new class153(class125.method888(2, arg2));
        } catch (RuntimeException var13) {
            class79.method485(this.field4787, true, this, (byte) 0, this.field4793, -127, 255);
            return;
        }
        int var9 = var7.method1042((byte) -128);
        if (var9 != 5 && var9 != 6) {
            class79.method485(this.field4787, true, this, (byte) 0, this.field4793, 73, 255);
            return;
        }
        int var10 = 0;
        if (var9 >= 6) {
            var10 = var7.method1089((byte) -14);
        }
        if (this.field4791 != var10) {
            class79.method485(this.field4787, true, this, (byte) 0, this.field4793, -97, 255);
            return;
        }
        this.method1657(-1, arg2);
        this.method1950((byte) -99);
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)I", line = 323)
    public final int method1634(int arg0, int arg1) {
        field4794++;
        if (arg1 != 350874216) {
            return 9;
        } else if (!this.method1656(arg0, 0)) {
            return 0;
        } else if (this.field3944[arg0] == null) {
            return this.field4798[arg0] ? 100 : class252.method1722(true, arg0, this.field4793);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lf;III)V", line = 342)
    public static final void method1953(class231 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class117.field1821) {
            class127 var4 = class92.field1424[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1969 != null && var4.field1969.field4919.method670()) {
                arg0.method702(var4.field1969.field4919, 128, 0, 0, true);
            }
        }
        if (arg3 < class117.field1821) {
            class127 var5 = class92.field1424[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1969 != null && var5.field1969.field4919.method670()) {
                arg0.method702(var5.field1969.field4919, 0, 0, 128, true);
            }
        }
        if (arg2 < class117.field1821 && arg3 < class244.field4160) {
            class127 var6 = class92.field1424[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1969 != null && var6.field1969.field4919.method670()) {
                arg0.method702(var6.field1969.field4919, 128, 0, 128, true);
            }
        }
        if (arg2 < class117.field1821 && arg3 > 0) {
            class127 var7 = class92.field1424[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1969 != null && var7.field1969.field4919.method670()) {
                arg0.method702(var7.field1969.field4919, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lfh;Lfh;IZZZ)V", line = 402)
    public class283(class110 arg0, class110 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field4793 = arg2;
        this.field4785 = arg0;
        this.field4775 = arg5;
        this.field4783 = arg1;
        class273.method1891(this, this.field4793, 5);
    }

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "(I)V", line = 421)
    public static final void method1954(int arg0) {
        field4789++;
        int var1 = class193.field3136.method439(-21879);
        if (var1 == 0) {
            return;
        }
        class249.field4262.method726(161, 2138389379);
        class116.field1809++;
        class249.field4262.method1095(0, -115);
        if (arg0 < 110) {
            field4781 = (class37) null;
        }
        int var2 = class249.field4262.field2367;
        class69 var3 = (class69) class193.field3136.method447(true);
        int var4 = 0;
        class249.field4262.method1047(111, var3.field919);
        int var5 = var3.field919;
        class69 var6;
        while ((var6 = (class69) class193.field3136.method447(true)) != null) {
            if (var4 < 255 && (var5 + 1) == var6.field919) {
                var4++;
            } else {
                class249.field4262.method1095(var4, -78);
                class249.field4262.method1047(116, var6.field919);
                var4 = 0;
            }
            var5 = var6.field919;
        }
        class249.field4262.method1095(var4, -107);
        class249.field4262.method1063(class249.field4262.field2367 - var2, 13);
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(II)V", line = 467)
    public final void method1653(int arg0, int arg1) {
        field4778++;
        if (arg1 > -89) {
            this.method1952(61, (class110) null, (byte[]) null, false, 19);
        }
        if (this.method1656(arg0, 0)) {
            class218.method1512(this.field4793, arg0, (byte) 57);
        }
    }

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "(I)V", line = 487)
    public static void method1955(int arg0) {
        field4779 = null;
        if (arg0 == 255) {
            field4781 = null;
            field4790 = null;
            field4795 = null;
            field4782 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "(I)I", line = 501)
    public final int method1956(int arg0) {
        field4797++;
        if (this.field4784) {
            return 100;
        } else if (this.field3944 == null) {
            if (arg0 != 128) {
                this.field4777 = 16;
            }
            int var2 = class252.method1722(true, this.field4793, 255);
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        } else {
            return 99;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(IIB)V", line = 530)
    public final void method1957(int arg0, int arg1, byte arg2) {
        field4796++;
        this.field4787 = arg0;
        this.field4791 = arg1;
        if (arg2 <= 52) {
            this.field4791 = -118;
        }
        if (this.field4783 == null) {
            class79.method485(this.field4787, true, this, (byte) 0, this.field4793, 55, 255);
        } else {
            class261.method1820(this, this.field4783, (byte) -88, this.field4793);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ[BIZ)V", line = 561)
    public final void method1958(int arg0, boolean arg1, byte[] arg2, int arg3, boolean arg4) {
        if (arg3 < 46) {
            this.field4787 = -45;
        }
        field4774++;
        if (arg1) {
            if (this.field4784) {
                throw new RuntimeException();
            }
            if (this.field4783 != null) {
                class204.method1425(this.field4783, -2193, this.field4793, arg2);
            }
            this.method1657(-1, arg2);
            this.method1950((byte) 24);
            return;
        }
        arg2[arg2.length - 2] = (byte) (this.field3923[arg0] >> 8);
        arg2[arg2.length - 1] = (byte) this.field3923[arg0];
        if (this.field4785 != null) {
            class204.method1425(this.field4785, -2193, arg0, arg2);
            this.field4798[arg0] = true;
        }
        if (arg4) {
            this.field3944[arg0] = class1.method1(false, false, arg2);
        }
    }
}
