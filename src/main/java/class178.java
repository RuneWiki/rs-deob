import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class178 {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public int field2184;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public int field2185;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public int field2186;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public int field2188;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public int field2189;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public int field2191;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public int field2192;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public int field2193;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public int field2194;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public int field2196;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public int field2198;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public int field2199;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1111(int arg0) {
        field2195++;
        if (class38.field713 == -1 || class40.field752 == -1) {
            return;
        }
        int var1 = ((class604.field8713 - class204.field2448) * class411.field5848 >> 16) + class204.field2448;
        class411.field5848 += var1;
        if (class411.field5848 < 65535) {
            class655.field9305 = false;
            class580.field8462 = false;
        } else {
            class411.field5848 = 65535;
            if (class580.field8462) {
                class655.field9305 = false;
            } else {
                class655.field9305 = true;
            }
            class580.field8462 = true;
        }
        float var2 = (float) class411.field5848 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class118.field1521 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class420.field5959[class38.field713][var4][var5] * 3;
            int var22 = class420.field5959[class38.field713][var4 + 1][var5] * 3;
            int var23 = (class420.field5959[class38.field713][var4 + 2][var5] + class420.field5959[class38.field713][var4 + 2][var5] - class420.field5959[class38.field713][var4 + 3][var5]) * 3;
            int var24 = class420.field5959[class38.field713][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class420.field5959[class38.field713][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class614.field8846 = (int) var3[1] * -1;
        class346.field4550 = (int) var3[0] - (class36.field689 * 512);
        class627.field8995 = (int) var3[2] - (class88.field1239 * 512);
        float[] var6 = new float[3];
        int var7 = class246.field3381 * arg0;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class420.field5959[class40.field752][var7][var8] * 3;
            int var15 = class420.field5959[class40.field752][var7 + 1][var8] * 3;
            int var16 = (class420.field5959[class40.field752][var7 + 2][var8] + class420.field5959[class40.field752][var7 + 2][var8] - class420.field5959[class40.field752][var7 + 3][var8]) * 3;
            int var17 = class420.field5959[class40.field752][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = var15 + class420.field5959[class40.field752][var7 + 2][var8] - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class569.field8329 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class89.field1250 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class377.field5071 = ((class420.field5959[class38.field713][var4 + 2][3] - class420.field5959[class38.field713][var4][3]) * class411.field5848 >> 16) + class420.field5959[class38.field713][var4][3];
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLdda;[Lav;)Lka;", line = 113)
    public static final class438 method1112(byte arg0, class349 arg1, class591[] arg2) {
        field2197++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg2[var3] == null || arg2[var3].field8562 <= 0L) {
                return null;
            }
        }
        if (arg0 != 40) {
            method1111(116);
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg2.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field8562);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class635.field9111, 0);
        if (class635.field9111[0] == 0) {
            if (class635.field9111[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class635.field9111, 1);
            if (class635.field9111[1] > 1) {
                byte[] var7 = new byte[class635.field9111[1]];
                OpenGL.glGetInfoLogARB(var4, class635.field9111[1], class635.field9111, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class635.field9111[0] == 0) {
                for (int var8 = 0; var8 < arg2.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg2[var8].field8562);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class438(arg1, var4, arg2);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 182)
    public static final boolean method1113(byte arg0, String arg1) {
        field2190++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class700.field9897; var2++) {
            if (arg1.equalsIgnoreCase(class529.field7730[var2])) {
                return true;
            }
        }
        if (arg1.equalsIgnoreCase(class206.field2472.field8801)) {
            return true;
        } else if (arg0 == -82) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V", line = 218)
    public static final void method1114(int arg0, int arg1) {
        field2200++;
        int var2 = class543.field7882 - class528.field7719;
        if (var2 >= 100) {
            class586.field8507 = 1;
            class221.field2860 = -1;
            class51.field842 = -1;
            return;
        }
        int var3 = (int) class393.field5309;
        if ((class499.field6974 >> 8) > var3) {
            var3 = class499.field6974 >> 8;
        }
        if (class25.field587[4] && var3 < class236.field3183[4] + 128) {
            var3 = class236.field3183[4] + 128;
        }
        int var4 = (int) class115.field1495 + class177.field2180 & 0x3FFF;
        class375.method2179(arg1, class622.field8905, var3, class281.field3814, var4, (var3 >> 3) * arg0 + 600 << 2, class589.method3416(class206.field2472.field530, -68, class617.field8853, class206.field2472.field531) - 200, -29441);
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class614.field8846 = (int) ((float) (class614.field8846 - class377.field5058) * var5 + (float) class377.field5058);
        class627.field8995 = (int) ((float) (class627.field8995 - class500.field6997) * var5 + (float) class500.field6997);
        class346.field4550 = (int) ((float) (class346.field4550 - class25.field582) * var5 + (float) class25.field582);
        class569.field8329 = (int) ((float) (class569.field8329 - class196.field2372) * var5 + (float) class196.field2372);
        int var6 = class89.field1250 - class227.field2938;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class89.field1250 = (int) ((float) var6 * var5 + (float) class227.field2938);
        class89.field1250 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lvb;B)Z", line = 264)
    public final boolean method1115(class178 arg0, byte arg1) {
        if (arg1 == -99) {
            field2187++;
            return this.field2196 == arg0.field2196 && this.field2188 == arg0.field2188 && this.field2198 == arg0.field2198;
        } else {
            return false;
        }
    }
}
