import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class130 extends class25 {

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
    public static int field2309 = 3353893;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
    public static int field2308 = 0;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "Lig;")
    public static class168 field2311 = new class168(20);

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "Lcd;")
    public static class64 field2316 = class44.method335((byte) 71, "sch-Utteln:");

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    public static int field2315 = 0;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "[I")
    public static int[] field2317 = new int[32];

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "J")
    public long field2312;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "Lbm;")
    public class130 field2313;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "Lbm;")
    public class130 field2314;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V", line = 10)
    public static void method937(byte arg0) {
        field2316 = null;
        int var1 = 73 / ((20 - arg0) / 59);
        field2311 = null;
        field2317 = null;
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)V", line = 21)
    public final void method938(int arg0) {
        field2310++;
        if (this.field2313 == null) {
            return;
        }
        if (arg0 != 0) {
            field2317 = (int[]) null;
        }
        this.field2313.field2314 = this.field2314;
        this.field2314.field2313 = this.field2313;
        this.field2314 = null;
        this.field2313 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "()V", line = 50)
    public static final void method939() {
        for (int var0 = 0; var0 < class132.field2354; var0++) {
            class195 var1 = class181.field3107[var0];
            class220.method1570(var1);
            class181.field3107[var0] = null;
        }
        class132.field2354 = 0;
    }
}
