import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class291 extends class465 {

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "Ljava/lang/Object;")
    private Object field4177;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "Z")
    public static boolean field4172 = true;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "Z")
    public static volatile boolean field4174 = false;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "Lum;")
    public static class362 field4173;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLki;)V")
    public static final void method1861(byte arg0, class498 arg1) {
        if (arg0 != -104) {
            field4173 = null;
        }
        class356.field5471.method1686(-4, arg1.method2987((byte) -121));
        field4178++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method555(int arg0) {
        int var2 = -26 % ((arg0 - 70) / 52);
        field4180++;
        return this.field4177;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(CI)B")
    public static final byte method1862(char arg0, int arg1) {
        if (arg1 != 24237) {
            method1863(-52, -122, null);
        }
        field4181++;
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILic;)Lsh;")
    public static final class49 method1863(int arg0, int arg1, class491 arg2) {
        int var3 = -12 % ((arg0 + 19) / 37);
        field4179++;
        byte[] var4 = arg2.method2944(arg1, 64);
        return var4 == null ? null : new class49(var4);
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lvs;Ljava/lang/Object;I)V")
    public class291(class416 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field4177 = arg1;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)Z")
    public final boolean method554(byte arg0) {
        if (arg0 != 68) {
            method1861((byte) 15, null);
        }
        field4176++;
        return false;
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)V")
    public static void method1864(int arg0) {
        if (arg0 != -12696) {
            field4174 = true;
        }
        field4173 = null;
    }
}
