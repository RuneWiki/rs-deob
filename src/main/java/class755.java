import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class755 extends class331 {

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field10521;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field10522;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field10523;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field10524;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field10525;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field10526;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "[Llfa;")
    public static class334[] field10520;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIBI)I", line = 4)
    public static final int method4201(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 >= -55) {
            method4202(-92);
        }
        ++field10524;
        int var4 = -arg3 + 255;
        int var5 = ((arg1 & 65280) * arg3 & 16711680 | -16711936 & (16711935 & arg1) * arg3) >>> 8;
        return ((16711680 & (arg0 & 65280) * var4 | (16711935 & arg0) * var4 & -16711936) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(ILts;)V", line = 18)
    public class755(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)I", line = 22)
    public final int method226(byte arg0) {
        ++field10526;
        return arg0 != 13 ? 48 : 1;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lts;)V", line = 36)
    public class755(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V", line = 45)
    public static void method4202(int arg0) {
        if (arg0 > -66) {
            field10520 = null;
        }
        field10520 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 56)
    public final void method224(int arg0) {
        if (super.field4202 != 1 && ~super.field4202 != -1) {
            super.field4202 = this.method226((byte) 13);
        }
        ++field10523;
        if (arg0 != -1959) {
            this.method226((byte) -39);
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)I", line = 69)
    public final int method4203(byte arg0) {
        ++field10521;
        return arg0 >= -119 ? 84 : super.field4202;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)I", line = 82)
    public final int method222(int arg0, int arg1) {
        ++field10522;
        if (arg1 != 1) {
            this.method224(-68);
        }
        return 1;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)V", line = 93)
    public final void method227(int arg0, int arg1) {
        ++field10525;
        super.field4202 = arg1;
        if (arg0 < 113) {
            this.method4203((byte) 119);
        }
    }
}
