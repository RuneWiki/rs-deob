import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ASORKPAH")
public class class2 {

    @OriginalMember(owner = "ASORKPAH", name = "a", descriptor = "Z")
    private boolean field24 = false;

    @OriginalMember(owner = "ASORKPAH", name = "b", descriptor = "Z")
    private boolean field25 = false;

    @OriginalMember(owner = "ASORKPAH", name = "c", descriptor = "Z")
    private boolean field26 = true;

    @OriginalMember(owner = "ASORKPAH", name = "g", descriptor = "LFRLKXEIS;")
    private class17 field30 = new class17();

    @OriginalMember(owner = "ASORKPAH", name = "k", descriptor = "LHASAJOKP;")
    private class25 field34 = new class25(176);

    @OriginalMember(owner = "ASORKPAH", name = "h", descriptor = "I")
    private int field31;

    @OriginalMember(owner = "ASORKPAH", name = "d", descriptor = "I")
    private int field27;

    @OriginalMember(owner = "ASORKPAH", name = "i", descriptor = "I")
    private int field32;

    @OriginalMember(owner = "ASORKPAH", name = "j", descriptor = "LLLGCDMZG;")
    private class43 field33;

    @OriginalMember(owner = "ASORKPAH", name = "e", descriptor = "I")
    private int field28;

    @OriginalMember(owner = "ASORKPAH", name = "f", descriptor = "I")
    private int field29;

    @OriginalMember(owner = "ASORKPAH", name = "<init>", descriptor = "(II)V")
    public class2(int arg0, int arg1) {
        this.field31 = arg1;
        if (arg0 != 48975) {
            this.field27 = -378;
        }
        this.field32 = arg1;
        this.field33 = new class43((byte) 22, 1024);
    }

    @OriginalMember(owner = "ASORKPAH", name = "a", descriptor = "(J)LFRLKXEIS;")
    public class17 method1(long arg0) {
        class17 var3 = (class17) this.field33.method447(arg0);
        if (var3 == null) {
            this.field28++;
        } else {
            this.field34.method370(var3);
            this.field29++;
        }
        return var3;
    }

    @OriginalMember(owner = "ASORKPAH", name = "a", descriptor = "(IJLFRLKXEIS;)V")
    public void method2(int arg0, long arg1, class17 arg2) {
        if (arg0 != 23574) {
            this.field25 = !this.field25;
        }
        if (this.field32 == 0) {
            class17 var5 = this.field34.method371();
            var5.method450();
            var5.method292();
            if (this.field30 == var5) {
                class17 var6 = this.field34.method371();
                var6.method450();
                var6.method292();
            }
        } else {
            this.field32--;
        }
        this.field33.method448(arg2, (byte) -49, arg1);
        this.field34.method370(arg2);
    }

    @OriginalMember(owner = "ASORKPAH", name = "a", descriptor = "()V")
    public void method3() {
        while (true) {
            class17 var1 = this.field34.method371();
            if (var1 == null) {
                this.field32 = this.field31;
                return;
            }
            var1.method450();
            var1.method292();
        }
    }
}
