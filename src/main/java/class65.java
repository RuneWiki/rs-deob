import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class65 {

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "Leb;")
    public static class230 field1224 = class68.method589(0, "mapfunction");

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field1226 = 0;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "[I")
    public static int[] field1219 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Leb;")
    public static class230 field1221 = class68.method589(0, "gelb:");

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1220 = 0;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Leb;")
    public static class230 field1222 = class68.method589(0, "T");

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "Leb;")
    public static class230 field1223 = class68.method589(0, "Angreifen");

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "Ljf;")
    public static class63 field1228;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZIIBZ)V")
    public static final void method572(boolean arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        class46.method387(0, arg2, arg0, arg4, arg3 + 226, class189.field3325.length + -1, arg1);
        if (arg3 != -127) {
            method572(true, 30, 33, (byte) 115, true);
        }
        field1229++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZIII)I")
    public static final int method573(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg1 > -25) {
            method574(-70);
        }
        field1227++;
        class212 var4 = (class212) class75.field1366.method394((long) arg3, -21083);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field3685.length; var6++) {
            if (var4.field3685[var6] >= 0 && class56.field1037 > var4.field3685[var6]) {
                class12 var7 = class214.method1484(var4.field3685[var6], -1);
                if (var7.field207 != null) {
                    class244 var8 = (class244) var7.field207.method394((long) arg2, -21083);
                    if (var8 != null) {
                        if (arg0) {
                            var5 += var4.field3679[var6] * var8.field4189;
                        } else {
                            var5 += var8.field4189;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method574(int arg0) {
        field1223 = null;
        field1228 = null;
        field1221 = null;
        field1219 = null;
        if (arg0 != -30262) {
            field1223 = null;
        }
        field1222 = null;
        field1224 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
    public static final void method575(int arg0, int arg1) {
        field1225++;
        if (arg1 != 26705) {
            field1223 = null;
        }
        class45.field803.method1121(0, arg0);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BII)V")
    public static final void method576(byte arg0, int arg1, int arg2) {
        field1230++;
        class197 var3 = class164.method1228(7, arg2, -1665874464);
        if (arg0 < 56) {
            field1223 = null;
        }
        var3.method1402((byte) -102);
        var3.field3527 = arg1;
    }
}
