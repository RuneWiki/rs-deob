import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class281 extends class51 {

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "I")
    private int field4728 = -1;

    @OriginalMember(owner = "client!rg", name = "V", descriptor = "I")
    private int field4731 = 0;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    private int field4720;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "Lhi;")
    private static class82 field4719 = class95.method664((byte) -34, "purple:");

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "Lhi;")
    public static class82 field4724 = field4719;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "[I")
    public static int[] field4727 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
    public static int field4729 = -1;

    @OriginalMember(owner = "client!rg", name = "W", descriptor = "Lhi;")
    public static class82 field4732 = class95.method664((byte) -69, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "Lhi;")
    private static class82 field4726 = class95.method664((byte) -61, "level: ");

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "Lhi;")
    public static class82 field4716 = field4726;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "Lhi;")
    public static class82 field4718 = class95.method664((byte) -105, "<col=ffffff>");

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "Lhi;")
    public static class82 field4725 = field4719;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!rg", name = "U", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!rg", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() throws Throwable {
        field4721++;
        if (this.field4728 != -1) {
            class6.method35(this.field4728, this.field4731, this.field4720);
            this.field4731 = 0;
            this.field4728 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V", line = 26)
    public static final void method1955(int arg0, byte arg1) {
        class306.field5205.method2177(arg0, 109);
        class42.field738.method2177(arg0, 88);
        int var2 = -67 / ((arg1 - 57) / 48);
        class189.field3166.method2177(arg0, 71);
        field4723++;
    }

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)V", line = 42)
    public final void method1956(int arg0) {
        field4717++;
        int var2 = client.method864((byte) -90);
        if ((var2 & 0x1) == 0) {
            class147.method1002(this.field4728);
        }
        if ((var2 & 0x2) == 0) {
            class147.method1012(0);
        }
        int var3 = -125 / ((arg0 - 36) / 49);
        if ((var2 & 0x4) == 0) {
            class147.method991(0);
        }
    }

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "(I)V", line = 71)
    public static void method1957(int arg0) {
        field4724 = null;
        field4726 = null;
        if (arg0 != 30460) {
            return;
        }
        field4732 = null;
        field4727 = null;
        field4719 = null;
        field4716 = null;
        field4725 = null;
        field4718 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZI)Lkd;", line = 104)
    public static final class119 method1958(boolean arg0, int arg1) {
        if (arg0) {
            return (class119) null;
        }
        field4715++;
        class119 var2 = (class119) class74.field1127.method2175((long) arg1, 3008);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class261.field4466.method1577(16, arg1, -29569);
        class119 var4 = new class119();
        if (var3 != null) {
            var4.method811(new class153(var3), 124);
        }
        class74.field1127.method2169(var4, (long) arg1, (byte) 94);
        return var4;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILum;I)Z", line = 146)
    public static final boolean method1959(int arg0, class222 arg1, int arg2) {
        if (arg0 >= -121) {
            field4719 = (class82) null;
        }
        field4730++;
        byte[] var3 = arg1.method1579(arg2, false);
        if (var3 == null) {
            return false;
        } else {
            class123.method842(0, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V", line = 186)
    public class281(int arg0) {
        int[] var2 = new int[1];
        GL var3 = class147.field2479;
        var3.glGenTextures(1, var2, 0);
        this.field4720 = class6.field47;
        this.field4728 = var2[0];
        class147.method1002(this.field4728);
        int var4 = class102.field1805[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var3.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var3.glTexParameteri(3553, 10241, 9729);
        var3.glTexParameteri(3553, 10240, 9729);
        class6.field50 += var6.limit() - this.field4731;
        this.field4731 = var6.limit();
    }
}
