import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class342 {

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "Lgn;")
    public static class475 field4964 = new class475(29, -1);

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "Ltq;")
    public static class426 field4971 = new class426(6, 4);

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "Lwg;")
    public static class280 field4970;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fo", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field4972;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
    public static void method2068(int arg0) {
        field4971 = null;
        field4964 = null;
        if (arg0 == 1) {
            field4970 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)V")
    public static final void method2069(int arg0) {
        field4967++;
        class353 var1 = null;
        try {
            class439 var2 = class86.field1182.method343(14, "2");
            while (var2.field6417 == 0) {
                class322.method1935(true, 1L);
            }
            if (var2.field6417 == 1) {
                var1 = (class353) var2.field6416;
                byte[] var3 = new byte[(int) var1.method2142((byte) -17)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2139(var3, var3.length - var4, var4, (byte) 105);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class374.method2272(new class156(var3), (byte) 1);
            }
            if (arg0 != 5117) {
                method2069(-108);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2141(-108);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V")
    public static final void method2070(byte arg0) {
        field4969++;
        if (class435.field6375) {
            return;
        }
        class435.field6375 = true;
        int var1 = -23 / ((52 - arg0) / 62);
        class477.field6873 = true;
        if (class118.field1533.field6908) {
            class506.field7722 = ((int) class506.field7722 + 191 & 0xFFFFFF80);
        } else {
            class242.field3485 += (24.0F - class242.field3485) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;Lhe;BZ)Lq;")
    public static final class281 method2071(String arg0, class239 arg1, byte arg2, boolean arg3) {
        field4966++;
        int var4 = arg1.method1444(arg0, (byte) 27);
        if (var4 == -1) {
            return new class281(0);
        }
        if (arg2 != -22) {
            field4970 = null;
        }
        int[] var5 = arg1.method1454((byte) -91, var4);
        class281 var6 = new class281(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var6.field4014 > var7) {
                class156 var9 = new class156(arg1.method1470(4, var5[var8++], var4));
                int var10 = var9.method950(186);
                int var11 = var9.method993((byte) -53);
                int var12 = var9.method941((byte) 124);
                if (!arg3 && var12 == 1) {
                    var6.field4014--;
                } else {
                    var6.field4013[var7] = var10;
                    var6.field4016[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V")
    public static final void method2072(boolean arg0) {
        field4968++;
        if (class44.field670 == 2) {
            class315.field4620 = 96;
        } else {
            try {
                Method var1 = (field4972 == null ? (field4972 = method2073("java.lang.Runtime")) : field4972).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class315.field4620 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        if (!arg0) {
            field4964 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2073(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
