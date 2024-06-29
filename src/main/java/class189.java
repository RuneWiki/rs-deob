import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public abstract class class189 {

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "Ldb;")
    public static class298 field2792 = new class298(52, 5);

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method1236(String arg0, int arg1) {
        if (arg1 >= -117) {
            field2792 = null;
        }
        field2791++;
        int var2 = arg0.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + ((long) arg0.charAt(var5)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V")
    public static void method1237(byte arg0) {
        if (arg0 == -63) {
            field2792 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(FFIB[FIIFFII)V")
    public abstract void method1238(float arg0, float arg1, int arg2, byte arg3, float[] arg4, int arg5, int arg6, float arg7, float arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZII)Z")
    public static final boolean method1239(boolean arg0, int arg1, int arg2) {
        field2790++;
        if (arg0) {
            return false;
        } else {
            return (arg1 & 0x100) != 0;
        }
    }
}
