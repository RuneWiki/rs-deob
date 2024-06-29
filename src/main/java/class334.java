import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public abstract class class334 {

    @OriginalMember(owner = "client!go", name = "d", descriptor = "[I")
    public static int[] field5255 = new int[8];

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "Ll;")
    public static class196 field5253;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)Z")
    public abstract boolean method1651(byte arg0);

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)I")
    public abstract int method1655(int arg0);

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(B)V")
    public abstract void method1657(byte arg0);

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)Lvb;")
    public abstract class272 method1647(int arg0);

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(I)Lmo;")
    public static final class366 method2105(int arg0) {
        if (arg0 != -5894) {
            method2107(null, (byte) 31);
        }
        field5252++;
        if (class210.field3332 == null || class260.field4353 == null) {
            return null;
        }
        for (class366 var1 = (class366) class260.field4353.method1233((byte) -1); var1 != null; var1 = (class366) class260.field4353.method1233((byte) -1)) {
            class445 var2 = class210.field3329.method492(var1.field5694, (byte) -10);
            if (var2 != null && var2.field6618 && var2.method2673(class210.field3326, -13309)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(B)Z")
    public final boolean method2106(byte arg0) {
        field5254++;
        int var2 = 28 / ((30 - arg0) / 47);
        return this.method1658((byte) -126) || this.method1646((byte) 6) || this.method1651((byte) 111);
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "(I)V")
    public abstract void method1652(int arg0);

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lcd;")
    public static final class424 method2107(Canvas arg0, byte arg1) {
        if (arg1 >= -83) {
            field5253 = null;
        }
        field5256++;
        try {
            Class var2 = Class.forName("ni");
            class424 var3 = (class424) var2.getDeclaredConstructor().newInstance();
            var3.method619(1400, arg0);
            return var3;
        } catch (Throwable var5) {
            class167 var4 = new class167();
            var4.method619(1400, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "(B)Z")
    public abstract boolean method1658(byte arg0);

    @OriginalMember(owner = "client!go", name = "e", descriptor = "(I)V")
    public static void method2108(int arg0) {
        if (arg0 != 8) {
            method2108(-67);
        }
        field5255 = null;
        field5253 = null;
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "(B)Z")
    public abstract boolean method1646(byte arg0);

    @OriginalMember(owner = "client!go", name = "f", descriptor = "(I)I")
    public abstract int method1660(int arg0);
}
