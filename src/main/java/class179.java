import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public abstract class class179 implements class632 {

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    private int field2193 = 0;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    private int field2201 = -1;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "Z")
    private boolean field2205;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "Lhl;")
    public class529 field2195;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    private int field2186;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2187 = new BigInteger("974b219bf31b50bc1a89e45f6a0a59f21c9a83e19478ae976391cb262dc9b5f8ecfb2e864356ecbf7ca3cdbacd54ea298db5a159b0a64c25e03330fd744fe0a7181244f6ba5f3025afcb3f4122f5fbda4036b9a1b586eb33e732c5c3fd9a210ac8d42df187317c681060a4de30d9391e0b29ce9a6de27470fa3050f8b0868146efc885c62cf88378c9c19414ed3bbf98a4b8e28a8c9266654eccf773ab928973acc6aeec5648a9781463c5802379e7212fb5c480116a349840c5f04bb4b60f78e79d13a4e64b8843ef9d1273d8f80b198468051a93e6540e2510ffb8003046e10dc9bddd7bc30653936d6b178c2c6d086eeedd0a096878accbd80e6b5919806246167992dfad464b8a83e0b2f2cb3263a12b9937c206238a46ec1aea440d75af5a313de6324ac51a24bcaafeab1181b457145eea7a8ddc4009d1b62b118644ec363c521c6c491a879ace7fe9910b5084f8260855c86667c107164aba828126a12a95913507ae5519fa40452e66213918cc12e99430ffd8284b78bf6c827a4b0fbaeaa838dd9cd2e98bb825ff707df9e4465b51be3601dde7de933191328e1a36b0b950a71b681d35d6103a0d7d451cb32dc4f8dd196722a975a391d0048185e05d3ac876af0f15b3f72cbc9ff8132d4d2f29a315e0ad505e183d87c6a6022699c74038803e879bdd124b6f2f5106ea7d703abaaa2dfa86e5b4db14fadf34694b", 16);

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "[I")
    public static int[] field2203 = new int[4096];

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "[I")
    public static int[] field2206 = new int[200];

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "Z")
    public static boolean field2208 = true;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    private int field2190;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    private int field2196;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field2192;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZLjaggl/MapBuffer;I)Ljaclib/memory/Buffer;", line = 3)
    public final Buffer method1016(boolean arg0, MapBuffer arg1, int arg2) {
        field2199++;
        if (this.field2193 == 0) {
            this.method1024((byte) -72);
            if (this.field2201 <= 0) {
                this.field2193 = 2;
                return this.field2192;
            }
            OpenGL.glBindBufferARB(this.field2186, this.field2201);
            if (arg0) {
                OpenGL.glBufferDataARBub(this.field2186, this.field2190, null, 0, this.field2205 ? 35040 : 35044);
                if (this.field2196 <= this.field2195.field4846.field9329) {
                    this.field2193 = 1;
                    return this.field2195.field4846;
                }
            }
            if (!arg1.method3532() && arg1.method3534(this.field2186, this.field2196, 35001)) {
                this.field2193 = 2;
                return arg1;
            }
        }
        if (arg2 != -15793) {
            this.method1020(-18);
        }
        return null;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)J", line = 48)
    public final long method1017(int arg0) {
        field2197++;
        if (arg0 != -30277) {
            this.field2195 = null;
        }
        return this.field2201 == 0 ? this.field2192.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(FFBF)I", line = 62)
    public static final int method1018(float arg0, float arg1, byte arg2, float arg3) {
        field2207++;
        float var4 = (arg0 < 0.0F) ? -arg0 : arg0;
        float var5 = arg3 < 0.0F ? -arg3 : arg3;
        if (arg2 > -51) {
            field2187 = null;
        }
        float var6 = (arg1 < 0.0F) ? -arg1 : arg1;
        if (var5 > var4 && var6 < var5) {
            return arg3 > 0.0F ? 0 : 1;
        } else if (var4 < var6 && var5 < var6) {
            return arg1 > 0.0F ? 2 : 3;
        } else if ((arg0 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljaclib/memory/Source;II)Z", line = 106)
    public final boolean method1019(Source arg0, int arg1, int arg2) {
        field2194++;
        if (arg2 > this.field2190) {
            this.method1024((byte) -76);
            if (this.field2201 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field2186, this.field2201);
            OpenGL.glBufferDataARBa(this.field2186, arg2, arg0.getAddress(), this.field2205 ? 35040 : 35044);
            this.field2195.field5029 += arg2 - this.field2196;
            this.field2190 = arg2;
        } else if (this.field2201 > 0) {
            OpenGL.glBindBufferARB(this.field2186, this.field2201);
            OpenGL.glBufferSubDataARBa(this.field2186, 0, this.field2196, arg0.getAddress());
            this.field2195.field5029 += arg2 - this.field2196;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field2196 = arg2;
        return arg1 == 1 ? true : true;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V", line = 150)
    public final void method1020(int arg0) {
        if (arg0 != 18569) {
            this.field2190 = -80;
        }
        field2204++;
        if (this.field2195.field7195) {
            OpenGL.glBindBufferARB(this.field2186, this.field2201);
        }
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V", line = 166)
    public static void method1021(int arg0) {
        field2187 = null;
        field2206 = null;
        field2203 = null;
        if (arg0 > -93) {
            method1021(25);
        }
    }

    @OriginalMember(owner = "client!ei", name = "finalize", descriptor = "()V", line = 180)
    protected final void finalize() throws Throwable {
        this.method176(false);
        field2189++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lhl;IZ)V", line = 665)
    public class179(class529 arg0, int arg1, boolean arg2) {
        this.field2205 = arg2;
        this.field2195 = arg0;
        this.field2186 = arg1;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V", line = 193)
    public void method180(int arg0, int arg1) {
        field2191++;
        if (arg0 > this.field2190) {
            this.method1024((byte) -85);
            if (this.field2201 > 0) {
                OpenGL.glBindBufferARB(this.field2186, this.field2201);
                OpenGL.glBufferDataARBub(this.field2186, arg0, null, 0, this.field2205 ? 35040 : 35044);
                this.field2195.field5029 += arg0 - this.field2190;
            } else {
                this.field2192 = this.field2195.method2111(arg0, false, arg1 ^ 0x512B);
            }
            this.field2190 = arg0;
        }
        this.field2196 = arg0;
        if (arg1 != 20779) {
            field2206 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z[[[BIBIIZ)V", line = 227)
    public static final void method1022(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class735.field10260 = 0;
        class540.field7311 = 0;
        class13.field85++;
        if ((arg5 & 0x2) == 0) {
            for (class176 var8 = class732.field10200[var7]; var8 != null; var8 = var8.field2179) {
                if (!class523.method2907(var8, arg0, arg1, arg2, arg3)) {
                    class10.method31(var8);
                    if (var8.field2169 != -1) {
                        class170.field2121[class735.field10260++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 0x1) == 0) {
            for (class176 var9 = class43.field467[var7]; var9 != null; var9 = var9.field2179) {
                if (!class523.method2907(var9, arg0, arg1, arg2, arg3)) {
                    class10.method31(var9);
                    if (var9.field2169 != -1) {
                        class295.field3961[class540.field7311++] = var9;
                    }
                }
            }
            for (class176 var10 = class707.field9896[var7]; var10 != null; var10 = var10.field2179) {
                if (!class523.method2907(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method126(6540)) {
                        class10.method31(var10);
                        if (var10.field2169 != -1) {
                            class295.field3961[class540.field7311++] = var10;
                        }
                    } else {
                        class10.method31(var10);
                        if (var10.field2169 != -1) {
                            class170.field2121[class735.field10260++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class320.field4304; var11++) {
                    if (!class523.method2907(class561.field7935[var11], arg0, arg1, arg2, arg3)) {
                        class10.method31(class561.field7935[var11]);
                        if (class561.field7935[var11].field2169 != -1) {
                            if (class561.field7935[var11].method126(6540)) {
                                class295.field3961[class540.field7311++] = class561.field7935[var11];
                            } else {
                                class170.field2121[class735.field10260++] = class561.field7935[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class735.field10260 > 0) {
            class412.method2372(class170.field2121, 0, class735.field10260 - 1);
            for (int var12 = 0; var12 < class735.field10260; var12++) {
                class171.method992(class170.field2121[var12], true, arg6);
            }
        }
        if (class276.field3687) {
            class22.field158.method449(0, null);
        }
        if ((arg5 & 0x2) == 0) {
            for (int var13 = class170.field2119; var13 < class307.field4170; var13++) {
                if (var13 < arg2 || arg1 == null) {
                    int var23 = class423.field5940.length;
                    if (class423.field5940.length + class635.field8826 > class68.field743) {
                        var23 -= class423.field5940.length + class635.field8826 - class68.field743;
                    }
                    int var24 = class423.field5940[0].length;
                    if (class423.field5940[0].length + class712.field9939 > class480.field6629) {
                        var24 -= class423.field5940[0].length + class712.field9939 - class480.field6629;
                    }
                    boolean[][] var25 = class619.field8676;
                    if (class735.field10263) {
                        if (class181.field2224) {
                            var25 = class219.field2838[var13];
                        }
                        for (int var26 = class364.field4815; var26 < var23; var26++) {
                            int var27 = class635.field8826 + var26 - class364.field4815;
                            for (int var28 = class395.field5616; var28 < var24; var28++) {
                                if (class423.field5940[var26][var28] && !class161.method954((byte) 110, var13, class712.field9939 + var28 - class395.field5616, var27)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class181.field2224) {
                        if (arg4 >= 0) {
                            class25.field188[var13].method1541(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class25.field188[var13].method1548(0, 0, 0, null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class351.field4702; var29++) {
                            class293.field3923[var29].method3639(true, new class468(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class25.field188[var13].method1541(class610.field8512, class39.field407, class118.field1562, class619.field8676, true, arg4, arg5);
                    } else {
                        class25.field188[var13].method1548(class610.field8512, class39.field407, class118.field1562, class619.field8676, true, arg5);
                    }
                } else {
                    int var14 = class423.field5940.length;
                    if (class423.field5940.length + class635.field8826 > class68.field743) {
                        var14 -= class423.field5940.length + class635.field8826 - class68.field743;
                    }
                    int var15 = class423.field5940[0].length;
                    if (class423.field5940[0].length + class712.field9939 > class480.field6629) {
                        var15 -= class423.field5940[0].length + class712.field9939 - class480.field6629;
                    }
                    boolean[][] var16 = class619.field8676;
                    if (class735.field10263) {
                        if (class181.field2224) {
                            var16 = class219.field2838[var13];
                        }
                        for (int var17 = class364.field4815; var17 < var14; var17++) {
                            int var18 = class635.field8826 + var17 - class364.field4815;
                            for (int var19 = class395.field5616; var19 < var15; var19++) {
                                var16[var17][var19] = false;
                                if (class423.field5940[var17][var19]) {
                                    int var20 = class712.field9939 + var19 - class395.field5616;
                                    for (int var21 = var13; var21 >= 0; var21--) {
                                        if (class77.field947[var21][var18][var20] != null && class77.field947[var21][var18][var20].field8726 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class161.method954((byte) 95, var13, var20, var18)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class181.field2224) {
                        if (arg4 >= 0) {
                            class25.field188[var13].method1541(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class25.field188[var13].method1548(0, 0, 0, null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class351.field4702; var22++) {
                            class293.field3923[var22].method3639(true, new class468(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class25.field188[var13].method1541(class610.field8512, class39.field407, class118.field1562, class619.field8676, false, arg4, arg5);
                    } else {
                        class25.field188[var13].method1548(class610.field8512, class39.field407, class118.field1562, class619.field8676, false, arg5);
                    }
                }
            }
        }
        if (class540.field7311 > 0) {
            class601.method3332(class295.field3961, 0, class540.field7311 - 1);
            for (int var30 = 0; var30 < class540.field7311; var30++) {
                class171.method992(class295.field3961[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V", line = 531)
    public static final void method1023(int arg0) {
        if (arg0 == 0) {
            if (class351.field4702 == 2) {
                class532.field7227[0].method3273(class293.field3923[0]);
                class532.field7227[1].method3273(class293.field3923[1]);
            } else if (class351.field4702 == 3) {
                class532.field7227[0].method3273(class293.field3923[0]);
                class532.field7227[1].method3273(class293.field3923[1]);
                class532.field7227[2].method3273(class293.field3923[2]);
            } else {
                class532.field7227[0].method3273(class293.field3923[0]);
                class532.field7227[1].method3273(class293.field3923[1]);
                class532.field7227[2].method3273(class293.field3923[2]);
                class532.field7227[3].method3273(class293.field3923[3]);
            }
        } else if (arg0 == 1) {
            if (class351.field4702 == 2) {
                class532.field7227[0].method3273(class293.field3923[2]);
            } else if (class351.field4702 == 3) {
                class532.field7227[0].method3273(class293.field3923[3]);
                class532.field7227[1].method3273(class293.field3923[4]);
            } else {
                class532.field7227[0].method3273(class293.field3923[4]);
                class532.field7227[1].method3273(class293.field3923[5]);
                class532.field7227[2].method3273(class293.field3923[6]);
            }
        } else if (arg0 == 2) {
            if (class351.field4702 == 2) {
                class532.field7227[0].method3273(class293.field3923[3]);
                return;
            }
            if (class351.field4702 == 3) {
                class532.field7227[0].method3273(class293.field3923[5]);
                return;
            }
            class532.field7227[0].method3273(class293.field3923[7]);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V", line = 601)
    public void method176(boolean arg0) {
        field2188++;
        if (this.field2201 > 0) {
            this.field2195.method2931(1, this.field2196, this.field2201);
            this.field2201 = -1;
        }
        if (arg0) {
            this.method1025((byte) -53, null);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)I", line = 618)
    public int method177(int arg0) {
        field2198++;
        if (arg0 != 200) {
            field2208 = true;
        }
        return this.field2196;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)V", line = 640)
    private final void method1024(byte arg0) {
        if (arg0 >= -53) {
            return;
        }
        field2200++;
        if (this.field2201 >= 0) {
            return;
        }
        if (this.field2195.field7195) {
            OpenGL.glGenBuffersARB(1, class654.field9107, 0);
            this.field2201 = class654.field9107[0];
            OpenGL.glBindBufferARB(this.field2186, this.field2201);
        } else {
            this.field2201 = 0;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLjaggl/MapBuffer;)Z", line = 678)
    public final boolean method1025(byte arg0, MapBuffer arg1) {
        field2202++;
        boolean var3 = true;
        if (arg0 != -68) {
            method1018(-2.5029087F, 1.1315566F, (byte) -51, -0.1177615F);
        }
        if (this.field2193 != 0) {
            if (this.field2201 > 0) {
                OpenGL.glBindBufferARB(this.field2186, this.field2201);
                if (this.field2193 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field2186, 0, this.field2190, this.field2195.field4846.getAddress());
                } else {
                    var3 = arg1.method3533();
                }
            }
            this.field2193 = 0;
        }
        return var3;
    }
}
