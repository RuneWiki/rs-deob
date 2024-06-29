import java.awt.Container;
import java.awt.Insets;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class70 extends class279 {

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    private int field1070 = 409;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
    private int field1080 = 0;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
    private int field1087 = 4;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
    private int field1082 = 204;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
    private int field1088 = 1024;

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "I")
    private int field1093 = 81;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    private int field1071 = 1024;

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "I")
    private int field1094 = 8;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field1072 = 0;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "Ltl;")
    public static class59 field1074 = class85.method639("<br>(X", 9588);

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "Ltl;")
    public static class59 field1089 = class85.method639("Ablegen", 9588);

    @OriginalMember(owner = "client!ub", name = "ib", descriptor = "Ltl;")
    public static class59 field1096 = class85.method639("3D)2Softwarebibliothek gestartet)3", 9588);

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "F")
    public static float field1086;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    private int field1079;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    private int field1085;

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!ub", name = "hb", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!ub", name = "jb", descriptor = "Ltl;")
    public static class59 field1097;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "[I")
    private int[] field1068;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "[I")
    public static int[] field1069;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "[Loj;")
    public static class260[] field1083;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "[[I")
    private int[][] field1081;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "[[I")
    private int[][] field1084;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIIII)V", line = 10)
    public static final void method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1077++;
        if (class253.method1764(arg0, arg7)) {
            class147.field2404 = null;
            class139.method1015(arg1, -1, arg5, arg6, class239.field3986[arg0], arg2, arg4, false, arg8, arg3);
            if (class147.field2404 != null) {
                class139.method1015(arg1, -1412584499, class262.field4376, arg6, class147.field2404, arg2, class281.field4847, false, arg8, arg3);
                class147.field2404 = null;
            }
        } else if (arg2 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class102.field1689[var9] = true;
            }
        } else {
            class102.field1689[arg2] = true;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V", line = 48)
    public class70() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(Z)V", line = 53)
    private final void method570(boolean arg0) {
        field1095++;
        if (!arg0) {
            method569(115, -126, 24, -48, -115, 77, -90, -126, -21);
        }
        Random var2 = new Random((long) this.field1094);
        this.field1081 = new int[this.field1094][this.field1087 + 1];
        this.field1091 = 4096 / this.field1087;
        this.field1079 = 4096 / this.field1094;
        int var3 = this.field1091 / 2;
        this.field1084 = new int[this.field1094][this.field1087];
        this.field1068 = new int[this.field1094 + 1];
        this.field1068[0] = 0;
        this.field1085 = this.field1093 / 2;
        int var4 = this.field1079 / 2;
        for (int var5 = 0; var5 < this.field1094; var5++) {
            if (var5 > 0) {
                int var6 = this.field1079;
                int var7 = (class215.method1496(var2, -119, 4096) - 2048) * this.field1082 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field1068[var5] = this.field1068[var5 - 1] + var8;
            }
            this.field1081[var5][0] = 0;
            for (int var9 = 0; var9 < this.field1087; var9++) {
                if (var9 > 0) {
                    int var10 = this.field1091;
                    int var11 = (class215.method1496(var2, -118, 4096) - 2048) * this.field1070 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field1081[var5][var9] = this.field1081[var5][var9 - 1] + var12;
                }
                this.field1084[var5][var9] = this.field1071 <= 0 ? 4096 : 4096 - class215.method1496(var2, 10, this.field1071);
            }
            this.field1081[var5][this.field1087] = 4096;
        }
        this.field1068[this.field1094] = 4096;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILs;)V", line = 136)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg0 > -125) {
            field1096 = (class59) null;
        }
        if (arg1 == 0) {
            this.field1087 = arg2.method1221(92);
        } else if (arg1 == 1) {
            this.field1094 = arg2.method1221(78);
        } else if (arg1 == 2) {
            this.field1070 = arg2.method1214(-18254);
        } else if (arg1 == 3) {
            this.field1082 = arg2.method1214(-18254);
        } else if (arg1 == 4) {
            this.field1088 = arg2.method1214(-18254);
        } else if (arg1 == 5) {
            this.field1080 = arg2.method1214(-18254);
        } else if (arg1 == 6) {
            this.field1093 = arg2.method1214(-18254);
        } else if (arg1 == 7) {
            this.field1071 = arg2.method1214(-18254);
        }
        field1075++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 237)
    public final void method319(byte arg0) {
        field1090++;
        if (arg0 < -9) {
            this.method570(true);
        }
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V", line = 250)
    public static void method571(int arg0) {
        field1097 = null;
        if (arg0 != -1) {
            method571(-33);
        }
        field1069 = null;
        field1074 = null;
        field1083 = null;
        field1089 = null;
        field1096 = null;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V", line = 268)
    public static final void method572(byte arg0) {
        field1078++;
        Container var1;
        if (class232.field3811 != null) {
            var1 = class232.field3811;
        } else if (class253.field4209 == null) {
            var1 = class308.field5222.field2870;
        } else {
            var1 = class253.field4209;
        }
        class312.field5289 = var1.getSize().width;
        class59.field915 = var1.getSize().height;
        if (arg0 >= -100) {
            method569(47, 16, 54, 95, 52, 1, -82, -35, 117);
        }
        if (class253.field4209 == var1) {
            Insets var2 = class253.field4209.getInsets();
            class59.field915 -= var2.top + var2.bottom;
            class312.field5289 -= var2.right + var2.left;
        }
        if (class284.method1988((byte) 89) >= 2) {
            class30.field421 = 0;
            class53.field792 = class59.field915;
            class152.field2498 = class312.field5289;
            class264.field4553 = 0;
        } else {
            class264.field4553 = 0;
            class53.field792 = 503;
            class30.field421 = (class312.field5289 - 765) / 2;
            class152.field2498 = 765;
        }
        if (class55.field815) {
            class55.method385(class152.field2498, class53.field792);
        }
        class160.field2607.setSize(class152.field2498, class53.field792);
        if (class253.field4209 == var1) {
            Insets var3 = class253.field4209.getInsets();
            class160.field2607.setLocation(class30.field421 + var3.left, class264.field4553 + var3.top);
        } else {
            class160.field2607.setLocation(class30.field421, class264.field4553);
        }
        if (class262.field4364 != -1) {
            class40.method261((byte) -13, true);
        }
        class36.method239(124);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)[I", line = 340)
    public final int[] method44(boolean arg0, int arg1) {
        field1076++;
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (arg0) {
            method572((byte) 68);
        }
        if (this.field4781.field354) {
            int var4 = 0;
            int var5;
            for (var5 = class71.field1104[arg1] + this.field1080; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field1094 > var4 && var5 >= this.field1068[var4]) {
                var4++;
            }
            int var6 = this.field1068[var4 - 1];
            boolean var7 = (var4 & 0x1) == 0;
            int var8 = this.field1068[var4];
            int var9 = var4 - 1;
            if (var5 > var6 + this.field1085 && var5 < (var8 - this.field1085)) {
                for (int var10 = 0; var10 < class56.field835; var10++) {
                    int var11 = var7 ? this.field1088 : -this.field1088;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field1091 * var11 >> 12) + class31.field430[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field1087 > var12 && this.field1081[var9][var12] <= var13) {
                        var12++;
                    }
                    int var14 = this.field1081[var9][var12];
                    int var15 = var12 - 1;
                    int var16 = this.field1081[var9][var15];
                    if (var16 + this.field1085 < var13 && var14 - this.field1085 > var13) {
                        var3[var10] = this.field1084[var9][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class63.method522(var3, 0, class56.field835, 0);
            }
        }
        return var3;
    }
}
