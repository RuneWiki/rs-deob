import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class22 {

    @OriginalMember(owner = "mapview!ka", name = "h", descriptor = "[I")
    private int[] field207;

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "Lu;")
    public static class38 field201 = class9.method45(-41, "Key");

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "Lu;")
    public static class38 field200 = class9.method45(-41, "Apothecary");

    @OriginalMember(owner = "mapview!ka", name = "i", descriptor = "Lu;")
    public static class38 field208 = class9.method45(-41, "Estate Agent");

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "Lu;")
    public static class38 field204 = class9.method45(-41, "Please wait)3)3)3 Rendering Map");

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "Lu;")
    public static class38 field205 = class9.method45(-41, "Mining Site");

    @OriginalMember(owner = "mapview!ka", name = "k", descriptor = "Lu;")
    public static class38 field210 = class9.method45(-41, "underlay)3dat");

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "Lu;")
    public static class38 field203 = class9.method45(-41, "Enter place name to find");

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "I")
    public static volatile int field202 = 0;

    @OriginalMember(owner = "mapview!ka", name = "g", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "mapview!ka", name = "j", descriptor = "Ls;")
    public static class35 field209;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(II)I", line = 8)
    public final int method100(int arg0, int arg1) {
        int var3 = this.field207.length - 2;
        int var4 = var3 & arg1 << 1;
        if (arg0 <= 122) {
            field206 = -63;
        }
        while (true) {
            int var5 = this.field207[var4];
            if (arg1 == var5) {
                return this.field207[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 40)
    public static final void method101(int arg0, Component arg1) {
        Method var2 = class6.field44;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class13.field126);
        arg1.addFocusListener(class13.field126);
        if (arg0 != 0) {
            field205 = null;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(Z)V", line = 81)
    public static final void method102(boolean arg0) {
        class9.field78 = null;
        class26.field333 = null;
        class11.field112 = null;
        class26.field326 = null;
        if (arg0) {
            method101(78, null);
        }
        class11.field109 = null;
        mapview.field249 = null;
    }

    @OriginalMember(owner = "mapview!ka", name = "<init>", descriptor = "([I)V", line = 115)
    public class22(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field207 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field207[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field207[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field207[var5 + var5] = arg0[var4];
            this.field207[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(B)V", line = 163)
    public static void method103(byte arg0) {
        field209 = null;
        if (arg0 > -116) {
            return;
        }
        field210 = null;
        field205 = null;
        field208 = null;
        field204 = null;
        field201 = null;
        field203 = null;
        field200 = null;
    }
}
