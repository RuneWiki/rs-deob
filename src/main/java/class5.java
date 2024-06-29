import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class5 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field65 = 0;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field64 = 0;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Ljava/lang/String;")
    public static String field75 = "Hidden";

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "J")
    public static volatile long field73 = 0L;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "J")
    public long field69;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Lma;")
    public class5 field68;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "Lma;")
    public class5 field81;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Lem;")
    public static class93 field66;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Z")
    public static boolean field80;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "[Lhk;")
    public static class42[] field79;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "[[B")
    public static byte[][] field67;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V", line = 4)
    public static final void method38(int arg0, int arg1, int arg2) {
        if (arg2 != 927531564) {
            field66 = (class93) null;
        }
        field76++;
        if (class218.field3333 != arg0) {
            class162.field2631 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class162.field2631[var3] = (var3 << 12) / arg0;
            }
            class275.field4276 = arg0 * 32;
            class218.field3333 = arg0;
            class54.field721 = arg0 - 1;
        }
        if (class109.field1648 == arg1) {
            return;
        }
        if (class218.field3333 == arg1) {
            class84.field1225 = class162.field2631;
        } else {
            class84.field1225 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class84.field1225[var4] = (var4 << 12) / arg1;
            }
        }
        class65.field941 = arg1 - 1;
        class109.field1648 = arg1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 50)
    public final void method39(int arg0) {
        field70++;
        if (this.field68 == null) {
            return;
        }
        this.field68.field81 = this.field81;
        this.field81.field68 = this.field68;
        this.field81 = null;
        if (arg0 != 10717) {
            this.field81 = (class5) null;
        }
        this.field68 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)Z", line = 69)
    public final boolean method40(byte arg0) {
        if (arg0 == 94) {
            field72++;
            return this.field68 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLjd;)V", line = 84)
    public static final void method41(boolean arg0, class95 arg1) {
        field79 = class112.method855(arg1, class67.field976, -122);
        field74++;
        class25.field278 = new int[256];
        int var2 = 0;
        if (!arg0) {
            return;
        }
        while (var2 < 3) {
            float var3 = (float) (class264.field4103[var2] >> 16 & 0xFF);
            int var4 = class264.field4103[var2 + 1] >> 16 & 0xFF;
            int var5 = class264.field4103[var2 + 1] >> 8 & 0xFF;
            float var6 = ((float) var4 - var3) / 64.0F;
            float var7 = (float) (class264.field4103[var2] & 0xFF);
            float var8 = (float) (class264.field4103[var2] >> 8 & 0xFF);
            float var9 = ((float) var5 - var8) / 64.0F;
            int var10 = class264.field4103[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var7) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class25.field278[var2 * 64 + var12] = class261.method1835((int) var7, class261.method1835((int) var3 << 16, (int) var8 << 8));
                var7 += var11;
                var3 += var6;
                var8 += var9;
            }
            var2++;
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class25.field278[var13] = class264.field4103[3];
        }
        class278.field4322 = new int[32768];
        class254.field3820 = new int[32768];
        class31.method232((byte) -86, (class42) null);
        class166.field2690 = new int[32768];
        class212.field3259 = new int[32768];
        class201.field3091 = new class195(128, 254);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V", line = 151)
    public static void method42(int arg0) {
        if (arg0 == 32) {
            field75 = null;
            field79 = null;
            field66 = null;
            field67 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V", line = 178)
    public static final void method43() {
        for (int var0 = 0; var0 < class31.field370; var0++) {
            class228 var1 = class192.field2994[var0];
            class81.method629(var1);
            class192.field2994[var0] = null;
        }
        class31.field370 = 0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(CI)C", line = 202)
    public static final char method44(char arg0, int arg1) {
        field77++;
        return (char) arg1 == arg0 || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V", line = 222)
    public static final void method45(int arg0) {
        class8.field128 = new class161[class223.field3398.method687((byte) 20)][];
        field71++;
        if (arg0 != 255) {
            field73 = 51L;
        }
        class95.field1361 = new boolean[class223.field3398.method687((byte) 20)];
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V", line = 235)
    public static final void method46(byte arg0) {
        field78++;
        try {
            if (class106.field1540 == 1) {
                int var1 = class216.field3310.method460((byte) -95);
                if (var1 > 0 && class216.field3310.method435(false)) {
                    int var2 = var1 - class77.field1135;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class216.field3310.method459(var2, -89);
                    return;
                }
                class216.field3310.method456(96);
                class216.field3310.method447(true);
                class170.field2755 = null;
                class152.field2307 = null;
                if (class268.field4171 == null) {
                    class106.field1540 = 0;
                } else {
                    class106.field1540 = 2;
                }
            }
            if (arg0 <= 80) {
                method43();
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class216.field3310.method456(123);
            class106.field1540 = 0;
            class170.field2755 = null;
            class152.field2307 = null;
            class268.field4171 = null;
        }
    }
}
