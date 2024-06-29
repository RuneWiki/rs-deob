import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class151 {

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "B")
    private byte field1854;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public int field1856;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public int field1852;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public int field1855;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public int field1850;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public int field1853;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "Lea;")
    public static class474 field1857 = new class474("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "Lkca;")
    public static class73 field1858 = new class73(57, 6);

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Lhb;")
    public static class629 field1859 = new class629(2, 4);

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field1860 = 0;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V", line = 9)
    public static void method889(int arg0) {
        field1858 = null;
        if (arg0 >= -126) {
            method891(null, 108);
        }
        field1859 = null;
        field1857 = null;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)I", line = 21)
    public final int method890(int arg0) {
        field1849++;
        return arg0 == 7 ? this.field1854 & 0x7 : -65;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lcm;I)I", line = 35)
    public static final int method891(class631 arg0, int arg1) {
        field1848++;
        String var2 = class159.method920(-12510, arg0);
        int[] var3 = null;
        if (class14.method81(arg0.field9100, (byte) -102)) {
            var3 = class622.field8999.method25((int) arg0.field9099, arg1 ^ 0xFFFFB8D6).field2396;
        } else if (arg0.field9104 != -1) {
            var3 = class622.field8999.method25(arg0.field9104, -119).field2396;
        } else if (class288.method1864((byte) -63, arg0.field9100)) {
            class411 var6 = (class411) class42.field456.method524((byte) 104, (long) ((int) arg0.field9099));
            if (var6 != null) {
                class78 var7 = var6.field6254;
                class566 var8 = var7.field864;
                if (var8.field8121 != null) {
                    var8 = var8.method3287(122, class23.field243);
                }
                if (var8 != null) {
                    var3 = var8.field8136;
                }
            }
        } else if (class513.method3048(arg0.field9100, arg1 ^ 0xFFFFB887)) {
            Object var4 = null;
            class385 var5;
            if (arg0.field9100 == 1008) {
                var5 = class575.field8301.method1499(-7532, (int) arg0.field9099);
            } else {
                var5 = class575.field8301.method1499(-7532, (int) (arg0.field9099 >>> 32 & 0x7FFFFFFFL));
            }
            if (var5.field5793 != null) {
                var5 = var5.method2453(class23.field243, arg1 - 18203);
            }
            if (var5 != null) {
                var3 = var5.field5863;
            }
        }
        if (var3 != null) {
            var2 = var2 + class177.method1000(var3, (byte) -83);
        }
        int var9 = class281.field3921.method2560(var2, 1, class286.field3960);
        if (arg1 != 18203) {
            method891(null, -90);
        }
        if (arg0.field9097) {
            var9 += class32.field375.method1570() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)I", line = 113)
    public final int method892(byte arg0) {
        field1851++;
        if (arg0 > -21) {
            this.field1856 = 13;
        }
        return (this.field1854 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 125)
    public class151() {
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lrt;)V", line = 128)
    public class151(class194 arg0) {
        this.field1854 = arg0.method1213((byte) 98);
        this.field1856 = arg0.method1220(-95);
        this.field1852 = arg0.method1178(-230315992);
        this.field1855 = arg0.method1178(-230315992);
        this.field1850 = arg0.method1178(-230315992);
        this.field1853 = arg0.method1178(-230315992);
    }
}
