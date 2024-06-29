import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class297 {

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public int field4652 = -1;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field4653 = 0;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Lta;")
    public static class197 field4655 = new class197(32);

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field4663 = 0;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Lel;")
    public static class118 field4661;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "Lql;")
    public class17 field4656;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Lqm;")
    public static class233 field4662;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "[I")
    public int[] field4659;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "[Ljava/lang/String;")
    public String[] field4658;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)[Lsd;", line = 11)
    public static final class27[] method2091(byte arg0) {
        field4654++;
        class27[] var1 = new class27[class173.field2566];
        if (arg0 >= -10) {
            method2092(-47);
        }
        for (int var2 = 0; var2 < class173.field2566; var2++) {
            int var3 = class323.field5027[var2] * class111.field1756[var2];
            byte[] var4 = class274.field4162[var2];
            if (class16.field190[var2]) {
                byte[] var5 = class138.field2153[var2];
                int[] var6 = new int[var3];
                for (int var7 = 0; var7 < var3; var7++) {
                    var6[var7] = class147.method1098(class57.field843[class142.method1078(var4[var7], 255)], class142.method1078(-16777216, var5[var7] << 24));
                }
                if (class36.field534) {
                    var1[var2] = new class239(class150.field2273, class98.field1453, class271.field4096[var2], class101.field1541[var2], class111.field1756[var2], class323.field5027[var2], var6);
                } else {
                    var1[var2] = new class192(class150.field2273, class98.field1453, class271.field4096[var2], class101.field1541[var2], class111.field1756[var2], class323.field5027[var2], var6);
                }
            } else {
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class57.field843[class142.method1078(255, var4[var9])];
                }
                if (class36.field534) {
                    var1[var2] = new class221(class150.field2273, class98.field1453, class271.field4096[var2], class101.field1541[var2], class111.field1756[var2], class323.field5027[var2], var8);
                } else {
                    var1[var2] = new class134(class150.field2273, class98.field1453, class271.field4096[var2], class101.field1541[var2], class111.field1756[var2], class323.field5027[var2], var8);
                }
            }
        }
        class265.method1835(10);
        return var1;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 77)
    public static void method2092(int arg0) {
        if (arg0 < -82) {
            field4655 = null;
            field4662 = null;
            field4661 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIBLlb;)Z", line = 94)
    public static final boolean method2093(int arg0, int arg1, byte arg2, class211 arg3) {
        int var4 = -6 % ((43 - arg2) / 45);
        field4660++;
        byte[] var5 = arg3.method1507(arg1, (byte) -127, arg0);
        if (var5 == null) {
            return false;
        } else {
            class7.method58((byte) 89, var5);
            return true;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Lsb;", line = 110)
    public static final class110 method2094(int arg0, int arg1) {
        field4657++;
        if (arg0 > -40) {
            return (class110) null;
        }
        class110 var2 = (class110) class307.field4788.method1432((byte) 106, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class88.field1294.method1507(arg1, (byte) -126, 33);
        class110 var4 = new class110();
        if (var3 != null) {
            var4.method875(23295, new class35(var3), arg1);
        }
        class307.field4788.method1436(false, var4, (long) arg1);
        return var4;
    }
}
