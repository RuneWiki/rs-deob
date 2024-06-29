import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class148 {

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "[Z")
    public static boolean[] field2756 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "S")
    public static short field2759 = 205;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2764;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILfl;)[Lcg;")
    public static final class34[] method1017(int arg0, int arg1, class192 arg2) {
        if (arg0 != 64) {
            field2759 = -53;
        }
        field2763++;
        return class53.method415(arg2, 11465, arg1) ? class217.method1493(10768) : null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B[BLng;)V")
    public final void method1018(byte arg0, byte[] arg1, class135 arg2) {
        field2757++;
        if (arg0 < 104) {
            method1019(-15);
        }
        if (arg2.field2483[arg2.field2449] != 31 || arg2.field2483[arg2.field2449 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2764 == null) {
            this.field2764 = new Inflater(true);
        }
        try {
            this.field2764.setInput(arg2.field2483, arg2.field2449 + 10, arg2.field2483.length - (arg2.field2449 + 8) - 10);
            this.field2764.inflate(arg1);
        } catch (Exception var4) {
            this.field2764.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2764.reset();
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public static final void method1019(int arg0) {
        field2762++;
        int var1 = class181.field3215 * 128 + 64;
        int var2 = 117 / ((arg0 - 51) / 51);
        int var3 = class170.field3077 * 128 + 64;
        int var4 = class67.method483(var1, -120, var3, class216.field3902) - class71.field1367;
        if (class146.field2726 >= 100) {
            class69.field1309 = class181.field3215 * 128 + 64;
            class112.field1976 = class170.field3077 * 128 + 64;
            class17.field475 = class67.method483(class69.field1309, -121, class112.field1976, class216.field3902) - class71.field1367;
        } else {
            if (class69.field1309 < var1) {
                class69.field1309 += class270.field4821 + ((var1 - class69.field1309) * class146.field2726 / 1000);
                if (var1 < class69.field1309) {
                    class69.field1309 = var1;
                }
            }
            if (class69.field1309 > var1) {
                class69.field1309 -= (class69.field1309 - var1) * class146.field2726 / 1000 + class270.field4821;
                if (var1 > class69.field1309) {
                    class69.field1309 = var1;
                }
            }
            if (var3 > class112.field1976) {
                class112.field1976 += (var3 - class112.field1976) * class146.field2726 / 1000 + class270.field4821;
                if (var3 < class112.field1976) {
                    class112.field1976 = var3;
                }
            }
            if (class112.field1976 > var3) {
                class112.field1976 -= (class112.field1976 - var3) * class146.field2726 / 1000 + class270.field4821;
                if (class112.field1976 < var3) {
                    class112.field1976 = var3;
                }
            }
            if (class17.field475 < var4) {
                class17.field475 += (var4 - class17.field475) * class146.field2726 / 1000 + class270.field4821;
                if (var4 < class17.field475) {
                    class17.field475 = var4;
                }
            }
            if (var4 < class17.field475) {
                class17.field475 -= class270.field4821 + ((class17.field475 - var4) * class146.field2726 / 1000);
                if (var4 > class17.field475) {
                    class17.field475 = var4;
                }
            }
        }
        int var5 = class162.field2954 * 128 + 64;
        int var6 = class169.field3062 * 128 + 64;
        int var7 = class67.method483(var6, -122, var5, class216.field3902) - class113.field1992;
        int var8 = var6 - class69.field1309;
        int var9 = var7 - class17.field475;
        int var10 = var5 - class112.field1976;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 0x7FF;
        if (var12 < 128) {
            var12 = 128;
        }
        int var13 = (int) (-325.949D * Math.atan2((double) var10, (double) var8)) & 0x7FF;
        if (var12 > 383) {
            var12 = 383;
        }
        if (class202.field3613 < var12) {
            class202.field3613 += (var12 - class202.field3613) * class211.field3790 / 1000 + class80.field1520;
            if (var12 < class202.field3613) {
                class202.field3613 = var12;
            }
        }
        int var14 = var13 - class8.field272;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            class8.field272 += class211.field3790 * var14 / 1000 + class80.field1520;
            class8.field272 &= 0x7FF;
        }
        if (var14 < 0) {
            class8.field272 -= -var14 * class211.field3790 / 1000 + class80.field1520;
            class8.field272 &= 0x7FF;
        }
        if (var12 < class202.field3613) {
            class202.field3613 -= (class202.field3613 - var12) * class211.field3790 / 1000 + class80.field1520;
            if (var12 > class202.field3613) {
                class202.field3613 = var12;
            }
        }
        int var15 = var13 - class8.field272;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class8.field272 = var13;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V")
    public static final void method1020(int arg0, int arg1) {
        class178 var2 = class188.method1282(arg1, 2, 261360480);
        field2758++;
        var2.method1160(117);
        if (arg0 != 2048) {
            method1021(-39);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    public static void method1021(int arg0) {
        field2756 = null;
        if (arg0 != -31029) {
            method1017(-88, 78, (class192) null);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[Lvf;)Lvf;")
    public static final class265 method1022(int arg0, class265[] arg1) {
        field2760++;
        if (arg0 != 10) {
            method1019(-70);
        }
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class189.method1290(35, arg1.length, 0, arg1);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V")
    public static final void method1023(byte arg0) {
        for (int var1 = 0; var1 < class87.field1588; var1++) {
            int var10002 = class4.field65[var1]--;
            if (class4.field65[var1] >= -10) {
                class173 var4 = class262.field4580[var1];
                if (var4 == null) {
                    var4 = class173.method1137(class213.field3822, class249.field4316[var1], 0);
                    if (var4 == null) {
                        continue;
                    }
                    class4.field65[var1] += var4.method1139();
                    class262.field4580[var1] = var4;
                }
                if (class4.field65[var1] < 0) {
                    int var11;
                    if (class210.field3775[var1] == 0) {
                        var11 = class43.field959;
                    } else {
                        int var5 = (class210.field3775[var1] & 0xFF) * 128;
                        int var6 = class210.field3775[var1] >> 16 & 0xFF;
                        int var7 = var6 * 128 + 64 - class214.field3827.field2600;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = class210.field3775[var1] >> 8 & 0xFF;
                        int var9 = var8 * 128 + 64 - class214.field3827.field2564;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var10 > var5) {
                            class4.field65[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var11 = (var5 - var10) * class172.field3095 / var5;
                    }
                    if (var11 > 0) {
                        class222 var12 = var4.method1138().method1512(class197.field3515);
                        class180 var13 = class180.method1202(var12, 100, var11);
                        var13.method1208(class193.field3473[var1] - 1);
                        class49.field1039.method1661(var13);
                    }
                    class4.field65[var1] = -100;
                }
            } else {
                class87.field1588--;
                for (int var3 = var1; var3 < class87.field1588; var3++) {
                    class249.field4316[var3] = class249.field4316[var3 + 1];
                    class262.field4580[var3] = class262.field4580[var3 + 1];
                    class193.field3473[var3] = class193.field3473[var3 + 1];
                    class4.field65[var3] = class4.field65[var3 + 1];
                    class210.field3775[var3] = class210.field3775[var3 + 1];
                }
                var1--;
            }
        }
        field2761++;
        int var2 = -55 / ((arg0 - 28) / 58);
        if (class112.field1964 && !class76.method536((byte) -42)) {
            if (class105.field1868 != 0 && class44.field980 != -1) {
                class171.method1131(0, false, 10000, class44.field980, class14.field427, class105.field1868);
            }
            class112.field1964 = false;
        } else if (class105.field1868 != 0 && class44.field980 != -1 && !class76.method536((byte) -42)) {
            class9.field312++;
            class55.field1133.method1863(true, 161);
            class55.field1133.method898((byte) 103, class44.field980);
            class44.field980 = -1;
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V")
    public class148() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(III)V")
    private class148(int arg0, int arg1, int arg2) {
    }
}
