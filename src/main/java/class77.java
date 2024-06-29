import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class77 {

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "[B")
    private byte[] field1339 = new byte[4];

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "Lbe;")
    private class74 field1348;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    private int field1346;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "J")
    private long field1342;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "Lub;")
    public static class227 field1347 = class257.method1749("(U3", 17263);

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field1340 = -1;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "Lnj;")
    public static class226 field1355 = new class226(new byte[5000]);

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public static int field1356 = 1;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "Z")
    public static boolean field1358 = true;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    private int field1352;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "Lta;")
    public static class105 field1349;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "Lo;")
    public static class208 field1360;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field1344;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "[B")
    private byte[] field1353;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "[[[Lck;")
    public static class108[][][] field1359;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static void method453(byte arg0) {
        field1347 = null;
        field1359 = null;
        field1360 = null;
        int var1 = 19 / ((74 - arg0) / 37);
        field1349 = null;
        field1355 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)[B")
    public final byte[] method454(int arg0) throws IOException {
        field1350++;
        if (class12.method57(-84) > this.field1342) {
            throw new IOException("fdt");
        }
        if (this.field1346 == 0) {
            if (this.field1348.field1302 == 2) {
                throw new IOException("fds");
            }
            if (this.field1348.field1302 == 1) {
                this.field1344 = (DataInputStream) this.field1348.field1299;
                this.field1346 = 1;
            }
        }
        if (this.field1346 == 1) {
            int var2 = this.field1344.available();
            if (var2 > 0) {
                if ((this.field1352 + var2) > 4) {
                    var2 = 4 - this.field1352;
                }
                this.field1352 += this.field1344.read(this.field1339, this.field1352, var2);
                if (this.field1352 == 4) {
                    int var3 = (new class226(this.field1339)).method1478(-32053);
                    this.field1353 = new byte[var3];
                    this.field1346 = 2;
                }
            }
        }
        if (this.field1346 == 2) {
            int var4 = this.field1344.available();
            if (var4 > 0) {
                if ((this.field1354 + var4) > this.field1353.length) {
                    var4 = this.field1353.length - this.field1354;
                }
                this.field1354 += this.field1344.read(this.field1353, this.field1354, var4);
                if (this.field1353.length == this.field1354) {
                    return this.field1353;
                }
            }
        }
        int var5 = -5 % ((arg0 - 58) / 33);
        return null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)Lmh;")
    public static final class24 method455(int arg0, int arg1) {
        field1345++;
        class24 var2 = (class24) class161.field2723.method1037(53, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (~arg1 <= arg0) {
            var3 = class178.field3021.method884(arg1 & 0x7FFF, 94, 0);
        } else {
            var3 = client.field1449.method884(arg1, -67, 0);
        }
        class24 var4 = new class24();
        if (var3 != null) {
            var4.method119(new class226(var3), (byte) 103);
        }
        if (arg1 >= 32768) {
            var4.method121((byte) -6);
        }
        class161.field2723.method1032(-810, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIILdj;II)V")
    public static final void method456(int arg0, int arg1, int arg2, int arg3, class134 arg4, int arg5, int arg6) {
        field1341++;
        long var7 = 0L;
        if (arg3 == 0) {
            var7 = class184.method1174(arg2, arg5, arg0);
        } else if (arg3 == 1) {
            var7 = class141.method896(arg2, arg5, arg0);
        } else if (arg3 == 2) {
            var7 = class40.method214(arg2, arg5, arg0);
        } else if (arg3 == 3) {
            var7 = class49.method290(arg2, arg5, arg0);
        }
        boolean var9 = false;
        boolean var10 = false;
        boolean var11 = true;
        int var12 = ((int) var7 & 0x7D22F) >> 14;
        int var13 = (int) var7 >> 20 & 0x3;
        int var14 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        class45 var15 = class220.method1389(var14, (byte) -123);
        if (var15.method244(768)) {
            class19.method90(arg5, var15, arg0, arg2, 1000);
        }
        int var16 = -35 / ((-arg6 - 65) / 47);
        if (var7 == 0L) {
            return;
        }
        if (arg3 != 0) {
            if (arg3 == 1) {
                class255.method1736(arg2, arg5, arg0);
                return;
            }
            if (arg3 != 2) {
                if (arg3 == 3) {
                    class188.method1201(arg2, arg5, arg0);
                    if (var15.field795 == 1) {
                        arg4.method828(arg5, arg0, (byte) -35);
                        return;
                    }
                }
                return;
            }
            class125.method777(arg2, arg5, arg0);
            if (var15.field795 != 0 && (var15.field810 + arg5) < 104 && var15.field810 + arg0 < 104 && (var15.field790 + arg5) < 104 && (var15.field790 + arg0) < 104) {
                arg4.method833(var15.field790, var15.field810, arg5, var15.field742, (byte) -128, arg0, var13);
                return;
            }
            return;
        }
        class160.method985(arg2, arg5, arg0);
        if (var15.field795 != 0) {
            arg4.method819(var12, var13, arg5, arg0, var15.field742, (byte) -52);
            return;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public static final void method457(int arg0) {
        class53.field931.method1723(arg0 ^ 0xFFFF904C);
        if (arg0 != 32767) {
            method455(25, -115);
        }
        field1351++;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)Lub;")
    public static final class227 method458(int arg0, int arg1) {
        field1343++;
        if (arg1 != -53) {
            method457(16);
        }
        return class76.method445((byte) -117, new class227[] { class204.method1303(arg0 >> 24 & 0xFF, 1), class61.field1124, class204.method1303(arg0 >> 16 & 0xFF, arg1 + 54), class61.field1124, class204.method1303((arg0 & 0xFFC4) >> 8, 1), class61.field1124, class204.method1303(arg0 & 0xFF, 1) });
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lth;Ljava/net/URL;)V")
    public class77(class239 arg0, URL arg1) {
        this.field1348 = arg0.method1601((byte) -9, arg1);
        this.field1346 = 0;
        this.field1342 = class12.method57(-110) + 30000L;
    }
}
