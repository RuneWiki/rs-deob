import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class156 {

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    private int field2475 = 0;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    private int field2479 = -1;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "Lea;")
    private class204 field2486 = new class204();

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "Z")
    public boolean field2488 = false;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    private int field2481;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    private int field2474;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "[Lkj;")
    private class178[] field2487;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "[[[I")
    private int[][][] field2482;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2476 = "Loading world list data";

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Lsa;")
    public static class110 field2485 = new class110(16);

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "Z")
    public static boolean field2491 = false;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "[I")
    public static int[] field2492 = new int[500];

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2489 = "Created gameworld";

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 12)
    public static void method1173(int arg0) {
        field2492 = null;
        field2476 = null;
        field2489 = null;
        field2485 = null;
        if (arg0 != -3) {
            field2489 = (String) null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)[[[I", line = 27)
    public final int[][][] method1174(int arg0) {
        if (arg0 < 96) {
            field2491 = true;
        }
        field2483++;
        if (this.field2481 != this.field2474) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field2474; var2++) {
            this.field2487[var2] = class219.field3509;
        }
        return this.field2482;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(III)V", line = 276)
    public class156(int arg0, int arg1, int arg2) {
        this.field2481 = arg1;
        this.field2474 = arg0;
        this.field2487 = new class178[this.field2481];
        this.field2482 = new int[this.field2474][3][arg2];
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)[[I", line = 60)
    public final int[][] method1175(int arg0, int arg1) {
        if (arg0 > -39) {
            return (int[][]) ((int[][]) null);
        }
        field2478++;
        if (this.field2481 == this.field2474) {
            this.field2488 = this.field2487[arg1] == null;
            this.field2487[arg1] = class219.field3509;
            return this.field2482[arg1];
        } else if (this.field2474 == 1) {
            this.field2488 = this.field2479 != arg1;
            this.field2479 = arg1;
            return this.field2482[0];
        } else {
            class178 var3 = this.field2487[arg1];
            if (var3 == null) {
                this.field2488 = true;
                if (this.field2475 >= this.field2474) {
                    class178 var4 = (class178) this.field2486.method1488(-1);
                    var3 = new class178(arg1, var4.field2791);
                    this.field2487[var4.field2784] = null;
                    var4.method1701(-111);
                } else {
                    var3 = new class178(arg1, this.field2475);
                    this.field2475++;
                }
                this.field2487[arg1] = var3;
            } else {
                this.field2488 = false;
            }
            this.field2486.method1495(var3, -1);
            return this.field2482[var3.field2791];
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILob;I)V", line = 125)
    public static final void method1176(int arg0, int arg1, class292 arg2, int arg3) {
        if (arg3 != 0) {
            method1179(-65);
        }
        if (arg2.field4458 == 0) {
            arg2.field4605 = arg2.field4547;
        } else if (arg2.field4458 == 1) {
            arg2.field4605 = (arg0 - arg2.field4499) / 2 + arg2.field4547;
        } else if (arg2.field4458 == 2) {
            arg2.field4605 = arg0 - arg2.field4547 - arg2.field4499;
        } else if (arg2.field4458 == 3) {
            arg2.field4605 = arg2.field4547 * arg0 >> 14;
        } else if (arg2.field4458 == 4) {
            arg2.field4605 = (arg2.field4547 * arg0 >> 14) + (arg0 - arg2.field4499) / 2;
        } else {
            arg2.field4605 = arg0 - arg2.field4499 - (arg2.field4547 * arg0 >> 14);
        }
        field2484++;
        if (arg2.field4548 == 0) {
            arg2.field4580 = arg2.field4434;
        } else if (arg2.field4548 == 1) {
            arg2.field4580 = (arg1 - arg2.field4608) / 2 + arg2.field4434;
        } else if (arg2.field4548 == 2) {
            arg2.field4580 = arg1 - arg2.field4608 - arg2.field4434;
        } else if (arg2.field4548 == 3) {
            arg2.field4580 = arg2.field4434 * arg1 >> 14;
        } else if (arg2.field4548 == 4) {
            arg2.field4580 = (arg2.field4434 * arg1 >> 14) + (arg1 - arg2.field4608) / 2;
        } else {
            arg2.field4580 = arg1 - arg2.field4608 - (arg2.field4434 * arg1 >> 14);
        }
        if (!class31.field523 || !(client.method1786(arg2).field738 != 0 || arg2.field4490 == 0)) {
            return;
        }
        if (arg2.field4605 < 0) {
            arg2.field4605 = 0;
        } else if ((arg2.field4605 + arg2.field4499) > arg0) {
            arg2.field4605 = arg0 - arg2.field4499;
        }
        if (arg2.field4580 < 0) {
            arg2.field4580 = 0;
        } else if (arg1 < (arg2.field4608 + arg2.field4580)) {
            arg2.field4580 = arg1 - arg2.field4608;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)V", line = 197)
    public static final void method1177(byte arg0, int arg1) {
        if (class326.field5060 == 0) {
            class45.field769.method267(arg1, -114);
        } else {
            class147.field2371 = arg1;
        }
        field2480++;
        int var2 = -16 % ((arg0 + 32) / 61);
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V", line = 215)
    public final void method1178(int arg0) {
        for (int var2 = 0; var2 < this.field2474; var2++) {
            this.field2482[var2][0] = null;
            this.field2482[var2][1] = null;
            this.field2482[var2][2] = null;
            this.field2482[var2] = (int[][]) null;
        }
        this.field2487 = null;
        if (arg0 < -70) {
            this.field2482 = (int[][][]) null;
            this.field2486.method1489(200);
            this.field2486 = null;
            field2490++;
        }
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)Lnb;", line = 245)
    public static final class315 method1179(int arg0) {
        class315 var1 = new class315(class326.field5064, class52.field820, class246.field3811[0], class62.field962[0], class108.field1797[0], class3.field14[0], class270.field4198[0], class251.field3871);
        field2477++;
        class233.method1680((byte) -12);
        return arg0 < 24 ? (class315) null : var1;
    }
}
