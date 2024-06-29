import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class74 extends class217 {

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "[I")
    public static int[] field1381 = new int[32];

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "Llc;")
    public static class143 field1380 = class66.method374("::fpson", -1);

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field1385 = 0;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "Llc;")
    public class143 field1378;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "Lgf;")
    public static class7 field1386;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "[I")
    public int[] field1370;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "[I")
    public int[] field1371;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "[I")
    public int[] field1373;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "[I")
    public int[] field1379;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Llc;IB)V")
    public static final void method421(class143 arg0, int arg1, byte arg2) {
        field1376++;
        class166 var3 = class262.method1746(81, arg1, 2);
        var3.method1097((byte) -74);
        int var4 = 81 / ((-arg2 - 78) / 47);
        var3.field2967 = arg0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lgf;IZI)Lek;")
    public static final class160 method422(class7 arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            method428(true, (class7) null, (class7) null);
        }
        field1384++;
        return class189.method1223(arg0, arg3, 109, arg1) ? class207.method1445(128) : null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)I")
    public final int method423(int arg0, int arg1) {
        field1383++;
        if (this.field1371 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg1 >= -2) {
            this.method426(-63, (class190) null, 70);
        }
        while (var3 < this.field1371.length) {
            if (this.field1379[var3] == arg0) {
                return this.field1371[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
    public final void method424(byte arg0) {
        field1369++;
        if (this.field1370 != null) {
            for (int var2 = 0; var2 < this.field1370.length; var2++) {
                this.field1370[var2] = class119.method729(this.field1370[var2], 32768);
            }
        }
        if (arg0 >= -111) {
            method428(true, (class7) null, (class7) null);
        }
        if (this.field1371 != null) {
            for (int var3 = 0; var3 < this.field1371.length; var3++) {
                this.field1371[var3] = class119.method729(this.field1371[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V")
    public static void method425(int arg0) {
        int var1 = 71 / ((-arg0 - 61) / 38);
        field1380 = null;
        field1381 = null;
        field1386 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILh;I)V")
    private final void method426(int arg0, class190 arg1, int arg2) {
        if (arg0 == 1) {
            this.field1378 = arg1.method1270((byte) -102);
        } else if (arg0 == 2) {
            int var4 = arg1.method1265(125);
            this.field1371 = new int[var4];
            this.field1379 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1371[var5] = arg1.method1275(128);
                int var6 = arg1.method1265(114);
                if (var6 == 0) {
                    this.field1379[var5] = -1;
                } else {
                    this.field1379[var5] = var6;
                }
            }
        } else if (arg0 == 3) {
            int var7 = arg1.method1265(126);
            this.field1370 = new int[var7];
            this.field1373 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1370[var8] = arg1.method1275(128);
                int var9 = arg1.method1265(126);
                if (var9 == 0) {
                    this.field1373[var8] = -1;
                } else {
                    this.field1373[var8] = var9;
                }
            }
        }
        field1372++;
        int var10 = -58 % ((arg2 - 24) / 63);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILh;)V")
    public final void method427(int arg0, class190 arg1) {
        if (arg0 < 9) {
            this.field1370 = null;
        }
        field1375++;
        while (true) {
            int var3 = arg1.method1265(113);
            if (var3 == 0) {
                return;
            }
            this.method426(var3, arg1, -120);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLgf;Lgf;)V")
    public static final void method428(boolean arg0, class7 arg1, class7 arg2) {
        class168.field3008 = arg1;
        field1374++;
        if (!arg0) {
            field1381 = null;
        }
        class97.field1777 = arg2;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)I")
    public final int method429(int arg0, int arg1) {
        field1382++;
        if (this.field1370 == null) {
            return -1;
        }
        if (arg0 >= -115) {
            method425(-103);
        }
        for (int var3 = 0; var3 < this.field1370.length; var3++) {
            if (this.field1373[var3] == arg1) {
                return this.field1370[var3];
            }
        }
        return -1;
    }
}
