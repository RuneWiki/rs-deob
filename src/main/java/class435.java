import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class435 {

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field6341 = 13156520;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "[I")
    public static int[] field6340 = new int[3];

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "[I")
    public static int[] field6349 = new int[6];

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "F")
    public static float field6343;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "Lkc;")
    public class435 field6344;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Lkc;")
    public class435 field6348;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field6352;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "[I")
    public static int[] field6350;

    // $FF: synthetic method
    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2732(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILdp;Z)Lmi;", line = 7)
    public static final class408 method2726(int arg0, class174 arg1, boolean arg2) {
        field6351++;
        byte[] var3 = arg1.method1336(-119, arg0);
        if (arg2) {
            return var3 == null ? null : new class408(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)Z", line = 27)
    public static final boolean method2727(int arg0, int arg1, int arg2, int arg3) {
        field6342++;
        class395 var4 = (class395) class219.method1656(arg1, arg0, arg3);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class355.method2276(var4, false);
        }
        class395 var6 = (class395) class371.method2358(arg1, arg0, arg3, field6352 == null ? (field6352 = method2732("sc")) : field6352);
        if (var6 != null) {
            var5 &= class355.method2276(var6, false);
        }
        class395 var7 = (class395) class37.method311(arg1, arg0, arg3);
        if (arg2 > -63) {
            method2726(62, (class174) null, true);
        }
        if (var7 != null) {
            var5 &= class355.method2276(var7, false);
        }
        return var5;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lvj;ILjava/lang/String;I)Lue;", line = 59)
    public static final class131 method2728(class177 arg0, int arg1, String arg2, int arg3) {
        field6345++;
        if (arg3 == 0) {
            return arg0.method1368(arg2, (byte) -101);
        } else if (arg3 == 1) {
            try {
                class412.method2588(new Object[] { (new URL(arg0.field2639.getCodeBase(), arg2)).toString() }, "openjs", (byte) 111, arg0.field2639);
                class131 var4 = new class131();
                var4.field2121 = 1;
                return var4;
            } catch (Throwable var11) {
                class131 var5 = new class131();
                var5.field2121 = 2;
                return var5;
            }
        } else if (arg3 == 2) {
            try {
                arg0.field2639.getAppletContext().showDocument(new URL(arg0.field2639.getCodeBase(), arg2), "_blank");
                class131 var6 = new class131();
                var6.field2121 = 1;
                return var6;
            } catch (Exception var12) {
                class131 var7 = new class131();
                var7.field2121 = 2;
                return var7;
            }
        } else {
            int var8 = -88 % ((arg1 - 52) / 52);
            if (arg3 != 3) {
                throw new IllegalArgumentException();
            }
            try {
                class412.method2587(arg0.field2639, -115, "loggedout");
            } catch (Throwable var14) {
            }
            try {
                arg0.field2639.getAppletContext().showDocument(new URL(arg0.field2639.getCodeBase(), arg2), "_top");
                class131 var9 = new class131();
                var9.field2121 = 1;
                return var9;
            } catch (Exception var13) {
                class131 var10 = new class131();
                var10.field2121 = 2;
                return var10;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 138)
    public static final int method2729(String arg0, byte arg1) {
        field6346++;
        if (arg1 != -93) {
            return -96;
        }
        for (int var2 = 0; var2 < class40.field624.length; var2++) {
            if (class40.field624[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 161)
    public static void method2730(int arg0) {
        field6349 = null;
        if (arg0 != 12024) {
            field6349 = null;
        }
        field6350 = null;
        field6340 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V", line = 176)
    public final void method2731(byte arg0) {
        field6347++;
        if (this.field6344 == null) {
            return;
        }
        this.field6344.field6348 = this.field6348;
        this.field6348.field6344 = this.field6344;
        this.field6348 = null;
        this.field6344 = null;
        if (arg0 <= 84) {
            method2728((class177) null, -75, (String) null, 84);
        }
    }
}
