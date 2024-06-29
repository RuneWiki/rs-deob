import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class349 extends class334 {

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "[I")
    public static int[] field5406 = new int[13];

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "[I")
    public static int[] field5410 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public static int field5405 = -1;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public static int field5412 = 0;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    public static int field5414 = 0;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "Lru;")
    private class177 field5407;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BII)I")
    public final int method2301(byte arg0, int arg1, int arg2) {
        field5404++;
        if (this.field5407 == null) {
            return arg2;
        }
        class330 var4 = (class330) this.field5407.method1122((byte) 59, (long) arg1);
        if (arg0 != 55) {
            method2304(-18, null, -107);
        }
        return var4 == null ? arg2 : var4.field5185;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lhw;Z)V")
    public final void method2302(class208 arg0, boolean arg1) {
        if (arg1) {
            this.field5407 = null;
        }
        field5411++;
        while (true) {
            int var3 = arg0.method1445(-79);
            if (var3 == 0) {
                return;
            }
            this.method2303(arg0, 32, var3);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lhw;II)V")
    private final void method2303(class208 arg0, int arg1, int arg2) {
        if (arg2 == 249) {
            int var4 = arg0.method1445(115);
            if (this.field5407 == null) {
                int var5 = class123.method774(arg1 ^ 0xFFFFFFAC, var4);
                this.field5407 = new class177(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1445(arg1 + 9) == 1;
                int var8 = arg0.method1452(arg1 - 29);
                class529 var9;
                if (var7) {
                    var9 = new class446(arg0.method1448(65535));
                } else {
                    var9 = new class330(arg0.method1436((byte) 105));
                }
                this.field5407.method1127(var9, (byte) 71, (long) var8);
            }
        }
        if (arg1 != 32) {
            field5410 = null;
        }
        field5409++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/String;I)I")
    public static final int method2304(int arg0, String arg1, int arg2) {
        field5413++;
        return arg2 == 0 ? class487.method2989(arg0, -13547, arg1, true) : 15;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
    public final String method2305(int arg0, String arg1, int arg2) {
        field5408++;
        if (arg0 != 25085) {
            field5405 = -12;
        }
        if (this.field5407 == null) {
            return arg1;
        } else {
            class446 var4 = (class446) this.field5407.method1122((byte) 59, (long) arg2);
            return var4 == null ? arg1 : var4.field6916;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public static void method2306(byte arg0) {
        field5406 = null;
        if (arg0 == 70) {
            field5410 = null;
        }
    }
}
