import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class371 {

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "Lfe;")
    private class384 field5563 = new class384(256);

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "Lfe;")
    private class384 field5570 = new class384(256);

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "Lhe;")
    private class239 field5568;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Lhe;")
    private class239 field5562;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "Lph;")
    public static class438 field5567;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lni;")
    public static final class345 method2255(Component arg0, int arg1, boolean arg2) {
        field5572++;
        if (arg1 != 1091098512) {
            method2257(84, -126);
        }
        return new class337(arg0, arg2);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([IIZ)Lhh;")
    public final class80 method2256(int[] arg0, int arg1, boolean arg2) {
        field5569++;
        if (this.field5568.method1466(arg2) == 1) {
            return this.method2258(312014604, arg0, arg1, 0);
        } else if (this.field5568.method1473(4309, arg1) == 1) {
            return this.method2258(312014604, arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V")
    public static final void method2257(int arg0, int arg1) {
        class378.field5658 = 1;
        class376.field5626 = -1;
        int var2 = -108 % ((arg1 - 8) / 59);
        class409.field6002 = arg0;
        class55.field857 = -1;
        field5571++;
        class8.field139 = 0;
        class181.field2593 = null;
        class25.field424 = false;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[III)Lhh;")
    private final class80 method2258(int arg0, int[] arg1, int arg2, int arg3) {
        field5564++;
        int var5 = (arg3 << 4 & 0xFFFB | arg3 >>> 12) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class80 var9 = (class80) this.field5570.method2310((byte) -65, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class264 var10 = class264.method1629(this.field5568, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            if (arg0 != 312014604) {
                method2257(61, 37);
            }
            class80 var11 = var10.method1626();
            this.field5570.method2317(-1, var7, var11);
            if (arg1 != null) {
                arg1[0] -= var11.field1112.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static void method2259(int arg0) {
        field5567 = null;
        if (arg0 <= 53) {
            field5567 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III[I)Lhh;")
    private final class80 method2260(int arg0, int arg1, int arg2, int[] arg3) {
        field5565++;
        int var5 = arg1 ^ ((arg0 & 0xC0000FFF) << 4 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class80 var9 = (class80) this.field5570.method2310((byte) 82, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class401 var10 = (class401) this.field5563.method2310((byte) 119, var7);
            if (var10 == null) {
                var10 = class401.method2394(this.field5562, arg0, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field5563.method2317(-1, var7, var10);
            }
            class80 var11 = var10.method2391(arg3);
            if (var11 == null) {
                return null;
            }
            var10.method536(false);
            this.field5570.method2317(-1, var7, var11);
            if (arg2 >= -53) {
                this.field5570 = null;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([III)Lhh;")
    public final class80 method2261(int[] arg0, int arg1, int arg2) {
        field5566++;
        if (this.field5562.method1466(false) == 1) {
            return this.method2260(0, arg1, -114, arg0);
        } else if (this.field5562.method1473(4309, arg1) == 1) {
            return this.method2260(arg1, 0, -93, arg0);
        } else {
            if (arg2 != 11058) {
                this.field5563 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lhe;Lhe;)V")
    public class371(class239 arg0, class239 arg1) {
        this.field5568 = arg0;
        this.field5562 = arg1;
    }

    static {
        new class194("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
    }
}
