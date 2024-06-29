import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class408 extends class512 {

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
    private int field6074;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
    private int field6073;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
    private int field6078;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    private int field6075;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public static int field6072 = -1;

    @OriginalMember(owner = "client!gu", name = "r", descriptor = "[[[I")
    public static int[][][] field6081 = new int[2][][];

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "(III)I", line = 4)
    public static final int method2502(int arg0, int arg1, int arg2) {
        if (arg0 != 11369) {
            return 21;
        } else {
            ++field6071;
            return arg2 != 1 && arg2 != 3 ? class515.field7588[3 & arg1] : class296.field4252[arg1 & 3];
        }
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(IIIIII)V", line = 19)
    public class408(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field6074 = arg1;
        this.field6073 = arg2;
        this.field6078 = arg3;
        this.field6075 = arg0;
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(III)V", line = 30)
    public final void method1251(int arg0, int arg1, int arg2) {
        ++field6076;
        if (arg1 != 4) {
            this.field6075 = 65;
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)V", line = 41)
    public static void method2503(byte arg0) {
        field6081 = null;
        if (arg0 >= -20) {
            field6072 = -14;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V", line = 51)
    public static final void method2504(int arg0) {
        ++field6077;
        for (class255 var1 = (class255) class156.field2211.method2949((byte) 93); var1 != null; var1 = (class255) class156.field2211.method2949((byte) 98)) {
            class231.method1549((byte) -69, var1);
        }
        int var2;
        int var3;
        if (class478.field7044.method2072(class65.field802, 126)) {
            var2 = 0;
            var3 = 3;
        } else {
            var3 = class51.field575;
            var2 = class51.field575;
        }
        client.method1391();
        int var4 = var2;
        if (arg0 != -11841) {
            method2502(-115, 23, 59);
        }
        while (~var4 >= ~var3) {
            client.method1389();
            client.method1382(var4);
            client.method1376(var4);
            ++var4;
        }
        client.method1387();
        client.method1384();
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(III)V", line = 106)
    public final void method1252(int arg0, int arg1, int arg2) {
        ++field6079;
        if (arg0 > -78) {
            this.method1252(-34, -20, -83);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(III)V", line = 119)
    public final void method1249(int arg0, int arg1, int arg2) {
        ++field6080;
        int var4 = this.field6075 * arg2 >> 12;
        int var5 = this.field6073 * arg2 >> 12;
        if (arg0 != 24245) {
            field6081 = null;
        }
        int var6 = this.field6074 * arg1 >> 12;
        int var7 = this.field6078 * arg1 >> 12;
        class87.method769(super.field7550, false, var7, var6, var5, var4);
    }
}
