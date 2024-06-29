import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class86 extends class87 {

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    private int field1361 = 0;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
    private int field1362 = 0;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
    private int field1369 = 1;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
    public static int field1365 = 0;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "Lek;")
    public static class205 field1360 = new class205();

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "Ljava/lang/String;")
    public static String field1371 = "Close";

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    public class86() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V")
    public static void method635(byte arg0) {
        field1371 = null;
        if (arg0 < 85) {
            method638(true);
        }
        field1360 = null;
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V")
    public final void method136(int arg0) {
        if (arg0 == 0) {
            class272.method1897(50);
            ++field1363;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)Lmm;")
    public static final class114 method636(int arg0, int arg1) {
        ++field1359;
        if (arg0 != -3) {
            return null;
        } else {
            class114 var2 = (class114) class186.field2771.method1418((long) arg1, 0);
            if (var2 != null) {
                return var2;
            } else {
                class114 var3 = class101.method791(class286.field4585, false, 73, arg1, class39.field513);
                if (var3 != null) {
                    class186.field2771.method1421((long) arg1, var3, (byte) 34);
                }
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIZ)V")
    public static final void method637(int arg0, int arg1, int arg2, boolean arg3) {
        ++field1368;
        if (!arg3) {
            field1370 = -73;
        }
        if (~arg0 != -1003) {
            if (~arg0 == -1002) {
                class1.method4(arg2, arg1, Integer.MAX_VALUE, 11);
            } else {
                if (~arg0 != -1012) {
                    if (~arg0 == -1007) {
                        class1.method4(arg2, arg1, Integer.MAX_VALUE, 13);
                        return;
                    }
                    if (arg0 == 1003) {
                        class1.method4(arg2, arg1, Integer.MAX_VALUE, 14);
                        return;
                    }
                } else {
                    class1.method4(arg2, arg1, Integer.MAX_VALUE, 12);
                }
            }
        } else {
            class1.method4(arg2, arg1, Integer.MAX_VALUE, 10);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (arg2 != 25645) {
            this.method136(-28);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -4) {
                    this.field1369 = arg0.method366(arg2 + -42150);
                }
            } else {
                this.field1361 = arg0.method366(-16505);
            }
        } else {
            this.field1362 = arg0.method366(-16505);
        }
        ++field1367;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field1364;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            int var4 = class140.field2272[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class206.field3032; ++var6) {
                int var7 = class138.field2254[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (~this.field1362 != -1) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field1369 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field1369;
                }
                int var12 = var11 - (var11 & -4096);
                if (this.field1361 == 0) {
                    var12 = class39.field515[(4084 & var12) >> 4] + 4096 >> 1;
                } else if (~this.field1361 == -3) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)Z")
    public static final boolean method638(boolean arg0) {
        ++field1358;
        if (class207.field3062 != 0) {
            return true;
        } else {
            return !arg0 ? false : class284.field4575.method445((byte) -65);
        }
    }
}
