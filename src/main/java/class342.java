import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class342 {

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Lwi;")
    private class330 field5274 = new class330(16);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Luu;")
    private class191 field5270;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field5272 = -2;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "Lok;")
    public static class170 field5278;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public final void method2208(byte arg0) {
        field5277++;
        if (arg0 >= 5) {
            class330 var2 = this.field5274;
            synchronized (this.field5274) {
                this.field5274.method2135(0);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lod;IIIII)Ler;")
    public final class69 method2209(class355 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5276++;
        if (arg4 <= 53) {
            return null;
        }
        class169[] var7 = null;
        class85 var8 = this.method2212(-81, arg5);
        if (var8.field1238 != null) {
            var7 = new class169[var8.field1238.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class506 var10 = arg0.method2279(true, var8.field1238[var9]);
                var7[var9] = new class169(var10.field7454, var10.field7450, var10.field7449, var10.field7445, var10.field7455, var10.field7447, var10.field7452, var10.field7446);
            }
        }
        return new class69(var8.field1243, var7, var8.field1239, arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static void method2210(int arg0) {
        field5278 = null;
        if (arg0 != 0) {
            field5272 = -77;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
    public final void method2211(int arg0, int arg1) {
        if (arg1 <= 101) {
            field5271 = 45;
        }
        class330 var3 = this.field5274;
        synchronized (this.field5274) {
            this.field5274.method2140(-121, arg0);
        }
        field5279++;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Liv;ILuu;)V")
    public class342(class65 arg0, int arg1, class191 arg2) {
        this.field5270 = arg2;
        this.field5270.method1290(false, 29);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)Lhh;")
    private final class85 method2212(int arg0, int arg1) {
        field5275++;
        if (arg0 >= -38) {
            return null;
        }
        class330 var3 = this.field5274;
        class85 var4;
        synchronized (this.field5274) {
            var4 = (class85) this.field5274.method2133((long) arg1, (byte) 121);
        }
        if (var4 != null) {
            return var4;
        }
        class191 var5 = this.field5270;
        byte[] var6;
        synchronized (this.field5270) {
            var6 = this.field5270.method1281(29, arg1, 69);
        }
        class85 var7 = new class85();
        if (var6 != null) {
            var7.method585((byte) 119, new class164(var6));
        }
        class330 var8 = this.field5274;
        synchronized (this.field5274) {
            this.field5274.method2131(var7, (long) arg1, false);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public final void method2213(int arg0) {
        if (arg0 <= 116) {
            this.method2212(-58, 124);
        }
        class330 var2 = this.field5274;
        synchronized (this.field5274) {
            this.field5274.method2127((byte) 7);
        }
        field5273++;
    }
}
