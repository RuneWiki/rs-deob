import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class475 extends class298 {

    @OriginalMember(owner = "client!ot", name = "Q", descriptor = "I")
    private int field6668 = -1;

    @OriginalMember(owner = "client!ot", name = "U", descriptor = "Llc;")
    public static class135 field6672;

    @OriginalMember(owner = "client!ot", name = "W", descriptor = "Z")
    public static boolean field6674;

    @OriginalMember(owner = "client!ot", name = "X", descriptor = "Lci;")
    public static class421 field6675;

    @OriginalMember(owner = "client!ot", name = "K", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!ot", name = "L", descriptor = "I")
    public static int field6663;

    @OriginalMember(owner = "client!ot", name = "M", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!ot", name = "N", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!ot", name = "O", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!ot", name = "P", descriptor = "I")
    private int field6667;

    @OriginalMember(owner = "client!ot", name = "R", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!ot", name = "T", descriptor = "I")
    private int field6671;

    @OriginalMember(owner = "client!ot", name = "V", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!ot", name = "Y", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!ot", name = "S", descriptor = "[I")
    private int[] field6670;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(III)V")
    public final void method1881(int arg0, int arg1, int arg2) {
        int var4 = -63 % ((arg0 - -22) / 40);
        ++field6669;
        super.method1881(122, arg1, arg2);
        if (~this.field6668 <= -1 && class427.field6156 != null) {
            int var5 = class427.field6156.method577(this.field6668, -121).field2592 ? 64 : 128;
            this.field6670 = class427.field6156.method578(false, this.field6668, var5, 1.0F, -85, var5);
            this.field6667 = var5;
            this.field6671 = var5;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IILvt;)V")
    public final void method10(int arg0, int arg1, class179 arg2) {
        if (arg1 == 0) {
            this.field6668 = arg2.method916(21933);
        }
        if (arg0 > -44) {
            this.field6667 = 76;
        }
        ++field6662;
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(I)V")
    public static void method2808(int arg0) {
        field6675 = null;
        if (arg0 >= 7) {
            field6672 = null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V")
    public class475() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(Z)V")
    public final void method548(boolean arg0) {
        ++field6664;
        super.method548(arg0);
        this.field6670 = null;
        if (!arg0) {
            method2809(-50, (class179) null);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILvt;)V")
    public static final void method2809(int arg0, class179 arg1) {
        ++field6663;
        if (~(arg1.field2159.length + -arg1.field2206) <= -2) {
            int var2 = arg1.method895((byte) -74);
            if (var2 >= arg0 && ~var2 >= -2) {
                if (arg1.field2159.length + -arg1.field2206 >= 2) {
                    int var3 = arg1.method916(21933);
                    if (var3 * 6 == arg1.field2159.length + -arg1.field2206) {
                        while (true) {
                            int var4;
                            int var5;
                            do {
                                do {
                                    do {
                                        if (arg1.field2159.length <= arg1.field2206) {
                                            return;
                                        }
                                        var4 = arg1.method916(21933);
                                        var5 = arg1.method939((byte) 50);
                                    } while (var4 >= class288.field4312.length);
                                } while (!class190.field2599[var4]);
                            } while (~class173.field2088.method312(var4, false).field2974 == -50 && (~var5 > 0 || var5 > 1));
                            class288.field4312[var4] = var5;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(B)I")
    public final int method1877(byte arg0) {
        if (arg0 >= -96) {
            return -42;
        } else {
            ++field6666;
            return this.field6668;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)[[I")
    public final int[][] method157(int arg0, int arg1) {
        ++field6673;
        int[][] var3 = super.field4454.method1638((byte) -110, arg1);
        if (arg0 != -24032) {
            return null;
        } else {
            if (super.field4454.field3886) {
                int var4 = (class388.field5561 != this.field6671 ? this.field6671 * arg1 / class388.field5561 : arg1) * this.field6667;
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (~class158.field1877 == ~this.field6667) {
                    for (int var8 = 0; var8 < class158.field1877; ++var8) {
                        int var9 = this.field6670[var4++];
                        var7[var8] = class444.method2618(4080, var9 << 4);
                        var6[var8] = class444.method2618(var9 >> 4, 4080);
                        var5[var8] = class444.method2618(var9, 16711680) >> 12;
                    }
                } else {
                    for (int var10 = 0; ~class158.field1877 < ~var10; ++var10) {
                        int var11 = this.field6667 * var10 / class158.field1877;
                        int var12 = this.field6670[var4 + var11];
                        var7[var10] = class444.method2618(4080, var12 << 4);
                        var6[var10] = class444.method2618(var12 >> 4, 4080);
                        var5[var10] = class444.method2618(4080, var12 >> 12);
                    }
                }
            }
            return var3;
        }
    }

    static {
        new class40("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field6672 = new class135("", 12);
        field6674 = false;
        field6675 = new class421("runescape", 0);
    }
}
