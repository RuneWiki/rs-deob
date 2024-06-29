import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class353 {

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "Lub;")
    public static class15 field5120 = new class15(4);

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "[Z")
    public static boolean[] field5126 = new boolean[100];

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "F")
    public static float field5128 = 0.0F;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public int field5119;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "Lsf;")
    public class306 field5125;

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "Lkq;")
    public class353 field5127;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILlf;)Ljava/lang/String;")
    public static final String method2308(int arg0, class130 arg1) {
        field5118++;
        return arg0 == 29367 ? class336.method2209(32767, (byte) -114, arg1) : null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)Lqo;")
    public static final class16 method2309(int arg0, int arg1, int arg2) {
        class74 var3 = class385.field5449[arg0][arg1][arg2];
        return var3 == null || var3.field969 == null ? null : var3.field969;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
    public static void method2310(int arg0) {
        if (arg0 >= -39) {
            method2310(100);
        }
        field5120 = null;
        field5126 = null;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V")
    public final void method2311(int arg0) {
        field5122++;
        if (class70.field931 >= 500) {
            return;
        }
        this.field5119 = arg0;
        this.field5125 = null;
        this.field5127 = class162.field2319;
        class70.field931++;
        class162.field2319 = this;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(III)I")
    public static final int method2312(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method2309(-99, 101, -98);
        }
        field5123++;
        return arg0 == 4 || arg0 == 5 ? class47.field624[arg1 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)V")
    public static final void method2313(int arg0) {
        field5124++;
        class64.field885.method1382((byte) 47);
        if (arg0 != 256) {
            method2310(114);
        }
    }
}
