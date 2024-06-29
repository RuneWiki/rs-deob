import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class370 {

    @OriginalMember(owner = "client!df", name = "y", descriptor = "B")
    public byte field5506;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Low;")
    public static class319 field5487 = new class319();

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "Leq;")
    public class195 field5501;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "Leq;")
    public class195 field5503;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Ltea;")
    public class219 field5494;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Ldf;")
    public class370 field5492;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "Lpc;")
    public class624 field5491;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "Lpc;")
    public class624 field5493;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "Lar;")
    public class636 field5497;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "Lps;")
    public class82 field5495;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "S")
    public short field5498;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "S")
    public short field5499;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "S")
    public short field5502;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "S")
    public short field5504;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "[I")
    public static int[] field5489;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)V")
    public static final void method2339(boolean arg0, int arg1) {
        field5488++;
        int var2 = class336.field5031 - class562.field8093;
        if (var2 >= 100) {
            class423.field6123 = 1;
            class488.field6995 = -1;
            class266.field3950 = -1;
            return;
        }
        int var3 = (int) class27.field926;
        if (var3 < (class697.field9817 >> 8)) {
            var3 = class697.field9817 >> 8;
        }
        if (!arg0) {
            method2346(true, (byte) 85, -9, null);
        }
        if (class409.field5926[4] && var3 < (class679.field9631[4] + 128)) {
            var3 = class679.field9631[4] + 128;
        }
        int var4 = (int) class591.field8509 + class295.field4422 & 0x3FFF;
        class198.method1421(var3, arg1, (var3 >> 3) * 3 + 600 << 2, class369.field5478, var4, class98.field1762, class460.method2757(0, class532.field7456.field9815, class37.field1046, class532.field7456.field9806) - 200, 115);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class1.field97 = (int) ((float) (class1.field97 - class641.field9225) * var5 + (float) class641.field9225);
        class499.field7113 = (int) ((float) (class499.field7113 - class405.field5848) * var5 + (float) class405.field5848);
        class206.field3158 = (int) ((float) (class206.field3158 - class453.field6464) * var5 + (float) class453.field6464);
        class537.field7518 = (int) ((float) (class537.field7518 - class386.field5662) * var5 + (float) class386.field5662);
        int var6 = class517.field7300 - class2.field380;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class517.field7300 = (int) ((float) var6 * var5 + (float) class2.field380);
        class517.field7300 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public final void method2340(byte arg0) {
        while (this.field5497 != null) {
            class636 var2 = this.field5497.field9171;
            this.field5497.method3632((byte) -123);
            this.field5497 = var2;
        }
        if (arg0 != -63) {
            this.field5493 = null;
        }
        field5486++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Z")
    public static final boolean method2341(int arg0, int arg1, int arg2) {
        int var3 = 115 % ((arg2 + 85) / 40);
        field5484++;
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
    public static void method2342(byte arg0) {
        field5487 = null;
        int var1 = -8 % ((72 - arg0) / 45);
        field5489 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B[I[Ljava/lang/Object;II)V")
    public static final void method2343(byte arg0, int[] arg1, Object[] arg2, int arg3, int arg4) {
        int var5 = -74 % ((arg0 - 20) / 58);
        if (arg4 < arg3) {
            int var6 = (arg3 + arg4) / 2;
            int var7 = arg4;
            int var8 = arg1[var6];
            arg1[var6] = arg1[arg3];
            arg1[arg3] = var8;
            Object var9 = arg2[var6];
            arg2[var6] = arg2[arg3];
            arg2[arg3] = var9;
            int var10 = ~var8 == Integer.MIN_VALUE ? 0 : 1;
            for (int var11 = arg4; var11 < arg3; var11++) {
                if (arg1[var11] < var8 + (var10 & var11)) {
                    int var12 = arg1[var11];
                    arg1[var11] = arg1[var7];
                    arg1[var7] = var12;
                    Object var13 = arg2[var11];
                    arg2[var11] = arg2[var7];
                    arg2[var7++] = var13;
                }
            }
            arg1[arg3] = arg1[var7];
            arg1[var7] = var8;
            arg2[arg3] = arg2[var7];
            arg2[var7] = var9;
            method2343((byte) -86, arg1, arg2, var7 - 1, arg4);
            method2343((byte) 95, arg1, arg2, arg3, var7 + 1);
        }
        field5485++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IB)C")
    public static final char method2344(int arg0, byte arg1) {
        field5500++;
        if (arg0 != -7588) {
            method2346(true, (byte) -89, 92, null);
        }
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class343.field5108[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BII)Z")
    public static final boolean method2345(byte arg0, int arg1, int arg2) {
        if (arg0 == -22) {
            field5482++;
            return class88.method866((byte) -15, arg1, arg2) || class112.method1008((byte) -52, arg2, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(I)V")
    public class370(int arg0) {
        this.field5506 = (byte) arg0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZBILr;)Llb;")
    public static final class505 method2346(boolean arg0, byte arg1, int arg2, class167 arg3) {
        field5505++;
        if (arg2 == -1) {
            return null;
        }
        if (class636.field9175 != null) {
            for (int var4 = 0; var4 < class636.field9175.length; var4++) {
                if (class636.field9175[var4] == arg2) {
                    return class645.field9299[var4];
                }
            }
        }
        class505 var5 = (class505) class194.field3046.method1900((long) arg2, -39);
        if (var5 != null) {
            if (arg0 && var5.field7170 == null) {
                class11 var6 = class492.method2951(arg2, class292.field4390, (byte) -125);
                if (var6 == null) {
                    return null;
                }
                var5.field7170 = var6;
            }
            return var5;
        } else if (arg1 > -21) {
            return null;
        } else {
            class279[] var7 = class279.method1840(class217.field3305, arg2);
            if (var7 == null) {
                return null;
            }
            class11 var8 = class492.method2951(arg2, class292.field4390, (byte) -116);
            if (var8 == null) {
                return null;
            }
            class505 var9;
            if (arg0) {
                var9 = new class505(arg3.method160(var8, var7, true), var8);
            } else {
                var9 = new class505(arg3.method160(var8, var7, true));
            }
            class194.field3046.method1904(var9, (long) arg2, -1);
            return var9;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(IB)Lfe;")
    public static final class531 method2347(int arg0, byte arg1) {
        field5483++;
        class578[] var2 = class278.field4157;
        synchronized (class278.field4157) {
            if (arg1 > -120) {
                field5489 = null;
            }
            class531 var3;
            if (arg0 >= class278.field4157.length || class278.field4157[arg0].method3323((byte) -68)) {
                var3 = new class531();
                var3.field7451 = new class684[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    var3.field7451[var4] = new class684();
                }
            } else {
                var3 = (class531) class278.field4157[arg0].method3316(-7405);
                var3.method1318(8);
                int var10002 = class239.field3539[arg0]--;
            }
            return var3;
        }
    }
}
