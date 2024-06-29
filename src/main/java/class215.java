import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class215 {

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Ljv;")
    private class55 field3098 = new class55(64);

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "Ljv;")
    public class55 field3105 = new class55(2);

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Lbu;")
    private class17 field3103;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Lbu;")
    public class17 field3094;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3097 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZ)Lii;", line = 3)
    public final class386 method1432(int arg0, boolean arg1) {
        if (!arg1) {
            this.method1436((byte) -106);
        }
        field3095++;
        class55 var3 = this.field3098;
        class386 var4;
        synchronized (this.field3098) {
            var4 = (class386) this.field3098.method494(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3103.method114(arg0, 33, -110);
        class386 var6 = new class386();
        var6.field5814 = this;
        if (var5 != null) {
            var6.method2393(-1, new class145(var5));
        }
        class55 var7 = this.field3098;
        synchronized (this.field3098) {
            this.field3098.method485((long) arg0, (byte) -125, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 33)
    public final void method1433(int arg0) {
        class55 var2 = this.field3098;
        synchronized (this.field3098) {
            this.field3098.method484(-106);
        }
        if (arg0 != 33) {
            this.field3094 = null;
        }
        field3092++;
        class55 var3 = this.field3105;
        synchronized (this.field3105) {
            this.field3105.method484(109);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V", line = 57)
    public static final void method1434(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3096++;
        if (class443.field6623.field630 != 0 && arg3 != 0 && class148.field2361 < 50 && arg2 != -1) {
            class245.field3527[class148.field2361++] = new class150((byte) 1, arg2, arg3, arg0, arg1, 0);
        }
        if (arg4 != 2) {
            method1437((byte) -27);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V", line = 76)
    public final void method1435(int arg0, int arg1) {
        class55 var3 = this.field3098;
        synchronized (this.field3098) {
            this.field3098.method493(false, arg0);
        }
        field3101++;
        class55 var4 = this.field3105;
        synchronized (this.field3105) {
            this.field3105.method493(false, arg0);
        }
        if (arg1 != 0) {
            method1437((byte) -47);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 94)
    public final void method1436(byte arg0) {
        class55 var2 = this.field3098;
        synchronized (this.field3098) {
            this.field3098.method488(-3);
        }
        int var3 = -86 / ((60 - arg0) / 55);
        field3099++;
        class55 var4 = this.field3105;
        synchronized (this.field3105) {
            this.field3105.method488(-3);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V", line = 111)
    public static void method1437(byte arg0) {
        if (arg0 != -1) {
            method1434(127, -71, 90, -32, -96);
        }
        field3097 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lgi;FIFIFIFIFIB[B)V", line = 123)
    public static final void method1438(class477 arg0, float arg1, int arg2, float arg3, int arg4, float arg5, int arg6, float arg7, int arg8, float arg9, int arg10, byte arg11, byte[] arg12) {
        if (arg11 != 113) {
            method1437((byte) -93);
        }
        for (int var13 = 0; var13 < arg4; var13++) {
            class71.method580(var13, arg9, arg5, -32, arg8, arg10, arg0, arg3, arg4, arg6, arg7, arg12, arg2, arg1);
            arg2 += arg6 * arg8;
        }
        field3102++;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Loq;ILbu;Lbu;)V", line = 152)
    public class215(class239 arg0, int arg1, class17 arg2, class17 arg3) {
        this.field3103 = arg2;
        this.field3094 = arg3;
        this.field3103.method119(29630, 33);
    }
}
