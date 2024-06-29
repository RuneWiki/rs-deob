import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class403 extends class107 {

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
    public static int field5514 = 0;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!uj", name = "I", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!uj", name = "L", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!uj", name = "M", descriptor = "Ljava/lang/String;")
    public String field5520;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "[C")
    public char[] field5508;

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "[C")
    public char[] field5518;

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "[I")
    public int[] field5511;

    @OriginalMember(owner = "client!uj", name = "D", descriptor = "[I")
    public int[] field5512;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public final void method2476(int arg0) {
        field5513++;
        if (this.field5511 != null) {
            for (int var2 = 0; var2 < this.field5511.length; var2++) {
                this.field5511[var2] = class746.method4158(this.field5511[var2], 32768);
            }
        }
        if (this.field5512 != null) {
            for (int var3 = 0; var3 < this.field5512.length; var3++) {
                this.field5512[var3] = class746.method4158(this.field5512[var3], 32768);
            }
        }
        if (arg0 != 32768) {
            this.method2480(null, -93, (byte) -122);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(CI)I")
    public final int method2477(char arg0, int arg1) {
        field5516++;
        if (arg1 != -26132) {
            this.method2478(true, '\u0016');
        }
        if (this.field5512 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field5512.length; var3++) {
            if (this.field5508[var3] == arg0) {
                return this.field5512[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZC)I")
    public final int method2478(boolean arg0, char arg1) {
        field5519++;
        if (this.field5511 == null) {
            return -1;
        }
        if (arg0) {
            field5509 = -91;
        }
        for (int var3 = 0; var3 < this.field5511.length; var3++) {
            if (this.field5518[var3] == arg1) {
                return this.field5511[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(Z)V")
    public static final void method2479(boolean arg0) {
        field5517++;
        if (class433.field5869 != null && arg0) {
            class590.field8323 = new class521();
            class590.field8323.method3142(class433.field5869.field644.method3580(class140.field2081, 12), class605.field8463, class433.field5869.field637, 32480, class433.field5869);
            class643.field8993 = new Thread(class590.field8323, "");
            class643.field8993.start();
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lso;IB)V")
    private final void method2480(class494 arg0, int arg1, byte arg2) {
        if (arg2 != -44) {
            this.field5520 = null;
        }
        field5510++;
        if (arg1 == 1) {
            this.field5520 = arg0.method2996(arg2 ^ 0xFFFFFFBC);
        } else if (arg1 == 2) {
            int var7 = arg0.method2964((byte) 86);
            this.field5512 = new int[var7];
            this.field5508 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field5512[var8] = arg0.method2998(true);
                byte var9 = arg0.method2943((byte) 16);
                this.field5508[var8] = var9 == 0 ? 0 : class583.method3412(var9, (byte) -127);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method2964((byte) 105);
            this.field5518 = new char[var4];
            this.field5511 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5511[var5] = arg0.method2998(true);
                byte var6 = arg0.method2943((byte) 16);
                this.field5518[var5] = var6 == 0 ? 0 : class583.method3412(var6, (byte) -122);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLso;)V")
    public final void method2481(byte arg0, class494 arg1) {
        field5515++;
        int var3 = 73 % ((arg0 - 29) / 56);
        while (true) {
            int var4 = arg1.method2964((byte) 53);
            if (var4 == 0) {
                return;
            }
            this.method2480(arg1, var4, (byte) -44);
        }
    }
}
