import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class14 extends class17 {

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "I")
    public static volatile int field151 = 0;

    @OriginalMember(owner = "client!ml", name = "U", descriptor = "J")
    public static long field152 = 0L;

    @OriginalMember(owner = "client!ml", name = "Z", descriptor = "I")
    public static int field157 = -1;

    @OriginalMember(owner = "client!ml", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field159 = null;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!ml", name = "V", descriptor = "I")
    public int field153;

    @OriginalMember(owner = "client!ml", name = "W", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!ml", name = "X", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!ml", name = "Y", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!ml", name = "ab", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "Llj;")
    public class25 field150;

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "[B")
    public byte[] field148;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "(I)V")
    public static final void method65(int arg0) {
        ++field147;
        int var1 = class59.field967.method634(class211.field3347);
        for (int var2 = 0; var2 < class83.field1384; ++var2) {
            int var6 = class59.field967.method634(class112.method789(var2, -95));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        if (arg0 >= -76) {
            method69(false);
        }
        var1 += 8;
        int var3 = class83.field1384 * 15 + 21;
        int var4 = class177.field2905;
        if (class310.field4964 < var3 + var4) {
            var4 = -var3 + class310.field4964;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = -(var1 / 2) + class236.field3792;
        if (~class294.field4709 > ~(var5 - -var1)) {
            var5 = -var1 + class294.field4709;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class46.field775 == 1) {
            if (class43.field624 == class236.field3792 && class265.field4257 == class177.field2905) {
                class96.field1543 = var1;
                class286.field4537 = true;
                class169.field2756 = var5;
                class46.field775 = 0;
                class72.field1211 = class83.field1384 * 15 - -(!class65.field1078 ? 22 : 26);
                class67.field1114 = var4;
                return;
            }
        } else {
            if (~class309.field4941 == ~class236.field3792 && ~class42.field609 == ~class177.field2905) {
                class96.field1543 = var1;
                class286.field4537 = true;
                class46.field775 = 0;
                class67.field1114 = var4;
                class169.field2756 = var5;
                class72.field1211 = class83.field1384 * 15 - -(!class65.field1078 ? 22 : 26);
                return;
            }
            class46.field775 = 1;
            class43.field624 = class309.field4941;
            class265.field4257 = class42.field609;
        }
    }

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "(I)[B")
    public final byte[] method66(int arg0) {
        ++field155;
        if (super.field205) {
            throw new RuntimeException();
        } else {
            if (arg0 > -44) {
                field151 = -90;
            }
            return this.field148;
        }
    }

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "(I)[Lbl;")
    public static final class146[] method67(int arg0) {
        ++field156;
        class146[] var1 = new class146[class183.field3014];
        for (int var2 = 0; class183.field3014 > var2; ++var2) {
            int var3 = class60.field976[var2] * class246.field3916[var2];
            byte[] var4 = class70.field1192[var2];
            if (class84.field1389[var2]) {
                byte[] var5 = class187.field3044[var2];
                int[] var6 = new int[var3];
                for (int var7 = 0; var3 > var7; ++var7) {
                    var6[var7] = class173.method1263(class51.method359(var5[var7] << 24, -16777216), class243.field3870[class51.method359(var4[var7], 255)]);
                }
                var1[var2] = new class200(class255.field4128, class111.field1749, class273.field4380[var2], class314.field5058[var2], class246.field3916[var2], class60.field976[var2], var6);
            } else {
                int[] var8 = new int[var3];
                for (int var9 = 0; ~var9 > ~var3; ++var9) {
                    var8[var9] = class243.field3870[class51.method359(255, var4[var9])];
                }
                var1[var2] = new class232(class255.field4128, class111.field1749, class273.field4380[var2], class314.field5058[var2], class246.field3916[var2], class60.field976[var2], var8);
            }
        }
        if (arg0 != 825784792) {
            return null;
        } else {
            class28.method156(arg0 ^ -825758408);
            return var1;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)I")
    public final int method68(byte arg0) {
        ++field149;
        int var2 = -107 % ((64 - arg0) / 48);
        return super.field205 ? 0 : 100;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(Z)V")
    public static void method69(boolean arg0) {
        field159 = null;
        if (!arg0) {
            field151 = 27;
        }
    }
}
