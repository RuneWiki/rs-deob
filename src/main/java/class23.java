import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class23 implements class78 {

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Lfc;")
    private class34 field607 = new class34();

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    private int field629 = 128;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "D")
    private double field632 = 1.0D;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    private int field637 = 0;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    private int field633;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "Lmb;")
    private class74 field636;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "[Lwa;")
    private class128[] field624;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field610 = 0;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Lv;")
    public static class122 field616 = class55.method425(-61, "Benutzeroberfl\u001c1che geladen)3");

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field614 = 0;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lv;")
    public static class122 field612 = class55.method425(-84, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Lv;")
    public static class122 field622 = class55.method425(-68, "Gegenstand f\u001c1r Mitglieder");

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "[Lv;")
    public static class122[] field617 = new class122[500];

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "Lv;")
    public static class122 field634 = class55.method425(-124, ")1");

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Lv;")
    private static class122 field618 = class55.method425(-87, "white:");

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Lv;")
    public static class122 field620 = field618;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "Lv;")
    private static class122 field625 = class55.method425(-83, "Trade)4compete");

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "Lv;")
    public static class122 field638 = class55.method425(-117, "backhmid2");

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "Lv;")
    public static class122 field626 = field625;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "Ljava/awt/Font;")
    public static Font field630;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "[I")
    public static int[] field608;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Z", line = 6)
    public final boolean method238(int arg0, int arg1) {
        field611++;
        if (arg1 != -12799) {
            method243(34);
        }
        return this.field624[arg0].field3116;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(II)V", line = 36)
    public final void method239(int arg0, int arg1) {
        if (arg1 >= -122) {
            this.method248((byte) -121, 1.224199553015558D);
        }
        for (int var3 = 0; var3 < this.field624.length; var3++) {
            class128 var4 = this.field624[var3];
            if (var4 != null && var4.field3114 != 0 && var4.field3121) {
                var4.method1008(arg0);
                var4.field3121 = false;
            }
        }
        field615++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)[I", line = 63)
    public final int[] method240(int arg0, byte arg1) {
        class128 var3 = this.field624[arg0];
        if (arg1 != -79) {
            field610 = -94;
        }
        field621++;
        if (var3 != null) {
            if (var3.field3123 != null) {
                this.field607.method301(false, var3);
                var3.field3121 = true;
                return var3.field3123;
            }
            boolean var4 = var3.method1007(this.field632, this.field629, this.field636);
            if (var4) {
                if (this.field637 == 0) {
                    class128 var5 = (class128) this.field607.method306((byte) -36);
                    var5.method1009();
                } else {
                    this.field637--;
                }
                this.field607.method301(false, var3);
                var3.field3121 = true;
                return var3.field3123;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)Z", line = 130)
    public final boolean method241(int arg0, int arg1) {
        field628++;
        int var3 = 77 / ((-arg1 - 38) / 51);
        return this.field629 == 64;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III[Lcc;[BLa;)V", line = 140)
    public static final void method242(int arg0, int arg1, int arg2, class16[] arg3, byte[] arg4, class1 arg5) {
        class64 var6 = new class64(arg4);
        field609++;
        int var7 = arg0;
        while (true) {
            int var8 = var6.method486(arg0 + 118);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method486(94);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 6 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var9 & 0x3F;
                int var14 = var6.method520(-127);
                int var15 = var14 & 0x3;
                int var16 = arg1 + var13;
                int var17 = arg2 + var11;
                int var18 = var14 >> 2;
                if (var17 > 0 && var16 > 0 && var17 < 103 && var16 < 103) {
                    class16 var19 = null;
                    int var20 = var12;
                    if ((class54.field1408[1][var17][var16] & 0x2) == 2) {
                        var20 = var12 - 1;
                    }
                    if (var20 >= 0) {
                        var19 = arg3[var20];
                    }
                    class37.method327(var15, (byte) 12, var16, var12, var19, var7, var17, arg5, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 211)
    public static void method243(int arg0) {
        field616 = null;
        field612 = null;
        field630 = null;
        field622 = null;
        if (arg0 != -1) {
            return;
        }
        field638 = null;
        field608 = null;
        field634 = null;
        field618 = null;
        field617 = null;
        field625 = null;
        field626 = null;
        field620 = null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V", line = 233)
    public final void method244(int arg0) {
        for (int var2 = 0; var2 < this.field624.length; var2++) {
            if (this.field624[var2] != null) {
                this.field624[var2].method1009();
            }
        }
        this.field607 = new class34();
        this.field637 = this.field633;
        field623++;
        int var3 = -118 % ((arg0 + 38) / 56);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)I", line = 256)
    public static final int method245(byte arg0) {
        if (arg0 <= 43) {
            return 64;
        } else {
            field631++;
            return 5;
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)I", line = 283)
    public final int method246(int arg0, int arg1) {
        int var3 = 116 / (arg1 / 59);
        field613++;
        return this.field624[arg0] == null ? 0 : this.field624[arg0].field3117;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lmb;Lmb;IDI)V", line = 406)
    public class23(class74 arg0, class74 arg1, int arg2, double arg3, int arg4) {
        this.field633 = arg2;
        this.field632 = arg3;
        this.field629 = arg4;
        this.field636 = arg1;
        this.field637 = this.field633;
        int[] var7 = arg0.method604(0, 4);
        int var8 = var7.length;
        this.field624 = new class128[arg0.method601(-79, 0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class64 var10 = new class64(arg0.method611(0, 0, var7[var9]));
            this.field624[var7[var9]] = new class128(var10);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)V", line = 300)
    public static final void method247(boolean arg0, int arg1) {
        field627++;
        if (arg1 != 64) {
            method245((byte) 77);
        }
        for (int var2 = 0; var2 < class49.field1245; var2++) {
            class80 var3 = class94.field2423[class21.field581[var2]];
            int var4 = (class21.field581[var2] << 14) + 536870912;
            if (var3 != null && var3.method112((byte) 116) && arg0 == var3.field2089.field576 && var3.field2089.method222(true)) {
                int var5 = var3.field343 >> 7;
                int var6 = var3.field349 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field317 == 1 && (var3.field343 & 0x7F) == 64 && (var3.field349 & 0x7F) == 64) {
                        if (class74.field1948[var5][var6] == class83.field2148) {
                            continue;
                        }
                        class74.field1948[var5][var6] = class83.field2148;
                    }
                    if (!var3.field2089.field559) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class90.field2306.method39(class34.field848, var3.field343, var3.field349, class108.method837((byte) 59, var3.field317 * 64 + var3.field343 - 64, (var3.field317 + -1) * 64 + var3.field349, class34.field848), (var3.field317 - 1) * 64 + 60, var3, var3.field299, var4, var3.field291);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BD)V", line = 359)
    public final void method248(byte arg0, double arg1) {
        this.field632 = arg1;
        field619++;
        if (arg0 != 92) {
            field612 = null;
        }
        this.method244(100);
    }
}
