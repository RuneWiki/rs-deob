import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class291 extends class72 {

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    private final int field5005;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    private final int field5011;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    private final int field5007;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    private final int field5020;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    private final int field5016;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    private final int field5012;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    private final int field5010;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    private final int field5013;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "[I")
    public static int[] field5009 = new int[200];

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field5015 = 0;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "Loh;")
    public static class258 field5021 = class153.method1046("Mem:", 126);

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIB)V", line = 9)
    public final void method492(int arg0, int arg1, byte arg2) {
        field5019++;
        if (arg2 >= -120) {
            method2046(-35, true, -38, 6, 108, 113, (class235) null, 34, 112);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZIIIILva;II)V", line = 19)
    public static final void method2046(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class235 arg6, int arg7, int arg8) {
        if (arg7 < 125) {
            method2046(11, false, 49, -21, -75, -46, (class235) null, 55, -55);
        }
        field5006++;
        if (arg5 < 0 || arg5 >= 104 || arg4 < 0 || arg4 >= 104) {
            while (true) {
                int var11 = arg6.method1589(107);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg6.method1589(52);
                    break;
                }
                if (var11 <= 49) {
                    arg6.method1589(66);
                }
            }
            return;
        }
        if (!arg1) {
            class94.field1653[arg0][arg5][arg4] = 0;
        }
        while (true) {
            int var9 = arg6.method1589(60);
            if (var9 == 0) {
                if (arg1) {
                    class201.field3482[0][arg5][arg4] = class134.field2317[0][arg5][arg4];
                } else if (arg0 == 0) {
                    class201.field3482[0][arg5][arg4] = -class26.method203(arg4 + arg2 + 556238, arg5 + 932731 + arg3, (byte) -69) * 8;
                } else {
                    class201.field3482[arg0][arg5][arg4] = class201.field3482[arg0 - 1][arg5][arg4] - 240;
                }
                break;
            }
            if (var9 == 1) {
                int var10 = arg6.method1589(80);
                if (arg1) {
                    class201.field3482[0][arg5][arg4] = class134.field2317[0][arg5][arg4] + (var10 * 8);
                } else {
                    if (var10 == 1) {
                        var10 = 0;
                    }
                    if (arg0 == 0) {
                        class201.field3482[0][arg5][arg4] = -var10 * 8;
                    } else {
                        class201.field3482[arg0][arg5][arg4] = class201.field3482[arg0 - 1][arg5][arg4] - var10 * 8;
                    }
                }
                break;
            }
            if (var9 <= 49) {
                class204.field3540[arg0][arg5][arg4] = arg6.method1617((byte) -117);
                class242.field4206[arg0][arg5][arg4] = (byte) ((var9 - 2) / 4);
                class152.field2613[arg0][arg5][arg4] = (byte) class2.method15(arg8 + var9 - 2, 3);
            } else if (var9 > 81) {
                class167.field2829[arg0][arg5][arg4] = (byte) (var9 - 81);
            } else if (!arg1) {
                class94.field1653[arg0][arg5][arg4] = (byte) (var9 - 49);
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII)V", line = 123)
    public static final void method2047(int arg0, int arg1, int arg2, int arg3) {
        field5014++;
        if (arg2 != -652159092) {
            method2050((byte) 64);
        }
        class258 var4 = class100.method755(arg2 + 652159086, new class258[] { class137.field2333, class218.method1481(-45, arg0), class98.field1744, class218.method1481(121, arg1 >> 6), class98.field1744, class218.method1481(-100, arg3 >> 6), class98.field1744, class218.method1481(arg2 + 652159143, arg1 & 0x3F), class98.field1744, class218.method1481(-101, arg3 & 0x3F) });
        var4.method1810((byte) 88);
        class243.method1652((byte) -128, var4);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 145)
    public static final void method2048(int arg0) {
        field5003++;
        class293.field5036.method888(arg0 + 12814);
        int var1 = class293.field5036.method881(1, (byte) -96);
        if (var1 == 0 || arg0 != -12806) {
            return;
        }
        int var2 = class293.field5036.method881(2, (byte) -98);
        if (var2 == 0) {
            class225.field3857[class311.field5289++] = 2047;
        } else if (var2 == 1) {
            int var10 = class293.field5036.method881(3, (byte) -104);
            class152.field2606.method450(var10, -12338, false);
            int var11 = class293.field5036.method881(1, (byte) -100);
            if (var11 == 1) {
                class225.field3857[class311.field5289++] = 2047;
            }
        } else if (var2 == 2) {
            int var3 = class293.field5036.method881(3, (byte) -97);
            class152.field2606.method450(var3, -12338, true);
            int var4 = class293.field5036.method881(3, (byte) -119);
            class152.field2606.method450(var4, -12338, true);
            int var5 = class293.field5036.method881(1, (byte) -92);
            if (var5 == 1) {
                class225.field3857[class311.field5289++] = 2047;
            }
        } else if (var2 == 3) {
            class272.field4704 = class293.field5036.method881(2, (byte) -105);
            int var6 = class293.field5036.method881(1, (byte) -115);
            int var7 = class293.field5036.method881(7, (byte) -118);
            int var8 = class293.field5036.method881(7, (byte) -98);
            int var9 = class293.field5036.method881(1, (byte) -119);
            if (var9 == 1) {
                class225.field3857[class311.field5289++] = 2047;
            }
            class152.field2606.method1546(true, var8, var6 == 1, var7);
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 229)
    public class291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field5005 = arg2;
        this.field5011 = arg6;
        this.field5007 = arg1;
        this.field5020 = arg0;
        this.field5016 = arg7;
        this.field5012 = arg5;
        this.field5010 = arg4;
        this.field5013 = arg3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V", line = 245)
    public final void method495(int arg0, int arg1, int arg2) {
        field5008++;
        if (arg2 != 512) {
            field5021 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lgb;ILgb;)V", line = 256)
    public static final void method2049(class213 arg0, int arg1, class213 arg2) {
        field5002++;
        class193.field3418 = arg2;
        int var3 = 23 % ((arg1 - 13) / 63);
        class93.field1639 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V", line = 274)
    public static void method2050(byte arg0) {
        field5021 = null;
        field5009 = null;
        if (arg0 != -127) {
            method2049((class213) null, -48, (class213) null);
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)V", line = 286)
    public static final void method2051(byte arg0) {
        if (!class252.field4342) {
            class227.field3910[0] = 1004;
            class242.field4205[0] = class68.field1185;
            class225.field3849[0] = class235.field4104;
            if (class147.field2501 != 0) {
                class84.field1415 = class249.field4298;
                class113.field1947 = class49.field729;
            } else if (class123.field2184 == 0) {
                class84.field1415 = class194.field3423;
                class113.field1947 = class226.field3882;
            } else {
                class84.field1415 = class219.field3791;
                class113.field1947 = class173.field3103;
            }
            class69.field1195 = 1;
        }
        field5018++;
        if (class170.field2901 != -1) {
            class84.method609(class170.field2901, (byte) 121);
        }
        for (int var1 = 0; var1 < class312.field5298; var1++) {
            if (class238.field4151[var1]) {
                class74.field1292[var1] = true;
            }
            class201.field3479[var1] = class238.field4151[var1];
            class238.field4151[var1] = false;
        }
        class207.field3568 = class202.field3498;
        if (class257.field4390) {
            class217.field3746 = true;
        }
        class224.field3843 = null;
        class55.field866 = -1;
        class8.field105 = -1;
        if (class170.field2901 != -1) {
            class312.field5298 = 0;
            class75.method550(-1, class42.field577, false, class218.field3773, class170.field2901, 0, 0, 0, 0);
        }
        if (class257.field4390) {
            class296.method2088();
        } else {
            class211.method1415();
        }
        if (arg0 < 83) {
            return;
        }
        class234.method1563(true);
        if (class252.field4342) {
            class256.method1725(false);
        } else if (class55.field866 != -1) {
            class108.method798(class55.field866, 22298, class8.field105);
        }
        if (class191.field3373 == 3) {
            for (int var2 = 0; var2 < class312.field5298; var2++) {
                if (class201.field3479[var2]) {
                    if (class257.field4390) {
                        class296.method2089(class276.field4763[var2], class121.field2146[var2], class114.field2026[var2], class38.field517[var2], 16711935, 128);
                    } else {
                        class211.method1406(class276.field4763[var2], class121.field2146[var2], class114.field2026[var2], class38.field517[var2], 16711935, 128);
                    }
                } else if (class74.field1292[var2]) {
                    if (class257.field4390) {
                        class296.method2089(class276.field4763[var2], class121.field2146[var2], class114.field2026[var2], class38.field517[var2], 16711680, 128);
                    } else {
                        class211.method1406(class276.field4763[var2], class121.field2146[var2], class114.field2026[var2], class38.field517[var2], 16711680, 128);
                    }
                }
            }
        }
        class4.method23(-1, class251.field4329, class272.field4704, class152.field2606.field912, class152.field2606.field934);
        class251.field4329 = 0;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)V", line = 411)
    public final void method494(int arg0, int arg1, int arg2) {
        field5017++;
        int var4 = this.field5020 * arg2 >> 12;
        int var5 = this.field5007 * arg0 >> 12;
        int var6 = this.field5005 * arg2 >> 12;
        int var7 = this.field5013 * arg0 >> 12;
        int var8 = this.field5010 * arg2 >> 12;
        int var9 = this.field5012 * arg0 >> 12;
        int var10 = this.field5011 * arg2 >> 12;
        if (arg1 != 17898) {
            method2047(-74, -53, -107, -110);
        }
        int var11 = this.field5016 * arg0 >> 12;
        class99.method746(var5, var10, var4, arg1 ^ 0x4522, var8, var9, var6, var7, var11, this.field1269);
    }
}
