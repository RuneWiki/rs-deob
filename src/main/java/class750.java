import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class750 {

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "Z")
    public static boolean field10331 = false;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field10329;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field10330;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public int field10332;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field10333;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public int field10334;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field10335;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "[Lnba;")
    public class316[] field10336;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljp;B)V", line = 4)
    public final void method4144(class376 arg0, byte arg1) {
        field10330++;
        this.field10332 = arg0.method2373(arg1 ^ 0x48E9808B);
        this.field10334 = arg0.method2359(-1);
        this.field10336 = new class316[arg0.method2398(arg1 ^ 0xAE2D8A5B)];
        class546[] var3 = class52.method385(arg1 ^ 0xFFFFFFEC);
        int var4 = 0;
        if (arg1 != 83) {
            this.field10332 = 15;
        }
        while (this.field10336.length > var4) {
            this.field10336[var4] = this.method4146(30, arg0, var3[arg0.method2398(-1372747256)]);
            var4++;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V", line = 31)
    public static final void method4145(byte arg0) {
        if (class184.field2474 == 1 || class184.field2474 == 3 || class364.field5298 != class184.field2474 && (class184.field2474 == 0 || class364.field5298 == 0)) {
            class184.field2457 = 0;
            class688.field9678 = 0;
            class234.field3169.method3959(arg0 ^ 0xFFFFFFE1);
        }
        field10335++;
        if (arg0 == -31) {
            class364.field5298 = class184.field2474;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILjp;Lhv;)Lnba;", line = 55)
    private final class316 method4146(int arg0, class376 arg1, class546 arg2) {
        int var4 = 55 % ((arg0 + 83) / 42);
        field10329++;
        if (class503.field6971 == arg2) {
            return class592.method3299(arg1, 20859);
        } else if (class193.field2588 == arg2) {
            return class537.method3071(arg1, -1);
        } else if (class788.field10848 == arg2) {
            return class136.method1066(arg1, 0);
        } else if (class59.field818 == arg2) {
            return class114.method852(arg1, 21157);
        } else if (class522.field7160 == arg2) {
            return class250.method1679(arg1, -84);
        } else if (class148.field2077 == arg2) {
            return class347.method2195(-4971, arg1);
        } else if (class10.field159 == arg2) {
            return class613.method3384((byte) -63, arg1);
        } else if (class537.field7304 == arg2) {
            return class158.method1160(arg1, 65408);
        } else if (class52.field752 == arg2) {
            return class34.method241(arg1, 3);
        } else if (class178.field2374 == arg2) {
            return class763.method4239(117, arg1);
        } else {
            return null;
        }
    }
}
