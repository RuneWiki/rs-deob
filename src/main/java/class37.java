import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class37 extends class171 {

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "Lha;")
    private class46 field665 = class93.field1752;

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "I")
    public static int field662 = 0;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "I")
    public int field653;

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "I")
    private int field664;

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "Lwg;")
    public static class22 field663;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "Lge;")
    public class235 field647;

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "Lge;")
    private class235 field660;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "[Lrk;")
    public static class179[] field657;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(Lwe;I)V")
    public final void method244(class75 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method558(1);
            if (var3 == 0) {
                if (arg1 > -85) {
                    this.method250(95, (byte) 112);
                }
                field652++;
                return;
            }
            this.method254(arg0, var3, 0);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method245(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field658++;
        if (arg3 != 90) {
            field657 = null;
        }
        int var8 = 2048 - arg0 & 0x7FF;
        int var9 = 0;
        int var10 = 2048 - arg7 & 0x7FF;
        int var11 = 0;
        int var12 = arg5;
        if (var8 != 0) {
            int var13 = class62.field1042[var8];
            int var14 = class62.field1049[var8];
            var11 = -arg5 * var13 >> 16;
            var12 = arg5 * var14 >> 16;
        }
        if (var10 != 0) {
            int var15 = class62.field1049[var10];
            int var16 = class62.field1042[var10];
            var9 = var12 * var16 >> 16;
            var12 = var12 * var15 >> 16;
        }
        class134.field2425 = arg1 - var12;
        class57.field958 = arg0;
        class161.field2849 = arg6 - var9;
        class10.field178 = arg7;
        class26.field513 = arg2 - var11;
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)V")
    private final void method246(int arg0) {
        this.field660 = new class235(this.field647.method1596(arg0 ^ 0x4C4B));
        for (class124 var2 = (class124) this.field647.method1592(false); var2 != null; var2 = (class124) this.field647.method1591(106)) {
            class145 var3 = new class145(var2.field2289, (int) var2.field1195);
            this.field660.method1597(var2.field2289.method327(arg0 + 7380), (byte) -126, var3);
        }
        if (arg0 != -7473) {
            this.field660 = null;
        }
        field655++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lha;I)Z")
    public final boolean method247(class46 arg0, int arg1) {
        field649++;
        if (this.field647 == null) {
            return false;
        }
        if (this.field660 == null) {
            this.method246(-7473);
        }
        if (arg1 <= 53) {
            this.field660 = null;
        }
        for (class145 var3 = (class145) this.field660.method1601(81, arg0.method327(-80)); var3 != null; var3 = (class145) this.field660.method1593((byte) -23)) {
            if (var3.field2624.method340((byte) 88, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V")
    public static void method248(byte arg0) {
        field663 = null;
        field657 = null;
        if (arg0 >= -6) {
            method253(-120);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZ)Lha;")
    public final class46 method249(int arg0, boolean arg1) {
        field648++;
        if (!arg1) {
            return null;
        } else if (this.field647 == null) {
            return this.field665;
        } else {
            class124 var3 = (class124) this.field647.method1601(67, (long) arg0);
            return var3 == null ? this.field665 : var3.field2289;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)Z")
    public final boolean method250(int arg0, byte arg1) {
        if (arg1 <= 2) {
            return false;
        }
        field650++;
        if (this.field647 == null) {
            return false;
        }
        if (this.field660 == null) {
            this.method251(-6);
        }
        class176 var3 = (class176) this.field660.method1601(-88, (long) arg0);
        return var3 != null;
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "(I)V")
    private final void method251(int arg0) {
        field661++;
        this.field660 = new class235(this.field647.method1596(-20860));
        for (class176 var2 = (class176) this.field647.method1592(false); var2 != null; var2 = (class176) this.field647.method1591(103)) {
            class176 var3 = new class176((int) var2.field1195);
            this.field660.method1597((long) var2.field3166, (byte) -126, var3);
        }
        if (arg0 != -6) {
            method248((byte) 16);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(IB)I")
    public final int method252(int arg0, byte arg1) {
        field656++;
        if (this.field647 == null) {
            return this.field664;
        }
        class176 var3 = (class176) this.field647.method1601(-127, (long) arg0);
        if (var3 == null) {
            return this.field664;
        } else {
            int var4 = -36 / ((28 - arg1) / 49);
            return var3.field3166;
        }
    }

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "(I)[Lrk;")
    public static final class179[] method253(int arg0) {
        class179[] var1 = new class179[class246.field4365];
        if (arg0 != 13357) {
            return null;
        }
        field659++;
        for (int var2 = 0; var2 < class246.field4365; var2++) {
            var1[var2] = new class179(class222.field3911, class3.field45, class56.field939[var2], class215.field3816[var2], class219.field3858[var2], class118.field2209[var2], class273.field4765[var2], class107.field1980);
        }
        class242.method1661(29720);
        return var1;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lwe;II)V")
    private final void method254(class75 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field651 = arg0.method558(1);
        } else if (arg1 == 2) {
            this.field653 = arg0.method558(arg2 ^ 0x1);
        } else if (arg1 == 3) {
            this.field665 = arg0.method577(0);
        } else if (arg1 == 4) {
            this.field664 = arg0.method562((byte) -71);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method545((byte) 49);
            this.field647 = new class235(class127.method987(var4, 1868387312));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method562((byte) -71);
                class69 var7;
                if (arg1 == 5) {
                    var7 = new class124(arg0.method577(0));
                } else {
                    var7 = new class176(arg0.method562((byte) -71));
                }
                this.field647.method1597((long) var6, (byte) -126, var7);
            }
        }
        if (arg2 == 0) {
            field654++;
        }
    }
}
