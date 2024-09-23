import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JETHVCIV")
public class class24 {

    @OriginalMember(owner = "JETHVCIV", name = "a", descriptor = "I")
    private int field915 = 8;

    @OriginalMember(owner = "JETHVCIV", name = "b", descriptor = "I")
    private int field916 = 8;

    @OriginalMember(owner = "JETHVCIV", name = "e", descriptor = "LHSUOZGYX;")
    private class20 field919 = new class20();

    @OriginalMember(owner = "JETHVCIV", name = "i", descriptor = "LXBBVJJRK;")
    private class64 field923 = new class64((byte) -100);

    @OriginalMember(owner = "JETHVCIV", name = "f", descriptor = "I")
    private int field920;

    @OriginalMember(owner = "JETHVCIV", name = "g", descriptor = "I")
    private int field921;

    @OriginalMember(owner = "JETHVCIV", name = "h", descriptor = "LZRDWHMTU;")
    private class71 field922;

    @OriginalMember(owner = "JETHVCIV", name = "c", descriptor = "I")
    private int field917;

    @OriginalMember(owner = "JETHVCIV", name = "d", descriptor = "I")
    private int field918;

    @OriginalMember(owner = "JETHVCIV", name = "<init>", descriptor = "(ZI)V")
    public class24(boolean arg0, int arg1) {
        this.field920 = arg1;
        if (arg0) {
            this.field915 = -415;
        }
        this.field921 = arg1;
        this.field922 = new class71(0, 1024);
    }

    @OriginalMember(owner = "JETHVCIV", name = "a", descriptor = "(J)LHSUOZGYX;")
    public class20 method315(long arg0) {
        class20 var3 = (class20) this.field922.method561(arg0);
        if (var3 == null) {
            this.field917++;
        } else {
            this.field923.method533(var3);
            this.field918++;
        }
        return var3;
    }

    @OriginalMember(owner = "JETHVCIV", name = "a", descriptor = "(ILHSUOZGYX;J)V")
    public void method316(int arg0, class20 arg1, long arg2) {
        if (arg0 >= 0) {
            return;
        }
        if (this.field921 == 0) {
            class20 var5 = this.field923.method534();
            var5.method430();
            var5.method298();
            if (this.field919 == var5) {
                class20 var6 = this.field923.method534();
                var6.method430();
                var6.method298();
            }
        } else {
            this.field921--;
        }
        this.field922.method562(arg2, arg1, -251);
        this.field923.method533(arg1);
    }

    @OriginalMember(owner = "JETHVCIV", name = "a", descriptor = "()V")
    public void method317() {
        while (true) {
            class20 var1 = this.field923.method534();
            if (var1 == null) {
                this.field921 = this.field920;
                return;
            }
            var1.method430();
            var1.method298();
        }
    }
}
