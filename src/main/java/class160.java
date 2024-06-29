import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class160 {

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field3007 = 0;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "Lbe;")
    public static class28 field3009;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method1164(int arg0) {
        if (arg0 != 0) {
            field3009 = null;
        }
        field3009 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)Lca;")
    public abstract class251 method142(byte arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILjd;)I")
    public static final int method1165(int arg0, class86 arg1) {
        field3008++;
        if (arg1.method612((byte) 59) == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class106.field2030.field1177; var2++) {
            if (class106.field2030.field1170[var2].method594(3883, class200.field3552, class142.field2692).method590(0, arg1)) {
                return var2;
            }
        }
        if (arg0 <= 47) {
            method1167((byte) -4, (Component) null);
        }
        return -1;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method136(int arg0, byte arg1);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V")
    public static final void method1166(byte arg0) {
        field3010++;
        class246.method1670((byte) 112);
        if (arg0 != -48) {
            field3009 = null;
        }
        class235.method1629((byte) -117);
        class246.method1671(arg0 + 1048);
        class224.method1574(32);
        class201.method1439((byte) 115);
        class16.method120((byte) -73);
        class242.method1655(arg0 + 49);
        class211.method1495(23120);
        class41.method335(-18727);
        class17.method143(true);
        class66.method473(25615);
        class22.method165(1);
        class92.method682((byte) 119);
        class191.method1312(false);
        class152.field2873.method702((byte) -88);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1167(byte arg0, Component arg1) {
        field3012++;
        Method var2 = class254.field4527;
        if (arg0 != 70) {
            return;
        }
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class108.field2079);
        arg1.addFocusListener(class108.field2079);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BI)I")
    public abstract int method131(byte arg0, int arg1);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V")
    public static final void method1168(int arg0, int arg1) {
        field3011++;
        class13 var2 = (class13) class152.field2876.method1698((long) arg1, (byte) 27);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg0 > -107) {
            return;
        }
        while (var3 < var2.field405.length) {
            var2.field405[var3] = -1;
            var2.field402[var3] = 0;
            var3++;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)V")
    public abstract void method129(int arg0, int arg1);
}
