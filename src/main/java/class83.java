import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public abstract class class83 extends class338 {

    @OriginalMember(owner = "client!mr", name = "J", descriptor = "[Lmr;")
    public class83[] field930;

    @OriginalMember(owner = "client!mr", name = "D", descriptor = "Z")
    public boolean field924;

    @OriginalMember(owner = "client!mr", name = "F", descriptor = "Z")
    public static boolean field926 = false;

    @OriginalMember(owner = "client!mr", name = "H", descriptor = "Ljava/lang/String;")
    public static String field928 = "Ok";

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "Lph;")
    public static class114 field912 = new class114(50);

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!mr", name = "s", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!mr", name = "t", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!mr", name = "u", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!mr", name = "w", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!mr", name = "x", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!mr", name = "y", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!mr", name = "z", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!mr", name = "A", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!mr", name = "B", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!mr", name = "C", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!mr", name = "E", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!mr", name = "I", descriptor = "Lam;")
    public static class286 field929;

    @OriginalMember(owner = "client!mr", name = "G", descriptor = "Lpr;")
    public class300 field927;

    @OriginalMember(owner = "client!mr", name = "v", descriptor = "Lvc;")
    public class308 field916;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)I", line = 10)
    public int method117(byte arg0) {
        field923++;
        if (arg0 != 25) {
            this.method451(24, -57, -90);
        }
        return -1;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)[I", line = 21)
    public int[] method37(int arg0, int arg1) {
        if (arg0 != 2) {
            this.method120(false);
        }
        field925++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)V", line = 36)
    public void method116(int arg0, int arg1, int arg2) {
        field913++;
        int var4 = this.field919 == 255 ? arg1 : this.field919;
        int var5 = 22 / ((72 - arg2) / 37);
        if (this.field924) {
            this.field916 = new class308(var4, arg1, arg0);
        } else {
            this.field927 = new class300(var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)I", line = 59)
    public int method159(boolean arg0) {
        field907++;
        if (!arg0) {
            field928 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZI)[[I", line = 74)
    public int[][] method21(boolean arg0, int arg1) {
        field918++;
        if (!arg0) {
            this.method451(-45, 72, -10);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IZI)[[I", line = 85)
    public final int[][] method449(int arg0, boolean arg1, int arg2) {
        field908++;
        if (!arg1) {
            this.field930 = null;
        }
        if (this.field930[arg0].field924) {
            int[] var4 = this.field930[arg0].method37(2, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field930[arg0].method21(arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(II)Ljava/lang/String;", line = 117)
    public static final String method450(int arg0, int arg1) {
        field920++;
        int var2 = -55 / ((arg1 - 16) / 40);
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + ((arg0 & 0xFFEF) >> 8) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(III)[I", line = 129)
    public final int[] method451(int arg0, int arg1, int arg2) {
        if (arg1 <= 73) {
            return null;
        } else {
            field909++;
            return this.field930[arg0].field924 ? this.field930[arg0].method37(2, arg2) : this.field930[arg0].method21(true, arg2)[0];
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IBLtq;)V", line = 154)
    public void method35(int arg0, byte arg1, class250 arg2) {
        int var4 = -37 % ((-arg1 - 27) / 50);
        field911++;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lii;I)Ljava/lang/String;", line = 174)
    public static final String method452(class405 arg0, int arg1) {
        field917++;
        if (arg1 != 14963) {
            field912 = null;
        }
        return arg0.field5899 == null || arg0.field5899.length() <= 0 ? arg0.field5896 : arg0.field5896 + class51.field489 + arg0.field5899;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V", line = 191)
    public static void method453(byte arg0) {
        field912 = null;
        field929 = null;
        if (arg0 > 16) {
            field928 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(B)V", line = 211)
    public void method114(byte arg0) {
        field921++;
        if (this.field924) {
            this.field916.method1812(0);
            this.field916 = null;
        } else {
            this.field927.method1775((byte) -57);
            this.field927 = null;
        }
        if (arg0 <= 95) {
            method455(-44, -43, -53);
        }
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(II)I", line = 236)
    public static final int method454(int arg0, int arg1) {
        field915++;
        return arg1 == -8146 ? arg0 >> 11 & 0x7F : 78;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(Z)V", line = 248)
    public void method120(boolean arg0) {
        if (arg0) {
            this.field930 = null;
        }
        field914++;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(IZ)V", line = 260)
    public class83(int arg0, boolean arg1) {
        this.field930 = new class83[arg0];
        this.field924 = arg1;
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(III)V", line = 277)
    public static final void method455(int arg0, int arg1, int arg2) {
        int var3 = class160.field2062 * arg2 >> 8;
        if (arg0 <= 73) {
            field929 = null;
        }
        field922++;
        if (arg1 == -1 && !class41.field431) {
            class222.method1199(-1);
        } else if (arg1 != -1 && (class200.field2668 != arg1 || !class319.method1841(125)) && var3 != 0 && !class41.field431) {
            class440.method2724(2, false, class283.field3875, false, 0, var3, arg1);
        }
        class200.field2668 = arg1;
    }
}
