import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class210 {

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "Lpj;")
    private class132 field3092;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public int field3096;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field3090 = 0;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "[I")
    public static int[] field3097 = new int[16];

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field3095 = new Hashtable();

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "Lpj;")
    public static class132 field3100;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "Ltn;")
    public static class77 field3099;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "[I")
    public static int[] field3091;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1381(int arg0, int arg1) {
        if (arg1 != 15433) {
            method1384(80, 30, null, (byte) -69);
        }
        class185.field2733 = arg0;
        field3098++;
        class239.field3442.method1997(1);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 17)
    public static final void method1382(int arg0) {
        for (int var1 = 0; var1 < class602.field8365; var1++) {
            int var2 = class594.field8262[var1];
            class178 var3 = (class178) class323.field4762.method2061(-17305, (long) var2);
            if (var3 != null) {
                class225 var4 = var3.field2634;
                class564.method3123(var4.field3245.field2463, var4, -1);
            }
        }
        if (arg0 != 9056) {
            field3091 = null;
        }
        field3093++;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)Z", line = 51)
    public static final boolean method1383(int arg0) {
        int var1 = 18 / ((-arg0 - 82) / 33);
        field3089++;
        if (class413.field5848) {
            try {
                class2.method11("showVideoAd", class188.field2779, 21190);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II[BB)Ljava/lang/String;", line = 71)
    public static final String method1384(int arg0, int arg1, byte[] arg2, byte arg3) {
        field3094++;
        char[] var4 = new char[arg1];
        int var5 = 35 / ((arg3 + 39) / 32);
        int var6 = 0;
        for (int var7 = 0; var7 < arg1; var7++) {
            int var8 = arg2[arg0 + var7] & 0xFF;
            if (var8 != 0) {
                if (var8 >= 128 && var8 < 160) {
                    char var9 = class587.field8205[var8 - 128];
                    if (var9 == '\u0000') {
                        var9 = '?';
                    }
                    var8 = var9;
                }
                var4[var6++] = (char) var8;
            }
        }
        return new String(var4, 0, var6);
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V", line = 117)
    public static void method1385(int arg0) {
        if (arg0 != 255) {
            method1384(110, 112, null, (byte) -28);
        }
        field3097 = null;
        field3091 = null;
        field3095 = null;
        field3099 = null;
        field3100 = null;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Ldd;ILpj;)V", line = 145)
    public class210(class647 arg0, int arg1, class132 arg2) {
        new class328(64);
        this.field3092 = arg2;
        this.field3096 = this.field3092.method936(15, -113);
    }
}
