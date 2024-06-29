import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class88 extends class449 {

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public int field1237 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public int field1235 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
    public int field1241 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
    public int field1240 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
    public int field1242 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wl", name = "G", descriptor = "I")
    public int field1249 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
    public int field1247 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
    public int field1244 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "Lid;")
    public class266 field1234;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
    public static int field1245 = 0;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "Z")
    public static boolean field1239 = false;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "Lch;")
    public static class151 field1238 = new class151("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!wl", name = "F", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)Z")
    public final boolean method737(int arg0, int arg1, int arg2) {
        if (arg1 != 9987) {
            return true;
        }
        field1243++;
        if (arg0 >= this.field1247 && this.field1237 >= arg0 && arg2 >= this.field1244 && this.field1242 >= arg2) {
            return true;
        } else {
            return this.field1235 <= arg0 && this.field1241 >= arg0 && arg2 >= this.field1249 && arg2 <= this.field1240;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lnl;ILnl;)V")
    public static final void method738(class435 arg0, int arg1, class435 arg2) {
        int var3 = -77 / ((arg1 + 20) / 60);
        field1236++;
        class112.field1577 = arg2;
        class486.field6888 = arg0;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)I")
    public static int method739(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)Lha;")
    public static final class294 method740(int arg0, int arg1) {
        field1248++;
        class294[] var2 = class262.method1764(true);
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class294 var4 = var2[var3];
            if (var4.field4149 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
    public static void method741(byte arg0) {
        field1238 = null;
        if (arg0 != -45) {
            method738((class435) null, 12, (class435) null);
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lid;)V")
    public class88(class266 arg0) {
        this.field1234 = arg0;
    }
}
