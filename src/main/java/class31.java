import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public class class31 {

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "J")
    public static long field397 = 0L;

    @OriginalMember(owner = "mapview!p", name = "f", descriptor = "I")
    public static int field399 = 1;

    @OriginalMember(owner = "mapview!p", name = "i", descriptor = "Lh;")
    public static class15 field402 = class18.method153("Potters Wheel", 1);

    @OriginalMember(owner = "mapview!p", name = "g", descriptor = "Lh;")
    public static class15 field400 = class18.method153("Apothecary", 1);

    @OriginalMember(owner = "mapview!p", name = "j", descriptor = "Lh;")
    public static class15 field403 = class18.method153("labels)3dat", 1);

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "Lh;")
    public static class15 field396 = class18.method153("Axe Shop", 1);

    @OriginalMember(owner = "mapview!p", name = "h", descriptor = "I")
    public static int field401 = 0;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "[B")
    public static byte[] field398;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(B)V", line = 10)
    public static void method206(byte arg0) {
        field400 = null;
        field398 = null;
        field396 = null;
        field403 = null;
        field402 = null;
        if (arg0 != 44) {
            field395 = 94;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(I)B", line = 54)
    public static final byte method207(int arg0) {
        int var1 = -49 % ((12 - arg0) / 48);
        return class12.field179 == null ? 0 : class12.field179[class15.field220];
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(IB)[B", line = 73)
    public static final synchronized byte[] method208(int arg0, byte arg1) {
        if (arg0 == 100 && class15.field228 > 0) {
            byte[] var2 = class6.field93[--class15.field228];
            class6.field93[class15.field228] = null;
            return var2;
        } else if (arg0 == 5000 && class13.field196 > 0) {
            byte[] var3 = class32.field419[--class13.field196];
            class32.field419[class13.field196] = null;
            return var3;
        } else if (arg1 >= -73) {
            return (byte[]) null;
        } else if (arg0 == 30000 && class24.field331 > 0) {
            byte[] var4 = class16.field235[--class24.field331];
            class16.field235[class24.field331] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }
}
