import jaggl.OpenGL;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class415 extends class148 {

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
    private int field5705 = -1;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "I")
    private int field5702 = -1;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "I")
    public int field5706;

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "Z")
    public static boolean field5708;

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5707;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIIIZ)V")
    public static final void method2472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        ++field5703;
        if (arg5 >= 1 && ~arg7 <= -2 && class139.field1760 + -2 >= arg5 && ~(class369.field5135 - 2) <= ~arg7) {
            int var9 = arg6;
            if (~arg6 > -4 && class291.method1786(arg7, (byte) 112, arg5)) {
                var9 = arg6 + 1;
            }
            if (!class501.field6954.method3539(class428.field5845, 2) && !class68.method387(var9, arg7, arg5, 0, class475.field6698)) {
                return;
            }
            if (class199.field2605 == null) {
                return;
            }
            class442.field6004.method1711(arg5, class15.field154[arg6], class301.field3918, arg7, arg6, 102, arg4);
            if (arg3 >= 0) {
                boolean var10 = class501.field6954.field7843;
                class501.field6954.field7843 = true;
                class442.field6004.method1716(arg1, arg2, class15.field154[arg6], class301.field3918, arg3, var9, arg0, arg7, arg6, 0, arg5);
                class501.field6954.field7843 = var10;
            }
        }
        if (arg8) {
            field5708 = true;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BIIII)V")
    public final void method2473(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5701;
        OpenGL.glFramebufferTexture2DEXT(arg1, arg3, arg4, super.field1925, arg2);
        this.field5702 = arg1;
        if (arg0 != -96) {
            field5708 = false;
        }
        this.field5705 = arg3;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Luq;II)V")
    public class415(class313 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field5706 = arg2;
        super.field1926.method1884(this, -2);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field1916, arg2, arg2, 0, class642.method3707(19512, super.field1916), 5121, (byte[]) null, 0);
        }
        this.method805(true, 124);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIB[B)V")
    public static final void method2474(int arg0, int arg1, int arg2, int arg3, byte arg4, byte[] arg5) {
        ++field5700;
        if (~arg1 < ~arg3) {
            int var6 = arg2 + arg3;
            int var7 = -arg3 + arg1 >> 2;
            while (true) {
                --var7;
                if (var7 < 0) {
                    if (arg4 != 5) {
                        return;
                    } else {
                        int var8 = 3 & -arg3 + arg1;
                        while (true) {
                            --var8;
                            if (var8 < 0) {
                                return;
                            }
                            arg5[var6++] = 1;
                        }
                    }
                }
                arg5[var6++] = 1;
                arg5[var6++] = 1;
                arg5[var6++] = 1;
                arg5[var6++] = 1;
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(B)V")
    public static void method2475(byte arg0) {
        if (arg0 == 47) {
            field5707 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Luq;IIZ[[I)V")
    public class415(class313 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field5706 = arg2;
        super.field1926.method1884(this, -2);
        if (arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                class82.method463(32993, var6 + 34069, arg2, arg4[var6], -32994, super.field1926.field4234, super.field1916, arg2);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field1916, arg2, arg2, 0, 32993, super.field1926.field4234, arg4[var7], 0);
            }
        }
        this.method805(true, 14);
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Luq;IIZ[[BI)V")
    public class415(class313 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field5706 = arg2;
        super.field1926.method1884(this, -2);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field1916, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method805(true, -120);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
    public final void method157(byte arg0) {
        ++field5704;
        OpenGL.glFramebufferTexture2DEXT(this.field5702, this.field5705, 3553, 0, 0);
        if (arg0 > 97) {
            this.field5702 = -1;
            this.field5705 = -1;
        }
    }

    static {
        new class344("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field5708 = false;
        field5707 = new Color[] { new Color(9179409), new Color(16777215) };
    }
}
