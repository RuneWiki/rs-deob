import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class34 implements class180 {

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public int field411;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "[Lgo;")
    public static class313[] field408 = new class313[14];

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field410 = 0;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)Z")
    public static final boolean method204(int arg0, int arg1, int arg2) {
        field409++;
        if (arg0 == 24448) {
            return (arg2 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILsj;)V")
    public static final void method205(int arg0, int arg1, int arg2, class511 arg3) {
        if (arg3.field7644 == arg1 && arg1 != -1) {
            class61 var4 = class393.field5735.method1538(-4031, arg1);
            int var5 = var4.field954;
            if (var5 == 1) {
                arg3.field7604 = 0;
                arg3.field7588 = arg2;
                arg3.field7584 = 0;
                arg3.field7551 = 0;
                arg3.field7631 = 1;
                class439.method2721(class116.field1781 == arg3, var4, arg3.field1275, arg3.field7551, (byte) 116, arg3.field1279, arg3.field1274);
            }
            if (var5 == 2) {
                arg3.field7604 = 0;
            }
        } else if (arg1 == -1 || arg3.field7644 == -1 || class393.field5735.method1538(-4031, arg1).field971 >= class393.field5735.method1538(-4031, arg3.field7644).field971) {
            arg3.field7652 = arg3.field7658;
            arg3.field7631 = 1;
            arg3.field7604 = 0;
            arg3.field7644 = arg1;
            arg3.field7588 = arg2;
            arg3.field7551 = 0;
            arg3.field7584 = 0;
            if (arg3.field7644 != -1) {
                class439.method2721(class116.field1781 == arg3, class393.field5735.method1538(-4031, arg3.field7644), arg3.field1275, arg3.field7551, (byte) 116, arg3.field1279, arg3.field1274);
            }
        }
        if (arg0 == 18105) {
            field404++;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method206(long arg0, int arg1) {
        field407++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            if (arg1 > -119) {
                field408 = null;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class311.field4742[(int) (var7 - (arg0 * 37L))];
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

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)Z")
    public static final boolean method207(boolean arg0) {
        if (arg0) {
            method206(34L, -26);
        }
        field405++;
        try {
            if (class386.field5678 == 2) {
                if (class281.field4368 == null) {
                    class281.field4368 = class519.method3062(class134.field1992, class40.field655, class367.field5417);
                    if (class281.field4368 == null) {
                        return false;
                    }
                }
                if (class424.field6225 == null) {
                    class424.field6225 = new class303(class46.field730, class402.field5939);
                }
                if (class192.field2954.method2375(22050, class27.field303, class424.field6225, (byte) 114, class281.field4368)) {
                    class192.field2954.method2356(12554);
                    class192.field2954.method2388(class169.field2569, -102);
                    class192.field2954.method2362(class215.field3250, class281.field4368, (byte) 20);
                    class424.field6225 = null;
                    class134.field1992 = null;
                    class281.field4368 = null;
                    class386.field5678 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class192.field2954.method2373(-28708);
            class134.field1992 = null;
            class281.field4368 = null;
            class424.field6225 = null;
            class386.field5678 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class34(String arg0, int arg1) {
        this.field411 = arg1;
    }

    @OriginalMember(owner = "client!eg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field403++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static void method208(byte arg0) {
        field408 = null;
        if (arg0 < 6) {
            field406 = -123;
        }
    }
}
