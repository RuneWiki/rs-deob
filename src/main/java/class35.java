import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!u")
public class class35 {

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "I")
    public static int field444 = -1;

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "Lj;")
    public static class17 field443 = class30.method190(-117, "General Store");

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "Lj;")
    public static class17 field445 = class30.method190(-119, "u_pass");

    @OriginalMember(owner = "mapview!u", name = "h", descriptor = "Lj;")
    public static class17 field448 = class30.method190(-116, "Clothes Shop");

    @OriginalMember(owner = "mapview!u", name = "f", descriptor = "I")
    public static int field446 = 0;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "Lj;")
    public static class17 field441 = class30.method190(-115, "Hair Dressers");

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "Lj;")
    public static class17 field442 = class30.method190(-121, "Food Shop");

    @OriginalMember(owner = "mapview!u", name = "g", descriptor = "[B")
    public static byte[] field447;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(I)V", line = 6)
    public static void method237(int arg0) {
        field447 = null;
        if (arg0 != 255) {
            method238((byte) -55);
        }
        field441 = null;
        field448 = null;
        field442 = null;
        field443 = null;
        field445 = null;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(B)I", line = 32)
    public static final int method238(byte arg0) {
        if (arg0 >= -52) {
            return -127;
        } else if (class6.field122 == null) {
            return 0;
        } else if (class6.field122.field366 == null) {
            return class11.field220[class6.field122.field362 & 0xFF];
        } else {
            return class11.field220[class6.field122.field366[class13.field234] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(II)[B", line = 54)
    public static final synchronized byte[] method239(int arg0, int arg1) {
        if (arg1 == 100 && class8.field192 > 0) {
            byte[] var2 = class6.field134[--class8.field192];
            class6.field134[class8.field192] = null;
            return var2;
        } else if (arg1 == 5000 && class26.field344 > 0) {
            byte[] var3 = class34.field437[--class26.field344];
            class34.field437[class26.field344] = null;
            return var3;
        } else {
            int var4 = 107 % ((-arg0 - 62) / 61);
            if (arg1 == 30000 && class4.field111 > 0) {
                byte[] var5 = class4.field101[--class4.field111];
                class4.field101[class4.field111] = null;
                return var5;
            } else {
                return new byte[arg1];
            }
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(II[Lj;I)Lj;", line = 143)
    public static final class17 method240(int arg0, int arg1, class17[] arg2, int arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg2[arg3 + var5] == null) {
                arg2[arg3 + var5] = mapview.field4;
            }
            var4 += arg2[arg3 + var5].field268;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg1; var8++) {
            class17 var9 = arg2[arg3 + var8];
            class14.method102(var9.field263, 0, var7, var6, var9.field268);
            var6 += var9.field268;
        }
        if (arg0 > -112) {
            return (class17) null;
        } else {
            class17 var10 = new class17();
            var10.field268 = var4;
            var10.field263 = var7;
            return var10;
        }
    }
}
