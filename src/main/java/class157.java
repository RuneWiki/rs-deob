import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public abstract class class157 {

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "[I")
    public static int[] field2349 = new int[2000];

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field2348 = 0;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "[I")
    public static int[] field2351 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field2357 = 0;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "[I")
    public static int[] field2356 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public int field2350;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public int field2354;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public int field2358;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public int field2360;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public int field2361;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public int field2362;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "Lba;")
    public static class161 field2355;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 34)
    public static final void method1118(int arg0) {
        field2359++;
        for (int var1 = arg0; var1 < class230.field3476; var1++) {
            int var2 = class278.field4234[var1];
            class195 var3 = class241.field3592[var2];
            int var4 = class207.field3137.method1787(false);
            if ((var4 & 0x4) != 0) {
                var4 += class207.field3137.method1787(false) << 8;
            }
            class176.method1219(-111, var2, var3, var4);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLt;)V", line = 60)
    public static final void method1119(byte arg0, class293 arg1) {
        field2352++;
        if (arg0 != -110) {
            method1120((byte) 35, (class195) null, -44, -111);
        }
        class296.field4529 = arg1;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLqg;II)V", line = 79)
    public static final void method1120(byte arg0, class195 arg1, int arg2, int arg3) {
        if (arg1.field1549 == arg2 && arg2 != -1) {
            class272 var4 = class72.method468(arg2, 32);
            int var5 = var4.field4177;
            if (var5 == 1) {
                arg1.field1519 = 0;
                arg1.field1487 = 0;
                arg1.field1496 = 1;
                arg1.field1486 = 0;
                arg1.field1538 = arg3;
                class167.method1170(arg1.field1505, var4, arg1.field1486, -64, arg1.field1566, class114.field1750 == arg1);
            }
            if (var5 == 2) {
                arg1.field1519 = 0;
            }
        } else if (arg2 == -1 || arg1.field1549 == -1 || class72.method468(arg2, 77).field4158 >= class72.method468(arg1.field1549, -128).field4158) {
            arg1.field1487 = 0;
            arg1.field1486 = 0;
            arg1.field1519 = 0;
            arg1.field1496 = 1;
            arg1.field1549 = arg2;
            arg1.field1569 = arg1.field1483;
            arg1.field1538 = arg3;
            if (arg1.field1549 != -1) {
                class167.method1170(arg1.field1505, class72.method468(arg1.field1549, 17), arg1.field1486, -64, arg1.field1566, class114.field1750 == arg1);
            }
        }
        field2353++;
        int var6 = 103 / ((-arg0 - 42) / 36);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 131)
    public static void method1121(byte arg0) {
        field2355 = null;
        if (arg0 >= -101) {
            field2348 = -115;
        }
        field2349 = null;
        field2356 = null;
        field2351 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V")
    public abstract void method396(int arg0, int arg1);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V")
    public abstract void method397(int arg0, int arg1, int arg2);
}
