import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public class class1 {

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "Ls;")
    public static class34 field5 = class9.method35("Enter place name to find", 220);

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "I")
    public static int field3 = -1;

    @OriginalMember(owner = "mapview!a", name = "j", descriptor = "I")
    public static int field10 = 0;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "Ls;")
    public static class34 field1 = class9.method35("Magic Shop", 220);

    @OriginalMember(owner = "mapview!a", name = "g", descriptor = "Ls;")
    public static class34 field7 = class9.method35("Enter place name to find", 220);

    @OriginalMember(owner = "mapview!a", name = "n", descriptor = "Ls;")
    public static class34 field14 = class9.method35("Tannery", 220);

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "Ls;")
    public static class34 field2 = class9.method35("Jewellery", 220);

    @OriginalMember(owner = "mapview!a", name = "q", descriptor = "Ls;")
    public static class34 field17 = class9.method35("overlay2)3dat", 220);

    @OriginalMember(owner = "mapview!a", name = "p", descriptor = "Ls;")
    public static class34 field16 = class9.method35("Loom", 220);

    @OriginalMember(owner = "mapview!a", name = "h", descriptor = "I")
    public static int field8 = 0;

    @OriginalMember(owner = "mapview!a", name = "k", descriptor = "B")
    public byte field11;

    @OriginalMember(owner = "mapview!a", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "mapview!a", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "mapview!a", name = "o", descriptor = "Lea;")
    public static class10 field15;

    @OriginalMember(owner = "mapview!a", name = "r", descriptor = "[B")
    public byte[] field18;

    @OriginalMember(owner = "mapview!a", name = "f", descriptor = "[B")
    public static byte[] field6;

    @OriginalMember(owner = "mapview!a", name = "m", descriptor = "[[La;")
    public static class1[][] field13;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IBZI)Ls;", line = 6)
    private static final class34 method1(int arg0, byte arg1, boolean arg2, int arg3) {
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var4 = 1;
        for (int var5 = arg3 / arg0; var5 != 0; var5 /= arg0) {
            var4++;
        }
        int var6 = var4;
        if (arg3 < 0 || arg2) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg2) {
            var7[0] = 43;
        }
        int var8 = 53 / ((arg1 + 79) / 42);
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = arg3 % arg0;
            arg3 /= arg0;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var9 - 1] = (byte) (var10 + 48);
        }
        class34 var11 = new class34();
        var11.field478 = var6;
        var11.field475 = var7;
        return var11;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(B)V", line = 72)
    public static void method2(byte arg0) {
        field17 = null;
        field16 = null;
        field15 = null;
        field13 = null;
        field7 = null;
        field2 = null;
        if (arg0 <= 53) {
            method1(-23, (byte) -117, false, -103);
        }
        field14 = null;
        field5 = null;
        field6 = null;
        field1 = null;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(I)V", line = 113)
    public final void method3(int arg0) {
        if (arg0 != 0) {
            return;
        }
        boolean var2 = true;
        if (this.field18 == null) {
            return;
        }
        this.field11 = this.field18[0];
        for (int var3 = 0; var3 < 4096; var3++) {
            if (this.field18[var3] != this.field11) {
                var2 = false;
                break;
            }
        }
        if (var2) {
            this.field18 = null;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(II)Ls;", line = 175)
    public static final class34 method4(int arg0, int arg1) {
        if (arg0 != 0) {
            field6 = null;
        }
        return method1(10, (byte) 97, false, arg1);
    }
}
