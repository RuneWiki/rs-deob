import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class51 extends class141 {

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "Lhi;")
    public static class82 field835 = class95.method664((byte) -88, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "Lhi;")
    public static class82 field822 = class95.method664((byte) -122, "Attaquer");

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "Lhn;")
    public static class317 field825 = new class317(50);

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "J")
    public long field824;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "Lkc;")
    public class51 field831;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "Lkc;")
    public class51 field836;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "[I")
    public static int[] field826;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V", line = 4)
    public final void method358(byte arg0) {
        field823++;
        if (this.field831 == null) {
            return;
        }
        this.field831.field836 = this.field836;
        this.field836.field831 = this.field831;
        if (arg0 == 52) {
            this.field836 = null;
            this.field831 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLjava/lang/Object;Z)[B", line = 22)
    public static final byte[] method359(boolean arg0, Object arg1, boolean arg2) {
        field819++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) ((byte[]) arg1);
            return arg0 ? method363(var3, -125) : var3;
        } else if (arg1 instanceof class257) {
            class257 var4 = (class257) arg1;
            return var4.method1(114);
        } else {
            if (arg2) {
                method359(false, (Object) null, true);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)Z", line = 62)
    public final boolean method360(int arg0) {
        if (arg0 != 4) {
            field822 = (class82) null;
        }
        field827++;
        return this.field831 != null;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)[F", line = 79)
    public static final float[] method361(int arg0) {
        float var1 = class85.method598() + class85.method590();
        field829++;
        int var2 = class85.method596();
        class235.field4094[3] = 1.0F;
        float var3 = (float) ((var2 & 0xFFD6B7) >> 16) / 255.0F;
        float var4 = (float) (var2 >> 8 & 0xFF) / 255.0F;
        float var5 = (float) (var2 & 0xFF) / 255.0F;
        float var6 = 0.58823526F;
        int var7 = 76 % ((-arg0) / 43);
        class235.field4094[0] = class209.field3682[0] * var3 * var6 * var1;
        class235.field4094[2] = class209.field3682[2] * var5 * var6 * var1;
        class235.field4094[1] = class209.field3682[1] * var4 * var6 * var1;
        return class235.field4094;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZIZIB)V", line = 112)
    public static final void method362(boolean arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        if (arg4 != -71) {
            field835 = (class82) null;
        }
        class105.method724(arg0, arg2, class189.field3187.length - 1, arg3, arg1, arg4 ^ 0xFFFFFFB9, 0);
        field820++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([BI)[B", line = 126)
    public static final byte[] method363(byte[] arg0, int arg1) {
        field821++;
        int var2 = arg0.length;
        int var3 = -59 / ((-arg1 - 28) / 35);
        byte[] var4 = new byte[var2];
        class190.method1323(arg0, 0, var4, 0, var2);
        return var4;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIZ)V", line = 143)
    public static final void method364(int arg0, int arg1, int arg2, boolean arg3) {
        field830++;
        class227 var4 = class215.method1531(-1, 4, arg0);
        var4.method1616(64);
        var4.field3929 = arg2;
        if (!arg3) {
            method364(109, -79, -107, false);
        }
        var4.field3923 = arg1;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V", line = 159)
    public static void method365(int arg0) {
        field835 = null;
        field826 = null;
        field822 = null;
        field825 = null;
        if (arg0 != 2) {
            method364(-121, 39, -92, true);
        }
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)V", line = 175)
    public static final void method366(int arg0) {
        field834++;
        class88.method616();
        for (int var1 = 0; var1 < 4; var1++) {
            class180.field3071[var1].method1305(-1);
        }
        if (arg0 != -5) {
            field835 = (class82) null;
        }
        System.gc();
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V", line = 195)
    public static final void method367(int arg0, int arg1) {
        class265.field4529 = arg0;
        class28.field380 = 0;
        field832++;
        class315.field5422 = null;
        class77.field1324 = 1;
        if (arg1 < 10) {
            method366(-44);
        }
        class293.field4918 = false;
        class243.field4227 = -1;
        class136.field2348 = -1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[BZ)I", line = 219)
    public static final int method368(int arg0, byte[] arg1, boolean arg2) {
        if (!arg2) {
            method365(-107);
        }
        field828++;
        return class25.method165(0, 100, arg0, arg1);
    }
}
