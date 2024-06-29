import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class173 {

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Lf;")
    public static class36 field2725 = null;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2722 = "green:";

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field2727 = 0;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public int field2724;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public int field2729;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public int field2730;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Lqh;")
    public static class201 field2723;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLog;)V")
    public final void method1181(byte arg0, class221 arg1) {
        field2721++;
        if (arg0 <= 122) {
            field2725 = null;
        }
        while (true) {
            int var3 = arg1.method1517((byte) -96);
            if (var3 == 0) {
                return;
            }
            this.method1185(arg1, var3, (byte) 102);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method1182(int arg0) {
        field2725 = null;
        if (arg0 > 72) {
            field2722 = null;
            field2723 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public static final void method1183(int arg0) {
        field2728++;
        if (arg0 != -3876) {
            return;
        }
        int var1 = class167.field2655.field3341 + class48.field866;
        int var2 = class107.field1775 + class167.field2655.field3389;
        if ((class282.field4472 - var2) < -500 || class282.field4472 - var2 > 500 || class101.field1667 - var1 < -500 || class101.field1667 - var1 > 500) {
            class101.field1667 = var1;
            class282.field4472 = var2;
        }
        if (class101.field1667 != var1) {
            class101.field1667 += (var1 - class101.field1667) / 16;
        }
        if (class282.field4472 != var2) {
            class282.field4472 += (var2 - class282.field4472) / 16;
        }
        if (class235.field3836) {
            for (int var3 = 0; var3 < class225.field3732; var3++) {
                int var4 = class52.field911[var3];
                if (var4 == 98) {
                    class199.field3186 = class199.field3186 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class199.field3186 = class199.field3186 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class122.field1985 = class122.field1985 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class122.field1985 = class122.field1985 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class73.field1193[96]) {
                class84.field1325 += (-class84.field1325 - 24) / 2;
            } else if (class73.field1193[97]) {
                class84.field1325 += (24 - class84.field1325) / 2;
            } else {
                class84.field1325 /= 2;
            }
            if (class73.field1193[98]) {
                class86.field1373 += (12 - class86.field1373) / 2;
            } else if (class73.field1193[99]) {
                class86.field1373 += (-class86.field1373 - 12) / 2;
            } else {
                class86.field1373 /= 2;
            }
            class199.field3186 += class86.field1373 / 2;
            class122.field1985 += class84.field1325 / 2;
        }
        class96.method712((byte) 111);
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
    public static final void method1184(int arg0) {
        class75.field1214 = arg0;
        for (int var1 = 0; var1 < class241.field3894; var1++) {
            for (int var2 = 0; var2 < class129.field2084; var2++) {
                if (class288.field4563[arg0][var1][var2] == null) {
                    class288.field4563[arg0][var1][var2] = new class134(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Log;IB)V")
    private final void method1185(class221 arg0, int arg1, byte arg2) {
        if (arg2 != 102) {
            method1186(44, (byte) 51);
        }
        field2720++;
        if (arg1 == 1) {
            this.field2729 = arg0.method1521((byte) 113);
            this.field2724 = arg0.method1517((byte) -96);
            this.field2730 = arg0.method1517((byte) -96);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)V")
    public static final void method1186(int arg0, byte arg1) {
        class190.field3077 = 20;
        if (arg1 != 31) {
            field2725 = null;
        }
        class63.field1030 = arg0;
        class280.field4433 = 3;
        field2726++;
    }
}
