import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class328 {

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "[I")
    private int[] field4406;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    public static int field4411 = 0;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "Z")
    public static boolean field4410 = false;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "[[[I")
    public static int[][][] field4408;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)I", line = 4)
    public final int method1908(int arg0, int arg1) {
        field4409++;
        if (arg1 != 0) {
            field4411 = 23;
        }
        int var3 = (this.field4406.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field4406[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4406[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "([I)V", line = 32)
    public class328(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field4406 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field4406[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field4406[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field4406[var5 + var5] = arg0[var4];
            this.field4406[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V", line = 73)
    public static void method1909(int arg0) {
        if (arg0 != 2396) {
            field4408 = null;
        }
        field4408 = null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIII)V", line = 89)
    public static final void method1910(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class602.field8408.field4310 != 0 && arg0 != 0 && class413.field5414 < 50 && arg4 != -1) {
            class67.field824[class413.field5414++] = new class480((byte) 1, arg4, arg0, arg2, arg3, arg5);
        }
        if (arg1 < 114) {
            field4411 = -61;
        }
        field4407++;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IZIB)V", line = 107)
    public static final void method1911(int arg0, boolean arg1, int arg2, byte arg3) {
        if (arg3 >= -105) {
            field4411 = 33;
        }
        field4405++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class59.field747 = arg1;
        class108.field1275 = arg2;
        class169.field2422 = arg0;
    }
}
