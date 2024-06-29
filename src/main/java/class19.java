import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ja")
public class class19 {

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "I")
    public static int field200 = -1;

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "Lea;")
    public static class10 field198 = class3.method8("sprites", -120);

    @OriginalMember(owner = "mapview!ja", name = "g", descriptor = "I")
    public static int field204 = 0;

    @OriginalMember(owner = "mapview!ja", name = "e", descriptor = "Lea;")
    public static class10 field202 = class3.method8("loc)3dat", 94);

    @OriginalMember(owner = "mapview!ja", name = "f", descriptor = "I")
    public static int field203 = 0;

    @OriginalMember(owner = "mapview!ja", name = "i", descriptor = "Lea;")
    public static class10 field206 = class3.method8("uitext has incorrect number of strings", -45);

    @OriginalMember(owner = "mapview!ja", name = "j", descriptor = "Lea;")
    public static class10 field207 = class3.method8("(U", -49);

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "Lea;")
    public static class10 field199 = class3.method8("POH Portal", -76);

    @OriginalMember(owner = "mapview!ja", name = "h", descriptor = "Lea;")
    public static class10 field205 = class3.method8("Shield Shop", -125);

    @OriginalMember(owner = "mapview!ja", name = "d", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "mapview!ja", name = "k", descriptor = "[I")
    public static int[] field208;

    @OriginalMember(owner = "mapview!ja", name = "l", descriptor = "[I")
    public static int[] field209;

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(I)V", line = 41)
    public static void method130(int arg0) {
        field198 = null;
        field208 = null;
        if (arg0 != -25007) {
            method133(38, 71, null, (byte) 41);
        }
        field202 = null;
        field206 = null;
        field205 = null;
        field199 = null;
        field207 = null;
        field209 = null;
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(I)[Lpa;", line = 63)
    public static final class30[] method131(int arg0) {
        class30[] var1 = new class30[class36.field491];
        if (arg0 != -20614) {
            return (class30[]) null;
        }
        for (int var2 = 0; var2 < class36.field491; var2++) {
            class30 var3 = new class30();
            var3.field419 = class4.field31[var2];
            var3.field421 = class6.field43[var2];
            var3.field418 = field208[var2];
            var3.field420 = field209[var2];
            int var4 = var3.field420 * var3.field418;
            byte[] var5 = mapview.field338[var2];
            var3.field422 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field422[var6] = class33.field443[class13.method96(var5[var6], 255)];
            }
            var1[var2] = var3;
        }
        class14.method101(16267);
        return var1;
    }

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "(I)J", line = 113)
    public static final synchronized long method132(int arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < class22.field240) {
            class35.field486 += class22.field240 - var1;
        }
        class22.field240 = var1;
        return arg0 == 14429 ? class35.field486 + var1 : 50L;
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(IILs;B)Z", line = 139)
    public static final boolean method133(int arg0, int arg1, class35 arg2, byte arg3) {
        if (arg3 != 20) {
            return false;
        }
        byte[] var4 = arg2.method237(-31985, arg0, arg1);
        if (var4 == null) {
            return false;
        } else {
            class40.method255(var4, 0);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(IJ)V", line = 164)
    public static final void method134(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (arg0 != 255) {
                method130(15);
            }
        } catch (InterruptedException var4) {
        }
    }
}
