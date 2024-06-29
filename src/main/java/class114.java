import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class114 extends class67 {

    @OriginalMember(owner = "client!ta", name = "ib", descriptor = "I")
    public int field2753 = 0;

    @OriginalMember(owner = "client!ta", name = "db", descriptor = "Z")
    public static boolean field2748 = false;

    @OriginalMember(owner = "client!ta", name = "fb", descriptor = "Lgd;")
    private static class40 field2750 = class14.method90(false, "On");

    @OriginalMember(owner = "client!ta", name = "gb", descriptor = "Lgd;")
    public static class40 field2751 = class14.method90(false, "Lade Ignorieren)2Liste)3)3)3");

    @OriginalMember(owner = "client!ta", name = "hb", descriptor = "I")
    public static int field2752 = 0;

    @OriginalMember(owner = "client!ta", name = "bb", descriptor = "I")
    public static int field2746 = 127;

    @OriginalMember(owner = "client!ta", name = "Y", descriptor = "Lgd;")
    public static class40 field2743 = field2750;

    @OriginalMember(owner = "client!ta", name = "kb", descriptor = "Lgd;")
    public static class40 field2755 = class14.method90(false, "Fps:");

    @OriginalMember(owner = "client!ta", name = "cb", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!ta", name = "eb", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!ta", name = "jb", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!ta", name = "mb", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!ta", name = "Z", descriptor = "Lse;")
    public static class113 field2744;

    @OriginalMember(owner = "client!ta", name = "lb", descriptor = "[I")
    public static int[] field2756;

    @OriginalMember(owner = "client!ta", name = "ab", descriptor = "[Lhd;")
    public static class46[] field2745;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V", line = 11)
    public static void method881(byte arg0) {
        field2743 = null;
        field2744 = null;
        field2751 = null;
        field2745 = null;
        field2750 = null;
        field2756 = null;
        if (arg0 > -52) {
            field2746 = 18;
        }
        field2755 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILrc;I)V", line = 32)
    private final void method882(int arg0, class104 arg1, int arg2) {
        if (arg0 == 5) {
            this.field2753 = arg1.method797(-7916);
        }
        int var4 = 9 % ((arg2 + 42) / 52);
        field2747++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILrc;)V", line = 57)
    public final void method883(int arg0, class104 arg1) {
        field2754++;
        while (true) {
            int var3 = arg1.method798((byte) -110);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    field2751 = null;
                    return;
                }
            }
            this.method882(var3, arg1, arg0 ^ 0x60);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)Lcb;", line = 87)
    public static final class14 method884(int arg0, byte arg1) {
        class14 var2 = (class14) class11.field286.method39(-127, (long) arg0);
        field2757++;
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -56) {
            field2756 = null;
        }
        byte[] var3 = class44.field1105.method731(arg0, 6, (byte) -108);
        class14 var4 = new class14();
        var4.field409 = arg0;
        if (var3 != null) {
            var4.method82(new class104(var3), (byte) 119);
        }
        var4.method89(74);
        if (var4.field383) {
            var4.field379 = false;
            var4.field410 = false;
        }
        class11.field286.method38(var4, (long) arg0, true);
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLrc;IIIIII)V", line = 129)
    public static final void method885(byte arg0, class104 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 > -51) {
            field2748 = true;
        }
        field2749++;
        if (arg2 < 0 || arg2 >= 104 || arg5 < 0 || arg5 >= 104) {
            while (true) {
                int var10 = arg1.method798((byte) -89);
                if (var10 == 0) {
                    return;
                }
                if (var10 == 1) {
                    arg1.method798((byte) -89);
                    return;
                }
                if (var10 <= 49) {
                    arg1.method798((byte) -89);
                }
            }
        }
        class112.field2716[arg7][arg2][arg5] = 0;
        while (true) {
            int var8 = arg1.method798((byte) -109);
            if (var8 == 0) {
                if (arg7 == 0) {
                    class89.field2021[0][arg2][arg5] = -class110.method854(arg5 + arg4 + 556238, true, arg3 + arg2 + 932731) * 8;
                    return;
                } else {
                    class89.field2021[arg7][arg2][arg5] = class89.field2021[arg7 - 1][arg2][arg5] - 240;
                    return;
                }
            }
            if (var8 == 1) {
                int var9 = arg1.method798((byte) -62);
                if (var9 == 1) {
                    var9 = 0;
                }
                if (arg7 == 0) {
                    class89.field2021[0][arg2][arg5] = -var9 * 8;
                    return;
                }
                class89.field2021[arg7][arg2][arg5] = class89.field2021[arg7 - 1][arg2][arg5] - var9 * 8;
                return;
            }
            if (var8 <= 49) {
                class74.field1724[arg7][arg2][arg5] = arg1.method781(255);
                class131.field3186[arg7][arg2][arg5] = (byte) ((var8 - 2) / 4);
                class130.field3150[arg7][arg2][arg5] = (byte) class101.method709(arg6 + var8 - 2, 3);
            } else if (var8 <= 81) {
                class112.field2716[arg7][arg2][arg5] = (byte) (var8 - 49);
            } else {
                class24.field566[arg7][arg2][arg5] = (byte) (var8 - 81);
            }
        }
    }
}
