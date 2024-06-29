import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class203 {

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    private int field3143;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    private int field3141;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    private int field3151;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    private int field3140;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    private int field3146;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    private int field3145;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    private int field3149;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    private int field3152;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    private int field3144;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    private int field3153;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIILsp;)V", line = 4)
    public static final void method1408(int arg0, int arg1, int arg2, class686 arg3) {
        class293 var4 = class316.method1907(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field4084 = arg3;
        int var5 = class687.field9745 == class340.field4723 ? 1 : 0;
        if (arg3.method633(true)) {
            if (arg3.method630(94)) {
                class430.field6131[var5][class352.field4945[var5]++] = arg3;
                return;
            }
            class431.field6138[var5][class310.field4305[var5]++] = arg3;
            return;
        }
        class128.field2093[var5][class108.field1764[var5]++] = arg3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lr;B)V", line = 29)
    public static final void method1409(class98 arg0, byte arg1) {
        if (arg1 != -64) {
            method1409(null, (byte) 21);
        }
        if (client.field1383) {
            class336.method1998(4, arg0);
        } else {
            class240.method1560(arg0, (byte) 80);
        }
        field3147++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIIIIII)V", line = 46)
    public final void method1410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3142++;
        this.field3151 = arg7;
        this.field3140 = arg9 * arg9;
        this.field3141 = arg5;
        this.field3143 = arg4;
        this.field3153 = this.field3151 + arg2;
        this.field3145 = this.field3141 + arg8;
        if (arg6 != 31831) {
            method1409(null, (byte) 31);
        }
        this.field3149 = this.field3151 + arg0;
        this.field3146 = this.field3141 + arg10;
        this.field3152 = this.field3143 + arg1;
        this.field3144 = this.field3143 + arg3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)Z", line = 74)
    public final boolean method1411(int arg0, int arg1, int arg2, int arg3) {
        field3150++;
        int var5 = 17 / ((arg0 + 31) / 38);
        if (arg2 < this.field3152 || this.field3144 < arg2) {
            return false;
        } else if (arg3 < this.field3149 || this.field3153 < arg3) {
            return false;
        } else if (this.field3145 <= arg1 && this.field3146 >= arg1) {
            int var6 = arg2 - this.field3143;
            int var7 = arg1 - this.field3141;
            return (var6 * var6 + (var7 * var7)) < this.field3140;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 100)
    public class203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field3143 = arg0;
        this.field3141 = arg2;
        this.field3151 = arg1;
        this.field3140 = arg3 * arg3;
        this.field3146 = this.field3141 + arg9;
        this.field3145 = this.field3141 + arg8;
        this.field3149 = this.field3151 + arg6;
        this.field3152 = this.field3143 + arg4;
        this.field3144 = this.field3143 + arg5;
        this.field3153 = this.field3151 + arg7;
    }
}
