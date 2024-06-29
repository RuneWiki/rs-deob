import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class183 extends class142 {

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    private int field3486 = 4096;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
    private int field3488 = 4096;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
    private int field3489 = 4096;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "Lai;")
    public static class10 field3483 = class44.method278("Lade Wordpack )2 ", -69);

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "[I")
    public static int[] field3480 = new int[50];

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "Ldd;")
    public static class34 field3490 = new class34(50);

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "[S")
    public static short[] field3482;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field3489 = arg0.method762((byte) 79);
                }
            } else {
                this.field3486 = arg0.method762((byte) 80);
            }
        } else {
            this.field3488 = arg0.method762((byte) 101);
        }
        if (arg2 >= -34) {
            field3483 = null;
        }
        ++field3481;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class183() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1182(int arg0, Throwable arg1) throws IOException {
        String var3;
        if (arg1 instanceof class63) {
            class63 var2 = (class63) arg1;
            arg1 = var2.field1054;
            var3 = var2.field1055 + " | ";
        } else {
            var3 = "";
        }
        ++field3484;
        StringWriter var4 = new StringWriter();
        if (arg0 != 325) {
            return null;
        } else {
            PrintWriter var5 = new PrintWriter(var4);
            arg1.printStackTrace(var5);
            var5.close();
            String var6 = var4.toString();
            BufferedReader var7 = new BufferedReader(new StringReader(var6));
            String var8 = var7.readLine();
            while (true) {
                while (true) {
                    String var9 = var7.readLine();
                    if (var9 == null) {
                        return var3 + "| " + var8;
                    }
                    int var10 = var9.indexOf(40);
                    int var11 = var9.indexOf(41, var10 + 1);
                    if (~var10 <= -1 && ~var11 <= -1) {
                        String var12 = var9.substring(var10 + 1, var11);
                        int var13 = var12.indexOf(".java:");
                        if (~var13 <= -1) {
                            String var14 = var12.substring(0, var13) + var12.substring(var13 - -5);
                            var3 = var3 + var14 + ' ';
                            continue;
                        }
                        var9 = var9.substring(0, var10);
                    }
                    String var15 = var9.trim();
                    String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                    String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                    var3 = var3 + var17 + ' ';
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lwa;I)Z")
    public static final boolean method1183(class200 arg0, int arg1) {
        ++field3485;
        int var2 = arg0.field3865;
        if (var2 == 205) {
            class146.field2786 = 250;
            return true;
        } else {
            if (~var2 <= -301 && var2 <= 313) {
                int var3 = (var2 + -300) / 2;
                int var4 = 1 & var2;
                class160.field3077.method820(~var4 == -2, -30, var3);
            }
            if (~var2 <= -315 && var2 <= 323) {
                int var5 = (var2 + -314) / 2;
                int var6 = var2 & 1;
                class160.field3077.method821((byte) 104, var5, var6 == 1);
            }
            if (var2 == 324) {
                class160.field3077.method823(false, (byte) -105);
            }
            if (var2 == 325) {
                class160.field3077.method823(true, (byte) -121);
            }
            int var7 = 100 % ((arg1 - -23) / 35);
            if (var2 == 326) {
                class76.field1323.method635((byte) -55, 202);
                class160.field3077.method829(class76.field1323, -121);
                ++class67.field1171;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method86(int arg0, boolean arg1) {
        ++field3487;
        int[][] var3 = super.field2666.method956(arg0, -119);
        if (arg1) {
            method1183((class200) null, 1);
        }
        if (super.field2666.field2664) {
            int[][] var4 = this.method961(2, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; class133.field2499 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 == var13 && var13 == var14) {
                    var9[var11] = this.field3488 * var12 >> 12;
                    var8[var11] = this.field3486 * var13 >> 12;
                    var10[var11] = this.field3489 * var14 >> 12;
                } else {
                    var9[var11] = this.field3488;
                    var8[var11] = this.field3486;
                    var10[var11] = this.field3489;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
    public static void method1184(int arg0) {
        field3490 = null;
        field3480 = null;
        field3482 = null;
        int var1 = -112 % ((-11 - arg0) / 57);
        field3483 = null;
    }
}
