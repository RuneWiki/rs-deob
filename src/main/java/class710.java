import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class710 {

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "Lgt;")
    public class454 field9997 = new class454();

    @OriginalMember(owner = "client!lga", name = "g", descriptor = "Z")
    public boolean field10003 = false;

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "Lpia;")
    public static class94 field10000 = new class94(16, -1);

    @OriginalMember(owner = "client!lga", name = "f", descriptor = "[S")
    public static short[] field10002 = new short[256];

    @OriginalMember(owner = "client!lga", name = "e", descriptor = "I")
    public static int field10001;

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "I")
    public static int field9998;

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "I")
    public static int field9999;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)V", line = 3)
    public final void method3967(byte arg0) {
        if (arg0 > -125) {
            method3969(97, 92);
        }
        field9998++;
        while (true) {
            class547 var2 = (class547) this.field9997.method2793(14711);
            if (var2 == null) {
                return;
            }
            var2.method2401((byte) -57);
            class397.method2436(false, var2);
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(BLlba;)V", line = 26)
    public final void method3968(byte arg0, class547 arg1) {
        field9999++;
        class361 var3 = arg1.field7866;
        boolean var4 = true;
        class569[] var5 = arg1.field7870;
        for (int var6 = 0; var6 < var5.length; var6++) {
            if (var5[var6].field8082) {
                var4 = false;
                break;
            }
        }
        if (var4) {
            return;
        }
        if (this.field10003) {
            for (class547 var7 = (class547) this.field9997.method2790(111); var7 != null; var7 = (class547) this.field9997.method2794(46)) {
                if (var7.field7866 == var3) {
                    var7.method2401((byte) -57);
                    class397.method2436(false, var7);
                }
            }
        }
        for (class547 var8 = (class547) this.field9997.method2790(105); var8 != null; var8 = (class547) this.field9997.method2794(38)) {
            if (var3.field4639 >= var8.field7866.field4639) {
                class729.method4067(128, arg1, var8);
                return;
            }
        }
        if (arg0 != -63) {
            this.field9997 = null;
        }
        this.field9997.method2792((byte) -13, arg1);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(II)Lfd;", line = 99)
    public static final class526 method3969(int arg0, int arg1) {
        if (arg1 != 0) {
            field10000 = null;
        }
        field10001++;
        return class520.field7393 && arg0 >= class647.field9257 && class85.field897 >= arg0 ? class341.field4407[arg0 - class647.field9257] : null;
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(B)V", line = 118)
    public static void method3970(byte arg0) {
        field10000 = null;
        if (arg0 != 27) {
            field10002 = null;
        }
        field10002 = null;
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Z)V", line = 138)
    public class710(boolean arg0) {
        this.field10003 = arg0;
    }
}
