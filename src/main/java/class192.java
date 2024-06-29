import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class192 extends class165 {

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
    public int field3140;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public int field3133;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "[C")
    public static char[] field3139 = new char[128];

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    public static int field3138 = 0;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3137 = "M";

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIII)V", line = 4)
    public static final void method1420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3135++;
        if (arg1 == arg4) {
            class62.method424(arg7, true, arg3, arg4, arg6, arg2, arg5);
            return;
        }
        if (arg0 >= -115) {
            method1424(-91, 28, 13);
        }
        if (arg5 - arg4 >= class336.field5249 && class191.field3131 >= arg5 + arg4 && class98.field1410 <= (arg6 - arg1) && class279.field4497 >= arg6 + arg1) {
            class179.method1342(arg7, arg1, arg4, arg5, arg6, arg3, arg2, 4431);
        } else {
            class25.method145(arg1, arg4, arg6, (byte) 72, arg5, arg7, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)I", line = 40)
    public static final int method1421(byte arg0, int arg1) {
        if (arg0 != 4) {
            field3137 = (String) null;
        }
        field3132++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)V", line = 51)
    public static void method1422(int arg0) {
        field3137 = null;
        if (arg0 != 0) {
            field3139 = (char[]) null;
        }
        field3139 = null;
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)[Lek;", line = 67)
    public static final class220[] method1423(int arg0) {
        field3134++;
        class220[] var1 = new class220[class48.field680];
        int var2 = 113 % ((arg0 - 74) / 36);
        for (int var3 = 0; var3 < class48.field680; var3++) {
            int var4 = class184.field3046[var3] * class102.field1489[var3];
            byte[] var5 = class278.field4481[var3];
            int[] var6 = new int[var4];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7] = class205.field3370[client.method767(255, var5[var7])];
            }
            var1[var3] = new class220(class303.field4757, class243.field3832, class270.field4364[var3], class51.field732[var3], class102.field1489[var3], class184.field3046[var3], var6);
        }
        class106.method727(true);
        return var1;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)J", line = 104)
    public static final long method1424(int arg0, int arg1, int arg2) {
        class204 var3 = class324.field5032[arg0][arg1][arg2];
        return var3 == null || var3.field3342 == null ? 0L : var3.field3342.field488;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(II)V", line = 111)
    public class192(int arg0, int arg1) {
        this.field3140 = arg0;
        this.field3133 = arg1;
    }
}
