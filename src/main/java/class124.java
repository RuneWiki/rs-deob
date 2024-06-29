import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class124 {

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "Lhb;")
    public static class250 field1716 = new class250(24, 8);

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "Z")
    public static boolean field1718;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)I")
    public static final int method785(int arg0, int arg1) {
        return class187.field2443 == null ? 0 : (class187.field2443[arg0][arg1] & 0xFF) << 3;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
    public static void method786(int arg0) {
        field1716 = null;
        if (arg0 != 5) {
            method787(110, null);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method787(int arg0, String[] arg1) {
        field1715++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        int var4 = 120 % ((-arg0 - 44) / 61);
        return var2;
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)I")
    public static final int method788(int arg0, int arg1) {
        int var7 = arg0 - 1;
        field1717++;
        if (arg1 >= -115) {
            return -59;
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIILus;)V")
    public static final void method789(int arg0, int arg1, int arg2, int arg3, class428 arg4) {
        class510 var5 = class478.method2870(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field5861 = (arg1 << class169.field2206) + class477.field6971;
        arg4.field5864 = arg3;
        arg4.field5863 = (arg2 << class169.field2206) + class477.field6971;
        for (class319 var7 = var5.field7494; var7 != null; var7 = var7.field4102) {
            if (var7.field4107.field6235) {
                int var8 = var7.field4107.method180(-97);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field5864 += var6;
            arg4.field5865 = true;
        }
        var5.field7496 = arg4;
    }
}
