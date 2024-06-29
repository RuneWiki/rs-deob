import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class349 extends class411 {

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public int field5442 = -1;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "[Lbr;")
    public static class380[] field5436 = new class380[5];

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "F")
    public static float field5439;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public int field5438;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "Ljava/lang/String;")
    public String field5434;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "Ljava/lang/String;")
    public String field5437;

    static {
        for (int var0 = 0; ~field5436.length < ~var0; ++var0) {
            field5436[var0] = new class380();
        }
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V", line = 7)
    public static void method2218(int arg0) {
        if (arg0 > -22) {
            method2220(84);
        }
        field5436 = null;
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)Lsc;", line = 25)
    public final class29 method2219(int arg0) {
        int var2 = -121 / ((arg0 - -33) / 37);
        ++field5441;
        return class204.field2866[super.field6183];
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)V", line = 41)
    public static final void method2220(int arg0) {
        ++field5440;
        if (~class144.field2077 == -11) {
            class524.method3106(28, (byte) 19);
        }
        if (arg0 < 81) {
            method2218(58);
        }
        if (~class144.field2077 == -31) {
            class524.method3106(25, (byte) 117);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)V", line = 61)
    public static final void method2221(int arg0, boolean arg1) {
        ++field5435;
        class377 var2 = class99.method672(arg0, false, 14);
        if (!arg1) {
            method2221(-29, false);
        }
        var2.method2339(-11688);
    }
}
