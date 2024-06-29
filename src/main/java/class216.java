import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class216 {

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Luf;")
    private class380 field2834 = new class380(64);

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Lga;")
    private class332 field2837;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "Lga;")
    private class332 field2841;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "F")
    public static float field2836;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 5)
    public static final String method1371(long arg0, byte arg1) {
        field2839++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = -83 / ((-arg1 - 37) / 35);
            int var4 = 0;
            for (long var5 = arg0; var5 != 0L; var5 /= 37L) {
                var4++;
            }
            StringBuffer var7 = new StringBuffer(var4);
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                char var10 = class257.field3367[(int) (var8 - (arg0 * 37L))];
                if (var10 == '_') {
                    int var11 = var7.length() - 1;
                    var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                    var10 = ' ';
                }
                var7.append(var10);
            }
            var7.reverse();
            var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
            return var7.toString();
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lgba;ZLjava/awt/Frame;)V", line = 57)
    public static final void method1372(class388 arg0, boolean arg1, Frame arg2) {
        field2835++;
        while (true) {
            class661 var3 = arg0.method2224(arg2, -65);
            while (var3.field9420 == 0) {
                class588.method3253(0, 10L);
            }
            if (var3.field9420 == 1) {
                arg2.setVisible(arg1);
                arg2.dispose();
                return;
            }
            class588.method3253(0, 100L);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)V", line = 80)
    public static final void method1373(byte arg0, int arg1) {
        class59.field746 = -1;
        if (arg0 != 123) {
            field2836 = 0.33363727F;
        }
        field2833++;
        class698.field9854 = arg1;
        class68.field827 = -1;
        class310.method1827((byte) -19);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Lco;", line = 104)
    public final class291 method1374(int arg0, int arg1) {
        field2840++;
        class291 var3 = (class291) this.field2834.method2176(-125, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field2837.method1938(arg0 & 0x7FFF, 0, -17);
        } else {
            var4 = this.field2841.method1938(arg0, 0, -17);
        }
        if (arg1 <= 30) {
            return null;
        }
        class291 var5 = new class291();
        if (var4 != null) {
            var5.method1723(new class157(var4), 111);
        }
        if (arg0 >= 32768) {
            var5.method1722((byte) -113);
        }
        this.field2834.method2174(var5, (long) arg0, (byte) -37);
        return var5;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lag;IIBII)Lck;", line = 138)
    public static final class8 method1375(class469 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field2838++;
        if (arg3 != -63) {
            field2836 = -2.122933F;
        }
        if (!arg0.field6462 && (!class355.method2093(arg1, arg3 ^ 0xFFFFFFC0) || !class355.method2093(arg4, 1))) {
            return arg0.field6459 ? new class8(arg0, 34037, arg5, arg2, arg1, arg4, true) : new class8(arg0, arg5, arg2, arg1, arg4, class385.method2206(0, arg1), class385.method2206(0, arg4), true);
        } else {
            return new class8(arg0, 3553, arg5, arg2, arg1, arg4, true);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BII)Z", line = 163)
    public static final boolean method1376(byte arg0, int arg1, int arg2) {
        if (arg0 != 81) {
            field2836 = 1.3576113F;
        }
        field2842++;
        return (arg1 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(ILga;Lga;)V", line = 183)
    public class216(int arg0, class332 arg1, class332 arg2) {
        this.field2837 = arg2;
        this.field2841 = arg1;
        if (this.field2841 != null) {
            this.field2841.method1939(0, 0);
        }
        if (this.field2837 != null) {
            this.field2837.method1939(0, 0);
        }
    }
}
