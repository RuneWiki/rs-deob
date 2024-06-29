import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public abstract class class24 extends class659 {

    @OriginalMember(owner = "client!qo", name = "x", descriptor = "I")
    public int field244;

    @OriginalMember(owner = "client!qo", name = "y", descriptor = "Lst;")
    public class457 field245;

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "[I")
    public static int[] field242 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!qo", name = "z", descriptor = "Z")
    public static boolean field246 = false;

    @OriginalMember(owner = "client!qo", name = "A", descriptor = "Z")
    public static boolean field247 = false;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "Ljb;")
    public static class519 field239 = new class519(94, 7);

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "F")
    public static float field241;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!qo", name = "w", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method141(byte arg0);

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
    public static void method142(int arg0) {
        field239 = null;
        field242 = null;
        if (arg0 != 94) {
            method143(true, (byte) -92);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZB)V")
    public static final void method143(boolean arg0, byte arg1) {
        field240++;
        int var2 = class269.field3927;
        int var3 = class322.field4576;
        int var4 = -35 / ((65 - arg1) / 58);
        if (arg0 && class408.field5786) {
            var2 <<= 0x1;
            var3 = -var2;
        }
        class375.field5490.method518(var3, var2);
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "(B)Z")
    public abstract boolean method144(byte arg0);

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lst;I)V")
    public class24(class457 arg0, int arg1) {
        this.field244 = arg1;
        this.field245 = arg0;
    }
}
