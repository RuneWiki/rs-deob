import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class200 extends class18 {

    @OriginalMember(owner = "client!le", name = "D", descriptor = "I")
    public int field2896 = -1;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    public int field2898 = -1;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "I")
    public static int field2897 = 2;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public int field2888;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public int field2890;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    public int field2894;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "I")
    public int field2899;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "[[I")
    public static int[][] field2889;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILqa;B)Z")
    public final boolean method8(int arg0, int arg1, class162 arg2, byte arg3) {
        ++field2895;
        class414 var5 = arg2.method1115();
        int var6 = -85 / ((arg3 - -12) / 36);
        var5.method913(super.field201, super.field189, super.field199);
        class121 var7 = class294.field4196.method453(0, this.field2899).method2073(this.field2890, arg2, -1, 131072, 0, 0, (class42) null, (byte) 33, (class329) null);
        if (var7 != null && var7.method706(arg0, arg1, var5, true)) {
            return true;
        } else {
            if (~this.field2896 != 0) {
                class121 var8 = class294.field4196.method453(0, this.field2896).method2073(this.field2894, arg2, -1, 131072, 0, 0, (class42) null, (byte) 33, (class329) null);
                if (var8 != null && var8.method706(arg0, arg1, var5, true)) {
                    return true;
                }
            }
            if (this.field2898 != -1) {
                class121 var9 = class294.field4196.method453(0, this.field2898).method2073(this.field2888, arg2, -1, 131072, 0, 0, (class42) null, (byte) 33, (class329) null);
                if (var9 != null && var9.method706(arg0, arg1, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static void method1359(byte arg0) {
        field2889 = null;
        int var1 = -87 / ((22 - arg0) / 58);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(ILqa;)Lnf;")
    public final class405 method12(int arg0, class162 arg1) {
        ++field2891;
        if (arg0 <= 120) {
            this.field2899 = 21;
        }
        class414 var3 = arg1.method1115();
        var3.method913(super.field201, super.field189, super.field199);
        class405 var4 = class75.method427(3, 0);
        if (this.field2898 != -1) {
            class121 var5 = class294.field4196.method453(0, this.field2898).method2073(this.field2888, arg1, -1, 2048, 0, 0, (class42) null, (byte) 33, (class329) null);
            if (var5 != null) {
                var5.method720(var3, var4.field6108[2], 0);
            }
        }
        if (~this.field2896 != 0) {
            class121 var6 = class294.field4196.method453(0, this.field2896).method2073(this.field2894, arg1, -1, 2048, 0, 0, (class42) null, (byte) 33, (class329) null);
            if (var6 != null) {
                var6.method720(var3, var4.field6108[1], 0);
            }
        }
        class121 var7 = class294.field4196.method453(0, this.field2899).method2073(this.field2890, arg1, -1, 2048, 0, 0, (class42) null, (byte) 33, (class329) null);
        if (var7 != null) {
            var7.method720(var3, var4.field6108[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)Z")
    public static final boolean method1360(int arg0) {
        if (arg0 != 17952) {
            method1360(-70);
        }
        ++field2892;
        return class447.field6662 != class125.field1890 || class402.field6053 >= 2;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BLqa;)V")
    public final void method10(byte arg0, class162 arg1) {
        if (arg0 != -32) {
            this.method10((byte) 126, (class162) null);
        }
        ++field2893;
    }
}
