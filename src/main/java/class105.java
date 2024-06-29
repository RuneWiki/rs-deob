import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class105 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public int field1372 = 127;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public int field1377 = 0;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public int field1379 = 1190717;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public int field1386 = 128;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Z")
    public boolean field1378 = true;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public int field1374 = -1;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public int field1373 = 8;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public int field1381 = -1;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Z")
    public boolean field1380 = true;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public int field1385 = -1;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public int field1387 = 16;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "Z")
    public boolean field1376 = false;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Leh;")
    public static class246 field1388 = new class246(31, 6);

    @OriginalMember(owner = "client!d", name = "t", descriptor = "S")
    public static short field1391 = 320;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "Z")
    public static boolean field1393 = false;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public int field1375;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "Lpv;")
    public class52 field1389;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "[Luh;")
    public static class115[] field1390;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public final void method715(byte arg0) {
        if (this.field1374 == -1) {
            this.field1374 = this.field1385;
        }
        int var2 = -46 % ((arg0 + 51) / 41);
        field1384++;
        this.field1373 = this.field1375 | this.field1373 << 8;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BLwm;)V")
    public final void method716(byte arg0, class403 arg1) {
        while (true) {
            int var3 = arg1.method2357((byte) 117);
            if (var3 == 0) {
                field1382++;
                int var4 = -46 % ((56 - arg0) / 58);
                return;
            }
            this.method717(arg1, (byte) -118, var3);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lwm;BI)V")
    private final void method717(class403 arg0, byte arg1, int arg2) {
        field1383++;
        if (arg2 == 1) {
            this.field1377 = class282.method1755(-1, arg0.method2323((byte) 104));
        } else if (arg2 == 2) {
            this.field1385 = arg0.method2357((byte) 117);
        } else if (arg2 == 3) {
            this.field1385 = arg0.method2338(0);
            if (this.field1385 == 65535) {
                this.field1385 = -1;
            }
        } else if (arg2 == 5) {
            this.field1378 = false;
        } else if (arg2 == 7) {
            this.field1381 = class282.method1755(-1, arg0.method2323((byte) 79));
        } else if (arg2 == 8) {
            this.field1389.field640 = this.field1375;
        } else if (arg2 == 9) {
            this.field1386 = arg0.method2338(0) << 0;
        } else if (arg2 == 10) {
            this.field1380 = false;
        } else if (arg2 == 11) {
            this.field1373 = arg0.method2357((byte) 113);
        } else if (arg2 == 12) {
            this.field1376 = true;
        } else if (arg2 == 13) {
            this.field1379 = arg0.method2323((byte) 96);
        } else if (arg2 == 14) {
            this.field1387 = arg0.method2357((byte) 120) << 0;
        } else if (arg2 == 15) {
            this.field1374 = arg0.method2338(0);
            if (this.field1374 == 65535) {
                this.field1374 = -1;
            }
        } else if (arg2 == 16) {
            this.field1372 = arg0.method2357((byte) 116);
        }
        int var4 = 38 % ((5 - arg1) / 62);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
    public static void method718(boolean arg0) {
        field1390 = null;
        field1388 = null;
        if (!arg0) {
            method718(true);
        }
    }
}
