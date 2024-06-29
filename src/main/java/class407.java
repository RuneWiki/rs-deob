import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class407 {

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "B")
    private byte field6039;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    public int field6043;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public int field6036;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
    public int field6047;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public int field6037;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    public int field6046;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field6045 = 0;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "Liu;")
    public static class517 field6044 = new class517(62, 5);

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    public static int field6042;

    static {
        new class567("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)I", line = 4)
    public final int method2469(byte arg0) {
        if (arg0 != -88) {
            this.field6046 = 117;
        }
        field6042++;
        return this.field6039 & 0x7;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V", line = 15)
    public static void method2470(int arg0) {
        if (arg0 <= 73) {
            method2470(12);
        }
        field6044 = null;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)I", line = 28)
    public final int method2471(int arg0) {
        if (arg0 != -4221) {
            this.field6039 = 63;
        }
        field6040++;
        return (this.field6039 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILjava/util/Random;I)I", line = 41)
    public static final int method2472(int arg0, Random arg1, int arg2) {
        field6041++;
        int var3 = -66 % ((-arg0 - 49) / 41);
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class32.method294(arg2, false)) {
            return (int) ((long) arg2 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var4 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var5;
            do {
                var5 = arg1.nextInt();
            } while (var4 <= var5);
            return class476.method2752(var5, -319880324, arg2);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IILae;Ljava/awt/Component;I)Lnm;", line = 72)
    public static final class337 method2473(int arg0, int arg1, class40 arg2, Component arg3, int arg4) {
        field6038++;
        if (class604.field8591 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class337 var5 = (class337) Class.forName("qd").getDeclaredConstructor().newInstance();
                var5.field4821 = new int[(class641.field9295 ? 2 : 1) * 256];
                var5.field4844 = arg0;
                var5.method2073(arg3);
                var5.field4846 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field4846 > 16384) {
                    var5.field4846 = 16384;
                }
                var5.method2066(var5.field4846);
                if (class294.field4241 > 0 && class284.field4142 == null) {
                    class284.field4142 = new class86();
                    class284.field4142.field1582 = arg2;
                    arg2.method353(class284.field4142, class294.field4241, false);
                }
                if (class284.field4142 != null) {
                    if (class284.field4142.field1580[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class284.field4142.field1580[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class564 var6 = new class564(arg2, arg1);
                    var6.field4821 = new int[(class641.field9295 ? 2 : 1) * 256];
                    var6.field4844 = arg0;
                    var6.method2073(arg3);
                    var6.field4846 = arg4;
                    var6.method2066(var6.field4846);
                    if (class294.field4241 > 0 && class284.field4142 == null) {
                        class284.field4142 = new class86();
                        class284.field4142.field1582 = arg2;
                        arg2.method353(class284.field4142, class294.field4241, false);
                    }
                    if (class284.field4142 != null) {
                        if (class284.field4142.field1580[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class284.field4142.field1580[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class337();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V", line = 168)
    public class407() {
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lco;)V", line = 170)
    public class407(class268 arg0) {
        this.field6039 = arg0.method1714(-31536);
        this.field6043 = arg0.method1745(32132);
        this.field6036 = arg0.method1748(98);
        this.field6047 = arg0.method1748(-115);
        this.field6037 = arg0.method1748(115);
        this.field6046 = arg0.method1748(-50);
    }
}
