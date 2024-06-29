import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class98 extends class297 {

    @OriginalMember(owner = "client!qu", name = "J", descriptor = "Lmu;")
    public static class303 field1694 = new class303(73, 3);

    @OriginalMember(owner = "client!qu", name = "O", descriptor = "[I")
    public static int[] field1699 = new int[2];

    @OriginalMember(owner = "client!qu", name = "M", descriptor = "Lmu;")
    public static class303 field1697 = new class303(102, 3);

    @OriginalMember(owner = "client!qu", name = "I", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!qu", name = "K", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!qu", name = "L", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!qu", name = "N", descriptor = "I")
    public static int field1698;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qu", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field1700;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "([Lat;II)V")
    public static final void method914(class378[] arg0, int arg1, int arg2) {
        if (arg2 < 116) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class378 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field5450 == 0) {
                    if (var4.field5474 != null) {
                        method914(var4.field5474, arg1, 125);
                    }
                    class432 var5 = (class432) class323.field4473.method1465((long) var4.field5506, -6008);
                    if (var5 != null) {
                        class640.method3635((byte) -8, var5.field6181, arg1);
                    }
                }
                if (arg1 == 0 && var4.field5516 != null) {
                    class33 var6 = new class33();
                    var6.field847 = var4;
                    var6.field845 = var4.field5516;
                    class83.method788(var6);
                }
                if (arg1 == 1 && var4.field5377 != null) {
                    if (var4.field5380 >= 0) {
                        class378 var7 = class60.method633(1512932720, var4.field5506);
                        if (var7 == null || var7.field5474 == null || var7.field5474.length <= var4.field5380 || var7.field5474[var4.field5380] != var4) {
                            continue;
                        }
                    }
                    class33 var8 = new class33();
                    var8.field847 = var4;
                    var8.field845 = var4.field5377;
                    class83.method788(var8);
                }
            }
        }
        field1698++;
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        if (arg1 != 255) {
            field1694 = null;
        }
        field1696++;
        return class733.field9899;
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
    public class98() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method915(int arg0, String arg1) {
        if (arg0 == -30282) {
            field1695++;
            return class667.method3746(field1700 == null ? (field1700 = method918("bc")) : field1700, (byte) 20, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(B)V")
    public static void method916(byte arg0) {
        field1694 = null;
        field1697 = null;
        field1699 = null;
        if (arg0 >= -63) {
            field1699 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZI)Z")
    public static final boolean method917(int arg0, boolean arg1, int arg2) {
        field1693++;
        if (arg1) {
            field1699 = null;
        }
        return class460.method2727(arg0, 32768, arg2) | (arg2 & 0x800) != 0 || class418.method2576(arg2, 86, arg0);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method918(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
