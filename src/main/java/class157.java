import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class157 extends class142 {

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "Lai;")
    public static class10 field3023 = class44.method278("Bitte starten Sie eine Mitgliedschaft", -52);

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
    public static int field3026 = 0;

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "Lai;")
    public static class10 field3031 = class44.method278(": ", -99);

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "[[I")
    public static int[][] field3029 = new int[5][5000];

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "Lai;")
    private static class10 field3028 = class44.method278("green:", 113);

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "Lai;")
    public static class10 field3025 = class44.method278("<col=ffb000>", -93);

    @OriginalMember(owner = "client!rc", name = "ab", descriptor = "I")
    public static int field3032 = 0;

    @OriginalMember(owner = "client!rc", name = "db", descriptor = "Lai;")
    public static class10 field3035 = class44.method278("Lade)3)3)3", 92);

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "Lai;")
    public static class10 field3024 = field3028;

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
    public static int field3030 = 0;

    @OriginalMember(owner = "client!rc", name = "gb", descriptor = "Lai;")
    public static class10 field3038 = field3028;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "Lai;")
    public static class10 field3027 = class44.method278("Ladevorgang )2 bitte warten Sie)3", 96);

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!rc", name = "bb", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!rc", name = "cb", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!rc", name = "eb", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!rc", name = "fb", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!rc", name = "hb", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
    public static void method1055(int arg0) {
        field3027 = null;
        field3023 = null;
        if (arg0 <= 35) {
            field3027 = null;
        }
        field3031 = null;
        field3025 = null;
        field3028 = null;
        field3029 = null;
        field3038 = null;
        field3035 = null;
        field3024 = null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class157() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(BI)V")
    public static final void method1056(byte arg0, int arg1) {
        ++field3039;
        class196.method1248((byte) 89);
        class166.method1101(-9741);
        int var2 = class45.method280(16, arg1).field299;
        if (~var2 != -1) {
            int var3 = class13.field215[arg1];
            if (~var2 == -2) {
                if (~var3 == -2) {
                    class113.method749(0.9F);
                }
                if (var3 == 2) {
                    class113.method749(0.8F);
                }
                if (~var3 == -4) {
                    class113.method749(0.7F);
                }
                if (~var3 == -5) {
                    class113.method749(0.6F);
                }
                class190.method1212((byte) 17);
            }
            if (arg0 <= -121) {
                if (~var2 == -4) {
                    short var4 = 0;
                    if (~var3 == -1) {
                        var4 = 255;
                    }
                    if (var3 == 1) {
                        var4 = 192;
                    }
                    if (~var3 == -3) {
                        var4 = 128;
                    }
                    if (~var3 == -4) {
                        var4 = 64;
                    }
                    if (var3 == 4) {
                        var4 = 0;
                    }
                    if (~class93.field1688 != ~var4) {
                        if (~class93.field1688 == -1 && ~class106.field1966 != 0) {
                            class205.method1323(var4, 10000, class5.field67, false, class106.field1966, 0);
                            class61.field1040 = false;
                        } else if (~var4 != -1) {
                            class154.method1046(var4, -49);
                        } else {
                            class37.method249((byte) -77);
                            class61.field1040 = false;
                        }
                        class93.field1688 = var4;
                    }
                }
                if (var2 == 9) {
                    class77.field1349 = var3;
                }
                if (var2 == 5) {
                    class27.field406 = var3;
                }
                if (var2 == 6) {
                    class172.field3324 = var3;
                }
                if (~var2 == -5) {
                    if (var3 == 0) {
                        class40.field676 = 127;
                    }
                    if (var3 == 1) {
                        class40.field676 = 96;
                    }
                    if (var3 == 2) {
                        class40.field676 = 64;
                    }
                    if (~var3 == -4) {
                        class40.field676 = 32;
                    }
                    if (var3 == 4) {
                        class40.field676 = 0;
                    }
                }
                if (var2 == 10) {
                    if (~var3 == -1) {
                        class120.field2317 = 127;
                    }
                    if (~var3 == -2) {
                        class120.field2317 = 96;
                    }
                    if (~var3 == -3) {
                        class120.field2317 = 64;
                    }
                    if (var3 == 3) {
                        class120.field2317 = 32;
                    }
                    if (~var3 == -5) {
                        class120.field2317 = 0;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        ++field3034;
        if (arg0) {
            this.method6(false, 10);
        }
        if (super.field2683.field3516) {
            int[] var4 = this.method963((byte) -121, 0, arg1);
            for (int var5 = 0; ~class133.field2499 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        ++field3036;
        if (~arg1 == -1) {
            super.field2684 = arg0.method767(true) == 1;
        }
        if (arg2 > -34) {
            field3026 = -12;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method86(int arg0, boolean arg1) {
        if (arg1) {
            field3023 = null;
        }
        ++field3033;
        int[][] var3 = super.field2666.method956(arg0, -109);
        if (super.field2666.field2664) {
            int[][] var4 = this.method961(2, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class133.field2499; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var7[var11] + 4096;
                var10[var11] = 4096 - var6[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(BII)I")
    public static final int method1057(byte arg0, int arg1, int arg2) {
        int var3 = 0;
        ++field3037;
        int var4 = 57 % ((1 - arg0) / 39);
        while (arg2 > 0) {
            var3 = var3 << 1 | 1 & arg1;
            --arg2;
            arg1 >>>= 1;
        }
        return var3;
    }
}
