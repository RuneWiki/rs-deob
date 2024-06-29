import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class36 extends class192 {

    @OriginalMember(owner = "client!je", name = "K", descriptor = "I")
    private int field461 = 0;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "Z")
    public boolean field463 = false;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "I")
    private int field452 = -1;

    @OriginalMember(owner = "client!je", name = "eb", descriptor = "Lkm;")
    private class87 field481;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "Z")
    private boolean field467;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "Z")
    private boolean field454;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "Z")
    private boolean field472;

    @OriginalMember(owner = "client!je", name = "fb", descriptor = "Z")
    private boolean field482;

    @OriginalMember(owner = "client!je", name = "X", descriptor = "I")
    private int field474;

    @OriginalMember(owner = "client!je", name = "cb", descriptor = "I")
    private int field479;

    @OriginalMember(owner = "client!je", name = "T", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client!je", name = "bb", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client!je", name = "R", descriptor = "I")
    public static int field468 = 0;

    @OriginalMember(owner = "client!je", name = "ab", descriptor = "I")
    public static int field477 = 1;

    @OriginalMember(owner = "client!je", name = "Y", descriptor = "Z")
    public static boolean field475 = false;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "F")
    public static float field459;

    @OriginalMember(owner = "client!je", name = "S", descriptor = "F")
    private float field469;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    private int field453;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!je", name = "W", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "[I")
    public static int[] field457;

    @OriginalMember(owner = "client!je", name = "Z", descriptor = "[I")
    private int[] field476;

    @OriginalMember(owner = "client!je", name = "db", descriptor = "[Ljh;")
    public static class226[] field480;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "[Loh;")
    public static class258[] field462;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLck;ZLck;ZII)I", line = 7)
    public static final int method270(byte arg0, class98 arg1, boolean arg2, class98 arg3, boolean arg4, int arg5, int arg6) {
        field465++;
        int var7 = class114.method856(arg2, arg6, arg1, arg3, true);
        if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else if (arg0 == -9) {
            int var8 = class114.method856(arg4, arg5, arg1, arg3, true);
            return arg4 ? -var8 : var8;
        } else {
            return 55;
        }
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(B)V", line = 54)
    public static void method271(byte arg0) {
        field480 = null;
        field457 = null;
        int var1 = 94 / ((arg0 + 15) / 34);
        field462 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lgb;Z)V", line = 71)
    public static final void method272(class213 arg0, boolean arg1) {
        class124.field2191 = arg0.method1451(-124, class85.field1441);
        if (!arg1) {
            field475 = true;
        }
        field458++;
        class225.field3862 = arg0.method1451(-128, class245.field4266);
        class232.field4025 = arg0.method1451(-127, class169.field2866);
        class13.field170 = arg0.method1451(-128, class276.field4758);
        class23.field295 = arg0.method1451(-128, class117.field2072);
        class110.field1933 = arg0.method1451(-126, class73.field1282);
        class72.field1270 = arg0.method1451(-123, class20.field245);
        class7.field96 = arg0.method1451(-125, class75.field1313);
        class83.field1397 = arg0.method1451(-128, class268.field4662);
        class139.field2376 = arg0.method1451(-123, class220.field3811);
        class93.field1640 = arg0.method1451(-124, class43.field640);
        class130.field2296 = arg0.method1451(-124, class307.field5215);
        class231.field3995 = arg0.method1451(-123, class172.field3083);
        class86.field1465 = arg0.method1451(-123, class31.field370);
        client.field619 = arg0.method1451(-126, class181.field3253);
        class94.field1650 = arg0.method1451(-124, class189.field3344);
        class14.field178 = arg0.method1451(-127, class181.field3237);
        class235.field4055 = arg0.method1451(-128, class76.field1328);
        class105.field1890 = arg0.method1451(-128, class280.field4817);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lgb;BLu;Z)Z", line = 103)
    public final boolean method273(class213 arg0, byte arg1, class24 arg2, boolean arg3) {
        field460++;
        if (!this.field481.method625(arg0, -98, arg2)) {
            return false;
        }
        GL var5 = class257.field4409;
        int var6 = arg3 ? 64 : 128;
        if (arg1 != -122) {
            this.method276(-39, -110);
        }
        int var7 = class79.method570(0);
        if ((var7 & 0x1) == 0) {
            if (this.field452 == -1) {
                int[] var8 = new int[1];
                var5.glGenTextures(1, var8, 0);
                this.field453 = class196.field3439;
                this.field452 = var8[0];
                class257.method1736(this.field452);
                ByteBuffer var9 = ByteBuffer.wrap(this.field481.method628(arg0, 0.7D, 24629, var6, var6, this.field454, arg2));
                if (this.field470 == 2) {
                    GLU var11 = new GLU();
                    var11.gluBuild2DMipmaps(3553, 6408, var6, var6, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9987);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class196.field3442 += var9.limit() * 4 / 3 - this.field461;
                    this.field461 = var9.limit() * 4 / 3;
                } else if (this.field470 == 1) {
                    int var10 = 0;
                    while (true) {
                        var5.glTexImage2D(3553, var10++, 6408, var6, var6, 0, 6408, 5121, var9);
                        var6 >>= 0x1;
                        if (var6 == 0) {
                            var5.glTexParameteri(3553, 10241, 9987);
                            var5.glTexParameteri(3553, 10240, 9729);
                            class196.field3442 += var9.limit() * 4 / 3 - this.field461;
                            this.field461 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field481.method628(arg0, 0.7D, 24629, var6, var6, this.field454, arg2));
                    }
                } else {
                    var5.glTexImage2D(3553, 0, 6408, var6, var6, 0, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9729);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class196.field3442 += var9.limit() - this.field461;
                    this.field461 = var9.limit();
                }
                var5.glTexParameteri(3553, 10242, this.field472 ? 10497 : 33071);
                var5.glTexParameteri(3553, 10243, this.field482 ? 10497 : 33071);
            } else {
                class257.method1736(this.field452);
            }
        }
        if ((var7 & 0x2) == 0) {
            class257.method1758(this.field478);
        }
        if ((var7 & 0x4) == 0) {
            class257.method1750(0);
        }
        if ((var7 & 0x8) == 0) {
            if (this.field479 == 0 && this.field474 == 0) {
                class257.method1743();
            } else {
                float var12 = (float) (class257.field4407 * this.field479) / (float) var6;
                float var13 = (float) (class257.field4407 * this.field474) / (float) var6;
                class257.method1762(var13, var12, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZFZLu;Lgb;)[I", line = 207)
    public final int[] method274(boolean arg0, float arg1, boolean arg2, class24 arg3, class213 arg4) {
        field466++;
        if (this.field476 == null || this.field469 != arg1) {
            if (!this.field481.method625(arg4, -128, arg3)) {
                return null;
            }
            int var6 = arg2 ? 64 : 128;
            this.field476 = this.field481.method624(arg4, (double) arg1, var6, arg3, true, this.field454, var6, (byte) -118);
            this.field469 = arg1;
            if (this.field467) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var12 = var6 - 1;
                int var13 = var6;
                int var14 = var6 - 1;
                int var15 = var6 * var6;
                int var16;
                int var17 = var16 = var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var14; var19 >= 0; var19--) {
                        var16--;
                        int var20 = this.field476[var16];
                        var7[var19] += class2.method15(var20, 16757364) >> 16;
                        var8[var19] += class2.method15(var20 >> 8, 255);
                        var9[var19] += class2.method15(var20, 255);
                    }
                    if (var16 == 0) {
                        var16 = var15;
                    }
                }
                int var21 = var15;
                for (int var22 = var12; var22 >= 0; var22--) {
                    int var23 = 1;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = 1;
                    for (int var28 = 2; var28 >= 0; var28--) {
                        var27--;
                        var26 += var7[var27];
                        var25 += var9[var27];
                        var24 += var8[var27];
                        if (var27 == 0) {
                            var27 = var13;
                        }
                    }
                    for (int var29 = var14; var29 >= 0; var29--) {
                        var23--;
                        int var30 = var24 / 9;
                        int var31 = var25 / 9;
                        var27--;
                        int var32 = var26 / 9;
                        var21--;
                        var10[var21] = class307.method2139(class307.method2139(var32 << 16, var30 << 8), var31);
                        var26 += var7[var27] - var7[var23];
                        var24 += var8[var27] - var8[var23];
                        var25 += var9[var27] - var9[var23];
                        if (var23 == 0) {
                            var23 = var13;
                        }
                        if (var27 == 0) {
                            var27 = var13;
                        }
                    }
                    for (int var33 = var14; var33 >= 0; var33--) {
                        var17--;
                        int var34 = this.field476[var17];
                        var16--;
                        int var35 = this.field476[var16];
                        var7[var33] += -class2.method15(255, var34 >> 16) + class2.method15(255, var35 >> 16);
                        var8[var33] += (class2.method15(var35, 65343) >> 8) - class2.method15(255, var34 >> 8);
                        var9[var33] += -class2.method15(var34, 255) + class2.method15(var35, 255);
                    }
                    if (var16 == 0) {
                        var16 = var15;
                    }
                    if (var17 == 0) {
                        var17 = var15;
                    }
                }
                this.field476 = var10;
            }
        }
        if (!arg0) {
            this.field469 = 1.0117332F;
        }
        return this.field476;
    }

    @OriginalMember(owner = "client!je", name = "finalize", descriptor = "()V", line = 385)
    protected final void finalize() throws Throwable {
        if (this.field452 != -1) {
            class196.method1315(this.field452, this.field461, this.field453);
            this.field461 = 0;
            this.field452 = -1;
        }
        super.finalize();
        field456++;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lva;)V", line = 519)
    public class36(class235 arg0) {
        this.field481 = new class87(arg0);
        this.field467 = arg0.method1589(77) == 1;
        this.field454 = arg0.method1589(114) == 1;
        this.field472 = arg0.method1589(124) == 1;
        this.field482 = arg0.method1589(111) == 1;
        int var2 = arg0.method1589(77) & 0x3;
        this.field474 = arg0.method1617((byte) -117);
        this.field479 = arg0.method1617((byte) -117);
        int var3 = arg0.method1589(102);
        arg0.method1589(87);
        this.field470 = var3 >> 4 & 0xF;
        if (var2 == 1) {
            this.field478 = 2;
        } else if (var2 == 2) {
            this.field478 = 3;
        } else if (var2 == 3) {
            this.field478 = 4;
        } else {
            this.field478 = 0;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lgb;BLu;)Z", line = 407)
    public final boolean method275(class213 arg0, byte arg1, class24 arg2) {
        field473++;
        return arg1 == -111 ? this.field481.method625(arg0, -121, arg2) : true;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V", line = 424)
    public final void method276(int arg0, int arg1) {
        int var3 = -1 % ((-arg1 - 29) / 41);
        field471++;
        if (this.field476 == null || this.field479 == 0 && this.field474 == 0) {
            return;
        }
        if (class217.field3740 == null || class217.field3740.length < this.field476.length) {
            class217.field3740 = new int[this.field476.length];
        }
        int var4 = this.field476.length == 4096 ? 64 : 128;
        int var5 = var4 - 1;
        int var6 = this.field474 * arg0;
        int var7 = this.field476.length;
        int var8 = arg0 * var4 * this.field479;
        int var9 = var7 - 1;
        for (int var10 = 0; var10 < var7; var10 += var4) {
            int var11 = var9 & var8 + var10;
            for (int var12 = 0; var12 < var4; var12++) {
                int var13 = (var6 + var12 & var5) + var11;
                int var14 = var10 + var12;
                class217.field3740[var14] = this.field476[var13];
            }
        }
        int[] var15 = this.field476;
        this.field476 = class217.field3740;
        class217.field3740 = var15;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lgb;ZBLu;)[I", line = 490)
    public final int[] method277(class213 arg0, boolean arg1, byte arg2, class24 arg3) {
        field455++;
        if (!this.field481.method625(arg0, -123, arg3)) {
            return null;
        }
        if (arg2 >= -102) {
            this.field476 = (int[]) null;
        }
        int var5 = arg1 ? 64 : 128;
        return this.field481.method624(arg0, 1.0D, var5, arg3, false, this.field454, var5, (byte) -92);
    }
}
