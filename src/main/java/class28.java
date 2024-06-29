import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class28 {

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    private int field359 = -1;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    private int field370 = 0;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Lab;")
    private class148 field357 = new class148();

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "Z")
    public boolean field374 = false;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    private int field364;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "[[[I")
    private int[][][] field366;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "[Lki;")
    private class63[] field362;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field358 = -1;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "[I")
    public static int[] field361 = new int[32];

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field369 = -1;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "Lhh;")
    public static class120 field371 = new class120();

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field373 = -1;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field375 = 0;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI)V")
    public static final void method180(boolean arg0, int arg1) {
        field363++;
        byte[][] var2 = class287.field4548;
        if (arg1 != 31365) {
            method185(false);
        }
        byte var3 = 4;
        for (int var4 = 0; var4 < var3; var4++) {
            class156.method1038(false);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class239.field3652[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0x7) >> 1;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class274.field4242.length; var13++) {
                                if (class274.field4242[var13] == var12 && var2[var13] != null) {
                                    class295.method1973((byte) -21, var9, var4, class122.field1703, (var11 & 0x7) * 8, var6 * 8, var2[var13], var8, arg0, var5 * 8, (var10 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public final void method181(int arg0) {
        int var2 = 0;
        if (arg0 != 2) {
            this.method181(-37);
        }
        while (var2 < this.field364) {
            this.field366[var2][0] = null;
            this.field366[var2][1] = null;
            this.field366[var2][2] = null;
            this.field366[var2] = null;
            var2++;
        }
        this.field362 = null;
        this.field366 = null;
        field372++;
        this.field357.method989((byte) 96);
        this.field357 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(JI)V")
    public static final void method182(long arg0, int arg1) {
        field360++;
        if (arg1 < 119 || arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class228.method1510((byte) 79, arg0 - 1L);
            class228.method1510((byte) 54, 1L);
        } else {
            class228.method1510((byte) 83, arg0);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method183(int arg0) {
        field365++;
        if (this.field367 != this.field364) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field364; var2++) {
            this.field362[var2] = class111.field1614;
        }
        return this.field366;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)[[I")
    public final int[][] method184(byte arg0, int arg1) {
        field368++;
        if (arg0 != -21) {
            this.method181(44);
        }
        if (this.field367 == this.field364) {
            this.field374 = this.field362[arg1] == null;
            this.field362[arg1] = class111.field1614;
            return this.field366[arg1];
        } else if (this.field364 == 1) {
            this.field374 = this.field359 != arg1;
            this.field359 = arg1;
            return this.field366[0];
        } else {
            class63 var3 = this.field362[arg1];
            if (var3 == null) {
                this.field374 = true;
                if (this.field364 > this.field370) {
                    var3 = new class63(arg1, this.field370);
                    this.field370++;
                } else {
                    class63 var4 = (class63) this.field357.method992(3);
                    var3 = new class63(arg1, var4.field869);
                    this.field362[var4.field868] = null;
                    var4.method1115(-127);
                }
                this.field362[arg1] = var3;
            } else {
                this.field374 = false;
            }
            this.field357.method991(var3, 67);
            return this.field366[var3.field869];
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
    public static void method185(boolean arg0) {
        if (!arg0) {
            method180(true, 34);
        }
        field361 = null;
        field371 = null;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(III)V")
    public class28(int arg0, int arg1, int arg2) {
        this.field364 = arg0;
        this.field367 = arg1;
        this.field366 = new int[this.field364][3][arg2];
        this.field362 = new class63[this.field367];
    }
}
