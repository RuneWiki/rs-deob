import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class25 extends class75 {

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    private int field633 = 0;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    private int field638 = 128;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    private int field634 = 0;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    public int field643 = -1;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
    private int field648 = 128;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    private int field644 = 0;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "J")
    public static volatile long field630 = 0L;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "Lod;")
    public static class101 field641 = class46.method335(98, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "[I")
    public static int[] field651 = new int[256];

    @OriginalMember(owner = "client!dc", name = "fb", descriptor = "Lod;")
    public static class101 field654;

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "Lcb;")
    public static class17 field652;

    @OriginalMember(owner = "client!dc", name = "ib", descriptor = "Lod;")
    public static class101 field657;

    @OriginalMember(owner = "client!dc", name = "jb", descriptor = "[[B")
    public static byte[][] field658;

    @OriginalMember(owner = "client!dc", name = "hb", descriptor = "Lod;")
    public static class101 field656;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    private int field639;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    public int field642;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!dc", name = "gb", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!dc", name = "eb", descriptor = "Lc;")
    public static class15 field653;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "[S")
    private short[] field635;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "[S")
    private short[] field645;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "[S")
    private short[] field646;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "[S")
    private short[] field650;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V")
    public static final void method198(int arg0) {
        field647++;
        if (class10.field152 && class95.field2040 != class112.field2414) {
            class111.method821(class146.field3339, (byte) -117, class95.field2040, class82.field1778.field1271[0], class53.field1213, class82.field1778.field1291[0]);
        } else if (arg0 == -32013 && class95.field2040 != class142.field3275) {
            class142.field3275 = class95.field2040;
            class127.method983(class95.field2040, -104);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)Lqb;")
    public final class113 method199(byte arg0, int arg1) {
        field631++;
        class113 var3 = (class113) class153.field3496.method140(true, (long) this.field642);
        if (var3 == null) {
            class110 var4 = class110.method808(class152.field3467, this.field639, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field645 != null) {
                for (int var5 = 0; var5 < this.field645.length; var5++) {
                    var4.method796(this.field645[var5], this.field635[var5]);
                }
            }
            if (this.field646 != null) {
                for (int var6 = 0; var6 < this.field646.length; var6++) {
                    var4.method802(this.field646[var6], this.field650[var6]);
                }
            }
            var3 = var4.method807(this.field633 + 64, this.field644 + 850, -30, -50, -30);
            class153.field3496.method141(var3, (long) this.field642, (byte) -122);
        }
        class113 var7;
        if (this.field643 == -1 || arg1 == -1) {
            var7 = var3.method838(true);
        } else {
            var7 = class8.method39(this.field643, (byte) -116).method660(arg1, var3, -2061591408);
        }
        if (this.field648 != 128 || this.field638 != 128) {
            var7.method844(this.field648, this.field638, this.field648);
        }
        if (this.field634 != 0) {
            if (this.field634 == 90) {
                var7.method842();
            }
            if (this.field634 == 180) {
                var7.method842();
                var7.method842();
            }
            if (this.field634 == 270) {
                var7.method842();
                var7.method842();
                var7.method842();
            }
        }
        return arg0 <= 63 ? null : var7;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ltf;B)V")
    public final void method200(class138 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1055(119);
            if (var3 == 0) {
                if (arg1 != 126) {
                    method204(false);
                }
                field640++;
                return;
            }
            this.method202(var3, 127, arg0);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
    public static final void method201(int arg0, int arg1) {
        if (arg0 != 5953) {
            field653 = null;
        }
        field629++;
        class90.field1956 = arg1;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILtf;)V")
    private final void method202(int arg0, int arg1, class138 arg2) {
        field637++;
        int var4 = -64 / ((50 - arg1) / 60);
        if (arg0 == 1) {
            this.field639 = arg2.method1098(true);
        } else if (arg0 == 2) {
            this.field643 = arg2.method1098(true);
        } else if (arg0 == 4) {
            this.field648 = arg2.method1098(true);
        } else if (arg0 == 5) {
            this.field638 = arg2.method1098(true);
        } else if (arg0 == 6) {
            this.field634 = arg2.method1098(true);
        } else if (arg0 == 7) {
            this.field633 = arg2.method1055(112);
        } else if (arg0 == 8) {
            this.field644 = arg2.method1055(113);
        } else if (arg0 == 40) {
            int var7 = arg2.method1055(127);
            this.field635 = new short[var7];
            this.field645 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field645[var8] = (short) arg2.method1098(true);
                this.field635[var8] = (short) arg2.method1098(true);
            }
        } else if (arg0 == 41) {
            int var5 = arg2.method1055(119);
            this.field650 = new short[var5];
            this.field646 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field646[var6] = (short) arg2.method1098(true);
                this.field650[var6] = (short) arg2.method1098(true);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
    public static final void method203(byte arg0) {
        field632++;
        Object var1 = class90.field1955;
        synchronized (class90.field1955) {
            if (arg0 >= -19) {
                method201(99, 93);
            }
            if (class35.field898 == 0) {
                class129.field2954.method1170(5, 20919, new class79());
            }
            class35.field898 = 600;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
    public static void method204(boolean arg0) {
        if (!arg0) {
            field630 = 55L;
        }
        field641 = null;
        field653 = null;
        field652 = null;
        field658 = null;
        field651 = null;
        field654 = null;
        field656 = null;
        field657 = null;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)V")
    public static final void method205(boolean arg0) {
        if (class28.field753[96]) {
            class31.field794 += (-class31.field794 - 24) / 2;
        } else if (class28.field753[97]) {
            class31.field794 += (24 - class31.field794) / 2;
        } else {
            class31.field794 /= 2;
        }
        field649++;
        int var1 = class15.field317 + class82.field1778.field1341;
        int var2 = class57.field1314 + class82.field1778.field1298;
        class97.field2100 = class31.field794 / 2 + class97.field2100 & 0x7FF;
        if (class28.field753[98]) {
            class147.field3359 += (12 - class147.field3359) / 2;
        } else if (class28.field753[99]) {
            class147.field3359 += (-class147.field3359 - 12) / 2;
        } else {
            class147.field3359 /= 2;
        }
        if (class97.field2108 - var1 < -500 || class97.field2108 - var1 > 500 || class101.field2189 - var2 < -500 || class101.field2189 - var2 > 500) {
            class101.field2189 = var2;
            class97.field2108 = var1;
        }
        if (class97.field2108 != var1) {
            class97.field2108 += (var1 - class97.field2108) / 16;
        }
        if (class101.field2189 != var2) {
            class101.field2189 += (var2 - class101.field2189) / 16;
        }
        int var3 = class97.field2108 >> 7;
        class54.field1226 += class147.field3359 / 2;
        int var4 = 0;
        int var5 = class101.field2189 >> 7;
        if (class54.field1226 < 128) {
            class54.field1226 = 128;
        }
        if (class54.field1226 > 383) {
            class54.field1226 = 383;
        }
        if (arg0) {
            field630 = 106L;
        }
        int var6 = class65.method449(class101.field2189, class97.field2108, class95.field2040, true);
        if (var3 > 3 && var5 > 3 && var3 < 100 && var5 < 100) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var5 - 4; var8 <= var5 + 4; var8++) {
                    int var9 = class95.field2040;
                    if (var9 < 3 && (class86.field1905[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class20.field431[var9][var7][var8];
                    if (var4 < var10) {
                        var4 = var10;
                    }
                }
            }
        }
        int var11 = var4 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (var11 > class126.field2847) {
            class126.field2847 += (var11 - class126.field2847) / 24;
        } else if (var11 < class126.field2847) {
            class126.field2847 += (var11 - class126.field2847) / 80;
            return;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field651[var0] = var1;
        }
        field654 = class46.method335(117, "headicons_hint");
        field652 = new class17(64);
        field657 = class46.method335(-107, "und loggen sich dann erneut ein)3");
        field658 = new byte[50][];
        field656 = class46.method335(-83, "nav");
    }
}
