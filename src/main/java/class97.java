import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class97 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field2342 = 0;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Lu;")
    public static class135 field2344 = class87.method676((byte) -61, "::errortest");

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field2346 = 10;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "Lu;")
    public static class135 field2345 = class87.method676((byte) -114, "Stufe)2");

    @OriginalMember(owner = "client!o", name = "k", descriptor = "Lu;")
    private static class135 field2352 = class87.method676((byte) -84, "Please contact customer support)3");

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Lu;")
    public static class135 field2350 = field2352;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "Lu;")
    private static class135 field2356 = class87.method676((byte) -74, " is already on your friend list");

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field2355 = 0;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "[[B")
    public static byte[][] field2359 = new byte[50][];

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Lu;")
    public static class135 field2348 = field2356;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "[I")
    public static int[] field2358 = new int[2048];

    @OriginalMember(owner = "client!o", name = "p", descriptor = "Lu;")
    public static class135 field2357 = class87.method676((byte) -74, "@gr3@");

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Lu;")
    public static class135 field2351 = class87.method676((byte) -85, "backvmid2");

    @OriginalMember(owner = "client!o", name = "s", descriptor = "Lu;")
    public static class135 field2360 = class87.method676((byte) -48, "@whi@ )4 ");

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field2362 = 0;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "Lu;")
    public static class135 field2361 = class87.method676((byte) -49, "Wen m-Ochten Sie hinzuf-Ugen?");

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Lg;")
    public static class43 field2353;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "[[[B")
    public static byte[][][] field2354;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Z")
    public static final boolean method796(int arg0, int arg1) {
        if (arg0 != 21) {
            method797(-44, (byte) -45);
        }
        field2349++;
        return (arg1 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)Lwe;")
    public static final class152 method797(int arg0, byte arg1) {
        class152 var2 = (class152) class19.field437.method239(9325, (long) arg0);
        field2343++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class62.field1557.method324(0, 0, arg0);
        if (var3 == null) {
            return null;
        }
        class152 var4 = new class152();
        class59 var5 = new class59(var3);
        var5.field1485 = var5.field1495.length - 12;
        int var6 = 0;
        int var7 = var5.method498((byte) 125);
        var4.field3741 = var5.method483((byte) 24);
        var4.field3737 = var5.method483((byte) 24);
        var4.field3749 = var5.method483((byte) 24);
        var4.field3745 = var5.method483((byte) 24);
        if (arg1 < 101) {
            field2361 = null;
        }
        var5.field1485 = 0;
        var4.field3744 = new int[var7];
        var4.field3750 = new class135[var7];
        var4.field3738 = new int[var7];
        while (var5.field1495.length - 12 > var5.field1485) {
            int var8 = var5.method483((byte) 24);
            if (var8 == 3) {
                var4.field3750[var6] = var5.method496(-115);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field3744[var6] = var5.method480(0);
            } else {
                var4.field3744[var6] = var5.method498((byte) -79);
            }
            var4.field3738[var6++] = var8;
        }
        class19.field437.method241(var4, 0, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lg;IZI)[Lae;")
    public static final class6[] method798(class43 arg0, int arg1, boolean arg2, int arg3) {
        field2347++;
        if (!arg2) {
            field2344 = null;
        }
        return class79.method626((byte) -74, arg0, arg3, arg1) ? class30.method242(0) : null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method799(int arg0) {
        field2357 = null;
        field2352 = null;
        field2348 = null;
        field2354 = null;
        field2361 = null;
        field2360 = null;
        field2351 = null;
        field2358 = null;
        field2344 = null;
        field2359 = null;
        if (arg0 != -4) {
            field2355 = -116;
        }
        field2350 = null;
        field2345 = null;
        field2356 = null;
        field2353 = null;
    }
}
