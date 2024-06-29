import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class285 {

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "Z")
    private boolean field4241 = false;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public int field4240 = 0;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public int field4229 = 0;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "[I")
    public static int[] field4245;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public int field4232;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public int field4233;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public int field4234;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    private int field4235;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public int field4236;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public int field4242;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public int field4243;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public int field4244;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public int field4246;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public int field4247;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "J")
    public long field4239;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "Lf;")
    public static class191 field4250;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "Ljb;")
    public static class499 field4249;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLtl;I)V")
    private final void method1853(byte arg0, class91 arg1, int arg2) {
        field4230++;
        if (arg2 == 1) {
            this.field4235 = arg1.method631(10494);
        } else if (arg2 == 2) {
            arg1.method618((byte) 100);
        } else if (arg2 == 3) {
            this.field4234 = arg1.method626((byte) 100);
            this.field4242 = arg1.method626((byte) 100);
            this.field4247 = arg1.method626((byte) 100);
        } else if (arg2 == 4) {
            this.field4243 = arg1.method618((byte) 100);
            this.field4244 = arg1.method626((byte) 100);
        } else if (arg2 == 6) {
            this.field4236 = arg1.method618((byte) 100);
        } else if (arg2 == 8) {
            this.field4229 = 1;
        } else if (arg2 == 9) {
            this.field4240 = 1;
        } else if (arg2 == 10) {
            this.field4241 = true;
        }
        if (arg0 >= -18) {
            field4249 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
    public static void method1854(byte arg0) {
        field4245 = null;
        field4250 = null;
        field4249 = null;
        if (arg0 != -16) {
            field4249 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILtl;)V")
    public final void method1855(int arg0, class91 arg1) {
        field4231++;
        if (arg0 != -12565) {
            return;
        }
        while (true) {
            int var3 = arg1.method618((byte) 100);
            if (var3 == 0) {
                return;
            }
            this.method1853((byte) -40, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public final void method1856(int arg0) {
        this.field4232 = class525.field7763[this.field4235 << 3];
        field4238++;
        this.field4233 = (int) Math.sqrt((double) (this.field4234 * this.field4234 - (-(this.field4247 * this.field4247) - (this.field4242 * this.field4242))));
        if (this.field4244 == 0) {
            this.field4244 = 1;
        }
        if (this.field4243 == 0) {
            this.field4239 = 2147483647L;
        } else if (this.field4243 == 1) {
            this.field4239 = (this.field4233 * 8 / this.field4244);
            this.field4239 *= this.field4239;
        } else if (this.field4243 == 2) {
            this.field4239 = (this.field4233 * 8 / this.field4244);
        }
        if (this.field4241) {
            this.field4233 *= -1;
        }
        if (arg0 != -9) {
            this.method1853((byte) -75, null, 10);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)V")
    public static final void method1857(int arg0, byte arg1) {
        field4237++;
        class377 var2 = class99.method672(arg0, false, 6);
        if (arg1 == 112) {
            var2.method2339(-11688);
        }
    }

    static {
        new class375("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field4245 = new int[13];
    }
}
