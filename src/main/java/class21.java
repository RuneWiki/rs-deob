import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class21 extends class46 {

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "[[B")
    public static byte[][] field300 = new byte[1000][];

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "Lmb;")
    public static class132 field304 = class166.method1092(" (X", 117);

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "Lmb;")
    private static class132 field295 = class166.method1092("Loading )2 please wait)3", 121);

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "Lmb;")
    public static class132 field309 = field295;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "[I")
    public int[] field303;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "[I")
    private int[] field306;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "[Lmb;")
    private class132[] field298;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "[[I")
    private int[][] field294;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(B)I")
    public final int method135(byte arg0) {
        if (arg0 >= -70) {
            field295 = null;
        }
        field308++;
        return this.field306 == null ? 0 : this.field306.length;
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(B)V")
    public static void method136(byte arg0) {
        field295 = null;
        field309 = null;
        field304 = null;
        if (arg0 != -56) {
            method136((byte) 68);
        }
        field300 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lkd;I)V")
    public final void method137(class112 arg0, int arg1) {
        if (arg1 != -31440) {
            return;
        }
        while (true) {
            int var3 = arg0.method716(-1308);
            if (var3 == 0) {
                field307++;
                return;
            }
            this.method141((byte) -96, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "(B)Lmb;")
    public final class132 method138(byte arg0) {
        field301++;
        class132 var2 = class233.method1477(80, -226189949);
        var2.method895(this.field298[0], false);
        int var3 = 1;
        int var4 = 56 / ((49 - arg0) / 51);
        while (this.field298.length > var3) {
            var2.method895(class56.field948, false);
            var2.method895(this.field298[var3], false);
            var3++;
        }
        return var2.method876(110);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)Z")
    public static final boolean method139(int arg0, int arg1) {
        field305++;
        if (arg0 < 32) {
            return false;
        }
        if (arg1 <= 88) {
            method139(-47, 108);
        }
        if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V")
    public static final void method140(int arg0) {
        class66.field1096 = true;
        field296++;
        class182.field3352 = true;
        if (arg0 != 0) {
            field310 = -116;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLkd;I)V")
    private final void method141(byte arg0, class112 arg1, int arg2) {
        if (arg2 == 1) {
            this.field298 = arg1.method720((byte) 30).method863((byte) -93, 60);
        } else if (arg2 == 2) {
            int var8 = arg1.method716(-1308);
            this.field303 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field303[var9] = arg1.method739(-125);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method716(-1308);
            this.field294 = new int[var4][];
            this.field306 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method739(-127);
                this.field306[var5] = var6;
                this.field294[var5] = new int[class172.field3205[var6]];
                for (int var7 = 0; var7 < class172.field3205[var6]; var7++) {
                    this.field294[var5][var7] = arg1.method739(-127);
                }
            }
        }
        if (arg0 > -78) {
            this.method144(110, -63, 114);
        }
        field297++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLkd;)Lmb;")
    public final class132 method142(byte arg0, class112 arg1) {
        field291++;
        class132 var3 = class233.method1477(80, -226189949);
        if (this.field306 != null) {
            for (int var4 = 0; var4 < this.field306.length; var4++) {
                var3.method895(this.field298[var4], false);
                var3.method895(class94.method580(arg1.method712(187322936, class23.field328[this.field306[var4]]), this.field294[var4], this.field306[var4], 100), false);
            }
        }
        var3.method895(this.field298[this.field298.length - 1], false);
        if (arg0 != -87) {
            method143(false);
        }
        return var3.method876(-96);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
    public static final void method143(boolean arg0) {
        field293++;
        class118.field2241.method651((byte) 80);
        int var1 = class118.field2241.method649(8, 25091);
        if (class131.field2423 > var1) {
            for (int var2 = var1; var2 < class131.field2423; var2++) {
                class122.field2291[class43.field770++] = class226.field4098[var2];
            }
        }
        if (class131.field2423 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class131.field2423 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class226.field4098[var3];
            class65 var5 = class11.field145[var4];
            int var6 = class118.field2241.method649(1, 25091);
            if (var6 == 0) {
                class226.field4098[class131.field2423++] = var4;
                var5.field669 = class30.field460;
            } else {
                int var7 = class118.field2241.method649(2, 25091);
                if (var7 == 0) {
                    class226.field4098[class131.field2423++] = var4;
                    var5.field669 = class30.field460;
                    class211.field3874[class220.field4003++] = var4;
                } else if (var7 == 1) {
                    class226.field4098[class131.field2423++] = var4;
                    var5.field669 = class30.field460;
                    int var8 = class118.field2241.method649(3, 25091);
                    var5.method288(-78, false, var8);
                    int var9 = class118.field2241.method649(1, 25091);
                    if (var9 == 1) {
                        class211.field3874[class220.field4003++] = var4;
                    }
                } else if (var7 == 2) {
                    class226.field4098[class131.field2423++] = var4;
                    var5.field669 = class30.field460;
                    int var10 = class118.field2241.method649(3, 25091);
                    var5.method288(-42, true, var10);
                    int var11 = class118.field2241.method649(3, 25091);
                    var5.method288(93, true, var11);
                    int var12 = class118.field2241.method649(1, 25091);
                    if (var12 == 1) {
                        class211.field3874[class220.field4003++] = var4;
                    }
                } else if (var7 == 3) {
                    class122.field2291[class43.field770++] = var4;
                }
            }
        }
        if (arg0) {
            method140(-92);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)I")
    public final int method144(int arg0, int arg1, int arg2) {
        if (arg2 != 5010) {
            return 58;
        }
        field292++;
        if (this.field306 == null || arg0 < 0 || arg0 > this.field306.length) {
            return -1;
        } else if (this.field294[arg0] == null || arg1 < 0 || arg1 > this.field294[arg0].length) {
            return -1;
        } else {
            return this.field294[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)Luf;")
    public static final class220 method145(int arg0, int arg1, int arg2) {
        class169 var3 = class101.field1900[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3099;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B[ILkd;)V")
    public final void method146(byte arg0, int[] arg1, class112 arg2) {
        field299++;
        if (this.field306 == null) {
            return;
        }
        int var4 = 0;
        int var5 = -79 / ((-arg0 - 15) / 56);
        while (this.field306.length > var4) {
            if (arg1.length <= var4) {
                return;
            }
            int var6 = class150.field2751[this.method147(var4, (byte) -65)];
            if (var6 > 0) {
                arg2.method724((long) arg1[var4], var6, 27379);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)I")
    public final int method147(int arg0, byte arg1) {
        field302++;
        if (this.field306 == null || arg0 < 0 || arg0 > this.field306.length) {
            return -1;
        } else {
            if (arg1 != -65) {
                field295 = null;
            }
            return this.field306[arg0];
        }
    }
}
