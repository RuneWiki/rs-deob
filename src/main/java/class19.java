import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class19 {

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "Lf;")
    public static class358 field257 = new class358(8);

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    public static int field258 = -1;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "I")
    public static int field259 = 0;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "Lnn;")
    public static class151 field260 = new class151(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
    public static int field263 = 0;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public int field255;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "Ljava/lang/String;")
    public String field256;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)V")
    public static final void method121(int arg0, int arg1) {
        class13 var2 = class277.field4216[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class13 var4 = class277.field4216[var3][arg0][arg1] = class277.field4216[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field154--;
                for (class466 var5 = var4.field151; var5 != null; var5 = var5.field6853) {
                    class141 var6 = var5.field6862;
                    if (var6.field1895 == arg0 && var6.field1901 == arg1) {
                        var6.field1902--;
                    }
                }
            }
        }
        if (class277.field4216[0][arg0][arg1] == null) {
            class277.field4216[0][arg0][arg1] = new class13(0, arg0, arg1);
            class277.field4216[0][arg0][arg1].field150 = 1;
        }
        class277.field4216[0][arg0][arg1].field146 = var2;
        class277.field4216[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V")
    public static void method122(boolean arg0) {
        field257 = null;
        if (!arg0) {
            method123(-61, (byte) -119);
        }
        field260 = null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IB)Lmm;")
    public static final class15 method123(int arg0, byte arg1) {
        field261++;
        class15 var2 = (class15) class21.field287.method927((long) arg0, 127);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class43.field543.method823(11, -20334, arg0);
        if (arg1 > -38) {
            method123(124, (byte) 42);
        }
        class15 var4 = new class15();
        if (var3 != null) {
            var4.method89(false, new class385(var3));
        }
        class21.field287.method929((long) arg0, var4, false);
        return var4;
    }
}
