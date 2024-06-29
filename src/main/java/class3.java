import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class3 implements Runnable {

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "Z")
    public boolean field27 = true;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field21 = new Object();

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "[I")
    public int[] field30 = new int[500];

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "[I")
    public int[] field31 = new int[500];

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public int field32 = 0;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "Lqj;")
    public static class196 field24 = class80.method502("sl_flags", -48);

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Lqj;")
    public static class196 field20 = null;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Lqj;")
    public static class196 field25 = class80.method502("Verbindung mit Update)2Server)3)3)3", -48);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Lbk;")
    public static class136 field23;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static void method8(int arg0) {
        field25 = null;
        field20 = null;
        field24 = null;
        field23 = null;
        int var1 = 75 % ((arg0 + 64) / 60);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)I")
    public static final int method9(int arg0, int arg1, int arg2) {
        if (arg0 != 27207) {
            method8(-33);
        }
        field22++;
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lqj;Lqj;ILqj;II)V")
    public static final void method10(class196 arg0, class196 arg1, int arg2, class196 arg3, int arg4, int arg5) {
        for (int var6 = arg4; var6 > 0; var6--) {
            class152.field2453[var6] = class152.field2453[var6 - 1];
            class227.field4053[var6] = class227.field4053[var6 - 1];
            class256.field4503[var6] = class256.field4503[var6 - 1];
            class187.field3285[var6] = class187.field3285[var6 - 1];
            class93.field1367[var6] = class93.field1367[var6 - 1];
        }
        class152.field2453[0] = arg5;
        class243.field4333++;
        class220.field3944 = class92.field1341;
        class227.field4053[0] = arg1;
        class93.field1367[0] = arg2;
        class256.field4503[0] = arg3;
        field29++;
        class187.field3285[0] = arg0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILbk;II)[Lsc;")
    public static final class212[] method11(int arg0, class136 arg1, int arg2, int arg3) {
        if (arg3 != -25635) {
            field23 = null;
        }
        field19++;
        return class84.method528(arg1, arg0, arg2, 0) ? class104.method638((byte) -95) : null;
    }

    @OriginalMember(owner = "client!cd", name = "run", descriptor = "()V")
    public final void run() {
        field26++;
        while (this.field27) {
            Object var1 = this.field21;
            synchronized (this.field21) {
                if (this.field32 < 500) {
                    this.field31[this.field32] = class52.field646;
                    this.field30[this.field32] = class63.field869;
                    this.field32++;
                }
            }
            class73.method464((byte) -102, 50L);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(JI)Lqj;")
    public static final class196 method12(long arg0, int arg1) {
        field18++;
        if (arg1 != 10) {
            field20 = null;
        }
        return class147.method916(false, 24120, 10, arg0);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
    public static final void method13(int arg0) {
        if (class174.field2936[98]) {
            class70.field989 += (12 - class70.field989) / 2;
        } else if (class174.field2936[99]) {
            class70.field989 += (-class70.field989 - 12) / 2;
        } else {
            class70.field989 /= 2;
        }
        class194.field3417 += class70.field989 / 2;
        field28++;
        int var1 = class203.field3664 + class102.field1477.field2081;
        if (class174.field2936[96]) {
            class133.field1901 += (-class133.field1901 - 24) / 2;
        } else if (class174.field2936[97]) {
            class133.field1901 += (24 - class133.field1901) / 2;
        } else {
            class133.field1901 /= 2;
        }
        if (arg0 >= -113) {
            return;
        }
        int var2 = class102.field1477.field2085 + class48.field572;
        class18.field216 += class133.field1901 / 2;
        if (class87.field1282 - var1 < -500 || class87.field1282 - var1 > 500 || class48.field577 - var2 < -500 || class48.field577 - var2 > 500) {
            class87.field1282 = var1;
            class48.field577 = var2;
        }
        if (class87.field1282 != var1) {
            class87.field1282 += (var1 - class87.field1282) / 16;
        }
        if (class48.field577 != var2) {
            class48.field577 += (var2 - class48.field577) / 16;
        }
        class231.method1549(3);
    }
}
