import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class52 extends class11 {

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "I")
    private int field632 = -1;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "I")
    public static int field625 = 205;

    @OriginalMember(owner = "client!oi", name = "V", descriptor = "[I")
    public static int[] field637 = new int[3];

    @OriginalMember(owner = "client!oi", name = "S", descriptor = "[I")
    public static int[] field634 = new int[500];

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "I")
    public int field633;

    @OriginalMember(owner = "client!oi", name = "U", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!oi", name = "W", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!oi", name = "X", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!oi", name = "Y", descriptor = "I")
    public int field640;

    @OriginalMember(owner = "client!oi", name = "T", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field635;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "[I")
    public int[] field631;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)Z", line = 7)
    public static final boolean method450(int arg0) {
        if (arg0 != -13911) {
            return true;
        } else {
            ++field630;
            return class88.field1282 != 0 ? true : class121.field1817.method526(-59);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lsi;II)V", line = 25)
    public final void method43(class391 arg0, int arg1, int arg2) {
        ++field623;
        if (arg2 == 0) {
            this.field632 = arg0.method2353((byte) 88);
        }
        if (arg1 > -40) {
            method452(17, (byte) 64);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ldw;I)I", line = 39)
    public static final int method451(class502 arg0, int arg1) {
        ++field626;
        class79 var2 = arg0.field7387;
        if (var2.field1143 != null) {
            var2 = var2.method646(0, class421.field6166);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg1 <= 105) {
            method453(false);
        }
        int var3 = var2.field1155;
        class93 var4 = arg0.method616((byte) -83);
        if (arg0.field1099) {
            var3 = var2.field1156;
        } else if (arg0.field1083 != var4.field1338 && arg0.field1083 != var4.field1372 && arg0.field1083 != var4.field1341 && arg0.field1083 != var4.field1333) {
            if (arg0.field1083 == var4.field1355 || ~arg0.field1083 == ~var4.field1353 || arg0.field1083 == var4.field1350 || ~arg0.field1083 == ~var4.field1374) {
                var3 = var2.field1187;
            }
        } else {
            var3 = var2.field1144;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)C", line = 78)
    public static final char method452(int arg0, byte arg1) {
        ++field624;
        int var2 = arg1 & 255;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (arg0 != 30668) {
                method451((class502) null, 74);
            }
            if (~var2 <= -129 && var2 < 160) {
                char var3 = class112.field1678[var2 - 128];
                if (~var3 == -1) {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 109)
    public final void method51(byte arg0) {
        ++field638;
        super.method51(arg0);
        this.field631 = null;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)I", line = 121)
    public final int method47(int arg0) {
        if (arg0 != -25029) {
            this.method47(-1);
        }
        ++field636;
        return this.field632;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V", line = 132)
    public class52() {
        super(0, false);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[[I", line = 135)
    public int[][] method41(int arg0, int arg1) {
        int var3 = 115 / ((arg0 - -75) / 49);
        ++field639;
        int[][] var4 = super.field156.method1719(arg1, 3);
        if (super.field156.field4001 && this.method454((byte) -88)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = (class508.field7537 == this.field640 ? arg1 : this.field640 * arg1 / class508.field7537) * this.field633;
            if (~class90.field1316 != ~this.field633) {
                for (int var9 = 0; ~class90.field1316 < ~var9; ++var9) {
                    int var10 = this.field633 * var9 / class90.field1316;
                    int var11 = this.field631[var8 + var10];
                    var7[var9] = class251.method1501(var11, 255) << 4;
                    var6[var9] = class251.method1501(4080, var11 >> 4);
                    var5[var9] = class251.method1501(16711680, var11) >> 12;
                }
            } else {
                for (int var12 = 0; ~class90.field1316 < ~var12; ++var12) {
                    int var13 = this.field631[var8++];
                    var7[var12] = class251.method1501(255, var13) << 4;
                    var6[var12] = class251.method1501(65280, var13) >> 4;
                    var5[var12] = class251.method1501(var13, 16711680) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(Z)V", line = 208)
    public static void method453(boolean arg0) {
        if (!arg0) {
            field635 = null;
            field634 = null;
            field637 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)Z", line = 221)
    public final boolean method454(byte arg0) {
        if (arg0 > -57) {
            field635 = null;
        }
        ++field627;
        if (this.field631 != null) {
            return true;
        } else if (this.field632 >= 0) {
            class4 var2 = class80.field1222 < 0 ? class4.method19(class269.field3720, this.field632) : class4.method22(class269.field3720, class80.field1222, this.field632);
            var2.method16();
            this.field631 = var2.method17();
            this.field633 = var2.field41;
            this.field640 = var2.field36;
            return true;
        } else {
            return false;
        }
    }
}
