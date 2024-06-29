import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class258 {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "B")
    public byte field4116;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "B")
    public byte field4123;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "B")
    public byte field4126;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "B")
    public byte field4127;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "B")
    public byte field4130;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "B")
    public byte field4131;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "B")
    public byte field4134;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public int field4138;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public int field4140;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Lri;")
    public static class97 field4122;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "S")
    public short field4120;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Z")
    public boolean field4117;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Z")
    public boolean field4118;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "Z")
    public boolean field4119;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Z")
    public boolean field4121;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Z")
    public boolean field4124;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "Z")
    public boolean field4125;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "Z")
    public boolean field4132;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "Z")
    public boolean field4135;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Z")
    public boolean field4136;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Z")
    public boolean field4137;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I", line = 4)
    public static final int method1825(int arg0, int arg1) {
        if (arg1 >= -13) {
            return 53;
        }
        field4128++;
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIZIII)V", line = 23)
    public static final void method1826(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (class585.field8331 >= arg1 && arg3 >= class545.field7931) {
            boolean var6;
            if (class576.field8218 > arg5) {
                var6 = false;
                arg5 = class576.field8218;
            } else if (arg5 <= class340.field5510) {
                var6 = true;
            } else {
                arg5 = class340.field5510;
                var6 = false;
            }
            boolean var7;
            if (arg4 < class576.field8218) {
                var7 = false;
                arg4 = class576.field8218;
            } else if (class340.field5510 >= arg4) {
                var7 = true;
            } else {
                arg4 = class340.field5510;
                var7 = false;
            }
            if (class545.field7931 <= arg1) {
                class367.method2427(3803, arg0, arg4, class39.field527[arg1++], arg5);
            } else {
                arg1 = class545.field7931;
            }
            if (class585.field8331 >= arg3) {
                class367.method2427(3803, arg0, arg4, class39.field527[arg3--], arg5);
            } else {
                arg3 = class585.field8331;
            }
            if (var6 && var7) {
                for (int var8 = arg1; var8 <= arg3; var8++) {
                    int[] var9 = class39.field527[var8];
                    var9[arg5] = var9[arg4] = arg0;
                }
            } else if (var6) {
                for (int var11 = arg1; var11 <= arg3; var11++) {
                    class39.field527[var11][arg5] = arg0;
                }
            } else if (var7) {
                for (int var10 = arg1; var10 <= arg3; var10++) {
                    class39.field527[var10][arg4] = arg0;
                }
            }
        }
        if (arg2) {
            field4122 = null;
        }
        field4129++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 127)
    public static void method1827(int arg0) {
        if (arg0 != -97) {
            method1827(-123);
        }
        field4122 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZILqk;)V", line = 147)
    public static final void method1828(boolean arg0, int arg1, class16 arg2) {
        class78.field996.method1754(arg2, (byte) 28);
        if (arg1 != -97) {
            field4122 = null;
        }
        field4139++;
        if (arg0) {
            class243.method1737(class290.field4598, class78.field996, 0, class553.field8017, arg2, class452.field6799);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V", line = 176)
    public static final void method1829(int arg0, byte arg1) {
        class611.field8696 = arg0;
        int var2 = 18 / ((arg1 - 52) / 35);
        field4133++;
        class49 var3 = class376.field5862;
        synchronized (class376.field5862) {
            class376.field5862.method569(0);
        }
    }
}
