import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class106 {

    @OriginalMember(owner = "client!je", name = "e", descriptor = "B")
    private byte field1891;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public int field1894;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public int field1898;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public int field1892;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public int field1889;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1890 = -1;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Lci;")
    public static class60 field1893 = new class60();

    @OriginalMember(owner = "client!je", name = "n", descriptor = "F")
    public static float field1900 = 0.0F;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "[I")
    public static int[] field1902;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "[[[B")
    public static byte[][][] field1887;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
    public static final void method718(int arg0, int arg1, int arg2) {
        class256.field4183++;
        if (arg1 == 8) {
            field1899++;
            class168.field2778.method199(107, 120);
            class168.field2778.method673(arg2, true);
            class168.field2778.method667(arg0, -1511);
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(III)V")
    public static final void method719(int arg0, int arg1, int arg2) {
        field1897++;
        class55 var3 = class62.method395(arg0, arg2, (byte) -66);
        var3.method340((byte) -110);
        var3.field947 = arg1;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(III)V")
    public static final void method720(int arg0, int arg1, int arg2) {
        class47 var3 = class133.method925(arg0, (byte) 48);
        int var4 = var3.field828;
        int var5 = var3.field827;
        field1895++;
        int var6 = var3.field823;
        int var7 = class256.field4176[var6 - var5];
        if (arg2 < arg1 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class156.method1070(arg1 + 84, var4, ~var8 & class50.field857[var4] | var8 & arg2 << var5);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)I")
    public final int method721(int arg0) {
        field1888++;
        if (arg0 != 32766) {
            method718(-123, 70, 1);
        }
        return (this.field1891 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)I")
    public final int method722(byte arg0) {
        field1901++;
        return arg0 == -81 ? this.field1891 & 0x7 : 36;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
    public class106() {
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
    public static void method723(boolean arg0) {
        field1893 = null;
        field1902 = null;
        if (arg0) {
            field1887 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Leh;)V")
    public class106(class101 arg0) {
        this.field1891 = arg0.method646(-38);
        this.field1894 = arg0.method677(false);
        this.field1898 = arg0.method655((byte) 47);
        this.field1896 = arg0.method655((byte) 72);
        this.field1892 = arg0.method655((byte) 63);
        this.field1889 = arg0.method655((byte) 125);
    }
}
