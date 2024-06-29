import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class401 extends class362 implements Runnable {

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public int field5820 = -1;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "Z")
    private boolean field5833 = true;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "Lwi;")
    private class272 field5822;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "[I")
    public static int[] field5824 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "[I")
    public static int[] field5830 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "Ljava/lang/String;")
    public static String field5835 = "white:";

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "Lkh;")
    public static class11 field5821;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "[[[B")
    public static byte[][][] field5825;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 4)
    public static void method2537(int arg0) {
        field5830 = null;
        field5824 = null;
        field5821 = null;
        field5825 = null;
        if (arg0 <= -1) {
            field5835 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V", line = 18)
    public static final void method2538(int arg0, int arg1) {
        class139.field1980 = new int[class164.field2287];
        field5825 = new byte[arg1][class279.field3935][class164.field2287];
        class275.field3883 = new byte[arg1][class279.field3935 + arg0][class164.field2287 + 1];
        class30.field278 = new int[arg1][class279.field3935 + 1][class164.field2287 + 1];
        class94.field1040 = new byte[arg1][class279.field3935][class164.field2287];
        class233.field3176 = 99;
        class134.field1881 = new int[class164.field2287];
        class330.field4716 = new byte[arg1][class279.field3935][class164.field2287];
        class247.field3360 = new int[class164.field2287];
        class422.field6055 = new int[class164.field2287];
        class369.field5417 = new int[5];
        field5834++;
        class299.field4266 = new byte[arg1][class279.field3935][class164.field2287];
        class115.field1341 = new int[class164.field2287];
        class228.field3115 = null;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lwi;)V", line = 142)
    public class401(class272 arg0) {
        this.field5822 = arg0;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)I", line = 53)
    public static final int method2539(boolean arg0, int arg1) {
        field5829++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        if (!arg0) {
            field5832 = -78;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!fb", name = "run", descriptor = "()V", line = 111)
    public final void run() {
        while (this.field5833) {
            this.field5822.method1728((byte) -20, this);
        }
        field5826++;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V", line = 127)
    public final void method2540(byte arg0) {
        int var2 = -121 / ((20 - arg0) / 62);
        field5823++;
        (new Thread(this, "a")).start();
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V", line = 153)
    public final void method2541(boolean arg0) {
        if (!arg0) {
            this.field5833 = true;
        }
        this.field5833 = false;
        field5831++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BIII)I", line = 164)
    public static final int method2542(byte arg0, int arg1, int arg2, int arg3) {
        field5827++;
        if (arg0 != 85) {
            field5832 = 105;
        }
        if ((class166.field2327[arg2][arg3][arg1] & 0x8) == 0) {
            return arg2 <= 0 || (class166.field2327[1][arg3][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 183)
    public static final void method2543(String arg0, int arg1) {
        field5828++;
        if (arg0 == null) {
            return;
        }
        String var2 = class407.method2567(arg0, -13);
        if (arg1 != 1) {
            method2542((byte) 23, 94, -78, -107);
        }
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class166.field2326; var3++) {
            String var4 = class407.method2567(class100.field1129[var3], -13);
            if (var4 != null && var4.equals(var2)) {
                class166.field2326--;
                for (int var5 = var3; var5 < class166.field2326; var5++) {
                    class100.field1129[var5] = class100.field1129[var5 + 1];
                    class19.field199[var5] = class19.field199[var5 + 1];
                    class301.field4298[var5] = class301.field4298[var5 + 1];
                    class176.field2445[var5] = class176.field2445[var5 + 1];
                    class2.field21[var5] = class2.field21[var5 + 1];
                }
                class367.field5362 = class418.field6013;
                class6.field65++;
                class169.field2360.method809(201, arg1 - 28023);
                class169.field2360.method1396(21375, class233.method1488(-19285, arg0));
                class169.field2360.method1359((byte) 0, arg0);
                return;
            }
        }
    }
}
