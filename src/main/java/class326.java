import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class326 extends class234 {

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "Ljava/lang/Object;")
    private Object field4696;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public static int field4695 = 0;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field4693 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "[I")
    public static int[] field4699 = new int[2];

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public static int field4700 = 0;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(B)Z", line = 3)
    public final boolean method1722(byte arg0) {
        field4694++;
        if (arg0 > -35) {
            field4693 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lmc;Ljava/lang/Object;)V", line = 15)
    public class326(class316 arg0, Object arg1) {
        super(arg0);
        this.field4696 = arg1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB[Lmb;)V", line = 23)
    public static final void method2154(int arg0, byte arg1, class258[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class258 var4 = arg2[var3];
            if (var4 != null && var4.field3754 == arg0 && (!var4.field3825 || !client.method1823(var4))) {
                if (var4.field3793 == 0) {
                    if (!var4.field3825 && client.method1823(var4) && class183.field2714 != var4) {
                        continue;
                    }
                    method2154(var4.field3854, (byte) -57, arg2);
                    if (var4.field3869 != null) {
                        method2154(var4.field3854, (byte) -57, var4.field3869);
                    }
                    class120 var5 = (class120) class355.field5045.method1219((long) var4.field3854, -100);
                    if (var5 != null) {
                        class339.method2198((byte) 4, var5.field1874);
                    }
                }
                if (var4.field3793 == 6) {
                    if (var4.field3828 != -1 || var4.field3790 != -1) {
                        boolean var6 = class85.method650(var4, arg1 ^ 0xFFFFFFA3);
                        int var7;
                        if (var6) {
                            var7 = var4.field3790;
                        } else {
                            var7 = var4.field3828;
                        }
                        if (var7 != -1) {
                            class51 var8 = class113.method974(var7, (byte) -120);
                            if (var8 != null) {
                                var4.field3894 += class409.field5967;
                                while (var4.field3894 > var8.field845[var4.field3811]) {
                                    var4.field3894 -= var8.field845[var4.field3811];
                                    var4.field3811++;
                                    if (var8.field835.length <= var4.field3811) {
                                        var4.field3811 -= var8.field838;
                                        if (var4.field3811 < 0 || var8.field835.length <= var4.field3811) {
                                            var4.field3811 = 0;
                                        }
                                    }
                                    var4.field3731 = var4.field3811 + 1;
                                    if (var4.field3731 >= var8.field835.length) {
                                        var4.field3731 -= var8.field838;
                                        if (var4.field3731 < 0 || var4.field3731 >= var8.field835.length) {
                                            var4.field3731 = -1;
                                        }
                                    }
                                    class107.method947(true, var4);
                                }
                            }
                        }
                    }
                    if (var4.field3806 != 0 && !var4.field3825) {
                        int var9 = var4.field3806 >> 16;
                        int var10 = var4.field3806 << 16 >> 16;
                        int var11 = class409.field5967 * var9;
                        int var12 = class409.field5967 * var10;
                        var4.field3771 = var4.field3771 + var11 & 0x3FFF;
                        var4.field3889 = var4.field3889 + var12 & 0x3FFF;
                        class107.method947(true, var4);
                    }
                }
            }
        }
        if (arg1 == -57) {
            field4698++;
        }
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(B)Ljava/lang/Object;", line = 139)
    public final Object method1723(byte arg0) {
        if (arg0 >= -55) {
            return null;
        } else {
            field4697++;
            return this.field4696;
        }
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V", line = 157)
    public static void method2155(int arg0) {
        field4699 = null;
        if (arg0 != 0) {
            method2154(-17, (byte) 43, (class258[]) null);
        }
        field4693 = null;
    }
}
