import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class63 extends class76 {

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field817 = 0;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "Z")
    public static boolean field823 = false;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "[Lbc;")
    public static class4[] field819;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLkm;Lbn;Lkm;Z)V", line = 14)
    public static final void method420(byte arg0, class133 arg1, class9 arg2, class133 arg3, boolean arg4) {
        class20.field263 = arg1;
        field820++;
        class72.field1001 = arg3;
        class275.field4132 = arg4;
        int var5 = class20.field263.method952((byte) 23) - 1;
        field824 = class20.field263.method970(-115, var5) + var5 * 256;
        class128.field1755 = new String[] { null, null, null, null, class153.field2117 };
        class208.field2992 = new String[] { null, null, class241.field3415, null, null };
        class150.field2071 = arg2;
        int var6 = 106 / ((3 - arg0) / 54);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILlj;)V", line = 38)
    public static final void method421(int arg0, class238 arg1) {
        field818++;
        long var2 = 0L;
        if (arg1.field3372 == 0) {
            var2 = class269.method1853(arg1.field3379, arg1.field3384, arg1.field3370);
        }
        int var4 = -1;
        if (arg1.field3372 == 1) {
            var2 = class89.method684(arg1.field3379, arg1.field3384, arg1.field3370);
        }
        if (arg1.field3372 == 2) {
            var2 = class193.method1352(arg1.field3379, arg1.field3384, arg1.field3370);
        }
        if (arg0 != 25127) {
            method423(38);
        }
        int var5 = 0;
        int var6 = 0;
        if (arg1.field3372 == 3) {
            var2 = class317.method2222(arg1.field3379, arg1.field3384, arg1.field3370);
        }
        if (var2 != 0L) {
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var6 = ((int) var2 & 0x37BF88) >> 20;
            var5 = (int) var2 >> 14 & 0x1F;
        }
        arg1.field3382 = var5;
        arg1.field3374 = var6;
        arg1.field3371 = var4;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IBII)V", line = 83)
    public static final void method422(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = class83.field1199 * arg0 >> 8;
        if (arg1 != 117) {
            return;
        }
        field822++;
        if (var4 != 0 && arg2 != -1) {
            class131.method936(false, false, class44.field544, arg2, 0, var4);
            class31.field384 = true;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 115)
    public static void method423(int arg0) {
        if (arg0 != 0) {
            field817 = 19;
        }
        field819 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I[Lin;IIBZ)V", line = 127)
    public static final void method424(int arg0, class344[] arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        if (arg4 <= 57) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length; var6++) {
            class344 var7 = arg1[var6];
            if (var7 != null && var7.field5246 == arg2) {
                class202.method1435(arg3, arg0, arg5, var7, (byte) 127);
                class33.method187(222, arg0, var7, arg3);
                if (var7.field5200 - var7.field5293 < var7.field5195) {
                    var7.field5195 = var7.field5200 - var7.field5293;
                }
                if (var7.field5195 < 0) {
                    var7.field5195 = 0;
                }
                if ((var7.field5197 - var7.field5334) < var7.field5203) {
                    var7.field5203 = var7.field5197 - var7.field5334;
                }
                if (var7.field5203 < 0) {
                    var7.field5203 = 0;
                }
                if (var7.field5316 == 0) {
                    class275.method1893(-24740, arg5, var7);
                }
            }
        }
        field821++;
    }
}
