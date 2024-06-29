import java.awt.Canvas;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class32 {

    @OriginalMember(owner = "client!iha", name = "g", descriptor = "[I")
    private int[] field507;

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "[B")
    private byte[] field503;

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "[I")
    private int[] field502;

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!iha", name = "e", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!iha", name = "f", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!iha", name = "h", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!iha", name = "i", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!iha", name = "j", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "Lwt;")
    public static class330 field501;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(BLjava/net/Socket;I)Lkfa;", line = 6)
    public static final class629 method299(byte arg0, Socket arg1, int arg2) throws IOException {
        if (arg0 < 113) {
            method305(-121, -30, false, null, null);
        }
        field508++;
        return new class81(arg1, arg2);
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(II)I", line = 19)
    public static final int method300(int arg0, int arg1) {
        if (arg1 == -1) {
            field504++;
            return arg0 >>> 8;
        } else {
            return 64;
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IZ)Z", line = 33)
    public static final boolean method301(int arg0, boolean arg1) {
        field510++;
        if (arg1) {
            field501 = null;
        }
        return arg0 == 1 || arg0 == 3 || arg0 == 5;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IBII[B[B)I", line = 44)
    public final int method302(int arg0, byte arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        field509++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg2 + arg3;
        int var9 = arg0;
        int var10 = -4 / ((arg1 + 29) / 43);
        while (true) {
            byte var11 = arg4[var9];
            if (var11 < 0) {
                var7 = this.field502[var7];
            } else {
                var7++;
            }
            int var12;
            if ((var12 = this.field502[var7]) < 0) {
                arg5[arg2++] = (byte) (~var12);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field502[var7];
            }
            int var13;
            if ((var13 = this.field502[var7]) < 0) {
                arg5[arg2++] = (byte) (~var13);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field502[var7];
            }
            int var14;
            if ((var14 = this.field502[var7]) < 0) {
                arg5[arg2++] = (byte) (~var14);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field502[var7];
            }
            int var15;
            if ((var15 = this.field502[var7]) < 0) {
                arg5[arg2++] = (byte) (~var15);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field502[var7];
            }
            int var16;
            if ((var16 = this.field502[var7]) < 0) {
                arg5[arg2++] = (byte) (~var16);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field502[var7];
            }
            int var17;
            if ((var17 = this.field502[var7]) < 0) {
                arg5[arg2++] = (byte) (~var17);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field502[var7];
            }
            int var18;
            if ((var18 = this.field502[var7]) < 0) {
                arg5[arg2++] = (byte) (~var18);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field502[var7];
            }
            int var19;
            if ((var19 = this.field502[var7]) < 0) {
                arg5[arg2++] = (byte) (~var19);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)V", line = 195)
    public static void method303(int arg0) {
        if (arg0 <= 40) {
            field501 = null;
        }
        field501 = null;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(I[BII[BI)I", line = 210)
    public final int method304(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field505++;
        int var7 = 0;
        int var8 = arg3 + arg5;
        int var9 = arg0 << 3;
        while (var8 > arg3) {
            int var10 = arg4[arg3] & 0xFF;
            int var11 = this.field507[var10];
            byte var12 = this.field503[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            var9 += var12;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var7 = class5.method105(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg1[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg1[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg1[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        if (arg2 != 23828) {
            method300(37, 99);
        }
        return (var9 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!iha", name = "<init>", descriptor = "([B)V", line = 281)
    public class32(byte[] arg0) {
        int var2 = arg0.length;
        this.field507 = new int[var2];
        this.field503 = arg0;
        this.field502 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field507[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class5.method105(var10, var11);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field502[var14] == 0) {
                            this.field502[var14] = var4;
                        }
                        var14 = this.field502[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field502.length) {
                        int[] var18 = new int[this.field502.length * 2];
                        for (int var19 = 0; var19 < this.field502.length; var19++) {
                            var18[var19] = this.field502[var19];
                        }
                        this.field502 = var18;
                    }
                }
                this.field502[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IIZLd;Ljava/awt/Canvas;)Lha;", line = 403)
    public static final class66 method305(int arg0, int arg1, boolean arg2, class162 arg3, Canvas arg4) {
        field506++;
        if (!arg2) {
            field501 = null;
        }
        return new class717(arg4, arg3, arg1, arg0);
    }
}
