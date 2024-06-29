import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class699 extends class205 {

    @OriginalMember(owner = "client!gv", name = "v", descriptor = "[[S")
    public short[][] field9886;

    @OriginalMember(owner = "client!gv", name = "z", descriptor = "D")
    public double field9890;

    @OriginalMember(owner = "client!gv", name = "t", descriptor = "I")
    public static int field9884 = 0;

    @OriginalMember(owner = "client!gv", name = "u", descriptor = "I")
    public static int field9885;

    @OriginalMember(owner = "client!gv", name = "w", descriptor = "I")
    public static int field9887;

    @OriginalMember(owner = "client!gv", name = "x", descriptor = "I")
    public static int field9888;

    @OriginalMember(owner = "client!gv", name = "y", descriptor = "I")
    public static int field9889;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)J", line = 3)
    public final long method3885(byte arg0) {
        int var2 = -26 / ((53 - arg0) / 57);
        field9888++;
        return (long) (this.field9886[0].length | this.field9886.length << 0);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lpe;ZI)V", line = 13)
    public static final void method3886(class109 arg0, boolean arg1, int arg2) {
        field9885++;
        class228 var3 = arg0.method885(arg2 + 109);
        if (arg0.field1706 == 0) {
            arg0.field1703 = 0;
            class551.field7857 = -1;
            class736.field10372 = 0;
            return;
        }
        if (arg0.field1695 != -1 && arg0.field1686 == 0) {
            class82 var4 = class83.field1219.method2358((byte) 124, arg0.field1695);
            if (arg0.field1707 > 0 && var4.field1183 == 0) {
                class736.field10372 = 0;
                class551.field7857 = -1;
                arg0.field1703++;
                return;
            }
            if (arg0.field1707 <= 0 && var4.field1207 == 0) {
                class736.field10372 = 0;
                arg0.field1703++;
                class551.field7857 = -1;
                return;
            }
        }
        if (arg0.field1595 != -1 && arg0.field1669 <= class199.field3403) {
            class417 var5 = class41.field718.method1529((byte) 54, arg0.field1595);
            if (var5.field6123 && var5.field6136 != -1) {
                class82 var6 = class83.field1219.method2358((byte) 77, var5.field6136);
                if (arg0.field1707 > 0 && var6.field1183 == 0) {
                    class736.field10372 = 0;
                    arg0.field1703++;
                    class551.field7857 = -1;
                    return;
                }
                if (arg0.field1707 <= 0 && var6.field1207 == 0) {
                    class551.field7857 = -1;
                    class736.field10372 = 0;
                    arg0.field1703++;
                    return;
                }
            }
        }
        if (arg0.field1595 != -1 && arg0.field1669 <= class199.field3403) {
            class417 var7 = class41.field718.method1529((byte) 6, arg0.field1595);
            if (var7.field6123 && var7.field6136 != -1) {
                class82 var8 = class83.field1219.method2358((byte) -106, var7.field6136);
                if (arg0.field1707 > 0 && var8.field1183 == 0) {
                    class551.field7857 = -1;
                    arg0.field1703++;
                    class736.field10372 = 0;
                    return;
                }
                if (arg0.field1707 <= 0 && var8.field1207 == 0) {
                    arg0.field1703++;
                    class736.field10372 = 0;
                    class551.field7857 = -1;
                    return;
                }
            }
        }
        int var9 = arg0.field9477;
        int var10 = arg0.field9475;
        int var11 = arg0.field1702[arg0.field1706 - 1] * 512 + arg0.method878(arg2 - 5740) * 256;
        int var12 = arg0.field1704[arg0.field1706 - 1] * 512 + (arg0.method878(-5740) * 256);
        if (var11 > var9) {
            if (var12 > var10) {
                arg0.method897(10240, -93);
            } else if (var12 >= var10) {
                arg0.method897(12288, -108);
            } else {
                arg0.method897(14336, -119);
            }
        } else if (var11 < var9) {
            if (var10 < var12) {
                arg0.method897(6144, -106);
            } else if (var10 > var12) {
                arg0.method897(2048, -90);
            } else {
                arg0.method897(4096, arg2 - 112);
            }
        } else if (var10 < var12) {
            arg0.method897(8192, -85);
        } else if (var12 < var10) {
            arg0.method897(0, -103);
        }
        byte var13 = arg0.field1708[arg0.field1706 - 1];
        if (!arg1 && ((var11 - var9) > 1024 || var11 - var9 < -1024 || (var12 - var10) > 1024 || var12 - var10 < -1024)) {
            arg0.field9477 = var11;
            arg0.field9475 = var12;
            arg0.method884(false, arg0.field1659, arg2 + 30934);
            class736.field10372 = 0;
            if (arg0.field1707 > 0) {
                arg0.field1707--;
            }
            class551.field7857 = -1;
            arg0.field1706--;
            return;
        }
        int var14 = 16;
        boolean var15 = true;
        if (arg0 instanceof class461) {
            var15 = ((class461) arg0).field6688.field7341;
        }
        if (var15) {
            int var16 = arg0.field1659 - arg0.field1636.field7521;
            if (var16 != 0 && arg0.field1687 == -1 && arg0.field1606 != 0) {
                var14 = 8;
            }
            if (!arg1 && arg0.field1706 > 2) {
                var14 = 24;
            }
            if (!arg1 && arg0.field1706 > 3) {
                var14 = 32;
            }
        } else {
            if (!arg1 && arg0.field1706 > 1) {
                var14 = 24;
            }
            if (!arg1 && arg0.field1706 > 2) {
                var14 = 32;
            }
        }
        if (arg0.field1703 > 0 && arg0.field1706 > 1) {
            var14 = 32;
            arg0.field1703--;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        class736.field10372 = arg2;
        if (var3.field3657 != -1) {
            int var17 = var14 << 9;
            if (arg0.field1706 == 1) {
                int var18 = arg0.field1701 * arg0.field1701;
                int var19 = (arg0.field9477 <= var11 ? var11 - arg0.field9477 : arg0.field9477 - var11) << 9;
                int var20 = (var12 < arg0.field9475 ? arg0.field9475 - var12 : var12 - arg0.field9475) << 9;
                int var21 = var19 <= var20 ? var20 : var19;
                int var22 = var3.field3657 * 2 * var21;
                if (var22 < var18) {
                    arg0.field1701 /= 2;
                } else if (var21 < (var18 / 2)) {
                    arg0.field1701 -= var3.field3657;
                    if (arg0.field1701 < 0) {
                        arg0.field1701 = 0;
                    }
                } else if (var17 > arg0.field1701) {
                    arg0.field1701 += var3.field3657;
                    if (var17 < arg0.field1701) {
                        arg0.field1701 = var17;
                    }
                }
            } else if (arg0.field1701 < var17) {
                arg0.field1701 += var3.field3657;
                if (var17 < arg0.field1701) {
                    arg0.field1701 = var17;
                }
            } else if (arg0.field1701 > 0) {
                arg0.field1701 -= var3.field3657;
                if (arg0.field1701 < 0) {
                    arg0.field1701 = 0;
                }
            }
            var14 = arg0.field1701 >> 9;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        if (var9 == var11 && var10 == var12) {
            class551.field7857 = -1;
        } else {
            if (var9 < var11) {
                arg0.field9477 += var14;
                class736.field10372 |= 0x4;
                if (var11 < arg0.field9477) {
                    arg0.field9477 = var11;
                }
            } else if (var11 < var9) {
                arg0.field9477 -= var14;
                class736.field10372 |= 0x8;
                if (var11 > arg0.field9477) {
                    arg0.field9477 = var11;
                }
            }
            if (var10 < var12) {
                arg0.field9475 += var14;
                class736.field10372 |= 0x1;
                if (var12 < arg0.field9475) {
                    arg0.field9475 = var12;
                }
            } else if (var12 < var10) {
                class736.field10372 |= 0x2;
                arg0.field9475 -= var14;
                if (arg0.field9475 < var12) {
                    arg0.field9475 = var12;
                }
            }
            if (var14 >= 32) {
                class551.field7857 = 2;
            } else {
                class551.field7857 = var13;
            }
        }
        if (arg0.field9477 != var11 || arg0.field9475 != var12) {
            return;
        }
        arg0.field1706--;
        if (arg0.field1707 > 0) {
            arg0.field1707--;
            return;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IILjava/lang/String;)V", line = 358)
    public static final void method3887(int arg0, int arg1, String arg2) {
        field9889++;
        class118 var3 = class86.method755(true, arg0, arg1);
        var3.method933((byte) 82);
        var3.field1813 = arg2;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIZ)Z", line = 370)
    public static final boolean method3888(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method3887(-74, -128, null);
        }
        field9887++;
        return class131.method1059(33, arg0, arg1) | (arg1 & 0x70000) != 0 || class312.method2057(arg1, arg0, -1);
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "([[SD)V", line = 384)
    public class699(short[][] arg0, double arg1) {
        this.field9886 = arg0;
        this.field9890 = arg1;
    }
}
