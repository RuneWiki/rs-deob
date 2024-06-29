import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class315 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "[I")
    private int[] field3945;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Lws;")
    public static class333 field3946 = new class333();

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field3949 = 0;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "[I")
    public static int[] field3951 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "F")
    public static float field3950;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)V", line = 3)
    public static final void method1841(int arg0, boolean arg1) {
        if (!arg1) {
            field3951 = null;
        }
        field3944++;
        class532.method2873(128);
        int var2 = class185.field2186.method2093(arg0, 20039).field6657;
        if (var2 == 0) {
            return;
        }
        int var3 = class327.field4084.field666[arg0];
        if (var2 == 6) {
            class168.field1977 = var3;
        }
        if (var2 == 5) {
            class175.field2061 = var3;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 29)
    public static void method1842(int arg0) {
        field3951 = null;
        field3946 = null;
        if (arg0 < 117) {
            method1841(-16, false);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)I", line = 40)
    public final int method1843(int arg0, int arg1) {
        field3947++;
        int var3 = (this.field3945.length >> 1) - 1;
        if (arg0 != -1746) {
            return 116;
        }
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field3945[var4 - (-var4 - 1)];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3945[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([I)V", line = 68)
    public class315(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field3945 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3945[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3945[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field3945[var5 + var5] = arg0[var4];
            this.field3945[var5 + var5 + 1] = var4++;
        }
    }
}
