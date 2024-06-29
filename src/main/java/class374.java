import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class374 extends class322 {

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Z")
    public static boolean field5243 = false;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "Lfp;")
    public static class323 field5245;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)I")
    public final int method17(byte arg0) {
        int var2 = 91 % ((arg0 - 70) / 51);
        ++field5246;
        return 0;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
    public static void method2352(int arg0) {
        if (arg0 > -107) {
            field5243 = false;
        }
        field5245 = null;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(Z)I")
    public final int method2353(boolean arg0) {
        if (arg0) {
            this.method22(83, 40);
        }
        ++field5247;
        return super.field4451;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILd;IBLjava/awt/Canvas;)Lha;")
    public static final class58 method2354(int arg0, class149 arg1, int arg2, byte arg3, Canvas arg4) {
        if (arg3 <= 73) {
            method2355(82, (class675) null);
        }
        ++field5244;
        return new class205(arg4, arg1, arg0, arg2);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)V")
    public final void method22(int arg0, int arg1) {
        super.field4451 = arg1;
        if (arg0 != 0) {
            field5243 = false;
        }
        ++field5248;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(ILch;)V")
    public class374(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILee;)Lju;")
    public static final class124 method2355(int arg0, class675 arg1) {
        if (arg0 != -1) {
            return null;
        } else {
            ++field5249;
            int var2 = arg1.method3757((byte) -65);
            return new class124(var2);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)I")
    public final int method19(int arg0, int arg1) {
        ++field5251;
        if (arg1 <= 10) {
            field5245 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lch;)V")
    public class374(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        ++field5250;
        if (~super.field4451 > -1 || super.field4451 > 4) {
            super.field4451 = this.method17((byte) 123);
        }
        if (arg0) {
            field5245 = null;
        }
    }
}
