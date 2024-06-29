import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class286 extends class280 {

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public int field4519 = 0;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "[I")
    public int[] field4536 = new int[5];

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "[Lsg;")
    public class166[] field4530 = new class166[5];

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "I")
    public int field4545;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
    public int field4524;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public int field4521;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    public int field4538;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    public static int field4540 = -1;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "I")
    public static int field4543 = -1;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "Lcc;")
    public static class216 field4534 = new class216(100);

    @OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
    public static int field4549 = 0;

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "Ljava/lang/String;")
    public static String field4547 = "shake:";

    @OriginalMember(owner = "client!kc", name = "Y", descriptor = "I")
    public static int field4550 = 0;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public int field4517;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    public int field4520;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
    public int field4529;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    public int field4535;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
    public int field4541;

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "Ldd;")
    public class135 field4537;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "Lib;")
    public class156 field4532;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "Lgk;")
    public class159 field4518;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "Lcg;")
    public class169 field4525;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "Lt;")
    public class203 field4527;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "Lkc;")
    public class286 field4523;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "Lqe;")
    public class99 field4526;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "Z")
    public boolean field4516;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "Z")
    public boolean field4533;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "Z")
    public boolean field4542;

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "[I")
    public static int[] field4548;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method1941(String arg0, int arg1, boolean arg2) {
        if (arg1 >= -76) {
            method1946((String) null, (byte) 103);
        }
        field4539++;
        if (arg2) {
            try {
                class231.field3721.getAppletContext().showDocument(new URL(class231.field3721.getCodeBase(), arg0), "_blank");
            } catch (Exception var5) {
            }
            return;
        }
        try {
            class54.method405((byte) -108, class138.field2241.field63, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            class231.field3721.getAppletContext().showDocument(new URL(class231.field3721.getCodeBase(), arg0), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(III)V")
    public class286(int arg0, int arg1, int arg2) {
        this.field4524 = this.field4545 = arg0;
        this.field4521 = arg2;
        this.field4538 = arg1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lfg;")
    public static final class12 method1942(int arg0, int arg1) {
        class12 var2 = (class12) class213.field3406.method1553((long) arg0, (byte) -106);
        field4522++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class111.field1605.method643(arg0, 30, false);
        class12 var4 = new class12();
        if (var3 != null) {
            var4.method98(new class152(var3), (byte) 93, arg0);
        }
        class213.field3406.method1551(var4, arg1 + arg1, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    public static void method1943(int arg0) {
        field4548 = null;
        field4534 = null;
        field4547 = null;
        int var1 = 121 % ((-arg0 - 78) / 43);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lqi;I)Ljava/lang/String;")
    public static final String method1944(class131 arg0, int arg1) {
        field4528++;
        if (arg1 != 16730) {
            method1941((String) null, -69, true);
        }
        if (client.method1168(arg0).method526(arg1 ^ 0xFFFFBED8) == 0) {
            return null;
        } else if (arg0.field2135 == null || arg0.field2135.trim().length() == 0) {
            return class36.field447 ? "Hidden-use" : null;
        } else {
            return arg0.field2135;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1945(int arg0, byte[] arg1) {
        if (arg0 > -124) {
            return null;
        }
        field4531++;
        class152 var2 = new class152(arg1);
        int var3 = var2.method1111(255);
        int var4 = var2.method1097(126);
        if (var4 < 0 || !(class106.field1546 == 0 || class106.field1546 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1093(var7, (byte) 49, var4, 0);
            return var7;
        } else {
            int var5 = var2.method1097(127);
            if (var5 < 0 || !(class106.field1546 == 0 || class106.field1546 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class199.method1466(var6, var5, arg1, var4, 9);
            } else {
                class80.field1152.method732(var2, 113, var6);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1946(String arg0, byte arg1) {
        field4544++;
        if (class212.field3397 == null) {
            return;
        }
        int var2 = 0;
        int var3 = 96 / ((62 - arg1) / 33);
        long var4 = class193.method1431(arg0, false);
        if (var4 == 0L) {
            return;
        }
        while (var2 < class212.field3397.length && class212.field3397[var2].field4459 != var4) {
            var2++;
        }
        if (class212.field3397.length > var2 && class212.field3397[var2] != null) {
            class92.field1369++;
            class220.field3532.method557(172, 8);
            class220.field3532.method1069(class212.field3397[var2].field4459, -86);
        }
    }
}
