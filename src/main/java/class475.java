import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class475 {

    @OriginalMember(owner = "client!dga", name = "l", descriptor = "B")
    public byte field6897;

    @OriginalMember(owner = "client!dga", name = "m", descriptor = "I")
    public int field6898;

    @OriginalMember(owner = "client!dga", name = "f", descriptor = "I")
    public int field6891;

    @OriginalMember(owner = "client!dga", name = "e", descriptor = "I")
    public int field6890;

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "I")
    public int field6889;

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "S")
    public short field6887;

    @OriginalMember(owner = "client!dga", name = "j", descriptor = "S")
    public short field6895;

    @OriginalMember(owner = "client!dga", name = "g", descriptor = "I")
    public int field6892;

    @OriginalMember(owner = "client!dga", name = "k", descriptor = "S")
    public short field6896;

    @OriginalMember(owner = "client!dga", name = "h", descriptor = "Z")
    public boolean field6893;

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "Lcb;")
    public static class631 field6888 = new class631(65, 0);

    @OriginalMember(owner = "client!dga", name = "p", descriptor = "I")
    public static int field6901 = 0;

    @OriginalMember(owner = "client!dga", name = "o", descriptor = "Lwk;")
    public static class430 field6900 = new class430(9, -1);

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!dga", name = "i", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!dga", name = "n", descriptor = "[[[Llo;")
    public static class114[][][] field6899;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILgba;)V", line = 18)
    public static final void method2885(int arg0, class702 arg1) {
        arg1.method3908(true);
        field6894++;
        int var2 = class673.field9516;
        class573 var3 = class145.field2251 = class279.field4271[var2] = new class573();
        var3.field1628 = var2;
        int var4 = arg1.method3905(arg0 + 22810, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        var3.field1702[0] = var6 - class265.field4123;
        int var7 = var4 & 0x3FFF;
        var3.field9477 = (var3.field1702[0] << 9) + (var3.method878(arg0 ^ 0x4F76) << 8);
        var3.field1704[0] = var7 - class723.field10155;
        var3.field9475 = (var3.field1704[0] << 9) + (var3.method878(-5740) << 8);
        class582.field8234 = var3.field9470 = var3.field9469 = var5;
        if (class584.method3365(false, var3.field1702[0], var3.field1704[0])) {
            var3.field9469++;
        }
        if (class85.field1255[var2] != null) {
            var3.method3327(class85.field1255[var2], -1);
        }
        class472.field6857 = 0;
        class96.field1419[class472.field6857++] = var2;
        class604.field8543[var2] = 0;
        class550.field7846 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method3905(-4, 18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class195 var13 = class457.field6636[var8] = new class195();
                var13.field3355 = -1;
                var13.field3357 = 0;
                var13.field3358 = false;
                var13.field3354 = (var10 << 28) + (var11 << 14) + var12;
                class289.field4443[class550.field7846++] = var8;
                class604.field8543[var8] = 0;
            }
        }
        if (arg0 != -22814) {
            method2887(false);
        }
        arg1.method3909((byte) -96);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZD)V", line = 92)
    public static final void method2886(boolean arg0, double arg1) {
        class118.field1823.method673(class377.field5673);
        field6886++;
        class118.field1823.method671(0, 0, (int) arg1);
        class13.field119.method244(class118.field1823);
        if (!arg0) {
            method2885(76, null);
        }
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 110)
    public class475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field6897 = (byte) arg8;
        this.field6898 = arg1;
        this.field6891 = arg11;
        this.field6890 = arg0;
        this.field6889 = arg3;
        this.field6887 = (short) arg6;
        this.field6895 = (short) arg5;
        this.field6892 = arg2;
        this.field6896 = (short) arg4;
        this.field6893 = arg10;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Z)V", line = 136)
    public static void method2887(boolean arg0) {
        if (arg0) {
            field6888 = null;
            field6899 = null;
            field6900 = null;
        }
    }
}
