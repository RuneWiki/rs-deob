import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class177 extends class623 {

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "Ljava/lang/String;")
    public String field2080;

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "Lsc;")
    public class347 field2081;

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "Ldh;")
    public static class320 field2077 = new class320(57, -2);

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
    public int field2078;

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "Loh;")
    public static class404 field2084;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ei", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field2085;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILjava/awt/Component;Z)Leda;")
    public static final class100 method1088(int arg0, Component arg1, boolean arg2) {
        field2075++;
        try {
            Constructor var3 = Class.forName("nl").getDeclaredConstructor(field2085 == null ? (field2085 = class623.method3566("java.awt.Component")) : field2085, Boolean.TYPE);
            int var4 = -103 % ((arg0 + 66) / 58);
            return (class100) var3.newInstance(arg1, Boolean.valueOf(arg2));
        } catch (Throwable var5) {
            return new class479(arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILfh;)Z")
    public final boolean method1089(int arg0, class649 arg1) {
        field2079++;
        int var3 = this.method1094(true);
        if (arg0 < 31) {
            return true;
        }
        arg1.method3562((byte) -76);
        this.field2078--;
        if (this.field2078 != 0) {
            return var3 != this.method1094(true);
        }
        this.method864(12983);
        this.method3562((byte) -91);
        class736.field10289--;
        class511.field7291.method3537(70, arg1.field9266, this);
        return false;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(ILfh;)Z")
    public final boolean method1090(int arg0, class649 arg1) {
        field2076++;
        boolean var3 = true;
        arg1.method3562((byte) -93);
        if (arg0 != 0) {
            field2077 = null;
        }
        for (class649 var4 = (class649) this.field2081.method2067(arg0 + 22462); var4 != null; var4 = (class649) this.field2081.method2066(0)) {
            if (class398.method2438(var4.field9270, false, arg1.field9270)) {
                class181.method1124(arg1, var4, arg0 - 107);
                this.field2078++;
                if (var3) {
                    return false;
                }
                return true;
            }
            var3 = false;
        }
        this.field2081.method2068(arg0 ^ 0xFFFFFF80, arg1);
        this.field2078++;
        return var3;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)V")
    public static final void method1091(byte arg0) {
        field2082++;
        class654.field9334.method3924(true, class654.field9334.field9870, 1);
        if (arg0 <= 88) {
            return;
        }
        class654.field9334.method3924(true, class654.field9334.field9858, 1);
        class654.field9334.method3924(true, class654.field9334.field9833, 1);
        class654.field9334.method3924(true, class654.field9334.field9834, 1);
        class654.field9334.method3924(true, class654.field9334.field9855, 1);
        class654.field9334.method3924(true, class654.field9334.field9845, 1);
        class654.field9334.method3924(true, class654.field9334.field9878, 0);
        class654.field9334.method3924(true, class654.field9334.field9847, 0);
        class654.field9334.method3924(true, class654.field9334.field9869, 0);
        class654.field9334.method3924(true, class654.field9334.field9856, 0);
        class654.field9334.method3924(true, class654.field9334.field9836, 0);
        class654.field9334.method3924(true, class654.field9334.field9844, 0);
        class654.field9334.method3924(true, class654.field9334.field9837, 0);
        class654.field9334.method3924(true, class654.field9334.field9848, 0);
        class654.field9334.method3924(true, class654.field9334.field9866, 0);
        class654.field9334.method3924(true, class654.field9334.field9852, 0);
        class654.field9334.method3924(true, class654.field9334.field9851, 0);
        class654.field9334.method3924(true, class654.field9334.field9863, 0);
        class654.field9334.method3924(true, class654.field9334.field9826, 0);
        class444.method2756(10441);
        class654.field9334.method3924(true, class654.field9334.field9849, 2);
        class654.field9334.method3924(true, class654.field9334.field9875, 2);
        class598.method3406((byte) -108);
        class341.method2026(9349);
        class698.field9825 = true;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method1092(int arg0) {
        field2077 = null;
        field2084 = null;
        if (arg0 != 0) {
            method1093();
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()V")
    public static final void method1093() {
        class36.field387 = class36.field383;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(Z)I")
    public final int method1094(boolean arg0) {
        if (!arg0) {
            method1088(41, null, false);
        }
        field2083++;
        return this.field2081.field4488.field8923 == this.field2081.field4488 ? -1 : ((class649) this.field2081.field4488.field8923).field9270;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class177(String arg0) {
        this.field2080 = arg0;
        this.field2081 = new class347();
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1095(String arg0, int arg1) {
        field2074++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class752.field10524; var2++) {
            if (arg0.equalsIgnoreCase(class19.field175[var2])) {
                return true;
            }
        }
        if (arg1 != -32705) {
            field2084 = null;
        }
        return arg0.equalsIgnoreCase(class90.field937.field2157);
    }
}
