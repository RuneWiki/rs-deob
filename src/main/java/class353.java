import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class353 {

    @OriginalMember(owner = "client!no", name = "g", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public int field5216;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    public int field5217;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public int field5218;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "Lal;")
    public static class198 field5222;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "[I")
    public static int[] field5221;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V")
    public static void method2114(byte arg0) {
        field5222 = null;
        if (arg0 != 70) {
            method2114((byte) -75);
        }
        field5221 = null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lef;I)V")
    public final void method2115(class385 arg0, int arg1) {
        field5224++;
        while (true) {
            int var3 = arg0.method2343(255);
            if (var3 == 0) {
                if (arg1 == -17945) {
                    return;
                } else {
                    this.method2115((class385) null, 92);
                    return;
                }
            }
            this.method2118(var3, arg0, -6117);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V")
    public static final void method2116(boolean arg0) {
        if (class295.field4480 < 0) {
            class318.field4811 = -1;
            class191.field2843 = -1;
            class295.field4480 = 0;
        }
        field5214++;
        if (class223.field3402 < class295.field4480) {
            class191.field2843 = -1;
            class318.field4811 = -1;
            class295.field4480 = class223.field3402;
        }
        if (class217.field3305 < 0) {
            class217.field3305 = 0;
            class318.field4811 = -1;
            class191.field2843 = -1;
        }
        if (arg0) {
            method2114((byte) -87);
        }
        if (class223.field3403 < class217.field3305) {
            class191.field2843 = -1;
            class217.field3305 = class223.field3403;
            class318.field4811 = -1;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(II)V")
    public static final void method2117(int arg0, int arg1) {
        field5215++;
        class32 var2 = class136.method854(16, (byte) 125, arg1);
        if (arg0 == -50) {
            var2.method192(-17451);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILef;I)V")
    private final void method2118(int arg0, class385 arg1, int arg2) {
        if (arg2 != -6117) {
            return;
        }
        if (arg0 == 1) {
            this.field5218 = arg1.method2323(arg2 ^ 0x1797);
            this.field5216 = arg1.method2343(255);
            this.field5217 = arg1.method2343(arg2 + 6372);
        }
        field5223++;
    }

    static {
        new class463("", 73);
        field5220 = -50;
    }
}
