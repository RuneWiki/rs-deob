import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class86 extends class501 implements class603 {

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    private int field1218 = -1;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    private int field1220 = -1;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    private int field1221;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "Lte;")
    private class527 field1217;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
    public int field1222;

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "I")
    public int field1230;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
    private int field1232;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    private int field1216;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "Ltda;")
    public static class546 field1223 = new class546(7, 0, 1, 1);

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "Lh;")
    public static class572 field1233 = new class572("K", "T", "K", "K");

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "Lada;")
    public static class144 field1235 = new class144(15, 2);

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "Lij;")
    public static class359 field1226;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)V", line = 3)
    public final void method640(int arg0) {
        if (this.field1232 > 0) {
            this.field1217.method3136(1325362984, this.field1216, this.field1232);
            this.field1232 = 0;
        }
        if (arg0 >= -83) {
            method643(36);
        }
        field1229++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BIZ)I", line = 20)
    public static final int method641(byte arg0, int arg1, boolean arg2) {
        field1224++;
        if (arg2) {
            return 0;
        }
        if (arg0 > -65) {
            method644((byte) 124);
        }
        class38 var3 = class487.method2920(arg2, 13993, arg1);
        if (var3 == null) {
            return class405.field5547.method607(-104, arg1).field9150;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field466.length; var5++) {
            if (var3.field466[var5] == -1) {
                var4++;
            }
        }
        return var4 + (class405.field5547.method607(37, arg1).field9150 - var3.field466.length);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 56)
    public final void method642(int arg0) {
        if (arg0 < -80) {
            OpenGL.glFramebufferRenderbufferEXT(this.field1218, this.field1220, 36161, 0);
            field1231++;
            this.field1218 = -1;
            this.field1220 = -1;
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lte;III)V", line = 153)
    public class86(class527 arg0, int arg1, int arg2, int arg3) {
        this.field1221 = arg1;
        this.field1217 = arg0;
        this.field1222 = arg3;
        this.field1230 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class641.field9340, 0);
        this.field1232 = class641.field9340[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field1232);
        OpenGL.glRenderbufferStorageEXT(36161, this.field1221, this.field1230, this.field1222);
        this.field1216 = this.field1230 * this.field1222 * this.field1217.method3161(this.field1221, 0);
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lte;IIII)V", line = 168)
    public class86(class527 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1230 = arg2;
        this.field1217 = arg0;
        this.field1222 = arg3;
        this.field1221 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class641.field9340, 0);
        this.field1232 = class641.field9340[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field1232);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field1221, this.field1230, this.field1222);
        this.field1216 = this.field1230 * this.field1222 * this.field1217.method3161(this.field1221, 0);
    }

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "(I)V", line = 81)
    public static void method643(int arg0) {
        field1235 = null;
        field1223 = null;
        field1226 = null;
        if (arg0 != 22513) {
            field1226 = null;
        }
        field1233 = null;
    }

    @OriginalMember(owner = "client!hk", name = "finalize", descriptor = "()V", line = 97)
    protected final void finalize() throws Throwable {
        this.method640(-89);
        field1228++;
        super.finalize();
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)I", line = 113)
    public static final int method644(byte arg0) {
        field1219++;
        if (arg0 != 68) {
            field1234 = 13;
        }
        return class647.field9400;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V", line = 125)
    public final void method645(int arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg2, arg1, this.field1232);
        field1227++;
        this.field1218 = arg0;
        this.field1220 = arg2;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)Lkq;", line = 139)
    public static final class510 method646(int arg0, int arg1) {
        field1225++;
        if (arg0 <= 48) {
            method646(-62, -18);
        }
        return arg1 >= 0 && arg1 < 100 ? class574.field8452[arg1] : null;
    }
}
