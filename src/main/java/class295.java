import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class295 {

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "B")
    public byte field4265;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public int field4259;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    public int field4264;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public int field4263;

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "I")
    public int field4278;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "Lvq;")
    public class295 field4266;

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
    public static int field4273 = -1;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public int field4260;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public int field4262;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
    public int field4267;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
    public int field4268;

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
    public int field4270;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "I")
    public int field4271;

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
    public int field4272;

    @OriginalMember(owner = "client!vq", name = "p", descriptor = "I")
    public int field4274;

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
    public int field4277;

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "Los;")
    public static class282 field4269;

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "[Ltr;")
    public static class176[] field4276;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public static void method1829(int arg0) {
        if (arg0 == -1) {
            field4269 = null;
            field4276 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)Z")
    public static final boolean method1830(int arg0) {
        field4261++;
        if (class370.field5341) {
            try {
                if ((Boolean) class429.method2520(class252.field3718.field6021, (byte) 92, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != -1) {
            method1830(28);
        }
        return true;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
    public static final void method1831(byte arg0) {
        if (arg0 != 103) {
            return;
        }
        if (class200.field2918 != -1) {
            class168.method1040(class200.field2918, -1, false, (byte) -76, -1);
            class200.field2918 = -1;
        }
        field4275++;
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(IIIIB)V")
    public class295(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field4265 = arg4;
        this.field4259 = arg3;
        this.field4264 = arg1;
        this.field4263 = arg2;
        this.field4278 = arg0;
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lvq;I)V")
    public class295(class295 arg0, int arg1) {
        this.field4266 = arg0;
        this.field4265 = this.field4266.field4265;
        this.field4259 = this.field4266.field4259 + arg1;
        this.field4278 = this.field4266.field4278;
        this.field4263 = this.field4266.field4263 + arg1;
        this.field4264 = this.field4266.field4264 + arg1;
    }
}
