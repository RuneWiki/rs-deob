import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class30 {

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Lp;")
    public static class280 field565 = class18.method140((byte) -117, "blinken3:");

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "[Lp;")
    public static class280[] field571 = new class280[200];

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "Lsb;")
    public static class221 field566 = new class221(30);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field572 = 50;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field569;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "[[[Lsg;")
    public static class162[][][] field563;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)Lkj;")
    public static final class144 method262(int arg0, int arg1, int arg2, int arg3) {
        field568++;
        class144 var4 = new class144();
        var4.field2517 = arg0;
        var4.field2519 = arg1;
        class261.field4614.method148(-1, var4, (long) arg2);
        class53.method388((byte) -127, arg0);
        class113 var5 = class233.method1569(65535, arg2);
        if (var5 != null) {
            class242.method1642((byte) 100, var5);
        }
        if (class180.field3157 != null) {
            class242.method1642((byte) 32, class180.field3157);
            class180.field3157 = null;
        }
        int var6 = class157.field2745;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class49.method360(class275.field4765[var7], arg3 - 46)) {
                class189.method1316((byte) -105, var7);
            }
        }
        if (~class157.field2745 == arg3) {
            class31.field582 = false;
            class49.method365(class222.field3857, class59.field951, (byte) -65, class78.field1270, class246.field4322);
        } else {
            class49.method365(class222.field3857, class59.field951, (byte) -65, class78.field1270, class246.field4322);
            int var8 = class54.field890.method528(class99.field1619);
            for (int var9 = 0; var9 < class157.field2745; var9++) {
                int var10 = class54.field890.method528(class199.method1366(var9, arg3 ^ 0x1));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class246.field4322 = class157.field2745 * 15 + (class148.field2567 ? 26 : 22);
            class78.field1270 = var8 + 8;
        }
        if (var5 != null) {
            class231.method1559(false, var5, true);
        }
        class204.method1392((byte) -7, arg0);
        if (class246.field4315 != -1) {
            class18.method138(class246.field4315, (byte) -124, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static void method263(byte arg0) {
        field565 = null;
        if (arg0 == 107) {
            field571 = null;
            field563 = null;
            field566 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
    public static final void method264(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class31.field585; var5++) {
            if (arg2 < class91.field1478[var5] + class169.field2958[var5] && arg2 + arg3 > class169.field2958[var5] && arg0 < class232.field4052[var5] + class14.field278[var5] && class232.field4052[var5] < (arg0 + arg4)) {
                class120.field2130[var5] = true;
            }
        }
        if (arg1 >= -61) {
            field565 = null;
        }
        field564++;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
    public class30() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[BLlj;)V")
    public final void method265(int arg0, byte[] arg1, class25 arg2) {
        field570++;
        if (arg2.field475[arg2.field481] != 31 || arg2.field475[arg2.field481 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field569 == null) {
            this.field569 = new Inflater(true);
        }
        try {
            this.field569.setInput(arg2.field475, arg2.field481 + 10, -8 - arg2.field481 + arg0 + arg2.field475.length);
            this.field569.inflate(arg1);
        } catch (Exception var4) {
            this.field569.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field569.reset();
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(III)V")
    private class30(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Lp;B)Lp;")
    public static final class280 method266(class280[] arg0, byte arg1) {
        field567++;
        if (arg1 != -87) {
            field566 = null;
        }
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class97.method687(6827, arg0.length, arg0, 0);
    }
}
