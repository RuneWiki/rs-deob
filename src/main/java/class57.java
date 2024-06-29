import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class57 extends class51 {

    @OriginalMember(owner = "client!g", name = "cb", descriptor = "I")
    private int field1113 = 1;

    @OriginalMember(owner = "client!g", name = "jb", descriptor = "I")
    private int field1120 = 0;

    @OriginalMember(owner = "client!g", name = "kb", descriptor = "I")
    private int field1121 = 0;

    @OriginalMember(owner = "client!g", name = "db", descriptor = "I")
    public static int field1114 = 1;

    @OriginalMember(owner = "client!g", name = "gb", descriptor = "[I")
    public static int[] field1117 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!g", name = "lb", descriptor = "I")
    public static int field1122 = 0;

    @OriginalMember(owner = "client!g", name = "fb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1116 = Calendar.getInstance();

    @OriginalMember(owner = "client!g", name = "mb", descriptor = "Ltd;")
    public static class176 field1123 = new class176(64);

    @OriginalMember(owner = "client!g", name = "qb", descriptor = "I")
    public static int field1127 = 0;

    @OriginalMember(owner = "client!g", name = "nb", descriptor = "Led;")
    private static class43 field1124 = class191.method1219("wave2:", false);

    @OriginalMember(owner = "client!g", name = "pb", descriptor = "Led;")
    public static class43 field1126 = field1124;

    @OriginalMember(owner = "client!g", name = "ob", descriptor = "Led;")
    public static class43 field1125 = field1124;

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!g", name = "eb", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!g", name = "hb", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!g", name = "ib", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjg;ILrf;)V")
    public static final void method340(int arg0, class89 arg1, int arg2, class160 arg3) {
        class128 var4 = new class128();
        ++field1119;
        var4.field2557 = arg1.method538((byte) 95);
        var4.field2559 = arg1.method545(-7436);
        var4.field2551 = new byte[var4.field2557][][];
        var4.field2569 = new class141[var4.field2557];
        var4.field2571 = new int[var4.field2557];
        var4.field2570 = new int[var4.field2557];
        if (arg0 != 5369) {
            field1116 = null;
        }
        var4.field2566 = new int[var4.field2557];
        var4.field2554 = new class141[var4.field2557];
        for (int var5 = 0; var4.field2557 > var5; ++var5) {
            try {
                int var6 = arg1.method538((byte) -65);
                if (var6 != 0 && ~var6 != -2 && ~var6 != -3) {
                    if (~var6 == -4 || ~var6 == -5) {
                        String var10 = new String(arg1.method541(936).method259((byte) -105));
                        String var11 = new String(arg1.method541(936).method259((byte) 107));
                        int var12 = arg1.method538((byte) -49);
                        String[] var13 = new String[var12];
                        for (int var14 = 0; var14 < var12; ++var14) {
                            var13[var14] = new String(arg1.method541(class127.method818(arg0, 5969)).method259((byte) 70));
                        }
                        byte[][] var15 = new byte[var12][];
                        if (~var6 == -4) {
                            for (int var16 = 0; ~var12 < ~var16; ++var16) {
                                int var17 = arg1.method545(arg0 + -12805);
                                var15[var16] = new byte[var17];
                                arg1.method534(0, var17, arg0 ^ 28071, var15[var16]);
                            }
                        }
                        Class[] var18 = new Class[var12];
                        var4.field2571[var5] = var6;
                        for (int var19 = 0; var19 < var12; ++var19) {
                            var18[var19] = class15.method67(var13[var19], 2);
                        }
                        var4.field2554[var5] = arg3.method1004(class15.method67(var10, 2), -109, var18, var11);
                        var4.field2551[var5] = var15;
                    }
                } else {
                    String var7 = new String(arg1.method541(arg0 + -4433).method259((byte) 81));
                    String var8 = new String(arg1.method541(936).method259((byte) 112));
                    int var9 = 0;
                    if (~var6 == -2) {
                        var9 = arg1.method545(-7436);
                    }
                    var4.field2571[var5] = var6;
                    var4.field2566[var5] = var9;
                    var4.field2569[var5] = arg3.method1008(class15.method67(var7, 2), var8, -22579);
                }
            } catch (ClassNotFoundException var20) {
                var4.field2570[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2570[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2570[var5] = -3;
            } catch (Exception var23) {
                var4.field2570[var5] = -4;
            } catch (Throwable var24) {
                var4.field2570[var5] = -5;
            }
        }
        class50.field1005.method756(25541, var4);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lna;IZ)V")
    public static final void method341(class119 arg0, int arg1, boolean arg2) {
        ++field1111;
        class157.method996(arg0.field2347, arg0.field2328, 8, arg1);
        if (!arg2) {
            field1114 = -37;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class57() {
        super(0, true);
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(I)V")
    public static void method342(int arg0) {
        field1124 = null;
        field1117 = null;
        field1116 = null;
        field1123 = null;
        if (arg0 != 0) {
            field1116 = null;
        }
        field1126 = null;
        field1125 = null;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
    public final void method64(int arg0) {
        class159.method999((byte) 13);
        ++field1112;
        if (arg0 > -83) {
            this.method24((class89) null, -21, 65);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field1110;
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (super.field1025.field154) {
            int var4 = class40.field771[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class122.field2442; ++var6) {
                int var7 = class95.field1855[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field1121 == -1) {
                    var9 = (-var4 + var7) * this.field1113;
                } else {
                    int var10 = var8 * var8 - -(var5 * var5) >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) (var10 / 4096)));
                    var9 = (int) ((double) (this.field1113 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (this.field1120 == 0) {
                    var12 = class49.field981[255 & var12 >> 4] - -4096 >> 1;
                } else if (~this.field1120 == -3) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return arg0 != 16 ? null : var3;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field1127 = 73;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -4) {
                    this.field1113 = arg0.method538((byte) -103);
                }
            } else {
                this.field1120 = arg0.method538((byte) -122);
            }
        } else {
            this.field1121 = arg0.method538((byte) -60);
        }
        ++field1118;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILed;)V")
    public static final void method343(int arg0, class43 arg1) {
        ++field1115;
        if (class33.field614 != null) {
            int var2 = 0;
            long var3 = arg1.method249(-48);
            if (~var3 != -1L) {
                while (var2 < class33.field614.length && class33.field614[var2].field1353 != var3) {
                    ++var2;
                }
                if (arg0 < 11) {
                    method343(-36, (class43) null);
                }
                if (class33.field614.length > var2 && class33.field614[var2] != null) {
                    ++class207.field4048;
                    class29.field522.method338(253, 5);
                    class29.field522.method550(-123, class33.field614[var2].field1353);
                }
            }
        }
    }
}
