import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class103 extends class154 {

    @OriginalMember(owner = "client!he", name = "z", descriptor = "Z")
    public static boolean field1483 = true;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "Z")
    public static boolean field1480 = false;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "Z")
    public static boolean field1477 = false;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "Llm;")
    public static class150 field1475 = new class150(64);

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public int field1478;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "Lkk;")
    public static class67 field1482;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "[I")
    public int[] field1484;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "[I")
    public int[] field1486;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "[I")
    public int[] field1489;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "[Lui;")
    public class286[] field1472;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "[Lui;")
    public class286[] field1473;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "[[[B")
    public byte[][][] field1481;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
    public static final void method657(int arg0) {
        field1487++;
        int var1 = class295.field4707;
        int var2 = class243.field3815;
        int var3 = 10 % ((arg0 - 71) / 44);
        int var4 = class227.field3557;
        int var5 = class189.field2868;
        int var6 = 6116423;
        class266.method1730(var1, var5, var2, var4, var6);
        class266.method1730(var1 + 1, var5 + 1, var2 - 2, 16, 0);
        class266.method1743(var1 + 1, var5 + 18, var2 - 2, var4 + -19, 0);
        class261.field4201.method206(class24.field386, var1 + 3, var5 - -14, var6, -1);
        int var7 = class17.field304;
        int var8 = class249.field3891;
        for (int var9 = 0; var9 < class179.field2721; var9++) {
            int var10 = 16777215;
            int var11 = (class179.field2721 - var9 - 1) * 15 + var5 + 31;
            if (var1 < var7 && var7 < (var1 + var2) && var8 > (var11 - 13) && var8 < (var11 + 3)) {
                var10 = 16776960;
            }
            class261.field4201.method206(class45.method291(50, var9), var1 + 3, var11, var10, 0);
        }
        class137.method860(class227.field3557, class243.field3815, class189.field2868, (byte) 79, class295.field4707);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIZ)V")
    public static final void method658(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            method661(13);
        }
        field1476++;
        class39 var4 = class149.method935(-110, arg1, 11);
        var4.method261(0);
        var4.field598 = arg2;
        var4.field593 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IJ)V")
    public static final void method659(int arg0, long arg1) {
        if (!class78.field1085) {
            class160.field2239 += (float) arg1 * class254.field3960 / 40.0F;
            class123.field1743 += (float) arg1 * class228.field3571 / 40.0F;
        }
        if (arg0 != 3) {
            field1480 = false;
        }
        int var3 = class249.field3895 + class250.field3905.field4081;
        field1488++;
        int var4 = class281.field4467 + class250.field3905.field4140;
        if (class21.field341 - var3 < -500 || (class21.field341 - var3) > 500 || (class250.field3906 - var4) < -500 || class250.field3906 - var4 > 500) {
            class250.field3906 = var4;
            class21.field341 = var3;
        }
        if (class21.field341 != var3) {
            int var5 = var3 - class21.field341;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class21.field341 += var6;
        }
        if (class250.field3906 != var4) {
            int var7 = var4 - class250.field3906;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class250.field3906 += var8;
        }
        class17.method115(1);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
    public static void method660(boolean arg0) {
        if (arg0) {
            field1482 = null;
            field1475 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V")
    public static final void method661(int arg0) {
        class262.field4214 = new class178[class110.field1568.method2048(true)][];
        if (arg0 != -1) {
            method660(true);
        }
        class191.field2906 = new boolean[class110.field1568.method2048(true)];
        field1474++;
    }
}
