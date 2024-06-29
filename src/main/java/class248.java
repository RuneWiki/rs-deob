import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class248 {

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
    private int field4471 = 32;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "J")
    private long field4456 = class205.method1403(-126);

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
    private int field4473 = 0;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
    private int field4476 = 0;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "Z")
    private boolean field4479 = true;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "J")
    private long field4478 = 0L;

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "[Laf;")
    private class156[] field4483 = new class156[8];

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "J")
    private long field4481 = 0L;

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
    private int field4482 = 0;

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "[Laf;")
    private class156[] field4484 = new class156[8];

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
    private int field4480 = 0;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field4446 = 0;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field4448 = -2;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Llc;")
    public static class143 field4453 = class66.method374("null", -1);

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "Llc;")
    public static class143 field4468 = class66.method374("Null", -1);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Llc;")
    private static class143 field4445 = class66.method374(" ", -1);

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "Llc;")
    public static class143 field4469 = field4445;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "I")
    private int field4474;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
    public int field4475;

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
    public int field4477;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Lda;")
    public static class102 field4450;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Laf;")
    private class156 field4460;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Lvh;")
    public static class43 field4458;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "[I")
    public int[] field4464;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method1641(Component arg0) throws Exception {
        field4466++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public final synchronized void method1642(byte arg0) {
        if (arg0 >= -15) {
            field4453 = null;
        }
        field4457++;
        this.field4479 = true;
        try {
            this.method1648();
        } catch (Exception var2) {
            this.method1645();
            this.field4481 = class205.method1403(-110) + 2000L;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLaf;I)V")
    private final void method1643(byte arg0, class156 arg1, int arg2) {
        if (arg0 != 82) {
            return;
        }
        int var4 = arg2 >> 5;
        field4462++;
        class156 var5 = this.field4484[var4];
        if (var5 == null) {
            this.field4483[var4] = arg1;
        } else {
            var5.field2806 = arg1;
        }
        this.field4484[var4] = arg1;
        arg1.field2804 = arg2;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()I")
    public int method1644() throws Exception {
        field4452++;
        return this.field4477;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()V")
    public void method1645() {
        field4467++;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
    public static final void method1646(byte arg0) {
        field4447++;
        class119.field2108.method824(-119);
        class124.field2168.method824(-118);
        if (arg0 < 12) {
            field4458 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public final void method1647(int arg0) {
        field4455++;
        if (arg0 != 0) {
            this.field4474 = 1;
        }
        this.field4479 = true;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "()V")
    public void method1648() throws Exception {
        field4461++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)V")
    public static final void method1649(int arg0, byte arg1) {
        class287.field5030.method835(1, arg0);
        int var2 = -15 / ((arg1 - 44) / 34);
        class4.field61.method835(1, arg0);
        field4463++;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "()V")
    public void method1650() throws Exception {
        field4449++;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public void method1651(int arg0) throws Exception {
        field4451++;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
    public final synchronized void method1652(int arg0) {
        if (arg0 != 1024) {
            this.method1655((class156) null, (byte) 117);
        }
        field4472++;
        if (class56.field1087 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class56.field1087.field4750[var3] == this) {
                    class56.field1087.field4750[var3] = null;
                }
                if (class56.field1087.field4750[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class56.field1087.field4761 = true;
                while (class56.field1087.field4758) {
                    class61.method347(50L, 1);
                }
                class56.field1087 = null;
            }
        }
        this.method1645();
        this.field4464 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([II)V")
    private final void method1653(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class83.field1509) {
            var3 = arg1 << 1;
        }
        class275.method1809(arg0, 0, var3);
        this.field4480 -= arg1;
        if (this.field4460 != null && this.field4480 <= 0) {
            this.field4480 += class190.field3494 >> 4;
            class208.method1449(100, this.field4460);
            this.method1643((byte) 82, this.field4460, this.field4460.method1024());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class156 var10 = null;
                        class156 var11 = this.field4483[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class73 var12 = var11.field2803;
                                if (var12 == null || var12.field1368 <= var8) {
                                    var11.field2805 = true;
                                    int var13 = var11.method993();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1368 += var13;
                                    }
                                    if (var4 >= this.field4471) {
                                        break label107;
                                    }
                                    class156 var14 = var11.method1004();
                                    if (var14 != null) {
                                        int var15 = var11.field2804;
                                        while (var14 != null) {
                                            this.method1643((byte) 82, var14, var15 * var14.method1024() >> 8);
                                            var14 = var11.method994();
                                        }
                                    }
                                    class156 var16 = var11.field2806;
                                    var11.field2806 = null;
                                    if (var10 == null) {
                                        this.field4483[var7] = var16;
                                    } else {
                                        var10.field2806 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4484[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2806;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class156 var18 = this.field4483[var17];
                this.field4483[var17] = this.field4484[var17] = null;
                while (var18 != null) {
                    class156 var19 = var18.field2806;
                    var18.field2806 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4480 < 0) {
            this.field4480 = 0;
        }
        if (this.field4460 != null) {
            this.field4460.method995(arg0, 0, arg1);
        }
        this.field4456 = class205.method1403(-38);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
    private final void method1654(int arg0, int arg1) {
        field4465++;
        this.field4480 -= arg0;
        int var3 = -19 / ((7 - arg1) / 58);
        if (this.field4480 < 0) {
            this.field4480 = 0;
        }
        if (this.field4460 != null) {
            this.field4460.method996(arg0);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Laf;B)V")
    public final synchronized void method1655(class156 arg0, byte arg1) {
        this.field4460 = arg0;
        field4470++;
        if (arg1 < 112) {
            this.field4476 = 31;
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
    public static void method1656(int arg0) {
        field4469 = null;
        if (arg0 != 0) {
            return;
        }
        field4468 = null;
        field4450 = null;
        field4458 = null;
        field4453 = null;
        field4445 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
    public final synchronized void method1657(boolean arg0) {
        field4454++;
        if (this.field4464 == null) {
            return;
        }
        long var2 = class205.method1403(127);
        try {
            if (this.field4481 != 0L) {
                if (var2 < this.field4481) {
                    return;
                }
                this.method1651(this.field4477);
                this.field4479 = true;
                this.field4481 = 0L;
            }
            int var4 = this.method1644();
            int var5 = this.field4475 + this.field4474;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if ((this.field4473 - var4) > this.field4476) {
                this.field4476 = this.field4473 - var4;
            }
            if (var5 + 256 > this.field4477) {
                this.field4477 += 1024;
                var4 = 0;
                if (this.field4477 > 16384) {
                    this.field4477 = 16384;
                }
                this.method1645();
                this.method1651(this.field4477);
                this.field4479 = true;
                if (var5 + 256 > this.field4477) {
                    var5 = this.field4477 - 256;
                    this.field4474 = var5 - this.field4475;
                }
            }
            while (var5 > var4) {
                var4 += 256;
                this.method1653(this.field4464, 256);
                this.method1650();
            }
            if (var2 > this.field4478) {
                if (this.field4479) {
                    this.field4479 = false;
                } else if (this.field4476 == 0 && this.field4482 == 0) {
                    this.method1645();
                    this.field4481 = var2 + 2000L;
                    return;
                } else {
                    this.field4474 = Math.min(this.field4482, this.field4476);
                    this.field4482 = this.field4476;
                }
                this.field4476 = 0;
                this.field4478 = var2 + 2000L;
            }
            this.field4473 = var4;
        } catch (Exception var7) {
            this.method1645();
            this.field4481 = var2 + 2000L;
        }
        if (!arg0) {
            this.field4475 = -39;
        }
        try {
            if ((this.field4456 + 500000L) < var2) {
                var2 = this.field4456;
            }
            while (var2 > this.field4456 + 5000L) {
                this.method1654(256, -59);
                this.field4456 += (long) (256000 / class190.field3494);
            }
        } catch (Exception var6) {
            this.field4456 = var2;
        }
    }
}
