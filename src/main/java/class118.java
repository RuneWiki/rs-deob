import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class118 extends class182 {

    @OriginalMember(owner = "client!na", name = "E", descriptor = "I")
    public int field2197;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public int field2192;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "I")
    public static int field2194 = 1;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "[I")
    public static int[] field2200 = new int[50];

    @OriginalMember(owner = "client!na", name = "w", descriptor = "Lsg;")
    public static class169 field2189 = class165.method1060("oder ung-Ultiges Passwort)3", 1536);

    @OriginalMember(owner = "client!na", name = "F", descriptor = "Lsg;")
    private static class169 field2198 = class165.method1060(" from your friend list first)3", 1536);

    @OriginalMember(owner = "client!na", name = "v", descriptor = "Lsg;")
    public static class169 field2188 = class165.method1060(")1", 1536);

    @OriginalMember(owner = "client!na", name = "J", descriptor = "I")
    public static int field2202 = 0;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "Lsg;")
    public static class169 field2195 = class165.method1060("blinken1:", 1536);

    @OriginalMember(owner = "client!na", name = "x", descriptor = "Lsg;")
    public static class169 field2190 = field2198;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "[Z")
    public static boolean[] field2201 = new boolean[100];

    @OriginalMember(owner = "client!na", name = "K", descriptor = "Lsg;")
    public static class169 field2203 = class165.method1060("Die Verbindung konnte", 1536);

    @OriginalMember(owner = "client!na", name = "L", descriptor = "Lsg;")
    public static class169 field2204 = class165.method1060("::gc", 1536);

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIZII)V")
    public static final void method741(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg3) {
            method742((byte) -70, null);
        }
        field2196++;
        client.field582[0].method370(arg5, arg0);
        int var6 = (arg1 - 32) * arg1 / arg4;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg1 - var6 - 32) * arg2 / (arg4 - arg1);
        client.field582[1].method370(arg5, arg0 + arg1 - 16);
        class130.method850(arg5, arg0 + 16, 16, arg1 - 32, class163.field3138);
        class130.method850(arg5, var7 + arg0 + 16, 16, var6, class56.field1036);
        class130.method855(arg5, var7 + arg0 + 16, var6, class189.field3687);
        class130.method855(arg5 + 1, arg0 - (-16 - var7), var6, class189.field3687);
        class130.method843(arg5, var7 + arg0 + 16, 16, class189.field3687);
        class130.method843(arg5, arg0 + var7 + 17, 16, class189.field3687);
        class130.method855(arg5 + 15, arg0 - -16 - -var7, var6, class142.field2646);
        class130.method855(arg5 + 14, arg0 + 17 + var7, var6 - 1, class142.field2646);
        class130.method843(arg5, arg0 + var7 + var6 + 15, 16, class142.field2646);
        class130.method843(arg5 + 1, arg0 + var6 + 14 + var7, 15, class142.field2646);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLoa;)V")
    public static final void method742(byte arg0, class127 arg1) {
        field2187++;
        if (class181.field3531 != null) {
            try {
                class181.field3531.method1342(0L, false);
                class181.field3531.method1333(arg1.field2346, 24, 0, arg1.field2325);
            } catch (Exception var3) {
            }
        }
        arg1.field2346 += 24;
        int var2 = 80 / ((-arg0 - 30) / 50);
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
    public static final void method743(int arg0) {
        field2191++;
        Object var1 = class56.field1033;
        synchronized (class56.field1033) {
            if (~class203.field3974 != arg0) {
                class203.field3974 = 1;
                try {
                    class56.field1033.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III)I")
    public static final int method744(int arg0, int arg1, int arg2) {
        class87 var3 = (class87) class3.field59.method1045((long) arg2, (byte) -77);
        if (arg0 >= -4) {
            field2202 = -53;
        }
        field2193++;
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field1599.length; var5++) {
                if (var3.field1597[var5] == arg1) {
                    var4 += var3.field1599[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BII)I")
    public static final int method745(byte arg0, int arg1, int arg2) {
        if (arg0 != 48) {
            method746((byte) -63);
        }
        int var3 = arg2 >>> 31;
        field2199++;
        return (arg2 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(II)V")
    public class118(int arg0, int arg1) {
        this.field2197 = arg1;
        this.field2192 = arg0;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public static void method746(byte arg0) {
        field2201 = null;
        field2204 = null;
        field2190 = null;
        field2189 = null;
        if (arg0 != 58) {
            return;
        }
        field2200 = null;
        field2188 = null;
        field2203 = null;
        field2195 = null;
        field2198 = null;
    }
}
