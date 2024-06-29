import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class462 {

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public int field6866;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field6867 = -2;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!og", name = "toString", descriptor = "()Ljava/lang/String;", line = 11)
    public final String toString() {
        field6869++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)Ljo;", line = 19)
    public static final class222 method2772(int arg0) {
        if (arg0 != 0) {
            field6867 = -27;
        }
        field6865++;
        try {
            return (class222) Class.forName("kc").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)I", line = 36)
    public final int method2773(int arg0) {
        int var2 = -90 / ((arg0 - 27) / 54);
        field6864++;
        return this.field6866;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 46)
    public class462(String arg0, int arg1) {
        this.field6866 = arg1;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BLwi;)I", line = 60)
    public static final int method2774(byte arg0, class328 arg1) {
        if (arg0 <= 11) {
            return -29;
        }
        field6868++;
        String var2 = class477.method2850(76, arg1);
        int[] var3 = null;
        if (class40.method251(arg1.field4972, -7010)) {
            var3 = class135.field2271.method1636((int) arg1.field4981, -110).field196;
        } else if (arg1.field4973 != -1) {
            var3 = class135.field2271.method1636(arg1.field4973, -118).field196;
        } else if (class470.method2810(-109, arg1.field4972)) {
            class435 var6 = (class435) class209.field3337.method1622((long) ((int) arg1.field4981), 103);
            if (var6 != null) {
                class163 var7 = var6.field6471;
                class51 var8 = var7.field2613;
                if (var8.field1038 != null) {
                    var8 = var8.method475(class402.field6080, -1);
                }
                if (var8 != null) {
                    var3 = var8.field1053;
                }
            }
        } else if (class473.method2826(-80, arg1.field4972)) {
            Object var4 = null;
            class306 var5;
            if (arg1.field4972 == 1003) {
                var5 = class123.field2142.method1530((byte) -62, (int) arg1.field4981);
            } else {
                var5 = class123.field2142.method1530((byte) -40, (int) (arg1.field4981 >>> 32 & 0x7FFFFFFFL));
            }
            if (var5.field4593 != null) {
                var5 = var5.method1951(class402.field6080, 0);
            }
            if (var5 != null) {
                var3 = var5.field4644;
            }
        }
        if (var3 != null) {
            var2 = var2 + class444.method2658(var3, -20);
        }
        int var9 = class272.field4126.method2811(class365.field5333, var2, true);
        if (arg1.field4974) {
            var9 += class271.field4119.method157() + 4;
        }
        return var9;
    }
}
