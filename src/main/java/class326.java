import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class326 {

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public int field4179;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
    public int field4187;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public int field4183;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public int field4184;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "J")
    public static long field4180 = 0L;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "[[I")
    public static int[][] field4182 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    public static int field4189 = 0;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "[S")
    public static short[] field4185 = new short[] { 60, 30, 59, 8, 23, 10, 25, 22 };

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)Lpl;", line = 5)
    public static final class457 method1938(int arg0, int arg1) {
        field4181++;
        class457 var2 = (class457) class489.field7136.method672((long) arg1, (byte) -75);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class491.field7174.method1313((byte) -125, arg1, arg0);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class457 var4 = class421.method2489(false, var3);
            class489.field7136.method668(var4, (long) arg1, arg0 - 1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V", line = 27)
    public static final void method1939(byte arg0) {
        class398.method2369(30935, false);
        field4190++;
        if (arg0 > -19) {
            method1942(false);
        }
        if (class318.field4099 >= 0 && class318.field4099 != 0) {
            class10.method69(class318.field4099, 5537);
            class318.field4099 = -1;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILeo;)V", line = 45)
    public static final void method1940(int arg0, class423 arg1) {
        field4188++;
        if (arg0 != 2574) {
            field4189 = -91;
        }
        class423 var2 = class426.method2520((byte) -47, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class23.field419;
            var3 = class92.field1281;
        } else {
            var3 = var2.field5726;
            var4 = var2.field5735;
        }
        class132.method932(arg1, var4, -190, var3, false);
        class343.method2017(var4, (byte) -92, var3, arg1);
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(II)Lwo;", line = 76)
    public final class326 method1941(int arg0, int arg1) {
        field4186++;
        return arg1 < 116 ? null : new class326(this.field4187, arg0, this.field4183, this.field4184);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)V", line = 93)
    public static void method1942(boolean arg0) {
        field4182 = null;
        if (!arg0) {
            field4182 = null;
        }
        field4185 = null;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(IIII)V", line = 105)
    public class326(int arg0, int arg1, int arg2, int arg3) {
        this.field4179 = arg1;
        this.field4187 = arg0;
        this.field4183 = arg2;
        this.field4184 = arg3;
    }
}
