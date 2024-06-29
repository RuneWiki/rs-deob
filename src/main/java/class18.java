import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class18 extends class101 {

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "Z")
    public boolean field347 = false;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "Lph;")
    private class149 field338;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "Z")
    public boolean field344;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "Z")
    public boolean field346;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    public int field329;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "client!bh", name = "X", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    private int field340;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "Ltg;")
    public static class184 field331 = class135.method812("Stufe)2", 3);

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "Z")
    public static boolean field328 = false;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "Ltg;")
    public static class184 field335 = class135.method812("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 3);

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
    public static int field332 = -1;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "[I")
    public static int[] field336 = new int[128];

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "Lh;")
    public static class69 field342 = new class69();

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "F")
    private float field339;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!bh", name = "Y", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "Lvb;")
    public static class197 field350;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "[I")
    private int[] field334;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(B)V")
    public static void method116(byte arg0) {
        if (arg0 != -98) {
            method116((byte) -19);
        }
        field331 = null;
        field342 = null;
        field336 = null;
        field335 = null;
        field350 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILvb;FLtf;)[I")
    public final int[] method117(int arg0, int arg1, class197 arg2, float arg3, class183 arg4) {
        field330++;
        if (this.field334 == null || this.field339 != arg3) {
            if (!this.field338.method912(arg4, (byte) -127, arg2)) {
                return null;
            }
            int var6 = arg0 >= this.field329 ? this.field329 : arg0;
            this.field334 = this.field338.method911(true, arg2, var6, (double) arg3, var6, arg4, true);
            this.field339 = arg3;
        }
        if (arg1 != 22127) {
            method119(-27, -8, 117, -54);
        }
        return this.field334;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILtf;ILvb;)[I")
    public final int[] method118(int arg0, class183 arg1, int arg2, class197 arg3) {
        field348++;
        if (!this.field338.method912(arg1, (byte) -125, arg3)) {
            return null;
        } else if (arg0 == 2) {
            int var5 = arg2 < this.field329 ? arg2 : this.field329;
            return this.field338.method911(true, arg3, var5, 1.0D, var5, arg1, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)Z")
    public static final boolean method119(int arg0, int arg1, int arg2, int arg3) {
        if (class127.method777(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class127.method766(var4 + 1, class131.field2380[arg0][arg1][arg2] + arg3, var5 + 1) && class127.method766(var4 + 128 - 1, class131.field2380[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class127.method766(var4 + 128 - 1, class131.field2380[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class127.method766(var4 + 1, class131.field2380[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ltf;BLvb;)Z")
    public final boolean method120(class183 arg0, byte arg1, class197 arg2) {
        if (arg1 != -108) {
            field331 = null;
        }
        field352++;
        return this.field338.method912(arg0, (byte) -117, arg2);
    }

    @OriginalMember(owner = "client!bh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field343++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
    public final void method121(int arg0, int arg1) {
        field349++;
        if (this.field334 == null || this.field340 == arg0 && this.field345 == 0) {
            return;
        }
        if (class133.field2406 == null || class133.field2406.length < this.field334.length) {
            class133.field2406 = new int[this.field334.length];
        }
        int var3 = this.field334.length == 4096 ? 64 : 128;
        int var4 = var3 - 1;
        int var5 = arg1 * var3 * this.field333;
        int var6 = this.field337 * arg1;
        if (this.field340 == 2) {
            var5 = -var5;
        }
        int var7 = this.field334.length;
        int var8 = var7 - 1;
        if (this.field345 == 1) {
            var6 = -var6;
        }
        for (int var9 = 0; var9 < var7; var9 += var3) {
            int var11 = var8 & var5 + var9;
            for (int var12 = 0; var12 < var3; var12++) {
                int var13 = var9 + var12;
                int var14 = (var4 & var6 + var12) + var11;
                class133.field2406[var13] = this.field334[var14];
            }
        }
        int[] var10 = this.field334;
        this.field334 = class133.field2406;
        class133.field2406 = var10;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lka;)V")
    public class18(class97 arg0) {
        this.field338 = new class149(arg0);
        int var2 = arg0.method588((byte) -124);
        this.field344 = (var2 & 0x2) != 0;
        this.field346 = (var2 & 0x1) != 0;
        this.field329 = arg0.method588((byte) -96);
        this.field341 = arg0.method611(false);
        this.field351 = arg0.method588((byte) -39);
        if (this.field351 == 255) {
            this.field351 = 256;
        }
        int var3 = arg0.method588((byte) -118);
        int var4 = arg0.method588((byte) -116);
        this.field333 = (var4 & 0x3F) - 6;
        this.field340 = var4 >> 6 & 0x3;
        int var5 = var2 >> 3 & 0x3;
        this.field337 = (var3 & 0x3F) - 6;
        this.field345 = var3 >> 6 & 0x3;
        arg0.method588((byte) -73);
        arg0.method588((byte) -104);
        arg0.method588((byte) -53);
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class18() {
        this.field338 = new class149();
        this.field346 = true;
        this.field329 = 1;
    }
}
