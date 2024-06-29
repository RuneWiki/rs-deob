import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class414 {

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "[I")
    public static int[] field5507 = new int[1024];

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public int field5501;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public int field5503;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public int field5504;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public int field5506;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public int field5508;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public int field5509;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public int field5512;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "Z")
    public static boolean field5502;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "[B")
    public byte[] field5505;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "[B")
    public byte[] field5511;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
    public static void method2436(boolean arg0) {
        if (!arg0) {
            field5507 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZBIZI)V")
    public static final void method2437(boolean arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        field5510++;
        if (!arg0 && class53.field719 == arg2 && class415.field5529 == arg4 && class473.field6914 == class366.field4715 || class421.field5647.method648(-122, class520.field7690)) {
            return;
        }
        class53.field719 = arg2;
        class473.field6914 = class366.field4715;
        class415.field5529 = arg4;
        if (class421.field5647.method648(-100, class520.field7690)) {
            class473.field6914 = 0;
        }
        if (arg3) {
            class294.method1767(28, (byte) -52);
        } else {
            class294.method1767(25, (byte) -121);
        }
        class322.method1923(class43.field635, true, class331.field4251.method1127(class379.field4920, false), -115);
        int var5 = class35.field545;
        int var6 = -114 % ((arg1 - 27) / 48);
        class35.field545 = (class53.field719 - (class200.field2594 >> 4)) * 8;
        int var7 = class336.field4299;
        class336.field4299 = (class415.field5529 - (class118.field1647 >> 4)) * 8;
        class94.field1311 = class230.method1454(class53.field719 * 8, class415.field5529 * 8);
        class28.field475 = null;
        int var8 = class35.field545 - var5;
        int var9 = class336.field4299 - var7;
        if (arg3) {
            class16.field264 = 0;
            int var13 = class200.field2594 * 128 - 128;
            int var14 = (class118.field1647 - 1) * 128;
            for (int var15 = 0; var15 < 32768; var15++) {
                class295 var23 = class527.field7791[var15];
                if (var23 != null) {
                    var23.field6241 -= var9 * 128;
                    var23.field6239 -= var8 * 128;
                    if (var23.field6239 >= 0 && var23.field6239 <= var13 && var23.field6241 >= 0 && var23.field6241 <= var14) {
                        boolean var24 = true;
                        for (int var25 = 0; var25 < 10; var25++) {
                            var23.field5246[var25] -= var8;
                            var23.field5251[var25] -= var9;
                            if (var23.field5246[var25] < 0 || var23.field5246[var25] >= class200.field2594 || var23.field5251[var25] < 0 || class118.field1647 <= var23.field5251[var25]) {
                                var24 = false;
                            }
                        }
                        if (var24) {
                            field5507[class16.field264++] = var15;
                        } else {
                            class527.field7791[var15].method1776(null, (byte) 105);
                            class527.field7791[var15] = null;
                        }
                    } else {
                        class527.field7791[var15].method1776(null, (byte) 40);
                        class527.field7791[var15] = null;
                    }
                }
            }
        } else {
            for (int var10 = 0; var10 < 32768; var10++) {
                class295 var11 = class527.field7791[var10];
                if (var11 != null) {
                    for (int var12 = 0; var12 < 10; var12++) {
                        var11.field5246[var12] -= var8;
                        var11.field5251[var12] -= var9;
                    }
                    var11.field6239 -= var8 * 128;
                    var11.field6241 -= var9 * 128;
                }
            }
        }
        for (int var16 = 0; var16 < 2048; var16++) {
            class518 var21 = class76.field952[var16];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field5246[var22] -= var8;
                    var21.field5251[var22] -= var9;
                }
                var21.field6239 -= var8 * 128;
                var21.field6241 -= var9 * 128;
            }
        }
        class208[] var17 = class509.field7472;
        for (int var18 = 0; var18 < var17.length; var18++) {
            class208 var20 = var17[var18];
            if (var20 != null) {
                var20.field2696 -= var9 * 128;
                var20.field2699 -= var8 * 128;
            }
        }
        class77.method442(true, var8, var9);
        for (class354 var19 = (class354) class460.field6425.method49(-123); var19 != null; var19 = (class354) class460.field6425.method46((byte) 73)) {
            var19.field4538 -= var9;
            var19.field4546 -= var8;
            if (class377.field4896 != 3 && (var19.field4546 < 0 || var19.field4538 < 0 || var19.field4546 >= class200.field2594 || class118.field1647 <= var19.field4538)) {
                var19.method3021(118);
            }
        }
        if (class429.field5919 != 0) {
            class138.field1847 -= var9;
            class429.field5919 -= var8;
        }
        class472.method2834(-99);
        if (arg3) {
            class517.field7619 -= var9;
            class98.field1370 -= var9;
            class299.field3885 -= var8 * 128;
            class93.field1307 -= var8;
            class524.field7766 -= var8;
            class291.field3724 -= var9 * 128;
            if (Math.abs(var8) > class200.field2594 || Math.abs(var9) > class118.field1647) {
                class322.method1922((byte) -37);
            }
        } else if (class396.field5271 == 4) {
            class157.field2069 -= var8 * 128;
            class265.field3369 -= var9 * 128;
            class73.field926 -= var8 * 128;
            class293.field3801 -= var9 * 128;
        } else {
            class396.field5271 = 1;
        }
        class88.method555((byte) 78);
        class21.method148((byte) -109);
        class385.field5063.method47(0);
        class235.field3065.method47(0);
        client.field7513.method2128((byte) -127);
        class8.method53(false);
    }
}
