import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class479 extends class40 {

    @OriginalMember(owner = "client!mt", name = "E", descriptor = "Ljava/lang/Object;")
    private Object field6741;

    @OriginalMember(owner = "client!mt", name = "D", descriptor = "I")
    public static int field6740 = 0;

    @OriginalMember(owner = "client!mt", name = "F", descriptor = "Z")
    public static boolean field6742 = false;

    @OriginalMember(owner = "client!mt", name = "B", descriptor = "Z")
    public static boolean field6738 = false;

    @OriginalMember(owner = "client!mt", name = "C", descriptor = "I")
    public static int field6739 = 1;

    @OriginalMember(owner = "client!mt", name = "G", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!mt", name = "H", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!mt", name = "J", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!mt", name = "K", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!mt", name = "L", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!mt", name = "M", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!mt", name = "I", descriptor = "[Lcl;")
    public static class48[] field6745;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "(I)Ljava/lang/Object;", line = 3)
    public final Object method306(int arg0) {
        if (arg0 != -7728) {
            this.method306(119);
        }
        field6749++;
        return this.field6741;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)Z", line = 27)
    public final boolean method302(byte arg0) {
        if (arg0 < 82) {
            this.method306(-48);
        }
        field6748++;
        return false;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V", line = 38)
    public static final void method2810(boolean arg0) {
        field6744++;
        if (!arg0) {
            return;
        }
        class28.field375.method2401((byte) -96);
        class327.field4893.method2401((byte) -44);
        class169.field2409.method2401((byte) -44);
        class138.field1986.method2401((byte) -91);
        class273.field4114.method2401((byte) -75);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IZLqr;Z)V", line = 53)
    public static final void method2811(int arg0, boolean arg1, class468 arg2, boolean arg3) {
        field6746++;
        int var4 = arg2.field6584;
        int var5 = (int) arg2.field436;
        arg2.method283(2);
        if (arg3) {
            class427.method2514((byte) -5, var4);
        }
        class432.method2530(var4, arg0 ^ 0xD91B7280);
        class178 var6 = class493.method2885(var5, 65535);
        if (var6 != null) {
            class205.method1396(117, var6);
        }
        class410.method2446(16);
        if (arg0 != 1711162608) {
            method2812((String) null, 120);
        }
        if (!arg1 && class279.field4220 != -1) {
            class231.method1517(class279.field4220, 1, -1);
        }
        class258 var7 = new class258(class466.field6564);
        for (class468 var8 = (class468) var7.method1710((byte) -70); var8 != null; var8 = (class468) var7.method1709(false)) {
            if (!var8.method282(107)) {
                var8 = (class468) var7.method1710((byte) -70);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field6587 == 3) {
                int var9 = (int) var8.field436;
                if ((var9 >>> 16) == var4) {
                    method2811(arg0, arg1, var8, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 114)
    public static final long method2812(String arg0, int arg1) {
        field6743++;
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = arg1; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(B)V", line = 157)
    public static void method2813(byte arg0) {
        if (arg0 != -29) {
            method2810(false);
        }
        field6745 = null;
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lvk;Ljava/lang/Object;I)V", line = 168)
    public class479(class308 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field6741 = arg1;
    }
}
