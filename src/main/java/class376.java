import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class376 {

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "[I")
    public static int[] field5362 = new int[8];

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "[I")
    public static int[] field5368 = new int[1000];

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Z")
    public static boolean field5359 = false;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "Lng;")
    public static class190 field5360 = new class190(10);

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "J")
    public long field5363;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "Lmh;")
    public class376 field5365;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "Lmh;")
    public class376 field5369;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(CB)C", line = 3)
    public static final char method2456(char arg0, byte arg1) {
        field5367++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else {
            if (arg1 != 64) {
                field5359 = true;
            }
            if (arg0 == 'ß') {
                return 's';
            } else if (arg0 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg0 == 'œ' ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V", line = 34)
    public static final void method2457(byte arg0) {
        field5370++;
        if (class67.field1043 == 2) {
            return;
        }
        int var1 = 126 % ((68 - arg0) / 52);
        try {
            class274.method1687(class331.field4489, -5778, "tbrefresh");
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V", line = 55)
    public static void method2458(byte arg0) {
        field5362 = null;
        field5360 = null;
        if (arg0 <= -52) {
            field5368 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V", line = 70)
    public final void method2459(int arg0) {
        if (arg0 != 198) {
            method2456((char) 65457, (byte) -96);
        }
        field5361++;
        if (this.field5369 != null) {
            this.field5369.field5365 = this.field5365;
            this.field5365.field5369 = this.field5369;
            this.field5365 = null;
            this.field5369 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)Z", line = 107)
    public final boolean method2460(int arg0) {
        if (arg0 < 42) {
            field5362 = null;
        }
        field5366++;
        return this.field5369 != null;
    }
}
