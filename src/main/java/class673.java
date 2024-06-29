import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class673 {

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Z")
    public boolean field9461 = false;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field9455;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field9457;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public int field9458;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field9459;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field9460;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field9462;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field9463;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public int field9464;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Llm;")
    public class40 field9456;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)Z")
    public final boolean method3777(byte arg0) {
        if (arg0 == -107) {
            field9457++;
            return this.field9456.field591.method1818(this.field9458, 4);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BILgk;)V")
    private final void method3778(byte arg0, int arg1, class540 arg2) {
        if (arg1 == 1) {
            this.field9458 = arg2.method3169(arg0 ^ 0x6708);
        } else if (arg1 == 2) {
            this.field9464 = arg2.method3154((byte) -77);
        } else if (arg1 == 3) {
            this.field9461 = true;
        } else if (arg1 == 4) {
            this.field9458 = -1;
        }
        field9455++;
        if (arg0 != 112) {
            this.method3778((byte) 49, -31, null);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIILr;)Lf;")
    public final class256 method3779(boolean arg0, int arg1, int arg2, class98 arg3) {
        field9459++;
        long var5 = (long) (this.field9458 | arg1 << 16 | (arg0 ? 262144 : 0) | arg3.field1500 << 19);
        class256 var7 = (class256) this.field9456.field605.method3901(var5, -95);
        if (var7 != null) {
            return var7;
        } else if (this.field9456.field591.method1818(this.field9458, 4)) {
            class616 var8 = class616.method3509(this.field9456.field591, this.field9458, 0);
            if (var8 != null) {
                var8.field8867 = var8.field8870 = var8.field8872 = var8.field8874 = 0;
                if (arg0) {
                    var8.method3519();
                }
                for (int var9 = 0; var9 < arg1; var9++) {
                    var8.method3507();
                }
            }
            if (arg2 < 116) {
                return null;
            }
            class256 var10 = arg3.method660(var8, true);
            if (var10 != null) {
                this.field9456.field605.method3894(var10, (byte) 60, var5);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLgk;)V")
    public final void method3780(byte arg0, class540 arg1) {
        field9463++;
        while (true) {
            int var3 = arg1.method3115(29871);
            if (var3 == 0) {
                int var4 = 9 % ((54 - arg0) / 34);
                return;
            }
            this.method3778((byte) 112, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)Z")
    public static final boolean method3781(int arg0, int arg1, int arg2) {
        if (arg0 != -2231) {
            field9460 = 111;
        }
        field9462++;
        return class505.method2876(arg1, 4, arg2) & class317.method1970(-1, arg2, arg1);
    }
}
