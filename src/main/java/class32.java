import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class32 {

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field466 = 0;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field473 = 127;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field472 = -1;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field475 = 500;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field477 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Lve;")
    public static class233 field469;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "[I")
    public static int[] field471;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method227(int arg0) {
        field471 = null;
        if (arg0 == 32) {
            field469 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IC)Z")
    public static final boolean method228(int arg0, char arg1) {
        field467++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        } else if (arg0 == -15077) {
            if (arg1 != '\u0000') {
                char[] var2 = class233.field3485;
                for (int var3 = 0; var3 < var2.length; var3++) {
                    char var4 = var2[var3];
                    if (arg1 == var4) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
    public static final void method229(int arg0) {
        field464++;
        while (class68.field1071.method519(88, class7.field140) >= 11) {
            int var1 = class68.field1071.method531((byte) 21, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class194.field2777[var1] == null) {
                class194.field2777[var1] = new class53();
                var2 = true;
                if (class275.field4412[var1] != null) {
                    class194.field2777[var1].method350(97, class275.field4412[var1]);
                }
            }
            class110.field1589[class193.field2770++] = var1;
            class53 var3 = class194.field2777[var1];
            var3.field85 = class82.field1267;
            int var4 = class68.field1071.method531((byte) -126, 1);
            int var5 = class203.field2944[class68.field1071.method531((byte) -128, 3)];
            if (var2) {
                var3.field127 = var3.field104 = var5;
            }
            int var6 = class68.field1071.method531((byte) 87, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class68.field1071.method531((byte) 4, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class68.field1071.method531((byte) -128, 1);
            if (var8 == 1) {
                class60.field909[class282.field4501++] = var1;
            }
            var3.method353(class55.field847.field50[0] + var7, var4 == 1, class55.field847.field119[0] + var6, -101);
        }
        if (arg0 != 500) {
            method228(96, (char) 65413);
        }
        class68.field1071.method532(1730730147);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public static final String method230(boolean arg0, int arg1) {
        field465++;
        if (!arg0) {
            method227(-90);
        }
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFF4318) >> 16) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static final void method231(byte arg0) {
        field476++;
        class176.field2505.method208((byte) 124);
        for (int var1 = 0; var1 < 32; var1++) {
            class260.field3927[var1] = 0L;
        }
        int var2 = -70 / ((-arg0 - 51) / 52);
        for (int var3 = 0; var3 < 32; var3++) {
            class43.field615[var3] = 0L;
        }
        class161.field2331 = 0;
    }
}
