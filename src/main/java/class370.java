import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class370 extends class393 {

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public int field5494 = -1;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    public int field5502 = 0;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "Ljava/lang/String;")
    public static String field5496 = "Loading...";

    @OriginalMember(owner = "client!al", name = "x", descriptor = "I")
    public static int field5501 = 10;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "Lmi;")
    public static class408 field5503 = new class408();

    @OriginalMember(owner = "client!al", name = "E", descriptor = "Lvg;")
    public static class108 field5508 = new class108(5000);

    @OriginalMember(owner = "client!al", name = "G", descriptor = "Z")
    public static boolean field5510 = false;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public int field5490;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public int field5491;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public int field5492;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public int field5493;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public int field5497;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public int field5498;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "I")
    public int field5500;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "I")
    public int field5505;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "I")
    public int field5506;

    @OriginalMember(owner = "client!al", name = "D", descriptor = "I")
    public int field5507;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!al", name = "H", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "[I")
    public static int[] field5512;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method2437(int arg0, Component arg1) {
        field5499++;
        if (arg0 <= 51) {
            method2439(-115);
        }
        Method var2 = class2.field33;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class310.field4436);
        arg1.addFocusListener(class310.field4436);
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
    public static final void method2438(int arg0) {
        field5509++;
        if (arg0 == -1 && class126.field1672 != null) {
            class152 var1 = class126.field1672;
            synchronized (class126.field1672) {
                class126.field1672 = null;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V")
    public static void method2439(int arg0) {
        field5512 = null;
        if (arg0 == 10) {
            field5496 = null;
            field5508 = null;
            field5503 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I[IIII)V")
    public static final void method2440(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field5495++;
        if (arg4 < 55) {
            return;
        }
        arg3--;
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        while (var5 > arg3) {
            int var7 = arg3 + 1;
            arg1[var7] = arg2;
            int var8 = var7 + 1;
            arg1[var8] = arg2;
            int var9 = var8 + 1;
            arg1[var9] = arg2;
            int var10 = var9 + 1;
            arg1[var10] = arg2;
            int var11 = var10 + 1;
            arg1[var11] = arg2;
            int var12 = var11 + 1;
            arg1[var12] = arg2;
            int var13 = var12 + 1;
            arg1[var13] = arg2;
            arg3 = var13 + 1;
            arg1[arg3] = arg2;
        }
        while (arg3 < var6) {
            arg3++;
            arg1[arg3] = arg2;
        }
    }
}
