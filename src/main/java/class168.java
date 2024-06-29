import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class168 {

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "[I")
    public static int[] field2599 = new int[2048];

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "Lna;")
    public static class26 field2600 = class69.method505("Number of player models in cache:", (byte) -121);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Z")
    public static boolean field2596 = false;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "Lna;")
    public static class26 field2604 = class69.method505("<img=1>", (byte) -125);

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 6)
    public static void method1134(int arg0) {
        if (arg0 != 26) {
            field2599 = (int[]) null;
        }
        field2599 = null;
        field2604 = null;
        field2600 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V", line = 54)
    public static final void method1135(boolean arg0) {
        class114.field1789.field1301 = 0;
        class178.field2800 = -1;
        class11.field153 = arg0;
        class259.field4228 = 0;
        field2597++;
        class64.field1020 = 0;
        class126.field1955 = 0;
        class56.field907 = -1;
        class154.field2402 = 0;
        class11.field155 = 0;
        class284.field4757 = -1;
        class300.field5157.field1301 = 0;
        class148.field2311 = 0;
        class26.field384 = -1;
        for (int var1 = 0; var1 < class268.field4427.length; var1++) {
            if (class268.field4427[var1] != null) {
                class268.field4427[var1].field3909 = -1;
            }
        }
        for (int var2 = 0; var2 < class185.field2877.length; var2++) {
            if (class185.field2877[var2] != null) {
                class185.field2877[var2].field3909 = -1;
            }
        }
        class33.method267((byte) 80);
        class37.field614 = 1;
        class193.method1302(30, 5);
        for (int var3 = 0; var3 < 100; var3++) {
            class2.field21[var3] = true;
        }
        class158.method1074(-3);
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)Lq;", line = 134)
    public static final class97 method1136(int arg0) {
        field2605++;
        try {
            if (arg0 != 31431) {
                method1136(123);
            }
            return (class97) Class.forName("db").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIII)Lwk;", line = 187)
    public static final class174 method1137(int arg0, int arg1, int arg2, int arg3) {
        field2601++;
        class174 var4 = new class174();
        var4.field2722 = arg3;
        var4.field2721 = arg1;
        class74.field1132.method1826(1, var4, (long) arg2);
        class72.method516(arg1, 16182);
        class297 var5 = class178.method1226((byte) 122, arg2);
        if (var5 != null) {
            class318.method2209(120, var5);
        }
        if (class142.field2165 != null) {
            class318.method2209(117, class142.field2165);
            class142.field2165 = null;
        }
        int var6 = class126.field1955;
        if (arg0 != 6422) {
            field2604 = (class26) null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            if (class9.method55(class142.field2178[var7], arg0 - 6301)) {
                class186.method1271(1, var7);
            }
        }
        if (class126.field1955 == 1) {
            class11.field153 = false;
            class222.method1486(class150.field2342, class66.field1034, (byte) -40, class315.field5395, class118.field1861);
        } else {
            class222.method1486(class150.field2342, class66.field1034, (byte) -40, class315.field5395, class118.field1861);
            int var8 = class89.field1474.method1199(class196.field3046);
            for (int var9 = 0; var9 < class126.field1955; var9++) {
                int var10 = class89.field1474.method1199(class82.method641(var9, true));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class66.field1034 = var8 + 8;
            class118.field1861 = class126.field1955 * 15 + (class266.field4385 ? 26 : 22);
        }
        if (var5 != null) {
            class203.method1368(var5, false, 55);
        }
        class31.method248(arg1, 58);
        if (class250.field4095 != -1) {
            class294.method2063(arg0 ^ 0x196D, 1, class250.field4095);
        }
        return var4;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lna;I)V", line = 276)
    public static final void method1138(class26 arg0, int arg1) {
        field2602++;
        int var2 = class173.method1190(arg0, false);
        if (arg1 != var2) {
            class8.method51((byte) 86, class298.field5133.field173[var2], class298.field5133.field160[var2]);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)Luc;", line = 326)
    public static final class189 method1139(byte arg0) {
        field2598++;
        if (arg0 != 15) {
            field2600 = (class26) null;
        }
        try {
            return (class189) Class.forName("o").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }
}
