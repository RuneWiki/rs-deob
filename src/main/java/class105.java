import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class105 {

    @OriginalMember(owner = "client!di", name = "b", descriptor = "[I")
    public static int[] field1668 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!di", name = "e", descriptor = "[Lwl;")
    public static class304[] field1671 = new class304[14];

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field1673 = 5063219;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Ldk;")
    public static class251 field1667;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "[I")
    public static int[] field1672;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static final void method745(int arg0) {
        field1669++;
        int var1 = class169.field2756;
        int var2 = class67.field1114;
        int var3 = class96.field1543;
        int var4 = 6116423;
        int var5 = -125 / ((48 - arg0) / 44);
        int var6 = class72.field1211;
        class127.method886(var1, var2, var3, var6, var4);
        class127.method886(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class127.method898(var1 + 1, var2 - -18, var3 - 2, var6 + -19, 0);
        class59.field967.method645(class211.field3347, var1 + 3, var2 + 14, var4, -1);
        int var7 = class77.field1281;
        int var8 = class269.field4344;
        for (int var9 = 0; var9 < class83.field1384; var9++) {
            int var10 = (class83.field1384 - var9 - 1) * 15 + (var2 + 31);
            int var11 = 16777215;
            if (var1 < var8 && var1 + var3 > var8 && (var10 - 13) < var7 && var7 < var10 + 3) {
                var11 = 16776960;
            }
            class59.field967.method645(class112.method789(var9, -104), var1 + 3, var10, var11, 0);
        }
        class6.method33(class67.field1114, 0, class72.field1211, class169.field2756, class96.field1543);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V")
    public static final void method746(boolean arg0) {
        field1670++;
        if (class247.field3933 == 0) {
            return;
        }
        try {
            if (++class212.field3510 > 1500) {
                if (class208.field3298 != null) {
                    class208.field3298.method974((byte) 124);
                    class208.field3298 = null;
                }
                if (class225.field3659 >= 1) {
                    class311.field4973 = -5;
                    class247.field3933 = 0;
                    return;
                }
                class225.field3659++;
                class212.field3510 = 0;
                if (class55.field915 == class220.field3606) {
                    class55.field915 = class63.field1045;
                } else {
                    class55.field915 = class220.field3606;
                }
                class247.field3933 = 1;
            }
            if (class247.field3933 == 1) {
                class230.field3720 = class268.field4323.method326(true, class272.field4368, class55.field915);
                class247.field3933 = 2;
            }
            if (!arg0) {
                method746(true);
            }
            if (class247.field3933 == 2) {
                if (class230.field3720.field2814 == 2) {
                    throw new IOException();
                }
                if (class230.field3720.field2814 != 1) {
                    return;
                }
                class208.field3298 = new class139((Socket) class230.field3720.field2817, class268.field4323);
                class230.field3720 = null;
                class208.field3298.method977(class314.field5061.field2573, class314.field5061.field2568, 0, -27241);
                if (class233.field3750 != null) {
                    class233.field3750.method1925(-119);
                }
                if (class62.field1024 != null) {
                    class62.field1024.method1925(115);
                }
                int var1 = class208.field3298.method978(-116);
                if (class233.field3750 != null) {
                    class233.field3750.method1925(-12);
                }
                if (class62.field1024 != null) {
                    class62.field1024.method1925(126);
                }
                if (var1 != 101) {
                    class247.field3933 = 0;
                    class311.field4973 = var1;
                    class208.field3298.method974((byte) 125);
                    class208.field3298 = null;
                    return;
                }
                class247.field3933 = 3;
            }
            if (class247.field3933 == 3 && class208.field3298.method972(0) >= 2) {
                int var2 = class208.field3298.method978(-109) << 8 | class208.field3298.method978(-99);
                class291.method1943((byte) -107, var2);
                if (class60.field979 == -1) {
                    class247.field3933 = 0;
                    class311.field4973 = 6;
                    class208.field3298.method974((byte) 123);
                    class208.field3298 = null;
                } else {
                    class247.field3933 = 0;
                    class208.field3298.method974((byte) 111);
                    class208.field3298 = null;
                    class48.method340(true);
                }
            }
        } catch (IOException var3) {
            if (class208.field3298 != null) {
                class208.field3298.method974((byte) 115);
                class208.field3298 = null;
            }
            if (class225.field3659 >= 1) {
                class311.field4973 = -4;
                class247.field3933 = 0;
            } else {
                class225.field3659++;
                if (class55.field915 == class220.field3606) {
                    class55.field915 = class63.field1045;
                } else {
                    class55.field915 = class220.field3606;
                }
                class247.field3933 = 1;
                class212.field3510 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V")
    public static void method747(int arg0) {
        field1667 = null;
        field1671 = null;
        field1668 = null;
        field1672 = null;
        if (arg0 < 40) {
            method747(-6);
        }
    }
}
