import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class227 {

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Lff;")
    public static class9 field3184 = new class9(4);

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Lip;", line = 3)
    public static final class498 method1338(int arg0, int arg1) {
        field3185++;
        class398[] var2 = class109.field1494;
        synchronized (class109.field1494) {
            class498 var3;
            if (arg1 >= class109.field1494.length || class109.field1494[arg1].method2309((byte) -78)) {
                var3 = new class498();
                var3.field7332 = new class525[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field7332[var4] = new class525();
                }
            } else {
                var3 = (class498) class109.field1494[arg1].method2303(arg0 - 17197);
                var3.method2645(arg0 ^ 0x7B);
                int var10002 = class371.field5210[arg1]--;
            }
            if (arg0 != 0) {
                field3184 = null;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 39)
    public static void method1339(int arg0) {
        field3184 = null;
        if (arg0 != -27433) {
            method1340(79, -112);
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)Z", line = 49)
    public static final boolean method1340(int arg0, int arg1) {
        field3183++;
        if (arg0 != -9469) {
            field3184 = null;
        }
        return arg1 == 20 || arg1 == 5 || arg1 == 1010 || arg1 == 57 || arg1 == 23;
    }
}
