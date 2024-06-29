import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class668 {

    @OriginalMember(owner = "client!vfa", name = "f", descriptor = "Lnga;")
    private class510 field9369 = new class510(64);

    @OriginalMember(owner = "client!vfa", name = "n", descriptor = "Lnga;")
    public class510 field9377 = new class510(60);

    @OriginalMember(owner = "client!vfa", name = "j", descriptor = "Leq;")
    public class209 field9373;

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "Leq;")
    private class209 field9366;

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "Z")
    public static boolean field9365 = false;

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "I")
    public static int field9367 = 0;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "[[I")
    public static int[][] field9364 = new int[128][128];

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "[Ljava/awt/Color;")
    public static Color[] field9368 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!vfa", name = "g", descriptor = "I")
    public static int field9370;

    @OriginalMember(owner = "client!vfa", name = "h", descriptor = "I")
    public static int field9371;

    @OriginalMember(owner = "client!vfa", name = "i", descriptor = "I")
    public static int field9372;

    @OriginalMember(owner = "client!vfa", name = "k", descriptor = "I")
    public static int field9374;

    @OriginalMember(owner = "client!vfa", name = "l", descriptor = "I")
    public static int field9375;

    @OriginalMember(owner = "client!vfa", name = "m", descriptor = "I")
    public static int field9376;

    @OriginalMember(owner = "client!vfa", name = "o", descriptor = "I")
    public static int field9378;

    @OriginalMember(owner = "client!vfa", name = "p", descriptor = "I")
    public static int field9379;

    @OriginalMember(owner = "client!vfa", name = "q", descriptor = "I")
    public int field9380;

    @OriginalMember(owner = "client!vfa", name = "r", descriptor = "I")
    public static int field9381;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)V", line = 4)
    public final void method3750(int arg0, int arg1) {
        field9374++;
        this.field9380 = arg0;
        class510 var3 = this.field9377;
        synchronized (this.field9377) {
            if (arg1 < 102) {
                field9365 = true;
            }
            this.field9377.method3048(false);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)V", line = 19)
    public final void method3751(byte arg0) {
        field9375++;
        class510 var2 = this.field9369;
        synchronized (this.field9369) {
            this.field9369.method3050(false);
        }
        class510 var3 = this.field9377;
        synchronized (this.field9377) {
            int var4 = -29 / ((arg0 - 7) / 34);
            this.field9377.method3050(false);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BI)V", line = 36)
    public final void method3752(byte arg0, int arg1) {
        int var3 = 111 % ((arg0 + 4) / 44);
        class510 var4 = this.field9369;
        synchronized (this.field9369) {
            this.field9369.method3049(arg1, (byte) 126);
        }
        field9378++;
        class510 var5 = this.field9377;
        synchronized (this.field9377) {
            this.field9377.method3049(arg1, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(II)Ldfa;", line = 54)
    public final class164 method3753(int arg0, int arg1) {
        field9372++;
        int var3 = 8 / ((26 - arg0) / 62);
        class510 var4 = this.field9369;
        class164 var5;
        synchronized (this.field9369) {
            var5 = (class164) this.field9369.method3054((byte) -125, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        class209 var6 = this.field9366;
        byte[] var7;
        synchronized (this.field9366) {
            var7 = this.field9366.method1453(class79.method782(arg1, 76), 124, class179.method1289(arg1, (byte) -116));
        }
        class164 var8 = new class164();
        var8.field2410 = arg1;
        var8.field2424 = this;
        if (var7 != null) {
            var8.method1218((byte) 84, new class35(var7));
        }
        class510 var9 = this.field9369;
        synchronized (this.field9369) {
            this.field9369.method3047(false, var8, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(B)V", line = 86)
    public static void method3754(byte arg0) {
        if (arg0 == 95) {
            field9364 = null;
            field9368 = null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V", line = 109)
    public final void method3755(int arg0) {
        field9376++;
        if (arg0 != -22661) {
            field9364 = null;
        }
        class510 var2 = this.field9369;
        synchronized (this.field9369) {
            this.field9369.method3048(false);
        }
        class510 var3 = this.field9377;
        synchronized (this.field9377) {
            this.field9377.method3048(false);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lcw;ILeq;Leq;)V", line = 139)
    public class668(class179 arg0, int arg1, class209 arg2, class209 arg3) {
        this.field9373 = arg3;
        this.field9366 = arg2;
        int var5 = this.field9366.method1454(-1) - 1;
        this.field9366.method1477(0, var5);
    }
}
