import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class211 {

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public int field2567 = 128;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public int field2577 = 128;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public int field2572;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public int field2579;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public int field2570;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public int field2569;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Lvj;")
    public static class373 field2576 = new class373(36, -1);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public int field2565;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public int field2566;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public int field2571;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public int field2578;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)Lkf;", line = 3)
    public final class211 method1210(byte arg0) {
        if (arg0 >= -7) {
            method1213(-123);
        }
        field2574++;
        return new class211(this.field2572, this.field2577, this.field2567, this.field2579, this.field2569, this.field2570);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 17)
    public static final String method1211(String arg0, int arg1) {
        field2573++;
        if (arg1 >= -6) {
            return null;
        } else if (class165.field2026.startsWith("win")) {
            return arg0 + ".dll";
        } else if (class165.field2026.startsWith("linux")) {
            return "lib" + arg0 + ".so";
        } else if (class165.field2026.startsWith("mac")) {
            return "lib" + arg0 + ".jnilib";
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(I)V", line = 114)
    public class211(int arg0) {
        this.field2572 = arg0;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(IIIIII)V", line = 121)
    private class211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2579 = arg3;
        this.field2567 = arg2;
        this.field2570 = arg5;
        this.field2577 = arg1;
        this.field2572 = arg0;
        this.field2569 = arg4;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V", line = 46)
    public static final void method1212(boolean arg0) {
        class184.field2230 = -1;
        if (arg0) {
            field2576 = null;
        }
        class91.field1121 = 1;
        field2575++;
        long var1 = 0L;
        if (class59.field562 == null) {
            class19.method130((byte) 113, 35);
        } else {
            class374 var3 = new class374(class384.method2217(class271.method1510(class59.field562, 100), (byte) -61));
            long var4 = var3.method2107(-128);
            class66.field637 = var3.method2107(-115);
            class81.method476(true, -2, class589.method3418(var4, (byte) 53), "");
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 76)
    public static void method1213(int arg0) {
        field2576 = null;
        int var1 = -8 / ((-arg0 - 24) / 59);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLkf;)V", line = 87)
    public final void method1214(byte arg0, class211 arg1) {
        this.field2567 = arg1.field2567;
        this.field2572 = arg1.field2572;
        field2568++;
        this.field2569 = arg1.field2569;
        this.field2570 = arg1.field2570;
        if (arg0 >= -74) {
            this.method1214((byte) -121, null);
        }
        this.field2579 = arg1.field2579;
        this.field2577 = arg1.field2577;
    }
}
