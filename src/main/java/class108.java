import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class108 implements class152 {

    @OriginalMember(owner = "client!c", name = "l", descriptor = "Lic;")
    private class143 field1510 = new class143(256);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Lhc;")
    private class235 field1499;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Lhc;")
    private class235 field1512;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "[Lqf;")
    private class251[] field1509;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "[[I")
    public static int[][] field1500 = new int[5][5000];

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1501 = 0;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1505 = "Drop";

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field1513 = 0;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Llc;")
    public static class86 field1503 = new class86(4);

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "[B")
    public static byte[] field1514;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(IB)Z")
    public final boolean method693(int arg0, byte arg1) {
        field1508++;
        if (arg1 == -60) {
            class34 var3 = this.method694(arg0, 19);
            return var3 != null && var3.method225(this.field1499, this, 683499716);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(II)Lbl;")
    public class34 method694(int arg0, int arg1) {
        field1507++;
        class84 var3 = this.field1510.method961((long) arg0, 9156);
        if (var3 != null) {
            return (class34) var3;
        }
        byte[] var4 = this.field1512.method1565(arg0, -97);
        if (var4 == null) {
            return null;
        }
        if (arg1 != 19) {
            this.field1509 = null;
        }
        class34 var5 = new class34(new class224(var4));
        this.field1510.method957(arg1 ^ 0x5588, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static void method695(boolean arg0) {
        if (!arg0) {
            field1500 = null;
            field1514 = null;
            field1505 = null;
            field1503 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILse;)Lse;")
    public static final class211 method696(int arg0, class211 arg1) {
        field1502++;
        class211 var2 = client.method1050(arg1);
        if (arg0 != 0) {
            method696(18, (class211) null);
        }
        if (var2 == null) {
            var2 = arg1.field3160;
        }
        return var2;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(FZIIII)[I")
    public final int[] method697(float arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 4) {
            this.method694(-101, 62);
        }
        field1504++;
        return this.method694(arg3, 19).method227(this.field1499, this.field1509[arg3].field3841, this, arg5, arg4, arg1, (byte) -4, (double) arg0);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()V")
    public static final void method698() {
        if (class278.field4313 != null) {
            for (int var0 = 0; var0 < class278.field4313.length; var0++) {
                for (int var1 = 0; var1 < class127.field1802; var1++) {
                    for (int var2 = 0; var2 < class234.field3531; var2++) {
                        class278.field4313[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class296.field4674 != null) {
            for (int var3 = 0; var3 < class296.field4674.length; var3++) {
                for (int var4 = 0; var4 < class127.field1802; var4++) {
                    for (int var5 = 0; var5 < class234.field3531; var5++) {
                        class296.field4674[var3][var4][var5] = null;
                    }
                }
            }
        }
        class204.field2845 = 0;
        if (class265.field3978 != null) {
            for (int var6 = 0; var6 < class204.field2845; var6++) {
                class265.field3978[var6] = null;
            }
        }
        if (class230.field3484 != null) {
            for (int var7 = 0; var7 < class140.field1953; var7++) {
                class230.field3484[var7] = null;
            }
            class140.field1953 = 0;
        }
        if (class36.field558 != null) {
            for (int var8 = 0; var8 < class36.field558.length; var8++) {
                class36.field558[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZ)Lqf;")
    public final class251 method699(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            field1511++;
            return this.field1509[arg0];
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lhc;Lhc;Lhc;)V")
    public class108(class235 arg0, class235 arg1, class235 arg2) {
        this.field1499 = arg2;
        this.field1512 = arg1;
        class224 var4 = new class224(arg0.method1576(-106, 0, 0));
        int var5 = var4.method1445(false);
        this.field1509 = new class251[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1453((byte) -127) == 1) {
                this.field1509[var6] = new class251();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field1509[var7] != null) {
                this.field1509[var7].field3848 = var4.method1453((byte) -127) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field1509[var8] != null) {
                this.field1509[var8].field3838 = var4.method1453((byte) -127) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field1509[var9] != null) {
                this.field1509[var9].field3840 = var4.method1453((byte) -128) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field1509[var10] != null) {
                var4.method1453((byte) -128);
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field1509[var11] != null) {
                var4.method1437((byte) -124);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field1509[var12] != null) {
                var4.method1437((byte) -83);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field1509[var13] != null) {
                var4.method1437((byte) -93);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field1509[var14] != null) {
                var4.method1437((byte) -127);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field1509[var15] != null) {
                this.field1509[var15].field3834 = (short) var4.method1445(false);
            }
        }
        if (var4.field3336.length > var4.field3402) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field1509[var16] != null) {
                    var4.method1437((byte) -102);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field1509[var17] != null) {
                    var4.method1437((byte) -72);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field1509[var18] != null) {
                    var4.method1453((byte) -127);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field1509[var19] != null) {
                    this.field1509[var19].field3841 = var4.method1453((byte) -128) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field1509[var20] != null) {
                    var4.method1437((byte) -103);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field1509[var21] != null) {
                    var4.method1453((byte) -128);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field1509[var22] != null) {
                    var4.method1453((byte) -127);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field1509[var23] != null) {
                    var4.method1453((byte) -127);
                }
            }
        }
    }
}
