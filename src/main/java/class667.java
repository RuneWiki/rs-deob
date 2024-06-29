import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class667 extends class626 {

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "[Lpc;")
    public class667[] field9347;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Z")
    public boolean field9344;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "[I")
    public static int[] field9346 = new int[4096];

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "Lqe;")
    public static class465 field9358 = new class465(94, -1);

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public static int field9363 = 0;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field9345;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field9348;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field9349;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public static int field9350;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field9351;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field9352;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field9353;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public int field9354;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field9356;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field9359;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field9360;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public static int field9361;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "Lsda;")
    public class257 field9355;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "Lpa;")
    public class369 field9357;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 6)
    public static final void method3741(byte arg0) {
        field9362++;
        if (class611.field8843 != class118.field1857 && arg0 >= 74) {
            try {
                class101.method889("tbrefresh", class345.field4858, -27420);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V", line = 29)
    public void method3742(int arg0, int arg1, int arg2) {
        field9361++;
        int var4 = this.field9354 == 255 ? arg1 : this.field9354;
        if (arg2 != 26122) {
            field9363 = -93;
        }
        if (this.field9344) {
            this.field9355 = new class257(var4, arg1, arg0);
        } else {
            this.field9357 = new class369(var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZLak;)V", line = 56)
    public static final void method3743(int arg0, int arg1, boolean arg2, class349 arg3) {
        field9345++;
        int[] var4 = new int[4];
        class622.method3592(var4, 0, var4.length, arg1);
        class494.method2977(arg2, arg3, var4, arg0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBI)[I", line = 71)
    public final int[] method3744(int arg0, byte arg1, int arg2) {
        field9353++;
        int var4 = -69 % ((82 - arg1) / 35);
        return this.field9347[arg2].field9344 ? this.field9347[arg2].method117((byte) -113, arg0) : this.field9347[arg2].method777(false, arg0)[0];
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)[I", line = 91)
    public int[] method117(byte arg0, int arg1) {
        field9349++;
        if (arg0 <= -87) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V", line = 115)
    public void method3745(boolean arg0) {
        field9360++;
        if (this.field9344) {
            this.field9355.method1743(0);
            this.field9355 = null;
        } else {
            this.field9357.method2315(-71);
            this.field9357 = null;
        }
        if (arg0) {
            this.method3748(48, 16, -23);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I", line = 140)
    public int method3746(int arg0) {
        field9359++;
        return arg0 == 27019 ? -1 : 42;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V", line = 155)
    public static void method3747(byte arg0) {
        field9346 = null;
        if (arg0 <= -43) {
            field9358 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V", line = 168)
    public void method121(boolean arg0) {
        if (arg0) {
            this.field9355 = null;
        }
        field9350++;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IZ)V", line = 178)
    public class667(int arg0, boolean arg1) {
        this.field9347 = new class667[arg0];
        this.field9344 = arg1;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)[[I", line = 189)
    public final int[][] method3748(int arg0, int arg1, int arg2) {
        field9348++;
        if (arg1 != 0) {
            method3747((byte) -70);
        }
        if (this.field9347[arg2].field9344) {
            int[] var4 = this.field9347[arg2].method117((byte) -94, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field9347[arg2].method777(false, arg0);
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(Z)I", line = 221)
    public int method3749(boolean arg0) {
        if (arg0) {
            field9356++;
            return -1;
        } else {
            return 16;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lud;II)V", line = 238)
    public void method116(class35 arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            this.field9357 = null;
        }
        field9351++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)[[I", line = 263)
    public int[][] method777(boolean arg0, int arg1) {
        if (arg0) {
            return null;
        } else {
            field9352++;
            throw new IllegalStateException("This operation does not have a colour output");
        }
    }
}
