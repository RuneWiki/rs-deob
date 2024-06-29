import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class385 {

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public int field5524 = 64;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public int field5526 = 2;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public int field5525 = 1;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public int field5522 = -1;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public int field5529 = 64;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "Z")
    public boolean field5530 = false;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "Z")
    public boolean field5521 = false;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "[I")
    public static int[] field5520 = new int[3];

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILpm;IIILza;)V", line = 5)
    public static final void method2279(int arg0, class103 arg1, int arg2, int arg3, int arg4, class295 arg5) {
        field5531++;
        class523 var6 = class10.field116.method1496((byte) 125, arg1.field1649);
        if (var6.field7666 == -1) {
            return;
        }
        int var7;
        if (arg1.field1616) {
            int var8 = arg1.field1661 + arg3;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class359 var9 = var6.method3112(var7, arg1.field1655, (byte) 83, arg5);
        if (var9 == null) {
            return;
        }
        int var10 = arg1.field1639;
        int var11 = arg1.field1695;
        if ((var7 & 0x1) == 1) {
            var10 = arg1.field1695;
            var11 = arg1.field1639;
        }
        int var12 = var9.method204();
        int var13 = var9.method207();
        if (var6.field7651) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (var6.field7660 == 0) {
            var9.method2140(arg2, arg4 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method206(arg2, arg4 - (var11 - 1) * 4, var12, var13, 0, var6.field7660 | 0xFF000000, 1);
        }
        if (arg0 > -120) {
            method2281(-7, null);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILsv;I)V", line = 60)
    private final void method2280(int arg0, int arg1, class319 arg2, int arg3) {
        if (arg3 != -1) {
            this.field5525 = -20;
        }
        if (arg0 == 1) {
            this.field5522 = arg2.method1844(-106);
            if (this.field5522 == 65535) {
                this.field5522 = -1;
            }
        } else if (arg0 == 2) {
            this.field5524 = arg2.method1844(arg3 - 114) + 1;
            this.field5529 = arg2.method1844(arg3 ^ 0x7E) + 1;
        } else if (arg0 == 3) {
            arg2.method1894(arg3 - 2017);
        } else if (arg0 == 4) {
            this.field5526 = arg2.method1869(-127);
        } else if (arg0 == 5) {
            this.field5525 = arg2.method1869(-93);
        } else if (arg0 == 6) {
            this.field5530 = true;
        } else if (arg0 == 7) {
            this.field5521 = true;
        }
        field5532++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILql;)V", line = 133)
    public static final void method2281(int arg0, class121 arg1) {
        arg1.field1881 = null;
        field5528++;
        int var2 = arg1.field1878.length;
        for (int var3 = arg0; var3 < var2; var3++) {
            arg1.field1878[var3].field4135 = false;
        }
        class439[] var4 = class349.field5069;
        synchronized (class349.field5069) {
            if (class349.field5069.length > var2 && class103.field1640[var2] < 200) {
                class349.field5069[var2].method2599(1256, arg1);
                int var10002 = class103.field1640[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILsv;)V", line = 158)
    public final void method2282(int arg0, int arg1, class319 arg2) {
        if (arg1 > -111) {
            this.field5526 = -116;
        }
        while (true) {
            int var4 = arg2.method1869(-65);
            if (var4 == 0) {
                field5523++;
                return;
            }
            this.method2280(var4, arg0, arg2, -1);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "()V", line = 187)
    public static final void method2283() {
        class39.method274(1, class265.field3571);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 190)
    public static void method2284(byte arg0) {
        if (arg0 == 31) {
            field5520 = null;
        }
    }
}
