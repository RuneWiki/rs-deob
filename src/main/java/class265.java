import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class265 {

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4140 = "slide:";

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4143 = Calendar.getInstance();

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field4144 = 0;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "[B")
    public static byte[] field4145 = new byte[520];

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public static int field4148 = 0;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "Lci;")
    public static class201 field4146 = null;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "[[[I")
    public static int[][][] field4147;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 12)
    public static void method1893(int arg0) {
        field4147 = (int[][][]) null;
        field4143 = null;
        field4145 = null;
        field4140 = null;
        if (arg0 != 1024) {
            field4147 = (int[][][]) ((int[][][]) null);
        }
        field4146 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V", line = 37)
    public static final void method1894(boolean arg0) {
        field4138++;
        if (class69.field969) {
            return;
        }
        class69.field969 = arg0;
        if (class82.field1124) {
            class6.field114 = (float) ((int) class6.field114 - 17 & 0xFFFFFFF0);
        } else {
            class25.field383 += (-class25.field383 - 12.0F) / 2.0F;
        }
        class281.field4320 = true;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIII)V", line = 59)
    public static final void method1895(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 11) {
            method1896(69, -111L);
        }
        field4139++;
        if (arg0 == arg1) {
            class141.method1051(arg2 ^ 0xFFFFEF84, arg3, arg0, arg4, arg5);
        } else if (arg4 - arg0 >= class291.field4490 && class210.field3309 >= (arg4 + arg0) && (arg3 - arg1) >= class42.field579 && arg1 + arg3 <= class334.field5205) {
            class214.method1564(arg3, arg5, arg2 ^ 0x8, arg0, arg4, arg1);
        } else {
            class22.method215(arg4, arg5, true, arg0, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 85)
    public static final String method1896(int arg0, long arg1) {
        class81.field1114.setTime(new Date(arg1));
        field4142++;
        int var3 = class81.field1114.get(7);
        int var4 = class81.field1114.get(5);
        int var5 = class81.field1114.get(2);
        int var6 = class81.field1114.get(1);
        int var7 = class81.field1114.get(11);
        int var8 = class81.field1114.get(arg0);
        int var9 = class81.field1114.get(13);
        return class145.field2294[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class224.field3560[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lh;I)V", line = 115)
    public static final void method1897(class303 arg0, int arg1) {
        field4141++;
        int var2 = arg0.field4658 - class229.field3595;
        int var3 = arg0.field4683 * 128 + arg0.method2099((byte) 123) * 64;
        int var4 = arg0.field4652 * 128 + arg0.method2099((byte) 123) * 64;
        if (arg0.field4729 == 0) {
            arg0.field4674 = 1024;
        }
        arg0.field4728 = arg1;
        arg0.field4731 += (var4 - arg0.field4731) / var2;
        if (arg0.field4729 == 1) {
            arg0.field4674 = 1536;
        }
        arg0.field4698 += (var3 - arg0.field4698) / var2;
        if (arg0.field4729 == 2) {
            arg0.field4674 = 0;
        }
        if (arg0.field4729 == 3) {
            arg0.field4674 = 512;
        }
    }
}
