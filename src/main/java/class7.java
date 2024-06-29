import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class7 extends class152 {

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "I")
    public static int field76 = 0;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "[B")
    public static byte[] field71 = new byte[32896];

    @OriginalMember(owner = "client!kh", name = "eb", descriptor = "J")
    public static long field81;

    @OriginalMember(owner = "client!kh", name = "fb", descriptor = "Lce;")
    private static class126 field82;

    @OriginalMember(owner = "client!kh", name = "jb", descriptor = "Lce;")
    private static class126 field86;

    @OriginalMember(owner = "client!kh", name = "ib", descriptor = "Lce;")
    public static class126 field85;

    @OriginalMember(owner = "client!kh", name = "gb", descriptor = "Lce;")
    public static class126 field83;

    @OriginalMember(owner = "client!kh", name = "lb", descriptor = "Lce;")
    public static class126 field88;

    @OriginalMember(owner = "client!kh", name = "hb", descriptor = "Lvc;")
    public static class129 field84;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
    private int field74;

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "I")
    private int field75;

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!kh", name = "db", descriptor = "I")
    private int field80;

    @OriginalMember(owner = "client!kh", name = "kb", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(II)[[I", line = 7)
    public final int[][] method26(int arg0, int arg1) {
        int[][] var3 = this.field2775.method319(76, arg1);
        if (arg0 != 0) {
            method41((byte[]) null, true);
        }
        if (this.field2775.field775) {
            int[] var4 = var3[2];
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            for (int var7 = 0; var7 < class244.field4133; var7++) {
                var5[var7] = this.field75;
                var6[var7] = this.field74;
                var4[var7] = this.field80;
            }
        }
        field68++;
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)[Lha;", line = 48)
    public static final class26[] method35(int arg0) {
        field70++;
        class26[] var1 = new class26[class185.field3205];
        for (int var2 = arg0; var2 < class185.field3205; var2++) {
            if (class56.field846) {
                var1[var2] = new class115(class307.field5187, class290.field4802, class27.field386[var2], class63.field1032[var2], class279.field4643[var2], class263.field4389[var2], class190.field3255[var2], class241.field4062);
            } else {
                var1[var2] = new class2(class307.field5187, class290.field4802, class27.field386[var2], class63.field1032[var2], class279.field4643[var2], class263.field4389[var2], class190.field3255[var2], class241.field4062);
            }
        }
        class197.method1395((byte) 127);
        return var1;
    }

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)V", line = 71)
    public static void method36(int arg0) {
        field88 = null;
        field82 = null;
        if (arg0 > -108) {
            method39(-106, 121, 93);
        }
        field83 = null;
        field86 = null;
        field84 = null;
        field85 = null;
        field71 = null;
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(B)I", line = 89)
    public static final int method37(byte arg0) {
        if (arg0 > -37) {
            field88 = (class126) null;
        }
        field79++;
        return 6;
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(II)V", line = 102)
    private final void method38(int arg0, int arg1) {
        field69++;
        if (arg1 == 132504324) {
            this.field80 = (arg0 & 0xFF) << 4;
            this.field75 = (arg0 & 0xFF0000) >> 12;
            this.field74 = (arg0 & 0xFF00) >> 4;
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(III)J", line = 116)
    public static final long method39(int arg0, int arg1, int arg2) {
        class5 var3 = class297.field4940[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field61; var4++) {
            class240 var5 = var3.field54[var4];
            if ((var5.field4045 >> 29 & 0x3L) == 2L && var5.field4041 == arg1 && var5.field4046 == arg2) {
                return var5.field4045;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(B)Z", line = 144)
    public static final boolean method40(byte arg0) {
        field72++;
        if (arg0 < 59) {
            method42((class88) null, (byte) -3, (class88) null, false, -4);
        }
        if (class206.field3538) {
            try {
                class187.field3235.method844(class161.field2907.field2705, (byte) -64);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILbb;)V", line = 164)
    public final void method5(int arg0, int arg1, class134 arg2) {
        if (arg0 != 8) {
            method42((class88) null, (byte) -97, (class88) null, true, 13);
        }
        field73++;
        if (arg1 == 0) {
            this.method38(arg2.method949(20732), 132504324);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "([BZ)[B", line = 192)
    public static final byte[] method41(byte[] arg0, boolean arg1) {
        field78++;
        int var2 = arg0.length;
        if (!arg1) {
            field84 = (class129) null;
        }
        byte[] var3 = new byte[var2];
        class230.method1562(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lem;BLem;ZI)I", line = 210)
    public static final int method42(class88 arg0, byte arg1, class88 arg2, boolean arg3, int arg4) {
        field77++;
        if (arg4 == 1) {
            int var5 = arg0.field479;
            int var6 = arg2.field479;
            if (!arg3) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return arg0.method618(7).field691.method865(48, arg2.method618(7).field691);
        } else if (arg4 == 3) {
            if (arg0.field1382.method872(field82, 0)) {
                if (arg2.field1382.method872(field82, 0)) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field1382.method872(field82, 0)) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field1382.method865(48, arg2.field1382);
            }
        } else if (arg4 == 4) {
            return arg0.method182(0) ? (arg2.method182(0) ? 0 : 1) : (arg2.method182(0) ? -1 : 0);
        } else {
            int var7 = -77 % ((arg1 - 44) / 63);
            if (arg4 == 5) {
                return arg0.method179(4) ? (arg2.method179(4) ? 0 : 1) : (arg2.method179(4) ? -1 : 0);
            } else if (arg4 == 6) {
                return arg0.method175((byte) -98) ? (arg2.method175((byte) -98) ? 0 : 1) : (arg2.method175((byte) -98) ? -1 : 0);
            } else if (arg4 == 7) {
                return arg0.method181(24497) ? (arg2.method181(24497) ? 0 : 1) : (arg2.method181(24497) ? -1 : 0);
            } else {
                return arg0.field1386 - arg2.field1386;
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field71[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field81 = 0L;
        field82 = class206.method1445(-7923, ")2");
        field86 = class206.method1445(-7923, "Loading)3)3)3");
        field85 = field86;
        field83 = class206.method1445(-7923, "(U5");
        field88 = class206.method1445(-7923, "details");
        field84 = new class129();
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V", line = 283)
    public class7() {
        this(0);
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(I)V", line = 311)
    private class7(int arg0) {
        super(0, false);
        this.method38(arg0, 132504324);
    }
}
