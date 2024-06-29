import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class229 {

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "I")
    private int field3019;

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!jda", name = "f", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "I")
    public int field3023;

    @OriginalMember(owner = "client!jda", name = "i", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!jda", name = "j", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!jda", name = "k", descriptor = "I")
    public int field3027;

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "Ldp;")
    public class3 field3024;

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "Lnd;")
    public static class547 field3018;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)Lhb;")
    public final synchronized class728 method1455(int arg0) {
        field3020++;
        class728 var2 = (class728) this.field3024.field33.method3079((long) this.field3019, arg0);
        if (var2 != null) {
            return var2;
        }
        class728 var3 = class728.method4059(this.field3024.field24, this.field3019, arg0);
        if (var3 != null) {
            this.field3024.field33.method3077((byte) 118, (long) this.field3019, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)V")
    public static final void method1456(int arg0, int arg1) {
        field3022++;
        for (class168 var2 = class16.field323.method1156(arg1); var2 != null; var2 = class16.field323.method1158(22706)) {
            if ((var2.field2333 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method1175(-2);
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(BILsl;)V")
    private final void method1457(byte arg0, int arg1, class461 arg2) {
        field3025++;
        if (arg0 != 116) {
            this.field3023 = 63;
        }
        if (arg1 == 1) {
            this.field3019 = arg2.method2566(arg0 ^ 0xFFFFFF8A);
        } else if (arg1 == 2) {
            this.field3023 = arg2.method2600((byte) -127);
            this.field3027 = arg2.method2600((byte) -127);
            return;
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lsl;I)V")
    public final void method1458(class461 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2600((byte) -127);
            if (var3 == 0) {
                field3021++;
                int var4 = 77 % ((arg1 + 3) / 33);
                return;
            }
            this.method1457((byte) 116, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILha;I)Ljl;")
    public static final class274 method1459(int arg0, class60 arg1, int arg2) {
        field3026++;
        class270 var3 = class690.method3871((byte) -38, arg0, true, arg1);
        if (var3 == null) {
            return null;
        } else if (arg2 == -2) {
            return var3.field3402;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)V")
    public static void method1460(int arg0) {
        if (arg0 != 0) {
            field3018 = null;
        }
        field3018 = null;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)V")
    public static final void method1461(byte arg0) {
        field3017++;
        class732.field10185.method1029(16438);
        class206.field2728.method4097((byte) 125);
        class679.field9486.method1419((byte) -128);
        client.field3995.method3390(-124);
        class300.field3941.method3858(-3);
        class21.field381.method1579(80);
        class66.field941.method1300(3211);
        class234.field3057.method2093(-122);
        class33.field550.method3400(64);
        class115.field1703.method717((byte) -91);
        class729.field10151.method1209(126);
        class52.field741.method583(64);
        class424.field5399.method3082((byte) 103);
        class639.field8832.method1502(72);
        class513.field7206.method792(65280);
        if (arg0 >= -6) {
            return;
        }
        class507.field7153.method3925(71);
        class623.field8571.method4236(-126);
        class12.field150.method620(-124);
        class416.field5301.method16(-117);
        class305.field4004.method2664(true);
        class555.field7728.method956(-32307);
        class82.method684((byte) -114);
        class206.method1331((byte) -128);
        class3.method11(74);
        class635.method3556((byte) 123);
        class111.method885((byte) -29);
        class762.field10629.method3064(false);
        class138.field1980.method3064(false);
        class450.field5950.method3064(false);
        class736.field10231.method3064(false);
        class188.field2602.method3064(false);
    }
}
