import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class31 extends class55 {

    @OriginalMember(owner = "client!f", name = "Z", descriptor = "I")
    public int field613 = -1;

    @OriginalMember(owner = "client!f", name = "bb", descriptor = "I")
    public int field615 = -1;

    @OriginalMember(owner = "client!f", name = "gb", descriptor = "I")
    public int field620 = -1;

    @OriginalMember(owner = "client!f", name = "X", descriptor = "I")
    public int field611 = -1;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "I")
    public int field606 = 5;

    @OriginalMember(owner = "client!f", name = "W", descriptor = "I")
    public int field610 = 2;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    public int field608 = 99;

    @OriginalMember(owner = "client!f", name = "cb", descriptor = "Z")
    public boolean field616 = false;

    @OriginalMember(owner = "client!f", name = "fb", descriptor = "I")
    public int field619 = -1;

    @OriginalMember(owner = "client!f", name = "eb", descriptor = "I")
    public static int field618 = 2;

    @OriginalMember(owner = "client!f", name = "lb", descriptor = "Lo;")
    public static class84 field625 = class15.method124("mapback", 255);

    @OriginalMember(owner = "client!f", name = "jb", descriptor = "Lqc;")
    public static class97 field623 = new class97(100);

    @OriginalMember(owner = "client!f", name = "sb", descriptor = "Lo;")
    public static class84 field632 = class15.method124("Please reload this page)3", 255);

    @OriginalMember(owner = "client!f", name = "P", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!f", name = "ab", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!f", name = "ib", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!f", name = "pb", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!f", name = "qb", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!f", name = "rb", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "Lad;")
    public static class5 field602;

    @OriginalMember(owner = "client!f", name = "hb", descriptor = "Lp;")
    public static class89 field621;

    @OriginalMember(owner = "client!f", name = "mb", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field626;

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "[I")
    public int[] field612;

    @OriginalMember(owner = "client!f", name = "db", descriptor = "[I")
    private int[] field617;

    @OriginalMember(owner = "client!f", name = "kb", descriptor = "[I")
    public static int[] field624;

    @OriginalMember(owner = "client!f", name = "nb", descriptor = "[I")
    private int[] field627;

    @OriginalMember(owner = "client!f", name = "ob", descriptor = "[I")
    public int[] field628;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILne;)Lne;", line = 3)
    public final class83 method270(int arg0, int arg1, class83 arg2) {
        field605++;
        int var4 = this.field612[arg0];
        class106 var5 = class48.method412(arg1 - 65624, var4 >> 16);
        int var6 = var4 & arg1;
        if (var5 == null) {
            return arg2.method612(true);
        }
        class106 var7 = null;
        int var8 = 0;
        if (this.field627 != null && this.field627.length > arg0) {
            int var9 = this.field627[arg0];
            var7 = class48.method412(-67, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class83 var11 = arg2.method612(!var5.method789(122, var6));
            var11.method604(var5, var6);
            return var11;
        } else {
            class83 var10 = arg2.method612(!var5.method789(109, var6) & !var7.method789(109, var8));
            var10.method604(var5, var6);
            var10.method604(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BILeb;)V", line = 54)
    private final void method271(byte arg0, int arg1, class27 arg2) {
        if (arg0 != -52) {
            this.method273(null, 47, null, -110, true);
        }
        if (arg1 == 1) {
            int var4 = arg2.method231(255);
            this.field628 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field628[var5] = arg2.method227(class82.method595(arg0, -77));
            }
            this.field612 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field612[var6] = arg2.method227(127);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field612[var7] = (arg2.method227(127) << 16) + this.field612[var7];
            }
        } else if (arg1 == 2) {
            this.field620 = arg2.method227(127);
        } else if (arg1 == 3) {
            int var8 = arg2.method231(255);
            this.field617 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field617[var9] = arg2.method231(arg0 + 307);
            }
            this.field617[var8] = 9999999;
        } else if (arg1 == 4) {
            this.field616 = true;
        } else if (arg1 == 5) {
            this.field606 = arg2.method231(arg0 + 307);
        } else if (arg1 == 6) {
            this.field619 = arg2.method227(127);
        } else if (arg1 == 7) {
            this.field613 = arg2.method227(127);
        } else if (arg1 == 8) {
            this.field608 = arg2.method231(255);
        } else if (arg1 == 9) {
            this.field611 = arg2.method231(255);
        } else if (arg1 == 10) {
            this.field615 = arg2.method231(255);
        } else if (arg1 == 11) {
            this.field610 = arg2.method231(255);
        } else if (arg1 == 12) {
            int var10 = arg2.method231(255);
            this.field627 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field627[var11] = arg2.method227(127);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field627[var12] = (arg2.method227(class82.method595(arg0, -77)) << 16) + this.field627[var12];
            }
        }
        field603++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lne;IB)Lne;", line = 170)
    public final class83 method272(class83 arg0, int arg1, byte arg2) {
        field609++;
        int var4 = this.field612[arg1];
        class106 var5 = class48.method412(arg2 - 154, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method617(true);
        }
        class83 var7 = arg0.method617(!var5.method789(arg2 ^ 0x19, var6));
        var7.method604(var5, var6);
        if (arg2 != 98) {
            this.method275(null, 38, (byte) -27, 115);
        }
        return var7;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lf;ILne;IZ)Lne;", line = 191)
    public final class83 method273(class31 arg0, int arg1, class83 arg2, int arg3, boolean arg4) {
        int var6 = this.field612[arg3];
        field614++;
        class106 var7 = class48.method412(-66, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg0.method280((byte) -9, arg2, arg1);
        }
        int var9 = arg0.field612[arg1];
        class106 var10 = class48.method412(88, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class83 var12 = arg2.method612(!var7.method789(121, var8));
            var12.method604(var7, var8);
            return var12;
        } else if (arg4) {
            return null;
        } else {
            class83 var13 = arg2.method612(!var7.method789(126, var8) & !var10.method789(112, var11));
            var13.method629(var7, var8, var10, var11, this.field617);
            return var13;
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V", line = 225)
    public static final void method274(byte arg0) {
        if (arg0 != 94) {
            method279((byte) 110);
        }
        while (class65.field1405.method985(true, class39.field794) >= 26) {
            int var1 = class65.field1405.method986(-126, 14);
            if (var1 == 16383) {
                break;
            }
            if (class3.field30[var1] == null) {
                class3.field30[var1] = new class115();
            }
            class115 var2 = class3.field30[var1];
            class75.field1571[class85.field1933++] = var1;
            var2.field1379 = class128.field2837;
            int var3 = class65.field1405.method986(120, 5);
            if (var3 > 15) {
                var3 -= 32;
            }
            int var4 = class65.field1405.method986(-74, 1);
            var2.field2501 = class42.method366(arg0 ^ 0xFFFFFFE6, class65.field1405.method986(78, 13));
            int var5 = class65.field1405.method986(arg0 ^ 0x25, 5);
            int var6 = class65.field1405.method986(arg0 - 187, 1);
            if (var6 == 1) {
                class117.field2552[class62.field1290++] = var1;
            }
            var2.field1399 = var2.field2501.field766;
            var2.field1419 = var2.field2501.field762;
            var2.field1440 = var2.field2501.field758;
            var2.field1420 = var2.field2501.field771;
            var2.field1392 = var2.field2501.field769;
            var2.field1384 = var2.field2501.field754;
            if (var5 > 15) {
                var5 -= 32;
            }
            var2.field1373 = var2.field2501.field780;
            var2.method507(var4 == 1, class107.field2271.field1436[0] + var5, (byte) 79, class107.field2271.field1374[0] + var3);
        }
        class65.field1405.method982((byte) 43);
        field607++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lne;IBI)Lne;", line = 287)
    public final class83 method275(class83 arg0, int arg1, byte arg2, int arg3) {
        int var5 = this.field612[arg1];
        class106 var6 = class48.method412(-65, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        field629++;
        if (var6 == null) {
            return arg0.method612(true);
        }
        int var8 = arg3 & 0x3;
        class83 var9 = arg0.method612(!var6.method789(arg2 + 37, var7));
        if (var8 == 1) {
            var9.method616();
        } else if (var8 == 2) {
            var9.method619();
        } else if (var8 == 3) {
            var9.method618();
        }
        var9.method604(var6, var7);
        if (var8 == 1) {
            var9.method618();
        } else if (var8 == 2) {
            var9.method619();
        } else if (var8 == 3) {
            var9.method616();
        }
        if (arg2 != 81) {
            field625 = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)V", line = 341)
    public final void method276(boolean arg0) {
        if (this.field611 == -1) {
            if (this.field617 == null) {
                this.field611 = 0;
            } else {
                this.field611 = 2;
            }
        }
        field604++;
        if (this.field615 == -1) {
            if (this.field617 == null) {
                this.field615 = 0;
            } else {
                this.field615 = 2;
            }
        }
        if (arg0) {
            this.field617 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILeb;)V", line = 373)
    public final void method277(int arg0, class27 arg1) {
        while (true) {
            int var3 = arg1.method231(255);
            if (var3 == 0) {
                field631++;
                if (arg0 != -1) {
                    this.method273(null, -30, null, -91, false);
                    return;
                }
                return;
            }
            this.method271((byte) -52, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V", line = 398)
    public static final void method278(int arg0) {
        class106.field2246.method186(7971);
        for (int var1 = 0; var1 < 32; var1++) {
            class107.field2282[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class116.field2520[var2] = 0L;
        }
        class28.field556 = 0;
        if (arg0 != 65535) {
            field623 = null;
        }
        field622++;
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(B)V", line = 441)
    public static void method279(byte arg0) {
        field621 = null;
        field632 = null;
        field623 = null;
        field626 = null;
        field602 = null;
        if (arg0 != 68) {
            field626 = null;
        }
        field625 = null;
        field624 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BLne;I)Lne;", line = 467)
    public final class83 method280(byte arg0, class83 arg1, int arg2) {
        field630++;
        int var4 = -31 % ((arg0 - 45) / 52);
        int var5 = this.field612[arg2];
        class106 var6 = class48.method412(-77, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method612(true);
        } else {
            class83 var8 = arg1.method612(!var6.method789(123, var7));
            var8.method604(var6, var7);
            return var8;
        }
    }
}
