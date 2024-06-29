import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class class302 {

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "[Z")
    public static boolean[] field5094 = new boolean[8];

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "[S")
    public static short[] field5095 = new short[256];

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/awt/Frame;Lhf;I)V", line = 16)
    public static final void method2049(Frame arg0, class154 arg1, int arg2) {
        while (true) {
            class32 var3 = arg1.method975(arg0, (byte) 104);
            while (var3.field497 == 0) {
                class116.method759(-1, 10L);
            }
            if (var3.field497 == 1) {
                if (arg2 != 0) {
                    field5095 = (short[]) null;
                }
                field5096++;
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class116.method759(-1, 100L);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(JI)V", line = 40)
    public static final void method2050(long arg0, int arg1) {
        int var3 = 111 / ((arg1 + 45) / 50);
        field5092++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var5) {
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V", line = 65)
    public static void method2051(byte arg0) {
        if (arg0 != 44) {
            field5094 = (boolean[]) null;
        }
        field5094 = null;
        field5095 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIII)Lvj;", line = 81)
    public static final class174 method2052(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -2 / ((70 - arg0) / 37);
        class174 var5 = new class174();
        field5093++;
        var5.field2663 = arg3;
        var5.field2660 = arg1;
        class81.field1253.method1376((long) arg2, -1, var5);
        class201.method1321(0, arg1);
        class253 var6 = class172.method1140(arg2, 1);
        if (var6 != null) {
            class29.method205(var6, (byte) 99);
        }
        if (class73.field1145 != null) {
            class29.method205(class73.field1145, (byte) 87);
            class73.field1145 = null;
        }
        class251.field4162 = false;
        class282.field4794 = 0;
        class84.method566(-107, class86.field1305, class261.field4462, class18.field307, class209.field3323);
        if (var6 != null) {
            class171.method1134(false, -56, var6);
        }
        class176.method1151(120, arg1);
        if (class255.field4354 != -1) {
            class8.method92(0, class255.field4354, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIB)I")
    public abstract int method1729(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public abstract void method1728(byte arg0);
}
