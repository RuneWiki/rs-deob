import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class295 extends class117 {

    @OriginalMember(owner = "client!ss", name = "I", descriptor = "I")
    public static int field4215 = 0;

    @OriginalMember(owner = "client!ss", name = "D", descriptor = "J")
    public static long field4210 = -1L;

    @OriginalMember(owner = "client!ss", name = "A", descriptor = "I")
    public int field4208;

    @OriginalMember(owner = "client!ss", name = "E", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!ss", name = "H", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!ss", name = "K", descriptor = "I")
    public int field4217;

    @OriginalMember(owner = "client!ss", name = "L", descriptor = "I")
    public int field4218;

    @OriginalMember(owner = "client!ss", name = "N", descriptor = "I")
    public int field4219;

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "Lob;")
    public class516 field4207;

    @OriginalMember(owner = "client!ss", name = "J", descriptor = "Ljava/lang/String;")
    public String field4216;

    @OriginalMember(owner = "client!ss", name = "y", descriptor = "[I")
    public int[] field4206;

    @OriginalMember(owner = "client!ss", name = "B", descriptor = "[I")
    public int[] field4209;

    @OriginalMember(owner = "client!ss", name = "F", descriptor = "[Lcv;")
    public class398[] field4212;

    @OriginalMember(owner = "client!ss", name = "G", descriptor = "[Ljava/lang/String;")
    public String[] field4213;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "(I)V", line = 12)
    public static final void method1822(int arg0) {
        if (arg0 != -1) {
            field4210 = -38L;
        }
        field4214++;
        if (class342.field5222) {
            return;
        }
        if (class397.field5830.field150) {
            class382.field5684 = ((int) class382.field5684 - 17 & 0xFFFFFFF0);
        } else {
            class434.field6315 += (-12.0F - class434.field6315) / 2.0F;
        }
        class163.field2465 = true;
        class342.field5222 = true;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lat;IIIII)V", line = 45)
    public static final void method1823(class255 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field3686 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field3682[var6] != null) {
                arg0.field3686++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field3686; var7++) {
            long var8 = class371.field5544[arg1][arg2][arg3];
            while (var8 != 0L) {
                class480 var14 = class242.field3512[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field3682[var7] == var14.field7047) {
                    continue label50;
                }
            }
            long var10 = class371.field5544[arg1][arg4][arg5];
            while (var10 != 0L) {
                class480 var13 = class242.field3512[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field3682[var7] == var13.field7047) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field3686 - 1; var12++) {
                arg0.field3682[var12] = arg0.field3682[var12 + 1];
            }
            arg0.field3686--;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIII)V", line = 105)
    public static final void method1824(int arg0, int arg1, int arg2, int arg3) {
        field4211++;
        int var4 = class397.field5830.field141 * arg0 >> 8;
        if (arg1 != -9574) {
            return;
        }
        if (arg3 == -1 && !class124.field1918) {
            class186.method1289(arg1 + 38498);
        } else if (arg3 != -1 && (class277.field3994 != arg3 || !class54.method391(1)) && var4 != 0 && !class124.field1918) {
            class400.method2491(var4, (byte) -120, arg3, arg2, false, class427.field6244, 0);
        }
        class277.field3994 = arg3;
    }
}
