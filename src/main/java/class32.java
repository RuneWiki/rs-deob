import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class32 {

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    private int field482;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "[[I")
    private int[][] field485;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "[I")
    public static int[] field480 = new int[1000];

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field481 = 0;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "Lr;")
    public static class66 field488 = class93.method641(43, "0(U");

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "Llh;")
    public static class249 field477 = new class249(new byte[5000]);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method182(int arg0) {
        field488 = null;
        field477 = null;
        if (arg0 != -26412) {
            field488 = null;
        }
        field480 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B[B)[B")
    public final byte[] method183(byte arg0, byte[] arg1) {
        if (this.field485 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field482 / (long) this.field487) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field485[var5];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var6 + var12] += var11[var12] * var10;
                }
                int var13 = this.field482 + var5;
                int var14 = var13 / this.field487;
                var5 = var13 - this.field487 * var14;
                var6 += var14;
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
        field486++;
        if (arg0 >= -118) {
            this.method189(-122, (byte) -69);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I")
    public final int method184(int arg0, int arg1) {
        if (this.field485 != null) {
            arg0 = (int) ((long) this.field482 * (long) arg0 / (long) this.field487);
        }
        if (arg1 > -75) {
            this.method189(98, (byte) 124);
        }
        field479++;
        return arg0;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lha;B)Lha;")
    public static final class63 method185(class63 arg0, byte arg1) {
        field476++;
        class63 var2 = client.method587(arg0);
        if (var2 == null) {
            var2 = arg0.field1216;
        }
        return arg1 == 3 ? var2 : null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Llj;)V")
    public static final void method186(class44 arg0) {
        for (int var1 = arg0.field791; var1 <= arg0.field775; var1++) {
            for (int var2 = arg0.field790; var2 <= arg0.field771; var2++) {
                class16 var3 = class110.field2124[arg0.field786][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field219; var4++) {
                        if (var3.field220[var4] == arg0) {
                            var3.field219--;
                            for (int var5 = var4; var5 < var3.field219; var5++) {
                                var3.field220[var5] = var3.field220[var5 + 1];
                                var3.field214[var5] = var3.field214[var5 + 1];
                            }
                            var3.field220[var3.field219] = null;
                            break;
                        }
                    }
                    var3.field216 = 0;
                    for (int var6 = 0; var6 < var3.field219; var6++) {
                        var3.field216 |= var3.field214[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(II)V")
    public class32(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class231.method1513(arg1, (byte) -124, arg0);
            int var4 = arg1 / var3;
            this.field482 = var4;
            int var5 = arg0 / var3;
            this.field485 = new int[var5][14];
            this.field487 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                double var7 = (double) var6 / (double) var5 + 6.0D;
                int[] var9 = this.field485[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                double var11 = (double) var4 / (double) var5;
                int var13 = (int) Math.ceil(var7 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var10) {
                    double var14 = var11;
                    double var16 = ((double) var10 - var7) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var11 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIILta;II)V")
    public static final void method187(int arg0, int arg1, int arg2, int arg3, class107 arg4, int arg5, int arg6) {
        class248.method1633(arg1, arg2, arg5, arg4.field2053, arg6, arg3, arg4.field2077, (byte) -127);
        field484++;
        if (arg0 < 16) {
            method185((class63) null, (byte) 64);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public static final void method188(byte arg0) {
        class4.field45 = 0;
        class240.field4170 = 0;
        field483++;
        class77.method547(-19342);
        class96.method661((byte) 70);
        class182.method1213(-92);
        class125.method867(0);
        for (int var1 = 0; var1 < class4.field45; var1++) {
            int var3 = class70.field1404[var1];
            if (class75.field1501 != class59.field988[var3].field2091) {
                if (class59.field988[var3].field828 > 0) {
                    class215.method1384(-1, class59.field988[var3]);
                }
                class59.field988[var3] = null;
            }
        }
        if (class61.field1033 != class84.field1627.field4335) {
            throw new RuntimeException("gpp1 pos:" + class84.field1627.field4335 + " psize:" + class61.field1033);
        }
        int var2 = 0;
        if (arg0 >= -68) {
            method188((byte) -52);
        }
        while (client.field1650 > var2) {
            if (class59.field988[class192.field3335[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + client.field1650);
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)I")
    public final int method189(int arg0, byte arg1) {
        if (arg1 != 127) {
            return -26;
        }
        if (this.field485 != null) {
            arg0 = (int) ((long) this.field482 * (long) arg0 / (long) this.field487) + 6;
        }
        field489++;
        return arg0;
    }
}
