import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class372 extends class224 {

    @OriginalMember(owner = "client!om", name = "K", descriptor = "Z")
    public boolean field5225 = true;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!om", name = "O", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "Leq;")
    public static class209 field5214;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "Lwj;")
    public static class392 field5224;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "Lfk;")
    public class650 field5212;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "[I")
    public int[] field5216;

    @OriginalMember(owner = "client!om", name = "D", descriptor = "[I")
    private int[] field5218;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "[Ljava/lang/String;")
    private String[] field5227;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "[[I")
    private int[][] field5228;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IZZ)V", line = 9)
    public static final void method2334(int arg0, boolean arg1, boolean arg2) {
        if (arg0 != 0) {
            method2334(82, false, true);
        }
        if (arg2) {
            class605.field8785--;
            if (class605.field8785 == 0) {
                class412.field5695 = null;
            }
        }
        field5219++;
        if (!arg1) {
            return;
        }
        class679.field9574--;
        if (class679.field9574 == 0) {
            class428.field5989 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V", line = 38)
    public static void method2335(byte arg0) {
        field5214 = null;
        if (arg0 >= -106) {
            method2334(88, true, true);
        }
        field5224 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([ILud;B)V", line = 50)
    public final void method2336(int[] arg0, class35 arg1, byte arg2) {
        field5226++;
        if (this.field5218 == null) {
            return;
        }
        int var4 = 0;
        if (arg2 != -117) {
            return;
        }
        while (var4 < this.field5218.length) {
            if (arg0.length <= var4) {
                return;
            }
            int var5 = this.method2343(arg2 + 219, var4).field1841;
            if (var5 > 0) {
                arg1.method268((long) arg0[var4], arg2 + 116, var5);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(Lud;I)V", line = 76)
    public final void method2337(class35 arg0, int arg1) {
        if (arg1 != 0) {
            this.method2341((byte) 28);
        }
        field5220++;
        while (true) {
            int var3 = arg0.method273(255);
            if (var3 == 0) {
                return;
            }
            this.method2346(-107, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(B)Ljava/lang/String;", line = 99)
    public final String method2338(byte arg0) {
        field5230++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field5227 == null) {
            return "";
        }
        var2.append(this.field5227[0]);
        if (arg0 >= 0) {
            this.field5216 = null;
        }
        for (int var3 = 1; var3 < this.field5227.length; var3++) {
            var2.append("...");
            var2.append(this.field5227[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V", line = 128)
    public final void method2339(boolean arg0) {
        if (!arg0) {
            this.field5218 = null;
        }
        field5217++;
        if (this.field5216 != null) {
            for (int var2 = 0; var2 < this.field5216.length; var2++) {
                this.field5216[var2] = class164.method1221(this.field5216[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 153)
    public static final void method2340(int arg0) {
        class583.field8235.method3050(false);
        int var1 = 22 % ((arg0 - 35) / 41);
        field5223++;
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(B)I", line = 164)
    public final int method2341(byte arg0) {
        field5229++;
        if (this.field5218 == null) {
            return 0;
        } else {
            int var2 = -39 % ((-arg0 - 7) / 58);
            return this.field5218.length;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "()V", line = 178)
    public static final void method2342() {
        if (class25.field323 != null) {
            for (int var0 = 0; var0 < class25.field323.length; var0++) {
                for (int var1 = 0; var1 < class613.field8871; var1++) {
                    for (int var2 = 0; var2 < class453.field6328; var2++) {
                        if (class25.field323[var0][var1][var2] != null) {
                            class25.field323[var0][var1][var2].method2535(24358);
                        }
                        class25.field323[var0][var1][var2] = null;
                    }
                }
            }
        }
        class25.field323 = null;
        class173.field2511 = null;
        if (class421.field5916 != null) {
            for (int var3 = 0; var3 < class421.field5916.length; var3++) {
                for (int var4 = 0; var4 < class613.field8871; var4++) {
                    for (int var5 = 0; var5 < class453.field6328; var5++) {
                        if (class421.field5916[var3][var4][var5] != null) {
                            class421.field5916[var3][var4][var5].method2535(24358);
                        }
                        class421.field5916[var3][var4][var5] = null;
                    }
                }
            }
        }
        class421.field5916 = null;
        class4.field56 = null;
        class390.field5454 = null;
        class138.field2153 = null;
        class533.field7539 = null;
        class462.field6655 = null;
        class311.field4385 = null;
        class705.field9867 = null;
        class256.field3708 = null;
        class153.method1171((byte) -76);
        if (class120.field1870 != null) {
            for (int var6 = 0; var6 < class586.field8252; var6++) {
                class120.field1870[var6] = null;
            }
            class586.field8252 = 0;
        }
        if (class307.field4351 != null) {
            for (int var7 = 0; var7 < class189.field2729[0]; var7++) {
                class307.field4351[0][var7] = null;
            }
            for (int var8 = 0; var8 < class189.field2729[1]; var8++) {
                class307.field4351[1][var8] = null;
            }
            class189.field2729 = new int[2];
        }
        if (class319.field4524 != null) {
            for (int var9 = 0; var9 < class444.field6176[0]; var9++) {
                class319.field4524[0][var9] = null;
            }
            for (int var10 = 0; var10 < class444.field6176[1]; var10++) {
                class319.field4524[1][var10] = null;
            }
            class444.field6176 = new int[2];
        }
        if (class598.field8718 != null) {
            for (int var11 = 0; var11 < class579.field8176[0]; var11++) {
                class598.field8718[0][var11] = null;
            }
            for (int var12 = 0; var12 < class579.field8176[1]; var12++) {
                class598.field8718[1][var12] = null;
            }
            class579.field8176 = new int[2];
        }
        if (class435.field6082 != null) {
            for (int var13 = 0; var13 < class435.field6082.length; var13++) {
                class435.field6082[var13] = null;
            }
            class431.field6032 = 0;
        }
        if (class706.field9897 != null) {
            for (int var14 = 0; var14 < class706.field9897.length; var14++) {
                class706.field9897[var14] = null;
            }
            class237.field3355 = 0;
        }
        if (class502.field7171 != null) {
            for (int var15 = 0; var15 < class153.field2298; var15++) {
                class502.field7171[var15] = null;
            }
            for (int var16 = 0; var16 < class749.field10470; var16++) {
                for (int var17 = 0; var17 < class613.field8871; var17++) {
                    for (int var18 = 0; var18 < class453.field6328; var18++) {
                        class577.field8165[var16][var17][var18] = 0L;
                    }
                }
            }
            class153.field2298 = 0;
        }
        class537.method3145(true);
        class62.field1128 = class62.field1125;
        class62.field1128.method3128(-2);
        class128.field1929 = null;
        class478.field6819 = null;
        class494.field7042 = null;
        if (class253.field3660 != null) {
            class28.method202();
            class497.field7089.method591(1);
            class497.field7089.method527(0);
        }
        if (class497.field7092 != null) {
            class497.field7092 = null;
        }
        class497.field7089 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Lqca;", line = 405)
    public final class115 method2343(int arg0, int arg1) {
        field5213++;
        if (arg0 < 65) {
            this.field5216 = null;
        }
        return this.field5218 == null || arg1 < 0 || arg1 > this.field5218.length ? null : class165.method1228(this.field5218[arg1], true);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIZ)I", line = 422)
    public final int method2344(int arg0, int arg1, boolean arg2) {
        field5215++;
        if (!arg2) {
            return -84;
        } else if (this.field5218 == null || arg1 < 0 || this.field5218.length < arg1) {
            return -1;
        } else if (this.field5228[arg1] == null || arg0 < 0 || this.field5228[arg1].length < arg0) {
            return -1;
        } else {
            return this.field5228[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILud;)Ljava/lang/String;", line = 445)
    public final String method2345(int arg0, class35 arg1) {
        field5222++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field5218 != null) {
            for (int var4 = 0; var4 < this.field5218.length; var4++) {
                var3.append(this.field5227[var4]);
                var3.append(this.field5212.method3678(arg1.method276(class165.method1228(this.field5218[var4], true).field1837, -128), 1, this.field5228[var4], this.method2343(118, var4)));
            }
        }
        int var5 = -110 % ((29 - arg0) / 35);
        var3.append(this.field5227[this.field5227.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IILud;)V", line = 473)
    private final void method2346(int arg0, int arg1, class35 arg2) {
        if (arg1 == 1) {
            this.field5227 = class327.method2091('<', 26911, arg2.method272(2));
        } else if (arg1 == 2) {
            int var9 = arg2.method273(255);
            this.field5216 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field5216[var10] = arg2.method253(-13900);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method273(255);
            this.field5218 = new int[var4];
            this.field5228 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method253(-13900);
                class115 var7 = class165.method1228(var6, true);
                if (var7 != null) {
                    this.field5218[var5] = var6;
                    this.field5228[var5] = new int[var7.field1838];
                    for (int var8 = 0; var8 < var7.field1838; var8++) {
                        this.field5228[var5][var8] = arg2.method253(-13900);
                    }
                }
            }
        } else if (arg1 == 4) {
            this.field5225 = false;
        }
        field5221++;
        if (arg0 >= -64) {
            this.method2346(-119, -73, null);
        }
    }
}
