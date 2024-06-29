import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class94 extends class112 {

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Lfa;")
    public static class98 field1328 = new class98(16);

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "Lec;")
    public static class99 field1330 = new class99(64);

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field1332 = 0;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "Lec;")
    public static class99 field1331 = new class99(500);

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)Lmn;", line = 6)
    public static final class161 method680(int arg0, int arg1, int arg2) {
        class161 var3 = class331.method2308((byte) -126, arg0);
        field1327++;
        if (~arg2 == arg1) {
            return var3;
        } else if (var3 == null || var3.field2509 == null || arg2 >= var3.field2509.length) {
            return null;
        } else {
            return var3.field2509[arg2];
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V", line = 24)
    public static final void method681(int arg0) {
        class49.field673 = null;
        class170.field2754 = null;
        class39.field574 = null;
        class198.field3037 = null;
        class84.field1230 = null;
        class163.field2642 = null;
        class167.field2703 = null;
        class320.field4949 = null;
        class98.field1405 = null;
        class279.field4335 = null;
        class81.field1194 = null;
        if (arg0 != 0) {
            field1330 = (class99) null;
        }
        class336.field5232 = null;
        class311.field4828 = null;
        class345.field5347 = null;
        class241.field3676 = null;
        class300.field4623 = null;
        class43.field618 = null;
        class102.field1470 = null;
        field1329++;
        class265.field4128 = null;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V", line = 59)
    public static void method682(int arg0) {
        field1330 = null;
        field1331 = null;
        field1328 = null;
        if (arg0 < 93) {
            field1334 = -124;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljd;Ljava/lang/String;B)Lmk;", line = 74)
    public static final class25 method683(class95 arg0, String arg1, byte arg2) {
        field1325++;
        int var3 = arg0.method690((byte) -108, arg1);
        if (var3 == -1) {
            return new class25(0);
        }
        int[] var4 = arg0.method688(var3, arg2 + 23245);
        class25 var5 = new class25(var4.length);
        int var6 = 0;
        if (arg2 != -44) {
            method680(-40, -119, -109);
        }
        while (var6 < var5.field291) {
            class254 var7 = new class254(arg0.method696(var4[var6], (byte) 99, var3));
            var5.field283[var6] = var7.method1778(1258);
            var5.field277[var6] = var7.method1733(2023893896);
            var5.field289[var6] = var7.method1741(arg2 - 32725);
            var5.field281[var6] = var7.method1741(-32769);
            var6++;
        }
        return var5;
    }
}
