import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public abstract class class249 extends class276 {

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "Lih;")
    public class214 field4249;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "J")
    public static long field4246;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "Z")
    public boolean field4244;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)I")
    public int method244(int arg0) {
        if (arg0 >= -41) {
            this.method1689(28);
        }
        field4251++;
        return 0;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)Z")
    public abstract boolean method239(int arg0);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBI)V")
    public abstract void method243(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)V")
    public static final void method1687(boolean arg0) {
        field4247++;
        class62 var1 = null;
        try {
            class169 var2 = class419.field6342.method2890(arg0, "2", true);
            while (var2.field2692 == 0) {
                class444.method2667(-28210, 1L);
            }
            if (var2.field2692 == 1) {
                var1 = (class62) var2.field2695;
                class23 var3 = new class23(class131.field2241 * 6 + 3);
                var3.method163(1, (byte) 49);
                var3.method182(class131.field2241, -123);
                for (int var4 = 0; var4 < class77.field1320.length; var4++) {
                    if (class328.field5178[var4]) {
                        var3.method182(var4, -124);
                        var3.method152(class77.field1320[var4], (byte) -38);
                    }
                }
                var1.method408(0, var3.field301, 0, var3.field302);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method410((byte) 105);
            }
        } catch (Exception var5) {
        }
        class223.field3856 = class19.method91((byte) 121);
        class361.field5604 = false;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lah;ZLah;I)V")
    public abstract void method245(class187 arg0, boolean arg1, class187 arg2, int arg3);

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
    public abstract void method247(byte arg0);

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)Z")
    public abstract boolean method246(int arg0);

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)I")
    public final int method1688(int arg0) {
        field4248++;
        return arg0 > -21 ? -114 : 1;
    }

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)Z")
    public final boolean method1689(int arg0) {
        if (arg0 != 1) {
            this.method1689(-13);
        }
        field4252++;
        return this.field4244;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lih;)V")
    public class249(class214 arg0) {
        this.field4249 = arg0;
    }

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "(I)V")
    public static final void method1690(int arg0) {
        if (class509.field7395 < 1024.0F) {
            class509.field7395 = 1024.0F;
        }
        field4245++;
        if (class509.field7395 > 3072.0F) {
            class509.field7395 = 3072.0F;
        }
        while (class88.field1483 >= 16384.0F) {
            class88.field1483 -= 16384.0F;
        }
        if (arg0 != -4) {
            method1690(-98);
        }
        while (class88.field1483 < 0.0F) {
            class88.field1483 += 16384.0F;
        }
        int var1 = class165.field2606 >> 7;
        int var2 = class139.field2318 >> 7;
        int var3 = class81.method592(class165.field2606, class139.field2318, 9251, class93.field1556);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && class217.field3775 - 4 > var1 && (class277.field4548 - 4) > var2) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class93.field1556;
                    if (var7 < 3 && class355.method2280((byte) -82, var6, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class525.field7719.field1328 != null && class525.field7719.field1328[var7] != null) {
                        var8 = (class525.field7719.field1328[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var8 - (class360.field5592[var7].method1516(var5, var6) - var3);
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (class439.field6559 < var10) {
            class439.field6559 += (var10 - class439.field6559) / 24;
        } else if (var10 < class439.field6559) {
            class439.field6559 += (var10 - class439.field6559) / 80;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)V")
    public abstract void method238(int arg0, int arg1);

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "(I)Z")
    public final boolean method1691(int arg0) {
        field4250++;
        int var2 = 118 / ((arg0 + 12) / 40);
        return false;
    }
}
