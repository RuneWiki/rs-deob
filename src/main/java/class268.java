import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class268 extends class176 {

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "B")
    public byte field4329;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "I")
    public int field4335;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "Leh;")
    public class101 field4332;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1762(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        ++field4328;
        int var6 = class160.method1090(arg3, (byte) 16, class89.field1582, class118.field2094);
        int var7 = class160.method1090(arg1, (byte) 16, class89.field1582, class118.field2094);
        int var8 = class160.method1090(arg5, (byte) 16, class118.field2098, class126.field2222);
        int var9 = class160.method1090(arg0, (byte) 16, class118.field2098, class126.field2222);
        if (arg4 == 112) {
            for (int var10 = var6; ~var7 <= ~var10; ++var10) {
                class93.method598(-7, var9, var8, class167.field2735[var10], arg2);
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)[B")
    public final byte[] method36(byte arg0) {
        ++field4333;
        if (!super.field2893 && this.field4332.field1730.length + -this.field4329 <= this.field4332.field1762) {
            if (arg0 != 46) {
                method1763((byte) 68);
            }
            return this.field4332.field1730;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)V")
    public static final void method1763(byte arg0) {
        ++field4326;
        class79.field1362.method53(true);
        class274.field4390.method53(true);
        int var1 = -47 / (-arg0 / 42);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIII)V")
    public static final void method1764(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class118.field2094 = arg1;
        ++field4331;
        class118.field2098 = arg4;
        class89.field1582 = arg2;
        class126.field2222 = arg3;
        if (arg0 > -43) {
            field4330 = -74;
        }
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)I")
    public final int method37(int arg0) {
        ++field4327;
        if (arg0 != 100) {
            this.field4332 = null;
        }
        return this.field4332 == null ? 0 : this.field4332.field1762 * 100 / (this.field4332.field1730.length - this.field4329);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V")
    public static final void method1765(boolean arg0, int arg1) {
        class92.field1615 = null;
        if (arg0 && class158.field2642 != null) {
            class72.field1190 = class158.field2642.field581;
        } else {
            class72.field1190 = -1;
        }
        class101.field1785 = 0;
        class171.field2810 = null;
        class24.field384 = null;
        class259.field4244 = null;
        class158.field2642 = null;
        class122.field2157 = null;
        class30.field447 = null;
        class45.field635 = null;
        class211.field3567 = null;
        class262.field4278 = null;
        class162.field2689 = null;
        ++field4334;
        class179.field2948.method377(112);
        class292.field4666 = null;
        class91.field1613 = null;
        class151.field2535 = null;
        class121.field2122 = null;
        class183.field2979 = null;
        class24.field380 = null;
        class248.field4084 = -1;
        class167.field2728 = -1;
        class158.field2636 = null;
        class140.field2409 = null;
        if (arg1 <= 29) {
            method1765(true, -41);
        }
        class177.field2923 = null;
        class252.field4135 = null;
    }
}
