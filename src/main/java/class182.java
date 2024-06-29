import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class182 {

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "[I")
    public static int[] field2994 = new int[100];

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "Lij;")
    public static class50 field2998 = class78.method578(127, "labels)3dat");

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "S")
    public static short field2999 = 256;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "[I")
    public static int[] field2995 = new int[4096];

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Lij;")
    public static class50 field3003;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "Lne;")
    public static class116 field3004;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "Lij;")
    private static class50 field3005;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Lij;")
    public static class50 field3002;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "[Z")
    public static boolean[] field2993;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILff;)V")
    public static final void method1235(int arg0, class237 arg1) {
        field3000++;
        if (arg0 <= 26 || arg1.field3968 == 0) {
            return;
        }
        if (arg1.field3995 != -1 && arg1.field3995 < 32768) {
            class53 var2 = class41.field764[arg1.field3995];
            if (var2 != null) {
                int var3 = arg1.field3990 - var2.field3990;
                int var4 = arg1.field4027 - var2.field4027;
                if (var3 != 0 || var4 != 0) {
                    arg1.field3992 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field3995 >= 32768) {
            int var5 = arg1.field3995 - 32768;
            if (class240.field4124 == var5) {
                var5 = 2047;
            }
            class187 var6 = class71.field1370[var5];
            if (var6 != null) {
                int var7 = arg1.field3990 - var6.field3990;
                int var8 = arg1.field4027 - var6.field4027;
                if (var7 != 0 || var8 != 0) {
                    arg1.field3992 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field3971 != 0 || arg1.field4001 != 0) && (arg1.field4015 == 0 || arg1.field4020 > 0)) {
            int var9 = arg1.field3990 - ((arg1.field3971 - class61.field1124 - class61.field1124) * 64) - (-(arg1.field3976 * 64) - -64);
            int var10 = (arg1.field3976 - 1) * 64 + arg1.field4027 - (-class254.field4394 + arg1.field4001 - class254.field4394) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field3992 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field3971 = 0;
            arg1.field4001 = 0;
        }
        int var11 = arg1.field3992 - arg1.field3993 & 0x7FF;
        if (var11 == 0) {
            arg1.field4033 = 0;
            return;
        }
        arg1.field4033++;
        if (var11 > 1024) {
            boolean var12 = true;
            arg1.field3993 -= arg1.field3968;
            if (arg1.field3968 > var11 || var11 > 2048 - arg1.field3968) {
                var12 = false;
                arg1.field3993 = arg1.field3992;
            }
            if (arg1.field3996 == arg1.field3965 && (arg1.field4033 > 25 || var12)) {
                if (arg1.field3974 == -1) {
                    arg1.field3996 = arg1.field4000;
                } else {
                    arg1.field3996 = arg1.field3974;
                }
            }
        } else {
            boolean var13 = true;
            arg1.field3993 += arg1.field3968;
            if (arg1.field3968 > var11 || 2048 - arg1.field3968 < var11) {
                arg1.field3993 = arg1.field3992;
                var13 = false;
            }
            if (arg1.field3996 == arg1.field3965 && (arg1.field4033 > 25 || var13)) {
                if (arg1.field3986 == -1) {
                    arg1.field3996 = arg1.field4000;
                } else {
                    arg1.field3996 = arg1.field3986;
                }
            }
        }
        arg1.field3993 &= 0x7FF;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lwd;B)V")
    public static final void method1236(class217 arg0, byte arg1) {
        field2997++;
        if (class211.field3506 != null) {
            try {
                class211.field3506.method562(0L, -48);
                class211.field3506.method569((byte) -33, 24, arg0.field3633, arg0.field3581);
            } catch (Exception var2) {
            }
        }
        arg0.field3581 += 24;
        if (arg1 <= 41) {
            method1237((byte) 122, 46, (class22) null);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BILda;)Z")
    public static final boolean method1237(byte arg0, int arg1, class22 arg2) {
        field3001++;
        if (arg0 != 43) {
            field2993 = null;
        }
        byte[] var3 = arg2.method183(true, arg1);
        if (var3 == null) {
            return false;
        } else {
            class189.method1277(arg0 ^ 0x2A, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)I")
    public static final int method1238(int arg0, byte arg1) {
        if (arg1 != 43) {
            field3003 = null;
        }
        field2996++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method1239(int arg0) {
        field2998 = null;
        field3005 = null;
        field2994 = null;
        int var1 = 70 % ((9 - arg0) / 60);
        field2993 = null;
        field3003 = null;
        field2995 = null;
        field3002 = null;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2995[var0] = class163.method1140(var0, false);
        }
        field3003 = class78.method578(127, "Freie Welt");
        field3004 = null;
        field3005 = class78.method578(122, "World");
        field3002 = field3005;
    }
}
