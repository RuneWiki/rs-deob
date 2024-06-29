import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class52 {

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "[I")
    private int[] field1192;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "[I")
    private int[] field1194;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "[B")
    private byte[] field1183;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Lod;")
    public static class101 field1186 = class46.method335(83, "gr-Un:");

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lod;")
    private static class101 field1182 = class46.method335(93, "Type");

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "[I")
    public static int[] field1189 = new int[] { 24, 37, 11, 57, 7, 46, 28, 5 };

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Lod;")
    public static class101 field1187 = field1182;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1180 = 0;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public static int field1197 = 127;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "[I")
    public static int[] field1179 = new int[200];

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "Lod;")
    private static class101 field1196 = class46.method335(-51, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "Lod;")
    public static class101 field1195 = field1196;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "Lod;")
    public static class101 field1198 = class46.method335(-116, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Lud;")
    public static class143 field1178;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method373(int arg0) {
        field1195 = null;
        field1178 = null;
        field1189 = null;
        if (arg0 != 46) {
            method379(53, null, -45, (byte) -62);
        }
        field1196 = null;
        field1186 = null;
        field1187 = null;
        field1179 = null;
        field1182 = null;
        field1198 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILt;ILnf;)V")
    public static final void method374(int arg0, class132 arg1, int arg2, class96 arg3) {
        field1188++;
        class83 var4 = new class83();
        var4.field1813 = arg3;
        var4.field1818 = 1;
        var4.field2723 = arg2;
        var4.field1812 = arg1;
        class78 var5 = class41.field983;
        synchronized (class41.field983) {
            if (arg0 != -19888) {
                field1195 = null;
            }
            class41.field983.method529(var4, 19002);
        }
        class25.method203((byte) -22);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static final void method375(byte arg0) {
        if (arg0 != 47) {
            method374(-103, null, 47, null);
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class54.field1244 - 1; var2++) {
                if (class100.field2173[var2] < 1000 && class100.field2173[var2 + 1] > 1000) {
                    var1 = false;
                    class101 var3 = class153.field3500[var2];
                    class153.field3500[var2] = class153.field3500[var2 + 1];
                    class153.field3500[var2 + 1] = var3;
                    class101 var4 = class98.field2129[var2];
                    class98.field2129[var2] = class98.field2129[var2 + 1];
                    class98.field2129[var2 + 1] = var4;
                    int var5 = class100.field2173[var2];
                    class100.field2173[var2] = class100.field2173[var2 + 1];
                    class100.field2173[var2 + 1] = var5;
                    int var6 = class28.field755[var2];
                    class28.field755[var2] = class28.field755[var2 + 1];
                    class28.field755[var2 + 1] = var6;
                    int var7 = class78.field1647[var2];
                    class78.field1647[var2] = class78.field1647[var2 + 1];
                    class78.field1647[var2 + 1] = var7;
                    int var8 = class155.field3513[var2];
                    class155.field3513[var2] = class155.field3513[var2 + 1];
                    class155.field3513[var2 + 1] = var8;
                }
            }
        }
        field1191++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZI)Ldc;")
    public static final class25 method376(boolean arg0, int arg1) {
        field1181++;
        class25 var2 = (class25) class25.field652.method140(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class28.field757.method114((byte) 96, 13, arg1);
        class25 var4 = new class25();
        var4.field642 = arg1;
        if (var3 != null) {
            var4.method200(new class138(var3), (byte) 126);
        }
        if (arg0) {
            method379(-32, null, -114, (byte) 67);
        }
        class25.field652.method141(var4, (long) arg1, (byte) 59);
        return var4;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIBILne;)V")
    public static final void method377(int arg0, int arg1, byte arg2, int arg3, class95 arg4) {
        field1184++;
        if (class143.field3290 >= 50 || class145.field3332 == 0 || (arg4.field2041 == null || arg1 >= arg4.field2041.length)) {
            return;
        }
        if (arg2 != 113) {
            field1182 = null;
        }
        int var5 = arg4.field2041[arg1];
        if (var5 == 0) {
            return;
        }
        int var6 = var5 >> 8;
        class120.field2648[class143.field3290] = var6;
        int var7 = var5 >> 4 & 0x7;
        class13.field284[class143.field3290] = var7;
        class148.field3375[class143.field3290] = 0;
        class44.field1043[class143.field3290] = null;
        int var8 = (arg3 - 64) / 128;
        int var9 = (arg0 - 64) / 128;
        int var10 = var5 & 0xF;
        class84.field1840[class143.field3290] = (var9 << 8) + ((var8 << 16) + var10);
        class143.field3290++;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([B)V")
    public class52(byte[] arg0) {
        int var2 = arg0.length;
        this.field1192 = new int[var2];
        this.field1194 = new int[8];
        int var3 = 0;
        this.field1183 = arg0;
        int[] var4 = new int[33];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field1192[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var4[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var4[var9] = var4[var9 - 1];
                            break;
                        }
                        var4[var9] = class13.method96(var11, var10);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var4[var6 - 1];
                }
                var4[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field1194[var14] == 0) {
                            this.field1194[var14] = var3;
                        }
                        var14 = this.field1194[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field1194.length) {
                        int[] var18 = new int[this.field1194.length * 2];
                        for (int var19 = 0; var19 < this.field1194.length; var19++) {
                            var18[var19] = this.field1194[var19];
                        }
                        this.field1194 = var18;
                    }
                }
                this.field1194[var14] = ~var5;
                if (var14 >= var3) {
                    var3 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II[BI[BI)I")
    public final int method378(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        if (arg1 != 24) {
            this.method380(-40, null, 39, 110, null, 42);
        }
        field1190++;
        int var7 = arg3 << 3;
        int var8 = arg0 + arg5;
        int var9 = 0;
        while (arg0 < var8) {
            int var10 = arg2[arg0] & 0xFF;
            int var11 = this.field1192[var10];
            byte var12 = this.field1183[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var7 >> 3;
            int var14 = var7 & 0x7;
            var7 += var12;
            int var15 = (var12 + var14 - 1 >> 3) + var13;
            int var16 = var9 & -var14 >> 31;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var9 = class13.method96(var16, var11 >>> var17));
            if (var15 > var13) {
                var13++;
                var14 = var17 - 8;
                arg4[var13] = (byte) (var9 = var11 >>> var14);
                if (var13 < var15) {
                    var13++;
                    var14 -= 8;
                    arg4[var13] = (byte) (var9 = var11 >>> var14);
                    if (var15 > var13) {
                        var14 -= 8;
                        var13++;
                        arg4[var13] = (byte) (var9 = var11 >>> var14);
                        if (var13 < var15) {
                            var14 -= 8;
                            var13++;
                            arg4[var13] = (byte) (var9 = var11 << -var14);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var7 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILjava/awt/Component;IB)Lnc;")
    public static final class93 method379(int arg0, Component arg1, int arg2, byte arg3) {
        field1193++;
        try {
            Class var4 = Class.forName("ib");
            if (arg3 <= 124) {
                method375((byte) -114);
            }
            class93 var5 = (class93) var4.getDeclaredConstructor().newInstance();
            var5.method154(false, arg2, arg0, arg1);
            return var5;
        } catch (Throwable var7) {
            class20 var6 = new class20();
            var6.method154(false, arg2, arg0, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[BII[BI)I")
    public final int method380(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field1185++;
        if (arg2 == 0) {
            return 0;
        } else if (arg5 == 8030) {
            int var7 = arg0 + arg2;
            int var8 = 0;
            int var9 = arg3;
            while (true) {
                byte var10 = arg4[var9];
                if (var10 >= 0) {
                    var8++;
                } else {
                    var8 = this.field1194[var8];
                }
                int var11;
                if ((var11 = this.field1194[var8]) < 0) {
                    arg1[arg0++] = (byte) ~var11;
                    if (var7 <= arg0) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x40) == 0) {
                    var8++;
                } else {
                    var8 = this.field1194[var8];
                }
                int var12;
                if ((var12 = this.field1194[var8]) < 0) {
                    arg1[arg0++] = (byte) ~var12;
                    if (arg0 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x20) == 0) {
                    var8++;
                } else {
                    var8 = this.field1194[var8];
                }
                int var13;
                if ((var13 = this.field1194[var8]) < 0) {
                    arg1[arg0++] = (byte) ~var13;
                    if (var7 <= arg0) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x10) == 0) {
                    var8++;
                } else {
                    var8 = this.field1194[var8];
                }
                int var14;
                if ((var14 = this.field1194[var8]) < 0) {
                    arg1[arg0++] = (byte) ~var14;
                    if (var7 <= arg0) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x8) == 0) {
                    var8++;
                } else {
                    var8 = this.field1194[var8];
                }
                int var15;
                if ((var15 = this.field1194[var8]) < 0) {
                    arg1[arg0++] = (byte) ~var15;
                    if (var7 <= arg0) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x4) == 0) {
                    var8++;
                } else {
                    var8 = this.field1194[var8];
                }
                int var16;
                if ((var16 = this.field1194[var8]) < 0) {
                    arg1[arg0++] = (byte) ~var16;
                    if (arg0 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x2) == 0) {
                    var8++;
                } else {
                    var8 = this.field1194[var8];
                }
                int var17;
                if ((var17 = this.field1194[var8]) < 0) {
                    arg1[arg0++] = (byte) ~var17;
                    if (var7 <= arg0) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x1) == 0) {
                    var8++;
                } else {
                    var8 = this.field1194[var8];
                }
                int var18;
                if ((var18 = this.field1194[var8]) < 0) {
                    arg1[arg0++] = (byte) ~var18;
                    if (var7 <= arg0) {
                        break;
                    }
                    var8 = 0;
                }
                var9++;
            }
            return var9 + 1 - arg3;
        } else {
            return -14;
        }
    }
}
