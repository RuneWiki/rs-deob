import java.awt.Component;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class220 {

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Ldj;")
    public static class44 field3983 = class89.method650(255, "hint_mapedge");

    @OriginalMember(owner = "client!v", name = "l", descriptor = "[I")
    public static int[] field3987 = new int[] { -1, 0, -2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 5, 0, 0, 7, 24, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 2, -1, 6, 0, 0, 0, 0, 0, -2, 1, 3, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 8, -2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 6, 0, 0, 0, 7, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 5, 0, -2, 0, 12, 0, 4, 0, 6, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 2, 0, 3, -2, 0, 3, 0, 0, 0, 2, 0, 0, 5, 0, 0, 3, 0, 4, 0, -1, 0, 0, -2, 0, 0, 0, 0, 14, 0, 0, -1, 0, 5, 0, -1, 0, 0, 0, 0, 0, 0, -1, 6, 0, 0, -2, 0, 0, 0, 0, 3, 4, 0, 0, 0, 7, 6, 5, 0, 9, 4, -1, 0, 0, 0, -2, 6, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, -1, 0, 0, -2, 0, 1, 6, 0, 0, 6, 0, -1, 1, -1, 0, 0, 0, 0, -2, 0, 0, 5, 6, 6, 0, 8, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 15, 10, 2, -2, -1, 20, 0, 0, 0, 10, 0, 0, 0 };

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Ldj;")
    public static class44 field3982 = class89.method650(255, "<)4col> x");

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Ldj;")
    public static class44 field3991 = class89.method650(255, "null");

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public static int field3995 = 0;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "[Ljh;")
    public static class106[] field3996 = new class106[100];

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public static int field3999 = 127;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public int field3978;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public int field3979;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public int field3990;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "J")
    public long field3997;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lqe;")
    public static class176 field3980;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "Lvc;")
    public static class223 field3989;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "Lve;")
    public static class225 field3994;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Lwd;")
    public class234 field3977;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIZ)I")
    public static final int method1420(int arg0, int arg1, boolean arg2) {
        int var3 = 1;
        field3985++;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg1 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            if (!arg2) {
                field3989 = null;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)V")
    public static final void method1421(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class42.method290(class108.field1979[arg2], -7, arg0 - arg4, arg0 + arg4, arg1);
        int var5 = arg3;
        field3976++;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        while (var6 > var5) {
            var5++;
            var8 += 2;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class108.field1979[arg2 + var6];
                int[] var10 = class108.field1979[arg2 - var6];
                int var11 = arg0 - var5;
                int var12 = arg0 + var5;
                class42.method290(var9, -7, var11, var12, arg1);
                class42.method290(var10, -7, var11, var12, arg1);
            }
            int var13 = arg0 + var6;
            int var14 = arg0 - var6;
            int[] var15 = class108.field1979[arg2 + var5];
            int[] var16 = class108.field1979[arg2 - var5];
            class42.method290(var15, -7, var14, var13, arg1);
            class42.method290(var16, -7, var14, var13, arg1);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static void method1422(int arg0) {
        field3994 = null;
        field3991 = null;
        field3996 = null;
        field3983 = null;
        if (arg0 != 0) {
            method1424(true, null);
        }
        field3989 = null;
        field3980 = null;
        field3982 = null;
        field3987 = null;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    public static final void method1423(int arg0) {
        class115.field2057 = 0;
        class179.field3071 = 0;
        class172.field2995 = 0;
        field3988++;
        class88.field1680 = 0;
        class8.field157 = -1;
        class198.field3511 = 0;
        class218.field3946 = 0;
        class163.field2822 = -1;
        class42.field779 = -1;
        class58.field1086 = false;
        class202.field3622 = -1;
        if (arg0 != -3387) {
            field3999 = 4;
        }
        class200.field3542.field1195 = 0;
        class218.field3957.field1195 = 0;
        for (int var1 = 0; var1 < class122.field2168.length; var1++) {
            if (class122.field2168[var1] != null) {
                class122.field2168[var1].field2259 = -1;
            }
        }
        for (int var2 = 0; var2 < class170.field2960.length; var2++) {
            if (class170.field2960[var2] != null) {
                class170.field2960[var2].field2259 = -1;
            }
        }
        class10.method94((byte) 126);
        class62.method467(30, (byte) 57);
        for (int var3 = 0; var3 < 100; var3++) {
            class68.field1289[var3] = true;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method1424(boolean arg0, Component arg1) {
        field3981++;
        arg1.removeMouseListener(class119.field2117);
        if (!arg0) {
            method1422(101);
        }
        arg1.removeMouseMotionListener(class119.field2117);
        arg1.removeFocusListener(class119.field2117);
        class46.field871 = 0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/Object;ILvi;)V")
    public static final void method1425(Object arg0, int arg1, class229 arg2) {
        field3993++;
        if (arg2.field4298 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field4298.peekEvent() != null; var3++) {
            class82.method617((byte) 31, 1L);
        }
        if (arg1 >= -24) {
            field3980 = null;
        }
        if (arg0 != null) {
            arg2.field4298.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }
}
