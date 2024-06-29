import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class235 {

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "I")
    public int field3447 = -1;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "I")
    public static int field3450 = -1;

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "Lsq;")
    public static class442 field3448 = new class442();

    @OriginalMember(owner = "client!lba", name = "v", descriptor = "I")
    public static int field3468 = 1339;

    @OriginalMember(owner = "client!lba", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field3471 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!lba", name = "p", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!lba", name = "t", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!lba", name = "u", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "Lcb;")
    private class78 field3453;

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "Ljava/lang/String;")
    private String field3457;

    @OriginalMember(owner = "client!lba", name = "n", descriptor = "Ljava/lang/String;")
    private String field3460;

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "[I")
    private int[] field3452;

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "[I")
    private int[] field3455;

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "[I")
    private int[] field3456;

    @OriginalMember(owner = "client!lba", name = "l", descriptor = "[I")
    private int[] field3458;

    @OriginalMember(owner = "client!lba", name = "o", descriptor = "[I")
    private int[] field3461;

    @OriginalMember(owner = "client!lba", name = "q", descriptor = "[I")
    private int[] field3463;

    @OriginalMember(owner = "client!lba", name = "s", descriptor = "[I")
    private int[] field3465;

    @OriginalMember(owner = "client!lba", name = "w", descriptor = "[I")
    private int[] field3469;

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "[Ljava/lang/String;")
    private String[] field3451;

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "[Ljava/lang/String;")
    private String[] field3454;

    @OriginalMember(owner = "client!lba", name = "m", descriptor = "[[I")
    private int[][] field3459;

    @OriginalMember(owner = "client!lba", name = "r", descriptor = "[[I")
    private int[][] field3464;

    @OriginalMember(owner = "client!lba", name = "x", descriptor = "[[I")
    private int[][] field3470;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIBI)V")
    public static final void method1525(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3462++;
        if (arg3 >= -120) {
            method1529(16);
        }
        for (int var5 = 0; var5 < class562.field8052; var5++) {
            Rectangle var6 = class514.field7113[var5];
            if ((var6.x + var6.width) > arg0 && arg0 + arg4 > var6.x && var6.y + var6.height > arg1 && var6.y < arg1 + arg2) {
                class301.field4347[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZLco;I)V")
    private final void method1526(boolean arg0, class268 arg1, int arg2) {
        field3449++;
        if (arg2 == 1) {
            this.field3460 = arg1.method1729((byte) 24);
        } else if (arg2 == 2) {
            this.field3457 = arg1.method1729((byte) 24);
        } else if (arg2 == 3) {
            int var22 = arg1.method1738(255);
            this.field3470 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field3470[var23][0] = arg1.method1745(32132);
                this.field3470[var23][1] = arg1.method1748(112);
                this.field3470[var23][2] = arg1.method1748(-42);
            }
        } else if (arg2 == 4) {
            int var20 = arg1.method1738(255);
            this.field3464 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field3464[var21][0] = arg1.method1745(32132);
                this.field3464[var21][1] = arg1.method1748(83);
                this.field3464[var21][2] = arg1.method1748(-73);
            }
        } else if (arg2 == 5) {
            arg1.method1745(32132);
        } else if (arg2 == 6) {
            arg1.method1738(255);
        } else if (arg2 == 7) {
            arg1.method1738(255);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg1.method1738(255);
            } else if (arg2 == 10) {
                int var4 = arg1.method1738(255);
                this.field3461 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3461[var5] = arg1.method1748(117);
                }
            } else if (arg2 == 12) {
                arg1.method1748(106);
            } else if (arg2 == 13) {
                int var18 = arg1.method1738(255);
                this.field3469 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field3469[var19] = arg1.method1745(32132);
                }
            } else if (arg2 == 14) {
                int var6 = arg1.method1738(255);
                this.field3459 = new int[var6][2];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field3459[var7][0] = arg1.method1738(255);
                    this.field3459[var7][1] = arg1.method1738(255);
                }
            } else if (arg2 == 15) {
                arg1.method1745(32132);
            } else if (arg2 == 17) {
                this.field3447 = arg1.method1745(32132);
            } else if (arg2 == 18) {
                int var8 = arg1.method1738(255);
                this.field3454 = new String[var8];
                this.field3456 = new int[var8];
                this.field3463 = new int[var8];
                this.field3452 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field3452[var9] = arg1.method1748(-96);
                    this.field3456[var9] = arg1.method1748(99);
                    this.field3463[var9] = arg1.method1748(114);
                    this.field3454[var9] = arg1.method1752(false);
                }
            } else if (arg2 == 19) {
                int var10 = arg1.method1738(255);
                this.field3451 = new String[var10];
                this.field3458 = new int[var10];
                this.field3465 = new int[var10];
                this.field3455 = new int[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field3458[var11] = arg1.method1748(-50);
                    this.field3455[var11] = arg1.method1748(93);
                    this.field3465[var11] = arg1.method1748(96);
                    this.field3451[var11] = arg1.method1752(false);
                }
            } else if (arg2 == 249) {
                int var12 = arg1.method1738(255);
                if (this.field3453 == null) {
                    int var13 = class243.method1546(-26367, var12);
                    this.field3453 = new class78(var13);
                }
                for (int var14 = 0; var14 < var12; var14++) {
                    boolean var15 = arg1.method1738(255) == 1;
                    int var16 = arg1.method1700((byte) 44);
                    class108 var17;
                    if (var15) {
                        var17 = new class172(arg1.method1752(arg0));
                    } else {
                        var17 = new class264(arg1.method1748(-59));
                    }
                    this.field3453.method737((long) var16, (byte) 92, var17);
                }
            }
        }
        if (arg0) {
            field3450 = -6;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
    public final void method1527(int arg0) {
        field3466++;
        if (this.field3457 == null) {
            this.field3457 = this.field3460;
        }
        if (arg0 != -31417) {
            method1525(93, -62, -21, (byte) -112, 83);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILco;)V")
    public final void method1528(int arg0, class268 arg1) {
        while (true) {
            int var3 = arg1.method1738(arg0 - 19895);
            if (var3 == 0) {
                if (arg0 != 20150) {
                    field3450 = 70;
                }
                field3467++;
                return;
            }
            this.method1526(false, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)V")
    public static void method1529(int arg0) {
        if (arg0 != -14) {
            field3448 = null;
        }
        field3471 = null;
        field3448 = null;
    }
}
