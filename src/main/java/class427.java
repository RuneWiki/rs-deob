import jaggl.OpenGL;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public abstract class class427 implements class455 {

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Z")
    private boolean field6465 = false;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "Z")
    private boolean field6470;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public int field6455;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public int field6449;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lna;")
    public class211 field6451;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    private int field6452;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public int field6471;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Ljava/lang/String;")
    public static String field6450 = null;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field6458 = 0;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "J")
    public static long field6463 = 0L;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Lss;")
    public static class213 field6461 = new class213("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Lhl;")
    public static class247 field6462;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Ljava/awt/Image;")
    public static Image field6456;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public final void method2698(int arg0) {
        field6469++;
        if (arg0 < this.field6471) {
            this.field6451.method1549((byte) 111, this.method2704(true), this.field6471);
            this.field6471 = 0;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    private final void method2699(byte arg0) {
        field6464++;
        this.field6451.method1540(arg0 + 122, this);
        if (arg0 != -75) {
            return;
        }
        if (this.field6465) {
            OpenGL.glTexParameteri(this.field6455, 10241, this.field6470 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field6455, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field6455, 10241, this.field6470 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field6455, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([S[Ljava/lang/String;I)V")
    public static final void method2700(short[] arg0, String[] arg1, int arg2) {
        class357.method2369(arg1.length - 1, 1, arg0, arg1, arg2);
        field6467++;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)Z")
    public final boolean method2701(byte arg0) {
        field6454++;
        int var2 = -98 % ((arg0 + 35) / 38);
        if (!this.field6451.field3529) {
            return false;
        }
        int var3 = this.method2704(true);
        this.field6451.method1540(71, this);
        OpenGL.glGenerateMipmapEXT(this.field6455);
        this.field6470 = true;
        this.method2699((byte) -75);
        this.method2707((byte) -70, var3);
        return true;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
    public static void method2702(int arg0) {
        field6461 = null;
        field6462 = null;
        field6456 = null;
        if (arg0 < 0) {
            field6450 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)V")
    public final void method2703(int arg0, boolean arg1) {
        if (arg0 != 0) {
            this.method2706(-108);
        }
        if (this.field6465 != arg1) {
            this.field6465 = arg1;
            this.method2699((byte) -75);
        }
        field6460++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)I")
    private final int method2704(boolean arg0) {
        field6457++;
        int var2 = this.field6451.method1493(85, this.field6449) * this.field6452;
        if (!arg0) {
            method2702(-27);
        }
        return this.field6470 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZB)V")
    public final void method2705(boolean arg0, byte arg1) {
        field6466++;
        if (arg1 > 36 && this.field6470 != arg0) {
            int var3 = this.method2704(true);
            this.field6470 = true;
            this.method2699((byte) -75);
            this.method2707((byte) -57, var3);
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)I")
    public final int method2706(int arg0) {
        if (arg0 != 28722) {
            field6462 = null;
        }
        field6459++;
        return this.field6471;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)V")
    private final void method2707(byte arg0, int arg1) {
        field6468++;
        if (arg0 > -21) {
            this.method2707((byte) -71, -115);
        }
        this.field6451.field3494 -= arg1;
        this.field6451.field3494 += this.method2704(true);
    }

    @OriginalMember(owner = "client!ed", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method2698(0);
        field6453++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lna;IIIZ)V")
    public class427(class211 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6470 = arg4;
        this.field6455 = arg1;
        this.field6449 = arg2;
        this.field6451 = arg0;
        this.field6452 = arg3;
        OpenGL.glGenTextures(1, class385.field5893, 0);
        this.field6471 = class385.field5893[0];
        this.method2707((byte) -100, 0);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public abstract void method82(int arg0);
}
