import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class595 extends class323 {

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "Ljava/net/Socket;")
    private Socket field8317;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "Leaa;")
    private class463 field8324;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "Lbp;")
    private class351 field8318;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field8314;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field8315;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field8319;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field8320;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field8321;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public static int field8323;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    public static int field8325;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
    public static int field8326;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
    public static int field8327;

    @OriginalMember(owner = "client!ck", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field8316++;
        this.method1935(0);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)Z")
    public final boolean method1940(int arg0, int arg1) throws IOException {
        if (arg0 == -5544) {
            field8321++;
            return this.field8324.method2618(arg1, 0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BIII)I")
    public static final int method3362(byte arg0, int arg1, int arg2, int arg3) {
        field8325++;
        if ((class492.field6720[arg1][arg2][arg3] & 0x8) != 0) {
            return 0;
        } else if (arg1 <= 0 || (class492.field6720[1][arg2][arg3] & 0x2) == 0) {
            int var4 = -97 % ((40 - arg0) / 51);
            return arg1;
        } else {
            return arg1 - 1;
        }
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)V")
    public static final void method3363(int arg0) {
        class389.field5502.method2600(1);
        field8323++;
        class322.field4389.method3506((byte) 65);
        class85.field1251.method3322((byte) 69);
        class475.field6543.method2682(50);
        class347.field4640.method2578((byte) -38);
        class599.field8366.method3955(101);
        class192.field2727.method3089(-23);
        class430.field5994.method1999(116);
        class333.field4490.method2038(55);
        class59.field667.method2906(0);
        class198.field2828.method2487((byte) -110);
        class643.field8871.method354(150);
        class123.field1685.method3705(4);
        class202.field2859.method77((byte) 47);
        class71.field952.method1980((byte) -103);
        class433.field6033.method3776(0);
        class444.field6147.method3381(6);
        class683.field9761.method60((byte) 124);
        class542.field7338.method3355(-592204478);
        if (arg0 < 77) {
            field8319 = 119;
        }
        class173.field2514.method1252((byte) 34);
        class527.method3005((byte) -94);
        class381.method2190(-105);
        class406.method2364(false);
        class417.method2420((byte) 100);
        class184.method1265(true);
        class4.field33.method3755(19713);
        class178.field2582.method3755(19713);
        class330.field4458.method3755(19713);
        class260.field3537.method3755(19713);
        class97.field1371.method3755(19713);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II[BI)V")
    public final void method1938(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = -4 / ((arg0 + 31) / 56);
        field8326++;
        this.field8318.method2020(arg1, arg3, arg2, 87);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
    public final void method1935(int arg0) {
        field8322++;
        try {
            this.field8317.close();
        } catch (IOException var2) {
        }
        this.field8324.method2619(arg0);
        this.field8318.method2024(false);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)V")
    public static final void method3364(int arg0, int arg1, int arg2) {
        field8327++;
        class51 var3 = class703.method3938(arg2 - 1989279590, arg1, arg2);
        var3.method402((byte) 103);
        var3.field603 = arg0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public final void method1934(int arg0) {
        field8315++;
        this.field8324.method2620((byte) 97);
        int var2 = 28 / ((79 - arg0) / 33);
        this.field8318.method2026(-14617);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II[BB)I")
    public final int method1939(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        if (arg3 == -93) {
            field8320++;
            return this.field8324.method2622(arg0, (byte) 118, arg1, arg2);
        } else {
            return 30;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIII)V")
    public static final void method3365(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8314++;
        if (arg1 != 2) {
            method3364(117, -11, 122);
        }
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        class470.method2660(arg3 - arg0, arg0 + arg3, class344.field4599[arg4], (byte) 11, arg2);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class344.field4599[arg4 + var6];
                int[] var10 = class344.field4599[arg4 - var6];
                int var11 = arg3 + var5;
                int var12 = arg3 - var5;
                class470.method2660(var12, var11, var9, (byte) 11, arg2);
                class470.method2660(var12, var11, var10, (byte) 11, arg2);
            }
            int var13 = arg3 + var6;
            int var14 = arg3 - var6;
            int[] var15 = class344.field4599[arg4 + var5];
            int[] var16 = class344.field4599[arg4 - var5];
            class470.method2660(var14, var13, var15, (byte) 11, arg2);
            class470.method2660(var14, var13, var16, (byte) 11, arg2);
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class595(Socket arg0, int arg1) throws IOException {
        this.field8317 = arg0;
        this.field8317.setSoTimeout(30000);
        this.field8317.setTcpNoDelay(true);
        this.field8324 = new class463(this.field8317.getInputStream(), arg1);
        this.field8318 = new class351(this.field8317.getOutputStream(), arg1);
    }
}
