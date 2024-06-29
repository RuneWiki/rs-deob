import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class221 {

    @OriginalMember(owner = "client!va", name = "b", descriptor = "[I")
    private int[] field4001;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "[B")
    private byte[] field4003;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "[I")
    private int[] field4008;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field4006 = -1;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "Ldj;")
    private static class44 field4009 = class89.method650(255, "Choose Option");

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Ldj;")
    public static class44 field4007 = field4009;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "[[[B")
    public static byte[][][] field4005;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)J")
    public static final long method1426(int arg0, int arg1, int arg2) {
        class68 var3 = class32.field567[arg0][arg1][arg2];
        return var3 == null || var3.field1298 == null ? 0L : var3.field1298.field581;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II[BBI[B)I")
    public final int method1427(int arg0, int arg1, byte[] arg2, byte arg3, int arg4, byte[] arg5) {
        field4000++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg0 + arg4;
        int var8 = 0;
        int var9 = arg1;
        if (arg3 != 107) {
            return -89;
        }
        while (true) {
            byte var10 = arg5[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field4008[var8];
            }
            int var11;
            if ((var11 = this.field4008[var8]) < 0) {
                arg2[arg0++] = (byte) ~var11;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field4008[var8];
            }
            int var12;
            if ((var12 = this.field4008[var8]) < 0) {
                arg2[arg0++] = (byte) ~var12;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field4008[var8];
            }
            int var13;
            if ((var13 = this.field4008[var8]) < 0) {
                arg2[arg0++] = (byte) ~var13;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field4008[var8];
            }
            int var14;
            if ((var14 = this.field4008[var8]) < 0) {
                arg2[arg0++] = (byte) ~var14;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field4008[var8];
            }
            int var15;
            if ((var15 = this.field4008[var8]) < 0) {
                arg2[arg0++] = (byte) ~var15;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field4008[var8];
            }
            int var16;
            if ((var16 = this.field4008[var8]) < 0) {
                arg2[arg0++] = (byte) ~var16;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field4008[var8];
            }
            int var17;
            if ((var17 = this.field4008[var8]) < 0) {
                arg2[arg0++] = (byte) ~var17;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field4008[var8];
            }
            int var18;
            if ((var18 = this.field4008[var8]) < 0) {
                arg2[arg0++] = (byte) ~var18;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III[BI[B)I")
    public final int method1428(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        field4002++;
        int var7 = arg0 + arg2;
        int var8 = arg1 << 3;
        int var9 = 0;
        while (arg0 < var7) {
            int var10 = arg3[arg0] & 0xFF;
            byte var11 = this.field4003[var10];
            int var12 = this.field4001[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var9 & -var14 >> 31;
            int var16 = (var11 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var9 = class238.method1545(var15, var12 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg5[var13] = (byte) (var9 = var12 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg5[var13] = (byte) (var9 = var12 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg5[var13] = (byte) (var9 = var12 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg5[var13] = (byte) (var9 = var12 << -var14);
                        }
                    }
                }
            }
            var8 += var11;
            arg0++;
        }
        if (arg4 > -100) {
            this.field4008 = null;
        }
        return (var8 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)Lh;")
    public static final class77 method1429(int arg0) {
        field4010++;
        if (arg0 != -21934) {
            field4006 = 11;
        }
        try {
            return (class77) Class.forName("pc").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static void method1430(byte arg0) {
        field4007 = null;
        field4005 = null;
        field4009 = null;
        if (arg0 != 121) {
            method1430((byte) -30);
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "([B)V")
    public class221(byte[] arg0) {
        int var2 = arg0.length;
        int[] var3 = new int[33];
        this.field4001 = new int[var2];
        int var4 = 0;
        this.field4003 = arg0;
        this.field4008 = new int[8];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field4001[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
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
                        var3[var10] = class238.method1545(var11, var12);
                    }
                    var9 = var7 | var8;
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
                        if (this.field4008[var14] == 0) {
                            this.field4008[var14] = var4;
                        }
                        var14 = this.field4008[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field4008.length) {
                        int[] var18 = new int[this.field4008.length * 2];
                        for (int var19 = 0; var19 < this.field4008.length; var19++) {
                            var18[var19] = this.field4008[var19];
                        }
                        this.field4008 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field4008[var14] = ~var5;
            }
        }
    }
}
