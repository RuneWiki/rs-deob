import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class73 {

    @OriginalMember(owner = "client!kca", name = "i", descriptor = "I")
    private int field786;

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "I")
    public static int field785 = 0;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "Lkea;")
    public static class203 field780;

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "Ljava/lang/String;")
    public static String field782;

    @OriginalMember(owner = "client!kca", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field781++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(IIIII)V")
    public static final void method485(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field783++;
        int var5 = arg4;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        int var9 = class132.method818((byte) -93, arg0 + arg3, class113.field1385, class4.field43);
        int var10 = class132.method818((byte) -93, arg3 - arg0, class113.field1385, class4.field43);
        class645.method3675(125, class402.field6087[arg2], arg1, var10, var9);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg2 - var6;
                int var12 = arg2 + var6;
                if (var12 >= class418.field6298 && class461.field6877 >= var11) {
                    int var13 = class132.method818((byte) -93, arg3 + var5, class113.field1385, class4.field43);
                    int var14 = class132.method818((byte) -93, arg3 - var5, class113.field1385, class4.field43);
                    if (class461.field6877 >= var12) {
                        class645.method3675(112, class402.field6087[var12], arg1, var14, var13);
                    }
                    if (var11 >= class418.field6298) {
                        class645.method3675(89, class402.field6087[var11], arg1, var14, var13);
                    }
                }
            }
            var5++;
            int var15 = arg2 - var5;
            int var16 = arg2 + var5;
            if (var16 >= class418.field6298 && class461.field6877 >= var15) {
                int var17 = class132.method818((byte) -93, arg3 + var6, class113.field1385, class4.field43);
                int var18 = class132.method818((byte) -93, arg3 - var6, class113.field1385, class4.field43);
                if (var16 <= class461.field6877) {
                    class645.method3675(112, class402.field6087[var16], arg1, var18, var17);
                }
                if (var15 >= class418.field6298) {
                    class645.method3675(arg4 ^ 0x5B, class402.field6087[var15], arg1, var18, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
    public static final void method486(String arg0, boolean arg1, byte arg2) {
        field778++;
        if (arg0 == null) {
            return;
        }
        if (class245.field3464 >= 100) {
            class163.method945(true, class428.field6357.method2902(class35.field396, -20139), 4);
            return;
        }
        String var3 = class207.method1323(32682, arg0);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class245.field3464; var4++) {
            String var8 = class207.method1323(32682, class601.field8772[var4]);
            if (var8 != null && var8.equals(var3)) {
                class163.method945(true, arg0 + class575.field8297.method2902(class35.field396, -20139), 4);
                return;
            }
            if (class446.field6667[var4] != null) {
                String var9 = class207.method1323(32682, class446.field6667[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class163.method945(true, arg0 + class575.field8297.method2902(class35.field396, -20139), 4);
                    return;
                }
            }
        }
        if (arg2 <= 38) {
            method488(57);
        }
        for (int var5 = 0; var5 < class602.field8781; var5++) {
            String var6 = class207.method1323(32682, class37.field408[var5]);
            if (var6 != null && var6.equals(var3)) {
                class163.method945(true, class53.field595.method2902(class35.field396, -20139) + arg0 + class322.field4659.method2902(class35.field396, -20139), 4);
                return;
            }
            if (class546.field7812[var5] != null) {
                String var7 = class207.method1323(32682, class546.field7812[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class163.method945(true, class53.field595.method2902(class35.field396, -20139) + arg0 + class322.field4659.method2902(class35.field396, -20139), 4);
                    return;
                }
            }
        }
        if (class207.method1323(32682, class439.field6548.field9452).equals(var3)) {
            class163.method945(true, class646.field9358.method2902(class35.field396, -20139), 4);
            return;
        }
        class308.method2044(class477.field7036, -7434);
        class278.field3881++;
        class468.field6960.method1205((byte) -69, class456.method2816(-86, arg0) + 1);
        class468.field6960.method1237(1049279824, arg0);
        class468.field6960.method1205((byte) -69, arg1 ? 1 : 0);
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)I")
    public final int method487(byte arg0) {
        field784++;
        if (arg0 < 21) {
            this.toString();
        }
        return this.field786;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V")
    public static void method488(int arg0) {
        if (arg0 != -1975151103) {
            method488(-24);
        }
        field782 = null;
        field780 = null;
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(II)V")
    public class73(int arg0, int arg1) {
        this.field786 = arg0;
    }
}
