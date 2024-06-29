import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!u")
public class class38 {

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "Z")
    public static boolean field512 = false;

    @OriginalMember(owner = "mapview!u", name = "g", descriptor = "Ls;")
    public static class34 field516 = class9.method35("Cooking Range", 220);

    @OriginalMember(owner = "mapview!u", name = "h", descriptor = "Ls;")
    public static class34 field517 = class9.method35("Achievement Start", 220);

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "[[B")
    public static byte[][] field511 = new byte[250][];

    @OriginalMember(owner = "mapview!u", name = "i", descriptor = "Ls;")
    public static class34 field518 = class9.method35("General Store", 220);

    @OriginalMember(owner = "mapview!u", name = "l", descriptor = "Ls;")
    public static class34 field521 = class9.method35(" map", 220);

    @OriginalMember(owner = "mapview!u", name = "k", descriptor = "Ls;")
    public static class34 field520 = class9.method35("Sword Shop", 220);

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "[B")
    public static byte[] field514;

    @OriginalMember(owner = "mapview!u", name = "f", descriptor = "[B")
    public static byte[] field515;

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "[I")
    public static int[] field513;

    @OriginalMember(owner = "mapview!u", name = "j", descriptor = "[Ls;")
    public static class34[] field519;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(I)B", line = 4)
    public static final byte method262(int arg0) {
        if (arg0 != 665538502) {
            method264(101);
        }
        return class31.field443 == null ? 0 : class31.field443[class31.field433];
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "([BZ)[B", line = 22)
    public static final byte[] method263(byte[] arg0, boolean arg1) {
        if (arg1) {
            field514 = null;
        }
        class29 var2 = new class29(arg0);
        int var3 = var2.method197(3);
        int var4 = var2.method195(-127);
        if (var4 < 0 || mapview.field288 != 0 && mapview.field288 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method198((byte) 81, var4, var5, 0);
            return var5;
        } else {
            int var6 = var2.method195(-89);
            if (var6 < 0 || mapview.field288 != 0 && mapview.field288 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class20.method91(var7, var6, arg0, var4, 9);
            } else {
                class8.field63.method59(var2, var7, (byte) 64);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(I)V", line = 83)
    public static void method264(int arg0) {
        field513 = null;
        field521 = null;
        field520 = null;
        field517 = null;
        field515 = null;
        field511 = null;
        field516 = null;
        if (arg0 != -13631) {
            method266(62, null);
        }
        field518 = null;
        field514 = null;
        field519 = null;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(IBI)V", line = 119)
    public static final void method265(int arg0, byte arg1, int arg2) {
        class19.field172 = arg2 >> 6;
        if (arg1 != 118) {
            method263(null, true);
        }
        class14.field130 = arg0 & 0x3F;
        class12.field113 = arg0 >> 6;
        class26.field363 = arg2 & 0x3F;
        class31.field433 = (class14.field130 << 6) + class26.field363;
        class26.method169(arg1 ^ 0x72);
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(I[B)[B", line = 179)
    public static final byte[] method266(int arg0, byte[] arg1) {
        int var2 = arg1.length;
        if (arg0 < 55) {
            return (byte[]) null;
        } else {
            byte[] var3 = new byte[var2];
            class5.method16(arg1, 0, var3, 0, var2);
            return var3;
        }
    }
}
