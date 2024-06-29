import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class303 extends class209 {

    @OriginalMember(owner = "client!p", name = "F", descriptor = "I")
    public int field4865 = 12800;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "I")
    public int field4862 = -1;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "I")
    public int field4863 = 0;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "I")
    public int field4864 = 12800;

    @OriginalMember(owner = "client!p", name = "L", descriptor = "I")
    public int field4871 = 0;

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "Z")
    public boolean field4884 = true;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "I")
    public int field4881 = -1;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "Ljava/lang/String;")
    public String field4877;

    @OriginalMember(owner = "client!p", name = "B", descriptor = "I")
    public int field4861;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "Ljava/lang/String;")
    public String field4874;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "I")
    public int field4875;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "Lud;")
    public class2 field4866;

    @OriginalMember(owner = "client!p", name = "I", descriptor = "[I")
    public static int[] field4868 = new int[50];

    @OriginalMember(owner = "client!p", name = "H", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!p", name = "J", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!p", name = "ab", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "[[[I")
    public static int[][][] field4876;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
    public static final void method2026(boolean arg0) {
        field4867++;
        for (class288 var1 = (class288) class48.field787.method2049(0); var1 != null; var1 = (class288) class48.field787.method2047(-114)) {
            int var2 = var1.field4505;
            if (class48.method401(104, var2)) {
                boolean var3 = true;
                class222[] var4 = class8.field144[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field3441;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2009;
                    class222 var7 = class169.method1217(var6, 12180);
                    if (var7 != null) {
                        class80.method628((byte) -85, var7);
                    }
                }
            }
        }
        if (arg0) {
            method2031((byte) -57, (class31) null);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIB)V")
    public static final void method2027(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class184.field2914 = arg3;
        class112.field1727 = arg2;
        class2.field42 = arg1;
        class278.field4410 = arg0;
        field4878++;
        int var5 = 61 % ((arg4 + 68) / 32);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IBI)[I")
    public final int[] method2028(int arg0, byte arg1, int arg2) {
        field4882++;
        for (class15 var4 = (class15) this.field4866.method6(-123); var4 != null; var4 = (class15) this.field4866.method11((byte) 100)) {
            if (var4.method124(arg2, arg0, 52)) {
                return var4.method123(99, arg0, arg2);
            }
        }
        if (arg1 != -24) {
            method2032(-52);
        }
        return null;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(III)[I")
    public final int[] method2029(int arg0, int arg1, int arg2) {
        field4869++;
        if (arg0 != 0) {
            return null;
        }
        for (class15 var4 = (class15) this.field4866.method6(-124); var4 != null; var4 = (class15) this.field4866.method11((byte) 35)) {
            if (var4.method119(-19380, arg1, arg2)) {
                return var4.method121(arg2, (byte) -76, arg1);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(III)V")
    public static final void method2030(int arg0, int arg1, int arg2) {
        if (class176.field2716 > 0) {
            class130.method961(arg1 - 65280, class176.field2716);
            class176.field2716 = 0;
        }
        short var3 = 256;
        field4873++;
        int var4 = 0;
        int var5 = class66.field1036 * arg2;
        int var6 = 0;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class83.field1252[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class5.field78[var4++];
                int var12 = class66.field1032[arg0 + var5++];
                if (var11 == 0) {
                    class133.field1990.field822[var6++] = var12;
                } else {
                    int var13 = var11 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = 256 - var11 - 18;
                    int var15 = class23.field389[var11];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class133.field1990.field822[var6++] = class118.method863(var13 * class118.method863(var15, 16711935) + var14 * class118.method863(var12, 16711935), -16711936) + class118.method863(16711680, class118.method863(65280, var12) * var14 + var13 * class118.method863(65280, var15)) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class133.field1990.field822[var6++] = class66.field1032[arg0 + (var5++)];
            }
            var5 += class66.field1036 - 128;
        }
        class133.field1990.method441(arg0, arg2);
        if (arg1 != 65280) {
            method2030(123, 67, 40);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLha;)V")
    public static final void method2031(byte arg0, class31 arg1) {
        field4879++;
        int var2 = -55 / ((58 - arg0) / 43);
        while (true) {
            while (arg1.field560.length > arg1.field541) {
                int var3 = 0;
                boolean var4 = false;
                int var5 = 0;
                if (arg1.method265(-122) == 1) {
                    var4 = true;
                    var5 = arg1.method265(-91);
                    var3 = arg1.method265(-85);
                }
                int var6 = arg1.method265(-124);
                int var7 = arg1.method265(-127);
                int var8 = class92.field1475 + class141.field2107 - (var7 * 64) - 1;
                int var9 = var6 * 64 - class147.field2165;
                if (var9 >= 0 && var8 - 63 >= 0 && class152.field2247 > var9 + 63 && class92.field1475 > var8) {
                    int var10 = var9 >> 6;
                    int var11 = var8 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var4 || var12 >= (var5 * 8) && var12 < var5 * 8 + 8 && var13 >= var3 * 8 && var3 * 8 + 8 > var13) {
                                int var14 = arg1.method265(-109);
                                if (var14 != 0) {
                                    if ((var14 & 0x1) == 1) {
                                        int var15 = arg1.method265(-95);
                                        if (class276.field4396[var10][var11] == null) {
                                            class276.field4396[var10][var11] = new byte[4096];
                                        }
                                        class276.field4396[var10][var11][(63 - var13 << 6) + var12] = (byte) var15;
                                    }
                                    if ((var14 & 0x2) == 2) {
                                        int var16 = arg1.method304((byte) 84);
                                        if (class36.field622[var10][var11] == null) {
                                            class36.field622[var10][var11] = new int[4096];
                                        }
                                        class36.field622[var10][var11][(63 - var13 << 6) + var12] = var16;
                                    }
                                    if ((var14 & 0x4) == 4) {
                                        int var17 = arg1.method304((byte) 84);
                                        if (class156.field2323[var10][var11] == null) {
                                            class156.field2323[var10][var11] = new int[4096];
                                        }
                                        var17--;
                                        class295 var18 = class166.method1209(-77, var17);
                                        if (var18.field4598 != null) {
                                            var18 = var18.method1956(25748);
                                            if (var18 == null || var18.field4587 == -1) {
                                                continue;
                                            }
                                        }
                                        class156.field2323[var10][var11][(63 - var13 << 6) + var12] = var18.field4584 + 1;
                                        class135 var19 = new class135();
                                        var19.field2020 = var18.field4587;
                                        var19.field2024 = var9;
                                        var19.field2023 = var8;
                                        class176.field2708.method12(var19, 12);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var20 = 0; var20 < (var4 ? 64 : 4096); var20++) {
                        int var21 = arg1.method265(-127);
                        if (var21 != 0) {
                            if ((var21 & 0x1) == 1) {
                                arg1.field541++;
                            }
                            if ((var21 & 0x2) == 2) {
                                arg1.field541 += 2;
                            }
                            if ((var21 & 0x4) == 4) {
                                arg1.field541 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V")
    public static void method2032(int arg0) {
        field4876 = null;
        if (arg0 == 18) {
            field4868 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)[I")
    public final int[] method2033(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            this.field4861 = -118;
        }
        field4885++;
        for (class15 var5 = (class15) this.field4866.method6(-126); var5 != null; var5 = (class15) this.field4866.method11((byte) 107)) {
            if (var5.method118(arg0, true, arg2, arg3)) {
                return var5.method121(arg0, (byte) -76, arg2);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZII)Z")
    public final boolean method2034(boolean arg0, int arg1, int arg2) {
        field4872++;
        for (class15 var4 = (class15) this.field4866.method6(-115); var4 != null; var4 = (class15) this.field4866.method11((byte) 56)) {
            if (var4.method119(-19380, arg2, arg1)) {
                return true;
            }
        }
        if (arg0) {
            this.method2033(-38, -105, 27, -1);
        }
        return false;
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
    public final void method2035(int arg0) {
        field4880++;
        this.field4863 = 0;
        int var2 = 102 / ((arg0 + 42) / 44);
        this.field4864 = 12800;
        this.field4871 = 0;
        this.field4865 = 12800;
        for (class15 var3 = (class15) this.field4866.method6(-116); var3 != null; var3 = (class15) this.field4866.method11((byte) 71)) {
            if (this.field4871 < var3.field201) {
                this.field4871 = var3.field201;
            }
            if (this.field4863 < var3.field206) {
                this.field4863 = var3.field206;
            }
            if (this.field4864 > var3.field185) {
                this.field4864 = var3.field185;
            }
            if (var3.field193 < this.field4865) {
                this.field4865 = var3.field193;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    public class303(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field4877 = arg1;
        this.field4861 = arg0;
        this.field4862 = arg6;
        if (this.field4862 == 255) {
            this.field4862 = 0;
        }
        this.field4874 = arg2;
        this.field4881 = arg4;
        this.field4875 = arg3;
        this.field4884 = arg5;
        this.field4866 = new class2();
    }
}
