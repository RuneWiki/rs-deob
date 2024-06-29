import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class77 extends class18 {

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "Z")
    public static boolean field1260 = true;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    public static int field1262 = 0;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public static int field1266 = 0;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
    public static int field1263 = -1;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    public static int field1265 = 0;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "Luc;")
    private class39 field1267;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/lang/String;BI)Ljava/lang/String;")
    public final String method545(String arg0, byte arg1, int arg2) {
        if (arg1 != 18) {
            this.field1267 = null;
        }
        field1269++;
        if (this.field1267 == null) {
            return arg0;
        } else {
            class244 var4 = (class244) this.field1267.method285((long) arg2, arg1 ^ 0x35EF);
            return var4 == null ? arg0 : var4.field3970;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BIIII)V")
    public static final void method546(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 36) {
            method546((byte) 75, 53, 49, 46, -9);
        }
        if ((arg2 - arg3) >= class223.field3423 && (arg2 + arg3) <= class148.field2338 && arg1 - arg3 >= class90.field1568 && arg1 + arg3 <= class266.field4247) {
            class25.method207(arg3, arg1, (byte) -53, arg2, arg4);
        } else {
            class291.method1952(arg3, arg4, -127, arg1, arg2);
        }
        field1264++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLai;I)V")
    private final void method547(byte arg0, class88 arg1, int arg2) {
        if (arg0 != 14) {
            return;
        }
        field1259++;
        if (arg2 != 249) {
            return;
        }
        int var4 = arg1.method633(arg0 + 76);
        if (this.field1267 == null) {
            int var5 = class89.method685(var4, -1609027472);
            this.field1267 = new class39(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg1.method633(71) == 1;
            int var8 = arg1.method671(113);
            class166 var9;
            if (var7) {
                var9 = new class244(arg1.method675((byte) 16));
            } else {
                var9 = new class120(arg1.method641(-1));
            }
            this.field1267.method281(1, (long) var8, var9);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZC)Z")
    public static final boolean method548(boolean arg0, char arg1) {
        field1270++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class292.field4593;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        if (!arg0) {
            method548(true, '^');
        }
        return false;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lai;I)V")
    public final void method549(class88 arg0, int arg1) {
        if (arg1 <= 65) {
            field1265 = -36;
        }
        field1271++;
        while (true) {
            int var3 = arg0.method633(70);
            if (var3 == 0) {
                return;
            }
            this.method547((byte) 14, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZII)I")
    public final int method550(boolean arg0, int arg1, int arg2) {
        field1268++;
        if (this.field1267 == null) {
            return arg2;
        }
        if (arg0) {
            this.method547((byte) 95, (class88) null, -6);
        }
        class120 var4 = (class120) this.field1267.method285((long) arg1, 13821);
        return var4 == null ? arg2 : var4.field1932;
    }
}
