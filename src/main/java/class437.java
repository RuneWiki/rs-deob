import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class437 extends class462 {

    @OriginalMember(owner = "client!uw", name = "L", descriptor = "[[I")
    public static int[][] field6319 = new int[128][128];

    @OriginalMember(owner = "client!uw", name = "H", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!uw", name = "I", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!uw", name = "J", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!uw", name = "K", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!uw", name = "G", descriptor = "[B")
    private byte[] field6314;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Z)V")
    public static void method2619(boolean arg0) {
        if (!arg0) {
            method2622(-128);
        }
        field6319 = null;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIII)[B")
    public final byte[] method2620(int arg0, int arg1, int arg2, int arg3) {
        field6317++;
        this.field6314 = new byte[arg0 * arg2 * 2 * arg3];
        if (arg1 == 34037) {
            this.method69(arg2, arg3, true, arg0);
            return this.field6314;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "()V")
    public class437() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ZIB)V")
    public final void method2621(boolean arg0, int arg1, byte arg2) {
        field6316++;
        int var4 = arg1 * 2;
        byte var5 = (byte) ((arg2 >> 1 & 0x7F) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field6314[var10001] = var5;
        this.field6314[var6] = var5;
        if (arg0) {
            field6319 = null;
        }
    }

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "(I)V")
    public static final void method2622(int arg0) {
        if (arg0 > -4) {
            return;
        }
        if (class41.field425 != null) {
            class334[] var1 = class41.field425;
            for (int var2 = 0; var2 < var1.length; var2++) {
                class334 var3 = var1[var2];
                var3.method306(11133);
            }
        }
        field6315++;
    }
}
