import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class289 extends class8 {

    @OriginalMember(owner = "client!rl", name = "V", descriptor = "Ljava/lang/String;")
    public static String field4640 = "Starting 3d Library";

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
    public static int field4633 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!rl", name = "S", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!rl", name = "U", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!rl", name = "W", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "Lak;")
    public static class172 field4635;

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "Ljava/lang/String;")
    public String field4630;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "[C")
    public char[] field4629;

    @OriginalMember(owner = "client!rl", name = "T", descriptor = "[C")
    public char[] field4638;

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "[I")
    public int[] field4625;

    @OriginalMember(owner = "client!rl", name = "X", descriptor = "[I")
    public int[] field4642;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljj;I)V", line = 8)
    public final void method2070(class44 arg0, int arg1) {
        field4634++;
        int var3 = -115 / ((-arg1 - 48) / 62);
        while (true) {
            int var4 = arg0.method286((byte) -128);
            if (var4 == 0) {
                return;
            }
            this.method2075(var4, arg0, 68);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V", line = 28)
    public static final void method2071(int arg0, int arg1) {
        class50.field707 = -1;
        int var2 = 61 / ((arg0 - 29) / 36);
        field4631++;
        class88.field1218 = -1;
        class139.field2195 = arg1;
        class46.method295(-1);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ltf;Ltf;B)V", line = 44)
    public static final void method2072(class165 arg0, class165 arg1, byte arg2) {
        if (arg2 != 26) {
            return;
        }
        if (arg1.field2749 != null) {
            arg1.method1212((byte) 100);
        }
        arg1.field2747 = arg0;
        field4628++;
        arg1.field2749 = arg0.field2749;
        arg1.field2749.field2747 = arg1;
        arg1.field2747.field2749 = arg1;
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)V", line = 62)
    public final void method2073(byte arg0) {
        if (this.field4625 != null) {
            for (int var2 = 0; var2 < this.field4625.length; var2++) {
                this.field4625[var2] = class122.method882(this.field4625[var2], 32768);
            }
        }
        field4636++;
        if (arg0 != 121) {
            this.field4630 = (String) null;
        }
        if (this.field4642 != null) {
            for (int var3 = 0; var3 < this.field4642.length; var3++) {
                this.field4642[var3] = class122.method882(this.field4642[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(CI)I", line = 92)
    public final int method2074(char arg0, int arg1) {
        field4632++;
        if (this.field4625 == null) {
            return -1;
        }
        int var3 = 0;
        int var4 = -20 / ((arg1 + 81) / 38);
        while (var3 < this.field4625.length) {
            if (this.field4638[var3] == arg0) {
                return this.field4625[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILjj;I)V", line = 118)
    private final void method2075(int arg0, class44 arg1, int arg2) {
        if (arg0 == 1) {
            this.field4630 = arg1.method265(0);
        } else if (arg0 == 2) {
            int var4 = arg1.method286((byte) -126);
            this.field4629 = new char[var4];
            this.field4642 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4642[var5] = arg1.method271(21081);
                byte var6 = arg1.method246((byte) -33);
                this.field4629[var5] = var6 == 0 ? 0 : class213.method1534(var6, -101);
            }
        } else if (arg0 == 3) {
            int var7 = arg1.method286((byte) -117);
            this.field4638 = new char[var7];
            this.field4625 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4625[var8] = arg1.method271(21081);
                byte var9 = arg1.method246((byte) -106);
                this.field4638[var8] = var9 == 0 ? 0 : class213.method1534(var9, -107);
            }
        } else if (arg0 == 4) {
        }
        if (arg2 <= 14) {
            this.method2075(-64, (class44) null, 82);
        }
        field4626++;
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)I", line = 186)
    public static final int method2076(int arg0) {
        field4627++;
        if (arg0 != 2) {
            field4633 = -127;
        }
        return 2;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IBZ)Ljava/lang/String;", line = 204)
    public static final String method2077(int arg0, byte arg1, boolean arg2) {
        field4637++;
        if (arg1 != 63) {
            method2077(16, (byte) -104, true);
        }
        return arg2 && arg0 >= 0 ? class123.method888(arg2, arg0, 10, (byte) 94) : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IC)I", line = 224)
    public final int method2078(int arg0, char arg1) {
        field4639++;
        if (this.field4642 == null) {
            return -1;
        }
        int var3 = 60 / ((-arg0 - 47) / 41);
        for (int var4 = 0; var4 < this.field4642.length; var4++) {
            if (this.field4629[var4] == arg1) {
                return this.field4642[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V", line = 249)
    public static void method2079(boolean arg0) {
        field4635 = null;
        field4640 = null;
        if (!arg0) {
            method2076(-69);
        }
    }
}
