import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class39 extends class200 {

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "[Ln;")
    public class16[] field668;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
    public static int field671 = 1;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "Ltg;")
    public static class182 field670;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V")
    public static final void method302(int arg0, int arg1) {
        class193.field3390.method1809(arg1, (byte) 120);
        class79.field1396.method1809(arg1, (byte) 127);
        field666++;
        if (arg0 != 342462184) {
            method303(true);
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(Z)V")
    public static void method303(boolean arg0) {
        if (arg0) {
            field670 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(I)V")
    public static final void method304(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field667++;
        if (class284.field4937) {
            class190.field3349 = null;
            class160.field2837 = null;
            class284.field4937 = false;
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Ltg;Ltg;IZ)V")
    public class39(class182 arg0, class182 arg1, int arg2, boolean arg3) {
        class76 var5 = new class76();
        int var6 = arg0.method1233(arg2, false);
        this.field668 = new class16[var6];
        int[] var7 = arg0.method1252(true, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1242(var7[var8], arg2, 6801);
            class101 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class101 var12 = (class101) var5.method529(10); var12 != null; var12 = (class101) var5.method533(104)) {
                if (var12.field1727 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1244(0, var11, 51);
                } else {
                    var13 = arg1.method1244(var11, 0, 54);
                }
                var10 = new class101(var11, var13);
                var5.method536(var10, (byte) 126);
            }
            this.field668[var7[var8]] = new class16(var9, var10);
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)Z")
    public final boolean method305(int arg0, int arg1) {
        field669++;
        int var3 = -23 % ((-arg0 - 56) / 46);
        return this.field668[arg1].field157;
    }
}
