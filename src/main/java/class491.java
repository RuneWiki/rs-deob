import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class491 extends class529 {

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "Lof;")
    public static class328 field7427 = new class328(4);

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "[B")
    public static byte[] field7435 = new byte[520];

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    public static int field7438 = 64;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public int field7424;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public int field7426;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public int field7428;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public static int field7429;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public int field7431;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public int field7433;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public static int field7437;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    public int field7439;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Lgi;")
    public class437 field7422;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "Lgi;")
    public class437 field7423;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "Ljava/lang/String;")
    public String field7434;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "Z")
    public boolean field7421;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "[Lo;")
    public static class139[] field7436;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "[Ljava/lang/Object;")
    public Object[] field7430;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lhw;I)V")
    public static final void method3011(class208 arg0, int arg1) {
        field7429++;
        int var2 = arg0.method1481(false);
        class9.field101 = new class16[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class9.field101[var3] = new class16();
            class9.field101[var3].field164 = arg0.method1481(false);
            class9.field101[var3].field166 = arg0.method1463((byte) -96);
        }
        class257.field4150 = arg0.method1481(false);
        class168.field2457 = arg0.method1481(false);
        class292.field4601 = arg0.method1481(false);
        class326.field5124 = new class68[class168.field2457 + 1 - class257.field4150];
        if (arg1 >= -82) {
            return;
        }
        for (int var4 = 0; var4 < class292.field4601; var4++) {
            int var5 = arg0.method1481(false);
            class68 var6 = class326.field5124[var5] = new class68();
            var6.field2435 = arg0.method1445(-98);
            var6.field2440 = arg0.method1436((byte) 96);
            var6.field1036 = class257.field4150 + var5;
            var6.field1035 = arg0.method1463((byte) -79);
            var6.field1032 = arg0.method1463((byte) -120);
        }
        class506.field7568 = arg0.method1436((byte) 121);
        class435.field6571 = true;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)I")
    public static final int method3012(int arg0, int arg1, int arg2) {
        field7432++;
        if (arg0 != 424462657) {
            return -24;
        }
        int var3 = 0;
        while (arg1 > 0) {
            var3 = var3 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
            arg1--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method3013(int arg0) {
        field7436 = null;
        field7435 = null;
        if (arg0 > -48) {
            field7437 = 36;
        }
        field7427 = null;
    }
}
