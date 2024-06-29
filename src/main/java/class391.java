import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class391 extends class287 {

    @OriginalMember(owner = "client!ica", name = "G", descriptor = "Z")
    public boolean field5450 = true;

    @OriginalMember(owner = "client!ica", name = "J", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field5453 = new Rectangle[100];

    @OriginalMember(owner = "client!ica", name = "t", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!ica", name = "w", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!ica", name = "y", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!ica", name = "z", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!ica", name = "A", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!ica", name = "B", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!ica", name = "D", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!ica", name = "F", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!ica", name = "H", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!ica", name = "I", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!ica", name = "E", descriptor = "Lvh;")
    public class627 field5448;

    @OriginalMember(owner = "client!ica", name = "x", descriptor = "[I")
    private int[] field5441;

    @OriginalMember(owner = "client!ica", name = "C", descriptor = "[I")
    public int[] field5446;

    @OriginalMember(owner = "client!ica", name = "v", descriptor = "[Ljava/lang/String;")
    private String[] field5439;

    @OriginalMember(owner = "client!ica", name = "u", descriptor = "[[I")
    private int[][] field5438;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field5453[var0] = new Rectangle();
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V", line = 9)
    public static void method2373(int arg0) {
        field5453 = null;
        if (arg0 < 66) {
            field5453 = null;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "([IILvj;)V", line = 19)
    public final void method2374(int[] arg0, int arg1, class26 arg2) {
        field5440++;
        if (this.field5441 == null || arg1 != 797) {
            return;
        }
        for (int var4 = 0; var4 < this.field5441.length; var4++) {
            if (var4 >= arg0.length) {
                return;
            }
            int var5 = this.method2376((byte) -87, var4).field9764;
            if (var5 > 0) {
                arg2.method200((long) arg0[var4], var5, (byte) -51);
            }
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILvj;)V", line = 48)
    public final void method2375(int arg0, class26 arg1) {
        while (true) {
            int var3 = arg1.method194((byte) 119);
            if (var3 == 0) {
                field5447++;
                if (arg0 != 0) {
                    this.method2375(-25, null);
                    return;
                }
                return;
            }
            this.method2379(-1, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(BI)Lmha;", line = 72)
    public final class701 method2376(byte arg0, int arg1) {
        field5451++;
        if (this.field5441 == null || arg1 < 0 || this.field5441.length < arg1) {
            return null;
        } else if (arg0 == -87) {
            return class401.method2440(this.field5441[arg1], arg0 ^ 0xFFFFD356);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ica", name = "g", descriptor = "(I)I", line = 88)
    public final int method2377(int arg0) {
        if (arg0 >= -98) {
            return -124;
        } else {
            field5449++;
            return this.field5441 == null ? 0 : this.field5441.length;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IBI)I", line = 104)
    public final int method2378(int arg0, byte arg1, int arg2) {
        field5445++;
        if (this.field5441 == null || arg2 < 0 || arg2 > this.field5441.length) {
            return -1;
        } else if (arg1 <= 75) {
            return -60;
        } else if (this.field5438[arg2] == null || arg0 < 0 || this.field5438[arg2].length < arg0) {
            return -1;
        } else {
            return this.field5438[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILvj;I)V", line = 123)
    private final void method2379(int arg0, class26 arg1, int arg2) {
        field5442++;
        if (arg0 != -1) {
            this.field5438 = null;
        }
        if (arg2 == 1) {
            this.field5439 = class498.method2984(arg1.method196((byte) -92), '<', -97);
        } else if (arg2 == 2) {
            int var9 = arg1.method194((byte) 119);
            this.field5446 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field5446[var10] = arg1.method193(arg0 + 3);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method194((byte) 119);
            this.field5441 = new int[var4];
            this.field5438 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method193(2);
                class701 var7 = class401.method2440(var6, 11519);
                if (var7 != null) {
                    this.field5441[var5] = var6;
                    this.field5438[var5] = new int[var7.field9769];
                    for (int var8 = 0; var8 < var7.field9769; var8++) {
                        this.field5438[var5][var8] = arg1.method193(2);
                    }
                }
            }
            return;
        } else if (arg2 == 4) {
            this.field5450 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!ica", name = "h", descriptor = "(I)V", line = 199)
    public final void method2380(int arg0) {
        if (this.field5446 != null) {
            for (int var2 = 0; var2 < this.field5446.length; var2++) {
                this.field5446[var2] = class747.method4153(this.field5446[var2], 32768);
            }
        }
        if (arg0 == 32768) {
            field5444++;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(BLvj;)Ljava/lang/String;", line = 224)
    public final String method2381(byte arg0, class26 arg1) {
        field5452++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field5441 != null) {
            for (int var4 = 0; var4 < this.field5441.length; var4++) {
                var3.append(this.field5439[var4]);
                var3.append(this.field5448.method3659(arg1.method159(-9908, class401.method2440(this.field5441[var4], 11519).field9762), this.field5438[var4], this.method2376((byte) -87, var4), 126));
            }
        }
        if (arg0 <= 13) {
            this.field5441 = null;
        }
        var3.append(this.field5439[this.field5439.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!ica", name = "i", descriptor = "(I)Ljava/lang/String;", line = 259)
    public final String method2382(int arg0) {
        if (arg0 != 100) {
            this.field5438 = null;
        }
        field5443++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field5439 == null) {
            return "";
        }
        var2.append(this.field5439[0]);
        for (int var3 = 1; var3 < this.field5439.length; var3++) {
            var2.append("...");
            var2.append(this.field5439[var3]);
        }
        return var2.toString();
    }
}
