import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class142 extends class4 {

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "B")
    public byte field1926;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
    public int field1927;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "Lnj;")
    public class228 field1928;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "Llm;")
    public static class347 field1924;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)V")
    public static void method901(int arg0) {
        if (arg0 == 0) {
            field1924 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIILe;Le;)V")
    public static final void method902(int arg0, int arg1, int arg2, class97 arg3, class97 arg4) {
        if (class213.field2852[arg0][arg1][arg2] == null) {
            class365.method2386(arg0, arg1, arg2);
        }
        class213.field2852[arg0][arg1][arg2].field3510 = arg3;
        class213.field2852[arg0][arg1][arg2].field3512 = arg4;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lri;III[Z)V")
    public static final void method903(class98 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class191.field2557 != class12.field205) {
            int var5 = class265.field3846[arg1].method745(arg2, arg3);
            for (int var6 = 0; var6 <= arg1; ++var6) {
                if (arg4 == null || arg4[var6]) {
                    class351 var7 = class265.field3846[var6];
                    if (var7 != null) {
                        var7.method757(arg0, arg2, var5 - var7.method745(arg2, arg3), arg3, 0, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)V")
    public static final void method904(boolean arg0) {
        for (class169 var1 = (class169) class99.field1377.method389(0); var1 != null; var1 = (class169) class99.field1377.method388(0)) {
            int var2 = var1.field2275;
            if (class395.method2537((byte) -113, var2)) {
                boolean var3 = true;
                class394[] var4 = class365.field5292[var2];
                for (int var5 = 0; ~var5 > ~var4.length; ++var5) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field5790;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field640;
                    class394 var7 = class196.method1168((byte) -76, var6);
                    if (var7 != null) {
                        class407.method2621(var7, 15);
                    }
                }
            }
        }
        if (arg0) {
            method904(false);
        }
        ++field1929;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)I")
    public static final int method905(int arg0, int arg1) {
        ++field1925;
        return arg0 < 41 ? 30 : arg1 >>> 8;
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)[B")
    public final byte[] method25(int arg0) {
        ++field1930;
        if (arg0 != 25539) {
            return null;
        } else if (!super.field50 && ~(this.field1928.field3040.length - this.field1926) >= ~this.field1928.field3029) {
            return this.field1928.field3040;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)I")
    public final int method27(byte arg0) {
        ++field1923;
        if (arg0 != -29) {
            field1924 = null;
        }
        return this.field1928 == null ? 0 : this.field1928.field3029 * 100 / (this.field1928.field3040.length + -this.field1926);
    }
}
