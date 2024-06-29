import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class19 {

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "Lnj;")
    public class252 field503;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field501 = -1;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "Ljava/lang/String;")
    public static String field506 = "green:";

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "[I")
    public static int[] field507 = new int[5];

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field511 = 2;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "Ljava/lang/String;")
    public static String field508 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "Ljava/lang/String;")
    public static String field512 = "cyan:";

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Ljava/lang/String;")
    public static String field514 = "Please remove ";

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Lek;")
    public static class206 field505;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 7)
    public static final void method178(int arg0) {
        class23.field575.method895(128);
        if (arg0 != 21325) {
            field512 = (String) null;
        }
        field510++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIBI)Lcj;", line = 30)
    public static final class351 method179(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 >= -63) {
            return (class351) null;
        }
        field502++;
        int var4 = arg1 | arg3 << 8;
        class351 var5 = (class351) class309.field5049.method487(118, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class318.field5177.method1407(-94, class318.field5177.method1410(var4, (byte) 64));
        if (var6 == null) {
            int var7 = arg0 + 65536 << 8 | arg1;
            class351 var8 = (class351) class309.field5049.method487(107, (long) var7 << 16);
            if (var8 != null) {
                return var8;
            }
            byte[] var9 = class318.field5177.method1407(-113, class318.field5177.method1410(var7, (byte) 41));
            if (var9 == null) {
                int var11 = arg1 | 0xFFFF00;
                class351 var12 = (class351) class309.field5049.method487(104, (long) var11 << 16);
                if (var12 != null) {
                    return var12;
                }
                byte[] var13 = class318.field5177.method1407(86, class318.field5177.method1410(var11, (byte) 54));
                if (var13 == null) {
                    return null;
                } else if (var13.length <= 1) {
                    return null;
                } else {
                    class351 var14 = class301.method2157(var13, (byte) -103);
                    var14.field5617 = arg1;
                    class309.field5049.method491((long) var11 << 16, -1, var14);
                    return var14;
                }
            } else if (var9.length > 1) {
                class351 var10 = class301.method2157(var9, (byte) 114);
                var10.field5617 = arg1;
                class309.field5049.method491((long) var7 << 16, -1, var10);
                return var10;
            } else {
                return null;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class351 var15 = class301.method2157(var6, (byte) 92);
            var15.field5617 = arg1;
            class309.field5049.method491((long) var4 << 16, -1, var15);
            return var15;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lek;I)V", line = 110)
    public static final void method180(class206 arg0, int arg1) {
        class170.field2810 = arg0;
        if (arg1 >= 1) {
            field513++;
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(II)V", line = 125)
    public class19(int arg0, int arg1) {
        this.field503 = class23.method199((byte) -98, arg0);
        this.field509 = arg1;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lnj;I)V", line = 133)
    public class19(class252 arg0, int arg1) {
        this.field509 = arg1;
        this.field503 = arg0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V", line = 148)
    public static void method181(byte arg0) {
        field505 = null;
        field514 = null;
        field508 = null;
        field507 = null;
        if (arg0 == -18) {
            field512 = null;
            field506 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIILek;)[Lbn;", line = 163)
    public static final class75[] method182(int arg0, int arg1, int arg2, class206 arg3) {
        field504++;
        if (class76.method581(arg3, 45, arg2, arg1)) {
            if (arg0 != -7362) {
                field505 = (class206) null;
            }
            return class345.method2455((byte) -101);
        } else {
            return null;
        }
    }
}
