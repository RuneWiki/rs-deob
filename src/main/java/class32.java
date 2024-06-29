import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 implements class68 {

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "Lja;")
    private class63 field765 = new class63();

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    private int field773 = 0;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    private int field774 = 128;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "D")
    private double field771 = 1.0D;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    private int field770;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "Ltb;")
    private class130 field775;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "[Lq;")
    private class110[] field760;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Loa;")
    private static class98 field759 = class38.method349(255, "wave:");

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Loa;")
    public static class98 field761 = field759;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Loa;")
    public static class98 field757 = field759;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "Loa;")
    public static class98 field756 = class38.method349(255, "Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AN>");

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Ln;")
    public static class90 field751 = new class90(64);

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "J")
    public static long field776 = 0L;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "Loa;")
    public static class98 field778 = class38.method349(255, " )2> ");

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "[Loa;")
    public static class98[] field781 = new class98[500];

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "Loa;")
    public static class98 field777 = class38.method349(255, "::noclip");

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "Loa;")
    public static class98 field783 = class38.method349(255, "@or3@");

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "Ln;")
    public static class90 field779 = new class90(64);

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    public static int field784 = 127;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "Ltb;")
    public static class130 field780;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "Z")
    public static boolean field782;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(II)V")
    public final void method309(int arg0, int arg1) {
        field755++;
        if (arg1 != -2151) {
            field777 = null;
        }
        for (int var3 = 0; var3 < this.field760.length; var3++) {
            class110 var4 = this.field760[var3];
            if (var4 != null && var4.field2474 != 0 && var4.field2473) {
                var4.method903(arg0);
                var4.field2473 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ID)V")
    public final void method310(int arg0, double arg1) {
        field764++;
        this.field771 = arg1;
        if (arg0 == 24326) {
            this.method311(0);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public final void method311(int arg0) {
        for (int var2 = arg0; var2 < this.field760.length; var2++) {
            if (this.field760[var2] != null) {
                this.field760[var2].method902();
            }
        }
        field768++;
        this.field765 = new class63();
        this.field773 = this.field770;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([BIII)I")
    public static final int method312(byte[] arg0, int arg1, int arg2, int arg3) {
        field766++;
        int var4 = -1;
        if (arg2 != -5979) {
            method315(90, -25, null, 1);
        }
        for (int var5 = arg3; var5 < arg1; var5++) {
            var4 = var4 >>> 8 ^ class94.field2143[(arg0[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z")
    public final boolean method313(int arg0, int arg1) {
        field758++;
        if (arg0 != 5023) {
            this.field774 = -13;
        }
        return this.field760[arg1].field2470;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)I")
    public final int method314(int arg0, int arg1) {
        field762++;
        if (arg1 == -31720) {
            return this.field760[arg0] == null ? 0 : this.field760[arg0].field2475;
        } else {
            return -117;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILtb;I)Lid;")
    public static final class60 method315(int arg0, int arg1, class130 arg2, int arg3) {
        field767++;
        if (arg3 != 27037) {
            method317(-3);
        }
        return class106.method893((byte) -103, arg1, arg2, arg0) ? class145.method1162(true) : null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)Z")
    public final boolean method316(int arg0, byte arg1) {
        field763++;
        if (arg1 > -25) {
            this.method316(28, (byte) -100);
        }
        return this.field774 == 64;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
    public static void method317(int arg0) {
        field751 = null;
        field777 = null;
        field757 = null;
        field761 = null;
        field759 = null;
        field756 = null;
        field783 = null;
        field779 = null;
        if (arg0 == -1) {
            field778 = null;
            field780 = null;
            field781 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI)I")
    public static final int method318(int arg0, byte arg1, int arg2) {
        field772++;
        class139 var3 = (class139) class67.field1422.method17(-16, (long) arg2);
        if (var3 == null) {
            return 0;
        }
        int var4 = 34 % ((-arg1 - 17) / 33);
        if (arg0 == -1) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var3.field3395.length; var6++) {
            if (var3.field3389[var6] == arg0) {
                var5 += var3.field3395[var6];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(II)[I")
    public final int[] method319(int arg0, int arg1) {
        class110 var3 = this.field760[arg0];
        if (arg1 != 7059) {
            this.method313(31, -77);
        }
        field754++;
        if (var3 != null) {
            if (var3.field2476 != null) {
                this.field765.method514(var3, arg1 - 7059);
                var3.field2473 = true;
                return var3.field2476;
            }
            boolean var4 = var3.method901(this.field771, this.field774, this.field775);
            if (var4) {
                if (this.field773 == 0) {
                    class110 var5 = (class110) this.field765.method515((byte) 125);
                    var5.method902();
                } else {
                    this.field773--;
                }
                this.field765.method514(var3, 0);
                var3.field2473 = true;
                return var3.field2476;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Ltb;Ltb;IDI)V")
    public class32(class130 arg0, class130 arg1, int arg2, double arg3, int arg4) {
        this.field771 = arg3;
        this.field770 = arg2;
        this.field773 = this.field770;
        this.field774 = arg4;
        this.field775 = arg1;
        int[] var7 = arg0.method1061(0, 256);
        int var8 = var7.length;
        this.field760 = new class110[arg0.method1062(0, (byte) 59)];
        for (int var9 = 0; var9 < var8; var9++) {
            class8 var10 = new class8(arg0.method1058(0, -86, var7[var9]));
            this.field760[var7[var9]] = new class110(var10);
        }
    }
}
