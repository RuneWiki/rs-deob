import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class505 {

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "[I")
    public static int[] field7389 = new int[2048];

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Lkc;")
    public static class157 field7384 = new class157("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "Lhi;")
    public static class45 field7390 = new class45(40, -1);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public int field7380;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    private int field7385;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public int field7386;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Lqi;")
    public class389 field7383;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "[[Lat;")
    public static class444[][] field7387;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILsv;I)V")
    private final void method2994(int arg0, class319 arg1, int arg2) {
        if (arg2 == 1) {
            this.field7385 = arg1.method1844(-115);
        } else if (arg2 == 2) {
            this.field7380 = arg1.method1869(-67);
            this.field7386 = arg1.method1869(-114);
        }
        field7388++;
        if (arg0 < 89) {
            field7390 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)Lau;")
    public final synchronized class396 method2995(int arg0) {
        field7382++;
        class396 var2 = (class396) this.field7383.field5622.method2767((long) this.field7385, 0);
        if (var2 != null) {
            return var2;
        }
        class396 var3 = class396.method2353(this.field7383.field5620, this.field7385, 0);
        if (var3 != null) {
            this.field7383.field5622.method2777(-1025, var3, (long) this.field7385);
        }
        if (arg0 != 2607) {
            this.method2995(-84);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public static void method2996(int arg0) {
        field7390 = null;
        if (arg0 == 2048) {
            field7387 = null;
            field7389 = null;
            field7384 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lmb;III)V")
    public static final void method2997(class224 arg0, int arg1, int arg2, int arg3) {
        long var4 = class118.field1853[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field3164 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field3166[arg0.field3164++] = class231.field3229[var8 - 1].field6257;
            var6 += 16L;
        }
        for (int var9 = arg0.field3164; var9 < 4; var9++) {
            arg0.field3166[var9] = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lsv;Z)V")
    public final void method2998(class319 arg0, boolean arg1) {
        field7381++;
        if (!arg1) {
            this.method2998(null, true);
        }
        while (true) {
            int var3 = arg0.method1869(-115);
            if (var3 == 0) {
                return;
            }
            this.method2994(119, arg0, var3);
        }
    }
}
