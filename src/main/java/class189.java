import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class189 extends class4 {

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "Z")
    public static boolean field2692 = false;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "Ljava/lang/String;")
    public static String field2698 = "Loading interfaces - ";

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "Lqf;")
    public static class359 field2702 = null;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
    public int field2697;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "Lvl;")
    public static class165 field2693;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "Lnm;")
    public class201 field2701;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "[B")
    public byte[] field2699;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "[S")
    public static short[] field2700;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lph;BLph;)V", line = 15)
    public static final void method1304(class361 arg0, byte arg1, class361 arg2) {
        class229.field3473 = class208.method1520(0, class304.field4561, true, arg0, arg2);
        field2696++;
        if (class141.field2031) {
            class22.field339 = class338.method2374(0, arg2, arg0, arg1 ^ 0x83E, class304.field4561);
        } else {
            class22.field339 = (class42) class229.field3473;
        }
        class99.field1425 = class208.method1520(0, class203.field2993, true, arg0, arg2);
        if (arg1 != -37) {
            method1306((byte) -67);
        }
        class126.field1846 = class208.method1520(0, class347.field5366, true, arg0, arg2);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLv;Lv;)V", line = 33)
    public static final void method1305(byte arg0, class77 arg1, class77 arg2) {
        if (arg0 != -100) {
            return;
        }
        field2690++;
        if (arg1.field1124 != null) {
            arg1.method627(0);
        }
        arg1.field1127 = arg2.field1127;
        arg1.field1124 = arg2;
        arg1.field1124.field1127 = arg1;
        arg1.field1127.field1124 = arg1;
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(B)V", line = 52)
    public static void method1306(byte arg0) {
        if (arg0 >= -95) {
            method1307((byte) -92);
        }
        field2702 = null;
        field2698 = null;
        field2700 = null;
        field2693 = null;
    }

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "(B)V", line = 66)
    public static final void method1307(byte arg0) {
        class264.field4043 = 0;
        class302.field4516 = 0;
        class20.field319 = -1;
        class15.field246 = false;
        class107.field1533.field2776 = 0;
        class358.field5481 = 0;
        class83.field1194.field2776 = 0;
        class360.field5688 = 0;
        class300.field4483 = -1;
        if (arg0 < 2) {
            field2693 = (class165) null;
        }
        class194.field2820 = -1;
        field2691++;
        class54.field788 = -1;
        class86.method697(-1);
        for (int var1 = 0; var1 < class343.field5312.length; var1++) {
            if (class343.field5312[var1] != null) {
                class343.field5312[var1].field5183 = -1;
            }
        }
        for (int var2 = 0; var2 < class300.field4495.length; var2++) {
            if (class300.field4495[var2] != null) {
                class300.field4495[var2].field5183 = -1;
            }
        }
        class97.method766(true);
        class86.field1208 = 1;
        class250.method1837(30, 40);
        for (int var3 = 0; var3 < 100; var3++) {
            class332.field5051[var3] = true;
        }
        class83.method681(-26552);
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)[B", line = 134)
    public final byte[] method27(int arg0) {
        field2695++;
        if (arg0 <= 106) {
            this.field2701 = (class201) null;
        }
        if (this.field118) {
            throw new RuntimeException();
        }
        return this.field2699;
    }

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)I", line = 159)
    public final int method29(int arg0) {
        field2694++;
        if (this.field118) {
            return 0;
        } else {
            int var2 = 104 % ((arg0 + 64) / 38);
            return 100;
        }
    }
}
