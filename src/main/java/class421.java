import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class421 {

    @OriginalMember(owner = "client!th", name = "i", descriptor = "[I")
    public static int[] field6336 = new int[32];

    @OriginalMember(owner = "client!th", name = "h", descriptor = "Lri;")
    public static class73 field6335 = new class73(49, 15);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public int field6328;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public int field6330;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public int field6333;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public int field6337;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLme;)V", line = 5)
    public static final void method2533(boolean arg0, class129 arg1) {
        field6332++;
        int var2 = arg1.field1965 - class317.field4559;
        int var3 = arg1.field1984 * 128 + (arg1.method847(-1) * 64);
        int var4 = arg1.field1928 * 128 + arg1.method847(-1) * 64;
        arg1.field1763 += (var3 - arg1.field1763) / var2;
        arg1.field1998 = 0;
        arg1.field1769 += (var4 - arg1.field1769) / var2;
        if (arg1.field1988 == 0) {
            arg1.method854(8192, 0);
        }
        if (arg1.field1988 == 1) {
            arg1.method854(12288, 0);
        }
        if (arg1.field1988 == 2) {
            arg1.method854(0, 0);
        }
        if (arg1.field1988 == 3) {
            arg1.method854(4096, 0);
        }
        if (arg0) {
            field6336 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILme;)I", line = 40)
    public static final int method2534(int arg0, class129 arg1) {
        field6329++;
        if (arg1.field1986 == 0) {
            return 0;
        }
        if (arg1.field1904 != arg0) {
            class129 var2 = null;
            if (arg1.field1904 < 32768) {
                var2 = class193.field2821[arg1.field1904];
            } else if (arg1.field1904 >= 32768) {
                var2 = class44.field707[arg1.field1904 - 32768];
            }
            if (var2 != null) {
                int var3 = arg1.field1763 - var2.field1763;
                int var4 = arg1.field1769 - var2.field1769;
                if (var3 != 0 || var4 != 0) {
                    arg1.method854((int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF, 0);
                }
            }
        }
        if ((arg1 instanceof class239)) {
            class239 var8 = (class239) arg1;
            if (var8.field3556 != -1 && (var8.field2000 == 0 || var8.field1998 > 0)) {
                var8.method854(var8.field3556, 0);
                var8.field3556 = -1;
            }
        } else if (arg1 instanceof class167) {
            class167 var5 = (class167) arg1;
            if (var5.field2466 != -1 && (var5.field2000 == 0 || var5.field1998 > 0)) {
                int var6 = var5.field1763 - ((var5.field2466 - class68.field1038 - class68.field1038) * 64);
                int var7 = var5.field1769 - ((var5.field2465 - class24.field259 - class24.field259) * 64);
                if (var6 != 0 || var7 != 0) {
                    var5.method854((int) (Math.atan2((double) var6, (double) var7) * 2607.5945876176133D) & 0x3FFF, 0);
                }
                var5.field2466 = -1;
            }
        }
        return arg1.method858((byte) 52);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V", line = 108)
    public static void method2535(boolean arg0) {
        if (!arg0) {
            field6336 = null;
        }
        field6335 = null;
        field6336 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V", line = 125)
    public static final void method2536(int arg0) {
        class449.field6688 = arg0;
        for (int var1 = 0; var1 < class361.field5554; var1++) {
            for (int var2 = 0; var2 < class484.field7096; var2++) {
                if (class108.field1553[arg0][var1][var2] == null) {
                    class108.field1553[arg0][var1][var2] = new class518(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lnf;B)V", line = 148)
    public static final void method2537(class405 arg0, byte arg1) {
        field6334++;
        arg0.field6109 = null;
        int var2 = arg0.field6108.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field6108[var3].field3629 = false;
        }
        class296[] var4 = class350.field5373;
        synchronized (class350.field5373) {
            if (class350.field5373.length > var2 && class308.field4435[var2] < 200) {
                class350.field5373[var2].method1878(2, arg0);
                int var10002 = class308.field4435[var2]++;
            }
        }
        if (arg1 < 12) {
            field6336 = null;
        }
    }
}
