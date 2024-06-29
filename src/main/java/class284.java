import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class284 {

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "[F")
    public float[] field4872 = new float[4];

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "I")
    public int field4900;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "Z")
    public boolean field4885;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Z")
    public boolean field4878;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public int field4877;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
    public int field4892;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public int field4883;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public int field4874;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "[S")
    public short[] field4886;

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "I")
    public int field4899;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    private int field4880;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    private int field4868;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Loh;")
    public static class258 field4867 = class153.method1046("_labels", 116);

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Loh;")
    public static class258 field4876 = class153.method1046("T", 108);

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "I")
    public static int field4891 = 0;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "Loh;")
    public static class258 field4884 = class153.method1046("Wordpack geladen)3", 120);

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "F")
    public float field4870;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "F")
    public float field4890;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    private int field4875;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
    private int field4889;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "I")
    private int field4896;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "I")
    private int field4897;

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "Loa;")
    public class21 field4893;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "Ljava/awt/Frame;")
    public static Frame field4882;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V", line = 14)
    public static final void method1987(int arg0, int arg1) {
        field4888++;
        if (arg0 == 27210) {
            class286 var2 = class48.method389(arg1, 10, 10738);
            var2.method2010((byte) -38);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BIZ)V", line = 33)
    public final void method1988(byte arg0, int arg1, boolean arg2) {
        field4869++;
        int var4 = this.field4868 + (this.field4889 * arg1 / 50) & 0x7FF;
        int var5 = this.field4896;
        int var6;
        if (var5 == 1) {
            var6 = (class266.field4642[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class70.field1207[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg0 > -44) {
            field4882 = (Frame) null;
        }
        if (arg2) {
            var6 = 2048;
        }
        this.field4870 = (float) ((this.field4897 * var6 >> 11) + this.field4875) / 2048.0F;
        float var7 = this.field4870 / 255.0F;
        this.field4872[2] = (float) class2.method15(this.field4899, 255) * var7;
        this.field4872[0] = (float) (class2.method15(this.field4899, 16777177) >> 16) * var7;
        this.field4872[1] = var7 * (float) class2.method15(this.field4899 >> 8, 255);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V", line = 116)
    public static void method1989(byte arg0) {
        field4876 = null;
        field4882 = null;
        field4884 = null;
        field4867 = null;
        if (arg0 < 77) {
            field4895 = 106;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V", line = 1205)
    protected class284() {
        if (class70.field1207 == null) {
            class88.method635(26129);
        }
        this.method1992(-14829);
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lva;)V", line = 1216)
    public class284(class235 arg0) {
        if (class70.field1207 == null) {
            class88.method635(26129);
        }
        this.field4900 = arg0.method1589(76);
        this.field4885 = (this.field4900 & 0x10) != 0;
        this.field4878 = (this.field4900 & 0x8) != 0;
        this.field4900 &= 0x7;
        this.field4877 = arg0.method1615(-121);
        this.field4892 = arg0.method1615(121);
        this.field4883 = arg0.method1615(72);
        this.field4874 = arg0.method1589(125);
        this.method1990((byte) 123);
        this.field4886 = new short[this.field4874 * 2 + 1];
        for (int var2 = 0; var2 < this.field4886.length; var2++) {
            this.field4886[var2] = (short) arg0.method1615(-31);
        }
        this.field4899 = class266.field4634[arg0.method1615(-125)];
        int var3 = arg0.method1589(63);
        this.field4880 = var3 & 0x1F;
        this.field4868 = var3 & 0xE0 << 3;
        this.method1992(-14829);
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V", line = 140)
    private final void method1990(byte arg0) {
        field4871++;
        if (arg0 > 122) {
            int var2 = (this.field4874 << 7) + 64;
            this.field4890 = 1.0F / (float) (var2 * var2);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIILrk;Lrk;IIJ)V", line = 153)
    private static final void method1991(int arg0, int arg1, int arg2, int arg3, class123 arg4, class123 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class23 var10 = new class23();
        var10.field298 = arg8;
        var10.field283 = arg1 * 128 + 64;
        var10.field296 = arg2 * 128 + 64;
        var10.field287 = arg3;
        var10.field291 = arg4;
        var10.field289 = arg5;
        var10.field285 = arg6;
        var10.field288 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class178.field3180[var11][arg1][arg2] == null) {
                class178.field3180[var11][arg1][arg2] = new class228(var11, arg1, arg2);
            }
        }
        class178.field3180[arg0][arg1][arg2].field3923 = var10;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 233)
    private final void method1992(int arg0) {
        int var2 = this.field4880;
        if (var2 == 2) {
            this.field4875 = 0;
            this.field4889 = 2048;
            this.field4896 = 1;
            this.field4897 = 2048;
        } else if (var2 == 3) {
            this.field4897 = 2048;
            this.field4896 = 1;
            this.field4875 = 0;
            this.field4889 = 4096;
        } else if (var2 == 4) {
            this.field4897 = 2048;
            this.field4875 = 0;
            this.field4889 = 2048;
            this.field4896 = 4;
        } else if (var2 == 5) {
            this.field4897 = 2048;
            this.field4889 = 8192;
            this.field4875 = 0;
            this.field4896 = 4;
        } else if (var2 == 12) {
            this.field4875 = 0;
            this.field4896 = 2;
            this.field4897 = 2048;
            this.field4889 = 2048;
        } else if (var2 == 13) {
            this.field4875 = 0;
            this.field4896 = 2;
            this.field4897 = 2048;
            this.field4889 = 8192;
        } else if (var2 == 10) {
            this.field4897 = 512;
            this.field4896 = 3;
            this.field4889 = 2048;
            this.field4875 = 1536;
        } else if (var2 == 11) {
            this.field4896 = 3;
            this.field4897 = 512;
            this.field4875 = 1536;
            this.field4889 = 4096;
        } else if (var2 == 6) {
            this.field4889 = 2048;
            this.field4875 = 1280;
            this.field4896 = 3;
            this.field4897 = 768;
        } else if (var2 == 7) {
            this.field4875 = 1280;
            this.field4897 = 768;
            this.field4896 = 3;
            this.field4889 = 4096;
        } else if (var2 == 8) {
            this.field4889 = 2048;
            this.field4896 = 3;
            this.field4897 = 1024;
            this.field4875 = 1024;
        } else if (var2 == 9) {
            this.field4896 = 3;
            this.field4897 = 1024;
            this.field4889 = 4096;
            this.field4875 = 1024;
        } else if (var2 == 14) {
            this.field4889 = 2048;
            this.field4897 = 768;
            this.field4896 = 1;
            this.field4875 = 1280;
        } else if (var2 == 15) {
            this.field4896 = 1;
            this.field4875 = 1536;
            this.field4889 = 4096;
            this.field4897 = 512;
        } else if (var2 == 16) {
            this.field4875 = 1792;
            this.field4897 = 256;
            this.field4896 = 1;
            this.field4889 = 8192;
        } else {
            this.field4897 = 2048;
            this.field4889 = 2048;
            this.field4896 = 0;
            this.field4875 = 0;
        }
        field4887++;
        if (arg0 != -14829) {
            method1989((byte) -110);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)V", line = 397)
    public static final void method1993(byte arg0, int arg1) {
        if (class114.field2016 == null || class114.field2016.length < arg1) {
            class114.field2016 = new int[arg1];
        }
        field4898++;
        if (arg0 != -45) {
            method1987(51, 68);
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)V", line = 413)
    public static final void method1994(byte arg0) {
        class165.method1099((byte) 126, class206.field3558);
        class127.field2255++;
        field4879++;
        if (class103.field1881 && class168.field2854) {
            int var1 = class194.field3423;
            int var2 = class226.field3882;
            if (arg0 <= -104) {
                int var3 = var1 - class190.field3361;
                int var4 = var2 - class180.field3213;
                if (class207.field3564 > var4) {
                    var4 = class207.field3564;
                }
                if (class279.field4797 > var3) {
                    var3 = class279.field4797;
                }
                if ((class207.field3564 + class188.field3336.field3054) < (var4 + class206.field3558.field3054)) {
                    var4 = class207.field3564 + class188.field3336.field3054 - class206.field3558.field3054;
                }
                int var5 = var4 - class271.field4700;
                if ((var3 + class206.field3558.field3002) > (class279.field4797 + class188.field3336.field3002)) {
                    var3 = class279.field4797 + class188.field3336.field3002 - class206.field3558.field3002;
                }
                int var6 = var3 - class10.field115;
                int var7 = class206.field3558.field2941;
                if (class127.field2255 > class206.field3558.field2971 && (var6 > var7 || -var7 > var6 || var5 > var7 || var5 < (-var7))) {
                    class281.field4830 = true;
                }
                int var8 = class188.field3336.field2966 + var4 - class207.field3564;
                int var9 = class188.field3336.field2957 + var3 - class279.field4797;
                if (class206.field3558.field3072 != null && class281.field4830) {
                    class42 var10 = new class42();
                    var10.field598 = class206.field3558;
                    var10.field591 = var9;
                    var10.field584 = var8;
                    var10.field600 = class206.field3558.field3072;
                    class193.method1303(200000, var10);
                }
                if (class64.field1119 == 0) {
                    if (class281.field4830) {
                        if (class206.field3558.field3056 != null) {
                            class42 var11 = new class42();
                            var11.field600 = class206.field3558.field3056;
                            var11.field584 = var8;
                            var11.field591 = var9;
                            var11.field598 = class206.field3558;
                            var11.field596 = class154.field2647;
                            class193.method1303(200000, var11);
                        }
                        if (class154.field2647 != null && client.method355(class206.field3558) != null) {
                            class61.field1060++;
                            class159.field2710.method885(85, -109);
                            class159.field2710.method1601(class206.field3558.field3061, 1);
                            class159.field2710.method1601(class154.field2647.field3061, 1);
                            class159.field2710.method1619(8316, class154.field2647.field2930);
                            class159.field2710.method1612(class206.field3558.field2930, (byte) -127);
                        }
                    } else if ((class122.field2159 == 1 || class164.method1097(class69.field1195 - 1, -106)) && class69.field1195 > 2) {
                        class11.method74(0);
                    } else if (class69.field1195 > 0) {
                        class251.method1699(9361);
                    }
                    class206.field3558 = null;
                }
            }
        } else if (class127.field2255 > 1) {
            class206.field3558 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Led;IIIIIZIIZB)V", line = 538)
    public static final void method1995(class245 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        field4881++;
        if (arg9 && !class110.method807(arg10 ^ 0xD514E980) && (class94.field1653[0][arg2][arg7] & 0x2) == 0) {
            if ((class94.field1653[arg8][arg2][arg7] & 0x10) != 0) {
                return;
            }
            if (class90.method671(arg8, arg7, arg2, (byte) -93) != class265.field4626) {
                return;
            }
        }
        if (arg8 < class263.field4583) {
            class263.field4583 = arg8;
        }
        class101 var11 = class123.method898(-935, arg4);
        if (class257.field4390 && var11.field1857) {
            return;
        }
        if (arg10 != -126) {
            field4867 = (class258) null;
        }
        int var12;
        int var13;
        if (arg3 == 1 || arg3 == 3) {
            var13 = var11.field1790;
            var12 = var11.field1839;
        } else {
            var12 = var11.field1790;
            var13 = var11.field1839;
        }
        int var14;
        int var15;
        if (arg2 + var12 > 104) {
            var14 = arg2 + 1;
            var15 = arg2;
        } else {
            var14 = (var12 + 1 >> 1) + arg2;
            var15 = (var12 >> 1) + arg2;
        }
        int var16;
        int var17;
        if ((arg7 + var13) > 104) {
            var16 = arg7 + 1;
            var17 = arg7;
        } else {
            var17 = (var13 >> 1) + arg7;
            var16 = arg7 + (var13 + 1 >> 1);
        }
        int[][] var18 = class201.field3482[arg5];
        int var19 = var18[var14][var16] + var18[var15][var17] + var18[var14][var17] + var18[var15][var16] >> 2;
        int var20 = (arg7 << 7) + (var13 << 6);
        int var21 = 0;
        if (class257.field4390 && arg5 != 0) {
            int[][] var22 = class201.field3482[0];
            var21 = var19 - (var22[var14][var17] + var22[var15][var16] + var22[var14][var16] + var22[var15][var17] >> 2);
        }
        int var23 = (arg2 << 7) + (var12 << 6);
        int[][] var24 = (int[][]) null;
        long var25 = (long) (arg1 | 0x10000 << 14 | arg7 << 7 | arg2 | arg3 << 20);
        if (var11.field1818 == 0 || arg6) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field1810 == 1) {
            var25 |= 0x400000L;
        }
        if (arg6) {
            var24 = class134.field2317[0];
        } else if (arg5 < 3) {
            var24 = class201.field3482[arg5 + 1];
        }
        if (var11.field1827) {
            var25 |= 0x80000000L;
        }
        if (var11.method760(arg10 + 84)) {
            class207.method1366(arg7, arg8, arg2, arg3, (class107) null, (class231) null, var11, 128);
        }
        long var27 = var25 | (long) arg4 << 32;
        boolean var29 = var11.field1840 & !arg6;
        if (arg1 == 22) {
            if (class119.field2110 || var11.field1818 != 0 || var11.field1792 == 1 || var11.field1800) {
                class123 var77;
                if (var11.field1793 == -1 && var11.field1797 == null) {
                    class294 var76 = var11.method756(var29, var18, arg3, var24, true, arg9, var20, (class129) null, var19, 22, var23);
                    if (class257.field4390 && var29) {
                        class9.method60(var76.field5049, var23, var21, var20);
                    }
                    var77 = var76.field5054;
                } else {
                    var77 = new class43(arg4, 22, arg3, arg5, arg2, arg7, var11.field1793, var11.field1804, (class123) null);
                }
                class245.method1669(arg8, arg2, arg7, var19, var77, var27, var11.field1837);
                if (var11.field1792 == 1 && arg0 != null) {
                    arg0.method1664(arg7, arg2, (byte) -111);
                }
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class123 var71;
            if (var11.field1793 == -1 && var11.field1797 == null) {
                class294 var70 = var11.method756(var29, var18, arg1 == 11 ? arg3 + 4 : arg3, var24, true, arg9, var20, (class129) null, var19, 10, var23);
                if (class257.field4390 && var29) {
                    class9.method60(var70.field5049, var23, var21, var20);
                }
                var71 = var70.field5054;
            } else {
                var71 = new class43(arg4, 10, arg1 == 11 ? arg3 + 4 : arg3, arg5, arg2, arg7, var11.field1793, var11.field1804, (class123) null);
            }
            if (var71 != null) {
                boolean var72 = class51.method413(arg8, arg2, arg7, var19, var12, var13, var71, 0, var27);
                if (var11.field1802 && var72 && arg9) {
                    int var73 = 15;
                    if (var71 instanceof class305) {
                        var73 = ((class305) var71).method659() / 4;
                        if (var73 > 30) {
                            var73 = 30;
                        }
                    }
                    for (int var74 = 0; var74 <= var12; var74++) {
                        for (int var75 = 0; var75 <= var13; var75++) {
                            if (var73 > class214.field3721[arg8][arg2 + var74][arg7 + var75]) {
                                class214.field3721[arg8][arg2 + var74][arg7 + var75] = (byte) var73;
                            }
                        }
                    }
                }
            }
            if (var11.field1792 != 0 && arg0 != null) {
                arg0.method1660(arg7, var13, var12, arg2, true, var11.field1847);
            }
        } else if (arg1 >= 12) {
            class123 var31;
            if (var11.field1793 == -1 && var11.field1797 == null) {
                class294 var30 = var11.method756(var29, var18, arg3, var24, true, arg9, var20, (class129) null, var19, arg1, var23);
                if (class257.field4390 && var29) {
                    class9.method60(var30.field5049, var23, var21, var20);
                }
                var31 = var30.field5054;
            } else {
                var31 = new class43(arg4, arg1, arg3, arg5, arg2, arg7, var11.field1793, var11.field1804, (class123) null);
            }
            class51.method413(arg8, arg2, arg7, var19, 1, 1, var31, 0, var27);
            if (arg9 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg8 > 0) {
                class68.field1180[arg8][arg2][arg7] = class307.method2139(class68.field1180[arg8][arg2][arg7], 4);
            }
            if (var11.field1792 != 0 && arg0 != null) {
                arg0.method1660(arg7, var13, var12, arg2, true, var11.field1847);
            }
        } else if (arg1 == 0) {
            class123 var69;
            if (var11.field1793 == -1 && var11.field1797 == null) {
                class294 var68 = var11.method756(var29, var18, arg3, var24, true, arg9, var20, (class129) null, var19, 0, var23);
                if (class257.field4390 && var29) {
                    class9.method60(var68.field5049, var23, var21, var20);
                }
                var69 = var68.field5054;
            } else {
                var69 = new class43(arg4, 0, arg3, arg5, arg2, arg7, var11.field1793, var11.field1804, (class123) null);
            }
            method1991(arg8, arg2, arg7, var19, var69, (class123) null, class26.field304[arg3], 0, var27);
            if (arg9) {
                if (arg3 == 0) {
                    if (var11.field1802) {
                        class214.field3721[arg8][arg2][arg7] = 50;
                        class214.field3721[arg8][arg2][arg7 + 1] = 50;
                    }
                    if (var11.field1822) {
                        class68.field1180[arg8][arg2][arg7] = class307.method2139(class68.field1180[arg8][arg2][arg7], 1);
                    }
                } else if (arg3 == 1) {
                    if (var11.field1802) {
                        class214.field3721[arg8][arg2][arg7 + 1] = 50;
                        class214.field3721[arg8][arg2 + 1][arg7 + 1] = 50;
                    }
                    if (var11.field1822) {
                        class68.field1180[arg8][arg2][arg7 + 1] = class307.method2139(class68.field1180[arg8][arg2][arg7 + 1], 2);
                    }
                } else if (arg3 == 2) {
                    if (var11.field1802) {
                        class214.field3721[arg8][arg2 + 1][arg7] = 50;
                        class214.field3721[arg8][arg2 + 1][arg7 + 1] = 50;
                    }
                    if (var11.field1822) {
                        class68.field1180[arg8][arg2 + 1][arg7] = class307.method2139(class68.field1180[arg8][arg2 + 1][arg7], 1);
                    }
                } else if (arg3 == 3) {
                    if (var11.field1802) {
                        class214.field3721[arg8][arg2][arg7] = 50;
                        class214.field3721[arg8][arg2 + 1][arg7] = 50;
                    }
                    if (var11.field1822) {
                        class68.field1180[arg8][arg2][arg7] = class307.method2139(class68.field1180[arg8][arg2][arg7], 2);
                    }
                }
            }
            if (var11.field1792 != 0 && arg0 != null) {
                arg0.method1665(arg1, var11.field1847, arg2, 8, arg7, arg3);
            }
            if (var11.field1833 != 16) {
                class301.method2111(arg8, arg2, arg7, var11.field1833);
            }
        } else if (arg1 == 1) {
            class123 var67;
            if (var11.field1793 == -1 && var11.field1797 == null) {
                class294 var66 = var11.method756(var29, var18, arg3, var24, true, arg9, var20, (class129) null, var19, 1, var23);
                if (class257.field4390 && var29) {
                    class9.method60(var66.field5049, var23, var21, var20);
                }
                var67 = var66.field5054;
            } else {
                var67 = new class43(arg4, 1, arg3, arg5, arg2, arg7, var11.field1793, var11.field1804, (class123) null);
            }
            method1991(arg8, arg2, arg7, var19, var67, (class123) null, class152.field2610[arg3], 0, var27);
            if (var11.field1802 && arg9) {
                if (arg3 == 0) {
                    class214.field3721[arg8][arg2][arg7 + 1] = 50;
                } else if (arg3 == 1) {
                    class214.field3721[arg8][arg2 + 1][arg7 + 1] = 50;
                } else if (arg3 == 2) {
                    class214.field3721[arg8][arg2 + 1][arg7] = 50;
                } else if (arg3 == 3) {
                    class214.field3721[arg8][arg2][arg7] = 50;
                }
            }
            if (var11.field1792 != 0 && arg0 != null) {
                arg0.method1665(arg1, var11.field1847, arg2, arg10 ^ 0xFFFFFF8A, arg7, arg3);
            }
        } else if (arg1 == 2) {
            int var32 = arg3 + 1 & 0x3;
            class123 var34;
            class123 var36;
            if (var11.field1793 == -1 && var11.field1797 == null) {
                class294 var33 = var11.method756(var29, var18, arg3 + 4, var24, true, arg9, var20, (class129) null, var19, 2, var23);
                if (class257.field4390 && var29) {
                    class9.method60(var33.field5049, var23, var21, var20);
                }
                var34 = var33.field5054;
                class294 var35 = var11.method756(var29, var18, var32, var24, true, arg9, var20, (class129) null, var19, 2, var23);
                if (class257.field4390 && var29) {
                    class9.method60(var35.field5049, var23, var21, var20);
                }
                var36 = var35.field5054;
            } else {
                var34 = new class43(arg4, 2, arg3 + 4, arg5, arg2, arg7, var11.field1793, var11.field1804, (class123) null);
                var36 = new class43(arg4, 2, var32, arg5, arg2, arg7, var11.field1793, var11.field1804, (class123) null);
            }
            method1991(arg8, arg2, arg7, var19, var34, var36, class26.field304[arg3], class26.field304[var32], var27);
            if (var11.field1822 && arg9) {
                if (arg3 == 0) {
                    class68.field1180[arg8][arg2][arg7] = class307.method2139(class68.field1180[arg8][arg2][arg7], 1);
                    class68.field1180[arg8][arg2][arg7 + 1] = class307.method2139(class68.field1180[arg8][arg2][arg7 + 1], 2);
                } else if (arg3 == 1) {
                    class68.field1180[arg8][arg2][arg7 + 1] = class307.method2139(class68.field1180[arg8][arg2][arg7 + 1], 2);
                    class68.field1180[arg8][arg2 + 1][arg7] = class307.method2139(class68.field1180[arg8][arg2 + 1][arg7], 1);
                } else if (arg3 == 2) {
                    class68.field1180[arg8][arg2 + 1][arg7] = class307.method2139(class68.field1180[arg8][arg2 + 1][arg7], 1);
                    class68.field1180[arg8][arg2][arg7] = class307.method2139(class68.field1180[arg8][arg2][arg7], 2);
                } else if (arg3 == 3) {
                    class68.field1180[arg8][arg2][arg7] = class307.method2139(class68.field1180[arg8][arg2][arg7], 2);
                    class68.field1180[arg8][arg2][arg7] = class307.method2139(class68.field1180[arg8][arg2][arg7], 1);
                }
            }
            if (var11.field1792 != 0 && arg0 != null) {
                arg0.method1665(arg1, var11.field1847, arg2, arg10 + 134, arg7, arg3);
            }
            if (var11.field1833 != 16) {
                class301.method2111(arg8, arg2, arg7, var11.field1833);
            }
        } else if (arg1 == 3) {
            class123 var38;
            if (var11.field1793 == -1 && var11.field1797 == null) {
                class294 var37 = var11.method756(var29, var18, arg3, var24, true, arg9, var20, (class129) null, var19, 3, var23);
                if (class257.field4390 && var29) {
                    class9.method60(var37.field5049, var23, var21, var20);
                }
                var38 = var37.field5054;
            } else {
                var38 = new class43(arg4, 3, arg3, arg5, arg2, arg7, var11.field1793, var11.field1804, (class123) null);
            }
            method1991(arg8, arg2, arg7, var19, var38, (class123) null, class152.field2610[arg3], 0, var27);
            if (var11.field1802 && arg9) {
                if (arg3 == 0) {
                    class214.field3721[arg8][arg2][arg7 + 1] = 50;
                } else if (arg3 == 1) {
                    class214.field3721[arg8][arg2 + 1][arg7 + 1] = 50;
                } else if (arg3 == 2) {
                    class214.field3721[arg8][arg2 + 1][arg7] = 50;
                } else if (arg3 == 3) {
                    class214.field3721[arg8][arg2][arg7] = 50;
                }
            }
            if (var11.field1792 != 0 && arg0 != null) {
                arg0.method1665(arg1, var11.field1847, arg2, 8, arg7, arg3);
            }
        } else if (arg1 == 9) {
            class123 var65;
            if (var11.field1793 == -1 && var11.field1797 == null) {
                class294 var64 = var11.method756(var29, var18, arg3, var24, true, arg9, var20, (class129) null, var19, arg1, var23);
                if (class257.field4390 && var29) {
                    class9.method60(var64.field5049, var23, var21, var20);
                }
                var65 = var64.field5054;
            } else {
                var65 = new class43(arg4, arg1, arg3, arg5, arg2, arg7, var11.field1793, var11.field1804, (class123) null);
            }
            class51.method413(arg8, arg2, arg7, var19, 1, 1, var65, 0, var27);
            if (var11.field1792 != 0 && arg0 != null) {
                arg0.method1660(arg7, var13, var12, arg2, true, var11.field1847);
            }
            if (var11.field1833 != 16) {
                class301.method2111(arg8, arg2, arg7, var11.field1833);
            }
        } else if (arg1 == 4) {
            class123 var40;
            if (var11.field1793 == -1 && var11.field1797 == null) {
                class294 var39 = var11.method756(var29, var18, arg3, var24, true, arg9, var20, (class129) null, var19, 4, var23);
                if (class257.field4390 && var29) {
                    class9.method60(var39.field5049, var23, var21, var20);
                }
                var40 = var39.field5054;
            } else {
                var40 = new class43(arg4, 4, arg3, arg5, arg2, arg7, var11.field1793, var11.field1804, (class123) null);
            }
            class189.method1281(arg8, arg2, arg7, var19, var40, (class123) null, class26.field304[arg3], 0, 0, 0, var27);
        } else if (arg1 == 5) {
            int var41 = 16;
            long var42 = class261.method1834(arg8, arg2, arg7);
            if (var42 != 0L) {
                var41 = class123.method898(-935, Integer.MAX_VALUE & (int) (var42 >>> 32)).field1833;
            }
            class123 var45;
            if (var11.field1793 == -1 && var11.field1797 == null) {
                class294 var44 = var11.method756(var29, var18, arg3, var24, true, arg9, var20, (class129) null, var19, 4, var23);
                if (class257.field4390 && var29) {
                    class9.method60(var44.field5049, var23 - (class137.field2346[arg3] * 8), var21, var20 - (class120.field2116[arg3] * 8));
                }
                var45 = var44.field5054;
            } else {
                var45 = new class43(arg4, 4, arg3, arg5, arg2, arg7, var11.field1793, var11.field1804, (class123) null);
            }
            class189.method1281(arg8, arg2, arg7, var19, var45, (class123) null, class26.field304[arg3], 0, class137.field2346[arg3] * var41, class120.field2116[arg3] * var41, var27);
        } else if (arg1 == 6) {
            long var46 = class261.method1834(arg8, arg2, arg7);
            int var48 = 8;
            if (var46 != 0L) {
                var48 = class123.method898(arg10 - 809, (int) (var46 >>> 32) & Integer.MAX_VALUE).field1833 / 2;
            }
            class123 var50;
            if (var11.field1793 == -1 && var11.field1797 == null) {
                class294 var49 = var11.method756(var29, var18, arg3 + 4, var24, true, arg9, var20, (class129) null, var19, 4, var23);
                if (class257.field4390 && var29) {
                    class9.method60(var49.field5049, var23 - (class125.field2234[arg3] * 8), var21, var20 - class233.field4041[arg3] * 8);
                }
                var50 = var49.field5054;
            } else {
                var50 = new class43(arg4, 4, arg3 + 4, arg5, arg2, arg7, var11.field1793, var11.field1804, (class123) null);
            }
            class189.method1281(arg8, arg2, arg7, var19, var50, (class123) null, 256, arg3, class125.field2234[arg3] * var48, class233.field4041[arg3] * var48, var27);
        } else if (arg1 == 7) {
            int var61 = arg3 + 2 & 0x3;
            class123 var63;
            if (var11.field1793 == -1 && var11.field1797 == null) {
                class294 var62 = var11.method756(var29, var18, var61 + 4, var24, true, arg9, var20, (class129) null, var19, 4, var23);
                if (class257.field4390 && var29) {
                    class9.method60(var62.field5049, var23, var21, var20);
                }
                var63 = var62.field5054;
            } else {
                var63 = new class43(arg4, 4, var61 + 4, arg5, arg2, arg7, var11.field1793, var11.field1804, (class123) null);
            }
            class189.method1281(arg8, arg2, arg7, var19, var63, (class123) null, 256, var61, 0, 0, var27);
        } else if (arg1 == 8) {
            long var51 = class261.method1834(arg8, arg2, arg7);
            int var53 = 8;
            if (var51 != 0L) {
                var53 = class123.method898(arg10 - 809, (int) (var51 >>> 32) & Integer.MAX_VALUE).field1833 / 2;
            }
            int var54 = arg3 + 2 & 0x3;
            class123 var58;
            class123 var60;
            if (var11.field1793 == -1 && var11.field1797 == null) {
                int var55 = class125.field2234[arg3] * 8;
                int var56 = class233.field4041[arg3] * 8;
                class294 var57 = var11.method756(var29, var18, arg3 + 4, var24, true, arg9, var20, (class129) null, var19, 4, var23);
                if (class257.field4390 && var29) {
                    class9.method60(var57.field5049, var23 - var55, var21, var20 - var56);
                }
                var58 = var57.field5054;
                class294 var59 = var11.method756(var29, var18, var54 + 4, var24, true, arg9, var20, (class129) null, var19, 4, var23);
                if (class257.field4390 && var29) {
                    class9.method60(var59.field5049, var23 - var55, var21, var20 - var56);
                }
                var60 = var59.field5054;
            } else {
                var58 = new class43(arg4, 4, arg3 + 4, arg5, arg2, arg7, var11.field1793, var11.field1804, (class123) null);
                var60 = new class43(arg4, 4, var54 + 4, arg5, arg2, arg7, var11.field1793, var11.field1804, (class123) null);
            }
            class189.method1281(arg8, arg2, arg7, var19, var58, var60, 256, arg3, class125.field2234[arg3] * var53, class233.field4041[arg3] * var53, var27);
        }
    }
}
