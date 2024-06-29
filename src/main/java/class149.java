import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class149 extends class125 {

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "[I")
    public int[] field3418 = new int[5];

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "[Lqa;")
    public class112[] field3419 = new class112[5];

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
    public int field3420 = 0;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public int field3412;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
    public int field3408;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
    public int field3417;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
    public int field3404;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "Lod;")
    public static class101 field3391 = class46.method335(-74, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Lod;")
    private static class101 field3383 = class46.method335(-95, "Your account is already logged in)3");

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "Lod;")
    private static class101 field3387 = class46.method335(-93, "yellow:");

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field3384 = -1;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "Lod;")
    public static class101 field3392 = field3387;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "Lod;")
    public static class101 field3394 = class46.method335(-85, "null");

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "Lod;")
    public static class101 field3395 = null;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "Lod;")
    public static class101 field3389 = field3387;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "Lod;")
    public static class101 field3386 = field3383;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "Lod;")
    public static class101 field3399 = class46.method335(-84, "<col=00ffff>");

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public int field3398;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public int field3406;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public int field3407;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    public int field3411;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    public int field3414;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
    public int field3415;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "Lsd;")
    public class129 field3409;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "Lue;")
    public class144 field3396;

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "Lvc;")
    public class149 field3416;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "La;")
    public class1 field3413;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "Ldf;")
    public class28 field3403;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "Lgd;")
    public class46 field3400;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "Lkb;")
    public class71 field3405;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3385;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "Z")
    public boolean field3397;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "Z")
    public boolean field3402;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "Z")
    public boolean field3410;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1162(int arg0, byte arg1, int arg2) {
        field3390++;
        if (arg1 <= 53) {
            method1164((byte) -113);
        }
        return (arg0 >> arg2 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILrd;IIII)V")
    public static final void method1163(int arg0, class122 arg1, int arg2, int arg3, int arg4, int arg5) {
        field3401++;
        int var6 = -22 % ((50 - arg0) / 63);
        int var7 = arg2 * arg2 + arg5 * arg5;
        if (var7 <= 4225 || var7 >= 90000) {
            class98.method679(arg4, arg1, arg3, arg5, false, arg2);
            return;
        }
        int var8 = class97.field2100 + class79.field1652 & 0x7FF;
        int var9 = class124.field2709[var8];
        int var10 = class124.field2717[var8];
        int var11 = var9 * 256 / (class141.field3260 + 256);
        int var12 = var10 * 256 / (class141.field3260 + 256);
        int var13 = arg2 * var12 - arg5 * var11 >> 16;
        int var14 = arg2 * var11 + arg5 * var12 >> 16;
        double var15 = Math.atan2((double) var14, (double) var13);
        int var17 = (int) (Math.sin(var15) * 63.0D);
        int var18 = (int) (Math.cos(var15) * 57.0D);
        class7.field115.method922(arg3 + var17 + 4 + 94 - 10, -var18 + arg4 + 63, 20, 20, 15, 15, var15, 256);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public static void method1164(byte arg0) {
        field3395 = null;
        field3389 = null;
        field3399 = null;
        field3383 = null;
        field3386 = null;
        field3391 = null;
        field3392 = null;
        field3385 = null;
        field3387 = null;
        field3394 = null;
        if (arg0 != 71) {
            field3386 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(III)V")
    public class149(int arg0, int arg1, int arg2) {
        this.field3412 = arg2;
        this.field3417 = this.field3408 = arg0;
        this.field3404 = arg1;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
    public static final void method1165(int arg0) {
        if (arg0 != 26294) {
            method1164((byte) -14);
        }
        field3393++;
        if (class90.field1958 != null) {
            class90.field1958.method444((byte) 122);
            class90.field1958 = null;
        }
        class106.method763(false);
        class33.field857.method581();
        for (int var1 = 0; var1 < 4; var1++) {
            class57.field1331[var1].method348(109);
        }
        System.gc();
        class33.method254(2, -103);
        class26.field680 = -1;
        class155.field3569 = false;
        class22.method179(4626);
        class35.method262(0, 10);
    }
}
