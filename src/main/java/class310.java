import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class310 {

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "[I")
    private int[] field4793;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field4794 = 0;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([I)V", line = 4)
    public class310(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field4793 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field4793[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field4793[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field4793[var5 + var5] = arg0[var4];
            this.field4793[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I", line = 47)
    public final int method2177(int arg0, int arg1) {
        field4796++;
        if (arg1 != 25953) {
            method2178(43);
        }
        int var3 = (this.field4793.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field4793[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4793[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 78)
    public static final void method2178(int arg0) {
        field4798++;
        if (class147.field2042) {
            return;
        }
        class147.field2042 = true;
        if (arg0 >= -50) {
            field4792 = -118;
        }
        if (class258.field3925) {
            class280.field4344 = (float) ((int) class280.field4344 + 191 & 0xFFFFFF80);
        } else {
            class272.field4271 += (24.0F - class272.field4271) / 2.0F;
        }
        class90.field1125 = true;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V", line = 102)
    public static final void method2179(byte arg0) {
        field4795++;
        if (class118.field1664 != null && (class118.field1664.field2392 + 64 - class118.field1664.method748(false) * 64 >> 7) == class110.field1538 && (class118.field1664.field2357 + 64 - (class118.field1664.method748(false) * 64) >> 7) == class185.field2669) {
            class110.field1538 = 0;
        }
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var2 = 0; var2 < 104; var2++) {
                class17.field233[var1][var2] = 0;
            }
        }
        for (int var3 = 0; var3 < class204.field2864; var3++) {
            class109 var4 = class328.field5009[class180.field2612[var3]];
            if (var4 != null) {
                var4.field2455 = false;
            }
        }
        int var5 = 0;
        int var6 = -109 / ((74 - arg0) / 46);
        while (var5 < class127.field1735) {
            class184 var7 = class223.field3159[class269.field4238[var5]];
            if (var7 != null) {
                var7.field2455 = false;
            }
            var5++;
        }
    }
}
