import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class247 extends class172 {

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    public int field4337 = 0;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "[Lhf;")
    public static class137[] field4330 = new class137[14];

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "Lid;")
    public static class149 field4336 = class60.method382("<col=ffff00>", (byte) 51);

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "Lid;")
    private static class149 field4331 = class60.method382(" from your ignore list first)3", (byte) 19);

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "Lid;")
    public static class149 field4339 = field4331;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "Lid;")
    private static class149 field4343 = class60.method382(" has logged in)3", (byte) 113);

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "Z")
    public static boolean field4345 = false;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "Lid;")
    public static class149 field4346 = field4343;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLgd;)V")
    public final void method1715(byte arg0, class74 arg1) {
        field4338++;
        if (arg0 <= 99) {
            field4332 = -31;
        }
        while (true) {
            int var3 = arg1.method489((byte) -105);
            if (var3 == 0) {
                return;
            }
            this.method1722((byte) -75, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
    public static final void method1716(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class94.field1664[var1] = true;
        }
        field4341++;
        int var2 = -14 / ((-arg0 - 20) / 50);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)V")
    public static final void method1717(int arg0, byte arg1) {
        int var2 = 32 % ((arg1 - 28) / 51);
        field4335++;
        class138.field2520.method1289(arg0, 73);
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
    public static void method1718(int arg0) {
        field4330 = null;
        if (arg0 != 1389) {
            return;
        }
        field4331 = null;
        field4339 = null;
        field4343 = null;
        field4346 = null;
        field4336 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V")
    public static final void method1719(int arg0, int arg1) {
        field4333++;
        class171.field3150.method1289(arg0, 114);
        class210.field3746.method1289(arg0, 77);
        if (arg1 != -29406) {
            field4332 = -17;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)Laj;")
    public static final class47 method1720(int arg0, int arg1, int arg2) {
        field4340++;
        class47 var3 = class251.method1741((byte) 110, arg2);
        if (arg0 == -1) {
            return var3;
        } else {
            if (arg1 != 18062) {
                field4339 = null;
            }
            return var3 == null || var3.field761 == null || var3.field761.length <= arg0 ? null : var3.field761[arg0];
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1721(byte arg0, Component arg1) {
        field4342++;
        Method var2 = class29.field440;
        if (arg0 != 112) {
            field4346 = null;
        }
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class288.field5139);
        arg1.addFocusListener(class288.field5139);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BILgd;)V")
    private final void method1722(byte arg0, int arg1, class74 arg2) {
        if (arg1 == 2) {
            this.field4337 = arg2.method485(-2386);
        }
        field4344++;
        if (arg0 > -71) {
            method1717(23, (byte) -69);
        }
    }
}
