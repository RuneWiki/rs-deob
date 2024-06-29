import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class291 extends class518 {

    @OriginalMember(owner = "client!db", name = "k", descriptor = "Ljava/net/Socket;")
    private Socket field3725;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Lkf;")
    private class230 field3722;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "Ll;")
    private class18 field3726;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIBI)V")
    public static final void method1639(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3723++;
        float var5 = (float) class637.field9032 / (float) class637.field9030;
        int var6 = arg2;
        int var7 = arg1;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg2 * var5);
        } else {
            var6 = (int) ((float) arg1 / var5);
        }
        int var8 = arg4 - (arg2 - var6) / 2;
        int var9 = arg0 - (arg1 - var7) / 2;
        class306.field3998 = class637.field9030 * var8 / var6;
        class472.field6590 = -1;
        class580.field8249 = -1;
        class122.field1375 = class637.field9032 - (class637.field9032 * var9 / var7);
        if (arg3 != -67) {
            method1639(124, -7, -96, (byte) -2, -60);
        }
        class99.method613((byte) 109);
    }

    @OriginalMember(owner = "client!db", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1642(-1);
        field3732++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([BIII)I")
    public final int method1640(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg3 == 12) {
            field3721++;
            return this.field3722.method1341(arg0, arg2, (byte) 99, arg1);
        } else {
            return 27;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III[B)V")
    public final void method1641(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        this.field3726.method75(arg3, arg2, arg1, (byte) -114);
        if (arg0 == -32754) {
            field3728++;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public final void method1642(int arg0) {
        field3729++;
        try {
            this.field3725.close();
        } catch (IOException var2) {
        }
        if (arg0 != -1) {
            this.field3726 = null;
        }
        this.field3722.method1340(true);
        this.field3726.method72((byte) 119);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)Z")
    public static final boolean method1643(int arg0, int arg1, int arg2) {
        field3731++;
        if (arg1 == 30000) {
            return class368.method2015(arg0, (byte) 123, arg2) || class36.method196(-120, arg0, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class291(Socket arg0, int arg1) throws IOException {
        this.field3725 = arg0;
        this.field3725.setSoTimeout(30000);
        this.field3725.setTcpNoDelay(true);
        this.field3722 = new class230(this.field3725.getInputStream(), arg1);
        this.field3726 = new class18(this.field3725.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Z")
    public final boolean method1644(int arg0, int arg1) throws IOException {
        if (arg1 == 12) {
            field3727++;
            return this.field3722.method1336(arg0, 251);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public final void method1645(int arg0) {
        field3724++;
        if (arg0 != -22678) {
            this.finalize();
        }
        this.field3722.method1337(213);
        this.field3726.method74(0);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)V")
    public static final void method1646(int arg0, int arg1) {
        field3730++;
        class423.field5633 = arg0;
        int var2 = -29 % ((48 - arg1) / 45);
        class653 var3 = class39.field423;
        synchronized (class39.field423) {
            class39.field423.method3687((byte) -10);
        }
    }
}
