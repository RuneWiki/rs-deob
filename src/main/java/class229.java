import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class229 extends class513 {

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
    public int field3335 = -1;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    public int field3331 = 12800;

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "Z")
    public boolean field3342 = true;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "I")
    public int field3340 = 0;

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "I")
    public int field3343 = -1;

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "I")
    public int field3349 = 12800;

    @OriginalMember(owner = "client!jf", name = "M", descriptor = "I")
    public int field3345 = 0;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "I")
    public int field3336;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "Ljava/lang/String;")
    public String field3338;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    public int field3330;

    @OriginalMember(owner = "client!jf", name = "L", descriptor = "Ljava/lang/String;")
    public String field3344;

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "Ljia;")
    public class645 field3339;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "I")
    public static int field3332 = -1;

    @OriginalMember(owner = "client!jf", name = "N", descriptor = "I")
    public static int field3346 = -1;

    @OriginalMember(owner = "client!jf", name = "O", descriptor = "I")
    public static int field3347 = 0;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!jf", name = "P", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 7)
    public final void method1557(byte arg0) {
        this.field3349 = 12800;
        this.field3340 = 0;
        this.field3331 = 12800;
        field3348++;
        this.field3345 = 0;
        if (arg0 > -13) {
            return;
        }
        for (class35 var2 = (class35) this.field3339.method3589((byte) -127); var2 != null; var2 = (class35) this.field3339.method3591(0)) {
            if (this.field3345 < var2.field588) {
                this.field3345 = var2.field588;
            }
            if (var2.field592 > this.field3340) {
                this.field3340 = var2.field592;
            }
            if (this.field3349 > var2.field585) {
                this.field3349 = var2.field585;
            }
            if (var2.field577 < this.field3331) {
                this.field3331 = var2.field577;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([IIBI)Z", line = 45)
    public final boolean method1558(int[] arg0, int arg1, byte arg2, int arg3) {
        field3329++;
        if (arg2 != -120) {
            method1562((byte) 78);
        }
        for (class35 var5 = (class35) this.field3339.method3589((byte) -128); var5 != null; var5 = (class35) this.field3339.method3591(arg2 ^ 0xFFFFFF88)) {
            if (var5.method209(arg1, arg3, -120)) {
                var5.method203((byte) 124, arg1, arg3, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 302)
    public class229(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field3343 = arg4;
        this.field3336 = arg3;
        this.field3335 = arg6;
        this.field3338 = arg2;
        this.field3330 = arg0;
        this.field3342 = arg5;
        this.field3344 = arg1;
        if (this.field3335 == 255) {
            this.field3335 = 0;
        }
        this.field3339 = new class645();
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)Leka;", line = 92)
    public static final class492 method1559(boolean arg0) {
        field3337++;
        class583 var1 = null;
        class492 var2 = new class492(class177.field2797, 0);
        try {
            class545 var3 = class630.field8751.method4114(true, "", true);
            if (arg0) {
                return null;
            }
            while (var3.field7412 == 0) {
                class643.method3577(1L, 0);
            }
            if (var3.field7412 == 1) {
                var1 = (class583) var3.field7416;
                byte[] var4 = new byte[(int) var1.method3347(0)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var1.method3351((byte) -112, var4, var4.length - var5, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                var2 = new class492(new class93(var4), class177.field2797, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var1 != null) {
                var1.method3349(-4013);
            }
        } catch (Exception var7) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II[II)Z", line = 147)
    public final boolean method1560(int arg0, int arg1, int[] arg2, int arg3) {
        field3350++;
        if (arg1 != 30156) {
            this.method1563(44, 29, (byte) -61);
        }
        for (class35 var5 = (class35) this.field3339.method3589((byte) -128); var5 != null; var5 = (class35) this.field3339.method3591(arg1 - 30156)) {
            if (var5.method207((byte) 58, arg0, arg3)) {
                var5.method204(arg0, 0, arg2, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII[I)Z", line = 172)
    public final boolean method1561(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field3341++;
        int var6 = 37 % ((27 - arg0) / 40);
        for (class35 var7 = (class35) this.field3339.method3589((byte) -127); var7 != null; var7 = (class35) this.field3339.method3591(0)) {
            if (var7.method205(arg2, (byte) -1, arg1, arg3)) {
                var7.method203((byte) 115, arg2, arg1, arg4);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(B)V", line = 200)
    public static final void method1562(byte arg0) {
        field3333++;
        class583 var1 = null;
        try {
            class545 var2 = class630.field8751.method4114(true, "2", true);
            while (var2.field7412 == 0) {
                class643.method3577(1L, 0);
            }
            if (arg0 <= 66) {
                method1559(true);
            }
            if (var2.field7412 == 1) {
                var1 = (class583) var2.field7416;
                byte[] var3 = new byte[(int) var1.method3347(0)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method3351((byte) -110, var3, var3.length - var4, var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class741.method4101(-120, new class93(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method3349(-4013);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIB)Z", line = 251)
    public final boolean method1563(int arg0, int arg1, byte arg2) {
        field3334++;
        for (class35 var4 = (class35) this.field3339.method3589((byte) -128); var4 != null; var4 = (class35) this.field3339.method3591(0)) {
            if (var4.method209(arg1, arg0, arg2 - 124)) {
                return true;
            }
        }
        return arg2 != 7;
    }
}
