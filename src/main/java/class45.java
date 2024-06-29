import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class45 {

    @OriginalMember(owner = "client!m", name = "d", descriptor = "[B")
    private byte[] field673;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "[I")
    private int[] field677;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "[I")
    private int[] field676;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Lmh;")
    public static class62 field674 = class201.method1405(true, "<br>(X");

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field679 = -1;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "Lmh;")
    public static class62 field682 = class201.method1405(true, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Lhi;")
    public static class26 field680;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III[B[BI)I", line = 8)
    public final int method291(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
        field681++;
        if (arg2 == 0) {
            return 0;
        }
        int var7 = arg0 + arg2;
        int var8 = arg1;
        int var9 = arg5;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 < 0) {
                var8 = this.field676[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field676[var8]) < 0) {
                arg3[arg0++] = (byte) (~var11);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field676[var8];
            }
            int var12;
            if ((var12 = this.field676[var8]) < 0) {
                arg3[arg0++] = (byte) (~var12);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field676[var8];
            }
            int var13;
            if ((var13 = this.field676[var8]) < 0) {
                arg3[arg0++] = (byte) (~var13);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field676[var8];
            }
            int var14;
            if ((var14 = this.field676[var8]) < 0) {
                arg3[arg0++] = (byte) (~var14);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field676[var8];
            }
            int var15;
            if ((var15 = this.field676[var8]) < 0) {
                arg3[arg0++] = (byte) (~var15);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field676[var8];
            }
            int var16;
            if ((var16 = this.field676[var8]) < 0) {
                arg3[arg0++] = (byte) (~var16);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field676[var8];
            }
            int var17;
            if ((var17 = this.field676[var8]) < 0) {
                arg3[arg0++] = (byte) (~var17);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field676[var8];
            }
            int var18;
            if ((var18 = this.field676[var8]) < 0) {
                arg3[arg0++] = (byte) (~var18);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "([B)V", line = 178)
    public class45(byte[] arg0) {
        int var2 = arg0.length;
        this.field673 = arg0;
        this.field677 = new int[var2];
        this.field676 = new int[8];
        int var3 = 0;
        int[] var4 = new int[33];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field677[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var4[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var4[var9] = var4[var9 - 1];
                            break;
                        }
                        var4[var9] = class270.method1854(var11, var10);
                    }
                    var12 = var8 | var7;
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
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field676[var14] == 0) {
                            this.field676[var14] = var3;
                        }
                        var14 = this.field676[var14];
                    }
                    if (this.field676.length <= var14) {
                        int[] var17 = new int[this.field676.length * 2];
                        for (int var18 = 0; var18 < this.field676.length; var18++) {
                            var17[var18] = this.field676[var18];
                        }
                        this.field676 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field676[var14] = ~var5;
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V", line = 304)
    public static void method292(byte arg0) {
        field680 = null;
        field682 = null;
        field674 = null;
        int var1 = 107 % ((arg0 + 33) / 54);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([B[BIIII)I", line = 320)
    public final int method293(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field675++;
        int var7 = arg2 + arg5;
        int var8 = arg4 << 3;
        int var9 = 0;
        while (var7 > arg2) {
            int var10 = arg0[arg2] & 0xFF;
            byte var11 = this.field673[var10];
            int var12 = this.field677[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 & 0x7;
            int var14 = var9 & -var13 >> 31;
            int var15 = var8 >> 3;
            var8 += var11;
            int var16 = (var11 + var13 - 1 >> 3) + var15;
            int var17 = var13 + 24;
            arg1[var15] = (byte) (var9 = class270.method1854(var14, var12 >>> var17));
            if (var16 > var15) {
                var15++;
                var13 = var17 - 8;
                arg1[var15] = (byte) (var9 = var12 >>> var13);
                if (var16 > var15) {
                    var15++;
                    var13 -= 8;
                    arg1[var15] = (byte) (var9 = var12 >>> var13);
                    if (var16 > var15) {
                        var15++;
                        var13 -= 8;
                        arg1[var15] = (byte) (var9 = var12 >>> var13);
                        if (var15 < var16) {
                            var15++;
                            var13 -= 8;
                            arg1[var15] = (byte) (var9 = var12 << -var13);
                        }
                    }
                }
            }
            arg2++;
        }
        if (arg3 != -22228) {
            field679 = 18;
        }
        return (var8 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BI)V", line = 395)
    public static final void method294(byte arg0, int arg1) {
        field671++;
        class272 var2 = (class272) class222.field3829.method311((byte) 114, (long) arg1);
        if (var2 != null) {
            var2.method1444((byte) 89);
            if (arg0 != -64) {
                field680 = (class26) null;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIILsg;B)V", line = 417)
    public static final void method295(int arg0, int arg1, int arg2, class191 arg3, byte arg4) {
        class311.method2118(arg2, arg0, arg3.field3190 + arg2, arg0 - -arg3.field3126);
        if (arg4 <= 39) {
            field679 = 30;
        }
        field670++;
        if (class29.field372 >= 3) {
            class135 var5 = arg3.method1340(false, (byte) -112);
            if (var5 != null) {
                var5.method305(arg2, arg0);
            }
        } else {
            ((class257) class17.field173).method1785(arg2, arg0, arg3.field3190, arg3.field3126, class17.field173.field2207 / 2, class17.field173.field2202 / 2, class267.field4516, 256, (class257) arg3.method1340(false, (byte) -104));
        }
        class159.field2560[arg1] = true;
    }
}
