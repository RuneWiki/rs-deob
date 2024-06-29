import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class315 extends class283 {

    @OriginalMember(owner = "client!si", name = "Z", descriptor = "Lna;")
    public static class26 field5394 = class69.method505("<col=ffb000>", (byte) -123);

    @OriginalMember(owner = "client!si", name = "X", descriptor = "[Lsg;")
    public static class37[] field5392 = new class37[6];

    @OriginalMember(owner = "client!si", name = "eb", descriptor = "I")
    public static volatile int field5399 = 0;

    @OriginalMember(owner = "client!si", name = "hb", descriptor = "Lna;")
    private static class26 field5402 = class69.method505("Take", (byte) -126);

    @OriginalMember(owner = "client!si", name = "gb", descriptor = "Lna;")
    public static class26 field5401 = class69.method505("<br>(X", (byte) -119);

    @OriginalMember(owner = "client!si", name = "ib", descriptor = "Lna;")
    public static class26 field5403 = class69.method505("Weiter", (byte) -118);

    @OriginalMember(owner = "client!si", name = "db", descriptor = "Lna;")
    public static class26 field5398 = field5402;

    @OriginalMember(owner = "client!si", name = "P", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!si", name = "T", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!si", name = "V", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!si", name = "W", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!si", name = "Y", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!si", name = "ab", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!si", name = "bb", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!si", name = "fb", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!si", name = "cb", descriptor = "[B")
    public static byte[] field5397;

    @OriginalMember(owner = "client!si", name = "U", descriptor = "[Lkf;")
    private class222[] field5389;

    @OriginalMember(owner = "client!si", name = "S", descriptor = "[Lna;")
    public static class26[] field5387;

    @OriginalMember(owner = "client!si", name = "R", descriptor = "[[[B")
    public static byte[][][] field5386;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)[I", line = 6)
    public final int[] method8(int arg0, byte arg1) {
        int var3 = -75 % ((30 - arg1) / 36);
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            this.method2184(-60, this.field4733.method665((byte) 124));
        }
        field5393++;
        return var4;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZB)I", line = 27)
    public static final int method2183(boolean arg0, byte arg1) {
        if (arg0) {
            field5390++;
            return arg1 & 0xFF;
        } else {
            return 104;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I[[I)V", line = 40)
    private final void method2184(int arg0, int[][] arg1) {
        field5385++;
        int var3 = class225.field3574;
        int var4 = class101.field1632;
        class72.method514(arg1, true);
        class258.method1817(0, 0, (byte) 111, class210.field3268, class236.field3783);
        if (this.field5389 != null) {
            for (int var5 = 0; var5 < this.field5389.length; var5++) {
                class222 var6 = this.field5389[var5];
                int var7 = var6.field3513;
                int var8 = var6.field3516;
                if (var7 >= 0) {
                    if (var8 < 0) {
                        var6.method303(2, var4, var3);
                    } else {
                        var6.method307(var3, var4, 4898);
                    }
                } else if (var8 >= 0) {
                    var6.method305(var3, true, var4);
                }
            }
        }
        if (arg0 != -60) {
            method2187((byte) -35, (class26) null);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILwa;Z)V", line = 88)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field5389 = new class222[arg1.method642((byte) -77)];
            for (int var4 = 0; var4 < this.field5389.length; var4++) {
                int var5 = arg1.method642((byte) -44);
                if (var5 == 0) {
                    this.field5389[var4] = class321.method2236(-5232, arg1);
                } else if (var5 == 1) {
                    this.field5389[var4] = class63.method479((byte) 54, arg1);
                } else if (var5 == 2) {
                    this.field5389[var4] = class47.method360((byte) -110, arg1);
                } else if (var5 == 3) {
                    this.field5389[var4] = class131.method885(arg1, (byte) 80);
                }
            }
        } else if (arg0 == 1) {
            this.field4715 = arg1.method642((byte) -48) == 1;
        }
        field5396++;
        if (!arg2) {
            this.method2184(124, (int[][]) ((int[][]) null));
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)V", line = 161)
    public static final void method2185(int arg0, boolean arg1) {
        class289.method2031(class289.field4822, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        class289.method2034(-50.0F, -60.0F, -50.0F);
        class289.method2033(class289.field4816, 0);
        class289.method2029();
        field5400++;
        if (arg1) {
            field5386 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!si", name = "h", descriptor = "(I)V", line = 184)
    public static void method2186(int arg0) {
        field5403 = null;
        field5386 = (byte[][][]) null;
        if (arg0 != 0) {
            return;
        }
        field5397 = null;
        field5392 = null;
        field5402 = null;
        field5387 = null;
        field5398 = null;
        field5401 = null;
        field5394 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLna;)I", line = 208)
    public static final int method2187(byte arg0, class26 arg1) {
        field5384++;
        if (arg0 <= 13) {
            field5401 = (class26) null;
        }
        return arg1.method171(-43) + 1;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II)[[I", line = 224)
    public final int[][] method3(int arg0, int arg1) {
        if (arg0 != -1) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field4719.method2182((byte) -117, arg1);
        if (this.field4719.field5381) {
            int var4 = class101.field1632;
            int var5 = class225.field3574;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = this.field4719.method2177((byte) -56);
            this.method2184(-60, var6);
            for (int var8 = 0; var8 < class225.field3574; var8++) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class101.field1632; var14++) {
                    int var15 = var9[var14];
                    var13[var14] = class4.method23(255, var15) << 4;
                    var12[var14] = class4.method23(4080, var15 >> 4);
                    var11[var14] = class4.method23(var15 >> 12, 4080);
                }
            }
        }
        field5391++;
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V", line = 290)
    public class315() {
        super(0, true);
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(IIB)V", line = 321)
    public static final void method2188(int arg0, int arg1, byte arg2) {
        field5388++;
        if (arg2 != 68) {
            field5398 = (class26) null;
        }
        class120 var3 = class293.method2059(arg2 - 64, 12, arg1);
        var3.method833((byte) 33);
        var3.field1877 = arg0;
    }
}
