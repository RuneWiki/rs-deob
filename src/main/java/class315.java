import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class315 {

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field4454 = -1;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Lae;")
    public static class172 field4453 = null;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "Z")
    public static boolean field4458 = false;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Lgh;")
    public class315 field4451;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Lgh;")
    public class315 field4452;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 4)
    public final void method2003(int arg0) {
        field4456++;
        if (this.field4452 == null) {
            return;
        }
        this.field4452.field4451 = this.field4451;
        this.field4451.field4452 = this.field4452;
        this.field4452 = null;
        if (arg0 == 1) {
            this.field4451 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLam;ZLjava/lang/String;)V", line = 22)
    public static final void method2004(byte arg0, class199 arg1, boolean arg2, String arg3) {
        if (arg0 <= 72) {
            return;
        }
        field4457++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class293.field4144.method1350((class417[]) null, arg3, true, 250);
        int var8 = class293.field4144.method1357((class417[]) null, (byte) 124, arg3, 250) * 13;
        class374.field5152.method438(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 - -var4 + var8, -16777216, 0);
        class374.field5152.method348(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var8 + var4, -1, 0);
        arg1.method1378(var8, (int[]) null, -1, 0, var6, (byte) -104, 0, arg3, (class405) null, 1, var7, (class417[]) null, 1, -1, var5, 0);
        class69.method638(var4 + var8 + var4, var4 + var7 + var4, var5 - var4, (byte) 126, var6 - var4);
        if (arg2) {
            class374.field5152.method343();
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V", line = 69)
    public static void method2005(int arg0) {
        field4453 = null;
        if (arg0 != 13) {
            field4458 = false;
        }
    }
}
