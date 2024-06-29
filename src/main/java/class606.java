import jaggl.OpenGL;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class606 extends class37 implements class349 {

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    private int field8618;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    private int field8615;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    private int field8620;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "[I")
    public static int[] field8613 = new int[3];

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
    public static int field8617 = 0;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "Z")
    public static boolean field8614 = false;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public static int field8616;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    public static int field8622;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "Lea;")
    public static class544 field8619;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static final void method3439(int arg0) {
        if (arg0 != 512) {
            method3439(11);
        }
        if (class275.field3370.method413()) {
            class275.field3370.method375(class618.field8849);
            class491.method2952((byte) 79);
            if (!class397.field5443) {
                Dimension var1 = class618.field8849.getSize();
                class275.field3370.method369(class618.field8849, var1.width, var1.height);
            } else {
                class114.method759(-1, class618.field8849);
            }
            class275.field3370.method417(class618.field8849);
        } else {
            class627.method3597(false, class654.field9334.field9850.method1512(27), -31618);
        }
        ++field8622;
        class486.method2933(true);
        class568.field8076 = true;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lai;Lwd;III[B)V")
    public class606(class597 arg0, class272 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class687.field9697, arg2 * arg3 * arg4, false);
        this.field8618 = arg2;
        this.field8615 = arg4;
        this.field8620 = arg3;
        super.field417.method2207((byte) -61, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field416, 0, this.method173(true), this.field8618, this.field8620, this.field8615, 0, class325.method1935(68, super.field403), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lbda;BI)V")
    public static final void method3440(class504 arg0, byte arg1, int arg2) {
        if (arg1 < -18) {
            ++field8616;
            int var3 = -1;
            int var4 = 0;
            if (~class392.field5398 > ~arg0.field7141) {
                class367.method2143(arg0, -7139);
            } else if (~class392.field5398 < ~arg0.field7167) {
                class10.method45(arg0, false, 1519);
                var4 = class66.field675;
                var3 = class165.field1849;
            } else {
                class399.method2444(arg0, (byte) -27);
            }
            if (arg0.field4635 < 512 || arg0.field4629 < 512 || class489.field6976 * 512 + -512 <= arg0.field4635 || ~arg0.field4629 <= ~(class153.field1677 * 512 + -512)) {
                var4 = 0;
                var3 = -1;
                arg0.field7106 = -1;
                arg0.field7145 = -1;
                arg0.field7084 = -1;
                arg0.field7152 = null;
                arg0.field7167 = 0;
                arg0.field7141 = 0;
                arg0.field4635 = arg0.field7187[0] * 512 - -(256 * arg0.method1128(-1));
                arg0.field4629 = arg0.field7193[0] * 512 - -(256 * arg0.method1128(-1));
                arg0.method2989(0);
            }
            if (class90.field937 == arg0 && (~arg0.field4635 > -6145 || arg0.field4629 < 6144 || ~((class489.field6976 - 12) * 512) >= ~arg0.field4635 || arg0.field4629 >= (class153.field1677 + -12) * 512)) {
                arg0.field7084 = -1;
                var3 = -1;
                arg0.field7167 = 0;
                arg0.field7152 = null;
                arg0.field7106 = -1;
                var4 = 0;
                arg0.field7141 = 0;
                arg0.field7145 = -1;
                arg0.field4635 = arg0.field7187[0] * 512 - -(arg0.method1128(-1) * 256);
                arg0.field4629 = arg0.field7193[0] * 512 + 256 * arg0.method1128(-1);
                arg0.method2989(0);
            }
            int var5 = class567.method3301(arg0, (byte) 28);
            class74.method538(arg0, true);
            class344.method2049(var3, arg0, 1081, var4, var5);
            class158.method976(arg0, var3, (byte) -76);
            class199.method1199(arg0, 71);
        }
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V")
    public static void method3441(int arg0) {
        field8619 = null;
        field8613 = null;
        if (arg0 != -512) {
            field8614 = true;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method3442(String[] arg0, int arg1) {
        ++field8621;
        String[] var2 = new String[5];
        for (int var3 = arg1; ~var3 > -6; ++var3) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }
}
