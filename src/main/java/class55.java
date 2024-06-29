import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class55 extends class512 {

    @OriginalMember(owner = "client!wba", name = "n", descriptor = "[I")
    public int[] field652;

    @OriginalMember(owner = "client!wba", name = "l", descriptor = "[I")
    public int[] field650;

    @OriginalMember(owner = "client!wba", name = "i", descriptor = "I")
    public static int field647 = 0;

    @OriginalMember(owner = "client!wba", name = "j", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!wba", name = "m", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!wba", name = "o", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!wba", name = "k", descriptor = "Lef;")
    public static class513 field649;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZIII)I")
    public static final int method336(boolean arg0, int arg1, int arg2, int arg3) {
        field653++;
        class358 var4 = class559.method3192(arg3, arg0, Integer.MIN_VALUE);
        if (var4 == null) {
            return 0;
        } else {
            if (arg2 != -24226) {
                field647 = -78;
            }
            return arg1 >= 0 && var4.field5213.length > arg1 ? var4.field5213[arg1] : 0;
        }
    }

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "(I)V")
    public static void method337(int arg0) {
        field649 = null;
        if (arg0 != 0) {
            field649 = null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZI)V")
    public static final void method338(boolean arg0, int arg1) {
        field651++;
        if (class753.field10200.length() == 0) {
            return;
        }
        class280.method1834((byte) 88, "--> " + class753.field10200);
        class159.method1103(arg0, false, (byte) 102, class753.field10200);
        class753.field10200 = "";
        class446.field6419 = 0;
        class382.field5560 = 0;
        int var2 = -127 / ((-arg1 - 31) / 59);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IZ)V")
    public static final void method339(int arg0, boolean arg1) {
        field648++;
        if (class180.field2361 == null) {
            class45.method298(arg0 ^ 0xFFFFFF9F);
        }
        if (arg0 == 0 && arg1) {
            class180.field2361.method1002(arg0 + 90);
        }
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(II[I[I)V")
    public class55(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field652 = arg3;
        this.field650 = arg2;
    }
}
