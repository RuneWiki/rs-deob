import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class49 extends class37 {

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
    private int field1064 = 0;

    @OriginalMember(owner = "client!eh", name = "jb", descriptor = "I")
    private int field1082 = 2048;

    @OriginalMember(owner = "client!eh", name = "ab", descriptor = "I")
    private int field1073 = 10;

    @OriginalMember(owner = "client!eh", name = "cb", descriptor = "I")
    public static int field1075 = 0;

    @OriginalMember(owner = "client!eh", name = "X", descriptor = "[I")
    public static int[] field1070 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!eh", name = "hb", descriptor = "I")
    public static int field1080 = 3;

    @OriginalMember(owner = "client!eh", name = "fb", descriptor = "Z")
    public static boolean field1078 = false;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!eh", name = "W", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!eh", name = "bb", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!eh", name = "db", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!eh", name = "eb", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!eh", name = "ib", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!eh", name = "kb", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "Lag;")
    public static class8 field1067;

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "[I")
    private int[] field1068;

    @OriginalMember(owner = "client!eh", name = "gb", descriptor = "[I")
    private int[] field1079;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(III)Z")
    public static final boolean method435(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field1078 = false;
        }
        ++field1083;
        return ~(1 & arg2 >> arg1 + 1) != -1;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(JZ)Ldd;")
    public static final class35 method436(long arg0, boolean arg1) {
        ++field1077;
        if (arg0 > 0L && ~arg0 > -6582952005840035282L) {
            if (arg0 % 37L == 0L) {
                return null;
            } else if (arg1) {
                return null;
            } else {
                long var3 = arg0;
                int var5 = 0;
                while (~var3 != -1L) {
                    var3 /= 37L;
                    ++var5;
                }
                byte[] var6 = new byte[var5];
                while (arg0 != 0L) {
                    long var8 = arg0;
                    arg0 /= 37L;
                    --var5;
                    var6[var5] = class159.field3232[(int) (-(arg0 * 37L) + var8)];
                }
                class35 var7 = new class35();
                var7.field730 = var6;
                var7.field758 = var6.length;
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(B)V")
    public static void method437(byte arg0) {
        field1070 = null;
        field1067 = null;
        if (arg0 != -80) {
            field1078 = false;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field1069;
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (arg0 != 75) {
            return null;
        } else {
            if (super.field816.field3661) {
                int var4 = class22.field450[arg1];
                if (~this.field1064 == -1) {
                    short var5 = 0;
                    for (int var6 = 0; this.field1073 > var6; ++var6) {
                        if (~this.field1079[var6] >= ~var4 && var4 < this.field1079[var6 - -1]) {
                            if (this.field1068[var6] > var4) {
                                var5 = 4096;
                            }
                            break;
                        }
                    }
                    class156.method1047(var3, 0, class72.field1719, var5);
                } else {
                    for (int var7 = 0; class72.field1719 > var7; ++var7) {
                        int var8 = 0;
                        int var9 = class118.field2622[var7];
                        int var10 = this.field1064;
                        if (var10 != 1) {
                            if (var10 != 2) {
                                if (var10 == 3) {
                                    var8 = (-var4 + var9 >> 1) + 2048;
                                }
                            } else {
                                var8 = (var4 + -4096 + var9 >> 1) + 2048;
                            }
                        } else {
                            var8 = var9;
                        }
                        short var11 = 0;
                        for (int var12 = 0; ~this.field1073 < ~var12; ++var12) {
                            if (var8 >= this.field1079[var12] && ~var8 > ~this.field1079[var12 + 1]) {
                                if (~var8 > ~this.field1068[var12]) {
                                    var11 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var7] = var11;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class49() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
    public final void method11(boolean arg0) {
        this.method439(-25018);
        if (arg0) {
            method442(105, true, (byte[]) null);
        }
        ++field1071;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(BI)V")
    public static final void method438(byte arg0, int arg1) {
        if (arg0 >= -111) {
            field1078 = true;
        }
        ++field1081;
        if (class193.method1261((byte) 111, arg1)) {
            class99.method746(-1, -1, class163.field3299[arg1]);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        if (arg1 != 1) {
            this.method7((byte) -33, 31);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field1064 = arg2.method221(-118);
                }
            } else {
                this.field1082 = arg2.method256((byte) -78);
            }
        } else {
            this.field1073 = arg2.method221(-114);
        }
        ++field1065;
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)V")
    private final void method439(int arg0) {
        ++field1066;
        if (arg0 != -25018) {
            method440(71, true, false);
        }
        this.field1068 = new int[this.field1073 + 1];
        this.field1079 = new int[this.field1073 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field1073;
        int var4 = this.field1082 * var3 >> 12;
        for (int var5 = 0; ~var5 > ~this.field1073; ++var5) {
            this.field1079[var5] = var2;
            this.field1068[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1079[this.field1073] = 4096;
        this.field1068[this.field1073] = 4096 - -this.field1068[0];
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZZ)I")
    public static final int method440(int arg0, boolean arg1, boolean arg2) {
        ++field1074;
        int var3 = arg0;
        if (arg1) {
            var3 = class130.field2811 - -class147.field3098 + arg0;
        }
        if (arg2) {
            var3 += class106.field2359 - -class122.field2690;
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method441(Component arg0, int arg1) {
        arg0.removeKeyListener(class111.field2443);
        ++field1076;
        if (arg1 >= -27) {
            method435(111, 111, -54);
        }
        arg0.removeFocusListener(class111.field2443);
        class79.field1854 = -1;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
    public static final Object method442(int arg0, boolean arg1, byte[] arg2) {
        ++field1072;
        if (arg2 == null) {
            return null;
        } else {
            if (arg2.length > 136 && !class155.field3197) {
                try {
                    class28 var3 = (class28) Class.forName("db").newInstance();
                    var3.method269((byte) -101, arg2);
                    return var3;
                } catch (Throwable var4) {
                    class155.field3197 = true;
                }
            }
            if (arg0 != 37) {
                method442(-124, true, (byte[]) null);
            }
            return arg1 ? class122.method871(-114, arg2) : arg2;
        }
    }
}
