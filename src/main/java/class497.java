import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class497 {

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "Lnga;")
    private class510 field7080 = new class510(64);

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "Leq;")
    private class209 field7083;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "Lqe;")
    public static class465 field7086 = new class465(73, 4);

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "Lqe;")
    public static class465 field7087 = new class465(30, 4);

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "Lqaa;")
    public static class27 field7090 = new class27(61, 15);

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "Lqaa;")
    public static class27 field7091 = new class27(2, 2);

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "Leq;")
    public static class209 field7079;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "Lha;")
    public static class58 field7089;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "[Lfb;")
    public static class671[] field7092;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)V", line = 4)
    public final void method2987(int arg0, boolean arg1) {
        field7081++;
        class510 var3 = this.field7080;
        synchronized (this.field7080) {
            this.field7080.method3049(arg0, (byte) 126);
            if (!arg1) {
                field7091 = null;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILvg;IIIII)V", line = 17)
    public static final void method2988(int arg0, class52 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class151.method1163(arg2, arg6, arg4, arg0, arg5, arg1.field644, arg1.field648, arg1.field649, arg3, false);
        field7082++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 26)
    public final void method2989(byte arg0) {
        int var2 = 64 / ((arg0 + 27) / 43);
        class510 var3 = this.field7080;
        synchronized (this.field7080) {
            this.field7080.method3050(false);
        }
        field7093++;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(IZ)V", line = 41)
    public static final void method2990(int arg0, boolean arg1) {
        if (arg1 && class542.field7619 != null) {
            class678.field9563 = class542.field7619.field10143;
        } else {
            class678.field9563 = -1;
        }
        field7084++;
        class512.field7312 = null;
        class353.field4969 = null;
        class442.field6163 = 0;
        class542.field7619 = null;
        class542.method3206();
        class542.field7626.method1530((byte) 99);
        class107.field1765 = null;
        class375.field5256 = null;
        class462.field6660 = null;
        class500.field7106 = null;
        class18.field241 = null;
        class693.field9749 = null;
        class358.field5026 = -1;
        class554.field7752 = null;
        int var2 = -99 % ((79 - arg0) / 41);
        class592.field8313 = null;
        class320.field4554 = -1;
        class508.field7235 = null;
        class542.field7624 = null;
        if (class542.field7614 != null) {
            class542.field7614.method2645(2080593256);
            class542.field7614.method2642(64, 128, (byte) -50);
        }
        if (class542.field7616 != null) {
            class542.field7616.method796(64, 64, (byte) 116);
        }
        if (class542.field7615 != null) {
            class542.field7615.method135(64, (byte) -127);
        }
        class679.field9567.method212((byte) 33, 64);
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V", line = 88)
    public static void method2991(byte arg0) {
        field7090 = null;
        field7092 = null;
        field7086 = null;
        field7079 = null;
        field7089 = null;
        field7087 = null;
        field7091 = null;
        if (arg0 < 24) {
            method2988(76, null, 23, 108, -120, 79, 24);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)V", line = 105)
    public final void method2992(boolean arg0) {
        field7088++;
        if (!arg0) {
            method2990(88, true);
        }
        class510 var2 = this.field7080;
        synchronized (this.field7080) {
            this.field7080.method3048(false);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB)Ldn;", line = 128)
    public final class513 method2993(int arg0, byte arg1) {
        field7085++;
        class510 var3 = this.field7080;
        class513 var4;
        synchronized (this.field7080) {
            var4 = (class513) this.field7080.method3054((byte) -126, (long) arg0);
            if (arg1 != 80) {
                field7090 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class209 var5 = this.field7083;
        byte[] var6;
        synchronized (this.field7083) {
            var6 = this.field7083.method1453(arg0, -119, 11);
        }
        class513 var7 = new class513();
        if (var6 != null) {
            var7.method3064(arg1 ^ 0xFFFFBB89, new class35(var6));
        }
        class510 var8 = this.field7080;
        synchronized (this.field7080) {
            this.field7080.method3047(false, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lcw;ILeq;)V", line = 174)
    public class497(class179 arg0, int arg1, class209 arg2) {
        this.field7083 = arg2;
        if (this.field7083 != null) {
            this.field7083.method1477(0, 11);
        }
    }
}
