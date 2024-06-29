import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class383 extends class404 {

    @OriginalMember(owner = "client!cv", name = "z", descriptor = "I")
    private int field5567 = 4096;

    @OriginalMember(owner = "client!cv", name = "O", descriptor = "I")
    private int field5582 = 0;

    @OriginalMember(owner = "client!cv", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field5568 = new String[100];

    @OriginalMember(owner = "client!cv", name = "D", descriptor = "Z")
    public static boolean field5571 = false;

    @OriginalMember(owner = "client!cv", name = "L", descriptor = "Lsk;")
    public static class423 field5579 = new class423("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!cv", name = "N", descriptor = "I")
    public static int field5581 = -1;

    @OriginalMember(owner = "client!cv", name = "M", descriptor = "[I")
    public static int[] field5580 = new int[4096];

    @OriginalMember(owner = "client!cv", name = "B", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!cv", name = "F", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!cv", name = "G", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!cv", name = "I", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!cv", name = "J", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!cv", name = "H", descriptor = "Lws;")
    public static class230 field5575;

    @OriginalMember(owner = "client!cv", name = "E", descriptor = "Llt;")
    public static class458 field5572;

    @OriginalMember(owner = "client!cv", name = "C", descriptor = "[Lig;")
    public static class154[] field5570;

    @OriginalMember(owner = "client!cv", name = "K", descriptor = "[Lig;")
    public static class154[] field5578;

    static {
        for (int var0 = 0; var0 < 4096; ++var0) {
            field5580[var0] = class366.method2211(-110, var0);
        }
    }

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "(I)[Lil;", line = 3)
    public static final class7[] method2296(int arg0) {
        if (class419.field6034 == null) {
            class7[] var1 = class457.method2706((byte) -36, class7.field86);
            class7[] var2 = new class7[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; var1.length > var4; ++var4) {
                class7 var8 = var1[var4];
                if ((~var8.field90 >= -1 || var8.field90 >= 24) && ~var8.field84 <= -801 && ~var8.field78 <= -601 && (~class322.field4841 <= -97 || ~class30.field395 != -1 || var8.field84 <= 1024 && var8.field78 <= 768)) {
                    for (int var9 = 0; var9 < var3; ++var9) {
                        class7 var10 = var2[var9];
                        if (~var8.field84 == ~var10.field84 && ~var8.field78 == ~var10.field78) {
                            if (~var10.field90 > ~var8.field90) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    ++var3;
                }
            }
            class419.field6034 = new class7[var3];
            class356.method2183(var2, 0, class419.field6034, 0, var3);
            int[] var5 = new int[class419.field6034.length];
            for (int var6 = 0; class419.field6034.length > var6; ++var6) {
                class7 var7 = class419.field6034[var6];
                var5[var6] = var7.field84 * var7.field78;
            }
            class315.method1879(class419.field6034, var5, -1);
        }
        ++field5573;
        if (arg0 < 25) {
            field5571 = true;
        }
        return class419.field6034;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "()V", line = 89)
    public class383() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(II)[[I", line = 101)
    public final int[][] method89(int arg0, int arg1) {
        ++field5574;
        int[][] var3 = super.field5869.method2819(arg1, 1);
        if (arg0 != -1) {
            this.method87(27, (class40) null, -20);
        }
        if (super.field5869.field7156) {
            int[][] var4 = this.method2400(-11872, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class431.field6348 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 < this.field5582) {
                    var8[var11] = this.field5582;
                } else if (this.field5567 < var12) {
                    var8[var11] = this.field5567;
                } else {
                    var8[var11] = var12;
                }
                if (var13 >= this.field5582) {
                    if (var13 <= this.field5567) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field5567;
                    }
                } else {
                    var9[var11] = this.field5582;
                }
                if (~this.field5582 >= ~var14) {
                    if (~var14 >= ~this.field5567) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field5567;
                    }
                } else {
                    var10[var11] = this.field5582;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILha;I)V", line = 181)
    public final void method87(int arg0, class40 arg1, int arg2) {
        ++field5576;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field5873 = ~arg1.method257((byte) 64) == -2;
                }
            } else {
                this.field5567 = arg1.method254((byte) -126);
            }
        } else {
            this.field5582 = arg1.method254((byte) -81);
        }
        if (arg0 != 0) {
            field5572 = null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)[I", line = 223)
    public final int[] method90(int arg0, int arg1) {
        if (arg0 > -47) {
            return null;
        } else {
            ++field5577;
            int[] var3 = super.field5870.method372(arg1, (byte) -115);
            if (super.field5870.field810) {
                int[] var4 = this.method2394(0, (byte) 64, arg1);
                for (int var5 = 0; var5 < class431.field6348; ++var5) {
                    int var6 = var4[var5];
                    if (var6 >= this.field5582) {
                        if (var6 > this.field5567) {
                            var3[var5] = this.field5567;
                        } else {
                            var3[var5] = var6;
                        }
                    } else {
                        var3[var5] = this.field5582;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "(I)V", line = 268)
    public static void method2297(int arg0) {
        field5575 = null;
        field5572 = null;
        field5578 = null;
        field5579 = null;
        if (arg0 != 10) {
            field5575 = null;
        }
        field5580 = null;
        field5570 = null;
        field5568 = null;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 314)
    public static final String method2298(long arg0, byte arg1) {
        if (arg1 != -101) {
            return null;
        } else {
            class72.field1274.setTime(new Date(arg0));
            ++field5569;
            int var3 = class72.field1274.get(7);
            int var4 = class72.field1274.get(5);
            int var5 = class72.field1274.get(2);
            int var6 = class72.field1274.get(1);
            int var7 = class72.field1274.get(11);
            int var8 = class72.field1274.get(12);
            int var9 = class72.field1274.get(13);
            return class134.field2133[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + class12.field139[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }
}
