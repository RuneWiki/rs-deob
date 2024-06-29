import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class277 {

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public int field4167 = -1;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public int field4168 = -1;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4163 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field4171 = 0;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field4172 = 0;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "[I")
    public int[] field4166;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "[Lof;")
    public static class421[] field4169;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1975(int arg0) {
        field4161++;
        class18 var1 = class297.field4395;
        synchronized (class297.field4395) {
            if (arg0 != 0) {
                method1980(28, 12, 63);
            }
            class297.field4395.method106((byte) -106);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)I", line = 17)
    public static int method1976(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BIILec;)V", line = 24)
    private final void method1977(byte arg0, int arg1, int arg2, class37 arg3) {
        if (arg0 < 23) {
            return;
        }
        field4162++;
        if (arg2 == 1) {
            this.field4168 = arg3.method320((byte) -87);
        } else if (arg2 == 2) {
            this.field4166 = new int[arg3.method271((byte) 115)];
            for (int var5 = 0; var5 < this.field4166.length; var5++) {
                this.field4166[var5] = arg3.method320((byte) -87);
            }
        } else if (arg2 == 3) {
            this.field4167 = arg3.method271((byte) 100);
            return;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Ljava/lang/String;", line = 57)
    public static final String method1978(int arg0, int arg1) {
        field4164++;
        return arg1 > arg0 ? Integer.toString(arg0) : "*";
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BILec;)V", line = 69)
    public final void method1979(byte arg0, int arg1, class37 arg2) {
        field4160++;
        while (true) {
            int var4 = arg2.method271((byte) 114);
            if (var4 == 0) {
                if (arg0 == -55) {
                    return;
                } else {
                    field4172 = 54;
                    return;
                }
            }
            this.method1977((byte) 69, arg1, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)I", line = 91)
    public static final int method1980(int arg0, int arg1, int arg2) {
        field4165++;
        int var3 = arg1 * arg2 + arg0;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        return (var5 & 0x7FC1CE7) >> 19;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V", line = 105)
    public static void method1981(int arg0) {
        if (arg0 == 5764) {
            field4169 = null;
            field4163 = null;
        }
    }
}
