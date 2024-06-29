import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class77 implements class160 {

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    private int field1137 = 0;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "[Lck;")
    private class452[] field1138 = new class452[9];

    @OriginalMember(owner = "client!fv", name = "y", descriptor = "I")
    private int field1157 = -1;

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "Lod;")
    private class349 field1147;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
    private int field1140;

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "I")
    public static int field1145 = 0;

    @OriginalMember(owner = "client!fv", name = "p", descriptor = "[I")
    public static int[] field1148 = new int[1];

    @OriginalMember(owner = "client!fv", name = "A", descriptor = "[I")
    public static int[] field1159 = new int[32];

    @OriginalMember(owner = "client!fv", name = "t", descriptor = "I")
    public static int field1152 = 0;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "I")
    private int field1144;

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!fv", name = "q", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!fv", name = "r", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!fv", name = "s", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!fv", name = "u", descriptor = "I")
    private int field1153;

    @OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!fv", name = "x", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "I")
    private int field1158;

    @OriginalMember(owner = "client!fv", name = "B", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!fv", name = "C", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!fv", name = "D", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!fv", name = "E", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!fv", name = "v", descriptor = "Lel;")
    public static class382 field1154;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILrc;IZI)V", line = 3)
    private final void method435(int arg0, class374 arg1, int arg2, boolean arg3, int arg4) {
        field1161++;
        if (arg3) {
            return;
        }
        if (this.field1157 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg2;
        if ((~var6 & this.field1158) == 0) {
            this.field1153 = arg1.field5694;
            this.field1144 = arg1.field5694;
        } else if (this.field1153 != arg1.field5694 || this.field1144 != arg1.field5694) {
            throw new RuntimeException();
        }
        arg1.method2296(arg4, arg0, class523.field7748[arg2], this.field1157, -1403048020);
        this.field1138[arg2] = arg1;
        this.field1158 |= var6;
    }

    @OriginalMember(owner = "client!fv", name = "finalize", descriptor = "()V", line = 33)
    protected final void finalize() throws Throwable {
        this.field1147.method2192((byte) -121, this.field1140);
        field1142++;
        super.finalize();
    }

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "(I)V", line = 45)
    public static void method436(int arg0) {
        field1148 = null;
        field1159 = null;
        if (arg0 != -2) {
            method436(31);
        }
        field1154 = null;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IZ)V", line = 59)
    public final void method437(int arg0, boolean arg1) {
        field1139++;
        if (!arg1) {
            this.method445(108, -49);
        }
        if (this.field1157 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class523.field7748[arg0]);
    }

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "(I)V", line = 74)
    public final void method438(int arg0) {
        if (arg0 == 13860) {
            field1135++;
            OpenGL.glBindFramebufferEXT(36160, 0);
            this.field1137 &= 0xFFFFFFFB;
            this.field1157 = this.method443(false);
        }
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)V", line = 87)
    public final void method439(int arg0) {
        field1162++;
        OpenGL.glBindFramebufferEXT(36160, this.field1140);
        this.field1137 |= 0x4;
        if (arg0 != 26300) {
            this.field1140 = -126;
        }
        this.field1157 = this.method443(false);
    }

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "(I)I", line = 104)
    public final int method440(int arg0) {
        if (arg0 != 431) {
            this.field1140 = 102;
        }
        field1160++;
        return this.field1144;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V", line = 117)
    public final void method441(int arg0) {
        field1155++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        if (arg0 == 9921) {
            this.field1137 &= 0xFFFFFFFE;
            this.field1157 = this.method443(false);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILrc;II)V", line = 133)
    public final void method442(int arg0, class374 arg1, int arg2, int arg3) {
        field1134++;
        this.method435(arg2, arg1, arg3, false, arg0);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)I", line = 142)
    private final int method443(boolean arg0) {
        field1150++;
        if (arg0) {
            this.field1157 = -81;
        }
        if ((this.field1137 & 0x4) != 0) {
            return 36160;
        } else if ((this.field1137 & 0x2) == 0) {
            return (this.field1137 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILve;I)V", line = 163)
    public final void method444(int arg0, class347 arg1, int arg2) {
        field1143++;
        if (arg0 < 71) {
            return;
        }
        if (this.field1157 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg2;
        if ((~var4 & this.field1158) == 0) {
            this.field1153 = arg1.field4996;
            this.field1144 = arg1.field4999;
        } else if (this.field1153 != arg1.field4996 || this.field1144 != arg1.field4999) {
            throw new RuntimeException();
        }
        arg1.method2110((byte) -119, this.field1157, class523.field7748[arg2]);
        this.field1138[arg2] = arg1;
        this.field1158 |= var4;
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lod;)V", line = 367)
    public class77(class349 arg0) {
        if (!arg0.field5318) {
            throw new IllegalStateException("");
        }
        this.field1147 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class402.field6055, 0);
        this.field1140 = class402.field6055[0];
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)V", line = 207)
    public final void method445(int arg0, int arg1) {
        if (arg0 < 100) {
            this.method445(-127, -29);
        }
        field1156++;
        if (this.field1157 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class523.field7748[arg1]);
    }

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "(I)Z", line = 223)
    public final boolean method446(int arg0) {
        if (arg0 > -84) {
            return false;
        } else {
            field1149++;
            int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field1157);
            return var2 == 36053;
        }
    }

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "(I)V", line = 247)
    public final void method447(int arg0) {
        field1146++;
        OpenGL.glBindFramebufferEXT(36008, this.field1140);
        if (arg0 != -4087) {
            this.method445(-85, 12);
        }
        this.field1137 |= 0x1;
        this.field1157 = this.method443(false);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lah;IB)V", line = 260)
    public final void method448(class260 arg0, int arg1, byte arg2) {
        this.method449(arg0, 0, arg1, (byte) 119);
        field1141++;
        int var4 = -23 % ((44 - arg2) / 42);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lah;IIB)V", line = 270)
    private final void method449(class260 arg0, int arg1, int arg2, byte arg3) {
        field1136++;
        if (this.field1157 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg2;
        if ((~var5 & this.field1158) == 0) {
            this.field1153 = arg0.field3828;
            this.field1144 = arg0.field3831;
        } else if (this.field1153 != arg0.field3828 || this.field1144 != arg0.field3831) {
            throw new RuntimeException();
        }
        arg0.method1724(class523.field7748[arg2], arg1, this.field1157, (byte) 19);
        this.field1138[arg2] = arg0;
        if (arg3 >= 51) {
            this.field1158 |= var5;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V", line = 305)
    public final void method450(byte arg0) {
        field1151++;
        OpenGL.glBindFramebufferEXT(36009, this.field1140);
        this.field1137 |= 0x2;
        this.field1157 = this.method443(false);
        if (arg0 >= -34) {
            field1159 = null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(II)V", line = 333)
    public final void method451(int arg0, int arg1) {
        field1133++;
        if (arg0 < 6) {
            this.method439(107);
        }
        if (this.field1138[arg1] != null) {
            this.field1138[arg1].method1726(0);
        }
        this.field1158 &= ~(0x1 << arg1);
        this.field1138[arg1] = null;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V", line = 350)
    public final void method452(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        if (arg0 != -15001) {
            this.method451(81, 94);
        }
        field1163++;
        this.field1137 &= 0xFFFFFFFD;
        this.field1157 = this.method443(false);
    }
}
