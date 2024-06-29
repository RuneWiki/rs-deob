import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class76 {

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    private int field1410 = -1;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    private int field1417 = 0;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Lsg;")
    private class162 field1411 = new class162();

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "Z")
    public boolean field1434 = false;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    private int field1428;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    private int field1415;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "[Lik;")
    private class260[] field1421;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "[[[I")
    private int[][][] field1433;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field1413 = 0;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "Lcc;")
    public static class209 field1431 = class95.method669(115, "rouge:");

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "Z")
    public static volatile boolean field1429 = false;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "Lcc;")
    private static class209 field1427 = class95.method669(96, "M");

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "Lcc;")
    public static class209 field1418 = class95.method669(103, "gelb:");

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "J")
    public static volatile long field1423 = 0L;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "Lcc;")
    public static class209 field1426 = field1427;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "Lcc;")
    public static class209 field1422 = field1427;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "Lcc;")
    public static class209 field1430 = class95.method669(85, "::rebuild");

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "Lcc;")
    private static class209 field1436 = class95.method669(112, "Cancel");

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Lcc;")
    public static class209 field1408 = field1436;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "[Z")
    public static boolean[] field1435;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method531(byte arg0) {
        field1416++;
        if (this.field1428 != this.field1415) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 >= -44) {
            field1423 = -89L;
        }
        for (int var2 = 0; var2 < this.field1415; var2++) {
            this.field1421[var2] = class129.field2482;
        }
        return this.field1433;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
    public static final void method532(boolean arg0) {
        field1412++;
        class126.method907(class207.field3691, 0);
        class161.field2924++;
        if (class148.field2712 && class278.field4888) {
            int var1 = class150.field2735;
            int var2 = class126.field2435;
            int var3 = var2 - class218.field3925;
            if (class94.field1864 > var3) {
                var3 = class94.field1864;
            }
            int var4 = var1 - class93.field1845;
            if ((class207.field3691.field758 + var3) > (class94.field1864 + class178.field3242.field758)) {
                var3 = class178.field3242.field758 + class94.field1864 - class207.field3691.field758;
            }
            if (class262.field4726 > var4) {
                var4 = class262.field4726;
            }
            if ((var4 + class207.field3691.field789) > (class262.field4726 + class178.field3242.field789)) {
                var4 = class262.field4726 + class178.field3242.field789 - class207.field3691.field789;
            }
            int var5 = var3 - class272.field4822;
            int var6 = var4 - class7.field147;
            int var7 = var3 + class178.field3242.field819 - class94.field1864;
            int var8 = var4 + class178.field3242.field696 - class262.field4726;
            int var9 = class207.field3691.field763;
            if (class161.field2924 > class207.field3691.field714 && (var9 < var6 || (-var9) > var6 || var5 > var9 || (-var9) > var5)) {
                class246.field4457 = true;
            }
            if (class207.field3691.field701 != null && class246.field4457) {
                class227 var10 = new class227();
                var10.field4134 = class207.field3691.field701;
                var10.field4147 = var8;
                var10.field4130 = var7;
                var10.field4143 = class207.field3691;
                class147.method1021(var10, 200000);
            }
            if (!arg0) {
                method534(-65, -100, 53, -55, 4, 114, -73, -85);
            }
            if (class126.field2438 == 0) {
                if (class246.field4457) {
                    if (class207.field3691.field793 != null) {
                        class227 var11 = new class227();
                        var11.field4136 = class56.field1149;
                        var11.field4143 = class207.field3691;
                        var11.field4147 = var8;
                        var11.field4130 = var7;
                        var11.field4134 = class207.field3691.field793;
                        class147.method1021(var11, 200000);
                    }
                    if (class56.field1149 != null && client.method1076(class207.field3691) != null) {
                        class84.field1677.method287((byte) 120, 174);
                        class84.field1677.method758(class207.field3691.field779, 1469334200);
                        class84.field1677.method740(255, class207.field3691.field721);
                        class53.field1045++;
                        class84.field1677.method729(class56.field1149.field779, -2100025528);
                        class84.field1677.method767(-1, class56.field1149.field721);
                    }
                } else if ((class147.field2700 == 1 || class115.method817(4, class98.field1912 - 1)) && class98.field1912 > 2) {
                    class237.method1645((byte) -127);
                } else if (class98.field1912 > 0) {
                    class86.method615((byte) -52);
                }
                class207.field3691 = null;
            }
        } else if (class161.field2924 > 1) {
            class207.field3691 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)[[I")
    public final int[][] method533(int arg0, int arg1) {
        field1419++;
        if (arg1 != 3) {
            method537(-95);
        }
        if (this.field1428 == this.field1415) {
            this.field1434 = this.field1421[arg0] == null;
            this.field1421[arg0] = class129.field2482;
            return this.field1433[arg0];
        } else if (this.field1415 == 1) {
            this.field1434 = this.field1410 != arg0;
            this.field1410 = arg0;
            return this.field1433[0];
        } else {
            class260 var3 = this.field1421[arg0];
            if (var3 == null) {
                this.field1434 = true;
                if (this.field1415 <= this.field1417) {
                    class260 var4 = (class260) this.field1411.method1115((byte) -50);
                    var3 = new class260(arg0, var4.field4688);
                    this.field1421[var4.field4687] = null;
                    var4.method269(-214950896);
                } else {
                    var3 = new class260(arg0, this.field1417);
                    this.field1417++;
                }
                this.field1421[arg0] = var3;
            } else {
                this.field1434 = false;
            }
            this.field1411.method1125(-17837, var3);
            return this.field1433[var3.field4688];
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method534(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1414++;
        if (arg7 != -32686) {
            method535((byte) 63, true);
        }
        int var8 = arg3 - arg1;
        int var9 = arg1 + arg4;
        int var10 = arg0 + arg1;
        int var11 = arg2 - arg1;
        for (int var12 = arg4; var12 < var9; var12++) {
            class176.method1215(arg0, arg6, class252.field4543[var12], arg2, (byte) -13);
        }
        for (int var13 = arg3; var13 > var8; var13--) {
            class176.method1215(arg0, arg6, class252.field4543[var13], arg2, (byte) -50);
        }
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class252.field4543[var14];
            class176.method1215(arg0, arg6, var15, var10, (byte) -57);
            class176.method1215(var10, arg5, var15, var11, (byte) -19);
            class176.method1215(var11, arg6, var15, arg2, (byte) 114);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BZ)V")
    public static final void method535(byte arg0, boolean arg1) {
        class117.method831(arg0 ^ 0xE753232D);
        field1420++;
        if (arg0 != 41) {
            method535((byte) 93, true);
        }
        if (class284.field5008 != 30 && class284.field5008 != 25) {
            return;
        }
        class153.field2781++;
        if (class153.field2781 < 50 && !arg1) {
            return;
        }
        class153.field2781 = 0;
        if (!class49.field975 && class193.field3488 != null) {
            class22.field423++;
            class84.field1677.method287((byte) 120, 106);
            try {
                class193.field3488.method1921(class84.field1677.field2108, class84.field1677.field2085, -32362, 0);
                class84.field1677.field2085 = 0;
            } catch (IOException var2) {
                class49.field975 = true;
            }
        }
        class117.method831(arg0 ^ 0xE753232D);
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)V")
    public final void method536(boolean arg0) {
        for (int var2 = 0; var2 < this.field1415; var2++) {
            this.field1433[var2][0] = null;
            this.field1433[var2][1] = null;
            this.field1433[var2][2] = null;
            this.field1433[var2] = null;
        }
        this.field1433 = null;
        field1425++;
        this.field1421 = null;
        if (!arg0) {
            this.field1411.method1117((byte) 48);
            this.field1411 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method537(int arg0) {
        field1427 = null;
        if (arg0 != -1) {
            field1429 = true;
        }
        field1422 = null;
        field1430 = null;
        field1408 = null;
        field1426 = null;
        field1431 = null;
        field1435 = null;
        field1436 = null;
        field1418 = null;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(III)V")
    public class76(int arg0, int arg1, int arg2) {
        this.field1428 = arg1;
        this.field1415 = arg0;
        this.field1421 = new class260[this.field1428];
        this.field1433 = new int[this.field1415][3][arg2];
    }
}
