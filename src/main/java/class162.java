import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class162 {

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    private int field2437 = -1;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    private int field2439 = 0;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "Lql;")
    private class87 field2444 = new class87();

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "Z")
    public boolean field2446 = false;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    private int field2442;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    private int field2433;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "[Lcj;")
    private class143[] field2443;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "[[[I")
    private int[][][] field2440;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "[I")
    public static int[] field2436 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "F")
    public static float field2434;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Ll;")
    public static class133 field2432;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Ltb;")
    public static class220 field2441;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "Lfn;")
    public static class300 field2445;

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(III)V", line = 187)
    public class162(int arg0, int arg1, int arg2) {
        this.field2442 = arg1;
        this.field2433 = arg0;
        this.field2443 = new class143[this.field2442];
        this.field2440 = new int[this.field2433][3][arg2];
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)[[I", line = 14)
    public final int[][] method1101(int arg0, boolean arg1) {
        field2435++;
        if (!arg1) {
            field2441 = (class220) null;
        }
        if (this.field2442 == this.field2433) {
            this.field2446 = this.field2443[arg0] == null;
            this.field2443[arg0] = class118.field1794;
            return this.field2440[arg0];
        } else if (this.field2433 == 1) {
            this.field2446 = this.field2437 != arg0;
            this.field2437 = arg0;
            return this.field2440[0];
        } else {
            class143 var3 = this.field2443[arg0];
            if (var3 == null) {
                this.field2446 = true;
                if (this.field2439 < this.field2433) {
                    var3 = new class143(arg0, this.field2439);
                    this.field2439++;
                } else {
                    class143 var4 = (class143) this.field2444.method635((byte) 73);
                    var3 = new class143(arg0, var4.field2219);
                    this.field2443[var4.field2224] = null;
                    var4.method403(1);
                }
                this.field2443[arg0] = var3;
            } else {
                this.field2446 = false;
            }
            this.field2444.method631(var3, false);
            return this.field2440[var3.field2219];
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 98)
    public static void method1102(int arg0) {
        if (arg0 != -32204) {
            field2445 = (class300) null;
        }
        field2445 = null;
        field2441 = null;
        field2436 = null;
        field2432 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)[[[I", line = 112)
    public final int[][][] method1103(byte arg0) {
        field2447++;
        if (this.field2442 != this.field2433) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 < 114) {
            return (int[][][]) ((int[][][]) null);
        } else {
            for (int var2 = 0; var2 < this.field2433; var2++) {
                this.field2443[var2] = class118.field1794;
            }
            return this.field2440;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIII)V", line = 135)
    public static final void method1104(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class282 var7 = new class282();
        var7.field4365 = arg1 / 128;
        var7.field4354 = arg2 / 128;
        var7.field4369 = arg3 / 128;
        var7.field4374 = arg4 / 128;
        var7.field4361 = arg0;
        var7.field4372 = arg1;
        var7.field4351 = arg2;
        var7.field4350 = arg3;
        var7.field4347 = arg4;
        var7.field4358 = arg5;
        var7.field4357 = arg6;
        class175.field2650[class206.field3169++] = var7;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V", line = 155)
    public final void method1105(int arg0) {
        field2448++;
        if (arg0 != 3466) {
            this.method1103((byte) -69);
        }
        for (int var2 = 0; var2 < this.field2433; var2++) {
            this.field2440[var2][0] = null;
            this.field2440[var2][1] = null;
            this.field2440[var2][2] = null;
            this.field2440[var2] = (int[][]) null;
        }
        this.field2443 = null;
        this.field2440 = (int[][][]) null;
        this.field2444.method634((byte) -87);
        this.field2444 = null;
    }
}
