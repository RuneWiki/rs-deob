import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class13 {

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Z")
    public boolean field408 = true;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public int field406;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public int field407;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public int field419;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "Lkh;")
    public static class117 field416 = class224.method1450((byte) -18, "<img=1>");

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "Lkh;")
    public static class117 field414 = class224.method1450((byte) -16, "");

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "Lkh;")
    public static class117 field417 = class224.method1450((byte) -77, "Fps:");

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Lkh;")
    public static class117 field402 = field414;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Lkh;")
    public static class117 field410 = field414;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "Lkh;")
    public static class117 field415 = class224.method1450((byte) 120, "<col=ffff00>");

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Lkh;")
    public static class117 field409 = field414;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "Lkh;")
    public static class117 field413 = field414;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "Lkh;")
    public static class117 field422 = field414;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "Lkh;")
    private static class117 field418 = class224.method1450((byte) 110, "Loaded config");

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "Lkh;")
    public static class117 field423 = field418;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Lkh;")
    public static class117 field404 = field414;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field405 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    public static int field427 = 0;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "Lkh;")
    public static class117 field426 = class224.method1450((byte) -55, "::rect_debug");

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "Lkh;")
    private static class117 field429 = class224.method1450((byte) -6, "Password: ");

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "Lkh;")
    public static class117 field428 = field429;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "[[B")
    public static byte[][] field412;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method124(int arg0) {
        field402 = null;
        field412 = null;
        field417 = null;
        field415 = null;
        field428 = null;
        int var1 = -33 % ((-arg0 - 23) / 45);
        field429 = null;
        field423 = null;
        field418 = null;
        field410 = null;
        field426 = null;
        field422 = null;
        field413 = null;
        field414 = null;
        field409 = null;
        field416 = null;
        field405 = null;
        field404 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILvb;I)V")
    public static final void method125(int arg0, class232 arg1, int arg2) {
        int var3 = -49 % ((-arg2 - 48) / 59);
        field424++;
        if (class40.field910 == null) {
            class119.method836(0, 255, true, -1334633144, 255, (byte) 0, null);
            class177.field3199[arg0] = arg1;
        } else {
            class40.field910.field2643 = arg0 * 8 + 5;
            int var4 = class40.field910.method1018(-1068451600);
            int var5 = class40.field910.method1018(-1068451600);
            arg1.method1501(var4, false, var5);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public static final void method126(int arg0) {
        field421++;
        if (arg0 != 255) {
            field428 = null;
        }
        while (true) {
            class36 var1 = class55.field1118;
            class185 var2;
            synchronized (class55.field1118) {
                var2 = (class185) class111.field2077.method326(-110);
            }
            if (var2 == null) {
                return;
            }
            var2.field3328.method1496((byte) -12, false, var2.field3321, (int) var2.field389, var2.field3322);
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field408 = arg6;
        this.field403 = arg0;
        this.field406 = arg5;
        this.field407 = arg3;
        this.field420 = arg1;
        this.field425 = arg4;
        this.field419 = arg2;
    }
}
