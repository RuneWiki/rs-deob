import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class122 extends class152 implements class620 {

    @OriginalMember(owner = "client!aba", name = "T", descriptor = "B")
    private byte field1582;

    @OriginalMember(owner = "client!aba", name = "O", descriptor = "Z")
    private boolean field1577;

    @OriginalMember(owner = "client!aba", name = "z", descriptor = "B")
    private byte field1562;

    @OriginalMember(owner = "client!aba", name = "D", descriptor = "Z")
    private boolean field1566;

    @OriginalMember(owner = "client!aba", name = "E", descriptor = "S")
    private short field1567;

    @OriginalMember(owner = "client!aba", name = "V", descriptor = "Z")
    private boolean field1584;

    @OriginalMember(owner = "client!aba", name = "q", descriptor = "Z")
    private boolean field1553;

    @OriginalMember(owner = "client!aba", name = "Y", descriptor = "Lw;")
    private class605 field1587;

    @OriginalMember(owner = "client!aba", name = "y", descriptor = "Lba;")
    private class107 field1561;

    @OriginalMember(owner = "client!aba", name = "B", descriptor = "[Lfd;")
    public static class418[] field1564 = new class418[2048];

    @OriginalMember(owner = "client!aba", name = "C", descriptor = "Lra;")
    public static class361 field1565 = new class361(79, 2);

    @OriginalMember(owner = "client!aba", name = "W", descriptor = "Lfs;")
    public static class546 field1585 = new class546("WTQA", 2);

    @OriginalMember(owner = "client!aba", name = "p", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!aba", name = "r", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!aba", name = "s", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!aba", name = "t", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!aba", name = "u", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!aba", name = "v", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!aba", name = "w", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!aba", name = "x", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!aba", name = "F", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!aba", name = "G", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!aba", name = "H", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!aba", name = "I", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!aba", name = "J", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!aba", name = "K", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!aba", name = "L", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!aba", name = "M", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!aba", name = "N", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!aba", name = "P", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!aba", name = "Q", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!aba", name = "R", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!aba", name = "S", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!aba", name = "U", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!aba", name = "X", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!aba", name = "ab", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!aba", name = "A", descriptor = "Lcd;")
    private class564 field1563;

    @OriginalMember(owner = "client!aba", name = "Z", descriptor = "Lnfa;")
    public static class665 field1588;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IILoa;ILcq;ZI)V", line = 3)
    public final void method73(int arg0, int arg1, class43 arg2, int arg3, class274 arg4, boolean arg5, int arg6) {
        if (arg6 > -2) {
            this.method73(111, 36, (class43) null, 68, (class274) null, true, -14);
        }
        if (arg4 instanceof class122) {
            class122 var8 = (class122) arg4;
            if (this.field1561 != null && var8.field1561 != null) {
                this.field1561.method831(var8.field1561, arg3, arg1, arg0, arg5);
            }
        }
        ++field1579;
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(Loa;I)V", line = 23)
    public final void method65(class43 arg0, int arg1) {
        if (arg1 < -121) {
            ++field1568;
            Object var3 = null;
            class605 var5;
            if (this.field1587 == null && this.field1553) {
                class390 var4 = this.method908(true, 262144, (byte) 36, arg0);
                var5 = var4 == null ? null : var4.field4995;
            } else {
                var5 = this.field1587;
                this.field1587 = null;
            }
            if (var5 != null) {
                class567.method3035(var5, this.field1582, super.field1943, super.field1934, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Loa;Lsa;IIIIZIZ)V", line = 51)
    public class122(class43 arg0, class698 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field9675, arg1.field9629, arg1.field9624);
        this.field1582 = (byte) arg2;
        this.field1577 = arg1.field9660 != 0 && !arg6;
        this.field1562 = (byte) arg7;
        super.field1943 = arg3;
        super.field1934 = arg5;
        this.field1566 = arg6;
        this.field1567 = (short) arg1.field9625;
        this.field1584 = arg8;
        this.field1553 = arg0.method389() && arg1.field9591 && !this.field1566 && class260.field3509.method733(class364.field4697, (byte) -48) != 0;
        int var10 = 2048;
        if (this.field1584) {
            var10 |= 65536;
        }
        class390 var11 = this.method908(this.field1553, var10, (byte) 36, arg0);
        if (var11 != null) {
            this.field1587 = var11.field4995;
            this.field1561 = var11.field4994;
            if (this.field1584) {
                this.field1561 = this.field1561.method479((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Loa;II)Lba;", line = 86)
    public final class107 method63(class43 arg0, int arg1, int arg2) {
        ++field1556;
        if (arg2 != 25871) {
            method906(36, 36, -108, (class227) null, -60);
        }
        return this.method909((byte) 15, arg0, arg1);
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIII)V", line = 98)
    public static final void method902(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1575;
        int var5 = 0;
        if (arg0 != -8979) {
            method905(114L, -79);
        }
        int var6 = arg3;
        int var7 = -arg3;
        class349.method2008(arg3 + arg4, (byte) 96, class213.field2746[arg1], -arg3 + arg4, arg2);
        int var8 = -1;
        while (~var5 > ~var6) {
            var8 += 2;
            ++var5;
            var7 += var8;
            if (~var7 <= -1) {
                --var6;
                var7 -= var6 << 1;
                int[] var9 = class213.field2746[arg1 + var6];
                int[] var10 = class213.field2746[-var6 + arg1];
                int var11 = arg4 - -var5;
                int var12 = -var5 + arg4;
                class349.method2008(var11, (byte) 12, var9, var12, arg2);
                class349.method2008(var11, (byte) 34, var10, var12, arg2);
            }
            int var13 = arg4 + var6;
            int var14 = arg4 - var6;
            int[] var15 = class213.field2746[arg1 + var5];
            int[] var16 = class213.field2746[-var5 + arg1];
            class349.method2008(var13, (byte) 32, var15, var14, arg2);
            class349.method2008(var13, (byte) 44, var16, var14, arg2);
        }
    }

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "(B)V", line = 151)
    public final void method77(byte arg0) {
        if (arg0 != 7) {
            this.field1577 = false;
        }
        ++field1558;
        this.field1584 = false;
        if (this.field1561 != null) {
            this.field1561.method825(this.field1561.method796() & -65537);
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIFIFFFFLjr;II[BI)V", line = 171)
    public static final void method903(int arg0, int arg1, int arg2, float arg3, int arg4, float arg5, float arg6, float arg7, float arg8, class288 arg9, int arg10, int arg11, byte[] arg12, int arg13) {
        ++field1571;
        int var14 = arg0 * arg1;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg13; ++var16) {
            int var20 = arg11;
            arg9.method1712(arg0, arg5 / (float) arg10, var15, 0, (byte) -100, arg2, arg10, arg1, arg3 / (float) arg0, arg8 / (float) arg1, arg7 * 127.0F);
            for (int var21 = 0; ~var21 > ~var14; ++var21) {
                arg12[var20] = (byte) ((int) ((float) arg12[var20] + var15[var21]));
                ++var20;
            }
            arg7 = arg6 * arg7;
            arg3 *= 2.0F;
            arg5 *= 2.0F;
            arg8 *= 2.0F;
        }
        int var17 = arg11;
        int var18 = -58 % ((-10 - arg4) / 57);
        for (int var19 = 0; var14 > var19; ++var19) {
            arg12[var17] = (byte) (arg12[var17] + 127);
            ++var17;
        }
    }

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "(B)V", line = 221)
    public static final void method904(byte arg0) {
        int var1 = -52 % ((arg0 - -66) / 59);
        ++field1557;
        if (class379.field4854 != null) {
            class687[] var2 = class379.field4854;
            for (int var3 = 0; var2.length > var3; ++var3) {
                class687 var4 = var2[var3];
                var4.method546(-369);
            }
        }
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(JI)V", line = 244)
    public static final void method905(long arg0, int arg1) {
        ++field1555;
        if (arg0 > 0L) {
            if (~(arg0 % 10L) != -1L) {
                class273.method1660(arg0, arg1 ^ -263);
            } else {
                class273.method1660(arg0 + -1L, 6406);
                class273.method1660(1L, 6406);
            }
            if (arg1 != -6145) {
                method907((class622) null, (byte) 87);
            }
        }
    }

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "(B)I", line = 266)
    public final int method66(byte arg0) {
        if (arg0 != -42) {
            field1564 = null;
        }
        ++field1580;
        return 22;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIILwk;I)V", line = 277)
    public static final void method906(int arg0, int arg1, int arg2, class227 arg3, int arg4) {
        ++field1581;
        class501 var5 = arg3.method1435((byte) -38);
        int var6 = 16383 & -arg3.field2988.field5184 + arg3.field2947;
        if (arg1 == -1) {
            if (~var6 == -1 && arg3.field2992 <= 25) {
                if (!arg3.field2976 || !var5.method2712(arg3.field3025, (byte) 116)) {
                    arg3.field3025 = var5.method2710(-111);
                    arg3.field2976 = arg3.field3025 != -1;
                }
            } else {
                if (arg4 < 0 && ~var5.field6568 != 0) {
                    arg3.field3025 = var5.field6568;
                } else if (~arg4 < -1 && ~var5.field6613 != 0) {
                    arg3.field3025 = var5.field6613;
                } else {
                    arg3.field3025 = var5.field6594;
                }
                arg3.field2976 = false;
            }
        } else if (arg3.field3001 != -1 && (~var6 <= -10241 || ~var6 >= -2049)) {
            int var7 = class17.field197[arg0] + -arg3.field2988.field5184 & 16383;
            arg3.field2976 = false;
            if (arg1 == 2 && var5.field6570 != -1) {
                if (var7 > 2048 && var7 <= 6144 && ~var5.field6587 != 0) {
                    arg3.field3025 = var5.field6587;
                } else if (~var7 <= -10241 && var7 < 14336 && var5.field6608 != -1) {
                    arg3.field3025 = var5.field6608;
                } else if (var7 > 6144 && ~var7 > -10241 && var5.field6574 != -1) {
                    arg3.field3025 = var5.field6574;
                } else {
                    arg3.field3025 = var5.field6570;
                }
            } else if (arg1 == 0 && var5.field6610 != -1) {
                if (~var7 < -2049 && var7 <= 6144 && ~var5.field6612 != 0) {
                    arg3.field3025 = var5.field6612;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field6597 != -1) {
                    arg3.field3025 = var5.field6597;
                } else if (var7 > 6144 && ~var7 > -10241 && ~var5.field6572 != 0) {
                    arg3.field3025 = var5.field6572;
                } else {
                    arg3.field3025 = var5.field6610;
                }
            } else if (~var7 < -2049 && ~var7 >= -6145 && var5.field6579 != -1) {
                arg3.field3025 = var5.field6579;
            } else if (~var7 <= -10241 && ~var7 > -14337 && var5.field6585 != -1) {
                arg3.field3025 = var5.field6585;
            } else if (~var7 < -6145 && ~var7 > -10241 && ~var5.field6600 != 0) {
                arg3.field3025 = var5.field6600;
            } else {
                arg3.field3025 = var5.field6594;
            }
        } else if (var6 == 0 && ~arg3.field2992 >= -26) {
            if (arg1 == 2 && var5.field6570 != -1) {
                arg3.field3025 = var5.field6570;
            } else if (arg1 == 0 && var5.field6610 != -1) {
                arg3.field3025 = var5.field6610;
            } else {
                arg3.field3025 = var5.field6594;
            }
            arg3.field2976 = false;
        } else {
            arg3.field2976 = false;
            if (~arg1 == -3 && ~var5.field6570 != 0) {
                if (arg4 < 0 && ~var5.field6573 != 0) {
                    arg3.field3025 = var5.field6573;
                } else if (arg4 > 0 && var5.field6575 != -1) {
                    arg3.field3025 = var5.field6575;
                } else {
                    arg3.field3025 = var5.field6570;
                }
            } else if (~arg1 == -1 && var5.field6610 != -1) {
                if (~arg4 > -1 && var5.field6609 != -1) {
                    arg3.field3025 = var5.field6609;
                } else if (~arg4 < -1 && var5.field6611 != -1) {
                    arg3.field3025 = var5.field6611;
                } else {
                    arg3.field3025 = var5.field6610;
                }
            } else if (~arg4 > -1 && var5.field6601 != -1) {
                arg3.field3025 = var5.field6601;
            } else if (arg4 > 0 && var5.field6606 != -1) {
                arg3.field3025 = var5.field6606;
            } else {
                arg3.field3025 = var5.field6594;
            }
        }
        if (arg2 != 128) {
            field1585 = null;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Loa;B)Lpl;", line = 443)
    public final class215 method71(class43 arg0, byte arg1) {
        ++field1589;
        if (this.field1561 == null) {
            return null;
        } else {
            int var3 = -95 % ((arg1 - 12) / 41);
            class151 var4 = arg0.method402();
            var4.method146(super.field1943, super.field1942, super.field1934);
            class215 var5 = null;
            if (this.field1577) {
                var5 = class207.method1331(true, 1);
            }
            this.field1561.method827(var4, var5 == null ? null : var5.field2770[0], 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lji;B)V", line = 471)
    public static final void method907(class622 arg0, byte arg1) {
        if (class603.field8116 == null) {
            class358 var2 = new class358();
            byte[] var3 = var2.method2059(128, 128, -1672, 16);
            class603.field8116 = class708.method3882(-137, var3, false);
        }
        ++field1569;
        if (class405.field5159 == null) {
            class116 var4 = new class116();
            byte[] var5 = var4.method871(128, 128, 16, (byte) 105);
            class405.field5159 = class708.method3882(-137, var5, false);
        }
        if (arg1 <= -51) {
            class509 var6 = arg0.field8568;
            if (var6.method2742(35632) && class440.field5681 == null) {
                byte[] var7 = class424.method2441(0.5F, 4.0F, 8, 4.0F, 0.6F, 8, 128, 16, 16.0F, new class683(419684), 128);
                class440.field5681 = class708.method3882(-137, var7, false);
            }
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IILoa;I)Z", line = 511)
    public final boolean method74(int arg0, int arg1, class43 arg2, int arg3) {
        ++field1583;
        if (arg3 >= -98) {
            this.method73(3, 24, (class43) null, -115, (class274) null, true, 9);
        }
        class107 var5 = this.method909((byte) 15, arg2, 131072);
        if (var5 != null) {
            class151 var6 = arg2.method402();
            var6.method146(super.field1943, super.field1942, super.field1934);
            return var5.method832(arg1, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "(I)Z", line = 534)
    public final boolean method78(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field1586;
            return this.field1584;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Z)I", line = 548)
    public final int method70(boolean arg0) {
        ++field1560;
        if (!arg0) {
            this.field1563 = null;
        }
        return this.field1562;
    }

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "(Loa;I)Lcd;", line = 565)
    public final class564 method72(class43 arg0, int arg1) {
        ++field1573;
        if (arg1 != 21098) {
            return null;
        } else {
            if (this.field1563 == null) {
                this.field1563 = class240.method1519(super.field1942, this.method909((byte) 15, arg0, 0), super.field1943, 1, super.field1934);
            }
            return this.field1563;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(ZIBLoa;)Lid;", line = 580)
    private final class390 method908(boolean arg0, int arg1, byte arg2, class43 arg3) {
        ++field1576;
        if (arg2 != 36) {
            return null;
        } else {
            class698 var5 = class348.field4436.method1900(-123, this.field1567 & 65535);
            class88 var6;
            class88 var7;
            if (this.field1566) {
                var6 = class353.field4540[0];
                var7 = class477.field6327[this.field1582];
            } else {
                if (this.field1582 < 3) {
                    var6 = class353.field4540[this.field1582 + 1];
                } else {
                    var6 = null;
                }
                var7 = class353.field4540[this.field1582];
            }
            return var5.method3811(arg0, var7, super.field1934, super.field1942, 22, this.field1562, arg3, arg1, var6, -20, super.field1943);
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)V", line = 610)
    public final void method64(byte arg0) {
        int var2 = 91 % ((-71 - arg0) / 39);
        if (this.field1561 != null) {
            this.field1561.method818();
        }
        ++field1559;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)Z", line = 623)
    public final boolean method75(int arg0) {
        ++field1552;
        int var2 = 4 % ((arg0 - 26) / 38);
        return this.field1553;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Loa;I)V", line = 633)
    public final void method62(class43 arg0, int arg1) {
        ++field1572;
        Object var3 = null;
        class605 var5;
        if (this.field1587 == null && this.field1553) {
            class390 var4 = this.method908(true, 262144, (byte) 36, arg0);
            var5 = var4 != null ? var4.field4995 : null;
        } else {
            var5 = this.field1587;
            this.field1587 = null;
        }
        if (var5 != null) {
            class183.method1230(var5, this.field1582, super.field1943, super.field1934, (boolean[]) null);
        }
        if (arg1 != 6526) {
            method903(39, -23, -17, 0.71615344F, -59, -0.6876129F, -0.051279865F, -0.0015519552F, 0.12298883F, (class288) null, -87, 78, (byte[]) null, -92);
        }
    }

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "(Loa;I)V", line = 668)
    public final void method67(class43 arg0, int arg1) {
        if (arg1 != 2) {
            this.field1566 = false;
        }
        ++field1554;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(BLoa;I)Lba;", line = 679)
    private final class107 method909(byte arg0, class43 arg1, int arg2) {
        ++field1574;
        if (arg0 != 15) {
            method904((byte) 57);
        }
        if (this.field1561 != null && arg1.method377(this.field1561.method796(), arg2) == 0) {
            return this.field1561;
        } else {
            class390 var4 = this.method908(false, arg2, (byte) 36, arg1);
            return var4 != null ? var4.field4994 : null;
        }
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(B)I", line = 703)
    public final int method76(byte arg0) {
        if (arg0 > -92) {
            return -77;
        } else {
            ++field1578;
            return 65535 & this.field1567;
        }
    }

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "(B)V", line = 715)
    public static void method910(byte arg0) {
        field1565 = null;
        field1585 = null;
        field1564 = null;
        field1588 = null;
        if (arg0 != 62) {
            field1564 = null;
        }
    }
}
