import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class137 extends class45 {

    @OriginalMember(owner = "client!fca", name = "m", descriptor = "I")
    public static int field1873 = 0;

    @OriginalMember(owner = "client!fca", name = "i", descriptor = "Led;")
    public static class116 field1869 = new class116();

    @OriginalMember(owner = "client!fca", name = "n", descriptor = "Ltt;")
    public static class338 field1874 = new class338(83, 4);

    @OriginalMember(owner = "client!fca", name = "j", descriptor = "I")
    public int field1870;

    @OriginalMember(owner = "client!fca", name = "k", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!fca", name = "l", descriptor = "I")
    public int field1872;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)V", line = 13)
    public static void method779(int arg0) {
        field1874 = null;
        if (arg0 != 7396) {
            method780(null, -104, 121, 92, 55, -78, -78);
        }
        field1869 = null;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lr;IIIIII)Lda;", line = 30)
    public static final class470 method780(class562 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1871++;
        long var7 = (long) arg2;
        if (arg4 < 22) {
            field1869 = null;
        }
        class470 var9 = (class470) class642.field8878.method2176(-126, var7);
        short var10 = 2055;
        if (var9 == null) {
            class250 var11 = class258.method1563(0, class94.field1139, arg2, 65535);
            if (var11 == null) {
                return null;
            }
            if (var11.field3261 < 13) {
                var11.method1513(2, (byte) 79);
            }
            var9 = arg0.method1089(var11, var10, class90.field1099, 64, 768);
            class642.field8878.method2174(var9, var7, (byte) -88);
        }
        class470 var12 = var9.method649((byte) 2, var10, true);
        if (arg6 != 0) {
            var12.method612(arg6);
        }
        if (arg5 != 0) {
            var12.method643(arg5);
        }
        if (arg3 != 0) {
            var12.method616(arg3);
        }
        if (arg1 != 0) {
            var12.method605(0, arg1, 0);
        }
        return var12;
    }
}
