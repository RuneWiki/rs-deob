import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class129 {

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public int field1996;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "[I")
    public int[] field2000;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "[Ljava/lang/String;")
    public String[] field2007;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "[B")
    public byte[] field1998;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "[S")
    public short[] field2006;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "[S")
    public short[] field2004;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field2002 = -1;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(CB)Z", line = 5)
    public static final boolean method957(char arg0, byte arg1) {
        field2008++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class301.field4603;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        if (arg1 != 58) {
            field2002 = 57;
        }
        return false;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Z", line = 43)
    public final boolean method958(int arg0, int arg1) {
        if (arg1 >= -127) {
            this.method960(10, 50);
        }
        field1995++;
        return (this.field1998[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 56)
    public static final void method959(int arg0) {
        field1994++;
        class43 var1 = class186.field2779;
        synchronized (class186.field2779) {
            class230.field3475++;
            class183.field2744 = class132.field2035;
            class132.field2036 = class329.field4938;
            class237.field3557 = class76.field992;
            class253.field3813 = class177.field2617;
            class207.field3140 = class300.field4593;
            class28.field387 = class197.field2957;
            class325.field4890 = class189.field2821;
            class177.field2617 = arg0;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)Z", line = 82)
    public final boolean method960(int arg0, int arg1) {
        if (arg0 != 966106632) {
            this.field1998 = (byte[]) null;
        }
        field1999++;
        return (this.field1998[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(II)I", line = 95)
    public static final int method961(int arg0, int arg1) {
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        int var3 = ((var2 & 0xCCCCCCCF) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        field2005++;
        if (arg0 != 160) {
            field2002 = 116;
        }
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V", line = 117)
    public static final void method962(int arg0) {
        field1997++;
        if (class246.field3670 != null) {
            class169.method1180(class246.field3670, (byte) -95);
            class246.field3670 = null;
        }
        if (arg0 > -113) {
            field2002 = 109;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZ)I", line = 136)
    public final int method963(int arg0, boolean arg1) {
        field2003++;
        if (!arg1) {
            this.field2000 = (int[]) null;
        }
        return this.field1998[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(IZ)Z", line = 148)
    public final boolean method964(int arg0, boolean arg1) {
        field2001++;
        if (!arg1) {
            this.field2000 = (int[]) null;
        }
        return (this.field1998[arg0] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(I)V", line = 157)
    public class129(int arg0) {
        this.field1996 = arg0;
        this.field2000 = new int[this.field1996];
        this.field2007 = new String[this.field1996];
        this.field1998 = new byte[this.field1996];
        this.field2006 = new short[this.field1996];
        this.field2004 = new short[this.field1996];
    }
}
