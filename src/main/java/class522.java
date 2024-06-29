import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public abstract class class522 {

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public volatile int field7713 = 0;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public int field7718 = 0;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "[B")
    public byte[] field7719 = new byte[5000];

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public volatile int field7721 = 0;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "[F")
    public float[] field7722 = new float[5000];

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "[Ljava/lang/Object;")
    public Object[] field7714 = new Object[5000];

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public int field7716 = 0;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)V")
    public abstract void method543(boolean arg0, int arg1);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILdr;)V")
    public abstract void method541(int arg0, class420 arg1);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public abstract void method546(int arg0);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ldr;B)V")
    public abstract void method549(class420 arg0, byte arg1);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lns;B)I")
    public static final int method3099(class438 arg0, byte arg1) {
        field7723++;
        if (arg1 != -31) {
            return 1;
        }
        int var2 = 0;
        if (arg0.method2624(-124, class391.field5942)) {
            var2++;
        }
        if (arg0.method2624(-124, class453.field6658)) {
            var2++;
        }
        if (arg0.method2624(-118, class14.field243)) {
            var2++;
        }
        if (arg0.method2624(arg1 ^ 0x63, class408.field6163)) {
            var2++;
        }
        if (arg0.method2624(-113, class272.field3782)) {
            var2++;
        }
        if (arg0.method2624(-119, class262.field3647)) {
            var2++;
        }
        if (arg0.method2624(-89, class211.field2974)) {
            var2++;
        }
        if (arg0.method2624(arg1 - 91, class115.field1597)) {
            var2++;
        }
        if (arg0.method2624(arg1 - 69, class82.field1095)) {
            var2++;
        }
        if (arg0.method2624(-113, class398.field6056)) {
            var2++;
        }
        if (arg0.method2624(-107, class495.field7240)) {
            var2++;
        }
        if (arg0.method2624(-115, class150.field2165)) {
            var2++;
        }
        if (arg0.method2624(arg1 ^ 0x41, class167.field2430)) {
            var2++;
        }
        if (arg0.method2624(-100, class199.field2816)) {
            var2++;
        }
        if (arg0.method2624(-95, class526.field7774)) {
            var2++;
        }
        if (arg0.method2624(-104, class33.field524)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method3100(int arg0, String arg1) {
        field7717++;
        if (!class500.field7455) {
            return;
        }
        if (arg0 != 25460) {
            method3099(null, (byte) -55);
        }
        boolean var2 = false;
        int var3 = class442.field6574;
        int[] var4 = class320.field4896;
        for (int var5 = 0; var5 < var3; var5++) {
            class322 var6 = class439.field6539[var4[var5]];
            if (var6 != null && class339.field5365 != var6 && var6.field4947 != null && var6.field4947.equalsIgnoreCase(arg1)) {
                class179.method1287(false, class30.field463);
                class10.field144++;
                class75.field1006.method644(class186.field2616, -4019);
                class75.field1006.method600(class126.field1798, -12891);
                class75.field1006.method582(-78, var4[var5]);
                class75.field1006.method637((byte) 104, class91.field1336);
                class75.field1006.method635((byte) -121, 0);
                class126.method805(-2, 0, 0, true, var6.method2091(-15245), var6.method2091(-15245), var6.field5344[0], true, var6.field5339[0]);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class219.method1485((byte) -50, class317.field4868.method2335((byte) -100, class288.field4292) + arg1);
        }
        if (class500.field7455) {
            class457.method2749(-1);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
    public abstract void method547(int arg0, int arg1);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public abstract void method551(byte arg0);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lna;ZFIZ)V")
    public abstract void method542(class206 arg0, boolean arg1, float arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Ldr;B)V")
    public abstract void method545(class420 arg0, byte arg1);
}
