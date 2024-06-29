import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class216 extends class213 {

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "I")
    public static volatile int field4008 = 0;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "Lvd;")
    private static class222 field4001 = class212.method1357("cyan:", 10731);

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "Lvd;")
    public static class222 field4009 = field4001;

    @OriginalMember(owner = "client!uh", name = "fb", descriptor = "Lvd;")
    public static class222 field4017 = field4001;

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "Lig;")
    public static class93 field3998 = new class93(64);

    @OriginalMember(owner = "client!uh", name = "gb", descriptor = "I")
    public static int field4018 = 0;

    @OriginalMember(owner = "client!uh", name = "hb", descriptor = "Lvd;")
    public static class222 field4019 = class212.method1357("hint_mapedge", 10731);

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "I")
    public int field4002;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
    public int field4005;

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!uh", name = "ab", descriptor = "I")
    public int field4012;

    @OriginalMember(owner = "client!uh", name = "bb", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!uh", name = "db", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!uh", name = "eb", descriptor = "I")
    public int field4016;

    @OriginalMember(owner = "client!uh", name = "Z", descriptor = "Lvd;")
    public class222 field4011;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "[I")
    public int[] field4006;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "[I")
    public int[] field4007;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "[Lvd;")
    public class222[] field3997;

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "[Lwd;")
    public class232[] field3999;

    @OriginalMember(owner = "client!uh", name = "cb", descriptor = "[[[B")
    public static byte[][][] field4014;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BILab;ZLab;)Lj;")
    public static final class97 method1371(byte arg0, int arg1, class3 arg2, boolean arg3, class3 arg4) {
        field4004++;
        int[] var5 = arg4.method26(arg1, 0);
        boolean var6 = true;
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg4.method43(1, var5[var7], arg1);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg3) {
                    var10 = arg2.method43(1, var9, 0);
                } else {
                    var10 = arg2.method43(1, 0, var9);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            int var11 = 72 / ((arg0 + 16) / 60);
            return new class97(arg4, arg2, arg1, arg3);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIII)I")
    public static final int method1372(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -25979) {
            field4017 = null;
        }
        field4003++;
        int var4 = arg1 - 1 & arg3;
        int var5 = arg3 / arg1;
        int var6 = arg2 & arg1 - 1;
        int var7 = arg2 / arg1;
        int var8 = class185.method1163(-3649, var5, var7);
        int var9 = class185.method1163(arg0 + 22330, var5 - -1, var7);
        int var10 = class185.method1163(-3649, var5, var7 + 1);
        int var11 = class185.method1163(arg0 ^ 0x6B3A, var5 + 1, var7 + 1);
        int var12 = class184.method1157(var4, var8, (byte) -57, arg1, var9);
        int var13 = class184.method1157(var4, var10, (byte) -57, arg1, var11);
        return class184.method1157(var6, var12, (byte) -57, arg1, var13);
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)I")
    public static final int method1373(int arg0, int arg1) {
        field4010++;
        if (arg0 > -113) {
            method1373(-125, -67);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lab;ILvd;Lvd;)[Lva;")
    public static final class219[] method1374(class3 arg0, int arg1, class222 arg2, class222 arg3) {
        field4013++;
        if (arg1 != 1288) {
            method1374(null, 39, null, null);
        }
        int var4 = arg0.method14(-32249, arg2);
        int var5 = arg0.method30(arg3, var4, (byte) 58);
        return class210.method1338(var4, -1, arg0, var5);
    }

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "(I)V")
    public static final void method1375(int arg0) {
        field4015++;
        if (arg0 < 4) {
            field4009 = null;
        }
        class34.field757.method596(false);
        class107.field1974.method1072((byte) -38);
        class73.field1453.method596(false);
    }

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "(I)V")
    public static void method1376(int arg0) {
        field4001 = null;
        field4014 = null;
        field3998 = null;
        field4009 = null;
        field4019 = null;
        field4017 = null;
        if (arg0 != 0) {
            method1376(29);
        }
    }
}
