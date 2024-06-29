import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class265 {

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "J")
    public long field4720 = 0L;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "Leb;")
    public static class230 field4705 = class68.method589(0, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public static int field4717 = 0;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Leb;")
    public static class230 field4709 = class68.method589(0, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "Lka;")
    public static class245 field4706 = null;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "[S")
    public static short[] field4713 = new short[256];

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Leb;")
    public static class230 field4702 = class68.method589(0, ":assist:");

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "[I")
    public static int[] field4721 = new int[32];

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public int field4703;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public int field4704;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public int field4707;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public int field4710;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public int field4714;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public int field4715;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public int field4716;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Lkk;")
    public static class223 field4708;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "Lhj;")
    public class70 field4718;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "Lhj;")
    public class70 field4719;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "[Leh;")
    public static class80[] field4712;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)Ls;")
    public static final class228 method1834(byte arg0, int arg1) {
        field4701++;
        class228 var2 = (class228) class71.field1304.method273((long) arg1, 255);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class271.field4782.method1546(0, (byte) -100, arg1);
        if (var3 == null) {
            return null;
        }
        class228 var4 = new class228();
        class14 var5 = new class14(var3);
        var5.field318 = var5.field269.length - 2;
        int var6 = var5.method161(4);
        int var7 = var5.field269.length - var6 - 14;
        var5.field318 = var7;
        int var8 = var5.method187((byte) 61);
        var4.field3931 = var5.method161(4);
        var4.field3936 = var5.method161(4);
        var4.field3932 = var5.method161(4);
        var4.field3937 = var5.method161(4);
        int var9 = var5.method200(255);
        if (var9 > 0) {
            var4.field3928 = new class46[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method161(4);
                class46 var12 = new class46(class52.method415(-13538, var11));
                var4.field3928[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method187((byte) 61);
                    int var14 = var5.method187((byte) 61);
                    var12.method388(-1, (long) var13, new class244(var14));
                }
            }
        }
        var5.field318 = 0;
        if (arg0 >= -78) {
            field4702 = null;
        }
        var4.field3927 = var5.method166(5948);
        var4.field3925 = new class230[var8];
        var4.field3930 = new int[var8];
        var4.field3926 = new int[var8];
        int var15 = 0;
        while (var5.field318 < var7) {
            int var16 = var5.method161(4);
            if (var16 == 3) {
                var4.field3925[var15] = var5.method171((byte) 79);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field3930[var15] = var5.method200(255);
            } else {
                var4.field3930[var15] = var5.method187((byte) 61);
            }
            var4.field3926[var15++] = var16;
        }
        class71.field1304.method276(var4, (long) arg1, -79);
        return var4;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZLni;Z)V")
    public static final void method1835(boolean arg0, class150 arg1, boolean arg2) {
        int var3 = arg1.field2681;
        field4711++;
        int var4 = (int) arg1.field1166;
        if (arg0) {
            return;
        }
        arg1.method518(90);
        if (arg2) {
            class115.method915(true, var3);
        }
        class71.method610((byte) 122, var3);
        class245 var5 = class155.method1183(var4, 17);
        if (var5 != null) {
            class92.method777((byte) -65, var5);
        }
        int var6 = class186.field3266;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class212.method1474(-126, class225.field3890[var7])) {
                class89.method734(var7, false);
            }
        }
        if (class186.field3266 == 1) {
            class243.field4188 = false;
            class14.method149(class218.field3759, class30.field555, class275.field4826, -14160, class53.field920);
        } else {
            class14.method149(class218.field3759, class30.field555, class275.field4826, -14160, class53.field920);
            int var8 = class76.field1382.method783(class155.field2756);
            for (int var9 = 0; var9 < class186.field3266; var9++) {
                int var10 = class76.field1382.method783(class158.method1201(arg0, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class218.field3759 = class186.field3266 * 15 + 22;
            class53.field920 = var8 + 8;
        }
        if (class263.field4679 != -1) {
            class37.method339(class263.field4679, 1, 3);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public static void method1836(byte arg0) {
        field4712 = null;
        field4713 = null;
        field4705 = null;
        field4708 = null;
        if (arg0 == -99) {
            field4706 = null;
            field4709 = null;
            field4721 = null;
            field4702 = null;
        }
    }
}
