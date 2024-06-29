import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class74 extends class283 {

    @OriginalMember(owner = "client!je", name = "R", descriptor = "Z")
    public static boolean field1130 = false;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "Lna;")
    public static class26 field1133 = class69.method505("showingVideoAd", (byte) -117);

    @OriginalMember(owner = "client!je", name = "T", descriptor = "Lsc;")
    public static class259 field1132 = new class259(8);

    @OriginalMember(owner = "client!je", name = "db", descriptor = "Lna;")
    public static class26 field1142 = class69.method505(" <col=ffffff>", (byte) -126);

    @OriginalMember(owner = "client!je", name = "fb", descriptor = "I")
    public static int field1144 = 1;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!je", name = "S", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!je", name = "X", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!je", name = "Y", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!je", name = "Z", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!je", name = "ab", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!je", name = "bb", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!je", name = "cb", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!je", name = "W", descriptor = "Lve;")
    public static class266 field1135;

    @OriginalMember(owner = "client!je", name = "eb", descriptor = "[I")
    public static int[] field1143;

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V", line = 9)
    public class74() {
        super(1, false);
    }

    @OriginalMember(owner = "client!je", name = "h", descriptor = "(I)V", line = 13)
    public static final void method527(int arg0) {
        field1139++;
        class275.method1948(-109);
        class27.method214((byte) 126);
        class317.method2199(arg0 ^ 0xFFFFC3A1);
        class127.method868(22683);
        class252.method1742((byte) 127);
        class214.method1428(1974);
        class37.method309((byte) 22);
        class45.method343((byte) -93);
        class308.method2155(-3782);
        class147.method1005((byte) -114);
        class151.method1032(-68);
        class80.method572(128);
        class121.method837(103);
        class98.method729(false);
        if (arg0 != 8) {
            method527(-120);
        }
        class79.method568((byte) -6);
        class120.method835((byte) 3);
        class204.method1381(21);
        class305.method2140((byte) 115);
        class46.field721.method1986((byte) -103);
        class295.field4913.method1986((byte) -122);
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(B)V", line = 43)
    public static final void method528(byte arg0) {
        field1141++;
        int var1 = 105 % ((arg0 + 39) / 41);
        if (class272.field4556) {
            class249.field4059 = null;
            class272.field4556 = false;
            class308.field5308 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IBI)V", line = 60)
    private final void method529(int arg0, byte arg1, int arg2) {
        if (arg1 <= 80) {
            return;
        }
        field1129++;
        int var4 = class13.field184[arg2];
        int var5 = class59.field955[arg0];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && -2.356194490192345D >= (double) var6) {
            class121.field1892 = arg0;
            class80.field1263 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && -2.356194490192345D <= (double) var6) {
            class80.field1263 = arg0;
            class121.field1892 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class80.field1263 = class101.field1632 - arg0;
            class121.field1892 = arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class80.field1263 = arg2;
            class121.field1892 = class225.field3574 - arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class80.field1263 = class101.field1632 - arg2;
            class121.field1892 = class225.field3574 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class80.field1263 = class101.field1632 - arg0;
            class121.field1892 = class225.field3574 - arg2;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class121.field1892 = class225.field3574 - arg2;
            class80.field1263 = arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class80.field1263 = class101.field1632 - arg2;
            class121.field1892 = arg0;
        }
        class80.field1263 &= class236.field3783;
        class121.field1892 &= class210.field3268;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILwa;Z)V", line = 147)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        field1128++;
        if (arg0 == 0) {
            this.field4715 = arg1.method642((byte) -117) == 1;
        }
        if (!arg2) {
            field1135 = (class266) null;
        }
    }

    @OriginalMember(owner = "client!je", name = "i", descriptor = "(I)V", line = 161)
    public static void method530(int arg0) {
        field1143 = null;
        field1142 = null;
        field1132 = null;
        field1135 = null;
        field1133 = null;
        if (arg0 >= -100) {
            field1133 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILve;)V", line = 175)
    public static final void method531(int arg0, class266 arg1) {
        if (arg0 == 2048) {
            field1136++;
            class321.field5524 = arg1;
        }
    }

    @OriginalMember(owner = "client!je", name = "j", descriptor = "(I)I", line = 187)
    public static final int method532(int arg0) {
        if (arg0 != -1) {
            return 18;
        }
        field1138++;
        if (class298.field5133 == null) {
            return -1;
        }
        while (class157.field2457 < class298.field5133.field165) {
            if (class298.field5133.method81(class157.field2457, -20138)) {
                return class157.field2457++;
            }
            class157.field2457++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!je", name = "k", descriptor = "(I)V", line = 223)
    public static final void method533(int arg0) {
        for (class224 var1 = (class224) class147.field2306.method264(-36); var1 != null; var1 = (class224) class147.field2306.method263(4)) {
            if (var1.field3556) {
                var1.method1493(1);
            }
        }
        field1137++;
        for (class224 var2 = (class224) class285.field4793.method264(-110); var2 != null; var2 = (class224) class285.field4793.method263(4)) {
            if (var2.field3556) {
                var2.method1493(1);
            }
        }
        if (arg0 != 8) {
            field1144 = 122;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)[I", line = 255)
    public final int[] method8(int arg0, byte arg1) {
        int var3 = -113 % ((30 - arg1) / 36);
        field1140++;
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            for (int var5 = 0; var5 < class101.field1632; var5++) {
                this.method529(arg0, (byte) 105, var5);
                int[] var6 = this.method1990(0, class121.field1892, 32755);
                var4[var5] = var6[class80.field1263];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIII)V", line = 287)
    public static final void method534(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -22611) {
            method527(83);
        }
        field1131++;
        class118.field1860 = class38.field623 * arg3 / arg1;
        class69.field1069 = class317.field5436 * arg2 / arg4;
        class165.field2566 = -1;
        class18.field253 = -1;
        class265.method1868((byte) 87);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)[[I", line = 306)
    public final int[][] method3(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method3(-38, 67);
        }
        int[][] var3 = this.field4719.method2182((byte) -125, arg1);
        field1134++;
        if (this.field4719.field5381) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; var7 < class101.field1632; var7++) {
                this.method529(arg1, (byte) 107, var7);
                int[][] var8 = this.method1994(class121.field1892, 0, (byte) -49);
                var4[var7] = var8[0][class80.field1263];
                var6[var7] = var8[1][class80.field1263];
                var5[var7] = var8[2][class80.field1263];
            }
        }
        return var3;
    }
}
