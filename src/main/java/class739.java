import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class739 extends class667 {

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    private int field10377 = 4096;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    private int field10384 = 0;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "Lkg;")
    public static class271 field10380 = new class271("", 12);

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "Ljg;")
    public static class338 field10382 = new class338();

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public static int field10376;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "I")
    public static int field10378;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "I")
    public static int field10379;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    public static int field10381;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public static int field10383;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "Lav;")
    public static class637 field10385;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBLvr;II)V", line = 3)
    public static final void method4114(int arg0, byte arg1, class135 arg2, int arg3, int arg4) {
        ++field10378;
        arg2.field2109.method233(arg3, -23162);
        arg2.field2109.method223(1493807496, arg4);
        arg2.field2109.method285(-128, arg0);
        int var5 = -102 / ((arg1 - -57) / 35);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V", line = 17)
    public static void method4115(int arg0) {
        if (arg0 != -31606) {
            field10382 = null;
        }
        field10380 = null;
        field10385 = null;
        field10382 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)[I", line = 29)
    public final int[] method117(byte arg0, int arg1) {
        ++field10381;
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (arg0 > -87) {
            this.method116((class35) null, -128, -1);
        }
        if (super.field9355.field3728) {
            int[] var4 = this.method3744(arg1, (byte) -118, 0);
            for (int var5 = 0; class77.field1455 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field10384 <= var6 && ~this.field10377 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V", line = 144)
    public class739() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Z", line = 77)
    public static final boolean method4116(int arg0, int arg1) {
        ++field10383;
        if (arg1 > -115) {
            method4115(-95);
        }
        return ~arg0 == -5 || arg0 == 8 || arg0 == 11;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Leq;BLeq;Leq;Leq;)V", line = 90)
    public static final void method4117(class209 arg0, byte arg1, class209 arg2, class209 arg3, class209 arg4) {
        class127.field1923 = arg2;
        class21.field269 = arg4;
        ++field10376;
        class736.field10354 = arg0;
        class117.field1849 = new class50[class127.field1923.method1454(-1)][];
        int var5 = -118 % ((arg1 - 50) / 53);
        class525.field7464 = new boolean[class127.field1923.method1454(-1)];
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lud;II)V", line = 106)
    public final void method116(class35 arg0, int arg1, int arg2) {
        ++field10379;
        if (arg1 == 3) {
            if (~arg2 != -1) {
                if (arg2 == 1) {
                    this.field10377 = arg0.method253(-13900);
                }
            } else {
                this.field10384 = arg0.method253(arg1 + -13903);
            }
        }
    }
}
