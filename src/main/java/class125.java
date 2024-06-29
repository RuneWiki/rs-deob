import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class125 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lrc;")
    private static class105 field3040 = class43.method374("Loaded interfaces", 0);

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Lrc;")
    public static class105 field3041 = field3040;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Lle;")
    public static class71 field3043 = new class71(64);

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "[[[I")
    public static int[][][] field3050 = new int[4][13][13];

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field3053 = 0;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "Lab;")
    public static class3 field3052 = new class3();

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field3054 = 0;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "Z")
    public static boolean field3046;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "[I")
    public static int[] field3049;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ[B[Lsb;III)V", line = 13)
    public static final void method1011(int arg0, boolean arg1, byte[] arg2, class110[] arg3, int arg4, int arg5, int arg6) {
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg5 + var12 > 0 && arg5 + var12 < 103 && arg0 + var13 > 0 && arg0 + var13 < 103) {
                        arg3[var7].field2548[arg5 + var12][arg0 + var13] = class100.method807(arg3[var7].field2548[arg5 + var12][arg0 + var13], -16777217);
                    }
                }
            }
        }
        field3047++;
        class7 var8 = new class7(arg2);
        int var9 = 0;
        if (arg1) {
            field3050 = null;
        }
        while (var9 < 4) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class129.method1039(var8, 123, arg6, var9, arg5 + var10, 0, arg4, arg0 + var11);
                }
            }
            var9++;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V", line = 88)
    public static final void method1012(byte arg0) {
        field3042++;
        if (class104.field2371 == 1) {
            if (class86.field1937 >= 6 && class86.field1937 <= 106 && class30.field683 >= 467 && class30.field683 <= 499) {
                class92.field2125++;
                class37.field868 = true;
                class90.field2064 = true;
                class17.field370 = (class17.field370 + 1) % 4;
                class66.field1472.method781(26, (byte) -24);
                class66.field1472.method102((byte) 123, class17.field370);
                class66.field1472.method102((byte) 123, class134.field3270);
                class66.field1472.method102((byte) 123, class55.field1106);
            }
            if (class86.field1937 >= 135 && class86.field1937 <= 235 && class30.field683 >= 467 && class30.field683 <= 499) {
                class37.field868 = true;
                class90.field2064 = true;
                class134.field3270 = (class134.field3270 + 1) % 3;
                class92.field2125++;
                class66.field1472.method781(26, (byte) -102);
                class66.field1472.method102((byte) 123, class17.field370);
                class66.field1472.method102((byte) 123, class134.field3270);
                class66.field1472.method102((byte) 123, class55.field1106);
            }
            if (class86.field1937 >= 273 && class86.field1937 <= 373 && class30.field683 >= 467 && class30.field683 <= 499) {
                class90.field2064 = true;
                class92.field2125++;
                class37.field868 = true;
                class55.field1106 = (class55.field1106 + 1) % 3;
                class66.field1472.method781(26, (byte) -11);
                class66.field1472.method102((byte) 123, class17.field370);
                class66.field1472.method102((byte) 123, class134.field3270);
                class66.field1472.method102((byte) 123, class55.field1106);
            }
            if (class86.field1937 >= 412 && class86.field1937 <= 512 && class30.field683 >= 467 && class30.field683 <= 499) {
                if (class18.field418 == -1) {
                    class16.method172(-1);
                    if (class29.field657 != -1) {
                        class43.field1008 = class43.field992;
                        class109.field2519 = false;
                        class39.field897 = class18.field418 = class29.field657;
                    }
                } else {
                    client.method207(class43.field992, -21, 0, class92.field2151);
                }
            }
        }
        int var1 = 87 % ((-arg0 - 27) / 50);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V", line = 158)
    public static void method1013(byte arg0) {
        field3040 = null;
        field3052 = null;
        field3043 = null;
        field3050 = null;
        if (arg0 != -76) {
            field3053 = 73;
        }
        field3041 = null;
        field3049 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)I", line = 173)
    public static final int method1014(int arg0, int arg1, int arg2) {
        class120 var3 = (class120) class17.field349.method624((byte) 95, (long) arg1);
        field3048++;
        if (arg2 != -480) {
            return -109;
        } else if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var3.field2885.length) {
            return var3.field2885[arg0];
        } else {
            return 0;
        }
    }
}
