import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class80 extends class58 {

    @OriginalMember(owner = "client!ig", name = "bb", descriptor = "Z")
    private boolean field1579 = false;

    @OriginalMember(owner = "client!ig", name = "gb", descriptor = "I")
    private int field1584 = -1;

    @OriginalMember(owner = "client!ig", name = "nb", descriptor = "Z")
    private volatile boolean field1591 = false;

    @OriginalMember(owner = "client!ig", name = "eb", descriptor = "I")
    private int field1582;

    @OriginalMember(owner = "client!ig", name = "jb", descriptor = "Lf;")
    private class48 field1587;

    @OriginalMember(owner = "client!ig", name = "ib", descriptor = "Lf;")
    private class48 field1586;

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "Led;")
    public static class43 field1575 = class191.method1219("null", false);

    @OriginalMember(owner = "client!ig", name = "ub", descriptor = "Led;")
    public static class43 field1598 = class191.method1219("Sprites geladen)3", false);

    @OriginalMember(owner = "client!ig", name = "pb", descriptor = "I")
    public static int field1593 = -1;

    @OriginalMember(owner = "client!ig", name = "hb", descriptor = "[I")
    public static int[] field1585 = new int[200];

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!ig", name = "Z", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!ig", name = "ab", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!ig", name = "cb", descriptor = "I")
    private int field1580;

    @OriginalMember(owner = "client!ig", name = "db", descriptor = "I")
    private int field1581;

    @OriginalMember(owner = "client!ig", name = "fb", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!ig", name = "kb", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!ig", name = "lb", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!ig", name = "mb", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!ig", name = "ob", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!ig", name = "qb", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!ig", name = "rb", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!ig", name = "tb", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!ig", name = "sb", descriptor = "Lig;")
    public static class80 field1596;

    @OriginalMember(owner = "client!ig", name = "vb", descriptor = "[Z")
    private volatile boolean[] field1599;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([BIZIZ)V")
    public final void method487(byte[] arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        if (arg3 != -1) {
            this.method493((byte[]) null, -113, (class48) null, false, (byte) -50);
        }
        ++field1597;
        if (!arg2) {
            arg0[arg0.length + -2] = (byte) (super.field1147[arg1] >> 8);
            arg0[arg0.length + -1] = (byte) super.field1147[arg1];
            if (this.field1586 != null) {
                class79.method482(arg0, true, this.field1586, arg1);
                this.field1599[arg1] = true;
            }
            if (arg4) {
                super.field1152[arg1] = class207.method1344(false, 27042, arg0);
                return;
            }
        } else {
            if (this.field1591) {
                throw new RuntimeException();
            }
            if (this.field1587 != null) {
                class79.method482(arg0, true, this.field1587, this.field1582);
            }
            this.method359(arg0, arg3 ^ 16987);
            this.method496(false);
        }
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(II)I")
    private final int method488(int arg0, int arg1) {
        ++field1583;
        if (super.field1152[arg1] != null) {
            return 100;
        } else {
            if (arg0 != 6923) {
                this.method497((byte) -25);
            }
            return this.field1599[arg1] ? 100 : class86.method518(this.field1582, (byte) -75, arg1);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLga;)V")
    public static final void method489(byte arg0, class58 arg1) {
        ++field1594;
        class108.field2062 = arg1;
        if (arg0 >= -52) {
            field1593 = -34;
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)I")
    public final int method490(int arg0) {
        ++field1588;
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < super.field1152.length; ++var4) {
            if (~super.field1146[var4] < -1) {
                var2 += 100;
                var3 += this.method488(6923, var4);
            }
        }
        if (~var2 == -1) {
            return 100;
        } else {
            return arg0 * var3 / var2;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)V")
    public final void method345(int arg0, byte arg1) {
        if (this.field1586 != null && this.field1599 != null && this.field1599[arg0]) {
            class112.method690(this, (byte) 73, arg0, this.field1586);
        } else {
            class52.method320(this, arg0, this.field1582, (byte) 99, (byte) 2, super.field1156[arg0], true);
        }
        ++field1595;
        if (arg1 >= -1) {
            this.field1599 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V")
    public static void method491(int arg0) {
        if (arg0 != -29263) {
            method489((byte) 61, (class58) null);
        }
        field1575 = null;
        field1598 = null;
        field1585 = null;
        field1596 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILed;Led;IIZLga;)V")
    public static final void method492(int arg0, class43 arg1, class43 arg2, int arg3, int arg4, boolean arg5, class58 arg6) {
        if (arg0 != -16630) {
            field1575 = null;
        }
        ++field1590;
        int var7 = arg6.method347(arg2, (byte) -103);
        int var8 = arg6.method362(arg1, (byte) -47, var7);
        class156.method990(arg0 ^ -16629, arg3, var7, arg5, arg6, arg4, var8);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([BILf;ZB)V")
    public final void method493(byte[] arg0, int arg1, class48 arg2, boolean arg3, byte arg4) {
        if (arg4 >= 73) {
            ++field1592;
            if (this.field1587 == arg2) {
                if (this.field1591) {
                    throw new RuntimeException();
                } else if (arg0 == null) {
                    class52.method320(this, this.field1582, 255, (byte) 111, (byte) 0, this.field1581, true);
                } else {
                    class55.field1109.reset();
                    class55.field1109.update(arg0, 0, arg0.length);
                    int var6 = (int) class55.field1109.getValue();
                    class89 var7 = new class89(class127.method822(arg0, -24334));
                    int var8 = var7.method538((byte) 89);
                    if (~var8 != -6 && ~var8 != -7) {
                        throw new RuntimeException("Incorrect JS5 protocol number: " + var8);
                    } else {
                        int var9 = 0;
                        if (var8 >= 6) {
                            var9 = var7.method545(-7436);
                        }
                        if (this.field1581 == var6 && ~this.field1580 == ~var9) {
                            this.method359(arg0, -16988);
                            this.method496(false);
                        } else {
                            class52.method320(this, this.field1582, 255, (byte) 109, (byte) 0, this.field1581, true);
                        }
                    }
                }
            } else {
                if (!arg3 && ~this.field1584 == ~arg1) {
                    this.field1591 = true;
                }
                if (arg0 != null && arg0.length > 2) {
                    class55.field1109.reset();
                    class55.field1109.update(arg0, 0, arg0.length + -2);
                    int var10 = (int) class55.field1109.getValue();
                    int var11 = ((255 & arg0[arg0.length - 2]) << 8) + (arg0[arg0.length - 1] & 255);
                    if (~super.field1156[arg1] == ~var10 && ~super.field1147[arg1] == ~var11) {
                        this.field1599[arg1] = true;
                        if (arg3) {
                            super.field1152[arg1] = class207.method1344(false, 27042, arg0);
                        }
                    } else {
                        this.field1599[arg1] = false;
                        if (this.field1579 || arg3) {
                            class52.method320(this, arg1, this.field1582, (byte) 111, (byte) 2, super.field1156[arg1], arg3);
                        }
                    }
                } else {
                    this.field1599[arg1] = false;
                    if (this.field1579 || arg3) {
                        class52.method320(this, arg1, this.field1582, (byte) 97, (byte) 2, super.field1156[arg1], arg3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lf;Lf;IZZZ)V")
    public class80(class48 arg0, class48 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1582 = arg2;
        this.field1587 = arg1;
        this.field1586 = arg0;
        this.field1579 = arg5;
        class47.method293(this.field1582, 26027, this);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(IIZ)V")
    public final void method494(int arg0, int arg1, boolean arg2) {
        ++field1578;
        this.field1580 = arg0;
        this.field1581 = arg1;
        if (!arg2) {
            if (this.field1587 != null) {
                class112.method690(this, (byte) 73, this.field1582, this.field1587);
            } else {
                class52.method320(this, this.field1582, 255, (byte) 99, (byte) 0, this.field1581, true);
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(IB)V")
    public final void method353(int arg0, byte arg1) {
        ++field1574;
        if (arg1 <= 59) {
            method492(-118, (class43) null, (class43) null, -33, 88, true, (class58) null);
        }
        class54.method331(arg0, this.field1582, 6603);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([Led;III)Led;")
    public static final class43 method495(class43[] arg0, int arg1, int arg2, int arg3) {
        ++field1577;
        if (arg3 != 255) {
            method492(-105, (class43) null, (class43) null, -84, -127, true, (class58) null);
        }
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; ++var5) {
            if (arg0[arg1 - -var5] == null) {
                arg0[arg1 + var5] = class89.field1739;
            }
            var4 += arg0[arg1 + var5].field818;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; ~var8 > ~arg2; ++var8) {
            class43 var10 = arg0[arg1 - -var8];
            class42.method234(var10.field844, 0, var7, var6, var10.field818);
            var6 += var10.field818;
        }
        class43 var9 = new class43();
        var9.field818 = var4;
        var9.field844 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V")
    private final void method496(boolean arg0) {
        this.field1599 = new boolean[super.field1152.length];
        for (int var2 = 0; var2 < this.field1599.length; ++var2) {
            this.field1599[var2] = false;
        }
        ++field1573;
        if (this.field1586 == null) {
            this.field1591 = true;
        } else {
            this.field1584 = -1;
            for (int var3 = 0; ~var3 > ~this.field1599.length; ++var3) {
                if (~super.field1146[var3] < -1) {
                    class126.method814(this, (byte) -123, this.field1586, var3);
                    this.field1584 = var3;
                }
            }
            if (arg0) {
                this.method353(-124, (byte) -48);
            }
            if (~this.field1584 == 0) {
                this.field1591 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)I")
    public final int method497(byte arg0) {
        if (arg0 != -68) {
            method491(-60);
        }
        ++field1576;
        if (this.field1591) {
            return 100;
        } else if (super.field1152 != null) {
            return 99;
        } else {
            int var2 = class86.method518(255, (byte) -112, this.field1582);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }
}
