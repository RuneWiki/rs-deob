import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ea")
public class class10 extends class16 {

    @OriginalMember(owner = "mapview!ea", name = "l", descriptor = "Lba;")
    public static class4 field159 = class14.method105((byte) -75, "???");

    @OriginalMember(owner = "mapview!ea", name = "m", descriptor = "Lba;")
    public static class4 field160 = class14.method105((byte) -102, "Dairy Churn");

    @OriginalMember(owner = "mapview!ea", name = "k", descriptor = "Lba;")
    public static class4 field158 = class14.method105((byte) -66, "Mini)2Game");

    @OriginalMember(owner = "mapview!ea", name = "i", descriptor = "[Z")
    public static boolean[] field156 = new boolean[112];

    @OriginalMember(owner = "mapview!ea", name = "j", descriptor = "Ljava/awt/Image;")
    public static Image field157;

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "([Lba;III)Lba;", line = 7)
    private static final class4 method88(class4[] arg0, int arg1, int arg2, int arg3) {
        int var4 = 0;
        for (int var5 = arg3; var5 < arg1; var5++) {
            if (arg0[arg2 + var5] == null) {
                arg0[arg2 + var5] = class29.field368;
            }
            var4 += arg0[arg2 + var5].field84;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg1; var8++) {
            class4 var9 = arg0[arg2 + var8];
            class18.method127(var9.field82, 0, var7, var6, var9.field84);
            var6 += var9.field84;
        }
        class4 var10 = new class4();
        var10.field84 = var4;
        var10.field82 = var7;
        return var10;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(I)V", line = 67)
    public static void method89(int arg0) {
        field156 = null;
        field160 = null;
        field158 = null;
        int var1 = -82 % ((65 - arg0) / 46);
        field157 = null;
        field159 = null;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(I[Lba;)Lba;", line = 109)
    public static final class4 method90(int arg0, class4[] arg1) {
        if (arg0 > -106) {
            return (class4) null;
        } else if (arg1.length < 2) {
            throw new IllegalArgumentException();
        } else {
            return method88(arg1, arg1.length, 0, 0);
        }
    }
}
