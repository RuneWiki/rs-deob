import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class227 extends class541 {

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "I")
    private int field3338 = -1;

    @OriginalMember(owner = "client!bo", name = "E", descriptor = "I")
    private int field3344 = -1;

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "I")
    public int field3336;

    @OriginalMember(owner = "client!bo", name = "D", descriptor = "Ljava/lang/String;")
    public static String field3343 = "";

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!bo", name = "A", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!bo", name = "B", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!bo", name = "C", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!bo", name = "F", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!bo", name = "G", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "Ldda;")
    public static class597 field3339;

    static {
        new class487("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Los;IIZ[[I)V", line = 6)
    public class227(class468 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field3336 = arg2;
        super.field8091.method2811(this, -2);
        if (!arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field8095, arg2, arg2, 0, 32993, super.field8091.field7019, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                class336.method2096(super.field8095, var7 + 34069, arg2, arg2, super.field8091.field7019, 32993, 477614584, arg4[var7]);
            }
        }
        this.method3174(true, -17759);
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Los;II)V", line = 37)
    public class227(class468 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field3336 = arg2;
        super.field8091.method2811(this, -2);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field8095, arg2, arg2, 0, class128.method802(super.field8095, 1), 5121, (byte[]) null, 0);
        }
        this.method3174(true, -17759);
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Los;IIZ[[BI)V", line = 54)
    public class227(class468 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field3336 = arg2;
        super.field8091.method2811(this, -2);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field8095, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method3174(true, -17759);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V", line = 74)
    public final void method1363(byte arg0) {
        ++field3342;
        OpenGL.glFramebufferTexture2DEXT(this.field3338, this.field3344, 3553, 0, 0);
        this.field3344 = -1;
        this.field3338 = -1;
        if (arg0 != -19) {
            this.method1486(-127, 21, -44, -29, 122);
        }
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)V", line = 91)
    public static final void method1482(int arg0) {
        ++field3346;
        class293.field4303.method1332(-22538);
        if (arg0 != -1) {
            field3343 = null;
        }
        class635.field9257.method2334((byte) -97);
        class218.field3230.method2334((byte) -97);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IB)V", line = 107)
    public static final void method1483(int arg0, byte arg1) {
        ++field3340;
        class621 var2 = class442.method2691(arg0, 6, true);
        var2.method3598(255);
        if (arg1 <= 114) {
            field3343 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)V", line = 120)
    public static void method1484(int arg0) {
        if (arg0 <= 4) {
            method1483(87, (byte) 82);
        }
        field3339 = null;
        field3343 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lqa;Lob;BIIILbj;Lmaa;)V", line = 133)
    public static final void method1485(class167 arg0, class385 arg1, byte arg2, int arg3, int arg4, int arg5, class440 arg6, class42 arg7) {
        ++field3345;
        int var8 = -(arg5 / 2) + arg1.field5634 + -5;
        int var9 = arg4 + 2;
        if (arg7.field492 != 0) {
            arg0.method1066((byte) 86, var9, arg7.field492, var8, arg4 + 1 + arg3 * arg6.method2681() + -var9, arg5 - -10);
        }
        if (~arg7.field481 != -1) {
            arg0.method1067(arg5 + 10, (byte) -55, arg7.field481, arg3 * arg6.method2681() + arg4 - (var9 - 1), var9, var8);
        }
        int var10 = arg7.field512;
        if (arg1.field5637 && arg7.field478 != -1) {
            var10 = arg7.field478;
        }
        for (int var11 = 0; var11 < arg3; ++var11) {
            String var12 = class180.field2774[var11];
            if (~(arg3 + -1) < ~var11) {
                var12 = var12.substring(0, -4 + var12.length());
            }
            arg6.method2686(arg0, var12, arg1.field5634, arg4, var10, true);
            arg4 += arg6.method2681();
        }
        if (arg2 != 63) {
            method1483(-74, (byte) 8);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIII)V", line = 176)
    public final void method1486(int arg0, int arg1, int arg2, int arg3, int arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg3, arg2, arg1, super.field8088, arg4);
        if (arg0 != 29357) {
            this.field3336 = 83;
        }
        ++field3341;
        this.field3344 = arg2;
        this.field3338 = arg3;
    }
}
