import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class41 extends class18 {

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field587 = new CRC32();

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "I")
    public static int field598 = 0;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "I")
    public static int field597 = -8 + (int) (Math.random() * 17.0D);

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "I")
    public int field583;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "Led;")
    public static class186 field586;

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "Ljava/lang/String;")
    public String field599;

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "[Lrl;")
    public static class163[] field590;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(B)V")
    public static final void method299(byte arg0) {
        ++field594;
        ++class229.field3650;
        client.field2435.method536((byte) -104, 27);
        client.field2435.method654((byte) -110, class33.method262(0));
        if (arg0 != -10) {
            method300(118);
        }
        client.field2435.method634(class29.field409, arg0 + 24);
        client.field2435.method634(class79.field1310, 18);
        client.field2435.method654((byte) -102, class180.field2815);
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "(I)V")
    public static void method300(int arg0) {
        field590 = null;
        field587 = null;
        if (arg0 >= 32) {
            field586 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "(I)V")
    public final void method301(int arg0) {
        super.field273 |= Long.MIN_VALUE;
        if (arg0 == 8792) {
            if (this.method305(arg0 + -8765) == 0L) {
                class221.field3397.method604(this, -105);
            }
            ++field593;
        }
    }

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "(I)I")
    public final int method302(int arg0) {
        ++field589;
        if (arg0 != -1) {
            method307(-32, (byte[]) null, -43, -10);
        }
        return (int) super.field2603;
    }

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "(I)V")
    public final void method303(int arg0) {
        ++field591;
        super.field273 = Long.MIN_VALUE & super.field273 | 500L + class134.method924(false);
        if (arg0 == 23981) {
            class2.field6.method604(this, arg0 ^ -24006);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)Z")
    public static final boolean method304(int arg0, byte arg1) {
        if (arg1 != 32) {
            method299((byte) 86);
        }
        ++field585;
        return ~(arg0 & -arg0) == ~arg0;
    }

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "(I)J")
    public final long method305(int arg0) {
        ++field596;
        return arg0 != 27 ? 125L : super.field273 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "(I)I")
    public final int method306(int arg0) {
        if (arg0 != 28753) {
            this.method301(-30);
        }
        ++field588;
        return (int) (255L & super.field2603 >>> 32);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
    public static final String method307(int arg0, byte[] arg1, int arg2, int arg3) {
        int var4 = 0;
        ++field595;
        if (arg0 != 27) {
            method304(60, (byte) -101);
        }
        char[] var5 = new char[arg2];
        for (int var6 = 0; arg2 > var6; ++var6) {
            int var7 = 255 & arg1[arg3 + var6];
            if (~var7 != -1) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class292.field4593[var7 + -128];
                    if (var8 == 0) {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var5[var4++] = (char) var7;
            }
        }
        return new String(var5, 0, var4);
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(II)V")
    public class41(int arg0, int arg1) {
        super.field2603 = (long) arg1 | (long) arg0 << 32;
    }
}
