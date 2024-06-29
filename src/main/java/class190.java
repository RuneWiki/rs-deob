import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class190 extends class206 {

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "Lmh;")
    public static class62 field3017 = class201.method1405(true, "Versteckt");

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "Lmh;")
    public static class62 field3018 = class201.method1405(true, "null");

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "Lmh;")
    public static class62 field3030 = class201.method1405(true, ":");

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
    public static int field3028 = 0;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "Lmh;")
    public static class62 field3034 = class201.method1405(true, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public static int field3042 = 0;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public int field3015;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public int field3019;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public int field3020;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public int field3022;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    public int field3023;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    public int field3025;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    public int field3029;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public int field3031;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public int field3033;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public int field3035;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public int field3036;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    public int field3037;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public int field3038;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    public int field3039;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public int field3040;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    public int field3041;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    public int field3043;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "Lah;")
    public class110 field3016;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "Lac;")
    public class132 field3027;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "Lee;")
    public class72 field3032;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "Ljf;")
    public class9 field3044;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(B)V", line = 10)
    public static final void method1325(byte arg0) {
        if (arg0 != -75) {
            method1328(103);
        }
        field3026++;
        class64.method463((byte) 54);
        class206.method1445((byte) 2);
        class219.method1563(2);
        class120.method928(0);
        class196.method1374(true);
        class267.method1839((byte) 67);
        class114.method892((byte) 121);
        class27.method167(-10404);
        class306.method2090(false);
        class216.method1528((byte) 71);
        class237.method1671(-20184);
        class134.method1013(-24910);
        class133.method1009(false);
        class215.method1519(119);
        class100.field1649.method258(0);
        class112.field1852.method146(arg0 ^ 0xFFFFFFB5);
        class200.field3382.method146(0);
        class37.field500.method146(arg0 ^ 0xFFFFFFB5);
        class272.field4629.method146(0);
        class113.field1874.method146(0);
        class163.field2649.method146(0);
        class218.field3753.method146(0);
        class53.field781.method146(arg0 + 75);
        class32.field440.method146(0);
        class14.field115.method146(0);
        class35.field471.method146(0);
        class102.field1688.method1395((byte) -43);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V", line = 76)
    public final void method1326(int arg0) {
        this.field3044 = null;
        field3024++;
        this.field3016 = null;
        this.field3032 = null;
        if (arg0 != 24) {
            this.method1326(-24);
        }
        this.field3027 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lmi;I)V", line = 90)
    public static final void method1327(class92 arg0, int arg1) {
        field3021++;
        if (arg1 <= 25) {
            method1325((byte) -45);
        }
        byte[] var2 = new byte[24];
        if (class129.field2119 != null) {
            try {
                class129.field2119.method1996(0L, 89);
                class129.field2119.method1995((byte) -114, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method726(0, 24, (byte) -3, var2);
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V", line = 167)
    public static void method1328(int arg0) {
        field3018 = null;
        field3034 = null;
        field3030 = null;
        if (arg0 != 26203) {
            field3042 = -14;
        }
        field3017 = null;
    }
}
