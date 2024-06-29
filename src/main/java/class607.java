import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class607 {

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "Lh;")
    private class571 field8749 = new class571(256);

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Lan;")
    private class21 field8744;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "[C")
    public static char[] field8746 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field8751 = 1;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field8743;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field8747;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field8748;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field8750;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field8742;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static void method3561(int arg0) {
        field8746 = null;
        field8742 = null;
        if (arg0 >= -83) {
            field8751 = -102;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)Ldca;")
    public final class151 method3562(int arg0, byte arg1) {
        field8745++;
        class571 var3 = this.field8749;
        class151 var4;
        synchronized (this.field8749) {
            var4 = (class151) this.field8749.method3252((long) arg0, (byte) -105);
        }
        if (var4 != null) {
            return var4;
        } else if (arg1 <= 122) {
            return null;
        } else {
            class21 var5 = this.field8744;
            byte[] var6;
            synchronized (this.field8744) {
                var6 = this.field8744.method240(26, arg0, (byte) -124);
            }
            class151 var7 = new class151();
            if (var6 != null) {
                var7.method987((byte) 74, new class11(var6));
            }
            class571 var8 = this.field8749;
            synchronized (this.field8749) {
                this.field8749.method3243(var7, (long) arg0, 45);
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
    public final void method3563(boolean arg0) {
        if (!arg0) {
            return;
        }
        field8747++;
        class571 var2 = this.field8749;
        synchronized (this.field8749) {
            this.field8749.method3246(false);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZ)V")
    public final void method3564(int arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field8743++;
        class571 var3 = this.field8749;
        synchronized (this.field8749) {
            this.field8749.method3253(arg0, -128);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
    public static final void method3565(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class84.field1367[var1] = false;
        }
        field8748++;
        class438.field6221 = -1;
        class107.field1653 = 1;
        class23.field335 = arg0;
        class151.field2295 = 0;
        class625.field9110 = -1;
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
    public final void method3566(int arg0) {
        field8750++;
        class571 var2 = this.field8749;
        synchronized (this.field8749) {
            this.field8749.method3248(0);
            if (arg0 != -1) {
                field8746 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lhu;ILan;)V")
    public class607(class111 arg0, int arg1, class21 arg2) {
        this.field8744 = arg2;
        this.field8744.method231(26, -118);
    }
}
