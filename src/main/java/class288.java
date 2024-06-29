import java.awt.Color;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class288 {

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "Ltm;")
    private class405 field4306 = new class405();

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "Lbg;")
    private class275 field4314 = new class275();

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
    private int field4312;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    private int field4313;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "Lmt;")
    private class517 field4311;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "[I")
    public static int[] field4304 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "[I")
    public static int[] field4299 = new int[200];

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4305 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "[I")
    public static int[] field4309 = new int[8];

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "Lpu;")
    public static class178 field4310;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V", line = 5)
    public static void method1777(int arg0) {
        if (arg0 != 24) {
            field4305 = null;
        }
        field4304 = null;
        field4309 = null;
        field4299 = null;
        field4310 = null;
        field4305 = null;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V", line = 26)
    public final void method1778(int arg0) {
        field4301++;
        this.field4314.method1709((byte) 126);
        this.field4311.method3056(true);
        if (arg0 == 0) {
            this.field4306 = new class405();
            this.field4313 = this.field4312;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lgk;B)V", line = 42)
    public static final void method1779(class468 arg0, byte arg1) {
        if (arg1 <= 20) {
            return;
        }
        field4303++;
        byte[] var2 = new byte[24];
        if (class107.field1593 != null) {
            try {
                class107.field1593.method908(0L, (byte) -122);
                class107.field1593.method911(var2, -6111);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method2736(-1, 0, 24, var2);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ltm;IJ)V", line = 86)
    public final void method1780(class405 arg0, int arg1, long arg2) {
        if (this.field4313 == 0) {
            class405 var5 = this.field4314.method1718((byte) -91);
            var5.method876((byte) -96);
            var5.method2440(-43);
            if (this.field4306 == var5) {
                class405 var6 = this.field4314.method1718((byte) -120);
                var6.method876((byte) -96);
                var6.method2440(-104);
            }
        } else {
            this.field4313--;
        }
        field4300++;
        if (arg1 != -20892) {
            field4309 = null;
        }
        this.field4311.method3055(0, arg2, arg0);
        this.field4314.method1708((byte) -8, arg0);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(JI)Ltm;", line = 118)
    public final class405 method1781(long arg0, int arg1) {
        if (arg1 != 24) {
            field4305 = null;
        }
        field4308++;
        class405 var4 = (class405) this.field4311.method3059(120, arg0);
        if (var4 != null) {
            this.field4314.method1708((byte) -8, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lok;I)V", line = 142)
    public static final void method1782(class74 arg0, int arg1) {
        if (arg1 != -51) {
            method1782(null, -116);
        }
        field4302++;
        class256.field3478 = arg0;
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(I)V", line = 190)
    public class288(int arg0) {
        this.field4312 = arg0;
        this.field4313 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field4311 = new class517(var2);
    }
}
