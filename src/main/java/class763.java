import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public class class763 {

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "I")
    public static int field10473;

    @OriginalMember(owner = "client!eja", name = "b", descriptor = "I")
    public static int field10474;

    @OriginalMember(owner = "client!eja", name = "c", descriptor = "I")
    public static int field10475;

    @OriginalMember(owner = "client!eja", name = "d", descriptor = "I")
    public static int field10476;

    @OriginalMember(owner = "client!eja", name = "e", descriptor = "I")
    public static int field10477;

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(IBLha;)V", line = 3)
    public static final void method4203(int arg0, byte arg1, class66 arg2) {
        field10473++;
        if (!class14.field144 || !class717.field9767) {
            class346.field4859 = 0;
            return;
        }
        if (class215.field2820) {
            class490.field6825 = class56.field683.method108(-2);
        }
        class723.field9819 = 0;
        class271.field3953 = 0;
        class479.field6729 = 0;
        int[] var3 = arg2.method532();
        class709.field9700 = (int) ((float) var3[2] / 3.0F);
        class324.field4597 = (int) ((float) var3[3] / 3.0F);
        arg2.method447(client.field4512);
        if ((int) ((float) client.field4512[0] / 3.0F) != class151.field2054 || (int) ((float) client.field4512[1] / 3.0F) != class493.field6934) {
            class493.field6934 = (int) ((float) client.field4512[1] / 3.0F);
            class151.field2054 = (int) ((float) client.field4512[0] / 3.0F);
            class163.field2168 = class151.field2054 >> 1;
            class99.field1448 = new int[class493.field6934 * class151.field2054];
            class497.field6979 = class493.field6934 >> 1;
        }
        class227.field2929 = arg2.method444();
        class346.field4859 = 0;
        int var4 = 0;
        if (arg1 < 93) {
            return;
        }
        while (class586.field7974 > var4) {
            class267.method1786((byte) -46, arg0, arg2, class175.field2318[var4]);
            var4++;
        }
        for (int var5 = 0; var5 < class583.field7922; var5++) {
            class267.method1786((byte) -46, arg0, arg2, class139.field1881[var5]);
        }
        for (int var6 = 0; var6 < class282.field4079; var6++) {
            class267.method1786((byte) -46, arg0, arg2, class135.field1833[var6]);
        }
        class267.field3915 = 0;
        if (class346.field4859 > 0) {
            int var7 = class99.field1448.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var9 < var8) {
                class99.field1448[var9++] = Integer.MAX_VALUE;
                class99.field1448[var9++] = Integer.MAX_VALUE;
                class99.field1448[var9++] = Integer.MAX_VALUE;
                class99.field1448[var9++] = Integer.MAX_VALUE;
                class99.field1448[var9++] = Integer.MAX_VALUE;
                class99.field1448[var9++] = Integer.MAX_VALUE;
                class99.field1448[var9++] = Integer.MAX_VALUE;
                class99.field1448[var9++] = Integer.MAX_VALUE;
            }
            while (var9 < var7) {
                class99.field1448[var9++] = Integer.MAX_VALUE;
            }
            class682.field9115 = 1;
            for (int var10 = 0; var10 < class346.field4859; var10++) {
                class378 var11 = class561.field7690[var10];
                class357.method2263(var11.field5519[1], var11.field5519[3], var11.field5525[1], var11.field5514[0], var11.field5514[1], var11.field5514[3], var11.field5519[0], -5630, var11.field5525[3], var11.field5525[0]);
                class357.method2263(var11.field5519[2], var11.field5519[3], var11.field5525[2], var11.field5514[1], var11.field5514[2], var11.field5514[3], var11.field5519[1], -5630, var11.field5525[3], var11.field5525[1]);
            }
            class682.field9115 = 2;
        }
        if (class215.field2820) {
            class338.field4738 = class56.field683.method108(-2) - class490.field6825;
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(IILofa;Z)V", line = 109)
    public static final void method4204(int arg0, int arg1, class347 arg2, boolean arg3) {
        field10474++;
        class512 var4 = arg2.method2214((byte) 56, class375.field5490);
        if (var4 == null) {
            return;
        }
        class375.field5490.method453(arg0, arg1, arg2.field4986 + arg0, arg1 - -arg2.field4940);
        if (!arg3) {
            method4205(null, 57);
        }
        if (class8.field70 >= 3) {
            class375.field5490.method449(-16777216, var4, arg0, arg1);
        } else {
            class348.field5050.method975((float) arg2.field4986 / 2.0F + (float) arg0, (float) arg2.field4940 / 2.0F + (float) arg1, 4096, (int) (-class514.field7144) & 0x3FFF << 2, var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(Ljs;I)Z", line = 139)
    public static final boolean method4205(class349 arg0, int arg1) {
        field10476++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field5068) {
            return false;
        } else if (!arg0.method2228(arg1 ^ 0x7C, class752.field10155)) {
            return false;
        } else if (class9.field77.method1248(120, (long) arg0.field5083) != null) {
            return false;
        } else if (class291.field4153.method1248(101, (long) arg0.field5098) == null) {
            return arg1 == 1 ? true : true;
        } else {
            return false;
        }
    }
}
