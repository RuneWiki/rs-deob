import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class164 extends class219 {

    @OriginalMember(owner = "client!as", name = "p", descriptor = "I")
    public static int field1997 = 0;

    @OriginalMember(owner = "client!as", name = "y", descriptor = "[I")
    public static int[] field2006 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!as", name = "B", descriptor = "Lfj;")
    public static class684 field2009 = new class684(7, 7);

    @OriginalMember(owner = "client!as", name = "F", descriptor = "I")
    public static int field2013 = -1;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "F")
    private float field1996;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "F")
    private float field1998;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!as", name = "s", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "I")
    private int field2001;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "I")
    private int field2002;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!as", name = "w", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!as", name = "x", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!as", name = "A", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!as", name = "C", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!as", name = "z", descriptor = "Ljava/lang/String;")
    private String field2007;

    @OriginalMember(owner = "client!as", name = "D", descriptor = "Ljava/lang/String;")
    private String field2011;

    @OriginalMember(owner = "client!as", name = "E", descriptor = "Ljava/lang/String;")
    private String field2012;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(B)F")
    public final float method1141(byte arg0) {
        if (arg0 < 49) {
            this.method986(95, (OggPacket) null);
        }
        ++field2005;
        return this.field1998;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
    public final void method987(int arg0) {
        if (arg0 != 0) {
            this.method987(27);
        }
        ++field1999;
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(B)V")
    public static void method1142(byte arg0) {
        field2009 = null;
        if (arg0 == -66) {
            field2006 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class164(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(II)V")
    public static final void method1143(int arg0, int arg1) {
        ++field2010;
        if (class62.method534(7900)) {
            if (~class48.field648 != ~arg1) {
                class513.field7244 = "";
            }
            int var2 = 97 / ((-55 - arg0) / 54);
            class48.field648 = arg1;
            if (class436.field5748 != null) {
                class436.field5748.method768(0);
                class436.field5748 = null;
            }
            class48.method454(5, -1);
        }
    }

    @OriginalMember(owner = "client!as", name = "d", descriptor = "(B)Ljava/lang/String;")
    public final String method1144(byte arg0) {
        if (arg0 < 1) {
            this.method1145(true);
        }
        ++field2004;
        return this.field2007;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V")
    public final void method986(int arg0, OggPacket arg1) {
        ++field2003;
        if (arg0 <= ~super.field2569 || "SUB".equals(this.field2012)) {
            class403 var3 = new class403(arg1.getData());
            int var4 = var3.method2396((byte) 111);
            if (super.field2569 <= 8) {
                if (~(var4 | 128) == -1) {
                    throw new IllegalStateException();
                }
                if (super.field2569 != 0) {
                    return;
                }
                var3.field5262 += 23;
                this.field2001 = var3.method2405(arg0 + 271044081);
                this.field2002 = var3.method2405(271044080);
                if (~this.field2001 == -1 || ~this.field2002 == -1) {
                    throw new IllegalStateException();
                }
                class403 var12 = new class403(16);
                var3.method2401(65280, var12.field5275, 0, 16);
                this.field2007 = var12.method2384(arg0 ^ 6434);
                var12.field5262 = 0;
                var3.method2401(65280, var12.field5275, 0, 16);
                this.field2012 = var12.method2384(-6435);
            } else {
                if (~var4 == -1) {
                    long var5 = var3.method2372(1073646112);
                    long var7 = var3.method2372(1073646112);
                    long var9 = var3.method2372(1073646112);
                    if (~var5 > -1L || var7 < 0L || var9 < 0L || var9 > var5) {
                        throw new IllegalStateException();
                    }
                    this.field1996 = (float) ((var5 + var7) * (long) this.field2002) / (float) this.field2001;
                    this.field1998 = (float) ((long) this.field2002 * var5) / (float) this.field2001;
                    int var11 = var3.method2405(271044080);
                    if (var11 < 0 || var11 > var3.field5275.length + -var3.field5262) {
                        throw new IllegalStateException();
                    }
                    this.field2011 = class733.method4141(var3.field5275, -117, var3.field5262, var11);
                }
                if (~(128 | var4) != -1) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(Z)F")
    public final float method1145(boolean arg0) {
        ++field2008;
        if (arg0) {
            this.method1141((byte) 107);
        }
        return this.field1996;
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)Ljava/lang/String;")
    public final String method1146(int arg0) {
        ++field2000;
        if (arg0 <= 69) {
            this.field2011 = null;
        }
        return this.field2011;
    }
}
