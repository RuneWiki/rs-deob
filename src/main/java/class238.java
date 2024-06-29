import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class238 extends class97 {

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
    public static int field3297 = 0;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    public int field3291;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "I")
    public int field3292;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
    public int field3299;

    @OriginalMember(owner = "client!vl", name = "A", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "J")
    public long field3289;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "Z")
    public static boolean field3287;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)I", line = 4)
    public final int method779(byte arg0) {
        field3295++;
        int var2 = -23 / ((4 - arg0) / 47);
        return this.field3299;
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)I", line = 25)
    public final int method778(int arg0) {
        field3290++;
        if (arg0 != -7747) {
            this.field3299 = 54;
        }
        return this.field3292;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V", line = 36)
    public static final void method1452(int arg0, int arg1) {
        if (arg0 != 0) {
            method1453((byte) 9, null);
        }
        class70.field1018 = arg1;
        field3296++;
        class125.field1920.method2764(-769);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLjava/lang/String;)I", line = 48)
    public static final int method1453(byte arg0, String arg1) {
        field3288++;
        int var2 = 0;
        if (arg0 != -75) {
            field3297 = -109;
        }
        while (class291.field3946.length > var2) {
            if (class291.field3946[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)I", line = 69)
    public final int method777(int arg0) {
        int var2 = 105 / ((-arg0 - 68) / 41);
        field3300++;
        return this.field3291;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)Z", line = 83)
    public static final boolean method1454(int arg0, int arg1) {
        if (arg1 <= 94) {
            field3297 = 83;
        }
        field3298++;
        class535.field7877 = true;
        class123.field1903 = arg0 + 1 & 0xFFFF;
        return true;
    }

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)J", line = 102)
    public final long method780(int arg0) {
        if (arg0 == -5) {
            field3294++;
            return this.field3289;
        } else {
            return 40L;
        }
    }
}
