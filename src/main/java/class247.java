import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class247 {

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "Laj;")
    private class287 field3725 = new class287(64);

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "Lom;")
    private class344 field3723;

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
    public int field3722;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "[[Z")
    public static boolean[][] field3714 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
    public static int field3719 = 0;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "Lom;")
    public static class344 field3726;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "Lfu;")
    public static class360 field3717;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
    public final void method1666(int arg0) {
        if (arg0 != 64) {
            return;
        }
        field3715++;
        class287 var2 = this.field3725;
        synchronized (this.field3725) {
            this.field3725.method1912(-2552);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IB)Leda;")
    public final class87 method1667(int arg0, byte arg1) {
        field3721++;
        class287 var3 = this.field3725;
        class87 var4;
        synchronized (this.field3725) {
            var4 = (class87) this.field3725.method1900((long) arg0, -13);
        }
        if (var4 != null) {
            return var4;
        }
        class344 var5 = this.field3723;
        byte[] var6;
        synchronized (this.field3723) {
            var6 = this.field3723.method2216(16, arg0, true);
        }
        class87 var7 = new class87();
        if (var6 != null) {
            var7.method864(false, new class61(var6));
        }
        class287 var8 = this.field3725;
        synchronized (this.field3725) {
            this.field3725.method1904(var7, (long) arg0, -1);
            int var9 = 26 % ((arg1 + 13) / 63);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIB)I")
    public static final int method1668(int arg0, int arg1, byte arg2) {
        field3724++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg0 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg2 >= -30) {
            method1670(true);
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V")
    public final void method1669(byte arg0) {
        field3720++;
        class287 var2 = this.field3725;
        synchronized (this.field3725) {
            if (arg0 < 46) {
                method1670(true);
            }
            this.field3725.method1913(true);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)V")
    public static void method1670(boolean arg0) {
        field3726 = null;
        if (!arg0) {
            field3714 = null;
            field3717 = null;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(BI)V")
    public final void method1671(byte arg0, int arg1) {
        class287 var3 = this.field3725;
        synchronized (this.field3725) {
            this.field3725.method1908(arg1, (byte) -11);
        }
        if (arg0 <= -95) {
            field3718++;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lgfa;)V")
    public static final void method1672(class697 arg0) {
        class521.field7381.method178(arg0.field9806, arg0.field9809 + (arg0.method530(-45) >> 1), arg0.field9815, class365.field5415);
        arg0.field9811 = class365.field5415[0];
        arg0.field9805 = class365.field5415[1];
        arg0.field9808 = class365.field5415[2];
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lmea;ILom;)V")
    public class247(class398 arg0, int arg1, class344 arg2) {
        this.field3723 = arg2;
        if (this.field3723 == null) {
            this.field3722 = 0;
        } else {
            this.field3722 = this.field3723.method2236(16, 0);
        }
    }
}
