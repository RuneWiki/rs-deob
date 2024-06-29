import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class88 extends class235 {

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "[J")
    private long[] field1396 = new long[10];

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    private int field1392 = 256;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    private int field1397 = 0;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    private int field1391 = 1;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "J")
    private long field1395 = class149.method1024(-14898);

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "Leg;")
    public static class37 field1383 = class174.method1167("showingVideoAd", -113);

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "Leg;")
    public static class37 field1387 = class174.method1167(" )2> <col=ffff00>", -22);

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "Leg;")
    public static class37 field1393 = class174.method1167("Stufe: ", -83);

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "Leg;")
    public static class37 field1398 = class174.method1167("0(U", 58);

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "Leg;")
    public static class37 field1399 = null;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "Lbf;")
    public static class202 field1388 = new class202(4);

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "Ljl;")
    public static class101 field1384;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "[[[Lw;")
    public static class111[][][] field1394;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBI)I")
    public final int method481(int arg0, byte arg1, int arg2) {
        int var4 = this.field1392;
        field1385++;
        this.field1392 = 300;
        int var5 = this.field1391;
        this.field1391 = 1;
        if (arg1 != 9) {
            method585(-27, 112, 112);
        }
        this.field1395 = class149.method1024(-14898);
        if (this.field1396[this.field1389] == 0L) {
            this.field1391 = var5;
            this.field1392 = var4;
        } else if (this.field1396[this.field1389] < this.field1395) {
            this.field1392 = (int) ((long) (arg0 * 2560) / (this.field1395 - this.field1396[this.field1389]));
        }
        if (this.field1392 < 25) {
            this.field1392 = 25;
        }
        if (this.field1392 > 256) {
            this.field1392 = 256;
            this.field1391 = (int) ((long) arg0 - (this.field1395 - this.field1396[this.field1389]) / 10L);
        }
        if (this.field1391 > arg0) {
            this.field1391 = arg0;
        }
        this.field1396[this.field1389] = this.field1395;
        this.field1389 = (this.field1389 + 1) % 10;
        if (this.field1391 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1396[var6] != 0L) {
                    this.field1396[var6] += (long) this.field1391;
                }
            }
        }
        if (arg2 > this.field1391) {
            this.field1391 = arg2;
        }
        int var7 = 0;
        class144.method1008(87, (long) this.field1391);
        while (this.field1397 < 256) {
            this.field1397 += this.field1392;
            var7++;
        }
        this.field1397 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V")
    public static void method584(int arg0) {
        field1384 = null;
        field1399 = null;
        field1387 = null;
        field1393 = null;
        field1394 = null;
        if (arg0 != 6) {
            field1394 = null;
        }
        field1398 = null;
        field1388 = null;
        field1383 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public final void method480(int arg0) {
        if (arg0 != -8543) {
            field1394 = null;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1396[var2] = 0L;
        }
        field1390++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)Leg;")
    public static final class37 method585(int arg0, int arg1, int arg2) {
        int var3 = arg2 - arg1;
        field1386++;
        if (var3 < -9) {
            return class27.field389;
        } else if (var3 < -6) {
            return class176.field2950;
        } else if (var3 < -3) {
            return class45.field705;
        } else if (var3 < 0) {
            return class199.field3381;
        } else if (var3 > 9) {
            return class69.field1089;
        } else if (var3 > 6) {
            return class234.field4033;
        } else if (var3 > 3) {
            return class167.field2788;
        } else {
            if (arg0 != 21722) {
                method585(94, 102, -68);
            }
            return var3 > 0 ? class259.field4579 : class194.field3327;
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
    public class88() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1396[var1] = this.field1395;
        }
    }
}
