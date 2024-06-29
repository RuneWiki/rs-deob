import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public abstract class class45 extends class320 {

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "[Lqn;")
    public class45[] field845;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "Z")
    public boolean field844;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "[Lpq;")
    public static class128[] field835 = new class128[8];

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
    public static int field839 = -1;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "Z")
    public static boolean field853 = false;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public int field836;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "Luq;")
    public class111 field833;

    @OriginalMember(owner = "client!qn", name = "G", descriptor = "Lei;")
    public class116 field854;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "Lci;")
    public static class311 field837;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "[Lf;")
    public static class529[] field843;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "[S")
    public static short[] field834;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lcu;II)V", line = 5)
    public void method37(class145 arg0, int arg1, int arg2) {
        if (arg1 != -26471) {
            this.method433(10);
        }
        field848++;
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V", line = 17)
    public void method433(int arg0) {
        if (arg0 != 255) {
            this.method433(49);
        }
        if (this.field844) {
            this.field854.method860(1);
            this.field854 = null;
        } else {
            this.field833.method828(true);
            this.field833 = null;
        }
        field850++;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)[I", line = 51)
    public final int[] method434(int arg0, int arg1, int arg2) {
        field841++;
        int var4 = -56 / ((arg2 - 54) / 58);
        return this.field845[arg0].field844 ? this.field845[arg0].method35(0, arg1) : this.field845[arg0].method49(8, arg1)[0];
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)[I", line = 73)
    public int[] method35(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method434(34, 103, 0);
        }
        field852++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BII)V", line = 86)
    public void method435(byte arg0, int arg1, int arg2) {
        field849++;
        if (arg0 < 102) {
            this.field845 = null;
        }
        int var4 = this.field836 == 255 ? arg1 : this.field836;
        if (this.field844) {
            this.field854 = new class116(var4, arg1, arg2);
        } else {
            this.field833 = new class111(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)I", line = 110)
    public int method436(byte arg0) {
        field846++;
        if (arg0 != -15) {
            field853 = true;
        }
        return -1;
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)V", line = 129)
    public void method38(int arg0) {
        if (arg0 == 4095) {
            field851++;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(III)[[I", line = 139)
    public final int[][] method437(int arg0, int arg1, int arg2) {
        field838++;
        int var4 = -77 % (-arg2 / 49);
        if (this.field845[arg0].field844) {
            int[] var5 = this.field845[arg0].method35(0, arg1);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field845[arg0].method49(8, arg1);
        }
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(B)I", line = 175)
    public int method438(byte arg0) {
        field842++;
        int var2 = 46 % ((arg0 - 26) / 61);
        return -1;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(II)[[I", line = 189)
    public int[][] method49(int arg0, int arg1) {
        if (arg0 != 8) {
            field834 = null;
        }
        field847++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(B)V", line = 202)
    public static void method439(byte arg0) {
        if (arg0 < -91) {
            field835 = null;
            field834 = null;
            field843 = null;
            field837 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(IZ)V", line = 222)
    public class45(int arg0, boolean arg1) {
        this.field845 = new class45[arg0];
        this.field844 = arg1;
    }
}
