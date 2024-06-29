import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class320 {

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Z")
    public boolean field4682 = false;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Ldj;")
    public static class191 field4687 = new class191(16);

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field4690 = 0;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Z")
    public static boolean field4689 = false;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public int field4679;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public int field4680;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "[[[B")
    public static byte[][][] field4692;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILvq;ZB)Lvj;", line = 3)
    public final class256 method2125(int arg0, class269 arg1, boolean arg2, byte arg3) {
        if (arg3 >= -36) {
            this.field4682 = true;
        }
        field4684++;
        long var5 = (long) (arg1.field3936 << 19 | (arg2 ? 262144 : 0) | arg0 << 16 | this.field4680);
        class256 var7 = (class256) class381.field5408.method99(true, var5);
        if (var7 != null) {
            return var7;
        } else if (class407.field5735.method660(this.field4680, (byte) 103)) {
            class337 var8 = class337.method2225(class407.field5735, this.field4680, 0);
            if (var8 != null) {
                var8.field4882 = var8.field4883 = var8.field4887 = var8.field4880 = 0;
                if (arg2) {
                    var8.method2219();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method2221();
                }
            }
            class256 var10 = arg1.method870(var8, true);
            if (var10 != null) {
                class381.field5408.method90(var10, var5, 0);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Z", line = 52)
    public final boolean method2126(int arg0) {
        field4685++;
        if (arg0 != 0) {
            this.method2126(-27);
        }
        return class407.field5735.method660(this.field4680, (byte) -106);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V", line = 66)
    public static void method2127(int arg0) {
        field4687 = null;
        if (arg0 != 0) {
            method2127(-102);
        }
        field4692 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Llf;IBI)V", line = 86)
    private final void method2128(class130 arg0, int arg1, byte arg2, int arg3) {
        field4688++;
        if (arg3 == 1) {
            this.field4680 = arg0.method798(false);
        } else if (arg3 == 2) {
            this.field4679 = arg0.method839((byte) -92);
        } else if (arg3 == 3) {
            this.field4682 = true;
        } else if (arg3 == 4) {
            this.field4680 = -1;
        }
        if (arg2 > -31) {
            field4690 = -78;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Llf;IB)V", line = 117)
    public final void method2129(class130 arg0, int arg1, byte arg2) {
        if (arg2 > -44) {
            this.method2129((class130) null, 1, (byte) -50);
        }
        field4683++;
        while (true) {
            int var4 = arg0.method837(true);
            if (var4 == 0) {
                return;
            }
            this.method2128(arg0, arg1, (byte) -70, var4);
        }
    }
}
