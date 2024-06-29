import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class235 extends class221 {

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
    private int field3293 = -1;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
    private int field3301 = -1;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public int field3291;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "I")
    public int field3300;

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "I")
    public int field3303;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "Liu;")
    public static class390 field3302 = new class390(101, 20);

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "Lwt;")
    public static class194 field3304 = new class194("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "Lgn;")
    public static class475 field3306 = new class475(55, 4);

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field3307 = new String[100];

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "Lhe;")
    public static class239 field3308;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "[Lts;")
    public static class356[] field3305;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIBZI)V")
    public static final void method1424(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        ++field3295;
        long var6 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg5);
        class220 var8 = (class220) class151.field1947.method2310((byte) 61, var6);
        if (var8 == null) {
            var8 = new class220();
            class151.field1947.method2317(-1, var6, var8);
        }
        if (var8.field3097.length <= arg2) {
            int[] var9 = new int[arg2 + 1];
            int[] var10 = new int[arg2 + 1];
            for (int var11 = 0; var8.field3097.length > var11; ++var11) {
                var9[var11] = var8.field3097[var11];
                var10[var11] = var8.field3101[var11];
            }
            for (int var12 = var8.field3097.length; ~var12 > ~arg2; ++var12) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field3101 = var10;
            var8.field3097 = var9;
        }
        var8.field3097[arg2] = arg0;
        var8.field3101[arg2] = arg1;
        if (arg3 != -55) {
            field3307 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    public static void method1425(int arg0) {
        field3308 = null;
        field3305 = null;
        field3306 = null;
        field3304 = null;
        field3307 = null;
        field3302 = null;
        if (arg0 != -17095) {
            field3307 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 >= -115) {
            method1429(127, (byte) 24, -33);
        }
        ++field3296;
        if (class322.method1928(arg3, 7387)) {
            if (class135.field1730[arg3] == null) {
                client.method1181(class181.field2591[arg3], -1, arg4, arg1, arg0, arg8, arg7, arg6, arg9, arg2);
            } else {
                client.method1181(class135.field1730[arg3], -1, arg4, arg1, arg0, arg8, arg7, arg6, arg9, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lrl;IIII)V")
    public class235(class487 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field3291 = arg3;
        this.field3300 = arg4;
        this.field3303 = arg2;
        super.field3112.method2883(this, -102);
        OpenGL.glTexImage3Dub(super.field3116, 0, super.field3119, this.field3303, this.field3291, this.field3300, 0, class195.method1221(79, super.field3119), 5121, (byte[]) null, 0);
        this.method1357(true, (byte) 99);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public final void method224(int arg0) {
        ++field3292;
        OpenGL.glFramebufferTexture3DEXT(this.field3301, this.field3293, super.field3116, 0, 0, arg0);
        this.field3293 = -1;
        this.field3301 = -1;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(III)Z")
    public static final boolean method1427(int arg0, int arg1, int arg2) {
        ++field3294;
        if (arg0 > -3) {
            field3302 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIBII)V")
    public final void method1428(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        super.field3112.method2883(this, 41);
        ++field3298;
        OpenGL.glCopyTexSubImage3D(super.field3116, 0, arg6, arg0, arg3, arg7, arg1, arg4, arg2);
        OpenGL.glFlush();
        int var9 = 43 % ((28 - arg5) / 32);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1429(int arg0, byte arg1, int arg2) {
        ++field3299;
        if (arg1 != 120) {
            method1425(36);
        }
        return ~(arg2 & 2048) != -1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZII)Z")
    public static final boolean method1430(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            return false;
        } else {
            ++field3297;
            return ~(arg2 & 544) == -545 | ~(24 & arg2) != -1;
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lrl;IIII[BI)V")
    public class235(class487 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field3300 = arg4;
        this.field3291 = arg3;
        this.field3303 = arg2;
        super.field3112.method2883(this, -93);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field3116, 0, super.field3119, this.field3303, this.field3291, this.field3300, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1357(true, (byte) 124);
    }
}
