import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class688 extends class513 {

    @OriginalMember(owner = "client!oda", name = "x", descriptor = "I")
    public int field9650;

    @OriginalMember(owner = "client!oda", name = "q", descriptor = "I")
    private int field9643;

    @OriginalMember(owner = "client!oda", name = "z", descriptor = "I")
    public int field9652;

    @OriginalMember(owner = "client!oda", name = "r", descriptor = "I")
    public int field9644;

    @OriginalMember(owner = "client!oda", name = "k", descriptor = "I")
    private int field9637;

    @OriginalMember(owner = "client!oda", name = "l", descriptor = "I")
    private int field9638;

    @OriginalMember(owner = "client!oda", name = "u", descriptor = "I")
    private int field9647;

    @OriginalMember(owner = "client!oda", name = "A", descriptor = "I")
    public int field9653;

    @OriginalMember(owner = "client!oda", name = "y", descriptor = "I")
    private int field9651;

    @OriginalMember(owner = "client!oda", name = "v", descriptor = "I")
    public static int field9648 = 0;

    @OriginalMember(owner = "client!oda", name = "m", descriptor = "I")
    public static int field9639;

    @OriginalMember(owner = "client!oda", name = "n", descriptor = "I")
    public static int field9640;

    @OriginalMember(owner = "client!oda", name = "o", descriptor = "I")
    public static int field9641;

    @OriginalMember(owner = "client!oda", name = "p", descriptor = "I")
    public static int field9642;

    @OriginalMember(owner = "client!oda", name = "s", descriptor = "I")
    public static int field9645;

    @OriginalMember(owner = "client!oda", name = "w", descriptor = "I")
    public static int field9649;

    @OriginalMember(owner = "client!oda", name = "B", descriptor = "I")
    public static int field9654;

    @OriginalMember(owner = "client!oda", name = "C", descriptor = "I")
    public static int field9655;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oda", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field9656;

    @OriginalMember(owner = "client!oda", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field9646;

    // $FF: synthetic method
    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3926(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3918(int arg0) {
        field9649++;
        try {
            Method var1 = (field9656 == null ? (field9656 = method3926("java.lang.Runtime")) : field9656).getMethod("availableProcessors");
            if (arg0 <= 88) {
                field9648 = -107;
            }
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class749.field10435 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)I", line = 32)
    public static final int method3919(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class314.field4050 - 1; var2++) {
            if (arg0 < class678.field9554[var2] + class619.field8818[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class314.field4050 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(III[I)V", line = 59)
    public final void method3920(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[arg1] = this.field9637;
        arg3[2] = arg2 + this.field9651 - this.field9652;
        field9654++;
        arg3[1] = arg0 - (this.field9650 - this.field9647);
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIII)Z", line = 81)
    public final boolean method3921(int arg0, int arg1, int arg2, int arg3) {
        field9640++;
        if (arg2 == 0) {
            return this.field9637 == arg1 && this.field9647 <= arg3 && this.field9643 >= arg3 && this.field9651 <= arg0 && arg0 <= this.field9638;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oda", name = "f", descriptor = "(I)V", line = 98)
    public static void method3922(int arg0) {
        field9646 = null;
        if (arg0 != 0) {
            field9641 = -119;
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIB)Z", line = 108)
    public final boolean method3923(int arg0, int arg1, byte arg2) {
        int var4 = 1 / ((arg2 + 46) / 54);
        field9655++;
        return arg0 >= this.field9647 && arg0 <= this.field9643 && this.field9651 <= arg1 && arg1 <= this.field9638;
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(IIIIIIIII)V", line = 121)
    public class688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field9650 = arg5;
        this.field9643 = arg3;
        this.field9652 = arg6;
        this.field9644 = arg7;
        this.field9637 = arg0;
        this.field9638 = arg4;
        this.field9647 = arg1;
        this.field9653 = arg8;
        this.field9651 = arg2;
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(III[I)V", line = 142)
    public final void method3924(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg0 < -50) {
            arg3[0] = 0;
            field9639++;
            arg3[1] = this.field9650 + arg1 - this.field9647;
            arg3[2] = this.field9652 + arg2 - this.field9651;
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(BII)Z", line = 155)
    public final boolean method3925(byte arg0, int arg1, int arg2) {
        field9642++;
        if (arg0 >= 0) {
            this.field9638 = 16;
        }
        return arg2 >= this.field9650 && this.field9644 >= arg2 && this.field9652 <= arg1 && this.field9653 >= arg1;
    }
}
