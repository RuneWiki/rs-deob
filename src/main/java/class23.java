import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class23 extends class161 {

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public int field412 = 0;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    public static int field427 = 0;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public static int field422 = 0;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    public int field423;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public int field426;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "Lob;")
    public class130 field428;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "Loe;")
    public class142 field418;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Ltg;")
    public static class180 field407;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "Loc;")
    public class61 field415;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "Lge;")
    public class70 field408;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "Lge;")
    public class70 field411;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "Z")
    public boolean field421;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "[I")
    public int[] field414;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "[I")
    public static int[] field431;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public final void method174(byte arg0) {
        if (arg0 > -6) {
            this.field414 = null;
        }
        int var2 = this.field417;
        if (this.field428 != null) {
            class130 var5 = this.field428.method891(0);
            if (var5 == null) {
                this.field426 = 0;
                this.field409 = 0;
                this.field417 = -1;
                this.field414 = null;
                this.field429 = 0;
            } else {
                this.field414 = var5.field2258;
                this.field426 = var5.field2273;
                this.field417 = var5.field2318;
                this.field409 = var5.field2317;
                this.field429 = var5.field2310 * 128;
            }
        } else if (this.field415 != null) {
            int var3 = class44.method339(this.field415, (byte) 112);
            if (var2 != var3) {
                this.field417 = var3;
                class255 var4 = this.field415.field987;
                if (var4.field4516 != null) {
                    var4 = var4.method1717(false);
                }
                if (var4 == null) {
                    this.field429 = 0;
                } else {
                    this.field429 = var4.field4518 * 128;
                }
            }
        } else if (this.field418 != null) {
            this.field417 = class68.method464(0, this.field418);
            this.field429 = this.field418.field2485 * 128;
        }
        if (this.field417 != var2 && this.field411 != null) {
            class234.field4082.method1823(this.field411);
            this.field411 = null;
        }
        field419++;
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
    public static final void method175(int arg0) {
        if (arg0 != -1) {
            field422 = -65;
        }
        class177.field3078 = null;
        class266.field4685 = null;
        field413++;
        class109.field1827 = null;
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V")
    public static void method176(int arg0) {
        int var1 = 41 / ((-arg0 - 69) / 57);
        field431 = null;
        field407 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)Lme;")
    public static final class220 method177(byte arg0, int arg1) {
        field432++;
        class220 var2 = (class220) class104.field1731.method1480((byte) 50, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class168.field2940.method1258(class251.method1691(arg1, true), class221.method1479(false, arg1), (byte) 114);
        class220 var4 = new class220();
        if (arg0 >= -69) {
            field407 = null;
        }
        var4.field3825 = arg1;
        if (var3 != null) {
            var4.method1472(new class25(var3), 102);
        }
        var4.method1465((byte) -76);
        if (var4.field3801 != -1) {
            var4.method1468(1, method177((byte) -110, var4.field3801), method177((byte) -105, var4.field3768));
        }
        if (var4.field3802 != -1) {
            var4.method1466((byte) -43, method177((byte) -88, var4.field3819), method177((byte) -102, var4.field3802));
        }
        if (!class94.field1527 && var4.field3782) {
            var4.field3815 = 0;
            var4.field3818 = class200.field3503;
            var4.field3799 = false;
            var4.field3814 = class249.field4356;
            var4.field3779 = class99.field1602;
        }
        class104.field1731.method1483((byte) -110, (long) arg1, var4);
        return var4;
    }
}
