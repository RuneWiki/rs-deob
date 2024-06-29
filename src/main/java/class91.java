import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class91 {

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "[F")
    public static float[] field1509 = new float[4];

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "Lko;")
    public static class348 field1503 = new class348();

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "Llh;")
    public static class364 field1511 = new class364(4);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIBI)V")
    public static final void method737(int arg0, int arg1, byte arg2, int arg3) {
        field1504++;
        if (class36.field545 == null) {
            return;
        }
        long var4 = (long) (arg0 | arg3 << 14 | arg1 << 28);
        class63 var6 = (class63) class73.field1218.method2485(99, var4);
        int var7 = 98 % ((arg2 + 9) / 40);
        if (var6 == null) {
            class29.method240(arg1, arg0, arg3);
            return;
        }
        class394 var8 = (class394) var6.field1120.method2257((byte) 112);
        if (var8 == null) {
            class29.method240(arg1, arg0, arg3);
            return;
        }
        class374 var9 = (class374) class29.method240(arg1, arg0, arg3);
        if (var9 == null) {
            var9 = new class374();
        } else {
            var9.field5599 = var9.field5595 = -1;
        }
        var9.field5593 = var8.field5819;
        var9.field5589 = var8.field5818;
        label44: while (true) {
            class394 var10 = (class394) var6.field1120.method2256(-101);
            if (var10 == null) {
                break;
            }
            if (var9.field5593 != var10.field5819) {
                var9.field5599 = var10.field5819;
                var9.field5592 = var10.field5818;
                while (true) {
                    class394 var11 = (class394) var6.field1120.method2256(53);
                    if (var11 == null) {
                        break label44;
                    }
                    if (var9.field5593 != var11.field5819 && var9.field5599 != var11.field5819) {
                        var9.field5595 = var11.field5819;
                        var9.field5597 = var11.field5818;
                    }
                }
            }
        }
        int var12 = class259.method1646((arg3 << 7) + 64, (arg0 << 7) + 64, 851701031, arg1);
        class297.method1830(arg1, arg0, arg3, var12, var9);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZI)Z")
    public static final boolean method738(boolean arg0, int arg1) {
        if (arg0) {
            method740((byte) -94);
        }
        field1505++;
        if (class210.field3022[arg1]) {
            return true;
        } else if (class335.field5139.method673(-1, arg1)) {
            int var2 = class335.field5139.method656((byte) 122, arg1);
            if (var2 == 0) {
                class210.field3022[arg1] = true;
                return true;
            }
            if (class416.field6157[arg1] == null) {
                class416.field6157[arg1] = new class58[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class416.field6157[arg1][var3] == null) {
                    byte[] var4 = class335.field5139.method683(arg1, var3, 5);
                    if (var4 != null) {
                        class58 var5 = class416.field6157[arg1][var3] = new class58();
                        var5.field955 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method420((byte) -78, new class303(var4));
                    }
                }
            }
            class210.field3022[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lir;B)I")
    public static final int method739(class22 arg0, byte arg1) {
        field1506++;
        if (arg1 != -82) {
            method744(true, true, -108);
        }
        if (arg0.field385 == 0) {
            return 0;
        }
        if (arg0.field355 != -1) {
            class22 var2 = null;
            if (arg0.field355 < 32768) {
                var2 = class132.field2030[arg0.field355];
            } else if (arg0.field355 >= 32768) {
                var2 = class390.field5783[arg0.field355 - 32768];
            }
            if (var2 != null) {
                int var3 = arg0.field5529 - var2.field5529;
                int var4 = arg0.field5539 - var2.field5539;
                if (var3 != 0 || var4 != 0) {
                    arg0.method187((int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF, 0);
                }
            }
        }
        if (arg0 instanceof class62) {
            class62 var5 = (class62) arg0;
            if (var5.field1084 != -1 && (var5.field412 == 0 || var5.field408 > 0)) {
                var5.method187(var5.field1084, 0);
                var5.field1084 = -1;
            }
        } else if (arg0 instanceof class13) {
            class13 var6 = (class13) arg0;
            if (var6.field232 != -1 && (var6.field412 == 0 || var6.field408 > 0)) {
                int var7 = var6.field5529 - (var6.field232 - class483.field7082 - class483.field7082) * 64;
                int var8 = var6.field5539 - ((var6.field229 - class465.field6840 - class465.field6840) * 64);
                if (var7 != 0 || var8 != 0) {
                    var6.method187((int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF, 0);
                }
                var6.field232 = -1;
            }
        }
        return arg0.method191(56);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
    public static final void method740(byte arg0) {
        field1508++;
        if (arg0 >= -28) {
            field1509 = null;
        }
        class434 var1 = class483.method2888(0, 118, 15);
        var1.method2628(15);
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)V")
    public static void method741(byte arg0) {
        int var1 = -105 % ((58 - arg0) / 54);
        field1503 = null;
        field1511 = null;
        field1509 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BII)Z")
    public static final boolean method742(byte arg0, int arg1, int arg2) {
        if (arg0 > -76) {
            field1511 = null;
        }
        field1510++;
        return (arg1 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIB)I")
    public static final int method743(int arg0, int arg1, int arg2, byte arg3) {
        field1507++;
        if ((class364.field5475[arg0][arg1][arg2] & 0x8) != 0) {
            return 0;
        } else if (arg0 <= 0 || (class364.field5475[1][arg1][arg2] & 0x2) == 0) {
            int var4 = -68 / ((-arg3 - 14) / 38);
            return arg0;
        } else {
            return arg0 - 1;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZZI)V")
    public static final void method744(boolean arg0, boolean arg1, int arg2) {
        if (arg2 > -36) {
            field1503 = null;
        }
        field1501++;
        if (arg1) {
            class146.field2155++;
            class64.method567(127);
        }
        if (arg0) {
            class451.field6588++;
            class273.method1745(256);
        }
    }
}
