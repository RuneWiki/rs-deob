import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 extends class80 {

    @OriginalMember(owner = "client!aa", name = "yd", descriptor = "I")
    public int field69 = 0;

    @OriginalMember(owner = "client!aa", name = "Ed", descriptor = "I")
    public int field75 = 0;

    @OriginalMember(owner = "client!aa", name = "vd", descriptor = "I")
    public int field66 = 0;

    @OriginalMember(owner = "client!aa", name = "Ld", descriptor = "I")
    public int field82 = -1;

    @OriginalMember(owner = "client!aa", name = "Gd", descriptor = "I")
    public int field77 = -1;

    @OriginalMember(owner = "client!aa", name = "Md", descriptor = "I")
    public int field83 = 0;

    @OriginalMember(owner = "client!aa", name = "Vd", descriptor = "I")
    public int field92 = 0;

    @OriginalMember(owner = "client!aa", name = "Zd", descriptor = "Z")
    public boolean field96 = false;

    @OriginalMember(owner = "client!aa", name = "Hd", descriptor = "La;")
    public static class1 field78 = class113.method934(-11538, "Mitteilung");

    @OriginalMember(owner = "client!aa", name = "Nd", descriptor = "La;")
    public static class1 field84 = class113.method934(-11538, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!aa", name = "Cd", descriptor = "I")
    public static int field73 = 0;

    @OriginalMember(owner = "client!aa", name = "ae", descriptor = "I")
    public static int field97 = 0;

    @OriginalMember(owner = "client!aa", name = "ce", descriptor = "La;")
    public static class1 field99 = class113.method934(-11538, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!aa", name = "xd", descriptor = "La;")
    private static class1 field68 = class113.method934(-11538, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!aa", name = "fe", descriptor = "La;")
    private static class1 field102 = class113.method934(-11538, "green:");

    @OriginalMember(owner = "client!aa", name = "Xd", descriptor = "La;")
    public static class1 field94 = class113.method934(-11538, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!aa", name = "ud", descriptor = "La;")
    public static class1 field65 = field102;

    @OriginalMember(owner = "client!aa", name = "Yd", descriptor = "La;")
    public static class1 field95 = field68;

    @OriginalMember(owner = "client!aa", name = "de", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "client!aa", name = "ee", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!aa", name = "wd", descriptor = "I")
    public int field67;

    @OriginalMember(owner = "client!aa", name = "zd", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!aa", name = "Ad", descriptor = "I")
    public int field71;

    @OriginalMember(owner = "client!aa", name = "Bd", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!aa", name = "Fd", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!aa", name = "Jd", descriptor = "I")
    public int field80;

    @OriginalMember(owner = "client!aa", name = "Kd", descriptor = "I")
    public int field81;

    @OriginalMember(owner = "client!aa", name = "Od", descriptor = "I")
    public int field85;

    @OriginalMember(owner = "client!aa", name = "Pd", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!aa", name = "Rd", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!aa", name = "Sd", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!aa", name = "Td", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "client!aa", name = "be", descriptor = "I")
    public int field98;

    @OriginalMember(owner = "client!aa", name = "Qd", descriptor = "La;")
    public class1 field87;

    @OriginalMember(owner = "client!aa", name = "Ud", descriptor = "Lla;")
    public class67 field91;

    @OriginalMember(owner = "client!aa", name = "Dd", descriptor = "Lpa;")
    public class91 field74;

    @OriginalMember(owner = "client!aa", name = "Id", descriptor = "[B")
    public static byte[] field79;

    @OriginalMember(owner = "client!aa", name = "Wd", descriptor = "[I")
    public static int[] field93;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)Lpa;", line = 15)
    public final class91 method42(int arg0) {
        ++field70;
        if (this.field91 == null) {
            return null;
        } else {
            int var2 = 71 % ((41 - arg0) / 47);
            class47 var3 = super.field2018 != -1 && ~super.field1999 == -1 ? class4.method104(super.field2018, 2) : null;
            class47 var4 = ~super.field1954 == 0 || this.field96 || super.field2003 == super.field1954 && var3 != null ? null : class4.method104(super.field1954, 2);
            class91 var5 = this.field91.method640(var3, var4, super.field1993, super.field1981, (byte) -128);
            if (var5 == null) {
                return null;
            } else {
                var5.method769();
                super.field1994 = var5.field3138;
                if (!this.field96 && ~super.field1968 != 0 && super.field2017 != -1) {
                    class91 var6 = class78.method716(super.field1968, 13).method372(super.field2017, 2);
                    if (var6 != null) {
                        var6.method799(0, -super.field1987, 0);
                        class91[] var7 = new class91[] { var5, var6 };
                        var5 = new class91(var7, 2, true);
                    }
                }
                if (!this.field96 && this.field74 != null) {
                    if (~class82.field2066 <= ~this.field83) {
                        this.field74 = null;
                    }
                    if (this.field92 <= class82.field2066 && ~this.field83 < ~class82.field2066) {
                        class91 var8 = this.field74;
                        var8.method799(-super.field1975 + this.field80, -this.field85 + this.field81, -super.field1966 + this.field100);
                        if (super.field1957 != 512) {
                            if (super.field1957 == 1024) {
                                var8.method784();
                                var8.method784();
                            } else if (super.field1957 == 1536) {
                                var8.method784();
                            }
                        } else {
                            var8.method784();
                            var8.method784();
                            var8.method784();
                        }
                        class91[] var9 = new class91[] { var5, var8 };
                        var5 = new class91(var9, 2, true);
                        if (super.field1957 != 512) {
                            if (super.field1957 == 1024) {
                                var8.method784();
                                var8.method784();
                            } else if (super.field1957 == 1536) {
                                var8.method784();
                                var8.method784();
                                var8.method784();
                            }
                        } else {
                            var8.method784();
                        }
                        var8.method799(-this.field80 + super.field1975, -this.field81 + this.field85, super.field1966 - this.field100);
                    }
                }
                var5.field2208 = true;
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "(I)Z", line = 114)
    public final boolean method43(int arg0) {
        ++field86;
        if (arg0 != 1) {
            method45(-71);
        }
        return this.field91 != null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLba;)V", line = 165)
    public final void method44(byte arg0, class8 arg1) {
        ++field101;
        arg1.field268 = 0;
        int var3 = arg1.method145(false);
        this.field77 = arg1.method185(118);
        this.field82 = arg1.method185(89);
        int var4 = -1;
        this.field75 = 0;
        int[] var5 = new int[12];
        if (arg0 >= -51) {
            field84 = null;
        }
        for (int var6 = 0; var6 < 12; ++var6) {
            int var7 = arg1.method145(false);
            if (~var7 == -1) {
                var5[var6] = 0;
            } else {
                int var8 = arg1.method145(false);
                var5[var6] = (var7 << 8) + var8;
                if (~var6 == -1 && var5[0] == 65535) {
                    var4 = arg1.method146(65280);
                    break;
                }
                if (~var5[var6] <= -513) {
                    int var12 = class89.method763(var5[var6] + -512, 10).field2857;
                    if (~var12 != -1) {
                        this.field75 = var12;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; ~var10 > -6; ++var10) {
            int var11 = arg1.method145(false);
            if (~var11 > -1 || ~class116.field2897[var10].length >= ~var11) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        super.field2003 = arg1.method146(65280);
        if (~super.field2003 == -65536) {
            super.field2003 = -1;
        }
        super.field2022 = arg1.method146(65280);
        if (super.field2022 == 65535) {
            super.field2022 = -1;
        }
        super.field1960 = super.field2022;
        super.field2008 = arg1.method146(65280);
        if (~super.field2008 == -65536) {
            super.field2008 = -1;
        }
        super.field1956 = arg1.method146(65280);
        if (super.field1956 == 65535) {
            super.field1956 = -1;
        }
        super.field1952 = arg1.method146(65280);
        if (super.field1952 == 65535) {
            super.field1952 = -1;
        }
        super.field2009 = arg1.method146(65280);
        if (~super.field2009 == -65536) {
            super.field2009 = -1;
        }
        super.field1959 = arg1.method146(65280);
        if (super.field1959 == 65535) {
            super.field1959 = -1;
        }
        this.field87 = class118.method972(-127, arg1.method175(1362367312)).method36(-4305);
        this.field69 = arg1.method145(false);
        this.field66 = arg1.method146(65280);
        if (this.field91 == null) {
            this.field91 = new class67();
        }
        this.field91.method643(var5, var3 == 1, 7, var9, var4);
    }

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "(I)V", line = 276)
    public static final void method45(int arg0) {
        try {
            if (arg0 < 106) {
                return;
            }
            Graphics var1 = class122.field3052.getGraphics();
            class35.field926.method102(0, 4, var1, 4);
        } catch (Exception var2) {
            class122.field3052.repaint();
        }
        ++field72;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)Z", line = 296)
    public static final boolean method46(byte arg0, int arg1) {
        ++field88;
        if (~arg1 > -33) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            if (arg0 < 118) {
                field79 = null;
            }
            return ~arg1 > -130 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(Z)V", line = 339)
    public static void method47(boolean arg0) {
        field84 = null;
        field78 = null;
        field79 = null;
        field94 = null;
        field93 = null;
        if (!arg0) {
            field68 = null;
            field102 = null;
            field95 = null;
            field99 = null;
            field65 = null;
        }
    }
}
