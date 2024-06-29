import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class267 {

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Lwk;")
    public static class273 field4707 = new class273(100);

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Loa;")
    public static class99 field4708 = class221.method1463(2844, " <col=ffffff>");

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "[I")
    public static int[] field4711 = new int[50];

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Z")
    public static boolean field4710 = false;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "Loa;")
    public static class99 field4712 = class221.method1463(2844, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4703;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static final void method1769(int arg0) {
        field4702++;
        for (int var1 = -1; var1 < class190.field3342; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class105.field1765[var1];
            }
            class183 var6 = class259.field4515[var5];
            if (var6 != null && var6.field1300 > 0) {
                var6.field1300--;
                if (var6.field1300 == 0) {
                    var6.field1324 = null;
                }
            }
        }
        if (arg0 > -6) {
            method1771(69);
        }
        for (int var2 = 0; var2 < class102.field1735; var2++) {
            int var3 = class239.field4120[var2];
            class156 var4 = class248.field4287[var3];
            if (var4 != null && var4.field1300 > 0) {
                var4.field1300--;
                if (var4.field1300 == 0) {
                    var4.field1324 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ltg;Z)I")
    public static final int method1770(class182 arg0, boolean arg1) {
        field4705++;
        int var2 = 0;
        if (arg0.method1229(class263.field4640, -1)) {
            var2++;
        }
        if (!arg1) {
            return 104;
        }
        if (arg0.method1229(class115.field2040, -1)) {
            var2++;
        }
        if (arg0.method1229(class125.field2203, -1)) {
            var2++;
        }
        if (arg0.method1229(class219.field3814, -1)) {
            var2++;
        }
        if (arg0.method1229(class260.field4545, -1)) {
            var2++;
        }
        if (arg0.method1229(class3.field24, -1)) {
            var2++;
        }
        if (arg0.method1229(class193.field3402, -1)) {
            var2++;
        }
        if (arg0.method1229(class23.field324, -1)) {
            var2++;
        }
        if (arg0.method1229(class25.field374, -1)) {
            var2++;
        }
        if (arg0.method1229(class144.field2540, -1)) {
            var2++;
        }
        if (arg0.method1229(class172.field3045, -1)) {
            var2++;
        }
        if (arg0.method1229(class258.field4501, -1)) {
            var2++;
        }
        if (arg0.method1229(class214.field3727, -1)) {
            var2++;
        }
        if (arg0.method1229(class12.field113, -1)) {
            var2++;
        }
        if (arg0.method1229(class159.field2828, -1)) {
            var2++;
        }
        if (arg0.method1229(class263.field4651, -1)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public static void method1771(int arg0) {
        field4708 = null;
        field4707 = null;
        field4712 = null;
        field4711 = null;
        int var1 = 117 % ((-arg0 - 37) / 39);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLtg;Ltg;)V")
    public static final void method1772(boolean arg0, class182 arg1, class182 arg2) {
        class94.field1591 = arg2;
        class36.field630 = arg1;
        field4700++;
        if (!arg0) {
            field4712 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class267() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ltg;IIB)[Lvd;")
    public static final class4[] method1773(class182 arg0, int arg1, int arg2, byte arg3) {
        int var4 = 68 / ((-arg3 - 27) / 34);
        field4704++;
        return class153.method1016(arg1, 21451, arg0, arg2) ? class186.method1276(-110) : null;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(III)V")
    private class267(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLik;[B)V")
    public final void method1774(byte arg0, class261 arg1, byte[] arg2) {
        field4701++;
        if (arg1.field4619[arg1.field4587] != 31 || arg1.field4619[arg1.field4587 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4703 == null) {
            this.field4703 = new Inflater(true);
        }
        try {
            this.field4703.setInput(arg1.field4619, arg1.field4587 + 10, -10 - (arg1.field4587 - (arg1.field4619.length + -8)));
            if (arg0 < 86) {
                method1771(-64);
            }
            this.field4703.inflate(arg2);
        } catch (Exception var4) {
            this.field4703.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4703.reset();
    }
}
