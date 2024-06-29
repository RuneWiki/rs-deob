import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class329 {

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "[F")
    public static float[] field4655 = new float[16384];

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "[F")
    public static float[] field4659 = new float[16384];

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    public static int field4660 = -1;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "Luu;")
    public static class237 field4661;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
    public static void method2113(int arg0) {
        if (arg0 == -4203) {
            field4661 = null;
            field4655 = null;
            field4659 = null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
    public static final void method2114(int arg0) {
        class456.field6315 = 0;
        class292.field4186 = 0;
        class288.field4124++;
        field4657++;
        class692.method3913(25509);
        class478.method2909((byte) 29);
        class172.method1103(-17564);
        boolean var1 = false;
        for (int var2 = 0; var2 < class292.field4186; var2++) {
            int var5 = class120.field1581[var2];
            class234 var6 = (class234) class372.field5245.method812(125, (long) var5);
            class679 var7 = var6.field3471;
            if (class25.field320 && class269.method1825(var5, 16)) {
                class320.method2068(arg0 - 32007);
            }
            if (class288.field4124 != var7.field7139) {
                if (var7.field9436.method768(-84)) {
                    class333.method2130((byte) 123, var7);
                }
                var7.method3826(null, 0);
                var6.method549(6410);
                var1 = true;
            }
        }
        if (var1) {
            class445.field6185 = class372.field5245.method816((byte) -36);
            class372.field5245.method817((byte) -79, class757.field10568);
        }
        if (class357.field5125 != class352.field5071.field956) {
            throw new RuntimeException("gnp1 pos:" + class352.field5071.field956 + " psize:" + class357.field5125);
        }
        if (arg0 != 31897) {
            field4660 = -127;
        }
        for (int var3 = 0; var3 < class262.field3837; var3++) {
            if (class372.field5245.method812(113, (long) class446.field6192[var3]) == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class262.field3837);
            }
        }
        if ((class445.field6185 - class262.field3837) != 0) {
            throw new RuntimeException("gnp3 mis:" + (class445.field6185 - class262.field3837));
        }
        for (int var4 = 0; var4 < class445.field6185; var4++) {
            if (class288.field4124 != class757.field10568[var4].field3471.field7139) {
                throw new RuntimeException("gnp4 uk:" + class757.field10568[var4].field3471.field7148);
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(III)Z")
    public static final boolean method2115(int arg0, int arg1, int arg2) {
        field4658++;
        if (arg2 == 0) {
            return (arg1 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
    public static final void method2116(byte arg0) {
        if (arg0 != -47) {
            method2113(7);
        }
        field4656++;
        class564.method3309();
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4659[var2] = (float) Math.sin((double) var2 * var0);
            field4655[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
