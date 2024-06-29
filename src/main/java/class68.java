import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class68 extends class142 {

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
    private int field1185 = 4096;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "I")
    private int field1190 = 0;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "J")
    public static volatile long field1189 = 0L;

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "Lai;")
    public static class10 field1197 = class44.method278("Ihr Spielkonto wird bereits benutzt)3", 96);

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "Lai;")
    public static class10 field1198 = class44.method278("Zu viele Verbindungen von Ihrer Adresse)3", 91);

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "I")
    public static int field1194 = 0;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!hc", name = "fb", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!hc", name = "eb", descriptor = "Lc;")
    public static class21 field1199;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        ++field1193;
        if (super.field2683.field3516) {
            int[] var4 = this.method963((byte) -121, 0, arg1);
            for (int var5 = 0; class133.field2499 > var5; ++var5) {
                int var6 = var4[var5];
                if (~var6 > ~this.field1190) {
                    var3[var5] = this.field1190;
                } else if (~this.field1185 > ~var6) {
                    var3[var5] = this.field1185;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        if (arg0) {
            this.method6(false, -65);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class68() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BZZ)I")
    public static final int method443(byte arg0, boolean arg1, boolean arg2) {
        ++field1192;
        int var3 = 0;
        if (arg2) {
            var3 += class89.field1570 + class182.field3471;
        }
        int var4 = 43 / ((-47 - arg0) / 50);
        if (arg1) {
            var3 += class101.field1900 - -class188.field3588;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZLai;)V")
    public static final void method444(int arg0, boolean arg1, class10 arg2) {
        ++field1186;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        if (arg0 > -95) {
            field1194 = 122;
        }
        int var6 = class133.field2496.method1276(arg2, 250);
        int var7 = 13 * class133.field2496.method1259(arg2, 250);
        class62.method412(-var3 + var4, var5 - var3, var6 - -var3 - -var3, var7 - -var3 + var3, 0);
        class62.method417(-var3 + var4, -var3 + var5, var6 - -var3 + var3, var7 - -var3 + var3, 16777215);
        class133.field2496.method1275(arg2, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class147.method1015(false, var4 - var3, var6 - -var3 + var3, var3 + var7 + var3, var5 - var3);
        if (!arg1) {
            class168.method1114(var4, var6, var7, false, var5);
        } else {
            try {
                Graphics var8 = class134.field2513.getGraphics();
                class190.field3622.method969(0, var8, 13, 0);
            } catch (Exception var9) {
                class134.field2513.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method86(int arg0, boolean arg1) {
        ++field1187;
        int[][] var3 = super.field2666.method956(arg0, -125);
        if (super.field2666.field2664) {
            int[][] var4 = this.method961(2, 0, arg0);
            int[] var5 = var4[1];
            int[] var6 = var3[0];
            int[] var7 = var4[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var4[2];
            for (int var11 = 0; var11 < class133.field2499; ++var11) {
                int var12 = var7[var11];
                int var13 = var5[var11];
                int var14 = var10[var11];
                if (~var12 <= ~this.field1190) {
                    if (this.field1185 >= var12) {
                        var6[var11] = var12;
                    } else {
                        var6[var11] = this.field1185;
                    }
                } else {
                    var6[var11] = this.field1190;
                }
                if (this.field1190 > var13) {
                    var8[var11] = this.field1190;
                } else if (this.field1185 < var13) {
                    var8[var11] = this.field1185;
                } else {
                    var8[var11] = var13;
                }
                if (~var14 <= ~this.field1190) {
                    if (this.field1185 >= var14) {
                        var9[var11] = var14;
                    } else {
                        var9[var11] = this.field1185;
                    }
                } else {
                    var9[var11] = this.field1190;
                }
            }
        }
        if (arg1) {
            method447((byte) 83);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        ++field1200;
        if (arg2 >= -34) {
            this.method78((class114) null, 60, (byte) 107);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field2684 = arg0.method767(true) == 1;
                }
            } else {
                this.field1185 = arg0.method762((byte) 119);
            }
        } else {
            this.field1190 = arg0.method762((byte) 71);
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)V")
    public static final void method445(byte arg0) {
        if (arg0 != -109) {
            field1197 = null;
        }
        ++field1191;
        class192.field3651.method226((byte) -90);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIZ)I")
    public static final int method446(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return 85;
        } else {
            ++field1196;
            if (~arg1 == 0) {
                return 12345678;
            } else {
                int var3 = (127 & arg1) * arg0 >> 7;
                if (~var3 > -3) {
                    var3 = 2;
                } else if (var3 > 126) {
                    var3 = 126;
                }
                return (65408 & arg1) + var3;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(B)V")
    public static void method447(byte arg0) {
        field1199 = null;
        field1197 = null;
        if (arg0 < 14) {
            method444(126, true, (class10) null);
        }
        field1198 = null;
    }
}
