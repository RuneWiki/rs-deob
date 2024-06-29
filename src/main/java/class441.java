import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class441 extends class466 {

    @OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
    private int field6285 = 0;

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
    private int field6282 = 4096;

    @OriginalMember(owner = "client!fo", name = "F", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!fo", name = "G", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!fo", name = "I", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "()V")
    public class441() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (arg1 != -5062) {
            this.method2(38, -39);
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field6282 = arg0.method93((byte) 122);
            }
        } else {
            this.field6285 = arg0.method93((byte) 80);
        }
        ++field6286;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field6284;
        if (arg1 != 0) {
            this.method2(-41, 121);
        }
        int[] var3 = super.field6557.method565(arg0, -24728);
        if (super.field6557.field1163) {
            int[] var4 = this.method2721(0, arg0, arg1 ^ 2);
            for (int var5 = 0; var5 < class312.field4207; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field6285 && this.field6282 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2616(String arg0, int arg1) {
        ++field6283;
        if (class587.field8394 != null) {
            ++class474.field6668;
            class351.method2108(class397.field5659, -10511);
            class479.field6754.method108((byte) -128, class452.method2655(-71, arg0));
            class479.field6754.method74(arg0, arg1);
        }
    }
}
