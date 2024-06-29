import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class514 {

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Lpj;")
    private class132 field7026;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "[[I")
    private int[][] field7024;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field7029;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Lka;")
    public static class434 field7025;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
    public static final void method2853(int arg0, int arg1) {
        field7022++;
        if (class474.method2690(arg0, arg1 ^ 0xF45450F)) {
            class379.method2197(class676.field9545[arg0], (byte) -86, arg1);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static final void method2854(byte arg0) {
        field7021++;
        int var1 = 28 % ((arg0 + 33) / 42);
        if (class124.field1719) {
            return;
        }
        class124.field1719 = true;
        class586.field8200 = true;
        if (class274.field3872.field874) {
            class249.field3516 = ((int) class249.field3516 - 17 & 0xFFFFFFF0);
        } else {
            class509.field6981 += (-12.0F - class509.field6981) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)[I")
    public final int[] method2855(int arg0, byte arg1) {
        field7020++;
        if (arg0 >= 0 && arg0 < this.field7024.length) {
            int var3 = -111 % ((-arg1 - 79) / 42);
            return this.field7024[arg0];
        } else {
            return new int[0];
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method2856(String arg0, int arg1) throws ClassNotFoundException {
        field7027++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg1 != 0) {
            return null;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(IB)Z")
    public static final boolean method2857(int arg0, byte arg1) {
        field7029++;
        if (arg1 >= -7) {
            field7023 = 16;
        }
        return arg0 == 0 || arg0 == 4;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/net/Socket;IB)Lhb;")
    public static final class666 method2858(Socket arg0, int arg1, byte arg2) throws IOException {
        if (arg2 > -2) {
            return null;
        } else {
            field7028++;
            return new class565(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Ldd;ILpj;)V")
    public class514(class647 arg0, int arg1, class132 arg2) {
        this.field7026 = arg2;
        this.field7026.method936(1, -128);
        class96 var4 = new class96(this.field7026.method940(0, 0, 0));
        int var5 = var4.method718(102);
        if (var5 > 1) {
            this.field7024 = new int[0][];
        } else {
            int var6 = var4.method718(-107);
            class295[] var7 = class551.method3029(120);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method718(-76);
                    if (var7[var9].field4412 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method718(89);
                int var12 = var4.method718(89);
                this.field7024 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var14 = var4.method718(105);
                    int var15 = var4.method743((byte) -23);
                    this.field7024[var14] = new int[var15];
                    for (int var16 = 0; var16 < var15; var16++) {
                        this.field7024[var13][var16] = var4.method743((byte) -6);
                    }
                }
            } else {
                this.field7024 = new int[0][];
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method2859(int arg0) {
        field7025 = null;
        if (arg0 != -16) {
            field7023 = -13;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II)Lwq;")
    public final class152 method2860(int arg0, int arg1) {
        if (arg0 <= 98) {
            return null;
        }
        field7030++;
        byte[] var3 = this.field7026.method940(1, arg1, 0);
        class152 var4 = new class152();
        var4.method1063(0, new class96(var3));
        return var4;
    }
}
