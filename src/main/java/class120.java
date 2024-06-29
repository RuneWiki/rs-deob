import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class class120 {

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "[I")
    public static int[] field1691 = new int[5];

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field1685 = 10;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "Lia;")
    public static class15 field1690 = new class15();

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIB)V", line = 4)
    public static final void method895(int arg0, int arg1, byte arg2) {
        field1686++;
        class95 var3 = class227.method1699(6, -1855723168, arg1);
        if (arg2 <= 68) {
            method897((byte) 50);
        }
        var3.method738((byte) 48);
        var3.field1328 = arg0;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)I", line = 20)
    public static final int method896(byte arg0, int arg1) {
        if (arg0 != 71) {
            method895(-114, -16, (byte) 24);
        }
        field1688++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V", line = 37)
    public static void method897(byte arg0) {
        int var1 = 106 % ((arg0 - 34) / 35);
        field1691 = null;
        field1690 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method544(int arg0, Component arg1);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)I")
    public abstract int method542(byte arg0);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method543(Component arg0, int arg1);
}
