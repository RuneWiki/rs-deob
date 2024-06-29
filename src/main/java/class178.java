import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class178 {

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Z")
    private boolean field1988 = false;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public int field1996 = 443;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public int field1999 = 43594;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "Z")
    private boolean field1998 = false;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field1992 = -1;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public int field2001;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "Ldu;")
    public static class584 field1994;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Ltf;")
    public static class701 field1989;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "Ljava/lang/String;")
    public String field1987;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)Z")
    public static final boolean method1085(int arg0, int arg1, int arg2) {
        if (arg0 != -1252) {
            field1992 = -120;
        }
        field2000++;
        return (arg2 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1086(byte arg0, byte[] arg1) {
        field1997++;
        class115 var2 = new class115(arg1);
        if (arg0 != -110) {
            return null;
        }
        int var3 = var2.method620((byte) -21);
        int var4 = var2.method631(false);
        if (var4 < 0 || class110.field1178 != 0 && class110.field1178 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var8 = new byte[var4];
            var2.method628(0, var4, var8, (byte) -105);
            return var8;
        } else {
            int var5 = var2.method631(false);
            if (var5 < 0 || class110.field1178 != 0 && class110.field1178 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class576.method3265(var6, var5, arg1, var4, 9);
            } else {
                class107 var7 = class496.field7185;
                synchronized (class496.field7185) {
                    class496.field7185.method580(var2, var6, arg0 ^ 0x6A);
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public final void method1087(int arg0) {
        if (!this.field1998) {
            this.field1988 = true;
            this.field1998 = true;
        } else if (this.field1988) {
            this.field1988 = false;
        } else {
            this.field1998 = false;
        }
        if (arg0 != 0) {
            this.field2001 = 61;
        }
        field1991++;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
    public static void method1088(int arg0) {
        if (arg0 >= 10) {
            field1994 = null;
            field1989 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lpi;I)Lbp;")
    public final class88 method1089(class464 arg0, int arg1) {
        field1995++;
        return arg1 < 24 ? null : arg0.method2678(-9787, this.field1988, this.field1998 ? this.field1996 : this.field1999, this.field1987);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILcj;)Z")
    public final boolean method1090(int arg0, class178 arg1) {
        if (arg0 != -1) {
            field1992 = 89;
        }
        field1990++;
        if (arg1 == null) {
            return false;
        } else {
            return this.field2001 == arg1.field2001 && this.field1987.equals(arg1.field1987);
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
    public static final void method1091(int arg0) {
        field1993++;
        if (!class639.field9075.method2641(class430.field6109, (byte) 34) && class652.field9150 != class169.field1888) {
            class256.method1517((byte) 39, 11, class43.field418, false, class613.field8628);
            return;
        }
        class204.method1228(false, class701.field9813);
        if (class169.field1888 != class138.field1524) {
            class359.method2109((byte) -112);
        }
        if (arg0 >= -74) {
            method1086((byte) -72, null);
        }
    }
}
