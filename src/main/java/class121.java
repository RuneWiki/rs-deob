import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class121 {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Luc;")
    public static class27 field1672 = new class27(62, 3);

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field1678 = new Rectangle[100];

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "F")
    public static float field1677;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "[Lxa;")
    public static class461[] field1675;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V")
    public static void method863(boolean arg0) {
        field1672 = null;
        field1678 = null;
        if (arg0) {
            method864(null, -111);
        }
        field1675 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lql;I)V")
    public static final void method864(class674 arg0, int arg1) {
        arg0.method3733((byte) -121);
        field1673++;
        int var2 = class27.field343;
        class286 var3 = class253.field3576 = class495.field6821[var2] = new class286();
        var3.field6388 = var2;
        int var4 = arg0.method3726(30, 8);
        byte var5 = (byte) (var4 >> 28);
        if (arg1 != -1594803704) {
            method864(null, 54);
        }
        int var6 = var4 >> 14 & 0x3FFF;
        var3.field6483[0] = var6 - class511.field6989;
        int var7 = var4 & 0x3FFF;
        var3.field509 = (var3.field6483[0] << 9) + (var3.method1722((byte) -123) << 8);
        var3.field6477[0] = var7 - class124.field1726;
        var3.field514 = (var3.field6477[0] << 9) + (var3.method1722((byte) -126) << 8);
        class233.field3305 = var3.field520 = var5;
        if (class474.field6627[var2] != null) {
            var3.method1727((byte) 85, class474.field6627[var2]);
        }
        class64.field851 = 0;
        class53.field759[class64.field851++] = var2;
        class460.field6510[var2] = 0;
        class583.field8123 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg0.method3726(18, arg1 + 1594803712);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class460 var13 = class471.field6572[var8] = new class460();
                var13.field6506 = (var10 << 28) + (var11 << 14) + var12;
                var13.field6511 = 0;
                var13.field6503 = -1;
                var13.field6509 = false;
                class319.field4729[class583.field8123++] = var8;
                class460.field6510[var8] = 0;
            }
        }
        arg0.method3730(-29878);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BILfaa;I)V")
    public static final void method865(byte arg0, int arg1, class140 arg2, int arg3) {
        if (arg2.field2086 == 0) {
            arg2.field2029 = arg2.field2042;
        } else if (arg2.field2086 == 1) {
            arg2.field2029 = (arg1 - arg2.field2121) / 2 + arg2.field2042;
        } else if (arg2.field2086 == 2) {
            arg2.field2029 = arg1 - arg2.field2121 - arg2.field2042;
        } else if (arg2.field2086 == 3) {
            arg2.field2029 = arg2.field2042 * arg1 >> 14;
        } else if (arg2.field2086 == 4) {
            arg2.field2029 = (arg2.field2042 * arg1 >> 14) + (arg1 - arg2.field2121) / 2;
        } else {
            arg2.field2029 = arg1 - arg2.field2121 - (arg2.field2042 * arg1 >> 14);
        }
        if (arg2.field2066 == 0) {
            arg2.field2027 = arg2.field1985;
        } else if (arg2.field2066 == 1) {
            arg2.field2027 = (arg3 - arg2.field2082) / 2 + arg2.field1985;
        } else if (arg2.field2066 == 2) {
            arg2.field2027 = arg3 - arg2.field1985 - arg2.field2082;
        } else if (arg2.field2066 == 3) {
            arg2.field2027 = arg2.field1985 * arg3 >> 14;
        } else if (arg2.field2066 == 4) {
            arg2.field2027 = (arg2.field1985 * arg3 >> 14) + (arg3 - arg2.field2082) / 2;
        } else {
            arg2.field2027 = arg3 - arg2.field2082 - (arg2.field1985 * arg3 >> 14);
        }
        field1676++;
        if (class203.field2973 && (client.method1655(arg2).field7010 != 0 || arg2.field2023 == 0)) {
            if (arg2.field2029 < 0) {
                arg2.field2029 = 0;
            } else if (arg1 < (arg2.field2121 + arg2.field2029)) {
                arg2.field2029 = arg1 - arg2.field2121;
            }
            if (arg2.field2027 < 0) {
                arg2.field2027 = 0;
            } else if ((arg2.field2082 + arg2.field2027) > arg3) {
                arg2.field2027 = arg3 - arg2.field2082;
            }
        }
        if (arg0 >= -7) {
            field1674 = -58;
        }
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field1678[var0] = new Rectangle();
        }
    }
}
