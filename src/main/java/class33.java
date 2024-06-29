import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class33 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Lkg;")
    public class231 field378 = new class231();

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Z")
    public boolean field381 = false;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lqf;B)V", line = 3)
    public static final void method187(class593 arg0, byte arg1) {
        if (class80.field882 == arg0.field8612) {
            class136.field1692[arg0.field8576] = true;
        }
        field383++;
        int var2 = 60 / ((29 - arg1) / 58);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)Z", line = 20)
    public static final boolean method188(int arg0, int arg1, int arg2) {
        field380++;
        int var3 = -14 / ((91 - arg1) / 32);
        return (arg2 & 0x800) != 0 | class600.method3484(arg2, 65, arg0) || class251.method1654(arg0, arg2, (byte) -99);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V", line = 31)
    public static final void method189(boolean arg0) {
        field379++;
        class277 var1 = class4.field33;
        synchronized (class4.field33) {
            class4.field33.method1805(60);
            if (arg0) {
                method188(-64, -12, 28);
            }
        }
        class277 var2 = class191.field2508;
        synchronized (class191.field2508) {
            class191.field2508.method1805(82);
        }
    }
}
