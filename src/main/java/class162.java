import jaggl.OpenGL;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class162 extends class392 {

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    private int field2083 = 0;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    private int field2101 = 0;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    private int field2096 = 0;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    private int field2082 = 0;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "Z")
    private boolean field2087 = false;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    private int field2097 = 0;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "Lml;")
    private class194 field2105;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "Lgda;")
    private class268 field2089;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field2111 = new String[] { method1388(method1387("\u001a\n!L")), method1388(method1387("\u0007\u001ac\u001c\t\u001a\u00169\u001eH")), method1388(method1387("\u000fQc\u000e\u001d")), method1388(method1387("\u0007\u001acqH")), method1388(method1387("\u0007\u001acm!\\")), method1388(method1387("\u0007\u001acjH")), method1388(method1387("\u0007\u001acuH")), method1388(method1387("\u0007\u001acgH")), method1388(method1387("\u0007\u001ach!\\")), method1388(method1387("\u0007\u001acdH")), method1388(method1387("\u0007\u001actH")), method1388(method1387("\u0007\u001acg!\\")), method1388(method1387("\u0007\u001aci!\\")), method1388(method1387("\u0007\u001aclH")), method1388(method1387("\u0007\u001acoH")), method1388(method1387("\u0007\u001acfH")), method1388(method1387("\u0007\u001aca!\\")), method1388(method1387("\u0007\u001acf!\\")), method1388(method1387("\u0007\u001acsH")), method1388(method1387("\u0007\u001accH")), method1388(method1387("\u0007\u001ack!\\")), method1388(method1387("\u0007\u001acl!\\")), method1388(method1387("R\u001ap")), method1388(method1387("QM~")), method1388(method1387("QL,")), method1388(method1387("R\np")), method1388(method1387("QK}")), method1388(method1387("T\u0003m")), method1388(method1387("R\t\u007f\u001d")), method1388(method1387("\u0017\u0013$E\u000e\u0000\u001a?R\u000f\u0006Q:S_\u0017B")), method1388(method1387("QM{")), method1388(method1387("R\t|\u001d")), method1388(method1387("\u0007\u001acd!\\")) };

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Z")
    public static boolean field2080 = false;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Lgda;")
    private class268 field2084;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "[B")
    public static byte[] field2106;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method1371(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            if (this.field2087) {
                float var11 = (float) this.method1378();
                float var12 = (float) this.method1380();
                float var13 = (arg2 - arg0) / var11;
                float var14 = (arg3 - arg1) / var11;
                float var15 = (arg4 - arg0) / var12;
                float var16 = (arg5 - arg1) / var12;
                float var17 = (float) this.field2083 * var15;
                float var18 = (float) this.field2083 * var16;
                float var19 = (float) this.field2096 * var13;
                float var20 = (float) this.field2096 * var14;
                float var21 = (float) this.field2082 * -var13;
                float var22 = (float) this.field2082 * -var14;
                float var23 = (float) this.field2101 * -var15;
                arg4 = arg4 + var19 + var23;
                arg1 = arg1 + var20 + var18;
                float var24 = (float) this.field2101 * -var16;
                arg2 = arg2 + var21 + var17;
                arg3 = arg3 + var22 + var18;
                arg0 = arg0 + var19 + var17;
                arg5 = arg5 + var20 + var24;
            }
            field2093++;
            float var25 = arg2 + arg4 - arg0;
            this.field2089.method3600(-98, (arg9 & 0x1) != 0);
            float var26 = arg5 + arg3 - arg1;
            this.field2105.method1620((byte) 119);
            this.field2105.method1618((byte) 68, this.field2089);
            this.field2105.method1670(arg8, (byte) 114);
            this.field2105.method1631(arg6, 7681);
            OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field2089.field3803);
            OpenGL.glVertex2f(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2f(arg4, arg5);
            OpenGL.glTexCoord2f(this.field2089.field3802, 0.0F);
            OpenGL.glVertex2f(var25, var26);
            OpenGL.glTexCoord2f(this.field2089.field3802, this.field2089.field3803);
            OpenGL.glVertex2f(arg2, arg3);
            OpenGL.glEnd();
        } catch (RuntimeException var28) {
            throw class665.method4799(var28, field2111[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static final void method1372(byte arg0) {
        try {
            field2095++;
            class451.field6612.method4681(1, class451.field6612.field9136, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9089, (byte) -111);
            class451.field6612.method4681(2, class451.field6612.field9118, (byte) -111);
            class451.field6612.method4681(2, class451.field6612.field9135, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9091, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9101, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9096, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9097, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9109, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9092, (byte) -111);
            class451.field6612.method4681(2, class451.field6612.field9113, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9127, (byte) -111);
            class451.field6612.method4681(2, class451.field6612.field9105, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9114, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9116, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9132, (byte) -111);
            class451.field6612.method4681(2, class451.field6612.field9120, (byte) -111);
            if (arg0 != -114) {
                method1384((byte) -98);
            }
            class451.field6612.method4681(0, class451.field6612.field9122, (byte) -111);
            class451.field6612.method4681(0, class451.field6612.field9130, (byte) -111);
            class451.field6612.method4681(1, class451.field6612.field9117, (byte) -111);
            class309.method2463(arg0 ^ 0x70);
            class451.field6612.method4681(0, class451.field6612.field9090, (byte) -111);
            class451.field6612.method4681(4, class451.field6612.field9103, (byte) -111);
            class139.method1214((byte) -95);
            class180.method1498((byte) 70);
            class381.field5555 = true;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2111[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIII)V")
    public final void method876(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.field2089.method3600(97, (arg7 & 0x1) != 0);
            field2081++;
            this.field2105.method1620((byte) 118);
            this.field2105.method1670(arg6, (byte) 113);
            OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
            if (this.field2087) {
                float var9 = (float) arg2 / (float) this.method1378();
                float var10 = (float) arg3 / (float) this.method1380();
                float var11 = (float) this.field2096 * var9 + (float) arg0;
                float var12 = (float) this.field2083 * var10 + (float) arg1;
                float var13 = (float) this.field2089.field3804 * var9 + var11;
                float var14 = (float) this.field2089.field3799 * var10 + var12;
                if (this.field2084 == null) {
                    this.field2105.method1618((byte) -107, this.field2089);
                    this.field2105.method1631(arg4, 7681);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, this.field2089.field3803);
                    OpenGL.glVertex2f(var11, var12);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2f(var11, var14);
                    OpenGL.glTexCoord2f(this.field2089.field3802, 0.0F);
                    OpenGL.glVertex2f(var13, var14);
                    OpenGL.glTexCoord2f(this.field2089.field3802, this.field2089.field3803);
                    OpenGL.glVertex2f(var13, var12);
                    OpenGL.glEnd();
                } else {
                    this.method1381(arg4, (byte) -121);
                    this.field2084.method3600(-43, true);
                    OpenGL.glBegin(7);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field2089.field3803);
                    OpenGL.glTexCoord2f(0.0F, this.field2089.field3803);
                    OpenGL.glVertex2f(var11, var12);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2f(var11, var14);
                    OpenGL.glMultiTexCoord2f(33985, this.field2089.field3802, 0.0F);
                    OpenGL.glTexCoord2f(this.field2089.field3802, 0.0F);
                    OpenGL.glVertex2f(var13, var14);
                    OpenGL.glMultiTexCoord2f(33985, this.field2089.field3802, this.field2089.field3803);
                    OpenGL.glTexCoord2f(this.field2089.field3802, this.field2089.field3803);
                    OpenGL.glVertex2f(var13, var12);
                    OpenGL.glEnd();
                    this.method1386(0);
                }
            } else if (this.field2084 == null) {
                this.field2105.method1618((byte) 99, this.field2089);
                this.field2105.method1631(arg4, 7681);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field2089.field3803);
                OpenGL.glVertex2i(arg0, arg1);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(arg0, arg1 + arg3);
                OpenGL.glTexCoord2f(this.field2089.field3802, 0.0F);
                OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
                OpenGL.glTexCoord2f(this.field2089.field3802, this.field2089.field3803);
                OpenGL.glVertex2i(arg0 + arg2, arg1);
                OpenGL.glEnd();
            } else {
                this.method1381(arg4, (byte) -125);
                this.field2084.method3600(-106, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field2089.field3803);
                OpenGL.glTexCoord2f(0.0F, this.field2089.field3803);
                OpenGL.glVertex2i(arg0, arg1);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(arg0, arg1 + arg3);
                OpenGL.glMultiTexCoord2f(33985, this.field2089.field3802, 0.0F);
                OpenGL.glTexCoord2f(this.field2089.field3802, 0.0F);
                OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
                OpenGL.glMultiTexCoord2f(33985, this.field2089.field3802, this.field2089.field3803);
                OpenGL.glTexCoord2f(this.field2089.field3802, this.field2089.field3803);
                OpenGL.glVertex2i(arg0 + arg2, arg1);
                OpenGL.glEnd();
                this.method1386(0);
            }
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field2111[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([I)V")
    public final void method1373(int[] arg0) {
        try {
            arg0[2] = this.field2082;
            field2086++;
            arg0[3] = this.field2101;
            arg0[1] = this.field2083;
            arg0[0] = this.field2096;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2111[11] + (arg0 == null ? field2111[0] : field2111[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V")
    public static final void method1374(Throwable arg0, String arg1, byte arg2) {
        field2107++;
        try {
            String var3 = "";
            if (arg2 != -93) {
                method1384((byte) 57);
            }
            if (arg0 != null) {
                var3 = class98.method965(arg0, -20419);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + field2111[27];
                }
                var3 = var3 + arg1;
            }
            class537.method4071(false, var3);
            String var4 = class658.method4772(var3, (byte) -116, field2111[24], ":");
            String var5 = class658.method4772(var4, (byte) -101, field2111[26], "@");
            String var6 = class658.method4772(var5, (byte) -113, field2111[30], "&");
            String var7 = class658.method4772(var6, (byte) -80, field2111[23], "#");
            if (class795.field11566 != null) {
                class328 var8 = class709.field9903.method1575(arg2 ^ 0xFFFFFFD3, new URL(class795.field11566.getCodeBase(), field2111[29] + class410.field5920 + field2111[25] + (class427.field6150 == null ? String.valueOf(class408.field5905) : class427.field6150) + field2111[31] + class188.field2488 + field2111[28] + class188.field2487 + field2111[22] + var7));
                while (var8.field4486 == 0) {
                    class449.method3474(20817, 1L);
                }
                if (var8.field4486 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field4487;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method1375(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class685 arg7, int arg8, int arg9) {
        try {
            field2100++;
            class268 var11 = ((class581) arg7).field8395;
            if (this.field2087) {
                float var12 = (float) this.method1378();
                float var13 = (float) this.method1380();
                float var14 = (arg2 - arg0) / var12;
                float var15 = (arg3 - arg1) / var12;
                float var16 = (arg4 - arg0) / var13;
                float var17 = (arg5 - arg1) / var13;
                float var18 = (float) this.field2083 * var16;
                float var19 = (float) this.field2083 * var17;
                float var20 = (float) this.field2096 * var14;
                float var21 = (float) this.field2096 * var15;
                float var22 = (float) this.field2082 * -var14;
                float var23 = (float) this.field2082 * -var15;
                float var24 = (float) this.field2101 * -var16;
                float var25 = (float) this.field2101 * -var17;
                arg1 = arg1 + var21 + var19;
                arg2 = arg2 + var22 + var18;
                arg4 = arg4 + var20 + var24;
                arg0 = arg0 + var20 + var18;
                arg3 = arg3 + var23 + var19;
                arg5 = arg5 + var21 + var25;
            }
            float var26 = arg2 + arg4 - arg0;
            this.field2089.method3600(127, (arg6 & 0x1) != 0);
            float var27 = arg5 + arg3 - arg1;
            this.field2105.method1620((byte) 112);
            this.field2105.method1618((byte) -105, this.field2089);
            this.field2105.method1631(1, 7681);
            this.field2105.method1619(1, (byte) 125);
            this.field2105.method1618((byte) -102, var11);
            this.field2105.method1628(8448, 7681, 34162);
            this.field2105.method1669(768, 0, 34168, (byte) -123);
            this.field2105.method1670(1, (byte) 108);
            float var28 = var11.field3802 / (float) var11.field3804;
            float var29 = var11.field3803 / (float) var11.field3799;
            OpenGL.glBegin(7);
            OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
            OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field2089.field3803);
            OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg8) * var28, var11.field3803 - (arg1 - (float) arg9) * var29);
            OpenGL.glVertex2f(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
            OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field3803 - (arg5 - (float) arg9) * var29);
            OpenGL.glVertex2f(arg4, arg5);
            OpenGL.glMultiTexCoord2f(33984, this.field2089.field3802, 0.0F);
            OpenGL.glMultiTexCoord2f(33985, (var26 - (float) arg8) * var28, var11.field3803 - (((float) (-arg9) + var27) * var29));
            OpenGL.glVertex2f(var26, var27);
            OpenGL.glMultiTexCoord2f(33984, this.field2089.field3802, this.field2089.field3803);
            OpenGL.glMultiTexCoord2f(33985, ((float) (-arg8) + arg2) * var28, var11.field3803 - ((arg3 - (float) arg9) * var29));
            OpenGL.glVertex2f(arg2, arg3);
            OpenGL.glEnd();
            this.field2105.method1669(768, 0, 5890, (byte) -124);
            this.field2105.method1631(0, 7681);
            this.field2105.method1618((byte) -82, null);
            this.field2105.method1619(0, (byte) 125);
        } catch (RuntimeException var31) {
            throw class665.method4799(var31, field2111[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field2111[0] : field2111[2]) + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "()I")
    public final int method1376() {
        try {
            field2094++;
            return this.field2089.field3804;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2111[16] + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
    public final void method877(int arg0, int arg1, int arg2) {
        try {
            field2099++;
            OpenGL.glPixelTransferf(3348, 0.5F);
            OpenGL.glPixelTransferf(3349, 0.499F);
            OpenGL.glPixelTransferf(3352, 0.5F);
            OpenGL.glPixelTransferf(3353, 0.499F);
            OpenGL.glPixelTransferf(3354, 0.5F);
            OpenGL.glPixelTransferf(3355, 0.499F);
            this.field2084 = class41.method467(arg0, this.field2089.field3804, this.field2089.field3799, arg1, this.field2105, 4096);
            this.field2097 = arg2;
            OpenGL.glPixelTransferf(3348, 1.0F);
            OpenGL.glPixelTransferf(3349, 0.0F);
            OpenGL.glPixelTransferf(3352, 1.0F);
            OpenGL.glPixelTransferf(3353, 0.0F);
            OpenGL.glPixelTransferf(3354, 1.0F);
            OpenGL.glPixelTransferf(3355, 0.0F);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2111[15] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIII)V")
    public final void method874(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field2090++;
            this.field2089.method3600(91, false);
            this.field2105.method1620((byte) 111);
            this.field2105.method1670(arg4, (byte) 110);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            int var8 = this.field2096 + arg0;
            int var9 = this.field2083 + arg1;
            if (this.field2084 == null) {
                this.field2105.method1618((byte) -92, this.field2089);
                this.field2105.method1631(arg2, 7681);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field2089.field3803);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var8, this.field2089.field3799 + var9);
                OpenGL.glTexCoord2f(this.field2089.field3802, 0.0F);
                OpenGL.glVertex2i(this.field2089.field3804 + var8, this.field2089.field3799 + var9);
                OpenGL.glTexCoord2f(this.field2089.field3802, this.field2089.field3803);
                OpenGL.glVertex2i(this.field2089.field3804 + var8, var9);
                OpenGL.glEnd();
            } else {
                this.method1381(arg2, (byte) -126);
                this.field2084.method3600(-90, false);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field2089.field3803);
                OpenGL.glTexCoord2f(0.0F, this.field2089.field3803);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var8, this.field2089.field3799 + var9);
                OpenGL.glMultiTexCoord2f(33985, this.field2089.field3802, 0.0F);
                OpenGL.glTexCoord2f(this.field2089.field3802, 0.0F);
                OpenGL.glVertex2i(this.field2089.field3804 + var8, this.field2089.field3799 + var9);
                OpenGL.glMultiTexCoord2f(33985, this.field2089.field3802, this.field2089.field3803);
                OpenGL.glTexCoord2f(this.field2089.field3802, this.field2089.field3803);
                OpenGL.glVertex2i(this.field2089.field3804 + var8, var9);
                OpenGL.glEnd();
                this.method1386(0);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field2111[19] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IILaa;II)V")
    public final void method870(int arg0, int arg1, class685 arg2, int arg3, int arg4) {
        try {
            field2102++;
            class581 var6 = (class581) arg2;
            class268 var7 = var6.field8395;
            this.field2089.method3600(116, false);
            this.field2105.method1620((byte) 108);
            this.field2105.method1618((byte) 3, this.field2089);
            this.field2105.method1631(1, 7681);
            this.field2105.method1619(1, (byte) 125);
            this.field2105.method1618((byte) -84, var7);
            this.field2105.method1628(8448, 7681, 34162);
            this.field2105.method1669(768, 0, 34168, (byte) -117);
            this.field2105.method1670(1, (byte) 120);
            int var18 = this.field2096 + arg0;
            int var19 = this.field2083 + arg1;
            int var8 = var18 + this.field2089.field3804;
            int var9 = this.field2089.field3799 + var19;
            float var10 = var7.field3802 / (float) var7.field3804;
            float var11 = var7.field3803 / (float) var7.field3799;
            float var12 = (float) (var18 - arg3) * var10;
            float var13 = (float) (var8 - arg3) * var10;
            float var14 = var7.field3803 - ((float) (var19 - arg4) * var11);
            float var15 = var7.field3803 - ((float) (var9 - arg4) * var11);
            OpenGL.glBegin(7);
            OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
            OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field2089.field3803);
            OpenGL.glMultiTexCoord2f(33985, var12, var14);
            OpenGL.glVertex2i(var18, var19);
            OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
            OpenGL.glMultiTexCoord2f(33985, var12, var15);
            OpenGL.glVertex2i(var18, this.field2089.field3799 + var19);
            OpenGL.glMultiTexCoord2f(33984, this.field2089.field3802, 0.0F);
            OpenGL.glMultiTexCoord2f(33985, var13, var15);
            OpenGL.glVertex2i(this.field2089.field3804 + var18, this.field2089.field3799 + var19);
            OpenGL.glMultiTexCoord2f(33984, this.field2089.field3802, this.field2089.field3803);
            OpenGL.glMultiTexCoord2f(33985, var13, var14);
            OpenGL.glVertex2i(var18 + this.field2089.field3804, var19);
            OpenGL.glEnd();
            this.field2105.method1669(768, 0, 5890, (byte) -125);
            this.field2105.method1631(0, 7681);
            this.field2105.method1618((byte) 60, null);
            this.field2105.method1619(0, (byte) 125);
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field2111[7] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field2111[0] : field2111[2]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "()I")
    public final int method1377() {
        try {
            field2085++;
            return this.field2089.field3799;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2111[21] + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIII)V")
    public final void method873(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field2103++;
            if (this.field2105.field2877) {
                int[] var7 = this.field2105.method227(arg4, arg5, arg2, arg3);
                if (var7 != null) {
                    for (int var8 = 0; var8 < var7.length; var8++) {
                        var7[var8] = class10.method71(var7[var8], -16777216);
                    }
                    this.method1385(arg0, arg1, arg2, arg3, var7, 0, arg2);
                }
            } else {
                this.field2089.method1067(arg2, arg1, arg5, arg3, arg4, (byte) 93, arg0);
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field2111[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "()I")
    public final int method1378() {
        try {
            field2104++;
            return this.field2089.field3804 + this.field2082 + this.field2096;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2111[14] + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(IIII)V")
    public final void method1379(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field2082 = arg2;
            this.field2101 = arg3;
            this.field2083 = arg1;
            this.field2096 = arg0;
            field2091++;
            this.field2087 = this.field2096 != 0 || this.field2083 != 0 || this.field2082 != 0 || this.field2101 != 0;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2111[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "()I")
    public final int method1380() {
        try {
            field2109++;
            return this.field2089.field3799 + this.field2101 + this.field2083;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2111[10] + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V")
    private final void method1381(int arg0, byte arg1) {
        try {
            field2092++;
            this.field2105.method1619(1, (byte) 125);
            this.field2105.method1618((byte) 76, this.field2089);
            this.field2105.method1628(7681, this.field2105.method1637(arg0, (byte) 125), 34162);
            this.field2105.method1669(768, 1, 34167, (byte) -109);
            this.field2105.method1650(0, (byte) -109, 770, 34168);
            int var3 = 8 % ((-arg1 - 72) / 48);
            this.field2105.method1619(0, (byte) 125);
            this.field2105.method1618((byte) -124, this.field2084);
            this.field2105.method1628(7681, 34479, 34162);
            this.field2105.method1669(768, 1, 34166, (byte) -117);
            if (this.field2097 == 0) {
                this.field2105.method1659(false, 0.5F, 0.0F, 1.0F, 0.5F);
            } else if (this.field2097 == 1) {
                this.field2105.method1659(false, 1.0F, 0.0F, 0.5F, 0.5F);
            } else if (this.field2097 == 2) {
                this.field2105.method1659(false, 0.5F, 0.0F, 0.5F, 1.0F);
            } else if (this.field2097 == 3) {
                this.field2105.method1659(false, 128.5F, 0.0F, 128.5F, 128.5F);
                return;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2111[20] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIII)V")
    public final void method1382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field2108++;
            int var8 = arg0 + arg2;
            this.field2089.method3600(114, false);
            int var9 = arg1 + arg3;
            this.field2105.method1620((byte) 122);
            this.field2105.method1618((byte) 28, this.field2089);
            this.field2105.method1670(arg6, (byte) 103);
            this.field2105.method1631(arg4, 7681);
            OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
            if (this.field2089.field3800 && !this.field2087) {
                float var21 = (float) arg3 * this.field2089.field3803 / (float) this.field2089.field3799;
                float var22 = (float) arg2 * this.field2089.field3802 / (float) this.field2089.field3804;
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, var21);
                OpenGL.glVertex2i(arg0, arg1);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(arg0, var9);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var22, var21);
                OpenGL.glVertex2i(var8, arg1);
                OpenGL.glEnd();
            } else {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef((float) this.field2096, (float) this.field2083, 0.0F);
                int var10 = this.method1378();
                int var11 = this.method1380();
                int var12 = this.field2089.field3799 + arg1;
                OpenGL.glBegin(7);
                int var13 = arg1;
                while (var9 >= var12) {
                    int var14 = this.field2089.field3804 + arg0;
                    int var15 = arg0;
                    while (var8 >= var14) {
                        OpenGL.glTexCoord2f(0.0F, this.field2089.field3803);
                        OpenGL.glVertex2i(var15, var13);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glVertex2i(var15, var12);
                        OpenGL.glTexCoord2f(this.field2089.field3802, 0.0F);
                        OpenGL.glVertex2i(var14, var12);
                        OpenGL.glTexCoord2f(this.field2089.field3802, this.field2089.field3803);
                        OpenGL.glVertex2i(var14, var13);
                        var14 += var10;
                        var15 += var10;
                    }
                    if (var8 > var15) {
                        float var16 = (float) (var8 - var15) * this.field2089.field3802 / (float) this.field2089.field3804;
                        OpenGL.glTexCoord2f(0.0F, this.field2089.field3803);
                        OpenGL.glVertex2i(var15, var13);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glVertex2i(var15, var12);
                        OpenGL.glTexCoord2f(var16, 0.0F);
                        OpenGL.glVertex2i(var8, var12);
                        OpenGL.glTexCoord2f(var16, this.field2089.field3803);
                        OpenGL.glVertex2i(var8, var13);
                    }
                    var13 += var11;
                    var12 += var11;
                }
                if (var13 < var9) {
                    float var17 = (float) (var13 + this.field2089.field3799 - var9) * this.field2089.field3803 / (float) this.field2089.field3799;
                    int var18 = arg0 + this.field2089.field3804;
                    int var19 = arg0;
                    while (var18 <= var8) {
                        OpenGL.glTexCoord2f(0.0F, this.field2089.field3803);
                        OpenGL.glVertex2i(var19, var13);
                        OpenGL.glTexCoord2f(0.0F, var17);
                        OpenGL.glVertex2i(var19, var9);
                        OpenGL.glTexCoord2f(this.field2089.field3802, var17);
                        OpenGL.glVertex2i(var18, var9);
                        OpenGL.glTexCoord2f(this.field2089.field3802, this.field2089.field3803);
                        OpenGL.glVertex2i(var18, var13);
                        var19 += var10;
                        var18 += var10;
                    }
                    if (var19 < var8) {
                        float var20 = (float) (var8 - var19) * this.field2089.field3802 / (float) this.field2089.field3804;
                        OpenGL.glTexCoord2f(0.0F, this.field2089.field3803);
                        OpenGL.glVertex2i(var19, var13);
                        OpenGL.glTexCoord2f(0.0F, var17);
                        OpenGL.glVertex2i(var19, var9);
                        OpenGL.glTexCoord2f(var20, var17);
                        OpenGL.glVertex2i(var8, var9);
                        OpenGL.glTexCoord2f(var20, this.field2089.field3803);
                        OpenGL.glVertex2i(var8, var13);
                    }
                }
                OpenGL.glEnd();
                OpenGL.glPopMatrix();
            }
        } catch (RuntimeException var24) {
            throw class665.method4799(var24, field2111[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    public static final void method1383(int arg0) {
        try {
            if (arg0 != -14816) {
                method1384((byte) -7);
            }
            field2098++;
            if (class354.method2835(class559.field8139, 0) || class322.method2551(class559.field8139, arg0 + 14805)) {
                class572.method4260(class239.field3453, class670.field9442 >> 12, -64, class688.field9635 >> 12);
            } else {
                int var1 = class203.field2988.field2252[0] >> 3;
                int var2 = class203.field2988.field2256[0] >> 3;
                if (var1 >= 0 && var1 < (class625.field8929 >> 3) && var2 >= 0 && var2 < class14.field187 >> 3) {
                    class572.method4260(class239.field3453, var1, 83, var2);
                } else {
                    class572.method4260(0, class625.field8929 >> 4, arg0 ^ 0x39A8, class14.field187 >> 4);
                }
            }
            class182.method1509(arg0 ^ 0xFF3920);
            class23.method273((byte) -112);
            class617.method4545(false);
            class755.method5476((byte) -117);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2111[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
    public static void method1384(byte arg0) {
        try {
            field2106 = null;
            if (arg0 != -108) {
                field2080 = true;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2111[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII[III)V")
    private final void method1385(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        try {
            this.field2089.method1068(arg3, arg6, arg1, arg4, true, -41, arg0, arg2, arg5);
            field2110++;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field2111[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field2111[0] : field2111[2]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lml;IIZ)V")
    public class162(class194 arg0, int arg1, int arg2, boolean arg3) {
        try {
            this.field2105 = arg0;
            this.field2089 = class667.method4807(arg1, arg3 ? 6408 : 6407, arg0, arg2, false);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2111[1] + (arg0 == null ? field2111[0] : field2111[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lml;IIII)V")
    public class162(class194 arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.field2105 = arg0;
            this.field2089 = class41.method467(arg1, arg3, arg4, arg2, arg0, 4096);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field2111[1] + (arg0 == null ? field2111[0] : field2111[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lml;II[III)V")
    public class162(class194 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        try {
            this.field2105 = arg0;
            this.field2089 = class239.method1981(false, -14869, arg5, arg1, arg3, arg0, arg4, arg2);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field2111[1] + (arg0 == null ? field2111[0] : field2111[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field2111[0] : field2111[2]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    private final void method1386(int arg0) {
        try {
            this.field2105.method1619(1, (byte) 125);
            field2088++;
            this.field2105.method1618((byte) -114, null);
            this.field2105.method1628(8448, 8448, 34162);
            this.field2105.method1669(768, 1, 34168, (byte) -119);
            this.field2105.method1650(0, (byte) -109, 770, 5890);
            this.field2105.method1619(arg0, (byte) 125);
            this.field2105.method1669(768, 1, 34168, (byte) -119);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2111[32] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!se", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1387(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x60);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!se", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1388(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 116;
                    break;
                case 1:
                    var10005 = 127;
                    break;
                case 2:
                    var10005 = 77;
                    break;
                case 3:
                    var10005 = 32;
                    break;
                default:
                    var10005 = 96;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
