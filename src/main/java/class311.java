import jagex3.jagmisc.jagmisc;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class311 extends class139 {

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    private int field4878 = 0;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    private int field4875 = 0;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Z")
    private boolean field4871 = false;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
    private int field4891 = 0;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    private int field4876 = 0;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    private int field4881 = 0;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "Lna;")
    private class211 field4892;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Lme;")
    private class508 field4872;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Lbi;")
    public static class104 field4870 = new class104(86, 7);

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "Lme;")
    private class508 field4886;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "[[[J")
    public static long[][][] field4882;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)V")
    private final void method2089(int arg0, int arg1) {
        field4880++;
        this.field4892.method1507(1, 0);
        this.field4892.method1540(arg0 + 112, this.field4872);
        this.field4892.method1568(7681, 2896, this.field4892.method1534(arg1, (byte) 120));
        this.field4892.method1498(34192, 1, 34167, 768);
        this.field4892.method1539(arg0, 34168, 770, (byte) 127);
        this.field4892.method1507(0, 0);
        this.field4892.method1540(75, this.field4886);
        this.field4892.method1568(7681, 2896, 34479);
        this.field4892.method1498(34192, 1, 34166, 768);
        if (this.field4875 == 0) {
            this.field4892.method1573(0.5F, 1.0F, 0.5F, arg0 ^ 0xFFFFFF98, 0.0F);
        } else if (this.field4875 == 1) {
            this.field4892.method1573(0.5F, 0.5F, 1.0F, -110, 0.0F);
            return;
        } else if (this.field4875 == 2) {
            this.field4892.method1573(1.0F, 0.5F, 0.5F, 90, 0.0F);
            return;
        } else if (this.field4875 == 3) {
            this.field4892.method1573(128.5F, 128.5F, 128.5F, arg0 ^ 0xFFFFFF82, 0.0F);
            return;
        }
    }

    @OriginalMember(owner = "client!mf", name = "la", descriptor = "(IIIIIII)V")
    public final void method619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4897++;
        int var8 = arg0 + arg2;
        this.field4872.method2703(0, false);
        int var9 = arg1 + arg3;
        this.field4892.method1529(34166);
        this.field4892.method1540(39, this.field4872);
        this.field4892.method1566((byte) 95, arg6);
        this.field4892.method1494(arg4, -25951);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field4872.field7573 && !this.field4871) {
            float var10 = (float) arg3 * this.field4872.field7580 / (float) this.field4872.field7581;
            float var11 = (float) arg2 * this.field4872.field7578 / (float) this.field4872.field7575;
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, var10);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, var9);
            OpenGL.glTexCoord2f(var11, 0.0F);
            OpenGL.glVertex2i(var8, var9);
            OpenGL.glTexCoord2f(var11, var10);
            OpenGL.glVertex2i(var8, arg1);
            OpenGL.glEnd();
            return;
        }
        OpenGL.glPushMatrix();
        OpenGL.glTranslatef((float) this.field4891, (float) this.field4881, 0.0F);
        int var12 = this.method623();
        int var13 = this.method618();
        int var14 = this.field4872.field7581 + arg1;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field4872.field7575 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field4872.field7580);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field4872.field7578, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field4872.field7578, this.field4872.field7580);
                OpenGL.glVertex2i(var20, var15);
                var20 += var12;
                var21 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field4872.field7578 / (float) this.field4872.field7575;
                OpenGL.glTexCoord2f(0.0F, this.field4872.field7580);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field4872.field7580);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (this.field4872.field7581 + var15 - var9) * this.field4872.field7580 / (float) this.field4872.field7581;
            int var17 = this.field4872.field7575 + arg0;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field4872.field7580);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field4872.field7578, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field4872.field7578, this.field4872.field7580);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var18 < var8) {
                float var19 = (float) (var8 - var18) * this.field4872.field7578 / (float) this.field4872.field7575;
                OpenGL.glTexCoord2f(0.0F, this.field4872.field7580);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field4872.field7580);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!mf", name = "ha", descriptor = "(IIII)V")
    public final void method627(int arg0, int arg1, int arg2, int arg3) {
        this.field4881 = arg1;
        this.field4891 = arg0;
        this.field4878 = arg3;
        field4894++;
        this.field4876 = arg2;
        this.field4871 = this.field4891 != 0 || this.field4881 != 0 || this.field4876 != 0 || this.field4878 != 0;
    }

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "(FFFFFFIII)V")
    public final void method621(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field4890++;
        if (this.field4871) {
            float var10 = (float) this.method623();
            float var11 = (float) this.method618();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field4881 * var14;
            float var17 = (float) this.field4881 * var15;
            float var18 = (float) this.field4891 * var12;
            float var19 = (float) this.field4891 * var13;
            float var20 = (float) this.field4876 * -var12;
            float var21 = (float) this.field4876 * -var13;
            float var22 = (float) this.field4878 * -var14;
            arg4 = arg4 + var18 + var22;
            arg2 = arg2 + var20 + var16;
            float var23 = (float) this.field4878 * -var15;
            arg3 = arg3 + var21 + var17;
            arg1 = arg1 + var19 + var17;
            arg0 = arg0 + var18 + var16;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        this.field4872.method2703(0, true);
        float var25 = arg5 + arg3 - arg1;
        this.field4892.method1529(34166);
        this.field4892.method1540(83, this.field4872);
        this.field4892.method1566((byte) 95, arg8);
        this.field4892.method1494(arg6, -25951);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field4872.field7580);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field4872.field7578, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field4872.field7578, this.field4872.field7580);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
    public static void method2090(boolean arg0) {
        field4882 = null;
        field4870 = null;
        if (arg0) {
            method2093(false, -35, -65, 122, null);
        }
    }

    @OriginalMember(owner = "client!mf", name = "ya", descriptor = "(IIIIIII)V")
    public final void method630(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4883++;
        this.field4872.method2703(0, true);
        this.field4892.method1529(34166);
        this.field4892.method1566((byte) 95, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field4871) {
            float var8 = (float) arg2 / (float) this.method623();
            float var9 = (float) arg3 / (float) this.method618();
            float var10 = (float) this.field4891 * var8 + (float) arg0;
            float var11 = (float) this.field4881 * var9 + (float) arg1;
            float var12 = (float) this.field4872.field7575 * var8 + var10;
            float var13 = (float) this.field4872.field7581 * var9 + var11;
            if (this.field4886 == null) {
                this.field4892.method1540(53, this.field4872);
                this.field4892.method1494(arg4, -25951);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field4872.field7580);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field4872.field7578, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field4872.field7578, this.field4872.field7580);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method2089(0, arg4);
                this.field4886.method2703(0, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4872.field7580);
                OpenGL.glTexCoord2f(0.0F, this.field4872.field7580);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field4872.field7578, 0.0F);
                OpenGL.glTexCoord2f(this.field4872.field7578, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field4872.field7578, this.field4872.field7580);
                OpenGL.glTexCoord2f(this.field4872.field7578, this.field4872.field7580);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method2092(-101);
            }
        } else if (this.field4886 == null) {
            this.field4892.method1540(94, this.field4872);
            this.field4892.method1494(arg4, -25951);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field4872.field7580);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field4872.field7578, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field4872.field7578, this.field4872.field7580);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method2089(0, arg4);
            this.field4886.method2703(0, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4872.field7580);
            OpenGL.glTexCoord2f(0.0F, this.field4872.field7580);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field4872.field7578, 0.0F);
            OpenGL.glTexCoord2f(this.field4872.field7578, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field4872.field7578, this.field4872.field7580);
            OpenGL.glTexCoord2f(this.field4872.field7578, this.field4872.field7580);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2092(-101);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILjava/lang/String;ZZ)V")
    public static final void method2091(int arg0, String arg1, boolean arg2, boolean arg3) {
        if (arg0 != -17516) {
            return;
        }
        field4893++;
        if (class209.field3228 == class181.field2626 && class439.field6815 < 2) {
            return;
        }
        if (arg1.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        if (arg1.equals("nativememerror")) {
            throw new OutOfMemoryError("native(MPR");
        }
        try {
            if (arg1.equalsIgnoreCase("fpson")) {
                class150.field2014 = true;
                class142.method857((byte) 95, "fps debug enabled");
                return;
            }
            if (arg1.equalsIgnoreCase("fpsoff")) {
                class150.field2014 = false;
                class142.method857((byte) 95, "fps debug disabled");
                return;
            }
            if (arg1.equals("systemmem")) {
                try {
                    class142.method857((byte) 95, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
                    return;
                } catch (Throwable var27) {
                    return;
                }
            }
            if (arg1.equalsIgnoreCase("cls")) {
                class274.field4352 = 0;
                class294.field4642 = 0;
                return;
            }
            if (arg1.equalsIgnoreCase("cleartext")) {
                class479.field7319.method2618(-9974);
                class142.method857((byte) 95, "Text coords cleared");
                return;
            }
            if (arg1.equalsIgnoreCase("gc")) {
                class15.method84(0);
                for (int var4 = 0; var4 < 10; var4++) {
                    System.gc();
                }
                Runtime var5 = Runtime.getRuntime();
                int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                class142.method857((byte) 95, "mem=" + var6 + "k");
                return;
            }
            if (arg1.equalsIgnoreCase("compact")) {
                class15.method84(0);
                for (int var7 = 0; var7 < 10; var7++) {
                    System.gc();
                }
                Runtime var8 = Runtime.getRuntime();
                int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class142.method857((byte) 95, "Memory before cleanup=" + var9 + "k");
                class317.method2121(arg0 ^ 0x440B);
                class15.method84(0);
                for (int var10 = 0; var10 < 10; var10++) {
                    System.gc();
                }
                int var11 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class142.method857((byte) 95, "Memory after cleanup=" + var11 + "k");
                return;
            }
            if (arg1.equalsIgnoreCase("pcachesize")) {
                class142.method857((byte) 95, "Number of player models in cache:" + class138.method843(arg0 ^ 0xFFFFBBBB));
                return;
            }
            if (arg1.equalsIgnoreCase("clientdrop")) {
                class142.method857((byte) 95, "Dropped client connection");
                if (class148.field1994 == 9) {
                    class519.method3112(-15537);
                } else if (class148.field1994 == 10) {
                    class386.field5901 = true;
                    return;
                }
                return;
            }
            if (arg1.equalsIgnoreCase("clientjs5drop")) {
                class104.field1525.method1393(arg0 + 23959);
                class142.method857((byte) 95, "Dropped client js5 net queue");
                return;
            }
            if (arg1.equalsIgnoreCase("serverjs5drop")) {
                class104.field1525.method1399(false);
                class142.method857((byte) 95, "Dropped server js5 net queue");
                return;
            }
            if (arg1.equalsIgnoreCase("breakcon")) {
                class339.field5294.method6(false);
                class338.field5281.method1897((byte) -126);
                class104.field1525.method1394(-82);
                class142.method857((byte) 95, "Breaking new connections for 5 seconds");
                return;
            }
            if (arg1.equalsIgnoreCase("rebuild")) {
                class207.method1415(114);
                class187.method1172(true);
                class142.method857((byte) 95, "Rebuilding map");
                return;
            }
            if (arg1.equalsIgnoreCase("wm1")) {
                class320.method2142(false, -1, -1, 1, arg0 + 17512);
                if (class5.method47(arg0 ^ 0x43530078) == 1) {
                    class142.method857((byte) 95, "wm1 succeeded");
                    return;
                }
                class142.method857((byte) 95, "wm1 failed");
                return;
            }
            if (arg1.equalsIgnoreCase("wm2")) {
                class320.method2142(false, -1, -1, 2, -4);
                if (class5.method47(-1129530388) != 2) {
                    class142.method857((byte) 95, "wm2 failed");
                    return;
                }
                class142.method857((byte) 95, "wm2 succeeded");
                return;
            }
            if (arg1.equalsIgnoreCase("wm3")) {
                class320.method2142(false, 768, 1024, 3, arg0 + 17512);
                if (class5.method47(arg0 ^ 0x43530078) == 3) {
                    class142.method857((byte) 95, "wm3 succeeded");
                    return;
                }
                class142.method857((byte) 95, "wm3 failed");
                return;
            }
            if (arg1.equalsIgnoreCase("tk0")) {
                class196.method1341(0, 6670);
                if (class452.field7013 != 0) {
                    class142.method857((byte) 95, "Failed to enter tk0");
                    return;
                }
                class142.method857((byte) 95, "Entered tk0");
                class141.field1911.field6083 = 0;
                class141.field1911.method1638(arg0 + 50265, class339.field5294);
                class256.field4144 = false;
                return;
            }
            if (arg1.equalsIgnoreCase("tk1")) {
                class196.method1341(1, 6670);
                if (class452.field7013 == 1) {
                    class142.method857((byte) 95, "Entered tk1");
                    class141.field1911.field6083 = 1;
                    class141.field1911.method1638(32749, class339.field5294);
                    class256.field4144 = false;
                    return;
                }
                class142.method857((byte) 95, "Failed to enter tk1");
                return;
            }
            if (arg1.equalsIgnoreCase("tk2")) {
                class196.method1341(2, arg0 ^ 0xFFFFA19A);
                if (class452.field7013 != 2) {
                    class142.method857((byte) 95, "Failed to enter tk2");
                    return;
                }
                class142.method857((byte) 95, "Entered tk2");
                class141.field1911.field6083 = 2;
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                return;
            }
            if (arg1.equalsIgnoreCase("tk3")) {
                class196.method1341(3, 6670);
                if (class452.field7013 == 3) {
                    class142.method857((byte) 95, "Entered tk3");
                    return;
                }
                class142.method857((byte) 95, "Failed to enter tk3");
                return;
            }
            if (arg1.equalsIgnoreCase("ot")) {
                class141.field1911.field6096 = !class141.field1911.field6096;
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                class207.method1415(122);
                class142.method857((byte) 95, "ot=" + class141.field1911.field6096);
                return;
            }
            if (arg1.equalsIgnoreCase("gb")) {
                class141.field1911.field6106 = !class141.field1911.field6106;
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                class207.method1415(50);
                class142.method857((byte) 95, "gb=" + class141.field1911.field6106);
                return;
            }
            if (arg1.startsWith("shadows")) {
                if (arg1.length() < 8) {
                    class142.method857((byte) 95, "Invalid shadows value");
                    return;
                }
                String var12 = arg1.substring(8);
                int var13 = class471.method2929(true, var12) ? class170.method1078(-117, var12) : -1;
                if (var13 >= 0 && var13 <= 2) {
                    class141.field1911.method2602(class452.field7013, var13, arg0 - 8271);
                    class141.field1911.method1638(arg0 + 50265, class339.field5294);
                    class256.field4144 = false;
                    class207.method1415(76);
                    class142.method857((byte) 95, "shadows=" + var13);
                    return;
                }
                class142.method857((byte) 95, "Invalid shadows value");
                return;
            }
            if (arg1.startsWith("textures")) {
                class141.field1911.field6099 = !class141.field1911.field6099;
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                class497.method3041(1889);
                class207.method1415(arg0 ^ 0xFFFFBBE8);
                class142.method857((byte) 95, "textures=" + class141.field1911.field6099);
                return;
            }
            if (arg1.startsWith("setba")) {
                if (arg1.length() < 6) {
                    class142.method857((byte) 95, "Invalid buildarea value");
                    return;
                }
                int var14 = class170.method1078(arg0 + 17396, arg1.substring(6));
                if (var14 >= 0 && var14 <= class317.method2118(false, class491.field7438)) {
                    class141.field1911.field6095 = var14;
                    class141.field1911.method1638(32749, class339.field5294);
                    class256.field4144 = false;
                    class142.method857((byte) 95, "maxbuildarea=" + class141.field1911.field6095);
                    return;
                }
                class142.method857((byte) 95, "Invalid buildarea value");
                return;
            }
            if (arg1.startsWith("setparticles")) {
                if (arg1.length() < 13) {
                    class142.method857((byte) 95, "Invalid particles value");
                    return;
                }
                class319.method2135(class170.method1078(-88, arg1.substring(13)), (byte) -117);
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                class142.method857((byte) 95, "particles=" + class241.method1680(11));
                return;
            }
            if (arg1.startsWith("rect_debug")) {
                if (arg1.length() < 10) {
                    class142.method857((byte) 95, "Invalid rect_debug value");
                    return;
                }
                class64.field1005 = class170.method1078(-107, arg1.substring(10).trim());
                class142.method857((byte) 95, "rect_debug=" + class64.field1005);
                return;
            }
            if (arg1.equalsIgnoreCase("qa_op_test")) {
                class223.field3757 = true;
                class142.method857((byte) 95, "qa_op_test=" + class223.field3757);
                return;
            }
            if (arg1.equalsIgnoreCase("clipcomponents")) {
                class421.field6387 = !class421.field6387;
                class142.method857((byte) 95, "clipcomponents=" + class421.field6387);
                return;
            }
            if (arg1.startsWith("bloom")) {
                boolean var15 = class19.field198.method1239();
                if (!class295.method1984(!var15, (byte) 22)) {
                    class142.method857((byte) 95, "Failed to enable bloom");
                    return;
                }
                if (!var15) {
                    class142.method857((byte) 95, "Bloom enabled");
                    return;
                }
                class142.method857((byte) 95, "Bloom disabled");
                return;
            }
            if (arg1.equalsIgnoreCase("tween")) {
                if (class84.field1230) {
                    class84.field1230 = false;
                    class142.method857((byte) 95, "Forced tweening disabled.");
                    return;
                }
                class84.field1230 = true;
                class142.method857((byte) 95, "Forced tweening ENABLED!");
                return;
            }
            if (arg1.equalsIgnoreCase("shiftclick")) {
                if (class298.field4686) {
                    class142.method857((byte) 95, "Shift-click disabled.");
                    class298.field4686 = false;
                    return;
                }
                class142.method857((byte) 95, "Shift-click ENABLED!");
                class298.field4686 = true;
                return;
            }
            if (arg1.equalsIgnoreCase("getcgcoord")) {
                class142.method857((byte) 95, "x:" + (class358.field5565.field6417 >> 7) + " z:" + (class358.field5565.field6410 >> 7));
                return;
            }
            if (arg1.equalsIgnoreCase("getheight")) {
                class142.method857((byte) 95, "Height: " + class53.field732[class358.field5565.field6419].method688(class358.field5565.field6417 >> 7, class358.field5565.field6410 >> 7));
                return;
            }
            if (arg1.equalsIgnoreCase("resetminimap")) {
                class120.field1646.method997(39);
                class120.field1646.method1013(0);
                class453.field7020.method2740(5);
                class457.field7049.method663(false);
                class187.method1172(true);
                class142.method857((byte) 95, "Minimap reset");
                return;
            }
            if (arg1.startsWith("mc")) {
                if (class19.field198.method1283()) {
                    int var16 = Integer.parseInt(arg1.substring(3));
                    if (var16 < 1) {
                        var16 = 1;
                    } else if (var16 > 4) {
                        var16 = 4;
                    }
                    class190.field2765 = var16;
                    class19.field198.method1274(class190.field2765);
                    class19.field198.method1265(0);
                    class142.method857((byte) 95, "Render cores now: " + class190.field2765);
                    return;
                }
                class142.method857((byte) 95, "Current toolkit doesn't support multiple cores");
                return;
            }
            if (arg1.startsWith("cachespace")) {
                class142.method857((byte) 95, "I(s): " + class231.field3825.method2196((byte) -17) + "/" + class231.field3825.method2200((byte) 75));
                class142.method857((byte) 95, "I(m): " + class457.field7046.method2196((byte) -17) + "/" + class457.field7046.method2200((byte) 75));
                class142.method857((byte) 95, "O(s): " + class337.field5262.field4864.method2564(0) + "/" + class337.field5262.field4864.method2561(0));
                return;
            }
            if (arg1.equalsIgnoreCase("getcamerapos")) {
                class142.method857((byte) 95, "Pos: " + class358.field5565.field6419 + "," + ((class163.field2367 >> 7) + class453.field7018 >> 6) + "," + ((class98.field1404 >> 7) + class126.field1718 >> 6) + "," + ((class163.field2367 >> 7) + class453.field7018 & 0x3F) + "," + ((class98.field1404 >> 7) + class126.field1718 & 0x3F) + " Height: " + (class532.method3165(class358.field5565.field6419, class163.field2367, false, class98.field1404) - class371.field5703));
                class142.method857((byte) 95, "Look: " + class358.field5565.field6419 + "," + (class453.field7018 + class259.field4185 >> 6) + "," + (class71.field1076 + class126.field1718 >> 6) + "," + (class453.field7018 + class259.field4185 & 0x3F) + "," + (class71.field1076 + class126.field1718 & 0x3F) + " Height: " + (class532.method3165(class358.field5565.field6419, class259.field4185, false, class71.field1076) - class46.field604));
                return;
            }
            if (arg1.equals("showocc")) {
                class471.field7211 = !class471.field7211;
                class207.method1415(86);
                class142.method857((byte) 95, "showocc=" + class471.field7211);
                return;
            }
            if (arg1.equals("wallocc")) {
                class471.field7200 = !class471.field7200;
                class207.method1415(116);
                class142.method857((byte) 95, "forcewallocc=" + class471.field7200);
                return;
            }
            if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                class222.field3744 = !class222.field3744;
                class19.field198.method1250(class222.field3744);
                class414.method2637((byte) 113);
                class142.method857((byte) 95, "showprofiling=" + class222.field3744);
                return;
            }
            if (arg1.equals("performancetest")) {
                class142.method857((byte) 95, "Java toolkit: " + class163.method1029((byte) 115, class339.field5294, 0));
                class142.method857((byte) 95, "GL toolkit:   " + class163.method1029((byte) 21, class339.field5294, 1));
                class142.method857((byte) 95, "SSE toolkit:  " + class163.method1029((byte) 125, class339.field5294, 2));
                return;
            }
            if (arg1.equals("nonpcs")) {
                class168.field2446 = !class168.field2446;
                class142.method857((byte) 95, "nonpcs=" + class168.field2446);
                return;
            }
            if (arg1.equals("autoworld")) {
                class154.method943(arg0 - 777);
                class142.method857((byte) 95, "auto world selected");
                return;
            }
            if (arg1.startsWith("switchworld")) {
                int var17 = Integer.parseInt(arg1.substring(12));
                class497.method3035(var17, false, class54.method412(0, var17).field1032);
                class142.method857((byte) 95, "switched");
                return;
            }
            if (arg1.equals("getworld")) {
                class142.method857((byte) 95, "w: " + class95.field1387.field7722);
                return;
            }
            if (arg1.startsWith("pc")) {
                class81.method578((byte) 66, class473.field7256);
                class170.field2488.method1479((byte) -122, 0);
                int var18 = class170.field2488.field3162;
                int var19 = arg1.indexOf(" ", 4);
                class170.field2488.method1458(arg1.substring(3, var19), (byte) 78);
                class228.method1640(-971571636, class170.field2488, arg1.substring(var19));
                class170.field2488.method1438(65280, class170.field2488.field3162 - var18);
                return;
            }
            if (arg1.equals("heap")) {
                class142.method857((byte) 95, "Heap: " + class491.field7438 + "MB");
                return;
            }
            if (arg1.equals("savevarcs")) {
                class535.method3169(-78);
                class142.method857((byte) 95, "perm varcs saved");
                return;
            }
            if (arg1.equals("scramblevarcs")) {
                for (int var20 = 0; var20 < class187.field2726.length; var20++) {
                    if (class225.field3770[var20]) {
                        class187.field2726[var20] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class187.field2726[var20] *= -1;
                        }
                    }
                }
                class535.method3169(-72);
                class142.method857((byte) 95, "perm varcs scrambled");
                return;
            }
            if (arg1.equals("showcolmap")) {
                class148.field1997 = true;
                class187.method1172(true);
                class142.method857((byte) 95, "colmap is shown");
                return;
            }
            if (arg1.equals("hidecolmap")) {
                class148.field1997 = false;
                class187.method1172(true);
                class142.method857((byte) 95, "colmap is hidden");
                return;
            }
            if (arg1.equals("resetcache")) {
                class54.method410(20250);
                class142.method857((byte) 95, "Caches reset");
                return;
            }
            if (arg1.equals("profilecpu")) {
                class142.method857((byte) 95, class440.method2792(100) + "ms");
                return;
            }
            if (arg1.startsWith("cpuusage")) {
                int var21 = Integer.parseInt(arg1.substring(9));
                if (var21 >= 0 && var21 <= 4) {
                    class141.field1911.field6119 = var21;
                }
                class142.method857((byte) 95, "cpuusage=" + class141.field1911.field6119);
                return;
            }
            if (arg1.startsWith("getclientvarpbit")) {
                int var22 = Integer.parseInt(arg1.substring(17));
                class142.method857((byte) 95, "varpbit=" + class96.field1394.method1979(var22, 0));
                return;
            }
            if (arg1.startsWith("getclientvarp")) {
                int var23 = Integer.parseInt(arg1.substring(14));
                class142.method857((byte) 95, "varp=" + class96.field1394.method1982(true, var23));
                return;
            }
            if (arg1.startsWith("demologin")) {
                class414.method2638(false, 0, 3);
                return;
            }
            if (arg1.startsWith("newdemologin")) {
                class414.method2638(true, 0, 3);
                return;
            }
            if (arg1.startsWith("directlogin")) {
                String[] var24 = class506.method3074((byte) 126, arg1.substring(12), ' ');
                if (var24.length >= 2) {
                    int var25 = var24.length <= 2 ? 0 : Integer.parseInt(var24[2]);
                    class250.method1729(var25, var24[1], var24[0], -25381);
                    return;
                }
            }
            if (arg1.startsWith("csprofileclear")) {
                class420.method2683();
                return;
            }
            if (arg1.startsWith("csprofileoutputc")) {
                class420.method2686(100, false);
                return;
            }
            if (arg1.startsWith("csprofileoutputt")) {
                class420.method2686(10, true);
                return;
            }
            if (arg1.startsWith("texsize")) {
                int var26 = Integer.parseInt(arg1.substring(8));
                class19.field198.method1244(var26);
                return;
            }
            if (arg1.equals("soundstreamcount")) {
                class142.method857((byte) 95, "Active streams: " + class411.field6231.method479());
                return;
            }
            if (arg1.equals("errormessage")) {
                class142.method857((byte) 95, class528.field7769.method495(arg0 + 17396));
                return;
            }
            if (class148.field1994 == 9) {
                class449.field6958++;
                class81.method578((byte) 66, class70.field1066);
                class170.field2488.method1479((byte) -117, arg1.length() + 3);
                class170.field2488.method1479((byte) -113, arg3 ? 1 : 0);
                class170.field2488.method1479((byte) -88, arg2 ? 1 : 0);
                class170.field2488.method1458(arg1, (byte) 78);
            }
            if (arg1.startsWith("fps ") && class209.field3228 != class181.field2626) {
                class46.method338(127, class170.method1078(-101, arg1.substring(4)));
                return;
            }
            if (class148.field1994 != 9) {
                class142.method857((byte) 95, "Unrecogonised commmand when not logged in: " + arg1);
                return;
            }
        } catch (Exception var28) {
            class142.method857((byte) 95, "Whoops, something went wrong.");
            return;
        }
    }

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "()I")
    public final int method618() {
        field4888++;
        return this.field4881 + this.field4878 + this.field4872.field7581;
    }

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "(IIIII)V")
    public final void method620(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4879++;
        this.field4872.method2703(0, false);
        this.field4892.method1529(34166);
        this.field4892.method1566((byte) 95, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field4881 + arg1;
        int var7 = this.field4891 + arg0;
        if (this.field4886 == null) {
            this.field4892.method1540(106, this.field4872);
            this.field4892.method1494(arg2, -25951);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field4872.field7580);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, this.field4872.field7581 + var6);
            OpenGL.glTexCoord2f(this.field4872.field7578, 0.0F);
            OpenGL.glVertex2i(var7 + this.field4872.field7575, this.field4872.field7581 + var6);
            OpenGL.glTexCoord2f(this.field4872.field7578, this.field4872.field7580);
            OpenGL.glVertex2i(this.field4872.field7575 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method2089(0, arg2);
        this.field4886.method2703(0, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4872.field7580);
        OpenGL.glTexCoord2f(0.0F, this.field4872.field7580);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field4872.field7581 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field4872.field7578, 0.0F);
        OpenGL.glTexCoord2f(this.field4872.field7578, 0.0F);
        OpenGL.glVertex2i(this.field4872.field7575 + var7, var6 - -this.field4872.field7581);
        OpenGL.glMultiTexCoord2f(33985, this.field4872.field7578, this.field4872.field7580);
        OpenGL.glTexCoord2f(this.field4872.field7578, this.field4872.field7580);
        OpenGL.glVertex2i(this.field4872.field7575 + var7, var6);
        OpenGL.glEnd();
        this.method2092(-109);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    private final void method2092(int arg0) {
        this.field4892.method1507(1, 0);
        field4874++;
        if (arg0 > -92) {
            this.field4871 = true;
        }
        this.field4892.method1540(37, null);
        this.field4892.method1568(8448, 2896, 8448);
        this.field4892.method1498(34192, 1, 34168, 768);
        this.field4892.method1539(0, 5890, 770, (byte) 125);
        this.field4892.method1507(0, 0);
        this.field4892.method1498(34192, 1, 34168, 768);
    }

    @OriginalMember(owner = "client!mf", name = "oa", descriptor = "(III)V")
    public final void method616(int arg0, int arg1, int arg2) {
        field4889++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field4886 = class73.method535(this.field4892, arg0, arg1, (byte) -15, this.field4872.field7581, this.field4872.field7575);
        this.field4875 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZIIILjava/lang/String;)V")
    public static final void method2093(boolean arg0, int arg1, int arg2, int arg3, String arg4) {
        field4884++;
        class437 var5 = class24.method150(true, arg1, arg3);
        if (var5 == null) {
            return;
        }
        if (var5.field6625 != null) {
            class491 var6 = new class491();
            var6.field7423 = var5;
            var6.field7434 = arg4;
            var6.field7428 = arg2;
            var6.field7430 = var5.field6625;
            class420.method2673(var6);
        }
        if (class148.field1994 != 9 || !client.method492(var5).method2910(-1, arg2 - 1)) {
            return;
        }
        if (arg2 == 1) {
            class81.method578((byte) 66, class7.field88);
            class91.field1319++;
            class183.method1150(0, var5.field6716, arg3, arg1);
        }
        if (arg2 == 2) {
            class81.method578((byte) 66, class213.field3638);
            class289.field4547++;
            class183.method1150(0, var5.field6716, arg3, arg1);
        }
        if (arg2 == 3) {
            class81.method578((byte) 66, class12.field125);
            class220.field3724++;
            class183.method1150(0, var5.field6716, arg3, arg1);
        }
        if (arg2 == 4) {
            class213.field3636++;
            class81.method578((byte) 66, class247.field4015);
            class183.method1150(0, var5.field6716, arg3, arg1);
        }
        if (arg2 == 5) {
            class81.method578((byte) 66, class129.field1751);
            class17.field186++;
            class183.method1150(0, var5.field6716, arg3, arg1);
        }
        if (arg0) {
            method2091(-23, null, true, true);
        }
        if (arg2 == 6) {
            class81.method578((byte) 66, class63.field1001);
            class487.field7380++;
            class183.method1150(0, var5.field6716, arg3, arg1);
        }
        if (arg2 == 7) {
            class81.method578((byte) 66, class327.field5133);
            class201.field3061++;
            class183.method1150(0, var5.field6716, arg3, arg1);
        }
        if (arg2 == 8) {
            class81.method578((byte) 66, class464.field7125);
            class218.field3703++;
            class183.method1150(0, var5.field6716, arg3, arg1);
        }
        if (arg2 == 9) {
            class81.method578((byte) 66, class437.field6656);
            class80.field1186++;
            class183.method1150(0, var5.field6716, arg3, arg1);
        }
        if (arg2 == 10) {
            class81.method578((byte) 66, class156.field2158);
            class250.field4055++;
            class183.method1150(0, var5.field6716, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!mf", name = "YA", descriptor = "()I")
    public final int method626() {
        field4887++;
        return this.field4872.field7575;
    }

    @OriginalMember(owner = "client!mf", name = "ZA", descriptor = "()I")
    public final int method622() {
        field4877++;
        return this.field4872.field7581;
    }

    @OriginalMember(owner = "client!mf", name = "RA", descriptor = "()I")
    public final int method623() {
        field4895++;
        return this.field4872.field7575 + this.field4891 + this.field4876;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(FFFFFFLta;II)V")
    public final void method629(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class453 arg6, int arg7, int arg8) {
        field4896++;
        class508 var10 = ((class387) arg6).field5904;
        if (this.field4871) {
            float var11 = (float) this.method623();
            float var12 = (float) this.method618();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field4881 * var15;
            float var18 = (float) this.field4881 * var16;
            float var19 = (float) this.field4891 * var13;
            float var20 = (float) this.field4891 * var14;
            float var21 = (float) this.field4876 * -var13;
            float var22 = (float) this.field4876 * -var14;
            float var23 = (float) this.field4878 * -var15;
            arg1 = arg1 + var20 + var18;
            arg2 = arg2 + var21 + var17;
            arg0 = arg0 + var19 + var17;
            arg4 = arg4 + var19 + var23;
            float var24 = (float) this.field4878 * -var16;
            arg3 = arg3 + var22 + var18;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        this.field4872.method2703(0, true);
        float var26 = arg5 + arg3 - arg1;
        this.field4892.method1529(34166);
        this.field4892.method1540(60, this.field4872);
        this.field4892.method1494(1, -25951);
        this.field4892.method1507(1, 0);
        this.field4892.method1540(82, var10);
        this.field4892.method1568(8448, 2896, 7681);
        this.field4892.method1498(34192, 0, 34168, 768);
        this.field4892.method1566((byte) 95, 1);
        float var27 = var10.field7578 / (float) var10.field7575;
        float var28 = var10.field7580 / (float) var10.field7581;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field4872.field7580);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field7580 - (((float) (-arg8) + arg1) * var28));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * var27, var10.field7580 - (((float) (-arg8) + arg5) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field4872.field7578, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, (var25 - (float) arg7) * var27, var10.field7580 - ((float) (-arg8) + var26) * var28);
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field4872.field7578, this.field4872.field7580);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var27, var10.field7580 - (((float) (-arg8) + arg3) * var28));
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field4892.method1498(34192, 0, 5890, 768);
        this.field4892.method1494(0, -25951);
        this.field4892.method1540(118, null);
        this.field4892.method1507(0, 0);
    }

    @OriginalMember(owner = "client!mf", name = "XA", descriptor = "(IIIIII)V")
    public final void method631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4872.method3159(arg0, arg3, arg5, (byte) 30, arg2, arg1, arg4);
        field4885++;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILta;II)V")
    public final void method632(int arg0, int arg1, class453 arg2, int arg3, int arg4) {
        field4873++;
        class387 var6 = (class387) arg2;
        class508 var7 = var6.field5904;
        this.field4872.method2703(0, false);
        this.field4892.method1529(34166);
        this.field4892.method1540(46, this.field4872);
        this.field4892.method1494(1, -25951);
        this.field4892.method1507(1, 0);
        this.field4892.method1540(42, var7);
        this.field4892.method1568(8448, 2896, 7681);
        this.field4892.method1498(34192, 0, 34168, 768);
        this.field4892.method1566((byte) 95, 1);
        int var8 = this.field4891 + arg0;
        int var9 = this.field4881 + arg1;
        int var10 = this.field4872.field7575 + var8;
        int var11 = this.field4872.field7581 + var9;
        float var12 = var7.field7578 / (float) var7.field7575;
        float var13 = var7.field7580 / (float) var7.field7581;
        float var14 = (float) (var8 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field7580 - ((float) (var9 - arg4) * var13);
        float var17 = var7.field7580 - ((float) (var11 - arg4) * var13);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field4872.field7580);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var8, var9);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var8, this.field4872.field7581 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field4872.field7578, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field4872.field7575 + var8, this.field4872.field7581 + var9);
        OpenGL.glMultiTexCoord2f(33984, this.field4872.field7578, this.field4872.field7580);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(this.field4872.field7575 + var8, var9);
        OpenGL.glEnd();
        this.field4892.method1498(34192, 0, 5890, 768);
        this.field4892.method1494(0, -25951);
        this.field4892.method1540(50, null);
        this.field4892.method1507(0, 0);
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lna;IIII)V")
    public class311(class211 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4892 = arg0;
        this.field4872 = class73.method535(arg0, arg1, arg2, (byte) -15, arg4, arg3);
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lna;II[III)V")
    public class311(class211 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field4892 = arg0;
        this.field4872 = class531.method3153((byte) -95, arg0, arg1, false, arg3, arg2);
    }

    static {
        new class213("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
    }
}
