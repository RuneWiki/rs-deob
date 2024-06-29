import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class21 extends class7 {

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "I")
    private int field355 = 0;

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "I")
    private int field356 = 4096;

    @OriginalMember(owner = "client!c", name = "S", descriptor = "I")
    public static int field348 = 0;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "Lob;")
    public static class141 field350 = class175.method1195(40, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!c", name = "eb", descriptor = "Lob;")
    private static class141 field360 = class175.method1195(40, "Loaded config");

    @OriginalMember(owner = "client!c", name = "cb", descriptor = "Lob;")
    public static class141 field358 = class175.method1195(40, "hint_headicons");

    @OriginalMember(owner = "client!c", name = "db", descriptor = "Lob;")
    public static class141 field359 = field360;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!c", name = "W", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "Lwd;")
    public static class221 field354;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        ++field347;
        int var4 = 101 / ((arg1 - 66) / 57);
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field99 = arg2.method991(255) == 1;
                }
            } else {
                this.field356 = arg2.method1007(46);
            }
        } else {
            this.field355 = arg2.method1007(38);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        ++field353;
        if (arg0 <= 13) {
            field359 = null;
        }
        int[] var3 = super.field100.method842(arg1, 12);
        if (super.field100.field2534) {
            int[] var4 = this.method52(arg1, 0, 87);
            for (int var5 = 0; var5 < class117.field2272; ++var5) {
                int var6 = var4[var5];
                if (var6 >= this.field355) {
                    if (var6 <= this.field356) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field356;
                    }
                } else {
                    var3[var5] = this.field355;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lob;Lob;Lob;B)V")
    public static final void method127(class141 arg0, class141 arg1, class141 arg2, byte arg3) {
        class105.field2024 = arg2;
        class105.field2019 = arg1;
        if (arg3 == -70) {
            class105.field2025 = arg0;
            ++field357;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lph;ZB)V")
    public static final void method128(class157 arg0, boolean arg1, byte arg2) {
        ++field349;
        if (arg2 > 27) {
            if (class176.field3494 != null) {
                try {
                    class176.field3494.method1089(-2);
                } catch (Exception var8) {
                }
                class176.field3494 = null;
            }
            class176.field3494 = arg0;
            class160.method1121(arg1, -8496);
            class219.field4145.field2865 = 0;
            class209.field3984 = null;
            class57.field1104 = null;
            class62.field1214 = 0;
            while (true) {
                class209 var3 = (class209) class154.field2974.method799((byte) 117);
                if (var3 == null) {
                    while (true) {
                        class209 var4 = (class209) class177.field3498.method799((byte) 117);
                        if (var4 == null) {
                            if (~class191.field3689 != -1) {
                                try {
                                    class146 var5 = new class146(4);
                                    var5.method997(125, 4);
                                    var5.method997(102, class191.field3689);
                                    var5.method972(26894, 0);
                                    class176.field3494.method1093(39, var5.field2859, 4, 0);
                                } catch (IOException var7) {
                                    try {
                                        class176.field3494.method1089(-2);
                                    } catch (Exception var6) {
                                    }
                                    class176.field3494 = null;
                                    ++class38.field752;
                                }
                            }
                            class78.field1579 = 0;
                            class178.field3514 = class1.method2((byte) -75);
                            return;
                        }
                        class126.field2417.method812(var4, -64);
                        class202.field3819.method797(var4, var4.field4067, true);
                        ++class93.field1854;
                        --class151.field2900;
                    }
                }
                class164.field3160.method797(var3, var3.field4067, true);
                ++class68.field1339;
                --class176.field3487;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IB)[[I")
    public final int[][] method51(int arg0, byte arg1) {
        ++field351;
        int var3 = 67 / ((arg1 - -42) / 41);
        int[][] var4 = super.field97.method1396(arg0, (byte) 45);
        if (super.field97.field4093) {
            int[][] var5 = this.method42(arg0, 66, 0);
            int[] var6 = var5[1];
            int[] var7 = var5[2];
            int[] var8 = var5[0];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            for (int var12 = 0; ~var12 > ~class117.field2272; ++var12) {
                int var13 = var8[var12];
                int var14 = var6[var12];
                int var15 = var7[var12];
                if (var13 >= this.field355) {
                    if (~var13 >= ~this.field356) {
                        var9[var12] = var13;
                    } else {
                        var9[var12] = this.field356;
                    }
                } else {
                    var9[var12] = this.field355;
                }
                if (this.field355 > var14) {
                    var11[var12] = this.field355;
                } else if (var14 <= this.field356) {
                    var11[var12] = var14;
                } else {
                    var11[var12] = this.field356;
                }
                if (var15 >= this.field355) {
                    if (this.field356 >= var15) {
                        var10[var12] = var15;
                    } else {
                        var10[var12] = this.field356;
                    }
                } else {
                    var10[var12] = this.field355;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIILaa;IJIIII)Z")
    public static final boolean method129(int arg0, int arg1, int arg2, int arg3, class2 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class95.method642(arg0, arg7, arg8, arg9 - arg7 + 1, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
    public static void method130(byte arg0) {
        field354 = null;
        field358 = null;
        field360 = null;
        if (arg0 == 5) {
            field359 = null;
            field350 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class21() {
        super(1, false);
    }
}
