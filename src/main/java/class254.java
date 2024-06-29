import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class254 extends class270 {

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "I")
    private int field4313 = 4096;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "Z")
    private boolean field4309 = true;

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
    public static int field4316 = 0;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "Lw;")
    public static class38 field4315 = new class38(64);

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
    public static int field4318 = 0;

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "Lsg;")
    public static class191 field4319;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILmi;)Lka;", line = 15)
    public static final class274 method1771(int arg0, class92 arg1) {
        class274 var2 = new class274(arg1.method696((byte) -101), arg1.method696((byte) -91), arg1.method721(85), arg1.method721(112), arg1.method704(1509947792), arg1.method702(-1) == 1);
        field4317++;
        int var3 = arg1.method702(-1);
        int var4 = -84 / ((63 - arg0) / 46);
        for (int var5 = 0; var5 < var3; var5++) {
            var2.field4645.method330(new class278(arg1.method721(46), arg1.method721(22), arg1.method721(30), arg1.method721(85)), 86);
        }
        var2.method1874(-71);
        return var2;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lmi;II)V", line = 46)
    public final void method8(class92 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field4313 = arg0.method721(31);
        } else if (arg1 == 1) {
            this.field4309 = arg0.method702(-1) == 1;
        }
        field4314++;
        int var5 = -110 / ((-arg2 - 8) / 53);
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V", line = 75)
    public class254() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([Lmh;I)Lmh;", line = 83)
    public static final class62 method1772(class62[] arg0, int arg1) {
        if (arg1 != 0) {
            method1775(-68);
        }
        field4312++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class16.method61(arg0, 0, arg0.length, (byte) -101);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)[[I", line = 103)
    public final int[][] method11(boolean arg0, int arg1) {
        if (arg0) {
            method1773(-11, (class224[]) null);
        }
        field4310++;
        int[][] var3 = this.field4589.method605(arg1, 19195);
        if (this.field4589.field1320) {
            int[] var4 = this.method1850(0, 0, arg1 - 1 & class307.field5268);
            int[] var5 = this.method1850(0, 0, arg1);
            int[] var6 = this.method1850(0, 0, arg1 + 1 & class307.field5268);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class109.field1770; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field4313;
                int var12 = (var5[class49.field717 & var10 + 1] - var5[var10 - 1 & class49.field717]) * this.field4313;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var19 = 0;
                    var20 = 0;
                    var18 = 0;
                } else {
                    var18 = var12 / var17;
                    var19 = var11 / var17;
                    var20 = 16777216 / var17;
                }
                if (this.field4309) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var8[var10] = var18;
                var7[var10] = var19;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[Lmk;)V", line = 193)
    public static final void method1773(int arg0, class224[] arg1) {
        class101.field1662[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "(B)V", line = 198)
    public static final void method1774(byte arg0) {
        field4311++;
        class294.field5010 = 0;
        class258.field4354 = 0;
        class252.method1764((byte) -34);
        class50.method325(-116);
        if (arg0 != 119) {
            return;
        }
        class284.method1931((byte) 93);
        for (int var1 = 0; var1 < class258.field4354; var1++) {
            int var2 = class97.field1597[var1];
            if (class199.field3367 != class301.field5186[var2].field3854) {
                if (class301.field5186[var2].field3435.method1881((byte) -94)) {
                    class293.method1988(class301.field5186[var2], 111);
                }
                class301.field5186[var2].field3435 = null;
                class301.field5186[var2] = null;
            }
        }
        if (class60.field874 != class75.field1223.field1476) {
            throw new RuntimeException("gnp1 pos:" + class75.field1223.field1476 + " psize:" + class60.field874);
        }
        for (int var3 = 0; var3 < class133.field2163; var3++) {
            if (class301.field5186[class288.field4914[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class133.field2163);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V", line = 252)
    public static void method1775(int arg0) {
        if (arg0 <= 10) {
            method1775(15);
        }
        field4315 = null;
        field4319 = null;
    }
}
