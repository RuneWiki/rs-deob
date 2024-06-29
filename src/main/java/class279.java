import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class279 {

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lqg;")
    private class321 field4014;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "J")
    public long field4016;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Lgf;")
    public static class180 field4011 = new class180(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Llh;")
    public static class364 field4013 = new class364(20);

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field4015 = -1;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public static final void method1771(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class322.field4945 <= arg4 && class145.field2134 >= arg1 && arg2 >= class229.field3347 && class156.field2366 >= arg6) {
            if (arg3 == 1) {
                class263.method1672(arg1, arg4, arg2, 110, arg6, arg0);
            } else {
                class342.method2233(arg3, (byte) 127, arg6, arg4, arg0, arg1, arg2);
            }
        } else if (arg3 == 1) {
            class86.method703(arg0, arg2, arg4, arg6, (byte) -90, arg1);
        } else {
            class223.method1478(arg2, arg3, arg4, arg0, arg5 - 27098, arg6, arg1);
        }
        field4010++;
        if (arg5 != 27098) {
            method1773((byte) 54);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)I", line = 41)
    public static final int method1772(int arg0, int arg1) {
        return class214.field3090 == null ? 0 : class214.field3090[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!we", name = "finalize", descriptor = "()V", line = 49)
    protected final void finalize() throws Throwable {
        field4012++;
        this.field4014.method2047(62, this.field4016);
        super.finalize();
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 59)
    public static void method1773(byte arg0) {
        field4011 = null;
        field4013 = null;
        if (arg0 > -1) {
            field4015 = 53;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lqg;JI)V", line = 71)
    public class279(class321 arg0, long arg1, int arg2) {
        this.field4014 = arg0;
        this.field4016 = arg1;
    }
}
