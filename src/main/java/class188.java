import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class188 extends class279 {

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "[S")
    private short[] field3144 = new short[257];

    @OriginalMember(owner = "client!nj", name = "X", descriptor = "I")
    private int field3155 = 0;

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "Ltl;")
    public static class59 field3151 = class85.method639("Abbrechen", 9588);

    @OriginalMember(owner = "client!nj", name = "V", descriptor = "[Ltl;")
    public static class59[] field3153 = new class59[1000];

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!nj", name = "U", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!nj", name = "W", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "[I")
    private int[] field3147;

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "[I")
    private int[] field3150;

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "[[I")
    private int[][] field3149;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZI)[I", line = 4)
    public final int[] method44(boolean arg0, int arg1) {
        field3148++;
        if (arg0) {
            this.field3144 = (short[]) null;
        }
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (this.field4781.field354) {
            int[] var4 = this.method1960(-124, arg1, 0);
            for (int var5 = 0; var5 < class56.field835; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field3144[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(ZI)V", line = 46)
    public static final void method1388(boolean arg0, int arg1) {
        field3143++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class88.method656(74);
        } else if (arg1 == 2) {
            class139.method1011(0);
        } else {
            throw new RuntimeException();
        }
        if (arg0) {
            field3153 = (class59[]) null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)V", line = 71)
    private final void method1389(byte arg0) {
        field3142++;
        int[] var2 = this.field3149[this.field3149.length - 2];
        int[] var3 = this.field3149[0];
        int[] var4 = this.field3149[this.field3149.length - 1];
        int[] var5 = this.field3149[1];
        int var6 = -77 % ((23 - arg0) / 62);
        this.field3150 = new int[] { var3[0] + var3[0] - var5[0], var3[1] - var5[1] - -var3[1] };
        this.field3147 = new int[] { var2[0] + var2[0] - var4[0], var2[1] + -var4[1] + var2[1] };
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZ)Lsf;", line = 90)
    public static final class180 method1390(int arg0, boolean arg1) {
        if (arg1) {
            return (class180) null;
        }
        field3140++;
        class180 var2 = (class180) class206.field3362.method1483((byte) -74, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class291.field4981.method2042(class6.method45(arg0, (byte) 77), class176.method1305(arg0, 255), (byte) -128);
        class180 var4 = new class180();
        var4.field2981 = arg0;
        if (var3 != null) {
            var4.method1331(-124, new class170(var3));
        }
        var4.method1328(-62);
        if (!class133.field2212 && var4.field2999) {
            var4.field3002 = null;
        }
        if (var4.field2969) {
            var4.field3011 = 0;
            var4.field2948 = false;
        }
        class206.field3362.method1488((long) arg0, var4, 25838);
        return var4;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 125)
    public final void method319(byte arg0) {
        field3145++;
        if (arg0 > -9) {
            return;
        }
        if (this.field3149 == null) {
            this.field3149 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (this.field3149.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field3155 == 2) {
            this.method1389((byte) -98);
        }
        class162.method1155(0);
        this.method1395(128609356);
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(B)V", line = 170)
    public static void method1391(byte arg0) {
        field3151 = null;
        int var1 = -114 % ((arg0 + 25) / 47);
        field3153 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IB)[I", line = 183)
    private final int[] method1392(int arg0, byte arg1) {
        field3141++;
        if (arg1 > -35) {
            this.method51(96, -92, (class170) null);
        }
        if (arg0 < 0) {
            return this.field3150;
        } else if (arg0 < this.field3149.length) {
            return this.field3149[arg0];
        } else {
            return this.field3147;
        }
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(B)V", line = 201)
    public static final void method1393(byte arg0) {
        class285.field4899 = -1;
        class183.field3063 = -1;
        class162.field2641 = -1;
        class72.field1123 = 0;
        class143.field2362 = 0;
        class31.field425 = 0;
        class146.field2387 = 0;
        class151.field2485 = -1;
        class234.field3888.field2787 = 0;
        field3154++;
        class85.field1336 = false;
        class18.field236.field2787 = 0;
        class1.field10 = 0;
        class231.field3803 = 0;
        for (int var1 = 0; var1 < class211.field3438.length; var1++) {
            if (class211.field3438[var1] != null) {
                class211.field3438[var1].field1772 = -1;
            }
        }
        for (int var2 = 0; var2 < class23.field311.length; var2++) {
            if (class23.field311[var2] != null) {
                class23.field311[var2].field1772 = -1;
            }
        }
        if (arg0 != 64) {
            field3153 = (class59[]) null;
        }
        class231.method1614(0);
        class266.field4585 = 1;
        class286.method1996(arg0 ^ 0x75FF, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class102.field1689[var3] = true;
        }
        class92.method676((byte) -43);
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 570)
    public class188() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ltl;IIBI)V", line = 261)
    public static final void method1394(class59 arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3152++;
        class263 var5 = class297.method2067(arg4, 94, arg1);
        if (var5 == null) {
            return;
        }
        if (var5.field4480 != null) {
            class128 var6 = new class128();
            var6.field2110 = var5;
            var6.field2094 = arg0;
            var6.field2103 = var5.field4480;
            var6.field2108 = arg2;
            class299.method2093((byte) 63, var6);
        }
        boolean var7 = true;
        if (var5.field4472 > 0) {
            var7 = class137.method1000(false, var5);
        }
        if (!var7 || !class44.method314(client.method278(var5), arg2 - 1, 1)) {
            return;
        }
        if (arg2 == 1) {
            class234.field3888.method1768(true, 53);
            class314.field5321++;
            class234.field3888.method1213(-1, arg4);
            class234.field3888.method1237(true, arg1);
        }
        if (arg2 == 2) {
            class198.field3269++;
            class234.field3888.method1768(true, 68);
            class234.field3888.method1213(-1, arg4);
            class234.field3888.method1237(true, arg1);
        }
        if (arg2 == 3) {
            class235.field3906++;
            class234.field3888.method1768(true, 138);
            class234.field3888.method1213(-1, arg4);
            class234.field3888.method1237(true, arg1);
        }
        if (arg2 == 4) {
            class234.field3888.method1768(true, 11);
            class178.field2919++;
            class234.field3888.method1213(-1, arg4);
            class234.field3888.method1237(true, arg1);
        }
        if (arg2 == 5) {
            class234.field3888.method1768(true, 255);
            class28.field368++;
            class234.field3888.method1213(-1, arg4);
            class234.field3888.method1237(true, arg1);
        }
        if (arg2 == 6) {
            class201.field3335++;
            class234.field3888.method1768(true, 130);
            class234.field3888.method1213(-1, arg4);
            class234.field3888.method1237(true, arg1);
        }
        int var8 = 61 % ((33 - arg3) / 35);
        if (arg2 == 7) {
            class234.field3888.method1768(true, 182);
            class234.field3888.method1213(-1, arg4);
            class28.field367++;
            class234.field3888.method1237(true, arg1);
        }
        if (arg2 == 8) {
            class234.field3888.method1768(true, 71);
            class7.field84++;
            class234.field3888.method1213(-1, arg4);
            class234.field3888.method1237(true, arg1);
        }
        if (arg2 == 9) {
            class221.field3583++;
            class234.field3888.method1768(true, 196);
            class234.field3888.method1213(-1, arg4);
            class234.field3888.method1237(true, arg1);
        }
        if (arg2 == 10) {
            class199.field3301++;
            class234.field3888.method1768(true, 186);
            class234.field3888.method1213(-1, arg4);
            class234.field3888.method1237(true, arg1);
        }
    }

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)V", line = 389)
    private final void method1395(int arg0) {
        if (arg0 != 128609356) {
            this.field3155 = 90;
        }
        int var2 = this.field3155;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; (this.field3149.length - 1) > var5 && var4 >= this.field3149[var5][0]; var5++) {
                }
                int[] var6 = this.field3149[var5 - 1];
                int[] var7 = this.field3149[var5];
                int var8 = this.method1392(var5 - 2, (byte) -57)[1];
                int var9 = var7[1];
                int var10 = var6[1];
                int var11 = this.method1392(var5 + 1, (byte) -114)[1];
                int var12 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var13 = var12 * var12 >> 12;
                int var14 = var11 + var10 - var9 - var8;
                int var16 = var8 - var10 - var14;
                int var17 = (var12 * var14 >> 12) * var13 >> 12;
                int var18 = var13 * var16 >> 12;
                int var19 = var9 - var8;
                int var20 = var12 * var19 >> 12;
                int var21 = var17 + var20 - (-var18 - var10);
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field3144[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var30 = 0; var30 < 257; var30++) {
                int var31 = var30 << 4;
                int var32;
                for (var32 = 1; var32 < this.field3149.length - 1 && var31 >= this.field3149[var32][0]; var32++) {
                }
                int[] var33 = this.field3149[var32 - 1];
                int[] var34 = this.field3149[var32];
                int var35 = (var31 - var33[0] << 12) / (var34[0] - var33[0]);
                int var36 = 4096 - class243.field4064[var35 >> 5 & 0xFF] >> 1;
                int var37 = 4096 - var36;
                int var38 = var33[1] * var37 + var34[1] * var36 >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3144[var30] = (short) var38;
            }
        } else {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; var24 < this.field3149.length - 1 && var23 >= this.field3149[var24][0]; var24++) {
                }
                int[] var25 = this.field3149[var24 - 1];
                int[] var26 = this.field3149[var24];
                int var27 = (var23 - var25[0] << 12) / (var26[0] - var25[0]);
                int var28 = 4096 - var27;
                int var29 = var25[1] * var28 + var26[1] * var27 >> 12;
                if (var29 <= -32768) {
                    var29 = -32767;
                }
                if (var29 >= 32768) {
                    var29 = 32767;
                }
                this.field3144[var22] = (short) var29;
            }
        }
        field3146++;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILs;)V", line = 580)
    public final void method51(int arg0, int arg1, class170 arg2) {
        field3139++;
        if (arg0 > -125 || arg1 != 0) {
            return;
        }
        this.field3155 = arg2.method1221(96);
        this.field3149 = new int[arg2.method1221(125)][2];
        for (int var4 = 0; var4 < this.field3149.length; var4++) {
            this.field3149[var4][0] = arg2.method1214(-18254);
            this.field3149[var4][1] = arg2.method1214(-18254);
        }
    }
}
