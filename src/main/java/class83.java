import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class83 {

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field1507 = 10;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field1512 = 0;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Z")
    public static boolean field1513 = false;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "J")
    public long field1515;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "Lia;")
    public class83 field1506;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Lia;")
    public class83 field1510;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Z")
    public final boolean method545(int arg0) {
        int var2 = 32 / ((arg0 - 36) / 63);
        field1505++;
        return this.field1510 != null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)Z")
    public static final boolean method546(int arg0, int arg1, int arg2, int arg3) {
        if (class152.method1041(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class23.method165(var4 + 1, class95.field1642[arg0][arg1][arg2] + arg3, var5 + 1) && class23.method165(var4 + 128 - 1, class95.field1642[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class23.method165(var4 + 128 - 1, class95.field1642[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class23.method165(var4 + 1, class95.field1642[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    public final void method547(int arg0) {
        field1516++;
        if (this.field1510 == null) {
            return;
        }
        this.field1510.field1506 = this.field1506;
        this.field1506.field1510 = this.field1510;
        this.field1506 = null;
        this.field1510 = null;
        if (arg0 != 10026) {
            method548(-100, false, (String) null);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method548(int arg0, boolean arg1, String arg2) {
        field1508++;
        if (arg1) {
            class55 var3 = class62.method395(3, arg0, (byte) -66);
            var3.method340((byte) -110);
            var3.field960 = arg2;
        }
    }
}
