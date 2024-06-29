import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class116 {

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "[[I")
    private int[][] field1455;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    private int field1444;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    private int field1441;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1451 = "Loaded fonts";

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1440 = 0;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Lok;")
    public static class60 field1442;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "[[I")
    public static int[][] field1450;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)I", line = 4)
    public static final int method622(int arg0, int arg1) {
        if (arg0 >= -94) {
            method623(17, 100);
        }
        field1446++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)V", line = 17)
    public static final void method623(int arg0, int arg1) {
        field1447++;
        class105.field1291 = arg1;
        if (arg0 != 1) {
            field1451 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)I", line = 30)
    public final int method624(int arg0, int arg1) {
        field1453++;
        if (this.field1455 != null) {
            arg1 = (int) ((long) this.field1444 * (long) arg1 / (long) this.field1441) + 6;
        }
        if (arg0 >= -109) {
            field1451 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BLlo;)V", line = 49)
    public static final void method625(byte arg0, class419 arg1) {
        field1449++;
        if (arg0 != -95) {
            field1440 = 125;
        }
        if (arg1 instanceof class91) {
            class91 var2 = (class91) arg1;
            if (var2.field1035 != null) {
                class213.method1154(var2, (byte) 99);
                return;
            }
        } else if ((arg1 instanceof class158)) {
            class428.method2646((class158) arg1, -30747);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(II)V", line = 74)
    public static final void method626(int arg0, int arg1) {
        class114 var2 = class333.field4426;
        synchronized (class333.field4426) {
            class333.field4426.method614(-124, arg1);
        }
        field1452++;
        class114 var3 = class131.field1689;
        synchronized (class131.field1689) {
            class131.field1689.method614(arg0 ^ 0xFFFFFF88, arg1);
            if (arg0 != 14) {
                method622(-74, 110);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[B)[B", line = 94)
    public final byte[] method627(int arg0, byte[] arg1) {
        field1454++;
        if (arg0 >= -96) {
            field1440 = 56;
        }
        if (this.field1455 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field1444 / (long) this.field1441) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field1455[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1444 + var6;
                int var14 = var13 / this.field1441;
                var6 = var13 - this.field1441 * var14;
                var5 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V", line = 165)
    public static void method628(byte arg0) {
        int var1 = 74 / ((arg0 - 30) / 63);
        field1450 = null;
        field1442 = null;
        field1451 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lam;I)V", line = 177)
    public static final void method629(class286 arg0, int arg1) {
        field1448++;
        class427.field6258 = arg0;
        if (arg1 != 127) {
            field1450 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V", line = 195)
    public static final void method630(byte arg0) {
        field1456++;
        class370.field5166 = -1;
        class342.field4581 = null;
        if (arg0 != -60) {
            method630((byte) -127);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZI)I", line = 210)
    public final int method631(boolean arg0, int arg1) {
        if (this.field1455 != null) {
            arg1 = (int) ((long) this.field1444 * (long) arg1 / (long) this.field1441);
        }
        if (!arg0) {
            method628((byte) -3);
        }
        field1445++;
        return arg1;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(II)V", line = 224)
    public class116(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class269.method1497((byte) -128, arg1, arg0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field1455 = new int[var5][14];
            this.field1444 = var4;
            this.field1441 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1455[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lam;B)V", line = 285)
    public static final void method632(class286 arg0, byte arg1) {
        if (arg1 == 0) {
            class99.field1166 = arg0;
            field1443++;
        }
    }
}
