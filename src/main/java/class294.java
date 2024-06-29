import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class294 {

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "[I")
    private int[] field4435;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4432 = null;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field4429 = 0;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "[Lfb;")
    public static class252[] field4430;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V", line = 6)
    public static final void method2102(int arg0, int arg1) {
        field4438++;
        class348.field5382 = new int[arg1];
        class356.field5465 = new int[arg1];
        class107.field1549 = new int[arg1];
        if (arg0 != 12295) {
            field4429 = 13;
        }
        class86.field1223 = new int[arg1];
        class150.field2181 = new int[arg1];
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)V", line = 31)
    public static final void method2103(int arg0, int arg1) {
        field4436++;
        class236.field3545.method464(arg1 ^ 0xFFFFF2B9, arg0);
        if (arg1 != -1) {
            field4431 = -77;
        }
        class248.field3688.method464(3398, arg0);
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(II)I", line = 44)
    public final int method2104(int arg0, int arg1) {
        int var3 = (this.field4435.length >> 1) + arg1;
        field4434++;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field4435[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4435[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V", line = 73)
    public static void method2105(byte arg0) {
        int var1 = -43 % ((-arg0 - 38) / 39);
        field4432 = null;
        field4430 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIB)V", line = 87)
    public static final void method2106(int arg0, int arg1, byte arg2) {
        if (arg2 != 28) {
            field4432 = (String) null;
        }
        field4437++;
        class263.field4030 = new class57(arg0);
        class357.field5473 = new class57(arg1);
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "([I)V", line = 97)
    public class294(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field4435 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field4435[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field4435[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field4435[var5 + var5] = arg0[var4];
            this.field4435[var5 + var5 + 1] = var4++;
        }
    }
}
