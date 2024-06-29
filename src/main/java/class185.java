import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class185 {

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "Ltm;")
    private class71 field3202 = null;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "Z")
    private boolean field3227;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "Z")
    private boolean field3235;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "Ljn;")
    private class124 field3214;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "[I")
    public static int[] field3198 = new int[256];

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "[I")
    public static int[] field3224 = new int[4096];

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "[S")
    public static short[] field3240 = new short[256];

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    public static int field3231 = 0;

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "I")
    public static int field3243 = 0;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!ek", name = "T", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!ek", name = "V", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "[Ljava/lang/Object;")
    private Object[] field3232;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3233;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "[[[I")
    public static int[][][] field3228;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)Z", line = 6)
    public final boolean method1257(int arg0, byte arg1) {
        field3242++;
        if (!this.method1285(0, arg0)) {
            return false;
        }
        int var3 = -79 / ((7 - arg1) / 47);
        if (this.field3232[arg0] == null) {
            this.method1271(24382, arg0);
            return this.field3232[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V", line = 33)
    public static final void method1258(byte arg0) {
        if (arg0 == -74) {
            class244.field4354 = true;
            field3223++;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)Z", line = 50)
    private final boolean method1259(byte arg0) {
        if (arg0 != 95) {
            return false;
        }
        field3217++;
        if (this.field3202 == null) {
            this.field3202 = this.field3214.method879(74);
            if (this.field3202 == null) {
                return false;
            }
            this.field3233 = new Object[this.field3202.field1366][];
            this.field3232 = new Object[this.field3202.field1366];
        }
        return true;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZBZ)V", line = 73)
    public final void method1260(boolean arg0, byte arg1, boolean arg2) {
        field3215++;
        if (!this.method1259((byte) 95)) {
            return;
        }
        if (arg2) {
            this.field3202.field1358 = (int[][]) null;
            this.field3202.field1363 = null;
        }
        if (arg0) {
            this.field3202.field1361 = null;
            this.field3202.field1355 = null;
        }
        if (arg1 != 64) {
            this.method1265((byte) -79, (class229) null);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)Z", line = 106)
    private final boolean method1261(int arg0, int arg1, int arg2) {
        field3207++;
        if (!this.method1259((byte) 95)) {
            return false;
        }
        if (arg0 <= 23) {
            field3243 = 55;
        }
        if (arg2 >= 0 && arg1 >= 0 && arg2 < this.field3202.field1371.length && arg1 < this.field3202.field1371[arg2]) {
            return true;
        } else if (class213.field3658) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I[III)[B", line = 139)
    public final byte[] method1262(int arg0, int[] arg1, int arg2, int arg3) {
        field3221++;
        if (!this.method1261(59, arg2, arg0)) {
            return null;
        }
        if (this.field3233[arg0] == null || this.field3233[arg0][arg2] == null) {
            boolean var5 = this.method1290(arg0, arg1, 0);
            if (!var5) {
                this.method1271(arg3 ^ 0x5F3F, arg0);
                boolean var6 = this.method1290(arg0, arg1, 0);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class272.method1913(arg3 ^ 0x3C, this.field3233[arg0][arg2], false);
        if (this.field3227) {
            this.field3233[arg0][arg2] = null;
            if (this.field3202.field1371[arg0] == 1) {
                this.field3233[arg0] = null;
            }
        }
        return arg3 == 1 ? var7 : (byte[]) null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Z", line = 182)
    public static final boolean method1263(int arg0, int arg1) {
        field3222++;
        if (arg1 > -95) {
            return false;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)I", line = 197)
    public final int method1264(int arg0) {
        field3213++;
        if (!this.method1259((byte) 95)) {
            return 0;
        }
        if (arg0 <= 87) {
            this.field3232 = (Object[]) null;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3232.length; var4++) {
            if (this.field3202.field1365[var4] > 0) {
                var2 += 100;
                var3 += this.method1284(0, var4);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLjf;)I", line = 237)
    public final int method1265(byte arg0, class229 arg1) {
        field3244++;
        if (this.method1259((byte) 95)) {
            class229 var3 = arg1.method1608(-199);
            int var4 = this.field3202.field1355.method2155(var3.method1627(false), -8252);
            return arg0 == 69 ? this.method1284(0, var4) : 59;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljf;I)Z", line = 261)
    public final boolean method1266(class229 arg0, int arg1) {
        field3210++;
        if (arg1 != 256) {
            field3198 = (int[]) null;
        }
        if (this.method1259((byte) 95)) {
            class229 var3 = arg0.method1608(arg1 ^ 0xFFFFFE39);
            int var4 = this.field3202.field1355.method2155(var3.method1627(false), -8252);
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Ljn;ZZ)V", line = 1103)
    public class185(class124 arg0, boolean arg1, boolean arg2) {
        this.field3227 = arg2;
        this.field3235 = arg1;
        this.field3214 = arg0;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)Z", line = 285)
    public final boolean method1267(boolean arg0) {
        field3218++;
        if (!this.method1259((byte) 95)) {
            return false;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < this.field3202.field1374.length; var3++) {
            int var4 = this.field3202.field1374[var3];
            if (this.field3232[var4] == null) {
                this.method1271(24382, var4);
                if (this.field3232[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(IB)I", line = 318)
    public final int method1268(int arg0, byte arg1) {
        if (arg1 == 109) {
            field3226++;
            return this.method1285(arg1 ^ 0x6D, arg0) ? this.field3202.field1371[arg0] : 0;
        } else {
            return 94;
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)V", line = 338)
    public final void method1269(byte arg0) {
        field3208++;
        if (arg0 != -82) {
            this.method1269((byte) 50);
        }
        if (this.field3233 != null) {
            for (int var2 = 0; var2 < this.field3233.length; var2++) {
                this.field3233[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)I", line = 364)
    public final int method1270(byte arg0) {
        field3200++;
        if (arg0 != -23) {
            return -22;
        } else if (this.method1259((byte) 95)) {
            return this.field3202.field1348;
        } else {
            throw new IllegalStateException("");
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)V", line = 378)
    private final void method1271(int arg0, int arg1) {
        if (arg0 != 24382) {
            return;
        }
        if (this.field3235) {
            this.field3232[arg1] = this.field3214.method878(116, arg1);
        } else {
            this.field3232[arg1] = class203.method1418(false, this.field3214.method878(121, arg1), (byte) -83);
        }
        field3225++;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(III)[B", line = 394)
    public final byte[] method1272(int arg0, int arg1, int arg2) {
        field3203++;
        if (!this.method1261(67, arg0, arg2)) {
            return null;
        } else if (arg1 < 50) {
            return (byte[]) null;
        } else {
            if (this.field3233[arg2] == null || this.field3233[arg2][arg0] == null) {
                boolean var4 = this.method1290(arg2, (int[]) null, 0);
                if (!var4) {
                    this.method1271(24382, arg2);
                    boolean var5 = this.method1290(arg2, (int[]) null, 0);
                    if (!var5) {
                        return null;
                    }
                }
            }
            return class272.method1913(115, this.field3233[arg2][arg0], false);
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(IB)V", line = 430)
    private final void method1273(int arg0, byte arg1) {
        if (arg1 < -127) {
            field3216++;
            this.field3214.method876(arg0, (byte) 1);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)V", line = 445)
    public final void method1274(byte arg0, int arg1) {
        if (arg0 == -73) {
            field3230++;
            if (this.method1285(0, arg1) && this.field3233 != null) {
                this.field3233[arg1] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(III)[B", line = 463)
    public final byte[] method1275(int arg0, int arg1, int arg2) {
        if (arg2 == -5211) {
            field3209++;
            return this.method1262(arg1, (int[]) null, arg0, 1);
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(III)Z", line = 474)
    public final boolean method1276(int arg0, int arg1, int arg2) {
        field3236++;
        if (!this.method1261(101, arg0, arg2)) {
            return false;
        } else if (this.field3233[arg2] != null && this.field3233[arg2][arg0] != null) {
            return true;
        } else if (this.field3232[arg2] == null) {
            if (arg1 != -25658) {
                this.method1279((class229) null, -9);
            }
            this.method1271(24382, arg2);
            return this.field3232[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(B)V", line = 500)
    public static void method1277(byte arg0) {
        field3240 = null;
        if (arg0 >= -88) {
            method1277((byte) -32);
        }
        field3198 = null;
        field3228 = (int[][][]) null;
        field3224 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljf;Ljf;Z)Z", line = 514)
    public final boolean method1278(class229 arg0, class229 arg1, boolean arg2) {
        field3237++;
        if (!this.method1259((byte) 95)) {
            return false;
        }
        class229 var4 = arg1.method1608(-199);
        class229 var5 = arg0.method1608(-199);
        int var6 = this.field3202.field1355.method2155(var4.method1627(arg2), -8252);
        if (this.method1285(0, var6)) {
            int var7 = this.field3202.field1363[var6].method2155(var5.method1627(arg2), -8252);
            return this.method1276(var7, -25658, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(Ljf;I)Z", line = 539)
    public final boolean method1279(class229 arg0, int arg1) {
        field3219++;
        if (!this.method1259((byte) 95)) {
            return false;
        }
        class229 var3 = arg0.method1608(-199);
        if (arg1 <= 76) {
            field3240 = (short[]) null;
        }
        int var4 = this.field3202.field1355.method2155(var3.method1627(false), -8252);
        return this.method1257(var4, (byte) -60);
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(IB)[I", line = 563)
    public final int[] method1280(int arg0, byte arg1) {
        field3220++;
        if (!this.method1285(0, arg0)) {
            return null;
        } else if (arg1 == 80) {
            int[] var3 = this.field3202.field1349[arg0];
            if (var3 == null) {
                var3 = new int[this.field3202.field1365[arg0]];
                int var4 = 0;
                while (var3.length > var4) {
                    var3[var4] = var4++;
                }
            }
            return var3;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLjf;Ljf;)[B", line = 594)
    public final byte[] method1281(byte arg0, class229 arg1, class229 arg2) {
        field3241++;
        if (!this.method1259((byte) 95)) {
            return null;
        }
        class229 var4 = arg1.method1608(arg0 - 319);
        class229 var5 = arg2.method1608(-199);
        int var6 = this.field3202.field1355.method2155(var4.method1627(false), -8252);
        if (!this.method1285(0, var6)) {
            return null;
        }
        if (arg0 != 120) {
            this.method1265((byte) 112, (class229) null);
        }
        int var7 = this.field3202.field1363[var6].method2155(var5.method1627(false), -8252);
        return this.method1275(var7, var6, -5211);
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 618)
    public static final void method1282(int arg0) {
        field3229++;
        int[] var1 = new int[client.field4467];
        int var2 = 0;
        for (int var3 = 0; var3 < client.field4467; var3++) {
            class313 var4 = class113.method799(var3, (byte) 50);
            if (var4.field5284 >= 0 || var4.field5285 >= 0) {
                var1[var2++] = var3;
            }
        }
        if (arg0 >= -126) {
            field3228 = (int[][][]) ((int[][][]) null);
        }
        class245.field4361 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class245.field4361[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(III)Lmj;", line = 652)
    public static final class232 method1283(int arg0, int arg1, int arg2) {
        class125 var3 = class312.field5246[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2192;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(II)I", line = 663)
    private final int method1284(int arg0, int arg1) {
        field3201++;
        if (this.method1285(arg0, arg1)) {
            return this.field3232[arg1] == null ? this.field3214.method877(arg1, 0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(II)Z", line = 680)
    private final boolean method1285(int arg0, int arg1) {
        field3205++;
        if (!this.method1259((byte) 95)) {
            return false;
        } else if (arg0 <= arg1 && arg1 < this.field3202.field1371.length && this.field3202.field1371[arg1] != 0) {
            return true;
        } else if (class213.field3658) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(Z)I", line = 706)
    public final int method1286(boolean arg0) {
        field3212++;
        if (arg0) {
            field3240 = (short[]) null;
        }
        return this.method1259((byte) 95) ? this.field3202.field1371.length : -1;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILrl;IBIII)Lrl;", line = 720)
    public static final class196 method1287(int arg0, class196 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field3211++;
        long var7 = (long) arg5;
        class196 var9 = (class196) class223.field3801.method229(var7, arg3 - 57);
        if (var9 == null) {
            class197 var10 = class197.method1356(class180.field3123, arg5, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1355(64, 768, -50, -10, -50);
            class223.field3801.method227(-25077, var9, var7);
        }
        int var11 = arg1.method272();
        if (arg3 != 43) {
            return (class196) null;
        }
        int var12 = arg1.method289();
        int var13 = arg1.method291();
        int var14 = arg1.method284();
        class196 var15 = var9.method279(true, true);
        if (arg0 != 0) {
            var15.method268(arg0);
        }
        if (class108.field1900) {
            class239 var16 = (class239) var15;
            if (arg2 != class282.method1984((byte) -103, arg6 + var13, arg4 + var11, class16.field254) || class282.method1984((byte) -73, arg6 + var14, arg4 + var12, class16.field254) != arg2) {
                for (int var17 = 0; var17 < var16.field4212; var17++) {
                    var16.field4192[var17] += class282.method1984((byte) -71, var16.field4214[var17] + arg6, var16.field4186[var17] + arg4, class16.field254) - arg2;
                }
                var16.field4170.field4392 = false;
                var16.field4207.field3659 = false;
            }
        } else {
            class32 var18 = (class32) var15;
            if (arg2 != class282.method1984((byte) -84, arg6 + var13, arg4 + var11, class16.field254) || arg2 != class282.method1984((byte) -71, arg6 + var14, arg4 - -var12, class16.field254)) {
                for (int var19 = 0; var19 < var18.field552; var19++) {
                    var18.field571[var19] += class282.method1984((byte) -102, var18.field561[var19] + arg6, var18.field553[var19] + arg4, class16.field254) - arg2;
                }
                var18.field546 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(Ljf;I)V", line = 804)
    public final void method1288(class229 arg0, int arg1) {
        field3199++;
        if (!this.method1259((byte) 95)) {
            return;
        }
        class229 var3 = arg0.method1608(-199);
        if (arg1 != 0) {
            this.method1273(-124, (byte) -92);
        }
        int var4 = this.field3202.field1355.method2155(var3.method1627(false), -8252);
        this.method1273(var4, (byte) -128);
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(II)Z", line = 827)
    public final boolean method1289(int arg0, int arg1) {
        field3204++;
        if (arg1 >= -59) {
            return false;
        } else if (!this.method1259((byte) 95)) {
            return false;
        } else if (this.field3202.field1371.length == 1) {
            return this.method1276(arg0, -25658, 0);
        } else if (!this.method1285(0, arg0)) {
            return false;
        } else if (this.field3202.field1371[arg0] == 1) {
            return this.method1276(0, -25658, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I[II)Z", line = 854)
    private final boolean method1290(int arg0, int[] arg1, int arg2) {
        field3234++;
        if (!this.method1285(0, arg0)) {
            return false;
        } else if (this.field3232[arg0] == null) {
            return false;
        } else {
            int[] var4 = this.field3202.field1349[arg0];
            int var5 = this.field3202.field1365[arg0];
            boolean var6 = true;
            if (this.field3233[arg0] == null) {
                this.field3233[arg0] = new Object[this.field3202.field1371[arg0]];
            }
            Object[] var7 = this.field3233[arg0];
            for (int var8 = arg2; var8 < var5; var8++) {
                int var9;
                if (var4 == null) {
                    var9 = var8;
                } else {
                    var9 = var4[var8];
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
            if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
                var10 = class272.method1913(102, this.field3232[arg0], false);
            } else {
                var10 = class272.method1913(87, this.field3232[arg0], true);
                class14 var11 = new class14(var10);
                var11.method108(5, arg1, var11.field174.length, 97);
            }
            byte[] var12;
            try {
                var12 = class258.method1839(var10, arg2 + 88);
            } catch (RuntimeException var31) {
                throw class7.method42(var31, "T3 - " + (arg1 != null) + "," + arg0 + "," + var10.length + "," + class299.method2060(var10.length, true, var10) + "," + class299.method2060(var10.length - 2, true, var10) + "," + this.field3202.field1364[arg0] + "," + this.field3202.field1348);
            }
            if (this.field3235) {
                this.field3232[arg0] = null;
            }
            if (var5 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                class14 var16 = new class14(var12);
                int var17 = var32 - var15 * 4 * var5;
                int[] var18 = new int[var5];
                var16.field195 = var17;
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var5; var21++) {
                        var20 += var16.method128((byte) 4);
                        if (var4 == null) {
                        }
                        var18[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var5][];
                for (int var23 = 0; var23 < var5; var23++) {
                    var22[var23] = new byte[var18[var23]];
                    var18[var23] = 0;
                }
                var16.field195 = var17;
                int var24 = 0;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var5; var27++) {
                        var26 += var16.method128((byte) 4);
                        class36.method321(var12, var24, var22[var27], var18[var27], var26);
                        var18[var27] += var26;
                        var24 += var26;
                    }
                }
                for (int var28 = 0; var28 < var5; var28++) {
                    int var29;
                    if (var4 == null) {
                        var29 = var28;
                    } else {
                        var29 = var4[var28];
                    }
                    if (this.field3227) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class203.method1418(false, var22[var28], (byte) -25);
                    }
                }
            } else {
                int var30;
                if (var4 == null) {
                    var30 = 0;
                } else {
                    var30 = var4[0];
                }
                if (this.field3227) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class203.method1418(false, var12, (byte) -45);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(II)[B", line = 1046)
    public final byte[] method1291(int arg0, int arg1) {
        field3238++;
        if (!this.method1259((byte) 95)) {
            return null;
        } else if (this.field3202.field1371.length == 1) {
            return this.method1275(arg0, 0, -5211);
        } else if (!this.method1285(arg1, arg0)) {
            return null;
        } else if (this.field3202.field1371[arg0] == 1) {
            return this.method1275(0, arg0, arg1 - 5211);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljf;B)I", line = 1084)
    public final int method1292(class229 arg0, byte arg1) {
        field3206++;
        if (!this.method1259((byte) 95)) {
            return -1;
        } else if (arg1 < 36) {
            return 18;
        } else {
            class229 var3 = arg0.method1608(-199);
            int var4 = this.field3202.field1355.method2155(var3.method1627(false), -8252);
            return this.method1285(0, var4) ? var4 : -1;
        }
    }
}
