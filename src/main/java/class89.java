import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class class89 {

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Lmc;")
    public static class86 field2031 = new class86(new byte[5000]);

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Lsc;")
    private static class128 field2038 = class129.method1017(false, "Service unavailable)3");

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "Lsc;")
    public static class128 field2033 = field2038;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field2034 = 0;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "Lsc;")
    public static class128 field2039 = class129.method1017(false, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Lsc;")
    public static class128 field2040 = class129.method1017(false, "mapmarker");

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field2042 = 0;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field2044 = 0;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "[S")
    public static short[] field2041;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILsf;ZI)[Lb;")
    public static final class8[] method695(int arg0, class131 arg1, boolean arg2, int arg3) {
        field2037++;
        if (class100.method765(arg1, 119, arg3, arg0)) {
            if (!arg2) {
                field2033 = null;
            }
            return class55.method425(-99);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lhe;I)V")
    public static final void method696(class54 arg0, int arg1) {
        if (class110.field2483 == arg0.field1124) {
            class153.field3517[arg0.field1193] = true;
        }
        field2043++;
        if (arg1 != 1) {
            method700(-91, -56, 77, 20);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lsf;I)V")
    public static final void method697(class131 arg0, int arg1) {
        field2029++;
        class93.field2148 = arg0;
        if (arg1 != 1) {
            method696(null, -114);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
    public abstract void method152(boolean arg0);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BIII)V")
    public static final void method698(byte arg0, int arg1, int arg2, int arg3) {
        class54 var4 = class152.method1210(arg2, false, arg1);
        field2028++;
        if (var4 != null && var4.field1199 != null) {
            class18 var5 = new class18();
            var5.field321 = var4.field1199;
            var5.field314 = var4;
            class46.method341(var5, arg0 - 2550);
        }
        class113.field2549 = arg2;
        class153.field3526 = arg3;
        class65.field1459 = true;
        class31.field615 = arg1;
        method696(var4, arg0 ^ 0xFFFFFFCC);
        if (arg0 != -51) {
            field2042 = 25;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)V")
    public static void method699(boolean arg0) {
        field2038 = null;
        field2039 = null;
        field2033 = null;
        if (!arg0) {
            field2039 = null;
        }
        field2040 = null;
        field2041 = null;
        field2031 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)I")
    public static final int method700(int arg0, int arg1, int arg2, int arg3) {
        field2030++;
        int var4 = arg2 - 1 & arg0;
        int var5 = arg2 - 1 & arg3;
        int var6 = arg3 / arg2;
        int var7 = arg0 / arg2;
        int var8 = class34.method251(var6, var7, (byte) 76);
        int var9 = class34.method251(var6, var7 + 1, (byte) -121);
        int var10 = class34.method251(var6 + 1, var7, (byte) 5);
        int var11 = class34.method251(var6 + 1, arg1 + var7, (byte) -13);
        int var12 = class127.method965(var9, arg2, var8, var4, 30590);
        int var13 = class127.method965(var11, arg2, var10, var4, 30590);
        return class127.method965(var13, arg2, var12, var5, arg1 ^ 0x777F);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)I")
    public abstract int method151(int arg0, int arg1, int arg2);
}
