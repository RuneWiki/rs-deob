import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class230 extends class84 {

    @OriginalMember(owner = "client!me", name = "O", descriptor = "I")
    public static int field3491 = 0;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "Lvd;")
    public static class4 field3487 = new class4(16);

    @OriginalMember(owner = "client!me", name = "P", descriptor = "I")
    public static int field3492 = -1;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "C")
    private char field3485;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "I")
    public int field3480;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "Ljava/lang/String;")
    public String field3486;

    @OriginalMember(owner = "client!me", name = "H", descriptor = "[Lgg;")
    public static class198[] field3484;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "[[[B")
    public static byte[][][] field3489;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILql;)V")
    public static final void method1516(int arg0, class224 arg1) {
        field3481++;
        byte[] var2 = new byte[24];
        if (class268.field4105 != null) {
            try {
                class268.field4105.method1143(0L, arg0 ^ 0xFFFFFFC3);
                class268.field4105.method1145(var2, (byte) 100);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1452(var2, arg0, 24, arg0 + 128);
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(B)Z")
    public static final boolean method1517(byte arg0) {
        field3488++;
        int var1 = 19 / ((-arg0 - 20) / 38);
        if (class282.field4371) {
            try {
                if ((Boolean) class259.method1722("showingVideoAd", 3787, class200.field2784.field3715)) {
                    return false;
                }
                return true;
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(B)Z")
    public final boolean method1518(byte arg0) {
        if (arg0 != 5) {
            this.method1521((class224) null, 51);
        }
        field3479++;
        return this.field3485 == 's';
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lql;II)V")
    private final void method1519(class224 arg0, int arg1, int arg2) {
        if (arg1 != -5164) {
            return;
        }
        if (arg2 == 1) {
            this.field3485 = class84.method525(arg0.method1437((byte) -102), 30582);
        } else if (arg2 == 2) {
            this.field3480 = arg0.method1483((byte) 46);
        } else if (arg2 == 5) {
            this.field3486 = arg0.method1455(-125);
        }
        field3483++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIBIII)I")
    public static final int method1520(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field3478++;
        if (arg3 != -123) {
            method1516(104, (class224) null);
        }
        int var7 = arg1 & 0x3;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return 7 + 1 - arg6 - arg4;
        } else if (var7 == 2) {
            return 7 + 1 - arg0 - arg2;
        } else {
            return arg4;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lql;I)V")
    public final void method1521(class224 arg0, int arg1) {
        field3490++;
        while (true) {
            int var3 = arg0.method1453((byte) -127);
            if (var3 == 0) {
                int var4 = -12 % ((50 - arg1) / 52);
                return;
            }
            this.method1519(arg0, -5164, var3);
        }
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(B)V")
    public static void method1522(byte arg0) {
        int var1 = 120 / ((arg0 + 58) / 34);
        field3487 = null;
        field3484 = null;
        field3489 = null;
    }
}
