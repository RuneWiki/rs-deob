import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class339 extends class43 {

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    public static int field4625 = -1;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public int field4613;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public int field4614;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public int field4615;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public int field4617;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public int field4619;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public int field4620;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public int field4621;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public int field4623;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "I")
    public int field4626;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
    public int field4627;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "I")
    public int field4628;

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "I")
    public int field4630;

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "I")
    public int field4633;

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "I")
    public int field4634;

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "I")
    public int field4638;

    @OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
    public int field4639;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "Lve;")
    public class159 field4622;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "Lso;")
    public class174 field4624;

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "Lqq;")
    public class422 field4636;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "Lnp;")
    public class77 field4618;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lwo;I)V", line = 3)
    public static final void method2174(class285 arg0, int arg1) {
        int var2 = -64 % ((64 - arg1) / 43);
        class428.field5860 = arg0;
        field4632++;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)V", line = 16)
    public static final void method2175(boolean arg0) {
        class158 var1 = class450.field6285;
        synchronized (class450.field6285) {
            if (!arg0) {
                field4625 = 6;
            }
            class450.field6285.method1008(7);
        }
        field4616++;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIII)V", line = 31)
    public static final void method2176(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -100) {
            return;
        }
        field4637++;
        for (int var5 = 0; var5 < class319.field4291; var5++) {
            Rectangle var6 = class41.field487[var5];
            if (arg0 < var6.x + var6.width && var6.x < arg0 + arg3 && arg2 < (var6.y + var6.height) && arg2 + arg4 > var6.y) {
                class326.field4346[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V", line = 78)
    public final void method2177(int arg0) {
        this.field4624 = null;
        field4631++;
        if (arg0 <= 80) {
            this.method2177(-123);
        }
        this.field4622 = null;
        this.field4636 = null;
        this.field4618 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)Lna;", line = 98)
    public static final class222 method2178(boolean arg0, int arg1) {
        field4629++;
        class222 var2 = (class222) class157.field1828.method2295((long) arg1, (byte) 74);
        if (var2 != null) {
            return var2;
        }
        if (arg0) {
            method2175(false);
        }
        byte[] var3 = class236.field3100.method1794(5860, 36, arg1);
        class222 var4 = new class222();
        var4.field2772 = arg1;
        if (var3 != null) {
            var4.method1354((byte) 51, new class242(var3));
        }
        var4.method1351((byte) -104);
        class157.field1828.method2294(var4, (byte) 31, (long) arg1);
        return var4;
    }
}
