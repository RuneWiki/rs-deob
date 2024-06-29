import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class456 implements class582 {

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "Loh;")
    private class370 field6377;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 6)
    public static final String method2628(int arg0, long arg1) {
        field6373++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % (long) arg0 == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class322.field4756[(int) (var7 - (arg1 * 37L))];
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

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZ)V", line = 58)
    public final void method109(int arg0, boolean arg1) {
        if (arg0 != 8444) {
            this.method108(87);
        }
        if (arg1) {
            class194 var3 = class548.field7419;
            int var4 = this.field6377.field5272.method2192(class603.field8386, 2, 12) + this.field6377.field5277;
            int var5 = this.field6377.field5275.method371(0, (byte) -111, class652.field9217) + this.field6377.field5270;
            if (class385.field5384 == this.field6377.field5275) {
                var3.method1307(var4, (byte) 125, this.field6377.field5274, this.field6377.field5271, this.field6377.field5273, var5);
            } else if (class345.field4986 == this.field6377.field5275) {
                var3.method1305(this.field6377.field5271, var4, this.field6377.field5273, true, var5, this.field6377.field5274);
            } else if (class546.field7400 == this.field6377.field5275) {
                var3.method1300(var4, var5, -127, this.field6377.field5271, this.field6377.field5273, this.field6377.field5274);
            }
        }
        field6374++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V", line = 90)
    public static final void method2629(boolean arg0) {
        field6376++;
        class258.field3683.method1062(20054);
        for (int var1 = 0; var1 < 32; var1++) {
            class46.field692[var1] = 0L;
        }
        if (!arg0) {
            method2628(85, 27L);
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class453.field6319[var2] = 0L;
        }
        class565.field7621 = 0;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Loh;)V", line = 117)
    public class456(class370 arg0) {
        this.field6377 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)Z", line = 125)
    public final boolean method104(byte arg0) {
        field6375++;
        if (arg0 < 18) {
            this.method108(62);
        }
        return true;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 136)
    public final void method108(int arg0) {
        int var2 = -12 / ((41 - arg0) / 54);
        field6378++;
    }
}
