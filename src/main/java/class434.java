import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class434 {

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    public int field6366 = -1;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "I")
    public int field6369 = -1;

    @OriginalMember(owner = "client!av", name = "g", descriptor = "Loe;")
    public static class127 field6368 = new class127(85, 1);

    @OriginalMember(owner = "client!av", name = "a", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!av", name = "j", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "[I")
    public int[] field6367;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
    public static void method2535(byte arg0) {
        field6368 = null;
        if (arg0 != -32) {
            field6362 = -39;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IZ)V")
    public static final void method2536(int arg0, boolean arg1) {
        field6370++;
        if (arg1 && class492.field7467 != null) {
            class427.field6240 = class492.field7467.field1272;
        } else {
            class427.field6240 = -1;
        }
        class177.field2772 = null;
        class492.field7467 = null;
        class460.field7088 = 0;
        class450.field6928 = null;
        class492.method2960();
        class492.field7477.method13(false);
        class226.field3471 = -1;
        class119.field1976 = null;
        class433.field6361 = null;
        class142.field2312 = null;
        class4.field33 = null;
        class410.field5951 = null;
        class222.field3426 = null;
        class291.field4413 = null;
        class492.field7474 = null;
        class403.field5863 = -1;
        class369.field5428 = null;
        class7.field87 = null;
        class492.field7472.method1841(121);
        class492.field7471.method1032(14379, 64, 64);
        class492.field7472.method1848(64, -35, 128);
        class492.field7464.method922(64, -111);
        if (arg0 != -20860) {
            field6368 = null;
        }
        class117.field1962.method1383(64, -337);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(BLia;)I")
    public static final int method2537(byte arg0, class399 arg1) {
        if (arg0 != 0) {
            return 26;
        }
        field6371++;
        int var2 = arg1.method2364(2, true);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method2364(5, true);
        } else if (var2 == 2) {
            var3 = arg1.method2364(8, true);
        } else {
            var3 = arg1.method2364(11, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lha;B)V")
    public final void method2538(class40 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method257((byte) 80);
            if (var3 == 0) {
                int var4 = 25 % ((arg1 - 46) / 45);
                field6364++;
                return;
            }
            this.method2539(var3, (byte) -61, arg0);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IBLha;)V")
    private final void method2539(int arg0, byte arg1, class40 arg2) {
        if (arg0 == 1) {
            this.field6369 = arg2.method254((byte) -53);
        } else if (arg0 == 2) {
            this.field6367 = new int[arg2.method257((byte) 48)];
            for (int var4 = 0; var4 < this.field6367.length; var4++) {
                this.field6367[var4] = arg2.method254((byte) -106);
            }
        } else if (arg0 == 3) {
            this.field6366 = arg2.method257((byte) 77);
        }
        int var5 = 112 / ((19 - arg1) / 32);
        field6363++;
    }
}
