import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class38 {

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Z")
    public boolean field465 = true;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public int field457;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public int field467;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Ljava/lang/String;")
    public static String field469 = "Loading world list data";

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "Z")
    public static boolean field468 = true;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field466 = -1;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field458;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;SIIJI)V")
    public static final void method301(int arg0, String arg1, String arg2, short arg3, int arg4, int arg5, long arg6, int arg7) {
        field462++;
        if (class240.field3852) {
            return;
        }
        if (class202.field3248 < 500) {
            class152.field2464[class202.field3248] = arg1;
            class162.field2633[class202.field3248] = arg2;
            class3.field36[class202.field3248] = arg4 == -1 ? class238.field3797 : arg4;
            class23.field291[class202.field3248] = arg3;
            class109.field1892[class202.field3248] = arg6;
            class270.field4368[class202.field3248] = arg0;
            class23.field284[class202.field3248] = arg7;
            class202.field3248++;
        }
        if (arg5 < 40) {
            field469 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
    public static final void method302(int arg0, int arg1, int arg2) {
        field461++;
        class83.field1148.method1238(204, -136478397);
        class34.field412++;
        if (arg0 > -90) {
            field458 = null;
        }
        class83.field1148.method1789((byte) -38, arg2);
        class83.field1148.method1761(arg1, 4334);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method303(int arg0) {
        field469 = null;
        if (arg0 >= 59) {
            field458 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BZ)V")
    public static final void method304(byte arg0, boolean arg1) {
        field459++;
        if (arg1) {
            if (class113.field1944 != -1) {
                class236.method1555(-94, class113.field1944);
            }
            for (class128 var2 = (class128) class294.field4656.method465((byte) -94); var2 != null; var2 = (class128) class294.field4656.method461((byte) -13)) {
                class290.method1943(var2, true, 64);
            }
            class113.field1944 = -1;
            class294.field4656 = new class61(8);
            class22.method149((byte) 69);
            class113.field1944 = class207.field3334;
            class260.method1708(false, 114);
            class28.method190(2048);
            class183.method1257(1, class113.field1944);
        }
        class238.field3797 = -1;
        class5.method33(class224.field3559, 0);
        int var3 = -124 / ((15 - arg0) / 36);
        class197.field3179 = new class235();
        class197.field3179.field614 = 3000;
        class197.field3179.field613 = 3000;
        if (class189.field3026 == 0) {
            class200.method1350(class169.field2739, 13771);
            class233.method1539(10, (byte) 32);
            return;
        }
        if (class92.field1316 == 2) {
            class119.field2014 = class214.field3450 << 7;
            class44.field522 = class99.field1513 << 7;
        } else {
            class34.method233(23898);
        }
        class233.method1538(112);
        class233.method1539(28, (byte) 32);
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field457 = arg0;
        this.field471 = arg1;
        this.field463 = arg3;
        this.field465 = arg6;
        this.field470 = arg5;
        this.field460 = arg2;
        this.field467 = arg4;
    }
}
