import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class24 extends class136 {

    @OriginalMember(owner = "client!fba", name = "z", descriptor = "I")
    private int field295 = -1;

    @OriginalMember(owner = "client!fba", name = "H", descriptor = "I")
    private int field303 = -1;

    @OriginalMember(owner = "client!fba", name = "B", descriptor = "I")
    public int field297;

    @OriginalMember(owner = "client!fba", name = "u", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "client!fba", name = "C", descriptor = "I")
    public int field298;

    @OriginalMember(owner = "client!fba", name = "F", descriptor = "Lem;")
    public static class206 field301 = new class206(64, 2);

    @OriginalMember(owner = "client!fba", name = "G", descriptor = "I")
    public static int field302 = 2;

    @OriginalMember(owner = "client!fba", name = "J", descriptor = "I")
    public static int field304 = 0;

    @OriginalMember(owner = "client!fba", name = "v", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!fba", name = "w", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!fba", name = "x", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!fba", name = "y", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!fba", name = "A", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!fba", name = "D", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!fba", name = "E", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!fba", name = "K", descriptor = "[[S")
    public static short[][] field305;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lr;I)V")
    public static final void method237(class166 arg0, int arg1) {
        class558.field7522 = new class486[class523.field7103.length];
        ++field294;
        if (arg1 <= 4) {
            field302 = 101;
        }
        for (int var2 = 0; var2 < class523.field7103.length; ++var2) {
            int var3 = class523.field7103[var2];
            class283 var4 = class699.method3918(var3, -76, class417.field5891);
            class417 var5 = arg0.method129(var4, class168.method1190(class587.field8255, var3), true);
            class558.field7522[var2] = new class486(var5, var4);
        }
    }

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "(I)V")
    public static void method238(int arg0) {
        if (arg0 != 6) {
            method243(-38, -27);
        }
        field301 = null;
        field305 = null;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method239(boolean arg0, String arg1) throws ClassNotFoundException {
        ++field299;
        if (!arg0) {
            field301 = null;
        }
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else {
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V")
    public final void method240(byte arg0) {
        if (arg0 != -8) {
            field304 = -38;
        }
        OpenGL.glFramebufferTexture3DEXT(this.field295, this.field303, super.field1925, 0, 0, 0);
        ++field292;
        this.field295 = -1;
        this.field303 = -1;
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Llj;IIII[BI)V")
    public class24(class565 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field297 = arg3;
        this.field290 = arg4;
        this.field298 = arg2;
        super.field1927.method3206(this, (byte) 26);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field1925, 0, super.field1930, this.field298, this.field297, this.field290, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method944((byte) -111, true);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IB)I")
    public static final int method241(int arg0, byte arg1) {
        ++field293;
        int var2 = 29 / ((45 - arg1) / 60);
        int var3 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var4 = arg0 * 6 + -61440;
        int var5 = (arg0 * var4 >> 12) + 40960;
        return var3 * var5 >> 12;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIIIII)V")
    public final void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field291;
        super.field1927.method3206(this, (byte) 26);
        if (arg0 == 2) {
            OpenGL.glCopyTexSubImage3D(super.field1925, 0, arg4, arg5, arg2, arg3, arg6, arg7, arg1);
            OpenGL.glFlush();
        }
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Llj;IIII)V")
    public class24(class565 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field297 = arg3;
        this.field298 = arg2;
        this.field290 = arg4;
        super.field1927.method3206(this, (byte) 26);
        OpenGL.glTexImage3Dub(super.field1925, 0, super.field1930, this.field298, this.field297, this.field290, 0, class589.method3346(super.field1930, (byte) -100), 5121, (byte[]) null, 0);
        this.method944((byte) -111, true);
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(II)V")
    public static final void method243(int arg0, int arg1) {
        ++field296;
        if (class368.field4965 != arg1) {
            class401.field5620 = class257.field3508 = class55.field620[arg1];
            class114.method821((byte) 108);
            class183.field2646 = new int[class401.field5620][class257.field3508];
            class435.field6048 = new int[class401.field5620][class257.field3508];
            class281.field3846 = new int[arg0][class401.field5620 >> 3][class257.field3508 >> 3];
            for (int var2 = 0; var2 < 4; ++var2) {
                class151.field2218[var2] = class131.method928(class401.field5620, 1, class257.field3508);
            }
            class468.field6439 = new byte[4][class401.field5620][class257.field3508];
            class320.method1925(class401.field5620, 4, 2048, class257.field3508);
            class317.method1918(86, class257.field3508 >> 3, class334.field4506, class401.field5620 >> 3);
            class368.field4965 = arg1;
        }
    }
}
