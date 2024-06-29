import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class12 {

    @OriginalMember(owner = "client!o", name = "d", descriptor = "J")
    public long field136 = 0L;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Le;")
    public static class191 field133 = class54.method368("Starte 3D)2Softwarebibliothek)3", 2047);

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Le;")
    public static class191 field137 = class54.method368(":clan:", 2047);

    @OriginalMember(owner = "client!o", name = "q", descriptor = "Le;")
    public static class191 field149 = class54.method368("cookiehost", 2047);

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public int field142;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public int field144;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public int field147;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public int field148;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public int field150;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public int field151;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public int field152;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public int field153;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Lng;")
    public static class121 field141;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "Lbe;")
    public class16 field155;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "[[[I")
    public static int[][][] field143;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
    public static final void method82(boolean arg0) {
        class230.field4125.method985(0);
        field134++;
        if (arg0) {
            field141 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIBI)V")
    public static final void method83(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field140++;
        int var5 = 0;
        if (arg3 != 36) {
            return;
        }
        while (class239.field4257 > var5) {
            if (arg2 < (class97.field1570[var5] + class86.field1420[var5]) && class86.field1420[var5] < (arg1 + arg2) && arg0 < class61.field1108[var5] + class181.field3101[var5] && (arg0 + arg4) > class181.field3101[var5]) {
                class87.field1428[var5] = true;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILji;)V")
    public static final void method84(int arg0, class225 arg1) {
        if (arg0 != 18214) {
            method87((class61) null, 15);
        }
        field139++;
        while (true) {
            while (arg1.field3996 < arg1.field3995.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1580(-127) == 1) {
                    var3 = arg1.method1580(-122);
                    var4 = arg1.method1580(-9);
                    var2 = true;
                }
                int var5 = arg1.method1580(-20);
                int var6 = arg1.method1580(-97);
                int var7 = var5 * 64 - class54.field1009;
                int var8 = class76.field1319 + class161.field2728 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class189.field3327 > var7 + 63 && class161.field2728 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && (var3 * 8 + 8) > var11 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                                byte var13 = arg1.method1575(false);
                                if (var13 != 0) {
                                    if (class179.field3065[var9][var10] == null) {
                                        class179.field3065[var9][var10] = new byte[4096];
                                    }
                                    class179.field3065[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1575(false);
                                    if (class213.field3760[var9][var10] == null) {
                                        class213.field3760[var9][var10] = new byte[4096];
                                    }
                                    class213.field3760[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1575(false);
                        if (var16 != 0) {
                            arg1.field3996++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lng;BLng;)I")
    public static final int method85(class121 arg0, byte arg1, class121 arg2) {
        int var3 = -123 / ((arg1 - 71) / 52);
        field145++;
        int var4 = 0;
        if (arg0.method818(0, class200.field3574)) {
            var4++;
        }
        if (arg0.method818(0, class45.field804)) {
            var4++;
        }
        if (arg0.method818(0, class263.field4667)) {
            var4++;
        }
        if (arg2.method818(0, class200.field3574)) {
            var4++;
        }
        if (arg2.method818(0, class45.field804)) {
            var4++;
        }
        if (arg2.method818(0, class263.field4667)) {
            var4++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method86(int arg0) {
        field141 = null;
        field137 = null;
        field143 = null;
        if (arg0 > 59) {
            field133 = null;
            field149 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lkk;I)V")
    public static final void method87(class61 arg0, int arg1) {
        if (arg1 != -12934) {
            field137 = null;
        }
        class26.method193(arg1 + 12937, arg0, 200000);
        field135++;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
    public static final void method88(int arg0) {
        class262.field4634.method985(0);
        class54.field1005.method985(0);
        if (arg0 < 1) {
            field137 = null;
        }
        field156++;
    }
}
