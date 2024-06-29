import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class416 {

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
    public static int field6208 = -1;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    public static int field6207 = -1;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "Z")
    public static boolean field6219 = true;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    public int field6209;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    public int field6213;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
    public int field6220;

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "Lbu;")
    public static class17 field6211;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "Lf;")
    public static class529 field6214;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IILcu;)V", line = 3)
    private final void method2516(int arg0, int arg1, class145 arg2) {
        if (arg1 == 1) {
            this.field6220 = arg2.method1069((byte) -21);
            this.field6209 = arg2.method1063((byte) -108);
            this.field6213 = arg2.method1063((byte) -54);
        }
        field6216++;
        if (arg0 <= 107) {
            method2517(-95, 74, -19, -55, -124);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIII)V", line = 23)
    public static final void method2517(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6212++;
        class54 var5 = class442.method2651(arg2, arg0, -13208);
        var5.method480(arg0 - 4);
        var5.field930 = arg4;
        var5.field934 = arg3;
        var5.field933 = arg1;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILmq;I)Ljava/lang/String;", line = 36)
    public static final String method2518(int arg0, class350 arg1, int arg2) {
        field6223++;
        if (!client.method1349(arg1).method1609(arg0, (byte) -31) && arg1.field5349 == null) {
            return null;
        }
        if (arg2 != -25737) {
            field6214 = null;
        }
        if (arg1.field5284 == null || arg1.field5284.length <= arg0 || arg1.field5284[arg0] == null || arg1.field5284[arg0].trim().length() == 0) {
            return class210.field3027 ? "Hidden-" + arg0 : null;
        } else {
            return arg1.field5284[arg0];
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)V", line = 60)
    public static final void method2519(boolean arg0) {
        field6215++;
        int var1 = class409.field6135;
        if (!arg0) {
            method2522(-52);
        }
        int[] var2 = class358.field5445;
        for (int var3 = 0; var3 < var1; var3++) {
            class256 var4 = class183.field2747[var2[var3]];
            if (var4 != null) {
                class78.method619((byte) -95, var4.method1654(83), var4);
            }
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lcu;B)V", line = 88)
    public final void method2520(class145 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1063((byte) -99);
            if (var3 == 0) {
                field6217++;
                if (arg1 != 66) {
                    method2517(-101, -5, -101, -96, 108);
                    return;
                }
                return;
            }
            this.method2516(122, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)V", line = 128)
    public static final void method2521(int arg0, int arg1, int arg2) {
        field6210++;
        class54 var3 = class442.method2651(arg0, 13, -13208);
        if (arg2 == -25034) {
            var3.method480(0);
            var3.field934 = arg1;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V", line = 149)
    public static void method2522(int arg0) {
        field6214 = null;
        field6211 = null;
        if (arg0 != 30556) {
            field6222 = 71;
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V", line = 163)
    public static final void method2523(int arg0) {
        if (arg0 != 4096) {
            method2518(-84, null, -110);
        }
        field6221++;
        if (class68.field1167 != null && class57.field1002 != null) {
            return;
        }
        class68.field1167 = new int[256];
        class57.field1002 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class68.field1167[var1] = (int) (Math.sin(var2) * 4096.0D);
            class57.field1002[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }
}
