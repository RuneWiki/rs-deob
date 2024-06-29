import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class394 {

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    private int field5807 = 0;

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "Lee;")
    private class706 field5812;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "Ljw;")
    public static class581 field5806 = new class581(89, 12);

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "Ldba;")
    private class101 field5804;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "Laj;")
    public static class333 field5810;

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "()V", line = 123)
    public class394() {
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lee;)V", line = 125)
    public class394(class706 arg0) {
        this.field5812 = arg0;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)Ldba;", line = 13)
    public final class101 method2486(byte arg0) {
        field5808++;
        int var2 = 55 % ((arg0 + 83) / 36);
        if (this.field5807 > 0 && this.field5812.field9895[this.field5807 - 1] != this.field5804) {
            class101 var3 = this.field5804;
            this.field5804 = var3.field1412;
            return var3;
        }
        while (this.field5807 < this.field5812.field9898) {
            class101 var4 = this.field5812.field9895[this.field5807++].field1412;
            if (this.field5812.field9895[this.field5807 - 1] != var4) {
                this.field5804 = var4.field1412;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lwea;III)V", line = 47)
    public static final void method2487(class167 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class405.field5875) {
            class243 var4 = class626.field8501[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3280 != null && var4.field3280.method59(-1)) {
                arg0.method60(class192.field2582, var4.field3280, true, -98, class48.field722, 0, 0);
            }
        }
        if (arg3 < class405.field5875) {
            class243 var5 = class626.field8501[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3280 != null && var5.field3280.method59(-1)) {
                arg0.method60(class192.field2582, var5.field3280, true, -110, 0, 0, class48.field722);
            }
        }
        if (arg2 < class405.field5875 && arg3 < class710.field9947) {
            class243 var6 = class626.field8501[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3280 != null && var6.field3280.method59(-1)) {
                arg0.method60(class192.field2582, var6.field3280, true, -92, class48.field722, 0, class48.field722);
            }
        }
        if (arg2 < class405.field5875 && arg3 > 0) {
            class243 var7 = class626.field8501[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3280 != null && var7.field3280.method59(-1)) {
                arg0.method60(class192.field2582, var7.field3280, true, -57, class48.field722, 0, -class48.field722);
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZIIII)V", line = 94)
    public static final void method2488(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 - arg1 >= class174.field2335 && arg1 + arg4 <= class751.field10402 && arg3 - arg1 >= class523.field7178 && (arg1 + arg3) <= class495.field6845) {
            class584.method3249(arg4, arg2, arg3, arg1, 628308897);
        } else {
            class744.method4122(arg1, arg4, (byte) 53, arg3, arg2);
        }
        field5805++;
        if (!arg0) {
            field5811 = -60;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V", line = 112)
    public static void method2489(int arg0) {
        field5810 = null;
        field5806 = null;
        if (arg0 != -1) {
            field5811 = 33;
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)Ldba;", line = 133)
    public final class101 method2490(int arg0) {
        this.field5807 = 0;
        if (arg0 <= 47) {
            return null;
        } else {
            field5809++;
            return this.method2486((byte) 111);
        }
    }
}
