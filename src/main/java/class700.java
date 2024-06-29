import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class700 {

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    private int field9870 = 0;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "Lsga;")
    private class583 field9876;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "Lqia;")
    public static class547 field9873 = new class547();

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "Lmq;")
    public static class78 field9878 = new class78(111, -2);

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "F")
    public static float field9874;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field9869;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field9871;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field9875;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field9877;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field9879;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "Lns;")
    private class627 field9872;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "[Lia;")
    public static class32[] field9880;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([[BILtha;)V", line = 8)
    public static final void method3875(byte[][] arg0, int arg1, class486 arg2) {
        field9869++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class179 var11 = new class179(var10);
                int var12 = class248.field3162[var5] >> 8;
                int var13 = class248.field3162[var5] & 0xFF;
                int var14 = var12 * 64 - class63.field851;
                int var15 = var13 * 64 - class753.field10509;
                class384.method2308(-111);
                arg2.method904(class410.field5786, var15, class753.field10509, class63.field851, var14, var11, true);
                arg2.method2843(var11, 0, var15, var3, class458.field6407, var14);
                if (!arg2.field1740 && class108.field1336 / 8 == var12 && (class509.field7194 / 8) == var13 && var3[0] != -1) {
                    class219.field2786 = class182.field2384.method2999(var3[2], var3[3], 0, var3[0], var3[1], class696.field9859);
                    class638.field8829 = var3[4];
                }
            }
        }
        if (arg1 != -20557) {
            method3875(null, 6, null);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class248.field3162[var6] >> 8) * 64 - class63.field851;
            int var8 = (class248.field3162[var6] & 0xFF) * 64 - class753.field10509;
            byte[] var9 = arg0[var6];
            if (var9 == null && class509.field7194 < 800) {
                class384.method2308(-50);
                arg2.method896((byte) 47, 64, 64, var7, var8);
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)Lns;", line = 82)
    public final class627 method3876(int arg0) {
        field9877++;
        if (arg0 > ~this.field9870 && this.field9876.field8094[this.field9870 - 1] != this.field9872) {
            class627 var2 = this.field9872;
            this.field9872 = var2.field8744;
            return var2;
        }
        while (this.field9876.field8093 > this.field9870) {
            class627 var3 = this.field9876.field8094[this.field9870++].field8744;
            if (this.field9876.field8094[this.field9870 - 1] != var3) {
                this.field9872 = var3.field8744;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V", line = 163)
    public class700() {
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lsga;)V", line = 172)
    public class700(class583 arg0) {
        this.field9876 = arg0;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)Lns;", line = 115)
    public final class627 method3877(int arg0) {
        if (arg0 != 2431) {
            this.field9872 = null;
        }
        this.field9870 = 0;
        field9871++;
        return this.method3876(arg0 ^ 0xFFFFF680);
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V", line = 132)
    public static final void method3878(int arg0) {
        if (arg0 != 13797) {
            return;
        }
        if (class761.field10601 != null) {
            class761.field10601.method1285((byte) -52);
        }
        field9875++;
        if (class152.field1853 != null) {
            class152.field1853.method1285((byte) -37);
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V", line = 148)
    public static void method3879(int arg0) {
        field9878 = null;
        field9873 = null;
        field9880 = null;
        if (arg0 > -84) {
            field9879 = -7;
        }
    }
}
