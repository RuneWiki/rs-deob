import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class458 {

    @OriginalMember(owner = "client!st", name = "a", descriptor = "Ljava/lang/String;")
    public String field6455;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "Ljava/lang/String;")
    public String field6459;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "Ljava/lang/String;")
    public String field6456;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "Loh;")
    public static class425 field6462 = new class425("", 12);

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "Ljl;")
    public static class286 field6463;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)V")
    public static void method2771(boolean arg0) {
        field6462 = null;
        if (arg0) {
            method2773((byte) -95, null);
        }
        field6463 = null;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILlc;)[Lnga;")
    public static final class540[] method2772(int arg0, class675 arg1) {
        field6457++;
        if (!arg1.method3791(-89)) {
            return new class540[0];
        }
        class561 var2 = arg1.method3803(false);
        while (var2.field7769 == 0) {
            class594.method3405(10L, 16711680);
        }
        if (var2.field7769 == 2) {
            return new class540[0];
        }
        if (arg0 != 4095) {
            field6462 = null;
        }
        int[] var3 = (int[]) var2.field7768;
        class540[] var4 = new class540[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class540 var6 = new class540();
            var4[var5] = var6;
            var6.field7593 = var3[var5 << 2];
            var6.field7597 = var3[(var5 << 2) + 1];
            var6.field7596 = var3[(var5 << 2) + 2];
            var6.field7599 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method2773(byte arg0, byte[] arg1) {
        field6458++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        if (arg0 < 126) {
            return null;
        } else {
            class211.method1330(arg1, 0, var3, 0, var2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIII)I")
    public static final int method2774(int arg0, int arg1, int arg2, int arg3) {
        field6464++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 4095 - arg3;
        } else if (arg0 == 467485538) {
            return 4095 - arg2;
        } else {
            return 16;
        }
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class458(String arg0, String arg1, String arg2) {
        this.field6455 = arg2;
        this.field6459 = arg0;
        this.field6456 = arg1;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(III)V")
    public static final void method2775(int arg0, int arg1, int arg2) {
        field6461++;
        class714 var3 = class350.method2072((long) arg1, 12, (byte) 110);
        var3.method4043(arg2 + 25056);
        if (arg2 != -18676) {
            field6462 = null;
        }
        var3.field10021 = arg0;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZI)Z")
    public static final boolean method2776(boolean arg0, int arg1) {
        if (arg0) {
            field6463 = null;
        }
        field6460++;
        return arg1 == 4 || arg1 == 8 || arg1 == 11;
    }
}
