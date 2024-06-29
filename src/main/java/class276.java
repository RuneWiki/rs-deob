import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class276 extends class181 {

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "Z")
    public boolean field4885 = false;

    @OriginalMember(owner = "client!dg", name = "cb", descriptor = "Lfg;")
    private class180 field4903;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "Z")
    private boolean field4897;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "Z")
    private boolean field4896;

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "I")
    private int field4899;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
    private int field4892;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "Lli;")
    public static class185 field4886 = class245.method1649("d-Broulement:", -119);

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
    public static int field4884 = 0;

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "[I")
    public static int[] field4901 = new int[2];

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "Lwd;")
    public static class65 field4883 = new class65();

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "F")
    private float field4889;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!dg", name = "bb", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "Lhl;")
    public static class54 field4894;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dg", name = "db", descriptor = "Ljava/lang/Class;")
    public static Class field4904;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "[I")
    private int[] field4888;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lhi;IFLw;Z)[I")
    public final int[] method1885(class250 arg0, int arg1, float arg2, class230 arg3, boolean arg4) {
        int var6 = -85 % ((41 - arg1) / 40);
        field4900++;
        if (this.field4888 == null || this.field4889 != arg2) {
            if (!this.field4903.method1270(arg3, (byte) -76, arg0)) {
                return null;
            }
            int var7 = arg4 ? 64 : 128;
            this.field4888 = this.field4903.method1274(true, var7, arg3, this.field4896, (double) arg2, arg0, var7, (byte) 67);
            this.field4889 = arg2;
            if (this.field4897) {
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                int[] var11 = new int[var7 * var7];
                int var13 = var7;
                int var14 = var7 * var7;
                int var15 = var7 - 1;
                int var16 = var7;
                int var17 = var7;
                int var18 = var7 - 1;
                for (int var19 = 2; var19 >= 0; var19--) {
                    for (int var35 = var18; var35 >= 0; var35--) {
                        var16--;
                        int var36 = this.field4888[var16];
                        var8[var35] += class220.method1526(255, var36 >> 16);
                        var9[var35] += class220.method1526(65437, var36) >> 8;
                        var10[var35] += class220.method1526(var36, 255);
                    }
                    if (var16 == 0) {
                        var16 = var14;
                    }
                }
                int var20 = var14;
                for (int var21 = var15; var21 >= 0; var21--) {
                    int var22 = 1;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 1;
                    for (int var27 = 2; var27 >= 0; var27--) {
                        var26--;
                        var25 += var8[var26];
                        var23 += var9[var26];
                        var24 += var10[var26];
                        if (var26 == 0) {
                            var26 = var13;
                        }
                    }
                    for (int var28 = var18; var28 >= 0; var28--) {
                        int var32 = var24 / 9;
                        int var33 = var25 / 9;
                        int var34 = var23 / 9;
                        var26--;
                        var20--;
                        var11[var20] = class21.method150(class21.method150(var34 << 8, var33 << 16), var32);
                        var22--;
                        var23 += var9[var26] - var9[var22];
                        var25 += var8[var26] - var8[var22];
                        var24 += var10[var26] - var10[var22];
                        if (var26 == 0) {
                            var26 = var13;
                        }
                        if (var22 == 0) {
                            var22 = var13;
                        }
                    }
                    for (int var29 = var18; var29 >= 0; var29--) {
                        var16--;
                        int var30 = this.field4888[var16];
                        var17--;
                        int var31 = this.field4888[var17];
                        var8[var29] += (class220.method1526(16774928, var30) >> 16) - class220.method1526(var31 >> 16, 255);
                        var9[var29] += class220.method1526(var30 >> 8, 255) - (class220.method1526(var31, 65445) >> 8);
                        var10[var29] += -class220.method1526(var31, 255) + class220.method1526(var30, 255);
                    }
                    if (var17 == 0) {
                        var17 = var14;
                    }
                    if (var16 == 0) {
                        var16 = var14;
                    }
                }
                this.field4888 = var11;
            }
        }
        return this.field4888;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BLhi;Lw;)Z")
    public final boolean method1886(byte arg0, class250 arg1, class230 arg2) {
        field4887++;
        if (arg0 != 113) {
            this.method1886((byte) 98, (class250) null, (class230) null);
        }
        return this.field4903.method1270(arg2, (byte) -91, arg1);
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)V")
    public static final void method1887(int arg0) {
        field4891++;
        try {
            if (arg0 == 15141) {
                Method var1 = (field4904 == null ? (field4904 = method1894("java.lang.Runtime")) : field4904).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class94.field1794 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!dg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field4895++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
    public final void method1888(int arg0, int arg1) {
        field4902++;
        if (arg0 != 1) {
            this.field4892 = -33;
        }
        if (this.field4888 == null || this.field4892 == 0 && this.field4899 == 0) {
            return;
        }
        if (class259.field4604 == null || class259.field4604.length < this.field4888.length) {
            class259.field4604 = new int[this.field4888.length];
        }
        int var3 = this.field4888.length == 4096 ? 64 : 128;
        int var4 = this.field4888.length;
        int var5 = var3 - 1;
        int var6 = arg1 * var3 * this.field4892;
        int var7 = this.field4899 * arg1;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var4; var9 += var3) {
            int var11 = var6 + var9 & var8;
            for (int var12 = 0; var12 < var3; var12++) {
                int var13 = var9 + var12;
                int var14 = (var7 + var12 & var5) + var11;
                class259.field4604[var13] = this.field4888[var14];
            }
        }
        int[] var10 = this.field4888;
        this.field4888 = class259.field4604;
        class259.field4604 = var10;
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V")
    public static final void method1889(int arg0) {
        for (int var1 = -1; var1 < class17.field281; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class174.field3187[var1];
            }
            class188 var3 = class93.field1774[var2];
            if (var3 != null) {
                class19.method132(var3.method1014(-1), var3, -80);
            }
        }
        if (arg0 != 5) {
            field4894 = null;
        }
        field4890++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)V")
    public static final void method1890(int arg0, int arg1, int arg2, int arg3) {
        class198 var4 = class153.field2896[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class38 var5 = var4.field3636;
        if (var5 != null) {
            var5.field609 = var5.field609 * arg3 / 16;
            var5.field603 = var5.field603 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(Z)V")
    public static void method1891(boolean arg0) {
        field4901 = null;
        field4883 = null;
        if (!arg0) {
            field4883 = null;
        }
        field4886 = null;
        field4894 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)V")
    public static final void method1892(byte arg0, int arg1) {
        field4893++;
        if (class80.field1399 == arg1) {
            return;
        }
        if (class80.field1399 == 0) {
            class118.method863(true);
        }
        if (arg1 == 40) {
            class223.method1548(8);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 != 40 && class238.field4246 != null) {
            class238.field4246.method994((byte) -102);
            class238.field4246 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class181.field3317 = 0;
            class18.field298 = 0;
            class72.field1265 = 1;
            class148.field2808 = 0;
            class250.field4435 = 1;
            class225.method1558(false, true);
        }
        if (arg0 >= -111) {
            field4884 = 107;
        }
        if (arg1 == 25 || arg1 == 10) {
            class278.method1906(-3);
        }
        if (arg1 == 5) {
            class271.method1857(class21.field365, (byte) 119);
        } else {
            class255.method1726((byte) -111);
        }
        boolean var3 = class80.field1399 == 5 || class80.field1399 == 10 || class80.field1399 == 28;
        if (var2 != var3) {
            if (var2) {
                class38.field607 = class58.field1027;
                if (class193.field3568 == 0) {
                    class243.method1641(2, -6451);
                } else {
                    class212.method1485(class58.field1027, false, 255, 2, class181.field3325, 0, false);
                }
                class14.field240.method1654(4, false);
            } else {
                class243.method1641(2, -6451);
                class14.field240.method1654(4, true);
            }
        }
        class80.field1399 = arg1;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZLhi;Lw;B)[I")
    public final int[] method1893(boolean arg0, class250 arg1, class230 arg2, byte arg3) {
        field4898++;
        if (this.field4903.method1270(arg2, (byte) -98, arg1)) {
            int var5 = arg0 ? 64 : 128;
            return arg3 >= -20 ? null : this.field4903.method1274(false, var5, arg2, this.field4896, 1.0D, arg1, var5, (byte) 113);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Ljd;)V")
    public class276(class118 arg0) {
        this.field4903 = new class180(arg0);
        this.field4897 = arg0.method867(false) == 1;
        this.field4896 = arg0.method867(false) == 1;
        arg0.method867(false);
        arg0.method867(false);
        int var2 = arg0.method867(false) & 0x3;
        this.field4899 = arg0.method838(1275919136);
        this.field4892 = arg0.method838(1275919136);
        arg0.method867(false);
        arg0.method867(false);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1894(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
