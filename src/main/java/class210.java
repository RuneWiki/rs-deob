import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public abstract class class210 extends class264 {

    @OriginalMember(owner = "client!po", name = "w", descriptor = "Z")
    public boolean field2956;

    @OriginalMember(owner = "client!po", name = "D", descriptor = "[Lpo;")
    public class210[] field2963;

    @OriginalMember(owner = "client!po", name = "G", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!po", name = "B", descriptor = "[C")
    public static char[] field2961;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!po", name = "t", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!po", name = "u", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!po", name = "v", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!po", name = "x", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!po", name = "y", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!po", name = "z", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!po", name = "A", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!po", name = "C", descriptor = "I")
    public int field2962;

    @OriginalMember(owner = "client!po", name = "E", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!po", name = "F", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!po", name = "H", descriptor = "Ldg;")
    public class230 field2967;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "Lj;")
    public class278 field2950;

    static {
        new class409((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
        field2966 = 0;
        field2961 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V", line = 4)
    public void method230(int arg0, int arg1, int arg2) {
        field2959++;
        int var4 = this.field2962 == arg2 ? arg1 : this.field2962;
        if (this.field2956) {
            this.field2950 = new class278(var4, arg1, arg0);
        } else {
            this.field2967 = new class230(var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IILat;)V", line = 25)
    public void method56(int arg0, int arg1, class256 arg2) {
        if (arg1 != -11941) {
            method1443(-88, 53, true);
        }
        field2964++;
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(I)I", line = 46)
    public int method1442(int arg0) {
        field2949++;
        if (arg0 != 8216) {
            this.method361(-93, (byte) -18);
        }
        return -1;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II)[[I", line = 59)
    public int[][] method58(int arg0, int arg1) {
        if (arg1 <= 94) {
            this.field2963 = null;
        }
        field2952++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIZ)I", line = 70)
    public static final int method1443(int arg0, int arg1, boolean arg2) {
        field2953++;
        if (!arg2) {
            method1445(41);
        }
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(III)[[I", line = 93)
    public final int[][] method1444(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            this.field2956 = true;
        }
        field2965++;
        if (this.field2963[arg1].field2956) {
            int[] var4 = this.field2963[arg1].method361(arg2, (byte) -38);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field2963[arg1].method58(arg2, arg0 ^ 0x68);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IB)[I", line = 126)
    public int[] method361(int arg0, byte arg1) {
        if (arg1 == -38) {
            field2954++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!po", name = "e", descriptor = "(I)V", line = 137)
    public void method363(int arg0) {
        if (arg0 == 0) {
            field2957++;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V", line = 148)
    public void method226(boolean arg0) {
        if (!arg0) {
            this.field2956 = false;
        }
        if (this.field2956) {
            this.field2950.method1885(true);
            this.field2950 = null;
        } else {
            this.field2967.method1571((byte) -125);
            this.field2967 = null;
        }
        field2958++;
    }

    @OriginalMember(owner = "client!po", name = "f", descriptor = "(I)V", line = 182)
    public static void method1445(int arg0) {
        if (arg0 != 338) {
            method1443(0, 22, false);
        }
        field2961 = null;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(B)I", line = 205)
    public int method227(byte arg0) {
        if (arg0 <= 53) {
            return -76;
        } else {
            field2951++;
            return -1;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIBI)V", line = 217)
    public static final void method1446(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field2960++;
        int var6 = class382.method2423(arg1, class146.field1978, 97, class248.field3659);
        int var7 = class382.method2423(arg0, class146.field1978, 82, class248.field3659);
        int var8 = class382.method2423(arg3, class63.field838, 88, class9.field128);
        int var9 = class382.method2423(arg5, class63.field838, 41, class9.field128);
        if (arg4 <= 20) {
            method1443(-14, -11, true);
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class381.method2419((byte) 105, arg2, var8, class323.field4774[var10], var9);
        }
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(III)[I", line = 253)
    public final int[] method1447(int arg0, int arg1, int arg2) {
        field2955++;
        if (arg1 > -111) {
            field2961 = null;
        }
        return this.field2963[arg2].field2956 ? this.field2963[arg2].method361(arg0, (byte) -38) : this.field2963[arg2].method58(arg0, 117)[0];
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(IZ)V", line = 273)
    public class210(int arg0, boolean arg1) {
        this.field2956 = arg1;
        this.field2963 = new class210[arg0];
    }
}
