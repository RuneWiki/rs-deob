import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class547 extends class450 {

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field7224 = 0;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "[S")
    private static short[] field7229 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "F")
    public static float field7230 = 0.0F;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "[S")
    private static short[] field7233 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "[S")
    private static short[] field7234 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "[S")
    private static short[] field7231 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "[[S")
    public static short[][] field7227 = new short[][] { field7229, field7233, field7234, field7231 };

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "[[B")
    public static byte[][] field7235;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V", line = 4)
    public static void method3059(int arg0) {
        field7227 = null;
        field7235 = null;
        field7231 = null;
        if (arg0 != 20418) {
            method3060(-6, (class433) null);
        }
        field7233 = null;
        field7234 = null;
        field7229 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILli;)V", line = 24)
    public static final void method3060(int arg0, class433 arg1) {
        ++field7225;
        if (!class403.field5625) {
            if (arg0 != 0) {
                method3060(-116, (class433) null);
            }
            arg1.method3564(true);
            --class181.field2730;
            if (arg1.field5955) {
                for (class236 var2 = (class236) class592.field7703.method4051(arg0 + 896); var2 != null; var2 = (class236) class592.field7703.method4049(true)) {
                    if (var2.field3320.equals(arg1.field5965)) {
                        boolean var3 = false;
                        for (class433 var4 = (class433) var2.field3322.method4051(896); var4 != null; var4 = (class433) var2.field3322.method4049(true)) {
                            if (arg1 == var4) {
                                var3 = true;
                                if (var2.method1486(arg1, 0)) {
                                    class130.method1022(true, var2);
                                }
                                break;
                            }
                        }
                        if (var3) {
                            return;
                        }
                    }
                }
            } else {
                long var5 = arg1.field5958;
                class236 var7;
                for (var7 = (class236) class76.field925.method2135(var5, (byte) 31); var7 != null && !var7.field3320.equals(arg1.field5965); var7 = (class236) class76.field925.method2141((byte) 67)) {
                }
                if (var7 != null && var7.method1486(arg1, 0)) {
                    class130.method1022(true, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 97)
    public final void method73(byte arg0) {
        if (arg0 != 98) {
            field7227 = null;
        }
        ++field7236;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)V", line = 108)
    public final void method67(boolean arg0, int arg1) {
        super.field6170 = arg1;
        if (!arg0) {
            method3060(76, (class433) null);
        }
        ++field7226;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I", line = 133)
    public final int method75(int arg0, int arg1) {
        if (arg0 != 0) {
            return -60;
        } else {
            ++field7232;
            return 1;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)I", line = 146)
    public final int method68(boolean arg0) {
        if (arg0) {
            return -13;
        } else {
            ++field7228;
            return 0;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(ILup;)V", line = 157)
    public class547(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)I", line = 160)
    public final int method3061(boolean arg0) {
        if (!arg0) {
            field7227 = null;
        }
        ++field7223;
        return super.field6170;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lup;)V", line = 171)
    public class547(class278 arg0) {
        super(arg0);
    }
}
