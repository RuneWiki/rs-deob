import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class384 extends class346 {

    @OriginalMember(owner = "client!fp", name = "J", descriptor = "I")
    private int field5614 = 1024;

    @OriginalMember(owner = "client!fp", name = "I", descriptor = "I")
    private int field5613 = 3072;

    @OriginalMember(owner = "client!fp", name = "X", descriptor = "I")
    private int field5628 = 2048;

    @OriginalMember(owner = "client!fp", name = "Q", descriptor = "[I")
    public static int[] field5621 = new int[5];

    @OriginalMember(owner = "client!fp", name = "L", descriptor = "Z")
    public static boolean field5616 = false;

    @OriginalMember(owner = "client!fp", name = "N", descriptor = "I")
    public static int field5618 = 2;

    @OriginalMember(owner = "client!fp", name = "T", descriptor = "I")
    public static int field5624 = -1;

    @OriginalMember(owner = "client!fp", name = "M", descriptor = "F")
    public static float field5617;

    @OriginalMember(owner = "client!fp", name = "H", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!fp", name = "K", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!fp", name = "R", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!fp", name = "S", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!fp", name = "V", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!fp", name = "W", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!fp", name = "U", descriptor = "Z")
    public static boolean field5625;

    @OriginalMember(owner = "client!fp", name = "O", descriptor = "[I")
    public static int[] field5619;

    @OriginalMember(owner = "client!fp", name = "P", descriptor = "[I")
    public static int[] field5620;

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
    public class384() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)V")
    public final void method237(byte arg0) {
        if (arg0 >= -95) {
            this.method237((byte) 93);
        }
        this.field5628 = this.field5613 - this.field5614;
        ++field5626;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IB)Lri;")
    public static final class372 method2492(int arg0, byte arg1) {
        ++field5615;
        if (arg1 <= 20) {
            return null;
        } else {
            class8[] var2 = class280.field4114;
            synchronized (class280.field4114) {
                class372 var3;
                if (~arg0 > ~class280.field4114.length && !class280.field4114[arg0].method47(false)) {
                    var3 = (class372) class280.field4114[arg0].method56(-30010);
                    var3.method2308(-76);
                    int var10002 = class430.field6246[arg0]--;
                } else {
                    var3 = new class372();
                    var3.field5481 = new class137[arg0];
                    for (int var4 = 0; arg0 > var4; ++var4) {
                        var3.field5481[var4] = new class137();
                    }
                }
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field5627;
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (arg1 != 3) {
            field5624 = -57;
        }
        if (super.field5152.field3004) {
            int[] var4 = this.method2294((byte) 54, arg0, 0);
            for (int var5 = 0; ~class134.field1753 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field5628 >> 12) + this.field5614;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lfb;ZI)V")
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        ++field5622;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field5151 = arg0.method2233((byte) 104) == 1;
                }
            } else {
                this.field5613 = arg0.method2239(-1076227960);
            }
        } else {
            this.field5614 = arg0.method2239(-1076227960);
        }
        if (arg1) {
            field5617 = 1.4032049F;
        }
    }

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(B)V")
    public static final void method2493(byte arg0) {
        ++field5612;
        if (arg0 <= 45) {
            method2492(-66, (byte) 39);
        }
        if (~class255.field3719 > -103) {
            class255.field3719 += 6;
        }
        for (int var1 = 0; ~var1 > ~class85.field1183; ++var1) {
            int var2 = class348.field5181[var1];
            char var3 = (char) class309.field4581[var1];
            if (~var2 == -85) {
                class228.method1484(127);
            } else if (class277.field4063[82] && var2 == 66) {
                if (class174.field2366 != null) {
                    String var8 = "";
                    for (int var9 = class222.field3064.length + -1; ~var9 <= -1; --var9) {
                        if (class222.field3064[var9] != null && class222.field3064[var9].length() > 0) {
                            var8 = var8 + class222.field3064[var9] + '\n';
                        }
                    }
                    class174.field2366.setContents(new StringSelection(var8), (ClipboardOwner) null);
                }
            } else if (class277.field4063[82] && var2 == 67) {
                if (class174.field2366 != null) {
                    Transferable var4 = class174.field2366.getContents((Object) null);
                    if (var4 != null) {
                        try {
                            String var5 = (String) var4.getTransferData(DataFlavor.stringFlavor);
                            if (var5 != null) {
                                String[] var6 = class33.method260(-2892, '\n', var5);
                                if (~var6.length < -2) {
                                    for (int var7 = 0; ~var6.length < ~var7; ++var7) {
                                        class33.field526 = var6[var7];
                                        class228.method1484(127);
                                    }
                                } else {
                                    class33.field526 = class33.field526 + var5;
                                }
                            }
                        } catch (Exception var11) {
                        }
                    }
                }
            } else if (var2 == 85 && class33.field526.length() > 0) {
                class33.field526 = class33.field526.substring(0, class33.field526.length() - 1);
            } else if (var2 == 104 && ~class14.field226 > ~class222.field3064.length) {
                ++class14.field226;
                class62.method551(-7324);
            } else if (~var2 == -106 && class14.field226 > 0) {
                --class14.field226;
                class62.method551(-7324);
            } else if (class204.method1352(-98, var3) || ~var3 == -45 || ~var3 == -33 || var3 == '_' || ~var3 == -46 || var3 == '+') {
                class33.field526 = class33.field526 + (char) class309.field4581[var1];
            }
        }
        class85.field1183 = 0;
        for (int var10 = 0; ~var10 > -101; ++var10) {
            int var10002;
            if (!class157.field1985[var10]) {
                var10002 = class342.field5121[var10]--;
                if (class342.field5121[var10] < 0) {
                    class273.field4011[var10] = (int) ((double) class357.field5298 * Math.random());
                    class441.field6391[var10] = (int) (Math.random() * 350.0D);
                    class342.field5121[var10] = 0;
                    class157.field1985[var10] = true;
                }
            } else {
                var10002 = class342.field5121[var10]++;
                if (class342.field5121[var10] > 102) {
                    class157.field1985[var10] = false;
                }
            }
        }
        class274.method1812(-1695);
    }

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(Z)V")
    public static void method2494(boolean arg0) {
        field5620 = null;
        field5621 = null;
        if (arg0) {
            field5618 = 90;
        }
        field5619 = null;
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(II)[[I")
    public final int[][] method287(int arg0, int arg1) {
        ++field5623;
        if (arg1 > -3) {
            return null;
        } else {
            int[][] var3 = super.field5170.method2701(0, arg0);
            if (super.field5170.field6288) {
                int[][] var4 = this.method2293(0, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class134.field1753; ++var11) {
                    var8[var11] = this.field5614 - -(var5[var11] * this.field5628 >> 12);
                    var9[var11] = (var6[var11] * this.field5628 >> 12) + this.field5614;
                    var10[var11] = (var7[var11] * this.field5628 >> 12) + this.field5614;
                }
            }
            return var3;
        }
    }
}
