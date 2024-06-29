import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class439 {

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field6251 = 0;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Lqfa;")
    public static class98 field6252 = new class98(85, 5);

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public int field6253;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Ljava/lang/String;")
    public String field6248;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static final void method2650(int arg0) {
        field6255++;
        if (class215.field2831 == 5) {
            class215.field2831 = 6;
            if (arg0 != 0) {
                field6252 = null;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BILfp;I)Lqm;")
    public static final class143 method2651(byte arg0, int arg1, class323 arg2, int arg3) {
        field6254++;
        byte[] var4 = arg2.method2100(arg1, (byte) 112, arg3);
        if (arg0 >= -62) {
            field6252 = null;
        }
        return var4 == null ? null : new class143(var4);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public static final void method2652(int arg0) {
        class622.field8668 = arg0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method2653(String arg0, int arg1) {
        field6250++;
        if (arg1 >= -24) {
            field6252 = null;
        }
        return class197.field2615.containsKey(arg0);
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
    public static void method2654(int arg0) {
        if (arg0 > -7) {
            method2650(123);
        }
        field6252 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)Las;")
    public static final class151 method2655(int arg0, byte arg1) {
        int var2 = -97 / ((-arg1 - 36) / 37);
        field6249++;
        class151[] var3 = class243.method1555(false);
        for (int var4 = 0; var4 < var3.length; var4++) {
            if (var3[var4].field2144 == arg0) {
                return var3[var4];
            }
        }
        return null;
    }
}
