import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 extends class14 {

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "[J")
    private long[] field66 = new long[10];

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "Lv;")
    public static class122 field69 = class55.method425(-120, "m\u001c1chte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
    public static int field68 = 0;

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "Lv;")
    private static class122 field81 = class55.method425(-120, "Invalid username or password)3");

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "Lv;")
    public static class122 field63 = field81;

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "I")
    public static int field73 = 0;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "Lv;")
    public static class122 field91 = class55.method425(-110, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "Lv;")
    private static class122 field92 = class55.method425(-55, "Message");

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "Lv;")
    public static class122 field65 = field92;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "Lv;")
    public static class122 field86 = class55.method425(-114, "headicons_hint");

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "Lv;")
    public static class122 field89 = class55.method425(-81, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    private int field67;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "I")
    private int field78;

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "I")
    private int field87;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
    private int field88;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "J")
    private long field84;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "Lab;")
    public static class3 field64;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "Lab;")
    public static class3 field90;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "Ljc;")
    public static class57 field70;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "Lkb;")
    public static class62 field76;

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V", line = 273)
    public class2() {
        this.method54(true);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I[BII)Z", line = 33)
    public static final boolean method53(int arg0, byte[] arg1, int arg2, int arg3) {
        field79++;
        if (arg3 != -282) {
            return true;
        }
        boolean var4 = true;
        class64 var5 = new class64(arg1);
        int var6 = -1;
        label69: while (true) {
            int var7 = var5.method486(71);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class42 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method486(89);
                                        if (var17 == 0) {
                                            continue label69;
                                        }
                                        var5.method520(-124);
                                    }
                                    int var10 = var5.method486(119);
                                    if (var10 == 0) {
                                        continue label69;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 >> 6 & 0x3F;
                                    int var12 = var8 & 0x3F;
                                    var13 = var5.method520(arg3 + 176) >> 2;
                                    var14 = arg2 + var11;
                                    var15 = arg0 + var12;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class14.method124((byte) 52, var6);
                } while (var13 == 22 && class109.field2703 && var16.field1083 == 0 && !var16.field1091);
                var9 = true;
                if (!var16.method361(65535)) {
                    var4 = false;
                    class7.field174++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V", line = 118)
    public final void method54(boolean arg0) {
        field82++;
        if (!arg0) {
            method55(-40);
        }
        this.field88 = 0;
        this.field87 = 256;
        this.field67 = 1;
        this.field84 = System.currentTimeMillis();
        for (int var2 = 0; var2 < 10; var2++) {
            this.field66[var2] = this.field84;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V", line = 142)
    public static void method55(int arg0) {
        field76 = null;
        field86 = null;
        if (arg0 != -104) {
            method55(10);
        }
        field90 = null;
        field89 = null;
        field63 = null;
        field91 = null;
        field92 = null;
        field64 = null;
        field70 = null;
        field81 = null;
        field69 = null;
        field65 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)I", line = 170)
    public final int method56(int arg0, int arg1, int arg2) {
        field83++;
        int var4 = this.field67;
        this.field67 = 1;
        int var5 = this.field87;
        this.field87 = 300;
        if (arg0 != 4) {
            this.method57(103);
        }
        this.field84 = System.currentTimeMillis();
        if (this.field66[this.field78] == 0L) {
            this.field67 = var4;
            this.field87 = var5;
        } else if (this.field84 > this.field66[this.field78]) {
            this.field87 = (int) ((long) (arg1 * 2560) / (this.field84 - this.field66[this.field78]));
        }
        if (this.field87 < 25) {
            this.field87 = 25;
        }
        if (this.field87 > 256) {
            this.field87 = 256;
            this.field67 = (int) ((long) arg1 - (this.field84 - this.field66[this.field78]) / 10L);
        }
        if (arg1 < this.field67) {
            this.field67 = arg1;
        }
        this.field66[this.field78] = this.field84;
        this.field78 = (this.field78 + 1) % 10;
        if (this.field67 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field66[var6] != 0L) {
                    this.field66[var6] += this.field67;
                }
            }
        }
        if (arg2 > this.field67) {
            this.field67 = arg2;
        }
        int var7 = 0;
        class30.method282((byte) -44, (long) this.field67);
        while (this.field88 < 256) {
            this.field88 += this.field87;
            var7++;
        }
        this.field88 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 281)
    public final void method57(int arg0) {
        for (int var2 = arg0; var2 < 10; var2++) {
            this.field66[var2] = 0L;
        }
        field74++;
    }
}
