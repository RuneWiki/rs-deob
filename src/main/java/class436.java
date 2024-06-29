import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class436 extends class432 {

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "Ljava/lang/Object;")
    private Object field5985;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "Lub;")
    public static class18 field5982 = new class18(64);

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILnp;I)J", line = 3)
    public static final long method2508(int arg0, int arg1, class338 arg2, int arg3) {
        field5983++;
        long var4 = 4194304L;
        if (arg1 != 1326644142) {
            method2508(-61, 74, null, -41);
        }
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class1 var10 = class402.field5388.method1994(-17294, arg2.method347((byte) -87));
        long var11 = (long) (arg3 << 7 | arg0 | arg2.method345(-1736) << 14 | arg2.method344(-4534) << 20 | 0x40000000);
        if (var10.field83 == 0) {
            var11 |= var8;
        }
        if (var10.field6 == 1) {
            var11 |= var4;
        }
        if (var10.field4) {
            var11 |= var6;
        }
        return var11 | (long) arg2.method347((byte) -87) << 32;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)V", line = 36)
    public static void method2509(boolean arg0) {
        if (!arg0) {
            field5982 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(B)Z", line = 48)
    public final boolean method1620(byte arg0) {
        field5984++;
        return arg0 == -48 ? false : false;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lkr;Ljava/lang/Object;I)V", line = 61)
    public class436(class524 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5985 = arg1;
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(B)Ljava/lang/Object;", line = 72)
    public final Object method1621(byte arg0) {
        field5987++;
        if (arg0 > -72) {
            this.field5985 = null;
        }
        return this.field5985;
    }
}
