import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class483 {

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "[I")
    private int[] field7188;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "[B")
    private byte[] field7198;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "[I")
    private int[] field7195;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    public static int field7187 = 0;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
    public static int field7194 = 0;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "Lgr;")
    public static class296 field7196 = new class296(3, 14);

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "F")
    public static float field7191;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
    public static int field7197;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
    public static int field7199;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)Lae;")
    public static final class163 method2876(int arg0, int arg1) {
        field7190++;
        if (arg1 != 0) {
            method2878(-128);
        }
        class254[] var2 = class241.field3477;
        synchronized (class241.field3477) {
            class163 var3;
            if (arg0 >= class241.field3477.length || class241.field3477[arg0].method1642((byte) -94)) {
                var3 = new class163();
                var3.field2516 = new class456[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    var3.field2516[var4] = new class456();
                }
            } else {
                var3 = (class163) class241.field3477[arg0].method1638((byte) -85);
                var3.method360(true);
                int var10002 = class427.field6351[arg0]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIBI[B[B)I")
    public final int method2877(int arg0, int arg1, byte arg2, int arg3, byte[] arg4, byte[] arg5) {
        field7189++;
        int var7 = 0;
        int var8 = arg1 + arg3;
        if (arg2 != -109) {
            method2879((byte) -35);
        }
        int var9 = arg0 << 3;
        while (arg3 < var8) {
            int var10 = arg4[arg3] & 0xFF;
            int var11 = this.field7188[var10];
            byte var12 = this.field7198[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = var13 + (var14 + var12 - 1 >> 3);
            var9 += var12;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var7 = class121.method909(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg5[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg5[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg5[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg5[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var9 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
    public static void method2878(int arg0) {
        field7196 = null;
        if (arg0 > -26) {
            field7187 = 114;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
    public static final void method2879(byte arg0) {
        field7197++;
        if (class91.field1568 == 0) {
            return;
        }
        try {
            if (arg0 == -41) {
                if (++class457.field6848 > 2000) {
                    if (class116.field1927 != null) {
                        class116.field1927.method1305((byte) -116);
                        class116.field1927 = null;
                    }
                    if (class369.field5594 >= 1) {
                        class47.field864 = -5;
                        class91.field1568 = 0;
                        return;
                    }
                    class369.field5594++;
                    if (class187.field2793 == class132.field2082) {
                        class187.field2793 = class175.field2679;
                    } else {
                        class187.field2793 = class132.field2082;
                    }
                    class457.field6848 = 0;
                    class91.field1568 = 1;
                }
                if (class91.field1568 == 1) {
                    class337.field5081 = class368.field5553.method1852(class187.field2793, class315.field4742, (byte) 38);
                    class91.field1568 = 2;
                }
                if (class91.field1568 == 2) {
                    if (class337.field5081.field4940 == 2) {
                        throw new IOException();
                    }
                    if (class337.field5081.field4940 != 1) {
                        return;
                    }
                    class116.field1927 = new class187((Socket) class337.field5081.field4939, class368.field5553);
                    class337.field5081 = null;
                    class116.field1927.method1304(class410.field6141.field2270, 0, class410.field6141.field2289, (byte) 104);
                    class25.method313(false);
                    int var1 = class116.field1927.method1309(arg0 ^ 0xFFFFFFA5);
                    class25.method313(false);
                    if (var1 != 21) {
                        class47.field864 = var1;
                        class91.field1568 = 0;
                        class116.field1927.method1305((byte) 111);
                        class116.field1927 = null;
                        return;
                    }
                    class91.field1568 = 3;
                }
                if (class91.field1568 == 3) {
                    if (class116.field1927.method1308(14971) < 1) {
                        return;
                    }
                    class201.field2945 = new String[class116.field1927.method1309(125)];
                    class91.field1568 = 4;
                }
                if (class91.field1568 == 4 && class116.field1927.method1308(14971) >= class201.field2945.length * 8) {
                    class92.field1573.field2289 = 0;
                    class116.field1927.method1306(0, 0, class92.field1573.field2270, class201.field2945.length * 8);
                    for (int var2 = 0; var2 < class201.field2945.length; var2++) {
                        class201.field2945[var2] = class111.method834(class92.field1573.method1091((byte) 28), 0);
                    }
                    class91.field1568 = 0;
                    class47.field864 = 21;
                    class116.field1927.method1305((byte) 99);
                    class116.field1927 = null;
                }
            }
        } catch (IOException var3) {
            if (class116.field1927 != null) {
                class116.field1927.method1305((byte) -102);
                class116.field1927 = null;
            }
            if (class369.field5594 >= 1) {
                class91.field1568 = 0;
                class47.field864 = -4;
            } else {
                if (class187.field2793 == class132.field2082) {
                    class187.field2793 = class175.field2679;
                } else {
                    class187.field2793 = class132.field2082;
                }
                class457.field6848 = 0;
                class369.field5594++;
                class91.field1568 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(II)V")
    public static final void method2880(int arg0, int arg1) {
        if (arg1 != -1) {
            method2876(-34, 25);
        }
        field7193++;
        class399.field6019 = arg0;
        class55 var2 = class487.field7215;
        synchronized (class487.field7215) {
            class487.field7215.method488(-3);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I[BIBI[B)I")
    public final int method2881(int arg0, byte[] arg1, int arg2, byte arg3, int arg4, byte[] arg5) {
        field7192++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg0 + arg2;
        int var9 = arg4;
        if (arg3 <= 96) {
            method2880(40, 127);
        }
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var7 = this.field7195[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field7195[var7]) < 0) {
                arg5[arg2++] = (byte) (~var11);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field7195[var7];
            }
            int var12;
            if ((var12 = this.field7195[var7]) < 0) {
                arg5[arg2++] = (byte) (~var12);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field7195[var7];
            }
            int var13;
            if ((var13 = this.field7195[var7]) < 0) {
                arg5[arg2++] = (byte) (~var13);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field7195[var7];
            }
            int var14;
            if ((var14 = this.field7195[var7]) < 0) {
                arg5[arg2++] = (byte) (~var14);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field7195[var7];
            }
            int var15;
            if ((var15 = this.field7195[var7]) < 0) {
                arg5[arg2++] = (byte) (~var15);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field7195[var7];
            }
            int var16;
            if ((var16 = this.field7195[var7]) < 0) {
                arg5[arg2++] = (byte) (~var16);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field7195[var7];
            }
            int var17;
            if ((var17 = this.field7195[var7]) < 0) {
                arg5[arg2++] = (byte) (~var17);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field7195[var7];
            }
            int var18;
            if ((var18 = this.field7195[var7]) < 0) {
                arg5[arg2++] = (byte) (~var18);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "([B)V")
    public class483(byte[] arg0) {
        int var2 = arg0.length;
        this.field7188 = new int[var2];
        this.field7198 = arg0;
        this.field7195 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field7188[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class121.method909(var12, var11);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field7195[var14] == 0) {
                            this.field7195[var14] = var4;
                        }
                        var14 = this.field7195[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field7195.length <= var14) {
                        int[] var18 = new int[this.field7195.length * 2];
                        for (int var19 = 0; var19 < this.field7195.length; var19++) {
                            var18[var19] = this.field7195[var19];
                        }
                        this.field7195 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field7195[var14] = ~var5;
            }
        }
    }
}
