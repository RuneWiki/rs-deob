import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class317 implements class669 {

    @OriginalMember(owner = "client!us", name = "j", descriptor = "I")
    private int field8;

    @OriginalMember(owner = "client!us", name = "i", descriptor = "Z")
    public static boolean field7 = true;

    @OriginalMember(owner = "client!us", name = "h", descriptor = "I")
    public static int field6 = 2;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "Lvw;")
    public static class274 field4 = new class274();

    @OriginalMember(owner = "client!us", name = "c", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!us", name = "g", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!us", name = "k", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lap;I[BI)V", line = 8)
    public class1(class435 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field8 = arg1;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILjava/lang/String;ZLta;)V", line = 16)
    public static final void method1(int arg0, String arg1, boolean arg2, class195 arg3) {
        ++field9;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class653.field9338.method3617(0, arg1, 250, (class458[]) null);
        int var8 = 13 * class653.field9338.method3618((class458[]) null, 250, 3, arg1);
        class453.field6284.method286(-var4 + var5, -var4 + var6, var7 - (-var4 + -var4), var4 + var8 + var4, -16777216, 0);
        class453.field6284.method334(-var4 + var5, -var4 + var6, var4 + var7 + var4, var4 + var4 + var8, -1, 0);
        arg3.method1127(0, var6, -1, (class213) null, 0, 0, var8, 1, var5, -1, 1, arg1, var7, (class458[]) null, true, (int[]) null);
        class281.method1608(-12040, var7 - -var4 + var4, -var4 + var6, var4 + var8 + var4, var5 - var4);
        if (arg2) {
            try {
                class453.field6284.method341();
            } catch (class295 var9) {
            }
        }
        if (arg0 <= 73) {
            field4 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)I", line = 48)
    public final int method2(int arg0) {
        ++field5;
        int var2 = 25 / ((-54 - arg0) / 38);
        return 0;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)I", line = 59)
    public final int method3(int arg0) {
        if (arg0 != 29970) {
            return -8;
        } else {
            ++field3;
            return this.field8;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IB[BI)V", line = 75)
    public final void method4(int arg0, byte arg1, byte[] arg2, int arg3) {
        this.method1791(arg2, arg0);
        ++field1;
        this.field8 = arg3;
        if (arg1 != 5) {
            field4 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(I)V", line = 88)
    public static void method5(int arg0) {
        field4 = null;
        if (arg0 != 18763) {
            field6 = 110;
        }
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(I)J", line = 101)
    public final long method6(int arg0) {
        ++field2;
        if (arg0 != 1151) {
            this.method4(-15, (byte) -27, (byte[]) null, 43);
        }
        return super.field4116.getAddress();
    }
}
