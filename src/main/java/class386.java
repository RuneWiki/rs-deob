import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class386 extends class511 {

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "[I")
    public int[] field5350;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "[I")
    public int[] field5351;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "Loo;")
    public static class652 field5353 = new class652(4);

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "[Lru;")
    public static class204[] field5355 = new class204[0];

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "Lbu;")
    public static class21 field5354 = new class21(52, 8);

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "Lib;")
    public static class163 field5352;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V", line = 5)
    public static void method2412(byte arg0) {
        field5353 = null;
        field5355 = null;
        field5354 = null;
        field5352 = null;
        if (arg0 > -37) {
            method2412((byte) -69);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/awt/Component;IIBLtd;)Lhp;", line = 23)
    public static final class346 method2413(Component arg0, int arg1, int arg2, byte arg3, class477 arg4) {
        field5348++;
        if (class114.field1746 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class346 var5 = (class346) Class.forName("fq").getDeclaredConstructor().newInstance();
                var5.field4819 = new int[(class488.field6898 ? 2 : 1) * 256];
                var5.field4847 = arg1;
                var5.method1466(arg0);
                var5.field4849 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field4849 > 16384) {
                    var5.field4849 = 16384;
                }
                var5.method1465(var5.field4849);
                if (class731.field10120 > 0 && class17.field319 == null) {
                    class17.field319 = new class487();
                    class17.field319.field6856 = arg4;
                    arg4.method2850(class731.field10120, class17.field319, 75);
                }
                if (class17.field319 != null) {
                    if (class17.field319.field6857[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class17.field319.field6857[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                if (arg3 >= -51) {
                    method2412((byte) 31);
                }
                try {
                    class441 var6 = new class441(arg4, arg2);
                    var6.field4819 = new int[(class488.field6898 ? 2 : 1) * 256];
                    var6.field4847 = arg1;
                    var6.method1466(arg0);
                    var6.field4849 = 16384;
                    var6.method1465(var6.field4849);
                    if (class731.field10120 > 0 && class17.field319 == null) {
                        class17.field319 = new class487();
                        class17.field319.field6856 = arg4;
                        arg4.method2850(class731.field10120, class17.field319, 113);
                    }
                    if (class17.field319 != null) {
                        if (class17.field319.field6857[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class17.field319.field6857[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class346();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(II[I[I)V", line = 113)
    public class386(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field5350 = arg3;
        this.field5351 = arg2;
    }
}
