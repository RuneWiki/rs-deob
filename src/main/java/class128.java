import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class128 extends class113 {

    @OriginalMember(owner = "client!se", name = "cb", descriptor = "Z")
    public static boolean field3081 = false;

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "Z")
    public static boolean field3077 = false;

    @OriginalMember(owner = "client!se", name = "eb", descriptor = "I")
    public static volatile int field3083 = 0;

    @OriginalMember(owner = "client!se", name = "db", descriptor = "Loe;")
    public static class102 field3082 = new class102(4096);

    @OriginalMember(owner = "client!se", name = "jb", descriptor = "[I")
    public static int[] field3088 = new int[25];

    @OriginalMember(owner = "client!se", name = "gb", descriptor = "Lu;")
    private static class135 field3085 = class87.method676((byte) -56, "Trade)4compete");

    @OriginalMember(owner = "client!se", name = "ib", descriptor = "Lu;")
    public static class135 field3087 = field3085;

    @OriginalMember(owner = "client!se", name = "kb", descriptor = "Ldc;")
    public static class25 field3089 = new class25();

    @OriginalMember(owner = "client!se", name = "ob", descriptor = "I")
    public static int field3093 = 0;

    @OriginalMember(owner = "client!se", name = "nb", descriptor = "Lu;")
    public static class135 field3092 = class87.method676((byte) -57, "Wen m-Ochten Sie von der Liste entfernen?");

    @OriginalMember(owner = "client!se", name = "mb", descriptor = "Le;")
    public static class29 field3091 = new class29(64);

    @OriginalMember(owner = "client!se", name = "qb", descriptor = "I")
    public static int field3095 = 99;

    @OriginalMember(owner = "client!se", name = "rb", descriptor = "Lu;")
    public static class135 field3096 = class87.method676((byte) -39, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "B")
    public byte field3079;

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!se", name = "fb", descriptor = "I")
    public int field3084;

    @OriginalMember(owner = "client!se", name = "hb", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!se", name = "pb", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "Lpe;")
    public class109 field3080;

    @OriginalMember(owner = "client!se", name = "lb", descriptor = "Lbc;")
    public static class11 field3090;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method1040(int arg0, int arg1, byte[] arg2, int arg3) {
        field3078++;
        int var4 = -1;
        boolean var5 = true;
        class59 var6 = new class59(arg2);
        if (arg3 >= -8) {
            return true;
        }
        label56: while (true) {
            int var7 = var6.method450((byte) -71);
            if (var7 == 0) {
                return var5;
            }
            int var8 = 0;
            var4 += var7;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var6.method450((byte) -71);
                    if (var11 == 0) {
                        continue label56;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var6.method480(0) >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg1 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class119 var17 = class2.method9(false, var4);
                        if (var14 != 22 || !class100.field2422 || var17.field2877 != 0 || var17.field2834 == 1 || var17.field2845) {
                            var9 = true;
                            if (!var17.method942(0)) {
                                class75.field1761++;
                                var5 = false;
                            }
                        }
                    }
                }
                int var10 = var6.method450((byte) -71);
                if (var10 == 0) {
                    break;
                }
                var6.method480(0);
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V")
    public static void method1041(int arg0) {
        field3091 = null;
        field3088 = null;
        field3096 = null;
        if (arg0 != 0) {
            method1041(-23);
        }
        field3092 = null;
        field3082 = null;
        field3087 = null;
        field3085 = null;
        field3089 = null;
        field3090 = null;
    }
}
