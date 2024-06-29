import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class617 {

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public int field8702;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "S")
    public static short field8705 = 32767;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "Ldk;")
    public static class534 field8699 = new class534(0, 0);

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "Lks;")
    public static class460 field8707 = new class460("", 15);

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "Lke;")
    public static class622 field8709 = new class622(115, 8);

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public static int field8703;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field8704;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public static int field8706;

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "Lkj;")
    public static class590 field8708;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "Z")
    public static boolean field8710;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "[[[B")
    public static byte[][][] field8700;

    @OriginalMember(owner = "client!kq", name = "toString", descriptor = "()Ljava/lang/String;", line = 9)
    public final String toString() {
        field8701++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBILts;B)V", line = 18)
    public static final void method3532(int arg0, byte arg1, int arg2, class559 arg3, byte arg4) {
        field8703++;
        if (arg1 != 118) {
            return;
        }
        int var5 = arg3.field6448[0];
        int var6 = arg3.field6445[0];
        if (var5 < 0 || var5 >= class109.field1314 || var6 < 0 || var6 >= class760.field10479 || arg2 < 0 || arg2 >= class109.field1314 || arg0 < 0 || arg0 >= class760.field10479) {
            return;
        }
        int var7 = class579.method3365(arg2, arg1 ^ 0xFFFFFF09, 0, 0, var5, -4, class234.field3394[arg3.field7710], class302.field4527, 0, 0, true, class667.field9390, var6, arg3.method2692((byte) 3), arg0);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg3.method3242(class667.field9390[var8], arg4, class302.field4527[var8], arg1 - 83);
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)Ljava/lang/String;", line = 55)
    public static final String method3533(int arg0) {
        field8706++;
        String var1 = "www";
        int var2 = -53 / ((37 - arg0) / 49);
        if (class90.field1161 == class256.field3599) {
            var1 = "www-wtrc";
        } else if (class256.field3599 == class180.field2730) {
            var1 = "www-wtqa";
        } else if (class492.field6986 == class256.field3599) {
            var1 = "www-wtwip";
        }
        String var3 = "";
        if (class491.field6979 != null) {
            var3 = "/p=" + class491.field6979;
        }
        return "http://" + var1 + "." + class536.field7555.field1306 + ".com/l=" + class526.field7494 + "/a=" + class87.field1139 + var3 + "/";
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lha;I)V", line = 84)
    public static final void method3534(class66 arg0, int arg1) {
        field8704++;
        int var2 = 0;
        int var3 = 0;
        if (class607.field8578) {
            var2 = class17.method143(-128);
            var3 = class638.method3629(arg1 ^ 0xFFFFD03F);
        }
        int var4 = -10660793;
        class106.method716(class761.field10487 + var3, arg0, true, var4, class407.field5748, class611.field8627, -16777216, class505.field7233 + var2);
        class546.field7704.method529(class761.field10487 + var3 + 14, class674.field9575.method3825((byte) -10, class526.field7494), (byte) -54, class505.field7233 + var2 + 3, -1, var4);
        int var5 = class694.field9812.method3201((byte) 85) + var2;
        if (arg1 != -25297) {
            field8710 = true;
        }
        int var6 = var3 + class694.field9812.method3197((byte) -124);
        if (class102.field1282) {
            int var10 = 0;
            for (class4 var11 = (class4) class174.field2456.method2480(381); var11 != null; var11 = (class4) class174.field2456.method2476((byte) 18)) {
                int var15 = var10 * 16 + var3 + class761.field10487 + 31;
                var10++;
                if (var11.field49 == 1) {
                    class270.method1760(arg1 - 644722255, arg0, (class312) var11.field46.field5842.field3126, class505.field7233 + var2, var6, class407.field5748, var15, -1, class611.field8627, class761.field10487 + var3, -256, var5);
                } else {
                    class359.method2255(class761.field10487 + var3, var5, class407.field5748, class611.field8627, var15, var6, arg0, arg1 + 25300, class505.field7233 + var2, -256, var11, -1);
                }
            }
            if (class569.field8059 != null) {
                class106.method716(class149.field1906, arg0, true, var4, class204.field2992, class126.field1652, -16777216, class209.field3041);
                class546.field7704.method529(class149.field1906 + 14, class569.field8059.field48, (byte) -95, class209.field3041 + 3, -1, var4);
                int var12 = 0;
                for (class312 var13 = (class312) class569.field8059.field46.method2480(381); var13 != null; var13 = (class312) class569.field8059.field46.method2476((byte) 18)) {
                    int var14 = var12 * 16 + class149.field1906 + 31;
                    class270.method1760(-644747552, arg0, var13, class209.field3041, var6, class204.field2992, var14, -1, class126.field1652, class149.field1906, -256, var5);
                    var12++;
                }
                class601.method3478(92, class204.field2992, class209.field3041, class149.field1906, class126.field1652);
            }
        } else {
            int var7 = 0;
            for (class312 var8 = (class312) class551.field7826.method2508((byte) 115); var8 != null; var8 = (class312) class551.field7826.method2505((byte) -55)) {
                int var9 = (class543.field7608 - var7 - 1) * 16 + class761.field10487 + var3 + 31;
                var7++;
                class270.method1760(-644747552, arg0, var8, class505.field7233 + var2, var6, class407.field5748, var9, -1, class611.field8627, class761.field10487 + var3, -256, var5);
            }
        }
        class601.method3478(100, class407.field5748, class505.field7233 + var2, class761.field10487 + var3, class611.field8627);
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V", line = 174)
    public static void method3535(int arg0) {
        field8708 = null;
        field8707 = null;
        if (arg0 != -11820) {
            method3534(null, -110);
        }
        field8700 = null;
        field8709 = null;
        field8699 = null;
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(II)V", line = 188)
    public class617(int arg0, int arg1) {
        this.field8702 = arg0;
    }
}
