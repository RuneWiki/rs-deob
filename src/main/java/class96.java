import java.awt.Image;
import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class96 extends class232 {

    @OriginalMember(owner = "client!p", name = "bb", descriptor = "I")
    private int field1562 = 0;

    @OriginalMember(owner = "client!p", name = "eb", descriptor = "I")
    private int field1565 = -1;

    @OriginalMember(owner = "client!p", name = "jb", descriptor = "Z")
    public boolean field1570 = false;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "Lcb;")
    private class276 field1542;

    @OriginalMember(owner = "client!p", name = "J", descriptor = "Z")
    private boolean field1545;

    @OriginalMember(owner = "client!p", name = "H", descriptor = "Z")
    private boolean field1543;

    @OriginalMember(owner = "client!p", name = "I", descriptor = "Z")
    private boolean field1544;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "Z")
    private boolean field1550;

    @OriginalMember(owner = "client!p", name = "hb", descriptor = "I")
    private int field1568;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "I")
    private int field1551;

    @OriginalMember(owner = "client!p", name = "L", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "Lok;")
    public static class146 field1559 = class235.method1724(-12908, "Veuillez commencer par supprimer ");

    @OriginalMember(owner = "client!p", name = "M", descriptor = "F")
    private float field1548;

    @OriginalMember(owner = "client!p", name = "F", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "I")
    private int field1546;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!p", name = "ab", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!p", name = "cb", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!p", name = "db", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!p", name = "fb", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!p", name = "gb", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!p", name = "ib", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!p", name = "kb", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "Loh;")
    public static class15 field1556;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "Ljava/awt/Image;")
    public static Image field1553;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "[I")
    private int[] field1557;

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() throws Throwable {
        field1566++;
        if (this.field1565 != -1) {
            class68.method505(this.field1565, this.field1562, this.field1546);
            this.field1562 = 0;
            this.field1565 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZBLoh;FLi;)[I", line = 27)
    public final int[] method660(boolean arg0, byte arg1, class15 arg2, float arg3, class209 arg4) {
        int var6 = 9 / ((-arg1 - 34) / 52);
        field1541++;
        if (this.field1557 == null || this.field1548 != arg3) {
            if (!this.field1542.method2011(arg2, arg4, -7857)) {
                return null;
            }
            int var7 = arg0 ? 64 : 128;
            this.field1557 = this.field1542.method2007(var7, (double) arg3, var7, true, arg4, 29466952, this.field1543, arg2);
            this.field1548 = arg3;
            if (this.field1545) {
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                int[] var11 = new int[var7 * var7];
                int var13 = var7;
                int var14 = var7 - 1;
                int var15;
                int var16 = var15 = var7;
                int var17 = var7 - 1;
                int var18 = var7 * var7;
                for (int var19 = 2; var19 >= 0; var19--) {
                    for (int var20 = var14; var20 >= 0; var20--) {
                        var15--;
                        int var21 = this.field1557[var15];
                        var8[var20] += class82.method582(var21 >> 16, 255);
                        var9[var20] += class82.method582(var21 >> 8, 255);
                        var10[var20] += class82.method582(255, var21);
                    }
                    if (var15 == 0) {
                        var15 = var18;
                    }
                }
                int var22 = var18;
                for (int var23 = var17; var23 >= 0; var23--) {
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = 1;
                    int var28 = 1;
                    for (int var29 = 2; var29 >= 0; var29--) {
                        var27--;
                        var26 += var8[var27];
                        var25 += var10[var27];
                        var24 += var9[var27];
                        if (var27 == 0) {
                            var27 = var13;
                        }
                    }
                    for (int var30 = var14; var30 >= 0; var30--) {
                        int var31 = var25 / 9;
                        int var32 = var26 / 9;
                        int var33 = var24 / 9;
                        var27--;
                        var28--;
                        var22--;
                        var11[var22] = class138.method1013(class138.method1013(var32 << 16, var33 << 8), var31);
                        var25 += var10[var27] - var10[var28];
                        var24 += var9[var27] - var9[var28];
                        var26 += var8[var27] - var8[var28];
                        if (var28 == 0) {
                            var28 = var13;
                        }
                        if (var27 == 0) {
                            var27 = var13;
                        }
                    }
                    for (int var34 = var14; var34 >= 0; var34--) {
                        var15--;
                        int var35 = this.field1557[var15];
                        var16--;
                        int var36 = this.field1557[var16];
                        var8[var34] += (class82.method582(16740626, var35) >> 16) - class82.method582(255, var36 >> 16);
                        var9[var34] += (class82.method582(65407, var35) >> 8) - (class82.method582(var36, 65521) >> 8);
                        var10[var34] += -class82.method582(var36, 255) + class82.method582(var35, 255);
                    }
                    if (var15 == 0) {
                        var15 = var18;
                    }
                    if (var16 == 0) {
                        var16 = var18;
                    }
                }
                this.field1557 = var11;
            }
        }
        return this.field1557;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lml;I)[Lpc;", line = 194)
    public static final class87[] method661(class129 arg0, int arg1) {
        field1561++;
        if (!arg0.method928(2)) {
            return new class87[0];
        }
        class256 var2 = arg0.method913((byte) -102);
        while (var2.field4265 == 0) {
            class281.method2041((byte) 93, 10L);
        }
        if (var2.field4265 == 2) {
            return new class87[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field4269);
        class87[] var4 = new class87[var3.length >> 2];
        int var5 = 0;
        if (arg1 != -1) {
            method664(33);
        }
        while (var5 < var4.length) {
            class87 var6 = new class87();
            var4[var5] = var6;
            var6.field1377 = var3[var5 << 2];
            var6.field1390 = var3[(var5 << 2) + 1];
            var6.field1393 = var3[(var5 << 2) + 2];
            var6.field1379 = var3[(var5 << 2) + 3];
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Li;ZILoh;)[I", line = 243)
    public final int[] method662(class209 arg0, boolean arg1, int arg2, class15 arg3) {
        field1558++;
        if (!this.field1542.method2011(arg3, arg0, -7857)) {
            return null;
        }
        int var5 = arg1 ? 64 : 128;
        if (arg2 != 64) {
            this.field1551 = -1;
        }
        return this.field1542.method2007(var5, 1.0D, var5, false, arg0, arg2 ^ 0x1C1A108, this.field1543, arg3);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIIIIB)V", line = 261)
    public static final void method663(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        int var10 = 51 / ((arg9 + 49) / 61);
        if (arg4 == arg6 && arg3 == arg5 && arg2 == arg7 && arg0 == arg8) {
            class232.method1702(arg4, arg1, arg8, arg3, arg7, -126);
        } else {
            int var11 = arg4;
            int var12 = arg3;
            int var13 = arg4 * 3;
            int var14 = arg3 * 3;
            int var15 = arg6 * 3;
            int var16 = arg5 * 3;
            int var17 = arg2 * 3;
            int var18 = arg0 * 3;
            int var19 = arg7 + var15 - arg4 - var17;
            int var20 = arg8 + var16 - var18 - arg3;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var15 - var13;
            int var23 = var18 + var14 - var16 - var16;
            int var24 = var16 - var14;
            for (int var25 = 128; var25 <= 4096; var25 += 128) {
                int var26 = var25 * var25 >> 12;
                int var27 = var25 * var26 >> 12;
                int var28 = var19 * var27;
                int var29 = var22 * var25;
                int var30 = var20 * var27;
                int var31 = var24 * var25;
                int var32 = var21 * var26;
                int var33 = var23 * var26;
                int var34 = (var30 + var33 + var31 >> 12) + arg3;
                int var35 = (var28 + var32 + var29 >> 12) + arg4;
                class232.method1702(var11, arg1, var34, var12, var35, -124);
                var12 = var34;
                var11 = var35;
            }
        }
        field1560++;
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V", line = 334)
    public static final void method664(int arg0) {
        class39.field688.method793((byte) -102);
        if (arg0 != -1) {
            method663(12, -116, -119, 29, 53, 9, -28, 8, 114, (byte) -106);
        }
        field1555++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIII)I", line = 347)
    public static final int method665(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 == 1633803553) {
            field1569++;
            int var5 = 65536 - class109.field1757[arg2 * 1024 / arg1] >> 1;
            return ((65536 - var5) * arg4 >> 16) + (arg0 * var5 >> 16);
        } else {
            return 103;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Loh;ILi;Z)Z", line = 359)
    public final boolean method666(class15 arg0, int arg1, class209 arg2, boolean arg3) {
        field1549++;
        if (!this.field1542.method2011(arg0, arg2, -7857)) {
            return false;
        }
        GL var5 = class271.field4641;
        int var6 = arg3 ? 64 : 128;
        if (arg1 != -1384136568) {
            this.field1551 = 88;
        }
        int var7 = class217.method1608((byte) 108);
        if ((var7 & 0x1) == 0) {
            if (this.field1565 == -1) {
                int[] var8 = new int[1];
                var5.glGenTextures(1, var8, 0);
                this.field1546 = class68.field1125;
                this.field1565 = var8[0];
                class271.method1978(this.field1565);
                ByteBuffer var9 = ByteBuffer.wrap(this.field1542.method2008(var6, arg2, 0.7D, this.field1543, arg0, 0, var6));
                if (this.field1547 == 2) {
                    GLU var10 = new GLU();
                    var10.gluBuild2DMipmaps(3553, 6408, var6, var6, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9987);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class68.field1130 += var9.limit() * 4 / 3 - this.field1562;
                    this.field1562 = var9.limit() * 4 / 3;
                } else if (this.field1547 == 1) {
                    int var11 = 0;
                    while (true) {
                        var5.glTexImage2D(3553, var11++, 6408, var6, var6, 0, 6408, 5121, var9);
                        var6 >>= 0x1;
                        if (var6 == 0) {
                            var5.glTexParameteri(3553, 10241, 9987);
                            var5.glTexParameteri(3553, 10240, 9729);
                            class68.field1130 += var9.limit() * 4 / 3 - this.field1562;
                            this.field1562 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field1542.method2008(var6, arg2, 0.7D, this.field1543, arg0, 0, var6));
                    }
                } else {
                    var5.glTexImage2D(3553, 0, 6408, var6, var6, 0, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9729);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class68.field1130 += var9.limit() - this.field1562;
                    this.field1562 = var9.limit();
                }
                var5.glTexParameteri(3553, 10242, this.field1544 ? 10497 : 33071);
                var5.glTexParameteri(3553, 10243, this.field1550 ? 10497 : 33071);
            } else {
                class271.method1978(this.field1565);
            }
        }
        if ((var7 & 0x2) == 0) {
            class271.method1974(this.field1551);
        }
        if ((var7 & 0x4) == 0) {
            class271.method1983(0);
        }
        if ((var7 & 0x8) == 0) {
            if (this.field1552 == 0 && this.field1568 == 0) {
                class271.method1953();
            } else {
                float var12 = (float) (class271.field4635 * this.field1552) / (float) var6;
                float var13 = (float) (class271.field4635 * this.field1568) / (float) var6;
                class271.method1955(var13, var12, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Loh;Li;I)Z", line = 477)
    public final boolean method667(class15 arg0, class209 arg1, int arg2) {
        field1567++;
        if (arg2 != -1) {
            field1559 = (class146) null;
        }
        return this.field1542.method2011(arg0, arg1, -7857);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lwe;)V", line = 584)
    public class96(class47 arg0) {
        this.field1542 = new class276(arg0);
        this.field1545 = arg0.method368(79) == 1;
        this.field1543 = arg0.method368(-94) == 1;
        this.field1544 = arg0.method368(91) == 1;
        this.field1550 = arg0.method368(33) == 1;
        int var2 = arg0.method368(-104) & 0x3;
        this.field1568 = arg0.method352(255);
        this.field1552 = arg0.method352(255);
        int var3 = arg0.method368(-103);
        arg0.method368(-97);
        if (var2 == 1) {
            this.field1551 = 2;
        } else if (var2 == 2) {
            this.field1551 = 3;
        } else if (var2 == 3) {
            this.field1551 = 4;
        } else {
            this.field1551 = 0;
        }
        this.field1547 = var3 >> 4 & 0xF;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V", line = 503)
    public final void method668(int arg0, int arg1) {
        field1564++;
        if (this.field1557 == null) {
            return;
        }
        if (this.field1552 != 0 || this.field1568 != 0) {
            if (class166.field2805 == null || this.field1557.length > class166.field2805.length) {
                class166.field2805 = new int[this.field1557.length];
            }
            int var3 = this.field1557.length;
            int var4 = this.field1568 * arg1;
            int var5 = this.field1557.length == 4096 ? 64 : 128;
            int var6 = arg1 * var5 * this.field1552;
            int var7 = var5 - 1;
            int var8 = var3 - 1;
            for (int var9 = 0; var9 < var3; var9 += var5) {
                int var10 = var6 + var9 & var8;
                for (int var11 = 0; var11 < var5; var11++) {
                    int var12 = var9 + var11;
                    int var13 = (var11 + var4 & var7) + var10;
                    class166.field2805[var12] = this.field1557[var13];
                }
            }
            int[] var14 = this.field1557;
            this.field1557 = class166.field2805;
            class166.field2805 = var14;
        }
        int var15 = 113 / ((arg0 - 12) / 54);
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V", line = 562)
    public static void method669(int arg0) {
        field1553 = null;
        if (arg0 != 4) {
            method665(3, 64, -83, -107, -47);
        }
        field1559 = null;
        field1556 = null;
    }
}
