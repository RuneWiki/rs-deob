import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class277 {

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "J")
    public static volatile long field4525 = 0L;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Z")
    public static boolean field4524 = true;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4526 = "Connecting to update server";

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Lal;")
    private class252 field4529;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Lja;")
    private class61 field4530;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "[I")
    public static int[] field4528;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static void method1888(byte arg0) {
        field4526 = null;
        int var1 = 28 % ((arg0 + 37) / 63);
        field4528 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lja;I)V")
    public final void method1889(class61 arg0, int arg1) {
        field4523++;
        this.field4530 = arg0;
        if (arg1 != -19110) {
            method1892(-37, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)Lal;")
    public final class252 method1890(boolean arg0) {
        class252 var2 = this.field4530.field879.field4140;
        field4522++;
        if (this.field4530.field879 == var2) {
            this.field4529 = null;
            return null;
        }
        if (arg0) {
            this.method1889((class61) null, 62);
        }
        this.field4529 = var2.field4140;
        return var2;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)Lal;")
    public final class252 method1891(boolean arg0) {
        field4527++;
        if (arg0) {
            this.method1891(true);
        }
        class252 var2 = this.field4529;
        if (this.field4530.field879 == var2) {
            this.field4529 = null;
            return null;
        } else {
            this.field4529 = var2.field4140;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)I")
    public static final int method1892(int arg0, byte arg1) {
        int var2 = -86 % ((arg1 - 33) / 49);
        field4531++;
        int var3 = arg0 & 0x3F;
        int var4 = (arg0 & 0xE3) >> 6;
        if (var3 == 18) {
            if (var4 == 0) {
                return 1;
            }
            if (var4 == 1) {
                return 2;
            }
            if (var4 == 2) {
                return 4;
            }
            if (var4 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var4 == 0) {
                return 16;
            }
            if (var4 == 1) {
                return 32;
            }
            if (var4 == 2) {
                return 64;
            }
            if (var4 == 3) {
                return 128;
            }
        }
        return 0;
    }
}
