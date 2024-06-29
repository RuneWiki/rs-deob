import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class118 extends class546 {

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public int field1596;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "J")
    public static long field1594 = -1L;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Z")
    public static boolean field1597 = false;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Lgca;")
    public static class227 field1592 = new class227();

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "Lem;")
    public static class206 field1600 = new class206(83, 6);

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lia;Lia;B)V")
    public static final void method837(class546 arg0, class546 arg1, byte arg2) {
        if (arg1.field7404 != null) {
            arg1.method3074((byte) 48);
        }
        field1595++;
        arg1.field7404 = arg0.field7404;
        arg1.field7399 = arg0;
        if (arg2 == 6) {
            arg1.field7404.field7399 = arg1;
            arg1.field7399.field7404 = arg1;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lin;IZI)V")
    public static final void method838(class78 arg0, int arg1, boolean arg2, int arg3) {
        if (class426.field5971) {
            class488 var4 = class698.field9905 == -1 ? null : class71.field952.method1977((byte) 58, class698.field9905);
            if (client.method1679(arg0).method1850(1) && (class89.field1283 & 0x20) != 0 && (var4 == null || arg0.method610(class698.field9905, -21048, var4.field6697) != var4.field6697)) {
                class547.method3077(45, arg0.field1129, class178.field2551, class547.field7417, false, true, class185.field2679 + " -> " + arg0.field1101, 0L, -52, arg0.field1034, arg0.field1145);
                class372.field5007++;
            }
        }
        field1593++;
        if (!arg2) {
            field1597 = false;
        }
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class206.method1339(arg0, var5, 4);
            if (var9 != null) {
                class547.method3077(1011, arg0.field1129, var9, class86.method641((byte) -3, var5, arg0), false, true, arg0.field1101, (long) (var5 + 1), -111, arg0.field1034, arg0.field1145);
                class301.field4125++;
            }
        }
        String var6 = class46.method381(-1, arg0);
        if (var6 != null) {
            class547.method3077(2, arg0.field1129, var6, arg0.field1041, false, true, arg0.field1101, 0L, -76, arg0.field1034, arg0.field1145);
            class250.field3416++;
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class206.method1339(arg0, var7, 4);
            if (var8 != null) {
                class547.method3077(5, arg0.field1129, var8, class86.method641((byte) -3, var7, arg0), false, true, arg0.field1101, (long) (var7 + 1), -123, arg0.field1034, arg0.field1145);
                class301.field4125++;
            }
        }
        if (!client.method1679(arg0).method1843(1)) {
            return;
        }
        if (arg0.field1140 == null) {
            class547.method3077(20, arg0.field1129, class65.field797.method555(class697.field9900, true), -1, false, true, "", 0L, -126, arg0.field1034, arg0.field1145);
        } else {
            class547.method3077(20, arg0.field1129, arg0.field1140, -1, false, true, "", 0L, -115, arg0.field1034, arg0.field1145);
        }
        class462.field6368++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method839(byte arg0) {
        if (arg0 != 62) {
            method841(-24);
        }
        field1600 = null;
        field1592 = null;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(I)V")
    public class118(int arg0) {
        this.field1596 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)I")
    public static final int method840(int arg0, int arg1) {
        field1601++;
        int var2 = (arg1 & 0x55555555) + ((arg1 & 0xAAAAAAAA) >>> 1);
        if (arg0 != 287490690) {
            method840(98, 22);
        }
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0xB3333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static final void method841(int arg0) {
        field1598++;
        if (class256.field3495 == null || class76.field995 == null) {
            class256.field3495 = new int[256];
            class76.field995 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class256.field3495[var1] = (int) (Math.sin(var2) * 4096.0D);
                class76.field995[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != 0) {
            field1600 = null;
        }
    }
}
