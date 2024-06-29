import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class11 extends InputStream {

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field131 = 0;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field129 = -1;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Z")
    public static boolean field128;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZB)V")
    public static final void method85(boolean arg0, byte arg1) {
        if (arg1 != -18) {
            return;
        }
        field134++;
        for (class301 var2 = (class301) class17.field178.method8(-81); var2 != null; var2 = (class301) class17.field178.method12((byte) 69)) {
            if (var2.field4854 != null) {
                class241.field3543.method1248(var2.field4854);
                var2.field4854 = null;
            }
            if (var2.field4852 != null) {
                class241.field3543.method1248(var2.field4852);
                var2.field4852 = null;
            }
            var2.method1781(5250);
        }
        if (!arg0) {
            return;
        }
        for (class301 var3 = (class301) class219.field3193.method8(-79); var3 != null; var3 = (class301) class219.field3193.method12((byte) 69)) {
            if (var3.field4854 != null) {
                class241.field3543.method1248(var3.field4854);
                var3.field4854 = null;
            }
            var3.method1781(arg1 + 5268);
        }
        for (class301 var4 = (class301) class21.field233.method1071(-126); var4 != null; var4 = (class301) class21.field233.method1069(-123)) {
            if (var4.field4854 != null) {
                class241.field3543.method1248(var4.field4854);
                var4.field4854 = null;
            }
            var4.method1781(5250);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static final void method86(int arg0) {
        field127++;
        if (arg0 != 1) {
            field131 = -42;
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class147.field2360 - 1); var2++) {
                if (class204.field3009[var2] < 1000 && class204.field3009[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class221.field3219[var2];
                    class221.field3219[var2] = class221.field3219[var2 + 1];
                    class221.field3219[var2 + 1] = var3;
                    String var4 = class121.field1988[var2];
                    class121.field1988[var2] = class121.field1988[var2 + 1];
                    class121.field1988[var2 + 1] = var4;
                    int var5 = class141.field2277[var2];
                    class141.field2277[var2] = class141.field2277[var2 + 1];
                    class141.field2277[var2 + 1] = var5;
                    int var6 = class131.field2173[var2];
                    class131.field2173[var2] = class131.field2173[var2 + 1];
                    class131.field2173[var2 + 1] = var6;
                    int var7 = class149.field2385[var2];
                    class149.field2385[var2] = class149.field2385[var2 + 1];
                    class149.field2385[var2 + 1] = var7;
                    short var8 = class204.field3009[var2];
                    class204.field3009[var2] = class204.field3009[var2 + 1];
                    class204.field3009[var2 + 1] = var8;
                    long var9 = class303.field4910[var2];
                    class303.field4910[var2] = class303.field4910[var2 + 1];
                    class303.field4910[var2 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public static final void method87(int arg0) {
        field133++;
        int var1 = class71.field1125;
        int var2 = class171.field2587;
        int var3 = class137.field2226;
        int var4 = class253.field3817;
        int var5 = 6116423;
        class130.method996(var1, var2, var4, var3, var5);
        class130.method996(var1 + 1, var2 + 1, var4 - 2, 16, 0);
        class130.method1006(var1 + 1, var2 + 18, var4 - 2, var3 + -19, arg0);
        class208.field3084.method72(class143.field2310, var1 + 3, var2 + 14, var5, -1);
        int var6 = class204.field3017;
        int var7 = class44.field584;
        for (int var8 = 0; var8 < class147.field2360; var8++) {
            int var9 = (class147.field2360 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var6 > var1 && var1 + var4 > var6 && (var9 - 13) < var7 && (var9 + 3) > var7) {
                var10 = 16776960;
            }
            class208.field3084.method72(class207.method1462(var8, -1), var1 + 3, var9, var10, 0);
        }
        class191.method1359((byte) -88, class71.field1125, class171.field2587, class253.field3817, class137.field2226);
    }

    @OriginalMember(owner = "client!ub", name = "read", descriptor = "()I")
    public final int read() {
        field132++;
        class155.method1130(1, 30000L);
        return -1;
    }
}
