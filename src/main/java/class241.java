import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class241 {

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "Lff;")
    private class9 field3336 = new class9(256);

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "Lht;")
    private class410 field3341;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "Lm;")
    private class126 field3338;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "[I")
    public static int[] field3339 = new int[256];

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "Luf;")
    public static class310 field3342;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Lvh;")
    public static class240 field3334;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "Lsf;")
    public static class362 field3335;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3339[var0] = var1;
        }
        field3342 = new class310(48, 3);
        field3343 = 0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V", line = 9)
    public static void method1421(byte arg0) {
        if (arg0 == 94) {
            field3335 = null;
            field3342 = null;
            field3339 = null;
            field3334 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)Lqv;", line = 22)
    public final class308 method1422(int arg0, int arg1) {
        field3340++;
        Object var3 = this.field3336.method56((long) arg1, arg0 ^ 0x1AD1);
        if (var3 != null) {
            return (class308) var3;
        } else if (!this.field3338.method831(arg1, arg0 ^ 0xFFFFE513)) {
            return null;
        } else if (arg0 == 6797) {
            class501 var4 = this.field3338.method830(arg1, (byte) 71);
            int var5 = var4.field7380 ? 64 : this.field3341.field5854;
            class308 var7;
            if (var4.field7372 && this.field3341.method474()) {
                float[] var6 = this.field3338.method832(true, false, var5, 0.7F, var5, arg1);
                var7 = new class308(this.field3341, 3553, 34842, var5, var5, var4.field7376 != 0, var6, 6408);
            } else {
                int[] var8;
                short var9;
                if (var4.field7381 && class1.method3(var4.field7366, (byte) 127)) {
                    var8 = this.field3338.method833(false, var5, 0.7F, -12422, var5, arg1);
                    var9 = 6407;
                } else {
                    var9 = 6408;
                    var8 = this.field3338.method834(false, 0.7F, arg1, var5, -93, var5);
                }
                var7 = new class308(this.field3341, 3553, var9, var5, var5, var4.field7376 != 0, var8, false);
            }
            var7.method1751(var4.field7359, var4.field7364, (byte) 54);
            this.field3336.method73((long) arg1, var7, arg0 + 19628);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)I", line = 77)
    public static final int method1423(int arg0, int arg1) {
        if (arg1 < 115) {
            method1427(37, 33);
        }
        field3333++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V", line = 91)
    public final void method1424(byte arg0) {
        int var2 = 94 % ((arg0 - 52) / 52);
        this.field3336.method61((byte) -67, 5);
        field3332++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V", line = 102)
    public final void method1425(boolean arg0) {
        if (!arg0) {
            field3331++;
            this.field3336.method67(-96);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)V", line = 113)
    public static final void method1426(byte arg0, int arg1) {
        class9 var2 = class380.field5354;
        synchronized (class380.field5354) {
            class380.field5354.method61((byte) -67, arg1);
            int var3 = 0 / ((81 - arg0) / 39);
        }
        field3329++;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(II)V", line = 126)
    public static final void method1427(int arg0, int arg1) {
        if (arg0 != -257) {
            method1423(-3, 93);
        }
        class18.field188 = 1000 / arg1;
        field3337++;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lht;Lm;)V", line = 173)
    public class241(class410 arg0, class126 arg1) {
        this.field3341 = arg0;
        this.field3338 = arg1;
    }
}
