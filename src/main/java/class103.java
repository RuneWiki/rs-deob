import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class103 extends class96 {

    @OriginalMember(owner = "client!kt", name = "B", descriptor = "I")
    private int field1384;

    @OriginalMember(owner = "client!kt", name = "G", descriptor = "Z")
    public static boolean field1389 = false;

    @OriginalMember(owner = "client!kt", name = "E", descriptor = "I")
    public static int field1387 = 0;

    @OriginalMember(owner = "client!kt", name = "I", descriptor = "I")
    public static int field1391 = 0;

    @OriginalMember(owner = "client!kt", name = "C", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!kt", name = "D", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!kt", name = "H", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!kt", name = "J", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!kt", name = "K", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!kt", name = "L", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!kt", name = "N", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!kt", name = "O", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!kt", name = "Q", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!kt", name = "F", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field1388;

    @OriginalMember(owner = "client!kt", name = "M", descriptor = "[Lpb;")
    public class448[] field1395;

    @OriginalMember(owner = "client!kt", name = "P", descriptor = "[[B")
    private byte[][] field1398;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIII)I")
    public static final int method613(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1393++;
        int var5 = -59 % ((-arg0 - 37) / 59);
        int var6 = arg3 & 0xF;
        int var7 = var6 >= 8 ? arg2 : arg1;
        int var8 = var6 < 4 ? arg2 : (var6 == 12 || var6 == 14 ? arg1 : arg4);
        return ((var6 & 0x2) == 0 ? var8 : -var8) + ((var6 & 0x1) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)V")
    public static final void method614(int arg0, int arg1) {
        field1399++;
        class86 var2 = class7.field130.method2316(4999);
        int var3 = -69 % ((-arg1 - 52) / 32);
        while (var2 != null) {
            if ((var2.field1177 >> 48 & 0xFFFFL) == ((long) arg0)) {
                var2.method536(false);
            }
            var2 = class7.field130.method2308((byte) -91);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
    public static void method615(int arg0) {
        if (arg0 == 1) {
            field1388 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "([II)Ljava/lang/String;")
    public static final String method616(int[] arg0, int arg1) {
        field1392++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class251.field3612;
        for (int var4 = arg1; var4 < arg0.length; var4++) {
            class84 var5 = class127.field1627.method1950(arg1 + 6, arg0[var4]);
            if (var5.field1136 != -1) {
                class307 var6 = (class307) class413.field6116.method40(0, (long) var5.field1136);
                if (var6 == null) {
                    class328 var7 = class328.method1978(class445.field6482, var5.field1136, 0);
                    if (var7 != null) {
                        var6 = class481.field6937.method804(var7, true);
                        class413.field6116.method36(-20960, var6, (long) var5.field1136);
                    }
                }
                if (var6 != null) {
                    class93.field1255[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "(B)Z")
    public final boolean method617(byte arg0) {
        if (arg0 != -94) {
            this.method619(83, -64);
        }
        field1394++;
        if (this.field1395 != null) {
            return true;
        }
        if (this.field1398 == null) {
            if (!class211.field2993.method1447((byte) -82, this.field1384)) {
                return false;
            }
            int[] var2 = class211.field2993.method1454((byte) -91, this.field1384);
            this.field1398 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field1398[var3] = class211.field2993.method1470(4, var2[var3], this.field1384);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field1398.length; var5++) {
            byte[] var14 = this.field1398[var5];
            int var15 = var14[1] & 0xFF | (var14[0] & 0xFF) << 8;
            var4 &= class131.field1665.method1442(var15, (byte) -126);
        }
        if (!var4) {
            return false;
        }
        class347 var6 = new class347();
        int var7 = class211.field2993.method1473(4309, this.field1384);
        this.field1395 = new class448[var7];
        int[] var8 = class211.field2993.method1454((byte) -91, this.field1384);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field1398[var9];
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            class12 var12 = null;
            for (class12 var13 = (class12) var6.method2096(-21400); var13 != null; var13 = (class12) var6.method2084((byte) 19)) {
                if (var13.field195 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class12(var11, class131.field1665.method1465(arg0 + 94, var11));
                var6.method2086((byte) -126, var12);
            }
            this.field1395[var8[var9]] = new class448(var10, var12);
        }
        this.field1398 = null;
        return true;
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(II)Z")
    public final boolean method618(int arg0, int arg1) {
        if (arg1 != 17712) {
            field1391 = 83;
        }
        field1396++;
        return this.field1395[arg0].field6528;
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(II)Z")
    public final boolean method619(int arg0, int arg1) {
        if (arg0 < 21) {
            this.field1384 = -83;
        }
        field1390++;
        return this.field1395[arg1].field6541;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIBI)I")
    public static final int method620(int arg0, int arg1, byte arg2, int arg3) {
        field1385++;
        if (class311.field4527 == null) {
            return 0;
        }
        int var4 = arg3 >> 7;
        if (arg2 != 20) {
            return -86;
        }
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || class362.field5442 - 1 < var4 || (class203.field2813 - 1) < var5) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class379.field5661[1][var4][var5] & 0x2) != 0) {
            var6 = arg0 + 1;
        }
        return class311.field4527[var6].method855(arg3, arg1);
    }

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "(II)Z")
    public final boolean method621(int arg0, int arg1) {
        if (arg1 == 0) {
            field1397++;
            return this.field1395[arg0].field6536;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(I)V")
    public class103(int arg0) {
        this.field1384 = arg0;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method622(String arg0, int arg1) {
        if (arg1 != 0) {
            field1391 = -112;
        }
        field1386++;
        return class206.method1271(10, arg0, true, 3869);
    }
}
