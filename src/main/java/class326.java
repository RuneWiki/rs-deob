import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public class class326 extends class730 {

    @OriginalMember(owner = "client!dja", name = "y", descriptor = "[I")
    public static int[] field4038 = new int[4096];

    @OriginalMember(owner = "client!dja", name = "A", descriptor = "Lsi;")
    public static class586 field4040;

    @OriginalMember(owner = "client!dja", name = "E", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!dja", name = "p", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!dja", name = "q", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!dja", name = "r", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!dja", name = "s", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!dja", name = "t", descriptor = "I")
    public int field4033;

    @OriginalMember(owner = "client!dja", name = "u", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!dja", name = "v", descriptor = "I")
    public int field4035;

    @OriginalMember(owner = "client!dja", name = "w", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!dja", name = "x", descriptor = "I")
    public int field4037;

    @OriginalMember(owner = "client!dja", name = "z", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!dja", name = "C", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!dja", name = "D", descriptor = "I")
    public int field4043;

    @OriginalMember(owner = "client!dja", name = "F", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!dja", name = "B", descriptor = "J")
    public long field4041;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4038[var0] = class731.method4128(var0, true);
        }
        field4040 = new class586();
        field4044 = -1;
    }

    @OriginalMember(owner = "client!dja", name = "d", descriptor = "(I)I", line = 6)
    public final int method1936(int arg0) {
        if (arg0 != -564899352) {
            field4038 = null;
        }
        field4042++;
        return this.field4035;
    }

    @OriginalMember(owner = "client!dja", name = "c", descriptor = "(I)I", line = 23)
    public final int method1937(int arg0) {
        field4029++;
        int var2 = -64 / ((32 - arg0) / 39);
        return this.field4033;
    }

    @OriginalMember(owner = "client!dja", name = "b", descriptor = "(I)J", line = 33)
    public final long method1938(int arg0) {
        int var2 = 60 % ((arg0 + 34) / 32);
        field4039++;
        return this.field4041;
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(IZ)V", line = 45)
    public static final void method1939(int arg0, boolean arg1) {
        class707.field9935++;
        field4032++;
        class336 var2 = class512.method3076(class689.field9386, class591.field8030, (byte) 114);
        class578.method3334(4, var2);
        class52 var3 = (class52) class728.field10205.method2119(-81);
        if (arg0 >= -97) {
            return;
        }
        while (var3 != null) {
            if (!var3.method2221(8763)) {
                var3 = (class52) class728.field10205.method2119(-75);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field711 == 0) {
                class336.method1989(true, arg1, var3, (byte) 111);
            }
            var3 = (class52) class728.field10205.method2111((byte) 102);
        }
        if (class683.field9354 != null) {
            class576.method3330(class683.field9354, -1);
            class683.field9354 = null;
        }
    }

    @OriginalMember(owner = "client!dja", name = "c", descriptor = "(B)V", line = 86)
    public static void method1940(byte arg0) {
        field4040 = null;
        field4038 = null;
        if (arg0 != -7) {
            field4038 = null;
        }
    }

    @OriginalMember(owner = "client!dja", name = "g", descriptor = "(I)I", line = 97)
    public final int method1941(int arg0) {
        field4031++;
        if (arg0 != 65280) {
            method1945(-26, -60, -5, -79, true);
        }
        return this.field4037;
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "()V", line = 120)
    public static final void method1942() {
        class187.method1243(1, class368.field4569);
    }

    @OriginalMember(owner = "client!dja", name = "d", descriptor = "(B)Lcf;", line = 124)
    public static final class631 method1943(byte arg0) {
        field4034++;
        if (arg0 != 126) {
            field4038 = null;
        }
        return class433.field5718 < class780.field10754.length ? class780.field10754[class433.field5718++] : null;
    }

    @OriginalMember(owner = "client!dja", name = "b", descriptor = "(B)I", line = 148)
    public final int method1944(byte arg0) {
        field4036++;
        if (arg0 <= 114) {
            method1940((byte) 13);
        }
        return this.field4043;
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(IIIIZ)V", line = 160)
    public static final void method1945(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4030++;
        if (class727.field10184 != 1) {
            return;
        }
        int var5 = arg2 / class603.field8149;
        int var6 = arg1 / class603.field8149;
        int var7 = arg0 / class372.field4683;
        int var8 = arg3 / class372.field4683;
        if (class331.field4092 <= var5 || var6 < 0 || class223.field2612 <= var7 || var8 < 0) {
            return;
        }
        if (class331.field4092 <= var6) {
            var6 = class331.field4092 - 1;
        }
        if (class223.field2612 <= var8) {
            var8 = class223.field2612 - 1;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        for (int var9 = var7; var9 <= var8; var9++) {
            int var10 = class764.method4235(var9 + class645.field8791, -56, class223.field2612) * class331.field4092;
            for (int var11 = var5; var11 <= var6; var11++) {
                int var12 = var10 + class764.method4235(class105.field1339 + var11, -99, class331.field4092);
                class534.field7524[var12] = class222.field2581;
            }
        }
        if (arg4) {
            method1942();
        }
    }
}
