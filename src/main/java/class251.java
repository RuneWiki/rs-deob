import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class251 extends class379 {

    @OriginalMember(owner = "client!wu", name = "s", descriptor = "J")
    public static long field3700 = 0L;

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!wu", name = "m", descriptor = "I")
    public int field3694;

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "I")
    public int field3695;

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!wu", name = "q", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!wu", name = "r", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!wu", name = "t", descriptor = "I")
    public int field3701;

    @OriginalMember(owner = "client!wu", name = "u", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!wu", name = "v", descriptor = "I")
    public int field3703;

    @OriginalMember(owner = "client!wu", name = "w", descriptor = "I")
    public int field3704;

    @OriginalMember(owner = "client!wu", name = "x", descriptor = "I")
    public int field3705;

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "Ljava/lang/String;")
    public String field3692;

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "[Z")
    public static boolean[] field3693;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIZ)I")
    public static final int method1631(int arg0, int arg1, int arg2, boolean arg3) {
        field3696++;
        class110 var4 = class455.method2749(88, arg3, arg2);
        if (var4 == null) {
            return 0;
        } else {
            if (arg0 <= 45) {
                field3702 = 18;
            }
            return arg1 >= 0 && var4.field1555.length > arg1 ? var4.field1555[arg1] : 0;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V")
    public static final void method1632(int arg0, int arg1) {
        class512.field7555 = arg1;
        class45.field510 = arg0;
        field3697++;
        class45.field510 = -1;
        class231.method1552(arg0);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method1633(byte[] arg0, boolean arg1) {
        field3691++;
        class65 var2 = new class65(arg0);
        int var3 = var2.method577(255);
        if (arg1) {
            field3700 = -108L;
        }
        int var4 = var2.method616((byte) 104);
        if (var4 < 0 || !(class241.field3574 == 0 || class241.field3574 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method595((byte) 22, var4, 0, var7);
            return var7;
        } else {
            int var5 = var2.method616((byte) 119);
            if (var5 < 0 || !(class241.field3574 == 0 || class241.field3574 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class469.method2837(var6, var5, arg0, var4, 9);
            } else {
                class369.field5487.method1726((byte) -33, var6, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(I)V")
    public static void method1634(int arg0) {
        if (arg0 == 0) {
            field3693 = null;
        }
    }
}
