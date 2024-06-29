import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class148 {

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field2299 = 0;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "Lbh;")
    public static class251 field2301;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "Lmh;")
    public static class65 field2297;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "[I")
    public static int[] field2298;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIILrk;IZ)V", line = 4)
    public static final void method1026(int arg0, int arg1, int arg2, class205 arg3, int arg4, boolean arg5) {
        field2303++;
        if (class41.field620 >= 50 || arg3.field3313 == null || arg1 >= arg3.field3313.length || arg3.field3313[arg1] == null) {
            return;
        }
        int var6 = arg3.field3313[arg1][0];
        int var7 = var6 & 0xF;
        int var8 = (var6 & 0x7D) >> 4;
        int var9 = -50 / ((-arg4 - 44) / 48);
        int var10 = var6 >> 8;
        if (arg3.field3313[arg1].length > 1) {
            int var11 = (int) (Math.random() * (double) arg3.field3313[arg1].length);
            if (var11 > 0) {
                var10 = arg3.field3313[arg1][var11];
            }
        }
        if (var7 == 0) {
            if (arg5) {
                class201.method1431(var10, var8, 0, -7685);
            }
        } else if (class225.field3606 != 0) {
            class18.field227[class41.field620] = var10;
            class52.field784[class41.field620] = var8;
            int var12 = (arg0 - 64) / 128;
            class38.field587[class41.field620] = 0;
            class271.field4360[class41.field620] = null;
            int var13 = (arg2 - 64) / 128;
            class38.field595[class41.field620] = (var13 << 16) + (var12 << 8) + var7;
            class41.field620++;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lbc;BZ)V", line = 68)
    public static final void method1027(class302 arg0, byte arg1, boolean arg2) {
        field2302++;
        int var3 = arg0.field4952 == 0 ? arg0.field4949 : arg0.field4952;
        int var4 = arg0.field5043 == 0 ? arg0.field4936 : arg0.field5043;
        class22.method151(var4, arg0.field4910, arg2, class273.field4446[arg0.field4910 >> 16], -1, var3);
        if (arg1 != -118) {
            return;
        }
        if (arg0.field4988 != null) {
            class22.method151(var4, arg0.field4910, arg2, arg0.field4988, -1, var3);
        }
        class187 var5 = (class187) class113.field1658.method617((long) arg0.field4910, false);
        if (var5 != null) {
            class158.method1118(var4, arg2, var3, var5.field3052, true);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 94)
    public static void method1028(int arg0) {
        if (arg0 != -1038590712) {
            method1026(-66, 104, 8, (class205) null, 86, true);
        }
        field2298 = null;
        field2297 = null;
        field2301 = null;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V", line = 112)
    public static final void method1029(int arg0) {
        if (class313.field5283 == null || class136.field2040 == null) {
            class313.field5283 = new int[256];
            class136.field2040 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class313.field5283[var1] = (int) (Math.sin(var2) * 4096.0D);
                class136.field2040[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 == -16452) {
            field2300++;
        }
    }
}
