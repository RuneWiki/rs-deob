import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 {

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Laa;")
    private class2 field103 = new class2(256);

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Lge;")
    private class47 field106;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Lge;")
    private class47 field97;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field96 = 0;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Lrd;")
    public static class117 field98 = class95.method812("Benutzername: ", (byte) 8);

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Lrd;")
    public static class117 field95 = class95.method812("backright2", (byte) 8);

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "Lrd;")
    private static class117 field110 = class95.method812("Connecting to update server", (byte) 8);

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "Lrd;")
    public static class117 field107 = field110;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Lwa;")
    public static class144 field94;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Lba;")
    public static class9 field104;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static final void method31(int arg0) {
        int var1 = -87 / ((arg0 + 48) / 61);
        class49.field1408.method766(5);
        class57.field1591.method766(5);
        field101++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[I)Lta;")
    public final class126 method32(int arg0, int arg1, int[] arg2) {
        field99++;
        long var4 = (long) arg1 ^ 0x200000000L;
        class126 var6 = (class126) this.field103.method20(var4, true);
        if (var6 != null) {
            return var6;
        } else if (arg2 == null || arg2[0] > 0) {
            class113 var7 = class113.method922(this.field106, arg1);
            if (var7 == null) {
                return null;
            }
            class126 var8 = var7.method919();
            this.field103.method18(var8, var4, -1);
            if (arg0 == 0) {
                if (arg2 != null) {
                    arg2[0] -= var8.field3022.length;
                }
                return var8;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([III)Lta;")
    public final class126 method33(int[] arg0, int arg1, int arg2) {
        field109++;
        long var4 = (long) arg2 ^ 0x300000000L;
        class126 var6 = (class126) this.field103.method20(var4, true);
        if (var6 != null) {
            return var6;
        } else if (arg0 == null || arg0[0] > 0) {
            class146 var7 = class146.method1172(this.field97, arg2);
            if (var7 == null) {
                return null;
            }
            class126 var8 = var7.method1180();
            this.field103.method18(var8, var4, -1);
            if (arg0 != null) {
                arg0[0] -= var8.field3022.length;
            }
            if (arg1 != -6674) {
                field110 = null;
            }
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public static void method34(int arg0) {
        field104 = null;
        field98 = null;
        if (arg0 == -31985) {
            field94 = null;
            field95 = null;
            field107 = null;
            field110 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lge;Lge;)V")
    public class4(class47 arg0, class47 arg1) {
        this.field106 = arg0;
        this.field97 = arg1;
    }
}
