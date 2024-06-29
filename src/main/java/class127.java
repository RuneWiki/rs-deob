import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class127 {

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field1752 = 0;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 4)
    public static final String method916(long arg0, byte arg1) {
        field1746++;
        if (arg1 >= -117) {
            field1752 = 35;
        }
        return class309.method2120(false, arg0);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BIII)V", line = 16)
    public static final void method917(byte arg0, int arg1, int arg2, int arg3) {
        field1747++;
        if (arg0 < 97) {
            field1752 = -75;
        }
        String var4 = "::tele " + arg3 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
        System.out.println(var4);
        class140.method1014(var4, 86);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 38)
    public static final void method918(int arg0) {
        class69.method511();
        field1748++;
        class257.field3786 = new class177[9];
        class257.field3786[1] = new class32();
        class257.field3786[arg0] = new class27();
        class257.field3786[3] = new class5();
        class257.field3786[4] = new class18();
        class257.field3786[5] = new class246();
        class257.field3786[6] = new class91();
        class257.field3786[7] = new class216();
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIII)V", line = 58)
    public static final void method919(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1745++;
        int var5 = 0;
        class190.method1329(class126.field1723[arg3], arg4 + arg1, arg2, (byte) -100, arg4 - arg1);
        int var6 = arg1;
        int var7 = -arg1;
        if (arg0 != 7) {
            return;
        }
        int var8 = -1;
        while (var6 > var5) {
            var5++;
            var8 += 2;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                int[] var9 = class126.field1723[arg3 + var6];
                var7 -= var6 << 1;
                int[] var10 = class126.field1723[arg3 - var6];
                int var11 = arg4 - var5;
                int var12 = arg4 + var5;
                class190.method1329(var9, var12, arg2, (byte) -94, var11);
                class190.method1329(var10, var12, arg2, (byte) -114, var11);
            }
            int var13 = arg4 - var6;
            int var14 = arg4 + var6;
            int[] var15 = class126.field1723[arg3 + var5];
            int[] var16 = class126.field1723[arg3 - var5];
            class190.method1329(var15, var14, arg2, (byte) -123, var13);
            class190.method1329(var16, var14, arg2, (byte) -82, var13);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)I", line = 114)
    public static final int method920(int arg0, int arg1, int arg2) {
        field1750++;
        class113 var3 = (class113) class255.field3648.method111(-112, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && var3.field1546.length > arg1) {
            if (arg0 >= -17) {
                field1752 = -73;
            }
            return var3.field1546[arg1];
        } else {
            return 0;
        }
    }
}
