import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class481 {

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public int field6807;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "[I")
    public int[] field6804;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "[I")
    public int[] field6805;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "[J")
    public static long[] field6808 = new long[256];

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "Lrc;")
    public static class108 field6809;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field6810;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field6808[var0] = var1;
        }
        new class151("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field6809 = new class108(38, 6);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 4)
    public static void method2837(int arg0) {
        field6808 = null;
        field6809 = null;
        if (arg0 != 1) {
            field6809 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(I)V", line = 18)
    public class481(int arg0) {
        this.field6807 = arg0;
        this.field6804 = new int[this.field6807];
        this.field6805 = new int[this.field6807];
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZLis;Ljava/awt/Component;II)Lue;", line = 29)
    public static final class149 method2838(boolean arg0, class65 arg1, Component arg2, int arg3, int arg4) {
        field6806++;
        if (class192.field2868 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class149 var5 = (class149) Class.forName("qf").getDeclaredConstructor().newInstance();
                var5.field2068 = arg3;
                var5.field2040 = new int[(class217.field3139 ? 2 : 1) * 256];
                var5.method1064(arg2);
                var5.field2061 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field2061 > 16384) {
                    var5.field2061 = 16384;
                }
                var5.method1068(var5.field2061);
                if (class282.field4060 > 0 && class482.field6821 == null) {
                    class482.field6821 = new class137();
                    class482.field6821.field1903 = arg1;
                    arg1.method616(class482.field6821, 1, class282.field4060);
                }
                if (class482.field6821 != null) {
                    if (class482.field6821.field1905[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class482.field6821.field1905[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class396 var6 = new class396(arg1, arg4);
                    var6.field2068 = arg3;
                    var6.field2040 = new int[(class217.field3139 ? 2 : 1) * 256];
                    if (!arg0) {
                        field6809 = null;
                    }
                    var6.method1064(arg2);
                    var6.field2061 = 16384;
                    var6.method1068(var6.field2061);
                    if (class282.field4060 > 0 && class482.field6821 == null) {
                        class482.field6821 = new class137();
                        class482.field6821.field1903 = arg1;
                        arg1.method616(class482.field6821, 1, class282.field4060);
                    }
                    if (class482.field6821 != null) {
                        if (class482.field6821.field1905[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class482.field6821.field1905[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class149();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
