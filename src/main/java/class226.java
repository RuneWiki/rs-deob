import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class226 extends class389 {

    @OriginalMember(owner = "client!kw", name = "Hb", descriptor = "I")
    public static int field2931 = 0;

    @OriginalMember(owner = "client!kw", name = "Eb", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!kw", name = "Fb", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!kw", name = "Gb", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!kw", name = "Ib", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!kw", name = "Db", descriptor = "Ljava/lang/Object;")
    public static Object field2927;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(FB)V", line = 3)
    public final void method1376(float arg0, byte arg1) {
        ++field2930;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field5205[super.field5195++] = (byte) var3;
        super.field5205[super.field5195++] = (byte) (var3 >> 8);
        if (arg1 >= -58) {
            method1378(-123, -83, -67);
        }
        super.field5205[super.field5195++] = (byte) (var3 >> 16);
        super.field5205[super.field5195++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IF)V", line = 20)
    public final void method1377(int arg0, float arg1) {
        if (arg0 == 134389112) {
            ++field2928;
            int var3 = Stream.floatToRawIntBits(arg1);
            super.field5205[super.field5195++] = (byte) (var3 >> 24);
            super.field5205[super.field5195++] = (byte) (var3 >> 16);
            super.field5205[super.field5195++] = (byte) (var3 >> 8);
            super.field5205[super.field5195++] = (byte) var3;
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(III)Z", line = 37)
    public static final boolean method1378(int arg0, int arg1, int arg2) {
        ++field2932;
        if (arg0 != -905560472) {
            return true;
        } else {
            return ~(2048 & arg2) != -1;
        }
    }

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "(B)V", line = 56)
    public static void method1379(byte arg0) {
        if (arg0 != 100) {
            method1378(111, -32, -14);
        }
        field2927 = null;
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(I)V", line = 66)
    public class226(int arg0) {
        super(arg0);
    }
}
