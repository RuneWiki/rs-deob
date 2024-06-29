import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class394 extends class107 {

    @OriginalMember(owner = "client!hw", name = "G", descriptor = "[S")
    public static short[] field5681 = new short[256];

    @OriginalMember(owner = "client!hw", name = "J", descriptor = "[I")
    public static int[] field5684 = new int[500];

    @OriginalMember(owner = "client!hw", name = "F", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!hw", name = "I", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!hw", name = "L", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!hw", name = "H", descriptor = "Lea;")
    public static class115 field5682;

    @OriginalMember(owner = "client!hw", name = "K", descriptor = "[B")
    private byte[] field5685;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "(I)V", line = 3)
    public static void method2335(int arg0) {
        field5681 = null;
        field5684 = null;
        int var1 = 10 / ((arg0 - 20) / 55);
        field5682 = null;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;", line = 16)
    public static final Object method2336(boolean arg0, byte[] arg1, boolean arg2) {
        field5683++;
        if (arg2) {
            field5682 = null;
        }
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class322.field4424) {
            try {
                class527 var3 = (class527) Class.forName("uh").getDeclaredConstructor().newInstance();
                var3.method2384(0, arg1);
                return var3;
            } catch (Throwable var4) {
                class322.field4424 = true;
            }
        }
        return arg0 ? class130.method934(arg1, (byte) 95) : arg1;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(IIII)[B", line = 49)
    public final byte[] method2337(int arg0, int arg1, int arg2, int arg3) {
        field5686++;
        this.field5685 = new byte[arg0 * arg2 * arg1 * 2];
        this.method2431(1709506092, arg2, arg1, arg0);
        return arg3 <= 9 ? null : this.field5685;
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "()V", line = 65)
    public class394() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(BIB)V", line = 69)
    public final void method822(byte arg0, int arg1, byte arg2) {
        if (arg0 <= 65) {
            method2336(true, null, true);
        }
        field5680++;
        int var4 = arg1 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field5685[var10001] = (byte) (var5 * 3 >> 5);
        this.field5685[var6] = (byte) (var5 * 3 >> 5);
    }
}
