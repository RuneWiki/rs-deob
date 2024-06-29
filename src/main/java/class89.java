import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class89 implements class33 {

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "Lkh;")
    private class522 field896;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "Ltf;")
    private class701 field894;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field892 = 1407;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "[Lvda;")
    public static class340[] field891 = new class340[50];

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field890 = -2;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field898 = 0;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "F")
    public static float field888;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "Lf;")
    private class534 field889;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZI)V", line = 3)
    public final void method155(boolean arg0, int arg1) {
        if (arg1 != -3563) {
            this.method155(false, -55);
        }
        field893++;
        if (!arg0) {
            return;
        }
        int var3 = class146.field1618 <= class267.field3329 ? class267.field3329 : class146.field1618;
        int var4 = class338.field4244 <= class87.field873 ? class87.field873 : class338.field4244;
        int var5 = this.field889.method312();
        int var6 = this.field889.method304();
        int var7 = 0;
        int var8 = var3;
        int var9 = var3 * var6 / var5;
        int var10 = (var4 - var9) / 2;
        if (var9 > var4) {
            var8 = var4 * var5 / var6;
            var9 = var4;
            var10 = 0;
            var7 = (var3 - var8) / 2;
        }
        this.field889.method3002(var7, var10, var8, var9);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 53)
    public final void method156(int arg0) {
        this.field889 = class316.method1814(this.field896.field7398, (byte) 111, this.field894);
        field897++;
        if (arg0 != 23004) {
            method455(106);
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 64)
    public static void method455(int arg0) {
        field891 = null;
        if (arg0 != 32410) {
            method456(-119, false, -112);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZI)V", line = 75)
    public static final void method456(int arg0, boolean arg1, int arg2) {
        if (arg2 >= -42) {
            return;
        }
        field887++;
        class628 var3 = class555.method3150(arg0, 0, arg1);
        if (var3 != null) {
            for (int var4 = 0; var4 < var3.field8858.length; var4++) {
                var3.field8858[var4] = -1;
                var3.field8850[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)Z", line = 102)
    public final boolean method157(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field895++;
            return this.field894.method3849(this.field896.field7398, false);
        }
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Ltf;Lkh;)V", line = 121)
    public class89(class701 arg0, class522 arg1) {
        this.field896 = arg1;
        this.field894 = arg0;
    }
}
