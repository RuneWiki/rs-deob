import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class300 {

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "[I")
    private int[] field4660 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public int field4662 = -1;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "Z")
    public boolean field4665 = false;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4645 = "wave:";

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field4663 = 0;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "Lbe;")
    public static class267 field4654;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "[I")
    private int[] field4652;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "[S")
    private short[] field4653;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "[S")
    private short[] field4659;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "[S")
    private short[] field4661;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "[S")
    private short[] field4666;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILug;)V", line = 11)
    private final void method2160(int arg0, int arg1, class25 arg2) {
        int var4 = 100 / ((arg1 + 30) / 47);
        if (arg0 == 1) {
            this.field4662 = arg2.method281(20);
        } else if (arg0 == 2) {
            int var5 = arg2.method281(40);
            this.field4652 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field4652[var6] = arg2.method314((byte) 118);
            }
        } else if (arg0 == 3) {
            this.field4665 = true;
        } else if (arg0 == 40) {
            int var7 = arg2.method281(-126);
            this.field4653 = new short[var7];
            this.field4659 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4653[var8] = (short) arg2.method314((byte) 93);
                this.field4659[var8] = (short) arg2.method314((byte) 61);
            }
        } else if (arg0 == 41) {
            int var9 = arg2.method281(-126);
            this.field4666 = new short[var9];
            this.field4661 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field4661[var10] = (short) arg2.method314((byte) 87);
                this.field4666[var10] = (short) arg2.method314((byte) 31);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field4660[arg0 - 60] = arg2.method314((byte) 33);
        }
        field4644++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)Ld;", line = 89)
    public final class40 method2161(int arg0) {
        field4658++;
        class40[] var2 = new class40[5];
        int var3 = 0;
        for (int var4 = arg0; var4 < 5; var4++) {
            if (this.field4660[var4] != -1) {
                var2[var3++] = class40.method415(class131.field2223, this.field4660[var4], 0);
            }
        }
        class40 var5 = new class40(var2, var3);
        if (this.field4653 != null) {
            for (int var6 = 0; var6 < this.field4653.length; var6++) {
                var5.method421(this.field4653[var6], this.field4659[var6]);
            }
        }
        if (this.field4661 != null) {
            for (int var7 = 0; var7 < this.field4661.length; var7++) {
                var5.method412(this.field4661[var7], this.field4666[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V", line = 144)
    public static void method2162(int arg0) {
        if (arg0 != 0) {
            field4664 = -60;
        }
        field4654 = null;
        field4645 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILug;)V", line = 155)
    public final void method2163(int arg0, class25 arg1) {
        field4656++;
        while (true) {
            int var3 = arg1.method281(-125);
            if (var3 == 0) {
                if (arg0 != -6) {
                    field4663 = -53;
                }
                return;
            }
            this.method2160(var3, arg0 - 111, arg1);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)Z", line = 182)
    public final boolean method2164(byte arg0) {
        field4657++;
        if (arg0 != -7) {
            this.field4662 = -62;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field4660[var3] != -1 && !class131.field2223.method210(0, true, this.field4660[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)Ld;", line = 212)
    public final class40 method2165(boolean arg0) {
        field4649++;
        if (this.field4652 == null) {
            return null;
        }
        class40[] var2 = new class40[this.field4652.length];
        for (int var3 = 0; var3 < this.field4652.length; var3++) {
            var2[var3] = class40.method415(class131.field2223, this.field4652[var3], 0);
        }
        if (!arg0) {
            this.field4652 = (int[]) null;
        }
        class40 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class40(var2, var2.length);
        }
        if (this.field4653 != null) {
            for (int var5 = 0; var5 < this.field4653.length; var5++) {
                var4.method421(this.field4653[var5], this.field4659[var5]);
            }
        }
        if (this.field4661 != null) {
            for (int var6 = 0; var6 < this.field4661.length; var6++) {
                var4.method412(this.field4661[var6], this.field4666[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(Z)Z", line = 272)
    public final boolean method2166(boolean arg0) {
        field4655++;
        if (this.field4652 == null) {
            return true;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < this.field4652.length; var3++) {
            if (!class131.field2223.method210(0, true, this.field4652[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)I", line = 294)
    public static final int method2167(int arg0) {
        field4651++;
        if (arg0 != 14) {
            field4650 = -45;
        }
        return 14;
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)Lqg;", line = 308)
    public static final class316 method2168(int arg0) {
        field4646++;
        class157.field2519 = arg0;
        return class326.method2308((byte) 97);
    }
}
