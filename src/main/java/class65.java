import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class65 extends class204 {

    @OriginalMember(owner = "client!pm", name = "B", descriptor = "I")
    private final int field995;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
    private final int field990;

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
    private final int field991;

    @OriginalMember(owner = "client!pm", name = "F", descriptor = "I")
    private int field999;

    @OriginalMember(owner = "client!pm", name = "E", descriptor = "D")
    public static double field998 = -1.0D;

    @OriginalMember(owner = "client!pm", name = "C", descriptor = "Lph;")
    public static class229 field996 = class266.method1858("Mem:", 0);

    @OriginalMember(owner = "client!pm", name = "D", descriptor = "Z")
    public static boolean field997 = false;

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "Lph;")
    public static class229 field1002 = class266.method1858("brillant3:", 0);

    @OriginalMember(owner = "client!pm", name = "J", descriptor = "Lph;")
    private static class229 field1003 = class266.method1858("Opened title screen", 0);

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "Lph;")
    public static class229 field989 = field1003;

    @OriginalMember(owner = "client!pm", name = "G", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!pm", name = "H", descriptor = "I")
    private int field1001;

    @OriginalMember(owner = "client!pm", name = "K", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!pm", name = "M", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
    private int field985;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
    private int field992;

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "I")
    private int field993;

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "[B")
    private byte[] field984;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "[S")
    public static short[] field987;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)V", line = 22)
    public static void method485(int arg0) {
        field1002 = null;
        field996 = null;
        field987 = null;
        if (arg0 != 0) {
            method485(80);
        }
        field1003 = null;
        field989 = null;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(IIIIIFFF)V", line = 36)
    public class65(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field995 = (int) (arg7 * 4096.0F);
        this.field990 = (int) (arg6 * 4096.0F);
        this.field999 = this.field991 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)V", line = 49)
    public final void method486(int arg0, int arg1, int arg2) {
        if (arg2 != -13897) {
            method488((class229) null, -113, 79);
        }
        if (arg1 == 0) {
            this.field1001 = 4096;
            this.field993 = this.field990 - (arg0 >= 0 ? arg0 : -arg0);
            this.field993 = this.field993 * this.field993 >> 12;
            this.field985 = this.field993;
        } else {
            this.field1001 = this.field995 * this.field993 >> 12;
            this.field993 = this.field990 - (arg0 >= 0 ? arg0 : -arg0);
            if (this.field1001 < 0) {
                this.field1001 = 0;
            } else if (this.field1001 > 4096) {
                this.field1001 = 4096;
            }
            this.field993 = this.field993 * this.field993 >> 12;
            this.field993 = this.field993 * this.field1001 >> 12;
            this.field985 += this.field999 * this.field993 >> 12;
            this.field999 = this.field999 * this.field991 >> 12;
        }
        field986++;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V", line = 99)
    public final void method487(int arg0) {
        this.field999 = this.field991;
        field1006++;
        this.field985 >>= 0x4;
        if (this.field985 < 0) {
            this.field985 = 0;
        } else if (this.field985 > 255) {
            this.field985 = 255;
        }
        this.method489(this.field992++, (byte) this.field985);
        this.field985 = 0;
        if (arg0 != -1331241396) {
            this.field999 = -31;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lph;II)V", line = 127)
    public static final void method488(class229 arg0, int arg1, int arg2) {
        class281 var3 = class135.method957(arg2 ^ arg2, arg1, 3);
        field988++;
        var3.method1932(0);
        var3.field4658 = arg0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)V", line = 137)
    public void method489(int arg0, byte arg1) {
        this.field984[arg0] = arg1;
        field994++;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 146)
    public final void method490(int arg0) {
        this.field992 = 0;
        int var2 = 51 / ((arg0 + 46) / 60);
        this.field985 = 0;
        field1000++;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILhb;)V", line = 159)
    public static final void method491(int arg0, class164 arg1) {
        for (int var2 = arg0; var2 < class57.field812; var2++) {
            int var3 = arg1.method1209(-128);
            int var4 = arg1.method1161(true);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class85.field1464[var3] != null) {
                class85.field1464[var3].field2167 = var4;
            }
        }
        field1005++;
    }
}
