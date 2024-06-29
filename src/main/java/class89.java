import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class class89 extends class124 {

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
    public int field2145 = 1000;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "[I")
    public static int[] field2144 = new int[100];

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "Lr;")
    public static class118 field2152 = class153.method1136(108, "Konfig geladen)3");

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "Lr;")
    public static class118 field2148 = class153.method1136(76, "::rect_debug");

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "Lt;")
    public static class132 field2150;

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "Lgf;")
    public static class48 field2151;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V")
    public static void method712(int arg0) {
        field2144 = null;
        if (arg0 != 0) {
            method716(null, 45);
        }
        field2150 = null;
        field2151 = null;
        field2148 = null;
        field2152 = null;
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)Lwb;")
    public class155 method215(int arg0) {
        field2147++;
        return arg0 == 15246 ? null : null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIIII)V")
    public void method713(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2142++;
        class155 var10 = this.method215(15246);
        if (var10 != null) {
            this.field2145 = var10.field2145;
            var10.method713(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)Llc;")
    public static final class79 method714(int arg0) {
        field2143++;
        if (arg0 != -19193) {
            method714(-86);
        }
        try {
            return (class79) Class.forName("mc").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class78();
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ldf;Ldf;B)V")
    public static final void method715(class28 arg0, class28 arg1, byte arg2) {
        field2146++;
        if (class15.field391 == null) {
            class15.field391 = class121.method948(class53.field1263, (byte) 96, class84.field2017, class132.field3023);
        }
        if (class142.field3219 == null) {
            class142.field3219 = class25.method226(class132.field3023, class53.field1263, class158.field3651, (byte) 113);
        }
        if (class127.field2914 == null) {
            class127.field2914 = class25.method226(class132.field3023, class53.field1263, class110.field2557, (byte) 113);
        }
        if (class31.field794 == null) {
            class31.field794 = class25.method226(class132.field3023, class53.field1263, class138.field3141, (byte) 113);
        }
        class52.method473(0, 23, 765, 480, 0);
        class52.method462(0, 0, 125, 23, 12425273, 9135624);
        class52.method462(125, 0, 640, 23, 5197647, 2697513);
        arg0.method44(class78.field1903, 62, 15, 0, -1);
        if (class31.field794 != null) {
            class31.field794[1].method719(140, 1);
            arg1.method47(class146.field3260, 152, 10, 16777215, -1);
            class31.field794[0].method719(140, 12);
            arg1.method47(class45.field1077, 152, 21, 16777215, -1);
        }
        if (class127.field2914 != null) {
            short var3 = 280;
            if (class77.field1863[0] == 0 && class83.field1993[0] == 0) {
                class127.field2914[2].method719(var3, 4);
            } else {
                class127.field2914[0].method719(var3, 4);
            }
            if (class77.field1863[0] == 0 && class83.field1993[0] == 1) {
                class127.field2914[3].method719(var3 + 15, 4);
            } else {
                class127.field2914[1].method719(var3 + 15, 4);
            }
            short var4 = 390;
            arg0.method47(class43.field1021, var3 + 32, 17, 16777215, -1);
            short var5 = 500;
            if (class77.field1863[0] == 1 && class83.field1993[0] == 0) {
                class127.field2914[2].method719(var4, 4);
            } else {
                class127.field2914[0].method719(var4, 4);
            }
            short var6 = 610;
            if (class77.field1863[0] == 1 && class83.field1993[0] == 1) {
                class127.field2914[3].method719(var4 + 15, 4);
            } else {
                class127.field2914[1].method719(var4 + 15, 4);
            }
            arg0.method47(class114.field2654, var4 + 32, 17, 16777215, -1);
            if (class77.field1863[0] == 2 && class83.field1993[0] == 0) {
                class127.field2914[2].method719(var5, 4);
            } else {
                class127.field2914[0].method719(var5, 4);
            }
            if (class77.field1863[0] == 2 && class83.field1993[0] == 1) {
                class127.field2914[3].method719(var5 + 15, 4);
            } else {
                class127.field2914[1].method719(var5 + 15, 4);
            }
            arg0.method47(class25.field613, var5 + 32, 17, 16777215, -1);
            if (class77.field1863[0] == 3 && class83.field1993[0] == 0) {
                class127.field2914[2].method719(var6, 4);
            } else {
                class127.field2914[0].method719(var6, 4);
            }
            if (class77.field1863[0] == 3 && class83.field1993[0] == 1) {
                class127.field2914[3].method719(var6 + 15, 4);
            } else {
                class127.field2914[1].method719(var6 + 15, 4);
            }
            arg0.method47(class114.field2666, var6 + 32, 17, 16777215, -1);
        }
        if (arg2 > -42) {
            return;
        }
        class52.method473(708, 4, 50, 16, 0);
        arg1.method44(class83.field1985, 733, 16, 16777215, -1);
        class22.field543 = -1;
        if (class15.field391 == null) {
            return;
        }
        byte var7 = 88;
        byte var8 = 19;
        int var9 = 765 / (var7 + 1);
        int var10 = 480 / (var8 + 1);
        int var11;
        int var12;
        do {
            var11 = var10;
            var12 = var9;
            if ((var9 - 1) * var10 >= class100.field2305) {
                var9--;
            }
            if ((var10 - 1) * var9 >= class100.field2305) {
                var10--;
            }
            if (class100.field2305 <= (var10 - 1) * var9) {
                var10--;
            }
        } while (var10 != var11 || var9 != var12);
        int var13 = (765 - var7 * var9) / (var9 + 1);
        if (var13 > 5) {
            var13 = 5;
        }
        int var14 = (765 - var7 * var9 - (var9 - 1) * var13) / 2;
        int var15 = var14;
        int var16 = (480 - var8 * var10) / (var10 - -1);
        int var17 = 0;
        if (var16 > 5) {
            var16 = 5;
        }
        int var18 = (480 - (var10 - 1) * var16 - var8 * var10) / 2;
        int var19 = var18 + 23;
        for (int var20 = 0; var20 < class100.field2305; var20++) {
            class32 var21 = class43.field1024[var20];
            boolean var22 = true;
            class118 var23 = class43.method359(var21.field799, (byte) -122);
            if (var21.field799 == -1) {
                var23 = class78.field1916;
                var22 = false;
            } else if (var21.field799 > 1980) {
                var22 = false;
                var23 = class110.field2569;
            }
            if (class33.field827 >= var15 && var19 <= class44.field1049 && var7 + var15 > class33.field827 && var19 + var8 > class44.field1049 && var22) {
                class22.field543 = var20;
                class15.field391[var21.field804 ? 1 : 0].method1099(var15, var19, 128, 16777215);
            } else {
                class15.field391[var21.field804 ? 1 : 0].method1114(var15, var19);
            }
            if (class142.field3219 != null) {
                class142.field3219[var21.field806 + (var21.field804 ? 8 : 0)].method719(var15 + 29, var19);
            }
            arg0.method44(class43.method359(var21.field805, (byte) -122), var15 + 15, var8 / 2 + var19 - -5, 0, -1);
            arg1.method44(var23, var15 + 60, var19 + 5 - -(var8 / 2), 268435455, -1);
            var19 += var8 + var16;
            int var10000 = ~var10;
            var17++;
            if (var10000 >= ~var17) {
                var15 += var7 + var13;
                var17 = 0;
                var19 = var18 + 23;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method716(Component arg0, int arg1) {
        if (arg1 > -91) {
            return;
        }
        field2149++;
        Method var2 = class152.field3424;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class151.field3395);
        arg0.addFocusListener(class151.field3395);
    }
}
