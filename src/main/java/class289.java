import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class289 extends class29 {

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    private int field4737 = -1;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    private int field4742 = 0;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    private int field4744;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "Lph;")
    public static class229 field4736 = class266.method1858("_", 0);

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "Z")
    public static boolean field4738 = false;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "Lph;")
    public static class229 field4743 = class266.method1858("::", 0);

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!rg", name = "finalize", descriptor = "()V", line = 18)
    protected final void finalize() throws Throwable {
        field4735++;
        if (this.field4737 != -1) {
            class274.method1895(this.field4737, this.field4742, this.field4744);
            this.field4742 = 0;
            this.field4737 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V", line = 485)
    public class289(int arg0) {
        GL var2 = class99.field1682;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field4744 = class274.field4577;
        this.field4737 = var3[0];
        class99.method749(this.field4737);
        int var4 = class310.field5203[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class274.field4578 += var6.limit() - this.field4742;
        this.field4742 = var6.limit();
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIZI[Loi;B[B)V", line = 53)
    public static final void method1978(int arg0, int arg1, int arg2, boolean arg3, int arg4, class108[] arg5, byte arg6, byte[] arg7) {
        if (arg6 > -20) {
            field4741 = -14;
        }
        field4739++;
        if (!arg3) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if ((arg4 + var9) > 0 && arg4 + var9 < 103 && (arg2 + var10) > 0 && (arg2 + var10) < 103) {
                            arg5[var8].field1828[arg4 + var9][arg2 + var10] = class243.method1696(arg5[var8].field1828[arg4 + var9][arg2 + var10], -16777217);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg3) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class164 var12 = new class164(arg7);
        for (int var13 = 0; var13 < var11; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class1.method2(0, arg4 + var14, arg3, -105, arg0, var13, var12, arg2 + var15, arg1);
                }
            }
        }
        boolean var16 = false;
        while (var12.field2668.length > var12.field2670) {
            int var17 = var12.method1178(8);
            if (var17 != 129) {
                var12.field2670--;
                break;
            }
            var16 = true;
            for (int var18 = 0; var18 < 4; var18++) {
                byte var19 = var12.method1163(864348104);
                if (var19 == 0) {
                    int var29 = arg4;
                    if (arg4 < 0) {
                        var29 = 0;
                    } else if (arg4 >= 104) {
                        var29 = 104;
                    }
                    int var30 = arg4 + 64;
                    int var31 = arg2;
                    if (arg2 < 0) {
                        var31 = 0;
                    } else if (arg2 >= 104) {
                        var31 = 104;
                    }
                    int var32 = arg2 + 64;
                    if (var32 < 0) {
                        var32 = 0;
                    } else if (var32 >= 104) {
                        var32 = 104;
                    }
                    if (var30 < 0) {
                        var30 = 0;
                    } else if (var30 >= 104) {
                        var30 = 104;
                    }
                    while (var29 < var30) {
                        while (var32 > var31) {
                            class149.field2415[var18][var29][var31] = 0;
                            var31++;
                        }
                        var29++;
                    }
                } else if (var19 == 1) {
                    for (int var20 = 0; var20 < 64; var20 += 4) {
                        for (int var21 = 0; var21 < 64; var21 += 4) {
                            byte var22 = var12.method1163(864348104);
                            for (int var23 = arg4 + var20; var23 < (var20 + arg4 + 4); var23++) {
                                for (int var24 = arg2 + var21; var24 < var21 + arg2 + 4; var24++) {
                                    if (var23 >= 0 && var23 < 104 && var24 >= 0 && var24 < 104) {
                                        class149.field2415[var18][var23][var24] = var22;
                                    }
                                }
                            }
                        }
                    }
                } else if (var19 == 2 && var18 > 0) {
                    int var25 = arg4 + 64;
                    int var26 = arg4;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 >= 104) {
                        var25 = 104;
                    }
                    if (arg4 < 0) {
                        var26 = 0;
                    } else if (arg4 >= 104) {
                        var26 = 104;
                    }
                    int var27 = arg2 + 64;
                    int var28 = arg2;
                    if (arg2 < 0) {
                        var28 = 0;
                    } else if (arg2 >= 104) {
                        var28 = 104;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    } else if (var27 >= 104) {
                        var27 = 104;
                    }
                    while (var25 > var26) {
                        while (var27 > var28) {
                            class149.field2415[var18][var26][var28] = class149.field2415[var18 - 1][var26][var28];
                            var28++;
                        }
                        var26++;
                    }
                }
            }
        }
        if (class99.field1675 && !arg3) {
            class139 var33 = null;
            label261: while (true) {
                int var35;
                label254: do {
                    while (var12.field2668.length > var12.field2670) {
                        int var34 = var12.method1178(8);
                        if (var34 != 0) {
                            if (var34 != 1) {
                                throw new IllegalStateException();
                            }
                            var35 = var12.method1178(8);
                            continue label254;
                        }
                        var33 = new class139(var12);
                    }
                    if (var33 == null) {
                        var33 = new class139();
                    }
                    for (int var40 = 0; var40 < 8; var40++) {
                        for (int var41 = 0; var41 < 8; var41++) {
                            int var42 = (arg4 >> 3) + var40;
                            int var43 = (arg2 >> 3) + var41;
                            if (var42 >= 0 && var42 < 13 && var43 >= 0 && var43 < 13) {
                                class313.field5311[var42][var43] = var33;
                            }
                        }
                    }
                    break label261;
                } while (var35 <= 0);
                for (int var36 = 0; var36 < var35; var36++) {
                    class195 var37 = new class195(var12);
                    var37.field3263 += arg2 << 7;
                    var37.field3244 += arg4 << 7;
                    int var38 = var37.field3263 >> 7;
                    int var39 = var37.field3244 >> 7;
                    if (var39 >= 0 && var38 >= 0 && var39 < 104 && var38 < 104) {
                        var37.field3261 = class192.field3174[var37.field3262][var39][var38] - var37.field3261;
                        class62.method429(var37);
                    }
                }
            }
        }
        if (var16) {
            return;
        }
        for (int var44 = 0; var44 < 4; var44++) {
            for (int var45 = 0; var45 < 16; var45++) {
                for (int var46 = 0; var46 < 16; var46++) {
                    int var47 = (arg2 >> 2) + var46;
                    int var48 = (arg4 >> 2) + var45;
                    if (var48 >= 0 && var48 < 26 && var47 >= 0 && var47 < 26) {
                        class149.field2415[var44][var48][var47] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 437)
    public final void method1979(byte arg0) {
        field4734++;
        if (arg0 >= -117) {
            method1980((byte) -48);
        }
        int var2 = class72.method561(28770);
        if ((var2 & 0x1) == 0) {
            class99.method749(this.field4737);
        }
        if ((var2 & 0x2) == 0) {
            class99.method758(0);
        }
        if ((var2 & 0x4) == 0) {
            class99.method765(0);
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V", line = 468)
    public static void method1980(byte arg0) {
        field4736 = null;
        if (arg0 != -42) {
            field4736 = (class229) null;
        }
        field4743 = null;
    }
}
