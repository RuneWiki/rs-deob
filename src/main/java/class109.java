import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class109 extends class209 {

    @OriginalMember(owner = "client!je", name = "G", descriptor = "Z")
    public boolean field1692 = false;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "I")
    private int field1696 = 0;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "I")
    private int field1702 = -1;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "Lkf;")
    private class120 field1705;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "Z")
    private boolean field1687;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "Z")
    private boolean field1689;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "Z")
    private boolean field1695;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "Z")
    private boolean field1693;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "I")
    private int field1706;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    private int field1688;

    @OriginalMember(owner = "client!je", name = "W", descriptor = "I")
    private int field1707;

    @OriginalMember(owner = "client!je", name = "T", descriptor = "I")
    private int field1704;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "Luf;")
    public static class168 field1684 = class148.method1019(-1720, "headicons_prayer");

    @OriginalMember(owner = "client!je", name = "R", descriptor = "F")
    private float field1703;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "I")
    private int field1690;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "[I")
    private int[] field1685;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lfl;ZILdk;)Z", line = 17)
    public final boolean method805(class81 arg0, boolean arg1, int arg2, class241 arg3) {
        field1701++;
        if (!this.field1705.method861(arg0, arg3, (byte) 127)) {
            return false;
        }
        GL var5 = class90.field1390;
        int var6 = arg1 ? 64 : 128;
        int var7 = class83.method559(arg2);
        if ((var7 & 0x1) == 0) {
            if (this.field1702 == -1) {
                int[] var8 = new int[1];
                var5.glGenTextures(1, var8, 0);
                this.field1702 = var8[0];
                this.field1690 = class7.field91;
                class90.method617(this.field1702);
                ByteBuffer var9 = ByteBuffer.wrap(this.field1705.method864(0.7D, this.field1689, var6, arg3, arg0, var6, 32354));
                if (this.field1707 == 2) {
                    GLU var11 = new GLU();
                    var11.gluBuild2DMipmaps(3553, 6408, var6, var6, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9987);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class7.field89 += var9.limit() * 4 / 3 - this.field1696;
                    this.field1696 = var9.limit() * 4 / 3;
                } else if (this.field1707 == 1) {
                    int var10 = 0;
                    while (true) {
                        var5.glTexImage2D(3553, var10++, 6408, var6, var6, 0, 6408, 5121, var9);
                        var6 >>= 0x1;
                        if (var6 == 0) {
                            var5.glTexParameteri(3553, 10241, 9987);
                            var5.glTexParameteri(3553, 10240, 9729);
                            class7.field89 += var9.limit() * 4 / 3 - this.field1696;
                            this.field1696 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field1705.method864(0.7D, this.field1689, var6, arg3, arg0, var6, 32354));
                    }
                } else {
                    var5.glTexImage2D(3553, 0, 6408, var6, var6, 0, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9729);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class7.field89 += var9.limit() - this.field1696;
                    this.field1696 = var9.limit();
                }
                var5.glTexParameteri(3553, 10242, this.field1695 ? 10497 : 33071);
                var5.glTexParameteri(3553, 10243, this.field1693 ? 10497 : 33071);
            } else {
                class90.method617(this.field1702);
            }
        }
        if ((var7 & 0x2) == 0) {
            class90.method609(this.field1704);
        }
        if ((var7 & 0x4) == 0) {
            class90.method615(0);
        }
        if ((var7 & 0x8) == 0) {
            if (this.field1688 == 0 && this.field1706 == 0) {
                class90.method632();
            } else {
                float var12 = (float) (class90.field1388 * this.field1688) / (float) var6;
                float var13 = (float) (class90.field1388 * this.field1706) / (float) var6;
                class90.method636(var13, var12, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V", line = 119)
    public static final void method806(int arg0) {
        field1691++;
        if (class51.field621 == 0 || class51.field621 == 5) {
            return;
        }
        try {
            if ((++class279.field4687) > 2000) {
                if (class157.field2493 != null) {
                    class157.field2493.method1229(545);
                    class157.field2493 = null;
                }
                if (class197.field3262 >= 1) {
                    class165.field2638 = -5;
                    class51.field621 = 0;
                    return;
                }
                class279.field4687 = 0;
                class51.field621 = 1;
                if (class27.field338 == class229.field3698) {
                    class229.field3698 = class266.field4491;
                } else {
                    class229.field3698 = class27.field338;
                }
                class197.field3262++;
            }
            if (class51.field621 == 1) {
                class238.field3819 = class51.field622.method428(class201.field3307, 0, class229.field3698);
                class51.field621 = 2;
            }
            if (class51.field621 == 2) {
                if (class238.field3819.field1746 == 2) {
                    throw new IOException();
                }
                if (class238.field3819.field1746 != 1) {
                    return;
                }
                class157.field2493 = new class169((Socket) class238.field3819.field1742, class51.field622);
                class238.field3819 = null;
                long var1 = class198.field3271 = class182.field2921.method1208((byte) 71);
                class249.field4262.field2367 = 0;
                class249.field4262.method1095(14, -77);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class249.field4262.method1095(var3, -89);
                class157.field2493.method1233((byte) 42, class249.field4262.field2359, 2, 0);
                if (class291.field4907 != null) {
                    class291.field4907.method1004((byte) 42);
                }
                if (class103.field1601 != null) {
                    class103.field1601.method1004((byte) 42);
                }
                int var4 = class157.field2493.method1232(0);
                if (class291.field4907 != null) {
                    class291.field4907.method1004((byte) 42);
                }
                if (class103.field1601 != null) {
                    class103.field1601.method1004((byte) 42);
                }
                if (var4 != 0) {
                    class51.field621 = 0;
                    class165.field2638 = var4;
                    class157.field2493.method1229(545);
                    class157.field2493 = null;
                    return;
                }
                class51.field621 = 3;
            }
            if (class51.field621 == 3) {
                if (class157.field2493.method1227(0) < 8) {
                    return;
                }
                class157.field2493.method1226(class166.field2671.field2359, 14451, 0, 8);
                class166.field2671.field2367 = 0;
                class291.field4913 = class166.field2671.method1087(1001);
                int[] var5 = new int[4];
                class249.field4262.field2367 = 0;
                var5[3] = (int) class291.field4913;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class291.field4913 >> 32);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class249.field4262.method1095(10, -64);
                class249.field4262.method1045(var5[0], (byte) 97);
                class249.field4262.method1045(var5[1], (byte) 8);
                class249.field4262.method1045(var5[2], (byte) 58);
                class249.field4262.method1045(var5[3], (byte) 113);
                class249.field4262.method1053(class182.field2921.method1208((byte) 71), 11247);
                class249.field4262.method1073((byte) 59, class182.field2931);
                class249.field4262.method1055(-3, class166.field2670, class236.field3775);
                class62.field810.field2367 = 0;
                if (class193.field3143 == 40) {
                    class62.field810.method1095(18, -46);
                } else {
                    class62.field810.method1095(16, -30);
                }
                class62.field810.method1047(106, class249.field4262.field2367 + class264.method1837(-120, class45.field553) + 151);
                class62.field810.method1045(510, (byte) 32);
                class62.field810.method1095(class187.field2977, -70);
                class62.field810.method1095(1, -53);
                class62.field810.method1095(class267.method1855(true), -103);
                class62.field810.method1047(-53, class14.field142);
                class62.field810.method1047(117, class299.field5069);
                class72.method405(false, class62.field810);
                class62.field810.method1073((byte) 50, class45.field553);
                class62.field810.method1045(class26.field329, (byte) 15);
                class62.field810.method1045(class115.method840(-125), (byte) 48);
                class76.field1026 = true;
                class62.field810.method1045(class145.field2247.field3933, (byte) 37);
                class62.field810.method1045(class269.field4533.field3933, (byte) 91);
                class62.field810.method1045(class242.field4126.field3933, (byte) 127);
                class62.field810.method1045(class244.field4159.field3933, (byte) 84);
                class62.field810.method1045(class198.field3272.field3933, (byte) 64);
                class62.field810.method1045(class175.field2830.field3933, (byte) 105);
                class62.field810.method1045(class278.field4658.field3933, (byte) 57);
                class62.field810.method1045(class143.field2209.field3933, (byte) 123);
                class62.field810.method1045(class61.field792.field3933, (byte) 111);
                class62.field810.method1045(class213.field3480.field3933, (byte) 71);
                class62.field810.method1045(class200.field3303.field3933, (byte) 67);
                class62.field810.method1045(class82.field1179.field3933, (byte) 44);
                class62.field810.method1045(class40.field510.field3933, (byte) 92);
                class62.field810.method1045(class276.field4644.field3933, (byte) 115);
                class62.field810.method1045(class62.field822.field3933, (byte) 10);
                class62.field810.method1045(class58.field768.field3933, (byte) 41);
                class62.field810.method1045(class195.field3164.field3933, (byte) 62);
                class62.field810.method1045(class188.field2987.field3933, (byte) 101);
                class62.field810.method1045(class303.field5109.field3933, (byte) 23);
                class62.field810.method1045(class161.field2594.field3933, (byte) 14);
                class62.field810.method1045(class116.field1813.field3933, (byte) 92);
                class62.field810.method1045(class22.field272.field3933, (byte) 100);
                class62.field810.method1045(class154.field2426.field3933, (byte) 44);
                class62.field810.method1045(class91.field1401.field3933, (byte) 27);
                class62.field810.method1045(class264.field4469.field3933, (byte) 67);
                class62.field810.method1045(class153.field2394.field3933, (byte) 49);
                class62.field810.method1045(class134.field2103.field3933, (byte) 35);
                class62.field810.method1062(class249.field4262.field2359, 32767, 0, class249.field4262.field2367);
                class157.field2493.method1233((byte) 26, class62.field810.field2359, class62.field810.field2367, 0);
                class249.field4262.method723(var5, (byte) 0);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class166.field2671.method723(var5, (byte) 0);
                class51.field621 = 4;
            }
            if (class51.field621 == 4) {
                if (class157.field2493.method1227(0) < 1) {
                    return;
                }
                int var7 = class157.field2493.method1232(0);
                if (var7 == 21) {
                    class51.field621 = 7;
                } else if (var7 == 1) {
                    class51.field621 = 5;
                    class165.field2638 = var7;
                    return;
                } else if (var7 == 2) {
                    class51.field621 = 8;
                } else if (var7 == 15) {
                    class51.field621 = 0;
                    class165.field2638 = var7;
                    return;
                } else if (var7 == 23 && class197.field3262 < 1) {
                    class197.field3262++;
                    class279.field4687 = 0;
                    class51.field621 = 1;
                    class157.field2493.method1229(545);
                    class157.field2493 = null;
                    return;
                } else {
                    class51.field621 = 0;
                    class165.field2638 = var7;
                    class157.field2493.method1229(545);
                    class157.field2493 = null;
                    return;
                }
            }
            if (class51.field621 == 6) {
                class249.field4262.field2367 = 0;
                class249.field4262.method726(17, 2138389379);
                class157.field2493.method1233((byte) -5, class249.field4262.field2359, class249.field4262.field2367, 0);
                class51.field621 = 4;
                return;
            }
            if (class51.field621 == 7) {
                if (class157.field2493.method1227(0) < 1) {
                    return;
                }
                class80.field1143 = class157.field2493.method1232(0) * 60 + 180;
                class165.field2638 = 21;
                class51.field621 = 0;
                class157.field2493.method1229(545);
                class157.field2493 = null;
                return;
            }
            if (class51.field621 == 8) {
                if (class157.field2493.method1227(0) < 11) {
                    return;
                }
                class157.field2493.method1226(class166.field2671.field2359, 14451, 0, 11);
                class166.field2671.field2367 = 0;
                class280.field4694 = class166.field2671.method1042((byte) -122);
                class205.field3377 = class166.field2671.method1042((byte) 101);
                class63.field830 = class166.field2671.method1042((byte) -124);
                if (class63.field830 == 1) {
                    try {
                        class197.field3259.method1180(0, class51.field622.field1000);
                    } catch (Throwable var13) {
                    }
                } else {
                    try {
                        class133.field2085.method1180(0, class51.field622.field1000);
                    } catch (Throwable var12) {
                    }
                }
                class72.field963 = class166.field2671.method1042((byte) -124);
                class249.field4257 = class166.field2671.method1042((byte) 92) == 1;
                class65.field873 = class166.field2671.method1069(41);
                class36.field418 = class166.field2671.method1042((byte) 105);
                class102.field1587 = class166.field2671.method715(0);
                class110.field1726 = class166.field2671.method1069(64);
                class51.field621 = 9;
            }
            int var10 = 88 % ((-arg0 - 56) / 61);
            if (class51.field621 == 9) {
                if (class157.field2493.method1227(0) >= class110.field1726) {
                    class166.field2671.field2367 = 0;
                    class157.field2493.method1226(class166.field2671.field2359, 14451, 0, class110.field1726);
                    class165.field2638 = 2;
                    class51.field621 = 0;
                    class178.method1279(45);
                    class282.field4739 = -1;
                    class83.method560(0, false);
                    class102.field1587 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var14) {
            if (class157.field2493 != null) {
                class157.field2493.method1229(545);
                class157.field2493 = null;
            }
            if (class197.field3262 < 1) {
                class51.field621 = 1;
                class279.field4687 = 0;
                if (class27.field338 == class229.field3698) {
                    class229.field3698 = class266.field4491;
                } else {
                    class229.field3698 = class27.field338;
                }
                class197.field3262++;
            } else {
                class51.field621 = 0;
                class165.field2638 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLdk;Lfl;)Z", line = 465)
    public final boolean method807(boolean arg0, class241 arg1, class81 arg2) {
        field1694++;
        return arg0 ? this.field1705.method861(arg2, arg1, (byte) 127) : false;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZFILdk;Lfl;)[I", line = 481)
    public final int[] method808(boolean arg0, float arg1, int arg2, class241 arg3, class81 arg4) {
        field1700++;
        if (arg2 != -3) {
            return (int[]) null;
        }
        if (this.field1685 == null || this.field1703 != arg1) {
            if (!this.field1705.method861(arg4, arg3, (byte) 127)) {
                return null;
            }
            int var6 = arg0 ? 64 : 128;
            this.field1685 = this.field1705.method862(var6, var6, arg4, true, this.field1689, arg3, (double) arg1, true);
            this.field1703 = arg1;
            if (this.field1687) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var13;
                int var14 = var13 = var6;
                int var15 = var6 - 1;
                int var16 = var6 * var6;
                int var17 = var6 - 1;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var17; var19 >= 0; var19--) {
                        var13--;
                        int var20 = this.field1685[var13];
                        var7[var19] += class159.method1119(var20, 16722520) >> 16;
                        var9[var19] += class159.method1119(255, var20 >> 8);
                        var8[var19] += class159.method1119(255, var20);
                    }
                    if (var13 == 0) {
                        var13 = var16;
                    }
                }
                int var21 = var16;
                for (int var22 = var15; var22 >= 0; var22--) {
                    int var23 = 1;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = 1;
                    for (int var28 = 2; var28 >= 0; var28--) {
                        var27--;
                        var24 += var9[var27];
                        var26 += var7[var27];
                        var25 += var8[var27];
                        if (var27 == 0) {
                            var27 = var11;
                        }
                    }
                    for (int var29 = var17; var29 >= 0; var29--) {
                        var23--;
                        int var30 = var24 / 9;
                        int var31 = var25 / 9;
                        int var32 = var26 / 9;
                        var21--;
                        var10[var21] = class80.method492(var31, class80.method492(var30 << 8, var32 << 16));
                        var27--;
                        var25 += var8[var27] - var8[var23];
                        var24 += var9[var27] - var9[var23];
                        var26 += var7[var27] - var7[var23];
                        if (var27 == 0) {
                            var27 = var11;
                        }
                        if (var23 == 0) {
                            var23 = var11;
                        }
                    }
                    for (int var33 = var17; var33 >= 0; var33--) {
                        var13--;
                        int var34 = this.field1685[var13];
                        var14--;
                        int var35 = this.field1685[var14];
                        var7[var33] += class159.method1119(255, var34 >> 16) - class159.method1119(255, var35 >> 16);
                        var9[var33] += -(class159.method1119(var35, 65475) >> 8) + class159.method1119(255, var34 >> 8);
                        var8[var33] += -class159.method1119(255, var35) + class159.method1119(var34, 255);
                    }
                    if (var14 == 0) {
                        var14 = var16;
                    }
                    if (var13 == 0) {
                        var13 = var16;
                    }
                }
                this.field1685 = var10;
            }
        }
        return this.field1685;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIILf;JZ)V", line = 646)
    public static final void method809(int arg0, int arg1, int arg2, int arg3, class231 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class292 var8 = new class292();
        var8.field4919 = arg4;
        var8.field4925 = arg1 * 128 + 64;
        var8.field4923 = arg2 * 128 + 64;
        var8.field4922 = arg3;
        var8.field4926 = arg5;
        var8.field4924 = arg6;
        if (class92.field1424[arg0][arg1][arg2] == null) {
            class92.field1424[arg0][arg1][arg2] = new class127(arg0, arg1, arg2);
        }
        class92.field1424[arg0][arg1][arg2].field1969 = var8;
    }

    @OriginalMember(owner = "client!je", name = "finalize", descriptor = "()V", line = 672)
    protected final void finalize() throws Throwable {
        field1699++;
        if (this.field1702 != -1) {
            class7.method26(this.field1702, this.field1696, this.field1690);
            this.field1696 = 0;
            this.field1702 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lj;)V", line = 886)
    public class109(class153 arg0) {
        this.field1705 = new class120(arg0);
        this.field1687 = arg0.method1042((byte) 109) == 1;
        this.field1689 = arg0.method1042((byte) 100) == 1;
        this.field1695 = arg0.method1042((byte) 125) == 1;
        this.field1693 = arg0.method1042((byte) 120) == 1;
        int var2 = arg0.method1042((byte) 90) & 0x3;
        this.field1706 = arg0.method1078(-6338);
        this.field1688 = arg0.method1078(-6338);
        int var3 = arg0.method1042((byte) -32);
        arg0.method1042((byte) -97);
        this.field1707 = var3 >> 4 & 0xF;
        if (var2 == 1) {
            this.field1704 = 2;
        } else if (var2 == 2) {
            this.field1704 = 3;
        } else if (var2 == 3) {
            this.field1704 = 4;
        } else {
            this.field1704 = 0;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V", line = 699)
    public static final void method810(int arg0, int arg1) {
        field1698++;
        if (class193.field3143 == arg0) {
            return;
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (class193.field3143 == 0) {
            class15.method65(-118);
        }
        if (arg0 == 40) {
            class168.method1189(class187.field2977, 100, class182.field2931, class182.field2921);
        }
        if (arg0 != 40 && class242.field4018 != null) {
            class242.field4018.method1229(545);
            class242.field4018 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class296.field5012 = 1;
            class236.field3777 = 0;
            class263.field4455 = 0;
            class226.field3678 = 1;
            class178.field2870 = 0;
            class110.method818(-1445985368);
        }
        if (arg0 == 5) {
            class268.method1865(class61.field792, arg1 ^ 0x2D73);
        } else {
            class231.method1576((byte) 52);
        }
        boolean var3 = class193.field3143 == 5 || class193.field3143 == 10 || class193.field3143 == 28;
        if (arg1 != 8858) {
            method809(86, -12, -27, -114, (class231) null, 12L, false);
        }
        if (var2 != var3) {
            if (var2) {
                class122.field1895 = class65.field863;
                if (class48.field593 == 0) {
                    class178.method1278(2, arg1 + 2869);
                } else {
                    class168.method1211(false, 2, 0, class65.field863, class278.field4658, 255, -11);
                }
                class155.method1106(false, (byte) -88);
            } else {
                class178.method1278(2, 11727);
                class155.method1106(true, (byte) -88);
            }
        }
        if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
            class90.method635();
        }
        class193.field3143 = arg0;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V", line = 783)
    public static void method811(int arg0) {
        field1684 = null;
        if (arg0 <= 84) {
            method811(49);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lfl;ZLdk;B)[I", line = 796)
    public final int[] method812(class81 arg0, boolean arg1, class241 arg2, byte arg3) {
        field1686++;
        if (!this.field1705.method861(arg0, arg2, (byte) 127)) {
            return null;
        }
        int var5 = arg1 ? 64 : 128;
        if (arg3 != -89) {
            method811(17);
        }
        return this.field1705.method862(var5, var5, arg0, false, this.field1689, arg2, 1.0D, true);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V", line = 815)
    public final void method813(int arg0, int arg1) {
        field1683++;
        if (this.field1685 == null || this.field1688 == arg0 && this.field1706 == 0) {
            return;
        }
        if (class63.field842 == null || class63.field842.length < this.field1685.length) {
            class63.field842 = new int[this.field1685.length];
        }
        int var3 = this.field1706 * arg1;
        int var4 = this.field1685.length;
        int var5 = this.field1685.length == 4096 ? 64 : 128;
        int var6 = arg1 * var5 * this.field1688;
        int var7 = var5 - 1;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var4; var9 += var5) {
            int var10 = var6 + var9 & var8;
            for (int var11 = 0; var11 < var5; var11++) {
                int var12 = var9 + var11;
                int var13 = (var7 & var3 + var11) + var10;
                class63.field842[var12] = this.field1685[var13];
            }
        }
        int[] var14 = this.field1685;
        this.field1685 = class63.field842;
        class63.field842 = var14;
    }
}
