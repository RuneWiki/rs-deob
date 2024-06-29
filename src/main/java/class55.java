import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class55 extends class74 {

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Le;")
    public static class191 field1015 = class54.method368("name_icons", 2047);

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field1018 = 0;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Le;")
    public static class191 field1019 = class54.method368(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 2047);

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "Lef;")
    public static class175 field1020 = new class175();

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "[Lwa;")
    public static class226[] field1016;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "[Lc;")
    public static class60[] field1017;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static void method371(byte arg0) {
        field1016 = null;
        field1019 = null;
        field1015 = null;
        field1017 = null;
        if (arg0 >= -86) {
            field1016 = null;
        }
        field1020 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V")
    public static final void method372(int arg0, int arg1) {
        class67.field1160 = arg1;
        field1014++;
        class270.field4767 = -1;
        class270.field4767 = arg0;
        class185.method1256(0);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZII)Le;")
    public static final class191 method373(int arg0, boolean arg1, int arg2, int arg3) {
        field1013++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var4 = 1;
        for (int var5 = arg3 / arg2; var5 != 0; var5 /= arg2) {
            var4++;
        }
        int var6 = var4;
        if (arg3 < 0 || arg1) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 76) {
            return null;
        }
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg3 % arg2;
            arg3 /= arg2;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class191 var9 = new class191();
        var9.field3392 = var7;
        var9.field3379 = var6;
        return var9;
    }
}
