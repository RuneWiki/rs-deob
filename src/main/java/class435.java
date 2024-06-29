import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class435 {

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public int field6392 = -1;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field6397 = 0;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Lke;")
    public static class162 field6390 = new class162();

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Ljava/lang/String;")
    public static String field6401 = "Choose Option";

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Lep;")
    public class145 field6391;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "Luq;")
    public static class233 field6400;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "[I")
    public int[] field6393;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "[Ljava/lang/String;")
    public String[] field6394;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2743(byte arg0) {
        int var1 = 126 / ((arg0 - 52) / 59);
        field6396++;
        class250.field3435.method1136((byte) -98);
        class420.field6213.method1136((byte) -84);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)V", line = 14)
    public static final void method2744(int arg0, byte arg1) {
        if (arg1 != 69) {
            method2746(-122, -128, -81, -81, 41, 92);
        }
        class240.field3217 = new class189(arg0);
        field6398++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V", line = 45)
    public static void method2745(boolean arg0) {
        if (!arg0) {
            field6400 = null;
        }
        field6400 = null;
        field6401 = null;
        field6390 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIII)Z", line = 57)
    public static final boolean method2746(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class246.field3324[arg0][var8][var14] == -class291.field4165) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class12.field205[arg0].method742(arg1, arg3) + arg5;
            if (!class225.method1300(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class225.method1300(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class225.method1300(var9, var11, var13)) {
                return false;
            } else if (class225.method1300(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class202.method1200(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class225.method1300(var6 + 1, class12.field205[arg0].method742(arg1, arg3) + arg5, var7 + 1) && class225.method1300(var6 + 128 - 1, class12.field205[arg0].method742(arg1 + 1, arg3) + arg5, var7 + 1) && class225.method1300(var6 + 128 - 1, class12.field205[arg0].method742(arg1 + 1, arg3 + 1) + arg5, var7 + 128 - 1) && class225.method1300(var6 + 1, class12.field205[arg0].method742(arg1, arg3 + 1) + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Llm;IIIIZI)V", line = 117)
    public static final void method2747(class347 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class178.field2358 = arg5;
        class129.field1785 = arg0;
        field6389++;
        class159.field2146 = arg4;
        class375.field5452 = arg1;
        class9.field151 = arg2;
        class159.field2147 = arg3;
        class57.field782 = arg6;
    }
}
