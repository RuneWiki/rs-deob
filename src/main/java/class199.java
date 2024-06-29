import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class199 extends class83 {

    @OriginalMember(owner = "client!dl", name = "N", descriptor = "I")
    public static int field2658 = -1;

    @OriginalMember(owner = "client!dl", name = "L", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!dl", name = "Q", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!dl", name = "S", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!dl", name = "R", descriptor = "Lam;")
    public static class286 field2662;

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "Ljava/lang/String;")
    public static String field2655;

    @OriginalMember(owner = "client!dl", name = "T", descriptor = "Z")
    public static boolean field2664;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BZ)C", line = 3)
    public static final char method1066(byte arg0, boolean arg1) {
        field2661++;
        int var2 = arg0 & 0xFF;
        if (arg1) {
            return (char) 65414;
        } else if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (var2 >= 128 && var2 < 160) {
                char var3 = class429.field6299[var2 - 128];
                if (var3 == '\u0000') {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lvm;Z[[IZI)V", line = 33)
    public static final void method1067(class322 arg0, boolean arg1, int[][] arg2, boolean arg3, int arg4) {
        for (int var5 = 0; var5 < arg4; var5++) {
            int[][] var6;
            if (arg2 == null) {
                var6 = null;
            } else {
                var6 = new int[class315.field4214 + 1][class340.field4549 + 1];
                for (int var7 = 0; var7 <= class340.field4549; var7++) {
                    for (int var8 = 0; var8 <= class315.field4214; var8++) {
                        var6[var8][var7] = class432.field6340[var5][var8][var7] - arg2[var8][var7];
                    }
                }
            }
            int var9 = 0;
            int var10 = 0;
            if (!arg1) {
                if (field2664) {
                    var9 |= 0x2;
                }
                if (class29.field278) {
                    var10 |= 0x8;
                }
                if (class169.field2133 != 0) {
                    if (var5 == 0 || class436.field6389 >= 96) {
                        var10 |= 0x10;
                    }
                    var9 |= 0x1;
                }
            }
            if (field2664) {
                var10 |= 0x7;
            }
            class54 var11 = arg0.method1552(class315.field4214, class340.field4549, class432.field6340[var5], var6, 128, var9, var10);
            class356.method2170(var5, var11);
        }
        if (!arg3) {
            field2657 = 79;
        }
        field2663++;
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(B)V", line = 110)
    public static final void method1068(byte arg0) {
        field2660++;
        class32.field312 = 0;
        class370.field5166 = -1;
        if (arg0 != 62) {
            method1069(-6);
        }
        class149.field1894 = -1;
        class324.field4321 = -1;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)[I", line = 124)
    public final int[] method37(int arg0, int arg1) {
        field2659++;
        if (arg0 != 2) {
            field2664 = true;
        }
        return class402.field5863;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V", line = 143)
    public class199() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V", line = 146)
    public static void method1069(int arg0) {
        int var1 = -126 / ((23 - arg0) / 38);
        field2655 = null;
        field2662 = null;
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)V", line = 161)
    public static final void method1070(int arg0) {
        class172.field2165 = null;
        class62.field629 = null;
        class177.field2221 = null;
        class172.field2158 = null;
        class398.field5751 = null;
        class398.field5736 = null;
        if (arg0 != 32452) {
            return;
        }
        class432.field6340 = null;
        class284.field3879 = null;
        class159.field2058 = null;
        class430.field6321 = null;
        field2656++;
        class110.field1355 = null;
        class127.field1645 = null;
    }
}
