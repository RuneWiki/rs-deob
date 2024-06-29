import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class295 {

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Ltd;")
    public static class192 field4520 = new class192(32);

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Ltd;")
    public static class192 field4522 = new class192(8);

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "[Lre;")
    public static class263[] field4526 = new class263[2048];

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4527 = "Take";

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "B")
    public static byte field4521;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "F")
    public static float field4525;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public int field4509;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public int field4510;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public int field4511;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public int field4524;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "J")
    public long field4508;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "Llm;")
    public static class210 field4519;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Lmd;")
    public class233 field4512;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Lmd;")
    public class233 field4516;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lmd;")
    public class233 field4518;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 8)
    public static final void method2057(int arg0) {
        field4514++;
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class28.method176(true, var3, class158.field2367, var1, 1, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 != 18254) {
            method2061(114);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 47)
    public static final String[] method2058(int arg0, String[] arg1) {
        field4515++;
        String[] var2 = new String[5];
        for (int var3 = arg0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 74)
    public static void method2059(byte arg0) {
        field4526 = null;
        field4519 = null;
        field4522 = null;
        field4527 = null;
        if (arg0 == 108) {
            field4520 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)Z", line = 88)
    public static final boolean method2060(byte arg0) {
        field4517++;
        class9 var1 = class60.field796;
        synchronized (class60.field796) {
            if (class286.field4311 == class205.field3084) {
                return false;
            }
            if (arg0 <= 98) {
                field4520 = (class192) null;
            }
            class64.field850 = class3.field5[class205.field3084];
            class329.field4948 = class160.field2391[class205.field3084];
            class205.field3084 = class205.field3084 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V", line = 115)
    public static final void method2061(int arg0) {
        if (arg0 == -14278) {
            class21.field251 = new class156();
            field4513++;
        }
    }
}
