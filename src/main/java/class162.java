import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class162 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    private int field2572 = 0;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    private int field2583 = -1;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "Lab;")
    private class269 field2581 = new class269();

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "Z")
    public boolean field2591 = false;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    private int field2587;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    private int field2574;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "[Lo;")
    private class14[] field2573;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "[[[I")
    private int[][][] field2590;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field2576 = 0;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public static int field2582 = 1;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "[[Z")
    public static boolean[][] field2588;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public final void method1124(int arg0) {
        for (int var2 = arg0; var2 < this.field2587; var2++) {
            this.field2590[var2][0] = null;
            this.field2590[var2][1] = null;
            this.field2590[var2][2] = null;
            this.field2590[var2] = null;
        }
        this.field2590 = null;
        field2578++;
        this.field2573 = null;
        this.field2581.method1805(-729782270);
        this.field2581 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)V")
    public static final void method1125(int arg0, int arg1, int arg2) {
        class101.field1367 = true;
        class187.field2979 = arg0;
        class71.field903 = arg1;
        class155.field2428 = arg2;
        class155.field2458 = -1;
        class115.field1640 = -1;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)[[I")
    public final int[][] method1126(int arg0, int arg1) {
        field2580++;
        if (arg0 != 1) {
            this.field2574 = 59;
        }
        if (this.field2587 == this.field2574) {
            this.field2591 = this.field2573[arg1] == null;
            this.field2573[arg1] = class62.field815;
            return this.field2590[arg1];
        } else if (this.field2587 == 1) {
            this.field2591 = this.field2583 != arg1;
            this.field2583 = arg1;
            return this.field2590[0];
        } else {
            class14 var3 = this.field2573[arg1];
            if (var3 == null) {
                this.field2591 = true;
                if (this.field2587 <= this.field2572) {
                    class14 var4 = (class14) this.field2581.method1806(1);
                    var3 = new class14(arg1, var4.field178);
                    this.field2573[var4.field181] = null;
                    var4.method1673(14510);
                } else {
                    var3 = new class14(arg1, this.field2572);
                    this.field2572++;
                }
                this.field2573[arg1] = var3;
            } else {
                this.field2591 = false;
            }
            this.field2581.method1810(var3, (byte) -34);
            return this.field2590[var3.field178];
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method1127(int arg0) {
        field2579++;
        if (this.field2587 != this.field2574) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 >= -50) {
            this.method1127(-85);
        }
        for (int var2 = 0; var2 < this.field2587; var2++) {
            this.field2573[var2] = class62.field815;
        }
        return this.field2590;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
    public static void method1128(boolean arg0) {
        field2588 = null;
        if (arg0) {
            method1129((class137) null, (byte) 52, 40);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Leh;BI)Lib;")
    public static final class56 method1129(class137 arg0, byte arg1, int arg2) {
        field2584++;
        if (class52.method300(94, arg2, arg0)) {
            return arg1 == -18 ? class285.method1909((byte) -122) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lpd;Z)V")
    public static final void method1130(class96 arg0, boolean arg1) {
        field2589++;
        while (true) {
            while (arg0.field1218.length > arg0.field1228) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method584(255) == 1) {
                    var2 = true;
                    var4 = arg0.method584(255);
                    var3 = arg0.method584(255);
                }
                int var5 = arg0.method584(255);
                int var6 = arg0.method584(255);
                int var7 = var5 * 64 - class105.field1413;
                int var8 = class7.field88 - (var6 * 64 - class42.field524) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && (var7 + 63) < class44.field562 && var8 < class7.field88) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var4 * 8 <= var11 && (var4 * 8 + 8) > var11 && var12 >= var3 * 8 && var3 * 8 + 8 > var12) {
                                byte var13 = arg0.method587(126);
                                if (var13 != 0) {
                                    if (class210.field3349[var10][var9] == null) {
                                        class210.field3349[var10][var9] = new byte[4096];
                                    }
                                    class210.field3349[var10][var9][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method587(21);
                                    if (class198.field3139[var10][var9] == null) {
                                        class198.field3139[var10][var9] = new byte[4096];
                                    }
                                    class198.field3139[var10][var9][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method587(122);
                        if (var16 != 0) {
                            arg0.field1228++;
                        }
                    }
                }
            }
            if (!arg1) {
                method1125(96, -71, -43);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(III)V")
    public class162(int arg0, int arg1, int arg2) {
        this.field2587 = arg0;
        this.field2574 = arg1;
        this.field2573 = new class14[this.field2574];
        this.field2590 = new int[this.field2587][3][arg2];
    }
}
