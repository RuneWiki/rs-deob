import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class203 {

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field2942 = 0;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "F")
    public static float field2939;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V")
    public static final void method1281(byte arg0) {
        if (arg0 != -117) {
            method1282(-71);
        }
        field2945++;
        class256 var1 = class363.method2385(15, 0, (byte) 1);
        var1.method1611(arg0 ^ 0x29);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
    public static final void method1282(int arg0) {
        field2944++;
        if (class34.method281(14848)) {
            if (class248.field3458 == null) {
                class316.method1970(500);
            }
            class133.field1783 = new boolean[100];
            class309.field4407 = new int[100];
            class410.field6134 = new int[100];
            class447.field6506 = true;
            class90.field1245 = 0;
            class122.field1641 = new int[100];
            for (int var1 = 0; var1 < 100; var1++) {
                class410.field6134[var1] = (int) (Math.random() * (double) class345.field5120);
                class309.field4407[var1] = (int) (Math.random() * 350.0D);
                class122.field1641[var1] = (int) (Math.random() * 102.0D);
                class133.field1783[var1] = Math.random() < 0.5D;
            }
            try {
                class433.field6379 = class1.field9.getToolkit().getSystemClipboard();
            } catch (Exception var2) {
            }
        }
        if (arg0 != 100) {
            method1283(-85);
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V")
    public static final void method1283(int arg0) {
        field2943++;
        int var1 = 0;
        if (class417.field6217) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        class129.method880(-1, var1);
        class237.method1447((byte) -120, var1);
        class212.method1309(-4, var1);
        class335.method2224(var1, 2);
        class234.method1433(true, var1);
        if (arg0 <= 42) {
            return;
        }
        class64.method418((byte) 112, var1);
        class58.method391(-1, var1);
        class300.method1894(var1, (byte) -64);
        class50.method347((byte) 103, var1);
        if (class137.field1815 == 10) {
            class199.method1251(28, (byte) 11);
        } else if (class137.field1815 == 30) {
            class199.method1251(25, (byte) 24);
        }
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
    public static final void method1284(int arg0) {
        if (arg0 != 21712) {
            method1282(34);
        }
        class328.field4707.method204((byte) 56);
        field2940++;
        class16.field177.method204((byte) 56);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IZZ)V")
    public static final void method1285(int arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            class180.field2390++;
            class193.method1200(1086676003);
        }
        field2941++;
        if (arg0 >= -31) {
            field2942 = -82;
        }
        if (arg2) {
            class374.field5635++;
            class72.method448(256);
        }
    }
}
