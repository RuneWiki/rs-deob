import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class533 extends class513 {

    @OriginalMember(owner = "client!bda", name = "L", descriptor = "Z")
    public boolean field7215 = true;

    @OriginalMember(owner = "client!bda", name = "B", descriptor = "I")
    public static int field7205 = 0;

    @OriginalMember(owner = "client!bda", name = "M", descriptor = "I")
    public static int field7216 = -2;

    @OriginalMember(owner = "client!bda", name = "P", descriptor = "Lfja;")
    public static class783 field7219 = null;

    @OriginalMember(owner = "client!bda", name = "v", descriptor = "I")
    public static int field7199;

    @OriginalMember(owner = "client!bda", name = "w", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!bda", name = "x", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!bda", name = "z", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!bda", name = "C", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!bda", name = "E", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!bda", name = "F", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!bda", name = "G", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!bda", name = "H", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!bda", name = "J", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!bda", name = "N", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!bda", name = "O", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!bda", name = "I", descriptor = "Lok;")
    public class269 field7212;

    @OriginalMember(owner = "client!bda", name = "y", descriptor = "[I")
    private int[] field7202;

    @OriginalMember(owner = "client!bda", name = "A", descriptor = "[I")
    public int[] field7204;

    @OriginalMember(owner = "client!bda", name = "K", descriptor = "[Ljava/lang/String;")
    private String[] field7214;

    @OriginalMember(owner = "client!bda", name = "D", descriptor = "[[I")
    private int[][] field7207;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)Lwg;", line = 5)
    public final class450 method3018(int arg0, int arg1) {
        if (arg1 == -1) {
            field7200++;
            return this.field7202 == null || arg0 < 0 || arg0 > this.field7202.length ? null : class402.method2407(this.field7202[arg0], false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(IBI)I", line = 20)
    public final int method3019(int arg0, byte arg1, int arg2) {
        field7208++;
        if (arg1 != -55) {
            method3020(null, (byte) -30);
        }
        if (this.field7202 == null || arg0 < 0 || arg0 > this.field7202.length) {
            return -1;
        } else if (this.field7207[arg0] == null || arg2 < 0 || arg2 > this.field7207[arg0].length) {
            return -1;
        } else {
            return this.field7207[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lkh;B)Lkh;", line = 43)
    public static final class17 method3020(class17 arg0, byte arg1) {
        field7211++;
        if (arg0.field336 != -1) {
            return class379.method2309(arg0.field336, 192);
        }
        if (arg1 != -50) {
            method3023(true, -2, (byte) -71);
        }
        int var2 = arg0.field372 >>> 16;
        class194 var3 = new class194(class186.field2881);
        for (class637 var4 = (class637) var3.method1406((byte) 121); var4 != null; var4 = (class637) var3.method1407((byte) -18)) {
            if (var4.field8789 == var2) {
                return class379.method2309((int) var4.field2528, 192);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)V", line = 78)
    public static void method3021(byte arg0) {
        field7219 = null;
        if (arg0 >= -63) {
            field7219 = null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)I", line = 88)
    public final int method3022(int arg0) {
        field7203++;
        if (this.field7202 == null) {
            return 0;
        } else if (arg0 == 0) {
            return this.field7202.length;
        } else {
            return -124;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZIB)V", line = 103)
    public static final void method3023(boolean arg0, int arg1, byte arg2) {
        if (arg2 != -34) {
            method3023(false, 32, (byte) 116);
        }
        field7217++;
        class265 var3 = arg0 ? class402.field5525 : class55.field784;
        if (var3 == null || arg1 < 0 || arg1 >= var3.field3732) {
            return;
        }
        class692 var4 = var3.field3737[arg1];
        if (var4.field9610 != -1) {
            return;
        }
        String var5 = var4.field9601;
        class537 var6 = class476.method2729(class81.field1123, (byte) -46, class551.field7498);
        var6.field7295.method754(class703.method3926(120, var5) + 3, 28);
        var6.field7295.method754(arg0 ? 1 : 0, 68);
        var6.field7295.method781(115, arg1);
        var6.field7295.method783((byte) 73, var5);
        class173.method1314(false, var6);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lfca;B[I)V", line = 141)
    public final void method3024(class93 arg0, byte arg1, int[] arg2) {
        field7213++;
        if (this.field7202 == null) {
            return;
        }
        int var4 = -18 / ((52 - arg1) / 51);
        for (int var5 = 0; var5 < this.field7202.length; var5++) {
            if (arg2.length <= var5) {
                return;
            }
            int var6 = this.method3018(var5, -1).field6166;
            if (var6 > 0) {
                arg0.method739(var6, (long) arg2[var5], -66);
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILfca;)Ljava/lang/String;", line = 168)
    public final String method3025(int arg0, class93 arg1) {
        field7201++;
        StringBuffer var3 = new StringBuffer(80);
        if (arg0 >= -60) {
            this.field7202 = null;
        }
        if (this.field7202 != null) {
            for (int var4 = 0; var4 < this.field7202.length; var4++) {
                var3.append(this.field7214[var4]);
                var3.append(this.field7212.method1751(arg1.method751(class402.method2407(this.field7202[var4], false).field6167, 24), (byte) -46, this.method3018(var4, -1), this.field7207[var4]));
            }
        }
        var3.append(this.field7214[this.field7214.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(Z)Ljava/lang/String;", line = 198)
    public final String method3026(boolean arg0) {
        field7209++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field7214 == null) {
            return "";
        }
        var2.append(this.field7214[0]);
        int var3 = 1;
        if (arg0) {
            this.method3029(87);
        }
        while (var3 < this.field7214.length) {
            var2.append("...");
            var2.append(this.field7214[var3]);
            var3++;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(BILfca;)V", line = 227)
    private final void method3027(byte arg0, int arg1, class93 arg2) {
        field7206++;
        if (arg0 <= 99) {
            return;
        }
        if (arg1 == 1) {
            this.field7214 = class478.method2738(arg2.method752(0), '<', 14388);
        } else if (arg1 == 2) {
            int var9 = arg2.method793((byte) 16);
            this.field7204 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field7204[var10] = arg2.method763(91);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method793((byte) 45);
            this.field7207 = new int[var4][];
            this.field7202 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method763(78);
                class450 var7 = class402.method2407(var6, false);
                if (var7 != null) {
                    this.field7202[var5] = var6;
                    this.field7207[var5] = new int[var7.field6161];
                    for (int var8 = 0; var8 < var7.field6161; var8++) {
                        this.field7207[var5][var8] = arg2.method763(-30);
                    }
                }
            }
        } else if (arg1 == 4) {
            this.field7215 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(ILfca;)V", line = 302)
    public final void method3028(int arg0, class93 arg1) {
        while (true) {
            int var3 = arg1.method793((byte) 24);
            if (var3 == 0) {
                if (arg0 != 2) {
                    method3023(true, -82, (byte) 76);
                }
                field7218++;
                return;
            }
            this.method3027((byte) 115, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "(I)V", line = 322)
    public final void method3029(int arg0) {
        if (this.field7204 != null) {
            for (int var2 = 0; var2 < this.field7204.length; var2++) {
                this.field7204[var2] = class530.method3011(this.field7204[var2], 32768);
            }
        }
        field7199++;
        if (arg0 != 32768) {
            this.field7207 = null;
        }
    }
}
