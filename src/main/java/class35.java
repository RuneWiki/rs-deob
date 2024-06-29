import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!u")
public class class35 {

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "Ld;")
    public static class7 field487 = class37.method242("Key", 1333943984);

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "Z")
    public static boolean field490 = false;

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "Ld;")
    public static class7 field489 = class37.method242("???", 1333943984);

    @OriginalMember(owner = "mapview!u", name = "g", descriptor = "Ld;")
    public static class7 field493 = class37.method242("75(U", 1333943984);

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "Lr;")
    public static class32 field488;

    @OriginalMember(owner = "mapview!u", name = "f", descriptor = "Z")
    public static boolean field492;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Lba;ZII)[Lj;", line = 5)
    public static final class18[] method231(class4 arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            return class29.method210(122, arg3, arg0, arg2) ? class24.method156((byte) 80) : null;
        } else {
            return (class18[]) null;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(I)I", line = 23)
    public static final int method232(int arg0) {
        if (arg0 == 17041) {
            return class4.field55 == null ? 0 : class4.field55[class16.field166];
        } else {
            return -104;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(II[Ld;I)Ld;", line = 45)
    public static final class7 method233(int arg0, int arg1, class7[] arg2, int arg3) {
        int var4 = arg0;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg2[arg1 + var5] == null) {
                arg2[arg1 + var5] = class22.field216;
            }
            var4 += arg2[arg1 + var5].field90;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg3; var8++) {
            class7 var9 = arg2[arg1 + var8];
            class19.method136(var9.field79, 0, var6, var7, var9.field90);
            var7 += var9.field90;
        }
        class7 var10 = new class7();
        var10.field79 = var6;
        var10.field90 = var4;
        return var10;
    }

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(I)V", line = 98)
    public static void method234(int arg0) {
        if (arg0 != -24582) {
            field492 = true;
        }
        field488 = null;
        field487 = null;
        field493 = null;
        field489 = null;
    }
}
