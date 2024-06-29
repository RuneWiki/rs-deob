import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class72 extends class189 {

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "Lr;")
    public static class66 field1420 = class93.method641(43, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Lr;")
    public static class66 field1418 = class93.method641(43, "VOLL");

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field1424 = 0;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "Z")
    public static boolean field1425 = false;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    public static int field1426 = 0;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "Lr;")
    private static class66 field1423 = class93.method641(43, "FULL");

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "Lr;")
    public static class66 field1428 = field1423;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Lwa;")
    public static class139 field1422;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "[Ljb;")
    public static class256[] field1421;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V")
    public static void method515(byte arg0) {
        field1418 = null;
        field1423 = null;
        int var1 = -45 % ((arg0 - 82) / 42);
        field1422 = null;
        field1421 = null;
        field1428 = null;
        field1420 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(JIII)Z")
    public static final boolean method516(long arg0, int arg1, int arg2, int arg3) {
        int var5 = ((int) arg0 & 0x39A537) >> 20;
        int var6 = (int) arg0 >> 14 & 0x1F;
        field1419++;
        int var7 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class231 var8 = class52.method359(91, var7);
            int var9;
            int var10;
            if (var5 == 0 || var5 == 2) {
                var10 = var8.field4020;
                var9 = var8.field4021;
            } else {
                var9 = var8.field4020;
                var10 = var8.field4021;
            }
            int var11 = var8.field4023;
            if (var5 != 0) {
                var11 = (var11 >> 4 - var5) + (var11 << var5 & 0xF);
            }
            class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], var10, var9, arg1, true, var11, -3, 2, arg3);
        } else {
            class10.method44(var5, var6 + 1, class207.field3595.field2039[0], class207.field3595.field2086[0], 0, 0, arg1, true, 0, -3, 2, arg3);
        }
        class176.field3089 = class174.field3068;
        class15.field191 = class188.field3274;
        client.field1644 = 2;
        if (arg2 != -12974) {
            field1428 = null;
        }
        class42.field694 = 0;
        return true;
    }
}
