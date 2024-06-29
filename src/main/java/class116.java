import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class116 {

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Lkh;")
    public class172 field1947 = new class172();

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field1941 = -1;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field1945 = 500;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field1950 = 0;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1948 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "Lta;")
    public static class300 field1949 = new class300(64);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "Lkh;")
    private class172 field1952;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 5)
    public static final void method908(int arg0, Component arg1) {
        arg1.addMouseListener(class4.field38);
        arg1.addMouseMotionListener(class4.field38);
        arg1.addFocusListener(class4.field38);
        field1946++;
        if (arg0 != 64) {
            method908(26, (Component) null);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Lkh;", line = 20)
    public final class172 method909(int arg0) {
        class172 var2 = this.field1952;
        field1951++;
        if (this.field1947 == var2) {
            this.field1952 = null;
            return null;
        }
        this.field1952 = var2.field2746;
        if (arg0 > -93) {
            this.method912(false);
        }
        return var2;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)I", line = 55)
    public final int method910(byte arg0) {
        int var2 = 13 % ((arg0 - 29) / 39);
        class172 var3 = this.field1947.field2746;
        field1942++;
        int var4 = 0;
        while (this.field1947 != var3) {
            var3 = var3.field2746;
            var4++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILkh;)V", line = 75)
    public final void method911(int arg0, class172 arg1) {
        if (arg1.field2749 != null) {
            arg1.method1352(-82);
        }
        arg1.field2749 = this.field1947.field2749;
        arg1.field2746 = this.field1947;
        if (arg0 == 500) {
            arg1.field2749.field2746 = arg1;
            field1940++;
            arg1.field2746.field2749 = arg1;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)Lkh;", line = 98)
    public final class172 method912(boolean arg0) {
        field1939++;
        if (arg0) {
            this.method910((byte) -77);
        }
        class172 var2 = this.field1947.field2746;
        if (this.field1947 == var2) {
            this.field1952 = null;
            return null;
        } else {
            this.field1952 = var2.field2746;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V", line = 196)
    public class116() {
        this.field1947.field2746 = this.field1947;
        this.field1947.field2749 = this.field1947;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V", line = 138)
    public static void method913(int arg0) {
        field1948 = null;
        if (arg0 != 13925) {
            field1938 = -109;
        }
        field1949 = null;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)Lkh;", line = 149)
    public final class172 method914(int arg0) {
        if (arg0 != -20217) {
            return (class172) null;
        }
        field1943++;
        class172 var2 = this.field1947.field2746;
        if (this.field1947 == var2) {
            return null;
        } else {
            var2.method1352(-82);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V", line = 167)
    public final void method915(byte arg0) {
        int var2 = 117 / ((-arg0 - 8) / 59);
        while (true) {
            class172 var3 = this.field1947.field2746;
            if (this.field1947 == var3) {
                this.field1952 = null;
                field1944++;
                return;
            }
            var3.method1352(-15);
        }
    }
}
