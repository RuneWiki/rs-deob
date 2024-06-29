import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class34 {

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "[B")
    private byte[] field544;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "[I")
    private int[] field554;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "[I")
    private int[] field542;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field541 = 0;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field547 = 0;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "Lve;")
    public static class255 field548 = class87.method607(111, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "Lef;")
    public static class310 field543 = new class310();

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "[Lve;")
    public static class255[] field549;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "[[Ldi;")
    public static class142[][] field555;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([B[BBIII)I", line = 18)
    public final int method187(byte[] arg0, byte[] arg1, byte arg2, int arg3, int arg4, int arg5) {
        field551++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg3 + arg5;
        int var8 = 0;
        if (arg2 != -111) {
            method193(80, -74);
        }
        int var9 = arg4;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field554[var8];
            }
            int var11;
            if ((var11 = this.field554[var8]) < 0) {
                arg0[arg3++] = (byte) (~var11);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field554[var8];
            }
            int var12;
            if ((var12 = this.field554[var8]) < 0) {
                arg0[arg3++] = (byte) (~var12);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field554[var8];
            }
            int var13;
            if ((var13 = this.field554[var8]) < 0) {
                arg0[arg3++] = (byte) (~var13);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field554[var8];
            }
            int var14;
            if ((var14 = this.field554[var8]) < 0) {
                arg0[arg3++] = (byte) (~var14);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field554[var8];
            }
            int var15;
            if ((var15 = this.field554[var8]) < 0) {
                arg0[arg3++] = (byte) (~var15);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field554[var8];
            }
            int var16;
            if ((var16 = this.field554[var8]) < 0) {
                arg0[arg3++] = (byte) (~var16);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field554[var8];
            }
            int var17;
            if ((var17 = this.field554[var8]) < 0) {
                arg0[arg3++] = (byte) (~var17);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field554[var8];
            }
            int var18;
            if ((var18 = this.field554[var8]) < 0) {
                arg0[arg3++] = (byte) (~var18);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 170)
    public static final void method188(int arg0) {
        if (arg0 != -1) {
            method188(-68);
        }
        class72.field1186.method553(-89);
        field545++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZZ)I", line = 186)
    public static final int method189(boolean arg0, boolean arg1) {
        field552++;
        if (arg1) {
            return -11;
        }
        long var2 = class218.method1541(104);
        for (class15 var4 = arg0 ? (class15) class252.field4244.method288((byte) -42) : (class15) class252.field4244.method289(96); var4 != null; var4 = (class15) class252.field4244.method289(73)) {
            if ((var4.field223 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field223 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field3568;
                    class76.field1246[var5] = class93.field1601[var5];
                    var4.method1502((byte) -82);
                    return var5;
                }
                var4.method1502((byte) -82);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B[BI[BII)I", line = 229)
    public final int method190(byte arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        int var7 = arg4 + arg5;
        int var8 = 25 % ((14 - arg0) / 61);
        field546++;
        int var9 = 0;
        int var10 = arg2 << 3;
        while (var7 > arg5) {
            int var11 = arg1[arg5] & 0xFF;
            byte var12 = this.field544[var11];
            int var13 = this.field542[var11];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var10 & 0x7;
            int var15 = var9 & -var14 >> 31;
            int var16 = var10 >> 3;
            int var17 = (var14 + var12 - 1 >> 3) + var16;
            int var18 = var14 + 24;
            arg3[var16] = (byte) (var9 = class264.method1836(var15, var13 >>> var18));
            if (var16 < var17) {
                var16++;
                var14 = var18 - 8;
                arg3[var16] = (byte) (var9 = var13 >>> var14);
                if (var17 > var16) {
                    var16++;
                    var14 -= 8;
                    arg3[var16] = (byte) (var9 = var13 >>> var14);
                    if (var17 > var16) {
                        var16++;
                        var14 -= 8;
                        arg3[var16] = (byte) (var9 = var13 >>> var14);
                        if (var16 < var17) {
                            var16++;
                            var14 -= 8;
                            arg3[var16] = (byte) (var9 = var13 << -var14);
                        }
                    }
                }
            }
            var10 += var12;
            arg5++;
        }
        return (var10 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([JI[Ljava/lang/Object;)V", line = 298)
    public static final void method191(long[] arg0, int arg1, Object[] arg2) {
        class131.method967((byte) -126, 0, arg0.length - 1, arg2, arg0);
        field550++;
        if (arg1 != 28777) {
            field543 = (class310) null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V", line = 309)
    public static void method192(byte arg0) {
        field543 = null;
        field549 = null;
        if (arg0 == -96) {
            field548 = null;
            field555 = (class142[][]) null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)I", line = 334)
    public static final int method193(int arg0, int arg1) {
        int var2 = -80 % ((-arg1 - 21) / 47);
        field553++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "([B)V", line = 348)
    public class34(byte[] arg0) {
        int var2 = arg0.length;
        int[] var3 = new int[33];
        this.field544 = arg0;
        this.field554 = new int[8];
        int var4 = 0;
        this.field542 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field542[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var7 | var8;
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
                        var3[var10] = class264.method1836(var12, var11);
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
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field554[var14] == 0) {
                            this.field554[var14] = var4;
                        }
                        var14 = this.field554[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field554.length <= var14) {
                        int[] var18 = new int[this.field554.length * 2];
                        for (int var19 = 0; var19 < this.field554.length; var19++) {
                            var18[var19] = this.field554[var19];
                        }
                        this.field554 = var18;
                    }
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field554[var14] = ~var5;
            }
        }
    }
}
