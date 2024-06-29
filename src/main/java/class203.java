import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class203 {

    @OriginalMember(owner = "client!li", name = "b", descriptor = "Lha;")
    private static class46 field3633 = class271.method1828("Connecting to update server", -46);

    @OriginalMember(owner = "client!li", name = "d", descriptor = "Lha;")
    public static class46 field3635 = field3633;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field3637 = 99;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "Lha;")
    public static class46 field3632 = class271.method1828("Fertigkeit: ", -46);

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public static void method1436(int arg0) {
        field3633 = null;
        if (arg0 != 65535) {
            field3633 = null;
        }
        field3635 = null;
        field3632 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)V")
    public static final void method1437(int arg0, boolean arg1) {
        field3634++;
        if (arg1) {
            method1437(99, false);
        }
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class128.method996(65535);
        } else if (arg0 == 2) {
            class170.method1208(23513);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
    public static final void method1438(byte arg0) {
        if (arg0 != -111) {
            method1436(-76);
        }
        for (int var1 = 0; var1 < class111.field2082; var1++) {
            int var2 = class93.field1758[var1];
            class26 var3 = class2.field29[var2];
            int var4 = class147.field2651.method558(1);
            if ((var4 & 0x20) != 0) {
                int var5 = class147.field2651.method554((byte) 88);
                int var6 = class147.field2651.method595(-16950);
                var3.method1067(var5, var6, (byte) 126, class157.field2803);
            }
            if ((var4 & 0x10) != 0) {
                if (var3.field511.method626(-25157)) {
                    class174.method1250(var3, 1);
                }
                var3.field511 = class156.method1152(class147.field2651.method545((byte) -86), (byte) -114);
                var3.method1068(true, var3.field511.field1440);
                var3.field2553 = var3.field511.field1439;
                var3.field2561 = var3.field511.field1488;
                var3.field2541 = var3.field511.field1489;
                var3.field2531 = var3.field511.field1471;
                var3.field2550 = var3.field511.field1499;
                var3.field2559 = var3.field511.field1447;
                var3.field2568 = var3.field511.field1455;
                var3.field2529 = var3.field511.field1475;
                if (var3.field511.method626(-25157)) {
                    class66.method455((class236) null, (class81) null, arg0 + 111, class135.field2450, 0, var3, var3.field2523[0], var3.field2517[0]);
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field2565 = class147.field2651.method567((byte) 127);
                var3.field2560 = class147.field2651.method567((byte) 127);
            }
            if ((var4 & 0x4) != 0) {
                var3.field2543 = class147.field2651.method580(-94);
                int var7 = class147.field2651.method589((byte) 0);
                if (var3.field2543 == 65535) {
                    var3.field2543 = -1;
                }
                var3.field2581 = var7 >> 16;
                var3.field2544 = 0;
                var3.field2532 = (var7 & 0xFFFF) + class157.field2803;
                if (var3.field2532 > class157.field2803) {
                    var3.field2544 = -1;
                }
                var3.field2551 = 0;
                if (var3.field2543 != -1 && class157.field2803 == var3.field2532) {
                    int var8 = class138.method1054(-22225, var3.field2543).field4745;
                    if (var8 != -1) {
                        class170 var9 = class119.method951(arg0 + 111, var8);
                        if (var9 != null && var9.field3020 != null) {
                            class146.method1084(var3.field2546, var9, 85, var3.field2585, false, 0);
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field2567 = class147.field2651.method577(0);
                var3.field2564 = 100;
            }
            if ((var4 & 0x8) != 0) {
                var3.field2555 = class147.field2651.method567((byte) 127);
                if (var3.field2555 == 65535) {
                    var3.field2555 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var10 = class147.field2651.method580(-37);
                int var11 = class147.field2651.method595(-16950);
                if (var10 == 65535) {
                    var10 = -1;
                }
                class38.method256(var3, var10, (byte) 36, var11);
            }
            if ((var4 & 0x2) != 0) {
                int var12 = class147.field2651.method566(255);
                int var13 = class147.field2651.method554((byte) 88);
                var3.method1067(var12, var13, (byte) 127, class157.field2803);
                var3.field2515 = class157.field2803 + 300;
                var3.field2580 = class147.field2651.method554((byte) 88);
            }
        }
        field3639++;
    }
}
