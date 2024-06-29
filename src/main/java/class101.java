import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class101 {

    @OriginalMember(owner = "client!jha", name = "d", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field1238 = new Rectangle[100];

    @OriginalMember(owner = "client!jha", name = "k", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!jha", name = "c", descriptor = "I")
    public int field1237;

    @OriginalMember(owner = "client!jha", name = "f", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!jha", name = "g", descriptor = "I")
    public int field1241;

    @OriginalMember(owner = "client!jha", name = "h", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!jha", name = "i", descriptor = "Ldm;")
    public static class733 field1243;

    @OriginalMember(owner = "client!jha", name = "j", descriptor = "[I")
    public static int[] field1244;

    @OriginalMember(owner = "client!jha", name = "e", descriptor = "[Lada;")
    public class255[] field1239;

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(B)V")
    public static void method676(byte arg0) {
        field1238 = null;
        if (arg0 < 25) {
            field1244 = null;
        }
        field1243 = null;
        field1244 = null;
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(Ltn;Lqi;B)Lada;")
    private final class255 method677(class179 arg0, class669 arg1, byte arg2) {
        field1236++;
        if (class508.field7187 == arg1) {
            return class626.method3424((byte) -29, arg0);
        } else if (class125.field1495 == arg1) {
            return class282.method1695(arg0, 1);
        } else if (class516.field7273 == arg1) {
            return class742.method4161(-9, arg0);
        } else if (class335.field4308 == arg1) {
            return class108.method746(arg0, 23582);
        } else if (class63.field861 == arg1) {
            return class654.method3530((byte) 126, arg0);
        } else if (class306.field3931 == arg1) {
            return class349.method2047(-9492, arg0);
        } else if (class567.field7916 == arg1) {
            return class659.method3579(65, arg0);
        } else if (arg2 <= 17) {
            return null;
        } else if (class6.field66 == arg1) {
            return class41.method349(arg0, 4);
        } else if (class480.field6848 == arg1) {
            return class706.method3909((byte) 114, arg0);
        } else if (class540.field7604 == arg1) {
            return class388.method2320(21933, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(ZCLjava/lang/String;)I")
    public static final int method678(boolean arg0, char arg1, String arg2) {
        if (arg0) {
            method676((byte) 94);
        }
        field1240++;
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2.charAt(var5) == arg1) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(III)V")
    public static final void method679(int arg0, int arg1, int arg2) {
        field1242++;
        if (arg1 != 0) {
            method676((byte) -124);
        }
        if (class304.field3909 != arg0) {
            class225.field2973 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class225.field2973[var3] = (var3 << 12) / arg0;
            }
            class348.field4510 = arg0 * 32;
            class404.field5700 = arg0 - 1;
            class304.field3909 = arg0;
        }
        if (class424.field6042 == arg2) {
            return;
        }
        if (class304.field3909 == arg2) {
            class310.field3960 = class225.field2973;
        } else {
            class310.field3960 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class310.field3960[var4] = (var4 << 12) / arg2;
            }
        }
        class424.field6042 = arg2;
        class33.field516 = arg2 - 1;
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(ILtn;)V")
    public final void method680(int arg0, class179 arg1) {
        this.field1237 = arg1.method1114(122);
        if (arg0 != 16843) {
            return;
        }
        field1235++;
        this.field1241 = arg1.method1107(false);
        this.field1239 = new class255[arg1.method1094(255)];
        class669[] var3 = class199.method1244(0);
        for (int var4 = 0; var4 < this.field1239.length; var4++) {
            this.field1239[var4] = this.method677(arg1, var3[arg1.method1094(255)], (byte) 109);
        }
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field1238[var0] = new Rectangle();
        }
        field1245 = 0;
    }
}
