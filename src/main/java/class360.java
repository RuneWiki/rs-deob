import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class360 extends class425 {

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "Ler;")
    private class55 field5189;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
    private int field5187;

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "I")
    private int field5194;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "[I")
    private int[] field5190;

    @OriginalMember(owner = "client!qs", name = "x", descriptor = "I")
    private int field5196;

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "F")
    private float field5193;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "Lig;")
    private class132 field5191;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "Lpg;")
    private class437 field5195;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "Lwi;")
    private class273 field5188;

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5192;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IFIII)V", line = 8)
    public final void method2340(int arg0, float arg1, int arg2, int arg3, int arg4) {
        if (this.field5194 != -1) {
            class287 var6 = this.field5191.field1915.method1475(this.field5194, arg0 + 24012);
            int var7 = var6.field4182 & 0xFF;
            if (var7 != 0 && var6.field4165 != 4) {
                int var8;
                if (arg3 < 0) {
                    var8 = 0;
                } else if (arg3 <= 127) {
                    var8 = arg3 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((var8 & 0xFF00FF) * var7 + ((arg4 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg4 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field4172 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg4 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg4 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg4 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg4 = (var14 >> 8) + ((var12 & 0x9800FF00) << 8) + (var13 & 0xFF00);
            }
        }
        this.field5192.position(arg2 * 4);
        if (arg1 != 1.0F) {
            int var15 = (arg4 & 0xFFD503) >> 16;
            int var16 = arg4 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg1);
            int var18 = arg4 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg1);
            int var20 = (int) ((float) var18 * arg1);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg4 = var20 | var19 << 8 | var17 << 16;
        }
        this.field5192.put((byte) (arg4 >> 16));
        this.field5192.put((byte) (arg4 >> 8));
        if (arg0 != -6339) {
            this.method2345(-58, -11);
        }
        this.field5192.put((byte) arg4);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)V", line = 117)
    public final void method2341(int arg0, int arg1) {
        this.field5192.position(arg0 * arg1 + 3);
        this.field5192.put((byte) -1);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIB)V", line = 127)
    public final void method2342(int arg0, int arg1, int arg2, byte arg3) {
        this.field5190[this.field5189.field1187 * arg1 + arg2] = class332.method2176(this.field5190[this.field5189.field1187 * arg1 + arg2], 0x1 << arg0);
        if (arg3 != 12) {
            this.field5188 = (class273) null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(II)V", line = 138)
    public final void method2343(int arg0, int arg1) {
        this.field5192.position(arg1 * 4);
        if (arg0 >= 88) {
            this.field5192.flip();
            class454 var3 = this.field5191.method922(0, this.field5192, false);
            this.field5188 = new class273(this.field5191, var3, 5121, 4, 0);
            this.field5192 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "([III)V", line = 154)
    public final void method2344(int[] arg0, int arg1, int arg2) {
        int var4 = 0;
        class130 var5 = class55.field718;
        var5.field1880 = 0;
        if (this.field5191.field1998) {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg0[var12];
                short[] var14 = this.field5189.field717[var13];
                int var15 = this.field5190[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var14.length > var17) {
                        if ((var15 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var5.method799(var14[var17++] & 0xFFFF, 51);
                            var4++;
                            var4++;
                            var5.method799(var14[var17++] & 0xFFFF, 118);
                            var4++;
                            var5.method799(var14[var17++] & 0xFFFF, -83);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg0[var6];
                int var8 = this.field5190[var7];
                short[] var9 = this.field5189.field717[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var9.length) {
                        if ((var8 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method827(var9[var11++] & 0xFFFF, 126);
                            var4++;
                            var5.method827(var9[var11++] & 0xFFFF, 125);
                            var4++;
                            var5.method827(var9[var11++] & 0xFFFF, 125);
                        }
                    }
                }
            }
        }
        int var18 = 75 / ((28 - arg2) / 61);
        if (var4 <= 0) {
            return;
        }
        opengl var19 = this.field5191.field1918;
        this.field5191.method894(this.field5194, (this.field5189.field719 & 0x7) != 0, (this.field5189.field719 & 0x8) != 0);
        if (this.field5191.field1958) {
            this.field5191.method893(Integer.MAX_VALUE, this.field5187, this.field5196);
        }
        this.field5195.method1980(5123, var5.field1851, var5.field1880);
        var19.glMatrixMode(5890);
        var19.glPushMatrix();
        var19.glScalef(1.0F / this.field5193, 1.0F / this.field5193, 1.0F);
        var19.glMatrixMode(5888);
        this.field5191.method961(this.field5189.field732, this.field5189.field734, this.field5188, this.field5189.field731);
        this.field5191.method982(this.field5195, 4, 0, var4);
        var19.glMatrixMode(5890);
        var19.glPopMatrix();
        var19.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(II)V", line = 279)
    public final void method2345(int arg0, int arg1) {
        this.field5192 = ByteBuffer.allocateDirect(arg0 * 4);
        if (arg1 != 18474) {
            this.method2343(18, -64);
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Ler;IIII)V", line = 287)
    public class360(class55 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5189 = arg0;
        this.field5187 = arg3;
        this.field5194 = arg1;
        this.field5190 = new int[this.field5189.field1187 * this.field5189.field1183];
        this.field5196 = arg4;
        this.field5193 = (float) arg2;
        this.field5191 = this.field5189.field707;
        this.field5195 = new class437(this.field5191, 5123, (byte[]) null, 1);
    }
}
