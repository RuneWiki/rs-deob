import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class25 extends class94 {

    @OriginalMember(owner = "client!dc", name = "ub", descriptor = "Loa;")
    public static class98 field601 = class38.method349(255, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!dc", name = "Cb", descriptor = "Loa;")
    private static class98 field609 = class38.method349(255, "Please reload this page)3");

    @OriginalMember(owner = "client!dc", name = "Db", descriptor = "I")
    public static int field610 = 0;

    @OriginalMember(owner = "client!dc", name = "Eb", descriptor = "I")
    public static int field611 = 0;

    @OriginalMember(owner = "client!dc", name = "Fb", descriptor = "[I")
    public static int[] field612 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!dc", name = "Bb", descriptor = "[I")
    public static int[] field608 = new int[500];

    @OriginalMember(owner = "client!dc", name = "zb", descriptor = "Loa;")
    public static class98 field606 = field609;

    @OriginalMember(owner = "client!dc", name = "vb", descriptor = "Loa;")
    public static class98 field602 = class38.method349(255, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!dc", name = "Ib", descriptor = "Loa;")
    private static class98 field615 = class38.method349(255, "Click to switch");

    @OriginalMember(owner = "client!dc", name = "yb", descriptor = "[Loa;")
    public static class98[] field605 = new class98[20];

    @OriginalMember(owner = "client!dc", name = "Jb", descriptor = "[[[I")
    public static int[][][] field616 = new int[4][105][105];

    @OriginalMember(owner = "client!dc", name = "sb", descriptor = "Loa;")
    public static class98 field599 = class38.method349(255, "::errortest");

    @OriginalMember(owner = "client!dc", name = "Kb", descriptor = "Loa;")
    private static class98 field617 = class38.method349(255, "Members only world");

    @OriginalMember(owner = "client!dc", name = "Nb", descriptor = "Loa;")
    public static class98 field620 = class38.method349(255, "Die Verbindung konnte");

    @OriginalMember(owner = "client!dc", name = "Ab", descriptor = "Loa;")
    public static class98 field607 = field617;

    @OriginalMember(owner = "client!dc", name = "rb", descriptor = "Loa;")
    public static class98 field598 = field615;

    @OriginalMember(owner = "client!dc", name = "Ob", descriptor = "Loa;")
    private static class98 field621 = class38.method349(255, "Unable to find ");

    @OriginalMember(owner = "client!dc", name = "Hb", descriptor = "Loa;")
    public static class98 field614 = field621;

    @OriginalMember(owner = "client!dc", name = "tb", descriptor = "I")
    public int field600;

    @OriginalMember(owner = "client!dc", name = "wb", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!dc", name = "xb", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!dc", name = "Gb", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!dc", name = "Lb", descriptor = "I")
    public int field618;

    @OriginalMember(owner = "client!dc", name = "Mb", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILd;[BIZ[Lwc;)V")
    public static final void method272(int arg0, class22 arg1, byte[] arg2, int arg3, boolean arg4, class149[] arg5) {
        field619++;
        class8 var6 = new class8(arg2);
        int var7 = -1;
        if (!arg4) {
            return;
        }
        while (true) {
            int var8 = var6.method103(-23734);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method103(-23734);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var9 >> 6 & 0x3F;
                int var14 = var6.method62((byte) 88);
                int var15 = var14 >> 2;
                int var16 = arg3 + var13;
                int var17 = var14 & 0x3;
                int var18 = var11 + arg0;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    int var19 = var12;
                    if ((class80.field1771[1][var16][var18] & 0x2) == 2) {
                        var19 = var12 - 1;
                    }
                    class149 var20 = null;
                    if (var19 >= 0) {
                        var20 = arg5[var19];
                    }
                    class127.method1002(var18, var20, var17, var15, var12, var16, var7, (byte) -25, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(B)Lt;")
    public final class128 method273(byte arg0) {
        field613++;
        if (arg0 <= 104) {
            method272(22, null, null, -15, false, null);
        }
        return class15.method152(30, this.field600).method607(this.field618, -20567);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)V")
    public static final void method274(int arg0, byte arg1) {
        class71.field1483 = 1;
        class139.field3400 = -1;
        if (arg1 <= 105) {
            return;
        }
        field603++;
        class3.field36 = false;
        client.field513 = -1;
        client.field510 = arg0;
        class55.field1213 = null;
        class71.field1481 = 0;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
    public static void method275(int arg0) {
        field601 = null;
        field602 = null;
        int var1 = -111 % ((arg0 - 47) / 60);
        field608 = null;
        field615 = null;
        field621 = null;
        field617 = null;
        field605 = null;
        field599 = null;
        field609 = null;
        field598 = null;
        field606 = null;
        field612 = null;
        field620 = null;
        field607 = null;
        field616 = null;
        field614 = null;
    }
}
