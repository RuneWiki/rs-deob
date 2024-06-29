import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class82 implements class387 {

    @OriginalMember(owner = "client!gea", name = "j", descriptor = "I")
    private int field1140 = -1;

    @OriginalMember(owner = "client!gea", name = "o", descriptor = "I")
    private int field1145 = 0;

    @OriginalMember(owner = "client!gea", name = "E", descriptor = "[Ljga;")
    private class745[] field1161 = new class745[9];

    @OriginalMember(owner = "client!gea", name = "C", descriptor = "Llf;")
    private class250 field1159;

    @OriginalMember(owner = "client!gea", name = "B", descriptor = "I")
    private int field1158;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "I")
    private int field1134;

    @OriginalMember(owner = "client!gea", name = "f", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!gea", name = "g", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!gea", name = "h", descriptor = "I")
    private int field1138;

    @OriginalMember(owner = "client!gea", name = "k", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!gea", name = "l", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!gea", name = "m", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!gea", name = "p", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!gea", name = "q", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!gea", name = "r", descriptor = "I")
    private int field1148;

    @OriginalMember(owner = "client!gea", name = "s", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!gea", name = "t", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!gea", name = "u", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!gea", name = "v", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!gea", name = "w", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!gea", name = "x", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!gea", name = "y", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!gea", name = "z", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!gea", name = "A", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!gea", name = "D", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!gea", name = "i", descriptor = "Luq;")
    public static class172 field1139;

    @OriginalMember(owner = "client!gea", name = "n", descriptor = "Lk;")
    public static class591 field1144;

    @OriginalMember(owner = "client!gea", name = "e", descriptor = "[Lika;")
    public static class447[] field1135;

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(B)V", line = 4)
    public static void method652(byte arg0) {
        field1135 = null;
        field1139 = null;
        field1144 = null;
        if (arg0 != 38) {
            method665(false, (char) 65422, null);
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)V", line = 16)
    public final void method653(int arg0) {
        field1151++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        int var2 = 70 % ((arg0 - 73) / 49);
        this.field1145 &= 0xFFFFFFFB;
        this.field1140 = this.method660((byte) -59);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(BI)V", line = 30)
    public static final void method654(byte arg0, int arg1) {
        field1137++;
        class778 var2 = class389.method2406(80, (long) arg1, 12);
        if (arg0 != -71) {
            method665(true, '\u0006', null);
        }
        var2.method4276(0);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IILrba;)V", line = 43)
    public final void method655(int arg0, int arg1, class456 arg2) {
        if (arg0 <= 26) {
            this.field1158 = -58;
        }
        field1154++;
        this.method663(0, (byte) -117, arg1, arg2);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Liv;IIII)V", line = 56)
    private final void method656(class107 arg0, int arg1, int arg2, int arg3, int arg4) {
        field1149++;
        if (this.field1140 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg2;
        if (arg3 != -7106) {
            this.method659(114, 21);
        }
        if ((this.field1138 & ~var6) == 0) {
            this.field1148 = arg0.field1502;
            this.field1134 = arg0.field1502;
        } else if (this.field1148 != arg0.field1502 || this.field1134 != arg0.field1502) {
            throw new RuntimeException();
        }
        arg0.method803(arg3 + 7218, class573.field7823[arg2], this.field1140, arg1, arg4);
        this.field1161[arg2] = arg0;
        this.field1138 |= var6;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(B)V", line = 89)
    public final void method657(byte arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        field1132++;
        if (arg0 != -45) {
            this.method663(94, (byte) -110, -67, null);
        }
        this.field1145 &= 0xFFFFFFFE;
        this.field1140 = this.method660((byte) -59);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Liv;BII)V", line = 104)
    public final void method658(class107 arg0, byte arg1, int arg2, int arg3) {
        field1136++;
        this.method656(arg0, arg3, arg2, -7106, 0);
        if (arg1 != -78) {
            this.method662(true);
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(II)V", line = 116)
    public final void method659(int arg0, int arg1) {
        field1157++;
        if (this.field1140 == -1) {
            throw new RuntimeException();
        }
        if (arg1 != -17) {
            this.method659(46, 28);
        }
        OpenGL.glReadBuffer(class573.field7823[arg0]);
    }

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "(B)I", line = 132)
    private final int method660(byte arg0) {
        field1147++;
        if ((this.field1145 & 0x4) != 0) {
            return 36160;
        }
        if (arg0 != -59) {
            field1144 = null;
        }
        if ((this.field1145 & 0x2) == 0) {
            return (this.field1145 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!gea", name = "finalize", descriptor = "()V", line = 152)
    protected final void finalize() throws Throwable {
        this.field1159.method1569(127, this.field1158);
        field1141++;
        super.finalize();
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(BI)V", line = 161)
    public final void method661(byte arg0, int arg1) {
        field1146++;
        if (this.field1161[arg1] != null) {
            this.field1161[arg1].method804(0);
        }
        this.field1138 &= ~(0x1 << arg1);
        if (arg0 != 12) {
            this.field1134 = -89;
        }
        this.field1161[arg1] = null;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Z)V", line = 180)
    public final void method662(boolean arg0) {
        field1152++;
        OpenGL.glBindFramebufferEXT(36160, this.field1158);
        if (arg0) {
            this.field1148 = -113;
        }
        this.field1145 |= 0x4;
        this.field1140 = this.method660((byte) -59);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IBILrba;)V", line = 193)
    private final void method663(int arg0, byte arg1, int arg2, class456 arg3) {
        field1142++;
        if (this.field1140 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg2;
        if ((~var5 & this.field1138) == 0) {
            this.field1148 = arg3.field6523;
            this.field1134 = arg3.field6528;
        } else if (this.field1148 != arg3.field6523 || this.field1134 != arg3.field6528) {
            throw new RuntimeException();
        }
        arg3.method2706(arg0, class573.field7823[arg2], this.field1140, true);
        if (arg1 == -117) {
            this.field1161[arg2] = arg3;
            this.field1138 |= var5;
        }
    }

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "(Z)V", line = 225)
    public final void method664(boolean arg0) {
        field1131++;
        OpenGL.glBindFramebufferEXT(36009, this.field1158);
        this.field1145 |= 0x2;
        this.field1140 = this.method660((byte) -59);
        if (arg0) {
            field1144 = null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZCLjava/lang/String;)I", line = 242)
    public static final int method665(boolean arg0, char arg1, String arg2) {
        field1155++;
        int var3 = 0;
        int var4 = arg2.length();
        int var5 = 0;
        if (arg0) {
            return 20;
        }
        while (var4 > var5) {
            if (arg2.charAt(var5) == arg1) {
                var3++;
            }
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(Z)V", line = 269)
    public final void method666(boolean arg0) {
        field1153++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field1145 &= 0xFFFFFFFD;
        if (arg0) {
            method652((byte) -7);
        }
        this.field1140 = this.method660((byte) -59);
    }

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Llf;)V", line = 385)
    public class82(class250 arg0) {
        if (!arg0.field3652) {
            throw new IllegalStateException("");
        }
        this.field1159 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class363.field5252, 0);
        this.field1158 = class363.field5252[0];
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Ldf;II)V", line = 287)
    public final void method667(class420 arg0, int arg1, int arg2) {
        field1156++;
        if (arg2 != 16070) {
            this.field1158 = -29;
        }
        if (this.field1140 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg1;
        if ((~var4 & this.field1138) == 0) {
            this.field1134 = arg0.field6044;
            this.field1148 = arg0.field6047;
        } else if (this.field1148 != arg0.field6047 || this.field1134 != arg0.field6044) {
            throw new RuntimeException();
        }
        arg0.method2525(-105, class573.field7823[arg1], this.field1140);
        this.field1161[arg1] = arg0;
        this.field1138 |= var4;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V", line = 318)
    public final void method668(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field1158);
        field1150++;
        this.field1145 |= 0x1;
        if (arg0 == 682) {
            this.field1140 = this.method660((byte) -59);
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZI)V", line = 334)
    public final void method669(boolean arg0, int arg1) {
        field1133++;
        if (this.field1140 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class573.field7823[arg1]);
        if (!arg0) {
            this.method664(true);
        }
    }

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "(Z)Z", line = 362)
    public final boolean method670(boolean arg0) {
        field1143++;
        if (!arg0) {
            this.method670(false);
        }
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field1140);
        return var2 == 36053;
    }
}
