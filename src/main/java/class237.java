import java.awt.Component;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class237 extends class160 {

    @OriginalMember(owner = "client!al", name = "S", descriptor = "I")
    private int field3833 = 10;

    @OriginalMember(owner = "client!al", name = "T", descriptor = "I")
    private int field3834 = 0;

    @OriginalMember(owner = "client!al", name = "V", descriptor = "I")
    private int field3836 = 2048;

    @OriginalMember(owner = "client!al", name = "ab", descriptor = "[I")
    public static int[] field3841 = new int[14];

    @OriginalMember(owner = "client!al", name = "db", descriptor = "I")
    public static int field3844 = -1;

    @OriginalMember(owner = "client!al", name = "U", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!al", name = "W", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!al", name = "X", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!al", name = "Z", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!al", name = "bb", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!al", name = "cb", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!al", name = "eb", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!al", name = "gb", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!al", name = "hb", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!al", name = "ib", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!al", name = "Y", descriptor = "[I")
    private int[] field3839;

    @OriginalMember(owner = "client!al", name = "fb", descriptor = "[I")
    private int[] field3846;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "(B)V")
    public final void method210(byte arg0) {
        this.method1627(0);
        ++field3835;
        if (arg0 > -124) {
            field3844 = 57;
        }
    }

    @OriginalMember(owner = "client!al", name = "i", descriptor = "(B)V")
    public static final void method1626(byte arg0) {
        ++field3837;
        if (~class189.field2922 != 0) {
            class143.method966(-1, 118, class189.field2922, -1);
            class189.field2922 = -1;
        }
        if (arg0 != 93) {
            field3841 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(I)V")
    private final void method1627(int arg0) {
        this.field3839 = new int[this.field3833 + 1];
        this.field3846 = new int[this.field3833 - -1];
        ++field3842;
        int var2 = 4096 / this.field3833;
        int var3 = arg0;
        int var4 = this.field3836 * var2 >> 12;
        for (int var5 = 0; this.field3833 > var5; ++var5) {
            this.field3846[var5] = var3;
            this.field3839[var5] = var3 - -var4;
            var3 += var2;
        }
        this.field3846[this.field3833] = 4096;
        this.field3839[this.field3833] = this.field3839[0] + 4096;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(JZ)Ljava/lang/String;")
    public static final String method1628(long arg0, boolean arg1) {
        class170.field2652.setTime(new Date(arg0));
        ++field3848;
        int var3 = class170.field2652.get(7);
        int var4 = class170.field2652.get(5);
        if (!arg1) {
            field3844 = 16;
        }
        int var5 = class170.field2652.get(2);
        int var6 = class170.field2652.get(1);
        int var7 = class170.field2652.get(11);
        int var8 = class170.field2652.get(12);
        int var9 = class170.field2652.get(13);
        return class150.field2368[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class159.field2468[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field3834 = arg0.method633(104);
                }
            } else {
                this.field3836 = arg0.method645(11596);
            }
        } else {
            this.field3833 = arg0.method633(62);
        }
        ++field3843;
        if (arg1 < 11) {
            this.field3846 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
    public class237() {
        super(0, true);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        ++field3840;
        int[] var3 = super.field2488.method15((byte) 127, arg0);
        if (arg1 != 57) {
            return null;
        } else {
            if (super.field2488.field42) {
                int var4 = class103.field1713[arg0];
                if (this.field3834 != 0) {
                    for (int var5 = 0; ~class240.field3896 < ~var5; ++var5) {
                        int var6 = 0;
                        int var7 = class190.field2946[var5];
                        int var8 = this.field3834;
                        if (~var8 != -2) {
                            if (var8 != 2) {
                                if (~var8 == -4) {
                                    var6 = (-var4 + var7 >> 1) + 2048;
                                }
                            } else {
                                var6 = (var7 - -var4 - 4096 >> 1) + 2048;
                            }
                        } else {
                            var6 = var7;
                        }
                        short var9 = 0;
                        for (int var10 = 0; var10 < this.field3833; ++var10) {
                            if (~var6 <= ~this.field3846[var10] && ~this.field3846[var10 + 1] < ~var6) {
                                if (var6 < this.field3839[var10]) {
                                    var9 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var9;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; ~var12 > ~this.field3833; ++var12) {
                        if (this.field3846[var12] <= var4 && ~this.field3846[var12 + 1] < ~var4) {
                            if (~var4 > ~this.field3839[var12]) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class175.method1191(var3, 0, class240.field3896, var11);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!al", name = "f", descriptor = "(I)V")
    public static void method1629(int arg0) {
        if (arg0 != -11420) {
            method1628(-42L, true);
        }
        field3841 = null;
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(III)J")
    public static final long method1630(int arg0, int arg1, int arg2) {
        class6 var3 = class269.field4298[arg0][arg1][arg2];
        return var3 != null && var3.field147 != null ? var3.field147.field159 : 0L;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lre;IBI)V")
    public static final void method1631(class228 arg0, int arg1, byte arg2, int arg3) {
        int var4 = -59 / ((-47 - arg2) / 41);
        ++field3845;
        if (class205.field3205 == null && !class47.field687) {
            if (arg0 != null && class127.method885(arg0, (byte) -78) != null) {
                class205.field3205 = arg0;
                class78.field1293 = class127.method885(arg0, (byte) -22);
                class37.field530 = false;
                class187.field2898 = 0;
                class280.field4427 = arg3;
                class180.field2805 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1632(Component arg0, int arg1) {
        ++field3847;
        if (arg1 > -68) {
            method1631((class228) null, -20, (byte) 116, 91);
        }
        arg0.addMouseListener(class62.field1062);
        arg0.addMouseMotionListener(class62.field1062);
        arg0.addFocusListener(class62.field1062);
    }
}
