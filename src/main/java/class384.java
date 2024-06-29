import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class384 {

    @OriginalMember(owner = "client!es", name = "h", descriptor = "B")
    public byte field5570;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "Lej;")
    public static class124 field5565 = new class124(6, -1);

    @OriginalMember(owner = "client!es", name = "n", descriptor = "Lej;")
    public static class124 field5576 = new class124(64, -1);

    @OriginalMember(owner = "client!es", name = "s", descriptor = "[J")
    public static long[] field5581 = new long[100];

    @OriginalMember(owner = "client!es", name = "m", descriptor = "D")
    public static double field5575;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!es", name = "l", descriptor = "Lqfa;")
    public class100 field5574;

    @OriginalMember(owner = "client!es", name = "o", descriptor = "Lqfa;")
    public class100 field5577;

    @OriginalMember(owner = "client!es", name = "k", descriptor = "Laba;")
    public class177 field5573;

    @OriginalMember(owner = "client!es", name = "q", descriptor = "Lfha;")
    public class380 field5579;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "Les;")
    public class384 field5571;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "Lun;")
    public class424 field5566;

    @OriginalMember(owner = "client!es", name = "p", descriptor = "Lun;")
    public class424 field5578;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "Loga;")
    public class474 field5567;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "S")
    public short field5568;

    @OriginalMember(owner = "client!es", name = "g", descriptor = "S")
    public short field5569;

    @OriginalMember(owner = "client!es", name = "j", descriptor = "S")
    public short field5572;

    @OriginalMember(owner = "client!es", name = "r", descriptor = "S")
    public short field5580;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
    public final void method2416(boolean arg0) {
        while (this.field5567 != null) {
            class474 var2 = this.field5567.field6621;
            this.field5567.method2792((byte) -106);
            this.field5567 = var2;
        }
        field5564++;
        if (!arg0) {
            method2417(41, false, -64, 33L, -50);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IZIJI)Ljava/lang/String;")
    public static final String method2417(int arg0, boolean arg1, int arg2, long arg3, int arg4) {
        field5563++;
        char var6 = ',';
        char var7 = '.';
        if (arg2 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg2 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg3 < 0L) {
            arg3 = -arg3;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg0 > 0) {
            for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg3 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg3 * 10));
            if (arg3 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                if (arg4 != 16980) {
                    field5581 = null;
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

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(I)V")
    public class384(int arg0) {
        this.field5570 = (byte) arg0;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
    public static void method2418(int arg0) {
        field5581 = null;
        field5565 = null;
        if (arg0 >= -45) {
            field5576 = null;
        }
        field5576 = null;
    }
}
