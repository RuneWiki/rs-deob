import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class386 extends class83 {

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field5500 = "Stellar Dawn is loading - please wait...";

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "Lph;")
    public static class114 field5504 = new class114(200);

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "[[Z")
    public static boolean[][] field5506 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
    private int field5495;

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "I")
    private int field5497;

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
    private int field5503;

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
    public static void method2392(int arg0) {
        field5506 = null;
        int var1 = 88 % ((arg0 - -79) / 34);
        field5500 = null;
        field5504 = null;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)V")
    public static final void method2393(byte arg0) {
        class449.field6522 = 0;
        class376.field5278 = 0;
        class389.field5574 = 0;
        class116.field1440 = 0;
        if (arg0 != -51) {
            field5504 = null;
        }
        ++field5498;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(ZI)V")
    private final void method2394(boolean arg0, int arg1) {
        this.field5495 = 4080 & arg1 >> 12;
        if (arg0) {
            this.field5503 = arg1 >> 4 & 4080;
            this.field5497 = arg1 << 4 & 4080;
            ++field5499;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBLtq;)V")
    public final void method35(int arg0, byte arg1, class250 arg2) {
        if (~arg0 == -1) {
            this.method2394(true, arg2.method1372(-2));
        }
        int var5 = 33 / ((arg1 - -27) / 50);
        ++field5501;
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(B)V")
    public static final void method2395(byte arg0) {
        ++field5496;
        class38.field394.method606((byte) 95);
        if (arg0 != 58) {
            field5504 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
    public static final void method2396(int arg0) {
        class421.field6158.method613(true);
        ++field5494;
        int var1 = 10 / ((arg0 - -65) / 56);
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class386() {
        this(0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        if (!arg0) {
            method2396(-72);
        }
        ++field5502;
        int[][] var3 = super.field927.method1774((byte) -58, arg1);
        if (super.field927.field4104) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class420.field6139; ++var7) {
                var4[var7] = this.field5495;
                var5[var7] = this.field5503;
                var6[var7] = this.field5497;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(I)V")
    private class386(int arg0) {
        super(0, false);
        this.method2394(true, arg0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lhd;)V")
    public static final void method2397(class17 arg0) {
        for (int var1 = arg0.field168; var1 <= arg0.field158; ++var1) {
            for (int var2 = arg0.field159; var2 <= arg0.field153; ++var2) {
                class96 var3 = class176.field2209[arg0.field161][var1][var2];
                if (var3 != null) {
                    class122 var4 = var3.field1130;
                    class122 var5 = null;
                    while (var4 != null) {
                        if (var4.field1505 == arg0) {
                            if (var5 != null) {
                                var5.field1511 = var4.field1511;
                            } else {
                                var3.field1130 = var4.field1511;
                            }
                            var4.method646(40);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field1511;
                    }
                    var3.field1133 = 0;
                    for (class122 var6 = var3.field1130; var6 != null; var6 = var6.field1511) {
                        var3.field1133 = (byte) (var3.field1133 | var6.field1507);
                    }
                }
            }
        }
    }
}
