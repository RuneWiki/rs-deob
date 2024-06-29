import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class307 extends class76 {

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "I")
    public static int field4387 = 0;

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "Ljava/lang/String;")
    public static String field4388 = "Continue";

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "Lwe;")
    public static class24 field4392 = new class24(64);

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "Lqj;")
    public static class238 field4396;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lqj;I)V")
    public static final void method1924(class238 arg0, int arg1) {
        field4395++;
        class128.field1707 = arg0;
        if (arg1 != 16383) {
            field4387 = -125;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIZI)V")
    public static final void method1925(int arg0, int arg1, boolean arg2, int arg3) {
        field4390++;
        class262 var4 = class416.field6195[arg0][arg3];
        class421.method2712(0, arg1, var4 == null ? class152.field1987 : var4);
        if (!arg2) {
            field4388 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
    public static void method1926(int arg0) {
        field4388 = null;
        if (arg0 != 64) {
            method1927(-69, -102, 123);
        }
        field4392 = null;
        field4396 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V")
    public static final void method1927(int arg0, int arg1, int arg2) {
        field4389++;
        class143 var3 = new class143(16);
        for (class281 var4 = (class281) class231.field3261.method953(0); var4 != null; var4 = (class281) class231.field3261.method951(0)) {
            var4.method2574((byte) 122);
            int var5 = (int) (var4.field5903 >> 28);
            int var6 = (int) (var4.field5903 >> 14 & 0x3FFFL) - arg0;
            int var7 = (int) (var4.field5903 & 0x3FFFL) - arg1;
            if (var7 >= 0 && var6 >= 0 && class324.field4652 > var7 && class336.field4964 > var6) {
                var3.method956(false, (long) (var5 << 28 | var6 << 14 | var7), var4);
            }
        }
        if (arg2 != 16383) {
            method1926(103);
        }
        class231.field3261 = var3;
    }
}
