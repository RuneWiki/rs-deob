import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public abstract class class7 implements class75 {

    @OriginalMember(owner = "client!il", name = "m", descriptor = "Z")
    private boolean field78 = false;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "Ldia;")
    public class246 field81;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public int field67;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    private int field69;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "Z")
    private boolean field73;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public int field68;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public int field82;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "Leia;")
    public static class255 field76;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)I", line = 6)
    public final int method46(byte arg0) {
        if (arg0 == -7) {
            field77++;
            return this.field82;
        } else {
            return -68;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V", line = 18)
    public final void method47(int arg0) {
        field74++;
        if (arg0 >= 90 && this.field82 > 0) {
            this.field81.method1661(this.field82, this.method53((byte) -124), -2);
            this.field82 = 0;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I[Ljava/lang/String;[III)V", line = 38)
    public static final void method48(int arg0, String[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 < arg3) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg0;
            String var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var8;
            for (int var9 = arg0; var9 < arg3; var9++) {
                if (var7 == null || arg1[var9] != null && arg1[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    int var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg3] = arg2[var6];
            arg2[var6] = var8;
            method48(arg0, arg1, arg2, var6 - 1, 1);
            method48(var6 + 1, arg1, arg2, arg3, 1);
        }
        if (arg4 == 1) {
            field75++;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V", line = 92)
    private final void method49(byte arg0) {
        this.field81.method1653((byte) 102, this);
        field84++;
        if (this.field78) {
            OpenGL.glTexParameteri(this.field68, 10241, this.field73 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field68, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field68, 10241, this.field73 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field68, 10240, 9728);
        }
        int var2 = -46 / ((arg0 + 44) / 61);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V", line = 113)
    public static void method50(boolean arg0) {
        field76 = null;
        if (!arg0) {
            method54((byte) 120);
        }
    }

    @OriginalMember(owner = "client!il", name = "finalize", descriptor = "()V", line = 123)
    protected final void finalize() throws Throwable {
        this.method47(100);
        field66++;
        super.finalize();
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V", line = 134)
    private final void method51(int arg0, int arg1) {
        this.field81.field3548 -= arg1;
        if (arg0 != 0) {
            method54((byte) -114);
        }
        field70++;
        this.field81.field3548 += this.method53((byte) -127);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZZ)V", line = 146)
    public final void method52(boolean arg0, boolean arg1) {
        if (this.field78 != arg1) {
            this.field78 = arg1;
            this.method49((byte) -112);
        }
        field85++;
        if (arg0) {
            this.method47(55);
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(B)I", line = 166)
    private final int method53(byte arg0) {
        int var2 = -65 % ((-arg0 - 81) / 41);
        field72++;
        int var3 = this.field81.method1645(this.field67, 6) * this.field69;
        return this.field73 ? var3 * 4 / 3 : var3;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(B)Ljp;", line = 181)
    public static final class376 method54(byte arg0) {
        if (arg0 != 69) {
            field76 = null;
        }
        field80++;
        class376 var1 = class52.method384((byte) -48);
        var1.method2369(-3, 0L);
        var1.method2349(93, class537.field7310);
        var1.method2369(arg0 ^ 0xFFFFFFB8, class170.field2269);
        var1.method2369(arg0 - 72, class177.field2365);
        var1.method2367(class46.field696, class384.field5620, (byte) 90);
        return var1;
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(B)Z", line = 203)
    public final boolean method55(byte arg0) {
        if (arg0 < 22) {
            this.method51(-83, 108);
        }
        field71++;
        if (!this.field81.field3617) {
            return false;
        }
        int var2 = this.method53((byte) -5);
        this.field81.method1653((byte) 118, this);
        OpenGL.glGenerateMipmapEXT(this.field68);
        this.field73 = true;
        this.method49((byte) 85);
        this.method51(0, var2);
        return true;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lgfa;ZI[I)Lvd;", line = 227)
    public static final class41 method56(class782 arg0, boolean arg1, int arg2, int[] arg3) {
        field83++;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        if (!arg1) {
            field76 = null;
        }
        float[][] var7 = null;
        if (arg0.field10785 != null) {
            int var8 = arg0.field10773;
            int[] var9 = new int[var8];
            int[] var10 = new int[var8];
            int[] var11 = new int[var8];
            int[] var12 = new int[var8];
            int[] var13 = new int[var8];
            int[] var14 = new int[var8];
            for (int var15 = 0; var15 < var8; var15++) {
                var9[var15] = Integer.MAX_VALUE;
                var10[var15] = -2147483647;
                var11[var15] = Integer.MAX_VALUE;
                var12[var15] = -2147483647;
                var13[var15] = Integer.MAX_VALUE;
                var14[var15] = -2147483647;
            }
            var5 = new int[var8];
            var6 = new int[var8];
            var7 = new float[var8][];
            for (int var16 = 0; var16 < arg2; var16++) {
                int var23 = arg3[var16];
                if (arg0.field10785[var23] != -1) {
                    int var24 = arg0.field10785[var23] & 0xFF;
                    for (int var25 = 0; var25 < 3; var25++) {
                        short var26;
                        if (var25 == 0) {
                            var26 = arg0.field10757[var23];
                        } else if (var25 == 1) {
                            var26 = arg0.field10768[var23];
                        } else {
                            var26 = arg0.field10750[var23];
                        }
                        int var27 = arg0.field10777[var26];
                        int var28 = arg0.field10771[var26];
                        int var29 = arg0.field10734[var26];
                        if (var27 < var9[var24]) {
                            var9[var24] = var27;
                        }
                        if (var10[var24] < var27) {
                            var10[var24] = var27;
                        }
                        if (var28 < var11[var24]) {
                            var11[var24] = var28;
                        }
                        if (var28 > var12[var24]) {
                            var12[var24] = var28;
                        }
                        if (var29 < var13[var24]) {
                            var13[var24] = var29;
                        }
                        if (var14[var24] < var29) {
                            var14[var24] = var29;
                        }
                    }
                }
            }
            var4 = new int[var8];
            for (int var17 = 0; var17 < var8; var17++) {
                byte var18 = arg0.field10759[var17];
                if (var18 > 0) {
                    var4[var17] = (var9[var17] + var10[var17]) / 2;
                    var5[var17] = (var11[var17] + var12[var17]) / 2;
                    var6[var17] = (var13[var17] + var14[var17]) / 2;
                    float var20;
                    float var21;
                    float var22;
                    if (var18 == 1) {
                        int var19 = arg0.field10765[var17];
                        if (var19 == 0) {
                            var20 = 1.0F;
                            var21 = 1.0F;
                        } else if (var19 <= 0) {
                            var20 = (float) (-var19) / 1024.0F;
                            var21 = 1.0F;
                        } else {
                            var21 = (float) var19 / 1024.0F;
                            var20 = 1.0F;
                        }
                        var22 = 64.0F / (float) arg0.field10772[var17];
                    } else if (var18 == 2) {
                        var21 = 64.0F / (float) arg0.field10743[var17];
                        var22 = 64.0F / (float) arg0.field10772[var17];
                        var20 = 64.0F / (float) arg0.field10765[var17];
                    } else {
                        var20 = (float) arg0.field10765[var17] / 1024.0F;
                        var22 = (float) arg0.field10772[var17] / 1024.0F;
                        var21 = (float) arg0.field10743[var17] / 1024.0F;
                    }
                    var7[var17] = class331.method2080(var22, 6, arg0.field10788[var17], arg0.field10763[var17], class440.method2643(255, arg0.field10761[var17]), arg0.field10758[var17], var20, var21);
                }
            }
        }
        return new class41(var4, var5, var6, var7);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BZ)V", line = 406)
    public final void method57(byte arg0, boolean arg1) {
        field79++;
        int var3 = -80 / ((46 - arg0) / 59);
        if (this.field73 != arg1) {
            int var4 = this.method53((byte) 104);
            this.field73 = true;
            this.method49((byte) 70);
            this.method51(0, var4);
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Ldia;IIIZ)V", line = 430)
    public class7(class246 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field81 = arg0;
        this.field67 = arg2;
        this.field69 = arg3;
        this.field73 = arg4;
        this.field68 = arg1;
        OpenGL.glGenTextures(1, class389.field5668, 0);
        this.field82 = class389.field5668[0];
        this.method51(0, 0);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public abstract void method58(int arg0);
}
