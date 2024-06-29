import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class119 extends class99 {

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Lhj;")
    public static class69 field2244 = class181.method1318("Schrifts-=tze geladen)3", (byte) -109);

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Z")
    public static boolean field2249 = true;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "Z")
    public static boolean field2251 = false;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Lcj;")
    public static class114 field2246;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "Ltk;")
    public static class50 field2250;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "Z")
    public static boolean field2248;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILsd;Ljava/awt/Component;II)Lak;")
    public static final class134 method864(int arg0, class42 arg1, Component arg2, int arg3, int arg4) {
        field2245++;
        if (class133.field2473 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class134 var5 = (class134) Class.forName("uc").getDeclaredConstructor().newInstance();
                if (arg3 != -16729) {
                    method866(57);
                }
                var5.field2505 = new int[(class256.field4597 ? 2 : 1) * 256];
                var5.field2517 = arg4;
                var5.method202(arg2);
                var5.field2512 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field2512 > 16384) {
                    var5.field2512 = 16384;
                }
                var5.method200(var5.field2512);
                if (field2247 > 0 && class189.field3432 == null) {
                    class189.field3432 = new class153();
                    class189.field3432.field2857 = arg1;
                    arg1.method232(class189.field3432, field2247, (byte) 107);
                }
                if (class189.field3432 != null) {
                    if (class189.field3432.field2850[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class189.field3432.field2850[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class219 var6 = new class219(arg1, arg0);
                    var6.field2505 = new int[(class256.field4597 ? 2 : 1) * 256];
                    var6.field2517 = arg4;
                    var6.method202(arg2);
                    var6.field2512 = 16384;
                    var6.method200(var6.field2512);
                    if (field2247 > 0 && class189.field3432 == null) {
                        class189.field3432 = new class153();
                        class189.field3432.field2857 = arg1;
                        arg1.method232(class189.field3432, field2247, (byte) 107);
                    }
                    if (class189.field3432 != null) {
                        if (class189.field3432.field2850[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class189.field3432.field2850[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class134();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)J")
    public static final long method865(int arg0, int arg1, int arg2) {
        class217 var3 = class158.field2935[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field3940; var4++) {
            class85 var5 = var3.field3933[var4];
            if ((var5.field1656 >> 29 & 0x3L) == 2L && var5.field1662 == arg1 && var5.field1653 == arg2) {
                return var5.field1656;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public static void method866(int arg0) {
        field2246 = null;
        if (arg0 != -20348) {
            field2247 = -33;
        }
        field2244 = null;
        field2250 = null;
    }
}
