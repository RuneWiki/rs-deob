import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class320 extends class273 {

    @OriginalMember(owner = "client!an", name = "t", descriptor = "Lwm;")
    public static class152 field5576 = class157.method1048("<col=ffff00>", 96);

    @OriginalMember(owner = "client!an", name = "C", descriptor = "[I")
    public static int[] field5585 = new int[128];

    @OriginalMember(owner = "client!an", name = "o", descriptor = "I")
    public static int field5571 = 0;

    @OriginalMember(owner = "client!an", name = "A", descriptor = "Lgn;")
    public static class5 field5583 = new class5(0, 0);

    @OriginalMember(owner = "client!an", name = "E", descriptor = "Lwm;")
    public static class152 field5587 = class157.method1048("Angreifen", 125);

    @OriginalMember(owner = "client!an", name = "F", descriptor = "Lne;")
    public static class235 field5588 = new class235(100);

    @OriginalMember(owner = "client!an", name = "G", descriptor = "Lwm;")
    public static class152 field5589 = class157.method1048("p12_full", 126);

    @OriginalMember(owner = "client!an", name = "n", descriptor = "I")
    public int field5570;

    @OriginalMember(owner = "client!an", name = "q", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!an", name = "r", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!an", name = "s", descriptor = "I")
    public int field5575;

    @OriginalMember(owner = "client!an", name = "u", descriptor = "I")
    public int field5577;

    @OriginalMember(owner = "client!an", name = "x", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!an", name = "z", descriptor = "I")
    public int field5582;

    @OriginalMember(owner = "client!an", name = "B", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!an", name = "D", descriptor = "I")
    public int field5586;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "Loe;")
    public class127 field5569;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "Loe;")
    public class127 field5572;

    @OriginalMember(owner = "client!an", name = "v", descriptor = "Lwm;")
    public class152 field5578;

    @OriginalMember(owner = "client!an", name = "w", descriptor = "Z")
    public boolean field5579;

    @OriginalMember(owner = "client!an", name = "y", descriptor = "[Ljava/lang/Object;")
    public Object[] field5581;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)V", line = 5)
    public static final void method2254(int arg0) {
        field5584++;
        class200.field3227.method2072(-124);
        if (arg0 != 13715) {
            method2258(true);
        }
        class65.field986 = null;
        class89.field1252 = 1;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Loe;B)V", line = 29)
    public static final void method2255(class127 arg0, byte arg1) {
        field5573++;
        if (arg1 >= -67) {
            return;
        }
        class127 var2 = class270.method1859(arg0, (byte) 2);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class227.field3709;
            var4 = class172.field2757;
        } else {
            var3 = var2.field1921;
            var4 = var2.field1876;
        }
        class52.method354(111, arg0, var3, false, var4);
        class104.method700(var3, var4, arg0, -16133);
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(B)V", line = 80)
    public static void method2256(byte arg0) {
        field5587 = null;
        field5576 = null;
        field5583 = null;
        field5589 = null;
        if (arg0 != -125) {
            field5589 = (class152) null;
        }
        field5585 = null;
        field5588 = null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIB)I", line = 98)
    public static final int method2257(int arg0, int arg1, int arg2, byte arg3) {
        field5580++;
        if (arg3 >= -44) {
            field5588 = (class235) null;
        }
        if (arg0 > 243) {
            arg2 >>= 0x4;
        } else if (arg0 > 217) {
            arg2 >>= 0x3;
        } else if (arg0 > 192) {
            arg2 >>= 0x2;
        } else if (arg0 > 179) {
            arg2 >>= 0x1;
        }
        return (arg1 >> 2 << 10) + (arg2 >> 5 << 7) + (arg0 >> 1);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V", line = 129)
    public static final void method2258(boolean arg0) {
        if (arg0) {
            class167.field2618.method1619(11300);
            field5574++;
        }
    }
}
