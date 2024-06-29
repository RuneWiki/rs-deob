import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class438 {

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "S")
    public short field6533;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "B")
    public byte field6548;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "S")
    public short field6547;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "S")
    public short field6540;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public int field6535;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public int field6542;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "B")
    public byte field6534;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public int field6541;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Z")
    public boolean field6543;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public int field6537;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public int field6544;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field6539 = -1;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "[I")
    public static int[] field6538 = new int[2];

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field6546 = 0;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field6545 = 0;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "([Ljava/lang/String;B[S)V", line = 16)
    public static final void method2631(String[] arg0, byte arg1, short[] arg2) {
        field6536++;
        if (arg1 > -123) {
            method2631(null, (byte) -86, null);
        }
        class179.method1220(111, 0, arg2, arg0, arg0.length - 1);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V", line = 34)
    public static void method2632(boolean arg0) {
        field6538 = null;
        if (!arg0) {
            method2631(null, (byte) 73, null);
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 57)
    public class438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field6533 = (short) arg4;
        this.field6548 = (byte) arg7;
        this.field6547 = (short) arg5;
        this.field6540 = (short) arg6;
        this.field6535 = arg3;
        this.field6542 = arg1;
        this.field6534 = (byte) arg8;
        this.field6541 = arg0;
        this.field6543 = arg10;
        this.field6537 = arg11;
        this.field6544 = arg2;
    }
}
