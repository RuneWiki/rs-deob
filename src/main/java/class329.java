import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public abstract class class329 extends class69 {

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field4613;

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "I")
    public static int field4611 = -1;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "Lqk;")
    public static class1 field4609 = new class1(8, -1);

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "Lhba;")
    public static class719 field4618 = new class719();

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
    public int field4616;

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "[I")
    public static int[] field4620;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2072(int arg0, int arg1, byte arg2) {
        if (arg2 != 25) {
            field4619 = 12;
        }
        field4615++;
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
    public static final void method2073(int arg0, int arg1) {
        field4614++;
        class17 var2 = class245.method1634(1, (long) arg1, 5);
        var2.method69(13);
        if (arg0 != 29824) {
            method2072(51, 118, (byte) 70);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IJI)Ljava/lang/String;")
    public static final String method2074(int arg0, long arg1, int arg2) {
        field4617++;
        class324.method2052(43, arg1);
        if (arg0 != 10) {
            method2075((char) 65439, -55);
        }
        int var4 = class448.field6277.get(5);
        int var5 = class448.field6277.get(2) + 1;
        int var6 = class448.field6277.get(1);
        return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)V")
    public abstract void method342(boolean arg0);

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(CI)Z")
    public static final boolean method2075(char arg0, int arg1) {
        field4610++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class475.method2831(arg0, (byte) 116)) {
            return true;
        } else {
            if (arg1 != 12701) {
                field4609 = null;
            }
            char[] var2 = class154.field2010;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class580.field8154;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
    public static void method2076(int arg0) {
        field4609 = null;
        if (arg0 <= -48) {
            field4618 = null;
            field4620 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public abstract void method337(OggPacket arg0, int arg1);

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V")
    public final void method2077(byte arg0, OggPacket arg1) {
        this.method337(arg1, 118);
        field4612++;
        this.field4616++;
        if (arg0 > -19) {
            field4611 = 82;
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class329(OggStreamState arg0) {
        this.field4613 = arg0;
    }
}
