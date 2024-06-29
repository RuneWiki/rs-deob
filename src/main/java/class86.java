import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class86 extends class264 {

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "[Lcf;")
    public static class93[] field1553 = new class93[500];

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "Lcf;")
    public static class93 field1554 = class147.method1066("::rect_debug", -48);

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "Lcf;")
    private static class93 field1555 = class147.method1066(" more options", -48);

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "Lcf;")
    public static class93 field1556 = field1555;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "Lcf;")
    public static class93 field1560 = class147.method1066("V-Brification des mises -9 jour )2 ", -48);

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "[Lli;")
    public static class288[] field1559 = new class288[0];

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        if (arg1 >= -83) {
            this.method22(-97, (byte) 113);
        }
        field1552++;
        return class144.field2497;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IBI[Lcf;)Lcf;")
    public static final class93 method591(int arg0, byte arg1, int arg2, class93[] arg3) {
        int var4 = 0;
        field1558++;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg3[arg2 + var5] == null) {
                arg3[arg2 + var5] = class255.field4616;
            }
            var4 += arg3[arg2 + var5].field1629;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg0; var8++) {
            class93 var10 = arg3[arg2 + var8];
            class107.method770(var10.field1683, 0, var6, var7, var10.field1629);
            var7 += var10.field1629;
        }
        if (arg1 < 62) {
            return null;
        } else {
            class93 var9 = new class93();
            var9.field1683 = var6;
            var9.field1629 = var4;
            return var9;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(IZ)I")
    public static final int method592(int arg0, boolean arg1) {
        if (arg1) {
            return 90;
        } else {
            field1557++;
            return arg0 >>> 10;
        }
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)V")
    public static void method593(int arg0) {
        field1559 = null;
        if (arg0 != -19498) {
            field1559 = null;
        }
        field1556 = null;
        field1555 = null;
        field1554 = null;
        field1553 = null;
        field1560 = null;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class86() {
        super(0, true);
    }
}
