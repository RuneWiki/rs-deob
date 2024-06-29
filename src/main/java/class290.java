import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class290 extends class617 {

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "Z")
    public boolean field3620 = true;

    @OriginalMember(owner = "client!fn", name = "O", descriptor = "I")
    public static int field3635 = 0;

    @OriginalMember(owner = "client!fn", name = "H", descriptor = "Lcq;")
    public static class110 field3628 = new class110(27, 6);

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!fn", name = "F", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!fn", name = "I", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!fn", name = "J", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!fn", name = "K", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!fn", name = "L", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!fn", name = "M", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!fn", name = "N", descriptor = "Lim;")
    public class386 field3634;

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "[I")
    public int[] field3624;

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "[I")
    private int[] field3625;

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field3621;

    @OriginalMember(owner = "client!fn", name = "G", descriptor = "[[I")
    private int[][] field3627;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)I", line = 3)
    public final int method1687(byte arg0) {
        field3622++;
        if (this.field3625 == null) {
            return 0;
        } else {
            int var2 = 115 % ((57 - arg0) / 51);
            return this.field3625.length;
        }
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(II)Lwd;", line = 16)
    public final class357 method1688(int arg0, int arg1) {
        if (arg1 < 82) {
            this.method1689(53);
        }
        field3619++;
        return this.field3625 == null || arg0 < 0 || arg0 > this.field3625.length ? null : class489.method2835(0, this.field3625[arg0]);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)Ljava/lang/String;", line = 33)
    public final String method1689(int arg0) {
        field3626++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field3621 == null) {
            return "";
        }
        var2.append(this.field3621[arg0]);
        for (int var3 = 1; var3 < this.field3621.length; var3++) {
            var2.append("...");
            var2.append(this.field3621[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lnp;Z)V", line = 58)
    public final void method1690(class115 arg0, boolean arg1) {
        field3632++;
        while (true) {
            int var3 = arg0.method620((byte) -126);
            if (var3 == 0) {
                if (arg1) {
                    return;
                } else {
                    this.method1688(117, -42);
                    return;
                }
            }
            this.method1694(var3, arg0, (byte) 84);
        }
    }

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "(I)V", line = 80)
    public static final void method1691(int arg0) {
        field3630++;
        if (arg0 != 80) {
            field3628 = null;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class142.field1574; var2++) {
            for (int var3 = 0; var3 < class140.field1550; var3++) {
                if (class143.method786(class487.field7044, var1, (byte) -128, true, var3, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILnp;)Ljava/lang/String;", line = 128)
    public final String method1692(int arg0, class115 arg1) {
        field3631++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field3625 != null) {
            for (int var4 = 0; var4 < this.field3625.length; var4++) {
                var3.append(this.field3621[var4]);
                var3.append(this.field3634.method2208(arg1.method661(class489.method2835(0, this.field3625[var4]).field4788, arg0 ^ 0x54B8), this.method1688(var4, 121), 1, this.field3627[var4]));
            }
        }
        var3.append(this.field3621[this.field3621.length + arg0]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "([ILnp;I)V", line = 153)
    public final void method1693(int[] arg0, class115 arg1, int arg2) {
        field3629++;
        if (this.field3625 == null) {
            return;
        }
        for (int var4 = arg2; var4 < this.field3625.length; var4++) {
            if (arg0.length <= var4) {
                return;
            }
            int var5 = this.method1688(var4, 96).field4787;
            if (var5 > 0) {
                arg1.method641((long) arg0[var4], var5, true);
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILnp;B)V", line = 183)
    private final void method1694(int arg0, class115 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field3621 = class182.method1105('<', (byte) -75, arg1.method626(110));
        } else if (arg0 == 2) {
            int var9 = arg1.method620((byte) -127);
            this.field3624 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3624[var10] = arg1.method643((byte) -77);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method620((byte) -128);
            this.field3625 = new int[var4];
            this.field3627 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method643((byte) -77);
                class357 var7 = class489.method2835(0, var6);
                if (var7 != null) {
                    this.field3625[var5] = var6;
                    this.field3627[var5] = new int[var7.field4794];
                    for (int var8 = 0; var8 < var7.field4794; var8++) {
                        this.field3627[var5][var8] = arg1.method643((byte) -77);
                    }
                }
            }
        } else if (arg0 == 4) {
            this.field3620 = false;
        }
        field3633++;
        int var11 = 24 % ((arg2 - 1) / 48);
    }

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "(B)V", line = 257)
    public final void method1695(byte arg0) {
        if (this.field3624 != null) {
            for (int var2 = 0; var2 < this.field3624.length; var2++) {
                this.field3624[var2] = class422.method2436(this.field3624[var2], 32768);
            }
        }
        if (arg0 >= -118) {
            field3628 = null;
        }
        field3618++;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZI)I", line = 279)
    public final int method1696(int arg0, boolean arg1, int arg2) {
        field3623++;
        if (this.field3625 == null || arg2 < 0 || arg2 > this.field3625.length) {
            return -1;
        } else if (this.field3627[arg2] == null || arg0 < 0 || arg0 > this.field3627[arg2].length) {
            return -1;
        } else if (arg1) {
            return -78;
        } else {
            return this.field3627[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "(I)V", line = 299)
    public static void method1697(int arg0) {
        if (arg0 == 32768) {
            field3628 = null;
        }
    }
}
