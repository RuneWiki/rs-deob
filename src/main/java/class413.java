import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class413 extends class18 {

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "Lwk;")
    public static class171 field6207;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "Lpm;")
    public class413 field6208;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "Lpm;")
    public class413 field6211;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)I", line = 5)
    public static final int method2507(int arg0, int arg1) {
        field6205++;
        int var2 = arg1 & 0x3F;
        if (arg0 < 49) {
            method2511(-78, 72);
        }
        int var3 = arg1 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V", line = 63)
    public static final void method2508(boolean arg0) {
        field6212++;
        class99.field1423 = -1;
        class261.field3634 = null;
        if (arg0) {
            field6207 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V", line = 75)
    public final void method2509(byte arg0) {
        field6210++;
        if (this.field6208 == null) {
            return;
        }
        this.field6208.field6211 = this.field6211;
        this.field6211.field6208 = this.field6208;
        this.field6208 = null;
        if (arg0 != -19) {
            method2511(49, -104);
        }
        this.field6211 = null;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V", line = 96)
    public static void method2510(int arg0) {
        if (arg0 != 8) {
            method2507(-39, 82);
        }
        field6207 = null;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(II)V", line = 107)
    public static final void method2511(int arg0, int arg1) {
        field6209++;
        class377 var2 = class99.method672(arg1, false, arg0);
        var2.method2339(-11688);
    }
}
