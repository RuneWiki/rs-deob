import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class134 extends class271 {

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
    private int field1994 = -1;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
    private int field1995 = -1;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public int field1992;

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "I")
    public int field2000;

    @OriginalMember(owner = "client!jk", name = "C", descriptor = "I")
    public int field2003;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field1996 = new String[200];

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "Laa;")
    public static class76 field2002;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "Z")
    public static boolean field2005;

    @OriginalMember(owner = "client!jk", name = "D", descriptor = "Ldp;")
    public static class347 field2004;

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field2006;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!jk", name = "y", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!jk", name = "A", descriptor = "I")
    public static int field2001;

    static {
        new class347("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field2002 = new class76(5, 4);
        field2005 = false;
        field2004 = new class347("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");
        field2006 = new String[] { "en", "de", "fr", "pt", "nl" };
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(JI)V", line = 5)
    public static final void method984(long arg0, int arg1) {
        ++field1998;
        int var3 = class410.field6198.field7681 - -class96.field1488;
        int var4 = class469.field6882 + class410.field6198.field7671;
        if (~(-var3 + class295.field4416) > 499 || ~(-var3 + class295.field4416) < -501 || ~(-var4 + class125.field1880) > 499 || -var4 + class125.field1880 > 500) {
            class125.field1880 = var4;
            class295.field4416 = var3;
        }
        if (class295.field4416 != var3) {
            int var5 = var3 - class295.field4416;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 != 0) {
                if (~var6 > ~var5) {
                    var6 = var5;
                }
            } else {
                var6 = -1;
            }
            class295.field4416 += var6;
        }
        if (class125.field1880 != var4) {
            int var7 = -class125.field1880 + var4;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 != 0) {
                    if (~var7 < ~var8) {
                        var8 = var7;
                    }
                } else {
                    var8 = -1;
                }
            } else if (~var8 == -1) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class125.field1880 += var8;
        }
        if (arg1 == 320) {
            if (!class454.field6661.field969) {
                class311.field4836 += (float) arg0 * class78.field1085 / 6.0F;
                class254.field3443 += (float) arg0 * class161.field2413 / 6.0F;
            }
            class221.method1403(-4);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V", line = 98)
    public static void method985(byte arg0) {
        field2006 = null;
        if (arg0 >= -18) {
            method984(36L, 59);
        }
        field1996 = null;
        field2002 = null;
        field2004 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIIII)V", line = 112)
    public final void method986(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1993;
        super.field4047.method1546(-2, this);
        OpenGL.glCopyTexSubImage3D(super.field4033, arg7, arg2, arg0, arg1, arg6, arg5, arg3, arg4);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V", line = 123)
    public static final void method987(int arg0, int arg1, String arg2, String arg3) {
        class42.field553 = arg0;
        ++field2001;
        class516.field7574 = 2;
        if (arg1 != 500) {
            method984(-93L, -97);
        }
        class478.method2844(arg3, 23238, arg2);
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lvd;IIII[BI)V", line = 139)
    public class134(class258 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field1992 = arg4;
        this.field2000 = arg2;
        this.field2003 = arg3;
        super.field4047.method1546(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field4033, 0, super.field4044, this.field2000, this.field2003, this.field1992, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1693(true, (byte) 7);
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lvd;IIII)V", line = 154)
    public class134(class258 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field1992 = arg4;
        this.field2003 = arg3;
        this.field2000 = arg2;
        super.field4047.method1546(-2, this);
        OpenGL.glTexImage3Dub(super.field4033, 0, super.field4044, this.field2000, this.field2003, this.field1992, 0, class399.method2406(super.field4044, true), 5121, (byte[]) null, 0);
        this.method1693(true, (byte) 96);
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)V", line = 167)
    public static final void method988(int arg0) {
        ++field1999;
        for (int var1 = 0; var1 < 100; ++var1) {
            class147.field2223[var1] = true;
        }
        if (arg0 != -28945) {
            field2006 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 185)
    public final void method737(int arg0) {
        ++field1997;
        if (arg0 != 6407) {
            field2006 = null;
        }
        OpenGL.glFramebufferTexture3DEXT(this.field1995, this.field1994, super.field4033, 0, 0, 0);
        this.field1995 = -1;
        this.field1994 = -1;
    }
}
