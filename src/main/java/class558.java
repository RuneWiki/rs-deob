import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class558 {

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "Z")
    public boolean field7091 = true;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field7086 = 1;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "Lkka;")
    public static class542 field7097 = new class542();

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "Lrn;")
    public static class633 field7099 = new class633(5, 4);

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "C")
    private char field7090;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field7087;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field7092;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    public int field7096;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "Luaa;")
    public static class391 field7088;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "Ljava/lang/String;")
    public String field7095;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "[I")
    public static int[] field7098;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "[I")
    public static int[] field7100;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILmc;I)V")
    private final void method3023(int arg0, class234 arg1, int arg2) {
        if (arg2 == 1) {
            this.field7090 = class752.method4080(arg1.method1554(27806), (byte) 46);
        } else if (arg2 == 2) {
            this.field7096 = arg1.method1497((byte) 68);
        } else if (arg2 == 4) {
            this.field7091 = false;
        } else if (arg2 == 5) {
            this.field7095 = arg1.method1540((byte) -105);
        }
        field7087++;
        int var4 = 73 % ((arg0 - 24) / 61);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public static void method3024(int arg0) {
        field7088 = null;
        field7100 = null;
        field7098 = null;
        if (arg0 != -23451) {
            field7088 = null;
        }
        field7097 = null;
        field7099 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)Z")
    public static final boolean method3025(int arg0, int arg1, int arg2) {
        if (arg2 != -15197) {
            method3026(46, 23, 9, -3, 25);
        }
        field7093++;
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIII)V")
    public static final void method3026(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7094++;
        if (arg4 >= -108) {
            method3025(-69, -49, 48);
        }
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class774.method4226(class498.field6390, (byte) -75, class30.field274, arg1 + arg2);
        int var10 = class774.method4226(class498.field6390, (byte) -60, class30.field274, arg1 - arg2);
        class54.method333(var9, class207.field2840[arg3], 7, var10, arg0);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg3 - var6;
                int var12 = arg3 + var6;
                if (class80.field1131 <= var12 && class405.field5375 >= var11) {
                    int var13 = class774.method4226(class498.field6390, (byte) -90, class30.field274, arg1 + var5);
                    int var14 = class774.method4226(class498.field6390, (byte) -82, class30.field274, arg1 - var5);
                    if (var12 <= class405.field5375) {
                        class54.method333(var13, class207.field2840[var12], 7, var14, arg0);
                    }
                    if (class80.field1131 <= var11) {
                        class54.method333(var13, class207.field2840[var11], 7, var14, arg0);
                    }
                }
            }
            var5++;
            int var15 = arg3 - var5;
            int var16 = arg3 + var5;
            if (class80.field1131 <= var16 && class405.field5375 >= var15) {
                int var17 = class774.method4226(class498.field6390, (byte) -20, class30.field274, arg1 + var6);
                int var18 = class774.method4226(class498.field6390, (byte) -46, class30.field274, arg1 - var6);
                if (class405.field5375 >= var16) {
                    class54.method333(var17, class207.field2840[var16], 7, var18, arg0);
                }
                if (class80.field1131 <= var15) {
                    class54.method333(var17, class207.field2840[var15], 7, var18, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lmc;I)V")
    public final void method3027(class234 arg0, int arg1) {
        field7089++;
        if (arg1 < 67) {
            return;
        }
        while (true) {
            int var3 = arg0.method1509(true);
            if (var3 == 0) {
                return;
            }
            this.method3023(100, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(III)Lsi;")
    public static final class721 method3028(int arg0, int arg1, int arg2) {
        class766 var3 = class28.field252[arg0][arg1][arg2];
        return var3 == null ? null : var3.field10423;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)Z")
    public final boolean method3029(boolean arg0) {
        if (arg0) {
            field7092++;
            return this.field7090 == 's';
        } else {
            return false;
        }
    }
}
