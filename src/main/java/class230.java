import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class230 {

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "Lsg;")
    public static class30 field4090 = class167.method1221((byte) 33, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "[Lsg;")
    public static class30[] field4093 = new class30[100];

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field4091 = 0;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field4095 = 0;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "S")
    public static short field4092 = 1;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "[[[I")
    public static int[][][] field4096 = new int[4][13][13];

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static final void method1634(byte arg0) {
        for (class180 var1 = (class180) class143.field2762.method1178(true); var1 != null; var1 = (class180) class143.field2762.method1176((byte) 22)) {
            int var2 = var1.field3335;
            if (class1.method9(var2, (byte) -13)) {
                class31[] var3 = class259.field4572[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field671;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field4215;
                    class31 var7 = class272.method1858(var6, 65535);
                    if (var7 != null) {
                        class254.method1771(var7, 8);
                    }
                }
            }
        }
        if (arg0 >= -13) {
            method1634((byte) 37);
        }
        field4094++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZIIZI)V")
    public static final void method1635(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field4097++;
        if (arg0 < 1) {
            arg0 = 1;
        }
        if (arg2 < 1) {
            arg2 = 1;
        }
        class186.field3410 = (short) arg2;
        if (arg1) {
            field4096 = null;
        }
        class275.field4807 = (short) arg0;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method1636(int arg0) {
        if (arg0 > -38) {
            field4091 = 76;
        }
        field4093 = null;
        field4096 = null;
        field4090 = null;
    }
}
