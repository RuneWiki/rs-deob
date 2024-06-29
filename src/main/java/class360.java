import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class360 {

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "Z")
    public boolean field4760;

    @OriginalMember(owner = "client!bga", name = "e", descriptor = "Lhda;")
    public static class750 field4762 = new class750(9, 2);

    @OriginalMember(owner = "client!bga", name = "j", descriptor = "I")
    public static int field4767 = 1;

    @OriginalMember(owner = "client!bga", name = "m", descriptor = "Lea;")
    public static class547 field4770 = new class547(1, -1);

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!bga", name = "g", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!bga", name = "h", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!bga", name = "i", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!bga", name = "l", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!bga", name = "k", descriptor = "Laq;")
    public static class162 field4768;

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "Lug;")
    public class562 field4759;

    @OriginalMember(owner = "client!bga", name = "f", descriptor = "Lug;")
    public class562 field4763;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "Z")
    public boolean field4758;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(B)V", line = 14)
    public static void method2065(byte arg0) {
        field4770 = null;
        if (arg0 < -101) {
            field4768 = null;
            field4762 = null;
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 26)
    public static final String method2066(long arg0, int arg1) {
        field4761++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg1 > -59) {
                field4768 = null;
            }
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class353.field4713[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Z)V", line = 77)
    public class360(boolean arg0) {
        this.field4760 = arg0;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZIZ)V", line = 88)
    public static final void method2067(boolean arg0, int arg1, boolean arg2) {
        if (arg0) {
            class595.field8284--;
            if (class595.field8284 == 0) {
                class645.field8982 = null;
            }
        }
        if (arg2) {
            class526.field7069--;
            if (class526.field7069 == 0) {
                class120.field1575 = null;
            }
        }
        if (arg1 <= 33) {
            method2067(false, -122, true);
        }
        field4765++;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V", line = 119)
    public final void method2068(int arg0) {
        field4764++;
        if (this.field4759 != null) {
            this.field4759.method176(false);
        }
        this.field4758 = false;
        if (arg0 != 0) {
            this.field4759 = null;
        }
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(B)Z", line = 138)
    public final boolean method2069(byte arg0) {
        field4766++;
        if (arg0 >= -19) {
            method2067(false, 117, true);
        }
        return this.field4758 && !this.field4760;
    }
}
