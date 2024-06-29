import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class112 extends class52 {

    @OriginalMember(owner = "client!me", name = "ob", descriptor = "I")
    private int field2510;

    @OriginalMember(owner = "client!me", name = "nb", descriptor = "I")
    private int field2509;

    @OriginalMember(owner = "client!me", name = "ib", descriptor = "I")
    private int field2504;

    @OriginalMember(owner = "client!me", name = "db", descriptor = "I")
    private int field2499;

    @OriginalMember(owner = "client!me", name = "mb", descriptor = "I")
    private int field2508;

    @OriginalMember(owner = "client!me", name = "pb", descriptor = "I")
    private int field2511;

    @OriginalMember(owner = "client!me", name = "qb", descriptor = "Lpf;")
    private class140 field2512;

    @OriginalMember(owner = "client!me", name = "ab", descriptor = "I")
    private int field2496;

    @OriginalMember(owner = "client!me", name = "hb", descriptor = "I")
    private int field2503;

    @OriginalMember(owner = "client!me", name = "gb", descriptor = "Lea;")
    public static class38 field2502 = class9.method46((byte) 122, "b12_full");

    @OriginalMember(owner = "client!me", name = "kb", descriptor = "Lea;")
    private static class38 field2506 = class9.method46((byte) 126, "Loaded update list");

    @OriginalMember(owner = "client!me", name = "cb", descriptor = "Lea;")
    public static class38 field2498 = class9.method46((byte) 104, "Cabbage");

    @OriginalMember(owner = "client!me", name = "eb", descriptor = "Lea;")
    public static class38 field2500 = class9.method46((byte) 117, "null");

    @OriginalMember(owner = "client!me", name = "rb", descriptor = "Lea;")
    public static class38 field2513 = field2506;

    @OriginalMember(owner = "client!me", name = "jb", descriptor = "Lea;")
    public static class38 field2505 = class9.method46((byte) 103, "Die Verbindung konnte");

    @OriginalMember(owner = "client!me", name = "bb", descriptor = "Lrc;")
    public static class155 field2497 = new class155(64);

    @OriginalMember(owner = "client!me", name = "fb", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!me", name = "lb", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZZIBZ)Lob;")
    public static final class127 method889(boolean arg0, boolean arg1, int arg2, byte arg3, boolean arg4) {
        field2507++;
        class161 var5 = null;
        if (class141.field2953 != null) {
            var5 = new class161(arg2, class141.field2953, class19.field439[arg2], 1000000);
        }
        return arg3 < 7 ? null : new class127(var5, class25.field514, arg2, arg4, arg0, arg1);
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(Z)Lrg;")
    public final class159 method220(boolean arg0) {
        if (this.field2512 != null) {
            int var2 = class45.field1098 - this.field2503;
            if (var2 > 100 && this.field2512.field2935 > 0) {
                var2 = 100;
            }
            label51: {
                do {
                    do {
                        if (var2 <= this.field2512.field2938[this.field2496]) {
                            break label51;
                        }
                        var2 -= this.field2512.field2938[this.field2496];
                        this.field2496++;
                    } while (this.field2512.field2919.length > this.field2496);
                    this.field2496 -= this.field2512.field2935;
                } while (this.field2496 >= 0 && this.field2496 < this.field2512.field2919.length);
                this.field2512 = null;
            }
            this.field2503 = class45.field1098 - var2;
        }
        class106 var3 = class70.method553(this.field2499, 28067);
        if (var3.field2364 != null) {
            var3 = var3.method856((byte) 96);
        }
        field2501++;
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field2508 == 1 || this.field2508 == 3) {
            var5 = var3.field2393;
            var4 = var3.field2405;
        } else {
            var4 = var3.field2393;
            var5 = var3.field2405;
        }
        int var6 = (var4 >> 1) + this.field2509;
        int var7 = (var4 + 1 >> 1) + this.field2509;
        int var8 = (var5 + 1 >> 1) + this.field2504;
        int var9 = (var5 >> 1) + this.field2504;
        int[][] var10 = class154.field3209[this.field2511];
        if (arg0) {
            int var11 = var10[var6][var9] + var10[var7][var8] + var10[var7][var9] + var10[var6][var8] >> 2;
            int var12 = (this.field2509 << 7) + (var4 << 6);
            int var13 = (this.field2504 << 7) + (var5 << 6);
            return var3.method857(var13, var12, this.field2510, this.field2496, var10, var11, 52, this.field2512, this.field2508);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!me", name = "i", descriptor = "(I)V")
    public static void method890(int arg0) {
        field2513 = null;
        if (arg0 != -1159911866) {
            field2498 = null;
        }
        field2505 = null;
        field2506 = null;
        field2500 = null;
        field2497 = null;
        field2498 = null;
        field2502 = null;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIIIIIIZLff;)V")
    public class112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class52 arg8) {
        this.field2510 = arg1;
        this.field2509 = arg4;
        this.field2504 = arg5;
        this.field2499 = arg0;
        this.field2508 = arg2;
        this.field2511 = arg3;
        if (arg6 != -1) {
            this.field2512 = class139.method997(-116, arg6);
            this.field2496 = 0;
            this.field2503 = class45.field1098 - 1;
            if (this.field2512.field2918 == 0 && arg8 != null && arg8 instanceof class112) {
                class112 var10 = (class112) arg8;
                if (this.field2512 == var10.field2512) {
                    this.field2496 = var10.field2496;
                    this.field2503 = var10.field2503;
                    return;
                }
            }
            if (arg7 && this.field2512.field2935 != -1) {
                this.field2496 = (int) ((double) this.field2512.field2919.length * Math.random());
                this.field2503 -= (int) ((double) this.field2512.field2938[this.field2496] * Math.random());
                return;
            }
        }
    }
}
