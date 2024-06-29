import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class238 {

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "Lti;")
    private class5 field4153 = new class5(256);

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "Lti;")
    private class5 field4165 = new class5(256);

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "Lue;")
    private class86 field4162;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "Lue;")
    private class86 field4145;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Loh;")
    public static class263 field4143 = class253.method1681(-117, "::clientdrop");

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "Loh;")
    public static class263 field4146 = class253.method1681(-118, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "[Lqj;")
    public static class144[] field4148 = new class144[6];

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "Loh;")
    public static class263 field4149 = class253.method1681(-123, ": ");

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "Loh;")
    public static class263 field4161 = class253.method1681(-120, "hint_mapedge");

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "Loh;")
    public static class263 field4160 = class253.method1681(-123, "Hidden)2use");

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "[Loh;")
    public static class263[] field4159 = new class263[200];

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "[S")
    public static short[] field4157 = new short[256];

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    public static int field4164 = 0;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "Lue;")
    public static class86 field4156;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "[Lbb;")
    public static class88[] field4155;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static final void method1588(byte arg0) {
        field4144++;
        if (class59.field1223 == 2) {
            if (class137.field2497 == class122.field2269 && class5.field95 == class46.field1004) {
                class59.field1223 = 0;
                if (class176.field3176 && class248.field4342[81] && class252.field4384 > 2) {
                    class159.method1038((byte) -91, class252.field4384 - 2);
                } else {
                    class159.method1038((byte) -91, class252.field4384 - 1);
                }
            }
        } else if (class57.field1173 == class122.field2269 && class5.field95 == class31.field777) {
            class59.field1223 = 0;
            if (class176.field3176 && class248.field4342[81] && class252.field4384 > 2) {
                class159.method1038((byte) -91, class252.field4384 - 2);
            } else {
                class159.method1038((byte) -91, class252.field4384 - 1);
            }
        } else {
            class59.field1223 = 2;
            class46.field1004 = class31.field777;
            class137.field2497 = class57.field1173;
        }
        if (arg0 <= 75) {
            method1595(false);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBI[I)Lik;")
    private final class250 method1589(int arg0, byte arg1, int arg2, int[] arg3) {
        field4158++;
        int var5 = arg0 ^ (arg2 >>> 12 | (arg2 & 0x30000FFF) << 4);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class250 var9 = (class250) this.field4165.method31(-32665, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class132 var10 = (class132) this.field4153.method31(-32665, var7);
            if (var10 == null) {
                var10 = class132.method849(this.field4145, arg2, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field4153.method33(var10, var7, -127);
            }
            class250 var11 = var10.method850(arg3);
            if (var11 == null) {
                return null;
            }
            if (arg1 != 108) {
                method1592(-79, 18);
            }
            var10.method1614(-1204826926);
            this.field4165.method33(var11, var7, -119);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([III)Lik;")
    public final class250 method1590(int[] arg0, int arg1, int arg2) {
        field4151++;
        if (this.field4145.method574((byte) -122) == 1) {
            return this.method1589(arg1, (byte) 108, 0, arg0);
        } else if (this.field4145.method587((byte) 115, arg1) == 1) {
            return this.method1589(0, (byte) 108, arg1, arg0);
        } else if (arg2 == 81) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[II)Lik;")
    private final class250 method1591(int arg0, int arg1, int[] arg2, int arg3) {
        field4147++;
        int var5 = arg3 ^ (arg0 & 0xFFF << 4 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class250 var9 = (class250) this.field4165.method31(-32665, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            int var10 = 69 % ((-arg1 - 28) / 56);
            class193 var11 = class193.method1261(this.field4162, arg0, arg3);
            if (var11 == null) {
                return null;
            }
            class250 var12 = var11.method1263();
            this.field4165.method33(var12, var7, -120);
            if (arg2 != null) {
                arg2[0] -= var12.field4361.length;
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)I")
    public static final int method1592(int arg0, int arg1) {
        if (arg0 != -479449948) {
            field4146 = null;
        }
        field4152++;
        return arg1 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[I)Lik;")
    public final class250 method1593(int arg0, int arg1, int[] arg2) {
        field4154++;
        if (this.field4162.method574((byte) -122) == 1) {
            return this.method1591(0, arg1 - 3111, arg2, arg0);
        } else if (this.field4162.method587((byte) 115, arg0) == 1) {
            return this.method1591(arg0, arg1 ^ 0xB9B, arg2, 0);
        } else if (arg1 == 2998) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4150++;
        if (arg7 != -30499 || arg4 < 1 || arg0 < 1 || arg4 > 102 || arg0 > 102) {
            return;
        }
        if (!class77.method526(arg7 ^ 0x1F0F) && (class77.field1576[0][arg4][arg0] & 0x2) == 0) {
            int var8 = arg1;
            if ((class77.field1576[arg1][arg4][arg0] & 0x8) != 0) {
                var8 = 0;
            }
            if (class171.field3128 != var8) {
                return;
            }
        }
        int var9 = arg1;
        if (arg1 < 3 && (class77.field1576[1][arg4][arg0] & 0x2) == 2) {
            var9 = arg1 + 1;
        }
        class16.method116(arg0, var9, arg3, class103.field1954[arg1], (byte) -71, arg1, arg4);
        if (arg5 < 0) {
            return;
        }
        boolean var10 = class146.field2670;
        class146.field2670 = true;
        class13.method107(arg5, false, arg6, var9, (byte) -21, arg0, arg2, arg4, arg1, class103.field1954[arg1], false);
        class146.field2670 = var10;
        return;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V")
    public static void method1595(boolean arg0) {
        field4155 = null;
        field4156 = null;
        field4157 = null;
        field4160 = null;
        field4149 = null;
        field4161 = null;
        field4148 = null;
        field4159 = null;
        field4146 = null;
        if (arg0) {
            field4143 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lue;Lue;)V")
    public class238(class86 arg0, class86 arg1) {
        this.field4162 = arg0;
        this.field4145 = arg1;
    }
}
