import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class241 {

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public int field3980;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "[Ljn;")
    public class59[] field3981;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "[I")
    public int[] field3977;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Z")
    public static boolean field3979 = true;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field3986 = new String[200];

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "Ltf;")
    public static class115 field3978 = new class115();

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field3988 = 0;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field3989 = 0;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "J")
    public static volatile long field3993 = 0L;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "Lea;")
    public static class12 field3991;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Lwc;")
    public static class185 field3976;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Lth;")
    public static class57 field3992;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "Ljava/awt/Frame;")
    public static Frame field3994;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)I", line = 8)
    public static final int method1834(int arg0, boolean arg1) {
        int var2 = ((arg0 & 0xAAAAAAAA) >>> 1) + (arg0 & 0x55555555);
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCD) >>> 2);
        if (!arg1) {
            method1834(17, false);
        }
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        field3984++;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 28)
    public static final void method1835(byte arg0) {
        int var1 = -89 % ((arg0 - 76) / 35);
        for (int var2 = 0; var2 < class288.field4693; var2++) {
            class21 var3 = class201.method1544(var2, (byte) -76);
            if (var3 != null && var3.field237 == 0) {
                class273.field4527[var2] = 0;
                class66.field1178[var2] = 0;
            }
        }
        class279.field4583 = new class164(16);
        field3983++;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V", line = 54)
    public static void method1836(byte arg0) {
        if (arg0 != -115) {
            field3994 = (Frame) null;
        }
        field3992 = null;
        field3994 = null;
        field3986 = null;
        field3976 = null;
        field3978 = null;
        field3991 = null;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)V", line = 72)
    public static final void method1837(byte arg0) {
        field3982++;
        class304 var1 = (class304) class156.field2468.method2300((byte) 109);
        if (arg0 != -105) {
            field3993 = 9L;
        }
        while (var1 != null) {
            if (var1.field4877 > 0) {
                var1.field4877--;
            }
            if (var1.field4877 != 0) {
                if (var1.field4869 > 0) {
                    var1.field4869--;
                }
                if (var1.field4869 == 0 && var1.field4871 >= 1 && var1.field4885 >= 1 && var1.field4871 <= 102 && var1.field4885 <= 102 && (var1.field4872 < 0 || class46.method368(var1.field4872, (byte) 62, var1.field4873))) {
                    class353.method2494(var1.field4884, var1.field4871, var1.field4875, var1.field4872, var1.field4876, var1.field4873, true, var1.field4885);
                    var1.field4869 = -1;
                    if (var1.field4872 == var1.field4867 && var1.field4867 == -1) {
                        var1.method330(15);
                    } else if (var1.field4872 == var1.field4867 && var1.field4884 == var1.field4879 && var1.field4883 == var1.field4873) {
                        var1.method330(arg0 + 120);
                    }
                }
            } else if (var1.field4867 < 0 || class46.method368(var1.field4867, (byte) 48, var1.field4883)) {
                class353.method2494(var1.field4879, var1.field4871, var1.field4875, var1.field4867, var1.field4876, var1.field4883, true, var1.field4885);
                var1.method330(arg0 + 120);
            }
            var1 = (class304) class156.field2468.method2306(-23);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILqm;)V", line = 128)
    public static final void method1838(int arg0, class227 arg1) {
        if (arg0 != -2) {
            field3988 = -41;
        }
        for (int var2 = 0; var2 < class189.field3042; var2++) {
            int var3 = arg1.method1708((byte) 103);
            int var4 = arg1.method1765(true);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class335.field5304[var3] != null) {
                class335.field5304[var3].field2841 = var4;
            }
        }
        field3985++;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(I)V", line = 159)
    public class241(int arg0) {
        this.field3980 = arg0;
        this.field3981 = new class59[this.field3980];
        this.field3977 = new int[this.field3980];
    }
}
