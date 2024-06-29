import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public abstract class class786 extends class173 {

    @OriginalMember(owner = "client!np", name = "v", descriptor = "Z")
    public volatile boolean field10779 = true;

    @OriginalMember(owner = "client!np", name = "t", descriptor = "I")
    public static int field10777 = 0;

    @OriginalMember(owner = "client!np", name = "r", descriptor = "I")
    public static int field10775;

    @OriginalMember(owner = "client!np", name = "u", descriptor = "I")
    public static int field10778;

    @OriginalMember(owner = "client!np", name = "s", descriptor = "Z")
    public boolean field10776;

    @OriginalMember(owner = "client!np", name = "w", descriptor = "Z")
    public boolean field10780;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)I")
    public static final int method4307(int arg0) {
        field10778++;
        if (arg0 >= -61) {
            field10777 = -120;
        }
        return class75.field1061;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)I")
    public abstract int method630(boolean arg0);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method4308(int arg0, String arg1) {
        field10775++;
        if (arg0 != -606477371) {
            method4307(116);
        }
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + (long) arg1.charAt(var5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)[B")
    public abstract byte[] method629(int arg0);
}
