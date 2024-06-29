import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class537 extends class388 implements class754 {

    @OriginalMember(owner = "client!so", name = "C", descriptor = "I")
    private int field7808 = -1;

    @OriginalMember(owner = "client!so", name = "v", descriptor = "I")
    private int field7801 = -1;

    @OriginalMember(owner = "client!so", name = "K", descriptor = "I")
    public int field7815;

    @OriginalMember(owner = "client!so", name = "L", descriptor = "I")
    public int field7816;

    @OriginalMember(owner = "client!so", name = "w", descriptor = "Lkw;")
    private class346 field7802;

    @OriginalMember(owner = "client!so", name = "D", descriptor = "I")
    private int field7809;

    @OriginalMember(owner = "client!so", name = "I", descriptor = "I")
    private int field7813;

    @OriginalMember(owner = "client!so", name = "s", descriptor = "I")
    private int field7798;

    @OriginalMember(owner = "client!so", name = "t", descriptor = "Laj;")
    public static class194 field7799 = null;

    @OriginalMember(owner = "client!so", name = "u", descriptor = "I")
    public static int field7800 = -1;

    @OriginalMember(owner = "client!so", name = "x", descriptor = "[Lg;")
    public static class592[] field7803 = new class592[0];

    @OriginalMember(owner = "client!so", name = "r", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!so", name = "y", descriptor = "I")
    public static int field7804;

    @OriginalMember(owner = "client!so", name = "z", descriptor = "I")
    public static int field7805;

    @OriginalMember(owner = "client!so", name = "A", descriptor = "I")
    public static int field7806;

    @OriginalMember(owner = "client!so", name = "B", descriptor = "I")
    public static int field7807;

    @OriginalMember(owner = "client!so", name = "E", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!so", name = "F", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!so", name = "H", descriptor = "I")
    public static int field7812;

    @OriginalMember(owner = "client!so", name = "J", descriptor = "Loi;")
    public static class694 field7814;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIBII)V", line = 6)
    public static final void method3241(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field7807++;
        class504[] var7 = class99.field1437;
        if (arg4 != -33) {
            method3241(10, -26, -108, 75, (byte) 48, -21, 37);
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class504 var9 = var7[var8];
            if (var9 != null && var9.field7322 == 2) {
                class733.method4080(var9.field7324, 0, arg1, arg6 >> 1, var9.field7328 * 2, arg3 >> 1, arg0, var9.field7335, var9.field7323);
                if (class90.field1273[0] > -1 && (class703.field9918 % 20) < 10) {
                    class515 var10 = class242.field3575[var9.field7327];
                    int var11 = arg5 + class90.field1273[0] - 12;
                    int var12 = arg2 + class90.field1273[1] - 28;
                    var10.method3128(var11, var12);
                    class545.method3277(var11, var12, var11 + var10.method784(), -67, var10.method780() + var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V", line = 47)
    public final void method463(byte arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field7808, this.field7801, 36161, 0);
        if (arg0 > -96) {
            this.method3244(62, 55, -74);
        }
        field7806++;
        this.field7801 = -1;
        this.field7808 = -1;
    }

    @OriginalMember(owner = "client!so", name = "finalize", descriptor = "()V", line = 66)
    protected final void finalize() throws Throwable {
        this.method3243((byte) 31);
        field7812++;
        super.finalize();
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIZ)I", line = 77)
    public static final int method3242(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            return -128;
        } else {
            field7797++;
            int var5 = 65536 - class125.field1729[arg2 * 8192 / arg0] >> 1;
            return ((65536 - var5) * arg1 >> 16) + (arg3 * var5 >> 16);
        }
    }

    @OriginalMember(owner = "client!so", name = "d", descriptor = "(B)V", line = 95)
    public final void method3243(byte arg0) {
        field7804++;
        if (this.field7813 > 0) {
            this.field7802.method2145(this.field7813, this.field7798, true);
            this.field7813 = 0;
        }
        if (arg0 < 6) {
            this.field7801 = 8;
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(III)V", line = 120)
    public final void method3244(int arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.field7813);
        field7810++;
        this.field7801 = arg1;
        if (arg2 < 49) {
            this.field7813 = -70;
        }
        this.field7808 = arg0;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lkw;III)V", line = 176)
    public class537(class346 arg0, int arg1, int arg2, int arg3) {
        this.field7815 = arg3;
        this.field7816 = arg2;
        this.field7802 = arg0;
        this.field7809 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class513.field7433, 0);
        this.field7813 = class513.field7433[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field7813);
        OpenGL.glRenderbufferStorageEXT(36161, this.field7809, this.field7816, this.field7815);
        this.field7798 = this.field7816 * this.field7815 * this.field7802.method2199(26885, this.field7809);
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lkw;IIII)V", line = 191)
    public class537(class346 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7816 = arg2;
        this.field7815 = arg3;
        this.field7809 = arg1;
        this.field7802 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class513.field7433, 0);
        this.field7813 = class513.field7433[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field7813);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field7809, this.field7816, this.field7815);
        this.field7798 = this.field7815 * this.field7816 * this.field7802.method2199(26885, this.field7809);
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(I)V", line = 144)
    public static void method3245(int arg0) {
        field7814 = null;
        field7803 = null;
        if (arg0 != 36161) {
            method3246(34, false, (byte) 112, 127);
        }
        field7799 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IZBI)I", line = 157)
    public static final int method3246(int arg0, boolean arg1, byte arg2, int arg3) {
        field7805++;
        class37 var4 = class582.method3429(arg1, (byte) -114, arg0);
        if (arg2 != -74) {
            return 108;
        } else if (var4 == null) {
            return -1;
        } else if (arg3 >= 0 && var4.field334.length > arg3) {
            return var4.field334[arg3];
        } else {
            return -1;
        }
    }
}
