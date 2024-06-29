import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class67 extends class25 {

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "Ldf;")
    public static class51 field1099 = class46.method233("hitmarks", 100);

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "[S")
    public static short[] field1103 = new short[500];

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    private int field1096;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "Ldf;")
    public class51 field1091;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "[[B")
    public static byte[][] field1100;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lrb;I)V")
    public static final void method470(class247 arg0, int arg1) {
        field1101++;
        if (arg0.field4307 == 0) {
            return;
        }
        if (arg0.field4355 != -1 && arg0.field4355 < 32768) {
            class83 var2 = class34.field512[arg0.field4355];
            if (var2 != null) {
                int var3 = arg0.field4319 - var2.field4319;
                int var4 = arg0.field4348 - var2.field4348;
                if (var3 != 0 || var4 != 0) {
                    arg0.field4294 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field4355 >= 32768) {
            int var5 = arg0.field4355 - 32768;
            if (class167.field2719 == var5) {
                var5 = 2047;
            }
            class103 var6 = class66.field1055[var5];
            if (var6 != null) {
                int var7 = arg0.field4319 - var6.field4319;
                int var8 = arg0.field4348 - var6.field4348;
                if (var7 != 0 || var8 != 0) {
                    arg0.field4294 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1 != 1) {
            return;
        }
        if ((arg0.field4337 != 0 || arg0.field4295 != 0) && (arg0.field4347 == 0 || arg0.field4296 > 0)) {
            int var9 = arg0.field4319 + ((arg0.field4345 - 1) * 64) - ((-class11.field160 + arg0.field4337 + -class11.field160) * 64);
            int var10 = (arg0.field4345 - 1) * 64 + arg0.field4348 - ((arg0.field4295 - class241.field4179 - class241.field4179) * 64);
            if (var9 != 0 || var10 != 0) {
                arg0.field4294 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field4295 = 0;
            arg0.field4337 = 0;
        }
        int var11 = arg0.field4294 - arg0.field4326 & 0x7FF;
        if (var11 == 0) {
            arg0.field4339 = 0;
            return;
        }
        arg0.field4339++;
        if (var11 <= 1024) {
            boolean var12 = true;
            arg0.field4326 += arg0.field4307;
            if (var11 < arg0.field4307 || 2048 - arg0.field4307 < var11) {
                arg0.field4326 = arg0.field4294;
                var12 = false;
            }
            if (arg0.field4314 == arg0.field4304 && (arg0.field4339 > 25 || var12)) {
                if (arg0.field4297 == -1) {
                    arg0.field4314 = arg0.field4298;
                } else {
                    arg0.field4314 = arg0.field4297;
                }
            }
        } else {
            boolean var13 = true;
            arg0.field4326 -= arg0.field4307;
            if (var11 < arg0.field4307 || var11 > 2048 - arg0.field4307) {
                arg0.field4326 = arg0.field4294;
                var13 = false;
            }
            if (arg0.field4314 == arg0.field4304 && (arg0.field4339 > 25 || var13)) {
                if (arg0.field4275 == -1) {
                    arg0.field4314 = arg0.field4298;
                } else {
                    arg0.field4314 = arg0.field4275;
                }
            }
        }
        arg0.field4326 &= 0x7FF;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)V")
    public static void method471(byte arg0) {
        field1103 = null;
        field1100 = null;
        field1099 = null;
        if (arg0 != 11) {
            method473(36, (class213) null);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BILlb;)V")
    private final void method472(byte arg0, int arg1, class121 arg2) {
        if (arg0 != 60) {
            this.method475((byte) 59, (class121) null);
        }
        if (arg1 == 1) {
            this.field1096 = arg2.method897(105);
        } else if (arg1 == 2) {
            this.field1102 = arg2.method865((byte) 8);
        } else if (arg1 == 5) {
            this.field1091 = arg2.method903((byte) 108);
        }
        field1098++;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILwc;)V")
    public static final void method473(int arg0, class213 arg1) {
        field1105++;
        int var2 = arg1.field3640;
        if (var2 == 324) {
            if (class170.field2765 == -1) {
                class177.field2890 = arg1.field3612;
                class170.field2765 = arg1.field3635;
            }
            if (class265.field4631.field2387) {
                arg1.field3635 = class170.field2765;
            } else {
                arg1.field3635 = class177.field2890;
            }
        } else if (var2 == 325) {
            if (class170.field2765 == -1) {
                class170.field2765 = arg1.field3635;
                class177.field2890 = arg1.field3612;
            }
            if (class265.field4631.field2387) {
                arg1.field3635 = class177.field2890;
            } else {
                arg1.field3635 = class170.field2765;
            }
        } else {
            if (arg0 != -32768) {
                method471((byte) 62);
            }
            if (var2 == 327) {
                arg1.field3586 = 150;
                arg1.field3668 = (int) (Math.sin((double) class179.field2960 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field3649 = 5;
                arg1.field3619 = -1;
            } else if (var2 == 328) {
                if (class44.field706.field1711 == null) {
                    arg1.field3619 = 0;
                } else {
                    arg1.field3586 = 150;
                    arg1.field3668 = (int) (Math.sin((double) class179.field2960 / 40.0D) * 256.0D) & 0x7FF;
                    arg1.field3649 = 5;
                    arg1.field3619 = ((int) class44.field706.field1711.method316(108) << 11) + 2047;
                    arg1.field3697 = class44.field706.field4301;
                    arg1.field3633 = class44.field706.field4314;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)Z")
    public final boolean method474(byte arg0) {
        field1093++;
        if (arg0 >= -1) {
            method471((byte) -19);
        }
        return this.field1096 == 115;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLlb;)V")
    public final void method475(byte arg0, class121 arg1) {
        field1104++;
        if (arg0 <= 53) {
            this.method475((byte) 29, (class121) null);
        }
        while (true) {
            int var3 = arg1.method897(117);
            if (var3 == 0) {
                return;
            }
            this.method472((byte) 60, var3, arg1);
        }
    }
}
