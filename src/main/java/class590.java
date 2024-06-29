import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class590 {

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "I")
    public int field8315;

    @OriginalMember(owner = "client!nu", name = "j", descriptor = "I")
    public int field8318;

    @OriginalMember(owner = "client!nu", name = "q", descriptor = "Lrr;")
    public class361 field8325;

    @OriginalMember(owner = "client!nu", name = "p", descriptor = "B")
    public byte field8324;

    @OriginalMember(owner = "client!nu", name = "r", descriptor = "I")
    public int field8326;

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "I")
    public int field8313;

    @OriginalMember(owner = "client!nu", name = "m", descriptor = "I")
    public int field8321;

    @OriginalMember(owner = "client!nu", name = "s", descriptor = "I")
    public int field8327;

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "[C")
    private static char[] field8312 = new char[64];

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "I")
    public static int field8311;

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "I")
    public static int field8314;

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!nu", name = "k", descriptor = "I")
    public static int field8319;

    @OriginalMember(owner = "client!nu", name = "l", descriptor = "I")
    public static int field8320;

    @OriginalMember(owner = "client!nu", name = "i", descriptor = "Lvea;")
    public class273 field8317;

    @OriginalMember(owner = "client!nu", name = "o", descriptor = "Lcba;")
    public class548 field8323;

    @OriginalMember(owner = "client!nu", name = "n", descriptor = "Lcr;")
    public class571 field8322;

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "Lps;")
    public class95 field8310;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field8312[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field8312[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field8312[var2] = (char) (var2 - 4);
        }
        field8312[63] = '/';
        field8312[62] = '+';
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IBI)Z", line = 4)
    public static final boolean method3376(int arg0, byte arg1, int arg2) {
        if (arg1 != -96) {
            method3380(null, null);
        }
        field8314++;
        return class193.method1173((byte) -127, arg2, arg0) & class13.method57(arg0, arg2, 19);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(FIIFF)F", line = 25)
    public static final float method3377(float arg0, int arg1, int arg2, float arg3, float arg4) {
        if (arg1 != 2) {
            method3376(26, (byte) -54, 100);
        }
        field8309++;
        float[] var5 = class278.field3419[arg2];
        return var5[2] * arg4 + var5[0] * arg3 + var5[1] * arg0;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V", line = 39)
    public static void method3378(int arg0) {
        if (arg0 <= 121) {
            method3379(-84);
        }
        field8312 = null;
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)V", line = 80)
    public static final void method3379(int arg0) {
        class559.field7988.method3549(0);
        field8311++;
        class657.field9393.method3549(arg0 - 14046);
        class203.field2402.method3549(arg0 ^ arg0);
        class336.field4318.method3549(0);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lst;", line = 92)
    public static final class432 method3380(Throwable arg0, String arg1) {
        field8316++;
        class432 var2;
        if ((arg0 instanceof class432)) {
            var2 = (class432) arg0;
            var2.field6333 = var2.field6333 + ' ' + arg1;
        } else {
            var2 = new class432(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(I)Z", line = 110)
    public final boolean method3381(int arg0) {
        field8320++;
        int var2 = -35 / ((arg0 - 40) / 61);
        return this.field8324 == 2 || this.field8324 == 3;
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(BIIIIIILrr;)V", line = 122)
    public class590(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class361 arg7) {
        this.field8315 = arg4;
        this.field8318 = arg2;
        this.field8325 = arg7;
        this.field8324 = arg0;
        this.field8326 = arg1;
        this.field8313 = arg3;
        this.field8321 = arg6;
        this.field8327 = arg5;
    }
}
