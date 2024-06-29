import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class431 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Lgda;")
    public class50 field6184 = null;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Lla;")
    public class419 field6188 = null;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Ljk;")
    public static class585 field6185 = new class585(8, -1);

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II[B)[B", line = 4)
    public static final byte[] method2589(int arg0, int arg1, byte[] arg2) {
        field6186++;
        byte[] var3 = new byte[arg1];
        class252.method1545(arg2, 0, var3, arg0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lkv;ILjn;Lmt;Ljn;Ljn;)Z", line = 16)
    public static final boolean method2590(class245 arg0, int arg1, class668 arg2, class364 arg3, class668 arg4, class668 arg5) {
        class601.field8666 = arg3;
        class549.field7964 = arg0;
        class14.field237 = arg4;
        field6187++;
        class489.field6839 = arg2;
        class487.field6808 = arg5;
        for (int var6 = arg1; var6 < 16; var6++) {
            class505.field7051[var6] = 255;
        }
        return true;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V", line = 40)
    public static void method2591(byte arg0) {
        if (arg0 != -125) {
            method2590(null, -95, null, null, null, null);
        }
        field6185 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLn;I)V", line = 51)
    public static final void method2592(boolean arg0, class17 arg1, int arg2) {
        field6189++;
        int var3 = ~arg1.field375 == arg2 ? arg1.field414 : arg1.field375;
        int var4 = arg1.field343 == 0 ? arg1.field402 : arg1.field343;
        class503.method2917(var3, arg1.field465, arg0, 0, var4, class516.field7555[arg1.field465 >> 16]);
        if (arg1.field429 != null) {
            class503.method2917(var3, arg1.field465, arg0, 0, var4, arg1.field429);
        }
        class21 var5 = (class21) class113.field1442.method3678((long) arg1.field465, -126);
        if (var5 != null) {
            class326.method1895(var4, (byte) 101, var3, var5.field540, arg0);
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lla;)V", line = 85)
    public class431(class419 arg0) {
        this.field6188 = arg0;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lla;Lgda;)V", line = 92)
    public class431(class419 arg0, class50 arg1) {
        this.field6188 = arg0;
        this.field6184 = arg1;
    }
}
