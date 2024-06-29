import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class89 extends class379 {

    @OriginalMember(owner = "client!haa", name = "h", descriptor = "Ljava/lang/String;")
    public String field1185;

    @OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
    public static int field1186 = 0;

    @OriginalMember(owner = "client!haa", name = "j", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!haa", name = "k", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!haa", name = "l", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!haa", name = "m", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!haa", name = "n", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!haa", name = "o", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!haa", name = "p", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "([Lqba;Lpc;B)Lpq;", line = 3)
    public static final class207 method810(class426[] arg0, class700 arg1, byte arg2) {
        field1189++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field5644 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field5644);
        }
        OpenGL.glLinkProgramARB(var4);
        int var7 = 55 / ((-arg2 - 73) / 35);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class251.field2947, 0);
        if (class251.field2947[0] == 0) {
            if (class251.field2947[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class251.field2947, 1);
            if (class251.field2947[1] > 1) {
                byte[] var8 = new byte[class251.field2947[1]];
                OpenGL.glGetInfoLogARB(var4, class251.field2947[1], class251.field2947, 0, var8, 0);
                System.out.println(new String(var8));
            }
            if (class251.field2947[0] == 0) {
                for (int var9 = 0; var9 < arg0.length; var9++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var9].field5644);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class207(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IB)Z", line = 78)
    public static final boolean method811(int arg0, byte arg1) {
        field1191++;
        if (arg1 > -107) {
            return true;
        } else {
            return arg0 == 0 || arg0 == 2;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "([SI)[S", line = 90)
    public static final short[] method812(short[] arg0, int arg1) {
        field1192++;
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class211.method1334(arg0, arg1, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(IB)Lhu;", line = 105)
    public static final class143 method813(int arg0, byte arg1) {
        field1188++;
        if (arg1 >= -65) {
            method812(null, -27);
        }
        if (arg0 == 0) {
            if ((double) class9.field154 == 3.0D) {
                return class535.field7531;
            }
            if ((double) class9.field154 == 4.0D) {
                return class356.field4422;
            }
            if ((double) class9.field154 == 6.0D) {
                return class389.field5029;
            }
            if ((double) class9.field154 >= 8.0D) {
                return class52.field709;
            }
        } else if (arg0 == 1) {
            if ((double) class9.field154 == 3.0D) {
                return class389.field5029;
            }
            if ((double) class9.field154 == 4.0D) {
                return class52.field709;
            }
            if ((double) class9.field154 == 6.0D) {
                return class784.field10823;
            }
            if ((double) class9.field154 >= 8.0D) {
                return class648.field8842;
            }
        } else if (arg0 == 2) {
            if ((double) class9.field154 == 3.0D) {
                return class784.field10823;
            }
            if ((double) class9.field154 == 4.0D) {
                return class648.field8842;
            }
            if ((double) class9.field154 == 6.0D) {
                return class181.field2211;
            }
            if ((double) class9.field154 >= 8.0D) {
                return class554.field7705;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)V", line = 179)
    public static final void method814(byte arg0) {
        if (class448.field6026 != null) {
            for (int var1 = 0; var1 < class448.field6026.length; var1++) {
                for (int var2 = 0; var2 < class448.field6026[var1].length; var2++) {
                    class448.field6026[var1][var2] = class622.field8543;
                }
            }
        }
        if (arg0 != -75) {
            method814((byte) 102);
        }
        field1187++;
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "()V", line = 211)
    public class89() {
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 213)
    public class89(String arg0, int arg1) {
        this.field1185 = arg0;
    }
}
