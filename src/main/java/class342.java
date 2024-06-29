import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class342 {

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field4357 = 0;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "Lpi;")
    public static class340 field4358 = new class340(83, 8);

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "Lpi;")
    public static class340 field4360 = new class340(7, 12);

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4361 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public static void method2012(int arg0) {
        field4358 = null;
        field4360 = null;
        field4361 = null;
        if (arg0 >= -38) {
            field4358 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)Z")
    public static final boolean method2013(int arg0) {
        field4356++;
        int var1 = 118 % ((arg0 + 28) / 48);
        return class520.field7691 == 0 ? class117.field1641.method2254(-72) : true;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(BI)I")
    public static final int method2014(byte arg0, int arg1) {
        field4359++;
        if (arg0 != -29) {
            method2014((byte) 19, 31);
        }
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method2015(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class169.field2206 = arg0;
        class286.field3658 = 0x1 << class169.field2206;
        class477.field6971 = class286.field3658 >> 1;
        class440.field6127 = (int) Math.sqrt((double) (class477.field6971 * class477.field6971 + class477.field6971 * class477.field6971));
        class152.field2043 = class286.field3658 >> 2;
        class419.field5571 = class286.field3658;
        class166.field2155 = arg2;
        class13.field230 = arg3;
        class18.field318 = arg4;
        class188.field2468 = new class510[arg1][class166.field2155][class13.field230];
        class405.field5436 = new class251[arg1];
        if (arg5) {
            class203.field2667 = new int[class166.field2155][class13.field230];
            class507.field7443 = new byte[class166.field2155][class13.field230];
            class187.field2443 = new byte[class166.field2155][class13.field230];
            class354.field4550 = new class510[1][class166.field2155][class13.field230];
            class283.field3620 = new class251[1];
        } else {
            class203.field2667 = null;
            class507.field7443 = null;
            class187.field2443 = null;
            class354.field4550 = null;
            class283.field3620 = null;
        }
        if (arg6) {
            class83.field1033 = new long[arg1][arg2][arg3];
            class121.field1683 = new class86[65535];
            class301.field3903 = new boolean[65535];
            class278.field3564 = 0;
        } else {
            class83.field1033 = null;
            class121.field1683 = null;
            class301.field3903 = null;
            class278.field3564 = 0;
        }
        class105.method699(false);
        class301.field3904 = new class504[1000];
        class292.field3750 = 0;
        class193.field2499 = new class504[1000];
        class118.field1648 = 0;
        class180.field2347 = new int[arg1][class166.field2155 + 1][class13.field230 + 1];
        class179.field2305 = new class448[5000];
        class171.field2218 = 0;
        class357.field4598 = new boolean[class18.field318 + class18.field318 + 1][class18.field318 + class18.field318 + 1];
        class465.field6840 = new boolean[class18.field318 + class18.field318 + 2][class18.field318 + class18.field318 + 2];
        class522.field7748 = null;
    }
}
