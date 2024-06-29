import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public abstract class class19 {

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "Lrg;")
    public static class548 field130 = new class548(62, -1);

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
    public int field131;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "I")
    public int field134;

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "I")
    public int field137;

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!bu", name = "m", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!bu", name = "n", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "Lha;")
    public static class52 field138;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
    public static final void method123(int arg0) {
        class473.field6634 = false;
        field129++;
        class450.method2636(class594.field8623, class521.field7314, class609.field8848, 0, class308.field3933);
        if (arg0 != 2169) {
            method124(-56, 121, 77);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)Lbq;")
    public static final class241 method124(int arg0, int arg1, int arg2) {
        class349 var3 = class383.field5070[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4496;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Ldn;Ldn;I)V")
    public static final void method125(class438 arg0, class438 arg1, int arg2) {
        class595.field8632 = arg1;
        class328.field4286 = arg0;
        if (arg2 != 32) {
            field130 = null;
        }
        field132++;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)Z")
    public final boolean method126(int arg0) {
        if (arg0 != -1) {
            field130 = null;
        }
        field140++;
        return (this.field137 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method127(boolean arg0, String arg1, int arg2) {
        field135++;
        class200.field2405.field6068 = 1;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class449.field6217.field4733; var6++) {
            class607 var10 = class449.field6217.method2026((byte) -110, var6);
            if ((!arg0 || var10.field8790) && var10.field8820 == -1 && var10.field8752 == -1 && var10.field8778 == 0 && var10.field8805.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class160.field1941 = null;
                    class585.field8497 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var11 = new short[var4.length * 2];
                    for (int var12 = 0; var12 < var5; var12++) {
                        var11[var12] = var4[var12];
                    }
                    var4 = var11;
                }
                var4[var5++] = (short) var6;
            }
        }
        class585.field8497 = var5;
        class247.field3162 = 0;
        class160.field1941 = var4;
        String[] var7 = new String[class585.field8497];
        for (int var8 = 0; var8 < class585.field8497; var8++) {
            var7[var8] = class449.field6217.method2026((byte) -80, var4[var8]).field8805;
        }
        class620.method3561(var7, (byte) 125, class160.field1941);
        int var9 = 83 / ((arg2 + 26) / 41);
        class200.field2405.method2549(-46);
        class200.field2405.field6068 = 2;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)Z")
    public final boolean method128(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field141++;
            return (this.field137 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)Z")
    public final boolean method129(byte arg0) {
        if (arg0 == 34) {
            field139++;
            return (this.field137 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(BI)V")
    public static final void method130(byte arg0, int arg1) {
        if (arg0 <= 90) {
            return;
        }
        field128++;
        if (class91.field1121 == 1) {
            class491.field6854 = arg1;
        } else if (class91.field1121 == 2 || class91.field1121 == 3) {
            class518.field7295 = arg1;
        }
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)V")
    public static void method131(int arg0) {
        field130 = null;
        field138 = null;
        if (arg0 <= 26) {
            field130 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method132(int arg0, String arg1) throws ClassNotFoundException {
        field133++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else {
            if (arg0 != 0) {
                field130 = null;
            }
            if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "(I)Z")
    public final boolean method133(int arg0) {
        if (arg0 == 0) {
            field136++;
            return (this.field137 & 0x8) != 0;
        } else {
            return true;
        }
    }
}
