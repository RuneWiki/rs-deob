import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class747 {

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "Lqfa;")
    private class106 field10353;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public int field10348;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Lfba;")
    public static class27 field10347 = new class27(43, 6);

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field10349;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field10350;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field10351;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "[Lgs;")
    public static class49[] field10352;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V", line = 3)
    public static void method4160(boolean arg0) {
        if (!arg0) {
            field10352 = null;
        }
        field10347 = null;
        field10352 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBI)Z", line = 17)
    public static final boolean method4161(int arg0, byte arg1, int arg2) {
        field10349++;
        if (arg1 > -4) {
            field10347 = null;
        }
        return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V", line = 29)
    public static final void method4162(int arg0, int arg1) {
        class46 var2 = class767.field10562[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class46 var4 = class767.field10562[var3][arg0][arg1] = class767.field10562[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class48 var5 = var4.field586; var5 != null; var5 = var5.field611) {
                    class672 var6 = var5.field605;
                    if (var6.field9368 == arg0 && var6.field9364 == arg1) {
                        var6.field5755--;
                    }
                }
                if (var4.field587 != null) {
                    var4.field587.field5755--;
                }
                if (var4.field582 != null) {
                    var4.field582.field5755--;
                }
                if (var4.field589 != null) {
                    var4.field589.field5755--;
                }
                if (var4.field592 != null) {
                    var4.field592.field5755--;
                }
                if (var4.field581 != null) {
                    var4.field581.field5755--;
                }
            }
        }
        if (class767.field10562[0][arg0][arg1] == null) {
            class767.field10562[0][arg0][arg1] = new class46(0);
            class767.field10562[0][arg0][arg1].field585 = 1;
        }
        class767.field10562[0][arg0][arg1].field583 = var2;
        class767.field10562[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BII)V", line = 86)
    public static final void method4163(byte arg0, int arg1, int arg2) {
        field10350++;
        if (arg0 != 69) {
            field10352 = null;
        }
        class313 var3 = class312.method1998((long) arg2, 1, -1);
        var3.method2001((byte) 117);
        var3.field4464 = arg1;
    }

    @OriginalMember(owner = "client!nk", name = "finalize", descriptor = "()V", line = 100)
    protected final void finalize() throws Throwable {
        this.field10353.method751(this.field10348, (byte) 126);
        field10351++;
        super.finalize();
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lqfa;II)V", line = 114)
    public class747(class106 arg0, int arg1, int arg2) {
        this.field10353 = arg0;
        this.field10348 = arg2;
    }
}
