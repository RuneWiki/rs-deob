import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class20 {

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field332 = 0;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field328 = new String[200];

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "[[Lpn;")
    public static class692[][] field329;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)V", line = 3)
    public static final void method358(int arg0, int arg1) {
        field330++;
        if (~arg0 != arg1 && class661.field9224[arg0]) {
            class118.field1889.method922(0, arg0);
            class564.field8105[arg0] = null;
            class575.field8192[arg0] = null;
            class661.field9224[arg0] = false;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 21)
    public static final void method359(int arg0) {
        field333++;
        try {
            if (arg0 != 0) {
                method358(-12, 92);
            }
            if (field332 == 1) {
                int var1 = class252.field4036.method228(-16257);
                if (var1 > 0 && class252.field4036.method210(0)) {
                    int var2 = var1 - class206.field3453;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class252.field4036.method209(826987791, var2);
                    return;
                }
                class252.field4036.method232(arg0 - 27382);
                class252.field4036.method231(-17759);
                if (class386.field6000 == null) {
                    field332 = 0;
                } else {
                    field332 = 2;
                }
                class220.field3585 = null;
                class273.field4402 = null;
            }
            if (field332 == 3) {
                int var3 = class252.field4036.method228(-16257);
                if (class490.field7168 > var3 && class252.field4036.method210(0)) {
                    int var4 = class466.field6944 + var3;
                    if (var4 > class490.field7168) {
                        var4 = class490.field7168;
                    }
                    class252.field4036.method209(826987791, var4);
                } else {
                    class466.field6944 = 0;
                    field332 = 0;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class252.field4036.method232(-27382);
            class386.field6000 = null;
            field332 = 0;
            class220.field3585 = null;
            class273.field4402 = null;
            class474.field7018 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V", line = 93)
    public static void method360(int arg0) {
        field329 = null;
        if (arg0 >= -68) {
            field329 = null;
        }
        field328 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILsp;)I", line = 107)
    public static final int method361(int arg0, class589 arg1) {
        field327++;
        class705 var2 = arg1.field8354;
        if (var2.field9912 != null) {
            var2 = var2.method3973(true, class539.field7869);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg0 < 99) {
            return -108;
        }
        int var3 = var2.field9957;
        class642 var4 = arg1.method1856(1208);
        if (arg1.field4183 == -1 || arg1.field4217) {
            var3 = var2.field9938;
        } else if (arg1.field4183 == var4.field9024 || arg1.field4183 == var4.field9042 || arg1.field4183 == var4.field9011 || arg1.field4183 == var4.field9046) {
            var3 = var2.field9966;
        } else if (arg1.field4183 == var4.field9002 || arg1.field4183 == var4.field9023 || arg1.field4183 == var4.field9029 || arg1.field4183 == var4.field9015) {
            var3 = var2.field9915;
        }
        return var3;
    }
}
