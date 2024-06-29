import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class128 extends class69 {

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "[J")
    private long[] field2982 = new long[10];

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "Lkc;")
    private static class67 field2986 = class19.method144("Loading textures )2 ", 124);

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "Lkc;")
    public static class67 field2991 = field2986;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "Lkc;")
    public static class67 field2990 = class19.method144("Fehler bei der Verbindung zum Server)3", 91);

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "Lbb;")
    public static class10 field2987 = new class10();

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "Lkc;")
    private static class67 field2997 = class19.method144("Please reload this page)3", 107);

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "Lkc;")
    public static class67 field2998 = class19.method144("Versteckt", 101);

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "I")
    public static int field3004 = 500;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "Lkc;")
    private static class67 field3001 = class19.method144("shake:", 106);

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "I")
    public static int field3005 = 0;

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "Lkc;")
    public static class67 field3006 = class19.method144("null", 77);

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "[I")
    public static int[] field2999 = new int[200];

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "I")
    public static int field3003 = 0;

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "Lkc;")
    public static class67 field3002 = class19.method144("m", 112);

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "Lkc;")
    public static class67 field3000 = field2997;

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "Lkc;")
    public static class67 field3007 = field3001;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    private int field2983;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    private int field2994;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    private int field2995;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    private int field2996;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "J")
    private long field2993;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 11)
    public final void method432(byte arg0) {
        this.field2996 = 0;
        this.field2995 = 256;
        field2988++;
        this.field2994 = 1;
        this.field2993 = class82.method644(0);
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2982[var2] = this.field2993;
        }
        int var3 = -86 / ((-arg0 - 32) / 56);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 41)
    public static final void method991(Component arg0, boolean arg1) {
        field2989++;
        Method var2 = class15.field327;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class94.field2156);
        arg0.addFocusListener(class94.field2156);
        if (arg1) {
            method991(null, false);
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V", line = 67)
    public static void method992(byte arg0) {
        field3007 = null;
        field3006 = null;
        field3001 = null;
        field2991 = null;
        field2998 = null;
        field2997 = null;
        field2999 = null;
        int var1 = 76 / ((arg0 - 37) / 63);
        field3002 = null;
        field2986 = null;
        field2987 = null;
        field2990 = null;
        field3000 = null;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V", line = 122)
    public class128() {
        this.method432((byte) 47);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V", line = 100)
    public final void method430(int arg0) {
        field2984++;
        if (arg0 == 2) {
            for (int var2 = 0; var2 < 10; var2++) {
                this.field2982[var2] = 0L;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)I", line = 137)
    public final int method431(int arg0, int arg1, int arg2) {
        int var4 = this.field2994;
        this.field2994 = 1;
        field2992++;
        int var5 = this.field2995;
        this.field2995 = 300;
        this.field2993 = class82.method644(arg0 + 271);
        if (this.field2982[this.field2983] == 0L) {
            this.field2995 = var5;
            this.field2994 = var4;
        } else if (this.field2993 > this.field2982[this.field2983]) {
            this.field2995 = (int) ((long) (arg1 * 2560) / (this.field2993 - this.field2982[this.field2983]));
        }
        if (this.field2995 < 25) {
            this.field2995 = 25;
        }
        if (this.field2995 > 256) {
            this.field2995 = 256;
            this.field2994 = (int) ((long) arg1 - (this.field2993 - this.field2982[this.field2983]) / 10L);
        }
        if (this.field2994 > arg1) {
            this.field2994 = arg1;
        }
        this.field2982[this.field2983] = this.field2993;
        this.field2983 = (this.field2983 + 1) % 10;
        if (this.field2994 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2982[var6] != 0L) {
                    this.field2982[var6] += this.field2994;
                }
            }
        }
        if (arg0 != -271) {
            this.field2995 = -81;
        }
        int var7 = 0;
        if (this.field2994 < arg2) {
            this.field2994 = arg2;
        }
        class84.method653((long) this.field2994, (byte) 124);
        while (this.field2996 < 256) {
            this.field2996 += this.field2995;
            var7++;
        }
        this.field2996 &= 0xFF;
        return var7;
    }
}
