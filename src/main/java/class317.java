import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class317 {

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Lph;")
    public static class229 field5376 = class266.method1858("Lade Benutzeroberfl-=che )2 ", 0);

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field5381 = 0;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 46)
    public static void method2143(int arg0) {
        field5376 = null;
        if (arg0 != 0) {
            method2143(-90);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBLce;II)V", line = 57)
    public static final void method2144(int arg0, byte arg1, class209 arg2, int arg3, int arg4) {
        field5382++;
        if (class230.field3820 == arg2 || class314.field5337 >= 400 || arg1 <= 21) {
            return;
        }
        class229 var5;
        if (arg2.field3478 == 0) {
            boolean var6 = true;
            if (class230.field3820.field3470 != -1 && arg2.field3470 != -1) {
                int var7 = class230.field3820.field3470 < arg2.field3470 ? class230.field3820.field3470 : arg2.field3470;
                int var8 = arg2.field3468 >= class230.field3820.field3468 ? arg2.field3468 : class230.field3820.field3468;
                int var9 = var8 * 10 / 100 + var7 + 5;
                int var10 = class230.field3820.field3468 - arg2.field3468;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var9 < var10) {
                    var6 = false;
                }
            }
            if (arg2.field3468 >= arg2.field3454) {
                var5 = class248.method1746(8528, new class229[] { arg2.method1453((byte) -60), var6 ? class304.method2053(class230.field3820.field3468, arg2.field3468, (byte) -87) : class330.field5627, class228.field3750, class10.field120, class50.method354(0, arg2.field3468), class51.field731 });
            } else {
                var5 = class248.method1746(8528, new class229[] { arg2.method1453((byte) -89), var6 ? class304.method2053(class230.field3820.field3468, arg2.field3468, (byte) -87) : class330.field5627, class228.field3750, class10.field120, class50.method354(0, arg2.field3468), class154.field2506, class50.method354(0, arg2.field3454 - arg2.field3468), class51.field731 });
            }
        } else {
            var5 = class248.method1746(8528, new class229[] { arg2.method1453((byte) -113), class228.field3750, class132.field2151, class50.method354(0, arg2.field3478), class51.field731 });
        }
        if (field5381 == 1) {
            class72.field1201++;
            class306.method2067(arg0, class248.method1746(8528, new class229[] { class208.field3431, class74.field1252, var5 }), class143.field2321, arg3, (short) 12, (long) arg4, 0);
        } else if (!class8.field103) {
            for (int var11 = 7; var11 >= 0; var11--) {
                if (class321.field5439[var11] != null) {
                    class138.field2236++;
                    short var12 = 0;
                    boolean var13 = false;
                    if (class166.field2710 == 0 && class321.field5439[var11].method1630(10, class94.field1591)) {
                        if (class230.field3820.field3468 < arg2.field3468) {
                            var12 = 2000;
                        }
                        if (class230.field3820.field3438 != 0 && arg2.field3438 != 0) {
                            if (class230.field3820.field3438 == arg2.field3438) {
                                var12 = 2000;
                            } else {
                                var12 = 0;
                            }
                        }
                    } else if (class105.field1776[var11]) {
                        var12 = 2000;
                    }
                    short var14 = class85.field1468[var11];
                    short var15 = (short) (var12 + var14);
                    class306.method2067(arg0, class248.method1746(8528, new class229[] { class330.field5627, var5 }), class321.field5439[var11], arg3, var15, (long) arg4, 0);
                }
            }
        } else if ((class208.field3434 & 0x8) == 8) {
            class306.method2067(arg0, class248.method1746(8528, new class229[] { class205.field3388, class74.field1252, var5 }), class116.field1965, arg3, (short) 43, (long) arg4, 0);
            class323.field5512++;
        }
        for (int var16 = 0; var16 < class314.field5337; var16++) {
            if (class53.field748[var16] == 48) {
                class141.field2282[var16] = class248.method1746(8528, new class229[] { class330.field5627, var5 });
                break;
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V", line = 187)
    public static final void method2145(int arg0, int arg1, int arg2) {
        if (arg2 != 103) {
            method2145(-128, -102, 92);
        }
        class156 var3 = class6.method38(-31037, arg0);
        int var4 = var3.field2531;
        int var5 = var3.field2533;
        field5375++;
        int var6 = var3.field2543;
        int var7 = class15.field176[var6 - var4];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var4;
        class157.method1127(class166.field2711[var5] & ~var8 | var8 & arg1 << var4, 28232, var5);
    }
}
