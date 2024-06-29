import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class101 extends class189 {

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "Ljw;")
    public class554 field1210;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "Z")
    public boolean field1211;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field1206 = 0;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field1199 = 0;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field1203 = 0;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "[F")
    public static float[] field1200 = new float[4];

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "Lca;")
    public static class305 field1201;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "Z")
    public boolean field1198;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "Z")
    public boolean field1209;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "Z")
    public boolean field1212;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V", line = 4)
    public static void method727(byte arg0) {
        int var1 = 23 % ((6 - arg0) / 56);
        field1201 = null;
        field1200 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/lang/String;ZIZZLjava/lang/String;)V", line = 16)
    public static final void method728(int arg0, String arg1, boolean arg2, int arg3, boolean arg4, boolean arg5, String arg6) {
        field1205++;
        class48.field567.field4496 = 1;
        String var7 = arg6.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg0 != -1) {
            class82 var11 = class605.field8497.method154(arg0, (byte) -85);
            if (var11 == null || var11.method634(0) != arg2) {
                return;
            }
            if (var11.method634(0)) {
                var10 = var11.field1031;
            } else {
                var9 = var11.field1025;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class682.field9361.field8546; var13++) {
            class551 var16 = class682.field9361.method3424(var13, false);
            if ((!arg4 || var16.field7715) && var16.field7707 == -1 && var16.field7725 == -1 && var16.field7718 == 0 && var16.field7677.toLowerCase().indexOf(var7) != -1) {
                if (arg0 != -1) {
                    if (arg2) {
                        if (!arg1.equals(var16.method3194(arg0, (byte) 46, var10))) {
                            continue;
                        }
                    } else if (var16.method3198(var9, arg0, 45) != arg3) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class565.field8026 = -1;
                    class698.field9631 = null;
                    return;
                }
                if (var8.length <= var12) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; var18++) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        class698.field9631 = var8;
        class538.field7552 = 0;
        class565.field8026 = var12;
        if (!arg5) {
            return;
        }
        String[] var14 = new String[class565.field8026];
        for (int var15 = 0; var15 < class565.field8026; var15++) {
            var14[var15] = class682.field9361.method3424(var8[var15], !arg5).field7677;
        }
        class591.method3341(var14, class698.field9631, (byte) 91);
        class48.field567.method2081(-123);
        class48.field567.field4496 = 2;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIIIILdp;ILfv;I)V", line = 139)
    public static final void method729(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class3 arg8, int arg9, class120 arg10, int arg11) {
        class388.field5489 = arg11;
        class727.field10177 = null;
        class522.field7402 = arg8;
        class270.field3861 = arg4;
        class440.field6276 = arg1;
        class192.field2564 = null;
        field1197++;
        class530.field7474 = arg7;
        class221.field2884 = arg9;
        if (arg2 != -1870) {
            method729(-51, -78, 0, 36, 104, -8, 103, -69, null, -80, null, 75);
        }
        class721.field10006 = arg0;
        class658.field9018 = arg10;
        class2.field15 = arg5;
        class560.field7873 = arg6;
        class213.field2804 = null;
        class716.field9962 = arg3;
        class322.method2073(402);
        class472.field6694 = true;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 169)
    public static final boolean method730(String arg0, byte arg1) {
        field1204++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class261.field3764; var2++) {
            if (arg0.equalsIgnoreCase(class608.field8561[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class598.field8404[var2])) {
                return true;
            }
        }
        int var3 = -35 % ((arg1 - 19) / 60);
        return false;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(ILjw;IZ)V", line = 208)
    public class101(int arg0, class554 arg1, int arg2, boolean arg3) {
        this.field1210 = arg1;
        this.field1202 = arg0;
        this.field1207 = arg2;
        this.field1211 = arg3;
    }
}
