import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class class28 {

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Lqf;")
    public static class117 field547 = class72.method514(100, "Ihre Nachricht an: ");

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Lqf;")
    private static class117 field546 = class72.method514(124, "Login limit exceeded)3");

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Lqf;")
    public static class117 field553 = class72.method514(126, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!df", name = "g", descriptor = "Lqf;")
    public static class117 field549 = class72.method514(102, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Lqf;")
    public static class117 field545 = class72.method514(102, "Schlie-8en");

    @OriginalMember(owner = "client!df", name = "o", descriptor = "Lqf;")
    public static class117 field557 = class72.method514(101, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!df", name = "q", descriptor = "Lqf;")
    public static class117 field559 = field546;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "Lqf;")
    public static class117 field558 = class72.method514(116, ")3");

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Lqf;")
    public static class117 field548 = class72.method514(119, "");

    @OriginalMember(owner = "client!df", name = "l", descriptor = "Lqf;")
    public static class117 field554 = class72.method514(121, "au");

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public int field550;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public int field556;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Ljb;")
    public static class64 field543;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "Ljava/awt/Image;")
    public Image field560;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[I")
    public int[] field544;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
    public abstract void method210(int arg0, int arg1, byte arg2, Graphics arg3);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method211(int arg0) {
        if (arg0 < 101) {
            return;
        }
        field559 = null;
        field554 = null;
        field545 = null;
        field549 = null;
        field548 = null;
        field543 = null;
        field553 = null;
        field557 = null;
        field547 = null;
        field558 = null;
        field546 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)Lo;")
    public static final class97 method212(byte arg0, int arg1) {
        field551++;
        class97 var2 = (class97) class125.field2962.method247(arg0 ^ 0x29, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 == 41) {
            byte[] var3 = class101.field2438.method458(false, arg1, 8);
            class97 var4 = new class97();
            if (var3 != null) {
                var4.method765(-28322, new class77(var3));
            }
            class125.field2962.method248((long) arg1, (byte) -109, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)I")
    public static final int method213(int arg0, int arg1, int arg2) {
        field561++;
        if (arg1 != 11890) {
            field547 = null;
        }
        if (arg0 > arg2) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public final void method214(int arg0) {
        class49.method364(this.field544, this.field550, this.field556);
        field552++;
        if (arg0 != 8) {
            field553 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    protected class28() {
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method215(int arg0, Component arg1, int arg2, int arg3);
}
