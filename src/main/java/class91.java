import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class91 extends class203 {

    @OriginalMember(owner = "client!fm", name = "N", descriptor = "Z")
    public boolean field1435 = false;

    @OriginalMember(owner = "client!fm", name = "kb", descriptor = "I")
    private int field1458 = 0;

    @OriginalMember(owner = "client!fm", name = "ib", descriptor = "I")
    private int field1456 = -1;

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "Lng;")
    private class98 field1432;

    @OriginalMember(owner = "client!fm", name = "V", descriptor = "Z")
    private boolean field1443;

    @OriginalMember(owner = "client!fm", name = "bb", descriptor = "Z")
    private boolean field1449;

    @OriginalMember(owner = "client!fm", name = "Z", descriptor = "Z")
    private boolean field1447;

    @OriginalMember(owner = "client!fm", name = "Y", descriptor = "Z")
    private boolean field1446;

    @OriginalMember(owner = "client!fm", name = "W", descriptor = "I")
    private int field1444;

    @OriginalMember(owner = "client!fm", name = "fb", descriptor = "I")
    private int field1453;

    @OriginalMember(owner = "client!fm", name = "cb", descriptor = "I")
    private int field1450;

    @OriginalMember(owner = "client!fm", name = "eb", descriptor = "I")
    private int field1452;

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "Z")
    public static boolean field1429 = false;

    @OriginalMember(owner = "client!fm", name = "T", descriptor = "Lmh;")
    public static class62 field1441 = class201.method1405(true, "runes");

    @OriginalMember(owner = "client!fm", name = "X", descriptor = "Lmh;")
    private static class62 field1445 = class201.method1405(true, "level)2");

    @OriginalMember(owner = "client!fm", name = "mb", descriptor = "Lmh;")
    public static class62 field1460 = field1445;

    @OriginalMember(owner = "client!fm", name = "U", descriptor = "F")
    private float field1442;

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!fm", name = "Q", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!fm", name = "R", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!fm", name = "S", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!fm", name = "ab", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!fm", name = "db", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!fm", name = "gb", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!fm", name = "hb", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!fm", name = "lb", descriptor = "I")
    private int field1459;

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "Lhi;")
    public static class26 field1428;

    @OriginalMember(owner = "client!fm", name = "jb", descriptor = "[I")
    private int[] field1457;

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "[Lkb;")
    public static class82[] field1434;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(III)I", line = 10)
    public static final int method678(int arg0, int arg1, int arg2) {
        int var3 = 1;
        if (arg1 > -57) {
            return 99;
        }
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg2 >>= 0x1;
        }
        field1431++;
        if (arg2 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lgg;Lhi;ZFI)[I", line = 36)
    public final int[] method679(class126 arg0, class26 arg1, boolean arg2, float arg3, int arg4) {
        int var6 = -83 % ((-arg4 - 26) / 62);
        field1448++;
        if (this.field1457 == null || this.field1442 != arg3) {
            if (!this.field1432.method784(arg1, true, arg0)) {
                return null;
            }
            int var7 = arg2 ? 64 : 128;
            this.field1457 = this.field1432.method785(arg0, this.field1449, var7, var7, (byte) 97, (double) arg3, arg1, true);
            this.field1442 = arg3;
            if (this.field1443) {
                int[] var8 = new int[var7];
                int[] var9 = new int[var7 * var7];
                int[] var10 = new int[var7];
                int[] var11 = new int[var7];
                int var12 = var7;
                int var13;
                int var14 = var13 = var7;
                int var15 = var7 - 1;
                int var17 = var7 * var7;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var15; var19 >= 0; var19--) {
                        var13--;
                        int var20 = this.field1457[var13];
                        var8[var19] += class234.method1648(var20 >> 16, 255);
                        var11[var19] += class234.method1648(255, var20 >> 8);
                        var10[var19] += class234.method1648(255, var20);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                int var21 = var7 - 1;
                int var22 = var17;
                for (int var23 = var21; var23 >= 0; var23--) {
                    int var24 = 1;
                    int var25 = 1;
                    int var26 = 0;
                    int var27 = 0;
                    int var28 = 0;
                    for (int var29 = 2; var29 >= 0; var29--) {
                        var24--;
                        var28 += var8[var24];
                        var27 += var10[var24];
                        var26 += var11[var24];
                        if (var24 == 0) {
                            var24 = var12;
                        }
                    }
                    for (int var30 = var15; var30 >= 0; var30--) {
                        int var31 = var26 / 9;
                        var24--;
                        int var32 = var28 / 9;
                        int var33 = var27 / 9;
                        var22--;
                        var9[var22] = class270.method1854(class270.method1854(var32 << 16, var31 << 8), var33);
                        var25--;
                        var28 += var8[var24] - var8[var25];
                        var27 += var10[var24] - var10[var25];
                        var26 += var11[var24] - var11[var25];
                        if (var24 == 0) {
                            var24 = var12;
                        }
                        if (var25 == 0) {
                            var25 = var12;
                        }
                    }
                    for (int var34 = var15; var34 >= 0; var34--) {
                        var14--;
                        int var35 = this.field1457[var14];
                        var13--;
                        int var36 = this.field1457[var13];
                        var8[var34] += -class234.method1648(255, var35 >> 16) + (class234.method1648(var36, 16758611) >> 16);
                        var11[var34] += class234.method1648(255, var36 >> 8) - (class234.method1648(var35, 65485) >> 8);
                        var10[var34] += class234.method1648(255, var36) - class234.method1648(var35, 255);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field1457 = var9;
            }
        }
        return this.field1457;
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)V", line = 209)
    public static final void method680(int arg0) {
        for (int var1 = -1; var1 < class118.field1975; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class98.field1617[var1];
            }
            class153 var3 = class5.field50[var2];
            if (var3 != null) {
                class98.method786(var3, -62, var3.method1101(true));
            }
        }
        if (arg0 != 2047) {
            method678(-93, -51, -74);
        }
        field1430++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZBLhi;Lgg;)[I", line = 248)
    public final int[] method681(boolean arg0, byte arg1, class26 arg2, class126 arg3) {
        if (arg1 != 33) {
            return (int[]) null;
        }
        field1438++;
        if (this.field1432.method784(arg2, true, arg3)) {
            int var5 = arg0 ? 64 : 128;
            return this.field1432.method785(arg3, this.field1449, var5, var5, (byte) 126, 1.0D, arg2, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)V", line = 271)
    public static void method682(int arg0) {
        field1434 = null;
        field1460 = null;
        field1441 = null;
        field1445 = null;
        if (arg0 != 2) {
            field1433 = -14;
        }
        field1428 = null;
    }

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "(I)V", line = 285)
    public static final void method683(int arg0) {
        field1454++;
        if (arg0 != 29639) {
            field1433 = 41;
        }
        class168.method1199(104, 104);
        class30.method198(class281.field4800, false, class53.field781);
        class187.method1315(class53.field781, (byte) 122);
        if (class118.field1983 == 10) {
            class276.method1889(-128, 28);
        }
        if (class118.field1983 == 30) {
            class276.method1889(-128, 25);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIII)V", line = 305)
    public static final void method684(int arg0, int arg1, int arg2, int arg3) {
        class43.field658 = new class166[arg0][arg1][arg2];
        class72.field1106 = new int[arg0][arg1 + 1][arg2 + 1];
        class73.field1124 = new class224[4][];
        class250.method1743(false);
        class114.field1900 = arg1;
        class252.field4273 = arg2;
        class183.field2926 = new int[arg0][arg1 + 1][arg2 + 1];
        class52.method340();
        class1.field9 = arg3;
        class308.field5290 = new boolean[class1.field9 + class1.field9 + 1][class1.field9 + class1.field9 + 1];
        class228.field3966 = new boolean[class1.field9 + class1.field9 + 2][class1.field9 + class1.field9 + 2];
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lgg;ILhi;Z)Z", line = 321)
    public final boolean method685(class126 arg0, int arg1, class26 arg2, boolean arg3) {
        field1451++;
        if (!this.field1432.method784(arg2, true, arg0)) {
            return false;
        }
        int var5 = 101 % ((-arg1 - 6) / 55);
        GL var6 = class154.field2479;
        int var7 = arg3 ? 64 : 128;
        int var8 = class140.method1047(-108);
        if ((var8 & 0x1) == 0) {
            if (this.field1456 == -1) {
                int[] var9 = new int[1];
                var6.glGenTextures(1, var9, 0);
                this.field1456 = var9[0];
                this.field1459 = class79.field1324;
                class154.method1141(this.field1456);
                ByteBuffer var10 = ByteBuffer.wrap(this.field1432.method788(0.7D, arg2, var7, var7, arg0, this.field1449, 0));
                if (this.field1452 == 2) {
                    GLU var11 = new GLU();
                    var11.gluBuild2DMipmaps(3553, 6408, var7, var7, 6408, 5121, var10);
                    var6.glTexParameteri(3553, 10241, 9987);
                    var6.glTexParameteri(3553, 10240, 9729);
                    class79.field1326 += var10.limit() * 4 / 3 - this.field1458;
                    this.field1458 = var10.limit() * 4 / 3;
                } else if (this.field1452 == 1) {
                    int var12 = 0;
                    while (true) {
                        var6.glTexImage2D(3553, var12++, 6408, var7, var7, 0, 6408, 5121, var10);
                        var7 >>= 0x1;
                        if (var7 == 0) {
                            var6.glTexParameteri(3553, 10241, 9987);
                            var6.glTexParameteri(3553, 10240, 9729);
                            class79.field1326 += var10.limit() * 4 / 3 - this.field1458;
                            this.field1458 = var10.limit() * 4 / 3;
                            break;
                        }
                        var10 = ByteBuffer.wrap(this.field1432.method788(0.7D, arg2, var7, var7, arg0, this.field1449, 0));
                    }
                } else {
                    var6.glTexImage2D(3553, 0, 6408, var7, var7, 0, 6408, 5121, var10);
                    var6.glTexParameteri(3553, 10241, 9729);
                    var6.glTexParameteri(3553, 10240, 9729);
                    class79.field1326 += var10.limit() - this.field1458;
                    this.field1458 = var10.limit();
                }
                var6.glTexParameteri(3553, 10242, this.field1447 ? 10497 : 33071);
                var6.glTexParameteri(3553, 10243, this.field1446 ? 10497 : 33071);
            } else {
                class154.method1141(this.field1456);
            }
        }
        if ((var8 & 0x2) == 0) {
            class154.method1115(this.field1450);
        }
        if ((var8 & 0x4) == 0) {
            class154.method1128(0);
        }
        if ((var8 & 0x8) == 0) {
            if (this.field1453 == 0 && this.field1444 == 0) {
                class154.method1107();
            } else {
                float var13 = (float) (class154.field2455 * this.field1453) / (float) var7;
                float var14 = (float) (class154.field2455 * this.field1444) / (float) var7;
                class154.method1130(var14, var13, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIIIIIII)V", line = 436)
    public static final void method686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg6 - arg2;
        field1455++;
        boolean var12;
        if (class116.field1937 > 0 && (class116.field1937 % 10) < 5) {
            var12 = true;
        } else {
            var12 = false;
        }
        int var13 = arg4 - arg0;
        int var14 = 983040 / arg9;
        int var15 = 983040 / arg8;
        for (int var16 = -var15; var16 < (var11 + var15); var16++) {
            int var17 = arg8 * var16 + arg10 >> 16;
            int var18 = (var16 + 1) * arg8 + arg10 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                int var10000 = arg1 + var18;
                int var21 = arg1 + var17;
                int var22 = arg2 + var16 >> 6;
                if (var22 >= 0 && class32.field445.length - 1 >= var22) {
                    int[][] var23 = class32.field445[var22];
                    for (int var24 = -var14; var24 < var13 + var14; var24++) {
                        int var25 = arg7 + (arg9 * var24) >> 16;
                        int var26 = (var24 + 1) * arg9 + arg7 >> 16;
                        int var27 = var26 - var25;
                        if (var27 > 0) {
                            var10000 = arg5 + var26;
                            int var29 = arg5 + var25;
                            int var30 = var24 + arg0 >> 6;
                            if (var30 >= 0 && var23.length - 1 >= var30 && var23[var30] != null) {
                                int var31 = (arg0 + var24 & 0x3F << 6) + (var16 + arg2 & 0x3F);
                                int var32 = var23[var30][var31];
                                if (var32 != 0) {
                                    class216 var33 = class252.method1755(var32 - 1, (byte) -42);
                                    if (var12 && class36.field479 == var33.field3704) {
                                        class119 var34 = new class119();
                                        var34.field1998 = var33.field3704;
                                        var34.field1986 = var21;
                                        var34.field1985 = var29;
                                        class20.field209.method330(var34, 51);
                                    }
                                    field1434[var33.field3704].method305(var21 - 7, var29 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        class119 var35 = (class119) class20.field209.method334(-18673);
        int var36 = -9 % ((-arg3 - 51) / 39);
        while (var35 != null) {
            field1434[var35.field1998].method305(var35.field1986 - 7, var35.field1985 + -7);
            class280.method1909(var35.field1986, var35.field1985, 15, 16776960, 128);
            class280.method1909(var35.field1986, var35.field1985, 7, 16777215, 256);
            var35 = (class119) class20.field209.method335((byte) 76);
        }
        class20.field209.method328(false);
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lmi;)V", line = 670)
    public class91(class92 arg0) {
        this.field1432 = new class98(arg0);
        this.field1443 = arg0.method702(-1) == 1;
        this.field1449 = arg0.method702(-1) == 1;
        this.field1447 = arg0.method702(-1) == 1;
        this.field1446 = arg0.method702(-1) == 1;
        int var2 = arg0.method702(-1) & 0x3;
        this.field1444 = arg0.method743((byte) 23);
        this.field1453 = arg0.method743((byte) 120);
        int var3 = arg0.method702(-1);
        arg0.method702(-1);
        if (var2 == 1) {
            this.field1450 = 2;
        } else if (var2 == 2) {
            this.field1450 = 3;
        } else if (var2 == 3) {
            this.field1450 = 4;
        } else {
            this.field1450 = 0;
        }
        this.field1452 = var3 >> 4 & 0xF;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)V", line = 560)
    public final void method687(int arg0, int arg1) {
        field1437++;
        if (this.field1457 == null) {
            return;
        }
        if (this.field1453 != 0 || this.field1444 != 0) {
            if (class38.field582 == null || class38.field582.length < this.field1457.length) {
                class38.field582 = new int[this.field1457.length];
            }
            int var3 = this.field1457.length == 4096 ? 64 : 128;
            int var4 = this.field1457.length;
            int var5 = var3 - 1;
            int var6 = this.field1444 * arg0;
            int var7 = var4 - 1;
            int var8 = arg0 * var3 * this.field1453;
            for (int var9 = 0; var9 < var4; var9 += var3) {
                int var10 = var7 & var8 + var9;
                for (int var11 = 0; var11 < var3; var11++) {
                    int var12 = var9 + var11;
                    int var13 = (var5 & var6 + var11) + var10;
                    class38.field582[var12] = this.field1457[var13];
                }
            }
            int[] var14 = this.field1457;
            this.field1457 = class38.field582;
            class38.field582 = var14;
        }
        if (arg1 != 0) {
            method678(-95, 14, 59);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lhi;BLgg;)Z", line = 623)
    public final boolean method688(class26 arg0, byte arg1, class126 arg2) {
        field1439++;
        return arg1 == 86 ? this.field1432.method784(arg0, true, arg2) : true;
    }

    @OriginalMember(owner = "client!fm", name = "finalize", descriptor = "()V", line = 634)
    protected final void finalize() throws Throwable {
        if (this.field1456 != -1) {
            class79.method614(this.field1456, this.field1458, this.field1459);
            this.field1456 = -1;
            this.field1458 = 0;
        }
        super.finalize();
        field1436++;
    }
}
