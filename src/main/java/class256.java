import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class256 extends class279 {

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
    private int field4048 = 0;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "I")
    private int field4045 = -1;

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "I")
    private int field4047;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field4039 = -1;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4040 = "white:";

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "[I")
    public static int[] field4046 = new int[2500];

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "Z")
    public static volatile boolean field4051 = true;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "Lug;")
    public static class253 field4042;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "[[Z")
    public static boolean[][] field4055;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V", line = 13)
    public static final void method1852(boolean arg0) {
        class181.field2942.method1355(false);
        class26.field385.method1355(arg0);
        field4054++;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([IIIII)V", line = 30)
    public static final void method1853(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field4044++;
        arg1--;
        int var11 = arg3 - 1;
        int var5 = var11 - 7;
        while (var5 > arg1) {
            int var6 = arg1 + 1;
            arg0[var6] = arg2;
            int var7 = var6 + 1;
            arg0[var7] = arg2;
            int var8 = var7 + 1;
            arg0[var8] = arg2;
            int var9 = var8 + 1;
            arg0[var9] = arg2;
            int var10 = var9 + 1;
            arg0[var10] = arg2;
            int var12 = var10 + 1;
            arg0[var12] = arg2;
            int var13 = var12 + 1;
            arg0[var13] = arg2;
            arg1 = var13 + 1;
            arg0[arg1] = arg2;
        }
        if (arg4 != 0) {
            method1854(45, (class136) null, -109);
        }
        while (var11 > arg1) {
            arg1++;
            arg0[arg1] = arg2;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILcd;I)I", line = 60)
    public static final int method1854(int arg0, class136 arg1, int arg2) {
        field4049++;
        if (arg1.field2136 == null || arg1.field2136.length <= arg0) {
            return -2;
        }
        try {
            if (arg2 != 8) {
                field4040 = (String) null;
            }
            int[] var3 = arg1.field2136[arg0];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 1) {
                    var9 = class206.field3262[var3[var5++]];
                }
                if (var7 == 2) {
                    var9 = class15.field252[var3[var5++]];
                }
                if (var7 == 3) {
                    var9 = class79.field1084[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class136 var12 = class14.method140(var11, 1036508464);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class149.method1092((byte) -104, var13).field4990 || class7.field156)) {
                        for (int var14 = 0; var14 < var12.field2146.length; var14++) {
                            if (var13 + 1 == var12.field2146[var14]) {
                                var9 += var12.field1992[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class220.field3477[var3[var5++]];
                }
                if (var7 == 6) {
                    var9 = class244.field3810[class15.field252[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class220.field3477[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class146.field2310.field5259;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class134.field1963[var15]) {
                            var9 += class15.field252[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class136 var18 = class14.method140(var17, 1036508464);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class149.method1092((byte) -104, var19).field4990 || class7.field156)) {
                        for (int var20 = 0; var20 < var18.field2146.length; var20++) {
                            if ((var19 + 1) == var18.field2146[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class111.field1550;
                }
                if (var7 == 12) {
                    var9 = class175.field2875;
                }
                if (var7 == 13) {
                    int var21 = class220.field3477[var3[var5++]];
                    int var22 = var3[var5++];
                    var9 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var9 = class333.method2321(arg2 ^ 0x8, var23);
                }
                if (var7 == 18) {
                    var9 = (class146.field2310.field4698 >> 7) + class326.field5108;
                }
                if (var7 == 19) {
                    var9 = (class146.field2310.field4731 >> 7) + class198.field3168;
                }
                if (var7 == 20) {
                    var9 = var3[var5++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var4 += var9;
                    }
                    if (var6 == 1) {
                        var4 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var4 /= var9;
                    }
                    if (var6 == 3) {
                        var4 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(I)V", line = 392)
    public class256(int arg0) {
        int[] var2 = new int[1];
        GL var3 = class109.field1456;
        var3.glGenTextures(1, var2, 0);
        this.field4045 = var2[0];
        this.field4047 = class103.field1369;
        class109.method752(this.field4045);
        int var4 = class31.field461[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var3.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var3.glTexParameteri(3553, 10241, 9729);
        var3.glTexParameteri(3553, 10240, 9729);
        class103.field1374 += var6.limit() - this.field4048;
        this.field4048 = var6.limit();
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(III)V", line = 288)
    public static final void method1855(int arg0, int arg1, int arg2) {
        if (arg0 == 8) {
            arg0 = 4;
        }
        field4050++;
        int var3 = -123 % ((-arg1 - 54) / 48);
        if (arg0 == 4 && !class71.field985) {
            arg2 = 2;
            arg0 = 2;
        }
        if (class72.field1002 != arg0) {
            if (class116.field1612) {
                return;
            }
            if (class72.field1002 != 0) {
                class327.field5130[class72.field1002].method355();
            }
            if (arg0 != 0) {
                class173 var4 = class327.field5130[arg0];
                var4.method354();
                var4.method353(arg2);
            }
            class81.field1117 = arg2;
            class72.field1002 = arg0;
        } else if (arg0 != 0 && class81.field1117 != arg2) {
            class327.field5130[arg0].method353(arg2);
            class81.field1117 = arg2;
        }
    }

    @OriginalMember(owner = "client!kj", name = "finalize", descriptor = "()V", line = 343)
    protected final void finalize() throws Throwable {
        if (this.field4045 != -1) {
            class103.method714(this.field4045, this.field4048, this.field4047);
            this.field4045 = -1;
            this.field4048 = 0;
        }
        super.finalize();
        field4041++;
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)V", line = 360)
    public final void method1856(int arg0) {
        if (arg0 != 100) {
            return;
        }
        field4053++;
        int var2 = class153.method1116((byte) -90);
        if ((var2 & 0x1) == 0) {
            class109.method752(this.field4045);
        }
        if ((var2 & 0x2) == 0) {
            class109.method766(0);
        }
        if ((var2 & 0x4) == 0) {
            class109.method756(0);
        }
    }

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "(I)V", line = 381)
    public static void method1857(int arg0) {
        field4046 = null;
        field4040 = null;
        if (arg0 != 0) {
            method1853((int[]) null, -117, 66, -95, -24);
        }
        field4042 = null;
        field4055 = (boolean[][]) null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)I", line = 420)
    public static final int method1858(byte arg0, int arg1) {
        if (arg0 == -15) {
            field4043++;
            return arg1 >>> 8;
        } else {
            return 102;
        }
    }
}
