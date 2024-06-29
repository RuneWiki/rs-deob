import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class383 {

    @OriginalMember(owner = "client!el", name = "i", descriptor = "[I")
    private int[] field5389;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "[B")
    private byte[] field5384;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "[I")
    private int[] field5383;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Lfg;")
    public static class83 field5382 = new class83("M", "M", "M", "M");

    @OriginalMember(owner = "client!el", name = "g", descriptor = "Z")
    public static boolean field5387 = false;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "Lff;")
    public static class9 field5390 = new class9(260);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "[Lna;")
    public static class35[] field5391;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I[BIII[B)I", line = 6)
    public final int method2197(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field5386++;
        if (arg2 == 0) {
            return 0;
        }
        int var7 = arg2 + arg4;
        int var8 = 0;
        if (arg3 >= -118) {
            return 2;
        }
        int var9 = arg0;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field5383[var8];
            }
            int var11;
            if ((var11 = this.field5383[var8]) < 0) {
                arg1[arg4++] = (byte) (~var11);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field5383[var8];
            }
            int var12;
            if ((var12 = this.field5383[var8]) < 0) {
                arg1[arg4++] = (byte) (~var12);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field5383[var8];
            }
            int var13;
            if ((var13 = this.field5383[var8]) < 0) {
                arg1[arg4++] = (byte) (~var13);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field5383[var8];
            }
            int var14;
            if ((var14 = this.field5383[var8]) < 0) {
                arg1[arg4++] = (byte) (~var14);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field5383[var8];
            }
            int var15;
            if ((var15 = this.field5383[var8]) < 0) {
                arg1[arg4++] = (byte) (~var15);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field5383[var8];
            }
            int var16;
            if ((var16 = this.field5383[var8]) < 0) {
                arg1[arg4++] = (byte) (~var16);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field5383[var8];
            }
            int var17;
            if ((var17 = this.field5383[var8]) < 0) {
                arg1[arg4++] = (byte) (~var17);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field5383[var8];
            }
            int var18;
            if ((var18 = this.field5383[var8]) < 0) {
                arg1[arg4++] = (byte) (~var18);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 154)
    public static final void method2198(int arg0) {
        class101.method671(false, 64);
        field5381++;
        if (class324.field4456 >= 0 && class324.field4456 != 0) {
            class196.method1211(false, class324.field4456);
            class324.field4456 = -1;
        }
        if (arg0 != -21963) {
            field5390 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V", line = 172)
    public static void method2199(int arg0) {
        field5382 = null;
        if (arg0 != -1379803327) {
            field5382 = null;
        }
        field5390 = null;
        field5391 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I[BI[BII)I", line = 188)
    public final int method2200(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field5388++;
        int var7 = 0;
        int var8 = arg2 + arg4;
        int var9 = arg0 << 3;
        if (arg5 <= 108) {
            field5382 = null;
        }
        while (var8 > arg4) {
            int var10 = arg1[arg4] & 0xFF;
            int var11 = this.field5389[var10];
            byte var12 = this.field5384[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var7 = class25.method183(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg3[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg3[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg3[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg3[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg4++;
        }
        return (var9 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIILme;I)V", line = 260)
    public static final void method2201(int arg0, int arg1, int arg2, int arg3, class129 arg4, int arg5) {
        field5385++;
        if (arg4.field1767 == -1 && arg4.field1761 == null) {
            return;
        }
        if (arg1 != 22001) {
            field5391 = null;
        }
        int var6 = 0;
        if (arg2 > arg4.field1780) {
            var6 += arg2 - arg4.field1780;
        } else if (arg2 < arg4.field1768) {
            var6 += arg4.field1768 - arg2;
        }
        int var7 = class437.field6374.field4273 * arg4.field1779 >> 8;
        if (arg3 > arg4.field1775) {
            var6 += arg3 - arg4.field1775;
        } else if (arg4.field1769 > arg3) {
            var6 += arg4.field1769 - arg3;
        }
        if (arg4.field1774 == 0 || arg4.field1774 < (var6 - 64) || class437.field6374.field4273 == 0 || arg4.field1759 != arg0) {
            if (arg4.field1766 != null) {
                class189.field2623.method942(arg4.field1766);
                arg4.field1766 = null;
            }
            if (arg4.field1758 != null) {
                class189.field2623.method942(arg4.field1758);
                arg4.field1758 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg4.field1774 - var6) * var7 / arg4.field1774;
        if (arg4.field1766 != null) {
            arg4.field1766.method1599(var8);
        } else if (arg4.field1767 >= 0) {
            class363 var9 = class363.method2044(class266.field3645, arg4.field1767, 0);
            if (var9 != null) {
                class286 var10 = var9.method2047().method1635(class184.field2579);
                class280 var11 = class280.method1587(var10, 100, var8);
                var11.method1575(-1);
                class189.field2623.method939(var11);
                arg4.field1766 = var11;
            }
        }
        if (arg4.field1758 != null) {
            arg4.field1758.method1599(var8);
            if (arg4.field1758.method2944((byte) 119)) {
                return;
            }
            arg4.field1758 = null;
        } else if (arg4.field1761 != null && (arg4.field1757 -= arg5) <= 0) {
            int var12 = (int) ((double) arg4.field1761.length * Math.random());
            class363 var13 = class363.method2044(class266.field3645, arg4.field1761[var12], 0);
            if (var13 != null) {
                class286 var14 = var13.method2047().method1635(class184.field2579);
                class280 var15 = class280.method1587(var14, 100, var8);
                var15.method1575(0);
                class189.field2623.method939(var15);
                arg4.field1758 = var15;
                arg4.field1757 = arg4.field1760 + (int) (Math.random() * (double) (arg4.field1770 - arg4.field1760));
                return;
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "([B)V", line = 391)
    public class383(byte[] arg0) {
        int var2 = arg0.length;
        this.field5389 = new int[var2];
        this.field5384 = arg0;
        int[] var3 = new int[33];
        this.field5383 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field5389[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class25.method183(var11, var12);
                    }
                    var9 = var8 | var7;
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
                        if (this.field5383[var14] == 0) {
                            this.field5383[var14] = var4;
                        }
                        var14 = this.field5383[var14];
                    }
                    if (this.field5383.length <= var14) {
                        int[] var17 = new int[this.field5383.length * 2];
                        for (int var18 = 0; var18 < this.field5383.length; var18++) {
                            var17[var18] = this.field5383[var18];
                        }
                        this.field5383 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field5383[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
