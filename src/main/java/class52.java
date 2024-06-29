import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public abstract class class52 extends class14 {

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
    public int field1328 = 1000;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "[[B")
    public static byte[][] field1327 = new byte[50][];

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "Lea;")
    private static class38 field1326 = class9.method46((byte) 106, "To play on this world move to a free area first)3");

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "Lea;")
    public static class38 field1329 = field1326;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "Lpg;")
    public static class141 field1334 = new class141();

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "Lea;")
    public static class38 field1337 = class9.method46((byte) 125, "welle2:");

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "Lgh;")
    public static class62 field1339;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "Lhd;")
    public static class67 field1336;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)V")
    public static void method378(int arg0) {
        if (arg0 >= -87) {
            return;
        }
        field1326 = null;
        field1336 = null;
        field1334 = null;
        field1339 = null;
        field1337 = null;
        field1327 = null;
        field1329 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lah;B)V")
    public static final void method379(class9 arg0, byte arg1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        int var5 = -59 / ((36 - arg1) / 61);
        field1332++;
        if (arg0.field196 == 0) {
            var2 = class101.field2268.method1127(arg0.field194, arg0.field217, arg0.field210);
        }
        int var6 = 0;
        if (arg0.field196 == 1) {
            var2 = class101.field2268.method1099(arg0.field194, arg0.field217, arg0.field210);
        }
        if (arg0.field196 == 2) {
            var2 = class101.field2268.method1125(arg0.field194, arg0.field217, arg0.field210);
        }
        if (arg0.field196 == 3) {
            var2 = class101.field2268.method1096(arg0.field194, arg0.field217, arg0.field210);
        }
        if (var2 != 0) {
            int var7 = class101.field2268.method1136(arg0.field194, arg0.field217, arg0.field210, var2);
            var4 = var2 >> 14 & 0x7FFF;
            var6 = var7 >> 6 & 0x3;
            var3 = var7 & 0x1F;
        }
        arg0.field211 = var4;
        arg0.field208 = var3;
        arg0.field215 = var6;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I")
    public static int method380(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)Lea;")
    public static final class38 method381(int arg0, int arg1) {
        field1330++;
        class38 var2 = new class38();
        var2.field802 = arg1;
        var2.field821 = new byte[arg0];
        return var2;
    }

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "(I)[Lk;")
    public static final class89[] method382(int arg0) {
        field1333++;
        int var1 = 89 / ((arg0 - 56) / 59);
        class89[] var2 = new class89[class25.field509];
        for (int var3 = 0; var3 < class25.field509; var3++) {
            class89 var4 = new class89();
            var4.field2047 = field1338;
            var4.field2046 = class117.field2563;
            var4.field2050 = class150.field3101[var3];
            var4.field2049 = class148.field3080[var3];
            var4.field2044 = class30.field605[var3];
            var4.field2048 = class165.field3418[var3];
            int var5 = var4.field2048 * var4.field2044;
            byte[] var6 = class25.field513[var3];
            var4.field2045 = new int[var5];
            for (int var7 = 0; var7 < var5; var7++) {
                var4.field2045[var7] = class10.field227[method380(var6[var7], 255)];
            }
            var2[var3] = var4;
        }
        class90.method758(true);
        return var2;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(Z)Lrg;")
    public class159 method220(boolean arg0) {
        field1335++;
        if (!arg0) {
            field1334 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIIIII)V")
    public void method341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1331++;
        class159 var10 = this.method220(true);
        if (var10 != null) {
            this.field1328 = var10.field1328;
            var10.method341(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }
}
