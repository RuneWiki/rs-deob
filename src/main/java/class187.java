import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class187 extends class5 {

    @OriginalMember(owner = "client!s", name = "n", descriptor = "J")
    public long field2513;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "[I")
    public static int[] field2510 = new int[256];

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Lni;")
    public static class367 field2511 = new class367(39, 15);

    @OriginalMember(owner = "client!s", name = "p", descriptor = "S")
    public static short field2515 = 205;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "F")
    public static float field2512;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 10)
    public static void method1254(int arg0) {
        field2510 = null;
        if (arg0 == -32297) {
            field2511 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IJ)V", line = 22)
    public static final void method1255(int arg0, long arg1) {
        field2516++;
        if (arg0 != 0) {
            field2515 = 23;
        }
        int var3 = class62.field883;
        if (class366.field5609 != var3) {
            int var4 = var3 - class366.field5609;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 <= 0) {
                if (var5 == 0) {
                    var5 = -1;
                } else if (var5 < var4) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = 1;
            } else if (var4 < var5) {
                var5 = var4;
            }
            class366.field5609 += var5;
        }
        int var6 = class21.field320;
        if (!class203.field2716.field1180) {
            class536.field7870 += (float) arg1 * class172.field2319 / 40.0F * 8.0F;
            class53.field744 += (float) arg1 * class138.field1845 / 40.0F * 8.0F;
        }
        if (class312.field4571 != var6) {
            int var7 = var6 - class312.field4571;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class312.field4571 += var8;
        }
        class89.method598((byte) 40);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V", line = 111)
    public static final void method1256(byte arg0) {
        field2509++;
        if (class203.field2716.method15(class378.field5771, 0) || class367.field5618 == class253.field3515) {
            class335.method2164(class400.field6090, -118);
            if (arg0 < -3 && class367.field5618 != class348.field5380) {
                class177.method1186((byte) 113);
            }
        } else {
            class175.method1178(class276.field3936, 10, (byte) -80, class492.field7259, false);
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V", line = 136)
    public class187() {
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(J)V", line = 139)
    public class187(long arg0) {
        this.field2513 = arg0;
    }
}
