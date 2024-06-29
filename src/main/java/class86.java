import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public abstract class class86 {

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Lea;")
    public static class38 field2001 = class9.method46((byte) 102, "m-Ochte sich mit Ihnen duellieren)3");

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field1998 = -1;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Lea;")
    public static class38 field2003 = class9.method46((byte) 122, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Lea;")
    public static class38 field1995 = class9.method46((byte) 106, "runes");

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Lea;")
    public static class38 field2006 = class9.method46((byte) 126, "<img=0>");

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field2005 = 0;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Lea;")
    public static class38 field1994 = class9.method46((byte) 106, "event_opbase");

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Z")
    public static boolean field2009 = false;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "Z")
    public static boolean field2011 = false;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public int field1997;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public int field1999;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field2000;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "[I")
    public int[] field2010;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
    public abstract void method225(Component arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method717(int arg0) {
        if (arg0 < 1) {
            return;
        }
        field2003 = null;
        field2001 = null;
        field2006 = null;
        field1994 = null;
        field1995 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIZ)Lea;")
    public static final class38 method718(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field1996++;
        int var4 = 1;
        for (int var5 = arg2 / arg1; var5 != 0; var5 /= arg1) {
            var4++;
        }
        int var6 = var4;
        if (arg2 < 0 || arg3) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        if (arg0 < 117) {
            return null;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg2 % arg1;
            arg2 /= arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class38 var9 = new class38();
        var9.field821 = var7;
        var9.field802 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
    public abstract void method230(int arg0, Graphics arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public final void method719(byte arg0) {
        field2004++;
        class71.method567(this.field2010, this.field1999, this.field1997);
        if (arg0 != -10) {
            method717(5);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method223(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    protected class86() {
    }
}
