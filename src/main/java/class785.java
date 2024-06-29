import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class785 {

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "[Lkt;")
    public class166[] field10787 = null;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "Lpo;")
    public class582 field10792 = null;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "Lpo;")
    public class582 field10793 = null;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "[Lkt;")
    private class166[] field10796 = null;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "Lwk;")
    private class151 field10785;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "Z")
    public boolean field10788;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    public static int field10790 = 765;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public static int field10789;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    public static int field10791;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
    public static int field10794;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
    public static int field10795;

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "I")
    public static int field10797;

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "I")
    public static int field10798;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "[Lqo;")
    public static class24[] field10786;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V", line = 10)
    public static void method4298(byte arg0) {
        if (arg0 != -47) {
            method4302(19, (byte) -7, -96, -10, -29, 71, -38, -69, 19, -38);
        }
        field10786 = null;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)Z", line = 29)
    public final boolean method4299(boolean arg0) {
        field10797++;
        if (this.field10793 == null) {
            if (class460.field6585 == null) {
                byte[] var2 = class715.method4043(4.0F, (byte) -46, 128, 0.5F, new class780(419684), 8, 0.6F, 16, 16.0F, 128, 4.0F);
                class460.field6585 = class687.method3876(var2, false, -137);
            }
            byte[] var3 = class650.method3723(false, (byte) 117, class460.field6585);
            byte[] var4 = new byte[var3.length * 4];
            int var5 = 0;
            for (int var6 = 0; var6 < 16; var6++) {
                int var7 = var6 * 128 * 128;
                int var8 = var7;
                for (int var9 = 0; var9 < 128; var9++) {
                    int var10 = var9 * 128 + var8;
                    int var11 = (var9 - 1 & 0x7F) * 128 + var8;
                    int var12 = (var9 + 1 & 0x7F) * 128 + var8;
                    for (int var13 = 0; var13 < 128; var13++) {
                        float var14 = (float) ((var3[var11 + var13] & 0xFF) - (var3[var12 + var13] & 0xFF));
                        float var15 = (float) ((var3[(var13 - 1 & 0x7F) + var10] & 0xFF) - (var3[(var13 + 1 & 0x7F) + var10] & 0xFF));
                        float var16 = (float) (128.0D / Math.sqrt((double) (var14 * var14 + var15 * var15 + 16384.0F)));
                        var4[var5++] = (byte) ((int) (var15 * var16 + 127.0F));
                        var4[var5++] = (byte) ((int) (var16 * 128.0F + 127.0F));
                        var4[var5++] = (byte) ((int) (var14 * var16 + 127.0F));
                        var4[var5++] = var3[var7++];
                    }
                }
            }
            this.field10793 = this.field10785.method1125(var4, 128, class12.field247, 8, 16, 128);
        }
        if (!arg0) {
            this.field10785 = null;
        }
        return this.field10793 != null;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(B)V", line = 102)
    public static final void method4300(byte arg0) {
        field10795++;
        class483.field6864.method3923(85);
        class32.field438.method4155((byte) -71);
        class176.field2677.method140(true);
        class496.field7061.method327((byte) -106);
        class21.field322.method1464(5);
        class526.field7490.method3571(24878);
        class203.field2975.method1929(81);
        class87.field1131.method1547((byte) 82);
        class324.field4862.method3263(false);
        class266.field3756.method2802(false);
        class511.field7304.method995((byte) 119);
        class549.field7742.method3803(0);
        class386.field5496.method3220(0);
        class247.field3521.method3708(60);
        class488.field6906.method1603(-1);
        class788.field10824.method1611(0);
        class684.field9714.method3110(126);
        class510.field7302.method587(-128);
        class276.field3842.method2180(111);
        class604.field8501.method1994(3235);
        class729.field10195.method566((byte) -33);
        if (arg0 <= 104) {
            method4302(-40, (byte) 31, 106, -125, 37, -112, 79, 39, 88, -106);
        }
        class162.field2384.method1419(-12046);
        class306.method2015(34963);
        class685.method3867(-1999382392);
        class357.method2249(0);
        class516.method3007(1);
        class106.method718(1);
        class421.field5920.method2369(-1);
        class338.field5013.method2369(-1);
        class626.field8831.method2369(-1);
        class688.field9745.method2369(-1);
        class353.field5145.method2369(-1);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)Z", line = 144)
    public final boolean method4301(int arg0) {
        field10791++;
        if (arg0 != 3344) {
            return false;
        } else if (this.field10788) {
            return this.field10792 != null;
        } else {
            return this.field10787 != null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lwk;)V", line = 211)
    public class785(class151 arg0) {
        this.field10785 = arg0;
        this.field10788 = this.field10785.field2184;
        if (this.field10788 && !this.field10785.method1129(class770.field10614, class519.field7418, -25011)) {
            this.field10788 = false;
        }
        if (this.field10788 || this.field10785.method1070(-97, class519.field7418, class770.field10614)) {
            class452.method2722(false);
            if (this.field10788) {
                byte[] var2 = class650.method3723(false, (byte) 125, class712.field10026);
                this.field10792 = this.field10785.method1125(var2, 128, class519.field7418, 8, 16, 128);
                byte[] var3 = class650.method3723(false, (byte) 83, class394.field5586);
                this.field10785.method1125(var3, 128, class519.field7418, 8, 16, 128);
            } else {
                this.field10787 = new class166[16];
                for (int var4 = 0; var4 < 16; var4++) {
                    byte[] var7 = class298.method1991(class712.field10026, 32768, -18784, var4 * 256 * 128);
                    this.field10787[var4] = this.field10785.method1105(true, var7, 128, 128, class519.field7418, true);
                }
                this.field10796 = new class166[16];
                for (int var5 = 0; var5 < 16; var5++) {
                    byte[] var6 = class298.method1991(class394.field5586, 32768, -18784, var5 * 16384 * 2);
                    this.field10796[var5] = this.field10785.method1105(true, var6, 128, 128, class519.field7418, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IBIIIIIIII)V", line = 160)
    public static final void method4302(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field10798++;
        if (arg5 < 512 || arg9 < 512 || (class109.field1314 - 2) * 512 < arg5 || arg9 > (class760.field10479 * 512 - 1024)) {
            class632.field8926[0] = class632.field8926[1] = -1;
            return;
        }
        int var10 = class580.method3366(arg6, (byte) -95, arg9, arg5) - arg8;
        if (arg1 > -45) {
            method4298((byte) 103);
        }
        if (class607.field8578) {
            class561.method3259(121, true);
        } else {
            class13.field256.method1952(arg3, 0, 0);
            class638.field8979.method445(class13.field256);
        }
        if (class475.field6760) {
            class638.field8979.method513(arg5, var10, arg9, class412.field5822, class632.field8926);
        } else {
            class638.field8979.method500(arg5, var10, arg9, class632.field8926);
        }
        if (class607.field8578) {
            class21.method163((byte) -120);
        } else {
            class13.field256.method1952(-arg3, 0, 0);
            class638.field8979.method445(class13.field256);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Liw;II)V", line = 267)
    public static final void method4303(class331 arg0, int arg1, int arg2) {
        field10794++;
        boolean var3 = arg0.method2138(1, (byte) -105) == 1;
        if (var3) {
            class762.field10498[class486.field6883++] = arg2;
        }
        int var4 = arg0.method2138(2, (byte) -105);
        class559 var5 = class581.field8250[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field7943 = false;
            } else if (class223.field3199 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class711 var6 = class359.field5218[arg2] = new class711();
                var6.field10002 = (class175.field2496 + var5.field6445[0] >> 6) + (var5.field6448[0] + class103.field1295 >> 6 << 14) + (var5.field7710 << 28);
                if (var5.field7960 == -1) {
                    var6.field10008 = var5.field6420.method224((byte) -39);
                } else {
                    var6.field10008 = var5.field7960;
                }
                var6.field10003 = var5.field7948;
                var6.field10009 = var5.field6343;
                var6.field10006 = var5.field7950;
                if (var5.field7977 > 0) {
                    class644.method3681(var5, 53);
                }
                class581.field8250[arg2] = null;
                if (arg0.method2138(1, (byte) -105) != 0) {
                    class216.method1502(arg2, true, arg0);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg0.method2138(3, (byte) -105);
            int var8 = var5.field6448[0];
            int var9 = var5.field6445[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var9++;
                var8--;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field7943 = true;
                var5.field7951 = var9;
                var5.field7965 = var8;
            } else {
                var5.method3243(0, var9, var8, class89.field1152[arg2]);
            }
        } else if (var4 == 2) {
            int var10 = arg0.method2138(4, (byte) -105);
            int var11 = var5.field6448[0];
            int var12 = var5.field6445[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var12 -= 2;
                var11++;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var11 -= 2;
                var12--;
            } else if (var10 == 6) {
                var12--;
                var11 += 2;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var11 -= 2;
                var12++;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var11 -= 2;
                var12 += 2;
            } else if (var10 == 12) {
                var12 += 2;
                var11--;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var12 += 2;
                var11++;
            } else if (var10 == 15) {
                var11 += 2;
                var12 += 2;
            }
            if (var3) {
                var5.field7951 = var12;
                var5.field7943 = true;
                var5.field7965 = var11;
            } else {
                var5.method3243(0, var12, var11, class89.field1152[arg2]);
            }
        } else {
            int var13 = arg0.method2138(1, (byte) -105);
            if (var13 == 0) {
                int var14 = arg0.method2138(12, (byte) -105);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field6448[0] + var16;
                int var19 = var5.field6445[0] + var17;
                if (var3) {
                    var5.field7943 = true;
                    var5.field7965 = var18;
                    var5.field7951 = var19;
                } else {
                    var5.method3243(0, var19, var18, class89.field1152[arg2]);
                }
                var5.field7710 = var5.field7711 = (byte) (var5.field7710 + var15 & 0x3);
                if (class627.method3593(var18, (byte) 114, var19)) {
                    var5.field7711++;
                }
                if (class223.field3199 == arg2) {
                    if (class410.field5771 != var5.field7710) {
                        class432.field6151 = true;
                    }
                    class410.field5771 = var5.field7710;
                }
            } else {
                int var20 = arg0.method2138(30, (byte) -105);
                int var21 = var20 >> 28;
                int var22 = (var20 & 0xFFFFA27) >> 14;
                int var23 = var20 & 0x3FFF;
                if (arg1 >= -82) {
                    method4303(null, 96, -113);
                }
                int var24 = (var5.field6448[0] - (-class103.field1295 - var22) & 0x3FFF) - class103.field1295;
                int var25 = (var5.field6445[0] + class175.field2496 + var23 & 0x3FFF) - class175.field2496;
                if (var3) {
                    var5.field7951 = var25;
                    var5.field7943 = true;
                    var5.field7965 = var24;
                } else {
                    var5.method3243(0, var25, var24, class89.field1152[arg2]);
                }
                var5.field7710 = var5.field7711 = (byte) (var5.field7710 + var21 & 0x3);
                if (class627.method3593(var24, (byte) -113, var25)) {
                    var5.field7711++;
                }
                if (class223.field3199 == arg2) {
                    class410.field5771 = var5.field7710;
                }
            }
        }
    }
}
