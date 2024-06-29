import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JGECYJMS")
public class class22 {

    @OriginalMember(owner = "client!JGECYJMS", name = "a", descriptor = "Z")
    private boolean field835 = false;

    @OriginalMember(owner = "client!JGECYJMS", name = "b", descriptor = "Z")
    private boolean field836 = true;

    @OriginalMember(owner = "client!JGECYJMS", name = "e", descriptor = "LUSMRNXZO;")
    private class57 field839 = new class57();

    @OriginalMember(owner = "client!JGECYJMS", name = "i", descriptor = "LJLOKOMHZ;")
    private class23 field843 = new class23(-46779);

    @OriginalMember(owner = "client!JGECYJMS", name = "f", descriptor = "I")
    private int field840;

    @OriginalMember(owner = "client!JGECYJMS", name = "g", descriptor = "I")
    private int field841;

    @OriginalMember(owner = "client!JGECYJMS", name = "h", descriptor = "LYFWIPPMU;")
    private class68 field842;

    @OriginalMember(owner = "client!JGECYJMS", name = "c", descriptor = "I")
    private int field837;

    @OriginalMember(owner = "client!JGECYJMS", name = "d", descriptor = "I")
    private int field838;

    @OriginalMember(owner = "client!JGECYJMS", name = "<init>", descriptor = "(II)V")
    public class22(int arg0, int arg1) {
        this.field840 = arg0;
        this.field841 = arg0;
        this.field842 = new class68(1024, (byte) 6);
        if (arg1 != -11885) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!JGECYJMS", name = "a", descriptor = "(J)LUSMRNXZO;")
    public class57 method230(long arg0) {
        class57 var3 = (class57) this.field842.method582(arg0);
        if (var3 == null) {
            this.field837++;
        } else {
            this.field843.method233(var3);
            this.field838++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!JGECYJMS", name = "a", descriptor = "(JILUSMRNXZO;)V")
    public void method231(long arg0, int arg1, class57 arg2) {
        int var5 = 33 / arg1;
        if (this.field841 == 0) {
            class57 var6 = this.field843.method234();
            var6.method272();
            var6.method531();
            if (this.field839 == var6) {
                class57 var7 = this.field843.method234();
                var7.method272();
                var7.method531();
            }
        } else {
            this.field841--;
        }
        this.field842.method583(0, arg0, arg2);
        this.field843.method233(arg2);
        if (class27.field954) {
        }
    }

    @OriginalMember(owner = "client!JGECYJMS", name = "a", descriptor = "()V")
    public void method232() {
        while (true) {
            class57 var1 = this.field843.method234();
            if (var1 == null) {
                this.field841 = this.field840;
                return;
            }
            var1.method272();
            var1.method531();
        }
    }
}
