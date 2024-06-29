import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class295 {

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public int field4157;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "B")
    public byte field4168;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public int field4164;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public int field4166;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public int field4158;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Lof;")
    public class295 field4155;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field4153 = 0;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4159 = "";

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Z")
    public static boolean field4165 = false;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field4160 = 0;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public int field4154;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public int field4156;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public int field4161;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public int field4162;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public int field4163;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public int field4167;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    public int field4171;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public int field4172;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public int field4174;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "[I")
    public static int[] field4173;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "[[B")
    public static byte[][] field4169;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V", line = 19)
    public static void method1918(byte arg0) {
        int var1 = -4 / ((arg0 + 34) / 61);
        field4169 = null;
        field4159 = null;
        field4173 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V", line = 47)
    public static final void method1919(int arg0, int arg1, int arg2) {
        field4170++;
        class334 var3 = class352.method2172(0, arg1, 16711935);
        var3.method2104(0);
        var3.field4635 = arg2;
        var3.field4648 = arg0;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(IIIIB)V", line = 66)
    public class295(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field4157 = arg0;
        this.field4168 = arg4;
        this.field4164 = arg2;
        this.field4166 = arg1;
        this.field4158 = arg3;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lof;I)V", line = 77)
    public class295(class295 arg0, int arg1) {
        this.field4155 = arg0;
        this.field4168 = this.field4155.field4168;
        this.field4158 = this.field4155.field4158 + arg1;
        this.field4166 = this.field4155.field4166 + arg1;
        this.field4157 = this.field4155.field4157;
        this.field4164 = this.field4155.field4164 + arg1;
    }
}
