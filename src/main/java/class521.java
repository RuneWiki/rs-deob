import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class521 extends class623 {

    @OriginalMember(owner = "client!baa", name = "y", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!baa", name = "z", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!baa", name = "B", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!baa", name = "C", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!baa", name = "D", descriptor = "I")
    public static int field7419;

    @OriginalMember(owner = "client!baa", name = "E", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!baa", name = "v", descriptor = "Ljava/lang/String;")
    public String field7411;

    @OriginalMember(owner = "client!baa", name = "w", descriptor = "[C")
    public char[] field7412;

    @OriginalMember(owner = "client!baa", name = "x", descriptor = "[C")
    public char[] field7413;

    @OriginalMember(owner = "client!baa", name = "A", descriptor = "[I")
    public int[] field7416;

    @OriginalMember(owner = "client!baa", name = "F", descriptor = "[I")
    public int[] field7421;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(BC)I")
    public final int method3059(byte arg0, char arg1) {
        field7415++;
        if (this.field7416 == null) {
            return -1;
        }
        if (arg0 > -6) {
            this.field7421 = null;
        }
        for (int var3 = 0; var3 < this.field7416.length; var3++) {
            if (this.field7413[var3] == arg1) {
                return this.field7416[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(II)V")
    public static final void method3060(int arg0, int arg1) {
        field7417++;
        if (class654.field9334.field9864.method4034(arg1 - 122) == 0) {
            arg0 = -1;
        }
        if (class683.field9667 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class552 var2 = class184.field2207.method556(arg0, 15563);
            class155 var3 = var2.method3236((byte) 61);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class289.field3549.method3202(-4052, var3.method951(), var3.method957(), class618.field8849, var3.method948(), new Point(var2.field7921, var2.field7917));
                class683.field9667 = arg0;
            }
        }
        if (arg0 == arg1 && class683.field9667 != -1) {
            class289.field3549.method3202(arg1 - 4051, -1, -1, class618.field8849, null, new Point());
            class683.field9667 = -1;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILig;B)V")
    private final void method3061(int arg0, class244 arg1, byte arg2) {
        field7419++;
        if (arg0 == 1) {
            this.field7411 = arg1.method1468(-1468860088);
        } else if (arg0 == 2) {
            int var4 = arg1.method1423(-81);
            this.field7421 = new int[var4];
            this.field7412 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7421[var5] = arg1.method1476(-85);
                byte var6 = arg1.method1448((byte) -88);
                this.field7412[var5] = var6 == 0 ? 0 : class169.method1054(var6, -161);
            }
        } else if (arg0 == 3) {
            int var7 = arg1.method1423(-114);
            this.field7413 = new char[var7];
            this.field7416 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field7416[var8] = arg1.method1476(123);
                byte var9 = arg1.method1448((byte) -96);
                this.field7413[var8] = var9 == 0 ? 0 : class169.method1054(var9, -161);
            }
        }
        if (arg2 <= 1) {
            this.field7413 = null;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lig;I)V")
    public final void method3062(class244 arg0, int arg1) {
        if (arg1 != -4270) {
            return;
        }
        field7420++;
        while (true) {
            int var3 = arg0.method1423(-50);
            if (var3 == 0) {
                return;
            }
            this.method3061(var3, arg0, (byte) 46);
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(CI)I")
    public final int method3063(char arg0, int arg1) {
        field7418++;
        if (this.field7421 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg1 != -18817) {
            return 35;
        }
        while (this.field7421.length > var3) {
            if (this.field7412[var3] == arg0) {
                return this.field7421[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V")
    public final void method3064(int arg0) {
        field7414++;
        if (this.field7416 != null) {
            for (int var2 = 0; var2 < this.field7416.length; var2++) {
                this.field7416[var2] = class695.method3919(this.field7416[var2], 32768);
            }
        }
        if (this.field7421 != null) {
            for (int var3 = 0; var3 < this.field7421.length; var3++) {
                this.field7421[var3] = class695.method3919(this.field7421[var3], 32768);
            }
        }
        if (arg0 <= 100) {
            this.field7413 = null;
        }
    }
}
