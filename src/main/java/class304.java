import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class304 extends class137 {

    @OriginalMember(owner = "client!wl", name = "L", descriptor = "[Lmm;")
    public class8[] field4867;

    @OriginalMember(owner = "client!wl", name = "K", descriptor = "[I")
    public static int[] field4866 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!wl", name = "J", descriptor = "J")
    public static long field4865 = 0L;

    @OriginalMember(owner = "client!wl", name = "M", descriptor = "I")
    public static int field4868 = 0;

    @OriginalMember(owner = "client!wl", name = "S", descriptor = "I")
    public static int field4874 = 0;

    @OriginalMember(owner = "client!wl", name = "G", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!wl", name = "H", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!wl", name = "I", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!wl", name = "O", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!wl", name = "P", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!wl", name = "Q", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!wl", name = "R", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!wl", name = "T", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!wl", name = "N", descriptor = "Ldk;")
    public static class251 field4869;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "(I)V")
    public static final void method2032(int arg0) {
        if (arg0 == 12919) {
            field4864++;
            class233.field3742.method1257(-125);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2033(String arg0, byte arg1) {
        field4872++;
        if (arg0 == null) {
            return;
        }
        if (!(class124.field1968 < 100 || class133.field2104) || class124.field1968 >= 200) {
            class99.method673(true, class298.field4752);
            return;
        }
        String var2 = class310.method2071(-28047, arg0);
        if (var2 == null) {
            return;
        }
        if (arg1 > -83) {
            method2032(-92);
        }
        for (int var3 = 0; var3 < class124.field1968; var3++) {
            String var7 = class310.method2071(-28047, class258.field4165[var3]);
            if (var7 != null && var7.equals(var2)) {
                class99.method673(true, arg0 + class17.field209);
                return;
            }
            if (class308.field4931[var3] != null) {
                String var8 = class310.method2071(-28047, class308.field4931[var3]);
                if (var8 != null && var8.equals(var2)) {
                    class99.method673(true, arg0 + class17.field209);
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class169.field2755; var4++) {
            String var5 = class310.method2071(-28047, class263.field4224[var4]);
            if (var5 != null && var5.equals(var2)) {
                class99.method673(true, class23.field296 + arg0 + class198.field3188);
                return;
            }
            if (class79.field1314[var4] != null) {
                String var6 = class310.method2071(-28047, class79.field1314[var4]);
                if (var6 != null && var6.equals(var2)) {
                    class99.method673(true, class23.field296 + arg0 + class198.field3188);
                    return;
                }
            }
        }
        if (class310.method2071(-28047, class239.field3829.field4778).equals(var2)) {
            class99.method673(true, class116.field1867);
        } else {
            class314.field5061.method828(105, 105);
            class314.field5061.method1108(class230.method1551(arg0, (byte) -87), true);
            class314.field5061.method1148((byte) -99, arg0);
            class23.field299++;
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)Z")
    public final boolean method2034(int arg0, int arg1) {
        field4870++;
        if (arg0 > -104) {
            method2032(-33);
        }
        return this.field4867[arg1].field84;
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(II)Z")
    public final boolean method2035(int arg0, int arg1) {
        field4863++;
        if (arg1 <= 74) {
            this.field4867 = null;
        }
        return this.field4867[arg0].field85;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lfa;")
    public static final class238 method2036(Throwable arg0, String arg1) {
        field4875++;
        class238 var2;
        if (arg0 instanceof class238) {
            var2 = (class238) arg0;
            var2.field3813 = var2.field3813 + ' ' + arg1;
        } else {
            var2 = new class238(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Ldk;Ldk;IZ)V")
    public class304(class251 arg0, class251 arg1, int arg2, boolean arg3) {
        class246 var5 = new class246();
        int var6 = arg0.method1678((byte) 116, arg2);
        this.field4867 = new class8[var6];
        int[] var7 = arg0.method1688(true, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1680(var7[var8], arg2, -83);
            class52 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class52 var12 = (class52) var5.method1643((byte) -86); var12 != null; var12 = (class52) var5.method1642((byte) 75)) {
                if (var12.field878 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1672(0, 0, var11);
                } else {
                    var13 = arg1.method1672(var11, 0, 0);
                }
                var10 = new class52(var11, var13);
                var5.method1646(true, var10);
            }
            this.field4867[var7[var8]] = new class8(var9, var10);
        }
    }

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "(I)V")
    public static void method2037(int arg0) {
        field4869 = null;
        field4866 = null;
        if (arg0 != 0) {
            field4866 = null;
        }
    }
}
