import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class380 {

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "[I")
    private int[] field5560;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "[B")
    private byte[] field5556;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "[I")
    private int[] field5553;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field5554 = -1;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "[[I")
    public static int[][] field5557 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZII[B[BI)I", line = 6)
    public final int method2335(boolean arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
        field5552++;
        if (arg1 == 0) {
            return 0;
        }
        int var7 = arg1 + arg2;
        int var8 = 0;
        int var9 = arg5;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field5553[var8];
            }
            int var11;
            if ((var11 = this.field5553[var8]) < 0) {
                arg4[arg2++] = (byte) (~var11);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field5553[var8];
            }
            int var12;
            if ((var12 = this.field5553[var8]) < 0) {
                arg4[arg2++] = (byte) (~var12);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field5553[var8];
            }
            int var13;
            if ((var13 = this.field5553[var8]) < 0) {
                arg4[arg2++] = (byte) (~var13);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field5553[var8];
            }
            int var14;
            if ((var14 = this.field5553[var8]) < 0) {
                arg4[arg2++] = (byte) (~var14);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field5553[var8];
            }
            int var15;
            if ((var15 = this.field5553[var8]) < 0) {
                arg4[arg2++] = (byte) (~var15);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field5553[var8];
            }
            int var16;
            if ((var16 = this.field5553[var8]) < 0) {
                arg4[arg2++] = (byte) (~var16);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field5553[var8];
            }
            int var17;
            if ((var17 = this.field5553[var8]) < 0) {
                arg4[arg2++] = (byte) (~var17);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field5553[var8];
            }
            int var18;
            if ((var18 = this.field5553[var8]) < 0) {
                arg4[arg2++] = (byte) (~var18);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        if (!arg0) {
            this.field5556 = null;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I[BI[BII)I", line = 166)
    public final int method2336(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field5555++;
        int var7 = 0;
        if (arg0 != 8) {
            this.field5556 = null;
        }
        int var8 = arg2 << 3;
        int var9 = arg4 + arg5;
        while (var9 > arg4) {
            int var10 = arg1[arg4] & 0xFF;
            int var11 = this.field5560[var10];
            byte var12 = this.field5556[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            var8 += var12;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var7 = class418.method2558(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg3[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg3[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg3[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg3[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        return (var8 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 244)
    public static final void method2337(int arg0) {
        if (class113.field2041 < 1024.0F) {
            class113.field2041 = 1024.0F;
        }
        field5558++;
        while (class525.field7631 >= 16384.0F) {
            class525.field7631 -= 16384.0F;
        }
        if (class113.field2041 > 3072.0F) {
            class113.field2041 = 3072.0F;
        }
        while (class525.field7631 < 0.0F) {
            class525.field7631 += 16384.0F;
        }
        int var1 = class376.field5501 >> 7;
        int var2 = class215.field3402 >> 7;
        if (arg0 != 786432) {
            return;
        }
        int var3 = class483.method2899(class211.field3371, class376.field5501, class215.field3402, false);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < class339.field5099 - 4 && var2 < class484.field7129 - 4) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class211.field3371;
                    if (var7 < 3 && class304.method1941(var6, var5, 1)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class235.field3626.field1344 != null && class235.field3626.field1344[var7] != null) {
                        var8 = (class235.field3626.field1344[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var8 + var3 - class520.field7560[var7].method177(var5, var6);
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (class278.field4190 < var10) {
            class278.field4190 += (var10 - class278.field4190) / 24;
        } else if (class278.field4190 > var10) {
            class278.field4190 += (var10 - class278.field4190) / 80;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lsf;I)V", line = 327)
    public static final void method2338(class366 arg0, int arg1) {
        if (arg1 < 90) {
            field5559 = 8;
        }
        field5550++;
        class358 var2 = (class358) class407.field6167.method1622((long) arg0.field7789, -118);
        if (var2 == null) {
            return;
        }
        if (var2.field5248 != null) {
            class288.field4357.method2157(var2.field5248);
            var2.field5248 = null;
        }
        var2.method1676(true);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V", line = 355)
    public static void method2339(boolean arg0) {
        field5557 = null;
        if (arg0) {
            method2338(null, 108);
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "([B)V", line = 365)
    public class380(byte[] arg0) {
        int var2 = arg0.length;
        this.field5560 = new int[var2];
        this.field5556 = arg0;
        int[] var3 = new int[33];
        this.field5553 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field5560[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class418.method2558(var11, var10);
                    }
                    var12 = var8 | var7;
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
                        if (this.field5553[var14] == 0) {
                            this.field5553[var14] = var4;
                        }
                        var14 = this.field5553[var14];
                    }
                    if (var14 >= this.field5553.length) {
                        int[] var17 = new int[this.field5553.length * 2];
                        for (int var18 = 0; var18 < this.field5553.length; var18++) {
                            var17[var18] = this.field5553[var18];
                        }
                        this.field5553 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field5553[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLza;)V", line = 489)
    public static final void method2340(byte arg0, class288 arg1) {
        if (arg0 < 81) {
            field5557 = null;
        }
        field5551++;
        if (class459.field6836.method1886(-31340) == 0) {
            return;
        }
        if (class133.field2236 == 0) {
            for (class47 var4 = (class47) class459.field6836.method1892(85); var4 != null; var4 = (class47) class459.field6836.method1893((byte) -2)) {
                class135.field2271.method1638(var4.field977, arg1, var4.field973, var4.field976, false, false, arg1, var4.field970, class276.field4179, var4.field972 ? class15.field266.field5343 : null, 36, var4.field979);
                var4.method1676(true);
            }
            class102.method895(0);
            return;
        }
        if (class320.field4895 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class320.field4895 = class288.method1807(class497.field7305, 0, var2, 0, 0, class173.field2792);
            class119.field2091 = class320.field4895.method357(class299.method1929(0, class335.field5064, 104, class483.field7117), class340.method2146(class455.field6758, class335.field5064, 0), true);
        }
        for (class47 var3 = (class47) class459.field6836.method1892(100); var3 != null; var3 = (class47) class459.field6836.method1893((byte) -2)) {
            class135.field2271.method1638(var3.field977, class320.field4895, var3.field973, var3.field976, false, false, arg1, var3.field970, class119.field2091, var3.field972 ? class15.field266.field5343 : null, 36, var3.field979);
            var3.method1676(true);
        }
    }
}
