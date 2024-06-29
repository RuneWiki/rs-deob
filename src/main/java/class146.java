import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public abstract class class146 {

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2116 = "rating: ";

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field2119 = 0;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field2124 = 0;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "Lpk;")
    public static class237 field2121;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "[Lji;")
    public static class256[] field2115;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[B")
    public abstract byte[] method496(int arg0, int arg1);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
    public static void method998(boolean arg0) {
        field2121 = null;
        field2115 = null;
        if (arg0) {
            field2116 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ)I")
    public abstract int method495(int arg0, boolean arg1);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZIZLjava/lang/String;Ljava/lang/String;IZIIJI)V")
    public static final void method999(boolean arg0, int arg1, boolean arg2, String arg3, String arg4, int arg5, boolean arg6, int arg7, int arg8, long arg9, int arg10) {
        field2122++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class54 var14 = new class54(128);
        var14.method437(true, 10);
        var14.method428((arg0 ? 2 : 0) | (arg6 ? 1 : 0) | (arg2 ? 4 : 0), (byte) 46);
        var14.method440(arg9, -117);
        var14.method453((byte) 125, var12[0]);
        var14.method396(arg4, false);
        if (arg5 != -9233) {
            method999(false, 97, true, (String) null, (String) null, 25, true, 122, -91, 36L, -92);
        }
        var14.method453((byte) 118, var12[1]);
        var14.method428(class246.field3826, (byte) 46);
        var14.method437(true, arg10);
        var14.method437(true, arg1);
        var14.method453((byte) 118, var12[2]);
        var14.method428(arg8, (byte) 46);
        var14.method428(arg7, (byte) 46);
        var14.method453((byte) 100, var12[3]);
        var14.method415(77, class16.field292, class191.field2894);
        class54 var15 = new class54(350);
        var15.method396(arg3, false);
        int var16 = 8 - class69.method550(arg3, arg5 ^ 0xFFFF91C5) % 8;
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method437(true, (int) (Math.random() * 255.0D));
        }
        var15.method419((byte) -11, var12);
        class59.field964.field887 = 0;
        class59.field964.method437(true, 22);
        class59.field964.method428(var14.field887 + var15.field887 + 2, (byte) 46);
        class59.field964.method428(540, (byte) 46);
        class59.field964.method433(0, var14.field887, arg5 + 9112, var14.field848);
        class59.field964.method433(0, var15.field887, arg5 + 9116, var15.field848);
        class264.field4134 = 0;
        class164.field2398 = -3;
        class92.field1388 = 0;
        class256.field3944 = 1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Lch;")
    public abstract class97 method494(byte arg0);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lpk;B)V")
    public static final void method1000(class237 arg0, byte arg1) {
        if (arg1 != 4) {
            method1000((class237) null, (byte) -33);
        }
        class280.field4305 = arg0;
        field2120++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)V")
    public abstract void method505(int arg0, byte arg1);
}
