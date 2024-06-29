import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class479 implements Runnable {

    @OriginalMember(owner = "client!st", name = "a", descriptor = "[Lin;")
    public volatile class262[] field7312 = new class262[2];

    @OriginalMember(owner = "client!st", name = "f", descriptor = "Z")
    public volatile boolean field7317 = false;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "Z")
    public volatile boolean field7318 = false;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "Lgn;")
    public static class410 field7319;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "Lbi;")
    public static class104 field7321;

    @OriginalMember(owner = "client!st", name = "l", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "Lpb;")
    public class2 field7313;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILgi;)V")
    public static final void method2962(int arg0, class437 arg1) {
        if (arg0 > -93) {
            method2962(71, null);
        }
        field7314++;
        if (class231.field3821 == arg1.field6698) {
            class520.field7707[arg1.field6646] = true;
        }
    }

    @OriginalMember(owner = "client!st", name = "run", descriptor = "()V")
    public final void run() {
        field7316++;
        this.field7318 = true;
        try {
            while (!this.field7317) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class262 var2 = this.field7312[var1];
                    if (var2 != null) {
                        var2.method1799((byte) -102);
                    }
                }
                class208.method1464((byte) -98, 10L);
                class361.method2384(this.field7313, null, -106);
            }
        } catch (Exception var9) {
            class80.method575(var9, null, (byte) -121);
        } finally {
            Object var6 = null;
            this.field7318 = false;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V")
    public static void method2963(byte arg0) {
        field7321 = null;
        field7319 = null;
        int var1 = -86 % ((arg0 + 66) / 42);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method2964(byte arg0, String arg1) {
        field7320++;
        int var2 = arg1.length();
        int var3 = 0;
        int var4 = 0;
        if (arg0 <= 110) {
            method2963((byte) -56);
        }
        while (var4 < var2) {
            var3 = arg1.charAt(var4) + (var3 << 5) - var3;
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2965(int arg0, byte arg1, int arg2) {
        field7315++;
        int var3 = 95 % ((arg1 - 69) / 42);
        return (arg2 & 0x70000) != 0 | class46.method337(arg2, true, arg0) || class439.method2789(112, arg2, arg0);
    }

    static {
        new class213(null, "Dieses System darf nicht missbraucht werden!", null, null);
        field7319 = new class410();
        field7321 = new class104(42, 20);
        field7323 = 0;
    }
}
