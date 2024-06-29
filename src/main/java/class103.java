import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class103 {

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public int field1744;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public int field1740;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public int field1746;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public int field1742;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "Loa;")
    public static class99 field1739 = class221.method1463(2844, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "J")
    public static long field1743 = 0L;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1738 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "Loa;")
    public static class99 field1749 = class221.method1463(2844, " )2> ");

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field1748 = -1;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field1751 = 0;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public static int field1752 = 0;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "Loa;")
    private static class99 field1754 = class221.method1463(2844, "Loaded title screen");

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "Loa;")
    public static class99 field1753 = field1754;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ltf;II)Loa;")
    public static final class99 method718(class107 arg0, int arg1, int arg2) {
        field1747++;
        if (!class288.method1935(arg1, 1, client.method1066(arg0)) && arg0.field1875 == null) {
            return null;
        } else if (arg0.field1779 == null || arg1 >= arg0.field1779.length || arg0.field1779[arg1] == null || arg0.field1779[arg1].method705(-34).method659(62) == 0) {
            return class278.field4881 ? class198.method1332(63, new class99[] { class120.field2120, class198.method1333(-102, arg1) }) : null;
        } else {
            if (arg2 != 0) {
                method718((class107) null, -19, -100);
            }
            return arg0.field1779[arg1];
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)Le;")
    public static final class65 method719(int arg0) {
        if (arg0 >= -36) {
            return null;
        }
        field1745++;
        class65 var1 = (class65) class23.field305.method1325(-125);
        if (var1 != null) {
            var1.method828((byte) -10);
            var1.method1346(-86);
            return var1;
        }
        class65 var2;
        do {
            var2 = (class65) class149.field2623.method1325(-73);
            if (var2 == null) {
                return null;
            }
            if (var2.method435((byte) -89) > class231.method1513(-70)) {
                return null;
            }
            var2.method828((byte) 122);
            var2.method1346(-19);
        } while ((Long.MIN_VALUE & var2.field3476) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
    public static void method720(int arg0) {
        field1754 = null;
        field1753 = null;
        field1738 = null;
        if (arg0 >= 43) {
            field1739 = null;
            field1749 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIILuk;Luk;IIJ)V")
    public static final void method721(int arg0, int arg1, int arg2, int arg3, class98 arg4, class98 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class167 var10 = new class167();
        var10.field2984 = arg8;
        var10.field2985 = arg1 * 128 + 64;
        var10.field2978 = arg2 * 128 + 64;
        var10.field2981 = arg3;
        var10.field2988 = arg4;
        var10.field2989 = arg5;
        var10.field2994 = arg6;
        var10.field2976 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class128.field2236[var11][arg1][arg2] == null) {
                class128.field2236[var11][arg1][arg2] = new class216(var11, arg1, arg2);
            }
        }
        class128.field2236[arg0][arg1][arg2].field3762 = var10;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
    public class103() {
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lmk;)V")
    public class103(class103 arg0) {
        this.field1744 = arg0.field1744;
        this.field1740 = arg0.field1740;
        this.field1746 = arg0.field1746;
        this.field1742 = arg0.field1742;
    }
}
