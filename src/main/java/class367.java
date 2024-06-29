import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class367 extends class29 {

    @OriginalMember(owner = "client!bo", name = "K", descriptor = "[B")
    public byte[] field5310;

    @OriginalMember(owner = "client!bo", name = "H", descriptor = "Z")
    public static boolean field5307 = true;

    @OriginalMember(owner = "client!bo", name = "J", descriptor = "I")
    public static int field5309 = 0;

    @OriginalMember(owner = "client!bo", name = "M", descriptor = "[I")
    public static int[] field5312 = new int[14];

    @OriginalMember(owner = "client!bo", name = "D", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!bo", name = "F", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!bo", name = "I", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!bo", name = "L", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!bo", name = "C", descriptor = "Lct;")
    public static class104 field5303;

    @OriginalMember(owner = "client!bo", name = "E", descriptor = "Lh;")
    public static class440 field5305;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 4)
    public static final int method2335(String arg0, int arg1) {
        field5311++;
        for (int var2 = 0; var2 < class79.field989.length; var2++) {
            if (class79.field989[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return arg1 > -127 ? -44 : -1;
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)V", line = 27)
    public static void method2336(byte arg0) {
        field5303 = null;
        field5305 = null;
        field5312 = null;
        if (arg0 <= 117) {
            method2338(0, (byte) -92, -64, -21);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLkg;)Z", line = 41)
    public static final boolean method2337(byte arg0, class223 arg1) {
        field5304++;
        if (class304.field4461 == arg1.field3357) {
            class243.field3603 = 250;
            return true;
        } else {
            if (arg0 != 114) {
                method2335((String) null, -94);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IBII)I", line = 67)
    public static final int method2338(int arg0, byte arg1, int arg2, int arg3) {
        field5308++;
        if ((class131.field1790[arg2][arg0][arg3] & 0x8) != 0) {
            return 0;
        } else if (arg2 <= 0 || (class131.field1790[1][arg0][arg3] & 0x2) == 0) {
            if (arg1 < 101) {
                method2338(-117, (byte) -24, -39, -68);
            }
            return arg2;
        } else {
            return arg2 - 1;
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)I", line = 87)
    public static final int method2339(int arg0, int arg1) {
        if (arg0 != 462) {
            method2337((byte) 90, (class223) null);
        }
        field5306++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "([B)V", line = 101)
    public class367(byte[] arg0) {
        this.field5310 = arg0;
    }
}
