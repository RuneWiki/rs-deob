import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class503 {

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    private int field6657 = -1;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    private int field6664 = 0;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "Lae;")
    private class40 field6662 = new class40();

    @OriginalMember(owner = "client!td", name = "p", descriptor = "Z")
    public boolean field6667 = false;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    private int field6666;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    private int field6655;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "[Ljk;")
    private class179[] field6652;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "[[[I")
    private int[][][] field6659;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Lwp;")
    public static class453 field6654 = new class453(89, -1);

    @OriginalMember(owner = "client!td", name = "n", descriptor = "[J")
    public static long[] field6665 = new long[32];

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field6663 = -2;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "Lrga;")
    public static class280 field6660 = new class280(42, 2);

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IBJI)V")
    public static final void method2705(int arg0, byte arg1, long arg2, int arg3) {
        field6656++;
        int var5 = (int) arg2 >> 14 & 0x1F;
        int var6 = (int) arg2 >> 20 & 0x3;
        int var7 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
        if (arg1 != -42) {
            return;
        }
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class413.method2202(arg1 ^ 0xFFFFFFD7, var6, var5, 0, 0, true, arg0, arg3, 0);
            return;
        }
        class441 var8 = class428.field5352.method3138((byte) 96, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field5525;
            var9 = var8.field5534;
        } else {
            var9 = var8.field5525;
            var10 = var8.field5534;
        }
        int var11 = var8.field5556;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class413.method2202(1, 0, 0, var9, var11, true, arg0, arg3, var10);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)[[I")
    public final int[][] method2706(int arg0, int arg1) {
        field6661++;
        if (arg1 > -14) {
            this.field6657 = 30;
        }
        if (this.field6666 == this.field6655) {
            this.field6667 = this.field6652[arg0] == null;
            this.field6652[arg0] = class669.field9430;
            return this.field6659[arg0];
        } else if (this.field6655 == 1) {
            this.field6667 = this.field6657 != arg0;
            this.field6657 = arg0;
            return this.field6659[0];
        } else {
            class179 var3 = this.field6652[arg0];
            if (var3 == null) {
                this.field6667 = true;
                if (this.field6655 <= this.field6664) {
                    class179 var4 = (class179) this.field6662.method248(false);
                    var3 = new class179(arg0, var4.field2317);
                    this.field6652[var4.field2315] = null;
                    var4.method1871(-105);
                } else {
                    var3 = new class179(arg0, this.field6664);
                    this.field6664++;
                }
                this.field6652[arg0] = var3;
            } else {
                this.field6667 = false;
            }
            this.field6662.method236(var3, (byte) 62);
            return this.field6659[var3.field2317];
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method2707(int arg0) {
        field6653++;
        if (this.field6666 != this.field6655) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field6655; var2++) {
            this.field6652[var2] = class669.field9430;
        }
        return this.field6659;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public static void method2708(int arg0) {
        if (arg0 != Integer.MAX_VALUE) {
            method2708(-24);
        }
        field6654 = null;
        field6665 = null;
        field6660 = null;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
    public final void method2709(int arg0) {
        field6658++;
        if (arg0 >= -7) {
            method2705(58, (byte) 85, 59L, -107);
        }
        for (int var2 = 0; var2 < this.field6655; var2++) {
            this.field6659[var2][0] = null;
            this.field6659[var2][1] = null;
            this.field6659[var2][2] = null;
            this.field6659[var2] = null;
        }
        this.field6652 = null;
        this.field6659 = null;
        this.field6662.method247(2);
        this.field6662 = null;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(III)V")
    public class503(int arg0, int arg1, int arg2) {
        this.field6666 = arg1;
        this.field6655 = arg0;
        this.field6652 = new class179[this.field6666];
        this.field6659 = new int[this.field6655][3][arg2];
    }
}
