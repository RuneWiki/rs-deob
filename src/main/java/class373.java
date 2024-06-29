import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class373 {

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5423 = "flash2:";

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field5422 = 0;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "[J")
    public static long[] field5424 = new long[100];

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public int field5420;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public int field5427;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public int field5431;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 3)
    public static void method2412(int arg0) {
        field5423 = null;
        if (arg0 != -22313) {
            field5424 = null;
        }
        field5424 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V", line = 24)
    public static final void method2413(int arg0, int arg1) {
        field5430++;
        if (arg0 == -1 || !class339.field4887[arg0]) {
            return;
        }
        class300.field4408.method2286(arg0, (byte) -88);
        if (class365.field5292[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class365.field5292[arg0].length; var3++) {
            if (class365.field5292[arg0][var3] != null) {
                if (class365.field5292[arg0][var3].field5671 == 2) {
                    var2 = false;
                } else {
                    class365.field5292[arg0][var3] = null;
                }
            }
        }
        if (arg1 != 1) {
            method2412(-116);
        }
        if (var2) {
            class365.field5292[arg0] = null;
        }
        class339.field4887[arg0] = false;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V", line = 69)
    public static final void method2414(byte arg0) {
        class185.field2507.field3029 = 0;
        field5428++;
        class26.field378 = -1;
        class300.field4398 = 0;
        class240.field3212 = -1;
        class100.field1411 = -1;
        class145.field1988 = -1;
        class156.field2120.field3029 = 0;
        int var1 = -15 % ((arg0 - 1) / 38);
        class92.field1296 = 0;
        class363.field5237 = 0;
        class199.method1180(0);
        class7.method54(-26673);
        for (int var2 = 0; var2 < class206.field2777.length; var2++) {
            if (class206.field2777[var2] != null) {
                class206.field2777[var2].field4330 = -1;
            }
        }
        for (int var3 = 0; var3 < class306.field4496.length; var3++) {
            if (class306.field4496[var3] != null) {
                class306.field4496[var3].field4330 = -1;
            }
        }
        class223.method1295(47);
        class346.field4979 = 1;
        class232.method1391(-26, 30);
        for (int var4 = 0; var4 < 100; var4++) {
            class270.field3927[var4] = true;
        }
        class376.method2440(false);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lnj;I)V", line = 124)
    public final void method2415(class228 arg0, int arg1) {
        field5429++;
        int var3 = -84 % ((arg1 + 64) / 56);
        while (true) {
            int var4 = arg0.method1348(-105);
            if (var4 == 0) {
                return;
            }
            this.method2417(arg0, (byte) 7, var4);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 145)
    public static final void method2416(int arg0, Component arg1) {
        arg1.removeKeyListener(class445.field6523);
        field5425++;
        arg1.removeFocusListener(class445.field6523);
        if (arg0 != 3099) {
            method2414((byte) -3);
        }
        class349.field5048 = -1;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lnj;BI)V", line = 168)
    private final void method2417(class228 arg0, byte arg1, int arg2) {
        if (arg1 != 7) {
            method2416(50, (Component) null);
        }
        field5432++;
        if (arg2 == 1) {
            this.field5431 = arg0.method1343(255);
            this.field5420 = arg0.method1348(-116);
            this.field5427 = arg0.method1348(arg1 ^ 0xFFFFFF88);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIII)I", line = 188)
    public static final int method2418(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 > 243) {
            arg2 >>= 0x4;
        } else if (arg3 > 217) {
            arg2 >>= 0x3;
        } else if (arg3 > 192) {
            arg2 >>= 0x2;
        } else if (arg3 > 179) {
            arg2 >>= 0x1;
        }
        field5421++;
        if (arg0 != -16044) {
            field5422 = -44;
        }
        return ((arg1 & 0xFF) >> 2 << 10) + (arg2 >> 5 << 7) + (arg3 >> 1);
    }
}
