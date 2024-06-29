import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class107 {

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    private int field1552 = -1;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
    private int field1561 = -1;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "Z")
    private boolean field1562 = true;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    private int field1555;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    private int field1546;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    private int field1554;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "Z")
    private boolean field1556;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    private int field1548;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    private int field1558;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    private int field1544;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    private int field1550;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    private static int field1559 = -1;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "[I")
    private static int[] field1566 = new int[4];

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "I")
    private static int field1567 = -1;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    private int field1549;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    private int field1551;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    private int field1553;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    private int field1557;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    public int field1563;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "Ltf;")
    private static class128 field1565;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Laf;")
    private class195 field1545;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1547;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1564;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "[B")
    private static byte[] field1560;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "()V", line = 5)
    private static final void method793() {
        if (field1565 != null) {
            return;
        }
        class128 var0 = field1565 = new class128(260, 480, 0);
        int[] var1 = var0.field1916;
        int[] var2 = var0.field1900;
        int[] var3 = var0.field1920;
        int[] var4 = var0.field1912;
        int[] var5 = var0.field1943;
        int[] var6 = var0.field1936;
        var0.field1933 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class164.field2650[var8] >> 1;
            int var10 = class164.field2664[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var12 = var11 * 1024 / 16;
                int var13 = class164.field2664[var12] >> 9;
                int var14 = (class164.field2650[var12] >> 1) * var9 >> 23;
                int var15 = (class164.field2650[var12] >> 1) * var10 >> 23;
                var1[var0.field1933] = var15;
                var2[var0.field1933] = var13;
                var3[var0.field1933] = -var14;
                var0.field1933++;
            }
            if (var7 > 0) {
                int var16 = var7 * 15 + 2;
                int var17 = var16 - 15;
                var4[var0.field1902] = 0;
                var5[var0.field1902] = var17;
                var6[var0.field1902] = var16;
                var0.field1902++;
                for (int var18 = 1; var18 < 15; var18++) {
                    int var19 = var17 + 1;
                    int var20 = var16 + 1;
                    var4[var0.field1902] = var17;
                    var5[var0.field1902] = var19;
                    var6[var0.field1902] = var16;
                    var0.field1902++;
                    var4[var0.field1902] = var19;
                    var5[var0.field1902] = var20;
                    var6[var0.field1902] = var16;
                    var0.field1902++;
                    var17 = var19;
                    var16 = var20;
                }
                var4[var0.field1902] = var16;
                var5[var0.field1902] = var17;
                var6[var0.field1902] = 1;
                var0.field1902++;
            }
        }
        var0.field1946 = var0.field1933;
        var0.field1922 = null;
        var0.field1901 = null;
        var0.field1932 = null;
        var0.field1923 = null;
        var0.field1919 = null;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "()V", line = 119)
    private static final void method794() {
        if (field1564 != null) {
            return;
        }
        class254 var0 = new class254(1088);
        class254 var1 = new class254(5140);
        if (class73.field1075) {
            var1.method1779((byte) 116, 0.0F);
            var1.method1779((byte) -79, 1.0F);
            var1.method1779((byte) -82, 0.0F);
            var1.method1779((byte) 120, 0.5F);
            var1.method1779((byte) -109, 1.0F);
            var1.method1779((byte) -103, 0.0F);
            var1.method1779((byte) -27, -1.0F);
            var1.method1779((byte) 127, 0.0F);
            var1.method1779((byte) -70, 0.5F);
            var1.method1779((byte) -62, 0.0F);
        } else {
            var1.method1757(96, 0.0F);
            var1.method1757(-28, 1.0F);
            var1.method1757(-21, 0.0F);
            var1.method1757(-64, 0.5F);
            var1.method1757(-126, 1.0F);
            var1.method1757(-16, 0.0F);
            var1.method1757(113, -1.0F);
            var1.method1757(-34, 0.0F);
            var1.method1757(-105, 0.5F);
            var1.method1757(-107, 0.0F);
        }
        float var2 = 0.0F;
        float var3 = 0.05882353F;
        for (int var4 = 0; var4 <= 16; var4++) {
            int var5 = var4 * 1024 / 16;
            float var6 = (float) class164.field2650[var5] / 65535.0F;
            float var7 = (float) class164.field2664[var5] / 65535.0F;
            for (int var8 = 1; var8 < 16; var8++) {
                int var9 = var8 * 1024 / 16;
                float var10 = (float) class164.field2664[var9] / 65535.0F;
                float var11 = (float) class164.field2650[var9] * var6 / 65535.0F;
                float var12 = (float) class164.field2650[var9] * var7 / 65535.0F;
                if (class73.field1075) {
                    var1.method1779((byte) 126, var12);
                    var1.method1779((byte) 114, var10);
                    var1.method1779((byte) -97, var11);
                    var1.method1779((byte) -79, var2);
                    var1.method1779((byte) -101, var3);
                } else {
                    var1.method1757(120, var12);
                    var1.method1757(-79, var10);
                    var1.method1757(-36, var11);
                    var1.method1757(-102, var2);
                    var1.method1757(105, var3);
                }
                var3 += 0.05882353F;
            }
            if (var4 > 0) {
                int var13 = var4 * 15 + 2;
                int var14 = var13 - 15;
                if (class73.field1075) {
                    var0.method1744(true, 0);
                    var0.method1744(true, 0);
                    for (int var15 = 1; var15 < 16; var15++) {
                        var0.method1744(true, var14++);
                        var0.method1744(true, var13++);
                    }
                    var0.method1744(true, 1);
                    var0.method1744(true, 1);
                } else {
                    var0.method1743((byte) 124, 0);
                    var0.method1743((byte) 124, 0);
                    for (int var16 = 1; var16 < 16; var16++) {
                        var0.method1743((byte) 124, var14++);
                        var0.method1743((byte) 124, var13++);
                    }
                    var0.method1743((byte) 124, 1);
                    var0.method1743((byte) 124, 1);
                }
            }
            var2 += 0.05882353F;
            var3 = 0.05882353F;
        }
        field1564 = ByteBuffer.allocateDirect(var1.field3866);
        field1564.put(var1.field3840, 0, var1.field3866);
        field1564.flip();
        field1547 = ByteBuffer.allocateDirect(var0.field3866);
        field1547.put(var0.field3840, 0, var0.field3866);
        field1547.flip();
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lok;)V", line = 271)
    private final void method795(class107 arg0) {
        class128 var2 = class128.method956(class221.field3372, this.field1548, 0);
        if (var2 == null) {
            return;
        }
        this.field1545 = new class195(this.field1551, this.field1551);
        class287.method1974(field1566);
        this.field1545.method1430();
        class164.method1228();
        class287.method1987(0, 0, this.field1551, this.field1551, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field1556) {
                var3 = -arg0.field1555;
                var4 = -arg0.field1546;
                var5 = -arg0.field1554;
            } else {
                var3 = this.field1555 - arg0.field1555;
                var4 = this.field1546 - arg0.field1546;
                var5 = this.field1554 - arg0.field1554;
            }
        }
        if (this.field1553 != 0) {
            int var6 = class164.field2650[this.field1553];
            int var7 = class164.field2664[this.field1553];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field1549 != 0) {
            int var9 = this.field1549 - 1024 & 0x7FF;
            int var10 = class164.field2650[var9];
            int var11 = class164.field2664[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class113 var13 = var2.method969(64, 768, -var3, -var4, -var5);
        int var14 = var13.method575() - var13.method582();
        int var15 = var13.method585() - var13.method565();
        int var16 = var13.method582() + var14 / 2;
        int var17 = var13.method565() + var15 / 2;
        if (var14 > var15) {
            var13.method868(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field1551);
        } else {
            var13.method868(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field1551);
        }
        class13.field186.method1554(9969);
        class287.method1989(field1566);
        class164.method1228();
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(Lok;)V", line = 356)
    public final void method796(class107 arg0) {
        if (this.field1550 == 0) {
            return;
        }
        boolean var2 = this.field1561 == -1 || class80.field1183 != this.field1552;
        if (!this.field1562 && !var2) {
            return;
        }
        if (var2) {
            this.field1552 = class80.field1183;
            this.field1561 = class150.method1131(class150.field2265, this.field1551, this.field1551);
        } else {
            class73.method537(this.field1561);
            class150.method1123(class150.field2265, this.field1551, this.field1551);
        }
        if (this.field1550 == 1) {
            this.method800(arg0);
            this.field1562 = false;
        } else if (this.field1550 == 2) {
            this.field1562 = !this.method798(arg0);
        }
    }

    @OriginalMember(owner = "client!ok", name = "finalize", descriptor = "()V", line = 395)
    protected final void finalize() throws Throwable {
        this.method812();
        super.finalize();
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(Lok;)V", line = 400)
    private final void method797(class107 arg0) {
        method793();
        method799();
        this.field1545 = new class17(this.field1551, this.field1551);
        class287.method1974(field1566);
        this.field1545.method1430();
        class164.method1228();
        class287.method1987(0, 0, this.field1551, this.field1551, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field1556) {
                var2 = -arg0.field1555;
                var3 = -arg0.field1546;
                var4 = -arg0.field1554;
            } else {
                var2 = this.field1555 - arg0.field1555;
                var3 = this.field1546 - arg0.field1546;
                var4 = this.field1554 - arg0.field1554;
            }
        }
        if (this.field1553 != 0) {
            int var5 = class164.field2650[this.field1553];
            int var6 = class164.field2664[this.field1553];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field1549 != 0) {
            int var8 = this.field1549 - 1024 & 0x7FF;
            int var9 = class164.field2650[var8];
            int var10 = class164.field2664[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class126.method942(field1565.field1950, 0, field1565.field1902, (short) class164.field2662.method672(-28889, this.field1548));
        class113 var12 = field1565.method969(64, 512, -var2, -var3, -var4);
        int var13 = var12.method575() - var12.method582();
        int var14 = var12.method585() - var12.method565();
        if (var13 > var14) {
            int var15 = this.field1558 == 0 ? (var13 << 9) / this.field1551 : (var13 * 16 << 9) / (this.field1551 * 13);
            var12.method868(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field1558 == 0 ? (var14 << 9) / this.field1551 : (var14 * 16 << 9) / (this.field1551 * 13);
            var12.method868(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field1558 == 0) {
            for (int var17 = 0; var17 < class287.field4453.length; var17++) {
                if (class287.field4453[var17] != 0) {
                    class287.field4453[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method805();
            this.method803();
        }
        class13.field186.method1554(9969);
        class287.method1989(field1566);
        class164.method1228();
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(Lok;)Z", line = 502)
    private final boolean method798(class107 arg0) {
        class128 var2 = class128.method956(class221.field3372, this.field1548, 0);
        if (var2 == null) {
            return false;
        }
        GL var3 = class73.field1051;
        class175.method1324(field1566);
        class175.method1314();
        var3.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        var3.glClear(16640);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg0 != null) {
            if (arg0.field1556) {
                var4 = -arg0.field1555;
                var5 = -arg0.field1546;
                var6 = -arg0.field1554;
            } else {
                var4 = this.field1555 - arg0.field1555;
                var5 = this.field1546 - arg0.field1546;
                var6 = this.field1554 - arg0.field1554;
            }
        }
        var2.method965();
        class74 var7 = var2.method967(64, 768, -var4, -var5, -var6);
        int var8 = (var7.method575() - var7.method582()) / 2;
        int var9 = (var7.method585() - var7.method565()) / 2;
        int var10 = var8 > var9 ? var8 : var9;
        class186.method1373((float) (-var10), (float) var10, (float) (-var10), (float) var10, 2048.0F, -2048.0F, this.field1551, this.field1551);
        if (this.field1553 != 0) {
            int var11 = class164.field2650[this.field1553];
            int var12 = class164.field2664[this.field1553];
            int var13 = var5 * var12 + 32767 - var6 * var11 >> 16;
            var6 = var5 * var11 + var6 * var12 + 32767 >> 16;
            var5 = var13;
        }
        if (this.field1549 != 0) {
            int var14 = this.field1549 - 1024 & 0x7FF;
            int var15 = class164.field2650[var14];
            int var16 = class164.field2664[var14];
            int var17 = var4 * var16 + var6 * var15 + 32767 >> 16;
            var6 = var6 * var16 + 32767 - var4 * var15 >> 16;
            var4 = var17;
        }
        class179.method1343((float) (-var4), (float) var5, (float) (-var6));
        class179.method1345(16777215, 0.5F, 0.5F, 0.5F);
        class179.method1340();
        class73.method525();
        class73.method558(true);
        class73.method544(true);
        var7.method581(0, 0, 0, 0, -var8 - var7.method582(), -var9 - var7.method565(), 0, -1L);
        class73.method544(false);
        class73.method558(false);
        class73.method538();
        class186.method1374();
        class73.method537(this.field1561);
        var3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field1551, this.field1551, 0);
        class175.method1312(field1566);
        return true;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "()V", line = 591)
    private static final void method799() {
        if (field1560 != null) {
            return;
        }
        field1560 = new byte[16384];
        for (int var0 = 0; var0 < 64; var0++) {
            int var1 = 64 - var0;
            int var2 = var1 * var1;
            int var3 = 128 - var0 - 1;
            int var4 = var0 * 128;
            int var5 = var3 * 128;
            for (int var6 = 0; var6 < 64; var6++) {
                int var7 = 64 - var6;
                int var8 = var7 * var7;
                int var9 = 128 - var6 - 1;
                int var10 = 256 - (var2 + var8 << 8) / 4096;
                int var11 = var10 * 16 * 192 / 1536;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                field1560[var4 + var6] = field1560[var4 + var9] = field1560[var5 + var6] = field1560[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(Lok;)V", line = 643)
    private final void method800(class107 arg0) {
        method794();
        method802();
        GL var2 = class73.field1051;
        class175.method1324(field1566);
        class175.method1314();
        var2.glClearColor((float) ((this.field1558 & 0xFF0000) >> 16) / 255.0F, (float) ((this.field1558 & 0xFF00) >> 8) / 255.0F, (float) (this.field1558 & 0xFF) / 255.0F, 0.0F);
        var2.glClear(16640);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field1556) {
                var3 = -arg0.field1555;
                var4 = -arg0.field1546;
                var5 = -arg0.field1554;
            } else {
                var3 = this.field1555 - arg0.field1555;
                var4 = this.field1546 - arg0.field1546;
                var5 = this.field1554 - arg0.field1554;
            }
        }
        class186.method1375(-1.0F, 1.0F, -1.0F, 1.0F, this.field1551, this.field1551);
        if (this.field1553 != 0) {
            int var6 = class164.field2650[this.field1553];
            int var7 = class164.field2664[this.field1553];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field1549 != 0) {
            int var9 = this.field1549 - 1024 & 0x7FF;
            int var10 = class164.field2650[var9];
            int var11 = class164.field2664[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class179.method1343((float) (-var3), (float) (-var4), (float) var5);
        class179.method1345(16777215, 0.5F, 0.5F, 1.0F);
        class179.method1340();
        if (this.field1558 != 0) {
            var2.glScalef(0.8125F, 0.8125F, 1.0F);
        }
        class164.field2662.method673(this.field1548, (byte) -100, this.field1551);
        class73.method544(true);
        if (class73.field1066) {
            var2.glBindBufferARB(34962, 0);
            var2.glBindBufferARB(34963, 0);
        }
        var2.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var2.glDisableClientState(32886);
        var2.glNormalPointer(5126, 20, field1564.position(0));
        var2.glVertexPointer(2, 5126, 20, field1564.position(0));
        var2.glTexCoordPointer(2, 5126, 20, field1564.position(12));
        var2.glDrawElements(5, field1547.limit() / 2, 5123, field1547.position(0));
        var2.glEnableClientState(32886);
        class73.method544(false);
        if (this.field1558 != 0) {
            class241.method1672(0, -127, 0);
            class73.method519(1);
            class73.method548(0);
            class73.method537(field1567);
            var2.glColorMask(true, true, true, false);
            var2.glTexEnvi(8960, 34176, 34168);
            var2.glTexEnvi(8960, 34200, 771);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field1558 >> 16), (byte) (this.field1558 >> 8), (byte) this.field1558, (byte) 127);
            var2.glTexCoord2f(0.0F, 0.0F);
            var2.glVertex2i(-1, -1);
            var2.glTexCoord2f(1.0F, 0.0F);
            var2.glVertex2i(1, -1);
            var2.glTexCoord2f(1.0F, 1.0F);
            var2.glVertex2i(1, 1);
            var2.glTexCoord2f(0.0F, 1.0F);
            var2.glVertex2i(-1, 1);
            var2.glEnd();
            var2.glTexEnvi(8960, 34200, 770);
            var2.glLoadIdentity();
            var2.glColorMask(true, true, true, true);
            var2.glBlendFunc(773, 772);
            var2.glBegin(7);
            var2.glColor4ub((byte) (this.field1558 >> 16), (byte) (this.field1558 >> 8), (byte) this.field1558, (byte) -1);
            var2.glTexCoord2f(0.0F, 0.0F);
            var2.glVertex2i(-1, -1);
            var2.glTexCoord2f(1.0F, 0.0F);
            var2.glVertex2i(1, -1);
            var2.glTexCoord2f(1.0F, 1.0F);
            var2.glVertex2i(1, 1);
            var2.glTexCoord2f(0.0F, 1.0F);
            var2.glVertex2i(-1, 1);
            var2.glEnd();
            var2.glBlendFunc(770, 771);
            var2.glTexEnvi(8960, 34176, 5890);
        }
        class186.method1374();
        class73.method537(this.field1561);
        var2.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.field1551, this.field1551, 0);
        class175.method1312(field1566);
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "()V", line = 768)
    public static void method801() {
        field1564 = null;
        field1547 = null;
        field1565 = null;
        field1560 = null;
        field1566 = null;
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "()V", line = 776)
    private static final void method802() {
        method799();
        if (field1567 == -1 || class80.field1183 != field1559) {
            field1567 = class150.method1130(class150.field2271, 128, 128, field1560);
            field1559 = class80.field1183;
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 1173)
    public class107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field1555 = arg2;
        this.field1546 = arg3;
        this.field1554 = arg4;
        this.field1556 = arg7;
        this.field1548 = arg1;
        this.field1558 = arg6;
        this.field1544 = arg5;
        this.field1550 = arg0;
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "()V", line = 791)
    private final void method803() {
        int var1 = this.field1551;
        int var2 = this.field1551;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class287.field4452 - var1;
        if (var2 > class287.field4456) {
            var2 -= var2 - class287.field4456;
        }
        if (class287.field4454 > 0) {
            int var9 = class287.field4454;
            var2 -= var9;
            var7 += class287.field4452 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class287.field4448) {
            int var10 = var1 - class287.field4448;
            var1 -= var10;
            var8 += var10;
        }
        if (class287.field4451 > 0) {
            int var11 = class287.field4451;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method809(class287.field4453, this.field1558, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIILok;)V", line = 842)
    public final void method804(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class107 arg6) {
        int var8 = this.field1553 - arg4 & 0x7FF;
        int var9 = this.field1549 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field1557) / 2 + var10;
        int var13 = (arg2 - this.field1557) / 2 + var11;
        if (var12 < arg3 && this.field1557 + var12 > 0 && var13 < arg2 && this.field1557 + var13 > 0 && this.method806(arg6)) {
            this.field1545.method132(arg0 + var13, arg1 + var12, this.field1557, this.field1557);
        }
    }

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "()V", line = 866)
    private final void method805() {
        int var1 = this.field1551 * 3 / 32;
        int var3 = this.field1551 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class287.field4452 * var1 + var1;
        int var8 = class287.field4452 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class287.field4456) {
            var4 = var3 - (var1 + var3 - class287.field4456);
        }
        if (var1 < class287.field4454) {
            int var11 = class287.field4454 - var1;
            var4 -= var11;
            var7 += class287.field4452 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class287.field4448) {
            int var12 = var1 + var3 - class287.field4448;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class287.field4451) {
            int var13 = class287.field4451 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method810(class287.field4453, 0, this.field1558, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "(Lok;)Z", line = 925)
    private final boolean method806(class107 arg0) {
        if (this.field1545 == null) {
            if (this.field1550 == 0) {
                this.field1545 = class164.field2662.method676(class164.field2656, true, this.field1551, this.field1548, 121);
            } else if (this.field1550 == 2) {
                this.method795(arg0);
            } else if (this.field1550 == 1) {
                this.method797(arg0);
            }
        }
        return this.field1545 != null;
    }

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "()V", line = 960)
    public static final void method807() {
        if (field1567 != -1) {
            class80.method625(field1567, 0, field1559);
        }
        field1567 = -1;
        field1559 = -1;
        field1564 = null;
        field1547 = null;
        field1565 = null;
        field1560 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIII)V", line = 972)
    public final void method808(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field1553 - arg4 & 0x7FF;
        int var8 = this.field1549 - arg5 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = arg3 * var7 / 512;
        int var10 = arg3 * var8 / -512;
        int var11 = (arg3 - this.field1557) / 2 + var9;
        int var12 = (arg2 - this.field1557) / 2 + var10;
        if (var11 >= arg3 || this.field1557 + var11 <= 0 || var12 >= arg2 || this.field1557 + var12 <= 0) {
            return;
        }
        if (this.field1550 == 0) {
            class164.field2662.method673(this.field1548, (byte) -95, this.field1551);
        } else if (this.field1561 == -1) {
            return;
        } else {
            class73.method537(this.field1561);
        }
        int var13 = arg1 + var11;
        int var14 = arg0 + var12;
        int var15 = this.field1557 + var14;
        int var16 = this.field1557 + var13;
        GL var17 = class73.field1051;
        var17.glBegin(7);
        var17.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        var17.glTexCoord2f(0.0F, 0.0F);
        var17.glVertex2i(var14, var13);
        var17.glTexCoord2f(0.0F, 1.0F);
        var17.glVertex2i(var14, var16);
        var17.glTexCoord2f(1.0F, 1.0F);
        var17.glVertex2i(var15, var16);
        var17.glTexCoord2f(1.0F, 0.0F);
        var17.glVertex2i(var15, var13);
        var17.glEnd();
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([IIIIIIIIIII)V", line = 1024)
    private final void method809(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field1560[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
                } else {
                    arg0[arg4] |= 0xFF000000;
                }
                arg4++;
                arg2 += arg8;
            }
            arg3 += arg9;
            arg2 = var12;
            arg4 += arg5;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([IIIIIIIIIIII)V", line = 1060)
    private final void method810(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field1560[(arg3 >> 16) + var15] & 0xFF) + 64;
                    if (var18 > 255) {
                        var18 = 255;
                    }
                    int var19 = 256 - var18;
                    arg0[arg5] = ((arg2 & 0xFF00FF) * var19 + (var17 & 0xFF00FF) * var18 & -16711936) + ((arg2 & 0xFF00) * var19 + (var17 & 0xFF00) * var18 & 0xFF0000) >> 8 | 0xFF000000;
                }
                arg5++;
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)Z", line = 1104)
    public final boolean method811(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field1556) {
            this.field1563 = 1073741823;
            var8 = this.field1555;
            var9 = this.field1546;
            var10 = this.field1554;
        } else {
            int var5 = this.field1555 - arg0;
            int var6 = this.field1546 - arg1;
            int var7 = this.field1554 - arg2;
            this.field1563 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field1563 == 0) {
                this.field1563 = 1;
            }
            var8 = (var5 << 8) / this.field1563;
            var9 = (var6 << 8) / this.field1563;
            var10 = (var7 << 8) / this.field1563;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field1557 = this.field1544 * arg3 / (this.field1556 ? 1024 : this.field1563);
        } else {
            this.field1557 = 0;
        }
        if (this.field1557 < 8) {
            this.method812();
            this.field1545 = null;
            return false;
        }
        int var12 = class224.method1595(this.field1557, -124);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field1551 != var12) {
            this.field1551 = var12;
        }
        this.field1553 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field1549 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field1562 = true;
        this.field1545 = null;
        return true;
    }

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "()V", line = 1163)
    private final void method812() {
        if (this.field1561 != -1) {
            class80.method625(this.field1561, 0, this.field1552);
        }
        this.field1562 = true;
        this.field1561 = -1;
    }
}
