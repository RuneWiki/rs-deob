import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class88 {

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "Lvj;")
    private class303 field1542;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "J")
    public long field1539;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "[I")
    public static int[] field1543 = new int[250];

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Lgr;")
    public static class296 field1536 = new class296(12, 18);

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Lpi;")
    public static class342 field1545 = new class342("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "[Lna;")
    public static class35[] field1546;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)V", line = 10)
    public static final void method688(int arg0, boolean arg1) {
        class475.field7104 = 100;
        class443.field6619 = 3;
        field1541++;
        class528.field7794 = arg0;
        if (!arg1) {
            class115.field1909 = -1;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZILbu;)Let;", line = 25)
    public static final class419 method689(int arg0, boolean arg1, int arg2, class17 arg3) {
        field1537++;
        class145 var4 = new class145(arg3.method114(arg0, arg2, 124));
        class419 var5 = new class419(arg0, var4.method1101((byte) -71), var4.method1101((byte) -109), var4.method1070(-32387), var4.method1070(-32387), var4.method1063((byte) 103) == 1, var4.method1063((byte) 125), var4.method1063((byte) 120));
        int var6 = var4.method1063((byte) -15);
        if (!arg1) {
            field1543 = null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field6257.method2417(100, new class197(var4.method1063((byte) -22), var4.method1069((byte) -56), var4.method1069((byte) -18), var4.method1069((byte) -116), var4.method1069((byte) -108), var4.method1069((byte) -103), var4.method1069((byte) -106), var4.method1069((byte) -85), var4.method1069((byte) -73)));
        }
        var5.method2533(12800);
        return var5;
    }

    @OriginalMember(owner = "client!wf", name = "finalize", descriptor = "()V", line = 52)
    protected final void finalize() throws Throwable {
        field1540++;
        this.field1542.method1972(2, this.field1539);
        super.finalize();
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([Ljava/lang/Object;[JIII)V", line = 61)
    public static final void method690(Object[] arg0, long[] arg1, int arg2, int arg3, int arg4) {
        if (arg2 < arg3) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg2;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg2; var11 < arg3; var11++) {
                if (((long) (var11 & var10) + var7) > arg1[var11]) {
                    long var12 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6] = var12;
                    Object var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var9;
            method690(arg0, arg1, arg2, var6 - 1, 1);
            method690(arg0, arg1, var6 + 1, arg3, 1);
        }
        field1544++;
        if (arg4 != 1) {
            method689(-1, false, 90, null);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V", line = 118)
    public static void method691(boolean arg0) {
        field1546 = null;
        if (!arg0) {
            method693(19, 93, null, null);
        }
        field1536 = null;
        field1543 = null;
        field1545 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IJ)V", line = 132)
    public static final void method692(int arg0, long arg1) {
        if (class380.field5761 != null) {
            if (class85.field1473 == 1 || class85.field1473 == 5) {
                class378.method2352(-555, arg1);
            } else if (class85.field1473 == 4) {
                class209.method1414(-12619, arg1);
            }
        }
        field1538++;
        class49.method457(class4.field109, (long) class531.field7821, 17);
        if (class364.field5513 != -1) {
            class110.method820(class364.field5513, -18046);
        }
        for (int var3 = 0; var3 < class100.field1650; var3++) {
            if (class355.field5424[var3]) {
                class467.field6966[var3] = true;
            }
            class115.field1908[var3] = class355.field5424[var3];
            class355.field5424[var3] = false;
        }
        class511.field7541 = class531.field7821;
        if (class4.field109.method224()) {
            class348.field5198 = true;
        }
        if (class364.field5513 != -1) {
            class100.field1650 = 0;
            class297.method1881((byte) 114);
        }
        class4.field109.method258();
        class391.method2414(false, class4.field109);
        if (arg0 >= -7) {
            method693(-94, -23, null, null);
        }
        int var4 = class328.method2104((byte) -22);
        if (var4 == -1) {
            var4 = class245.field3518;
        }
        if (var4 == -1) {
            var4 = class97.field1621;
        }
        class333.method2139(var4, (byte) -44);
        class41.method411(class139.field2224.field6232, 3, class514.field7564, class139.field2224.field6228, class139.field2224.field6233);
        class514.field7564 = 0;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILvj;Ljava/lang/String;)Lhq;", line = 201)
    public static final class108 method693(int arg0, int arg1, class303 arg2, String arg3) {
        field1535++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        if (arg0 != 1) {
            field1543 = null;
        }
        OpenGL.glShaderSourceARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class72.field1244, 0);
        if (class72.field1244[0] == 0) {
            if (class72.field1244[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class72.field1244, 1);
            if (class72.field1244[1] > 1) {
                byte[] var6 = new byte[class72.field1244[1]];
                OpenGL.glGetInfoLogARB(var4, class72.field1244[1], class72.field1244, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class72.field1244[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class108(arg2, var4, arg1);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lvj;J[Lhq;)V", line = 244)
    public class88(class303 arg0, long arg1, class108[] arg2) {
        this.field1542 = arg0;
        this.field1539 = arg1;
    }
}
