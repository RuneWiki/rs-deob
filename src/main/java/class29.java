import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class29 {

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Lok;")
    public static class166 field489 = new class166(3, 5);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 3)
    public static void method234(int arg0) {
        if (arg0 > 62) {
            field489 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BLqa;Lm;)V", line = 16)
    public static final void method235(byte arg0, class162 arg1, class126 arg2) {
        field486++;
        if (class6.field161 == null) {
            return;
        }
        if (class320.field4194 < 10) {
            if (!class6.field156.method2702(arg0 ^ 0xFFFF85E8, class6.field161.field851)) {
                class320.field4194 = class393.field5326.method2701(class6.field161.field851, arg0 - 15098) / 10;
                return;
            }
            class115.method790(-5);
            class320.field4194 = 10;
        }
        if (class320.field4194 == 10) {
            class6.field175 = class6.field161.field854 >> 6 << 6;
            class6.field172 = class6.field161.field849 >> 6 << 6;
            class6.field174 = (class6.field161.field848 >> 6 << 6) + 64 - class6.field172;
            class6.field189 = (class6.field161.field858 >> 6 << 6) - (class6.field175 - 64);
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class6.field161.method393((byte) 123, class421.field5762 + (class385.field5232.field574 >> 7), (class385.field5232.field584 >> 7) + class401.field5382, class385.field5232.field573, var3)) {
                var4 = var3[1] - class6.field175;
                var5 = var3[2] - class6.field172;
            }
            if (!class191.field2687 && var4 >= 0 && var4 < class6.field189 && var5 >= 0 && class6.field174 > var5) {
                int var6 = var5 + ((int) (Math.random() * 10.0D) - 5);
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class391.field5300 = var6;
                class5.field152 = var7;
            } else if (class240.field3208 == -1 || class105.field1543 == -1) {
                class6.field161.method395(var3, class6.field161.field852 & 0x3FFF, (byte) 111, (class6.field161.field852 & 0xFFFD370) >> 14);
                class391.field5300 = var3[2] - class6.field172;
                class5.field152 = var3[1] - class6.field175;
            } else {
                class6.field161.method395(var3, class105.field1543, (byte) 107, class240.field3208);
                if (var3 != null) {
                    class5.field152 = var3[1] - class6.field175;
                    class391.field5300 = var3[2] - class6.field172;
                }
                class105.field1543 = -1;
                class240.field3208 = -1;
                class191.field2687 = false;
            }
            if (class6.field161.field845 == 37) {
                class6.field164 = 3.0F;
                class6.field170 = 3.0F;
            } else if (class6.field161.field845 == 50) {
                class6.field164 = 4.0F;
                class6.field170 = 4.0F;
            } else if (class6.field161.field845 == 75) {
                class6.field164 = 6.0F;
                class6.field170 = 6.0F;
            } else if (class6.field161.field845 == 100) {
                class6.field164 = 8.0F;
                class6.field170 = 8.0F;
            } else if (class6.field161.field845 == 200) {
                class6.field164 = 16.0F;
                class6.field170 = 16.0F;
            } else {
                class6.field164 = 8.0F;
                class6.field170 = 8.0F;
            }
            class6.field167 = (int) class6.field164 >> 1;
            class6.field166 = class463.method2640((byte) 117, class6.field167);
            class268.method1614(1604);
            class6.method42();
            class224.field3022 = new class280();
            class6.field171 += (int) (Math.random() * 5.0D) - 2;
            if (class6.field171 < -8) {
                class6.field171 = -8;
            }
            if (class6.field171 > 8) {
                class6.field171 = 8;
            }
            class6.field165 += (int) (Math.random() * 5.0D) - 2;
            if (class6.field165 < -16) {
                class6.field165 = -16;
            }
            if (class6.field165 > 16) {
                class6.field165 = 16;
            }
            class6.method41(arg2, class6.field171 >> 2 << 10, class6.field165 >> 1);
            class6.field160.method1009(1024, 256, false);
            class6.field153.method374(256, 256, (byte) 123);
            class6.field155.method1995(3, 4096);
            class185.field2626.method2260(256, (byte) 74);
            class320.field4194 = 20;
        } else if (class320.field4194 == 20) {
            class471.method2680((byte) -8, true);
            class6.method40(arg1, class6.field171, class6.field165);
            class320.field4194 = 60;
            class471.method2680((byte) -8, true);
            class171.method1143((byte) 126);
        } else if (class320.field4194 == 60) {
            if (class6.field156.method2720((byte) -12, class6.field161.field851 + "_staticelements")) {
                if (!class6.field156.method2702(arg0 + 31320, class6.field161.field851 + "_staticelements")) {
                    return;
                }
                class6.field168 = class168.method1130(class6.field161.field851 + "_staticelements", class6.field156, class5.field151, (byte) -126);
            } else {
                class6.field168 = new class397(0);
            }
            class6.method45();
            class320.field4194 = 70;
            class471.method2680((byte) -8, true);
            class171.method1143((byte) 109);
        } else if (class320.field4194 == 70) {
            class96.field1460 = new class274(arg1, 11, true, class518.field7663);
            class320.field4194 = 73;
            class471.method2680((byte) -8, true);
            class171.method1143((byte) 110);
        } else if (class320.field4194 == 73) {
            class270.field3543 = new class274(arg1, 12, true, class518.field7663);
            class320.field4194 = 76;
            class471.method2680((byte) -8, true);
            class171.method1143((byte) 115);
        } else if (class320.field4194 == 76) {
            class23.field415 = new class274(arg1, 14, true, class518.field7663);
            class320.field4194 = 79;
            class471.method2680((byte) -8, true);
            class171.method1143((byte) 117);
        } else if (class320.field4194 == 79) {
            class140.field2038 = new class274(arg1, 17, true, class518.field7663);
            class320.field4194 = 82;
            class471.method2680((byte) -8, true);
            class171.method1143((byte) 115);
        } else if (arg0 == -51) {
            if (class320.field4194 == 82) {
                class403.field5558 = new class274(arg1, 19, true, class518.field7663);
                class320.field4194 = 85;
                class471.method2680((byte) -8, true);
                class171.method1143((byte) 119);
            } else if (class320.field4194 == 85) {
                class233.field3138 = new class274(arg1, 22, true, class518.field7663);
                class320.field4194 = 88;
                class471.method2680((byte) -8, true);
                class171.method1143((byte) 103);
            } else if (class320.field4194 == 88) {
                class217.field2934 = new class274(arg1, 26, true, class518.field7663);
                class320.field4194 = 91;
                class471.method2680((byte) -8, true);
                class171.method1143((byte) 124);
            } else {
                class189.field2663 = new class274(arg1, 30, true, class518.field7663);
                class320.field4194 = 100;
                class471.method2680((byte) -8, true);
                class171.method1143((byte) 102);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILmd;)V", line = 243)
    public static final void method236(int arg0, class379 arg1) {
        if (arg0 != -11268) {
            method238((byte) -69, null);
        }
        for (int var2 = 0; var2 < class460.field6361; var2++) {
            int var3 = arg1.method2199((byte) 100);
            int var4 = arg1.method2212((byte) 83);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class45.field676[var3] != null) {
                class45.field676[var3].field2352 = var4;
            }
        }
        field484++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII)I", line = 275)
    public static final int method237(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 8906) {
            field489 = null;
        }
        if (arg1 > 243) {
            arg3 >>= 0x4;
        } else if (arg1 > 217) {
            arg3 >>= 0x3;
        } else if (arg1 > 192) {
            arg3 >>= 0x2;
        } else if (arg1 > 179) {
            arg3 >>= 0x1;
        }
        field485++;
        return (arg3 >> 5 << 7) + ((arg0 & 0xFF) >> 2 << 10) + (arg1 >> 1);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BLmd;)Ljava/lang/String;", line = 304)
    public static final String method238(byte arg0, class379 arg1) {
        int var2 = -113 / ((-arg0 - 86) / 38);
        field487++;
        return class409.method2369(120, 32767, arg1);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)I", line = 319)
    public static final int method239(int arg0) {
        field490++;
        if (arg0 != 1933102119) {
            field491 = -45;
        }
        return 6;
    }
}
