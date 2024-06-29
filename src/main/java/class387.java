import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class387 {

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Ljc;")
    public static class305 field5623 = new class305("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "[I")
    public static int[] field5624 = new int[256];

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2349(boolean arg0) {
        if (arg0) {
            field5624 = null;
            field5623 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)I", line = 16)
    public static final int method2350(int arg0, int arg1) {
        field5622++;
        if (arg1 != -16900) {
            return -79;
        } else if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIII)V", line = 45)
    public static final void method2351(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 << 3;
        int var5 = arg2 << 3;
        int var6 = arg0 << 3;
        field5625++;
        if (arg3 > -56) {
            method2350(93, -63);
        }
        if (class47.field491 == 2) {
            class9.field110 = var4;
            class65.field739 = var6;
            class230.field3104 = var5;
        }
        class143.field1907 = var4;
        class199.field2650 = var6;
        class408.method2499((byte) 126);
        class419.field6089 = true;
    }
}
