import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class65 {

    @OriginalMember(owner = "client!h", name = "b", descriptor = "Lgg;")
    public static class63 field1647 = class116.method911(43, ":chalreq:");

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field1649 = 0;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "Lgg;")
    private static class63 field1654 = class116.method911(43, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!h", name = "g", descriptor = "Lgg;")
    public static class63 field1652 = field1654;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "[S")
    public static short[] field1650;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static void method612(int arg0) {
        field1650 = null;
        if (arg0 > -105) {
            method616(null, 112);
        }
        field1652 = null;
        field1654 = null;
        field1647 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IILgg;)V")
    public static final void method613(int arg0, int arg1, class63 arg2) {
        class63 var3 = arg2.method594((byte) -57).method576((byte) 32);
        field1648++;
        boolean var4 = false;
        int var5 = -84 % ((-arg0 - 7) / 59);
        for (int var6 = 0; var6 < class34.field813; var6++) {
            class62 var7 = class33.field806[class177.field3641[var6]];
            if (var7 != null && var7.field1552 != null && var7.field1552.method601(13117, var3)) {
                var4 = true;
                class162.method1105(0, class3.field72.field1117[0], 0, 1, 1, 2, var7.field1117[0], class3.field72.field1164[0], var7.field1164[0], false, (byte) -9, 0);
                if (arg1 == 1) {
                    class17.field424++;
                    class141.field3031.method854(210, true);
                    class141.field3031.method24(class177.field3641[var6], 127);
                } else if (arg1 == 4) {
                    class189.field3813++;
                    class141.field3031.method854(250, true);
                    class141.field3031.method24(class177.field3641[var6], 12);
                } else if (arg1 == 6) {
                    class141.field3031.method854(60, true);
                    class56.field1488++;
                    class141.field3031.method47(636435176, class177.field3641[var6]);
                } else if (arg1 == 7) {
                    class150.field3157++;
                    class141.field3031.method854(195, true);
                    class141.field3031.method24(class177.field3641[var6], 125);
                }
                break;
            }
        }
        if (!var4) {
            class100.method843((byte) -94, 0, class151.field3175, class89.method772((byte) 48, new class63[] { class198.field3956, var3 }));
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljc;Lgg;Lgg;B)Lwb;")
    public static final class200 method614(class85 arg0, class63 arg1, class63 arg2, byte arg3) {
        int var4 = arg0.method751(-29355, arg1);
        int var5 = 29 % ((arg3 + 28) / 55);
        int var6 = arg0.method748(0, arg2, var4);
        field1653++;
        return class136.method991((byte) -110, var6, var4, arg0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IBI)Z")
    public static final boolean method615(int arg0, byte arg1, int arg2) {
        if (arg1 <= 76) {
            field1654 = null;
        }
        field1651++;
        return (arg2 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([BI)[B")
    public static final byte[] method616(byte[] arg0, int arg1) {
        field1646++;
        if (arg1 != -5831) {
            field1652 = null;
        }
        class3 var2 = new class3(arg0);
        int var3 = var2.method64(arg1 + 37621);
        int var4 = var2.method56(-1);
        if (var4 < 0 || class11.field259 != 0 && class11.field259 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method71(var4, -26252, 0, var7);
            return var7;
        } else {
            int var5 = var2.method56(arg1 + 5830);
            if (var5 < 0 || class11.field259 != 0 && class11.field259 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class31.method306(var6, var5, arg0, var4, 9);
            } else {
                class73.field1813.method1103(var2, var6, 120);
            }
            return var6;
        }
    }
}
