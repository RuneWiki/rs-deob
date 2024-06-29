import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public abstract class class17 extends class128 {

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public int field150;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "S")
    public short field168;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "S")
    public short field159;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "S")
    public short field153;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "B")
    public byte field161;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "Z")
    public boolean field156;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public int field152;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "B")
    public byte field160;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "S")
    public short field158;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field155 = 0;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public static int field167 = 0;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Lol;")
    public static class335 field151 = new class335();

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "I")
    public static int field169 = 0;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public int field163;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "Len;")
    public static class249 field162;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
    public void method75(int arg0) {
        field166++;
        if (arg0 < 77) {
            method77(-21, 38);
        }
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)I")
    public abstract int method76(int arg0);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
    public static final void method77(int arg0, int arg1) {
        class58.field601.method614(-124, arg1);
        int var2 = -47 / ((arg0 + 7) / 63);
        field165++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public static final void method78(boolean arg0) {
        class114 var1 = class376.field5277;
        synchronized (class376.field5277) {
            class376.field5277.method613(true);
        }
        if (arg0) {
            method80(-125);
        }
        field164++;
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)Ltq;")
    public static final class250 method79(int arg0) {
        field157++;
        class250 var1 = new class250(37);
        var1.method1386(-222840624, 14);
        var1.method1386(-222840624, class168.field2125);
        var1.method1386(-222840624, class101.field1195 ? 1 : 0);
        var1.method1386(-222840624, class177.field2217 ? 1 : 0);
        var1.method1386(-222840624, class216.field2905 ? 1 : 0);
        var1.method1386(-222840624, class92.field1058 ? 1 : 0);
        var1.method1386(-222840624, 0);
        var1.method1386(-222840624, class448.field6510 ? 1 : 0);
        var1.method1386(-222840624, class2.field19 ? 1 : 0);
        var1.method1386(-222840624, class405.field5900 ? 1 : 0);
        var1.method1386(-222840624, class169.field2133);
        var1.method1386(-222840624, class199.field2664 ? 1 : 0);
        var1.method1386(-222840624, class29.field278 ? 1 : 0);
        var1.method1386(-222840624, class264.field3609 ? 1 : 0);
        var1.method1386(-222840624, class9.field80);
        var1.method1386(-222840624, class84.field942 ? 1 : 0);
        var1.method1386(-222840624, class63.field653);
        var1.method1386(arg0 - 222840625, class160.field2062);
        var1.method1386(-222840624, class295.field4002);
        var1.method1346(120, class444.field6490);
        var1.method1346(arg0 ^ 0x74, class335.field4449);
        if (arg0 != 1) {
            field151 = null;
        }
        var1.method1386(-222840624, class444.method2757(arg0 - 32725));
        var1.method1357(class289.field3931, 1826838072);
        var1.method1386(-222840624, class284.field3877);
        var1.method1386(arg0 - 222840625, class308.field4173 ? 1 : 0);
        var1.method1386(arg0 - 222840625, class165.field2104 ? 1 : 0);
        var1.method1386(arg0 ^ 0xF2B7B8D1, class292.field3962);
        var1.method1386(-222840624, class225.field3041 ? 1 : 0);
        var1.method1386(arg0 ^ 0xF2B7B8D1, class274.field3689 ? 1 : 0);
        var1.method1386(-222840624, class295.field4005);
        var1.method1386(-222840624, class297.field4040 ? 1 : 0);
        var1.method1386(-222840624, class417.field6000);
        return var1;
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V")
    public static void method80(int arg0) {
        if (arg0 != 1) {
            field169 = 51;
        }
        field151 = null;
        field162 = null;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class17(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field150 = (short) arg2;
        this.field168 = (short) arg4;
        this.field159 = (short) arg6;
        this.field153 = (short) arg7;
        this.field161 = (byte) arg0;
        this.field154 = (short) arg3;
        this.field156 = arg8;
        this.field152 = (short) arg1;
        this.field160 = arg9;
        this.field158 = (short) arg5;
    }
}
