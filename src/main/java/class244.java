import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class244 {

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public int field3448 = 0;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public int field3445 = 0;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public int field3452 = 2048;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public int field3454 = 2048;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3444 = null;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "J")
    public static long field3443 = -1L;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Lii;")
    public static class407 field3447 = null;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Lvg;")
    public static class108 field3451 = null;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Llr;")
    public static class105 field3441;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 16)
    public static final void method1588(boolean arg0, String arg1, int arg2) {
        field3446++;
        class337.field4557.field4299 = 1;
        String var3 = arg1.toLowerCase();
        if (arg2 > -95) {
            method1588(true, (String) null, 110);
        }
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class104.field1436; var6++) {
            class14 var9 = class367.method2308(false, var6);
            if ((!arg0 || var9.field157) && var9.field197 == -1 && var9.field198 == -1 && var9.field154 == 0 && var9.field191.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class149.field2172 = null;
                    class448.field6353 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class149.field2172 = var4;
        class448.field6353 = var5;
        class366.field5084 = 0;
        String[] var7 = new String[class448.field6353];
        for (int var8 = 0; var8 < class448.field6353; var8++) {
            var7[var8] = class367.method2308(false, var4[var8]).field191;
        }
        class204.method1393(var7, -1, class149.field2172);
        class337.field4557.method1912(-1);
        class337.field4557.field4299 = 2;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lrg;II)V", line = 96)
    public final void method1589(class366 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method2306((byte) 111);
            if (var4 == 0) {
                field3453++;
                if (arg1 <= 25) {
                    this.field3454 = 68;
                    return;
                }
                return;
            }
            this.method1593(-12, arg0, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)I", line = 116)
    public static final int method1590(int arg0) {
        field3450++;
        return arg0 == -28442 ? class268.field3672 : -121;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V", line = 127)
    public static void method1591(byte arg0) {
        field3451 = null;
        field3441 = null;
        if (arg0 != 59) {
            method1588(false, (String) null, -13);
        }
        field3444 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[B)[B", line = 141)
    public static final byte[] method1592(int arg0, byte[] arg1) {
        field3442++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class79.method643(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILrg;II)V", line = 163)
    private final void method1593(int arg0, class366 arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field3448 = arg1.method2306((byte) 43);
        } else if (arg3 == 2) {
            this.field3452 = arg1.method2297(13352);
        } else if (arg3 == 3) {
            this.field3454 = arg1.method2297(13352);
        } else if (arg3 == 4) {
            this.field3445 = arg1.method2257((byte) 110);
        }
        field3449++;
        if (arg0 > -4) {
            this.field3445 = 2;
        }
    }
}
