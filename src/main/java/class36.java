import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class36 extends class51 {

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "I")
    private int field579 = -1;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
    private int field588 = 0;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "Z")
    public boolean field589 = false;

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "Lsi;")
    private class242 field592;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "Z")
    private boolean field581;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "Z")
    private boolean field586;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "Z")
    private boolean field576;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "Z")
    private boolean field582;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "client!rf", name = "bb", descriptor = "I")
    private int field595;

    @OriginalMember(owner = "client!rf", name = "eb", descriptor = "I")
    private int field598;

    @OriginalMember(owner = "client!rf", name = "db", descriptor = "I")
    private int field597;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "Z")
    public static boolean field573 = false;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "Lhi;")
    public static class82 field574 = class95.method664((byte) -127, "tbrefresh");

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "Lhi;")
    private static class82 field591 = class95.method664((byte) -82, "glow3:");

    @OriginalMember(owner = "client!rf", name = "cb", descriptor = "Lhi;")
    public static class82 field596 = field591;

    @OriginalMember(owner = "client!rf", name = "fb", descriptor = "Lhi;")
    public static class82 field599 = class95.method664((byte) -46, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!rf", name = "gb", descriptor = "Lhi;")
    public static class82 field600 = field591;

    @OriginalMember(owner = "client!rf", name = "ib", descriptor = "Z")
    public static boolean field602 = false;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "F")
    private float field583;

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "I")
    private int field593;

    @OriginalMember(owner = "client!rf", name = "hb", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!rf", name = "jb", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "Lol;")
    public static class121 field594;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "[I")
    private int[] field587;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "[[B")
    public static byte[][] field590;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)V", line = 21)
    public static void method277(byte arg0) {
        field600 = null;
        field590 = (byte[][]) null;
        field599 = null;
        field596 = null;
        if (arg0 != -107) {
            method282(43, -36);
        }
        field591 = null;
        field574 = null;
        field594 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lol;Lum;I)Z", line = 43)
    public final boolean method278(class121 arg0, class222 arg1, int arg2) {
        if (arg2 != 31060) {
            this.method283(-65, (class121) null, true, (class222) null);
        }
        field580++;
        return this.field592.method1739(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(FLol;ZILum;)[I", line = 56)
    public final int[] method279(float arg0, class121 arg1, boolean arg2, int arg3, class222 arg4) {
        field578++;
        if (this.field587 == null || this.field583 != arg0) {
            if (!this.field592.method1739(arg1, 0, arg4)) {
                return null;
            }
            int var6 = arg2 ? 64 : 128;
            this.field587 = this.field592.method1736(this.field586, arg4, arg1, -114, (double) arg0, true, var6, var6);
            this.field583 = arg0;
            if (this.field581) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var12 = var6;
                int var13;
                int var14 = var13 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var15; var19 >= 0; var19--) {
                        var13--;
                        int var20 = this.field587[var13];
                        var7[var19] += class277.method1935(var20 >> 16, 255);
                        var8[var19] += class277.method1935(var20 >> 8, 255);
                        var9[var19] += class277.method1935(var20, 255);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                int var21 = var17;
                for (int var22 = var16; var22 >= 0; var22--) {
                    int var23 = 1;
                    int var24 = 1;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = 0;
                    for (int var28 = 2; var28 >= 0; var28--) {
                        var24--;
                        var26 += var9[var24];
                        var27 += var7[var24];
                        var25 += var8[var24];
                        if (var24 == 0) {
                            var24 = var12;
                        }
                    }
                    for (int var29 = var15; var29 >= 0; var29--) {
                        int var30 = var27 / 9;
                        var24--;
                        var23--;
                        int var31 = var25 / 9;
                        int var32 = var26 / 9;
                        var21--;
                        var10[var21] = class98.method674(var32, class98.method674(var30 << 16, var31 << 8));
                        var25 += var8[var24] - var8[var23];
                        var26 += var9[var24] - var9[var23];
                        var27 += var7[var24] - var7[var23];
                        if (var23 == 0) {
                            var23 = var12;
                        }
                        if (var24 == 0) {
                            var24 = var12;
                        }
                    }
                    for (int var33 = var15; var33 >= 0; var33--) {
                        var14--;
                        int var34 = this.field587[var14];
                        var13--;
                        int var35 = this.field587[var13];
                        var7[var33] += (class277.method1935(16737276, var35) >> 16) - (class277.method1935(var34, 16726378) >> 16);
                        var8[var33] += class277.method1935(255, var35 >> 8) - class277.method1935(255, var34 >> 8);
                        var9[var33] += -class277.method1935(var34, 255) + class277.method1935(255, var35);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field587 = var10;
            }
        }
        int var36 = 66 % ((-arg3 - 68) / 46);
        return this.field587;
    }

    @OriginalMember(owner = "client!rf", name = "finalize", descriptor = "()V", line = 219)
    protected final void finalize() throws Throwable {
        if (this.field579 != -1) {
            class6.method35(this.field579, this.field588, this.field593);
            this.field579 = -1;
            this.field588 = 0;
        }
        field603++;
        super.finalize();
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(II)V", line = 252)
    public final void method280(int arg0, int arg1) {
        field577++;
        if (arg0 < 67) {
            field573 = true;
        }
        if (this.field587 == null || this.field595 == 0 && this.field585 == 0) {
            return;
        }
        if (class90.field1631 == null || class90.field1631.length < this.field587.length) {
            class90.field1631 = new int[this.field587.length];
        }
        int var3 = this.field587.length;
        int var4 = this.field587.length == 4096 ? 64 : 128;
        int var5 = var3 - 1;
        int var6 = var4 - 1;
        int var7 = arg1 * var4 * this.field595;
        int var8 = this.field585 * arg1;
        for (int var9 = 0; var9 < var3; var9 += var4) {
            int var10 = var5 & var7 + var9;
            for (int var11 = 0; var11 < var4; var11++) {
                int var12 = var9 + var11;
                int var13 = (var6 & var8 + var11) + var10;
                class90.field1631[var12] = this.field587[var13];
            }
        }
        int[] var14 = this.field587;
        this.field587 = class90.field1631;
        class90.field1631 = var14;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lum;ZZLol;)Z", line = 314)
    public final boolean method281(class222 arg0, boolean arg1, boolean arg2, class121 arg3) {
        field601++;
        if (!this.field592.method1739(arg3, 0, arg0)) {
            return false;
        }
        if (arg2) {
            this.method278((class121) null, (class222) null, -35);
        }
        GL var5 = class147.field2479;
        int var6 = client.method864((byte) -90);
        int var7 = arg1 ? 64 : 128;
        if ((var6 & 0x1) == 0) {
            if (this.field579 == -1) {
                int[] var8 = new int[1];
                var5.glGenTextures(1, var8, 0);
                this.field579 = var8[0];
                this.field593 = class6.field47;
                class147.method1002(this.field579);
                ByteBuffer var9 = ByteBuffer.wrap(this.field592.method1741(arg0, (byte) 107, 0.7D, var7, var7, this.field586, arg3));
                if (this.field598 == 2) {
                    GLU var11 = new GLU();
                    var11.gluBuild2DMipmaps(3553, 6408, var7, var7, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9987);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class6.field50 += var9.limit() * 4 / 3 - this.field588;
                    this.field588 = var9.limit() * 4 / 3;
                } else if (this.field598 == 1) {
                    int var10 = 0;
                    while (true) {
                        var5.glTexImage2D(3553, var10++, 6408, var7, var7, 0, 6408, 5121, var9);
                        var7 >>= 0x1;
                        if (var7 == 0) {
                            var5.glTexParameteri(3553, 10241, 9987);
                            var5.glTexParameteri(3553, 10240, 9729);
                            class6.field50 += var9.limit() * 4 / 3 - this.field588;
                            this.field588 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field592.method1741(arg0, (byte) -127, 0.7D, var7, var7, this.field586, arg3));
                    }
                } else {
                    var5.glTexImage2D(3553, 0, 6408, var7, var7, 0, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9729);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class6.field50 += var9.limit() - this.field588;
                    this.field588 = var9.limit();
                }
                var5.glTexParameteri(3553, 10242, this.field576 ? 10497 : 33071);
                var5.glTexParameteri(3553, 10243, this.field582 ? 10497 : 33071);
            } else {
                class147.method1002(this.field579);
            }
        }
        if ((var6 & 0x2) == 0) {
            class147.method1012(this.field597);
        }
        if ((var6 & 0x4) == 0) {
            class147.method991(0);
        }
        if ((var6 & 0x8) == 0) {
            if (this.field595 == 0 && this.field585 == 0) {
                class147.method1000();
            } else {
                float var12 = (float) (class147.field2481 * this.field585) / (float) var7;
                float var13 = (float) (class147.field2481 * this.field595) / (float) var7;
                class147.method992(var12, var13, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lbc;)V", line = 504)
    public class36(class153 arg0) {
        this.field592 = new class242(arg0);
        this.field581 = arg0.method1082(-96) == 1;
        this.field586 = arg0.method1082(-55) == 1;
        this.field576 = arg0.method1082(-65) == 1;
        this.field582 = arg0.method1082(-65) == 1;
        int var2 = arg0.method1082(-61) & 0x3;
        this.field585 = arg0.method1104(-1);
        this.field595 = arg0.method1104(-1);
        int var3 = arg0.method1082(-105);
        arg0.method1082(-63);
        this.field598 = var3 >> 4 & 0xF;
        if (var2 == 1) {
            this.field597 = 2;
        } else if (var2 == 2) {
            this.field597 = 3;
        } else if (var2 == 3) {
            this.field597 = 4;
        } else {
            this.field597 = 0;
        }
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(II)Lpb;", line = 428)
    public static final class290 method282(int arg0, int arg1) {
        if (arg0 >= -4) {
            return (class290) null;
        }
        field584++;
        class290 var2 = (class290) class232.field3993.method2175((long) arg1, 3008);
        if (var2 != null) {
            return var2;
        }
        class290 var3 = class15.method93(class242.field4211, false, (byte) 92, class254.field4379, arg1);
        if (var3 != null) {
            class232.field3993.method2169(var3, (long) arg1, (byte) 94);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILol;ZLum;)[I", line = 463)
    public final int[] method283(int arg0, class121 arg1, boolean arg2, class222 arg3) {
        field575++;
        if (!this.field592.method1739(arg1, arg0 - 64, arg3)) {
            return null;
        }
        if (arg0 != 64) {
            this.method281((class222) null, false, true, (class121) null);
        }
        int var5 = arg2 ? 64 : 128;
        return this.field592.method1736(this.field586, arg3, arg1, 93, 1.0D, false, var5, var5);
    }
}
