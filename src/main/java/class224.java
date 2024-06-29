import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class224 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Lqk;")
    public static class207 field4088 = class24.method212(255, ")4j");

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public int field4090;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public int field4091;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public int field4092;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method1582(int arg0) {
        field4088 = null;
        int var1 = -26 / ((-arg0 - 25) / 48);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lpk;Z)V")
    public static final void method1583(class99 arg0, boolean arg1) {
        field4093++;
        class247.field4484 = class177.method1270(arg0, class161.field2849, (byte) 63, 0);
        class188.field3323 = class174.method1250(class197.field3466, 0, arg0, -18546);
        class110.field1924 = class174.method1250(class82.field1488, 0, arg0, -18546);
        class134.field2319 = class174.method1250(class182.field3240, 0, arg0, -18546);
        class236.field4356 = class174.method1250(class167.field2944, 0, arg0, -18546);
        class67.field1191 = class174.method1250(class65.field1184, 0, arg0, -18546);
        class261.field4653 = class174.method1250(class132.field2295, 0, arg0, -18546);
        class74.field1361 = class284.method1928(class155.field2720, 0, (byte) -98, arg0);
        class124.field2170 = class280.method1900((byte) -17, class128.field2223, 0, arg0);
        class127.field2217 = class280.method1900((byte) -17, class36.field696, 0, arg0);
        client.field2680 = class165.method1194(class102.field1839, 15, arg0, 0);
        class249.field4512 = class165.method1194(class126.field2183, 15, arg0, 0);
        class167.field2940.method1610(class249.field4512, (int[]) null);
        class176.field3183.method1610(class249.field4512, (int[]) null);
        class284.field4996.method1610(class249.field4512, (int[]) null);
        class139 var2 = class20.method119(arg0, 0, (byte) -45, class70.field1242);
        var2.method956();
        class115.field1987 = var2;
        class139[] var3 = class177.method1270(arg0, class98.field1719, (byte) 66, 0);
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4].method956();
        }
        class83.field1530 = var3;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        if (!arg1) {
            field4088 = null;
        }
        int var8 = (int) (Math.random() * 41.0D) - 20;
        for (int var9 = 0; var9 < class247.field4484.length; var9++) {
            class247.field4484[var9].method967(var5 + var8, var6 + var8, var7 + var8);
        }
        class150.field2635 = class247.field4484;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
    public static final void method1584(int arg0, int arg1, int arg2) {
        class15.field243 = true;
        class105.field1860 = arg0;
        class180.field3234 = arg1;
        class262.field4661 = arg2;
        class33.field665 = -1;
        class27.field559 = -1;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)V")
    public static final void method1585(byte arg0, int arg1) {
        class256.field4580.method1383(-8052, arg1);
        if (arg0 > 107) {
            field4094++;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1586(int arg0, int arg1, byte arg2) {
        field4089++;
        if (arg2 > -45) {
            method1582(87);
        }
        class22 var3 = class33.method251(0, arg1);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method142(arg0, false);
    }
}
