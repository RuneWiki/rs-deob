import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class40 extends class270 {

    @OriginalMember(owner = "client!gs", name = "J", descriptor = "Ljava/lang/String;")
    public static String field617 = "Loading...";

    @OriginalMember(owner = "client!gs", name = "L", descriptor = "[J")
    public static long[] field619 = new long[32];

    @OriginalMember(owner = "client!gs", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field624 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!gs", name = "G", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!gs", name = "I", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!gs", name = "K", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!gs", name = "N", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!gs", name = "P", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!gs", name = "R", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!gs", name = "S", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!gs", name = "T", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!gs", name = "M", descriptor = "Ldp;")
    public static class174 field620;

    @OriginalMember(owner = "client!gs", name = "H", descriptor = "[I")
    public static int[] field615;

    @OriginalMember(owner = "client!gs", name = "O", descriptor = "[Lmb;")
    public static class258[] field622;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "(B)V")
    public static void method336(byte arg0) {
        if (arg0 == -9) {
            field619 = null;
            field617 = null;
            field622 = null;
            field615 = null;
            field624 = null;
            field620 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "(I)V")
    public static final void method337(int arg0) {
        ++field626;
        if (arg0 != 45) {
            field615 = null;
        }
        if (class177.field2645.toLowerCase().indexOf("microsoft") == -1) {
            class50.field808[59] = 57;
            class50.field808[47] = 73;
            class50.field808[91] = 42;
            class50.field808[61] = 27;
            class50.field808[45] = 26;
            if (class177.field2655 == null) {
                class50.field808[192] = 58;
                class50.field808[222] = 59;
            } else {
                class50.field808[520] = 59;
                class50.field808[192] = 28;
                class50.field808[222] = 58;
            }
            class50.field808[44] = 71;
            class50.field808[46] = 72;
            class50.field808[92] = 74;
            class50.field808[93] = 43;
        } else {
            class50.field808[188] = 71;
            class50.field808[186] = 57;
            class50.field808[187] = 27;
            class50.field808[190] = 72;
            class50.field808[221] = 43;
            class50.field808[222] = 59;
            class50.field808[223] = 28;
            class50.field808[189] = 26;
            class50.field808[192] = 58;
            class50.field808[191] = 73;
            class50.field808[220] = 74;
            class50.field808[219] = 42;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BI)[I")
    public final int[] method81(byte arg0, int arg1) {
        ++field614;
        int[] var3 = super.field4053.method396(arg1, 115);
        if (arg0 <= 26) {
            field624 = null;
        }
        if (super.field4053.field815) {
            for (int var4 = 0; var4 < class161.field2445; ++var4) {
                this.method340((byte) -69, arg1, var4);
                int[] var5 = this.method1927(0, 0, class408.field5954);
                var3[var4] = var5[class198.field2894];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "([[[Lsk;B)V")
    public static final void method338(class168[][][] arg0, byte arg1) {
        for (int var2 = 0; ~arg0.length < ~var2; ++var2) {
            class168[][] var3 = arg0[var2];
            for (int var4 = 0; var3.length > var4; ++var4) {
                for (int var5 = 0; var5 < var3[var4].length; ++var5) {
                    class168 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field2501 instanceof class395) {
                            ((class395) var6.field2501).method1023(122);
                        }
                        if (var6.field2506 instanceof class395) {
                            ((class395) var6.field2506).method1023(118);
                        }
                        if (var6.field2507 instanceof class395) {
                            ((class395) var6.field2507).method1023(114);
                        }
                        if (var6.field2505 instanceof class395) {
                            ((class395) var6.field2505).method1023(72);
                        }
                        if (var6.field2510 instanceof class395) {
                            ((class395) var6.field2510).method1023(77);
                        }
                        for (class36 var7 = var6.field2488; var7 != null; var7 = var7.field505) {
                            class447 var8 = var7.field511;
                            if (var8 instanceof class395) {
                                ((class395) var8).method1023(102);
                            }
                        }
                    }
                }
            }
        }
        ++field618;
        if (arg1 >= -45) {
            field615 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method339(Component arg0, int arg1) {
        ++field625;
        arg0.addMouseListener(class23.field350);
        arg0.addMouseMotionListener(class23.field350);
        if (arg1 < 50) {
            field619 = null;
        }
        arg0.addFocusListener(class23.field350);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method123(boolean arg0, int arg1) {
        ++field616;
        int[][] var3 = super.field4046.method244(arg1, 126);
        if (!arg0) {
            field622 = null;
        }
        if (super.field4046.field488) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class161.field2445; ++var7) {
                this.method340((byte) -69, arg1, var7);
                int[][] var8 = this.method1930(class408.field5954, 0, (byte) -75);
                var4[var7] = var8[0][class198.field2894];
                var5[var7] = var8[1][class198.field2894];
                var6[var7] = var8[2][class198.field2894];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
    public class40() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BLec;I)V")
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (arg2 == 0) {
            super.field4055 = arg1.method271((byte) 112) == 1;
        }
        if (arg0 != 108) {
            field623 = 29;
        }
        ++field621;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BII)V")
    private final void method340(byte arg0, int arg1, int arg2) {
        ++field627;
        if (arg0 != -69) {
            method338((class168[][][]) null, (byte) 10);
        }
        int var4 = class136.field2168[arg2];
        int var5 = class364.field5185[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class198.field2894 = arg2;
            class408.field5954 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class198.field2894 = arg1;
            class408.field5954 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class198.field2894 = -arg1 + class161.field2445;
            class408.field5954 = arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class198.field2894 = arg2;
            class408.field5954 = -arg1 + class364.field5188;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class408.field5954 = class364.field5188 - arg1;
            class198.field2894 = -arg2 + class161.field2445;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class198.field2894 = class161.field2445 - arg1;
            class408.field5954 = -arg2 + class364.field5188;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class198.field2894 = arg1;
            class408.field5954 = class364.field5188 - arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class408.field5954 = arg1;
            class198.field2894 = -arg2 + class161.field2445;
        }
        class408.field5954 &= class30.field442;
        class198.field2894 &= class267.field3997;
    }
}
