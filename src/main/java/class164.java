import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class164 {

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Lao;")
    public static class191 field2142 = new class191(31, -1);

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field2144 = 64;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "[I")
    public static int[] field2146 = new int[100];

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "Lc;")
    public static class124 field2145;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZIIIIB)V")
    public static final void method961(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2143++;
        if (class119.field1559 != null && (arg4 != 3 || class319.field4256.field4656 != arg2 || class319.field4256.field4649 != arg3)) {
            class116.method697((byte) 107, class119.field1559, class381.field5518);
            class119.field1559 = null;
        }
        if (arg4 == 3 && class119.field1559 == null) {
            class119.field1559 = class191.method1091(class381.field5518, 0, arg2, arg3, 0, (byte) 126);
            if (class119.field1559 != null) {
                class319.field4256.field4656 = arg2;
                class319.field4256.field4649 = arg3;
                class319.field4256.method1743(class381.field5518, (byte) -106);
            }
        }
        if (arg4 == 3 && class119.field1559 == null) {
            method961(true, arg1, -1, -1, class319.field4256.field4675, (byte) 115);
            return;
        }
        Container var7;
        if (class119.field1559 != null) {
            var7 = class119.field1559;
            class155.field2037 = arg2;
            class461.field6876 = arg3;
        } else if (class173.field2224 == null) {
            var7 = class381.field5518.field1828;
            class155.field2037 = var7.getSize().width;
            class461.field6876 = var7.getSize().height;
        } else {
            Insets var6 = class173.field2224.getInsets();
            int var10001 = var6.right + var6.left;
            class155.field2037 = class173.field2224.getSize().width - var10001;
            int var12 = -var6.top;
            class461.field6876 = class173.field2224.getSize().height + var12 - var6.bottom;
            var7 = class173.field2224;
        }
        if (arg4 == 1) {
            class372.field5051 = class393.field5678;
            class430.field6244 = class249.field3322;
            class325.field4330 = 0;
            class470.field6965 = (class155.field2037 - class393.field5678) / 2;
        } else if (field2144 < 96 && class20.field183 == 0) {
            int var8 = class155.field2037 > 1024 ? 1024 : class155.field2037;
            class470.field6965 = (class155.field2037 - var8) / 2;
            class372.field5051 = var8;
            int var9 = class461.field6876 <= 768 ? class461.field6876 : 768;
            class325.field4330 = 0;
            class430.field6244 = var9;
        } else {
            class430.field6244 = class461.field6876;
            class325.field4330 = 0;
            class372.field5051 = class155.field2037;
            class470.field6965 = 0;
        }
        if (class401.field5807 != class287.field3779) {
            boolean var10000;
            if (class372.field5051 < 1024 && class430.field6244 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg0) {
            class323.method1911((byte) -61);
        } else {
            class60.field701.setSize(class372.field5051, class430.field6244);
            class343.field4596.method1195(class60.field701);
            if (class173.field2224 == var7) {
                Insets var10 = class173.field2224.getInsets();
                class60.field701.setLocation(var10.left + class470.field6965, class325.field4330 + var10.top);
            } else {
                class60.field701.setLocation(class470.field6965, class325.field4330);
            }
        }
        if (arg4 < 2) {
            class507.field7351 = false;
        } else {
            class507.field7351 = true;
        }
        if (class168.field2174 != -1) {
            class334.method1949(true, arg5 ^ 0xFFFF92F4);
        }
        if (class446.field6499 != null && class102.method623(class527.field7734, 112)) {
            class85.method463(arg5 + 4395);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class442.field6427[var11] = true;
        }
        if (arg5 != 115) {
            field2142 = null;
        }
        class306.field4108 = true;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static void method962(int arg0) {
        field2145 = null;
        if (arg0 != 28982) {
            field2144 = -84;
        }
        field2146 = null;
        field2142 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V")
    public static final void method963(int arg0, int arg1, int arg2) {
        class498 var3 = class186.field2421[arg0][arg1][arg2];
        if (var3 != null && var3.field7268 != null) {
            var3.field7268 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method964(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2141++;
        if (class307.field4111 <= (arg5 - arg2) && class91.field1086 >= (arg5 + arg2) && arg3 - arg2 >= class169.field2184 && arg2 + arg3 <= class386.field5620) {
            class477.method2911(arg2, arg1, 2, arg0, arg4, arg3, arg5);
        } else {
            class167.method980(arg4, arg0, 24799, arg2, arg3, arg1, arg5);
        }
        if (arg6 <= 60) {
            method961(false, 36, 72, 37, -3, (byte) 96);
        }
    }
}
