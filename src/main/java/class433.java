import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class433 {

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
    public static int field6319 = 1338;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "Lho;")
    public static class103 field6314 = new class103(67, 2);

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "B")
    public byte field6303;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "B")
    public byte field6312;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "B")
    public byte field6313;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "B")
    public byte field6315;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "B")
    public byte field6317;

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "B")
    public byte field6320;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "B")
    public byte field6323;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
    public int field6306;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
    public int field6321;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "S")
    public short field6309;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "Z")
    public boolean field6302;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "Z")
    public boolean field6305;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "Z")
    public boolean field6310;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "Z")
    public boolean field6311;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "Z")
    public boolean field6316;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "Z")
    public boolean field6318;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "Z")
    public boolean field6322;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "Z")
    public boolean field6324;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "Z")
    public boolean field6325;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
    public static void method2664(int arg0) {
        field6314 = null;
        if (arg0 != 48) {
            method2666();
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(JZIII)Ljava/lang/String;")
    public static final String method2665(long arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field6307++;
        char var6 = ',';
        char var7 = '.';
        if (arg3 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg3 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg0 < 0L) {
            var8 = true;
            arg0 = -arg0;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg2 > 0) {
            for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg0 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg0 * 10));
            if (arg0 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                if (arg4 != 10) {
                    field6319 = -13;
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "()V")
    public static final void method2666() {
        class425.method2617(1, class478.field7065);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILjk;Z)V")
    public static final void method2667(int arg0, class450 arg1, boolean arg2) {
        field6304++;
        int var3 = arg1.field6632 == 0 ? arg1.field6612 : arg1.field6632;
        int var4 = arg1.field6684 == arg0 ? arg1.field6573 : arg1.field6684;
        class60.method364(arg1.field6558, var3, var4, arg2, class339.field4491[arg1.field6558 >> 16], (byte) -125);
        if (arg1.field6643 != null) {
            class60.method364(arg1.field6558, var3, var4, arg2, arg1.field6643, (byte) -124);
        }
        class360 var5 = (class360) class152.field1989.method295((long) arg1.field6558, -112);
        if (var5 != null) {
            class514.method3065(-1, var3, var4, var5.field4886, arg2);
        }
    }
}
