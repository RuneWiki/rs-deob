import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class81 {

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "[I")
    public static int[] field1267 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Lna;")
    public static class26 field1266 = class69.method505("Spieler kann nicht gefunden werden: ", (byte) -120);

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Lna;")
    public static class26 field1269 = class69.method505("::errortest", (byte) -123);

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Lna;")
    public static class26 field1268 = class69.method505("cookieprefix", (byte) -118);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lgn;")
    public static class5 field1264 = new class5(64);

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field1270 = 0;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 20)
    public static void method574(int arg0) {
        field1264 = null;
        field1267 = null;
        field1269 = null;
        field1268 = null;
        if (arg0 != 30358) {
            field1269 = (class26) null;
        }
        field1266 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BII)V", line = 40)
    public static final void method575(byte arg0, int arg1, int arg2) {
        field1265++;
        if (arg0 >= -99) {
            method575((byte) 57, -14, 120);
        }
        class232 var3 = class263.method1852(arg2, (byte) 127);
        int var4 = var3.field3679;
        int var5 = var3.field3675;
        int var6 = var3.field3670;
        int var7 = class202.field3142[var5 - var6];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var6;
        class115.method804((byte) 99, arg1 << var6 & var8 | ~var8 & class117.field1835[var4], var4);
    }
}
