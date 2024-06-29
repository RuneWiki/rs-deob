import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class423 implements Runnable {

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "[Ln;")
    public volatile class362[] field6059 = new class362[2];

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Z")
    public volatile boolean field6051 = false;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "Z")
    public volatile boolean field6056 = false;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field6058 = 0;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Lng;")
    public class153 field6054;

    static {
        new class332("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)Z", line = 3)
    public static final boolean method2493(int arg0) {
        field6055++;
        if (arg0 != -17749) {
            field6058 = 3;
        }
        if (class378.field5614) {
            try {
                class399.method2383(class21.field261.field2125, -10423, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILse;)V", line = 25)
    public static final void method2494(int arg0, class146 arg1) {
        if (arg0 != 32227) {
            return;
        }
        field6057++;
        if (!class166.field2335) {
            arg1.method283(arg0 - 32225);
            class186.field2817--;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V", line = 42)
    public static final void method2495(int arg0, int arg1) {
        class32.field424 = arg1;
        field6053++;
        if (arg0 == 0) {
            class327.field4893.method2401((byte) -39);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)V", line = 54)
    public static final void method2496(int arg0, int arg1) {
        field6049++;
        int var2 = -109 % ((18 - arg0) / 34);
        class186 var3 = class275.method1789(arg1, (byte) 123, 1);
        var3.method1279((byte) -65);
    }

    @OriginalMember(owner = "client!sf", name = "run", descriptor = "()V", line = 66)
    public final void run() {
        field6052++;
        this.field6056 = true;
        try {
            while (!this.field6051) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class362 var2 = this.field6059[var1];
                    if (var2 != null) {
                        var2.method2223(119);
                    }
                }
                class325.method2005(true, 10L);
                class450.method2652(this.field6054, (Object) null, 50);
            }
        } catch (Exception var9) {
            class416.method2475(false, var9, (String) null);
        } finally {
            Object var6 = null;
            this.field6056 = false;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V", line = 103)
    public static final void method2497(byte arg0) {
        int var1 = 44 % ((-arg0 - 49) / 56);
        for (class59 var2 = (class59) class10.field153.method1594(16); var2 != null; var2 = (class59) class10.field153.method1596(true)) {
            var2.method457();
        }
        field6050++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)V", line = 125)
    public static final void method2498(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 - arg0 >= class293.field4420 && class119.field1643 >= arg0 + arg1 && (arg3 - arg0) >= class176.field2503 && arg0 + arg3 <= class296.field4443) {
            class294.method1846(arg2, -125, arg1, arg0, arg3);
        } else {
            class333.method2039(arg3, arg1, arg0, (byte) -62, arg2);
        }
        if (arg4 <= 67) {
            method2496(-23, -63);
        }
        field6048++;
    }
}
