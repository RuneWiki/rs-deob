import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class377 {

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "J")
    private long field5418 = -1L;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Lga;")
    private class420 field5421 = new class420();

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Ljo;")
    public static class351 field5416 = new class351(57, 7);

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field5426 = new Rectangle[100];

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "J")
    private long field5424;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "[[[Z")
    public static boolean[][][] field5419;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)I")
    public static final int method2330(byte arg0, int arg1) {
        field5422++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        if (arg0 != 48) {
            method2333(-99);
        }
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lua;B)V")
    public final void method2331(class692 arg0, byte arg1) {
        field5415++;
        if (arg1 <= 96) {
            this.field5424 = 29L;
        }
        if (this.field5424 != arg0.field7577 || this.field5418 != arg0.field9780) {
            throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.field7577 + " updateNum:" + arg0.field9780 + " delta.clanHash:" + this.field5424 + " updateNum:" + this.field5418);
        }
        for (class316 var3 = (class316) this.field5421.method2508((byte) -63); var3 != null; var3 = (class316) this.field5421.method2505((byte) -55)) {
            var3.method819(arg0, 0);
        }
        arg0.field9780++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIBI)V")
    public static final void method2332(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class684.field9715 = arg0;
        class569.field8060 = arg1;
        if (arg3 == -17) {
            class438.field6266 = arg2;
            class490.field6969 = arg4;
            field5423++;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method2333(int arg0) {
        field5416 = null;
        if (arg0 != -2) {
            method2333(32);
        }
        field5426 = null;
        field5419 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILrv;)V")
    private final void method2334(int arg0, class120 arg1) {
        field5420++;
        this.field5424 = arg1.method834(-8616);
        this.field5418 = arg1.method834(-8616);
        int var3 = arg1.method842(2384);
        int var4 = -58 % ((20 - arg0) / 44);
        while (var3 != 0) {
            class316 var5;
            if (var3 == 1) {
                var5 = new class526();
            } else if (var3 == 4) {
                var5 = new class116();
            } else if (var3 == 3) {
                var5 = new class296();
            } else if (var3 == 2) {
                var5 = new class504();
            } else {
                throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
            }
            var5.method818(-2, arg1);
            this.field5421.method2510(var5, false);
            var3 = arg1.method842(2384);
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lrv;)V")
    public class377(class120 arg0) {
        this.method2334(68, arg0);
    }
}
