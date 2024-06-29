import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class192 {

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "[S")
    public static short[] field3373 = new short[] { 30, 41, 44, 45, 42, 5, 2, 8 };

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "Z")
    public static boolean field3375 = false;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "Loa;")
    private static class99 field3378 = class221.method1463(2844, "Loading)3)3)3");

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "Loa;")
    public static class99 field3376 = field3378;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "Ltf;")
    public static class107 field3382;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BILtg;Ltg;Z)Lhl;")
    public static final class39 method1298(byte arg0, int arg1, class182 arg2, class182 arg3, boolean arg4) {
        boolean var5 = true;
        int[] var6 = arg2.method1252(true, arg1);
        field3381++;
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method1244(arg1, var6[var7], 104);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | var8[0] & 0xFF << 8;
                byte[] var10;
                if (arg4) {
                    var10 = arg3.method1244(0, var9, 111);
                } else {
                    var10 = arg3.method1244(var9, 0, 97);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        int var11 = 93 % ((arg0 + 41) / 40);
        try {
            return new class39(arg2, arg3, arg1, arg4);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILed;)V")
    public static final void method1299(int arg0, class183 arg1) {
        field3384++;
        class80 var2 = (class80) class220.field3831.method1550(true, arg1.field3224.method697(-23666));
        if (arg0 != 16) {
            method1302(10, -127);
        }
        if (var2 == null) {
            class96.method643(arg1, arg1.field1259[0], 92, class255.field4407, 0, arg1.field1317[0], (class153) null, (class156) null);
        } else {
            var2.method554(-30438);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)I")
    public static final int method1300(int arg0) {
        field3377++;
        if (arg0 != 16) {
            method1298((byte) 20, 123, (class182) null, (class182) null, true);
        }
        return 16;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
    public static void method1301(byte arg0) {
        int var1 = 119 % ((arg0 - 39) / 47);
        field3382 = null;
        field3378 = null;
        field3376 = null;
        field3373 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)I")
    public static final int method1302(int arg0, int arg1) {
        if (arg0 != 159) {
            method1302(-70, -27);
        }
        field3380++;
        if (arg1 >= 97 && arg1 <= 122 || arg1 >= 224 && arg1 <= 254 && arg1 != 247) {
            return arg1 - 32;
        } else if (arg1 == 255) {
            return 159;
        } else if (arg1 == 156) {
            return 140;
        } else {
            return arg1;
        }
    }
}
