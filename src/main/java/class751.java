import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public abstract class class751 extends class540 {

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "[Lrl;")
    public class751[] field10416;

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "Z")
    public boolean field10415;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "Lga;")
    public static class420 field10412 = new class420();

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field10404;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field10406;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public static int field10407;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field10408;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    public static int field10410;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    public static int field10411;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
    public static int field10413;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
    public int field10414;

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "I")
    public static int field10417;

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "I")
    public static int field10418;

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "I")
    public static int field10419;

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "I")
    public static int field10421;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "Lnf;")
    public class601 field10409;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "Lraa;")
    public class631 field10405;

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "Lip;")
    public static class734 field10420;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)[[I")
    public final int[][] method4172(int arg0, int arg1, int arg2) {
        field10406++;
        if (arg2 != 1) {
            field10412 = null;
        }
        if (this.field10416[arg0].field10415) {
            int[] var4 = this.field10416[arg0].method365(arg1, 4095);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field10416[arg0].method147(arg1, (byte) 57);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IBI)[I")
    public final int[] method4173(int arg0, byte arg1, int arg2) {
        field10417++;
        if (arg1 >= -110) {
            method4174((byte) -70);
        }
        return this.field10416[arg2].field10415 ? this.field10416[arg2].method365(arg0, 4095) : this.field10416[arg2].method147(arg0, (byte) 57)[0];
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
    public void method1454(byte arg0) {
        field10407++;
        if (arg0 < 123) {
            method4174((byte) 29);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)I")
    public int method317(int arg0) {
        if (arg0 != -1) {
            this.field10409 = null;
        }
        field10419++;
        return -1;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILrv;I)V")
    public void method309(int arg0, class120 arg1, int arg2) {
        field10404++;
        int var4 = 53 / ((25 - arg0) / 63);
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
    public void method313(int arg0) {
        if (this.field10415) {
            this.field10405.method3602(-126);
            this.field10405 = null;
        } else {
            this.field10409.method3477(-78);
            this.field10409 = null;
        }
        field10411++;
        if (arg0 != -1) {
            this.method311(-13, 75, -126);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)[[I")
    public int[][] method147(int arg0, byte arg1) {
        field10410++;
        if (arg1 != 57) {
            method4174((byte) 81);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)[I")
    public int[] method365(int arg0, int arg1) {
        field10418++;
        if (arg1 != 4095) {
            this.method3296((byte) -22);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V")
    public static void method4174(byte arg0) {
        field10420 = null;
        field10412 = null;
        if (arg0 <= 21) {
            method4174((byte) -34);
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(III)V")
    public void method311(int arg0, int arg1, int arg2) {
        field10421++;
        int var4 = this.field10414 == 255 ? arg2 : this.field10414;
        int var5 = -119 / ((arg1 - 13) / 35);
        if (this.field10415) {
            this.field10405 = new class631(var4, arg2, arg0);
        } else {
            this.field10409 = new class601(var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)I")
    public int method3296(byte arg0) {
        field10408++;
        if (arg0 != 65) {
            this.field10415 = true;
        }
        return -1;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(IZ)V")
    public class751(int arg0, boolean arg1) {
        this.field10416 = new class751[arg0];
        this.field10415 = arg1;
    }
}
