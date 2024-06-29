import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class134 extends class332 {

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public int field1852;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
    public int field1856;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "[[I")
    public int[][] field1842;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "[Z")
    public boolean[] field1857;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "[I")
    public int[] field1845;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "[I")
    public int[] field1841;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field1847 = 0;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "Ldh;")
    public static class179 field1851 = new class179(30);

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "Ljava/lang/String;")
    public static String field1859 = "Loaded input handler";

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "[I")
    public static int[] field1854;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLp;)V", line = 7)
    public static final void method888(boolean arg0, class107 arg1) {
        label90: while (true) {
            if (arg1.field1400 < arg1.field1388.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method661(-1) == 1) {
                    var2 = true;
                    var3 = arg1.method661(-1);
                    var4 = arg1.method661(-1);
                }
                int var5 = arg1.method661(-1);
                int var6 = arg1.method661(-1);
                int var7 = class308.field4766 - (var6 * 64 + 1 - class249.field3771);
                int var8 = var5 * 64 - class239.field3595;
                if (var8 >= 0 && (var7 - 63) >= 0 && var8 + 63 < class291.field4574 && var7 < class308.field4766) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    int var11 = 0;
                    while (true) {
                        if (var11 >= 64) {
                            continue label90;
                        }
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && var11 < (var3 * 8 + 8) && var12 >= var4 * 8 && var4 * 8 + 8 > var12) {
                                byte var13 = arg1.method679(-3);
                                if (var13 != 0) {
                                    if (class181.field2622[var9][var10] == null) {
                                        class181.field2622[var9][var10] = new byte[4096];
                                    }
                                    class181.field2622[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method679(-3);
                                    if (class50.field625[var9][var10] == null) {
                                        class50.field625[var9][var10] = new byte[4096];
                                    }
                                    class50.field625[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                        var11++;
                    }
                }
                int var15 = 0;
                while (true) {
                    if ((var2 ? 64 : 4096) <= var15) {
                        continue label90;
                    }
                    byte var16 = arg1.method679(-3);
                    if (var16 != 0) {
                        arg1.field1400++;
                    }
                    var15++;
                }
            }
            if (arg0) {
                return;
            }
            field1846++;
            return;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V", line = 114)
    public static final void method889(byte arg0) {
        class138.field1931 = true;
        field1855++;
        if (arg0 != 52) {
            field1858 = 9;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)V", line = 130)
    public static final void method890(int arg0, boolean arg1) {
        field1843++;
        byte[][] var2;
        byte var3;
        if (class250.field3787 && arg1) {
            var2 = class230.field3361;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class239.field3574;
        }
        for (int var4 = arg0; var4 < var3; var4++) {
            class239.method1713(31532);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class252.field3836[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x378BEFA) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0x3FFE) >> 3;
                            int var11 = var7 >> 14 & 0x3FF;
                            int var12 = (var11 / 8 << 8) + var10 / 8;
                            for (int var13 = 0; var13 < class120.field1694.length; var13++) {
                                if (class120.field1694[var13] == var12 && var2[var13] != null) {
                                    class256.method1857(arg1, (byte) -14, class149.field2072, var8, var4, (var11 & 0x7) * 8, var2[var13], var9, var6 * 8, var5 * 8, (var10 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V", line = 210)
    public static void method891(byte arg0) {
        field1859 = null;
        if (arg0 == -44) {
            field1854 = null;
            field1851 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Llc;Lfm;Llc;B)V", line = 222)
    public static final void method892(class175 arg0, class52 arg1, class175 arg2, byte arg3) {
        class232.field3380 = arg1;
        int var4 = 120 % ((arg3 - 10) / 44);
        field1848++;
        class292.field4583 = arg0;
        class271.field4266 = arg2;
        if (class271.field4266 != null) {
            class339.field5264 = class271.field4266.method1197(-94, 1);
        }
        if (class292.field4583 != null) {
            class125.field1731 = class292.field4583.method1197(-97, 1);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)V", line = 242)
    public static final void method893(int arg0, int arg1) {
        if (class270.field4254 == arg0 && arg0 != 0) {
            class70 var2 = class275.field4286[arg0];
            var2.method14(class163.field2250);
        }
        field1853++;
        if (arg1 != 16168) {
            field1854 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(I[B)V", line = 269)
    public class134(int arg0, byte[] arg1) {
        this.field1852 = arg0;
        class107 var3 = new class107(arg1);
        this.field1856 = var3.method661(-1);
        this.field1842 = new int[this.field1856][];
        this.field1857 = new boolean[this.field1856];
        this.field1845 = new int[this.field1856];
        this.field1841 = new int[this.field1856];
        for (int var4 = 0; var4 < this.field1856; var4++) {
            this.field1845[var4] = var3.method661(-1);
        }
        for (int var5 = 0; var5 < this.field1856; var5++) {
            this.field1857[var5] = var3.method661(-1) == 1;
        }
        for (int var6 = 0; var6 < this.field1856; var6++) {
            this.field1841[var6] = var3.method624(14612);
        }
        for (int var7 = 0; var7 < this.field1856; var7++) {
            this.field1842[var7] = new int[var3.method661(-1)];
        }
        for (int var8 = 0; var8 < this.field1856; var8++) {
            for (int var9 = 0; var9 < this.field1842[var8].length; var9++) {
                this.field1842[var8][var9] = var3.method661(-1);
            }
        }
    }
}
