import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class384 {

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Lge;")
    private class551 field5624 = new class551();

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field5614 = 0;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lwca;")
    public static class311 field5622;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Lge;")
    private class551 field5625;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lps;I)Ljava/lang/String;")
    public static final String method2326(class428 arg0, int arg1) {
        if (arg1 >= -53) {
            return null;
        } else {
            field5621++;
            return class97.method560(-114, 32767, arg0);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Lge;")
    public final class551 method2327(int arg0) {
        field5620++;
        class551 var2 = this.field5625;
        if (this.field5624 == var2) {
            this.field5625 = null;
            return null;
        }
        this.field5625 = var2.field8211;
        if (arg0 != 10005) {
            field5626 = -79;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static void method2328(int arg0) {
        if (arg0 != 2) {
            method2328(-121);
        }
        field5622 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)V")
    public static final void method2329(boolean arg0, int arg1) {
        field5623++;
        if (arg0) {
            if (class540.field8007 != -1) {
                class59.method378(class540.field8007, (byte) 57);
            }
            for (class184 var2 = (class184) class600.field8865.method1331(-1925); var2 != null; var2 = (class184) class600.field8865.method1340((byte) 37)) {
                if (!var2.method2994(arg1 ^ 0x99)) {
                    var2 = (class184) class600.field8865.method1331(-1925);
                    if (var2 == null) {
                        break;
                    }
                }
                class587.method3424(544, true, var2, false);
            }
            class540.field8007 = -1;
            class600.field8865 = new class205(8);
            class239.method1535(-109);
            class540.field8007 = class600.field8841;
            class558.method3267(false, (byte) 119);
            class539.method3164(-119);
            class330.method2074(class540.field8007);
        }
        class601.field8873 = false;
        class451.field6590 = "";
        class227.field3343 = "";
        class449.method2718(true);
        class362.field5233 = -1;
        class235.method1523(false, class591.field8746);
        class239.field3493 = new class179();
        class239.field3493.field3463 = class382.field5586 * 128 / 2;
        class239.field3493.field3464 = class35.field399 * arg1 / 2;
        class239.field3493.field1090[0] = class35.field399 / 2;
        class239.field3493.field1089[0] = class382.field5586 / 2;
        class367.field5319 = 0;
        class358.field5200 = 0;
        if (class287.field4232 == 2) {
            class358.field5200 = class2.field12 << 7;
            class367.field5319 = class111.field1408 << 7;
        } else {
            class621.method3597((byte) -111);
        }
        class598.method3496(arg1 - 20);
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)I")
    public final int method2330(int arg0) {
        field5615++;
        int var2 = 0;
        class551 var3 = this.field5624.field8211;
        while (this.field5624 != var3) {
            var3 = var3.field8211;
            var2++;
        }
        if (arg0 != -14638) {
            field5614 = -73;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILge;)V")
    public final void method2331(int arg0, class551 arg1) {
        field5618++;
        if (arg1.field8203 != null) {
            arg1.method3225(arg0 ^ 0xFFFFFFB5);
        }
        if (arg0 != 2) {
            this.method2330(73);
        }
        arg1.field8211 = this.field5624;
        arg1.field8203 = this.field5624.field8203;
        arg1.field8203.field8211 = arg1;
        arg1.field8211.field8203 = arg1;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)Lge;")
    public final class551 method2332(boolean arg0) {
        field5617++;
        class551 var2 = this.field5624.field8211;
        if (this.field5624 == var2) {
            return null;
        }
        var2.method3225(-41);
        if (arg0) {
            field5622 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)Lge;")
    public final class551 method2333(int arg0) {
        field5616++;
        class551 var2 = this.field5624.field8211;
        if (arg0 != -1) {
            field5622 = null;
        }
        if (this.field5624 == var2) {
            this.field5625 = null;
            return null;
        } else {
            this.field5625 = var2.field8211;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    public class384() {
        this.field5624.field8203 = this.field5624;
        this.field5624.field8211 = this.field5624;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public final void method2334(byte arg0) {
        field5619++;
        while (true) {
            class551 var2 = this.field5624.field8211;
            if (this.field5624 == var2) {
                this.field5625 = null;
                if (arg0 == -97) {
                    return;
                } else {
                    method2328(-80);
                    return;
                }
            }
            var2.method3225(-78);
        }
    }
}
