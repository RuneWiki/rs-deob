import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public class class16 {

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "[I")
    private int[] field187;

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "[J")
    public static long[] field186 = new long[32];

    @OriginalMember(owner = "mapview!ha", name = "h", descriptor = "I")
    public static int field190 = 500;

    @OriginalMember(owner = "mapview!ha", name = "i", descriptor = "I")
    public static int field191 = -1;

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "Lt;")
    public static class35 field185 = class3.method28(false, "Scimitar Shop");

    @OriginalMember(owner = "mapview!ha", name = "k", descriptor = "Lt;")
    public static class35 field193 = class3.method28(false, "Silver Shop");

    @OriginalMember(owner = "mapview!ha", name = "f", descriptor = "Lt;")
    public static class35 field188 = class3.method28(false, "Magic Shop");

    @OriginalMember(owner = "mapview!ha", name = "j", descriptor = "I")
    public static int field192 = 0;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "mapview!ha", name = "g", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I)V", line = 5)
    public static void method97(int arg0) {
        field185 = null;
        if (arg0 != 1) {
            method97(45);
        }
        field188 = null;
        field186 = null;
        field193 = null;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(IB)I", line = 46)
    public final int method98(int arg0, byte arg1) {
        int var3 = this.field187.length - 2;
        if (arg1 > -43) {
            method99(-111);
        }
        int var4 = var3 & arg0 << 1;
        while (true) {
            int var5 = this.field187[var4];
            if (arg0 == var5) {
                return this.field187[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var4 + 2 & var3;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "(I)V", line = 73)
    public static final void method99(int arg0) {
        if (class19.field223[0][field183][class19.field220] == null) {
            class15.field179 = null;
        } else {
            class15.field179 = class19.field223[0][field183][class19.field220];
        }
        if (class19.field223[1][field183][class19.field220] == null) {
            class27.field305 = null;
        } else {
            class27.field305 = class19.field223[1][field183][class19.field220];
        }
        if (class19.field223[2][field183][class19.field220] == null) {
            class31.field382 = null;
        } else {
            class31.field382 = class19.field223[2][field183][class19.field220];
        }
        int var1 = -66 % ((arg0 - 63) / 34);
        if (class19.field223[3][field183][class19.field220] == null) {
            class13.field173 = null;
        } else {
            class13.field173 = class19.field223[3][field183][class19.field220];
        }
        if (class19.field223[4][field183][class19.field220] == null) {
            class36.field445 = null;
        } else {
            class36.field445 = class19.field223[4][field183][class19.field220];
        }
        if (class34.field422[field183][class19.field220] == null) {
            class7.field122 = null;
        } else {
            class7.field122 = class34.field422[field183][class19.field220];
        }
        if (class11.field155[field183][class19.field220] == null) {
            class27.field307 = null;
        } else {
            class27.field307 = class11.field155[field183][class19.field220];
        }
        if (mapview.field52[field183][class19.field220] == null) {
            class19.field215 = null;
        } else {
            class19.field215 = mapview.field52[field183][class19.field220];
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "<init>", descriptor = "([I)V", line = 136)
    public class16(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field187 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field187[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field187[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field187[var5 + var5] = arg0[var4];
            this.field187[var5 + var5 + 1] = var4++;
        }
    }
}
