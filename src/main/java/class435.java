import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class435 extends class82 {

    @OriginalMember(owner = "client!uca", name = "O", descriptor = "Lcea;")
    public static class180 field5905 = new class180("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!uca", name = "L", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!uca", name = "M", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!uca", name = "N", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!uca", name = "P", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!uca", name = "Q", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!uca", name = "R", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!uca", name = "S", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(II)[[I")
    public final int[][] method481(int arg0, int arg1) {
        ++field5902;
        int[][] var3 = super.field992.method3178(arg1, arg0 ^ arg0);
        if (super.field992.field7962) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class629.field9033 > var7; ++var7) {
                this.method2516(arg1, var7, (byte) 15);
                int[][] var8 = this.method488(0, class613.field8888, 1);
                var4[var7] = var8[0][class357.field4688];
                var5[var7] = var8[1][class357.field4688];
                var6[var7] = var8[2][class357.field4688];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(BI)V")
    public static final void method2512(byte arg0, int arg1) {
        class133.field1634 = arg1;
        if (arg0 >= -102) {
            field5905 = null;
        }
        ++field5906;
        class307.field3899.method3687(1402);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Let;B)V")
    public static final void method2513(class509 arg0, byte arg1) {
        ++field5908;
        if (arg1 != 28) {
            field5905 = null;
        }
        if (class463.field6463 == arg0.field7154) {
            if (class103.field1265.field8023 == null) {
                arg0.field7202 = 0;
                arg0.field7097 = 0;
            } else {
                arg0.field7189 = 150;
                arg0.field7042 = (int) (256.0D * Math.sin((double) class335.field4358 / 40.0D)) & 2047;
                arg0.field7097 = class82.field1003;
                arg0.field7102 = 5;
                arg0.field7202 = class562.method3285((byte) -122, class103.field1265.field8023);
                arg0.field7047 = class103.field1265.field6403;
                arg0.field7141 = class103.field1265.field6474;
                arg0.field7063 = class103.field1265.field6429;
                arg0.field7084 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "()V")
    public class435() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method2514(String arg0, boolean arg1) {
        class589.method3415(arg0, 0, "", 0, !arg1, "");
        ++field5909;
        if (!arg1) {
            method2514((String) null, false);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)V")
    public static void method2515(byte arg0) {
        if (arg0 == -18) {
            field5905 = null;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIB)V")
    private final void method2516(int arg0, int arg1, byte arg2) {
        ++field5903;
        if (arg2 == 15) {
            int var4 = class366.field4817[arg1];
            int var5 = class85.field1036[arg0];
            float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class357.field4688 = arg1;
                class613.field8888 = arg0;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class357.field4688 = arg0;
                class613.field8888 = arg1;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class613.field8888 = arg1;
                class357.field4688 = -arg0 + class629.field9033;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class357.field4688 = arg1;
                class613.field8888 = class347.field4469 - arg0;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class357.field4688 = -arg1 + class629.field9033;
                class613.field8888 = -arg0 + class347.field4469;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class357.field4688 = -arg0 + class629.field9033;
                class613.field8888 = -arg1 + class347.field4469;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class613.field8888 = class347.field4469 - arg1;
                class357.field4688 = arg0;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class613.field8888 = arg0;
                class357.field4688 = -arg1 + class629.field9033;
            }
            class613.field8888 &= class466.field6523;
            class357.field4688 &= class129.field1590;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IILos;)V")
    public final void method198(int arg0, int arg1, class374 arg2) {
        if (~arg0 == -1) {
            super.field999 = arg2.method2129(-71) == 1;
        }
        int var4 = 46 % ((-69 - arg1) / 42);
        ++field5904;
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(II)[I")
    public final int[] method201(int arg0, int arg1) {
        ++field5907;
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (arg1 != 12218) {
            this.method201(-81, 75);
        }
        if (super.field990.field3641) {
            for (int var4 = 0; ~class629.field9033 < ~var4; ++var4) {
                this.method2516(arg0, var4, (byte) 15);
                int[] var5 = this.method489(false, 0, class613.field8888);
                var3[var4] = var5[class357.field4688];
            }
        }
        return var3;
    }
}
