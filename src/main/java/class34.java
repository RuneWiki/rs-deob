import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class34 {

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field535 = -1;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field536 = 0;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "Z")
    public static boolean field538 = false;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "Ljava/lang/String;")
    public static String field537 = "Prepared sound engine";

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "Lqj;")
    public static class296 field533;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "[I")
    public static int[] field539;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lqj;ZLqj;)V", line = 8)
    public static final void method250(class296 arg0, boolean arg1, class296 arg2) {
        class163.field2294 = arg0;
        class231.field3105 = arg2;
        if (!arg1) {
            method252(40, 120, -11);
        }
        field531++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 25)
    public static void method251(int arg0) {
        field539 = null;
        if (arg0 == -16) {
            field533 = null;
            field537 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)I", line = 40)
    public static final int method252(int arg0, int arg1, int arg2) {
        field540++;
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        int var4 = 86 % ((-arg2 - 36) / 57);
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)Lb;", line = 58)
    public static final class183 method253(int arg0, int arg1) {
        if (arg1 >= -120) {
            method251(-41);
        }
        field532++;
        if (arg0 == 0) {
            if ((double) class42.field628 == 3.0D) {
                return class214.field2846;
            }
            if ((double) class42.field628 == 4.0D) {
                return class296.field4099;
            }
            if ((double) class42.field628 == 6.0D) {
                return class139.field1976;
            }
            if ((double) class42.field628 >= 8.0D) {
                return class43.field655;
            }
        } else if (arg0 == 1) {
            if ((double) class42.field628 == 3.0D) {
                return class139.field1976;
            }
            if ((double) class42.field628 == 4.0D) {
                return class43.field655;
            }
            if ((double) class42.field628 == 6.0D) {
                return class247.field3429;
            }
            if ((double) class42.field628 >= 8.0D) {
                return class23.field311;
            }
        } else if (arg0 == 2) {
            if ((double) class42.field628 == 3.0D) {
                return class247.field3429;
            }
            if ((double) class42.field628 == 4.0D) {
                return class23.field311;
            }
            if ((double) class42.field628 == 6.0D) {
                return class16.field190;
            }
            if ((double) class42.field628 >= 8.0D) {
                return class35.field542;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V", line = 125)
    public static final void method254(boolean arg0) {
        field527++;
        class54.field795 = 0;
        class296.field4079 = 0;
        class437.method2738(61);
        class82.method581(0);
        class169.method1142(-117);
        for (int var1 = 0; var1 < class296.field4079; var1++) {
            int var3 = class376.field5368[var1];
            if (class35.field541 != class445.field6422[var3].field874) {
                if (class445.field6422[var3].field6290.method1404((byte) 48)) {
                    class346.method2217(class445.field6422[var3], (byte) -52);
                }
                class445.field6422[var3].method2733((class221) null, -122);
                class445.field6422[var3] = null;
            }
        }
        if (!arg0) {
            method255(-17, -93);
        }
        if (class120.field1712 != class393.field5747.field5273) {
            throw new RuntimeException("gnp1 pos:" + class393.field5747.field5273 + " psize:" + class120.field1712);
        }
        for (int var2 = 0; var2 < class71.field1096; var2++) {
            if (class445.field6422[class280.field3837[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class71.field1096);
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)Lfm;", line = 187)
    public static final class436 method255(int arg0, int arg1) {
        field526++;
        if (arg1 >= -107) {
            return null;
        } else if (arg0 == 0) {
            return new class58();
        } else if (arg0 == 1) {
            return new class163();
        } else if (arg0 == 2) {
            return new class198();
        } else if (arg0 == 3) {
            return new class45();
        } else if (arg0 == 4) {
            return new class353();
        } else if (arg0 == 5) {
            return new class373();
        } else if (arg0 == 6) {
            return new class252();
        } else if (arg0 == 7) {
            return new class243();
        } else if (arg0 == 8) {
            return new class83();
        } else if (arg0 == 9) {
            return new class60();
        } else if (arg0 == 10) {
            return new class356();
        } else if (arg0 == 11) {
            return new class276();
        } else if (arg0 == 12) {
            return new class143();
        } else if (arg0 == 13) {
            return new class259();
        } else if (arg0 == 14) {
            return new class146();
        } else if (arg0 == 15) {
            return new class406();
        } else if (arg0 == 16) {
            return new class333();
        } else if (arg0 == 17) {
            return new class227();
        } else if (arg0 == 18) {
            return new class204();
        } else if (arg0 == 19) {
            return new class435();
        } else if (arg0 == 20) {
            return new class15();
        } else if (arg0 == 21) {
            return new class386();
        } else if (arg0 == 22) {
            return new class214();
        } else if (arg0 == 23) {
            return new class365();
        } else if (arg0 == 24) {
            return new class158();
        } else if (arg0 == 25) {
            return new class419();
        } else if (arg0 == 26) {
            return new class103();
        } else if (arg0 == 27) {
            return new class408();
        } else if (arg0 == 28) {
            return new class22();
        } else if (arg0 == 29) {
            return new class199();
        } else if (arg0 == 30) {
            return new class62();
        } else if (arg0 == 31) {
            return new class27();
        } else if (arg0 == 32) {
            return new class5();
        } else if (arg0 == 33) {
            return new class67();
        } else if (arg0 == 34) {
            return new class76();
        } else if (arg0 == 35) {
            return new class3();
        } else if (arg0 == 36) {
            return new class426();
        } else if (arg0 == 37) {
            return new class367();
        } else if (arg0 == 38) {
            return new class269();
        } else if (arg0 == 39) {
            return new class271();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BI)V", line = 514)
    public static final void method256(byte arg0, int arg1) {
        field529++;
        if (!class77.method545(true, arg1)) {
            return;
        }
        int var2 = -50 % ((arg0 + 31) / 60);
        class383[] var3 = class333.field4511[arg1];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class383 var5 = var3[var4];
            if (var5 != null) {
                var5.field5544 = 1;
                var5.field5446 = 0;
                var5.field5426 = 0;
            }
        }
    }
}
