import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public abstract class class247 extends class429 {

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "Z")
    public static boolean field3500 = false;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "Z")
    public static boolean field3509 = false;

    @OriginalMember(owner = "client!tr", name = "u", descriptor = "[F")
    public static float[] field3513 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!tr", name = "v", descriptor = "[F")
    public static float[] field3514 = new float[4];

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "Lkca;")
    public static class73 field3504 = new class73(68, 3);

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public int field3499;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "I")
    public int field3506;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!tr", name = "s", descriptor = "I")
    public int field3511;

    @OriginalMember(owner = "client!tr", name = "t", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "Lig;")
    public static class206 field3507;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "Z")
    public boolean field3505;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IB)C")
    public static final char method1635(int arg0, byte arg1) {
        field3512++;
        int var2 = arg1 & 0xFF;
        if (arg0 != 16) {
            method1635(-50, (byte) 16);
        }
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class461.field6874[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)V")
    public final void method96(byte arg0) {
        field3501++;
        if (arg0 != -76) {
            method1635(5, (byte) -40);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)V")
    public static final void method1636(int arg0, int arg1) {
        class330.field4756 = arg0;
        field3510++;
        if (arg1 <= 72) {
            field3500 = false;
        }
        class590.field8474 = 100;
        class83.field945 = -1;
        class647.field9361 = 3;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIILva;Loa;ZI)V")
    public final void method86(int arg0, int arg1, int arg2, class429 arg3, class605 arg4, boolean arg5, int arg6) {
        field3502++;
        if (arg0 != 7) {
            method1639(0);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIII)V")
    public static final void method1637(int arg0, int arg1, int arg2, int arg3) {
        class99 var4 = class431.field6408[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class356 var5 = var4.field1175;
        class356 var6 = var4.field1161;
        if (var5 != null) {
            var5.field5069 = var5.field5069 * arg3 / (0x10 << class465.field6917 - 7);
            var5.field5064 = var5.field5064 * arg3 / (0x10 << class465.field6917 - 7);
        }
        if (var6 != null) {
            var6.field5069 = var6.field5069 * arg3 / (0x10 << class465.field6917 - 7);
            var6.field5064 = var6.field5064 * arg3 / (0x10 << class465.field6917 - 7);
        }
    }

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "(I)Z")
    public final boolean method84(int arg0) {
        if (arg0 != 1630) {
            field3513 = null;
        }
        field3508++;
        return false;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IBIIII)V")
    public static final void method1638(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var9 = arg5 + 1;
        class645.method3675(100, class402.field6087[arg5], arg2, arg4, arg0);
        field3503++;
        int var8 = arg3 - 1;
        class645.method3675(117, class402.field6087[arg3], arg2, arg4, arg0);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class402.field6087[var6];
            var7[arg4] = var7[arg0] = arg2;
        }
        if (arg1 != 101) {
            field3504 = null;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
    public static void method1639(int arg0) {
        field3513 = null;
        field3507 = null;
        if (arg0 == -13335) {
            field3504 = null;
            field3514 = null;
        }
    }
}
