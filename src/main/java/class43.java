import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class43 {

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public int field554 = 128;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public int field562 = 128;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public int field560;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public int field556;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
    public int field566;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "Ldr;")
    public static class293 field559 = new class293(5000);

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public int field555;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public int field557;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public int field561;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public int field565;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
    public static void method333(int arg0) {
        field559 = null;
        int var1 = 91 / ((-arg0 - 59) / 38);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lmn;I)V")
    public final void method334(class43 arg0, int arg1) {
        field563++;
        this.field566 = arg0.field566;
        if (arg1 != 128) {
            method333(122);
        }
        this.field560 = arg0.field560;
        this.field556 = arg0.field556;
        this.field564 = arg0.field564;
        this.field554 = arg0.field554;
        this.field562 = arg0.field562;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)Lmn;")
    public final class43 method335(int arg0) {
        field567++;
        if (arg0 != 0) {
            this.method335(7);
        }
        return new class43(this.field560, this.field554, this.field562, this.field564, this.field566, this.field556);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZLvj;ZZ)V")
    public static final void method336(boolean arg0, class313 arg1, boolean arg2, boolean arg3) {
        field558++;
        int var4 = arg1.field4852;
        int var5 = (int) arg1.field1739;
        arg1.method876((byte) -96);
        if (arg0) {
            class79.method568(var4, (byte) 122);
        }
        class497.method2948((byte) -11, var4);
        class310 var6 = class52.method386(0, var5);
        if (var6 != null) {
            class292.method1812(-14307, var6);
        }
        class414.method2478(64);
        if (!arg3 && class256.field3477 != -1) {
            class398.method2389(1, class256.field3477, 0);
        }
        class34 var7 = new class34(class312.field4840);
        for (class313 var8 = (class313) var7.method286(true); var8 != null; var8 = (class313) var7.method288((byte) 100)) {
            if (!var8.method875(0)) {
                var8 = (class313) var7.method286(true);
                if (var8 == null) {
                    break;
                }
            }
            if (var8.field4851 == 3) {
                int var9 = (int) var8.field1739;
                if (var9 >>> 16 == var4) {
                    method336(true, var8, false, arg3);
                }
            }
        }
        if (arg2) {
            field559 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(I)V")
    public class43(int arg0) {
        this.field560 = arg0;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(IIIIII)V")
    private class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field554 = arg1;
        this.field562 = arg2;
        this.field556 = arg5;
        this.field566 = arg4;
        this.field564 = arg3;
        this.field560 = arg0;
    }
}
