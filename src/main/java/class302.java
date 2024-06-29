import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class302 extends class96 {

    @OriginalMember(owner = "client!pt", name = "P", descriptor = "I")
    private int field3911 = 0;

    @OriginalMember(owner = "client!pt", name = "S", descriptor = "I")
    private int field3914 = 4096;

    @OriginalMember(owner = "client!pt", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field3916 = new String[100];

    @OriginalMember(owner = "client!pt", name = "Q", descriptor = "[I")
    public static int[] field3912 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!pt", name = "W", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!pt", name = "K", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!pt", name = "L", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!pt", name = "M", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!pt", name = "N", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!pt", name = "O", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!pt", name = "V", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!pt", name = "R", descriptor = "Lf;")
    public static class404 field3913;

    @OriginalMember(owner = "client!pt", name = "T", descriptor = "Lf;")
    public static class404 field3915;

    static {
        new class169("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field3918 = 0;
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(II)[I", line = 4)
    public final int[] method37(int arg0, int arg1) {
        ++field3908;
        if (arg1 != 255) {
            this.method37(94, -71);
        }
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (super.field1331.field863) {
            int[] var4 = this.method657(0, arg0, -1);
            for (int var5 = 0; class269.field3403 > var5; ++var5) {
                int var6 = var4[var5];
                if (var6 < this.field3911) {
                    var3[var5] = this.field3911;
                } else if (var6 <= this.field3914) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field3914;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V", line = 46)
    public class302() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 52)
    public static final void method1811(String arg0, byte arg1) {
        ++field3910;
        if (arg0 != null) {
            if (arg0.startsWith("*")) {
                arg0 = arg0.substring(1);
            }
            String var2 = class61.method347(31608, arg0);
            if (var2 != null) {
                for (int var3 = 0; ~class364.field4692 < ~var3; ++var3) {
                    String var4 = class231.field2996[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class61.method347(31608, var4);
                    if (var5 != null && var5.equals(var2)) {
                        --class364.field4692;
                        for (int var6 = var3; ~class364.field4692 < ~var6; ++var6) {
                            class231.field2996[var6] = class231.field2996[var6 + 1];
                            class276.field3538[var6] = class276.field3538[var6 + 1];
                            class208.field2705[var6] = class208.field2705[var6 + 1];
                            class167.field2174[var6] = class167.field2174[var6 + 1];
                            class511.field7529[var6] = class511.field7529[var6 + 1];
                            class261.field3320[var6] = class261.field3320[var6 + 1];
                        }
                        ++class514.field7550;
                        class162.field2107 = class165.field2140;
                        class420.method2472((byte) -101, class388.field5101);
                        class319.field4112.method565(94, class415.method2442(-37, arg0));
                        class319.field4112.method597(-128, arg0);
                        break;
                    }
                }
                int var7 = 35 / ((arg1 - 70) / 53);
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "(I)[Lgp;", line = 113)
    public static final class459[] method1812(int arg0) {
        ++field3909;
        if (arg0 != 1) {
            field3917 = 22;
        }
        return new class459[] { class316.field4071, class113.field1549, class491.field7168, class254.field3205, class174.field2244, class92.field1284, class90.field1257, class329.field4226, class415.field5514, class98.field1366, class488.field7114, class196.field2541, class164.field2127, class90.field1255, class271.field3439 };
    }

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "(B)V", line = 125)
    public static void method1813(byte arg0) {
        field3912 = null;
        int var1 = 100 % ((arg0 - -50) / 55);
        field3913 = null;
        field3915 = null;
        field3916 = null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IILbt;)V", line = 152)
    public final void method31(int arg0, int arg1, class88 arg2) {
        ++field3906;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field1329 = arg2.method617(arg1 ^ -3) == 1;
                }
            } else {
                this.field3914 = arg2.method568((byte) 110);
            }
        } else {
            this.field3911 = arg2.method568((byte) 110);
        }
        if (arg1 != -1) {
            field3915 = null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)[[I", line = 196)
    public final int[][] method36(int arg0, int arg1) {
        ++field3907;
        int[][] var3 = super.field1333.method694(arg1, arg0);
        if (super.field1333.field1423) {
            int[][] var4 = this.method659(0, arg0 ^ -32, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class269.field3403 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field3911 > var12) {
                    var8[var11] = this.field3911;
                } else if (var12 > this.field3914) {
                    var8[var11] = this.field3914;
                } else {
                    var8[var11] = var12;
                }
                if (~var13 > ~this.field3911) {
                    var9[var11] = this.field3911;
                } else if (var13 > this.field3914) {
                    var9[var11] = this.field3914;
                } else {
                    var9[var11] = var13;
                }
                if (~this.field3911 < ~var14) {
                    var10[var11] = this.field3911;
                } else if (var14 > this.field3914) {
                    var10[var11] = this.field3914;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }
}
