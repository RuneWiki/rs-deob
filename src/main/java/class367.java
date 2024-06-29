import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public abstract class class367 {

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)Lwv;")
    public abstract class26 method14(byte arg0);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IB)V")
    public abstract void method22(int arg0, byte arg1);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    public static final void method2181(String arg0, byte arg1, int arg2) {
        field5012++;
        if (arg1 != 107) {
            method2182((byte) -9);
        }
        class492.method2979(class161.field2100, arg1 + 15);
        class242.field3200++;
        class106.field1443.method2449((byte) 117, class424.method2613(1, arg0) + 1);
        class106.field1443.method2449((byte) 115, arg2);
        class106.field1443.method2415(arg0, 21742);
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(IB)I")
    public abstract int method26(int arg0, byte arg1);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZ)[B")
    public abstract byte[] method16(int arg0, boolean arg1);

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)V")
    public static final void method2182(byte arg0) {
        if (arg0 <= 94) {
            method2181(null, (byte) 64, 4);
        }
        field5010++;
        int var1 = class68.field775.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class68.field775[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class42.field456; var4++) {
                    if (class467.field6937[var2] == class257.field3428[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class257.field3428[class42.field456] = class467.field6937[var2];
                    var3 = class42.field456++;
                }
                class396 var5 = new class396(class68.field775[var2]);
                int var6 = 0;
                while (var5.field5729 < class68.field775[var2].length && var6 < 511 && class401.field5813 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method2386(-23648);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FFD) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class467.field6937[var2] >> 8) * 64 + var10 - class357.field4867;
                    int var13 = (class467.field6937[var2] & 0xFF) * 64 + var11 - class418.field6074;
                    class212 var14 = class87.field1032.method1670((byte) -110, var5.method2386(-23648));
                    if (class339.field4484[var7] == null && (var14.field2881 & 0x1) > 0 && class253.field3369 == var9 && var12 >= 0 && var12 + var14.field2904 < class308.field4128 && var13 >= 0 && class426.field6200 > var14.field2904 + var13) {
                        class339.field4484[var7] = new class22();
                        class339.field4484[var7].field1211 = var7;
                        class22 var15 = class339.field4484[var7];
                        class337.field4465[class401.field5813++] = var7;
                        var15.field1229 = class532.field7836;
                        var15.method124(true, var14);
                        var15.method550((byte) 15, var15.field220.field2904);
                        var15.field1200 = var15.field220.field2860 << 3;
                        if (var15.field1200 == 0) {
                            var15.method553(0, 63);
                        } else {
                            var15.method553(var15.field220.field2858 + 4 << 11 & 0x388F, 125);
                        }
                        var15.method125(var15.method546(24273), true, 0, var13, var9, var12);
                    }
                }
            }
        }
    }
}
