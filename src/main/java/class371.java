import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class371 implements class37 {

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "Luh;")
    private class415 field5236;

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "Lst;")
    public static class335 field5235 = new class335(14, 8);

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "I")
    public static int field5239 = 0;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!rca", name = "i", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!rca", name = "j", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!rca", name = "h", descriptor = "[Ls;")
    public static class341[] field5240;

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)Lqea;")
    public static final class339 method2326(int arg0) {
        field5237++;
        class216 var1 = null;
        class339 var2 = new class339(class289.field4140, 0);
        try {
            class246 var3 = class159.field2227.method873("", true, (byte) -21);
            while (var3.field3633 == 0) {
                class688.method3874(1L, -7375);
            }
            if (arg0 > -98) {
                field5242 = -84;
            }
            if (var3.field3633 == 1) {
                var1 = (class216) var3.field3638;
                byte[] var4 = new byte[(int) var1.method1274(112)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var1.method1268(var4, var4.length - var5, var5, 31833);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                var2 = new class339(new class63(var4), class289.field4140, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var1 != null) {
                var1.method1273(108);
            }
        } catch (Exception var7) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(BZ)V")
    public final void method201(byte arg0, boolean arg1) {
        if (arg0 <= -74) {
            field5238++;
            if (arg1) {
                class129.field1802.method1412(0, 0, class118.field1561, class553.field7716, this.field5236.field5876, 0);
            }
        }
    }

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "(I)V")
    public static void method2327(int arg0) {
        if (arg0 != -2) {
            method2327(-18);
        }
        field5235 = null;
        field5240 = null;
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Luh;)V")
    public class371(class415 arg0) {
        this.field5236 = arg0;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V")
    public final void method200(int arg0) {
        field5234++;
        if (arg0 < 12) {
            this.method200(15);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)Z")
    public final boolean method202(byte arg0) {
        if (arg0 > -46) {
            field5242 = -92;
        }
        field5233++;
        return true;
    }
}
