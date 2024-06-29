import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BMKJVFXV")
public class class6 {

    @OriginalMember(owner = "client!BMKJVFXV", name = "a", descriptor = "Z")
    private boolean field63 = true;

    @OriginalMember(owner = "client!BMKJVFXV", name = "b", descriptor = "B")
    private byte field64 = -108;

    @OriginalMember(owner = "client!BMKJVFXV", name = "e", descriptor = "LICYNFRTV;")
    private class23 field67 = new class23();

    @OriginalMember(owner = "client!BMKJVFXV", name = "i", descriptor = "LELLPUVEP;")
    private class13 field71 = new class13((byte) 5);

    @OriginalMember(owner = "client!BMKJVFXV", name = "f", descriptor = "I")
    private int field68;

    @OriginalMember(owner = "client!BMKJVFXV", name = "g", descriptor = "I")
    private int field69;

    @OriginalMember(owner = "client!BMKJVFXV", name = "h", descriptor = "LLTJSGGCA;")
    private class36 field70;

    @OriginalMember(owner = "client!BMKJVFXV", name = "c", descriptor = "I")
    private int field65;

    @OriginalMember(owner = "client!BMKJVFXV", name = "d", descriptor = "I")
    private int field66;

    @OriginalMember(owner = "client!BMKJVFXV", name = "<init>", descriptor = "(II)V")
    public class6(int arg0, int arg1) {
        this.field68 = arg1;
        this.field69 = arg1;
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        this.field70 = new class36(1024, -645);
    }

    @OriginalMember(owner = "client!BMKJVFXV", name = "a", descriptor = "(J)LICYNFRTV;")
    public class23 method32(long arg0) {
        class23 var3 = (class23) this.field70.method363(arg0);
        if (var3 == null) {
            this.field65++;
        } else {
            this.field71.method280(var3);
            this.field66++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!BMKJVFXV", name = "a", descriptor = "(JLICYNFRTV;B)V")
    public void method33(long arg0, class23 arg1, byte arg2) {
        if (this.field69 == 0) {
            class23 var5 = this.field71.method281();
            var5.method518();
            var5.method320();
            if (this.field67 == var5) {
                class23 var6 = this.field71.method281();
                var6.method518();
                var6.method320();
            }
        } else {
            this.field69--;
        }
        this.field70.method364(9, arg1, arg0);
        if (arg2 != -108) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        this.field71.method280(arg1);
        if (class56.field1535) {
        }
    }

    @OriginalMember(owner = "client!BMKJVFXV", name = "a", descriptor = "()V")
    public void method34() {
        while (true) {
            class23 var1 = this.field71.method281();
            if (var1 == null) {
                this.field69 = this.field68;
                return;
            }
            var1.method518();
            var1.method320();
        }
    }
}
