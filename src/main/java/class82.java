import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public abstract class class82 {

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public int field1510;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    public int field1521;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "Lcd;")
    public static class64 field1507 = class44.method335((byte) 71, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "[[[B")
    public static byte[][][] field1508 = new byte[4][104][104];

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "Lcd;")
    public static class64 field1506 = class44.method335((byte) 71, "ul");

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "Lcd;")
    private static class64 field1512 = class44.method335((byte) 71, "Loaded title screen");

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "Lcd;")
    public static class64 field1505 = field1512;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "Lfc;")
    public static class214 field1509 = null;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public static int field1519 = 0;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "Lqm;")
    public static class222 field1518;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "[I")
    public static int[] field1513;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "[I")
    public static int[] field1515;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V", line = 8)
    public static void method635(byte arg0) {
        field1515 = null;
        field1509 = null;
        field1513 = null;
        field1508 = (byte[][][]) null;
        field1512 = null;
        field1518 = null;
        if (arg0 >= -3) {
            field1520 = -15;
        }
        field1505 = null;
        field1507 = null;
        field1506 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIBI)Lmc;", line = 27)
    public static final class172 method636(int arg0, int arg1, byte arg2, int arg3) {
        field1514++;
        class172 var4 = new class172();
        var4.field2967 = arg0;
        var4.field2972 = arg3;
        class159.field2805.method1149(var4, (long) arg1, -88);
        class35.method290((byte) -109, arg0);
        class60 var5 = class125.method907(arg1, -81);
        if (var5 != null) {
            class190.method1342(var5, 0);
        }
        if (class106.field1952 != null) {
            class190.method1342(class106.field1952, arg2 - 15);
            class106.field1952 = null;
        }
        int var6 = class220.field3736;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class3.method15(true, class289.field4934[var7])) {
                class269.method1889(true, var7);
            }
        }
        if (class220.field3736 == 1) {
            class101.field1828 = false;
            class168.method1192((byte) -112, class244.field4247, class190.field3262, class313.field5300, class253.field4415);
        } else {
            class168.method1192((byte) -112, class244.field4247, class190.field3262, class313.field5300, class253.field4415);
            int var8 = class75.field1419.method1276(class28.field452);
            for (int var9 = 0; var9 < class220.field3736; var9++) {
                int var10 = class75.field1419.method1276(class253.method1809(false, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class253.field4415 = class220.field3736 * 15 + 22;
            class313.field5300 = var8 + 8;
        }
        if (var5 != null) {
            class240.method1744((byte) -109, false, var5);
        }
        if (arg2 != 15) {
            field1512 = (class64) null;
        }
        class58.method450(arg0, (byte) -87);
        if (class83.field1524 != -1) {
            class151.method1098(false, 1, class83.field1524);
        }
        return var4;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZLqm;Lqm;II)Lpf;", line = 117)
    public static final class78 method637(boolean arg0, class222 arg1, class222 arg2, int arg3, int arg4) {
        field1517++;
        boolean var5 = true;
        int[] var6 = arg1.method1592(-112, arg3);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg1.method1609(arg4 ^ 0xFFFFF1EA, arg3, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg0) {
                    var10 = arg2.method1609(arg4 ^ 0xFFFFF1EF, 0, var9);
                } else {
                    var10 = arg2.method1609(arg4 ^ 0xFFFFF1E9, var9, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            if (arg4 == -3696) {
                return new class78(arg1, arg2, arg3, arg0);
            } else {
                return (class78) null;
            }
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(III)V", line = 202)
    public class82(int arg0, int arg1, int arg2) {
        this.field1516 = arg2;
        this.field1510 = arg1;
        this.field1521 = arg0;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZII)V")
    public abstract void method433(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIB)V")
    public abstract void method435(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BII)V")
    public abstract void method434(byte arg0, int arg1, int arg2);
}
