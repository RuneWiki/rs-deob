import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ja")
public class class20 {

    @OriginalMember(owner = "mapview!ja", name = "e", descriptor = "Lu;")
    public static class38 field205 = class28.method177("map", (byte) -84);

    @OriginalMember(owner = "mapview!ja", name = "d", descriptor = "I")
    public static volatile int field204 = 0;

    @OriginalMember(owner = "mapview!ja", name = "f", descriptor = "I")
    public static int field206 = 20;

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "Lsa;")
    public static class36 field202 = new class36();

    @OriginalMember(owner = "mapview!ja", name = "h", descriptor = "Lu;")
    public static class38 field208 = class28.method177("Crafting Shop", (byte) -84);

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "J")
    public static long field201;

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "J")
    public static long field203;

    @OriginalMember(owner = "mapview!ja", name = "g", descriptor = "Ljava/awt/Font;")
    public static Font field207;

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(I[Lu;II)V", line = 12)
    public static final void method122(int arg0, class38[] arg1, int arg2, int arg3) {
        if (arg0 == 1) {
            arg1[0].method236(0);
        } else {
            class4.method28(arg1, 57, arg2, arg0).method236(0);
        }
        if (arg3 != 12024) {
            method122(-123, null, 76, -119);
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(BI)[B", line = 29)
    public static final synchronized byte[] method123(byte arg0, int arg1) {
        if (arg1 == 100 && class16.field155 > 0) {
            byte[] var2 = class30.field382[--class16.field155];
            class30.field382[class16.field155] = null;
            return var2;
        } else if (arg1 == 5000 && class19.field195 > 0) {
            byte[] var3 = class18.field177[--class19.field195];
            class18.field177[class19.field195] = null;
            return var3;
        } else if (arg1 == 30000 && class34.field415 > 0) {
            byte[] var4 = class3.field31[--class34.field415];
            class3.field31[class34.field415] = null;
            return var4;
        } else {
            if (arg0 != -87) {
                method125(true);
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(B)V", line = 73)
    public static final void method124(byte arg0) {
        class22 var1 = class9.field87;
        synchronized (class9.field87) {
            class23.field227 = class9.field91;
            class37.field475 = class18.field176;
            class22.field217 = class26.field250;
            class9.field92 = class7.field71;
            class34.field424 = class25.field238;
            class23.field225 = field204;
            class7.field71 = 0;
            if (arg0 <= 96) {
                field207 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(Z)V", line = 107)
    public static void method125(boolean arg0) {
        field207 = null;
        field202 = null;
        field205 = null;
        field208 = null;
        if (arg0) {
            field205 = null;
        }
    }
}
