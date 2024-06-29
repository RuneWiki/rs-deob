import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class203 {

    @OriginalMember(owner = "client!si", name = "k", descriptor = "Z")
    public boolean field3175 = false;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3170 = "wave2:";

    @OriginalMember(owner = "client!si", name = "h", descriptor = "Luk;")
    public static class100 field3172 = new class100(64);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public int field3168;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public int field3174;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZZ)Lch;")
    public final class290 method1367(int arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            this.field3168 = -112;
        }
        field3171++;
        class290 var4 = (class290) class165.field2587.method1887(0, (long) ((arg1 ? 262144 : 0) | this.field3168 | arg0 << 16));
        if (var4 != null) {
            return var4;
        }
        class216.field3346.method1613(arg2, this.field3168);
        class290 var5 = class291.method1949(this.field3168, (byte) 116, class216.field3346, 0);
        if (var5 != null) {
            var5.method1944(class46.field657, class20.field302, class99.field1668);
            var5.field2981 = var5.field2985;
            var5.field2980 = var5.field2976;
            if (arg1) {
                var5.method1941();
            }
            for (int var6 = 0; var6 < arg0; var6++) {
                var5.method1940();
            }
            class165.field2587.method1886(-121, (long) ((arg1 ? 262144 : 0) | this.field3168 | arg0 << 16), var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILai;)V")
    public final void method1368(int arg0, int arg1, class88 arg2) {
        if (arg1 != 8323) {
            this.method1368(-64, -3, (class88) null);
        }
        while (true) {
            int var4 = arg2.method633(arg1 ^ 0x20D4);
            if (var4 == 0) {
                field3169++;
                return;
            }
            this.method1372(arg2, -113, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static final void method1369(int arg0) {
        field3176++;
        for (int var1 = 0; var1 < 5; var1++) {
            class239.field3885[var1] = false;
        }
        class110.field1804 = 0;
        class160.field2477 = -1;
        class33.field497 = -1;
        class259.field4130 = 1;
        if (arg0 != -20406) {
            method1369(100);
        }
        class65.field1100 = 0;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)Lac;")
    public static final class137 method1370(int arg0) {
        field3165++;
        if (arg0 != -31440) {
            method1369(63);
        }
        try {
            return (class137) Class.forName("ck").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class48();
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V")
    public static void method1371(int arg0) {
        field3170 = null;
        field3172 = null;
        if (arg0 != 262144) {
            method1371(97);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lai;III)V")
    private final void method1372(class88 arg0, int arg1, int arg2, int arg3) {
        field3167++;
        if (arg3 == 1) {
            this.field3168 = arg0.method645(11596);
        } else if (arg3 == 2) {
            this.field3174 = arg0.method671(126);
        } else if (arg3 == 3) {
            this.field3175 = true;
        } else if (arg3 == 4) {
            this.field3168 = -1;
        }
        if (arg1 > -25) {
            this.field3168 = 111;
        }
    }
}
