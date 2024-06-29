import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class17 extends class18 {

    @OriginalMember(owner = "client!db", name = "E", descriptor = "[[B")
    public static byte[][] field255 = new byte[50][];

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "Lhc;")
    public static class235 field252;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "Lhc;")
    public static class235 field254;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "Ljava/lang/String;")
    public String field267;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "[C")
    public char[] field261;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "[C")
    public char[] field264;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "[I")
    public int[] field258;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "[I")
    public int[] field266;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BC)I")
    public final int method161(byte arg0, char arg1) {
        field265++;
        if (this.field258 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg0 != -36) {
            method165((byte) 82);
        }
        while (this.field258.length > var3) {
            if (this.field261[var3] == arg1) {
                return this.field258[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZC)I")
    public final int method162(boolean arg0, char arg1) {
        field262++;
        if (this.field266 == null) {
            return -1;
        } else if (arg0) {
            return -78;
        } else {
            for (int var3 = 0; var3 < this.field266.length; var3++) {
                if (this.field264[var3] == arg1) {
                    return this.field266[var3];
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
    public final void method163(int arg0) {
        field259++;
        if (this.field258 != null) {
            for (int var2 = 0; var2 < this.field258.length; var2++) {
                this.field258[var2] = class45.method330(this.field258[var2], 32768);
            }
        }
        if (arg0 != 32768) {
            this.method163(14);
        }
        if (this.field266 != null) {
            for (int var3 = 0; var3 < this.field266.length; var3++) {
                this.field266[var3] = class45.method330(this.field266[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
    public static final void method164(int arg0) {
        field253++;
        if (class28.field383 > arg0) {
            class26.method212((byte) 97);
        } else {
            class174.field2745 = class249.field4022;
            class249.field4022 = null;
            client.method1042(false, 40);
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(B)V")
    public static void method165(byte arg0) {
        field254 = null;
        field255 = null;
        if (arg0 > 93) {
            field252 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)V")
    public static final void method166(int arg0, byte arg1) {
        class271.field4344.method1897(true, arg0);
        field260++;
        if (arg1 != -67) {
            method164(-91);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)I")
    public static final int method167(byte arg0, int arg1) {
        field256++;
        if (arg1 == 16711935) {
            return -1;
        } else {
            if (arg0 >= -14) {
                method167((byte) 11, -72);
            }
            return class42.method311((byte) 109, arg1);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IILai;)V")
    private final void method168(int arg0, int arg1, class88 arg2) {
        if (arg0 < 45) {
            method166(113, (byte) 9);
        }
        if (arg1 == 1) {
            this.field267 = arg2.method675((byte) 16);
        } else if (arg1 == 2) {
            int var7 = arg2.method633(114);
            this.field264 = new char[var7];
            this.field266 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field266[var8] = arg2.method645(11596);
                byte var9 = arg2.method656(-252);
                this.field264[var8] = var9 == 0 ? 0 : class190.method1279(14210, var9);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method633(114);
            this.field261 = new char[var4];
            this.field258 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field258[var5] = arg2.method645(11596);
                byte var6 = arg2.method656(-252);
                this.field261[var5] = var6 == 0 ? 0 : class190.method1279(14210, var6);
            }
        }
        field263++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLai;)V")
    public final void method169(byte arg0, class88 arg1) {
        while (true) {
            int var3 = arg1.method633(114);
            if (var3 == 0) {
                if (arg0 > -95) {
                    this.field266 = null;
                }
                field257++;
                return;
            }
            this.method168(71, var3, arg1);
        }
    }
}
