import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class9 {

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Lke;")
    public static class256 field135 = class316.method2202("hint_mapmarkers", 27626);

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field141 = 0;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Lvm;")
    public static class297 field139 = new class297(50);

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field143 = 0;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "[[B")
    public static byte[][] field144 = new byte[250][];

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Lke;")
    public static class256 field142 = class316.method2202("Stufe: ", 27626);

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Lke;")
    public static class256 field146 = class316.method2202("::breakcon", 27626);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lng;")
    public static class138 field145;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 5)
    public static void method58(int arg0) {
        field146 = null;
        field139 = null;
        if (arg0 != 50) {
            method60(-57);
        }
        field142 = null;
        field135 = null;
        field145 = null;
        field144 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIILmc;JLmc;Lmc;)V", line = 33)
    public static final void method59(int arg0, int arg1, int arg2, int arg3, class51 arg4, long arg5, class51 arg6, class51 arg7) {
        class139 var9 = new class139();
        var9.field2451 = arg4;
        var9.field2456 = arg1 * 128 + 64;
        var9.field2448 = arg2 * 128 + 64;
        var9.field2460 = arg3;
        var9.field2457 = arg5;
        var9.field2459 = arg6;
        var9.field2455 = arg7;
        int var10 = 0;
        class271 var11 = class41.field790[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field4641; var12++) {
                class269 var13 = var11.field4624[var12];
                if ((var13.field4601 & 0x400000L) == 4194304L) {
                    int var14 = var13.field4590.method154();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2453 = -var10;
        if (class41.field790[arg0][arg1][arg2] == null) {
            class41.field790[arg0][arg1][arg2] = new class271(arg0, arg1, arg2);
        }
        class41.field790[arg0][arg1][arg2].field4632 = var9;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V", line = 81)
    public static final void method60(int arg0) {
        field137++;
        if (!class320.field5489) {
            return;
        }
        class188 var1 = client.method832(class170.field3024, 25767, class96.field1710);
        if (var1 != null && var1.field3329 != null) {
            class119 var2 = new class119();
            var2.field2116 = var1;
            var2.field2114 = var1.field3329;
            class91.method678((byte) 55, var2);
        }
        class159.field2841 = -1;
        class320.field5489 = false;
        if (arg0 != 128) {
            field142 = (class256) null;
        }
        class64.method500(var1, (byte) -117);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIII)V", line = 110)
    public static final void method61(int arg0, int arg1, int arg2, int arg3) {
        if (class29.field422 != 0 && arg2 != 0 && class23.field312 < 50 && arg0 != -1) {
            class34.field530[class23.field312] = arg0;
            class105.field1875[class23.field312] = arg2;
            class78.field1467[class23.field312] = arg1;
            class54.field984[class23.field312] = null;
            class135.field2345[class23.field312] = 0;
            class23.field312++;
        }
        field140++;
        int var4 = 49 % ((-arg3 - 43) / 48);
    }
}
