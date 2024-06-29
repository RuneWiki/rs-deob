import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class77 {

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "[B")
    public static byte[] field1036 = new byte[520];

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Z")
    public static boolean field1034 = false;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "Lmc;")
    public static class78 field1038;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Lrt;")
    public static class137 field1042;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Lje;")
    public static class253 field1041;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static void method510(int arg0) {
        if (arg0 != 1) {
            field1040 = 126;
        }
        field1038 = null;
        field1042 = null;
        field1041 = null;
        field1036 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)V")
    public static final void method511(int arg0, int arg1, int arg2, int arg3) {
        field1039++;
        if (arg1 != 1) {
            field1036 = null;
        }
        int var4 = class488.field6789.field6688 * arg3 >> 8;
        if (var4 != 0 && arg0 != -1) {
            class9.method57(var4, (byte) 88, arg0, false, 0, class168.field2331);
            class219.field2925 = true;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([[[Lf;B)V")
    public static final void method512(class491[][][] arg0, byte arg1) {
        if (arg1 != 18) {
            method512((class491[][][]) null, (byte) 7);
        }
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class491[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class491 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field6842 instanceof class381) {
                            ((class381) var6.field6842).method1(-113);
                        }
                        if (var6.field6840 instanceof class381) {
                            ((class381) var6.field6840).method1(-113);
                        }
                        if (var6.field6849 instanceof class381) {
                            ((class381) var6.field6849).method1(-118);
                        }
                        if (var6.field6864 instanceof class381) {
                            ((class381) var6.field6864).method1(-111);
                        }
                        if (var6.field6847 instanceof class381) {
                            ((class381) var6.field6847).method1(arg1 - 127);
                        }
                        for (class309 var7 = var6.field6845; var7 != null; var7 = var7.field4084) {
                            class471 var8 = var7.field4091;
                            if (var8 instanceof class381) {
                                ((class381) var8).method1(arg1 ^ 0xFFFFFF81);
                            }
                        }
                    }
                }
            }
        }
        field1037++;
    }

    static {
        new class206("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field1038 = new class78(9, 15);
        field1042 = new class137("RC", 1);
    }
}
