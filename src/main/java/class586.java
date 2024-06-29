import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public abstract class class586 {

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field8314 = -60;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field8312;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field8315;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "J")
    public static long field8313;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
    public abstract void method3388(int arg0, int arg1);

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)Luia;")
    public abstract class364 method3389(byte arg0);

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZILbs;B)V")
    public static final void method3390(int arg0, boolean arg1, int arg2, class689 arg3, byte arg4) {
        field8315++;
        int var5 = arg3.field6133[0];
        int var6 = arg3.field6139[0];
        if (var5 < 0 || var5 >= class194.field2946 || var6 < 0 || var6 >= class255.field3656 || arg0 < 0 || arg0 >= class194.field2946 || arg2 < 0 || arg2 >= class255.field3656) {
            return;
        }
        int var7 = class64.method570(var6, var5, arg0, 0, true, arg1, -4, 0, 0, class595.field8437, class326.field4655[arg3.field8429], arg2, 0, arg3.method2579(false), class35.field361);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg3.method3922(arg4, class595.field8437[var8], class35.field361[var8], (byte) 123);
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)I")
    public abstract int method3391(byte arg0, int arg1);

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method3392(int arg0, byte arg1);
}
