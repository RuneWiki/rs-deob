import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class17 {

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    private int field330 = -1;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    private int field335 = 0;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "Lke;")
    private class106 field334 = new class106();

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "Z")
    public boolean field344 = false;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    private int field339;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "[[I")
    private int[][] field341;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    private int field340;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "[Lue;")
    private class14[] field331;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "Ldh;")
    public static class159 field336 = new class159(16);

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "Z")
    public static boolean field346 = false;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "Lcd;")
    public static class64 field345 = class44.method335((byte) 71, "Ablegen");

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "[J")
    public static long[] field350 = new long[256];

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "Ldh;")
    public static class159 field351;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "Lcd;")
    private static class64 field352;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "Lcd;")
    public static class64 field354;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "Lpj;")
    public static class173 field353;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "[I")
    public static int[] field349;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBILja;)V", line = 8)
    public static final void method173(int arg0, byte arg1, int arg2, class60 arg3) {
        field337++;
        if (class263.field4511 != null || class101.field1828 || arg3 == null || class250.method1799(0, arg3) == null) {
            return;
        }
        class263.field4511 = arg3;
        class183.field3133 = class250.method1799(0, arg3);
        class115.field2116 = arg2;
        class164.field2882 = 0;
        class163.field2872 = false;
        class234.field3957 = arg0;
        if (arg1 != -15) {
            field353 = (class173) null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V", line = 40)
    public static void method174(boolean arg0) {
        field354 = null;
        field352 = null;
        field345 = null;
        field351 = null;
        field336 = null;
        field353 = null;
        field349 = null;
        if (!arg0) {
            field350 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(III)V", line = 345)
    public class17(int arg0, int arg1, int arg2) {
        this.field339 = arg0;
        this.field341 = new int[this.field339][arg2];
        this.field340 = arg1;
        this.field331 = new class14[this.field340];
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Z)[[I", line = 78)
    public final int[][] method175(boolean arg0) {
        field338++;
        if (!arg0) {
            return (int[][]) ((int[][]) null);
        } else if (this.field340 == this.field339) {
            for (int var2 = 0; var2 < this.field339; var2++) {
                this.field331[var2] = class198.field3383;
            }
            return this.field341;
        } else {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V", line = 102)
    public static final void method176(byte arg0) {
        field328++;
        if (arg0 >= -104) {
            method177((byte) 39);
        }
        class52.method385();
        class52.method386();
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)Lkh;", line = 120)
    public static final class13 method177(byte arg0) {
        field347++;
        class13 var1 = new class13(30);
        var1.method130(-1, 7);
        var1.method130(-1, class201.field3441);
        var1.method130(-1, class141.field2485 ? 1 : 0);
        int var2 = -10 / ((7 - arg0) / 33);
        var1.method130(-1, class69.field1324 ? 1 : 0);
        var1.method130(-1, class222.field3762 ? 1 : 0);
        var1.method130(-1, class83.field1522 ? 1 : 0);
        var1.method130(-1, class117.field2136 ? 1 : 0);
        var1.method130(-1, class220.field3729 ? 1 : 0);
        var1.method130(-1, class109.field2015 ? 1 : 0);
        var1.method130(-1, class263.field4510 ? 1 : 0);
        var1.method130(-1, class244.field4251);
        var1.method130(-1, class274.field4701 ? 1 : 0);
        var1.method130(-1, class250.field4342 ? 1 : 0);
        var1.method130(-1, class175.field3000 ? 1 : 0);
        var1.method130(-1, class155.field2741);
        var1.method130(-1, class275.field4718 ? 1 : 0);
        var1.method130(-1, class58.field959);
        var1.method130(-1, class163.field2865);
        var1.method130(-1, class106.field1960);
        var1.method145(118, class268.field4616);
        var1.method145(125, class289.field4937);
        var1.method130(-1, 2);
        var1.method128((byte) -39, class195.field3310);
        var1.method130(-1, class304.field5200);
        var1.method130(-1, class3.field31 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[Lja;I)V", line = 162)
    public static final void method178(int arg0, class60[] arg1, int arg2) {
        field343++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class60 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field1091 == 0) {
                    if (var4.field1100 != null) {
                        method178(arg0, var4.field1100, 9725);
                    }
                    class172 var5 = (class172) class159.field2805.method1151((long) var4.field1080, arg2 ^ 0x25FD);
                    if (var5 != null) {
                        class151.method1098(false, arg0, var5.field2967);
                    }
                }
                if (arg0 == 0 && var4.field1059 != null) {
                    class11 var6 = new class11();
                    var6.field212 = var4;
                    var6.field229 = var4.field1059;
                    class218.method1562((byte) 101, var6);
                }
                if (arg0 == 1 && var4.field1107 != null) {
                    if (var4.field1167 >= 0) {
                        class60 var7 = class125.method907(var4.field1080, -117);
                        if (var7 == null || var7.field1100 == null || var4.field1167 >= var7.field1100.length || var7.field1100[var4.field1167] != var4) {
                            continue;
                        }
                    }
                    class11 var8 = new class11();
                    var8.field212 = var4;
                    var8.field229 = var4.field1107;
                    class218.method1562((byte) 78, var8);
                }
            }
        }
        if (arg2 != 9725) {
            method174(false);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZ)[I", line = 235)
    public final int[] method179(int arg0, boolean arg1) {
        field329++;
        if (!arg1) {
            field346 = true;
        }
        if (this.field340 == this.field339) {
            this.field344 = this.field331[arg0] == null;
            this.field331[arg0] = class198.field3383;
            return this.field341[arg0];
        } else if (this.field339 == 1) {
            this.field344 = this.field330 != arg0;
            this.field330 = arg0;
            return this.field341[0];
        } else {
            class14 var3 = this.field331[arg0];
            if (var3 == null) {
                this.field344 = true;
                if (this.field335 >= this.field339) {
                    class14 var4 = (class14) this.field334.method779(28619);
                    var3 = new class14(arg0, var4.field313);
                    this.field331[var4.field316] = null;
                    var4.method232(128);
                } else {
                    var3 = new class14(arg0, this.field335);
                    this.field335++;
                }
                this.field331[arg0] = var3;
            } else {
                this.field344 = false;
            }
            this.field334.method782(var3, 22774);
            return this.field341[var3.field313];
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 304)
    public final void method180(int arg0) {
        for (int var2 = 0; var2 < this.field339; var2++) {
            this.field341[var2] = null;
        }
        this.field341 = (int[][]) null;
        this.field331 = null;
        field333++;
        if (arg0 == 19290) {
            this.field334.method776((byte) 84);
            this.field334 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field350[var0] = var1;
        }
        field351 = new class159(32);
        field355 = 0;
        field352 = class44.method335((byte) 71, " is already on your friend list)3");
        field354 = field352;
        field353 = new class173(5000);
    }
}
