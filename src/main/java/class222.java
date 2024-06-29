import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class222 extends class325 {

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
    private int field3204 = -32768;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
    private int field3202 = 0;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    private int field3197 = -1;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
    private int field3213 = 0;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "Z")
    public boolean field3214 = false;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
    public int field3216;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "I")
    private int field3207;

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "Lqp;")
    private class303 field3217;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "I")
    public static int field3201 = 0;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
    public static int field3210 = -1;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "Lan;")
    private class113 field3208;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ln;Lvc;B)V", line = 4)
    private final void method1522(class468 arg0, class89 arg1, byte arg2) {
        if (arg2 != -76) {
            this.method77(101, (class89) null, -117, 13);
        }
        ++field3206;
        class295[] var4 = arg0.method1601();
        class235[] var5 = arg0.method1564();
        if ((this.field3208 == null || this.field3208.field1578) && (var4 != null || var5 != null)) {
            this.field3208 = new class113(class364.field5010);
        }
        if (this.field3208 != null) {
            this.field3208.method891(arg1, (long) class364.field5010, var4, var5, false);
            this.field3208.method895(super.field4531, super.field4535, super.field4526, super.field4539, super.field4534);
        }
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(B)I", line = 29)
    public final int method251(byte arg0) {
        if (arg0 != 5) {
            this.field3213 = 22;
        }
        ++field3212;
        return this.field3204;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILvc;B)Ln;", line = 42)
    private final class468 method1523(int arg0, class89 arg1, byte arg2) {
        ++field3203;
        if (arg2 != 69) {
            this.method1523(-121, (class89) null, (byte) -4);
        }
        class217 var4 = class371.field5108.method1664(this.field3207, 114);
        return !this.field3214 ? var4.method1495((byte) 126, this.field3202, arg0, this.field3197, class386.field5289, arg1, this.field3213) : var4.method1495((byte) 43, -1, arg0, -1, class386.field5289, arg1, 0);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 56)
    public final void method1524(int arg0) {
        ++field3196;
        if (arg0 < -67) {
            if (this.field3208 != null) {
                this.field3208.method893();
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 72)
    public class222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        this.field3216 = arg1 + arg2;
        this.field3207 = arg0;
        int var12 = class371.field5108.method1664(this.field3207, -9).field3129;
        if (var12 == -1) {
            this.field3214 = true;
        } else {
            this.field3214 = false;
            this.field3217 = class386.field5289.method1856(72, var12);
        }
        if (~this.field3216 == ~arg2) {
            class178.method1275(this.field3202, false, false, super.field4531, super.field4537, this.field3217, super.field4530);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lvc;I)Lep;", line = 94)
    public final class309 method69(class89 arg0, int arg1) {
        ++field3195;
        class468 var3 = this.method1523(1024, arg0, (byte) 69);
        if (var3 == null) {
            return null;
        } else {
            class257 var4 = arg0.method306();
            var4.method96(super.field4537, super.field4532, super.field4530);
            if (this.field3208 == null) {
                var3.method1592(var4, (class63) null, 0);
            } else {
                class404 var5 = this.field3208.method896();
                arg0.method384(var3, var5, var4, (class63) null, 0);
            }
            this.field3204 = var3.method1591();
            if (arg1 != 10228) {
                this.field3204 = 29;
            }
            this.method1522(var3, arg0, (byte) -76);
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "finalize", descriptor = "()V", line = 125)
    protected final void finalize() {
        ++field3198;
        if (this.field3208 != null) {
            this.field3208.method893();
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZILvc;IILuq;I)V", line = 136)
    public final void method70(boolean arg0, int arg1, class89 arg2, int arg3, int arg4, class316 arg5, int arg6) {
        ++field3209;
        if (arg1 < 40) {
            this.field3216 = -10;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILvc;II)Z", line = 148)
    public final boolean method77(int arg0, class89 arg1, int arg2, int arg3) {
        ++field3211;
        if (arg0 != 0) {
            this.method68(11);
        }
        return false;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)Z", line = 163)
    public final boolean method68(int arg0) {
        int var2 = 75 / ((arg0 - 2) / 57);
        ++field3205;
        return false;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(ZLvc;)V", line = 176)
    public final void method86(boolean arg0, class89 arg1) {
        ++field3200;
        class468 var3 = this.method1523(0, arg1, (byte) 69);
        if (arg0) {
            this.field3204 = -108;
        }
        if (var3 != null) {
            this.method1522(var3, arg1, (byte) -76);
        }
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(B)V", line = 200)
    public final void method75(byte arg0) {
        ++field3215;
        if (arg0 != 111) {
            this.field3202 = 126;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)V", line = 212)
    public final void method1525(int arg0, int arg1) {
        ++field3194;
        if (!this.field3214) {
            this.field3213 += arg0;
            while (this.field3217.field4283[this.field3202] < this.field3213) {
                this.field3213 -= this.field3217.field4283[this.field3202];
                ++this.field3202;
                if (this.field3202 >= this.field3217.field4286.length) {
                    this.field3214 = true;
                    break;
                }
            }
            if (arg1 == -17634) {
                if (!this.field3214) {
                    class178.method1275(this.field3202, false, false, super.field4531, super.field4537, this.field3217, super.field4530);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZLfo;Z)V", line = 244)
    public static final void method1526(boolean arg0, class418 arg1, boolean arg2) {
        ++field3199;
        class389 var3 = arg1.method2506(-16338);
        if (arg2) {
            method1526(false, (class418) null, false);
        }
        if (arg1.field5810 == 0) {
            arg1.field5805 = 0;
            class92.field1300 = -1;
            class153.field2125 = 0;
        } else {
            if (arg1.field5742 != -1 && arg1.field5773 == 0) {
                class303 var4 = class386.field5289.method1856(57, arg1.field5742);
                if (~arg1.field5809 < -1 && ~var4.field4296 == -1) {
                    class153.field2125 = 0;
                    ++arg1.field5805;
                    class92.field1300 = -1;
                    return;
                }
                if (~arg1.field5809 >= -1 && var4.field4291 == 0) {
                    class92.field1300 = -1;
                    ++arg1.field5805;
                    class153.field2125 = 0;
                    return;
                }
            }
            if (~arg1.field5759 != 0 && ~class364.field5010 <= ~arg1.field5730) {
                class217 var5 = class371.field5108.method1664(arg1.field5759, 106);
                if (var5.field3128 && var5.field3129 != -1) {
                    class303 var6 = class386.field5289.method1856(116, var5.field3129);
                    if (arg1.field5809 > 0 && var6.field4296 == 0) {
                        class92.field1300 = -1;
                        class153.field2125 = 0;
                        ++arg1.field5805;
                        return;
                    }
                    if (arg1.field5809 <= 0 && ~var6.field4291 == -1) {
                        class153.field2125 = 0;
                        ++arg1.field5805;
                        class92.field1300 = -1;
                        return;
                    }
                }
            }
            int var7 = arg1.field4537;
            int var8 = arg1.field4530;
            int var9 = arg1.field5811[arg1.field5810 + -1] * 128 + arg1.method245(4452) * 64;
            int var10 = arg1.field5807[arg1.field5810 + -1] * 128 - -(64 * arg1.method245(4452));
            if (~var7 <= ~var9) {
                if (~var7 >= ~var9) {
                    if (~var8 <= ~var10) {
                        if (var10 < var8) {
                            arg1.method2507(0, false);
                        }
                    } else {
                        arg1.method2507(8192, false);
                    }
                } else if (~var10 < ~var8) {
                    arg1.method2507(6144, false);
                } else if (~var10 <= ~var8) {
                    arg1.method2507(4096, false);
                } else {
                    arg1.method2507(2048, false);
                }
            } else if (var10 <= var8) {
                if (var8 <= var10) {
                    arg1.method2507(12288, arg2);
                } else {
                    arg1.method2507(14336, false);
                }
            } else {
                arg1.method2507(10240, false);
            }
            byte var11 = arg1.field5808[arg1.field5810 + -1];
            if (!arg0 && (~(-var7 + var9) < -257 || -var7 + var9 < -256 || ~(-var8 + var10) < -257 || ~(-var8 + var10) > 255)) {
                arg1.field4537 = var9;
                arg1.field4530 = var10;
                arg1.method2499((byte) -29, arg1.field5733);
                if (arg1.field5809 > 0) {
                    --arg1.field5809;
                }
                class153.field2125 = 0;
                --arg1.field5810;
                class92.field1300 = -1;
            } else {
                int var12 = 4;
                boolean var13 = true;
                if (arg1 instanceof class361) {
                    var13 = ((class361) arg1).field4952.field440;
                }
                if (var13) {
                    int var14 = -arg1.field5772.field3970 + arg1.field5733;
                    if (var14 != 0 && ~arg1.field5748 == 0 && arg1.field5780 != 0) {
                        var12 = 2;
                    }
                    if (!arg0 && arg1.field5810 > 2) {
                        var12 = 6;
                    }
                    if (!arg0 && arg1.field5810 > 3) {
                        var12 = 8;
                    }
                } else {
                    if (!arg0 && ~arg1.field5810 < -2) {
                        var12 = 6;
                    }
                    if (!arg0 && ~arg1.field5810 < -3) {
                        var12 = 8;
                    }
                }
                if (~arg1.field5805 < -1 && arg1.field5810 > 1) {
                    --arg1.field5805;
                    var12 = 8;
                }
                if (~var11 != -3) {
                    if (var11 == 0) {
                        var12 >>= 1;
                    }
                } else {
                    var12 <<= 1;
                }
                if (~var3.field5342 != 0) {
                    int var15 = var12 << 7;
                    if (~arg1.field5810 == -2) {
                        int var16 = arg1.field5804 * arg1.field5804;
                        int var17 = (var9 >= arg1.field4537 ? var9 - arg1.field4537 : -var9 + arg1.field4537) << 7;
                        int var18 = (~arg1.field4530 >= ~var10 ? -arg1.field4530 + var10 : -var10 + arg1.field4530) << 7;
                        int var19 = ~var17 < ~var18 ? var17 : var18;
                        int var20 = var3.field5342 * 2 * var19;
                        if (~var16 < ~var20) {
                            arg1.field5804 /= 2;
                        } else if (~(var16 / 2) < ~var19) {
                            arg1.field5804 -= var3.field5342;
                            if (arg1.field5804 < 0) {
                                arg1.field5804 = 0;
                            }
                        } else if (~var15 < ~arg1.field5804) {
                            arg1.field5804 += var3.field5342;
                            if (~var15 > ~arg1.field5804) {
                                arg1.field5804 = var15;
                            }
                        }
                    } else if (~var15 >= ~arg1.field5804) {
                        if (arg1.field5804 > 0) {
                            arg1.field5804 -= var3.field5342;
                            if (~arg1.field5804 > -1) {
                                arg1.field5804 = 0;
                            }
                        }
                    } else {
                        arg1.field5804 += var3.field5342;
                        if (arg1.field5804 > var15) {
                            arg1.field5804 = var15;
                        }
                    }
                    var12 = arg1.field5804 >> 7;
                    if (~var12 > -2) {
                        var12 = 1;
                    }
                }
                class153.field2125 = 0;
                if (~var9 < ~var7) {
                    class153.field2125 |= 4;
                    arg1.field4537 += var12;
                    if (~var9 > ~arg1.field4537) {
                        arg1.field4537 = var9;
                    }
                } else if (var7 > var9) {
                    class153.field2125 |= 8;
                    arg1.field4537 -= var12;
                    if (arg1.field4537 < var9) {
                        arg1.field4537 = var9;
                    }
                }
                if (~var10 >= ~var8) {
                    if (var10 < var8) {
                        class153.field2125 |= 2;
                        arg1.field4530 -= var12;
                        if (~var10 < ~arg1.field4530) {
                            arg1.field4530 = var10;
                        }
                    }
                } else {
                    class153.field2125 |= 1;
                    arg1.field4530 += var12;
                    if (arg1.field4530 > var10) {
                        arg1.field4530 = var10;
                    }
                }
                if (arg1.field4537 == var9 && ~arg1.field4530 == ~var10) {
                    if (~arg1.field5809 < -1) {
                        --arg1.field5809;
                    }
                    --arg1.field5810;
                }
                if (var12 >= 8) {
                    class92.field1300 = 2;
                } else {
                    class92.field1300 = var11;
                }
            }
        }
    }
}
