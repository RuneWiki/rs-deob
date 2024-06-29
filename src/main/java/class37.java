import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class37 extends class271 {

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "Z")
    public boolean field533 = false;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
    private int field537 = -1;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "I")
    private int field542 = 0;

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "Lui;")
    private class251 field541;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "Z")
    private boolean field550;

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "Z")
    private boolean field545;

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "Z")
    private boolean field547;

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "Z")
    private boolean field549;

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
    private int field539;

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
    private int field538;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "F")
    private float field531;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    private int field535;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "[I")
    public static int[] field543;

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "[I")
    private int[] field553;

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "[Lcm;")
    public static class181[] field544;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lc;ILcb;)Z", line = 7)
    public final boolean method245(class289 arg0, int arg1, class267 arg2) {
        if (arg1 != 2) {
            field543 = (int[]) null;
        }
        field536++;
        return this.field541.method1806(arg1 + 5249, arg0, arg2);
    }

    @OriginalMember(owner = "client!tc", name = "finalize", descriptor = "()V", line = 21)
    protected final void finalize() throws Throwable {
        field548++;
        if (this.field537 != -1) {
            class119.method911(this.field537, this.field542, this.field535);
            this.field542 = 0;
            this.field537 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)V", line = 36)
    public static final void method246(boolean arg0, int arg1) {
        if (class139.field2413 == 0) {
            class279.field4841.method993(arg1, (byte) 124);
        } else {
            class147.field2556 = arg1;
        }
        field546++;
        if (arg0) {
            field544 = (class181[]) null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)V", line = 57)
    public static final void method247(int arg0, int arg1) {
        if (arg0 >= 71) {
            field540++;
            class156 var2 = class206.method1525(5, -32701, arg1);
            var2.method1184((byte) 87);
        }
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)Lbh;", line = 73)
    public static final class258 method248(int arg0) {
        field552++;
        int var1 = class287.field4936[0] * class210.field3590[0];
        int var2 = -96 % ((arg0 + 6) / 55);
        byte[] var3 = class42.field687[0];
        int[] var4 = new int[var1];
        for (int var5 = 0; var5 < var1; var5++) {
            var4[var5] = class191.field3184[class235.method1710(var3[var5], 255)];
        }
        class277 var6 = new class277(class263.field4571, class76.field1321, class85.field1404[0], class232.field3934[0], class210.field3590[0], class287.field4936[0], var4);
        class235.method1713(0);
        return var6;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)V", line = 101)
    public final void method249(int arg0, int arg1) {
        field532++;
        if (this.field553 == null || this.field538 == arg0 && this.field539 == 0) {
            return;
        }
        if (class180.field3020 == null || this.field553.length > class180.field3020.length) {
            class180.field3020 = new int[this.field553.length];
        }
        int var3 = this.field553.length == 4096 ? 64 : 128;
        int var4 = this.field553.length;
        int var5 = this.field539 * arg1;
        int var6 = var3 - 1;
        int var7 = this.field538 * var3 * arg1;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var4; var9 += var3) {
            int var10 = var8 & var9 + var7;
            for (int var11 = 0; var11 < var3; var11++) {
                int var12 = (var6 & var5 + var11) + var10;
                int var13 = var9 + var11;
                class180.field3020[var13] = this.field553[var12];
            }
        }
        int[] var14 = this.field553;
        this.field553 = class180.field3020;
        class180.field3020 = var14;
    }

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V", line = 164)
    public static void method250(int arg0) {
        if (arg0 <= -53) {
            field543 = null;
            field544 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lja;)V", line = 502)
    public class37(class60 arg0) {
        this.field541 = new class251(arg0);
        this.field550 = arg0.method501(0) == 1;
        this.field545 = arg0.method501(0) == 1;
        this.field547 = arg0.method501(0) == 1;
        this.field549 = arg0.method501(0) == 1;
        int var2 = arg0.method501(0) & 0x3;
        this.field539 = arg0.method511(-120);
        this.field538 = arg0.method511(-114);
        int var3 = arg0.method501(0);
        arg0.method501(0);
        this.field530 = var3 >> 4 & 0xF;
        if (var2 == 1) {
            this.field555 = 2;
        } else if (var2 == 2) {
            this.field555 = 3;
        } else if (var2 == 3) {
            this.field555 = 4;
        } else {
            this.field555 = 0;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(FZLc;ILcb;)[I", line = 180)
    public final int[] method251(float arg0, boolean arg1, class289 arg2, int arg3, class267 arg4) {
        field551++;
        if (this.field553 == null || this.field531 != arg0) {
            if (!this.field541.method1806(5251, arg2, arg4)) {
                return null;
            }
            int var6 = arg1 ? 64 : 128;
            this.field553 = this.field541.method1805(true, var6, var6, this.field545, arg2, true, (double) arg0, arg4);
            this.field531 = arg0;
            if (this.field550) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var13;
                int var14 = var13 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var15; var19 >= 0; var19--) {
                        var13--;
                        int var20 = this.field553[var13];
                        var7[var19] += class235.method1710(16745691, var20) >> 16;
                        var8[var19] += class235.method1710(var20, 65303) >> 8;
                        var9[var19] += class235.method1710(var20, 255);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                int var21 = var17;
                for (int var22 = var16; var22 >= 0; var22--) {
                    int var23 = 1;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = 1;
                    for (int var28 = 2; var28 >= 0; var28--) {
                        var27--;
                        var25 += var9[var27];
                        var24 += var8[var27];
                        var26 += var7[var27];
                        if (var27 == 0) {
                            var27 = var11;
                        }
                    }
                    for (int var29 = var15; var29 >= 0; var29--) {
                        var23--;
                        var27--;
                        int var30 = var24 / 9;
                        int var31 = var26 / 9;
                        int var32 = var25 / 9;
                        var21--;
                        var10[var21] = class102.method799(class102.method799(var31 << 16, var30 << 8), var32);
                        var26 += var7[var27] - var7[var23];
                        var24 += var8[var27] - var8[var23];
                        var25 += var9[var27] - var9[var23];
                        if (var23 == 0) {
                            var23 = var11;
                        }
                        if (var27 == 0) {
                            var27 = var11;
                        }
                    }
                    for (int var33 = var15; var33 >= 0; var33--) {
                        var13--;
                        int var34 = this.field553[var13];
                        var14--;
                        int var35 = this.field553[var14];
                        var7[var33] += class235.method1710(var34 >> 16, 255) - class235.method1710(var35 >> 16, 255);
                        var8[var33] += class235.method1710(var34 >> 8, 255) - class235.method1710(var35 >> 8, 255);
                        var9[var33] += -class235.method1710(var35, 255) + class235.method1710(var34, 255);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field553 = var10;
            }
        }
        int var36 = 84 % ((arg3 - 12) / 62);
        return this.field553;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILc;ZLcb;)[I", line = 348)
    public final int[] method252(int arg0, class289 arg1, boolean arg2, class267 arg3) {
        field534++;
        if (!this.field541.method1806(arg0 ^ 0x1403, arg1, arg3)) {
            return null;
        }
        if (arg0 != 128) {
            this.method251(-1.2247705F, false, (class289) null, 12, (class267) null);
        }
        int var5 = arg2 ? 64 : 128;
        return this.field541.method1805(true, var5, var5, this.field545, arg1, false, 1.0D, arg3);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lcb;IZLc;)Z", line = 392)
    public final boolean method253(class267 arg0, int arg1, boolean arg2, class289 arg3) {
        int var5 = 23 % ((-arg1 - 69) / 56);
        field554++;
        if (!this.field541.method1806(5251, arg3, arg0)) {
            return false;
        }
        GL var6 = class47.field739;
        int var7 = arg2 ? 64 : 128;
        int var8 = class303.method2086((byte) 113);
        if ((var8 & 0x1) == 0) {
            if (this.field537 == -1) {
                int[] var9 = new int[1];
                var6.glGenTextures(1, var9, 0);
                this.field537 = var9[0];
                this.field535 = class119.field2009;
                class47.method317(this.field537);
                ByteBuffer var10 = ByteBuffer.wrap(this.field541.method1809(arg0, 0.7D, (byte) -29, this.field545, var7, arg3, var7));
                if (this.field530 == 2) {
                    GLU var12 = new GLU();
                    var12.gluBuild2DMipmaps(3553, 6408, var7, var7, 6408, 5121, var10);
                    var6.glTexParameteri(3553, 10241, 9987);
                    var6.glTexParameteri(3553, 10240, 9729);
                    class119.field2008 += var10.limit() * 4 / 3 - this.field542;
                    this.field542 = var10.limit() * 4 / 3;
                } else if (this.field530 == 1) {
                    int var11 = 0;
                    while (true) {
                        var6.glTexImage2D(3553, var11++, 6408, var7, var7, 0, 6408, 5121, var10);
                        var7 >>= 0x1;
                        if (var7 == 0) {
                            var6.glTexParameteri(3553, 10241, 9987);
                            var6.glTexParameteri(3553, 10240, 9729);
                            class119.field2008 += var10.limit() * 4 / 3 - this.field542;
                            this.field542 = var10.limit() * 4 / 3;
                            break;
                        }
                        var10 = ByteBuffer.wrap(this.field541.method1809(arg0, 0.7D, (byte) -29, this.field545, var7, arg3, var7));
                    }
                } else {
                    var6.glTexImage2D(3553, 0, 6408, var7, var7, 0, 6408, 5121, var10);
                    var6.glTexParameteri(3553, 10241, 9729);
                    var6.glTexParameteri(3553, 10240, 9729);
                    class119.field2008 += var10.limit() - this.field542;
                    this.field542 = var10.limit();
                }
                var6.glTexParameteri(3553, 10242, this.field547 ? 10497 : 33071);
                var6.glTexParameteri(3553, 10243, this.field549 ? 10497 : 33071);
            } else {
                class47.method317(this.field537);
            }
        }
        if ((var8 & 0x2) == 0) {
            class47.method324(this.field555);
        }
        if ((var8 & 0x4) == 0) {
            class47.method337(0);
        }
        if ((var8 & 0x8) == 0) {
            if (this.field538 == 0 && this.field539 == 0) {
                class47.method319();
            } else {
                float var13 = (float) (class47.field743 * this.field538) / (float) var7;
                float var14 = (float) (class47.field743 * this.field539) / (float) var7;
                class47.method310(var14, var13, 0.0F);
            }
        }
        return true;
    }
}
