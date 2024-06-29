import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class257 extends class447 {

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "[Leb;")
    public static class371[] field3502 = new class371[2048];

    @OriginalMember(owner = "client!bn", name = "G", descriptor = "I")
    public static int field3508 = 0;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
    public static int field3500 = 0;

    @OriginalMember(owner = "client!bn", name = "K", descriptor = "[Z")
    public static boolean[] field3512 = new boolean[100];

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!bn", name = "E", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!bn", name = "H", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!bn", name = "L", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!bn", name = "F", descriptor = "Ljava/lang/String;")
    public String field3507;

    @OriginalMember(owner = "client!bn", name = "D", descriptor = "[C")
    public char[] field3505;

    @OriginalMember(owner = "client!bn", name = "J", descriptor = "[C")
    public char[] field3511;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "[I")
    public int[] field3497;

    @OriginalMember(owner = "client!bn", name = "I", descriptor = "[I")
    public int[] field3510;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "[Z")
    public static boolean[] field3496;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZZIZI)Lqj;")
    public static final class296 method1571(boolean arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        field3506++;
        class197 var5 = null;
        if (!arg0) {
            method1574(-8, (byte) 121, -84, 127, -32);
        }
        if (class426.field6115 != null) {
            var5 = new class197(arg2, class426.field6115, class285.field3921[arg2], 1000000);
        }
        class31.field486[arg2] = class125.field1746.method1134(class171.field2444, var5, (byte) 66, arg2);
        if (arg3) {
            class31.field486[arg2].method2808(0);
        }
        return new class296(class31.field486[arg2], arg1, arg4);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(CI)I")
    public final int method1572(char arg0, int arg1) {
        field3499++;
        if (this.field3510 == null) {
            return -1;
        } else if (arg1 <= 61) {
            return -36;
        } else {
            for (int var3 = 0; var3 < this.field3510.length; var3++) {
                if (this.field3505[var3] == arg0) {
                    return this.field3510[var3];
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "(B)V")
    public static void method1573(byte arg0) {
        if (arg0 < 125) {
            field3502 = null;
        }
        field3512 = null;
        field3496 = null;
        field3502 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBIII)V")
    public static final void method1574(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3504++;
        float var5 = (float) class42.field646 / (float) class42.field648;
        int var6 = arg2;
        int var7 = arg0;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg2 * var5);
        } else {
            var6 = (int) ((float) arg0 / var5);
        }
        int var8 = arg3 - (arg2 - var6) / 2;
        int var9 = arg4 - (arg0 - var7) / 2;
        class339.field4742 = class42.field648 * var8 / var6;
        class165.field2359 = -1;
        class448.field6472 = class42.field646 - (class42.field646 * var9 / var7);
        if (arg1 == -93) {
            class35.field545 = -1;
            class245.method1536((byte) 57);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILeb;I)V")
    private final void method1575(int arg0, class371 arg1, int arg2) {
        if (arg2 == 1) {
            this.field3507 = arg1.method2422(-1);
        } else if (arg2 == 2) {
            int var4 = arg1.method2429(arg0 + 1);
            this.field3510 = new int[var4];
            this.field3505 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3510[var5] = arg1.method2403((byte) 82);
                byte var6 = arg1.method2418(-21337);
                this.field3505[var5] = var6 == 0 ? 0 : class46.method329(var6, arg0 + 1);
            }
        } else if (arg2 == 3) {
            int var7 = arg1.method2429(0);
            this.field3511 = new char[var7];
            this.field3497 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3497[var8] = arg1.method2403((byte) 122);
                byte var9 = arg1.method2418(-21337);
                this.field3511[var8] = var9 == 0 ? 0 : class46.method329(var9, 0);
            }
        }
        field3501++;
        if (arg0 != -1) {
            this.method1578(34, (class371) null);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BC)I")
    public final int method1576(byte arg0, char arg1) {
        field3513++;
        if (this.field3497 == null) {
            return -1;
        }
        int var3 = -112 / ((-arg0 - 69) / 51);
        for (int var4 = 0; var4 < this.field3497.length; var4++) {
            if (this.field3511[var4] == arg1) {
                return this.field3497[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "(B)V")
    public final void method1577(byte arg0) {
        field3498++;
        if (this.field3497 != null) {
            for (int var2 = 0; var2 < this.field3497.length; var2++) {
                this.field3497[var2] = class311.method1970(this.field3497[var2], 32768);
            }
        }
        if (this.field3510 != null) {
            for (int var3 = 0; var3 < this.field3510.length; var3++) {
                this.field3510[var3] = class311.method1970(this.field3510[var3], 32768);
            }
        }
        int var4 = 101 / ((44 - arg0) / 51);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILeb;)V")
    public final void method1578(int arg0, class371 arg1) {
        if (arg0 != -1) {
            field3503 = 118;
        }
        while (true) {
            int var3 = arg1.method2429(arg0 + 1);
            if (var3 == 0) {
                field3509++;
                return;
            }
            this.method1575(-1, arg1, var3);
        }
    }
}
