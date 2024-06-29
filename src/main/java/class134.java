import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class134 {

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2205 = "level: ";

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "[I")
    public static int[] field2207 = new int[32];

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field2211 = 0;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "J")
    public long field2213;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Lob;")
    public class134 field2202;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Lob;")
    public class134 field2209;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Z")
    public static boolean field2201;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static void method992(int arg0) {
        field2207 = null;
        if (arg0 > -13) {
            method996(-116, -123, -100, -56, (int[]) null);
        }
        field2205 = null;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public final void method993(int arg0) {
        field2212++;
        if (this.field2202 == null) {
            return;
        }
        if (arg0 != 32) {
            this.field2202 = null;
        }
        this.field2202.field2209 = this.field2209;
        this.field2209.field2202 = this.field2202;
        this.field2202 = null;
        this.field2209 = null;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)Leb;")
    public static final class36 method994(int arg0) {
        if (arg0 != -17661) {
            return null;
        }
        field2203++;
        class36 var1 = (class36) class293.field4806.method452(arg0 ^ 0xFFFFBD2B);
        if (var1 != null) {
            var1.method993(32);
            var1.method1174(-25741);
            return var1;
        }
        class36 var2;
        do {
            var2 = (class36) class244.field4099.method452(arg0 ^ 0xFFFFBD2B);
            if (var2 == null) {
                return null;
            }
            if (var2.method227(arg0 ^ 0xFFFFBB01) > class188.method1355(73)) {
                return null;
            }
            var2.method993(32);
            var2.method1174(arg0 - 8080);
        } while ((Long.MIN_VALUE & var2.field2570) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)Z")
    public final boolean method995(int arg0) {
        field2204++;
        if (arg0 != 32) {
            method992(-24);
        }
        return this.field2202 != null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIII[I)V")
    public static final void method996(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field2210++;
        int var6 = arg1 - 1;
        int var5 = var6 - 7;
        arg2--;
        while (arg2 < var5) {
            int var7 = arg2 + 1;
            arg4[var7] = arg3;
            int var8 = var7 + 1;
            arg4[var8] = arg3;
            int var9 = var8 + 1;
            arg4[var9] = arg3;
            int var10 = var9 + 1;
            arg4[var10] = arg3;
            int var11 = var10 + 1;
            arg4[var11] = arg3;
            int var12 = var11 + 1;
            arg4[var12] = arg3;
            int var13 = var12 + 1;
            arg4[var13] = arg3;
            arg2 = var13 + 1;
            arg4[arg2] = arg3;
        }
        if (arg0 != 0) {
            method996(-24, 65, -13, 126, (int[]) null);
        }
        while (var6 > arg2) {
            arg2++;
            arg4[arg2] = arg3;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Laj;Laj;ZLaj;Laj;)V")
    public static final void method997(class151 arg0, class151 arg1, boolean arg2, class151 arg3, class151 arg4) {
        class273.field4562 = arg1;
        class45.field704 = arg3;
        if (!arg2) {
            field2214 = 96;
        }
        class90.field1483 = arg0;
        field2206++;
        class214.field3600 = arg4;
        class208.field3515 = new class207[class90.field1483.method1155((byte) -126)][];
        class169.field2730 = new boolean[class90.field1483.method1155((byte) -122)];
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
    public static final void method998(int arg0) {
        class150.field2478.method94(arg0 ^ 0x22);
        if (arg0 == 0) {
            field2208++;
        }
    }
}
