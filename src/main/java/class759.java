import jaclib.memory.Buffer;
import jaggl.OpenGL;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class class759 {

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    private int field10551;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "Z")
    private boolean field10546;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
    private int field10553;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "Leea;")
    public class131 field10548;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public int field10547;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    public static int field10549 = -1;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field10542;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public static int field10543;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field10544;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field10545;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public static int field10550;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
    public static int field10552;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
    public static int field10554;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZI[B)V")
    public final void method4210(boolean arg0, int arg1, byte[] arg2) {
        field10543++;
        if (!arg0) {
            method4214(-118);
        }
        this.method1198((byte) 50);
        if (this.field10551 >= arg1) {
            OpenGL.glBufferSubDataARBub(this.field10553, 0, arg1, arg2, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field10553, arg1, arg2, 0, this.field10546 ? 35040 : 35044);
            this.field10548.field1805 += arg1 - this.field10551;
            this.field10551 = arg1;
        }
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)[Ldp;")
    public static final class3[] method4211(int arg0) {
        if (arg0 != -11911) {
            method4214(-33);
        }
        field10542++;
        return new class3[] { class728.field10183, class347.field4912, class48.field563 };
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(B)V")
    public abstract void method1198(byte arg0);

    @OriginalMember(owner = "client!mp", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field10548.method915(-103, this.field10547, this.field10551);
        field10554++;
        super.finalize();
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZII)V")
    public static final void method4212(boolean arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field10549 = -46;
        }
        field10545++;
        class615.method3441(class71.field908.method588((byte) 95, class549.field7669), arg2, (byte) -54, arg0);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method4213(byte arg0, long arg1) {
        class682.field9351.setTime(new Date(arg1));
        field10550++;
        int var3 = class682.field9351.get(7);
        int var4 = -112 / ((arg0 - 22) / 32);
        int var5 = class682.field9351.get(5);
        int var6 = class682.field9351.get(2);
        int var7 = class682.field9351.get(1);
        int var8 = class682.field9351.get(11);
        int var9 = class682.field9351.get(12);
        int var10 = class682.field9351.get(13);
        return class680.field9331[var3 - 1] + ", " + var5 / 10 + var5 % 10 + "-" + class146.field2105[var6] + "-" + var7 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "(I)Loaa;")
    public static final class287 method4214(int arg0) {
        if (arg0 != 1554) {
            field10549 = -26;
        }
        field10552++;
        return class315.field4364.length > class504.field7236 ? class315.field4364[class504.field7236++] : null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)I")
    public static final int method4215(int arg0, int arg1) {
        field10544++;
        if (arg1 != 127) {
            method4214(-123);
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Leea;I[BIZ)V")
    public class759(class131 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field10551 = arg3;
        this.field10546 = arg4;
        this.field10553 = arg1;
        this.field10548 = arg0;
        OpenGL.glGenBuffersARB(1, class531.field7482, 0);
        this.field10547 = class531.field7482[0];
        this.method1198((byte) 76);
        OpenGL.glBufferDataARBub(arg1, this.field10551, arg2, 0, this.field10546 ? 35040 : 35044);
        this.field10548.field1805 += this.field10551;
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Leea;ILjaclib/memory/Buffer;IZ)V")
    public class759(class131 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field10546 = arg4;
        this.field10551 = arg3;
        this.field10548 = arg0;
        this.field10553 = arg1;
        OpenGL.glGenBuffersARB(1, class531.field7482, 0);
        this.field10547 = class531.field7482[0];
        this.method1198((byte) 76);
        OpenGL.glBufferDataARBa(arg1, this.field10551, arg2.getAddress(), this.field10546 ? 35040 : 35044);
        this.field10548.field1805 += this.field10551;
    }
}
