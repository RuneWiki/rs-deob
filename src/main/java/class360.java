import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class360 {

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public int field5236 = 128;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public int field5247 = 128;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public int field5237;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public int field5249;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public int field5240;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public int field5244;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Lgw;")
    public static class118 field5235 = new class118();

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "Lqt;")
    public static class459 field5243 = new class459(62, 3);

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field5250 = 0;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public int field5234;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public int field5239;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public int field5245;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public int field5246;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 3)
    public static void method2232(int arg0) {
        field5235 = null;
        field5243 = null;
        if (arg0 != 3) {
            method2232(39);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)Lqj;", line = 17)
    public final class360 method2233(int arg0) {
        int var2 = -29 / ((arg0 + 71) / 34);
        field5241++;
        return new class360(this.field5237, this.field5247, this.field5236, this.field5240, this.field5249, this.field5244);
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V", line = 28)
    public static final void method2234(int arg0) {
        field5238++;
        if (arg0 < 111) {
            method2235(84);
        }
        if (class494.field7139) {
            return;
        }
        if (class220.field3371.field2554) {
            class508.field7354 = ((int) class508.field7354 - 65 & 0xFFFFFF80);
        } else {
            class253.field3748 += (-24.0F - class253.field3748) / 2.0F;
        }
        class494.field7139 = true;
        class472.field6873 = true;
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)I", line = 56)
    public static final int method2235(int arg0) {
        field5242++;
        if (arg0 != 32397) {
            return 39;
        } else if (class230.field3443 == null) {
            return class128.field2000 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLqj;)V", line = 73)
    public final void method2236(byte arg0, class360 arg1) {
        field5248++;
        this.field5237 = arg1.field5237;
        this.field5240 = arg1.field5240;
        this.field5249 = arg1.field5249;
        if (arg0 <= 98) {
            this.field5236 = -44;
        }
        this.field5236 = arg1.field5236;
        this.field5247 = arg1.field5247;
        this.field5244 = arg1.field5244;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I)V", line = 111)
    public class360(int arg0) {
        this.field5237 = arg0;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(IIIIII)V", line = 118)
    private class360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5249 = arg4;
        this.field5237 = arg0;
        this.field5240 = arg3;
        this.field5236 = arg2;
        this.field5244 = arg5;
        this.field5247 = arg1;
    }
}
