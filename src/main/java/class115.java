import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public abstract class class115 extends class359 {

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "Z")
    public boolean field1347;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "[Lik;")
    public class115[] field1339;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1333 = "Connecting to update server";

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "Z")
    public static boolean field1343 = true;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
    public static int field1348 = 0;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
    public static int field1353 = -1;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "[[Z")
    public static boolean[][] field1350 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "Ldp;")
    public class2 field1340;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "Lpc;")
    public class400 field1342;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "[I")
    public static int[] field1341;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method629(String arg0, byte arg1) {
        int var2 = 44 / ((-arg1 - 71) / 49);
        field1349++;
        if (arg0 == null) {
            return;
        }
        String var3 = class407.method2567(arg0, -13);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class100.field1124; var4++) {
            String var5 = class407.method2567(class302.field4300[var4], -13);
            if (var5 != null && var5.equals(var3)) {
                class100.field1124--;
                for (int var6 = var4; var6 < class100.field1124; var6++) {
                    class302.field4300[var6] = class302.field4300[var6 + 1];
                    class96.field1076[var6] = class96.field1076[var6 + 1];
                    class315.field4490[var6] = class315.field4490[var6 + 1];
                    class111.field1283[var6] = class111.field1283[var6 + 1];
                    class3.field42[var6] = class3.field42[var6 + 1];
                    class434.field6367[var6] = class434.field6367[var6 + 1];
                }
                class159.field2261++;
                class367.field5362 = class418.field6013;
                class169.field2360.method809(85, -28022);
                class169.field2360.method1396(21375, class233.method1488(-19285, arg0));
                class169.field2360.method1359((byte) 0, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)[[I")
    public int[][] method144(int arg0, int arg1) {
        int var3 = 80 / ((arg1 + 80) / 45);
        field1344++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
    public void method630(int arg0) {
        field1336++;
        if (this.field1347) {
            this.field1340.method18(0);
            this.field1340 = null;
        } else {
            this.field1342.method2535((byte) 61);
            this.field1342 = null;
        }
        int var2 = -110 / ((arg0 + 57) / 52);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZII)[I")
    public final int[] method631(boolean arg0, int arg1, int arg2) {
        field1352++;
        if (arg0) {
            return this.field1339[arg1].field1347 ? this.field1339[arg1].method57(arg2, 0) : this.field1339[arg1].method144(arg2, -128)[0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V")
    public static final void method632(int arg0) {
        field1338++;
        if (class105.field1191 == 10) {
            class266.method1695(28, (byte) -118);
        }
        int var1 = -1 / ((arg0 - 73) / 50);
        if (class105.field1191 == 30) {
            class266.method1695(25, (byte) 50);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([Ljava/lang/Object;ZII[I)V")
    public static final void method633(Object[] arg0, boolean arg1, int arg2, int arg3, int[] arg4) {
        if (arg1) {
            return;
        }
        if (arg2 > arg3) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg3;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            Object var8 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var8;
            for (int var9 = arg3; var9 < arg2; var9++) {
                if ((var9 & 0x1) + var7 > arg4[var9]) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    Object var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg2] = arg0[var6];
            arg0[var6] = var8;
            method633(arg0, false, var6 - 1, arg3, arg4);
            method633(arg0, false, arg2, var6 + 1, arg4);
        }
        field1334++;
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)V")
    public void method140(int arg0) {
        field1335++;
        if (arg0 != 0) {
            method637(-58);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIB)V")
    public void method634(int arg0, int arg1, byte arg2) {
        field1328++;
        int var4 = this.field1345 == 255 ? arg0 : this.field1345;
        if (arg2 != -52) {
            this.method140(16);
        }
        if (this.field1347) {
            this.field1340 = new class2(var4, arg0, arg1);
        } else {
            this.field1342 = new class400(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLbk;I)V")
    public void method149(byte arg0, class211 arg1, int arg2) {
        field1332++;
        if (arg0 < 83) {
            this.method140(89);
        }
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)I")
    public int method635(int arg0) {
        int var2 = -114 % ((arg0 - 25) / 56);
        field1351++;
        return -1;
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)I")
    public int method636(int arg0) {
        if (arg0 != 14257) {
            this.method140(-80);
        }
        field1330++;
        return -1;
    }

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "(I)V")
    public static void method637(int arg0) {
        field1341 = null;
        if (arg0 != 0) {
            method638((byte) -79);
        }
        field1333 = null;
        field1350 = null;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(B)V")
    public static final void method638(byte arg0) {
        field1329++;
        if (arg0 < 98) {
            field1353 = 101;
        }
        if (class257.method1613(-126) || class410.field5931 == class356.field5209) {
            class153.method919(-1, class218.field2991);
            if (class410.field5931 != class116.field1362) {
                class119.method677(4);
            }
        } else {
            class35.method201(class367.field5357, -30684, class390.field5715.field6350[0], false, class390.field5715.field6351[0], false, class410.field5931, class426.field6175);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BII)[[I")
    public final int[][] method639(byte arg0, int arg1, int arg2) {
        if (arg0 != 34) {
            return null;
        }
        field1346++;
        if (this.field1339[arg2].field1347) {
            int[] var4 = this.field1339[arg2].method57(arg1, 0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1339[arg2].method144(arg1, arg0 ^ 0xFFFFFFA2);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BIII)I")
    public static final int method640(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= -63) {
            method640((byte) -64, -83, -22, 105);
        }
        field1354++;
        if (arg3 > arg2) {
            return arg3;
        } else if (arg2 <= arg1) {
            return arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(B)Z")
    public static final boolean method641(byte arg0) {
        field1331++;
        class50 var1 = class406.field5896;
        synchronized (class406.field5896) {
            if (class181.field2482 == field1348) {
                return false;
            }
            class343.field5052 = class384.field5624[field1348];
            if (arg0 > -105) {
                field1348 = -98;
            }
            class295.field4219 = class261.field3607[field1348];
            field1348 = field1348 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IZ)V")
    public class115(int arg0, boolean arg1) {
        this.field1347 = arg1;
        this.field1339 = new class115[arg0];
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)[I")
    public int[] method57(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field1345 = 37;
        }
        field1337++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }
}
