import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class245 {

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    private int field4358 = 0;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    private int field4361 = -1;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Ldg;")
    private class317 field4362 = new class317();

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "Z")
    public boolean field4363 = false;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    private int field4357;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    private int field4348;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "[[[I")
    private int[][][] field4355;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "[Lw;")
    private class269[] field4360;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lgf;")
    public static class8 field4347 = null;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Lud;")
    public static class279 field4353 = class130.method1024("<col=ffffff> )4 ", 255);

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "[I")
    public static int[] field4352;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)[[I", line = 5)
    public final int[][] method1746(byte arg0, int arg1) {
        field4351++;
        int var3 = 80 / ((-arg0 - 44) / 33);
        if (this.field4357 == this.field4348) {
            this.field4363 = this.field4360[arg1] == null;
            this.field4360[arg1] = class8.field336;
            return this.field4355[arg1];
        } else if (this.field4357 == 1) {
            this.field4363 = this.field4361 != arg1;
            this.field4361 = arg1;
            return this.field4355[0];
        } else {
            class269 var4 = this.field4360[arg1];
            if (var4 == null) {
                this.field4363 = true;
                if (this.field4357 > this.field4358) {
                    var4 = new class269(arg1, this.field4358);
                    this.field4358++;
                } else {
                    class269 var5 = (class269) this.field4362.method2245(-101);
                    var4 = new class269(arg1, var5.field4814);
                    this.field4360[var5.field4812] = null;
                    var5.method2221(true);
                }
                this.field4360[arg1] = var4;
            } else {
                this.field4363 = false;
            }
            this.field4362.method2249(var4, (byte) 98);
            return this.field4355[var4.field4814];
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)[[[I", line = 73)
    public final int[][][] method1747(int arg0) {
        field4359++;
        if (this.field4357 != this.field4348) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 != 1) {
            method1750(-92, (short) -95, -16L, (byte) 78, 108, (class279) null, (class279) null, -34);
        }
        while (this.field4357 > var2) {
            this.field4360[var2] = class8.field336;
            var2++;
        }
        return this.field4355;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V", line = 99)
    public final void method1748(int arg0) {
        for (int var2 = 0; var2 < this.field4357; var2++) {
            this.field4355[var2][0] = null;
            this.field4355[var2][1] = null;
            this.field4355[var2][2] = null;
            this.field4355[var2] = (int[][]) null;
        }
        field4354++;
        this.field4355 = (int[][][]) null;
        this.field4360 = null;
        if (arg0 <= 83) {
            this.method1747(-8);
        }
        this.field4362.method2243(80);
        this.field4362 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 125)
    public static void method1749(byte arg0) {
        int var1 = -119 % ((arg0 - 3) / 34);
        field4353 = null;
        field4352 = null;
        field4347 = null;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(III)V", line = 216)
    public class245(int arg0, int arg1, int arg2) {
        this.field4357 = arg0;
        this.field4348 = arg1;
        this.field4355 = new int[this.field4357][3][arg2];
        this.field4360 = new class269[this.field4348];
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ISJBILud;Lud;I)V", line = 168)
    public static final void method1750(int arg0, short arg1, long arg2, byte arg3, int arg4, class279 arg5, class279 arg6, int arg7) {
        int var9 = 120 % ((arg3 - 18) / 63);
        field4349++;
        if (class238.field4184 || class194.field3488 >= 500) {
            return;
        }
        class171.field3089[class194.field3488] = arg6;
        class184.field3373[class194.field3488] = arg5;
        class75.field1469[class194.field3488] = arg0 == -1 ? class222.field3935 : arg0;
        class271.field4828[class194.field3488] = arg1;
        class154.field2790[class194.field3488] = arg2;
        class212.field3722[class194.field3488] = arg4;
        class304.field5400[class194.field3488] = arg7;
        class194.field3488++;
    }
}
