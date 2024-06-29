import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class102 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public int field1218;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "J")
    public long field1222;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Ljava/lang/String;")
    public String field1221;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Ljava/lang/String;")
    public String field1217;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public int field1220;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "[Lhca;")
    public static class186[] field1223 = new class186[14];

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lga;")
    public static class332 field1219;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static final void method569(int arg0) {
        field1225++;
        int var1 = class191.field2645.length;
        for (int var2 = arg0; var2 < var1; var2++) {
            if (class191.field2645[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class314.field4214; var4++) {
                    if (class80.field939[var4] == class126.field1760[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class80.field939[class314.field4214] = class126.field1760[var2];
                    var3 = class314.field4214++;
                }
                class157 var5 = new class157(class191.field2645[var2]);
                int var6 = 0;
                while (var5.field2219 < class191.field2645[var2].length && var6 < 511 && class289.field3820 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method963(-121);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class126.field1760[var2] >> 8) * 64 + var10 - class125.field1745;
                    int var13 = (class126.field1760[var2] & 0xFF) * 64 + var11 - class4.field23;
                    class384 var14 = class440.field5847.method502(var5.method963(-125), -15704);
                    class407 var15 = (class407) class296.field3921.method3057(arg0 ^ 0x1, (long) var7);
                    if (var15 == null && (var14.field5071 & 0x1) > 0 && class32.field454 == var9 && var12 >= 0 && class703.field9886 > (var14.field5105 + var12) && var13 >= 0 && class431.field5789 > (var14.field5105 + var13)) {
                        class351 var16 = new class351();
                        var16.field3010 = var7;
                        class407 var17 = new class407(var16);
                        class296.field3921.method3061(125, (long) var7, var17);
                        class591.field8148[class468.field6163++] = var17;
                        class389.field5220[class289.field3820++] = var7;
                        var16.field2998 = class327.field4404;
                        var16.method2074(var14, true);
                        var16.method1442(var16.field4671.field5105, 10);
                        var16.field3013 = var16.field4671.field5137 << 3;
                        var16.method1439(true, 86, (var16.field4671.field5125 + 4 & 0xAF400007) << 11);
                        var16.method2073(true, var9, var16.method1435((byte) 104), var13, -6, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class102(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field1218 = arg0;
        this.field1222 = arg4;
        this.field1221 = arg1;
        this.field1217 = arg3;
        this.field1220 = arg2;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public static void method570(int arg0) {
        field1223 = null;
        if (arg0 != -467036338) {
            method570(-19);
        }
        field1219 = null;
    }
}
