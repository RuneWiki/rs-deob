import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class446 extends class37 implements class460 {

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
    public static int field6454 = 0;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public static int field6457 = 0;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lai;IZ[[I)V", line = 7)
    public class446(class597 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class102.field1058, class687.field9697, arg1 * arg1 * 6, arg2);
        super.field417.method2207((byte) -61, this);
        if (!arg2) {
            for (int var5 = 0; ~var5 > -7; ++var5) {
                OpenGL.glTexImage2Di(var5 + 34069, 0, this.method173(true), arg1, arg1, 0, class325.method1935(-85, super.field403), super.field417.field8506, arg3[var5], 0);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                this.method170(arg1, var6 + 34069, arg3[var6], -104, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)Ljb;", line = 44)
    public static final class492 method2763(int arg0, int arg1, int arg2) {
        class691 var3 = class638.field9170[arg0][arg1][arg2];
        return var3 == null ? null : var3.field9725;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ltp;III)V", line = 55)
    public static final void method2764(class532 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            method2763(83, -32, -46);
        }
        ++field6456;
        class302.field3780 = arg1;
        class266.field3309 = arg0;
        class342.field4436 = arg2;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)I", line = 68)
    public static final int method2765(int arg0, int arg1) {
        if (arg1 != -1961668664) {
            method2764((class532) null, 122, 6, -64);
        }
        ++field6455;
        return arg0 >>> 8;
    }
}
