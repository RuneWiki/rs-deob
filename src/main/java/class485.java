import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class485 extends class42 {

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "D")
    public static double field6756 = -1.0D;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "Lwl;")
    public static class280 field6744 = new class280();

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
    public static int field6758 = 0;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public int field6739;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public int field6740;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public int field6741;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public int field6742;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public int field6743;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public int field6745;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public int field6746;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public int field6747;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public int field6748;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public int field6749;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public int field6751;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public int field6752;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    public int field6753;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    public int field6754;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    public int field6755;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "Lcr;")
    public static class403 field6759;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kb", name = "I", descriptor = "Ljava/lang/Class;")
    public static Class field6760;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILqa;I)Lc;")
    public final class121 method2790(int arg0, class162 arg1, int arg2) {
        field6757++;
        int var4 = class333.field4373[this.field6739];
        if (arg0 >= -43) {
            method2791(-72, -22, 48, 36L, false);
        }
        if (var4 == 0) {
            class56 var5 = class234.method1453(this.field6746, this.field6745, this.field6741);
            if (var5 instanceof class286) {
                class286 var6 = (class286) var5;
                if (var6.field3732 != null) {
                    return ((class338) var6.field3732).method336((byte) -102, arg1, arg2);
                }
            }
        } else if (var4 == 1) {
            class11 var7 = class463.method2642(this.field6746, this.field6745, this.field6741);
            if (var7 instanceof class291) {
                class291 var8 = (class291) var7;
                if (var8.field3806 != null) {
                    return ((class338) var8.field3806).method336((byte) -102, arg1, arg2);
                }
            }
        } else if (var4 == 2) {
            class37 var11 = class504.method2874(this.field6746, this.field6745, this.field6741, field6760 == null ? (field6760 = method2793("np")) : field6760);
            if (var11 instanceof class124) {
                class124 var12 = (class124) var11;
                if (var12.field1828 != null) {
                    return ((class338) var12.field1828).method336((byte) -102, arg1, arg2);
                }
            }
        } else if (var4 == 3) {
            class431 var9 = class466.method2648(this.field6746, this.field6745, this.field6741);
            if (var9 instanceof class358) {
                class358 var10 = (class358) var9;
                if (var10.field4835 != null) {
                    return ((class338) var10.field4835).method336((byte) -102, arg1, arg2);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIJZ)Ljava/lang/String;")
    public static final String method2791(int arg0, int arg1, int arg2, long arg3, boolean arg4) {
        field6750++;
        char var6 = ',';
        char var7 = (char) arg2;
        if (arg1 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg1 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg3 < 0L) {
            var8 = true;
            arg3 = -arg3;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg0 > 0) {
            for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg3 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg3 * 10)));
            if (arg3 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
    public static void method2792(byte arg0) {
        field6759 = null;
        if (arg0 != -73) {
            method2792((byte) -93);
        }
        field6744 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2793(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
