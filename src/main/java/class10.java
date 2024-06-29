import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!fa")
public class class10 {

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "I")
    public static int field69 = 0;

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "Ll;")
    public static class21 field70 = class28.method185(-20839, "underlay)3dat");

    @OriginalMember(owner = "mapview!fa", name = "f", descriptor = "Ll;")
    public static class21 field74 = class28.method185(-20839, "Quest Start");

    @OriginalMember(owner = "mapview!fa", name = "i", descriptor = "Ll;")
    public static class21 field77 = class28.method185(-20839, "Sword Shop");

    @OriginalMember(owner = "mapview!fa", name = "h", descriptor = "Ll;")
    public static class21 field76 = class28.method185(-20839, " map");

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "I")
    public static volatile int field71 = 0;

    @OriginalMember(owner = "mapview!fa", name = "g", descriptor = "Ll;")
    public static class21 field75 = class28.method185(-20839, "details)3dat");

    @OriginalMember(owner = "mapview!fa", name = "k", descriptor = "I")
    public static int field79 = 0;

    @OriginalMember(owner = "mapview!fa", name = "j", descriptor = "Ll;")
    public static class21 field78 = class28.method185(-20839, "Platelegs Shop");

    @OriginalMember(owner = "mapview!fa", name = "e", descriptor = "Ll;")
    public static class21 field73 = class28.method185(-20839, "Farming shop");

    @OriginalMember(owner = "mapview!fa", name = "d", descriptor = "Lma;")
    public static PixMap drawArea;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(IIBZ)Ll;", line = 19)
    public static final class21 method27(int arg0, int arg1, byte arg2, boolean arg3) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var4 = 1;
        for (int var5 = arg0 / arg1; var5 != 0; var5 /= arg1) {
            var4++;
        }
        if (arg2 > -63) {
            method27(113, -87, (byte) -90, false);
        }
        int var6 = var4;
        if (arg0 < 0 || arg3) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg0 % arg1;
            if (var9 < 0) {
                var9 = -var9;
            }
            arg0 /= arg1;
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class21 var10 = new class21();
        var10.field197 = var7;
        var10.field204 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Z)V", line = 89)
    public static void method28(boolean arg0) {
        field76 = null;
        field77 = null;
        field73 = null;
        if (arg0) {
            method28(true);
        }
        drawArea = null;
        field78 = null;
        field70 = null;
        field75 = null;
        field74 = null;
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(II)[B", line = 106)
    public static final synchronized byte[] method29(int arg0, int arg1) {
        if (arg1 == 100 && mapview.field234 > 0) {
            byte[] var2 = class26.field314[--mapview.field234];
            class26.field314[mapview.field234] = null;
            return var2;
        } else if (arg1 == 5000 && class13.field96 > 0) {
            byte[] var3 = class21.field205[--class13.field96];
            class21.field205[class13.field96] = null;
            return var3;
        } else if (arg0 != -5001) {
            return (byte[]) null;
        } else if (arg1 == 30000 && class2.field15 > 0) {
            byte[] var4 = mapview.field272[--class2.field15];
            mapview.field272[class2.field15] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
