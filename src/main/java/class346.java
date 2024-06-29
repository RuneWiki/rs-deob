import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class346 {

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public int field5075 = 2;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "Z")
    public boolean field5073 = false;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "Z")
    public boolean field5076 = false;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public int field5077 = 1;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
    public int field5074 = -1;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
    public int field5081 = 64;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
    public int field5080 = 64;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IILjp;I)V")
    private final void method2189(int arg0, int arg1, class376 arg2, int arg3) {
        field5079++;
        if (arg1 == 1) {
            this.field5074 = arg2.method2359(arg3 - 32580);
            if (this.field5074 == 65535) {
                this.field5074 = -1;
            }
        } else if (arg1 == 2) {
            this.field5080 = arg2.method2359(arg3 - 32580) + 1;
            this.field5081 = arg2.method2359(arg3 - 32580) + 1;
        } else if (arg1 == 3) {
            arg2.method2387((byte) 81);
        } else if (arg1 == 4) {
            this.field5075 = arg2.method2398(-1372747256);
        } else if (arg1 == 5) {
            this.field5077 = arg2.method2398(-1372747256);
        } else if (arg1 == 6) {
            this.field5073 = true;
        } else if (arg1 == 7) {
            this.field5076 = true;
        }
        if (arg3 != 32579) {
            this.field5080 = -16;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILjp;I)V")
    public final void method2190(int arg0, class376 arg1, int arg2) {
        if (arg0 != 6) {
            return;
        }
        while (true) {
            int var4 = arg1.method2398(-1372747256);
            if (var4 == 0) {
                field5078++;
                return;
            }
            this.method2189(arg2, var4, arg1, 32579);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lda;)V")
    public static final void method2191(class66 arg0) {
        class644.field8947 = arg0;
    }
}
