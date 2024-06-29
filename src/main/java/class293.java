import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class293 {

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public int field4400 = 0;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "[I")
    public static int[] field4402 = new int[8];

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1834(boolean arg0) {
        if (arg0) {
            field4402 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 16)
    public static final int method1835(String arg0, byte arg1) {
        field4404++;
        if (arg1 >= -3) {
            method1837(null, -36, 37, -18, null);
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = ((var3 << 5) + class417.method2382(arg0.charAt(var4), (byte) 71)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljr;B)V", line = 38)
    public final void method1836(class96 arg0, byte arg1) {
        field4403++;
        int var3 = -24 % ((arg1 - 22) / 59);
        while (true) {
            int var4 = arg0.method718(89);
            if (var4 == 0) {
                return;
            }
            this.method1839(-88, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lw;III[Z)V", line = 59)
    public static final void method1837(class271 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class581.field8114 == class144.field2149) {
            return;
        }
        int var5 = class31.field369[arg1].method267(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class136 var7 = class31.field369[var6];
                if (var7 != null) {
                    var7.method278(arg0, arg2, var5 - var7.method267(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)B", line = 85)
    public static final byte method1838(int arg0, int arg1, int arg2) {
        field4401++;
        if (arg1 > -42) {
            method1838(66, 44, -9);
        }
        if (arg2 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILjr;I)V", line = 112)
    private final void method1839(int arg0, class96 arg1, int arg2) {
        if (arg0 > -48) {
            this.method1836(null, (byte) -68);
        }
        field4405++;
        if (arg2 == 5) {
            this.field4400 = arg1.method743((byte) -17);
        }
    }
}
