import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class302 extends class162 {

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "Z")
    public static boolean field4951 = false;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "Ljava/lang/String;")
    public String field4952;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "[C")
    public char[] field4944;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "[C")
    public char[] field4954;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "[I")
    public int[] field4943;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "[I")
    public int[] field4945;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "(I)V")
    public final void method2080(int arg0) {
        field4955++;
        if (arg0 < 25) {
            this.method2085('?', 16);
        }
        if (this.field4945 != null) {
            for (int var2 = 0; var2 < this.field4945.length; var2++) {
                this.field4945[var2] = class82.method554(this.field4945[var2], 32768);
            }
        }
        if (this.field4943 != null) {
            for (int var3 = 0; var3 < this.field4943.length; var3++) {
                this.field4943[var3] = class82.method554(this.field4943[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BC)I")
    public final int method2081(byte arg0, char arg1) {
        field4947++;
        if (this.field4945 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4945.length; var3++) {
            if (this.field4944[var3] == arg1) {
                return this.field4945[var3];
            }
        }
        if (arg0 != -39) {
            field4946 = -74;
        }
        return -1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lma;Z)V")
    public final void method2082(class202 arg0, boolean arg1) {
        field4953++;
        while (true) {
            int var3 = arg0.method1420((byte) 0);
            if (var3 == 0) {
                if (arg1) {
                    this.field4945 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method2083(var3, arg0, (byte) -23);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILma;B)V")
    private final void method2083(int arg0, class202 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field4952 = arg1.method1403(-128);
        } else if (arg0 == 2) {
            int var4 = arg1.method1420((byte) 0);
            this.field4943 = new int[var4];
            this.field4954 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4943[var5] = arg1.method1419(126);
                byte var6 = arg1.method1457((byte) -36);
                this.field4954[var5] = var6 == 0 ? 0 : class6.method34(-120, var6);
            }
        } else if (arg0 == 3) {
            int var7 = arg1.method1420((byte) 0);
            this.field4945 = new int[var7];
            this.field4944 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4945[var8] = arg1.method1419(arg2 + 120);
                byte var9 = arg1.method1457((byte) -106);
                this.field4944[var8] = var9 == 0 ? 0 : class6.method34(-105, var9);
            }
        }
        field4950++;
        if (arg2 != -23) {
            field4946 = -8;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Z)V")
    public static final void method2084(boolean arg0) {
        field4949++;
        class9.field106.method145(-81);
        if (arg0) {
            field4946 = -87;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(CI)I")
    public final int method2085(char arg0, int arg1) {
        field4948++;
        if (this.field4943 == null) {
            return -1;
        }
        if (arg1 != 5733) {
            this.field4945 = null;
        }
        for (int var3 = 0; var3 < this.field4943.length; var3++) {
            if (this.field4954[var3] == arg0) {
                return this.field4943[var3];
            }
        }
        return -1;
    }
}
