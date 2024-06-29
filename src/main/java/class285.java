import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class285 {

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    private int field4041 = 0;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "I")
    private int field4045 = 0;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
    private int field4048 = 0;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "Loea;")
    private class594 field4044;

    @OriginalMember(owner = "client!uu", name = "k", descriptor = "Lqr;")
    private class64 field4051;

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "[Lffa;")
    private class184[] field4049;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "Lqh;")
    public class67 field4047;

    @OriginalMember(owner = "client!uu", name = "l", descriptor = "Lqe;")
    public static class465 field4052 = new class465(1, 4);

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "Llm;")
    public static class497 field4042;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "([[BILwq;)V", line = 5)
    public static final void method1858(byte[][] arg0, int arg1, class166 arg2) {
        field4043++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        if (arg1 != 256215144) {
            field4042 = null;
        }
        int var4 = arg0.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class35 var11 = new class35(var10);
                int var12 = class412.field5705[var5] >> 8;
                int var13 = class412.field5705[var5] & 0xFF;
                int var14 = var12 * 64 - class115.field1845;
                int var15 = var13 * 64 - class64.field1160;
                class565.method3297(88);
                arg2.method1978(class630.field9041, var11, true, var15, class115.field1845, class64.field1160, var14);
                arg2.method1231(var3, false, var14, var11, class359.field5046, var15);
                if (!arg2.field4309 && class440.field6143 / 8 == var12 && (class544.field7683 / 8) == var13 && var3[0] != -1) {
                    class576.field8161 = class206.field2944.method2958(class569.field8108, var3[0], var3[1], var3[3], var3[2], (byte) 20);
                    class747.field10446 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class412.field5705[var6] >> 8) * 64 - class115.field1845;
            int var8 = (class412.field5705[var6] & 0xFF) * 64 - class64.field1160;
            byte[] var9 = arg0[var6];
            if (var9 == null && class544.field7683 < 800) {
                class565.method3297(76);
                arg2.method1980(64, 64, var7, (byte) -28, var8);
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZIZBII)V", line = 80)
    public final void method1859(boolean arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        field4046++;
        int var7 = -80 % ((-arg3 - 8) / 57);
        boolean var8 = arg2 & this.field4044.method627();
        if (!var8 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
            if (arg1 == 4) {
                arg4 = arg5;
            }
            arg1 = 2;
        }
        if (arg1 != 0 && arg0) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (this.field4041 != arg1) {
            if (this.field4041 != 0) {
                this.field4049[this.field4041 & Integer.MAX_VALUE].method702(true);
            }
            if (arg1 != 0) {
                this.field4049[Integer.MAX_VALUE & arg1].method699(-98, arg0);
                this.field4049[arg1 & Integer.MAX_VALUE].method704(arg0, -28981);
                this.field4049[Integer.MAX_VALUE & arg1].method705(arg4, arg5, false);
            }
            this.field4041 = arg1;
            this.field4048 = arg5;
            this.field4045 = arg4;
        } else if (this.field4041 != 0) {
            this.field4049[this.field4041 & Integer.MAX_VALUE].method704(arg0, -28981);
            if (this.field4048 != arg5 || this.field4045 != arg4) {
                this.field4049[Integer.MAX_VALUE & this.field4041].method705(arg4, arg5, false);
                this.field4048 = arg5;
                this.field4045 = arg4;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)Z", line = 136)
    public final boolean method1860(int arg0, int arg1) {
        int var3 = 78 / ((arg1 - 27) / 62);
        field4053++;
        return this.field4049[arg0].method698(-20958);
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Loea;)V", line = 191)
    public class285(class594 arg0) {
        this.field4044 = arg0;
        this.field4051 = new class64(arg0);
        this.field4049 = new class184[10];
        this.field4049[1] = new class348(arg0);
        this.field4049[2] = new class686(arg0, this.field4051);
        this.field4049[4] = new class424(arg0, this.field4051);
        this.field4049[5] = new class394(arg0, this.field4051);
        this.field4049[6] = new class350(arg0);
        this.field4049[7] = new class554(arg0);
        this.field4049[3] = this.field4047 = new class67(arg0);
        this.field4049[8] = new class358(arg0, this.field4051);
        this.field4049[9] = new class401(arg0, this.field4051);
        if (!this.field4049[8].method698(-20958)) {
            this.field4049[8] = this.field4049[4];
        }
        if (!this.field4049[9].method698(-20958)) {
            this.field4049[9] = this.field4049[8];
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V", line = 155)
    public static void method1861(int arg0) {
        field4042 = null;
        field4052 = null;
        if (arg0 != 21600) {
            field4042 = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BLiia;I)Z", line = 170)
    public final boolean method1862(byte arg0, class87 arg1, int arg2) {
        field4050++;
        if (this.field4041 == 0) {
            return false;
        } else {
            int var4 = 61 / ((arg0 + 57) / 45);
            this.field4049[Integer.MAX_VALUE & this.field4041].method700(arg1, false, arg2);
            return true;
        }
    }
}
