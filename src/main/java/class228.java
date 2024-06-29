import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class228 extends class115 {

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "[I")
    public static int[] field3975 = new int[99];

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "Lub;")
    public static class227 field3981 = class257.method1749(")3)3)3", 17263);

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "Lub;")
    public static class227 field3982 = class257.method1749("::errortest", 17263);

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "B")
    public static byte field3983;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "Lbc;")
    private class201 field3984;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "[Lnf;")
    public static class213[] field3978;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)I")
    public final int method1535(int arg0, int arg1, int arg2) {
        field3976++;
        if (this.field3984 == null) {
            return arg0;
        } else {
            int var4 = -67 / ((-arg2 - 10) / 50);
            class216 var5 = (class216) this.field3984.method1298(-115, (long) arg1);
            return var5 == null ? arg0 : var5.field3637;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lub;II)Lub;")
    public final class227 method1536(class227 arg0, int arg1, int arg2) {
        if (arg2 <= 33) {
            return null;
        }
        field3986++;
        if (this.field3984 == null) {
            return arg0;
        } else {
            class165 var4 = (class165) this.field3984.method1298(-116, (long) arg1);
            return var4 == null ? arg0 : var4.field2765;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
    public static void method1537(int arg0) {
        int var1 = 43 % ((arg0 - 14) / 48);
        field3975 = null;
        field3982 = null;
        field3981 = null;
        field3978 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lnj;B)V")
    public final void method1538(class226 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1471(255);
            if (var3 == 0) {
                if (arg1 != -108) {
                    return;
                }
                field3974++;
                return;
            }
            this.method1540(var3, 128, arg0);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILta;IB)V")
    public static final void method1539(int arg0, class105 arg1, int arg2, byte arg3) {
        field3977++;
        if (arg3 != -126) {
            method1537(-109);
        }
        if (class10.field194 != null || class81.field1409 || arg1 == null || class169.method1044(arg1, (byte) 42) == null) {
            return;
        }
        class10.field194 = arg1;
        class232.field4044 = class169.method1044(arg1, (byte) -120);
        class212.field3584 = 0;
        class186.field3177 = arg0;
        class192.field3273 = false;
        class94.field1632 = arg2;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILnj;)V")
    private final void method1540(int arg0, int arg1, class226 arg2) {
        if (arg0 == 249) {
            int var4 = arg2.method1471(arg1 + 127);
            if (this.field3984 == null) {
                int var5 = class45.method239(var4, false);
                this.field3984 = new class201(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method1471(arg1 + 127) == 1;
                int var8 = arg2.method1444(171285352);
                class60 var9;
                if (var7) {
                    var9 = new class165(arg2.method1480(-113));
                } else {
                    var9 = new class216(arg2.method1478(-32053));
                }
                this.field3984.method1300(var9, (long) var8, -2875);
            }
        }
        field3980++;
        if (arg1 != 128) {
            this.method1540(-120, -62, (class226) null);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIILfh;Lfh;IIIIJ)V")
    public static final void method1541(int arg0, int arg1, int arg2, int arg3, class180 arg4, class180 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class78 var12 = new class78();
        var12.field1378 = arg10;
        var12.field1375 = arg1 * 128 + 64;
        var12.field1366 = arg2 * 128 + 64;
        var12.field1368 = arg3;
        var12.field1362 = arg4;
        var12.field1373 = arg5;
        var12.field1374 = arg6;
        var12.field1371 = arg7;
        var12.field1363 = arg8;
        var12.field1361 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class261.field4539[var13][arg1][arg2] == null) {
                class261.field4539[var13][arg1][arg2] = new class108(var13, arg1, arg2);
            }
        }
        class261.field4539[arg0][arg1][arg2].field2037 = var12;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field3975[var1] = var0 / 4;
        }
    }
}
