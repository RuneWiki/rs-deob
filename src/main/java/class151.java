import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class151 {

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    private int field2461 = -1;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    private int field2471 = 0;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "Lwn;")
    private class30 field2478 = new class30();

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "Z")
    public boolean field2480 = false;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
    private int field2479;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "[[[I")
    private int[][][] field2477;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    private int field2462;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "[Lsa;")
    private class118[] field2469;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field2464 = 0;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field2474 = 2;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "Z")
    public static boolean field2467 = false;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field2463 = new String[1000];

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "Lok;")
    public static class160 field2476 = new class160(64);

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
    public static int field2482 = 50;

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "[I")
    public static int[] field2488 = new int[field2482];

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "I")
    public static int field2491 = 0;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "[I")
    public static int[] field2483 = new int[field2482];

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field2486 = new String[field2482];

    @OriginalMember(owner = "client!uj", name = "E", descriptor = "[I")
    public static int[] field2490 = new int[field2482];

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "[I")
    public static int[] field2481 = new int[field2482];

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "[I")
    public static int[] field2484 = new int[field2482];

    @OriginalMember(owner = "client!uj", name = "D", descriptor = "[I")
    public static int[] field2489 = new int[field2482];

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "[I")
    public static int[] field2493 = new int[field2482];

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "Lgd;")
    public static class325 field2485 = new class325(64);

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!uj", name = "A", descriptor = "Llg;")
    public static class132 field2487;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)[[[I", line = 5)
    public final int[][][] method1138(int arg0) {
        field2465++;
        if (this.field2479 != this.field2462) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != -20389) {
            method1140(true);
        }
        for (int var2 = 0; var2 < this.field2479; var2++) {
            this.field2469[var2] = class95.field1525;
        }
        return this.field2477;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(III)V", line = 243)
    public class151(int arg0, int arg1, int arg2) {
        this.field2479 = arg0;
        this.field2477 = new int[this.field2479][3][arg2];
        this.field2462 = arg1;
        this.field2469 = new class118[this.field2462];
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)Loh;", line = 38)
    public static final class18 method1139(int arg0, int arg1) {
        field2466++;
        class18 var2 = (class18) class66.field979.method2288((long) arg0, (byte) 98);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class91.field1472.method967(class315.method2228(arg0, (byte) 102), class200.method1407(arg0, 32724), 65280);
        class18 var4 = new class18();
        if (var3 != null) {
            var4.method198(new class1(var3), (byte) -97);
        }
        class66.field979.method2281(arg1, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V", line = 69)
    public static void method1140(boolean arg0) {
        field2476 = null;
        field2484 = null;
        field2493 = null;
        field2485 = null;
        field2490 = null;
        field2488 = null;
        field2463 = null;
        field2481 = null;
        field2489 = null;
        field2486 = null;
        field2487 = null;
        if (arg0) {
            field2483 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)[[I", line = 108)
    public final int[][] method1141(int arg0, int arg1) {
        if (arg0 != -1677) {
            this.method1138(-61);
        }
        field2475++;
        if (this.field2479 == this.field2462) {
            this.field2480 = this.field2469[arg1] == null;
            this.field2469[arg1] = class95.field1525;
            return this.field2477[arg1];
        } else if (this.field2479 == 1) {
            this.field2480 = this.field2461 != arg1;
            this.field2461 = arg1;
            return this.field2477[0];
        } else {
            class118 var3 = this.field2469[arg1];
            if (var3 == null) {
                this.field2480 = true;
                if (this.field2471 >= this.field2479) {
                    class118 var4 = (class118) this.field2478.method269((byte) 37);
                    var3 = new class118(arg1, var4.field1910);
                    this.field2469[var4.field1912] = null;
                    var4.method489(false);
                } else {
                    var3 = new class118(arg1, this.field2471);
                    this.field2471++;
                }
                this.field2469[arg1] = var3;
            } else {
                this.field2480 = false;
            }
            this.field2478.method274(1, var3);
            return this.field2477[var3.field1910];
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V", line = 174)
    public final void method1142(int arg0) {
        for (int var2 = arg0; var2 < this.field2479; var2++) {
            this.field2477[var2][0] = null;
            this.field2477[var2][1] = null;
            this.field2477[var2][2] = null;
            this.field2477[var2] = (int[][]) null;
        }
        field2468++;
        this.field2469 = null;
        this.field2477 = (int[][][]) null;
        this.field2478.method266(-20840);
        this.field2478 = null;
    }
}
