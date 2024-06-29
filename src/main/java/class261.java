import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class261 extends class101 {

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public int field3954;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "[Ldh;")
    public static class134[] field3952 = new class134[14];

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "[I")
    public static int[] field3949 = new int[4096];

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "Z")
    public static boolean field3955;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "Llm;")
    public static class210 field3956;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([I[Ljava/lang/Object;I)V", line = 4)
    public static final void method1762(int[] arg0, Object[] arg1, int arg2) {
        field3950++;
        class169.method1177(arg0.length + arg2, arg0, (byte) -123, 0, arg1);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BZ)I", line = 19)
    public static final int method1763(byte arg0, boolean arg1) {
        if (arg0 != -40) {
            field3949 = (int[]) null;
        }
        long var2 = class231.method1594(-20375);
        field3951++;
        for (class172 var4 = arg1 ? (class172) class285.field4305.method1321((byte) -88) : (class172) class285.field4305.method1330((byte) -93); var4 != null; var4 = (class172) class285.field4305.method1330((byte) -36)) {
            if ((var4.field2587 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field2587 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field1603;
                    class185.field2763[var5] = class265.field4058[var5];
                    var4.method714(arg0 + 133);
                    return var5;
                }
                var4.method714(-113);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V", line = 57)
    public static void method1764(int arg0) {
        field3956 = null;
        field3949 = null;
        int var1 = -126 % ((-arg0 - 61) / 50);
        field3952 = null;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3949[var0] = class325.method2217((byte) 39, var0);
        }
        field3955 = false;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V", line = 73)
    public class261() {
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V", line = 77)
    public static final void method1765(boolean arg0) {
        class73.field957.method2176((byte) -68);
        if (arg0) {
            field3956 = (class210) null;
        }
        field3953++;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(I)V", line = 100)
    public class261(int arg0) {
        this.field3954 = arg0;
    }
}
