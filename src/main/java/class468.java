import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class468 {

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "Lqk;")
    public static class148 field6396 = new class148(45, 1);

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "Lju;")
    public static class102 field6401 = new class102(80, 3);

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "B")
    public byte field6381;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "B")
    public byte field6386;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "B")
    public byte field6388;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "B")
    public byte field6390;

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "B")
    public byte field6397;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "B")
    public byte field6398;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "B")
    public byte field6399;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public int field6384;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "I")
    public int field6392;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
    public int field6393;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "Lcda;")
    public static class114 field6403;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "S")
    public short field6394;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "Z")
    public boolean field6379;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "Z")
    public boolean field6380;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "Z")
    public boolean field6383;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "Z")
    public boolean field6385;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "Z")
    public boolean field6387;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "Z")
    public boolean field6389;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "Z")
    public boolean field6391;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "Z")
    public boolean field6400;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)I", line = 19)
    public static final int method2788(boolean arg0) {
        field6395++;
        if (class589.field8461 == 1) {
            return class694.field9698;
        } else if (arg0) {
            return 18;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(JI)V", line = 33)
    public static final void method2789(long arg0, int arg1) {
        if (arg1 <= 108) {
            return;
        }
        field6382++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V", line = 54)
    public static void method2790(int arg0) {
        if (arg0 != 1) {
            field6402 = 90;
        }
        field6396 = null;
        field6403 = null;
        field6401 = null;
    }
}
