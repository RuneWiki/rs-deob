import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class471 {

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "Lot;")
    private class255 field6597 = new class255();

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "Lot;")
    private class255 field6600 = new class255();

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "Lot;")
    private class255 field6601 = new class255();

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "Lot;")
    private class255 field6602 = new class255();

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "Llk;")
    private class425 field6603 = new class425(4);

    @OriginalMember(owner = "client!bo", name = "D", descriptor = "B")
    private byte field6609 = 0;

    @OriginalMember(owner = "client!bo", name = "B", descriptor = "I")
    public volatile int field6607 = 0;

    @OriginalMember(owner = "client!bo", name = "E", descriptor = "I")
    public volatile int field6610 = 0;

    @OriginalMember(owner = "client!bo", name = "C", descriptor = "Llk;")
    private class425 field6608 = new class425(8);

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
    public static int field6595 = 0;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "I")
    private int field6605;

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "J")
    private long field6606;

    @OriginalMember(owner = "client!bo", name = "F", descriptor = "Leb;")
    private class183 field6611;

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "Ljg;")
    private class456 field6604;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)Z", line = 6)
    public final boolean method2757(int arg0) {
        if (arg0 == 20) {
            field6599++;
            return this.method2771(4) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)Z", line = 22)
    public static final boolean method2758(int arg0) {
        field6592++;
        if (arg0 != 0) {
            method2761(92);
        }
        return class161.field2310 > 0;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZLjg;B)V", line = 36)
    public final void method2759(boolean arg0, class456 arg1, byte arg2) {
        if (this.field6604 != null) {
            try {
                this.field6604.method2632(32214);
            } catch (Exception var8) {
            }
            this.field6604 = null;
        }
        field6590++;
        this.field6604 = arg1;
        if (arg2 <= 86) {
            this.method2767(false);
        }
        this.method2770(3);
        this.method2763(arg0, (byte) -126);
        this.field6608.field5830 = 0;
        this.field6611 = null;
        while (true) {
            class183 var4 = (class183) this.field6600.method1589(0);
            if (var4 == null) {
                while (true) {
                    class183 var5 = (class183) this.field6602.method1589(0);
                    if (var5 == null) {
                        if (this.field6609 != 0) {
                            try {
                                this.field6603.field5830 = 0;
                                this.field6603.method2470((byte) -74, 4);
                                this.field6603.method2470((byte) -74, this.field6609);
                                this.field6603.method2462(0, (byte) -123);
                                this.field6604.method2635(0, 4, this.field6603.field5886, -15109);
                            } catch (IOException var7) {
                                try {
                                    this.field6604.method2632(32214);
                                } catch (Exception var6) {
                                }
                                this.field6610 = -2;
                                this.field6607++;
                                this.field6604 = null;
                            }
                        }
                        this.field6605 = 0;
                        this.field6606 = class193.method1237(-9581);
                        return;
                    }
                    this.field6601.method1584(77, var5);
                }
            }
            this.field6597.method1584(104, var4);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)I", line = 104)
    private final int method2760(byte arg0) {
        field6594++;
        if (arg0 != -16) {
            this.method2764(120, 48, false, 48, (byte) 13);
        }
        return this.field6601.method1582((byte) -128) + this.field6602.method1582((byte) -128);
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V", line = 116)
    public static final void method2761(int arg0) {
        field6585++;
        class3.field33.method2623((byte) -79);
        class238.field3356.method1586((byte) -25);
        if (arg0 == -1) {
            class393.field5521.method1586((byte) -25);
        }
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)V", line = 129)
    public final void method2762(int arg0) {
        try {
            this.field6604.method2632(32214);
        } catch (Exception var2) {
        }
        field6583++;
        if (arg0 != 0) {
            method2758(-121);
        }
        this.field6610 = -1;
        this.field6607++;
        this.field6609 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field6604 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZB)V", line = 147)
    public final void method2763(boolean arg0, byte arg1) {
        field6588++;
        if (this.field6604 == null) {
            return;
        }
        if (arg1 >= -16) {
            this.method2763(false, (byte) 73);
        }
        try {
            this.field6603.field5830 = 0;
            this.field6603.method2470((byte) -74, arg0 ? 2 : 3);
            this.field6603.method2479(0, 255);
            this.field6604.method2635(0, 4, this.field6603.field5886, -15109);
        } catch (IOException var4) {
            try {
                this.field6604.method2632(32214);
            } catch (Exception var3) {
            }
            this.field6607++;
            this.field6610 = -2;
            this.field6604 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIZIB)Leb;", line = 179)
    public final class183 method2764(int arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        field6586++;
        long var6 = (long) ((arg0 << 16) + arg3);
        class183 var8 = new class183();
        var8.field1649 = var6;
        int var9 = -76 / ((-arg1 - 2) / 38);
        var8.field3370 = arg2;
        var8.field2655 = arg4;
        if (arg2) {
            if (this.method2771(4) >= 20) {
                throw new RuntimeException();
            }
            this.field6597.method1584(80, var8);
        } else if (this.method2760((byte) -16) < 20) {
            this.field6601.method1584(117, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)V", line = 220)
    public final void method2765(int arg0) {
        field6596++;
        if (this.field6604 == null) {
            return;
        }
        try {
            this.field6603.field5830 = 0;
            this.field6603.method2470((byte) -74, 7);
            this.field6603.method2479(0, 255);
            this.field6604.method2635(0, arg0, this.field6603.field5886, -15109);
        } catch (IOException var3) {
            try {
                this.field6604.method2632(32214);
            } catch (Exception var2) {
            }
            this.field6604 = null;
            this.field6610 = -2;
            this.field6607++;
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)V", line = 245)
    public final void method2766(byte arg0) {
        if (this.field6604 != null) {
            this.field6604.method2633((byte) 79);
        }
        field6589++;
        if (arg0 != 103) {
            this.method2766((byte) -40);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V", line = 262)
    public final void method2767(boolean arg0) {
        field6581++;
        if (arg0) {
            this.field6609 = 8;
        }
        if (this.field6604 != null) {
            this.field6604.method2632(32214);
        }
    }

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "(I)Z", line = 275)
    public final boolean method2768(int arg0) {
        if (this.field6604 != null) {
            long var2 = class193.method1237(-9581);
            int var4 = (int) (var2 - this.field6606);
            this.field6606 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field6605 += var4;
            if (this.field6605 > 30000) {
                try {
                    this.field6604.method2632(32214);
                } catch (Exception var27) {
                }
                this.field6604 = null;
            }
        }
        field6591++;
        if (this.field6604 == null) {
            return this.method2771(4) == 0 && this.method2760((byte) -16) == 0;
        }
        try {
            this.field6604.method2637(-118);
            for (class183 var5 = (class183) this.field6597.method1587(arg0 ^ arg0); var5 != null; var5 = (class183) this.field6597.method1583((byte) -69)) {
                this.field6603.field5830 = 0;
                this.field6603.method2470((byte) -74, 1);
                this.field6603.method2479((int) var5.field1649, arg0 - 10579);
                this.field6604.method2635(0, 4, this.field6603.field5886, -15109);
                this.field6600.method1584(109, var5);
            }
            for (class183 var6 = (class183) this.field6601.method1587(0); var6 != null; var6 = (class183) this.field6601.method1583((byte) -69)) {
                this.field6603.field5830 = 0;
                this.field6603.method2470((byte) -74, 0);
                this.field6603.method2479((int) var6.field1649, 255);
                this.field6604.method2635(0, 4, this.field6603.field5886, -15109);
                this.field6602.method1584(96, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field6604.method2634(arg0 - 10929);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field6605 = 0;
                byte var9 = 0;
                if (this.field6611 == null) {
                    var9 = 8;
                } else if (this.field6611.field2664 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field6608.field5830;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field6604.method2638(this.field6608.field5886, var10, this.field6608.field5830, 421464188);
                    if (this.field6609 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field6608.field5886[this.field6608.field5830 + var11] = (byte) class382.method2292(this.field6608.field5886[this.field6608.field5830 + var11], this.field6609);
                        }
                    }
                    this.field6608.field5830 += var10;
                    if (var9 <= this.field6608.field5830) {
                        if (this.field6611 == null) {
                            this.field6608.field5830 = 0;
                            int var12 = this.field6608.method2503(true);
                            int var13 = this.field6608.method2508(true);
                            int var14 = this.field6608.method2503(true);
                            int var15 = this.field6608.method2502((byte) -86);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class183 var21;
                            if (var17) {
                                for (var21 = (class183) this.field6602.method1587(0); var21 != null && var21.field1649 != var18; var21 = (class183) this.field6602.method1583((byte) -69)) {
                                }
                            } else {
                                for (var21 = (class183) this.field6600.method1587(0); var21 != null && var21.field1649 != var18; var21 = (class183) this.field6600.method1583((byte) -69)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field6611 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field6611.field2663 = new class425(var15 + var22 + this.field6611.field2655);
                            this.field6611.field2663.method2470((byte) -74, var16);
                            this.field6611.field2663.method2481(var15, true);
                            this.field6608.field5830 = 0;
                            this.field6611.field2664 = 8;
                        } else if (this.field6611.field2664 != 0) {
                            throw new IOException();
                        } else if (this.field6608.field5886[0] == -1) {
                            this.field6611.field2664 = 1;
                            this.field6608.field5830 = 0;
                        } else {
                            this.field6611 = null;
                        }
                    }
                } else {
                    int var23 = this.field6611.field2663.field5886.length - this.field6611.field2655;
                    int var24 = 512 - this.field6611.field2664;
                    if ((var23 - this.field6611.field2663.field5830) < var24) {
                        var24 = var23 - this.field6611.field2663.field5830;
                    }
                    if (var24 > var8) {
                        var24 = var8;
                    }
                    this.field6604.method2638(this.field6611.field2663.field5886, var24, this.field6611.field2663.field5830, 421464188);
                    if (this.field6609 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field6611.field2663.field5886[this.field6611.field2663.field5830 + var25] = (byte) class382.method2292(this.field6611.field2663.field5886[this.field6611.field2663.field5830 + var25], this.field6609);
                        }
                    }
                    this.field6611.field2664 += var24;
                    this.field6611.field2663.field5830 += var24;
                    if (this.field6611.field2663.field5830 == var23) {
                        this.field6611.method738(-13002);
                        this.field6611.field3373 = false;
                        this.field6611 = null;
                    } else if (this.field6611.field2664 == 512) {
                        this.field6611.field2664 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field6604.method2632(32214);
            } catch (Exception var26) {
            }
            this.field6607++;
            this.field6604 = null;
            this.field6610 = -2;
            return this.method2771(4) == 0 && this.method2760((byte) -16) == 0;
        }
    }

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "(I)Z", line = 562)
    public final boolean method2769(int arg0) {
        if (arg0 != -11158) {
            this.method2769(111);
        }
        field6598++;
        return this.method2760((byte) -16) >= 20;
    }

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "(I)V", line = 573)
    private final void method2770(int arg0) {
        field6593++;
        if (this.field6604 == null) {
            return;
        }
        try {
            this.field6603.field5830 = 0;
            this.field6603.method2470((byte) -74, 6);
            this.field6603.method2479(arg0, 255);
            this.field6604.method2635(0, 4, this.field6603.field5886, arg0 - 15112);
        } catch (IOException var3) {
            try {
                this.field6604.method2632(32214);
            } catch (Exception var2) {
            }
            this.field6610 = -2;
            this.field6607++;
            this.field6604 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "(I)I", line = 597)
    public final int method2771(int arg0) {
        if (arg0 != 4) {
            this.method2762(-127);
        }
        field6582++;
        return this.field6597.method1582((byte) -128) + this.field6600.method1582((byte) -128);
    }
}
