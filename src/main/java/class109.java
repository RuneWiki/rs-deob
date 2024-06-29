import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class109 {

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public int field1337;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public int field1341;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "B")
    public byte field1343;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "Z")
    public boolean field1340;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "S")
    public short field1335;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "S")
    public short field1338;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public int field1342;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "S")
    public short field1344;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method679(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1339++;
        class128.method789(arg7, arg0, arg4, (byte) -75, arg6, arg1, arg8, arg3, arg2, arg5);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)Lpk;")
    public static final class171 method680(byte arg0) {
        field1336++;
        class171 var1 = (class171) class354.field5031.method3290(255);
        if (var1 == null) {
            return arg0 < 61 ? null : new class171();
        } else {
            class568.field8156--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field1337 = arg1;
        this.field1346 = arg3;
        this.field1341 = arg0;
        this.field1345 = arg11;
        this.field1343 = (byte) arg8;
        this.field1340 = arg10;
        this.field1335 = (short) arg5;
        this.field1338 = (short) arg4;
        this.field1342 = arg2;
        this.field1344 = (short) arg6;
    }
}
