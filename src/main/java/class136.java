import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class136 extends class113 {

    @OriginalMember(owner = "client!ua", name = "nb", descriptor = "[Lte;")
    public class134[] field3303;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "Lu;")
    public static class135 field3290 = class87.method676((byte) -84, "(Udns");

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "Lu;")
    private static class135 field3289 = class87.method676((byte) -98, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!ua", name = "hb", descriptor = "Lu;")
    private static class135 field3297 = class87.method676((byte) -79, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "Lu;")
    public static class135 field3293 = field3289;

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
    public static int field3294 = -1;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "Lu;")
    public static class135 field3288 = field3297;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "I")
    public static int field3292 = 0;

    @OriginalMember(owner = "client!ua", name = "mb", descriptor = "Lu;")
    private static class135 field3302 = class87.method676((byte) -55, "Loading config )2 ");

    @OriginalMember(owner = "client!ua", name = "fb", descriptor = "Lu;")
    public static class135 field3295 = field3302;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ua", name = "gb", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!ua", name = "ib", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!ua", name = "jb", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!ua", name = "lb", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!ua", name = "kb", descriptor = "Ljb;")
    public static class64 field3300;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1103(byte arg0, byte[] arg1) {
        field3299++;
        int var2 = arg1.length;
        if (arg0 > -77) {
            field3290 = null;
        }
        byte[] var3 = new byte[var2];
        class71.method575(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)Z")
    public static final boolean method1104(int arg0) {
        field3291++;
        return ~class12.field290 == arg0 ? class17.field380.method1140(-78) : true;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
    public static void method1105(byte arg0) {
        field3297 = null;
        field3295 = null;
        field3290 = null;
        field3288 = null;
        field3300 = null;
        if (arg0 < -91) {
            field3302 = null;
            field3289 = null;
            field3293 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)Z")
    public final boolean method1106(int arg0, int arg1) {
        field3298++;
        if (arg1 != -1) {
            method1103((byte) 50, null);
        }
        return this.field3303[arg0].field3219;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lg;Lg;IZ)V")
    public class136(class43 arg0, class43 arg1, int arg2, boolean arg3) {
        class23 var5 = new class23();
        int var6 = arg0.method335(arg2, (byte) -38);
        this.field3303 = new class134[var6];
        int[] var7 = arg0.method318(arg2, 0);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class26 var9 = null;
            byte[] var10 = arg0.method324(0, var7[var8], arg2);
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            for (class26 var12 = (class26) var5.method182((byte) 50); var12 != null; var12 = (class26) var5.method181((byte) 100)) {
                if (var12.field634 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method334(1663, 0, var11);
                } else {
                    var13 = arg1.method334(1663, var11, 0);
                }
                var9 = new class26(var11, var13);
                var5.method185(var9, -27557);
            }
            this.field3303[var7[var8]] = new class134(var10, var9);
        }
    }
}
