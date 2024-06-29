import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class14 extends class115 {

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "Lub;")
    private class227 field266 = class37.field616;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
    public static int field257 = 0;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "[I")
    public static int[] field265 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "Lub;")
    private static class227 field262 = class257.method1749("You can(Wt add yourself to your own friend list)3", 17263);

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "Lub;")
    public static class227 field261 = class257.method1749("settings", 17263);

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
    public static int field269 = 0;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "Lub;")
    public static class227 field264 = field262;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "[B")
    public static byte[] field272 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "I")
    public static int field274 = 0;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "[Z")
    public static boolean[] field271 = new boolean[8];

    @OriginalMember(owner = "client!ai", name = "eb", descriptor = "I")
    public static int field277 = 0;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    public int field259;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "I")
    private int field273;

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "I")
    public int field276;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "Loc;")
    public static class188 field263;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "Lbc;")
    private class201 field255;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "Lnh;")
    public static class57 field270;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(BI)I")
    public final int method65(byte arg0, int arg1) {
        field258++;
        if (this.field255 == null) {
            return this.field273;
        } else if (arg0 > -10) {
            return -12;
        } else {
            class216 var3 = (class216) this.field255.method1298(-125, (long) arg1);
            return var3 == null ? this.field273 : var3.field3637;
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(Z)V")
    public static void method66(boolean arg0) {
        field261 = null;
        field263 = null;
        field264 = null;
        if (!arg0) {
            return;
        }
        field270 = null;
        field271 = null;
        field272 = null;
        field265 = null;
        field262 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZIIJ)Lub;")
    public static final class227 method67(boolean arg0, int arg1, int arg2, long arg3) {
        field268++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        if (arg2 != -2) {
            field264 = null;
        }
        long var5 = arg3 / (long) arg1;
        int var7 = 1;
        while (var5 != 0L) {
            var5 /= (long) arg1;
            var7++;
        }
        int var8 = var7;
        if (arg3 < 0L || arg0) {
            var8 = var7 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg3 < 0L) {
            var9[0] = 45;
        } else if (arg0) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var7; var10++) {
            int var12 = (int) (arg3 % (long) arg1);
            if (var12 < 0) {
                var12 = -var12;
            }
            arg3 /= (long) arg1;
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
        }
        class227 var11 = new class227();
        var11.field3955 = var9;
        var11.field3915 = var8;
        return var11;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lnj;II)V")
    private final void method68(class226 arg0, int arg1, int arg2) {
        field267++;
        if (arg2 != 6) {
            this.method68((class226) null, -71, 0);
        }
        if (arg1 == 1) {
            this.field259 = arg0.method1471(255);
        } else if (arg1 == 2) {
            this.field276 = arg0.method1471(255);
        } else if (arg1 == 3) {
            this.field266 = arg0.method1480(-115);
        } else if (arg1 == 4) {
            this.field273 = arg0.method1478(-32053);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method1447(0);
            this.field255 = new class201(class45.method239(var4, false));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1478(-32053);
                class60 var7;
                if (arg1 == 5) {
                    var7 = new class165(arg0.method1480(arg2 + 43));
                } else {
                    var7 = new class216(arg0.method1478(arg2 ^ 0xFFFF82CD));
                }
                this.field255.method1300(var7, (long) var6, -2875);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLnd;BLn;Ln;)V")
    public static final void method69(boolean arg0, class202 arg1, byte arg2, class138 arg3, class138 arg4) {
        field260++;
        class144.field2473 = arg4;
        class78.field1377 = arg3;
        if (arg2 != 100) {
            method69(true, (class202) null, (byte) -118, (class138) null, (class138) null);
        }
        class167.field2797 = arg0;
        int var5 = class144.field2473.method877(-51) - 1;
        class4.field83 = var5 * 256 + class144.field2473.method875(-2, var5);
        class98.field1714 = arg1;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Lub;")
    public final class227 method70(int arg0, int arg1) {
        if (arg1 != -3) {
            method72(7);
        }
        field254++;
        if (this.field255 == null) {
            return this.field266;
        } else {
            class165 var3 = (class165) this.field255.method1298(-103, (long) arg0);
            return var3 == null ? this.field266 : var3.field2765;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lnj;I)V")
    public final void method71(class226 arg0, int arg1) {
        field275++;
        while (true) {
            int var3 = arg0.method1471(255);
            if (var3 == 0) {
                if (arg1 > -110) {
                    method69(true, (class202) null, (byte) 10, (class138) null, (class138) null);
                    return;
                } else {
                    return;
                }
            }
            this.method68(arg0, var3, 6);
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public static final void method72(int arg0) {
        class142.field2441.method1728(true);
        field256++;
        if (arg0 != 0) {
            field264 = null;
        }
    }
}
