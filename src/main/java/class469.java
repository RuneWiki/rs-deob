import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class469 {

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Laj;")
    private class287 field6632 = new class287(64);

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Laj;")
    public class287 field6644 = new class287(64);

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Lom;")
    public class344 field6639;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Lom;")
    private class344 field6630;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field6631 = 0;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field6641 = 0;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "F")
    public static float field6640;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BII)V")
    public final void method2797(byte arg0, int arg1, int arg2) {
        field6634++;
        this.field6632 = new class287(arg1);
        this.field6644 = new class287(arg2);
        if (arg0 < 67) {
            this.method2799(63);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILus;Ljava/lang/String;I)Ljfa;")
    public static final class264 method2798(int arg0, class1 arg1, String arg2, int arg3) {
        field6643++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceARB(var4, arg2);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class350.field5265, arg3);
        if (class350.field5265[0] == 0) {
            if (class350.field5265[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class350.field5265, 1);
            if (class350.field5265[1] > 1) {
                byte[] var6 = new byte[class350.field5265[1]];
                OpenGL.glGetInfoLogARB(var4, class350.field5265[1], class350.field5265, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class350.field5265[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class264(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public final void method2799(int arg0) {
        field6637++;
        class287 var2 = this.field6632;
        synchronized (this.field6632) {
            this.field6632.method1912(arg0 - 2552);
        }
        class287 var3 = this.field6644;
        synchronized (this.field6644) {
            this.field6644.method1912(-2552);
            if (arg0 != 0) {
                this.field6639 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public final void method2800(byte arg0) {
        class287 var2 = this.field6632;
        synchronized (this.field6632) {
            this.field6632.method1913(true);
        }
        field6642++;
        class287 var3 = this.field6644;
        synchronized (this.field6644) {
            this.field6644.method1913(true);
            if (arg0 >= -20) {
                this.method2800((byte) -120);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILqh;)V")
    public static final void method2801(int arg0, class61 arg1) {
        field6636++;
        int var2 = arg1.method752(-27278);
        class339.field5054 = new class96[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class339.field5054[var3] = new class96();
            class339.field5054[var3].field1710 = arg1.method752(-27278);
            class339.field5054[var3].field1712 = arg1.method739(arg0 ^ 0xC2);
        }
        if (arg0 != -196) {
            field6641 = -64;
        }
        class290.field4367 = arg1.method752(arg0 - 27082);
        class527.field7434 = arg1.method752(-27278);
        class673.field9581 = arg1.method752(-27278);
        class105.field1847 = new class135[class527.field7434 + 1 - class290.field4367];
        for (int var4 = 0; var4 < class673.field9581; var4++) {
            int var5 = arg1.method752(arg0 ^ 0x6A4E);
            class135 var6 = class105.field1847[var5] = new class135();
            var6.field6006 = arg1.method732(-559537960);
            var6.field6007 = arg1.method730(-63);
            var6.field2395 = var5 + class290.field4367;
            var6.field2396 = arg1.method739(-2);
            var6.field2399 = arg1.method739(-2);
        }
        class559.field7904 = arg1.method730(-107);
        class625.field9026 = true;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)V")
    public final void method2802(int arg0, byte arg1) {
        class287 var3 = this.field6632;
        synchronized (this.field6632) {
            this.field6632.method1908(arg0, (byte) -11);
            if (arg1 != -33) {
                this.method2800((byte) -96);
            }
        }
        field6635++;
        class287 var4 = this.field6644;
        synchronized (this.field6644) {
            this.field6644.method1908(arg0, (byte) -11);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)Lge;")
    public final class661 method2803(int arg0, int arg1) {
        field6633++;
        if (arg1 != -28997) {
            return null;
        }
        class287 var3 = this.field6632;
        class661 var4;
        synchronized (this.field6632) {
            var4 = (class661) this.field6632.method1900((long) arg0, 66);
        }
        if (var4 != null) {
            return var4;
        }
        class344 var5 = this.field6630;
        byte[] var6;
        synchronized (this.field6630) {
            var6 = this.field6630.method2216(34, arg0, true);
        }
        class661 var7 = new class661();
        var7.field9527 = this;
        if (var6 != null) {
            var7.method3766(new class61(var6), 0);
        }
        class287 var8 = this.field6632;
        synchronized (this.field6632) {
            this.field6632.method1904(var7, (long) arg0, -1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
    public static final void method2804(boolean arg0) throws IOException {
        field6638++;
        if (!arg0 || class165.field2755 == null || class42.field1083 <= 0) {
            return;
        }
        int var1 = 0;
        while (true) {
            class275 var2 = (class275) class604.field8753.method1224(-2);
            if (var2 == null) {
                class6.field500 = 0;
                class374.field5569 += var1;
                return;
            }
            class165.field2755.method485(0, var2.field4104, var2.field4103.field1397, (byte) -107);
            class42.field1083 -= var2.field4104;
            var1 += var2.field4104;
            var2.method2588(300);
            var2.field4103.method697(1556604328);
            var2.method1795(-9937);
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lmea;ILom;Lom;)V")
    public class469(class398 arg0, int arg1, class344 arg2, class344 arg3) {
        this.field6639 = arg3;
        this.field6630 = arg2;
        this.field6630.method2236(34, 0);
    }
}
