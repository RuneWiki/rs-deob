import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class159 {

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public int field2397;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Ljava/lang/String;")
    public String field2393;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1145(int arg0) {
        field2394++;
        int var1 = class333.field5117;
        int[] var2 = class459.field6766;
        for (int var3 = arg0; var3 < var1; var3++) {
            class62 var4 = class390.field5783[var2[var3]];
            if (var4 != null) {
                class192.method1314(var4.method184(1), var4, arg0 ^ 0x2F);
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZI)I", line = 32)
    public static final int method1146(boolean arg0, int arg1) {
        if (arg0) {
            return -59;
        }
        int var7 = arg1 - 1;
        field2396++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V", line = 50)
    public static final void method1147(int arg0) {
        field2395++;
        if (class378.field5635) {
            return;
        }
        if (arg0 != -31166) {
            method1146(true, 59);
        }
        if (class397.field5830.field150) {
            class66.field1161 = ((int) class66.field1161 + 191 & 0xFFFFFF80);
        } else {
            class278.field4008 += (24.0F - class278.field4008) / 2.0F;
        }
        class378.field5635 = true;
        class163.field2465 = true;
    }
}
