import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class341 extends class214 {

    @OriginalMember(owner = "client!gs", name = "N", descriptor = "I")
    private int field4653;

    @OriginalMember(owner = "client!gs", name = "J", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!gs", name = "K", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!gs", name = "M", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!gs", name = "O", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!gs", name = "P", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!gs", name = "L", descriptor = "Lfc;")
    public static class343 field4651;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BI)[I")
    public final int[] method14(byte arg0, int arg1) {
        ++field4649;
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (super.field3024.field6135) {
            class415.method2422(var3, 0, class399.field5585, this.field4653);
        }
        if (arg0 != 123) {
            this.method15((class425) null, -68, 24);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)V")
    public static void method2019(byte arg0) {
        field4651 = null;
        if (arg0 != 72) {
            field4651 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Llk;II)V")
    public final void method15(class425 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field4653 = (arg0.method2503(true) << 12) / 255;
        }
        ++field4655;
        if (arg1 >= -114) {
            this.method14((byte) 92, -40);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIBI)Z")
    public static final boolean method2020(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field4650;
        if ((class205.field2947[0][arg1][arg4] & 2) != 0) {
            return true;
        } else if (~(16 & class205.field2947[arg2][arg1][arg4]) != -1) {
            return false;
        } else {
            if (arg3 < 65) {
                method2022(-40, (String) null, false);
            }
            return ~arg0 == ~class202.method1285(arg4, arg2, -117, arg1);
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
    public class341() {
        this(4096);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIIII)I")
    public static final int method2021(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4652;
        if (~(arg3 & 1) == -2) {
            int var7 = arg5;
            arg5 = arg4;
            arg4 = var7;
        }
        int var8 = arg6 & 3;
        if (var8 == 0) {
            return arg0;
        } else if (~var8 == -2) {
            return arg2;
        } else if (~var8 == -3) {
            return 1 - (arg5 - 7) - arg0;
        } else {
            if (arg1 != -21741) {
                field4651 = null;
            }
            return -arg2 + 1 + 7 + -arg4;
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(I)V")
    public class341(int arg0) {
        super(0, true);
        this.field4653 = 4096;
        this.field4653 = arg0;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method2022(int arg0, String arg1, boolean arg2) {
        ++field4654;
        if (arg1 != null) {
            if (class161.field2315 >= 100) {
                class465.method2743(class261.field3630.method695(-113, class487.field6867), -17);
            } else {
                String var3 = class33.method257(125, arg1);
                if (var3 != null) {
                    int var4 = 0;
                    if (arg0 <= 72) {
                        method2019((byte) -58);
                    }
                    while (class161.field2315 > var4) {
                        String var8 = class33.method257(102, class181.field2624[var4]);
                        if (var8 != null && var8.equals(var3)) {
                            class465.method2743(arg1 + class108.field1538.method695(-123, class487.field6867), -4);
                            return;
                        }
                        if (class20.field353[var4] != null) {
                            String var9 = class33.method257(97, class20.field353[var4]);
                            if (var9 != null && var9.equals(var3)) {
                                class465.method2743(arg1 + class108.field1538.method695(-117, class487.field6867), -32);
                                return;
                            }
                        }
                        ++var4;
                    }
                    for (int var5 = 0; class205.field2934 > var5; ++var5) {
                        String var6 = class33.method257(4, class321.field4403[var5]);
                        if (var6 != null && var6.equals(var3)) {
                            class465.method2743(class329.field4536.method695(-118, class487.field6867) + arg1 + class102.field1456.method695(-113, class487.field6867), -5);
                            return;
                        }
                        if (class160.field2301[var5] != null) {
                            String var7 = class33.method257(100, class160.field2301[var5]);
                            if (var7 != null && var7.equals(var3)) {
                                class465.method2743(class329.field4536.method695(-115, class487.field6867) + arg1 + class102.field1456.method695(-122, class487.field6867), -43);
                                return;
                            }
                        }
                    }
                    if (class33.method257(104, class2.field21.field407).equals(var3)) {
                        class465.method2743(class382.field5415.method695(-127, class487.field6867), -10);
                    } else {
                        ++class130.field1831;
                        class131.method793(class277.field3830, -94);
                        class366.field5214.method2470((byte) -74, 1 + class42.method349(arg1, 1));
                        class366.field5214.method2493((byte) 65, arg1);
                        class366.field5214.method2470((byte) -74, !arg2 ? 0 : 1);
                    }
                }
            }
        }
    }

    static {
        new class112("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
    }
}
