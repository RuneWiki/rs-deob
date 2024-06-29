import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class603 {

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    private int field8492 = -1;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lga;")
    private class420 field8493 = new class420();

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field8490 = -1;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field8494;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field8496;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "J")
    private long field8495;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Lvaa;")
    public static class492 field8489;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static void method3482(int arg0) {
        if (arg0 != -13) {
            field8490 = -89;
        }
        field8489 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lmia;I)V")
    public final void method3483(class69 arg0, int arg1) {
        if (arg1 != -12121) {
            field8489 = null;
        }
        field8491++;
        if (this.field8495 != arg0.field943 || this.field8492 != arg0.field936) {
            throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + class520.method3030((byte) 65, arg0.field943) + " updateNum:" + arg0.field936 + " delta.owner:" + class520.method3030((byte) 65, this.field8495) + " updateNum:" + this.field8492);
        }
        for (class165 var3 = (class165) this.field8493.method2508((byte) -29); var3 != null; var3 = (class165) this.field8493.method2505((byte) -55)) {
            var3.method612(arg1 + 12003, arg0);
        }
        arg0.field936++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)V")
    public static final void method3484(int arg0, boolean arg1) {
        class22.field334 = 3;
        field8496++;
        if (arg1) {
            method3484(93, true);
        }
        class503.field7192 = arg0;
        class108.field1313 = -1;
        class668.field9392 = 100;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILrv;)V")
    private final void method3485(int arg0, class120 arg1) {
        this.field8495 = arg1.method834(arg0 ^ 0xFFFFABED);
        if (arg0 != 30133) {
            return;
        }
        field8494++;
        this.field8492 = arg1.method871(arg0 - 6138);
        for (int var3 = arg1.method842(2384); var3 != 0; var3 = arg1.method842(2384)) {
            if (class23.field346) {
                System.out.println("t:" + var3);
            }
            class165 var4;
            if (var3 == 3) {
                var4 = new class787();
            } else if (var3 == 1) {
                var4 = new class86();
            } else if (var3 == 4) {
                var4 = new class286();
            } else if (var3 == 6) {
                var4 = new class537();
            } else if (var3 == 5) {
                var4 = new class298();
            } else if (var3 == 2) {
                var4 = new class95();
            } else if (var3 == 7) {
                var4 = new class499();
            } else if (var3 == 8) {
                var4 = new class268();
            } else if (var3 == 9) {
                var4 = new class518();
            } else if (var3 == 10) {
                var4 = new class536();
            } else if (var3 == 11) {
                var4 = new class676();
            } else if (var3 == 12) {
                var4 = new class781();
            } else {
                throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
            }
            var4.method614(arg1, 1070);
            this.field8493.method2510(var4, false);
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lrv;)V")
    public class603(class120 arg0) {
        this.method3485(30133, arg0);
    }
}
