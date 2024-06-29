import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class10 {

    @OriginalMember(owner = "client!em", name = "a", descriptor = "Lmf;")
    public static class43 field201 = new class43(64);

    @OriginalMember(owner = "client!em", name = "h", descriptor = "Lcd;")
    public static class64 field208 = class44.method335((byte) 71, ")4a=");

    @OriginalMember(owner = "client!em", name = "j", descriptor = "Lcd;")
    public static class64 field210 = class44.method335((byte) 71, "gelb:");

    @OriginalMember(owner = "client!em", name = "i", descriptor = "Lcd;")
    public static class64 field209 = class44.method335((byte) 71, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!em", name = "k", descriptor = "Lcd;")
    public static class64 field211 = class44.method335((byte) 71, "gleiten:");

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "[B")
    public static byte[] field206;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "[Lnm;")
    public static class176[] field207;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIZI)V", line = 4)
    public static final void method86(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if ((arg6 - arg0) >= class290.field4976 && class153.field2714 >= (arg0 + arg6) && class180.field3098 <= (arg1 - arg0) && arg0 + arg1 <= class201.field3444) {
            class222.method1598((byte) 22, arg6, arg0, arg2, arg1, arg4, arg3);
        } else {
            class156.method1125(arg1, -51, arg0, arg6, arg4, arg2, arg3);
        }
        field205++;
        if (!arg5) {
            method86(-50, -33, 4, 77, 127, false, 118);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V", line = 27)
    public static void method87(byte arg0) {
        field210 = null;
        field211 = null;
        if (arg0 > -74) {
            return;
        }
        field206 = null;
        field207 = null;
        field201 = null;
        field209 = null;
        field208 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(JI)Lcd;", line = 54)
    public static final class64 method88(long arg0, int arg1) {
        field203++;
        class37.field595.setTime(new Date(arg0));
        int var3 = class37.field595.get(7);
        int var4 = class37.field595.get(5);
        int var5 = class37.field595.get(2);
        int var6 = class37.field595.get(1);
        int var7 = class37.field595.get(arg1);
        int var8 = class37.field595.get(12);
        int var9 = class37.field595.get(13);
        return class104.method768(new class64[] { class218.field3690[var3 - 1], class155.field2744, class310.method2149(var4 / 10, (byte) -52), class310.method2149(var4 % 10, (byte) -108), class157.field2769, class111.field2068[var5], class157.field2769, class310.method2149(var6, (byte) -40), class37.field598, class310.method2149(var7 / 10, (byte) -10), class310.method2149(var7 % 10, (byte) -114), class250.field4346, class310.method2149(var8 / 10, (byte) 116), class310.method2149(var8 % 10, (byte) 106), class250.field4346, class310.method2149(var9 / 10, (byte) 106), class310.method2149(var9 % 10, (byte) 94), class223.field3798 }, false);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIILia;ZZ)V", line = 78)
    public static final void method89(int arg0, int arg1, int arg2, class199 arg3, boolean arg4, boolean arg5) {
        field202++;
        if (class307.field5248 >= 50 || arg3.field3396 == null || arg3.field3396.length <= arg2 || arg3.field3396[arg2] == null) {
            return;
        }
        int var6 = arg3.field3396[arg2][0];
        int var7 = (var6 & 0x7F) >> 4;
        if (!arg4) {
            field206 = (byte[]) null;
        }
        int var8 = var6 & 0xF;
        int var9 = var6 >> 8;
        if (arg3.field3396[arg2].length > 1) {
            int var10 = (int) ((double) arg3.field3396[arg2].length * Math.random());
            if (var10 > 0) {
                var9 = arg3.field3396[arg2][var10];
            }
        }
        if (var8 == 0) {
            if (arg5) {
                class59.method459(var7, var9, 0, (byte) 115);
            }
        } else if (class106.field1960 != 0) {
            class195.field3333[class307.field5248] = var9;
            class119.field2161[class307.field5248] = var7;
            int var11 = (arg1 - 64) / 128;
            class295.field5067[class307.field5248] = 0;
            class132.field2352[class307.field5248] = null;
            int var12 = (arg0 - 64) / 128;
            class273.field4697[class307.field5248] = (var12 << 8) + (var11 << 16) + var8;
            class307.field5248++;
        }
    }
}
