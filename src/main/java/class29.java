import java.awt.event.ActionEvent;
import java.math.BigInteger;
import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class29 {

    @OriginalMember(owner = "client!te", name = "j", descriptor = "Z")
    public boolean field452 = true;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public int field451;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public int field457;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public int field447;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public int field446;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field449 = 0;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "Lhh;")
    private static class163 field450 = class137.method1065("shake:", 17);

    @OriginalMember(owner = "client!te", name = "k", descriptor = "Lhh;")
    public static class163 field453 = field450;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "Lhh;")
    public static class163 field460 = class137.method1065("cookieprefix", 17);

    @OriginalMember(owner = "client!te", name = "t", descriptor = "Lhh;")
    public static class163 field462 = class137.method1065("sl_back", 17);

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public static int field465 = 0;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "Lhh;")
    public static class163 field459 = field450;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field455 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!te", name = "x", descriptor = "Loj;")
    public static class17 field466 = new class17(100);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "Lek;")
    public static class76 field468;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "[Z")
    public static boolean[] field458;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static void method178(int arg0) {
        field468 = null;
        field459 = null;
        if (arg0 != 0) {
            field449 = 3;
        }
        field455 = null;
        field462 = null;
        field458 = null;
        field450 = null;
        field466 = null;
        field453 = null;
        field460 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIB[B[Lcg;Z)V")
    public static final void method179(int arg0, int arg1, byte arg2, byte[] arg3, class1[] arg4, boolean arg5) {
        field443++;
        int var6 = -1;
        if (arg2 > -6) {
            field453 = null;
        }
        class81 var7 = new class81(arg3);
        while (true) {
            int var8 = var7.method612(true);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var6 += var8;
            while (true) {
                int var10 = var7.method636(38);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = (var9 & 0xFD7) >> 6;
                int var13 = var7.method622(true);
                int var14 = var9 >> 12;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg0 + var12;
                int var18 = var13 >> 2;
                if (var17 > 0 && var16 > 0 && var17 < 103 && var16 < 103) {
                    class1 var19 = null;
                    if (!arg5) {
                        int var20 = var14;
                        if ((class123.field2344[1][var17][var16] & 0x2) == 2) {
                            var20 = var14 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg4[var20];
                        }
                    }
                    class218.method1549(arg5, true, var15, var6, var19, var16, var17, !arg5, var14, var14, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)Z")
    public static final boolean method180(byte arg0, int arg1) {
        field461++;
        if (arg1 < 32) {
            return false;
        }
        if (arg0 > -54) {
            field453 = null;
        }
        if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/Object;Lpc;)V")
    public static final void method181(int arg0, Object arg1, class166 arg2) {
        field463++;
        if (arg2.field3066 == null) {
            return;
        }
        for (int var3 = arg0; var3 < 50 && arg2.field3066.peekEvent() != null; var3++) {
            class107.method866(0, 1L);
        }
        if (arg1 != null) {
            arg2.field3066.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field451 = arg0;
        this.field452 = arg6;
        this.field464 = arg4;
        this.field457 = arg2;
        this.field447 = arg3;
        this.field444 = arg5;
        this.field446 = arg1;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILhh;)Z")
    public static final boolean method182(int arg0, class163 arg1) {
        field454++;
        try {
            int var2 = arg1.method1224(44, false);
            if (arg0 == var2) {
                return false;
            }
            class163 var3 = arg1.method1188(true, var2, 0);
            class163 var4 = arg1.method1216(var2 + 1, (byte) -125);
            MessageDigest var5 = MessageDigest.getInstance("SHA");
            var5.reset();
            var5.update(var3.method1202(4639));
            byte[] var6 = var5.digest();
            byte[] var7 = var4.method1199(false);
            class81 var8 = new class81(5000);
            var8.method638(0, 108, var7, var7.length);
            var8.field1541 = 0;
            var8.method632((byte) 111, class176.field3214, class38.field638);
            if (var8.field1562[0] != 1) {
                return false;
            }
            for (int var9 = 0; var9 < 20; var9++) {
                if (var8.field1562[var9 + 1] != var6[var9]) {
                    return false;
                }
            }
            return true;
        } catch (Exception var10) {
            return false;
        }
    }
}
