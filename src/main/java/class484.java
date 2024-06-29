import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class484 extends class603 implements class209 {

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "[I")
    public static int[] field7090 = new int[32];

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field7095 = new String[5];

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "Lig;")
    public static class206 field7087 = new class206(38, 12);

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public static int field7092;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method652(boolean arg0, int arg1) {
        if (arg1 == 31983) {
            field7088++;
            return super.method652(arg0, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public final void method650(boolean arg0) {
        field7089++;
        super.method650(arg0);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2924(int arg0, String arg1) {
        field7094++;
        if (arg1 == null) {
            return -1;
        }
        if (arg0 > -101) {
            method2925(85);
        }
        for (int var2 = 0; var2 < class602.field8781; var2++) {
            if (arg1.equalsIgnoreCase(class37.field408[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lgf;Z)V")
    public class484(class234 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljaclib/memory/Source;III)Z")
    public final boolean method1070(Source arg0, int arg1, int arg2, int arg3) {
        super.method3502((byte) -45, arg0, arg3);
        int var5 = -72 % ((arg1 + 32) / 46);
        field7092++;
        return true;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
    public static void method2925(int arg0) {
        field7087 = null;
        field7090 = null;
        if (arg0 != 38) {
            field7090 = null;
        }
        field7095 = null;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)I")
    public final int method653(int arg0) {
        if (arg0 != 14173) {
            method2925(-93);
        }
        field7093++;
        return super.method653(14173);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)Z")
    public final boolean method1071(int arg0, int arg1, int arg2) {
        field7091++;
        super.method654(arg2, 9658);
        if (arg1 != -1249) {
            field7095 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)Z")
    public final boolean method651(int arg0) {
        field7086++;
        return arg0 == -15045 ? this.method651(-15045) : true;
    }
}
