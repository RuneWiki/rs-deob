import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class104 {

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "F")
    public static float field1369;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public int field1367;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public int field1368;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public int field1370;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "[[B")
    public static byte[][] field1371;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)Z")
    public static final boolean method712(boolean arg0) {
        for (int var1 = class228.field3359; var1 < class409.field5785; var1++) {
            class239[][] var2 = class268.field3910[var1];
            for (int var3 = -class153.field2206; var3 <= 0; var3++) {
                int var4 = class88.field1096 + var3;
                int var5 = class88.field1096 - var3;
                if (var4 >= class230.field3392 || var5 < class209.field3046) {
                    for (int var6 = -class153.field2206; var6 <= 0; var6++) {
                        int var7 = class204.field2910 + var6;
                        int var8 = class204.field2910 - var6;
                        if (var4 >= class230.field3392) {
                            if (var7 >= class187.field2692) {
                                class239 var9 = var2[var4][var7];
                                if (var9 != null && var9.field3480) {
                                    class505.field7476 = arg0;
                                    class435.field6118.method1455(-104, var9);
                                    class435.field6118.method1449((byte) -101);
                                }
                            }
                            if (var8 < class276.field4100) {
                                class239 var10 = var2[var4][var8];
                                if (var10 != null && var10.field3480) {
                                    class505.field7476 = arg0;
                                    class435.field6118.method1455(-105, var10);
                                    class435.field6118.method1449((byte) -79);
                                }
                            }
                        }
                        if (var5 < class209.field3046) {
                            if (var7 >= class187.field2692) {
                                class239 var11 = var2[var5][var7];
                                if (var11 != null && var11.field3480) {
                                    class505.field7476 = arg0;
                                    class435.field6118.method1455(-102, var11);
                                    class435.field6118.method1449((byte) -85);
                                }
                            }
                            if (var8 < class276.field4100) {
                                class239 var12 = var2[var5][var8];
                                if (var12 != null && var12.field3480) {
                                    class505.field7476 = arg0;
                                    class435.field6118.method1455(-111, var12);
                                    class435.field6118.method1449((byte) -92);
                                }
                            }
                        }
                        if (class357.field5124 == 0) {
                            if (class517.field7613) {
                                class435.field6118.method1454((byte) -116, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)Lrb;")
    public static final class239 method713(int arg0, int arg1, int arg2) {
        if (class268.field3910[arg0][arg1][arg2] == null) {
            boolean var3 = class268.field3910[0][arg1][arg2] != null && class268.field3910[0][arg1][arg2].field3483 != null;
            if (var3 && arg0 >= class409.field5785 - 1) {
                return null;
            }
            class232.method1431(arg0, arg1, arg2);
        }
        return class268.field3910[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
    public static void method714(int arg0) {
        if (arg0 < 112) {
            method713(14, 95, -5);
        }
        field1371 = null;
    }
}
