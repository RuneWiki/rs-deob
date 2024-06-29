import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class375 {

    @OriginalMember(owner = "client!po", name = "j", descriptor = "Lbp;")
    private class251 field5470 = new class251();

    @OriginalMember(owner = "client!po", name = "f", descriptor = "Loe;")
    public static class127 field5466 = new class127(87, 12);

    @OriginalMember(owner = "client!po", name = "l", descriptor = "S")
    public static short field5472 = 1;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "Lbg;")
    public static class310 field5473 = new class310(58, 3);

    @OriginalMember(owner = "client!po", name = "o", descriptor = "I")
    public static int field5475 = -1;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!po", name = "k", descriptor = "Lbp;")
    private class251 field5471;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "Llt;")
    public static class458 field5474;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)Lbp;", line = 4)
    public final class251 method2254(byte arg0) {
        field5468++;
        class251 var2 = this.field5470.field3842;
        if (this.field5470 == var2) {
            return null;
        } else {
            var2.method1512((byte) 117);
            int var3 = -30 % ((arg0 + 51) / 39);
            return var2;
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(B)I", line = 29)
    public final int method2255(byte arg0) {
        field5469++;
        int var2 = 0;
        if (arg0 != -42) {
            this.method2258(-36);
        }
        class251 var3 = this.field5470.field3842;
        while (this.field5470 != var3) {
            var3 = var3.field3842;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lbp;I)V", line = 50)
    public final void method2256(class251 arg0, int arg1) {
        if (arg0.field3837 != null) {
            arg0.method1512((byte) 126);
        }
        if (arg1 != 30978) {
            this.method2254((byte) -90);
        }
        field5462++;
        arg0.field3842 = this.field5470;
        arg0.field3837 = this.field5470.field3837;
        arg0.field3837.field3842 = arg0;
        arg0.field3842.field3837 = arg0;
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(B)V", line = 74)
    public final void method2257(byte arg0) {
        while (true) {
            class251 var2 = this.field5470.field3842;
            if (this.field5470 == var2) {
                int var3 = 21 / ((arg0 + 27) / 53);
                field5461++;
                this.field5471 = null;
                return;
            }
            var2.method1512((byte) 123);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)Lbp;", line = 96)
    public final class251 method2258(int arg0) {
        field5463++;
        if (arg0 != 0) {
            this.method2256(null, 53);
        }
        class251 var2 = this.field5471;
        if (this.field5470 == var2) {
            this.field5471 = null;
            return null;
        } else {
            this.field5471 = var2.field3842;
            return var2;
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V", line = 118)
    public static void method2259(int arg0) {
        field5466 = null;
        field5474 = null;
        field5473 = null;
        if (arg0 >= -6) {
            method2259(-62);
        }
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(B)Lbp;", line = 132)
    public final class251 method2260(byte arg0) {
        field5467++;
        class251 var2 = this.field5470.field3842;
        if (this.field5470 == var2) {
            this.field5471 = null;
            return null;
        } else if (arg0 <= 40) {
            return null;
        } else {
            this.field5471 = var2.field3842;
            return var2;
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V", line = 161)
    public class375() {
        this.field5470.field3837 = this.field5470;
        this.field5470.field3842 = this.field5470;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lbl;I[Luh;)Lsj;", line = 170)
    public static final class305 method2261(class442 arg0, int arg1, class108[] arg2) {
        field5465++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg2[var3] == null || arg2[var3].field1873 <= 0L) {
                return null;
            }
        }
        int var4 = -3 / ((arg1 - 37) / 33);
        long var5 = OpenGL.glCreateProgramObjectARB();
        for (int var7 = 0; var7 < arg2.length; var7++) {
            OpenGL.glAttachObjectARB(var5, arg2[var7].field1873);
        }
        OpenGL.glLinkProgramARB(var5);
        OpenGL.glGetObjectParameterivARB(var5, 35714, class371.field5444, 0);
        if (class371.field5444[0] == 0) {
            if (class371.field5444[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var5, 35716, class371.field5444, 1);
            if (class371.field5444[1] > 1) {
                byte[] var8 = new byte[class371.field5444[1]];
                OpenGL.glGetInfoLogARB(var5, class371.field5444[1], class371.field5444, 0, var8, 0);
                System.out.println(new String(var8));
            }
            if (class371.field5444[0] == 0) {
                for (int var9 = 0; var9 < arg2.length; var9++) {
                    OpenGL.glDetachObjectARB(var5, arg2[var9].field1873);
                }
                OpenGL.glDeleteObjectARB(var5);
                return null;
            }
        }
        return new class305(arg0, var5, arg2);
    }
}
