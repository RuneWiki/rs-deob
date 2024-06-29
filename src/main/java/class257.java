import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class257 extends class224 {

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "I")
    private int field4159 = 0;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
    private int field4158 = 0;

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "I")
    private int field4161 = 1;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "Z")
    public static boolean field4155 = false;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "[I")
    public static int[] field4152 = new int[1000];

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "Ljava/lang/String;")
    public static String field4157 = "Opened title screen";

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
    public static int field4156 = 0;

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "Lef;")
    public static class214 field4149;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(Z)V")
    public static void method1764(boolean arg0) {
        field4157 = null;
        field4149 = null;
        if (arg0) {
            method1766(-3, (byte) 44, (String) null);
        }
        field4152 = null;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(II)V")
    public static final void method1765(int arg0, int arg1) {
        ++field4150;
        if (arg1 != 2048) {
            method1765(-102, 71);
        }
        if (!class80.field1167) {
            arg0 = -1;
        }
        if (class51.field709 != arg0) {
            if (arg0 != -1) {
                class1 var2 = class226.method1540(-48, arg0);
                class12 var3 = var2.method5(121);
                if (var3 != null) {
                    class2.field23.method137(class86.field1364, new Point(var2.field7, var2.field4), (byte) 97, var3.field3714, var3.field3707, var3.method89());
                    class51.field709 = arg0;
                } else {
                    arg0 = -1;
                }
            }
            if (~arg0 == 0 && class51.field709 != -1) {
                class2.field23.method137(class86.field1364, new Point(), (byte) 120, -1, -1, (int[]) null);
                class51.field709 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public static final void method1766(int arg0, byte arg1, String arg2) {
        ++field4153;
        class13.field165.method892(204, (byte) -12);
        if (arg1 == -128) {
            ++class28.field389;
            class13.field165.method183((byte) -111, arg0);
            class13.field165.method202((byte) -95, class162.method1116(arg2, (byte) 32));
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (arg2 <= -46) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (~arg1 == -4) {
                        this.field4161 = arg0.method201(255);
                    }
                } else {
                    this.field4159 = arg0.method201(255);
                }
            } else {
                this.field4158 = arg0.method201(255);
            }
            ++field4160;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        if (!arg1) {
            method1768(-73);
        }
        ++field4147;
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (super.field3625.field4425) {
            int var4 = class251.field4018[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; ~class78.field1108 < ~var6; ++var6) {
                int var7 = class243.field3893[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field4158 == 0) {
                    var9 = (-var4 + var7) * this.field4161;
                } else {
                    int var10 = var8 * var8 - -(var5 * var5) >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field4161 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (~this.field4159 == -1) {
                    var12 = class262.field4243[(var12 & 4083) >> 4] - -4096 >> 1;
                } else if (~this.field4159 == -3) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIII)V")
    public static final void method1767(int arg0, int arg1, int arg2, int arg3) {
        ++field4148;
        String var4 = "::tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (63 & arg0) + "," + (arg2 & 63);
        System.out.println(var4);
        if (arg3 != 29102) {
            method1764(true);
        }
        class96.method644(var4, arg3 ^ 29139);
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)V")
    public static final void method1768(int arg0) {
        ++field4151;
        client.field2315.method1430(arg0 + -1);
        if (arg0 != 0) {
            field4157 = null;
        }
        class206.field3217.method1430(-1);
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V")
    public final void method18(int arg0) {
        ++field4154;
        class189.method1329(21822);
        if (arg0 >= -4) {
            this.field4161 = 113;
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
    public class257() {
        super(0, true);
    }
}
