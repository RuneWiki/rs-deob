import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public abstract class class352 {

    @OriginalMember(owner = "client!is", name = "k", descriptor = "Z")
    private boolean field5443;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "Lnq;")
    public class325 field5439;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    private int field5440;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    private int field5433;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "I")
    public int field5441;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "Lla;")
    public static class319 field5437 = new class319(15, 6);

    @OriginalMember(owner = "client!is", name = "o", descriptor = "Z")
    public static boolean field5447 = false;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "Lpa;")
    public static class254 field5444 = new class254(7, 3);

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!is", name = "n", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!is", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5438++;
        this.field5439.method2032(true, this.field5433, this.field5441);
        super.finalize();
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(I)V")
    public static void method2261(int arg0) {
        field5437 = null;
        field5444 = null;
        if (arg0 != 35044) {
            field5444 = null;
        }
    }

    @OriginalMember(owner = "client!is", name = "d", descriptor = "(I)V")
    public static final void method2262(int arg0) {
        class72.field1002.method1745(-84);
        field5446++;
        if (arg0 != -4) {
            field5444 = null;
        }
        class18.field298.method2614(false);
        class411.field6247.method2614(false);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "([BII)V")
    public final void method2263(byte[] arg0, int arg1, int arg2) {
        this.method469(arg2 - 35117);
        field5434++;
        if (arg1 > this.field5433) {
            OpenGL.glBufferDataARBub(this.field5440, arg1, arg0, 0, this.field5443 ? 35040 : 35044);
            this.field5439.field4908 += arg1 - this.field5433;
            this.field5433 = arg1;
        } else {
            OpenGL.glBufferSubDataARB(this.field5440, 0, arg1, arg0, 0);
        }
        if (arg2 != 35044) {
            this.method2263(null, 11, 86);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIII)I")
    public static final int method2264(int arg0, int arg1, int arg2, int arg3) {
        field5435++;
        if (arg0 > -84) {
            method2262(-114);
        }
        if (class306.field4447 == null) {
            return 0;
        }
        int var4 = arg3 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > class398.field6071 - 1 || var5 > class528.field7734 - 1) {
            return 0;
        }
        int var6 = arg1;
        if (arg1 < 3 && (class178.field2382[1][var4][var5] & 0x2) != 0) {
            var6 = arg1 + 1;
        }
        return class306.field4447[var6].method218(arg3, arg2);
    }

    @OriginalMember(owner = "client!is", name = "e", descriptor = "(I)V")
    public abstract void method469(int arg0);

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lnq;I[BIZ)V")
    public class352(class325 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field5443 = arg4;
        this.field5439 = arg0;
        this.field5440 = arg1;
        this.field5433 = arg3;
        OpenGL.glGenBuffersARB(1, class411.field6255, 0);
        this.field5441 = class411.field6255[0];
        this.method469(113);
        OpenGL.glBufferDataARBub(arg1, this.field5433, arg2, 0, this.field5443 ? 35040 : 35044);
        this.field5439.field4908 += this.field5433;
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lnq;ILjaggl/memory/NativeBuffer;IZ)V")
    public class352(class325 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field5439 = arg0;
        this.field5443 = arg4;
        this.field5440 = arg1;
        this.field5433 = arg3;
        OpenGL.glGenBuffersARB(1, class411.field6255, 0);
        this.field5441 = class411.field6255[0];
        this.method469(-45);
        OpenGL.glBufferDataARBa(arg1, this.field5433, arg2.method2723(), this.field5443 ? 35040 : 35044);
        this.field5439.field4908 += this.field5433;
    }
}
