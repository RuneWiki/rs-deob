import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!va")
public class class42 {

    @OriginalMember(owner = "mapview!va", name = "d", descriptor = "Lua;")
    public static class41 field515 = class16.method86("POH Portal", true);

    @OriginalMember(owner = "mapview!va", name = "f", descriptor = "Lua;")
    public static class41 field517 = class16.method86("Find", true);

    @OriginalMember(owner = "mapview!va", name = "a", descriptor = "Lua;")
    public static class41 field512 = class16.method86("Farming patch", true);

    @OriginalMember(owner = "mapview!va", name = "b", descriptor = "Lua;")
    public static class41 field513 = class16.method86("Makeover Mage", true);

    @OriginalMember(owner = "mapview!va", name = "e", descriptor = "Lua;")
    public static class41 field516 = class16.method86("Hunter Training", true);

    @OriginalMember(owner = "mapview!va", name = "c", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "mapview!va", name = "g", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "mapview!va", name = "a", descriptor = "(I)[Lj;", line = 41)
    public static final class18[] method248(int arg0) {
        class18[] var1 = new class18[class11.field110];
        for (int var2 = arg0; var2 < class11.field110; var2++) {
            int var3 = class9.field95[var2] * class1.field3[var2];
            byte[] var4 = class39.field478[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class17.field150[class38.method213(255, var4[var6])];
            }
            var1[var2] = new class18(class9.field92, mapview.field354, class23.field245[var2], class43.field541[var2], class9.field95[var2], class1.field3[var2], var5);
        }
        class37.method209(arg0 + 854741736);
        return var1;
    }

    @OriginalMember(owner = "mapview!va", name = "a", descriptor = "(IJ)V", line = 78)
    public static final void method249(int arg0, long arg1) {
        if (arg0 >= -126) {
            field517 = null;
        }
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class40.method219(0, arg1 - 1L);
            class40.method219(0, 1L);
        } else {
            class40.method219(0, arg1);
        }
    }

    @OriginalMember(owner = "mapview!va", name = "b", descriptor = "(I)V", line = 109)
    public static void method250(int arg0) {
        field512 = null;
        field513 = null;
        field515 = null;
        field517 = null;
        field516 = null;
        if (arg0 != -16518) {
            method249(18, 40L);
        }
    }
}
