import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class382 {

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "F")
    public float field5478 = 1.0F;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "F")
    public float field5481 = 0.25F;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "F")
    public float field5480 = 1.0F;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public int field5475;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public int field5476;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public int field5483;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "Lks;")
    public class23 field5472;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public int field5468;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public int field5471;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "F")
    public float field5473;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public int field5479;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "F")
    public float field5470;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "F")
    public float field5477;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field5482 = new CRC32();

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public static int field5486 = 0;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "Lrb;")
    public static class283 field5485 = new class283(39, 4);

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field5489 = -2;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field5487;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V")
    public static final void method2267(int arg0, int arg1) {
        class532 var2 = class103.field1632[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class532 var4 = class103.field1632[var3][arg0][arg1] = class103.field1632[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field7834--;
                for (class201 var5 = var4.field7828; var5 != null; var5 = var5.field2918) {
                    class434 var6 = var5.field2915;
                    if (var6.field6290 == arg0 && var6.field6277 == arg1) {
                        var6.field6279--;
                    }
                }
            }
        }
        if (class103.field1632[0][arg0][arg1] == null) {
            class103.field1632[0][arg0][arg1] = new class532(0, arg0, arg1);
            class103.field1632[0][arg0][arg1].field7842 = 1;
        }
        class103.field1632[0][arg0][arg1].field7829 = var2;
        class103.field1632[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIBI)V")
    public static final void method2268(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field5484++;
        int var6 = 19 % ((arg4 + 6) / 62);
        for (int var7 = arg2; var7 <= arg3; var7++) {
            class188.method1259(arg1, (byte) 27, arg0, arg5, class42.field626[var7]);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILmk;)Z")
    public final boolean method2269(int arg0, class382 arg1) {
        field5474++;
        int var3 = -92 % ((-arg0 - 25) / 51);
        return this.field5468 == arg1.field5468 && this.field5473 == arg1.field5473 && this.field5477 == arg1.field5477 && this.field5470 == arg1.field5470 && this.field5481 == arg1.field5481 && this.field5480 == arg1.field5480 && this.field5478 == arg1.field5478 && this.field5471 == arg1.field5471 && this.field5476 == arg1.field5476 && this.field5472 == arg1.field5472;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public static void method2270(byte arg0) {
        field5482 = null;
        int var1 = -99 % ((arg0 + 73) / 52);
        field5487 = null;
        field5485 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLsv;)V")
    public final void method2271(byte arg0, class319 arg1) {
        field5469++;
        this.field5480 = (float) (arg1.method1869(-104) * 8) / 255.0F;
        this.field5481 = (float) (arg1.method1869(-99) * 8) / 255.0F;
        this.field5478 = (float) (arg1.method1869(arg0 ^ 0xFFFFFFA2) * 8) / 255.0F;
        if (arg0 != 24) {
            this.field5483 = -32;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
    public class382() {
        this.field5475 = -60;
        this.field5476 = 0;
        this.field5483 = -50;
        this.field5472 = class280.field3811;
        this.field5468 = class278.field3773;
        this.field5471 = class482.field6959;
        this.field5473 = 1.1523438F;
        this.field5479 = -50;
        this.field5470 = 1.2F;
        this.field5477 = 0.69921875F;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lsv;)V")
    public class382(class319 arg0) {
        int var2 = arg0.method1869(-101);
        if (class76.field1075.method1597(false, class195.field2849) && class228.field3204.method502() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field5468 = class278.field3773;
            } else {
                this.field5468 = arg0.method1863(-1);
            }
            if ((var2 & 0x2) == 0) {
                this.field5473 = 1.1523438F;
            } else {
                this.field5473 = (float) arg0.method1844(-121) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field5477 = 0.69921875F;
            } else {
                this.field5477 = (float) arg0.method1844(-104) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field5470 = 1.2F;
            } else {
                this.field5470 = (float) arg0.method1844(-128) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1863(-1);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1844(-125);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1844(-126);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1844(-105);
            }
            this.field5470 = 1.2F;
            this.field5477 = 0.69921875F;
            this.field5473 = 1.1523438F;
            this.field5468 = class278.field3773;
        }
        if ((var2 & 0x10) == 0) {
            this.field5483 = -50;
            this.field5475 = -60;
            this.field5479 = -50;
        } else {
            this.field5483 = arg0.method1847(69);
            this.field5475 = arg0.method1847(56);
            this.field5479 = arg0.method1847(6);
        }
        if ((var2 & 0x20) == 0) {
            this.field5471 = class482.field6959;
        } else {
            this.field5471 = arg0.method1863(-1);
        }
        if ((var2 & 0x40) == 0) {
            this.field5476 = 0;
        } else {
            this.field5476 = arg0.method1844(-108);
        }
        if ((var2 & 0x80) == 0) {
            this.field5472 = class280.field3811;
        } else {
            int var3 = arg0.method1844(-111);
            int var4 = arg0.method1844(-115);
            int var5 = arg0.method1844(-127);
            int var6 = arg0.method1844(-124);
            int var7 = arg0.method1844(-107);
            int var8 = arg0.method1844(-114);
            this.field5472 = class443.method2612(var4, var7, var5, var3, var8, 84, var6);
        }
    }
}
