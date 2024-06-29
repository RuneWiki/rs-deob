import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class127 extends class30 {

    @OriginalMember(owner = "client!wk", name = "B", descriptor = "Lgi;")
    public static class631 field1821 = new class631();

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "I")
    public static int field1823 = -1;

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "Z")
    public static boolean field1825 = false;

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BILac;)V", line = 4)
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (~arg1 == -1) {
            super.field378 = arg2.method2874((byte) -75) == 1;
        }
        if (arg0 <= 100) {
            field1825 = true;
        }
        ++field1819;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V", line = 18)
    public class127() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)[[I", line = 21)
    public final int[][] method30(int arg0, byte arg1) {
        ++field1822;
        if (arg1 != 7) {
            method909(15);
        }
        int[][] var3 = super.field377.method3683(arg0, (byte) 127);
        if (super.field377.field9085) {
            int[][] var4 = this.method292(124, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class31.field399; ++var11) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V", line = 70)
    public static final void method906(int arg0) {
        class373.field5026 = true;
        ++field1820;
        if (arg0 != 4096) {
            method908(115);
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(B)Z", line = 82)
    public static final boolean method907(byte arg0) {
        ++field1824;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class310.field4287.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class310.field4287.get(var3));
        }
        if (arg0 >= -37) {
            field1823 = -104;
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class310.field4287.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class206.field2875.get(var9);
                        Class var11 = (Class) class310.field4287.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; ~var13 > ~var12.size(); ++var13) {
                            try {
                                Object var14 = var12.elementAt(var13);
                                Field var15 = var14.getClass().getDeclaredField("name");
                                var7.invoke(var15, Boolean.TRUE);
                                try {
                                    String var16 = (String) var15.get(var14);
                                    if (var16 != null && var16.equalsIgnoreCase(var10.getCanonicalPath())) {
                                        Field var17 = var14.getClass().getDeclaredField("handle");
                                        Method var18 = var14.getClass().getDeclaredMethod("finalize");
                                        var7.invoke(var17, Boolean.TRUE);
                                        var7.invoke(var18, Boolean.TRUE);
                                        try {
                                            var18.invoke(var14);
                                            var17.set(var14, new Integer(0));
                                            var1.remove(var9);
                                        } catch (Throwable var19) {
                                        }
                                        var7.invoke(var18, Boolean.FALSE);
                                        var7.invoke(var17, Boolean.FALSE);
                                    }
                                } catch (Throwable var20) {
                                }
                                var7.invoke(var15, Boolean.FALSE);
                            } catch (Throwable var21) {
                            }
                        }
                    } catch (Throwable var22) {
                    }
                }
            } catch (Throwable var23) {
            }
            var7.invoke(var6, Boolean.FALSE);
        } catch (Throwable var24) {
        }
        class310.field4287 = var1;
        return class310.field4287.isEmpty();
    }

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "(I)V", line = 183)
    public static final void method908(int arg0) {
        ++field1826;
        class610.field8463.method131(class14.field151, !class366.field4875.field9348 ? -1 : class341.field4581 - -256 << 2, 0);
        if (arg0 != -1) {
            field1821 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)[I", line = 194)
    public final int[] method48(int arg0, int arg1) {
        ++field1827;
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (arg0 != 1) {
            this.method48(-124, -45);
        }
        if (super.field374.field9032) {
            int[] var4 = this.method294(arg1, 0, (byte) 115);
            for (int var5 = 0; var5 < class31.field399; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "(I)V", line = 231)
    public static void method909(int arg0) {
        field1821 = null;
        if (arg0 != 26663) {
            field1825 = true;
        }
    }
}
