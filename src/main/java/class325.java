import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class325 extends class289 {

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "I")
    public int field4685;

    @OriginalMember(owner = "client!ah", name = "cb", descriptor = "I")
    public int field4692;

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "Z")
    public boolean field4686;

    @OriginalMember(owner = "client!ah", name = "bb", descriptor = "F")
    public float field4691;

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "F")
    public float field4687;

    @OriginalMember(owner = "client!ah", name = "Y", descriptor = "Lcda;")
    public static class149 field4688 = new class149("runescape", 0);

    @OriginalMember(owner = "client!ah", name = "db", descriptor = "Lkca;")
    public static class73 field4693 = new class73(70, 5);

    @OriginalMember(owner = "client!ah", name = "eb", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4694 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!ah", name = "Z", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!ah", name = "fb", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!ah", name = "ab", descriptor = "Lbg;")
    public static class400 field4690;

    @OriginalMember(owner = "client!ah", name = "gb", descriptor = "Z")
    public static boolean field4696;

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lad;IIIII[BI)V", line = 4)
    public class325(class362 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field4685 = arg2;
        this.field4692 = arg3;
        this.method1872(arg3, 0, arg2, 0, arg6, 0, 0, true, 30491, arg7);
        this.field4686 = false;
        this.field4691 = (float) arg2 / (float) arg4;
        this.field4687 = (float) arg3 / (float) arg5;
        this.method1867(false, 2203, false);
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lad;IIIIZ[BI)V", line = 18)
    public class325(class362 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field4685 = arg3;
        this.field4692 = arg4;
        if (~super.field7373 != -34038) {
            this.field4686 = true;
            this.field4691 = this.field4687 = 1.0F;
        } else {
            this.field4691 = (float) arg3;
            this.field4686 = false;
            this.field4687 = (float) arg4;
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)V", line = 40)
    public static void method2111(byte arg0) {
        field4690 = null;
        field4693 = null;
        if (arg0 != 26) {
            field4693 = null;
        }
        field4694 = null;
        field4688 = null;
    }

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "(I)V", line = 54)
    public static final void method2112(int arg0) {
        if (arg0 > 51) {
            ++field4689;
            if (class403.field6094 != null) {
                class403.field6094.method3522(16384);
                class403.field6094 = null;
                class169.field2060 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lad;IIIIIZ)V", line = 72)
    public class325(class362 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (~super.field7373 == -34038) {
            this.field4686 = false;
            this.field4687 = (float) arg5;
            this.field4691 = (float) arg4;
        } else {
            this.field4686 = true;
            this.field4691 = this.field4687 = 1.0F;
        }
        this.field4685 = arg4;
        this.field4692 = arg5;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([BZI)[B", line = 96)
    public static final byte[] method2113(byte[] arg0, boolean arg1, int arg2) {
        ++field4684;
        if (!arg1) {
            return null;
        } else {
            byte[] var3 = new byte[arg2];
            class210.method1330(arg0, 0, var3, 0, arg2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lad;IIIIIIZ)V", line = 114)
    public class325(class362 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field4692 = arg4;
        this.field4687 = (float) arg4 / (float) arg6;
        this.field4686 = false;
        this.field4691 = (float) arg3 / (float) arg5;
        this.field4685 = arg3;
        this.method1867(false, 2203, false);
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lad;IIII[I)V", line = 132)
    public class325(class362 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field4692 = arg2;
        this.field4685 = arg1;
        this.method1869(arg1, 0, arg2, 0, 0, (byte) 20, true, 0, arg5);
        this.field4687 = (float) arg2 / (float) arg4;
        this.field4686 = false;
        this.field4691 = (float) arg1 / (float) arg3;
        this.method1867(false, 2203, false);
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lad;IIIZ[I)V", line = 146)
    public class325(class362 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field4692 = arg3;
        if (~super.field7373 == -34038) {
            this.field4691 = (float) arg2;
            this.field4687 = (float) arg3;
            this.field4686 = false;
        } else {
            this.field4686 = true;
            this.field4691 = this.field4687 = 1.0F;
        }
        this.field4685 = arg2;
    }
}
