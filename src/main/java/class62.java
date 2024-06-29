import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class62 extends class166 {

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "Llga;")
    public static class712 field679 = new class712(66, -1);

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "Lgg;")
    public class176 field682;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Z")
    public boolean field683;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "[Llda;")
    public class486[] field678;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 10)
    public static final void method481(int arg0) {
        field680++;
        if (arg0 != 66) {
            return;
        }
        for (class309 var1 = (class309) class576.field8091.method724(32); var1 != null; var1 = (class309) class576.field8091.method723(arg0 ^ 0x39)) {
            class640 var2 = var1.field4194;
            if (var2.field8887) {
                var1.method315(48);
                var2.method3599(120);
            } else if (var2.field8880 <= class406.field5732) {
                var2.method3605((byte) 31, class242.field3146);
                if (var2.field8887) {
                    var1.method315(67);
                } else {
                    class202.method1119(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIB)Z", line = 47)
    public static final boolean method482(int arg0, int arg1, byte arg2) {
        if (arg2 == 91) {
            field684++;
            return (arg1 & 0x10000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V", line = 61)
    public static void method483(byte arg0) {
        field679 = null;
        if (arg0 >= -76) {
            method483((byte) -4);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lha;III)Z", line = 74)
    public final boolean method484(class60 arg0, int arg1, int arg2, int arg3) {
        if (arg3 > -51) {
            method482(117, -111, (byte) -10);
        }
        field681++;
        int var5 = this.field682.method130(-14240);
        if (this.field678 != null) {
            for (int var6 = 0; var6 < this.field678.length; var6++) {
                this.field678[var6].field6671 <<= var5;
                if (this.field678[var6].method2744(arg1, arg2) && this.field682.method131(arg1, arg0, (byte) 79, arg2)) {
                    this.field678[var6].field6671 >>= var5;
                    return true;
                }
                this.field678[var6].field6671 >>= var5;
            }
        }
        return false;
    }
}
