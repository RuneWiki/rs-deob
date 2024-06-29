import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public abstract class class56 extends class379 {

    @OriginalMember(owner = "client!aea", name = "z", descriptor = "Z")
    public boolean field762;

    @OriginalMember(owner = "client!aea", name = "m", descriptor = "[Laea;")
    public class56[] field749;

    @OriginalMember(owner = "client!aea", name = "t", descriptor = "[Leba;")
    public static class615[] field756 = new class615[8];

    @OriginalMember(owner = "client!aea", name = "x", descriptor = "[I")
    public static int[] field760 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!aea", name = "r", descriptor = "Lhj;")
    public static class596 field754 = new class596(50, 3);

    @OriginalMember(owner = "client!aea", name = "C", descriptor = "I")
    public static int field765 = 0;

    @OriginalMember(owner = "client!aea", name = "h", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!aea", name = "i", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!aea", name = "k", descriptor = "I")
    public int field747;

    @OriginalMember(owner = "client!aea", name = "l", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!aea", name = "n", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!aea", name = "o", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!aea", name = "q", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!aea", name = "s", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!aea", name = "u", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!aea", name = "v", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!aea", name = "y", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!aea", name = "A", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!aea", name = "w", descriptor = "Lqk;")
    public class18 field759;

    @OriginalMember(owner = "client!aea", name = "p", descriptor = "Lop;")
    public class203 field752;

    @OriginalMember(owner = "client!aea", name = "B", descriptor = "Ltf;")
    public static class312 field764;

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(Z)V")
    public void method489(boolean arg0) {
        if (arg0) {
            method496(1, -65, -13, 109, true, -93, 113);
        }
        if (this.field762) {
            this.field752.method1307(false);
            this.field752 = null;
        } else {
            this.field759.method221(true);
            this.field759 = null;
        }
        field745++;
    }

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "(Z)V")
    public static void method490(boolean arg0) {
        field760 = null;
        field756 = null;
        field754 = null;
        field764 = null;
        if (!arg0) {
            field763 = -19;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(II)[I")
    public int[] method145(int arg0, int arg1) {
        if (arg0 != 0) {
            field760 = null;
        }
        field761++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)V")
    public void method491(int arg0, int arg1, int arg2) {
        field755++;
        int var4 = this.field747 == 255 ? arg1 : this.field747;
        if (this.field762) {
            this.field752 = new class203(var4, arg1, arg2);
        } else {
            this.field759 = new class18(var4, arg1, arg2);
        }
        if (arg0 != -24116) {
            this.method187((byte) -89, -89);
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(BILes;)V")
    public void method144(byte arg0, int arg1, class403 arg2) {
        field744++;
        if (arg0 >= -44) {
            this.method493((byte) -55);
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIB)[I")
    public final int[] method492(int arg0, int arg1, byte arg2) {
        field753++;
        if (arg2 < 47) {
            field763 = 104;
        }
        return this.field749[arg0].field762 ? this.field749[arg0].method145(0, arg1) : this.field749[arg0].method187((byte) 75, arg1)[0];
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V")
    public void method493(byte arg0) {
        field757++;
        int var2 = 43 / ((37 - arg0) / 62);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)I")
    public int method494(int arg0) {
        field751++;
        if (arg0 != -1) {
            method496(115, 52, 94, 11, true, 14, 18);
        }
        return -1;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(BI)[[I")
    public int[][] method187(byte arg0, int arg1) {
        field750++;
        if (arg0 < 35) {
            this.method187((byte) 89, -115);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(III)[[I")
    public final int[][] method495(int arg0, int arg1, int arg2) {
        field758++;
        int var4 = -30 / ((arg0 - 9) / 57);
        if (this.field749[arg2].field762) {
            int[] var5 = this.field749[arg2].method145(0, arg1);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field749[arg2].method187((byte) 87, arg1);
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIZII)V")
    public static final void method496(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field748++;
        if (!arg4) {
            field754 = null;
        }
        int var7 = class155.method1103(class187.field2268, arg0, false, class461.field6480);
        int var8 = class155.method1103(class187.field2268, arg1, false, class461.field6480);
        int var9 = class155.method1103(class471.field6572, arg5, false, class223.field2604);
        int var10 = class155.method1103(class471.field6572, arg2, false, class223.field2604);
        int var11 = class155.method1103(class187.field2268, arg0 + arg6, false, class461.field6480);
        int var12 = class155.method1103(class187.field2268, arg1 - arg6, !arg4, class461.field6480);
        for (int var13 = var7; var13 < var11; var13++) {
            class455.method2755(arg3, class4.field49[var13], (byte) 69, var10, var9);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class455.method2755(arg3, class4.field49[var14], (byte) 71, var10, var9);
        }
        int var15 = class155.method1103(class471.field6572, arg5 + arg6, false, class223.field2604);
        int var16 = class155.method1103(class471.field6572, arg2 - arg6, false, class223.field2604);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class4.field49[var17];
            class455.method2755(arg3, var18, (byte) 123, var15, var9);
            class455.method2755(arg3, var18, (byte) 39, var10, var16);
        }
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(I)I")
    public int method497(int arg0) {
        field746++;
        if (arg0 != 27738) {
            this.method492(83, 60, (byte) -12);
        }
        return -1;
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(IZ)V")
    public class56(int arg0, boolean arg1) {
        this.field762 = arg1;
        this.field749 = new class56[arg0];
    }
}
