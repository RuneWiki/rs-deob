import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class100 extends class304 {

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    private int field1443 = 4;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    private int field1441 = 4;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "Lec;")
    public static class99 field1448 = new class99(64);

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field1449 = "yellow:";

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIBZII)V", line = 4)
    public static final void method755(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5) {
        field1445++;
        if (arg5 < 1) {
            arg5 = 1;
        }
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (class73.field1058) {
            int var6 = arg4 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class238.field3624 - class29.field356) * var6 / 100 + class29.field356;
            if (var7 < class76.field1108) {
                var7 = class76.field1108;
            } else if (class141.field2158 < var7) {
                var7 = class141.field2158;
            }
            int var8 = arg4 * 512 * var7 / (arg5 * 334);
            if (class51.field688 > var8) {
                short var9 = class51.field688;
                var7 = arg5 * var9 * 334 / (arg4 * 512);
                if (class141.field2158 < var7) {
                    var7 = class141.field2158;
                    int var10 = var7 * 512 * arg4 / (var9 * 334);
                    int var11 = (arg5 - var10) / 2;
                    if (arg3) {
                        class175.method1314();
                        class175.method1322(arg1, arg0, var11, arg4, 0);
                        class175.method1322(arg1 + arg5 - var11, arg0, var11, arg4, 0);
                    }
                    arg1 += var11;
                    arg5 -= var11 * 2;
                }
            } else if (var8 > class112.field1691) {
                short var12 = class112.field1691;
                var7 = arg5 * var12 * 334 / (arg4 * 512);
                if (class76.field1108 > var7) {
                    var7 = class76.field1108;
                    int var13 = var12 * 334 * arg5 / (var7 * 512);
                    int var14 = (arg4 - var13) / 2;
                    if (arg3) {
                        class175.method1314();
                        class175.method1322(arg1, arg0, arg5, var14, 0);
                        class175.method1322(arg1, arg0 + arg4 - var14, arg5, var14, 0);
                    }
                    arg4 -= var14 * 2;
                    arg0 += var14;
                }
            }
            class118.field1847 = arg4 * var7 / 334;
        }
        class178.field2838 = arg0;
        if (arg2 < -20) {
            class114.field1792 = (short) arg4;
            class228.field3490 = (short) arg5;
            class290.field4472 = arg1;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V", line = 146)
    public class100() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)Z", line = 114)
    public static final boolean method756(int arg0, int arg1) {
        field1447++;
        if (arg1 < 0) {
            return false;
        } else if (arg0 == -28475) {
            int var2 = class118.field1843[arg1];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 1007;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(B)V", line = 136)
    public static void method757(byte arg0) {
        field1448 = null;
        field1449 = null;
        if (arg0 < 67) {
            method755(21, 44, (byte) -109, true, 23, -114);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lwm;II)V", line = 151)
    public final void method69(class254 arg0, int arg1, int arg2) {
        if (arg2 != -2828) {
            method756(-42, -85);
        }
        field1442++;
        if (arg1 == 0) {
            this.field1441 = arg0.method1774((byte) -114);
        } else if (arg1 == 1) {
            this.field1443 = arg0.method1774((byte) -117);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)[[I", line = 194)
    public final int[][] method75(int arg0, int arg1) {
        field1446++;
        int[][] var3 = this.field4663.method886(arg0, 3);
        if (arg1 != 0) {
            method757((byte) 28);
        }
        if (this.field4663.field1820) {
            int var4 = class218.field3333 / this.field1441;
            int var5 = class109.field1648 / this.field1443;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method2082(0, (byte) -90, class109.field1648 * var6 / var5);
            } else {
                var7 = this.method2082(0, (byte) -108, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var7[2];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class218.field3333; var14++) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class218.field3333 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var10[var14] = var8[var16];
                var11[var14] = var9[var16];
                var13[var14] = var12[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[I", line = 263)
    public final int[] method71(int arg0, int arg1) {
        field1444++;
        if (arg0 != 7) {
            return (int[]) null;
        }
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            int var4 = class218.field3333 / this.field1441;
            int var5 = class109.field1648 / this.field1443;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method2086(0, 0, (byte) 112);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method2086(class109.field1648 * var7 / var5, 0, (byte) 112);
            }
            for (int var8 = 0; var8 < class218.field3333; var8++) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class218.field3333 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }
}
