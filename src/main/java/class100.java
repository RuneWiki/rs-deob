import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class100 {

    @OriginalMember(owner = "client!as", name = "f", descriptor = "Lrp;")
    private class288 field1808 = new class288(64);

    @OriginalMember(owner = "client!as", name = "d", descriptor = "Llt;")
    private class458 field1806;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "Lsk;")
    public static class423 field1809 = new class423("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!as", name = "i", descriptor = "Z")
    public static boolean field1811 = false;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "Z")
    public static boolean field1812 = false;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    public static int field1815 = 0;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "I")
    public static int field1816 = 1407;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "Laj;")
    public static class197 field1810;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "Lvf;")
    public static class99 field1813;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Llt;Llt;Llt;ILlt;)V", line = 7)
    public static final void method750(class458 arg0, class458 arg1, class458 arg2, int arg3, class458 arg4) {
        class166.field2579 = arg2;
        class299.field4536 = arg1;
        class274.field4161 = arg0;
        if (arg3 == 16) {
            class106.field1859 = arg4;
            field1804++;
            class409.field5933 = new class427[class274.field4161.method2738((byte) 109)][];
            class70.field1229 = new boolean[class274.field4161.method2738((byte) 109)];
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V", line = 29)
    public static void method751(int arg0) {
        if (arg0 < -3) {
            field1809 = null;
            field1810 = null;
            field1813 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)Lso;", line = 42)
    public static final class314 method752(int arg0) {
        field1803++;
        if (arg0 != -21161) {
            method750(null, null, null, 81, null);
        }
        try {
            return (class314) Class.forName("f").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lcm;ILlt;)V", line = 62)
    public class100(class491 arg0, int arg1, class458 arg2) {
        this.field1806 = arg2;
        this.field1806.method2726((byte) 113, 5);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lpi;IIIII)V", line = 77)
    public static final void method753(class329 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field4923 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field4926[var6] != null) {
                arg0.field4923++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field4923; var7++) {
            long var8 = class155.field2450[arg1][arg2][arg3];
            while (var8 != 0L) {
                class233 var14 = class162.field2532[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field4926[var7] == var14.field3534) {
                    continue label50;
                }
            }
            long var10 = class155.field2450[arg1][arg4][arg5];
            while (var10 != 0L) {
                class233 var13 = class162.field2532[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field4926[var7] == var13.field3534) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field4923 - 1; var12++) {
                arg0.field4926[var12] = arg0.field4926[var12 + 1];
            }
            arg0.field4923--;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IBI)I", line = 132)
    public static final int method754(int arg0, byte arg1, int arg2) {
        field1807++;
        int var3 = -91 / ((-arg1 - 34) / 38);
        if (arg2 == -1) {
            return 12345678;
        }
        int var4 = (arg2 & 0x7F) * arg0 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 126) {
            var4 = 126;
        }
        return (arg2 & 0xFF80) + var4;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)Lv;", line = 155)
    public final class392 method755(int arg0, byte arg1) {
        field1805++;
        if (arg1 != -93) {
            method754(88, (byte) 93, 1);
        }
        class288 var3 = this.field1808;
        class392 var4;
        synchronized (this.field1808) {
            var4 = (class392) this.field1808.method1752(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1806.method2715(arg0, 5, false);
        class392 var6 = new class392();
        if (var5 != null) {
            var6.method2333(new class40(var5), -60);
        }
        class288 var7 = this.field1808;
        synchronized (this.field1808) {
            this.field1808.method1758(1, var6, (long) arg0);
            return var6;
        }
    }
}
