import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!i")
public class class17 {

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "[I")
    private int[] field164;

    @OriginalMember(owner = "mapview!i", name = "e", descriptor = "Lu;")
    public static class38 field167 = class28.method177("Furnace", (byte) -84);

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "Lu;")
    public static class38 field165 = class28.method177("Hunter Store", (byte) -84);

    @OriginalMember(owner = "mapview!i", name = "g", descriptor = "I")
    public static int field169 = 0;

    @OriginalMember(owner = "mapview!i", name = "d", descriptor = "Lu;")
    public static class38 field166 = class28.method177("Spice Shop", (byte) -84);

    @OriginalMember(owner = "mapview!i", name = "j", descriptor = "Lu;")
    public static class38 field172 = class28.method177("overlay2)3dat", (byte) -84);

    @OriginalMember(owner = "mapview!i", name = "k", descriptor = "Lu;")
    public static class38 field173 = class28.method177("Find", (byte) -84);

    @OriginalMember(owner = "mapview!i", name = "h", descriptor = "Lu;")
    public static class38 field170 = class28.method177("_", (byte) -84);

    @OriginalMember(owner = "mapview!i", name = "l", descriptor = "Lu;")
    public static class38 field174 = class28.method177("Dungeon", (byte) -84);

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "mapview!i", name = "f", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "mapview!i", name = "i", descriptor = "[I")
    public static int[] field171;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(B[BZ)Ljava/lang/Object;", line = 8)
    public static final Object method101(byte arg0, byte[] arg1, boolean arg2) {
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class36.field466) {
            try {
                class33 var3 = (class33) Class.forName("ta").getDeclaredConstructor().newInstance();
                var3.method197(arg1, false);
                return var3;
            } catch (Throwable var6) {
                class36.field466 = true;
            }
        }
        int var5 = 50 % ((arg0 - 74) / 33);
        return arg2 ? class32.method195(0, arg1) : arg1;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(B)V", line = 39)
    public static void method102(byte arg0) {
        field166 = null;
        field165 = null;
        field174 = null;
        field172 = null;
        field167 = null;
        field171 = null;
        int var1 = -87 / ((59 - arg0) / 59);
        field173 = null;
        field170 = null;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(I[Lu;)V", line = 64)
    public static final void method103(int arg0, class38[] arg1) {
        if (arg0 >= 18) {
            class20.method122(arg1.length, arg1, 0, 12024);
        }
    }

    @OriginalMember(owner = "mapview!i", name = "<init>", descriptor = "([I)V", line = 97)
    public class17(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field164 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field164[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field164[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field164[var5 + var5] = arg0[var4];
            this.field164[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(II)I", line = 136)
    public final int method104(int arg0, int arg1) {
        int var3 = 46 / ((54 - arg0) / 36);
        int var4 = (this.field164.length >> 1) - 1;
        int var5 = var4 & arg1;
        while (true) {
            int var6 = this.field164[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field164[var5 + var5] == arg1) {
                return var6;
            }
            var5 = var5 + 1 & var4;
        }
    }
}
