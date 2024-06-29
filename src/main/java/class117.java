import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class117 extends class248 {

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "Lij;")
    private class50 field2069 = class62.field1168;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "Lij;")
    public static class50 field2064 = class78.method578(127, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public int field2060;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public int field2061;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    private int field2065;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "Lkj;")
    private class56 field2062;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILwd;)V")
    private final void method842(int arg0, int arg1, class217 arg2) {
        if (arg0 != -3) {
            return;
        }
        if (arg1 == 1) {
            this.field2060 = arg2.method1487(255);
        } else if (arg1 == 2) {
            this.field2061 = arg2.method1487(arg0 + 258);
        } else if (arg1 == 3) {
            this.field2069 = arg2.method1469((byte) -120);
        } else if (arg1 == 4) {
            this.field2065 = arg2.method1466((byte) -15);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method1441(78);
            this.field2062 = new class56(class41.method311(var4, false));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1466((byte) -15);
                class32 var7;
                if (arg1 == 5) {
                    var7 = new class79(arg2.method1469((byte) -125));
                } else {
                    var7 = new class199(arg2.method1466((byte) -15));
                }
                this.field2062.method445(arg0 + 91, (long) var6, var7);
            }
        }
        field2067++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lda;Lda;I)V")
    public static final void method843(class22 arg0, class22 arg1, int arg2) {
        class235.field3928 = arg0;
        field2059++;
        class214.field3546 = arg1;
        if (arg2 != -2) {
            method848((byte) -119);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IB)Lij;")
    public final class50 method844(int arg0, byte arg1) {
        if (arg1 > -106) {
            return null;
        }
        field2070++;
        if (this.field2062 == null) {
            return this.field2069;
        } else {
            class79 var3 = (class79) this.field2062.method443((long) arg0, (byte) -100);
            return var3 == null ? this.field2069 : var3.field1453;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)I")
    public final int method845(int arg0, int arg1) {
        int var3 = 106 / ((-arg1 - 65) / 47);
        field2063++;
        if (this.field2062 == null) {
            return this.field2065;
        } else {
            class199 var4 = (class199) this.field2062.method443((long) arg0, (byte) 81);
            return var4 == null ? this.field2065 : var4.field3286;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lwd;Z)V")
    public final void method846(class217 arg0, boolean arg1) {
        field2071++;
        while (true) {
            int var3 = arg0.method1487(255);
            if (var3 == 0) {
                if (arg1) {
                    return;
                } else {
                    this.method844(-2, (byte) -90);
                    return;
                }
            }
            this.method842(-3, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IB)V")
    public static final void method847(int arg0, byte arg1) {
        if (arg1 != -76) {
            method843((class22) null, (class22) null, 55);
        }
        field2068++;
        if (arg0 == -1 || !class10.method67(arg0, (byte) 117)) {
            return;
        }
        class10[] var2 = class137.field2380[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class10 var4 = var2[var3];
            if (var4.field212 != null) {
                class93 var5 = new class93();
                var5.field1739 = var4.field212;
                var5.field1740 = var4;
                class208.method1397(var5, arg1 ^ 0xFFFFC811, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public static void method848(byte arg0) {
        field2064 = null;
        if (arg0 != 113) {
            field2064 = null;
        }
    }
}
