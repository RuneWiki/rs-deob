import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class20 {

    @OriginalMember(owner = "client!i", name = "l", descriptor = "[I")
    private int[] field342;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Lma;")
    public static class5 field331 = class12.method119("not yet implemented", (byte) 120);

    @OriginalMember(owner = "client!i", name = "d", descriptor = "Lma;")
    public static class5 field334 = class12.method119("Standort", (byte) 97);

    @OriginalMember(owner = "client!i", name = "e", descriptor = "Lma;")
    private static class5 field335 = class12.method119("red:", (byte) 75);

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Lma;")
    public static class5 field337 = field335;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Lma;")
    public static class5 field339 = field335;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Lwj;")
    public static class153 field341 = new class153(64);

    @OriginalMember(owner = "client!i", name = "n", descriptor = "[Lma;")
    public static class5[] field344 = new class5[500];

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field345 = -1;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "[Lpk;")
    public static class74[] field343;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)I", line = 5)
    public static final int method161(int arg0, int arg1, int arg2, int arg3) {
        field340++;
        int var4 = arg0 >> 7;
        int var5 = arg1 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg3;
        int var7 = arg0 & 0x7F;
        int var8 = arg1 & 0x7F;
        if (arg3 < 3 && (class18.field321[1][var5][var4] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var9 = (128 - var8) * class208.field3304[var6][var5][var4 + 1] + class208.field3304[var6][arg2 + var5][var4 + 1] * var8 >> 7;
        int var10 = (128 - var8) * class208.field3304[var6][var5][var4] + class208.field3304[var6][var5 + 1][var4] * var8 >> 7;
        return (128 - var7) * var10 + (var7 * var9) >> 7;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V", line = 59)
    public static final void method162(int arg0, int arg1) {
        class101.field1509.method517(false, arg1);
        if (arg0 <= -98) {
            field338++;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V", line = 74)
    public static final void method163(byte arg0) {
        if (arg0 != 29) {
            field339 = (class5) null;
        }
        Object var1 = class274.field4672;
        synchronized (class274.field4672) {
            if (class288.field4864 != 0) {
                class288.field4864 = 1;
                try {
                    class274.field4672.wait();
                } catch (InterruptedException var4) {
                }
            }
        }
        field332++;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(B)V", line = 97)
    public static void method164(byte arg0) {
        field339 = null;
        field344 = null;
        if (arg0 != -47) {
            return;
        }
        field337 = null;
        field343 = null;
        field331 = null;
        field341 = null;
        field335 = null;
        field334 = null;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)I", line = 121)
    public final int method165(int arg0, int arg1) {
        int var3 = (this.field342.length >> 1) - 1;
        int var4 = arg0 & var3;
        field336++;
        if (arg1 <= 84) {
            return 83;
        }
        while (true) {
            int var5 = this.field342[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field342[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "([I)V", line = 159)
    public class20(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field342 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field342[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field342[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field342[var5 + var5] = arg0[var4];
            this.field342[var5 + var5 + 1] = var4++;
        }
    }
}
