import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class2 {

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Lrm;")
    public static class184 field17 = new class184(16);

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field21 = 0;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Ljava/lang/String;")
    public static String field25 = "white:";

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field24 = 0;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field22 = 0;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Ldl;")
    public static class29 field23;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field20;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V", line = 10)
    public static void method7(byte arg0) {
        field20 = null;
        if (arg0 <= 69) {
            field17 = (class184) null;
        }
        field17 = null;
        field25 = null;
        field23 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)Lad;", line = 28)
    public static final class191 method8(int arg0, int arg1) {
        class191 var2 = (class191) field17.method1351((long) arg1, arg0 + 62);
        field15++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class156.field2418.method1813(arg1, 29, true);
        class191 var4 = new class191();
        if (var3 != null) {
            var4.method1410(false, new class6(var3), arg1);
        }
        if (arg0 == 1) {
            field17.method1347(var4, (long) arg1, (byte) -111);
            return var4;
        } else {
            return (class191) null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 60)
    public static final void method9(int arg0) {
        field18++;
        int var1 = class251.field3946.length;
        int var2 = 127 % ((-arg0 - 5) / 55);
        for (int var3 = 0; var3 < var1; var3++) {
            if (class251.field3946[var3] != null) {
                int var4 = -1;
                for (int var5 = 0; var5 < class336.field5230; var5++) {
                    if (class297.field4582[var5] == class232.field3616[var3]) {
                        var4 = var5;
                        break;
                    }
                }
                if (var4 == -1) {
                    class297.field4582[class336.field5230] = class232.field3616[var3];
                    var4 = class336.field5230++;
                }
                int var6 = 0;
                class6 var7 = new class6(class251.field3946[var3]);
                while (class251.field3946[var3].length > var7.field111 && var6 < 511) {
                    int var8 = var6++ << 6 | var4;
                    int var9 = var7.method39((byte) 91);
                    int var10 = (var9 & 0x1FF1) >> 7;
                    int var11 = var9 >> 14;
                    int var12 = (class232.field3616[var3] >> 8) * 64 + var10 - class326.field5108;
                    int var13 = var9 & 0x3F;
                    int var14 = (class232.field3616[var3] & 0xFF) * 64 + var13 - class198.field3168;
                    class161 var15 = class41.method339(45, var7.method39((byte) 105));
                    if (class59.field870[var8] == null && (var15.field2551 & 0x1) > 0 && class130.field1925 == var11 && var12 >= 0 && (var15.field2555 + var12) < 104 && var14 >= 0 && (var14 + var15.field2555) < 104) {
                        class59.field870[var8] = new class212();
                        class212 var16 = class59.field870[var8];
                        class85.field1157[class79.field1083++] = var8;
                        var16.field4718 = class229.field3595;
                        var16.method1541(127, var15);
                        var16.method2098(var16.field3346.field2555, (byte) 43);
                        var16.field4674 = var16.field4715 = class55.field749[var16.field3346.field2558];
                        var16.field4684 = var16.field3346.field2604;
                        var16.field4690 = var16.field3346.field2581;
                        if (var16.field4690 == 0) {
                            var16.field4715 = 0;
                        }
                        var16.method2102(var12, var16.method2099((byte) 123), var14, (byte) -77, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lug;B)V", line = 150)
    public static final void method10(class253 arg0, byte arg1) {
        field16++;
        class42.field572 = arg0.method1808(-1, "titlebg");
        int var2 = 54 % ((arg1 + 52) / 35);
        class318.field5030 = arg0.method1808(-1, "logo");
    }
}
