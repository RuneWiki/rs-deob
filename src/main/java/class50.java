import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class50 extends class501 {

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field582 = new Hashtable();

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "[I")
    public static int[] field588 = new int[256];

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
    public static int field589 = 0;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "Z")
    public static boolean field590;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "Ljava/lang/String;")
    public String field581;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "[C")
    public char[] field577;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "[C")
    public char[] field586;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "[I")
    public int[] field578;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "[I")
    public int[] field583;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field588[var0] = var1;
        }
        field590 = false;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILgw;B)V", line = 6)
    private final void method300(int arg0, class148 arg1, byte arg2) {
        if (arg2 != -85) {
            method305(87);
        }
        field585++;
        if (arg0 == 1) {
            this.field581 = arg1.method1023(-29153);
        } else if (arg0 == 2) {
            int var7 = arg1.method1032((byte) -33);
            this.field586 = new char[var7];
            this.field578 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field578[var8] = arg1.method1045(true);
                byte var9 = arg1.method1062(-21188);
                this.field586[var8] = var9 == 0 ? 0 : class387.method2305((byte) -85, var9);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method1032((byte) -33);
            this.field577 = new char[var4];
            this.field583 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field583[var5] = arg1.method1045(true);
                byte var6 = arg1.method1062(-21188);
                this.field577[var5] = var6 == 0 ? 0 : class387.method2305((byte) -95, var6);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(CI)I", line = 76)
    public final int method301(char arg0, int arg1) {
        field576++;
        if (this.field583 == null) {
            return -1;
        }
        if (arg1 != 781) {
            this.field578 = null;
        }
        for (int var3 = 0; var3 < this.field583.length; var3++) {
            if (this.field577[var3] == arg0) {
                return this.field583[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(Z)V", line = 102)
    public final void method302(boolean arg0) {
        field584++;
        if (arg0) {
            this.field581 = null;
        }
        if (this.field583 != null) {
            for (int var2 = 0; var2 < this.field583.length; var2++) {
                this.field583[var2] = class473.method2847(this.field583[var2], 32768);
            }
        }
        if (this.field578 != null) {
            for (int var3 = 0; var3 < this.field578.length; var3++) {
                this.field578[var3] = class473.method2847(this.field578[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V", line = 131)
    public static void method303(byte arg0) {
        field588 = null;
        if (arg0 > -63) {
            method305(-48);
        }
        field582 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lgw;Z)V", line = 145)
    public final void method304(class148 arg0, boolean arg1) {
        if (arg1) {
            this.method301((char) 65524, -85);
        }
        while (true) {
            int var3 = arg0.method1032((byte) -33);
            if (var3 == 0) {
                field587++;
                return;
            }
            this.method300(var3, arg0, (byte) -85);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 168)
    public static final void method305(int arg0) {
        int var1 = 0;
        if (arg0 != 2) {
            field582 = null;
        }
        while (var1 < class359.field4885) {
            class300 var2 = class378.field5206[var1];
            if (var2.field4119 == 2) {
                if (var2.field4121 == null) {
                    var2.field4125 = Integer.MIN_VALUE;
                } else {
                    class155.field2316.method258(var2.field4121);
                }
            }
            var1++;
        }
        field580++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IC)I", line = 197)
    public final int method306(int arg0, char arg1) {
        field579++;
        if (this.field578 == null) {
            return -1;
        }
        if (arg0 <= 38) {
            this.field578 = null;
        }
        for (int var3 = 0; var3 < this.field578.length; var3++) {
            if (this.field586[var3] == arg1) {
                return this.field578[var3];
            }
        }
        return -1;
    }
}
