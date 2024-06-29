import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class337 {

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    public static int field4305 = 0;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "B")
    public byte field4308;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public int field4300;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "Ljava/lang/String;")
    public String field4304;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "Ljava/lang/String;")
    public String field4306;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "Ljava/lang/String;")
    public String field4307;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "Ljava/lang/String;")
    public String field4309;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ldl;)V", line = 15)
    public static final void method1990(class86 arg0) {
        if (class278.field3564 >= 65535) {
            return;
        }
        class182 var1 = arg0.field1155;
        class121.field1683[class278.field3564] = arg0;
        class301.field3903[class278.field3564] = false;
        class278.field3564++;
        int var2 = arg0.field1158;
        if (arg0.field1168) {
            var2 = 0;
        }
        int var3 = arg0.field1158;
        if (arg0.field1153) {
            var3 = class412.field5495 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method1202((byte) -89) + class477.field6971 - var1.method1194(true) >> class169.field2206;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method1202((byte) -107) + var1.method1194(true) - class477.field6971 >> class169.field2206;
            if (var7 >= class13.field230) {
                var7 = class13.field230 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field1160[var5++];
                int var10 = (var1.method1203((byte) -76) + class477.field6971 - var1.method1194(true) >> class169.field2206) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class166.field2155) {
                    var11 = class166.field2155 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class83.field1033[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class83.field1033[var4][var12][var8] = var13 | (long) class278.field3564;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class83.field1033[var4][var12][var8] = var13 | (long) class278.field3564 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class83.field1033[var4][var12][var8] = var13 | (long) class278.field3564 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class83.field1033[var4][var12][var8] = var13 | (long) class278.field3564 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIZI)I", line = 114)
    public static final int method1991(int arg0, int arg1, boolean arg2, int arg3) {
        field4302++;
        class378 var4 = class188.method1235(arg2, (byte) -124, arg0);
        if (var4 == null) {
            return -1;
        } else if (arg3 >= 0 && var4.field4901.length > arg3) {
            return arg1 >= -54 ? 122 : var4.field4901[arg3];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZ)I", line = 134)
    public static final int method1992(int arg0, boolean arg1) {
        if (arg1) {
            return 115;
        } else {
            field4303++;
            return arg0 & 0xFF;
        }
    }
}
