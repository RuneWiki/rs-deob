import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class145 extends class405 {

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "Z")
    public boolean field2165 = true;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "Ldp;")
    public static class347 field2174 = new class347("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "[Lwg;")
    public static class41[] field2179 = new class41[14];

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "Ldp;")
    public static class347 field2180 = new class347(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "[I")
    public static int[] field2184 = new int[32];

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "Ljo;")
    public static class382 field2185 = new class382(8);

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "Lqh;")
    public class231 field2169;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "[I")
    public int[] field2162;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "[I")
    private int[] field2173;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "[Ljava/lang/String;")
    private String[] field2183;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "[[I")
    private int[][] field2178;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)V")
    public static void method1045(byte arg0) {
        field2179 = null;
        if (arg0 != 75) {
            field2184 = null;
        }
        field2184 = null;
        field2180 = null;
        field2185 = null;
        field2174 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILgk;I)V")
    private final void method1046(int arg0, class468 arg1, int arg2) {
        int var4 = 29 % (-arg0 / 56);
        if (arg2 == 1) {
            this.field2183 = class167.method1164(arg1.method2770(-20459), (byte) 73, '<');
        } else if (arg2 == 2) {
            int var10 = arg1.method2765(100);
            this.field2162 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field2162[var11] = arg1.method2727((byte) 43);
            }
        } else if (arg2 == 3) {
            int var5 = arg1.method2765(71);
            this.field2173 = new int[var5];
            this.field2178 = new int[var5][];
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg1.method2727((byte) 43);
                class437 var8 = class269.method1675(var7, 381);
                if (var8 != null) {
                    this.field2173[var6] = var7;
                    this.field2178[var6] = new int[var8.field6438];
                    for (int var9 = 0; var9 < var8.field6438; var9++) {
                        this.field2178[var6][var9] = arg1.method2727((byte) 43);
                    }
                }
            }
        } else if (arg2 == 4) {
            this.field2165 = false;
        }
        field2168++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static final void method1047(int arg0) {
        field2171++;
        if (arg0 >= 15) {
            class452.field6647.method2293(false);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)Z")
    public static final boolean method1048(int arg0, int arg1, int arg2) {
        field2175++;
        if ((class191.method1275(arg2, -545, arg1) | (arg2 & 0x10000) != 0) || class120.method903(arg1, -8382, arg2)) {
            return true;
        } else if (arg0 > -70) {
            return true;
        } else {
            return (arg1 & 0x37) == 0 && class242.method1474(arg2, -106, arg1);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lgk;I)Ljava/lang/String;")
    public final String method1049(class468 arg0, int arg1) {
        field2164++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field2173 != null) {
            for (int var4 = 0; var4 < this.field2173.length; var4++) {
                var3.append(this.field2183[var4]);
                var3.append(this.field2169.method1436(arg0.method2728(false, class269.method1675(this.field2173[var4], 381).field6444), (byte) -29, this.method1055(var4, arg1 + 20849), this.field2178[var4]));
            }
        }
        if (arg1 == 11866) {
            var3.append(this.field2183[this.field2183.length - 1]);
            return var3.toString();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(B)Ljava/lang/String;")
    public final String method1050(byte arg0) {
        field2167++;
        StringBuffer var2 = new StringBuffer(80);
        if (arg0 != -23) {
            this.method1050((byte) -18);
        }
        if (this.field2183 == null) {
            return "";
        }
        var2.append(this.field2183[0]);
        for (int var3 = 1; var3 < this.field2183.length; var3++) {
            var2.append("...");
            var2.append(this.field2183[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)I")
    public final int method1051(int arg0) {
        if (arg0 < 78) {
            return 34;
        } else {
            field2166++;
            return this.field2173 == null ? 0 : this.field2173.length;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lsr;I)V")
    public static final void method1052(class351 arg0, int arg1) {
        field2163++;
        if (arg1 != 0) {
            return;
        }
        for (class203 var2 = (class203) class150.field2286.method2957(arg1 - 89); var2 != null; var2 = (class203) class150.field2286.method2947(-71)) {
            if (var2.field2950 == arg0) {
                if (var2.field2959 != null) {
                    class176.field2598.method2372(var2.field2959);
                    var2.field2959 = null;
                }
                var2.method876((byte) -96);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(B)V")
    public final void method1053(byte arg0) {
        if (arg0 != -84) {
            this.method1051(122);
        }
        field2176++;
        if (this.field2162 != null) {
            for (int var2 = 0; var2 < this.field2162.length; var2++) {
                this.field2162[var2] = class390.method2340(this.field2162[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z[ILgk;)V")
    public final void method1054(boolean arg0, int[] arg1, class468 arg2) {
        if (arg0) {
            return;
        }
        field2161++;
        if (this.field2173 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field2173.length; var4++) {
            if (arg1.length <= var4) {
                return;
            }
            int var5 = this.method1055(var4, 32715).field6445;
            if (var5 > 0) {
                arg2.method2763(var5, (long) arg1[var4], arg0);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)Lfp;")
    public final class437 method1055(int arg0, int arg1) {
        if (arg1 == 32715) {
            field2172++;
            return this.field2173 == null || arg0 < 0 || this.field2173.length < arg0 ? null : class269.method1675(this.field2173[arg0], 381);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([Lrv;Lvd;Z)Lij;")
    public static final class467 method1056(class224[] arg0, class258 arg1, boolean arg2) {
        field2160++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field3165 <= 0L) {
                return null;
            }
        }
        if (!arg2) {
            field2180 = null;
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field3165);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class272.field4056, 0);
        if (class272.field4056[0] == 0) {
            if (class272.field4056[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class272.field4056, 1);
            if (class272.field4056[1] > 1) {
                byte[] var7 = new byte[class272.field4056[1]];
                OpenGL.glGetInfoLogARB(var4, class272.field4056[1], class272.field4056, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class272.field4056[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field3165);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class467(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Lgk;I)V")
    public final void method1057(class468 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2765(127);
            if (var3 == 0) {
                field2182++;
                if (arg1 != -504) {
                    field2186 = 102;
                    return;
                }
                return;
            }
            this.method1046(-78, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIB)I")
    public final int method1058(int arg0, int arg1, byte arg2) {
        field2177++;
        if (this.field2173 == null || arg1 < 0 || this.field2173.length < arg1) {
            return -1;
        } else if (arg2 < 54) {
            return -112;
        } else if (this.field2178[arg1] == null || arg0 < 0 || arg0 > this.field2178[arg1].length) {
            return -1;
        } else {
            return this.field2178[arg1][arg0];
        }
    }
}
