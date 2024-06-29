import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class615 {

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public int field8723;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public int field8718;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "S")
    public short field8719;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "S")
    public short field8730;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public int field8727;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "B")
    public byte field8726;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public int field8731;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public int field8722;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "S")
    public short field8721;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "Z")
    public boolean field8732;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "Lsv;")
    public static class570 field8724 = new class570(44, 7);

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "Z")
    public static boolean field8729 = false;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public static int field8728 = 0;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "[I")
    public static int[] field8720;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "[I")
    public static int[] field8725;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
    public static void method3541(boolean arg0) {
        field8724 = null;
        field8725 = null;
        field8720 = null;
        if (arg0) {
            field8728 = -102;
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class615(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field8723 = arg3;
        this.field8718 = arg11;
        this.field8719 = (short) arg5;
        this.field8730 = (short) arg4;
        this.field8727 = arg1;
        this.field8726 = (byte) arg8;
        this.field8731 = arg2;
        this.field8722 = arg0;
        this.field8721 = (short) arg6;
        this.field8732 = arg10;
    }
}
