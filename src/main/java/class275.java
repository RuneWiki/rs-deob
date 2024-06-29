import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class275 extends class96 {

    @OriginalMember(owner = "client!uh", name = "bb", descriptor = "I")
    private int field4596 = -1;

    @OriginalMember(owner = "client!uh", name = "eb", descriptor = "Z")
    public boolean field4599 = false;

    @OriginalMember(owner = "client!uh", name = "db", descriptor = "I")
    private int field4598 = 0;

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "Llc;")
    private class165 field4591;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "Z")
    private boolean field4589;

    @OriginalMember(owner = "client!uh", name = "jb", descriptor = "Z")
    private boolean field4604;

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "Z")
    private boolean field4585;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "Z")
    private boolean field4578;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
    private int field4580;

    @OriginalMember(owner = "client!uh", name = "hb", descriptor = "I")
    private int field4602;

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "I")
    private int field4581;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
    private int field4587;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "Lna;")
    public static class26 field4583 = class69.method505("Benutzeroberfl-=che geladen)3", (byte) -125);

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "Lna;")
    public static class26 field4593 = class69.method505("huffman", (byte) -120);

    @OriginalMember(owner = "client!uh", name = "fb", descriptor = "Lna;")
    public static class26 field4600 = class69.method505("RuneScape wird geladen )2 bitte warten)3)3)3", (byte) -121);

    @OriginalMember(owner = "client!uh", name = "ab", descriptor = "Lq;")
    public static class97 field4595 = class168.method1136(31431);

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "F")
    private float field4579;

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
    private int field4592;

    @OriginalMember(owner = "client!uh", name = "cb", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!uh", name = "gb", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!uh", name = "ib", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "Lve;")
    public static class266 field4584;

    @OriginalMember(owner = "client!uh", name = "Z", descriptor = "[I")
    private int[] field4594;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lm;IFLve;Z)[I", line = 11)
    public final int[] method1942(class48 arg0, int arg1, float arg2, class266 arg3, boolean arg4) {
        field4588++;
        if (arg1 != 0) {
            return (int[]) null;
        }
        if (this.field4594 == null || this.field4579 != arg2) {
            if (!this.field4591.method1122(true, arg0, arg3)) {
                return null;
            }
            int var6 = arg4 ? 64 : 128;
            this.field4594 = this.field4591.method1118(var6, this.field4604, var6, (double) arg2, arg1 ^ 0x50000, arg3, arg0, true);
            this.field4579 = arg2;
            if (this.field4589) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6 * var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6];
                int var11 = var6;
                int var12;
                int var13 = var12 = var6;
                int var15 = var6 * var6;
                int var16 = var6 - 1;
                int var17 = var6 - 1;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var17; var19 >= 0; var19--) {
                        var12--;
                        int var20 = this.field4594[var12];
                        var7[var19] += class4.method23(var20, 16726965) >> 16;
                        var9[var19] += class4.method23(65394, var20) >> 8;
                        var10[var19] += class4.method23(var20, 255);
                    }
                    if (var12 == 0) {
                        var12 = var15;
                    }
                }
                int var21 = var15;
                for (int var22 = var16; var22 >= 0; var22--) {
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 1;
                    int var27 = 1;
                    for (int var28 = 2; var28 >= 0; var28--) {
                        var27--;
                        var23 += var9[var27];
                        var24 += var10[var27];
                        var25 += var7[var27];
                        if (var27 == 0) {
                            var27 = var11;
                        }
                    }
                    for (int var29 = var17; var29 >= 0; var29--) {
                        var26--;
                        int var30 = var23 / 9;
                        int var31 = var24 / 9;
                        var27--;
                        int var32 = var25 / 9;
                        var21--;
                        var8[var21] = class240.method1652(var31, class240.method1652(var32 << 16, var30 << 8));
                        var25 += var7[var27] - var7[var26];
                        var24 += var10[var27] - var10[var26];
                        var23 += var9[var27] - var9[var26];
                        if (var26 == 0) {
                            var26 = var11;
                        }
                        if (var27 == 0) {
                            var27 = var11;
                        }
                    }
                    for (int var33 = var17; var33 >= 0; var33--) {
                        var13--;
                        int var34 = this.field4594[var13];
                        var12--;
                        int var35 = this.field4594[var12];
                        var7[var33] += (class4.method23(var35, 16729186) >> 16) - class4.method23(var34 >> 16, 255);
                        var9[var33] += (class4.method23(65419, var35) >> 8) - class4.method23(255, var34 >> 8);
                        var10[var33] += -class4.method23(var34, 255) + class4.method23(255, var35);
                    }
                    if (var13 == 0) {
                        var13 = var15;
                    }
                    if (var12 == 0) {
                        var12 = var15;
                    }
                }
                this.field4594 = var8;
            }
        }
        return this.field4594;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lve;Lm;IZ)Z", line = 177)
    public final boolean method1943(class266 arg0, class48 arg1, int arg2, boolean arg3) {
        if (arg2 != 579100487) {
            return false;
        }
        field4582++;
        if (!this.field4591.method1122(true, arg1, arg0)) {
            return false;
        }
        GL var5 = class255.field4181;
        int var6 = arg3 ? 64 : 128;
        int var7 = class322.method2241(1536);
        if ((var7 & 0x1) == 0) {
            if (this.field4596 == -1) {
                int[] var8 = new int[1];
                var5.glGenTextures(1, var8, 0);
                this.field4592 = class197.field3058;
                this.field4596 = var8[0];
                class255.method1790(this.field4596);
                ByteBuffer var9 = ByteBuffer.wrap(this.field4591.method1121(var6, var6, this.field4604, arg1, 0.7D, 8839, arg0));
                if (this.field4587 == 2) {
                    GLU var11 = new GLU();
                    var11.gluBuild2DMipmaps(3553, 6408, var6, var6, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9987);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class197.field3056 += var9.limit() * 4 / 3 - this.field4598;
                    this.field4598 = var9.limit() * 4 / 3;
                } else if (this.field4587 == 1) {
                    int var10 = 0;
                    while (true) {
                        var5.glTexImage2D(3553, var10++, 6408, var6, var6, 0, 6408, 5121, var9);
                        var6 >>= 0x1;
                        if (var6 == 0) {
                            var5.glTexParameteri(3553, 10241, 9987);
                            var5.glTexParameteri(3553, 10240, 9729);
                            class197.field3056 += var9.limit() * 4 / 3 - this.field4598;
                            this.field4598 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field4591.method1121(var6, var6, this.field4604, arg1, 0.7D, 8839, arg0));
                    }
                } else {
                    var5.glTexImage2D(3553, 0, 6408, var6, var6, 0, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9729);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class197.field3056 += var9.limit() - this.field4598;
                    this.field4598 = var9.limit();
                }
                var5.glTexParameteri(3553, 10242, this.field4585 ? 10497 : 33071);
                var5.glTexParameteri(3553, 10243, this.field4578 ? 10497 : 33071);
            } else {
                class255.method1790(this.field4596);
            }
        }
        if ((var7 & 0x2) == 0) {
            class255.method1796(this.field4581);
        }
        if ((var7 & 0x4) == 0) {
            class255.method1787(0);
        }
        if ((var7 & 0x8) == 0) {
            if (this.field4602 == 0 && this.field4580 == 0) {
                class255.method1763();
            } else {
                float var12 = (float) (class255.field4168 * this.field4602) / (float) var6;
                float var13 = (float) (class255.field4168 * this.field4580) / (float) var6;
                class255.method1783(var13, var12, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZZLm;Lve;)[I", line = 289)
    public final int[] method1944(boolean arg0, boolean arg1, class48 arg2, class266 arg3) {
        if (arg0) {
            this.method1947(45, (byte) 75);
        }
        field4586++;
        if (this.field4591.method1122(true, arg2, arg3)) {
            int var5 = arg1 ? 64 : 128;
            return this.field4591.method1118(var5, this.field4604, var5, 1.0D, 327680, arg3, arg2, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V", line = 306)
    public static void method1945(int arg0) {
        field4583 = null;
        field4593 = null;
        field4600 = null;
        field4584 = null;
        field4595 = null;
        if (arg0 != 20413) {
            field4595 = (class97) null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILm;Lve;)Z", line = 323)
    public final boolean method1946(int arg0, class48 arg1, class266 arg2) {
        field4577++;
        return arg0 == -5 ? this.field4591.method1122(true, arg1, arg2) : true;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)V", line = 334)
    public final void method1947(int arg0, byte arg1) {
        if (arg1 != -120) {
            method1945(-42);
        }
        field4601++;
        if (this.field4594 == null || this.field4602 == 0 && this.field4580 == 0) {
            return;
        }
        if (class323.field5551 == null || class323.field5551.length < this.field4594.length) {
            class323.field5551 = new int[this.field4594.length];
        }
        int var3 = this.field4580 * arg0;
        int var4 = this.field4594.length == 4096 ? 64 : 128;
        int var5 = this.field4594.length;
        int var6 = var4 - 1;
        int var7 = this.field4602 * arg0 * var4;
        int var8 = var5 - 1;
        for (int var9 = 0; var9 < var5; var9 += var4) {
            int var10 = var7 + var9 & var8;
            for (int var11 = 0; var11 < var4; var11++) {
                int var12 = (var6 & var11 + var3) + var10;
                int var13 = var9 + var11;
                class323.field5551[var13] = this.field4594[var12];
            }
        }
        int[] var14 = this.field4594;
        this.field4594 = class323.field5551;
        class323.field5551 = var14;
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V", line = 401)
    public static final void method1948(int arg0) {
        class252.field4132.method1986((byte) -102);
        if (arg0 > -106) {
            method1949(71);
        }
        field4597++;
    }

    @OriginalMember(owner = "client!uh", name = "finalize", descriptor = "()V", line = 426)
    protected final void finalize() throws Throwable {
        if (this.field4596 != -1) {
            class197.method1322(this.field4596, this.field4598, this.field4592);
            this.field4598 = 0;
            this.field4596 = -1;
        }
        field4603++;
        super.finalize();
    }

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "(I)V", line = 448)
    public static final void method1949(int arg0) {
        int var1 = 67 / ((-arg0 - 60) / 41);
        field4590++;
        if (class40.method323((byte) 70) != 2) {
            return;
        }
        byte var2 = (byte) (class232.field3677 - 4 & 0xFF);
        int var3 = class232.field3677 % 104;
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var5 = 0; var5 < 104; var5++) {
                class170.field2662[var4][var3][var5] = var2;
            }
        }
        if (class279.field4651 == 3) {
            return;
        }
        for (int var6 = 0; var6 < 2; var6++) {
            class153.field2392[var6] = -1000000;
            class50.field793[var6] = 1000000;
            class80.field1260[var6] = 0;
            class249.field4080[var6] = 1000000;
            class159.field2480[var6] = 0;
        }
        if (class37.field614 != 1) {
            int var17 = class17.method118(class279.field4651, 1, class324.field5589, class14.field231);
            if (var17 - class178.field2793 < 800 && (class92.field1492[class279.field4651][class324.field5589 >> 7][class14.field231 >> 7] & 0x4) != 0) {
                class141.method940((byte) -107, false, class324.field5589 >> 7, class14.field231 >> 7, class36.field585, 1);
            }
            return;
        }
        if ((class92.field1492[class279.field4651][class13.field221.field3962 >> 7][class13.field221.field3972 >> 7] & 0x4) != 0) {
            class141.method940((byte) -85, false, class13.field221.field3962 >> 7, class13.field221.field3972 >> 7, class36.field585, 0);
        }
        if (class312.field5335 >= 310) {
            return;
        }
        int var7 = class13.field221.field3972 >> 7;
        int var8 = class14.field231 >> 7;
        int var9;
        if (var8 < var7) {
            var9 = var7 - var8;
        } else {
            var9 = var8 - var7;
        }
        int var10 = class324.field5589 >> 7;
        int var11 = class13.field221.field3962 >> 7;
        int var12;
        if (var11 > var10) {
            var12 = var11 - var10;
        } else {
            var12 = var10 - var11;
        }
        if (var12 <= var9) {
            int var15 = 32768;
            int var16 = var12 * 65536 / var9;
            while (var7 != var8) {
                if (var8 < var7) {
                    var8++;
                } else if (var8 > var7) {
                    var8--;
                }
                if ((class92.field1492[class279.field4651][var10][var8] & 0x4) != 0) {
                    class141.method940((byte) -13, false, var10, var8, class36.field585, 1);
                    break;
                }
                var15 += var16;
                if (var15 >= 65536) {
                    if (var11 > var10) {
                        var10++;
                    } else if (var11 < var10) {
                        var10--;
                    }
                    var15 -= 65536;
                    if ((class92.field1492[class279.field4651][var10][var8] & 0x4) != 0) {
                        class141.method940((byte) -37, false, var10, var8, class36.field585, 1);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = 32768;
        int var14 = var9 * 65536 / var12;
        while (var10 != var11) {
            if (var11 > var10) {
                var10++;
            } else if (var10 > var11) {
                var10--;
            }
            if ((class92.field1492[class279.field4651][var10][var8] & 0x4) != 0) {
                class141.method940((byte) -29, false, var10, var8, class36.field585, 1);
                break;
            }
            var13 += var14;
            if (var13 >= 65536) {
                if (var8 < var7) {
                    var8++;
                } else if (var7 < var8) {
                    var8--;
                }
                var13 -= 65536;
                if ((class92.field1492[class279.field4651][var10][var8] & 0x4) != 0) {
                    class141.method940((byte) -120, false, var10, var8, class36.field585, 1);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lwa;)V", line = 654)
    public class275(class82 arg0) {
        this.field4591 = new class165(arg0);
        this.field4589 = arg0.method642((byte) -86) == 1;
        this.field4604 = arg0.method642((byte) -80) == 1;
        this.field4585 = arg0.method642((byte) -67) == 1;
        this.field4578 = arg0.method642((byte) -114) == 1;
        int var2 = arg0.method642((byte) -35) & 0x3;
        this.field4580 = arg0.method599(false);
        this.field4602 = arg0.method599(false);
        int var3 = arg0.method642((byte) -86);
        arg0.method642((byte) -87);
        if (var2 == 1) {
            this.field4581 = 2;
        } else if (var2 == 2) {
            this.field4581 = 3;
        } else if (var2 == 3) {
            this.field4581 = 4;
        } else {
            this.field4581 = 0;
        }
        this.field4587 = (var3 & 0xF0) >> 4;
    }
}
