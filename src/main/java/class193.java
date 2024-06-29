import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class193 {

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public int field3034;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "[I")
    public int[] field3036;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "[I")
    public int[] field3035;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field3038 = 0;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
    public static final void method1394(byte arg0) {
        if (arg0 >= -80) {
            method1394((byte) -126);
        }
        field3037++;
        for (class251 var1 = (class251) class408.field5908.method1224(-2); var1 != null; var1 = (class251) class408.field5908.method1232(-2)) {
            class35 var2 = var1.field3746;
            if (var2.field1008 < class336.field5031) {
                var1.method2588(300);
                var2.method528(-1);
            } else if (var2.field987 <= class336.field5031) {
                if (var2.field1025 > 0) {
                    class436 var3 = (class436) class208.field3179.method2596((long) (var2.field1025 - 1), 122);
                    if (var3 != null) {
                        class22 var4 = var3.field6298;
                        if (var4.field9806 >= 0 && (class675.field9604 * 512) > var4.field9806 && var4.field9815 >= 0 && var4.field9815 < class218.field3316 * 512) {
                            var2.method520(-45, class460.method2757(0, var4.field9815, var2.field9814, var4.field9806) - var2.field979, class336.field5031, var4.field9806, var4.field9815);
                        }
                    }
                }
                if (var2.field1025 < 0) {
                    int var5 = -var2.field1025 - 1;
                    class602 var6;
                    if (class422.field6096 == var5) {
                        var6 = class532.field7456;
                    } else {
                        var6 = class59.field1341[var5];
                    }
                    if (var6 != null && var6.field9806 >= 0 && var6.field9806 < (class675.field9604 * 512) && var6.field9815 >= 0 && class218.field3316 * 512 > var6.field9815) {
                        var2.method520(-27, class460.method2757(0, var6.field9815, var2.field9814, var6.field9806) - var2.field979, class336.field5031, var6.field9806, var6.field9815);
                    }
                }
                var2.method521(class620.field8990, 0);
                class543.method3127(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I)V")
    public class193(int arg0) {
        this.field3034 = arg0;
        this.field3036 = new int[this.field3034];
        this.field3035 = new int[this.field3034];
    }
}
