import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class644 extends class443 {

    @OriginalMember(owner = "client!bea", name = "y", descriptor = "I")
    public int field9361 = 12800;

    @OriginalMember(owner = "client!bea", name = "K", descriptor = "I")
    public int field9372 = 0;

    @OriginalMember(owner = "client!bea", name = "B", descriptor = "I")
    public int field9364 = 0;

    @OriginalMember(owner = "client!bea", name = "N", descriptor = "Z")
    public boolean field9375 = true;

    @OriginalMember(owner = "client!bea", name = "x", descriptor = "I")
    public int field9360 = -1;

    @OriginalMember(owner = "client!bea", name = "w", descriptor = "I")
    public int field9359 = 12800;

    @OriginalMember(owner = "client!bea", name = "P", descriptor = "I")
    public int field9377 = -1;

    @OriginalMember(owner = "client!bea", name = "t", descriptor = "I")
    public int field9356;

    @OriginalMember(owner = "client!bea", name = "H", descriptor = "Ljava/lang/String;")
    public String field9369;

    @OriginalMember(owner = "client!bea", name = "O", descriptor = "I")
    public int field9376;

    @OriginalMember(owner = "client!bea", name = "C", descriptor = "Ljava/lang/String;")
    public String field9365;

    @OriginalMember(owner = "client!bea", name = "I", descriptor = "Lfea;")
    public class47 field9370;

    @OriginalMember(owner = "client!bea", name = "L", descriptor = "[I")
    public static int[] field9373 = new int[14];

    @OriginalMember(owner = "client!bea", name = "v", descriptor = "Lti;")
    public static class298 field9358 = new class298();

    @OriginalMember(owner = "client!bea", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field9379 = new String[100];

    @OriginalMember(owner = "client!bea", name = "Q", descriptor = "Liu;")
    public static class517 field9378 = new class517(68, -2);

    @OriginalMember(owner = "client!bea", name = "T", descriptor = "Liu;")
    public static class517 field9381 = new class517(52, 4);

    @OriginalMember(owner = "client!bea", name = "u", descriptor = "I")
    public static int field9357;

    @OriginalMember(owner = "client!bea", name = "z", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!bea", name = "D", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!bea", name = "F", descriptor = "I")
    public static int field9368;

    @OriginalMember(owner = "client!bea", name = "J", descriptor = "I")
    public static int field9371;

    @OriginalMember(owner = "client!bea", name = "M", descriptor = "I")
    public static int field9374;

    @OriginalMember(owner = "client!bea", name = "S", descriptor = "I")
    public static int field9380;

    @OriginalMember(owner = "client!bea", name = "E", descriptor = "Lbda;")
    public static class400 field9367;

    @OriginalMember(owner = "client!bea", name = "A", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field9363;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
    public final void method3709(int arg0) {
        this.field9361 = arg0;
        this.field9364 = 0;
        this.field9359 = 12800;
        this.field9372 = 0;
        field9374++;
        for (class383 var2 = (class383) this.field9370.method427(true); var2 != null; var2 = (class383) this.field9370.method420(false)) {
            if (var2.field5688 > this.field9364) {
                this.field9364 = var2.field5688;
            }
            if (this.field9372 < var2.field5695) {
                this.field9372 = var2.field5695;
            }
            if (var2.field5702 < this.field9359) {
                this.field9359 = var2.field5702;
            }
            if (this.field9361 > var2.field5699) {
                this.field9361 = var2.field5699;
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIB[I)Z")
    public final boolean method3710(int arg0, int arg1, int arg2, byte arg3, int[] arg4) {
        field9368++;
        if (arg3 != 96) {
            method3711((byte) 70);
        }
        for (class383 var6 = (class383) this.field9370.method427(true); var6 != null; var6 = (class383) this.field9370.method420(false)) {
            if (var6.method2331(arg2, arg0, arg3 - 96, arg1)) {
                var6.method2332(arg1, arg4, arg0, 1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(B)V")
    public static void method3711(byte arg0) {
        field9367 = null;
        field9373 = null;
        field9381 = null;
        if (arg0 != 73) {
            field9379 = null;
        }
        field9378 = null;
        field9379 = null;
        field9363 = null;
        field9358 = null;
    }

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "(I)V")
    public static final void method3712(int arg0) {
        field9366++;
        if (class25.field348 != null) {
            if (class25.field348.field4739 == 1) {
                class25.field348 = null;
                return;
            }
            if (class25.field348.field4739 == 2) {
                class377.method2292(class350.field5010, class537.field7493, 2, (byte) 110);
                class25.field348 = null;
                return;
            }
        }
        if (arg0 != 2) {
            field9379 = null;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I[IIB)Z")
    public final boolean method3713(int arg0, int[] arg1, int arg2, byte arg3) {
        field9362++;
        for (class383 var5 = (class383) this.field9370.method427(true); var5 != null; var5 = (class383) this.field9370.method420(false)) {
            if (var5.method2336(arg2, (byte) -120, arg0)) {
                var5.method2332(arg0, arg1, arg2, 1);
                return true;
            }
        }
        int var6 = -10 / ((49 - arg3) / 45);
        return false;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(III[I)Z")
    public final boolean method3714(int arg0, int arg1, int arg2, int[] arg3) {
        field9371++;
        class383 var5 = (class383) this.field9370.method427(true);
        if (arg0 != -2) {
            return true;
        }
        while (var5 != null) {
            if (var5.method2334(arg1, arg2, (byte) -52)) {
                var5.method2333(arg3, arg1, false, arg2);
                return true;
            }
            var5 = (class383) this.field9370.method420(false);
        }
        return false;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZII)Z")
    public final boolean method3715(boolean arg0, int arg1, int arg2) {
        field9380++;
        for (class383 var4 = (class383) this.field9370.method427(true); var4 != null; var4 = (class383) this.field9370.method420(arg0)) {
            if (var4.method2336(arg1, (byte) -66, arg2)) {
                return true;
            }
        }
        if (arg0) {
            this.field9376 = 89;
        }
        return false;
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class644(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field9356 = arg3;
        this.field9369 = arg2;
        this.field9377 = arg6;
        this.field9360 = arg4;
        this.field9376 = arg0;
        this.field9375 = arg5;
        this.field9365 = arg1;
        if (this.field9377 == 255) {
            this.field9377 = 0;
        }
        this.field9370 = new class47();
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZLui;)V")
    public static final void method3716(boolean arg0, class587 arg1) {
        field9357++;
        if (class2.field20) {
            return;
        }
        arg1.method911(-52);
        if (arg0) {
            method3711((byte) -1);
        }
        class480.field6825--;
    }
}
