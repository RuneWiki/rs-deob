import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class299 extends class176 {

    @OriginalMember(owner = "client!du", name = "w", descriptor = "Z")
    public boolean field4091 = false;

    @OriginalMember(owner = "client!du", name = "t", descriptor = "I")
    public int field4088 = -1;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "I")
    public int field4084;

    @OriginalMember(owner = "client!du", name = "q", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!du", name = "r", descriptor = "I")
    public int field4086;

    @OriginalMember(owner = "client!du", name = "s", descriptor = "I")
    public int field4087;

    @OriginalMember(owner = "client!du", name = "u", descriptor = "I")
    public int field4089;

    @OriginalMember(owner = "client!du", name = "v", descriptor = "I")
    public int field4090;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lvs;III)V")
    public static final void method1901(class508 arg0, int arg1, int arg2, int arg3) {
        long var4 = class217.field3091[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field7093 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field7100[arg0.field7093++] = class363.field4863[var8 - 1].field7959;
            var6 += 16L;
        }
        for (int var9 = arg0.field7093; var9 < 4; var9++) {
            arg0.field7100[var9] = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ZLmg;BZ)V")
    public static final void method1902(boolean arg0, class128 arg1, byte arg2, boolean arg3) {
        field4082++;
        int var4 = arg1.field2065;
        int var5 = (int) arg1.field2524;
        arg1.method1117(0);
        if (arg0) {
            class296.method1892(var4, (byte) -88);
        }
        class641.method3703(912387760, var4);
        class114 var6 = class612.method3584(var5, 0);
        if (var6 != null) {
            class403.method2407(var6, -9130);
        }
        class319.method1989(125);
        if (!arg3 && class56.field1005 != -1) {
            class625.method3650(1, class56.field1005, false);
        }
        if (arg2 != 78) {
            method1903(-44, -47, -127);
        }
        class615 var7 = new class615(class211.field2971);
        for (class128 var8 = (class128) var7.method3591(false); var8 != null; var8 = (class128) var7.method3595((byte) 4)) {
            if (!var8.method1120(0)) {
                var8 = (class128) var7.method3591(false);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field2063 == 3) {
                int var9 = (int) var8.field2524;
                if (var9 >>> 16 == var4) {
                    method1902(true, var8, (byte) 78, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(III)Z")
    public static final boolean method1903(int arg0, int arg1, int arg2) {
        int var3 = -24 / ((arg2 + 82) / 35);
        field4085++;
        return (arg1 & 0x800) != 0 | class8.method47(arg0, 65, arg1) || class147.method979(-124, arg0, arg1);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IBLdaa;)Ljava/lang/String;")
    public static final String method1904(int arg0, byte arg1, class11 arg2) {
        if (arg1 > -122) {
            return null;
        }
        field4083++;
        try {
            int var3 = arg2.method112(-8838);
            if (var3 > arg0) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg2.field165 += class303.field4139.method846(var4, 0, arg2.field165, var3, -6286, arg2.field138);
            return class231.method1465(0, 55, var3, var4);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(I)V")
    public class299(int arg0) {
        this.field4088 = arg0;
    }
}
