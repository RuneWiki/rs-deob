import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class321 {

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "Ljia;")
    public class336 field4135 = new class336();

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "Z")
    public boolean field4136 = false;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "[I")
    public static int[] field4129 = new int[64];

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "Lju;")
    public static class102 field4134 = new class102(1, 4);

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "Ljf;")
    public static class640 field4139 = new class640(5, 2);

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "F")
    public static float field4137;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1874(boolean arg0) {
        field4129 = null;
        field4139 = null;
        field4134 = null;
        if (!arg0) {
            method1875(-46, 43, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIB)Z", line = 16)
    public static final boolean method1875(int arg0, int arg1, byte arg2) {
        field4131++;
        int var3 = 104 % ((43 - arg2) / 44);
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V", line = 29)
    public final void method1876(int arg0) {
        field4133++;
        int var2 = 3 / ((arg0 + 17) / 37);
        while (true) {
            class596 var3 = (class596) this.field4135.method1952(-45);
            if (var3 == null) {
                return;
            }
            var3.method1(112);
            class149.method957(var3, 0);
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V", line = 52)
    public static final void method1877(int arg0) {
        class757.field10508 = class541.method3221(true, 4, arg0 ^ 0xC13928E0, 35, 8, 0.4F, arg0, 8);
        field4130++;
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Z)V", line = 148)
    public class321(boolean arg0) {
        this.field4136 = arg0;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILjl;)V", line = 76)
    public final void method1878(int arg0, class596 arg1) {
        field4132++;
        class674 var3 = arg1.field8575;
        boolean var4 = true;
        class247[] var5 = arg1.field8579;
        for (int var6 = arg0; var6 < var5.length; var6++) {
            if (var5[var6].field3431) {
                var4 = false;
                break;
            }
        }
        if (var4) {
            return;
        }
        if (this.field4136) {
            for (class596 var7 = (class596) this.field4135.method1945(false); var7 != null; var7 = (class596) this.field4135.method1944(9408)) {
                if (var7.field8575 == var3) {
                    var7.method1(105);
                    class149.method957(var7, arg0);
                }
            }
        }
        for (class596 var8 = (class596) this.field4135.method1945(false); var8 != null; var8 = (class596) this.field4135.method1944(arg0 ^ 0x24C0)) {
            if (var3.field9491 >= var8.field8575.field9491) {
                class189.method1261(var8, (byte) -113, arg1);
                return;
            }
        }
        this.field4135.method1946(arg0 - 125, arg1);
    }
}
