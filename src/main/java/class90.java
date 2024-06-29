import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class90 {

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "Lmha;")
    public static class701 field1214 = new class701(9, 0, 4, 1);

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "[I")
    public static int[] field1219 = new int[32];

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)Z")
    public static final boolean method543(int arg0, int arg1, int arg2) {
        field1220++;
        if (arg2 != 0) {
            method545(122);
        }
        return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILjm;)I")
    public static final int method544(int arg0, class6 arg1) {
        field1216++;
        String var2 = class159.method995(87, arg1);
        int[] var3 = null;
        if (arg0 != -58437792) {
            field1219 = null;
        }
        if (class50.method341(-91, arg1.field60)) {
            var3 = class487.field6572.method3054((int) arg1.field47, (byte) -99).field7666;
        } else if (arg1.field52 != -1) {
            var3 = class487.field6572.method3054(arg1.field52, (byte) -99).field7666;
        } else if (class462.method2765((byte) -123, arg1.field60)) {
            class15 var4 = (class15) class403.field5587.method1381(true, (long) ((int) arg1.field47));
            if (var4 != null) {
                class55 var5 = var4.field204;
                class11 var6 = var5.field771;
                if (var6.field111 != null) {
                    var6 = var6.method55((byte) 118, class554.field7826);
                }
                if (var6 != null) {
                    var3 = var6.field162;
                }
            }
        } else if (class464.method2770(arg1.field60, -46)) {
            Object var7 = null;
            class30 var8;
            if (arg1.field60 == 1001) {
                var8 = class264.field3604.method3188((int) arg1.field47, (byte) -57);
            } else {
                var8 = class264.field3604.method3188((int) (arg1.field47 >>> 32 & 0x7FFFFFFFL), (byte) -57);
            }
            if (var8.field455 != null) {
                var8 = var8.method219(-1, class554.field7826);
            }
            if (var8 != null) {
                var3 = var8.field453;
            }
        }
        if (var3 != null) {
            var2 = var2 + class278.method1672(var3, (byte) 27);
        }
        int var9 = class514.field7181.method4140(1, var2, class298.field3904);
        if (arg1.field46) {
            var9 += class575.field8113.method115() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
    public static void method545(int arg0) {
        field1219 = null;
        if (arg0 != 9) {
            method544(57, null);
        }
        field1214 = null;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(III)Z")
    public static final boolean method546(int arg0, int arg1, int arg2) {
        field1218++;
        if (arg1 != 7804) {
            method547((byte) 32, 13, 37, -37);
        }
        return (arg2 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BIII)V")
    public static final void method547(byte arg0, int arg1, int arg2, int arg3) {
        class429.field5916 = new byte[arg1][arg2][arg3];
        if (arg0 == 12) {
            field1215++;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lvj;B)Lnd;")
    public static final class499 method548(class26 arg0, byte arg1) {
        field1213++;
        if (arg1 != -45) {
            method544(119, null);
        }
        return new class499(arg0.method173(-3), arg0.method173(-3), arg0.method173(-3), arg0.method173(-3), arg0.method186((byte) 96), arg0.method186((byte) 122), arg0.method194((byte) 119));
    }
}
