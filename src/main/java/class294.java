import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public abstract class class294 {

    @OriginalMember(owner = "client!io", name = "c", descriptor = "Lgj;")
    public static class257 field4628 = new class257();

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIZI)V", line = 7)
    public static final void method2092(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field4631++;
        if (arg3 && class337.field5389 <= arg4 && class344.field5460 >= arg4) {
            int var5 = class112.method728(arg0, class244.field3844, class2.field22, -70);
            int var6 = class112.method728(arg1, class244.field3844, class2.field22, -93);
            class67.method418(arg4, arg2, var6, var5, 124);
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "()Z", line = 27)
    public boolean method851() {
        field4627++;
        return false;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BLjava/lang/String;)J", line = 40)
    public static final long method2093(byte arg0, String arg1) {
        if (arg0 != 100) {
            field4628 = (class257) null;
        }
        field4632++;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 - 21);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V", line = 86)
    public static void method2094(int arg0) {
        field4628 = null;
        if (arg0 > -14) {
            method2092(-94, 85, 11, true, 37);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lio;IIIZ)V", line = 104)
    public void method845(class294 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4630++;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(III)Lio;", line = 111)
    public class294 method801(int arg0, int arg1, int arg2) {
        field4626++;
        return this;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "()I")
    public abstract int method417();

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIIIIJILlg;)V")
    public abstract void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class141 arg10);

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIII)V")
    public abstract void method408(int arg0, int arg1, int arg2, int arg3, int arg4);
}
