import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class200 extends class45 {

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public int field2658;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public int field2657;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Lvk;")
    public static class56 field2656 = new class56(64);

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "[[I")
    public static int[][] field2662 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field2661 = 0;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "Z")
    public static boolean field2663 = false;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "[I")
    public static int[] field2664 = new int[14];

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V", line = 3)
    public static void method1186(byte arg0) {
        field2662 = null;
        field2656 = null;
        if (arg0 != -120) {
            method1187(-71, -124, 27, (byte) -95, 10);
        }
        field2664 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIBI)V", line = 17)
    public static final void method1187(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class318.field4655 = arg1;
        class233.field3099 = arg4;
        if (arg3 >= -109) {
            method1188((String) null, 37, 62L, 32, -58, (String) null, -21, true, false, true, 108);
        }
        field2655++;
        class63.field848 = arg2;
        class120.field1680 = arg0;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(II)V", line = 39)
    public class200(int arg0, int arg1) {
        this.field2658 = arg0;
        this.field2657 = arg1;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;IJIILjava/lang/String;IZZZI)V", line = 50)
    public static final void method1188(String arg0, int arg1, long arg2, int arg3, int arg4, String arg5, int arg6, boolean arg7, boolean arg8, boolean arg9, int arg10) {
        field2659++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class228 var14 = new class228(128);
        var14.method1346(10, 32767);
        var14.method1326((arg7 ? 1 : 0) | (arg9 ? 2 : 0) | (arg8 ? 4 : 0), -55);
        var14.method1372(arg2, 1883835216);
        var14.method1330(var12[0], 109);
        var14.method1380(65280, arg0);
        var14.method1330(var12[1], -123);
        var14.method1326(class223.field2944, 124);
        var14.method1346(arg3, 32767);
        var14.method1346(arg10, 32767);
        var14.method1330(var12[2], 90);
        var14.method1326(arg6, 28);
        var14.method1326(arg1, -63);
        var14.method1330(var12[3], -100);
        var14.method1331(class194.field2602, class5.field62, true);
        class228 var15 = new class228(350);
        var15.method1380(65280, arg5);
        int var16 = 8 - (class125.method795(65, arg5) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1346((int) (Math.random() * 255.0D), 32767);
        }
        int var18 = 88 % ((arg4 + 64) / 52);
        var15.method1350(15305, var12);
        class185.field2507.field3029 = 0;
        class185.field2507.method1346(22, 32767);
        class185.field2507.method1326(var14.field3029 + var15.field3029 + 2, -123);
        class185.field2507.method1326(561, 72);
        class185.field2507.method1357(0, -1, var14.field3029, var14.field3040);
        class185.field2507.method1357(0, -1, var15.field3029, var15.field3040);
        class275.field3989 = 0;
        class163.field2190 = 1;
        class214.field2856 = -3;
        class47.field661 = 0;
    }
}
