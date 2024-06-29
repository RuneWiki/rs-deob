import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class250 {

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "Lok;")
    public static class166 field3317 = new class166(11, 3);

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "I")
    public static int field3323 = -1;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public int field3315;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
    public int field3316;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public int field3318;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public int field3319;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public int field3320;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "I")
    public int field3326;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "Ljava/awt/Font;")
    public static Font field3321;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V")
    public static void method1509(byte arg0) {
        field3317 = null;
        if (arg0 < 90) {
            method1509((byte) 21);
        }
        field3321 = null;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lws;IIII)V")
    public static final void method1510(class238 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3322++;
        long var5 = (long) (arg3 << 28 | arg2 << 14 | arg1);
        class289 var7 = (class289) class436.field5982.method182(var5, (byte) 122);
        if (var7 == null) {
            class289 var8 = new class289();
            class436.field5982.method173(var5, var8, (byte) 79);
            var8.field3780.method1666((byte) 125, arg0);
            return;
        }
        class482 var9 = class127.field1852.method2390(64, arg0.field3179);
        if (arg4 != -882487236) {
            field3321 = null;
        }
        int var10 = var9.field6719;
        if (var9.field6706 == 1) {
            var10 = (arg0.field3180 + 1) * var10;
        }
        for (class238 var11 = (class238) var7.field3780.method1672((byte) -126); var11 != null; var11 = (class238) var7.field3780.method1668(arg4 ^ 0x3499AFC3)) {
            class482 var12 = class127.field1852.method2390(arg4 ^ 0xCB66506D, var11.field3179);
            int var13 = var12.field6719;
            if (var12.field6706 == 1) {
                var13 = (var11.field3180 + 1) * var13;
            }
            if (var13 < var10) {
                class462.method2633(var11, arg0, true);
                return;
            }
        }
        var7.field3780.method1666((byte) -36, arg0);
    }
}
