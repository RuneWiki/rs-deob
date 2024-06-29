import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class313 extends class320 {

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "[Loa;")
    public class313[] field4951;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "Z")
    public boolean field4968;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "Z")
    public static boolean field4964 = true;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Lpi;")
    public static class336 field4953 = new class336(new byte[5000]);

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
    public static int field4971 = 0;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public int field4963;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Lek;")
    public class202 field4961;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "Lnd;")
    public class342 field4958;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V", line = 7)
    public final void method2155(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            this.method182(-90);
        }
        field4970++;
        int var4 = this.field4963 == 255 ? arg0 : this.field4963;
        if (this.field4968) {
            this.field4961 = new class202(var4, arg0, arg2);
        } else {
            this.field4958 = new class342(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 30)
    public void method182(int arg0) {
        field4972++;
        if (arg0 != 25833) {
            this.method299(8, 104);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZI)[I", line = 41)
    public final int[] method2156(int arg0, boolean arg1, int arg2) {
        field4965++;
        if (arg1) {
            return this.field4951[arg0].field4968 ? this.field4951[arg0].method111(4, arg2) : this.field4951[arg0].method299(arg2, 2)[0];
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lcg;III)[Lgh;", line = 62)
    public static final class250[] method2157(class49 arg0, int arg1, int arg2, int arg3) {
        field4954++;
        if (class325.method2262(arg3, (byte) 119, arg0, arg2)) {
            return arg1 == -6214 ? class295.method2017(109) : (class250[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V", line = 76)
    public static final void method2158(int arg0) {
        field4952++;
        class4.method21(arg0 - 2190);
        class297.method2023((byte) 124);
        class97.method824(arg0 - 2179);
        class27.method250((byte) -122);
        class210.method1565(0);
        class34.method311((byte) -65);
        class226.method1641((byte) 88);
        class266.method1835(4051);
        class342.method2401(3);
        class57.method507(1);
        class98.method846(4483);
        class195.method1465((byte) 42);
        class338.method2384(8);
        if (arg0 != 2254) {
            return;
        }
        class78.method719(210);
        class222.method1621(0);
        class39.method332(-118);
        class160.method1272((byte) -4);
        class142.method1145(107);
        class346.method2425(-30154);
        class152.method1198((byte) -85);
        class127.field2208.method466(-1);
        class123.field2133.method466(-1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)I", line = 111)
    public int method1725(byte arg0) {
        if (arg0 < 26) {
            return 119;
        } else {
            field4960++;
            return -1;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)[[I", line = 123)
    public int[][] method299(int arg0, int arg1) {
        if (arg1 != 2) {
            this.method2155(9, -42, 55);
        }
        field4955++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)I", line = 135)
    public static final int method2159(int arg0, byte arg1) {
        field4967++;
        if (arg1 != -20) {
            field4971 = -73;
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)[I", line = 162)
    public int[] method111(int arg0, int arg1) {
        field4969++;
        if (arg0 != 4) {
            this.field4968 = true;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILpi;)V", line = 173)
    public void method185(int arg0, int arg1, class336 arg2) {
        field4956++;
        if (arg1 != -17848) {
            this.field4961 = (class202) null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V", line = 184)
    public static void method2160(int arg0) {
        if (arg0 < 126) {
            method2158(32);
        }
        field4953 = null;
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V", line = 194)
    public void method806(int arg0) {
        if (arg0 != 127) {
            return;
        }
        field4962++;
        if (this.field4968) {
            this.field4961.method1521(true);
            this.field4961 = null;
        } else {
            this.field4958.method2405(8098);
            this.field4958 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)I", line = 225)
    public int method807(byte arg0) {
        field4959++;
        if (arg0 != -84) {
            this.method1725((byte) 108);
        }
        return -1;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(III)[[I", line = 239)
    public final int[][] method2161(int arg0, int arg1, int arg2) {
        if (arg1 != 4) {
            return (int[][]) ((int[][]) null);
        }
        field4957++;
        if (!this.field4951[arg0].field4968) {
            return this.field4951[arg0].method299(arg2, 2);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field4951[arg0].method111(4, arg2);
        var4[2] = var5;
        var4[1] = var5;
        var4[0] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZZ)V", line = 279)
    public static final void method2162(boolean arg0, boolean arg1) {
        byte[][] var2;
        byte var3;
        if (class43.field680 && arg0) {
            var2 = class277.field4409;
            var3 = 1;
        } else {
            var2 = class180.field3039;
            var3 = 4;
        }
        field4966++;
        int[] var4 = null;
        for (int var5 = 0; var5 < var3; var5++) {
            class215.method1587(false);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class222.field3700[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = var9 >> 24 & 0x3;
                        if (!arg0 || var10 == 0) {
                            int var11 = var9 >> 1 & 0x3;
                            int var12 = (var9 & 0xFFF955) >> 14;
                            int var13 = (var9 & 0x3FFA) >> 3;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class56.field866.length; var15++) {
                                if (class56.field866[var15] == var14 && var2[var15] != null) {
                                    int[] var16 = class135.method1114(var6 * 8, var5, var11, class163.field2882, var12, -18982, var10, arg0, var2[var15], var13, var7 * 8);
                                    var8 = true;
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class191.method1444(8, var7 * 8, 8, !arg1, var6 * 8, var5);
                    }
                }
            }
        }
        if (var4 == null) {
            class74.field1218 = -1;
        } else {
            class125.field2151 = var4[1];
            class134.field2344 = var4[2];
            class35.field494 = var4[4];
            class257.field4159 = var4[3];
            class74.field1218 = var4[0];
        }
        if (!arg1) {
            method2160(-89);
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IZ)V", line = 384)
    public class313(int arg0, boolean arg1) {
        this.field4951 = new class313[arg0];
        this.field4968 = arg1;
    }
}
