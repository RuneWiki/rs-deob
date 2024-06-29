import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class99 extends class232 {

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "I")
    private int field1783 = 0;

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "I")
    private int field1786 = 1;

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "I")
    private int field1782 = 0;

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "[Leb;")
    public static class275[] field1777 = new class275[32768];

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "Lhi;")
    public static class82 field1778 = class95.method664((byte) -55, ":assist:");

    @OriginalMember(owner = "client!ig", name = "bb", descriptor = "Lme;")
    public static class75 field1789 = null;

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "[I")
    public static int[] field1785 = new int[128];

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!ig", name = "Z", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!ig", name = "ab", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!ig", name = "cb", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!ig", name = "db", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "[Ljf;")
    public static class86[] field1779;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V", line = 5)
    public final void method144(int arg0) {
        if (arg0 < 48) {
            method680((byte) -82);
        }
        class20.method137(4096);
        field1781++;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)V", line = 20)
    public static void method680(byte arg0) {
        field1789 = null;
        field1785 = null;
        field1778 = null;
        if (arg0 >= 11) {
            field1779 = null;
            field1777 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILme;B)V", line = 40)
    public static final void method681(int arg0, int arg1, class75 arg2, byte arg3) {
        if (arg3 < 104) {
            return;
        }
        field1791++;
        if (class309.field5262 < 2 && class271.field4578 == 0 && !class256.field4406) {
            return;
        }
        class82 var4;
        if (class271.field4578 == 1 && class309.field5262 < 2) {
            var4 = class29.method182(-6039, new class82[] { class19.field238, class232.field4014, class321.field5537, class192.field3218 });
        } else if (class256.field4406 && class309.field5262 < 2) {
            var4 = class29.method182(-6039, new class82[] { class119.field2105, class232.field4014, class48.field800, class192.field3218 });
        } else if (class23.field317 && class19.field235[81] && class309.field5262 > 2) {
            var4 = class207.method1484(class309.field5262 - 2, (byte) -111);
        } else {
            var4 = class207.method1484(class309.field5262 - 1, (byte) -124);
        }
        if (class309.field5262 > 2) {
            var4 = class29.method182(-6039, new class82[] { var4, class21.field284, class327.method2240((byte) -74, class309.field5262 - 2), class294.field4929 });
        }
        if (arg2 == null) {
            int var6 = class253.field4354.method110(var4, arg0 + 4, arg1 + 15, 16777215, 0, class45.field773, class273.field4611);
            class143.method977(arg0 + 4, var6 + class253.field4354.method124(var4), 15, true, arg1);
            return;
        }
        class18 var5 = arg2.method476(class193.field3278, -1);
        if (var5 == null) {
            var5 = class253.field4354;
        }
        var5.method122(var4, arg0, arg1, arg2.field1216, arg2.field1205, arg2.field1288, arg2.field1229, arg2.field1203, arg2.field1236, class45.field773, class273.field4611, class257.field4415);
        class143.method977(class257.field4415[0], class257.field4415[2], class257.field4415[3], true, class257.field4415[1]);
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V", line = 222)
    public class99() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(IB)[I", line = 111)
    public final int[] method80(int arg0, byte arg1) {
        field1787++;
        int var3 = 112 / ((arg1 + 31) / 55);
        int[] var4 = this.field4008.method131((byte) -94, arg0);
        if (this.field4008.field256) {
            int var5 = class273.field4607[arg0];
            int var6 = var5 - 2048 >> 1;
            for (int var7 = 0; var7 < class54.field858; var7++) {
                int var8 = class24.field329[var7];
                int var9 = var8 - 2048 >> 1;
                int var10;
                if (this.field1783 == 0) {
                    var10 = (var8 - var5) * this.field1786;
                } else {
                    int var11 = var6 * var6 + var9 * var9 >> 12;
                    int var12 = (int) (Math.sqrt((double) ((float) var11 / 4096.0F)) * 4096.0D);
                    var10 = (int) ((double) (this.field1786 * var12) * 3.141592653589793D);
                }
                int var13 = var10 - (var10 & 0xFFFFF000);
                if (this.field1782 == 0) {
                    var13 = class51.field826[(var13 & 0xFF4) >> 4] + 4096 >> 1;
                } else if (this.field1782 == 2) {
                    var13 -= 2048;
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    var13 = 2048 - var13 << 1;
                }
                var4[var7] = var13;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(IB)Lom;", line = 178)
    public static final class157 method682(int arg0, byte arg1) {
        class157 var2 = (class157) class314.field5412.method2175((long) arg0, 3008);
        field1788++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class242.field4209.method1577(class284.method1976(arg0, (byte) 29), class64.method410(144, arg0), -29569);
        class157 var4 = new class157();
        var4.field2676 = arg0;
        if (var3 != null) {
            var4.method1124(17153, new class153(var3));
        }
        if (arg1 > -76) {
            method680((byte) -87);
        }
        var4.method1123((byte) 53);
        if (var4.field2697) {
            var4.field2664 = false;
            var4.field2670 = 0;
        }
        if (!class282.field4745 && var4.field2708) {
            var4.field2722 = null;
        }
        class314.field5412.method2169(var4, (long) arg0, (byte) 94);
        return var4;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBLbc;)V", line = 240)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        field1784++;
        if (arg0 == 0) {
            this.field1783 = arg2.method1082(-116);
        } else if (arg0 == 1) {
            this.field1782 = arg2.method1082(-76);
        } else if (arg0 == 3) {
            this.field1786 = arg2.method1082(-96);
        }
        if (arg1 != -19) {
            method681(36, -15, (class75) null, (byte) -18);
        }
    }
}
