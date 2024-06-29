import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public abstract class class263 extends class115 {

    @OriginalMember(owner = "client!vn", name = "A", descriptor = "[Lvn;")
    public class263[] field3929;

    @OriginalMember(owner = "client!vn", name = "y", descriptor = "Z")
    public boolean field3927;

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "[I")
    public static int[] field3925 = new int[1];

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public static int field3916 = 0;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "I")
    public int field3928;

    @OriginalMember(owner = "client!vn", name = "B", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!vn", name = "C", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!vn", name = "D", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "Ltc;")
    public class455 field3912;

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "Lok;")
    public static class74 field3921;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "Lib;")
    public class9 field3917;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)I")
    public int method400(int arg0) {
        if (arg0 != -31427) {
            this.field3912 = null;
        }
        field3932++;
        return -1;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)[I")
    public final int[] method1644(int arg0, int arg1, int arg2) {
        field3930++;
        if (arg0 != 0) {
            this.method748((byte) -52);
        }
        return this.field3929[arg1].field3927 ? this.field3929[arg1].method33(arg2, (byte) 109) : this.field3929[arg1].method34(arg2, (byte) -64)[0];
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)V")
    public void method398(boolean arg0) {
        field3926++;
        if (!arg0) {
            this.method34(111, (byte) -92);
        }
        if (this.field3927) {
            this.field3917.method38(0);
            this.field3917 = null;
        } else {
            this.field3912.method2648((byte) -122);
            this.field3912 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(B)V")
    public void method748(byte arg0) {
        if (arg0 != 110) {
            this.field3929 = null;
        }
        field3931++;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IB)[I")
    public int[] method33(int arg0, byte arg1) {
        field3913++;
        if (arg1 <= 40) {
            this.method1646(-60, -128, 1);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lya;JI)V")
    public static final void method1645(class11 arg0, long arg1, int arg2) {
        class335.field5176 = class520.field7638;
        class279.field4218 = 0;
        field3923++;
        class520.field7638 = arg2;
        long var4 = class381.method2281((byte) 106);
        for (class387 var6 = (class387) class534.field7857.method3089(-108); var6 != null; var6 = (class387) class534.field7857.method3088((byte) -65)) {
            if (var6.method2315(arg0, arg1)) {
                class279.field4218++;
            }
        }
        if (class404.field6095 && (arg1 % 100L) == 0L) {
            System.out.println("Particle system count: " + class534.field7857.method3082((byte) 92) + ", running: " + class279.field4218 + ". Particles: " + class520.field7638 + ". Time taken: " + (class381.method2281((byte) -122) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(IB)[[I")
    public int[][] method34(int arg0, byte arg1) {
        if (arg1 > -45) {
            this.method398(false);
        }
        field3911++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(III)[[I")
    public final int[][] method1646(int arg0, int arg1, int arg2) {
        field3918++;
        if (arg1 != 2) {
            this.method748((byte) 57);
        }
        if (this.field3929[arg0].field3927) {
            int[] var4 = this.field3929[arg0].method33(arg2, (byte) 47);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3929[arg0].method34(arg2, (byte) -89);
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(Z)I")
    public int method555(boolean arg0) {
        if (arg0) {
            method1647(62);
        }
        field3920++;
        return -1;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IZLgk;)V")
    public void method32(int arg0, boolean arg1, class468 arg2) {
        if (arg1) {
            field3915++;
        }
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V")
    public static void method1647(int arg0) {
        field3925 = null;
        field3921 = null;
        if (arg0 != -5880) {
            field3916 = 78;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IBI)V")
    public void method399(int arg0, byte arg1, int arg2) {
        field3914++;
        int var4 = this.field3928 == 255 ? arg2 : this.field3928;
        if (this.field3927) {
            this.field3917 = new class9(var4, arg2, arg0);
        } else {
            this.field3912 = new class455(var4, arg2, arg0);
        }
        int var5 = -17 % ((arg1 - 44) / 60);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)I")
    public static final int method1648(int arg0, int arg1) {
        field3922++;
        return arg1 == 0 ? arg0 >>> 10 : -6;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IZ)V")
    public class263(int arg0, boolean arg1) {
        this.field3929 = new class263[arg0];
        this.field3927 = arg1;
    }
}
