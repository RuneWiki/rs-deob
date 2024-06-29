import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class233 extends class467 {

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public int field3475 = -1;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public int field3477 = -1;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "Lqv;")
    public static class316 field3482 = new class316(43, -2);

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    public int field3476;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public int field3478;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    public int field3481;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public int field3485;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(Lqa;B)Lem;", line = 8)
    public final class154 method562(class167 arg0, byte arg1) {
        ++field3479;
        if (arg1 > -117) {
            this.field3485 = 90;
        }
        return null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V", line = 20)
    public static final void method1548(int arg0, int arg1, int arg2) {
        ++field3480;
        int var3 = -47 % ((-44 - arg2) / 50);
        class275 var4 = class213.method1433((byte) 99, 15, 0);
        var4.method1778(0);
        var4.field4104 = arg0;
        var4.field4113 = arg1;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILqa;)Lnj;", line = 42)
    public final class166 method554(int arg0, class167 arg1) {
        ++field3474;
        class15 var3 = arg1.method312();
        var3.method47(super.field6782, super.field6789, super.field6783);
        class166 var4 = class392.method2363(3317, 3);
        if (~this.field3477 != 0) {
            class336 var5 = class58.field1052.method1646(21708, this.field3477).method831(0, 0, (class58) null, 2048, this.field3485, -1, arg1, (class183) null, 0);
            if (var5 != null) {
                var5.method1142(var3, var4.field2497[2], 0);
            }
        }
        if (~this.field3475 != 0) {
            class336 var6 = class58.field1052.method1646(arg0 + 21708, this.field3475).method831(0, 0, (class58) null, 2048, this.field3476, -1, arg1, (class183) null, 0);
            if (var6 != null) {
                var6.method1142(var3, var4.field2497[1], 0);
            }
        }
        class336 var7 = class58.field1052.method1646(21708, this.field3481).method831(0, arg0, (class58) null, 2048, this.field3478, -1, arg1, (class183) null, 0);
        if (var7 != null) {
            var7.method1142(var3, var4.field2497[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 80)
    public static void method1549(int arg0) {
        if (arg0 == 0) {
            field3482 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIILqa;)Z", line = 97)
    public final boolean method553(int arg0, int arg1, int arg2, class167 arg3) {
        ++field3483;
        if (arg2 <= 42) {
            this.method553(-20, -23, -92, (class167) null);
        }
        class15 var5 = arg3.method312();
        var5.method47(super.field6782, super.field6789, super.field6783);
        class336 var6 = class58.field1052.method1646(21708, this.field3481).method831(0, 0, (class58) null, 131072, this.field3478, -1, arg3, (class183) null, 0);
        if (var6 != null && var6.method1131(arg1, arg0, var5, true)) {
            return true;
        } else {
            if (~this.field3475 != 0) {
                class336 var7 = class58.field1052.method1646(21708, this.field3475).method831(0, 0, (class58) null, 131072, this.field3476, -1, arg3, (class183) null, 0);
                if (var7 != null && var7.method1131(arg1, arg0, var5, true)) {
                    return true;
                }
            }
            if (~this.field3477 != 0) {
                class336 var8 = class58.field1052.method1646(21708, this.field3477).method831(0, 0, (class58) null, 131072, this.field3485, -1, arg3, (class183) null, 0);
                if (var8 != null && var8.method1131(arg1, arg0, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lqa;B)V", line = 137)
    public final void method552(class167 arg0, byte arg1) {
        ++field3484;
        if (arg1 >= -119) {
            this.method562((class167) null, (byte) 68);
        }
    }
}
