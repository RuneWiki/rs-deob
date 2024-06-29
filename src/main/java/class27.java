import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class27 extends class83 {

    @OriginalMember(owner = "client!il", name = "C", descriptor = "I")
    public static int field414 = 0;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public int field399;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public int field400;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public int field401;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public int field405;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public int field406;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "I")
    public int field407;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "[S")
    public static short[] field413;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
    public static void method178(byte arg0) {
        field413 = null;
        if (arg0 > -121) {
            method178((byte) 54);
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)[Lcj;")
    public static final class74[] method179(int arg0) {
        field411++;
        class74[] var1 = new class74[class110.field1990];
        for (int var2 = arg0; var2 < class110.field1990; var2++) {
            byte[] var3 = class199.field3226[var2];
            int var4 = class12.field168[var2] * class110.field1983[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class54.field941[class113.method791(255, var3[var6])];
            }
            var1[var2] = new class197(class79.field1365, class9.field116, class112.field2028[var2], class213.field3588[var2], class110.field1983[var2], class12.field168[var2], var5);
        }
        class253.method1679((byte) -128);
        return var1;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V")
    public static final void method180(byte arg0) {
        field408++;
        if (class294.field4681 < 0) {
            class167.field2728 = -1;
            class248.field4084 = -1;
            class294.field4681 = 0;
        }
        if (class294.field4681 > class203.field3318) {
            class167.field2728 = -1;
            class248.field4084 = -1;
            class294.field4681 = class203.field3318;
        }
        if (arg0 >= -92) {
            return;
        }
        if (class213.field3583 < 0) {
            class248.field4084 = -1;
            class213.field3583 = 0;
            class167.field2728 = -1;
        }
        if (class213.field3583 > class83.field1514) {
            class213.field3583 = class83.field1514;
            class167.field2728 = -1;
            class248.field4084 = -1;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(CB)Z")
    public static final boolean method181(char arg0, byte arg1) {
        field415++;
        if (arg1 <= 70) {
            method178((byte) -86);
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZ)I")
    public static final int method182(int arg0, boolean arg1) {
        if (!arg1) {
            method179(-6);
        }
        field416++;
        return arg0 & 0x7F;
    }
}
