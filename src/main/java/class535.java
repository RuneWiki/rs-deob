import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public abstract class class535 extends class42 {

    @OriginalMember(owner = "client!pn", name = "A", descriptor = "[Lpn;")
    public class535[] field7886;

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "Z")
    public boolean field7878;

    @OriginalMember(owner = "client!pn", name = "w", descriptor = "Loe;")
    public static class137 field7882 = new class137(16);

    @OriginalMember(owner = "client!pn", name = "C", descriptor = "Z")
    public static boolean field7888 = false;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public static int field7874;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
    public static int field7875;

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
    public static int field7877;

    @OriginalMember(owner = "client!pn", name = "u", descriptor = "I")
    public static int field7880;

    @OriginalMember(owner = "client!pn", name = "v", descriptor = "I")
    public static int field7881;

    @OriginalMember(owner = "client!pn", name = "x", descriptor = "I")
    public static int field7883;

    @OriginalMember(owner = "client!pn", name = "y", descriptor = "I")
    public static int field7884;

    @OriginalMember(owner = "client!pn", name = "B", descriptor = "I")
    public static int field7887;

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
    public int field7889;

    @OriginalMember(owner = "client!pn", name = "E", descriptor = "I")
    public static int field7890;

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "Lme;")
    public class133 field7885;

    @OriginalMember(owner = "client!pn", name = "t", descriptor = "Lhc;")
    public class96 field7879;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BII)[[I")
    public final int[][] method3157(byte arg0, int arg1, int arg2) {
        field7890++;
        if (arg0 != 67) {
            this.field7885 = null;
        }
        if (this.field7886[arg2].field7878) {
            int[] var4 = this.field7886[arg2].method65(arg1, 1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field7886[arg2].method61(-123, arg1);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)I")
    public int method485(int arg0) {
        if (arg0 >= -68) {
            this.method3158(14, 56, -35);
        }
        field7874++;
        return -1;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)I")
    public int method740(byte arg0) {
        int var2 = 122 % ((arg0 - 36) / 46);
        field7877++;
        return -1;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
    public void method484(int arg0) {
        if (this.field7878) {
            this.field7885.method970((byte) 19);
            this.field7885 = null;
        } else {
            this.field7879.method730((byte) 40);
            this.field7879 = null;
        }
        if (arg0 == 806) {
            field7883++;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)[[I")
    public int[][] method61(int arg0, int arg1) {
        field7876++;
        if (arg0 >= -116) {
            this.method485(-107);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZI)V")
    public void method742(int arg0, boolean arg1, int arg2) {
        field7884++;
        int var4 = this.field7889 == 255 ? arg0 : this.field7889;
        if (this.field7878) {
            this.field7885 = new class133(var4, arg0, arg2);
        } else {
            this.field7879 = new class96(var4, arg0, arg2);
        }
        if (arg1) {
            this.method485(100);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)[I")
    public final int[] method3158(int arg0, int arg1, int arg2) {
        field7875++;
        int var4 = 43 % ((-arg0 - 1) / 62);
        return this.field7886[arg1].field7878 ? this.field7886[arg1].method65(arg2, 1) : this.field7886[arg1].method61(-120, arg2)[0];
    }

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "(B)V")
    public static void method3159(byte arg0) {
        int var1 = -69 / ((-arg0 - 72) / 32);
        field7882 = null;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)[I")
    public int[] method65(int arg0, int arg1) {
        if (arg1 != 1) {
            method3159((byte) -24);
        }
        field7881++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILwn;I)V")
    public void method60(int arg0, class519 arg1, int arg2) {
        if (arg2 == -6232) {
            field7887++;
        }
    }

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "(B)V")
    public void method66(byte arg0) {
        if (arg0 < 111) {
            field7888 = false;
        }
        field7880++;
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(IZ)V")
    public class535(int arg0, boolean arg1) {
        this.field7886 = new class535[arg0];
        this.field7878 = arg1;
    }
}
