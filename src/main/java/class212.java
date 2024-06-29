import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class212 extends class259 {

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public int field3218 = 0;

    @OriginalMember(owner = "client!uc", name = "W", descriptor = "I")
    public int field3231 = -1;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "Z")
    public boolean field3221 = true;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
    public int field3225 = 0;

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "I")
    public int field3233 = -1;

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "I")
    public int field3234 = 12800;

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "I")
    public int field3235 = 12800;

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "Ljava/lang/String;")
    public String field3232;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    public int field3215;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "Ljava/lang/String;")
    public String field3216;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    public int field3213;

    @OriginalMember(owner = "client!uc", name = "V", descriptor = "Lgj;")
    public class257 field3230;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3222 = "glow1:";

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field3214 = new String[5];

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
    public static int field3217 = 0;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "Ljava/lang/String;")
    public static String field3226 = "Face here";

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    public static int field3224 = -1;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIB[II)Z", line = 9)
    public final boolean method1479(int arg0, int arg1, byte arg2, int[] arg3, int arg4) {
        int var6 = 31 / ((-arg2 - 46) / 37);
        field3210++;
        for (class260 var7 = (class260) this.field3230.method1812(1); var7 != null; var7 = (class260) this.field3230.method1809(128)) {
            if (var7.method1836(arg0, (byte) 91, arg4, arg1)) {
                var7.method1839(arg4, arg1, false, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IJ)V", line = 38)
    public static final void method1480(int arg0, long arg1) {
        field3223++;
        if (arg1 == 0L) {
            return;
        }
        class328.field5282.method304(126, 19830);
        class245.field3847++;
        class328.field5282.method1039(arg1, (byte) -123);
        if (arg0 != -27897) {
            method1484((class16) null, (class16) null, 59);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([IIII)Z", line = 56)
    public final boolean method1481(int[] arg0, int arg1, int arg2, int arg3) {
        field3211++;
        if (arg1 < 106) {
            return true;
        }
        for (class260 var5 = (class260) this.field3230.method1812(1); var5 != null; var5 = (class260) this.field3230.method1809(128)) {
            if (var5.method1831(5, arg2, arg3)) {
                var5.method1833(arg0, arg3, (byte) 102, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II[II)Z", line = 83)
    public final boolean method1482(int arg0, int arg1, int[] arg2, int arg3) {
        field3228++;
        if (arg1 < 103) {
            this.field3231 = -12;
        }
        for (class260 var5 = (class260) this.field3230.method1812(1); var5 != null; var5 = (class260) this.field3230.method1809(128)) {
            if (var5.method1838(arg0, false, arg3)) {
                var5.method1839(arg3, arg0, false, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 251)
    public class212(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field3221 = arg5;
        this.field3232 = arg1;
        this.field3233 = arg6;
        if (this.field3233 == 255) {
            this.field3233 = 0;
        }
        this.field3215 = arg3;
        this.field3216 = arg2;
        this.field3231 = arg4;
        this.field3213 = arg0;
        this.field3230 = new class257();
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V", line = 114)
    public static void method1483(boolean arg0) {
        field3226 = null;
        field3222 = null;
        field3214 = null;
        if (!arg0) {
            method1484((class16) null, (class16) null, -62);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lnk;Lnk;I)V", line = 127)
    public static final void method1484(class16 arg0, class16 arg1, int arg2) {
        class101.field1368 = arg0;
        if (arg2 != 23008) {
            method1483(true);
        }
        class259.field4088 = arg1;
        field3227++;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(B)V", line = 146)
    public final void method1485(byte arg0) {
        this.field3234 = 12800;
        this.field3218 = 0;
        this.field3225 = 0;
        field3220++;
        this.field3235 = 12800;
        if (arg0 != -66) {
            this.field3216 = (String) null;
        }
        for (class260 var2 = (class260) this.field3230.method1812(arg0 + 67); var2 != null; var2 = (class260) this.field3230.method1809(128)) {
            if (var2.field4113 < this.field3235) {
                this.field3235 = var2.field4113;
            }
            if (var2.field4109 > this.field3218) {
                this.field3218 = var2.field4109;
            }
            if (var2.field4115 < this.field3234) {
                this.field3234 = var2.field4115;
            }
            if (this.field3225 < var2.field4106) {
                this.field3225 = var2.field4106;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBI)Z", line = 210)
    public final boolean method1486(int arg0, byte arg1, int arg2) {
        field3229++;
        class260 var4 = (class260) this.field3230.method1812(1);
        if (arg1 != 50) {
            method1483(false);
        }
        while (var4 != null) {
            if (var4.method1838(arg0, false, arg2)) {
                return true;
            }
            var4 = (class260) this.field3230.method1809(128);
        }
        return false;
    }
}
