import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class23 {

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "[B")
    private byte[] field519;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "[I")
    private int[] field523;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "[I")
    private int[] field521;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "[Z")
    public static boolean[] field526 = new boolean[5];

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field515 = 0;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Lec;")
    public static class28 field517 = class28.method210(-46, "Last password change:*6n@gre@Never changed");

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Lec;")
    public static class28 field528 = class28.method210(-46, " @gre@");

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Lec;")
    public static class28 field527 = class28.method210(-46, "Invalid loginserver requested");

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field530 = 0;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Lbb;")
    public static class9 field522;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method165(byte arg0) {
        if (arg0 < 90) {
            method167(-98, null, false, -32, -78, 51, -33, 105);
        }
        field527 = null;
        field528 = null;
        field517 = null;
        field522 = null;
        field526 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Lc;")
    public static final class13 method166(int arg0, int arg1) {
        field520++;
        class13 var2 = (class13) class78.field1809.method660(-2, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 0) {
            field522 = null;
        }
        byte[] var3 = class92.field2028.method932(-84, arg1, 12);
        class13 var4 = new class13();
        if (var3 != null) {
            var4.method76(new class119(var3), -110);
        }
        var4.method77((byte) -124);
        class78.field1809.method666(false, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILud;ZIIIII)V")
    public static final void method167(int arg0, class119 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!arg2) {
            method165((byte) 11);
        }
        field518++;
        if (arg4 < 0 || arg4 >= 104 || arg5 < 0 || arg5 >= 104) {
            while (true) {
                int var10 = arg1.method879((byte) 45);
                if (var10 == 0) {
                    return;
                }
                if (var10 == 1) {
                    arg1.method879((byte) 45);
                    return;
                }
                if (var10 <= 49) {
                    arg1.method879((byte) 45);
                }
            }
        }
        class47.field1080[arg6][arg4][arg5] = 0;
        while (true) {
            int var8 = arg1.method879((byte) 45);
            if (var8 == 0) {
                if (arg6 == 0) {
                    class118.field2523[0][arg4][arg5] = -class118.method848(arg5 + arg3 + 556238, -108, arg4 + arg7 + 932731) * 8;
                    return;
                } else {
                    class118.field2523[arg6][arg4][arg5] = class118.field2523[arg6 - 1][arg4][arg5] - 240;
                    return;
                }
            }
            if (var8 == 1) {
                int var9 = arg1.method879((byte) 45);
                if (var9 == 1) {
                    var9 = 0;
                }
                if (arg6 == 0) {
                    class118.field2523[0][arg4][arg5] = -var9 * 8;
                    return;
                }
                class118.field2523[arg6][arg4][arg5] = class118.field2523[arg6 - 1][arg4][arg5] - var9 * 8;
                return;
            }
            if (var8 <= 49) {
                class55.field1272[arg6][arg4][arg5] = arg1.method904(-31558);
                class117.field2496[arg6][arg4][arg5] = (byte) ((var8 - 2) / 4);
                class49.field1150[arg6][arg4][arg5] = (byte) class106.method732(arg0 + var8 - 2, 3);
            } else if (var8 <= 81) {
                class47.field1080[arg6][arg4][arg5] = (byte) (var8 - 49);
            } else {
                class8.field127[arg6][arg4][arg5] = (byte) (var8 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "([B)V")
    public class23(byte[] arg0) {
        int var2 = arg0.length;
        this.field519 = arg0;
        this.field523 = new int[8];
        int[] var3 = new int[33];
        this.field521 = new int[var2];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = var3[var6];
                int var8 = 0x1 << 32 - var6;
                this.field521[var5] = var7;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var7 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class117.method840(var10, var11);
                    }
                    var12 = var8 | var7;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var7) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var7) == 0) {
                        var14++;
                    } else {
                        if (this.field523[var14] == 0) {
                            this.field523[var14] = var4;
                        }
                        var14 = this.field523[var14];
                    }
                    if (var14 >= this.field523.length) {
                        int[] var17 = new int[this.field523.length * 2];
                        for (int var18 = 0; var18 < this.field523.length; var18++) {
                            var17[var18] = this.field523[var18];
                        }
                        this.field523 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field523[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[BII[BI)I")
    public final int method168(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field524++;
        if (arg2 >= -14) {
            return 27;
        }
        int var7 = 0;
        int var8 = arg0 + arg5;
        int var9 = arg3 << 3;
        while (arg5 < var8) {
            int var10 = arg1[arg5] & 0xFF;
            int var11 = this.field521[var10];
            byte var12 = this.field519[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var7 = class117.method840(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg4[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg4[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg4[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg4[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[B[BIBI)I")
    public final int method169(int arg0, byte[] arg1, byte[] arg2, int arg3, byte arg4, int arg5) {
        field529++;
        if (arg0 == 0) {
            return 0;
        }
        if (arg4 < 73) {
            field527 = null;
        }
        int var7 = arg0 + arg5;
        int var8 = 0;
        int var9 = arg3;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field523[var8];
            }
            int var11;
            if ((var11 = this.field523[var8]) < 0) {
                arg1[arg5++] = (byte) ~var11;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field523[var8];
            }
            int var12;
            if ((var12 = this.field523[var8]) < 0) {
                arg1[arg5++] = (byte) ~var12;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field523[var8];
            }
            int var13;
            if ((var13 = this.field523[var8]) < 0) {
                arg1[arg5++] = (byte) ~var13;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field523[var8];
            }
            int var14;
            if ((var14 = this.field523[var8]) < 0) {
                arg1[arg5++] = (byte) ~var14;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field523[var8];
            }
            int var15;
            if ((var15 = this.field523[var8]) < 0) {
                arg1[arg5++] = (byte) ~var15;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field523[var8];
            }
            int var16;
            if ((var16 = this.field523[var8]) < 0) {
                arg1[arg5++] = (byte) ~var16;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field523[var8];
            }
            int var17;
            if ((var17 = this.field523[var8]) < 0) {
                arg1[arg5++] = (byte) ~var17;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field523[var8];
            }
            int var18;
            if ((var18 = this.field523[var8]) < 0) {
                arg1[arg5++] = (byte) ~var18;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }
}
