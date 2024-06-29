import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class92 {

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "Lmb;")
    public class86 field1196 = new class86();

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "[I")
    public static int[] field1195 = new int[50];

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1198 = "skill: ";

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field1203 = -1;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "Lmb;")
    private class86 field1202;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)Lmb;", line = 7)
    public final class86 method663(int arg0) {
        field1199++;
        class86 var2 = this.field1202;
        if (this.field1196 == var2) {
            this.field1202 = null;
            return null;
        }
        if (arg0 != -2069) {
            field1198 = (String) null;
        }
        this.field1202 = var2.field1098;
        return var2;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)I", line = 30)
    public final int method664(int arg0) {
        field1191++;
        if (arg0 >= -38) {
            this.method670((byte) -55, (class86) null);
        }
        int var2 = 0;
        class86 var3 = this.field1196.field1098;
        while (this.field1196 != var3) {
            var3 = var3.field1098;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V", line = 53)
    public static void method665(int arg0) {
        field1195 = null;
        if (arg0 != 0) {
            method665(70);
        }
        field1198 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V", line = 64)
    public static final void method666(byte arg0) {
        if (arg0 >= 0) {
            method667(50, -9L);
        }
        while (class240.field3490.method1310(class315.field4648, 8) >= 11) {
            int var1 = class240.field3490.method1311(11, 7);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class311.field4574[var1] == null) {
                var2 = true;
                class311.field4574[var1] = new class239();
                if (class29.field334[var1] != null) {
                    class311.field4574[var1].method1695(class29.field334[var1], (byte) 71);
                }
            }
            class288.field4157[class112.field1441++] = var1;
            class239 var3 = class311.field4574[var1];
            var3.field4875 = class313.field4603;
            int var4 = class159.field2267[class240.field3490.method1311(3, 7)];
            if (var2) {
                var3.field4912 = var3.field4926 = var4;
            }
            int var5 = class240.field3490.method1311(5, 7);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class240.field3490.method1311(1, 7);
            int var7 = class240.field3490.method1311(1, 7);
            if (var7 == 1) {
                class35.field430[class318.field4689++] = var1;
            }
            int var8 = class240.field3490.method1311(5, 7);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method1700(class359.field5616.field4936[0] + var8, var6 == 1, (byte) -42, class359.field5616.field4842[0] + var5);
        }
        class240.field3490.method1303(0);
        field1200++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 131)
    public static final String method667(int arg0, long arg1) {
        field1193++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = arg0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class237.field3433[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)Lmb;", line = 174)
    public final class86 method668(byte arg0) {
        if (arg0 != 56) {
            return (class86) null;
        }
        class86 var2 = this.field1196.field1098;
        field1194++;
        if (this.field1196 == var2) {
            this.field1202 = null;
            return null;
        } else {
            this.field1202 = var2.field1098;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V", line = 197)
    public static final void method669(int arg0) {
        if (arg0 != 60) {
            return;
        }
        field1192++;
        for (class226 var1 = (class226) class95.field1233.method413(1253231568); var1 != null; var1 = (class226) class95.field1233.method419(115)) {
            class347 var2 = var1.field3253;
            if (class56.field724 != var2.field5397 || var2.field5413) {
                var1.method179((byte) 51);
            } else if (class313.field4603 >= var2.field5410) {
                var2.method2408(class186.field2551, (byte) -46);
                if (var2.field5413) {
                    var1.method179((byte) 51);
                } else {
                    class192.method1392(var2.field5397, var2.field5388, var2.field5395, var2.field5389, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V", line = 275)
    public class92() {
        this.field1196.field1099 = this.field1196;
        this.field1196.field1098 = this.field1196;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLmb;)V", line = 255)
    public final void method670(byte arg0, class86 arg1) {
        if (arg1.field1099 != null) {
            arg1.method623(92);
        }
        arg1.field1098 = this.field1196;
        arg1.field1099 = this.field1196.field1099;
        field1201++;
        arg1.field1099.field1098 = arg1;
        if (arg0 > 67) {
            arg1.field1098.field1099 = arg1;
        }
    }
}
