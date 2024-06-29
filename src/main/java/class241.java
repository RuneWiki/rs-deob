import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class241 {

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field4102 = 0;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field4106 = -1;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "[[[I")
    public static int[][][] field4105 = new int[2][][];

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1613(int arg0) {
        field4103++;
        class305.field5252.method2076(arg0 ^ 0x7D1E);
        class9.field139.method2076(arg0 - 31981);
        if (arg0 != 32105) {
            method1613(55);
        }
        class201.field3662.method2076(126);
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V", line = 21)
    public static void method1614(int arg0) {
        if (arg0 == 104) {
            field4105 = (int[][][]) null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 34)
    public static final void method1615(byte arg0) {
        if (class196.field3586 != null) {
            class196.field3586.method1627(127);
            class196.field3586 = null;
        }
        class106.method752((byte) -128);
        field4104++;
        class205.method1457();
        for (int var1 = 0; var1 < 4; var1++) {
            class124.field2201[var1].method269(0);
        }
        class148.method1082(false, arg0 ^ 0xFFFFFF8D);
        System.gc();
        class267.method1855(2, arg0 + 24);
        class250.field4248 = -1;
        class250.field4242 = false;
        class157.method1169((byte) 49, true);
        class10.field147 = 0;
        class295.field5125 = 0;
        class134.field2336 = 0;
        class51.field937 = 0;
        class153.field2744 = false;
        if (arg0 != -24) {
            return;
        }
        for (int var2 = 0; var2 < class38.field690.length; var2++) {
            class38.field690[var2] = null;
        }
        class67.field1206 = 0;
        class311.field5357 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class300.field5172[var3] = null;
            class213.field3812[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class187.field3281[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class230.field3934[var5][var6][var7] = null;
                }
            }
        }
        class135.method964(-926);
        class168.field2991 = 0;
        class107.method755((byte) -126);
        class104.method742(true, -15214);
    }
}
