import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class224 extends class132 {

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    private int field3230 = -32768;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field3228 = 0;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
    public static int field3233 = 127;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "[I")
    public static int[] field3225 = new int[4096];

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public int field3226;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public int field3227;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lim;Lim;B)V", line = 4)
    public static final void method1579(class183 arg0, class183 arg1, byte arg2) {
        field3231++;
        if (arg0.field2518 != null) {
            arg0.method1274((byte) -26);
        }
        arg0.field2518 = arg1.field2518;
        arg0.field2523 = arg1;
        int var3 = -45 % ((arg2 - 81) / 38);
        arg0.field2518.field2523 = arg0;
        arg0.field2523.field2518 = arg0;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIIIIJILsa;)V", line = 22)
    public final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class265 arg10) {
        field3232++;
        class345 var13 = class115.method854((byte) 48, this.field3227).method1408(111, 0, this.field3226, (class64) null, (class125) null, 0, -1);
        if (var13 != null) {
            var13.method108(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field3230 = var13.method105();
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII)V", line = 37)
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3229++;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 47)
    public static void method1580(int arg0) {
        field3225 = null;
        if (arg0 <= 43) {
            method1580(-59);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()I", line = 68)
    public final int method105() {
        field3234++;
        return this.field3230;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V", line = 76)
    public static final void method1581(int arg0, int arg1, int arg2) {
        class312.field4720 = true;
        class344.field5335 = arg0;
        class88.field1248 = arg1;
        class132.field1804 = arg2;
        class210.field3030 = -1;
        class162.field2231 = -1;
    }
}
