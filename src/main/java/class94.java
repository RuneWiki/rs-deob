import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class94 {

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public int field1902 = -1;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "Z")
    public boolean field1904 = false;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "[I")
    private int[] field1905 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Z")
    public static boolean field1890 = false;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "Ljava/util/Random;")
    public static Random field1909 = new Random();

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "Lsg;")
    public static class30 field1910 = class167.method1221((byte) 33, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "[I")
    private int[] field1901;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "[S")
    private short[] field1892;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "[S")
    private short[] field1893;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "[S")
    private short[] field1894;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "[S")
    private short[] field1895;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)V")
    public static final void method760(int arg0, int arg1) {
        field1907++;
        if (arg0 == -1 && !class11.field223) {
            class79.method695((byte) -54);
        } else if (arg0 != -1 && (class102.field2072 != arg0 || !class252.method1759((byte) 102)) && class246.field4382 != 0 && !class11.field223) {
            class150.method1087(2, false, class246.field4382, 0, arg0, class139.field2713, 1);
        }
        class102.field2072 = arg0;
        if (arg1 < 118) {
            field1910 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method761(int arg0) {
        field1910 = null;
        field1909 = null;
        if (arg0 != -13028) {
            method761(-61);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILaa;)V")
    public final void method762(int arg0, class8 arg1) {
        while (true) {
            int var3 = arg1.method63((byte) 122);
            if (var3 == 0) {
                int var4 = -81 % ((arg0 - 59) / 38);
                field1899++;
                return;
            }
            this.method767(var3, arg1, (byte) -104);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)Lmg;")
    public final class128 method763(byte arg0) {
        field1903++;
        if (this.field1901 == null) {
            return null;
        }
        class128[] var2 = new class128[this.field1901.length];
        if (arg0 <= 109) {
            field1910 = null;
        }
        for (int var3 = 0; var3 < this.field1901.length; var3++) {
            var2[var3] = class128.method969(class21.field390, this.field1901[var3], 0);
        }
        class128 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class128(var2, var2.length);
        }
        if (this.field1895 != null) {
            for (int var5 = 0; var5 < this.field1895.length; var5++) {
                var4.method961(this.field1895[var5], this.field1893[var5]);
            }
        }
        if (this.field1892 != null) {
            for (int var6 = 0; var6 < this.field1892.length; var6++) {
                var4.method966(this.field1892[var6], this.field1894[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)Lmg;")
    public final class128 method764(int arg0) {
        field1891++;
        class128[] var2 = new class128[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1905[var4] != -1) {
                var2[var3++] = class128.method969(class21.field390, this.field1905[var4], 0);
            }
        }
        if (arg0 < 40) {
            field1909 = null;
        }
        class128 var5 = new class128(var2, var3);
        if (this.field1895 != null) {
            for (int var6 = 0; var6 < this.field1895.length; var6++) {
                var5.method961(this.field1895[var6], this.field1893[var6]);
            }
        }
        if (this.field1892 != null) {
            for (int var7 = 0; var7 < this.field1892.length; var7++) {
                var5.method966(this.field1892[var7], this.field1894[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)Z")
    public final boolean method765(int arg0) {
        field1896++;
        if (this.field1901 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field1901.length; var3++) {
            if (!class21.field390.method1100(0, this.field1901[var3], (byte) 78)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILdl;I)V")
    public static final void method766(int arg0, int arg1, class31 arg2, int arg3) {
        field1897++;
        if (arg2.field666 == 1) {
            class100.field2044++;
            class31.method311(0, 0L, class55.field1203, arg2.field675, (short) 39, arg3 ^ 0xFFFFFE13, arg2.field638);
        }
        if (arg2.field666 == 2 && !class175.field3258) {
            class30 var4 = class185.method1331((byte) -120, arg2);
            if (var4 != null) {
                class31.method311(-1, 0L, class160.method1188(new class30[] { class231.field4099, arg2.field740 }, 0), var4, (short) 30, -501, arg2.field638);
                class23.field438++;
            }
        }
        if (arg2.field666 == 3) {
            class256.field4520++;
            class31.method311(0, 0L, class55.field1203, class28.field521, (short) 21, arg3 - 525, arg2.field638);
        }
        if (arg2.field666 == 4) {
            class220.field3967++;
            class31.method311(0, 0L, class55.field1203, arg2.field675, (short) 42, -501, arg2.field638);
        }
        if (arg2.field666 == 5) {
            class73.field1646++;
            class31.method311(0, 0L, class55.field1203, arg2.field675, (short) 26, -501, arg2.field638);
        }
        if (arg3 != 24) {
            method760(-58, 30);
        }
        if (arg2.field666 == 6 && class263.field4661 == null) {
            class177.field3283++;
            class31.method311(-1, 0L, class55.field1203, arg2.field675, (short) 36, -501, arg2.field638);
        }
        if (arg2.field655 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field682; var6++) {
                for (int var7 = 0; var7 < arg2.field660; var7++) {
                    int var8 = (arg2.field782 + 32) * var7;
                    int var9 = (arg2.field771 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg2.field650[var5];
                        var9 += arg2.field767[var5];
                    }
                    if (arg0 >= var8 && var9 <= arg1 && arg0 < var8 + 32 && arg1 < var9 + 32) {
                        class21.field383 = var5;
                        class78.field1695 = arg2;
                        if (arg2.field806[var5] > 0) {
                            class168 var10 = class201.method1425(103, arg2.field806[var5] - 1);
                            if (class132.field2607 == 1 && class203.method1437(-86, client.method1498(arg2))) {
                                if (class174.field3253 != arg2.field638 || class236.field4225 != var5) {
                                    class253.field4468++;
                                    class31.method311(var5, (long) var10.field3166, class160.method1188(new class30[] { class173.field3234, class80.field1721, var10.field3162 }, 0), class163.field3031, (short) 19, -501, arg2.field638);
                                }
                            } else if (!class175.field3258 || !class203.method1437(-59, client.method1498(arg2))) {
                                class209.field3763++;
                                class30[] var11 = var10.field3090;
                                if (class179.field3318) {
                                    var11 = class263.method1816((byte) 7, var11);
                                }
                                if (class203.method1437(-95, client.method1498(arg2))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class68.field1480++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 58;
                                            } else {
                                                var13 = 25;
                                            }
                                            class31.method311(var5, (long) var10.field3166, class160.method1188(new class30[] { class104.field2098, var10.field3162 }, 0), var11[var12], var13, arg3 ^ 0xFFFFFE13, arg2.field638);
                                        } else if (var12 == 4) {
                                            class227.field4062++;
                                            class31.method311(var5, (long) var10.field3166, class160.method1188(new class30[] { class104.field2098, var10.field3162 }, 0), class238.field4244, (short) 25, arg3 ^ 0xFFFFFE13, arg2.field638);
                                        }
                                    }
                                }
                                if (class60.method551((byte) 6, client.method1498(arg2))) {
                                    class168.field3136++;
                                    class31.method311(var5, (long) var10.field3166, class160.method1188(new class30[] { class104.field2098, var10.field3162 }, 0), class163.field3031, (short) 49, -501, arg2.field638);
                                }
                                if (class203.method1437(-124, client.method1498(arg2)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class221.field3986++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 38;
                                            }
                                            if (var14 == 1) {
                                                var15 = 16;
                                            }
                                            if (var14 == 2) {
                                                var15 = 7;
                                            }
                                            class31.method311(var5, (long) var10.field3166, class160.method1188(new class30[] { class104.field2098, var10.field3162 }, 0), var11[var14], var15, -501, arg2.field638);
                                        }
                                    }
                                }
                                class30[] var16 = arg2.field679;
                                if (class179.field3318) {
                                    var16 = class263.method1816((byte) 7, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class277.field4829++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 1;
                                            }
                                            if (var17 == 1) {
                                                var18 = 10;
                                            }
                                            if (var17 == 2) {
                                                var18 = 11;
                                            }
                                            if (var17 == 3) {
                                                var18 = 5;
                                            }
                                            if (var17 == 4) {
                                                var18 = 31;
                                            }
                                            class31.method311(var5, (long) var10.field3166, class160.method1188(new class30[] { class104.field2098, var10.field3162 }, 0), var16[var17], var18, -501, arg2.field638);
                                        }
                                    }
                                }
                                class31.method311(var5, (long) var10.field3166, class160.method1188(new class30[] { class104.field2098, var10.field3162 }, 0), class179.field3319, (short) 1003, arg3 ^ 0xFFFFFE13, arg2.field638);
                            } else if ((class195.field3514 & 0x10) == 16) {
                                class166.field3058++;
                                class31.method311(var5, (long) var10.field3166, class160.method1188(new class30[] { class246.field4384, class80.field1721, var10.field3162 }, 0), class93.field1867, (short) 24, -501, arg2.field638);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field671) {
            return;
        }
        if (!class175.field3258) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class30 var23 = class212.method1511((byte) 6, arg2, var19);
                if (var23 != null) {
                    class127.field2480++;
                    class31.method311(arg2.field716, (long) (var19 + 1), arg2.field692, var23, (short) 1005, -501, arg2.field638);
                }
            }
            class30 var20 = class185.method1331((byte) -111, arg2);
            if (var20 != null) {
                class23.field438++;
                class31.method311(arg2.field716, 0L, arg2.field692, var20, (short) 30, -501, arg2.field638);
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class30 var22 = class212.method1511((byte) -115, arg2, var21);
                if (var22 != null) {
                    class127.field2480++;
                    class31.method311(arg2.field716, (long) (var21 + 1), arg2.field692, var22, (short) 44, -501, arg2.field638);
                }
            }
            if (!class172.method1263(1, client.method1498(arg2))) {
                return;
            }
            class177.field3283++;
            class31.method311(arg2.field716, 0L, class55.field1203, class25.field473, (short) 36, arg3 ^ 0xFFFFFE13, arg2.field638);
        } else if (class14.method145(arg3 - 78, client.method1498(arg2)) && (class195.field3514 & 0x20) == 32) {
            class31.method311(arg2.field716, 0L, class160.method1188(new class30[] { class246.field4384, class11.field205, arg2.field692 }, 0), class93.field1867, (short) 45, arg3 - 525, arg2.field638);
            class252.field4455++;
            return;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILaa;B)V")
    private final void method767(int arg0, class8 arg1, byte arg2) {
        if (arg2 > -51) {
            return;
        }
        if (arg0 == 1) {
            this.field1902 = arg1.method63((byte) 111);
        } else if (arg0 == 2) {
            int var8 = arg1.method63((byte) 91);
            this.field1901 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1901[var9] = arg1.method65((byte) 115);
            }
        } else if (arg0 == 3) {
            this.field1904 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method63((byte) 98);
            this.field1893 = new short[var6];
            this.field1895 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1895[var7] = (short) arg1.method65((byte) 114);
                this.field1893[var7] = (short) arg1.method65((byte) 116);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method63((byte) 105);
            this.field1894 = new short[var4];
            this.field1892 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1892[var5] = (short) arg1.method65((byte) 125);
                this.field1894[var5] = (short) arg1.method65((byte) 109);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field1905[arg0 - 60] = arg1.method65((byte) 125);
        }
        field1908++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
    public static final Object method768(boolean arg0, int arg1, byte[] arg2) {
        field1898++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class17.field347) {
            try {
                class246 var3 = (class246) Class.forName("rb").getDeclaredConstructor().newInstance();
                var3.method1321(arg2, (byte) 126);
                return var3;
            } catch (Throwable var4) {
                class17.field347 = true;
            }
        }
        if (arg1 != 0) {
            field1909 = null;
        }
        return arg0 ? class159.method1183(true, arg2) : arg2;
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)Z")
    public final boolean method769(int arg0) {
        field1906++;
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field1905[var3] != -1 && !class21.field390.method1100(0, this.field1905[var3], (byte) 107)) {
                var2 = false;
            }
        }
        return var2;
    }
}
